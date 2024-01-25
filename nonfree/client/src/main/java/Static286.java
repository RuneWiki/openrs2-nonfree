import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "I")
	public static int anInt5252;

	@OriginalMember(owner = "client!jia", name = "e", descriptor = "I")
	public static int anInt5255;

	@OriginalMember(owner = "client!jia", name = "b", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_59 = new Class341(75, -1);

	@OriginalMember(owner = "client!jia", name = "f", descriptor = "I")
	public static int anInt5256 = 0;

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(ILclient!mg;)Z")
	public static boolean method4774(@OriginalArg(1) Class232 arg0) {
		return arg0 == null ? false : Static571.method8696(arg0.anInt7036, arg0.anInt7043 - arg0.anInt7037, -arg0.anInt7036 + arg0.anInt7042, arg0.anInt7044 - arg0.anInt7039, arg0.anInt7037, arg0.anInt7039);
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)V")
	public static void method4775() {
		@Pc(8) Class2_Sub35 local8 = (Class2_Sub35) Static489.aClass271_50.method7177();
		@Pc(16) boolean local16 = Static267.aClass357_180 != null || Static429.anInt7877 > 0;
		@Pc(25) int local25 = local8.method9186();
		@Pc(29) int local29 = local8.method9185();
		if (local16) {
			Static576.anInt10034 = 1;
		}
		if (local16) {
			Static477.aClass2_Sub1_Sub13_3 = Static577.aClass2_Sub1_Sub13_4;
		} else {
			Static104.method1882(local25, local29, Static577.aClass2_Sub1_Sub13_4);
		}
	}
}
