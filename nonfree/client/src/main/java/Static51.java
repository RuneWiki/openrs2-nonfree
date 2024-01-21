import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
	public static int anInt1328;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "Lclient!we;")
	public static Class62 aClass62_8;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "Lclient!te;")
	public static Class75 aClass75_39 = new Class75(30);

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "Lclient!na;")
	public static Class53 aClass53_621 = Static109.method1737(")3");

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
	public static int anInt1329 = 0;

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "[Lclient!t;")
	public static Class72[] aClass72Array1 = new Class72[50];

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "Lclient!na;")
	public static Class53 aClass53_622 = Static109.method1737(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
	public static final int anInt1330 = 3353893;

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "Lclient!na;")
	public static Class53 aClass53_623 = Static109.method1737("title_mute");

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "Lclient!na;")
	public static Class53 aClass53_624 = Static109.method1737("leuchten1:");

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "[I")
	public static int[] anIntArray163 = new int[2000];

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
	public static int anInt1331 = 0;

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
	public static int anInt1332 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B")
	public static byte[] method941(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg0;
			return arg1 ? Static21.method385(local18) : local18;
		} else if (arg0 instanceof Class15) {
			@Pc(32) Class15 local32 = (Class15) arg0;
			return local32.method1697();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public static void method942() {
		anIntArray163 = null;
		aClass62_8 = null;
		aClass72Array1 = null;
		aClass53_623 = null;
		aClass53_621 = null;
		aClass53_624 = null;
		aClass75_39 = null;
		aClass53_622 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)V")
	public static void method943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(11) int local11 = arg3; local11 <= arg3 + arg0; local11++) {
			for (@Pc(15) int local15 = arg1; local15 <= arg2 + arg1; local15++) {
				if (local15 >= 0 && local15 < 104 && local11 >= 0 && local11 < 104) {
					Static82.aByteArrayArrayArray6[0][local15][local11] = 127;
					if (arg1 == local15 && local15 > 0) {
						Static107.anIntArrayArrayArray7[0][local15][local11] = Static107.anIntArrayArrayArray7[0][local15 - 1][local11];
					}
					if (local15 == arg1 + arg2 && local15 < 103) {
						Static107.anIntArrayArrayArray7[0][local15][local11] = Static107.anIntArrayArrayArray7[0][local15 + 1][local11];
					}
					if (local11 == arg3 && local11 > 0) {
						Static107.anIntArrayArrayArray7[0][local15][local11] = Static107.anIntArrayArrayArray7[0][local15][local11 - 1];
					}
					if (local11 == arg3 + arg0 && local11 < 103) {
						Static107.anIntArrayArrayArray7[0][local15][local11] = Static107.anIntArrayArrayArray7[0][local15][local11 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)Z")
	public static boolean method944(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public static void method945() {
		Static56.anInt1493 = -1;
		Static37.anInt2211 = 0;
		Static52.anInt1342 = -1;
		Static115.aClass3_Sub7_Sub1_3.anInt964 = 0;
		Static120.anInt2807 = 0;
		Static5.anInt192 = 0;
		Static119.anInt444 = 0;
		Static62.aClass3_Sub7_Sub1_2.anInt964 = 0;
		anInt1329 = -1;
		Static36.anInt1122 = 0;
		Static66.anInt1681 = -1;
		Static68.anInt1730 = 0;
		Static94.aBoolean93 = false;
		for (@Pc(35) int local35 = 0; local35 < Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1.length; local35++) {
			if (Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local35] != null) {
				Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local35].anInt1417 = -1;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1.length; local53++) {
			if (Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local53] != null) {
				Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local53].anInt1417 = -1;
			}
		}
		Static30.method669();
		Static103.method1692(30);
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(IZ)V")
	public static void method946(@OriginalArg(1) boolean arg0) {
		if (Static4.aClass6_1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && Static4.aClass6_1.anEventQueue1.peekEvent() != null; local11++) {
			Static40.method822(1L);
		}
		if (arg0) {
			Static4.aClass6_1.anEventQueue1.postEvent(new ActionEvent(Static87.aCanvas1, 1001, "dummy"));
		}
	}
}
