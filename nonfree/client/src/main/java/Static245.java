import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "[Lclient!o;")
	public static Class80[] aClass80Array11;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
	public static int anInt4432 = 0;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
	public static int anInt4433 = 0;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
	public static int anInt4434 = 10;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
	public static int anInt4435 = -1;

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "[J")
	public static final long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!mb", name = "cb", descriptor = "Z")
	public static boolean aBoolean299 = false;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V")
	public static void method3579() {
		Static15.method240(Static361.aClass85_Sub1_1.aBoolean180);
		Static440.aClass10_Sub7_Sub4_3 = new Class10_Sub7_Sub4();
		Static440.aClass10_Sub7_Sub4_3.method4830();
		Static333.aClass130_2 = Static385.method5162(Static171.aClass159_1, Static412.aCanvas7, 22050, 0);
		Static333.aClass130_2.method3641(Static440.aClass10_Sub7_Sub4_3);
		Static2.method4(Static203.aClass187_72, Static440.aClass10_Sub7_Sub4_3, Static343.aClass187_105, Static131.aClass187_53);
		Static321.aClass130_1 = Static385.method5162(Static171.aClass159_1, Static412.aCanvas7, 2048, 1);
		Static461.aClass10_Sub7_Sub2_5 = new Class10_Sub7_Sub2();
		Static321.aClass130_1.method3641(Static461.aClass10_Sub7_Sub2_5);
		Static267.aClass172_1 = new Class172(22050, Static438.anInt7333);
		Static190.anInt3834 = Static43.aClass187_11.method4278("scape main");
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)I")
	public static int method3580(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)I")
	public static int method3581(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "(I)V")
	public static void method3582() {
		@Pc(8) Class10_Sub1_Sub17 local8 = Static154.method2630(15, 0);
		local8.method5346();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZIIIZ)V")
	public static void method3583(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static214.method3287(arg0, 0, arg2, arg3, arg1, Static264.aClass56_Sub1Array1.length - 1);
		Static417.anInt6984 = 0;
		Static46.aClass10_Sub28_1 = null;
	}
}
