import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!hf", name = "db", descriptor = "I")
	public static int anInt1083;

	@OriginalMember(owner = "client!hf", name = "ib", descriptor = "Lclient!g;")
	public static Class26 aClass26_8;

	@OriginalMember(owner = "client!hf", name = "yb", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!hf", name = "Jb", descriptor = "[Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1[] aClass2_Sub2_Sub1_Sub1Array5;

	@OriginalMember(owner = "client!hf", name = "dc", descriptor = "Lclient!cc;")
	public static Class2_Sub2_Sub1_Sub3 aClass2_Sub2_Sub1_Sub3_4;

	@OriginalMember(owner = "client!hf", name = "eb", descriptor = "Lclient!u;")
	public static Class74 aClass74_801 = Static72.method1077("k");

	@OriginalMember(owner = "client!hf", name = "ob", descriptor = "Lclient!u;")
	public static Class74 aClass74_802 = Static72.method1077("T");

	@OriginalMember(owner = "client!hf", name = "pb", descriptor = "I")
	public static int anInt1092 = 0;

	@OriginalMember(owner = "client!hf", name = "xb", descriptor = "Lclient!u;")
	public static Class74 aClass74_803 = Static72.method1077("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!hf", name = "Bb", descriptor = "I")
	public static int anInt1098 = 0;

	@OriginalMember(owner = "client!hf", name = "Fb", descriptor = "Lclient!u;")
	public static Class74 aClass74_804 = Static72.method1077("blinken2:");

	@OriginalMember(owner = "client!hf", name = "Lb", descriptor = "Lclient!u;")
	public static Class74 aClass74_805 = null;

	@OriginalMember(owner = "client!hf", name = "Mb", descriptor = "Lclient!ic;")
	public static Class2_Sub10 aClass2_Sub10_26 = new Class2_Sub10(8);

	@OriginalMember(owner = "client!hf", name = "Wb", descriptor = "Lclient!u;")
	public static Class74 aClass74_807 = Static72.method1077("::clientdrop");

	@OriginalMember(owner = "client!hf", name = "bc", descriptor = "Lclient!u;")
	public static Class74 aClass74_808 = Static72.method1077("An");

	@OriginalMember(owner = "client!hf", name = "cc", descriptor = "[I")
	public static int[] anIntArray133 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!hf", name = "fc", descriptor = "Lclient!u;")
	public static Class74 aClass74_809 = Static72.method1077(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V")
	public static void method765() {
		for (@Pc(3) int local3 = 0; local3 < Static29.anInt686; local3++) {
			@Pc(9) int local9 = Static40.anIntArray110[local3];
			@Pc(13) Class2_Sub2_Sub2_Sub1_Sub1 local13 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local9];
			if (local13 != null) {
				Static57.method953(local13, local13.aClass2_Sub2_Sub9_1.anInt1103);
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIILclient!ma;I)V")
	public static void method768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub2_Sub11 arg2, @OriginalArg(4) int arg3) {
		if (Static48.anInt1157 >= 50 || Static75.anInt1600 == 0 || (arg2.anIntArray187 == null || arg1 >= arg2.anIntArray187.length)) {
			return;
		}
		@Pc(28) int local28 = arg2.anIntArray187[arg1];
		if (local28 == 0) {
			return;
		}
		@Pc(40) int local40 = local28 >> 8;
		Static63.anIntArray173[Static48.anInt1157] = local40;
		@Pc(48) int local48 = local28 & 0xF;
		@Pc(54) int local54 = (arg3 - 64) / 128;
		@Pc(60) int local60 = local28 >> 4 & 0x7;
		Static20.anIntArray59[Static48.anInt1157] = local60;
		@Pc(70) int local70 = (arg0 - 64) / 128;
		Static32.anIntArray97[Static48.anInt1157] = 0;
		Static21.aClass36Array1[Static48.anInt1157] = null;
		Static1.anIntArray307[Static48.anInt1157] = local48 + (local54 << 16) + (local70 << 8);
		Static48.anInt1157++;
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(B)V")
	public static void method770() {
		aClass26_8 = null;
		aClass2_Sub2_Sub1_Sub3_4 = null;
		aClass74_808 = null;
		aClass74_803 = null;
		anIntArray133 = null;
		aClass2_Sub2_Sub1_Sub1Array5 = null;
		aClass74_807 = null;
		aClass74_801 = null;
		aClass74_809 = null;
		aClass74_805 = null;
		aClass2_Sub10_26 = null;
		aClass74_802 = null;
		aClass74_804 = null;
		aFrame1 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!g;ILclient!g;Lclient!g;)V")
	public static void method773(@OriginalArg(0) Class26 arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) Class26 arg2) {
		Static42.aClass26_7 = arg0;
		Static7.aClass26_30 = arg1;
		Static92.aClass26_24 = arg2;
		Static89.aClass2_Sub2_Sub17ArrayArray1 = new Class2_Sub2_Sub17[Static92.aClass26_24.method1367()][];
		Static99.aBooleanArray10 = new boolean[Static92.aClass26_24.method1367()];
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZLclient!g;BIIII)V")
	public static void method775(@OriginalArg(1) Class26 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static62.aClass26_12 = arg0;
		Static84.anInt1827 = arg1;
		Static77.aBoolean68 = false;
		Static9.anInt300 = 1;
		Static72.anInt1559 = 2;
		Static107.anInt2339 = arg2;
		Static121.anInt2594 = arg3;
	}
}
