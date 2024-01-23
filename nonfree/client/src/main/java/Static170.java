import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
	public static int anInt3939;

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_29;

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
	public static int anInt3940;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "Lclient!qe;")
	public static Class78 aClass78_680 = Static199.method3560("::fps ");

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "Lclient!qe;")
	public static Class78 aClass78_681 = Static199.method3560("; version=1; path=)4; domain=");

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "Lclient!qe;")
	public static Class78 aClass78_682 = Static199.method3560("cookieprefix");

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "[Lclient!vj;")
	public static Class5_Sub7[] aClass5_Sub7Array1 = new Class5_Sub7[4];

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "Lclient!qe;")
	public static Class78 aClass78_683 = Static199.method3560("cross");

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "Lclient!qe;")
	public static Class78 aClass78_684 = Static199.method3560("Weiter");

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "[J")
	public static long[] aLongArray10 = new long[1000];

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
	public static int anInt3942 = -1;

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "Lclient!qe;")
	public static Class78 aClass78_685 = Static199.method3560("Spieler");

	@OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
	public static int anInt3943 = 0;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBIII)V")
	public static void method3112(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static223.anInt4831 = Static30.anInt547 * arg1 / arg3;
		Static4.anInt123 = -1;
		Static32.anInt4049 = Static151.anInt3457 * arg2 / arg0;
		Static22.anInt416 = -1;
		Static178.method3274();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!qf;III)V")
	public static void method3113(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class2_Sub12 local12;
		if (arg2 < Static173.anInt3981) {
			local12 = Static226.aClass2_Sub12ArrayArrayArray3[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass106_1 != null && local12.aClass106_1.aClass5_11.method3772()) {
				arg0.method3771(local12.aClass106_1.aClass5_11, 128, 0, 0, true);
			}
		}
		if (arg3 < Static173.anInt3981) {
			local12 = Static226.aClass2_Sub12ArrayArrayArray3[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass106_1 != null && local12.aClass106_1.aClass5_11.method3772()) {
				arg0.method3771(local12.aClass106_1.aClass5_11, 0, 0, 128, true);
			}
		}
		if (arg2 < Static173.anInt3981 && arg3 < Static159.anInt4174) {
			local12 = Static226.aClass2_Sub12ArrayArrayArray3[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass106_1 != null && local12.aClass106_1.aClass5_11.method3772()) {
				arg0.method3771(local12.aClass106_1.aClass5_11, 128, 0, 128, true);
			}
		}
		if (arg2 < Static173.anInt3981 && arg3 > 0) {
			local12 = Static226.aClass2_Sub12ArrayArrayArray3[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass106_1 != null && local12.aClass106_1.aClass5_11.method3772()) {
				arg0.method3771(local12.aClass106_1.aClass5_11, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)I")
	public static int method3114(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static111.method1911();
		for (@Pc(20) Class2_Sub4 local20 = arg0 ? (Class2_Sub4) Static213.aClass103_11.method3668() : (Class2_Sub4) Static213.aClass103_11.method3666(); local20 != null; local20 = (Class2_Sub4) Static213.aClass103_11.method3666()) {
			if ((local20.aLong17 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local20.aLong17 & 0x4000000000000000L) != 0L) {
					@Pc(42) int local42 = (int) local20.aLong188;
					Static198.anIntArray724[local42] = Static94.anIntArray369[local42];
					local20.method3986();
					return local42;
				}
				local20.method3986();
			}
		}
		return -1;
	}
}
