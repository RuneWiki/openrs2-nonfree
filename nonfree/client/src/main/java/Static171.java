import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "Lclient!am;")
	public static Class11 aClass11_76;

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
	public static int anInt3791;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
	public static int anInt3786 = 0;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	public static int anInt3787 = 0;

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "[I")
	public static final int[] anIntArray332 = new int[32];

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "[Lclient!lb;")
	public static final Class116[] aClass116Array2 = new Class116[14];

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method3205(@OriginalArg(0) long arg0) {
		Static106.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static106.aCalendar2.get(7);
		@Pc(17) int local17 = Static106.aCalendar2.get(5);
		@Pc(21) int local21 = Static106.aCalendar2.get(2);
		@Pc(25) int local25 = Static106.aCalendar2.get(1);
		@Pc(29) int local29 = Static106.aCalendar2.get(11);
		@Pc(33) int local33 = Static106.aCalendar2.get(12);
		@Pc(37) int local37 = Static106.aCalendar2.get(13);
		return Static312.aStringArray23[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static178.aStringArray44[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public static void method3207() {
		for (@Pc(6) Class17_Sub3 local6 = (Class17_Sub3) Static140.aClass204_6.method5359(); local6 != null; local6 = (Class17_Sub3) Static140.aClass204_6.method5357()) {
			local6.method1071();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)I")
	public static int method3208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static180.anIntArray340[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3209(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
	public static void method3212() {
		@Pc(1) Class154 local1 = Static199.aClass154_102;
		synchronized (Static199.aClass154_102) {
			Static199.aClass154_102.method4219();
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)V")
	public static void method3215() {
		for (@Pc(15) Class4_Sub1_Sub20 local15 = (Class4_Sub1_Sub20) Static108.aClass130_44.method3499(); local15 != null; local15 = (Class4_Sub1_Sub20) Static108.aClass130_44.method3512()) {
			@Pc(20) Class2_Sub2_Sub4 local20 = local15.aClass2_Sub2_Sub4_1;
			if (Static279.anInt5645 != local20.aByte73 || local20.aBoolean294) {
				local15.method5667();
				local20.method3056();
			} else if (local20.anInt3550 <= Static342.anInt6706) {
				local20.method3050(Static106.anInt2370);
				if (local20.aBoolean294) {
					local15.method5667();
				} else {
					Static242.method4205(local20, true);
				}
			}
		}
	}
}
