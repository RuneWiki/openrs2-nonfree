import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "I")
	public static int anInt3877;

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "Lclient!lc;")
	public static Class79 aClass79_24 = new Class79(64);

	@OriginalMember(owner = "client!oa", name = "S", descriptor = "[I")
	public static int[] anIntArray291 = new int[100];

	@OriginalMember(owner = "client!oa", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString253 = "level: ";

	@OriginalMember(owner = "client!oa", name = "V", descriptor = "[I")
	public static int[] anIntArray292 = new int[5];

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	public static void method2871() {
		@Pc(8) int local8 = Static254.method4105();
		if (local8 == 0) {
			Static132.aByteArrayArrayArray10 = null;
			Static178.method3051(0);
		} else if (local8 == 1) {
			Static123.method885((byte) 0);
			Static178.method3051(512);
			Static79.method1581();
		} else {
			Static123.method885((byte) (Static82.anInt2220 - 4 & 0xFF));
			Static178.method3051(2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLclient!hc;)V")
	public static void method2872(@OriginalArg(1) Class51 arg0) {
		Static253.aClass51_56 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!hc;IB)Lclient!ag;")
	public static Class7 method2873(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1) {
		return Static181.method3124(arg0, arg1) ? Static229.method3836() : null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
	public static void method2875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub16 local7 = Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class85 local13 = local7.aClass85_1;
		if (local13 != null) {
			local13.anInt3479 = local13.anInt3479 * arg3 / 16;
			local13.anInt3487 = local13.anInt3487 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)V")
	public static void method2877() {
		if (Static252.aBoolean273) {
			return;
		}
		if (Static138.aBoolean180) {
			Static230.aFloat51 = (int) Static230.aFloat51 - 65 & 0xFFFFFF80;
		} else {
			Static161.aFloat34 += (-Static161.aFloat34 - 24.0F) / 2.0F;
		}
		Static252.aBoolean273 = true;
		Static89.aBoolean139 = true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)V")
	public static void method2878() {
		Static174.aClass79_27.method2479(5);
	}
}
