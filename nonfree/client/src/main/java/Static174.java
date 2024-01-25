import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!io", name = "p", descriptor = "[I")
	public static int[] anIntArray219;

	@OriginalMember(owner = "client!io", name = "u", descriptor = "[I")
	public static final int[] anIntArray220 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!io", name = "O", descriptor = "Z")
	public static boolean aBoolean224 = false;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIILclient!eq;IIBII)V")
	public static void method2880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class66 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface10 local11 = (Interface10) Static86.method825(arg6, arg7, arg4);
		@Pc(24) Class106 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(41) int local41;
		if (local11 != null) {
			local24 = Static448.aClass104_4.method2616(local11.method5325());
			local30 = local11.method5321() & 0x3;
			local34 = local11.method5327();
			if (local24.anInt3183 == -1) {
				local41 = arg0;
				if (local24.anInt3163 > 0) {
					local41 = arg5;
				}
				if (local34 == 0 || local34 == 2) {
					if (local30 == 0) {
						arg3.method4988(arg1, 4, local41, arg2);
					} else if (local30 == 1) {
						arg3.method4975(4, arg1, arg2, local41);
					} else if (local30 == 2) {
						arg3.method4988(arg1 + 3, 4, local41, arg2);
					} else if (local30 == 3) {
						arg3.method4975(4, arg1, arg2 + 3, local41);
					}
				}
				if (local34 == 3) {
					if (local30 == 0) {
						arg3.method5035(1, arg2, local41, arg1, 1);
					} else if (local30 == 1) {
						arg3.method5035(1, arg2, local41, arg1 + 3, 1);
					} else if (local30 == 2) {
						arg3.method5035(1, arg2 + 3, local41, arg1 + 3, 1);
					} else if (local30 == 3) {
						arg3.method5035(1, arg2 + 3, local41, arg1, 1);
					}
				}
				if (local34 == 2) {
					if (local30 == 0) {
						arg3.method4975(4, arg1, arg2, local41);
					} else if (local30 == 1) {
						arg3.method4988(arg1 + 3, 4, local41, arg2);
					} else if (local30 == 2) {
						arg3.method4975(4, arg1, arg2 + 3, local41);
					} else if (local30 == 3) {
						arg3.method4988(arg1, 4, local41, arg2);
					}
				}
			} else {
				Static57.method1272(arg3, arg1, arg2, local30, local24);
			}
		}
		local11 = (Interface10) Static415.method6101(arg6, arg7, arg4, sq.class);
		if (local11 != null) {
			local24 = Static448.aClass104_4.method2616(local11.method5325());
			local30 = local11.method5321() & 0x3;
			local34 = local11.method5327();
			if (local24.anInt3183 != -1) {
				Static57.method1272(arg3, arg1, arg2, local30, local24);
			} else if (local34 == 9) {
				local41 = -1118482;
				if (local24.anInt3163 > 0) {
					local41 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg3.method5001(arg1 + 3, arg2, arg1, arg2 + 3, local41);
				} else {
					arg3.method5001(arg1 + 3, arg2 + 3, arg1, arg2, local41);
				}
			}
		}
		local11 = (Interface10) Static109.method4308(arg6, arg7, arg4);
		if (local11 == null) {
			return;
		}
		local24 = Static448.aClass104_4.method2616(local11.method5325());
		local30 = local11.method5321() & 0x3;
		if (local24.anInt3183 != -1) {
			Static57.method1272(arg3, arg1, arg2, local30, local24);
			return;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!sq;III)J")
	public static long method2881(@OriginalArg(0) Interface10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(16) Class106 local16 = Static448.aClass104_4.method2616(arg0.method5325());
		@Pc(49) long local49 = (long) ((arg0.method5327() | 0x10000) << 14 | arg1 << 7 | arg2 | arg0.method5321() << 20);
		if (local16.anInt3163 == 0) {
			local49 |= local9;
		}
		if (local16.anInt3181 == 1) {
			local49 |= local5;
		}
		if (local16.aBoolean207) {
			local49 |= local7;
		}
		return local49 | (long) arg0.method5325() << 32;
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "(B)V")
	public static void method2883() {
		Static109.aClass6_Sub1_Sub1_5.anInt7898 = 0;
		Static25.aClass123_44 = null;
		Static381.anInt6821 = 0;
		Static26.aClass123_46 = null;
		Static40.anInt1173 = 0;
		Static334.anInt5833 = 0;
		Static210.aClass123_197 = null;
		Static73.aClass123_88 = null;
		Static232.aClass6_Sub1_Sub1_4.anInt7898 = 0;
		Static365.method5493();
		Static69.method1414();
		for (@Pc(36) int local36 = 0; local36 < 2048; local36++) {
			Static374.aClass3_Sub2_Sub1_Sub2Array1[local36] = null;
		}
		Static302.aClass3_Sub2_Sub1_Sub2_2 = null;
		for (@Pc(52) int local52 = 0; local52 < Static308.aClass3_Sub2_Sub1_Sub1Array1.length; local52++) {
			@Pc(58) Class3_Sub2_Sub1_Sub1 local58 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local52];
			if (local58 != null) {
				local58.anInt6569 = -1;
			}
		}
		Static142.method2453();
		Static429.anInt7656 = 1;
		Static100.method1818(30);
		for (@Pc(81) int local81 = 0; local81 < 100; local81++) {
			Static180.aBooleanArray8[local81] = true;
		}
		Static311.method4532();
		Static61.aClass6_Sub30_1 = null;
		Static46.aLong46 = 0L;
	}
}
