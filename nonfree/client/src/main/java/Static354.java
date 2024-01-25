import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!wn", name = "ub", descriptor = "I")
	public static int anInt6740;

	@OriginalMember(owner = "client!wn", name = "xb", descriptor = "Lclient!tj;")
	public static Class193 aClass193_111;

	@OriginalMember(owner = "client!wn", name = "Ab", descriptor = "[Lclient!vj;")
	public static Class58[] aClass58Array137;

	@OriginalMember(owner = "client!wn", name = "cb", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_364 = new Class159("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!wn", name = "vb", descriptor = "[I")
	public static final int[] anIntArray510 = new int[1024];

	@OriginalMember(owner = "client!wn", name = "wb", descriptor = "I")
	public static int anInt6741 = 0;

	@OriginalMember(owner = "client!wn", name = "yb", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_365 = new Class159("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!wn", name = "Bb", descriptor = "[I")
	public static final int[] anIntArray511 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!wn", name = "Cb", descriptor = "I")
	public static int anInt6742 = -1;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
	public static void method5630() {
		Static77.aClass198_66.method5213();
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)Lclient!p;")
	public static Class8_Sub4 method5631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class128 local7 = Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass8_Sub4_1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZZ)V")
	public static void method5632(@OriginalArg(0) boolean arg0) {
		if (Static166.aBoolean288 != arg0) {
			Static166.aBoolean288 = arg0;
			Static261.method4550();
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B[B)Z")
	public static boolean method5633(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class4_Sub11 local13 = new Class4_Sub11(arg0);
		@Pc(17) int local17 = local13.method3440();
		if (local17 != 1) {
			return false;
		}
		@Pc(33) boolean local33 = local13.method3440() == 1;
		if (local33) {
			Static4.method4657(local13);
		}
		Static38.method752(local13);
		return true;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILclient!tj;Lclient!tj;)V")
	public static void method5637(@OriginalArg(1) Class193 arg0, @OriginalArg(2) Class193 arg1) {
		Static282.aClass193_82 = arg0;
		Static155.aClass193_57 = arg1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BI)I")
	public static int method5639(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0xD5555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local13 & 0x33333333) + ((local13 & 0xCCCCCCCF) >>> 2);
		@Pc(31) int local31 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(48) int local48 = local37 + (local37 >>> 16);
		return local48 & 0xFF;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZI)V")
	public static void method5641(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static54.aClass4_Sub4_Sub11_3 != null) {
			Static186.anInt3918 = Static54.aClass4_Sub4_Sub11_3.anInt4353;
		} else {
			Static186.anInt3918 = -1;
		}
		Static72.anInt1882 = 0;
		Static173.aClass21_8 = null;
		Static54.aClass4_Sub4_Sub11_3 = null;
		Static46.aClass116_4 = null;
		Static54.method4157();
		Static54.aClass116_40.method3273();
		Static86.aClass189_3 = null;
		Static54.aClass137_3 = null;
		Static80.aClass189_2 = null;
		Static285.anInt5603 = -1;
		Static116.anInt2756 = -1;
		Static202.aClass189_9 = null;
		Static151.aClass189_6 = null;
		Static117.aClass189_4 = null;
		Static197.aClass189_8 = null;
		Static165.aClass189_7 = null;
		Static297.aClass58_38 = null;
		Static75.aClass189_1 = null;
		Static31.method552();
		Static277.method4743(128, 64);
		Static213.method3912(64, 64);
		Static58.method1230(64);
		Static45.method918(64);
	}

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "(I)J")
	public static long method5643() {
		return Static348.aClass6_1.method4655();
	}
}
