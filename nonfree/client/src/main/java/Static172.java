import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!vb", name = "gb", descriptor = "Lclient!jc;")
	public static Class40 aClass40_38;

	@OriginalMember(owner = "client!vb", name = "pb", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!vb", name = "ub", descriptor = "Lclient!je;")
	public static Class41 aClass41_8;

	@OriginalMember(owner = "client!vb", name = "ib", descriptor = "I")
	public static int anInt3842 = 0;

	@OriginalMember(owner = "client!vb", name = "jb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_2275 = Static107.method1838("Location");

	@OriginalMember(owner = "client!vb", name = "kb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2276 = Static107.method1838("gleiten:");

	@OriginalMember(owner = "client!vb", name = "lb", descriptor = "[[I")
	public static int[][] anIntArrayArray36 = new int[104][104];

	@OriginalMember(owner = "client!vb", name = "mb", descriptor = "I")
	public static int anInt3843 = 0;

	@OriginalMember(owner = "client!vb", name = "nb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2277 = Static107.method1838("headicons_hint");

	@OriginalMember(owner = "client!vb", name = "ob", descriptor = "[I")
	public static int[] anIntArray360 = new int[128];

	@OriginalMember(owner = "client!vb", name = "tb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_2280 = Static107.method1838("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!vb", name = "qb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2278 = aClass28_2280;

	@OriginalMember(owner = "client!vb", name = "rb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2279 = aClass28_2275;

	@OriginalMember(owner = "client!vb", name = "wb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2281 = Static107.method1838("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)V")
	public static void method2690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class2_Sub14 local7 = Static133.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class49 local13 = local7.aClass49_1;
		if (local13 != null) {
			local13.anInt2505 = local13.anInt2505 * arg3 / 16;
			local13.anInt2508 = local13.anInt2508 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(BI)V")
	public static void method2691(@OriginalArg(1) int arg0) {
		if (Static131.method2109(arg0)) {
			Static56.method1028(-1, Static23.aClass24ArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V")
	public static void method2692() {
		aClass28_2276 = null;
		aClass28_2279 = null;
		aClass28_2278 = null;
		aFont1 = null;
		aClass40_38 = null;
		aClass28_2277 = null;
		anIntArray360 = null;
		aClass41_8 = null;
		aClass28_2280 = null;
		anIntArrayArray36 = null;
		aClass28_2281 = null;
		aClass28_2275 = null;
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(B)V")
	public static void method2693() {
		for (@Pc(3) int local3 = 0; local3 < Static145.anInt3283; local3++) {
			@Pc(9) int local9 = Static10.anIntArray38[local3]--;
			if (Static10.anIntArray38[local3] >= -10) {
				@Pc(82) Class38 local82 = Static115.aClass38Array1[local3];
				if (local82 == null) {
					local82 = Static183.method1411(Static99.aClass40_Sub1_73, Static44.anIntArray103[local3], 0);
					if (local82 == null) {
						continue;
					}
					Static10.anIntArray38[local3] += local82.method1408();
					Static115.aClass38Array1[local3] = local82;
				}
				if (Static10.anIntArray38[local3] < 0) {
					@Pc(119) int local119;
					if (Static124.anIntArray269[local3] == 0) {
						local119 = Static58.anInt1512;
					} else {
						@Pc(129) int local129 = Static124.anIntArray269[local3] >> 16 & 0xFF;
						@Pc(137) int local137 = (Static124.anIntArray269[local3] & 0xFF) * 128;
						@Pc(146) int local146 = local129 * 128 + 64 - Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633;
						if (local146 < 0) {
							local146 = -local146;
						}
						@Pc(162) int local162 = Static124.anIntArray269[local3] >> 8 & 0xFF;
						@Pc(172) int local172 = local162 * 128 + 64 - Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635;
						if (local172 < 0) {
							local172 = -local172;
						}
						@Pc(184) int local184 = local146 + local172 - 128;
						if (local184 > local137) {
							Static10.anIntArray38[local3] = -100;
							continue;
						}
						if (local184 < 0) {
							local184 = 0;
						}
						local119 = Static101.anInt443 * (local137 - local184) / local137;
					}
					if (local119 > 0) {
						@Pc(215) Class2_Sub18_Sub1 local215 = local82.method1409().method1871(Static178.aClass61_1);
						@Pc(220) Class2_Sub8_Sub2 local220 = Static182.method848(local215, local119);
						local220.method819(Static21.anIntArray51[local3] - 1);
						Static113.aClass2_Sub8_Sub3_1.method1741(local220);
					}
					Static10.anIntArray38[local3] = -100;
				}
			} else {
				Static145.anInt3283--;
				for (@Pc(25) int local25 = local3; local25 < Static145.anInt3283; local25++) {
					Static44.anIntArray103[local25] = Static44.anIntArray103[local25 + 1];
					Static115.aClass38Array1[local25] = Static115.aClass38Array1[local25 + 1];
					Static21.anIntArray51[local25] = Static21.anIntArray51[local25 + 1];
					Static10.anIntArray38[local25] = Static10.anIntArray38[local25 + 1];
					Static124.anIntArray269[local25] = Static124.anIntArray269[local25 + 1];
				}
				local3--;
			}
		}
		if (Static148.aBoolean151 && !Static76.method1380()) {
			if (Static84.anInt2125 != 0 && Static6.anInt373 != -1) {
				Static59.method1060(0, Static10.aClass40_Sub1_18, Static6.anInt373, Static84.anInt2125);
			}
			Static148.aBoolean151 = false;
		} else if (Static84.anInt2125 != 0 && Static6.anInt373 != -1 && !Static76.method1380()) {
			Static128.aClass2_Sub2_Sub1_2.method1711(188);
			Static128.aClass2_Sub2_Sub1_2.method1710(Static6.anInt373);
			Static6.anInt373 = -1;
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(BI)V")
	public static void method2694(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static14.aBooleanArray8[arg0]) {
			return;
		}
		Static84.aClass40_22.method1788(arg0);
		if (Static23.aClass24ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static23.aClass24ArrayArray1[arg0].length; local28++) {
			if (Static23.aClass24ArrayArray1[arg0][local28] != null) {
				if (Static23.aClass24ArrayArray1[arg0][local28].anInt1425 == 2) {
					local26 = false;
				} else {
					Static23.aClass24ArrayArray1[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static23.aClass24ArrayArray1[arg0] = null;
		}
		Static14.aBooleanArray8[arg0] = false;
	}
}
