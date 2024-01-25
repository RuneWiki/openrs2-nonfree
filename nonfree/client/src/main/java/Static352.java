import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!rn", name = "w", descriptor = "I")
	public static int anInt5944;

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "Lclient!hi;")
	public static final Class106 aClass106_14 = new Class106(2, 4, 4, 0);

	@OriginalMember(owner = "client!rn", name = "r", descriptor = "Lclient!bg;")
	public static final Class25 aClass25_94 = new Class25(77, 4);

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!bl;)V")
	public static void method4975(@OriginalArg(1) Class28_Sub1 arg0) {
		@Pc(18) byte[] local18;
		if (Static256.anObject7 == null) {
			@Pc(11) Class7_Sub1_Sub1 local11 = new Class7_Sub1_Sub1();
			local18 = local11.method119();
			Static256.anObject7 = Static262.method4019(local18);
		}
		if (Static217.anObject5 == null) {
			@Pc(33) Class7_Sub2_Sub1 local33 = new Class7_Sub2_Sub1();
			local18 = local33.method4966();
			Static217.anObject5 = Static262.method4019(local18);
		}
		@Pc(48) Class27 local48 = arg0.aClass27_1;
		if (local48.method410() && Static307.anObject4 == null) {
			local18 = Static216.method3342(0.6F, 16.0F, 0.5F, 4.0F, 4.0F, new Class95_Sub1(419684));
			Static307.anObject4 = Static262.method4019(local18);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZC)Z")
	public static boolean method4977(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V")
	public static void method4978() {
		Static394.aClass137_34.method3178();
		Static217.aClass202_2.method4473();
		Static287.aClass202_9.method4473();
	}
}
