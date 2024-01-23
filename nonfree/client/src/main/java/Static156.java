import java.awt.Canvas;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
	public static int anInt1435;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "Lclient!bn;")
	public static Class1_Sub2_Sub1_Sub2 aClass1_Sub2_Sub1_Sub2_2;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas2;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	public static void method1233() {
		Static183.aClass135_25.method3317();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BII)V")
	public static void method1235(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub2_Sub18 local12 = Static130.method2227(arg1, 12);
		local12.method3905();
		local12.anInt5005 = arg0;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)I")
	public static int method1238() {
		return Static45.aBoolean79 && Static175.aBooleanArray34[81] && Static134.anInt2945 > 2 ? Static20.anIntArray44[Static134.anInt2945 - 2] : Static20.anIntArray44[Static134.anInt2945 - 1];
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method1240(@OriginalArg(1) long arg0) {
		Static23.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static23.aCalendar1.get(7);
		@Pc(24) int local24 = Static23.aCalendar1.get(5);
		@Pc(28) int local28 = Static23.aCalendar1.get(2);
		@Pc(32) int local32 = Static23.aCalendar1.get(1);
		@Pc(36) int local36 = Static23.aCalendar1.get(11);
		@Pc(40) int local40 = Static23.aCalendar1.get(12);
		@Pc(44) int local44 = Static23.aCalendar1.get(13);
		return Static139.aStringArray39[local13 - 1] + ", " + local24 / 10 + local24 % 10 + "-" + Static9.aStringArray4[local28] + "-" + local32 + " " + local36 / 10 + local36 % 10 + ":" + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZIIZZ)Lclient!km;")
	public static Class91 method1241(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(5) Class111 local5 = null;
		if (Static295.aClass59_5 != null) {
			local5 = new Class111(arg1, Static295.aClass59_5, Static72.aClass59Array1[arg1], 1000000);
		}
		Static67.aClass63_Sub1Array2[arg1] = Static38.aClass38_1.method1186(Static130.aClass111_4, local5, arg1);
		if (arg2) {
			Static67.aClass63_Sub1Array2[arg1].method1938();
		}
		return new Class91(Static67.aClass63_Sub1Array2[arg1], arg0, arg3);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)I")
	public static int method1243(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
