import java.awt.Component;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!gu", name = "t", descriptor = "[J")
	public static long[] aLongArray23;

	@OriginalMember(owner = "client!gu", name = "y", descriptor = "[Lclient!hd;")
	public static Class28_Sub1_Sub4[] aClass28_Sub1_Sub4Array4;

	@OriginalMember(owner = "client!gu", name = "r", descriptor = "I")
	public static int anInt9562 = 0;

	@OriginalMember(owner = "client!gu", name = "A", descriptor = "I")
	public static int anInt9568 = 0;

	@OriginalMember(owner = "client!gu", name = "C", descriptor = "Z")
	public static boolean aBoolean807 = false;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILjava/awt/Component;)Lclient!nl;")
	public static Class252 method8046(@OriginalArg(1) Component arg0) {
		return new Class252_Sub1(arg0);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)Lclient!rca;")
	public static Class5_Sub3_Sub16 method8049() {
		return Static330.aClass5_Sub3_Sub16_2;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method8050(@OriginalArg(1) long arg0) {
		Static358.aCalendar3.setTime(new Date(arg0));
		@Pc(13) int local13 = Static358.aCalendar3.get(7);
		@Pc(22) int local22 = Static358.aCalendar3.get(5);
		@Pc(26) int local26 = Static358.aCalendar3.get(2);
		@Pc(30) int local30 = Static358.aCalendar3.get(1);
		@Pc(34) int local34 = Static358.aCalendar3.get(11);
		@Pc(38) int local38 = Static358.aCalendar3.get(12);
		@Pc(42) int local42 = Static358.aCalendar3.get(13);
		return Static223.aStringArray26[local13 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static463.aStringArray47[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "()V")
	public static void method8053() {
		Static306.method4846(Static219.anInt4088);
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(B)V")
	public static void method8059() {
		@Pc(10) int local10 = 0;
		if (Static172.aClass5_Sub50_14 != null) {
			local10 = Static172.aClass5_Sub50_14.aClass12_Sub14_1.method3089();
		}
		@Pc(32) int local32;
		@Pc(48) int local48;
		if (local10 == 2) {
			local32 = Static255.anInt4665 <= 800 ? Static255.anInt4665 : 800;
			Static67.anInt1003 = (Static255.anInt4665 - local32) / 2;
			Static32.anInt510 = local32;
			local48 = Static89.anInt2047 <= 600 ? Static89.anInt2047 : 600;
			Static79.anInt1140 = local48;
			Static47.anInt693 = 0;
		} else if (local10 == 1) {
			local32 = Static255.anInt4665 > 1024 ? 1024 : Static255.anInt4665;
			Static67.anInt1003 = (Static255.anInt4665 - local32) / 2;
			Static32.anInt510 = local32;
			local48 = Static89.anInt2047 > 768 ? 768 : Static89.anInt2047;
			Static79.anInt1140 = local48;
			Static47.anInt693 = 0;
		} else {
			Static79.anInt1140 = Static89.anInt2047;
			Static67.anInt1003 = 0;
			Static32.anInt510 = Static255.anInt4665;
			Static47.anInt693 = 0;
		}
	}
}
