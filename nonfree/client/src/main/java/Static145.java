import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray90;

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
	public static int anInt3441;

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "Lclient!gd;")
	public static Class32 aClass32_3;

	@OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
	public static int anInt3448;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
	public static final int anInt3433 = 4;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "[I")
	public static final int[] anIntArray395 = new int[anInt3433];

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1987 = Static118.method2249("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
	public static int anInt3438 = 0;

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "[[Lclient!q;")
	public static final Class73[][] aClass73ArrayArray1 = new Class73[anInt3433][500];

	@OriginalMember(owner = "client!ph", name = "E", descriptor = "Lclient!wh;")
	public static Class99 aClass99_11 = new Class99(32);

	@OriginalMember(owner = "client!ph", name = "G", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1988 = Static118.method2249("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!ph", name = "J", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1990 = Static118.method2249("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!ph", name = "I", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1989 = aClass65_1990;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZIIIIIIIII)V")
	public static void method2624(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg7 && arg1 == arg5 && arg6 == arg2 && arg4 == arg8) {
			Static97.method1848(arg7, arg0, arg1, arg4, arg2);
			return;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = arg7 * 3;
		@Pc(41) int local41 = arg1 * 3;
		@Pc(43) int local43 = arg7;
		@Pc(47) int local47 = arg3 * 3;
		@Pc(51) int local51 = arg5 * 3;
		@Pc(55) int local55 = arg6 * 3;
		@Pc(59) int local59 = arg8 * 3;
		@Pc(69) int local69 = local41 + local59 - local51 - local51;
		@Pc(80) int local80 = arg2 + local47 - arg7 - local55;
		@Pc(90) int local90 = local55 + local37 - local47 - local47;
		@Pc(94) int local94 = local51 - local41;
		@Pc(98) int local98 = local47 - local37;
		@Pc(108) int local108 = arg4 + local51 - local59 - arg1;
		for (@Pc(110) int local110 = 128; local110 <= 4096; local110 += 128) {
			@Pc(117) int local117 = local110 * local110 >> 12;
			@Pc(123) int local123 = local110 * local117 >> 12;
			@Pc(127) int local127 = local80 * local123;
			@Pc(131) int local131 = local108 * local123;
			@Pc(135) int local135 = local69 * local117;
			@Pc(139) int local139 = local117 * local90;
			@Pc(143) int local143 = local98 * local110;
			@Pc(147) int local147 = local110 * local94;
			@Pc(158) int local158 = arg7 + (local143 + local127 + local139 >> 12);
			@Pc(169) int local169 = (local147 + local131 + local135 >> 12) + arg1;
			Static97.method1848(local43, arg0, local33, local169, local158);
			local33 = local169;
			local43 = local158;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLclient!wd;)Z")
	public static boolean method2632(@OriginalArg(1) Class97 arg0) {
		if (arg0.anInt4314 == 205) {
			Static114.anInt2802 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(B)V")
	public static void method2635() {
		Static98.aClass87_45.method3061();
		Static139.aClass67_8.method2568();
		Static1.aClass87_75.method3061();
	}
}
