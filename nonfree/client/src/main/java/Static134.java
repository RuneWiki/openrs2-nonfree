import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "Lclient!km;")
	public static Class91 aClass91_107;

	@OriginalMember(owner = "client!kb", name = "U", descriptor = "F")
	public static float aFloat23;

	@OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
	public static int anInt2950;

	@OriginalMember(owner = "client!kb", name = "db", descriptor = "Lclient!rk;")
	public static Class1_Sub2_Sub1 aClass1_Sub2_Sub1_3;

	@OriginalMember(owner = "client!kb", name = "fb", descriptor = "Lclient!km;")
	public static Class91 aClass91_110;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "Z")
	public static boolean aBoolean218 = false;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString170 = " has logged out.";

	@OriginalMember(owner = "client!kb", name = "O", descriptor = "Lclient!hi;")
	public static Class61 aClass61_17 = new Class61();

	@OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
	public static int anInt2945 = 0;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V")
	public static void method2277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static131.method2228(false);
		Static154.anInt3334 = arg2;
		Static219.anInt4354 = arg1;
		Static195.method3214(arg0);
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public static void method2282() {
		Static219.anIntArrayArrayArray10 = null;
		Static152.anIntArray297 = null;
		Static67.anIntArray140 = null;
		Static85.aByteArrayArrayArray13 = null;
		Static29.anIntArray75 = null;
		Static24.anIntArray412 = null;
		Static58.aByteArrayArrayArray10 = null;
		Static84.anIntArray174 = null;
		Static49.anIntArray106 = null;
		Static2.aByteArrayArrayArray3 = null;
		Static238.aByteArrayArrayArray21 = null;
		Static5.aByteArrayArrayArray4 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILclient!wj;II)Z")
	public static boolean method2285(@OriginalArg(1) int arg0, @OriginalArg(4) Class181 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(10) Class4 local10 = Static117.method2105(arg1.anInt5539);
		if (local10.anInt119 == -1) {
			return true;
		}
		if (arg1.aBoolean442) {
			@Pc(24) int local24 = arg2 + arg1.anInt5548;
			arg2 = local24 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(39) Class12_Sub2 local39 = local10.method144(arg1.aBoolean434, arg2);
		if (local39 == null) {
			return false;
		}
		@Pc(48) int local48 = arg1.anInt5559;
		@Pc(51) int local51 = arg1.anInt5534;
		if ((arg2 & 0x1) == 1) {
			local48 = arg1.anInt5534;
			local51 = arg1.anInt5559;
		}
		@Pc(66) int local66 = local39.anInt5021;
		@Pc(69) int local69 = local39.anInt5020;
		if (local10.aBoolean7) {
			local66 = local48 * 4;
			local69 = local51 * 4;
		}
		if (local10.anInt116 == 0) {
			local39.method3938(arg3 * 4 + 48, (-local51 + -arg0 + 104) * 4 + 48, local66, local69);
		} else {
			local39.method3930(arg3 * 4 + 48, (104 - (arg0 - -local51)) * 4 + 48, local66, local69, local10.anInt116);
		}
		return true;
	}
}
