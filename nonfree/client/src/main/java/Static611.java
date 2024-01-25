import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static611 {

	@OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
	public static int anInt10060;

	@OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
	public static int anInt10061;

	@OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
	public static int anInt10054 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IJ)V")
	public static void method8631(@OriginalArg(1) long arg0) {
		Static183.aCalendar3.setTime(new Date(arg0));
	}
}
