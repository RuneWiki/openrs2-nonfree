import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString85;

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "Lclient!jn;")
	public static Class176 aClass176_116;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "[I")
	public static final int[] anIntArray477 = new int[4096];

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Z")
	public static boolean aBoolean619 = false;

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "[I")
	public static final int[] anIntArray478 = new int[] { 7500, 500 };

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "Z")
	public static boolean aBoolean620 = false;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)Z")
	public static boolean method7166(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) boolean local22 = (arg1 & 0x37) == 0 ? Static401.method6308(arg0, arg1) : Static347.method5596(arg1, arg0);
		return local22 | Static296.method5098(arg0, arg1) | (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
	public static void method7169() {
		for (@Pc(14) Class4_Sub51 local14 = (Class4_Sub51) Static377.aClass244_51.method5963(); local14 != null; local14 = (Class4_Sub51) Static377.aClass244_51.method5965()) {
			if (local14.anInt10257 > 0) {
				local14.anInt10257--;
			}
			if (local14.anInt10257 != 0) {
				if (local14.anInt10254 > 0) {
					local14.anInt10254--;
				}
				if (local14.anInt10254 == 0 && local14.anInt10248 >= 1 && local14.anInt10261 >= 1 && Static428.anInt8046 - 2 >= local14.anInt10248 && local14.anInt10261 <= Static119.anInt2717 - 2 && (local14.anInt10260 < 0 || Static297.method5124(local14.anInt10255, local14.anInt10260))) {
					Static433.method6765(local14.anInt10260, local14.anInt10262, local14.anInt10255, local14.anInt10261, -1, local14.anInt10248, local14.anInt10249, local14.anInt10252);
					local14.anInt10254 = -1;
					if (local14.anInt10251 == local14.anInt10260 && local14.anInt10251 == -1) {
						local14.method8379();
					} else if (local14.anInt10251 == local14.anInt10260 && local14.anInt10253 == local14.anInt10252 && local14.anInt10258 == local14.anInt10255) {
						local14.method8379();
					}
				}
			} else if (local14.anInt10251 < 0 || Static297.method5124(local14.anInt10258, local14.anInt10251)) {
				Static433.method6765(local14.anInt10251, local14.anInt10262, local14.anInt10258, local14.anInt10261, -1, local14.anInt10248, local14.anInt10249, local14.anInt10253);
				local14.method8379();
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILclient!jn;I)Lclient!hw;")
	public static Class4_Sub5_Sub8 method7170(@OriginalArg(1) int arg0, @OriginalArg(2) Class176 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class4_Sub11 local14 = new Class4_Sub11(arg1.method3994(arg0, arg2));
		@Pc(50) Class4_Sub5_Sub8 local50 = new Class4_Sub5_Sub8(arg0, local14.method4920(), local14.method4920(), local14.method4931(), local14.method4931(), local14.method4905() == 1, local14.method4905(), local14.method4905());
		@Pc(56) int local56 = local14.method4905();
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			local50.aClass244_27.method5960(new Class4_Sub27(local14.method4905(), local14.method4936(), local14.method4936(), local14.method4936(), local14.method4936(), local14.method4936(), local14.method4936(), local14.method4936(), local14.method4936()));
		}
		local50.method3438();
		return local50;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIII)V")
	public static void method7172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static486.anInt8866 <= arg2 && arg4 <= Static214.anInt3975 && arg5 >= Static290.anInt5903 && Static530.anInt9437 >= arg1) {
			if (arg3 == 1) {
				Static41.method503(arg4, arg2, arg1, arg5, arg0);
			} else {
				Static170.method3116(arg2, arg0, arg3, arg1, arg4, arg5);
			}
		} else if (arg3 == 1) {
			Static168.method3085(arg5, arg1, arg2, arg4, arg0);
		} else {
			Static119.method2515(arg4, arg0, arg1, arg5, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
	public static void method7173() {
		Static70.anInt1217 = 0;
		Static124.anInt9777 = 0;
		Static540.method4935();
		Static534.method7758();
		Static282.method4064();
		@Pc(17) boolean local17 = false;
		@Pc(33) int local33;
		for (@Pc(27) int local27 = 0; local27 < Static124.anInt9777; local27++) {
			local33 = Static271.anIntArray268[local27];
			@Pc(40) Class4_Sub4 local40 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local33);
			@Pc(43) Class1_Sub4_Sub2_Sub1_Sub1 local43 = local40.aClass1_Sub4_Sub2_Sub1_Sub1_1;
			if (Static49.aBoolean36 && Static196.method3375(local33)) {
				Static222.method3622();
			}
			if (Static106.anInt2418 != local43.anInt8384) {
				if (local43.aClass283_1.method6831()) {
					Static553.method8014(local43);
				}
				local43.method4510(null);
				local17 = true;
				local40.method8379();
			}
		}
		if (local17) {
			Static436.anInt8163 = Static585.aClass350_41.method8202();
			Static585.aClass350_41.method8204(Static457.aClass4_Sub4Array1);
		}
		if (Static186.anInt3680 != Static319.aClass4_Sub11_Sub1_2.anInt5831) {
			throw new RuntimeException("gnp1 pos:" + Static319.aClass4_Sub11_Sub1_2.anInt5831 + " psize:" + Static186.anInt3680);
		}
		for (local33 = 0; local33 < Static418.anInt7866; local33++) {
			if (Static585.aClass350_41.method8207((long) Static43.anIntArray23[local33]) == null) {
				throw new RuntimeException("gnp2 pos:" + local33 + " size:" + Static418.anInt7866);
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!ke;I)V")
	public static void method7174(@OriginalArg(0) Class1_Sub6 arg0) {
		arg0.aClass1_Sub4_Sub2_Sub1_1 = null;
		if (Static538.anInt8762 < 20) {
			Static108.aClass136_2.method3289(arg0);
			Static538.anInt8762++;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)Z")
	public static boolean method7175(@OriginalArg(1) int arg0) {
		if (Static196.aBooleanArray6[arg0]) {
			return true;
		} else if (Static502.aClass176_122.method3991(arg0)) {
			@Pc(28) int local28 = Static502.aClass176_122.method3999(arg0);
			if (local28 == 0) {
				Static196.aBooleanArray6[arg0] = true;
				return true;
			}
			if (Static343.aClass225ArrayArray1[arg0] == null) {
				Static343.aClass225ArrayArray1[arg0] = new Class225[local28];
			}
			for (@Pc(47) int local47 = 0; local47 < local28; local47++) {
				if (Static343.aClass225ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static502.aClass176_122.method3994(local47, arg0);
					if (local61 != null) {
						@Pc(73) Class225 local73 = Static343.aClass225ArrayArray1[arg0][local47] = new Class225();
						local73.anInt6555 = local47 + (arg0 << 16);
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method5524(new Class4_Sub11(local61));
					}
				}
			}
			Static196.aBooleanArray6[arg0] = true;
			return true;
		} else {
			return false;
		}
	}
}
