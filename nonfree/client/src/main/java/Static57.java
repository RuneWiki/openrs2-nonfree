import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
	public static int anInt628;

	@OriginalMember(owner = "client!ek", name = "J", descriptor = "Lclient!uf;")
	public static Class23 aClass23_2;

	@OriginalMember(owner = "client!ek", name = "T", descriptor = "I")
	private static int anInt659;

	@OriginalMember(owner = "client!ek", name = "U", descriptor = "I")
	private static int anInt660;

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "[Lclient!qe;")
	public static Class78[] aClass78Array6 = new Class78[500];

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "Lclient!qe;")
	private static Class78 aClass78_115 = Static199.method3560("Select a world");

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "Lclient!qe;")
	public static Class78 aClass78_116 = aClass78_115;

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray12 = new int[104][104];

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "Lclient!qe;")
	public static Class78 aClass78_117 = Static199.method3560("welle:");

	@OriginalMember(owner = "client!ek", name = "u", descriptor = "Lclient!qe;")
	public static Class78 aClass78_118 = Static199.method3560("p11_full");

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!mj;)Lclient!mj;")
	public static Class64 method454(@OriginalArg(1) Class64 arg0) {
		@Pc(6) Class64 local6 = Static36.method477(arg0);
		if (local6 == null) {
			local6 = arg0.aClass64_11;
		}
		return local6;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLclient!nh;Lclient!qe;)I")
	public static int method456(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) Class78 arg1) {
		@Pc(20) int local20 = arg0.anInt2703;
		arg0.method2140(arg1.anInt3831);
		arg0.anInt2703 += Static226.aClass52_1.method1732(0, arg0.aByteArray41, arg1.anInt3831, arg0.anInt2703, arg1.aByteArray48);
		return arg0.anInt2703 - local20;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg4 && arg2 == arg7 && arg8 == arg3 && arg5 == arg0) {
			Static153.method2746(arg0, arg1, arg6, arg7, arg3);
			return;
		}
		@Pc(30) int local30 = arg6;
		@Pc(32) int local32 = arg7;
		@Pc(36) int local36 = arg7 * 3;
		@Pc(40) int local40 = arg2 * 3;
		@Pc(44) int local44 = arg4 * 3;
		@Pc(48) int local48 = arg6 * 3;
		@Pc(52) int local52 = arg8 * 3;
		@Pc(56) int local56 = arg5 * 3;
		@Pc(66) int local66 = arg3 + local44 - arg6 - local52;
		@Pc(75) int local75 = local40 + arg0 - local56 - arg7;
		@Pc(84) int local84 = local48 + local52 - local44 - local44;
		@Pc(94) int local94 = local36 + local56 - local40 - local40;
		@Pc(99) int local99 = local44 - local48;
		@Pc(104) int local104 = local40 - local36;
		for (@Pc(106) int local106 = 128; local106 <= 4096; local106 += 128) {
			@Pc(113) int local113 = local106 * local106 >> 12;
			@Pc(117) int local117 = local113 * local84;
			@Pc(121) int local121 = local113 * local94;
			@Pc(127) int local127 = local106 * local113 >> 12;
			@Pc(131) int local131 = local127 * local66;
			@Pc(135) int local135 = local75 * local127;
			@Pc(139) int local139 = local99 * local106;
			@Pc(151) int local151 = arg6 + (local139 + local131 + local117 >> 12);
			@Pc(155) int local155 = local106 * local104;
			@Pc(166) int local166 = arg7 + (local155 + local121 + local135 >> 12);
			Static153.method2746(local166, arg1, local30, local32, local151);
			local30 = local151;
			local32 = local166;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V")
	public static void method463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static198.anIntArray724[arg0] = arg1;
		@Pc(19) Class2_Sub4 local19 = (Class2_Sub4) Static213.aClass103_11.method3659((long) arg0);
		if (local19 == null) {
			local19 = new Class2_Sub4(Static111.method1911() + 500L);
			Static213.aClass103_11.method3665((long) arg0, local19);
		} else {
			local19.aLong17 = Static111.method1911() + 500L;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
	public static int method467(@OriginalArg(1) KeyEvent arg0) {
		@Pc(13) int local13 = arg0.getKeyChar();
		if (local13 == 8364) {
			return 128;
		} else {
			if (local13 <= 0 || local13 >= 256) {
				local13 = -1;
			}
			return local13;
		}
	}
}
