import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!qt", name = "g", descriptor = "I")
	public static int anInt8192;

	@OriginalMember(owner = "client!qt", name = "i", descriptor = "F")
	public static float aFloat211;

	@OriginalMember(owner = "client!qt", name = "l", descriptor = "J")
	public static long aLong214;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "Z")
	public static boolean aBoolean569 = false;

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "Lclient!er;")
	public static Class92 aClass92_4 = null;

	@OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
	public static int anInt8197 = 0;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)V")
	public static void method6795() {
		Static377.aClass223_50.method5399(50);
		Static241.aClass223_32.method5399(50);
		Static63.aClass223_12.method5399(50);
		Static76.aClass223_13.method5399(50);
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(IB)V")
	public static void method6797(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub5_Sub16 local12 = Static219.method3587(arg0, 1);
		local12.method7134();
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!ub;III)V")
	public static void method6800(@OriginalArg(0) Class1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class53 local12;
		if (arg2 < Static182.anInt3633) {
			local12 = Static60.aClass53ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass1_Sub4_Sub4_1 != null && local12.aClass1_Sub4_Sub4_1.method8114()) {
				arg0.method8127(0, 0, true, Static468.aClass44_7, local12.aClass1_Sub4_Sub4_1, Static279.anInt5708);
			}
		}
		if (arg3 < Static182.anInt3633) {
			local12 = Static60.aClass53ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass1_Sub4_Sub4_1 != null && local12.aClass1_Sub4_Sub4_1.method8114()) {
				arg0.method8127(Static279.anInt5708, 0, true, Static468.aClass44_7, local12.aClass1_Sub4_Sub4_1, 0);
			}
		}
		if (arg2 < Static182.anInt3633 && arg3 < Static253.anInt4651) {
			local12 = Static60.aClass53ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass1_Sub4_Sub4_1 != null && local12.aClass1_Sub4_Sub4_1.method8114()) {
				arg0.method8127(Static279.anInt5708, 0, true, Static468.aClass44_7, local12.aClass1_Sub4_Sub4_1, Static279.anInt5708);
			}
		}
		if (arg2 < Static182.anInt3633 && arg3 > 0) {
			local12 = Static60.aClass53ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass1_Sub4_Sub4_1 != null && local12.aClass1_Sub4_Sub4_1.method8114()) {
				arg0.method8127(-Static279.anInt5708, 0, true, Static468.aClass44_7, local12.aClass1_Sub4_Sub4_1, Static279.anInt5708);
			}
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IBI)Z")
	public static boolean method6801(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(BI)Lclient!ad;")
	public static Class7 method6802() {
		return new Class7(1, false);
	}
}
