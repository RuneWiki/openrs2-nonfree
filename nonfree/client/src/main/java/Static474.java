import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static474 {

	@OriginalMember(owner = "client!oo", name = "t", descriptor = "I")
	public static int anInt7460 = -2;

	@OriginalMember(owner = "client!oo", name = "G", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_117 = new Class397(1, 1);

	@OriginalMember(owner = "client!oo", name = "u", descriptor = "I")
	public static int anInt7473 = -1;

	@OriginalMember(owner = "client!oo", name = "K", descriptor = "Z")
	public static boolean aBoolean505 = false;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!ik;Lclient!ik;Lclient!ik;Lclient!ik;I)V")
	public static void method6450(@OriginalArg(0) Class182 arg0, @OriginalArg(1) Class182 arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) Class182 arg3) {
		Static567.aClass182_109 = arg3;
		Static364.aClass182_78 = arg1;
		Static276.aClass182_72 = arg0;
		Static172.aClass270ArrayArray2 = new Class270[Static567.aClass182_109.method3956()][];
		Static478.aBooleanArray12 = new boolean[Static567.aClass182_109.method3956()];
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZI)Z")
	public static boolean method6454(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}
}
