import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!in", name = "F", descriptor = "Lclient!rj;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_4;

	@OriginalMember(owner = "client!in", name = "G", descriptor = "Lclient!th;")
	public static Class36_Sub3_Sub2 aClass36_Sub3_Sub2_1;

	@OriginalMember(owner = "client!in", name = "L", descriptor = "Lclient!jd;")
	public static Class84 aClass84_48;

	@OriginalMember(owner = "client!in", name = "E", descriptor = "I")
	public static int anInt2399 = 0;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
	public static String method2063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String[] arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(22) String local22 = arg2[arg0];
			return local22 == null ? "null" : local22.toString();
		} else {
			@Pc(32) int local32 = 0;
			@Pc(36) int local36 = arg1 + arg0;
			for (@Pc(38) int local38 = arg0; local38 < local36; local38++) {
				@Pc(45) String local45 = arg2[local38];
				if (local45 == null) {
					local32 += 4;
				} else {
					local32 += local45.length();
				}
			}
			@Pc(64) StringBuffer local64 = new StringBuffer(local32);
			for (@Pc(66) int local66 = arg0; local66 < local36; local66++) {
				@Pc(77) String local77 = arg2[local66];
				if (local77 == null) {
					local64.append("null");
				} else {
					local64.append(local77);
				}
			}
			return local64.toString();
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IBIII)V")
	public static void method2065(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class2_Sub3_Sub16 local12 = Static119.method2204(arg2, 8);
		local12.method2718();
		local12.anInt3327 = arg1;
		local12.anInt3323 = arg3;
		local12.anInt3324 = arg0;
	}

	@OriginalMember(owner = "client!in", name = "e", descriptor = "(I)V")
	public static void method2067() {
		for (@Pc(6) Class2_Sub3_Sub7 local6 = (Class2_Sub3_Sub7) Static197.aClass1_14.method13(); local6 != null; local6 = (Class2_Sub3_Sub7) Static197.aClass1_14.method9()) {
			@Pc(20) Class36_Sub1 local20 = local6.aClass36_Sub1_1;
			if (local20.anInt1011 != Static208.anInt4335 || local20.aBoolean71) {
				local6.method4926();
			} else if (Static148.anInt3168 >= local20.anInt1006) {
				local20.method803(Static37.anInt906);
				if (local20.aBoolean71) {
					local6.method4926();
				} else {
					Static34.method1661(local20.anInt1011, local20.anInt1021, local20.anInt1015, local20.anInt1007, 60, local20, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)I")
	public static int method2068(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(IIIII)V")
	public static void method2069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static214.anInt4468 == 0 || arg2 == 0 || Static151.anInt3191 >= 50 || arg0 == -1) {
			return;
		}
		Static23.anIntArray36[Static151.anInt3191] = arg0;
		Static184.anIntArray311[Static151.anInt3191] = arg2;
		Static219.anIntArray378[Static151.anInt3191] = arg3;
		Static73.aClass30Array1[Static151.anInt3191] = null;
		Static63.anIntArray106[Static151.anInt3191] = 0;
		Static156.anIntArray488[Static151.anInt3191] = arg1;
		Static151.anInt3191++;
	}
}
