import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!kv", name = "Pb", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_176 = new Class196(94, 4);

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "(III)Z")
	public static boolean method4950(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static278.method3851(arg1, arg0) | (arg1 & 0x70000) != 0 || Static512.method7321(arg0, arg1);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IJIZ)Ljava/lang/String;")
	public static String method4990(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		Static188.method2732(arg1);
		@Pc(12) Calendar local12 = Static594.aCalendar2;
		@Pc(22) int local22 = local12.get(5);
		@Pc(31) int local31 = local12.get(2);
		@Pc(35) int local35 = local12.get(1);
		@Pc(39) int local39 = local12.get(11);
		@Pc(43) int local43 = local12.get(12);
		return arg0 == 3 ? Static90.method1398(arg0, arg1) : Integer.toString(local22 / 10) + local22 % 10 + "-" + Static312.aStringArrayArray1[arg0][local31] + "-" + local35 + " " + local39 / 10 + local39 % 10 + ":" + local43 / 10 + local43 % 10;
	}
}
