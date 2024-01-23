import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Lclient!s;")
	public static Class88 aClass88_3;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_11;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "[S")
	public static short[] aShortArray22 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Lclient!kh;")
	public static Class60 aClass60_505 = Static200.method3116("k");

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "[I")
	public static int[] anIntArray184 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "Lclient!kh;")
	public static Class60 aClass60_506 = Static200.method3116("(U5");

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "Lclient!ff;")
	public static Class33 aClass33_3 = new Class33(4096);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZII)Lclient!kh;")
	public static Class60 method1154(@OriginalArg(2) int arg0) {
		return Static113.method1954(true, arg0);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ai;IB)Z")
	public static boolean method1157(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method3226(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static177.method2835(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)V")
	public static void method1159() {
		Static5.method82(false, Static88.anInt2058, Static83.anInt1958, Static112.anInt2563);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ai;Lclient!kh;Lclient!kh;B)[Lclient!r;")
	public static Class73[] method1160(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) Class60 arg2) {
		@Pc(15) int local15 = arg0.method3222(arg1);
		@Pc(21) int local21 = arg0.method3240(arg2, local15);
		return Static197.method3070(arg0, local21, local15);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!nc;I)Lclient!kj;")
	public static Class45_Sub2 method1163(@OriginalArg(0) Class1_Sub9 arg0) {
		return new Class45_Sub2(arg0.method932(), arg0.method932(), arg0.method932(), arg0.method932(), arg0.method932(), arg0.method932(), arg0.method932(), arg0.method932(), arg0.method920(), arg0.method895());
	}
}
