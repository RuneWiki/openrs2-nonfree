import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static616 {

	@OriginalMember(owner = "client!uh", name = "K", descriptor = "Lclient!tea;")
	public static Class339 aClass339_1;

	@OriginalMember(owner = "client!uh", name = "I", descriptor = "[I")
	public static final int[] anIntArray639 = new int[4096];

	@OriginalMember(owner = "client!uh", name = "E", descriptor = "[I")
	public static int[] anIntArray640 = new int[1];

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public static void method8498(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (arg1.length() > 320 || !Static349.method5348()) {
			return;
		}
		Static525.aClass260_3.method6400();
		Static406.method6232();
		Static527.aString100 = arg1;
		Static366.aString75 = arg0;
		Static307.method4889(5);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!vo;IBI)V")
	public static void method8499(@OriginalArg(0) Class381 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static177.aClass381_3 = arg0;
		Static154.anInt3258 = arg2;
		Static388.anInt6713 = arg1;
	}
}
