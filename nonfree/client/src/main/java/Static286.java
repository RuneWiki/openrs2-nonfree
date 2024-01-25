import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static286 {

	@OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
	public static int anInt5253;

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "[I")
	public static final int[] anIntArray292 = new int[200];

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
	public static int anInt5249 = 0;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIB)I")
	public static int method4784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static34.anIntArray30[arg1 & 0x3] : Static33.anIntArray27[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(B)[Lclient!raa;")
	public static Class305[] method4786() {
		return new Class305[] { Static49.aClass305_1, Static49.aClass305_2, Static174.aClass305_3 };
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "([Ljava/lang/String;I[S)V")
	public static void method4787(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static334.method5154(arg0, 0, arg1, arg0.length - 1);
	}
}
