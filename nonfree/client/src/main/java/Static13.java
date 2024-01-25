import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "[I")
	public static int[] anIntArray11;

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
	public static int anInt306;

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "Lclient!ll;")
	public static Class213 aClass213_1;

	@OriginalMember(owner = "client!aga", name = "e", descriptor = "I")
	public static int anInt308;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(III)I")
	public static int method352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = arg0 >> 31 & arg1 - 1;
		return local19 + ((arg0 >>> 31) + arg0) % arg1;
	}
}
