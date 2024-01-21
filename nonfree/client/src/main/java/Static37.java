import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ed", name = "Q", descriptor = "Lclient!dd;")
	public static Class17 aClass17_6 = new Class17(128);

	@OriginalMember(owner = "client!ed", name = "T", descriptor = "Lclient!ai;")
	private static Class6 aClass6_282 = Static38.method685("Unable to connect)3");

	@OriginalMember(owner = "client!ed", name = "U", descriptor = "Lclient!ai;")
	public static Class6 aClass6_283 = Static38.method685("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ed", name = "W", descriptor = "Lclient!ai;")
	public static Class6 aClass6_284 = aClass6_282;

	@OriginalMember(owner = "client!ed", name = "Y", descriptor = "Lclient!ai;")
	public static Class6 aClass6_285 = aClass6_282;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIZ)V")
	public static void method661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
			Static168.anInt3965 = -1;
			Static27.anInt709 = -1;
			return;
		}
		@Pc(35) int local35 = Static131.method2041(arg0, arg2, Static36.anInt1020) - arg1;
		@Pc(39) int local39 = arg2 - Static28.anInt722;
		@Pc(43) int local43 = local35 - Static12.anInt313;
		@Pc(47) int local47 = Class2_Sub3_Sub2_Sub2.anIntArray208[Static182.anInt4201];
		@Pc(51) int local51 = Class2_Sub3_Sub2_Sub2.anIntArray208[Static107.anInt2560];
		@Pc(55) int local55 = arg0 - Static106.anInt4184;
		@Pc(59) int local59 = Class2_Sub3_Sub2_Sub2.anIntArray207[Static182.anInt4201];
		@Pc(63) int local63 = Class2_Sub3_Sub2_Sub2.anIntArray207[Static107.anInt2560];
		@Pc(73) int local73 = local55 * local59 + local39 * local47 >> 16;
		@Pc(84) int local84 = local59 * local39 - local55 * local47 >> 16;
		@Pc(86) int local86 = local73;
		@Pc(97) int local97 = local63 * local43 - local84 * local51 >> 16;
		@Pc(107) int local107 = local51 * local43 + local63 * local84 >> 16;
		if (local107 >= 50) {
			Static168.anInt3965 = (local86 << 9) / local107 + 256;
			Static27.anInt709 = (local97 << 9) / local107 + 167;
		} else {
			Static27.anInt709 = -1;
			Static168.anInt3965 = -1;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZZZI)Lclient!mb;")
	public static Class10_Sub1 method662(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(10) Class40 local10 = null;
		if (Static26.aClass38_1 != null) {
			local10 = new Class40(arg0, Static26.aClass38_1, Static154.aClass38Array1[arg0], 1000000);
		}
		return new Class10_Sub1(local10, Static142.aClass40_4, arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(Z)V")
	public static void method663() {
		aClass6_282 = null;
		aClass17_6 = null;
		aClass6_283 = null;
		aClass6_285 = null;
		aClass6_284 = null;
	}
}
