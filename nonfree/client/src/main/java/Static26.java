import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
	public static int anInt629;

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "Lclient!km;")
	public static Class91 aClass91_28;

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
	public static int anInt632;

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
	public static int anInt628 = 0;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "Z")
	public static boolean aBoolean48 = false;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString38 = "Loaded input handler";

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "Z")
	public static volatile boolean aBoolean49 = false;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIB)I")
	public static int method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 - 1 & arg1 >> 31;
		return ((arg1 >>> 31) + arg1) % arg0 + local16;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[Lclient!tk;)V")
	public static void method528(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub32[] arg1) {
		Static299.aClass1_Sub32ArrayArray3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZII)V")
	public static void method530(@OriginalArg(1) boolean arg0) {
		Static166.aBoolean261 = arg0;
		Static19.anInt355 = 2;
		Static13.anInt256 = 22050;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(SI)Z")
	public static boolean method531(@OriginalArg(0) short arg0) {
		if (arg0 == 17 || arg0 == 24 || arg0 == 44 || arg0 == 25 || arg0 == 21 || arg0 == 28 || arg0 == 36 || arg0 == 4) {
			return true;
		} else if (arg0 == 13 || arg0 == 31 || arg0 == 1003 || arg0 == 1002) {
			return true;
		} else if (arg0 == 23 || arg0 == 1 || arg0 == 41 || arg0 == 33 || arg0 == 22) {
			return true;
		} else {
			return arg0 == 14 || arg0 == 46 || arg0 == 45 || arg0 == 29 || arg0 == 10 || arg0 == 50;
		}
	}
}
