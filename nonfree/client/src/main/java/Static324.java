import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!me", name = "d", descriptor = "Lclient!lba;")
	public static Class165 aClass165_2;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)Z")
	public static boolean method4689() {
		try {
			return Static59.method1218();
		} catch (@Pc(14) IOException local14) {
			Static58.method1205();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static355.aClass56_123 == null ? -1 : Static355.aClass56_123.method1571()) + "," + (Static399.aClass56_133 == null ? -1 : Static399.aClass56_133.method1571()) + "," + (Static466.aClass56_155 == null ? -1 : Static466.aClass56_155.method1571()) + " - " + Static292.anInt4974 + "," + (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray629[0] + Static335.anInt5608) + "," + (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray628[0] + Static246.anInt4344) + " - ";
			for (@Pc(79) int local79 = 0; Static292.anInt4974 > local79 && local79 < 50; local79++) {
				local77 = local77 + Static532.aClass3_Sub11_Sub1_2.aByteArray62[local79] + ",";
			}
			Static172.method7826(local19, local77);
			Static326.method4711(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BIB)[B")
	public static byte[] method4690(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static601.method2816(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)V")
	public static void method4691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static15.anIntArrayArray6 != null) {
			Static15.anIntArrayArray6[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static450.aShortArrayArray31 != null) {
			Static450.aShortArrayArray31[arg0][arg1] = (short) arg3;
		}
		if (Static315.aByteArrayArray14 != null) {
			Static315.aByteArrayArray14[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public static void method4692() {
		Static437.aClass142_1 = new Class142(8);
		Static440.anInt7355 = 0;
		for (@Pc(25) Class41_Sub9 local25 = (Class41_Sub9) Static361.aClass178_20.method4168(); local25 != null; local25 = (Class41_Sub9) Static361.aClass178_20.method4165()) {
			local25.method7725();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIZILclient!gd;)V")
	public static void method4693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub18 arg4) {
		if (arg4.anInt3372 == -1 && arg4.anIntArray172 == null) {
			return;
		}
		@Pc(21) int local21 = 0;
		@Pc(29) int local29 = arg4.anInt3358 * Static405.aClass3_Sub3_Sub1_1.anInt7577 >> 8;
		if (arg4.anInt3357 < arg3) {
			local21 = arg3 - arg4.anInt3357;
		} else if (arg3 < arg4.anInt3370) {
			local21 = arg4.anInt3370 - arg3;
		}
		if (arg1 > arg4.anInt3371) {
			local21 += arg1 - arg4.anInt3371;
		} else if (arg4.anInt3359 > arg1) {
			local21 += arg4.anInt3359 - arg1;
		}
		if (arg4.anInt3361 == 0 || arg4.anInt3361 < local21 - 256 || Static405.aClass3_Sub3_Sub1_1.anInt7577 == 0 || arg4.anInt3368 != arg0) {
			if (arg4.aClass3_Sub4_Sub1_3 != null) {
				Static353.aClass3_Sub4_Sub2_1.method639(arg4.aClass3_Sub4_Sub1_3);
				arg4.aClass3_Sub50_1 = null;
				arg4.aClass3_Sub48_Sub1_2 = null;
				arg4.aClass3_Sub4_Sub1_3 = null;
			}
			if (arg4.aClass3_Sub4_Sub1_2 != null) {
				Static353.aClass3_Sub4_Sub2_1.method639(arg4.aClass3_Sub4_Sub1_2);
				arg4.aClass3_Sub4_Sub1_2 = null;
				arg4.aClass3_Sub50_2 = null;
				arg4.aClass3_Sub48_Sub1_3 = null;
			}
			return;
		}
		local21 -= 256;
		if (local21 < 0) {
			local21 = 0;
		}
		@Pc(162) int local162 = local29 * (arg4.anInt3361 - local21) / arg4.anInt3361;
		@Pc(206) Class3_Sub4_Sub1 local206;
		if (arg4.aClass3_Sub4_Sub1_3 != null) {
			arg4.aClass3_Sub4_Sub1_3.method286(local162);
		} else if (arg4.anInt3372 >= 0) {
			if (arg4.aBoolean264) {
				if (arg4.aClass3_Sub50_1 == null) {
					arg4.aClass3_Sub50_1 = Static577.method7747(Static50.aClass322_19, arg4.anInt3372);
				}
				if (arg4.aClass3_Sub50_1 != null) {
					if (arg4.aClass3_Sub48_Sub1_2 == null) {
						arg4.aClass3_Sub48_Sub1_2 = arg4.aClass3_Sub50_1.method7746(new int[] { 22050 });
					}
					if (arg4.aClass3_Sub48_Sub1_2 != null) {
						local206 = Static597.method308(arg4.aClass3_Sub48_Sub1_2, local162);
						local206.method289(-1);
						Static353.aClass3_Sub4_Sub2_1.method645(local206);
						arg4.aClass3_Sub4_Sub1_3 = local206;
					}
				}
			} else {
				@Pc(223) Class43 local223 = Static598.method996(Static166.aClass322_66, arg4.anInt3372, 0);
				if (local223 != null) {
					@Pc(230) Class3_Sub48_Sub1 local230 = local223.method998().method7099(Static143.aClass166_1);
					@Pc(235) Class3_Sub4_Sub1 local235 = Static597.method308(local230, local162);
					local235.method289(-1);
					Static353.aClass3_Sub4_Sub2_1.method645(local235);
					arg4.aClass3_Sub4_Sub1_3 = local235;
				}
			}
		}
		if (arg4.aClass3_Sub4_Sub1_2 != null) {
			arg4.aClass3_Sub4_Sub1_2.method286(local162);
			if (!arg4.aClass3_Sub4_Sub1_2.method7828()) {
				arg4.aClass3_Sub4_Sub1_2 = null;
				arg4.aClass3_Sub48_Sub1_3 = null;
				arg4.aClass3_Sub50_2 = null;
			}
		} else if (arg4.anIntArray172 != null && (arg4.anInt3364 -= arg2) <= 0) {
			@Pc(294) int local294;
			if (!arg4.aBoolean263) {
				local294 = (int) (Math.random() * (double) arg4.anIntArray172.length);
				@Pc(302) Class43 local302 = Static598.method996(Static166.aClass322_66, arg4.anIntArray172[local294], 0);
				if (local302 != null) {
					@Pc(309) Class3_Sub48_Sub1 local309 = local302.method998().method7099(Static143.aClass166_1);
					@Pc(314) Class3_Sub4_Sub1 local314 = Static597.method308(local309, local162);
					local314.method289(0);
					Static353.aClass3_Sub4_Sub2_1.method645(local314);
					arg4.anInt3364 = (int) ((double) (arg4.anInt3373 - arg4.anInt3362) * Math.random()) + arg4.anInt3362;
					arg4.aClass3_Sub4_Sub1_2 = local314;
					return;
				}
				return;
			}
			if (arg4.aClass3_Sub50_2 == null) {
				local294 = (int) ((double) arg4.anIntArray172.length * Math.random());
				arg4.aClass3_Sub50_2 = Static577.method7747(Static50.aClass322_19, arg4.anIntArray172[local294]);
			}
			if (arg4.aClass3_Sub50_2 != null) {
				if (arg4.aClass3_Sub48_Sub1_3 == null) {
					arg4.aClass3_Sub48_Sub1_3 = arg4.aClass3_Sub50_2.method7746(new int[] { 22050 });
				}
				if (arg4.aClass3_Sub48_Sub1_3 != null) {
					local206 = Static597.method308(arg4.aClass3_Sub48_Sub1_3, local162);
					local206.method289(0);
					Static353.aClass3_Sub4_Sub2_1.method645(local206);
					arg4.anInt3364 = arg4.anInt3362 + (int) ((double) (arg4.anInt3373 - arg4.anInt3362) * Math.random());
					arg4.aClass3_Sub4_Sub1_2 = local206;
					return;
				}
			}
		}
	}
}
