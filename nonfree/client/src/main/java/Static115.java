import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!fp", name = "t", descriptor = "Lclient!gg;")
	public static Class84 aClass84_4;

	@OriginalMember(owner = "client!fp", name = "y", descriptor = "Lclient!no;")
	public static Class173 aClass173_1;

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "F")
	public static float aFloat57 = 0.25F;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	public static void method2206() {
		Static133.aClass59_1.method1765();
		Static240.aClass121_3.method3396();
		Static383.aClass126_2.method3433();
		Static146.aClass228_1.method5198();
		Static220.aClass247_1.method5656();
		Static139.aClass193_1.method4648();
		Static143.aClass85_1.method2408();
		Static193.aClass186_1.method4460();
		Static166.aClass86_3.method2412();
		Static99.aClass50_1.method1530();
		Static123.aClass223_1.method5136();
		Static62.aClass116_1.method3297();
		Static261.aClass8_4.method68();
		Static203.aClass202_1.method4860();
		Static413.aClass257_1.method5857();
		Static104.aClass180_1.method4407();
		Static348.aClass237_1.method5400();
		Static75.aClass207_1.method4885();
		Static433.aClass275_2.method6298();
		Static159.aClass218_1.method5097();
		Static124.method2332();
		Static129.method2407();
		Static149.method2765();
		Static407.method5682();
		Static285.aClass83_34.method2345(5);
		Static274.aClass83_32.method2345(5);
		Static138.aClass83_23.method2345(5);
		Static292.aClass83_37.method2345(5);
		Static64.aClass83_11.method2345(5);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)V")
	public static void method2208(@OriginalArg(1) int arg0) {
		Static243.anInt4731 = arg0;
		Static296.aClass83_53.method2346();
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!ci;Lclient!ci;Lclient!ci;Lclient!ci;B)V")
	public static void method2209(@OriginalArg(0) Class38 arg0, @OriginalArg(1) Class38 arg1, @OriginalArg(2) Class38 arg2, @OriginalArg(3) Class38 arg3) {
		Static201.aClass38_44 = arg0;
		Static232.aClass38_49 = arg2;
		Static434.aClass38_89 = arg3;
		Static267.aClass38_55 = arg1;
		Static122.aClass240ArrayArray2 = new Class240[Static434.aClass38_89.method1035()][];
		Static445.aBooleanArray151 = new boolean[Static434.aClass38_89.method1035()];
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method2210(@OriginalArg(1) Class30 arg0) {
		if (Static332.aClass91_38.method2573() == 0) {
			return;
		}
		@Pc(21) Class4_Sub33 local21;
		if (Static192.anInt3828 == 0) {
			for (local21 = (Class4_Sub33) Static332.aClass91_38.method2584(); local21 != null; local21 = (Class4_Sub33) Static332.aClass91_38.method2586()) {
				Static139.aClass193_1.method4645(false, arg0, arg0, false, local21.anInt5625, local21.anInt5633, local21.anInt5626, local21.aBoolean414 ? Static52.aClass11_Sub5_Sub2_Sub1_2.aClass90_1 : null, local21.anInt5631, Static142.aClass18_1, local21.anInt5632);
				local21.method6330();
			}
			Static208.method3674();
			return;
		}
		if (Static301.aClass30_16 == null) {
			@Pc(70) Canvas local70 = new Canvas();
			local70.setSize(36, 32);
			Static301.aClass30_16 = Static323.method2082(0, Static357.anInterface4_8, Static390.aClass255_5, local70, 0);
			Static361.aClass18_4 = Static301.aClass30_16.method2054(Static413.method5731(Static300.aClass38_60, Static455.anInt7784), Static472.method2843(Static143.aClass38_30, Static455.anInt7784));
		}
		for (local21 = (Class4_Sub33) Static332.aClass91_38.method2584(); local21 != null; local21 = (Class4_Sub33) Static332.aClass91_38.method2586()) {
			Static139.aClass193_1.method4645(false, arg0, Static301.aClass30_16, false, local21.anInt5625, local21.anInt5633, local21.anInt5626, local21.aBoolean414 ? Static52.aClass11_Sub5_Sub2_Sub1_2.aClass90_1 : null, local21.anInt5631, Static361.aClass18_4, local21.anInt5632);
			local21.method6330();
		}
	}
}
