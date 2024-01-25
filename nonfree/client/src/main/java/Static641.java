import java.awt.Canvas;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static641 {

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas13;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
	public static int anInt11092;

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
	public static int anInt11087 = 0;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZJZI)Ljava/lang/String;")
	public static String method9480(@OriginalArg(1) long arg0, @OriginalArg(3) int arg1) {
		Static110.method9641(arg0);
		@Pc(22) Calendar local22 = Static550.aCalendar1;
		@Pc(26) int local26 = local22.get(5);
		@Pc(30) int local30 = local22.get(2);
		@Pc(34) int local34 = local22.get(1);
		@Pc(38) int local38 = local22.get(11);
		@Pc(42) int local42 = local22.get(12);
		return arg1 == 3 ? Static354.method6093(arg1, arg0) : Integer.toString(local26 / 10) + local26 % 10 + "-" + Static303.aStringArrayArray3[arg1][local30] + "-" + local34 + " " + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10;
	}
}
