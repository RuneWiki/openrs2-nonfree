import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "[I")
	public static int[] anIntArray561;

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
	public static final int anInt7411 = 0;

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
	public static int anInt7413 = -1;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray6 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!gf;IIII)V")
	public static void method5787(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class137 local7 = arg0.method4837();
		@Pc(25) int local25 = arg0.anInt6128 - arg0.aClass160_7.anInt4763 & 0x3FFF;
		if (arg2 == -1) {
			if (local25 != 0 || arg0.anInt6078 > 25) {
				if (arg1 < 0 && local7.anInt4206 != -1) {
					arg0.anInt6080 = local7.anInt4206;
				} else if (arg1 <= 0 || local7.anInt4211 == -1) {
					arg0.anInt6080 = local7.anInt4203;
				} else {
					arg0.anInt6080 = local7.anInt4211;
				}
				arg0.aBoolean429 = false;
			} else if (!arg0.aBoolean429 || !local7.method3444(arg0.anInt6080)) {
				arg0.anInt6080 = local7.method3446();
				arg0.aBoolean429 = arg0.anInt6080 != -1;
			}
		} else if (arg0.anInt6102 != -1 && (local25 >= 10240 || local25 <= 2048)) {
			@Pc(119) int local119 = Static349.anIntArray567[arg3] - arg0.aClass160_7.anInt4763 & 0x3FFF;
			if (arg2 == 2 && local7.anInt4208 != -1) {
				if (local119 > 2048 && local119 <= 6144 && local7.anInt4187 != -1) {
					arg0.anInt6080 = local7.anInt4187;
				} else if (local119 >= 10240 && local119 < 14336 && local7.anInt4207 != -1) {
					arg0.anInt6080 = local7.anInt4207;
				} else if (local119 <= 6144 || local119 >= 10240 || local7.anInt4213 == -1) {
					arg0.anInt6080 = local7.anInt4208;
				} else {
					arg0.anInt6080 = local7.anInt4213;
				}
			} else if (arg2 == 0 && local7.anInt4216 != -1) {
				if (local119 > 2048 && local119 <= 6144 && local7.anInt4193 != -1) {
					arg0.anInt6080 = local7.anInt4193;
				} else if (local119 >= 10240 && local119 < 14336 && local7.anInt4188 != -1) {
					arg0.anInt6080 = local7.anInt4188;
				} else if (local119 <= 6144 || local119 >= 10240 || local7.anInt4191 == -1) {
					arg0.anInt6080 = local7.anInt4216;
				} else {
					arg0.anInt6080 = local7.anInt4191;
				}
			} else if (local119 > 2048 && local119 <= 6144 && local7.anInt4222 != -1) {
				arg0.anInt6080 = local7.anInt4222;
			} else if (local119 >= 10240 && local119 < 14336 && local7.anInt4201 != -1) {
				arg0.anInt6080 = local7.anInt4201;
			} else if (local119 <= 6144 || local119 >= 10240 || local7.anInt4194 == -1) {
				arg0.anInt6080 = local7.anInt4203;
			} else {
				arg0.anInt6080 = local7.anInt4194;
			}
			arg0.aBoolean429 = false;
		} else if (local25 == 0 && arg0.anInt6078 <= 25) {
			if (arg2 == 2 && local7.anInt4208 != -1) {
				arg0.anInt6080 = local7.anInt4208;
			} else if (arg2 == 0 && local7.anInt4216 != -1) {
				arg0.anInt6080 = local7.anInt4216;
			} else {
				arg0.anInt6080 = local7.anInt4203;
			}
			arg0.aBoolean429 = false;
		} else {
			if (arg2 == 2 && local7.anInt4208 != -1) {
				if (arg1 < 0 && local7.anInt4192 != -1) {
					arg0.anInt6080 = local7.anInt4192;
				} else if (arg1 <= 0 || local7.anInt4226 == -1) {
					arg0.anInt6080 = local7.anInt4208;
				} else {
					arg0.anInt6080 = local7.anInt4226;
				}
			} else if (arg2 == 0 && local7.anInt4216 != -1) {
				if (arg1 < 0 && local7.anInt4205 != -1) {
					arg0.anInt6080 = local7.anInt4205;
				} else if (arg1 <= 0 || local7.anInt4214 == -1) {
					arg0.anInt6080 = local7.anInt4216;
				} else {
					arg0.anInt6080 = local7.anInt4214;
				}
			} else if (arg1 < 0 && local7.anInt4200 != -1) {
				arg0.anInt6080 = local7.anInt4200;
			} else if (arg1 <= 0 || local7.anInt4183 == -1) {
				arg0.anInt6080 = local7.anInt4203;
			} else {
				arg0.anInt6080 = local7.anInt4183;
			}
			arg0.aBoolean429 = false;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)Z")
	public static boolean method5792(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(20) Class128 local20 = Static55.aClass25_1.method855(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local20.method3302(arg1);
	}
}
