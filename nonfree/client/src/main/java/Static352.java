import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static352 {

	@OriginalMember(owner = "client!mha", name = "f", descriptor = "I")
	public static int anInt6299;

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "[I")
	public static int[] anIntArray488 = new int[2];

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method5589(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(IB)I")
	public static int method5590(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!mha", name = "b", descriptor = "(IB)V")
	public static void method5591() {
		Static243.aClass293_29.method6922(50);
		Static436.aClass293_49.method6922(50);
		Static593.aClass293_66.method6922(50);
		Static476.aClass293_56.method6922(50);
	}
}
