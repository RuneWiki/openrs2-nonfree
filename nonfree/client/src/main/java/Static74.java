import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "Lclient!mg;")
	public static Class160 aClass160_9;

	@OriginalMember(owner = "client!ds", name = "B", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "Lclient!di;")
	public static final Class54 aClass54_25 = new Class54(23, 6);

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "[Lclient!sk;")
	public static final Class3_Sub2_Sub1_Sub2[] aClass3_Sub2_Sub1_Sub2Array1 = new Class3_Sub2_Sub1_Sub2[2048];

	@OriginalMember(owner = "client!ds", name = "D", descriptor = "I")
	public static int anInt1617 = 0;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)V")
	public static void method1383(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub5_Sub13 local8 = Static208.method3306(arg1, 13);
		local8.method4547();
		local8.anInt5641 = arg0;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIBIIIIILclient!ya;)V")
	public static void method1384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class49 arg7) {
		@Pc(11) Interface6 local11 = (Interface6) Static215.method3376(arg4, arg3, arg0);
		@Pc(24) Class134 local24;
		@Pc(32) int local32;
		@Pc(38) int local38;
		@Pc(56) int local56;
		if (local11 != null) {
			local24 = Static118.aClass165_2.method3799(local11.method5153());
			local32 = local11.method5155() & 0x3;
			local38 = local11.method5149();
			if (local24.anInt3637 == -1) {
				local56 = arg5;
				if (local24.anInt3653 > 0) {
					local56 = arg2;
				}
				if (local38 == 0 || local38 == 2) {
					if (local32 == 0) {
						arg7.method4464(arg6, 4, arg1, local56);
					} else if (local32 == 1) {
						arg7.method4413(local56, 4, arg6, arg1);
					} else if (local32 == 2) {
						arg7.method4464(arg6, 4, arg1 + 3, local56);
					} else if (local32 == 3) {
						arg7.method4413(local56, 4, arg6 + 3, arg1);
					}
				}
				if (local38 == 3) {
					if (local32 == 0) {
						arg7.method4480(arg1, 1, local56, arg6, 1);
					} else if (local32 == 1) {
						arg7.method4480(arg1 + 3, 1, local56, arg6, 1);
					} else if (local32 == 2) {
						arg7.method4480(arg1 + 3, 1, local56, arg6 + 3, 1);
					} else if (local32 == 3) {
						arg7.method4480(arg1, 1, local56, arg6 + 3, 1);
					}
				}
				if (local38 == 2) {
					if (local32 == 0) {
						arg7.method4413(local56, 4, arg6, arg1);
					} else if (local32 == 1) {
						arg7.method4464(arg6, 4, arg1 + 3, local56);
					} else if (local32 == 2) {
						arg7.method4413(local56, 4, arg6 + 3, arg1);
					} else if (local32 == 3) {
						arg7.method4464(arg6, 4, arg1, local56);
					}
				}
			} else {
				Static264.method3952(arg7, local32, arg6, local24, arg1);
			}
		}
		local11 = (Interface6) Static455.method4456(arg4, arg3, arg0, jn.class);
		if (local11 != null) {
			local24 = Static118.aClass165_2.method3799(local11.method5153());
			local32 = local11.method5155() & 0x3;
			local38 = local11.method5149();
			if (local24.anInt3637 != -1) {
				Static264.method3952(arg7, local32, arg6, local24, arg1);
			} else if (local38 == 9) {
				local56 = -1118482;
				if (local24.anInt3653 > 0) {
					local56 = -1179648;
				}
				if (local32 == 0 || local32 == 2) {
					arg7.method4452(arg1 + 3, arg6, arg1, arg6 + 3, local56);
				} else {
					arg7.method4452(arg1 + 3, arg6 - -3, arg1, arg6, local56);
				}
			}
		}
		local11 = (Interface6) Static139.method2376(arg4, arg3, arg0);
		if (local11 == null) {
			return;
		}
		local24 = Static118.aClass165_2.method3799(local11.method5153());
		local32 = local11.method5155() & 0x3;
		if (local24.anInt3637 != -1) {
			Static264.method3952(arg7, local32, arg6, local24, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BLclient!mg;Lclient!mg;Lclient!mg;Lclient!qu;)Z")
	public static boolean method1385(@OriginalArg(1) Class160 arg0, @OriginalArg(2) Class160 arg1, @OriginalArg(3) Class160 arg2, @OriginalArg(4) Class2_Sub3_Sub4 arg3) {
		Static335.aClass2_Sub3_Sub4_2 = arg3;
		Static316.aClass160_62 = arg1;
		Static359.aClass160_71 = arg2;
		Static394.aClass160_75 = arg0;
		return true;
	}
}
