import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!kl", name = "v", descriptor = "Lclient!in;")
	public static Class157 aClass157_148;

	@OriginalMember(owner = "client!kl", name = "o", descriptor = "S")
	public static short aShort67 = 1;

	@OriginalMember(owner = "client!kl", name = "u", descriptor = "Lclient!fh;")
	public static final Class107 aClass107_4 = new Class107("WTRC", 1);

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_123 = new Class215(103, 8);

	@OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
	public static int anInt6284 = 0;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method5335(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(22) int local22 = arg0[local12 + arg2] & 0xFF;
			if (local22 != 0) {
				if (local22 >= 128 && local22 < 160) {
					@Pc(36) char local36 = Static244.aCharArray1[local22 - 128];
					if (local36 == '\u0000') {
						local36 = '?';
					}
					local22 = local36;
				}
				local8[local10++] = (char) local22;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I")
	public static int method5336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static118.anIntArrayArray13 == null ? 0 : Static118.anIntArrayArray13[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILclient!ff;[I[I[I)V")
	public static void method5337(@OriginalArg(1) Class3_Sub1_Sub3_Sub3_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(8) int local8 = 0; local8 < arg2.length; local8++) {
			@Pc(14) int local14 = arg2[local8];
			@Pc(18) int local18 = arg1[local8];
			@Pc(22) int local22 = arg3[local8];
			for (@Pc(24) int local24 = 0; local18 != 0 && local24 < arg0.aClass274Array3.length; local24++) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg0.aClass274Array3[local24] = null;
					} else {
						@Pc(41) Class130 local41 = Static195.aClass193_1.method5573(local14);
						@Pc(44) int local44 = local41.anInt4705;
						@Pc(49) Class274 local49 = arg0.aClass274Array3[local24];
						if (local49 != null) {
							if (local49.anInt8352 == local14) {
								if (local44 == 0) {
									local49 = arg0.aClass274Array3[local24] = null;
								} else if (local44 == 1) {
									local49.anInt8347 = local22;
									local49.anInt8354 = 0;
									local49.anInt8353 = 1;
									local49.anInt8349 = 0;
									local49.anInt8345 = 0;
									if (!arg0.aBoolean454) {
										Static609.method8918(arg0, 0, local41);
									}
								} else if (local44 == 2) {
									local49.anInt8345 = 0;
								}
							} else if (local41.anInt4699 >= Static195.aClass193_1.method5573(local49.anInt8352).anInt4699) {
								local49 = arg0.aClass274Array3[local24] = null;
							}
						}
						if (local49 == null) {
							local49 = arg0.aClass274Array3[local24] = new Class274();
							local49.anInt8353 = 1;
							local49.anInt8352 = local14;
							local49.anInt8354 = 0;
							local49.anInt8345 = 0;
							local49.anInt8349 = 0;
							local49.anInt8347 = local22;
							if (!arg0.aBoolean454) {
								Static609.method8918(arg0, 0, local41);
							}
						}
					}
				}
				local18 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)Z")
	public static boolean method5338(@OriginalArg(0) int arg0) {
		if (arg0 == 25 || arg0 == 20 || arg0 == 44 || arg0 == 46 || arg0 == 60) {
			return true;
		} else {
			return arg0 == 30 || arg0 == 1008;
		}
	}
}
