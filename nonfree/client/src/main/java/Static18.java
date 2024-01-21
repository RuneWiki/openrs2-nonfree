import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "[I")
	public static int[] anIntArray53;

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
	public static int anInt683 = 0;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "Lclient!v;")
	public static Class62 aClass62_279 = Static45.method753(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
	public static int anInt686 = 0;

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "Lclient!v;")
	public static Class62 aClass62_280 = Static45.method753("Benutzeroberfl\u001c1che geladen)3");

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "[Lclient!v;")
	public static Class62[] aClass62Array6 = new Class62[500];

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "Lclient!v;")
	private static Class62 aClass62_281 = Static45.method753("white:");

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!v;")
	public static Class62 aClass62_282 = aClass62_281;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Lclient!v;")
	public static Class62 aClass62_283 = Static45.method753("Gegenstand f\u001c1r Mitglieder");

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "Lclient!v;")
	private static Class62 aClass62_284 = Static45.method753("Trade)4compete");

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "Lclient!v;")
	public static Class62 aClass62_285 = aClass62_284;

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "Lclient!v;")
	public static Class62 aClass62_286 = Static45.method753(")1");

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "Lclient!v;")
	public static Class62 aClass62_287 = Static45.method753("backhmid2");

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III[Lclient!cc;[BLclient!a;)V")
	public static void method463(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) Class1 arg4) {
		@Pc(6) Class3_Sub8 local6 = new Class3_Sub8(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(18) int local18 = local6.method1769();
			if (local18 == 0) {
				return;
			}
			@Pc(25) int local25 = 0;
			local12 += local18;
			while (true) {
				@Pc(33) int local33 = local6.method1769();
				if (local33 == 0) {
					break;
				}
				local25 += local33 - 1;
				@Pc(47) int local47 = local25 >> 6 & 0x3F;
				@Pc(51) int local51 = local25 >> 12;
				@Pc(55) int local55 = local25 & 0x3F;
				@Pc(59) int local59 = local6.method1803();
				@Pc(63) int local63 = local59 & 0x3;
				@Pc(67) int local67 = arg0 + local55;
				@Pc(71) int local71 = local47 + arg1;
				@Pc(75) int local75 = local59 >> 2;
				if (local71 > 0 && local67 > 0 && local71 < 103 && local67 < 103) {
					@Pc(94) Class11 local94 = null;
					@Pc(96) int local96 = local51;
					if ((Static44.aByteArrayArrayArray6[1][local71][local67] & 0x2) == 2) {
						local96 = local51 - 1;
					}
					if (local96 >= 0) {
						local94 = arg2[local96];
					}
					Static29.method580(local63, local67, local51, local94, local12, local71, arg4, local75);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method464() {
		aClass62_280 = null;
		aClass62_279 = null;
		aFont1 = null;
		aClass62_283 = null;
		aClass62_287 = null;
		anIntArray53 = null;
		aClass62_286 = null;
		aClass62_281 = null;
		aClass62Array6 = null;
		aClass62_284 = null;
		aClass62_285 = null;
		aClass62_282 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)I")
	public static int method466() {
		return 5;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)V")
	public static void method467(@OriginalArg(0) boolean arg0) {
		for (@Pc(13) int local13 = 0; local13 < Static39.anInt1159; local13++) {
			@Pc(21) Class3_Sub1_Sub3_Sub1_Sub2 local21 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[Static16.anIntArray52[local13]];
			@Pc(29) int local29 = (Static16.anIntArray52[local13] << 14) + 536870912;
			if (local21 != null && local21.method1153() && arg0 == local21.aClass3_Sub1_Sub4_1.aBoolean34 && local21.aClass3_Sub1_Sub4_1.method438()) {
				@Pc(54) int local54 = local21.anInt1882 >> 7;
				@Pc(59) int local59 = local21.anInt1887 >> 7;
				if (local54 >= 0 && local54 < 104 && local59 >= 0 && local59 < 104) {
					if (local21.anInt1861 == 1 && (local21.anInt1882 & 0x7F) == 64 && (local21.anInt1887 & 0x7F) == 64) {
						if (Static71.anInt1937 == Static63.anIntArrayArray24[local54][local59]) {
							continue;
						}
						Static63.anIntArrayArray24[local54][local59] = Static71.anInt1937;
					}
					if (!local21.aClass3_Sub1_Sub4_1.aBoolean33) {
						local29 += Integer.MIN_VALUE;
					}
					Static76.aClass1_1.method39(Static27.anInt818, local21.anInt1882, local21.anInt1887, Static91.method1541(local21.anInt1861 * 64 + local21.anInt1882 - 64, (local21.anInt1861 + -1) * 64 + local21.anInt1887, Static27.anInt818), (local21.anInt1861 - 1) * 64 + 60, local21, local21.anInt1849, local29, local21.aBoolean109);
				}
			}
		}
	}
}
