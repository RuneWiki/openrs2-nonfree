import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "Lclient!jl;")
	public static Class89 aClass89_13 = new Class89(64);

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "[Lclient!fc;")
	public static Class2_Sub4_Sub1[] aClass2_Sub4_Sub1Array1 = new Class2_Sub4_Sub1[32768];

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "[I")
	public static int[] anIntArray234 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method1736(@OriginalArg(1) long arg0) {
		Static223.aCalendar1.setTime(new Date(arg0));
		@Pc(21) int local21 = Static223.aCalendar1.get(7);
		@Pc(25) int local25 = Static223.aCalendar1.get(5);
		@Pc(29) int local29 = Static223.aCalendar1.get(2);
		@Pc(33) int local33 = Static223.aCalendar1.get(1);
		@Pc(37) int local37 = Static223.aCalendar1.get(11);
		@Pc(41) int local41 = Static223.aCalendar1.get(12);
		@Pc(45) int local45 = Static223.aCalendar1.get(13);
		return Static70.aStringArray15[local21 - 1] + ", " + local25 / 10 + local25 % 10 + "-" + Static248.aStringArray41[local29] + "-" + local33 + " " + local37 / 10 + local37 % 10 + ":" + local41 / 10 + local41 % 10 + ":" + local45 / 10 + local45 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!jh;III)V")
	public static void method1738(@OriginalArg(0) Class2_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0.anInt2822 && arg2 != -1) {
			@Pc(90) Class32 local90 = Static202.method3231(arg2);
			@Pc(93) int local93 = local90.anInt972;
			if (local93 == 1) {
				arg0.anInt2829 = 0;
				arg0.anInt2830 = arg1;
				arg0.anInt2800 = 0;
				arg0.anInt2845 = 1;
				arg0.anInt2811 = 0;
				Static154.method2507(arg0 == Static56.aClass2_Sub4_Sub2_1, arg0.anInt2846, arg0.anInt2794, arg0.anInt2800, local90);
			}
			if (local93 == 2) {
				arg0.anInt2811 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt2822 == -1 || Static202.method3231(arg2).anInt967 >= Static202.method3231(arg0.anInt2822).anInt967) {
			arg0.anInt2829 = 0;
			arg0.anInt2822 = arg2;
			arg0.anInt2778 = arg0.anInt2787;
			arg0.anInt2811 = 0;
			arg0.anInt2830 = arg1;
			arg0.anInt2800 = 0;
			arg0.anInt2845 = 1;
			if (arg0.anInt2822 != -1) {
				Static154.method2507(Static56.aClass2_Sub4_Sub2_1 == arg0, arg0.anInt2846, arg0.anInt2794, arg0.anInt2800, Static202.method3231(arg0.anInt2822));
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIZI)V")
	public static void method1739(@OriginalArg(2) boolean arg0) {
		Static263.aBoolean329 = arg0;
		Static230.anInt3026 = 22050;
		Static229.anInt4846 = 2;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ)V")
	public static void method1740() {
		Static7.aClass89_1.method2273(5);
		Static192.aClass89_28.method2273(5);
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
	public static void method1741() {
		Static209.aClass89_31.method2266();
		Static185.aClass89_26.method2266();
	}
}
