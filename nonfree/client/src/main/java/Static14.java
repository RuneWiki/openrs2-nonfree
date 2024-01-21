import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!be", name = "T", descriptor = "[I")
	public static int[] anIntArray18 = new int[500];

	@OriginalMember(owner = "client!be", name = "ab", descriptor = "Lclient!sd;")
	private static Class73 aClass73_216 = Static122.method531("Loading)3)3)3");

	@OriginalMember(owner = "client!be", name = "W", descriptor = "Lclient!sd;")
	public static Class73 aClass73_215 = aClass73_216;

	@OriginalMember(owner = "client!be", name = "cb", descriptor = "Lclient!vd;")
	public static Class83 aClass83_4 = null;

	@OriginalMember(owner = "client!be", name = "hb", descriptor = "I")
	public static int anInt354 = 0;

	@OriginalMember(owner = "client!be", name = "ib", descriptor = "Lclient!sd;")
	public static Class73 aClass73_217 = Static122.method531("event_opbase");

	@OriginalMember(owner = "client!be", name = "jb", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(B)V")
	public static void method230() {
		aClass83_4 = null;
		anIntArray18 = null;
		aClass73_216 = null;
		aClass73_217 = null;
		aClass73_215 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method231(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static117.aClass64_1);
		arg0.addMouseMotionListener(Static117.aClass64_1);
		arg0.addFocusListener(Static117.aClass64_1);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!sd;I)V")
	public static void method232(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1) {
		Static139.aClass3_Sub12_Sub1_3.method1400(192);
		Static139.aClass3_Sub12_Sub1_3.method1367(arg1.method2425());
		Static139.aClass3_Sub12_Sub1_3.method1340(arg0);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!eh;I)V")
	public static void method233(@OriginalArg(0) Class3_Sub10 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.anInt1002 == 0) {
			local5 = Static119.aClass35_1.method1149(arg0.anInt995, arg0.anInt998, arg0.anInt996);
		}
		@Pc(22) int local22 = -1;
		if (arg0.anInt1002 == 1) {
			local5 = Static119.aClass35_1.method1176(arg0.anInt995, arg0.anInt998, arg0.anInt996);
		}
		if (arg0.anInt1002 == 2) {
			local5 = Static119.aClass35_1.method1174(arg0.anInt995, arg0.anInt998, arg0.anInt996);
		}
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		if (arg0.anInt1002 == 3) {
			local5 = Static119.aClass35_1.method1154(arg0.anInt995, arg0.anInt998, arg0.anInt996);
		}
		if (local5 != 0) {
			local22 = local5 >> 14 & 0x7FFF;
			@Pc(96) int local96 = Static119.aClass35_1.method1130(arg0.anInt995, arg0.anInt998, arg0.anInt996, local5);
			local60 = local96 >> 6 & 0x3;
			local58 = local96 & 0x1F;
		}
		arg0.anInt993 = local22;
		arg0.anInt1000 = local60;
		arg0.anInt1003 = local58;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)V")
	public static void method234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 128 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
			Static46.anInt1059 = -1;
			Static26.anInt720 = -1;
			return;
		}
		@Pc(31) int local31 = Static107.method1922(arg2, arg0, Static147.anInt3309) - arg1;
		@Pc(35) int local35 = arg0 - Static19.anInt513;
		@Pc(39) int local39 = arg2 - Static34.anInt834;
		@Pc(43) int local43 = local31 - Static55.anInt1291;
		@Pc(47) int local47 = Class3_Sub1_Sub3_Sub2.anIntArray87[Static130.anInt2973];
		@Pc(51) int local51 = Class3_Sub1_Sub3_Sub2.anIntArray87[Static141.anInt3252];
		@Pc(55) int local55 = Class3_Sub1_Sub3_Sub2.anIntArray88[Static141.anInt3252];
		@Pc(59) int local59 = Class3_Sub1_Sub3_Sub2.anIntArray88[Static130.anInt2973];
		@Pc(69) int local69 = local39 * local55 + local51 * local35 >> 16;
		@Pc(79) int local79 = local35 * local55 - local51 * local39 >> 16;
		@Pc(81) int local81 = local69;
		@Pc(92) int local92 = local43 * local59 - local47 * local79 >> 16;
		@Pc(108) int local108 = local59 * local79 + local47 * local43 >> 16;
		if (local108 >= 50) {
			Static26.anInt720 = (local92 << 9) / local108 + 167;
			Static46.anInt1059 = (local81 << 9) / local108 + 256;
		} else {
			Static26.anInt720 = -1;
			Static46.anInt1059 = -1;
		}
	}
}
