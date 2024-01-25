import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static514 {

	@OriginalMember(owner = "client!sea", name = "Ib", descriptor = "I")
	public static int anInt9008 = 0;

	@OriginalMember(owner = "client!sea", name = "Lb", descriptor = "Lclient!ej;")
	public static final Class82 aClass82_10 = new Class82();

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(BII)Z")
	public static boolean method7690(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
