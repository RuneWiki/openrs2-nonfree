import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Z")
	public static boolean aBoolean615;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
	public static int anInt6322;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "[I")
	public static final int[] anIntArray512 = new int[5];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method5343() {
		Static198.aClass87_10.method2485();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIZ)I")
	public static int method5344(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class1_Sub19 local13 = Static274.method4804(arg1, arg2);
		if (local13 == null) {
			return -1;
		} else if (arg0 >= 0 && local13.anIntArray247.length > arg0) {
			return local13.anIntArray247[arg0];
		} else {
			return -1;
		}
	}
}
