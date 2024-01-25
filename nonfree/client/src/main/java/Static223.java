import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "Lclient!oea;")
	public static final Class245 aClass245_2 = new Class245(128);

	@OriginalMember(owner = "client!ip", name = "j", descriptor = "[I")
	public static final int[] anIntArray199 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
	public static int anInt4078 = 0;

	@OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
	public static int anInt4079 = 0;

	@OriginalMember(owner = "client!ip", name = "q", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[4];

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method3623(@OriginalArg(1) long arg0) {
		Static282.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static282.aCalendar2.get(7);
		@Pc(17) int local17 = Static282.aCalendar2.get(5);
		@Pc(21) int local21 = Static282.aCalendar2.get(2);
		@Pc(25) int local25 = Static282.aCalendar2.get(1);
		@Pc(29) int local29 = Static282.aCalendar2.get(11);
		@Pc(33) int local33 = Static282.aCalendar2.get(12);
		@Pc(37) int local37 = Static282.aCalendar2.get(13);
		return Static480.aStringArray71[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static66.aStringArray11[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBI)V")
	public static void method3625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub5_Sub16 local8 = Static219.method3587(arg0, 14);
		local8.method7133();
		local8.anInt8736 = arg1;
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
	public static void method3628() {
		Static377.aClass223_50.method5400();
		Static241.aClass223_32.method5400();
		Static63.aClass223_12.method5400();
		Static76.aClass223_13.method5400();
	}
}
