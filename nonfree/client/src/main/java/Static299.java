import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!ta", name = "Y", descriptor = "I")
	public static int anInt5761 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([S[Ljava/lang/String;I)V")
	public static void method5079(@OriginalArg(0) short[] arg0, @OriginalArg(1) String[] arg1) {
		Static264.method2883(0, arg0, arg1.length - 1, arg1);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method5080(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < Static32.anInt859; local18++) {
			if (arg0.equalsIgnoreCase(Static138.aStringArray15[local18])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static50.aStringArray5[local18])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(B)V")
	public static void method5082() {
		@Pc(5) Class66 local5 = Static222.aClass66_76;
		synchronized (Static222.aClass66_76) {
			Static222.aClass66_76.method1942();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)Lclient!lm;")
	public static Class121 method5085(@OriginalArg(1) int arg0) {
		@Pc(10) Class121 local10 = (Class121) Static126.aClass66_44.method1939((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static189.aClass170_71.method4584(36, arg0);
		local10 = new Class121();
		local10.anInt3564 = arg0;
		if (local25 != null) {
			local10.method3313(new Class5_Sub1(local25));
		}
		local10.method3311();
		Static126.aClass66_44.method1936((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!ra;)V")
	public static void method5086(@OriginalArg(1) Class170 arg0) {
		Static255.anInt4977 = 0;
		Static261.anInt5034 = 0;
		Static337.aClass24_6 = new Class24();
		Static68.aClass63_Sub1_Sub1_Sub1Array1 = new Class63_Sub1_Sub1_Sub1[1024];
		Static280.method4740(arg0);
		Static100.method2026(arg0);
	}
}
