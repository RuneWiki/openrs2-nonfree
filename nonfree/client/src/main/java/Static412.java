import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!un", name = "y", descriptor = "[[Lclient!hd;")
	public static Class110[][] aClass110ArrayArray2;

	@OriginalMember(owner = "client!un", name = "M", descriptor = "[Lclient!l;")
	public static Class95[] aClass95Array15;

	@OriginalMember(owner = "client!un", name = "T", descriptor = "I")
	public static int anInt6979;

	@OriginalMember(owner = "client!un", name = "ab", descriptor = "Lclient!c;")
	public static Class35 aClass35_4;

	@OriginalMember(owner = "client!un", name = "bb", descriptor = "Lclient!qn;")
	public static Class211 aClass211_92;

	@OriginalMember(owner = "client!un", name = "db", descriptor = "I")
	public static int anInt6984;

	@OriginalMember(owner = "client!un", name = "eb", descriptor = "Lclient!gj;")
	public static Class4_Sub14_Sub1 aClass4_Sub14_Sub1_3;

	@OriginalMember(owner = "client!un", name = "z", descriptor = "Z")
	public static boolean aBoolean491 = false;

	@OriginalMember(owner = "client!un", name = "F", descriptor = "I")
	public static int anInt6968 = 999999;

	@OriginalMember(owner = "client!un", name = "K", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_98 = new Class146(55, -1);

	@OriginalMember(owner = "client!un", name = "Y", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_126 = new Class15("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!un", name = "cb", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_99 = new Class146(64, 11);

	@OriginalMember(owner = "client!un", name = "fb", descriptor = "[[S")
	public static final short[][] aShortArrayArray8 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IBI)I")
	public static int method5609(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = arg1 & 0x1 | local12 << 1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local12;
	}

	@OriginalMember(owner = "client!un", name = "h", descriptor = "(I)V")
	public static void method5610() {
		Static339.aBoolean390 = false;
		Static204.method2868(Static30.anInt522, Static50.anInt816, Static328.anInt5318, Static128.anInt7338);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IJ)V")
	public static void method5611(@OriginalArg(1) long arg0) {
		if (Static432.aClass75ArrayArrayArray6 != null) {
			if (Static97.anInt1791 == 1 || Static97.anInt1791 == 5) {
				Static127.method1765(arg0);
			} else if (Static97.anInt1791 == 4) {
				Static121.method1722(arg0);
			}
		}
		Static185.method2556((long) Static265.anInt4371, Static39.aClass135_1);
		if (Static182.anInt3346 != -1) {
			Static44.method584(Static182.anInt3346);
		}
		for (@Pc(42) int local42 = 0; local42 < Static177.anInt3224; local42++) {
			if (Static72.aBooleanArray7[local42]) {
				Static324.aBooleanArray26[local42] = true;
			}
			Static154.aBooleanArray15[local42] = Static72.aBooleanArray7[local42];
			Static72.aBooleanArray7[local42] = false;
		}
		Static173.anInt3128 = Static265.anInt4371;
		if (Static39.aClass135_1.method5367()) {
			Static50.aBoolean47 = true;
		}
		if (Static182.anInt3346 != -1) {
			Static177.anInt3224 = 0;
			Static57.method812();
		}
		Static39.aClass135_1.e();
		Static56.method778(Static39.aClass135_1);
		@Pc(94) int local94 = Static373.method4910();
		if (local94 == -1) {
			local94 = Static340.anInt5535;
		}
		if (local94 == -1) {
			local94 = Static373.anInt6115;
		}
		Static322.method4261(local94);
		Static138.method1973(Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343, Static298.anInt4895, Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339, Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99);
		Static298.anInt4895 = 0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[B")
	public static byte[] method5612(@OriginalArg(0) int arg0) {
		@Pc(17) Class4_Sub2_Sub10 local17 = (Class4_Sub2_Sub10) Static252.aClass260_3.method5744((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(51) int local51 = 255 - local45;
				@Pc(56) int local56 = Static425.method5717(local28, local51);
				@Pc(60) byte local60 = local22[local56];
				local22[local56] = local22[local51];
				local22[local51] = local22[511 - local45] = local60;
			}
			local17 = new Class4_Sub2_Sub10(local22);
			Static252.aClass260_3.method5746(local17, (long) arg0);
		}
		return local17.aByteArray23;
	}
}
