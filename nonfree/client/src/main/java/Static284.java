import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!kv", name = "Db", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_122 = new Class81(101, -2);

	@OriginalMember(owner = "client!kv", name = "Eb", descriptor = "Lclient!lg;")
	public static final Class201 aClass201_25 = new Class201(0, 2, 2, 1);

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)I")
	public static int method4437(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(28) int local28 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local28;
		}
		return arg0;
	}
}
