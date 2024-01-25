import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "I")
	public static int anInt4683;

	@OriginalMember(owner = "client!lp", name = "u", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!lp", name = "x", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!lp", name = "z", descriptor = "I")
	public static int anInt4687;

	@OriginalMember(owner = "client!lp", name = "w", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_64 = new Class177(55, 7);

	@OriginalMember(owner = "client!lp", name = "y", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_104 = new Class263(18, -2);

	@OriginalMember(owner = "client!lp", name = "A", descriptor = "Z")
	public static boolean aBoolean302 = false;

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)V")
	public static void method3601() {
		if (Static97.anInt2331 == 5) {
			Static97.anInt2331 = 6;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method3606(@OriginalArg(1) long arg0) {
		Static447.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static447.aCalendar2.get(7);
		@Pc(17) int local17 = Static447.aCalendar2.get(5);
		@Pc(21) int local21 = Static447.aCalendar2.get(2);
		@Pc(33) int local33 = Static447.aCalendar2.get(1);
		@Pc(37) int local37 = Static447.aCalendar2.get(11);
		@Pc(41) int local41 = Static447.aCalendar2.get(12);
		@Pc(45) int local45 = Static447.aCalendar2.get(13);
		return Static94.aStringArray14[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static101.aStringArray15[local21] + "-" + local33 + " " + local37 / 10 + local37 % 10 + ":" + local41 / 10 + local41 % 10 + ":" + local45 / 10 + local45 % 10 + " GMT";
	}
}
