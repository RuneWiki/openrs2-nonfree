import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "Lclient!bfa;")
	public static Class4_Sub2_Sub1_Sub1_Sub1 aClass4_Sub2_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!qk", name = "o", descriptor = "Lclient!bu;")
	public static Class43 aClass43_2;

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
	public static int anInt7766;

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "Lclient!eda;")
	public static final Class87 aClass87_191 = new Class87(4);

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLclient!la;)V")
	public static void method6849(@OriginalArg(1) Class207 arg0) {
		Static366.aClass207_71 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!ov;[Lclient!vt;)V")
	public static void method6851(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) Class5_Sub11[] arg1) {
		@Pc(6) int local6;
		if (Static348.aBoolean425) {
			local6 = arg0.method8729(arg1);
			Static517.aClass133_13.method7286(local6, arg1);
		}
		if (Static456.aClass61Array3 == Static11.aClass61Array1) {
			@Pc(28) int local28;
			if (arg0 instanceof Class4_Sub2_Sub1) {
				local6 = ((Class4_Sub2_Sub1) arg0).aShort107;
				local28 = ((Class4_Sub2_Sub1) arg0).aShort108;
			} else {
				local6 = arg0.anInt10231 >> Static115.anInt2156;
				local28 = arg0.anInt10229 >> Static115.anInt2156;
			}
			Static517.aClass133_13.EA(Static20.aClass61Array2[0].method8584(arg0.anInt10229, arg0.anInt10231), Static251.method4163(local6, local28), Static613.method8743(local6, local28), Static626.method5555(local6, local28));
		}
		@Pc(64) Class4_Sub6 local64 = arg0.method8721(Static517.aClass133_13);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean731) {
			@Pc(72) Class4_Sub9[] local72 = local64.aClass4_Sub9Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class4_Sub9 local79 = local72[local74];
				if (local79.aBoolean558) {
					Static562.method5062(local79.anInt7892 - local79.anInt7894, local79.anInt7891 + local79.anInt7894, local79.anInt7893 + local79.anInt7894, local79.anInt7890 - local79.anInt7894);
				}
			}
		}
		if (local64.aBoolean220) {
			local64.aClass4_Sub2_9 = arg0;
			if (Static576.aBoolean696) {
				@Pc(119) Class155 local119 = Static348.aClass155_3;
				synchronized (Static348.aClass155_3) {
					Static348.aClass155_3.method3771(local64);
					return;
				}
			}
			Static348.aClass155_3.method3771(local64);
			return;
		}
		Static87.method1410(local64);
	}
}
