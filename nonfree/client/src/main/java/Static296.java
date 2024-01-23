import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
	public static int anInt5594;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
	public static int anInt5600;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public static int anInt5593 = 3353893;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
	public static int anInt5596 = 0;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
	public static int anInt5597 = 0;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Lclient!th;")
	public static Class169 aClass169_155 = new Class169(5);

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "[I")
	public static int[] anIntArray508 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "Z")
	public static boolean aBoolean417 = false;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIILclient!ei;II)Z")
	public static boolean method4397(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class43 arg2, @OriginalArg(5) int arg3) {
		@Pc(10) Class79 local10 = Static97.method1400(arg2.anInt1167);
		if (local10.anInt2177 == -1) {
			return true;
		}
		if (arg2.aBoolean86) {
			@Pc(29) int local29 = arg0 + arg2.anInt1175;
			arg0 = local29 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(40) Class103_Sub2 local40 = local10.method1788(arg2.aBoolean92, arg0);
		if (local40 == null) {
			return false;
		}
		@Pc(53) int local53 = arg2.anInt1185;
		@Pc(56) int local56 = arg2.anInt1153;
		if ((arg0 & 0x1) == 1) {
			local53 = arg2.anInt1153;
			local56 = arg2.anInt1185;
		}
		@Pc(72) int local72 = local40.anInt5860;
		@Pc(75) int local75 = local40.anInt5856;
		if (local10.aBoolean162) {
			local75 = local56 * 4;
			local72 = local53 * 4;
		}
		if (local10.anInt2173 == 0) {
			local40.method4601(arg1 * 4 + 48, 48 - -((-arg3 + 104 + -local56) * 4), local72, local75);
		} else {
			local40.method4607(arg1 * 4 + 48, (-local56 + -arg3 + 104) * 4 + 48, local72, local75, local10.anInt2173);
		}
		return true;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
	public static void method4398(@OriginalArg(0) int arg0) {
		Static280.anInt5336 = -1;
		Static72.anInt1374 = arg0;
		Static140.anInt2753 = -1;
		Static97.method1402();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BII)V")
	public static void method4399(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static46.method824(5, arg1);
		local8.method294();
		local8.anInt293 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	public static void method4401() {
		@Pc(12) int local12 = Static140.method2232();
		if (local12 == 0) {
			Static172.aByteArrayArrayArray2 = null;
			Static198.method3207(0);
		} else if (local12 == 1) {
			Static31.method539((byte) 0);
			Static198.method3207(512);
			if (Static94.aByteArrayArrayArray9 != null) {
				Static274.method4066();
			}
		} else {
			Static31.method539((byte) (Static168.anInt5864 - 4 & 0xFF));
			Static198.method3207(2);
		}
		Static301.anInt5695 = Static295.anInt5586;
	}
}
