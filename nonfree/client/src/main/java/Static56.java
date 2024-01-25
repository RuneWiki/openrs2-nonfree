import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!br", name = "r", descriptor = "Lclient!pu;")
	public static Class50 aClass50_3;

	@OriginalMember(owner = "client!br", name = "n", descriptor = "Lclient!rda;")
	public static final Class300 aClass300_8 = new Class300(64);

	@OriginalMember(owner = "client!br", name = "t", descriptor = "J")
	public static long aLong29 = 0L;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!lq;[Lclient!gu;)V")
	public static void method745(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) Class5_Sub18[] arg1) {
		@Pc(6) int local6;
		if (Static389.aBoolean601) {
			local6 = arg0.method8970(arg1);
			Static10.aClass65_1.method6926(local6, arg1);
		}
		if (Static111.aClass109Array3 == Static495.aClass109Array4) {
			@Pc(28) int local28;
			if (arg0 instanceof Class28_Sub1_Sub4) {
				local6 = ((Class28_Sub1_Sub4) arg0).aShort124;
				local28 = ((Class28_Sub1_Sub4) arg0).aShort121;
			} else {
				local6 = arg0.anInt10781 >> Static588.anInt9672;
				local28 = arg0.anInt10784 >> Static588.anInt9672;
			}
			Static10.aClass65_1.EA(Static605.aClass109Array5[0].method7702(arg0.anInt10781, arg0.anInt10784), Static1.method8276(local6, local28), Static71.method8032(local6, local28), Static102.method1991(local6, local28));
		}
		@Pc(64) Class28_Sub7 local64 = arg0.method8972(Static10.aClass65_1);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean912) {
			@Pc(72) Class28_Sub9[] local72 = local64.aClass28_Sub9Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class28_Sub9 local79 = local72[local74];
				if (local79.aBoolean890) {
					Static520.method7366(local79.anInt10431 - local79.anInt10434, local79.anInt10430 + local79.anInt10434, local79.anInt10433 - local79.anInt10434, local79.anInt10432 + local79.anInt10434);
				}
			}
		}
		if (local64.aBoolean655) {
			local64.aClass28_Sub1_17 = arg0;
			if (Static23.aBoolean21) {
				@Pc(119) Class270 local119 = Static296.aClass270_3;
				synchronized (Static296.aClass270_3) {
					Static296.aClass270_3.method6361(local64);
					return;
				}
			}
			Static296.aClass270_3.method6361(local64);
			return;
		}
		Static334.method5129(local64);
	}
}
