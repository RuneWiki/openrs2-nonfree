import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!of", name = "w", descriptor = "[I")
	public static final int[] anIntArray509 = new int[1000];

	@OriginalMember(owner = "client!of", name = "B", descriptor = "Lclient!rr;")
	public static final Class220 aClass220_7 = new Class220(0, 2, 2, 1);

	@OriginalMember(owner = "client!of", name = "C", descriptor = "I")
	public static int anInt5454 = -1;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(III)I")
	public static int method4208(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(25) int local25 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local25;
		}
		return arg0;
	}
}
