import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!kea", name = "g", descriptor = "Lclient!lha;")
	public static Class218 aClass218_1;

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "Z")
	public static boolean aBoolean308 = false;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method4068(@OriginalArg(1) Class143 arg0) {
		for (@Pc(13) Class41_Sub7 local13 = (Class41_Sub7) Static422.aClass102_5.method2062(); local13 != null; local13 = (Class41_Sub7) Static422.aClass102_5.method2054()) {
			if (local13.aBoolean599) {
				local13.method7080(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IZI)Z")
	public static boolean method4070(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I[ILclient!ts;[I[I)V")
	public static void method4073(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class41_Sub1_Sub1_Sub3_Sub2 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg2.length; local1++) {
			@Pc(6) int local6 = arg2[local1];
			@Pc(10) int local10 = arg3[local1];
			@Pc(14) int local14 = arg0[local1];
			@Pc(16) int local16 = 0;
			while (local10 != 0 && local16 < arg1.aClass127Array3.length) {
				if ((local10 & 0x1) != 0) {
					if (local6 == -1) {
						arg1.aClass127Array3[local16] = null;
					} else {
						@Pc(30) Class65 local30 = Static459.aClass128_2.method2686(local6);
						@Pc(33) int local33 = local30.anInt1425;
						@Pc(38) Class127 local38 = arg1.aClass127Array3[local16];
						if (local38 != null) {
							if (local6 == local38.anInt2995) {
								if (local33 == 0) {
									local38 = arg1.aClass127Array3[local16] = null;
								} else if (local33 == 1) {
									local38.anInt2993 = 0;
									local38.anInt2992 = local14;
									local38.anInt2990 = 0;
									local38.anInt2991 = 0;
									local38.anInt2994 = 1;
									if (!arg1.aBoolean692) {
										Static119.method1899(0, arg1, local30);
									}
								} else if (local33 == 2) {
									local38.anInt2990 = 0;
								}
							} else if (local30.anInt1419 >= Static459.aClass128_2.method2686(local38.anInt2995).anInt1419) {
								local38 = arg1.aClass127Array3[local16] = null;
							}
						}
						if (local38 == null) {
							local38 = arg1.aClass127Array3[local16] = new Class127();
							local38.anInt2992 = local14;
							local38.anInt2994 = 1;
							local38.anInt2991 = 0;
							local38.anInt2995 = local6;
							local38.anInt2993 = 0;
							local38.anInt2990 = 0;
							if (!arg1.aBoolean692) {
								Static119.method1899(0, arg1, local30);
							}
						}
					}
				}
				local16++;
				local10 >>>= 0x1;
			}
		}
	}
}
