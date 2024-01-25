import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
	public static int anInt6976;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
	public static int anInt6975 = 0;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Lclient!im;")
	public static final Class140 aClass140_106 = new Class140(94, 0);

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_298 = new Class296(76, -1);

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!ge;ILjava/lang/String;)I")
	public static int method5852(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt4555;
		@Pc(10) byte[] local10 = Static431.method6280(arg1);
		arg0.method3956(local10.length);
		arg0.anInt4555 += Static154.aClass27_1.method898(local10, arg0.aByteArray66, 0, arg0.anInt4555, local10.length);
		return arg0.anInt4555 - local6;
	}
}
