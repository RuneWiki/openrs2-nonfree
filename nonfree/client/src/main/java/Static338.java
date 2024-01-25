import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!mba", name = "e", descriptor = "I")
	public static int anInt5355;

	@OriginalMember(owner = "client!mba", name = "f", descriptor = "F")
	public static float aFloat99;

	@OriginalMember(owner = "client!mba", name = "g", descriptor = "Lclient!paa;")
	public static Class261 aClass261_6;

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4547(@OriginalArg(0) String arg0) {
		if (Static397.aStringArray34 == null) {
			Static30.method551();
		}
		Static450.aCalendar2.setTime(new Date(Static476.method6413()));
		@Pc(25) int local25 = Static450.aCalendar2.get(11);
		@Pc(29) int local29 = Static450.aCalendar2.get(12);
		@Pc(33) int local33 = Static450.aCalendar2.get(13);
		@Pc(67) String local67 = Integer.toString(local25 / 10) + local25 % 10 + ":" + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10;
		@Pc(72) String[] local72 = Static17.method249(arg0, '\n');
		for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
			for (@Pc(78) int local78 = Static294.anInt4813; local78 > 0; local78--) {
				Static397.aStringArray34[local78] = Static397.aStringArray34[local78 - 1];
			}
			Static397.aStringArray34[0] = local67 + ": " + local72[local74];
			if (Static282.aFileOutputStream5 != null) {
				try {
					Static282.aFileOutputStream5.write(Static288.method4009(Static397.aStringArray34[0] + "\n"));
				} catch (@Pc(127) IOException local127) {
				}
			}
			if (Static397.aStringArray34.length - 1 > Static294.anInt4813) {
				Static294.anInt4813++;
				if (Static16.anInt222 > 0) {
					Static16.anInt222++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(BLclient!qc;Z)V")
	public static void method4548(@OriginalArg(1) Class2_Sub13_Sub3 arg0) {
		Static123.aClass35_1.method2738(arg0);
		Static517.method7212(Static404.aClass380_98, Static123.aClass35_1, Static312.aClass380_74, arg0, Static319.aClass380_76);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZBLclient!paa;)V")
	public static void method4549(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class261 arg1) {
		@Pc(20) int local20 = arg1.anInt6665 == 0 ? arg1.anInt6595 : arg1.anInt6665;
		@Pc(29) int local29 = arg1.anInt6617 == 0 ? arg1.anInt6622 : arg1.anInt6617;
		Static257.method3532(local20, local29, Static559.aClass261ArrayArray2[arg1.anInt6614 >> 16], arg1.anInt6614, arg0);
		if (arg1.aClass261Array2 != null) {
			Static257.method3532(local20, local29, arg1.aClass261Array2, arg1.anInt6614, arg0);
		}
		@Pc(62) Class2_Sub9 local62 = (Class2_Sub9) Static606.aClass118_47.method2595((long) arg1.anInt6614);
		if (local62 != null) {
			Static83.method1184(local29, arg0, local62.anInt2171, local20);
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)V")
	public static void method4550() {
		Static28.aClass32_7.method634(50);
		Static489.aClass32_18.method634(50);
		Static154.aClass32_23.method634(50);
		Static589.aClass32_84.method634(50);
	}
}
