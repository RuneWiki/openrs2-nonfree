import java.io.FileOutputStream;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!aia", name = "B", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream3;

	@OriginalMember(owner = "client!aia", name = "p", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_58 = new Class264(8);

	@OriginalMember(owner = "client!aia", name = "s", descriptor = "Lclient!ok;")
	public static final Class262 aClass262_68 = new Class262();

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IIJZ)Ljava/lang/String;")
	public static String method8424(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		Static89.method1689(arg1);
		@Pc(19) Calendar local19 = Static170.aCalendar2;
		@Pc(23) int local23 = local19.get(5);
		@Pc(27) int local27 = local19.get(2);
		@Pc(31) int local31 = local19.get(1);
		@Pc(35) int local35 = local19.get(11);
		@Pc(39) int local39 = local19.get(12);
		return arg0 == 3 ? Static358.method5435(arg0, arg1) : Integer.toString(local23 / 10) + local23 % 10 + "-" + Static225.aStringArrayArray2[arg0][local27] + "-" + local31 + " " + local35 / 10 + local35 % 10 + ":" + local39 / 10 + local39 % 10;
	}
}
