import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static302 {

	@OriginalMember(owner = "client!kba", name = "f", descriptor = "Lclient!vo;")
	public static Class381 aClass381_7;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
	public static int anInt5298;

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_92 = new Class322(30, 12);

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
	public static final int anInt5297 = 0;

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "(I)V")
	public static void method4850() {
		if (Static240.aClass150_2 != null) {
			Static240.aClass150_2.method5490(113);
		}
		if (Static35.aClass150_1 != null) {
			Static35.aClass150_1.method5490(87);
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZJ)V")
	public static void method4852(@OriginalArg(1) long arg0) {
		Static390.aCalendar1.setTime(new Date(arg0));
	}
}
