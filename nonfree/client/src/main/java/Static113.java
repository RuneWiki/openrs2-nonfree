import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
	public static int anInt1913 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIII)V")
	public static void method1866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class2_Sub1_Sub6 local12 = Static267.method3705(arg3, 4);
		local12.method2574();
		local12.anInt3131 = arg1;
		local12.anInt3128 = arg2;
		local12.anInt3130 = arg0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)Lclient!ho;")
	public static Class2_Sub16 method1868() {
		if (Static5.aClass181_45 == null || Static196.aClass42_1 == null) {
			return null;
		}
		Static196.aClass42_1.method906(Static5.aClass181_45);
		@Pc(23) Class2_Sub16 local23 = (Class2_Sub16) Static196.aClass42_1.method904();
		if (local23 == null) {
			return null;
		} else {
			@Pc(37) Class203 local37 = Static5.aClass84_4.method1953(local23.anInt2880);
			return local37 != null && local37.aBoolean420 && local37.method4740(Static5.anInterface10_2) ? local23 : Static20.method388();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method1870(@OriginalArg(1) String arg0) {
		for (@Pc(16) int local16 = 0; local16 < Static80.aStringArray59.length; local16++) {
			if (Static80.aStringArray59[local16].equalsIgnoreCase(arg0)) {
				return local16;
			}
		}
		return -1;
	}
}
