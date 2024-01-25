import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "Lclient!tf;")
	public static Class322 aClass322_157;

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "Z")
	public static volatile boolean aBoolean766 = true;

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(B)Lclient!gu;")
	public static Class119_Sub1 method7930() {
		Static432.anInt7256 = 0;
		return Static460.method5154();
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(B)V")
	public static void method7933() {
		Static68.aClass98_3.method2823();
		Static154.aClass208_3.method4728();
		Static43.aClass23_1.method442();
		Static478.aClass212_3.method4797();
		Static361.aClass229_13.method5398();
		Static6.aClass92_1.method2681();
		Static545.aClass240_2.method5681();
		Static368.aClass278_1.method6128();
		Static284.aClass207_1.method4719();
		Static29.aClass130_2.method3315();
		Static401.aClass33_1.method662();
		Static350.aClass87_3.method2538();
		Static39.aClass102_1.method2920();
		Static382.aClass268_1.method6064();
		Static137.aClass124_1.method3256();
		Static420.aClass356_1.method7703();
		Static508.aClass232_1.method5417();
		Static482.aClass177_1.method4141();
		Static179.aClass366_1.method7946();
		Static164.aClass239_1.method5571();
		Static552.method7315();
		Static95.method1757();
		Static174.method3068();
		Static382.method5654();
		Static292.method4376();
		Static536.aClass6_62.method94();
		Static328.aClass6_38.method94();
		Static420.aClass6_52.method94();
		Static106.aClass6_9.method94();
		Static312.aClass6_35.method94();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIII)V")
	public static void method7938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class299 local7 = Static309.aClass299ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class41_Sub2_Sub2 local13 = local7.aClass41_Sub2_Sub2_2;
		@Pc(16) Class41_Sub2_Sub2 local16 = local7.aClass41_Sub2_Sub2_1;
		if (local13 != null) {
			local13.aShort35 = (short) (local13.aShort35 * arg3 / (0x10 << Static315.anInt5369 - 7));
			local13.aShort36 = (short) (local13.aShort36 * arg3 / (0x10 << Static315.anInt5369 - 7));
		}
		if (local16 != null) {
			local16.aShort35 = (short) (local16.aShort35 * arg3 / (0x10 << Static315.anInt5369 - 7));
			local16.aShort36 = (short) (local16.aShort36 * arg3 / (0x10 << Static315.anInt5369 - 7));
		}
	}
}
