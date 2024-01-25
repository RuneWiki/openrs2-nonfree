import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static35 {

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "I")
	public static int anInt711;

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "J")
	public static final long aLong27 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(III)Z")
	public static boolean method623(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static150.method7299(arg0, arg1) | (arg0 & 0x40000) != 0 || Static515.method7276(arg1, arg0);
	}
}
