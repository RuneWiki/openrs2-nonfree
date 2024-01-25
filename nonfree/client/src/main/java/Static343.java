import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString68;

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILclient!pt;Z)Z")
	public static boolean method4654(@OriginalArg(0) int arg0, @OriginalArg(1) Class292 arg1) {
		Static300.aClass92_4.method3862(arg1.anIntArray507[arg0], arg1.anIntArray508[arg0], arg1.anIntArray506[arg0], Static552.anIntArray586);
		@Pc(22) int local22 = Static552.anIntArray586[2];
		if (local22 < 50) {
			return false;
		} else {
			arg1.aShortArray96[arg0] = (short) (Static552.anIntArray586[0] * Static596.anInt9158 / local22 + Static19.anInt441);
			arg1.aShortArray95[arg0] = (short) (Static623.anInt9774 + Static552.anIntArray586[1] * Static497.anInt7749 / local22);
			arg1.aShortArray97[arg0] = (short) local22;
			return true;
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(ZI)V")
	public static void method4655(@OriginalArg(1) int arg0) {
		@Pc(14) Class4_Sub34 local14 = (Class4_Sub34) Static255.aClass66_18.method1994((long) arg0);
		if (local14 != null) {
			local14.aClass105_Sub1_1.method2525();
			Static11.method221(local14.anInt5684, local14.aBoolean431);
			local14.method9000();
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!fia;")
	public static RuntimeException_Sub1 method4658(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString25 = local9.aString25 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
