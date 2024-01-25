import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bd", name = "g", descriptor = "Lclient!tt;")
	public static Class2_Sub6_Sub20 aClass2_Sub6_Sub20_1;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_14 = new Class349(90, -1);

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "Lclient!ji;")
	public static final Class197 aClass197_4 = new Class197(8, 0, 4, 1);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method554() {
		Static395.aClass2_Sub6_Sub20_4 = new Class2_Sub6_Sub20(Static289.aClass191_4.method4067(Static414.anInt9485), "", Static85.anInt1436, 1012, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
	public static void method555() {
		@Pc(10) Class2_Sub18 local10 = (Class2_Sub18) Static171.aClass60_55.method1226(7);
		@Pc(21) boolean local21 = Static650.aClass273_17 != null || Static230.anInt3651 > 0;
		@Pc(27) int local27 = local10.method7122();
		@Pc(31) int local31 = local10.method7124();
		if (local21) {
			Static187.anInt3065 = 1;
		}
		if (local21) {
			aClass2_Sub6_Sub20_1 = Static91.aClass2_Sub6_Sub20_2;
		} else {
			Static594.method8179(Static91.aClass2_Sub6_Sub20_2, local27, local31);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!sj;I)V")
	public static void method559(@OriginalArg(0) Class4_Sub2_Sub1_Sub2 arg0) {
		@Pc(6) Class53 local6 = arg0.aClass53_7;
		if (Static528.anInt8386 == arg0.anInt2367 || !local6.method4094() || local6.method4078()) {
			@Pc(30) int local30 = arg0.anInt2367 - arg0.anInt2358;
			@Pc(36) int local36 = Static528.anInt8386 - arg0.anInt2358;
			@Pc(47) int local47 = arg0.anInt2363 * 512 + arg0.method2046() * 256;
			@Pc(59) int local59 = arg0.anInt2361 * 512 + arg0.method2046() * 256;
			@Pc(70) int local70 = arg0.anInt2359 * 512 + arg0.method2046() * 256;
			@Pc(82) int local82 = arg0.anInt2362 * 512 + arg0.method2046() * 256;
			arg0.anInt10229 = (local70 * local36 + local47 * (local30 - local36)) / local30;
			arg0.anInt10228 = (local82 * local36 + local59 * (local30 - local36)) / local30;
		}
		arg0.anInt2369 = 0;
		if (arg0.anInt2356 == 0) {
			arg0.method2054(false, 8192);
		}
		if (arg0.anInt2356 == 1) {
			arg0.method2054(false, 12288);
		}
		if (arg0.anInt2356 == 2) {
			arg0.method2054(false, 0);
		}
		if (arg0.anInt2356 == 3) {
			arg0.method2054(false, 4096);
		}
	}
}
