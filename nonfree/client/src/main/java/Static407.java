import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!uh", name = "v", descriptor = "[[S")
	public static short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!uh", name = "z", descriptor = "[Lclient!l;")
	public static Class11[] aClass11Array14;

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "[I")
	public static final int[] anIntArray576 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_101 = new Class2(9, 0);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method5109(@OriginalArg(1) long arg0) {
		Static56.aCalendar1.setTime(new Date(arg0));
		@Pc(26) int local26 = Static56.aCalendar1.get(7);
		@Pc(30) int local30 = Static56.aCalendar1.get(5);
		@Pc(34) int local34 = Static56.aCalendar1.get(2);
		@Pc(38) int local38 = Static56.aCalendar1.get(1);
		@Pc(42) int local42 = Static56.aCalendar1.get(11);
		@Pc(46) int local46 = Static56.aCalendar1.get(12);
		@Pc(50) int local50 = Static56.aCalendar1.get(13);
		return Static100.aStringArray14[local26 - 1] + ", " + local30 / 10 + local30 % 10 + "-" + Static345.aStringArray47[local34] + "-" + local38 + " " + local42 / 10 + local42 % 10 + ":" + local46 / 10 + local46 % 10 + ":" + local50 / 10 + local50 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BII)Lclient!go;")
	public static Class95 method5110(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class95 local7 = Static313.method4088(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass95Array1 == null || arg1 >= local7.aClass95Array1.length) {
			return null;
		} else {
			return local7.aClass95Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIZI)V")
	public static void method5111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static163.anInt4483 = arg2;
		Static238.anInt4080 = arg1;
		Static418.anInt6636 = arg0;
		Static99.anInt2002 = arg3;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIBIIIIII)V")
	public static void method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5) {
		Static124.method2021(arg3, arg0, arg4, 0, arg2, arg1, arg5);
	}
}
