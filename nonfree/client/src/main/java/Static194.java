import java.awt.Component;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!v", name = "e", descriptor = "Lclient!qe;")
	public static Class82 aClass82_6;

	@OriginalMember(owner = "client!v", name = "n", descriptor = "Lclient!vc;")
	public static Class98 aClass98_17;

	@OriginalMember(owner = "client!v", name = "s", descriptor = "Lclient!ve;")
	public static Class69 aClass69_37;

	@OriginalMember(owner = "client!v", name = "g", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1246 = Static81.method1507("<)4col> x");

	@OriginalMember(owner = "client!v", name = "h", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1247 = Static81.method1507("hint_mapedge");

	@OriginalMember(owner = "client!v", name = "l", descriptor = "[I")
	public static final int[] anIntArray379 = new int[] { -1, 0, -2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 5, 0, 0, 7, 24, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 2, -1, 6, 0, 0, 0, 0, 0, -2, 1, 3, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 8, -2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 0, 0, 6, 0, 0, 0, 7, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 5, 0, -2, 0, 12, 0, 4, 0, 6, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 2, 0, 3, -2, 0, 3, 0, 0, 0, 2, 0, 0, 5, 0, 0, 3, 0, 4, 0, -1, 0, 0, -2, 0, 0, 0, 0, 14, 0, 0, -1, 0, 5, 0, -1, 0, 0, 0, 0, 0, 0, -1, 6, 0, 0, -2, 0, 0, 0, 0, 3, 4, 0, 0, 0, 7, 6, 5, 0, 9, 4, -1, 0, 0, 0, -2, 6, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, -1, 0, 0, -2, 0, 1, 6, 0, 0, 6, 0, -1, 1, -1, 0, 0, 0, 0, -2, 0, 0, 5, 6, 6, 0, 8, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 15, 10, 2, -2, -1, 20, 0, 0, 0, 10, 0, 0, 0 };

	@OriginalMember(owner = "client!v", name = "p", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1248 = Static81.method1507("null");

	@OriginalMember(owner = "client!v", name = "t", descriptor = "I")
	public static int anInt4323 = 0;

	@OriginalMember(owner = "client!v", name = "u", descriptor = "[Lclient!jh;")
	public static final Class51[] aClass51Array3 = new Class51[100];

	@OriginalMember(owner = "client!v", name = "x", descriptor = "I")
	public static int anInt4325 = 127;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIZ)I")
	public static int method3309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local3 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return arg0 * local3;
		} else {
			return local3;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)V")
	public static void method3310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static39.method731(Static98.anIntArrayArray16[arg2], arg0 - arg3, arg3 + arg0, arg1);
		@Pc(16) int local16 = 0;
		@Pc(22) int local22 = arg3;
		@Pc(25) int local25 = -arg3;
		@Pc(27) int local27 = -1;
		while (local22 > local16) {
			local16++;
			local27 += 2;
			local25 += local27;
			if (local25 >= 0) {
				local22--;
				local25 -= local22 << 1;
				@Pc(54) int[] local54 = Static98.anIntArrayArray16[arg2 + local22];
				@Pc(61) int[] local61 = Static98.anIntArrayArray16[arg2 - local22];
				@Pc(66) int local66 = arg0 - local16;
				@Pc(71) int local71 = arg0 + local16;
				Static39.method731(local54, local66, local71, arg1);
				Static39.method731(local61, local66, local71, arg1);
			}
			@Pc(87) int local87 = arg0 + local22;
			@Pc(92) int local92 = arg0 - local22;
			@Pc(98) int[] local98 = Static98.anIntArrayArray16[local16 + arg2];
			@Pc(105) int[] local105 = Static98.anIntArrayArray16[arg2 - local16];
			Static39.method731(local98, local92, local87, arg1);
			Static39.method731(local105, local92, local87, arg1);
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
	public static void method3312() {
		Static103.anInt2308 = 0;
		Static156.anInt3437 = 0;
		Static150.anInt3361 = 0;
		Static80.anInt1916 = 0;
		Static8.anInt202 = -1;
		Static174.anInt3879 = 0;
		Static192.anInt4303 = 0;
		Static143.anInt3204 = -1;
		Static39.anInt1027 = -1;
		Static53.aBoolean73 = false;
		Static178.anInt3968 = -1;
		Static176.aClass1_Sub7_Sub1_34.anInt3592 = 0;
		Static192.aClass1_Sub7_Sub1_31.anInt3592 = 0;
		for (@Pc(40) int local40 = 0; local40 < Static110.aClass5_Sub2_Sub1Array1.length; local40++) {
			if (Static110.aClass5_Sub2_Sub1Array1[local40] != null) {
				Static110.aClass5_Sub2_Sub1Array1[local40].anInt2500 = -1;
			}
		}
		for (@Pc(58) int local58 = 0; local58 < Static148.aClass5_Sub2_Sub2Array1.length; local58++) {
			if (Static148.aClass5_Sub2_Sub2Array1[local58] != null) {
				Static148.aClass5_Sub2_Sub2Array1[local58].anInt2500 = -1;
			}
		}
		Static10.method1183();
		Static57.method1099(30);
		for (@Pc(81) int local81 = 0; local81 < 100; local81++) {
			Static62.aBooleanArray7[local81] = true;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public static void method3313(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static107.aClass73_1);
		arg0.removeMouseMotionListener(Static107.aClass73_1);
		arg0.removeFocusListener(Static107.aClass73_1);
		Static42.anInt1102 = 0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/Object;ILclient!vi;)V")
	public static void method3314(@OriginalArg(0) Object arg0, @OriginalArg(2) Class99 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static75.method3577(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
