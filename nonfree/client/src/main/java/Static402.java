import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!pw", name = "C", descriptor = "Z")
	public static boolean aBoolean495;

	@OriginalMember(owner = "client!pw", name = "D", descriptor = "[I")
	public static int[] anIntArray568;

	@OriginalMember(owner = "client!pw", name = "M", descriptor = "Lclient!ek;")
	public static Class85 aClass85_7;

	@OriginalMember(owner = "client!pw", name = "B", descriptor = "Z")
	public static boolean aBoolean494 = false;

	@OriginalMember(owner = "client!pw", name = "E", descriptor = "[[I")
	public static final int[][] anIntArrayArray71 = new int[6][];

	@OriginalMember(owner = "client!pw", name = "I", descriptor = "I")
	public static int anInt7079 = 0;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method5895(@OriginalArg(1) long arg0) {
		Static97.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static97.aCalendar1.get(7);
		@Pc(17) int local17 = Static97.aCalendar1.get(5);
		@Pc(29) int local29 = Static97.aCalendar1.get(2);
		@Pc(33) int local33 = Static97.aCalendar1.get(1);
		@Pc(37) int local37 = Static97.aCalendar1.get(11);
		@Pc(41) int local41 = Static97.aCalendar1.get(12);
		@Pc(45) int local45 = Static97.aCalendar1.get(13);
		return Static532.aStringArray34[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static226.aStringArray15[local29] + "-" + local33 + " " + local37 / 10 + local37 % 10 + ":" + local41 / 10 + local41 % 10 + ":" + local45 / 10 + local45 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(I[FI)[F")
	public static float[] method5897(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(13) float[] local13 = new float[arg1];
		Static585.method3076(arg0, 0, local13, 0, arg1);
		return local13;
	}
}
