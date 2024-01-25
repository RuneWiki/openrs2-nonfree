import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static353 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
	public static int anInt6019;

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
	public static int anInt6020 = -1;

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
	public static final int anInt6022 = 1337;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IJ)V")
	public static void method5122(@OriginalArg(1) long arg0) {
		Static43.aCalendar2.setTime(new Date(arg0));
	}
}
