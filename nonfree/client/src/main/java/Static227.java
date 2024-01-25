import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!hka", name = "n", descriptor = "Lclient!l;")
	public static final Class213 aClass213_19 = new Class213();

	@OriginalMember(owner = "client!hka", name = "m", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_112 = new Class160(127, 6);

	@OriginalMember(owner = "client!hka", name = "p", descriptor = "[F")
	public static final float[] aFloatArray37 = new float[2];

	@OriginalMember(owner = "client!hka", name = "d", descriptor = "Lclient!bd;")
	public static final Class32 aClass32_21 = new Class32();

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(III)Z")
	public static boolean method3836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(IB)Z")
	public static boolean method3837(@OriginalArg(1) byte arg0) {
		@Pc(13) int local13 = arg0 & 0xFF;
		if (local13 == 0) {
			return false;
		} else {
			return local13 < 128 || local13 >= 160 || Static601.aCharArray10[local13 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(ZJIZ)Ljava/lang/String;")
	public static String method3838(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		Static611.method8631(arg0);
		@Pc(10) Calendar local10 = Static183.aCalendar3;
		@Pc(20) int local20 = local10.get(5);
		@Pc(34) int local34 = local10.get(2);
		@Pc(38) int local38 = local10.get(1);
		@Pc(42) int local42 = local10.get(11);
		@Pc(46) int local46 = local10.get(12);
		return arg1 == 3 ? Static564.method8090(arg0, arg1) : Integer.toString(local20 / 10) + local20 % 10 + "-" + Static235.aStringArrayArray2[arg1][local34] + "-" + local38 + " " + local42 / 10 + local42 % 10 + ":" + local46 / 10 + local46 % 10;
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(Lclient!rg;III)Lclient!dea;")
	public static Class72 method3839(@OriginalArg(0) Class310 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) byte[] local9 = arg0.method7803(0, arg1);
		return local9 == null ? null : new Class72(local9);
	}
}
