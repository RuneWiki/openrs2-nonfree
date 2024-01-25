import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!os", name = "G", descriptor = "[I")
	public static final int[] anIntArray402 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;[BZI)I")
	public static int method4470(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = arg2;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 <= '\u007f') {
				arg1[local15++] = (byte) local23;
			} else if (local23 <= '\u07ff') {
				arg1[local15++] = (byte) (local23 >> 6 | 0xC0);
				arg1[local15++] = (byte) (local23 & 0x3F | 0x80);
			} else {
				arg1[local15++] = (byte) (local23 >> 12 | 0xE0);
				arg1[local15++] = (byte) (local23 >> 6 & 0x3F | 0x80);
				arg1[local15++] = (byte) (local23 & 0x3F | 0x80);
			}
		}
		return local15 - arg2;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([IZLclient!vi;[I[I)V")
	public static void method4493(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class20_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(14) int local14 = arg0[local3];
			@Pc(18) int local18 = arg3[local3];
			@Pc(22) int local22 = arg2[local3];
			for (@Pc(24) int local24 = 0; local18 != 0 && local24 < arg1.aClass286Array3.length; local24++) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg1.aClass286Array3[local24] = null;
					} else {
						@Pc(39) Class176 local39 = Static35.aClass152_1.method4045(local14);
						@Pc(42) int local42 = local39.anInt5271;
						@Pc(47) Class286 local47 = arg1.aClass286Array3[local24];
						if (local47 != null) {
							if (local14 == local47.anInt8551) {
								if (local42 == 0) {
									local47 = arg1.aClass286Array3[local24] = null;
								} else if (local42 == 1) {
									local47.anInt8553 = 0;
									local47.anInt8555 = 0;
									local47.anInt8554 = 0;
									local47.anInt8556 = 1;
									local47.anInt8552 = local22;
									Static425.method6639(arg1.aByte108, local39, arg1.anInt8949, 0, false, arg1.anInt8954);
								} else if (local42 == 2) {
									local47.anInt8553 = 0;
								}
							} else if (local39.anInt5277 >= Static35.aClass152_1.method4045(local47.anInt8551).anInt5277) {
								local47 = arg1.aClass286Array3[local24] = null;
							}
						}
						if (local47 == null) {
							local47 = arg1.aClass286Array3[local24] = new Class286();
							local47.anInt8556 = 1;
							local47.anInt8553 = 0;
							local47.anInt8552 = local22;
							local47.anInt8555 = 0;
							local47.anInt8551 = local14;
							local47.anInt8554 = 0;
							Static425.method6639(arg1.aByte108, local39, arg1.anInt8949, 0, false, arg1.anInt8954);
						}
					}
				}
				local18 >>>= 0x1;
			}
		}
	}
}
