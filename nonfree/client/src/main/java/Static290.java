import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!we", name = "e", descriptor = "I")
	public static int anInt6020;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Lclient!jd;")
	public static Class84 aClass84_126;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "[I")
	public static int[] anIntArray515 = new int[128];

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!we", name = "d", descriptor = "[I")
	public static int[] anIntArray516 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!we", name = "g", descriptor = "I")
	public static int anInt6021 = 100;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIB)V")
	public static void method4814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub3_Sub16 local8 = Static119.method2204(arg1, 6);
		local8.method2718();
		local8.anInt3327 = arg0;
	}
}
