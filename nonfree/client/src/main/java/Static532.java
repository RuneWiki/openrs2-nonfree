import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!saa", name = "g", descriptor = "I")
	public static int anInt9333;

	@OriginalMember(owner = "client!saa", name = "c", descriptor = "I")
	public static int anInt9330 = 0;

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_89 = new Class341(43, -1);

	@OriginalMember(owner = "client!saa", name = "f", descriptor = "I")
	public static int anInt9332 = -2;

	@OriginalMember(owner = "client!saa", name = "h", descriptor = "[I")
	public static final int[] anIntArray478 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lclient!ufa;I)V")
	public static void method8227(@OriginalArg(0) Class2_Sub49 arg0) {
		if (Static193.aClass291ArrayArrayArray2 == null) {
			return;
		}
		@Pc(8) Interface23 local8 = null;
		if (arg0.anInt10502 == 0) {
			local8 = (Interface23) Static584.method4102(arg0.anInt10506, arg0.anInt10499, arg0.anInt10505);
		}
		if (arg0.anInt10502 == 1) {
			local8 = (Interface23) Static207.method3925(arg0.anInt10506, arg0.anInt10499, arg0.anInt10505);
		}
		if (arg0.anInt10502 == 2) {
			local8 = (Interface23) Static174.method3415(arg0.anInt10506, arg0.anInt10499, arg0.anInt10505, vu.class);
		}
		if (arg0.anInt10502 == 3) {
			local8 = (Interface23) Static428.method7017(arg0.anInt10506, arg0.anInt10499, arg0.anInt10505);
		}
		if (local8 == null) {
			arg0.anInt10498 = 0;
			arg0.anInt10503 = 0;
			arg0.anInt10504 = -1;
		} else {
			arg0.anInt10504 = local8.method9451();
			arg0.anInt10498 = local8.method9452();
			arg0.anInt10503 = local8.method9454();
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(ZLclient!ha;)V")
	public static void method8228(@OriginalArg(1) Class101 arg0) {
		Static320.aClass91Array8 = new Class91[Static11.anIntArray3.length];
		for (@Pc(17) int local17 = 0; local17 < Static11.anIntArray3.length; local17++) {
			@Pc(23) int local23 = Static11.anIntArray3[local17];
			@Pc(28) Class324 local28 = Static386.method6506(Static638.aClass124_130, local23);
			@Pc(36) Class59 local36 = arg0.method8146(local28, Static676.method1699(Static446.aClass124_92, local23));
			Static320.aClass91Array8[local17] = new Class91(local36, local28);
		}
	}
}
