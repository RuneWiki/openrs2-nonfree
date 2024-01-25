import java.awt.Canvas;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_52 = new Class12(82, -1);

	@OriginalMember(owner = "client!bw", name = "s", descriptor = "[Z")
	public static final boolean[] aBooleanArray2 = new boolean[100];

	@OriginalMember(owner = "client!bw", name = "u", descriptor = "I")
	public static int anInt661 = 0;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V")
	public static void method546(@OriginalArg(1) int arg0) {
		if (Static440.anInt7674 == arg0) {
			return;
		}
		Static80.anInt6558 = Static104.anInt2048 = Static6.anIntArray7[arg0];
		Static319.method4629();
		Static150.anIntArrayArray17 = new int[Static80.anInt6558][Static104.anInt2048];
		Static16.anIntArrayArrayArray9 = new int[4][Static80.anInt6558 >> 3][Static104.anInt2048 >> 3];
		Static310.anIntArrayArray39 = new int[Static80.anInt6558][Static104.anInt2048];
		for (@Pc(48) int local48 = 0; local48 < 4; local48++) {
			Static20.aClass181Array2[local48] = Static36.method5941(Static80.anInt6558, Static104.anInt2048);
		}
		Static183.aByteArrayArrayArray7 = new byte[4][Static80.anInt6558][Static104.anInt2048];
		Static192.method3011(Static104.anInt2048, Static80.anInt6558);
		Static283.method3905(Static104.anInt2048 >> 3, Static80.anInt6558 >> 3, Static447.aClass121_11);
		Static440.anInt7674 = arg0;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method547(@OriginalArg(0) long arg0) {
		Static403.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static403.aCalendar2.get(7);
		@Pc(17) int local17 = Static403.aCalendar2.get(5);
		@Pc(21) int local21 = Static403.aCalendar2.get(2);
		@Pc(25) int local25 = Static403.aCalendar2.get(1);
		@Pc(29) int local29 = Static403.aCalendar2.get(11);
		@Pc(38) int local38 = Static403.aCalendar2.get(12);
		@Pc(42) int local42 = Static403.aCalendar2.get(13);
		return Static316.aStringArray27[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static336.aStringArray29[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)V")
	public static void method548() {
		Static338.aClass151_145.method3299();
		Static331.aClass151_143.method3299();
		Static440.aClass151_183.method3299();
		Static293.aClass151_123.method3299();
		Static215.aClass151_100.method3299();
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method549(@OriginalArg(0) Class121 arg0) {
		if (Static75.aClass142_11.method3208() == 0) {
			return;
		}
		@Pc(17) Class1_Sub19 local17;
		if (Static146.anInt2664 == 0) {
			for (local17 = (Class1_Sub19) Static75.aClass142_11.method3199(); local17 != null; local17 = (Class1_Sub19) Static75.aClass142_11.method3198()) {
				Static388.aClass193_3.method4245(local17.anInt3049, local17.aBoolean240 ? Static255.aClass47_Sub1_Sub5_Sub2_2.aClass201_1 : null, local17.anInt3050, arg0, Static209.aClass4_6, arg0, local17.anInt3052, false, local17.anInt3053, local17.anInt3054, false);
				local17.method5965();
			}
			Static197.method3044();
			return;
		}
		if (Static152.aClass121_6 == null) {
			@Pc(67) Canvas local67 = new Canvas();
			local67.setSize(36, 32);
			Static152.aClass121_6 = Static319.method4644(local67, 0, 0, Static403.aClass42_6, Static80.anInterface5_18);
			Static103.aClass4_1 = Static152.aClass121_6.method4612(Static224.method3273(Static381.aClass109_12, Static151.anInt2730), Static457.method1166(Static353.aClass109_79, Static151.anInt2730));
		}
		for (local17 = (Class1_Sub19) Static75.aClass142_11.method3199(); local17 != null; local17 = (Class1_Sub19) Static75.aClass142_11.method3198()) {
			Static388.aClass193_3.method4245(local17.anInt3049, local17.aBoolean240 ? Static255.aClass47_Sub1_Sub5_Sub2_2.aClass201_1 : null, local17.anInt3050, Static152.aClass121_6, Static103.aClass4_1, arg0, local17.anInt3052, false, local17.anInt3053, local17.anInt3054, false);
			local17.method5965();
		}
	}
}
