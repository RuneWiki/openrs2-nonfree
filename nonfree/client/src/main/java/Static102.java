import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!se", name = "x", descriptor = "I")
	public static int anInt2742;

	@OriginalMember(owner = "client!se", name = "K", descriptor = "Lclient!sd;")
	public static Class29 aClass29_65;

	@OriginalMember(owner = "client!se", name = "B", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1178 = Static63.method1251("Side panel redrawn");

	@OriginalMember(owner = "client!se", name = "C", descriptor = "I")
	public static int anInt2744 = 0;

	@OriginalMember(owner = "client!se", name = "H", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!se", name = "Q", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1180 = Static63.method1251("Loading friend list");

	@OriginalMember(owner = "client!se", name = "I", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1179 = aClass45_1180;

	@OriginalMember(owner = "client!se", name = "J", descriptor = "[I")
	public static int[] anIntArray419 = new int[500];

	@OriginalMember(owner = "client!se", name = "R", descriptor = "I")
	public static int anInt2751 = 2;

	@OriginalMember(owner = "client!se", name = "U", descriptor = "I")
	public static int anInt2754 = -1;

	@OriginalMember(owner = "client!se", name = "X", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1182 = Static63.method1251("Private chat");

	@OriginalMember(owner = "client!se", name = "V", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1181 = aClass45_1182;

	@OriginalMember(owner = "client!se", name = "Y", descriptor = "I")
	public static int anInt2755 = 128;

	@OriginalMember(owner = "client!se", name = "Z", descriptor = "[I")
	public static int[] anIntArray422 = new int[4000];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIBI)I")
	public static int method1888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 / arg2;
		@Pc(13) int local13 = arg2 - 1 & arg1;
		@Pc(17) int local17 = arg0 / arg2;
		@Pc(23) int local23 = arg0 & arg2 - 1;
		@Pc(28) int local28 = Static106.method1919(local3, local17);
		@Pc(35) int local35 = Static106.method1919(local3 + 1, local17);
		@Pc(42) int local42 = Static106.method1919(local3, local17 + 1);
		@Pc(51) int local51 = Static106.method1919(local3 + 1, local17 + 1);
		@Pc(63) int local63 = Static71.method1381(arg2, local35, local13, local28);
		@Pc(70) int local70 = Static71.method1381(arg2, local51, local13, local42);
		return Static71.method1381(arg2, local70, local23, local63);
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(B)I")
	public static int method1889() {
		@Pc(9) int local9 = Static32.method676(Static25.anInt791, Static46.anInt1334, Static8.anInt262);
		return local9 - Static50.anInt1602 >= 800 || (Static48.aByteArrayArrayArray3[Static8.anInt262][Static25.anInt791 >> 7][Static46.anInt1334 >> 7] & 0x4) == 0 ? 3 : Static8.anInt262;
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(I)V")
	public static void method1890() {
		for (@Pc(3) int local3 = 0; local3 < Static101.anInt1025; local3++) {
			@Pc(9) int local9 = Static30.anIntArray68[local3]--;
			if (Static30.anIntArray68[local3] >= -10) {
				@Pc(82) Class8 local82 = Static93.aClass8Array1[local3];
				if (local82 == null) {
					local82 = Static125.method84(Static100.aClass29_Sub1_43, Static38.anIntArray177[local3]);
					if (local82 == null) {
						continue;
					}
					Static30.anIntArray68[local3] += local82.method86();
					Static93.aClass8Array1[local3] = local82;
				}
				if (Static30.anIntArray68[local3] < 0) {
					@Pc(205) int local205;
					if (Static1.anIntArray1[local3] == 0) {
						local205 = Static37.anInt1080;
					} else {
						@Pc(129) int local129 = (Static1.anIntArray1[local3] & 0xFF) * 128;
						@Pc(137) int local137 = Static1.anIntArray1[local3] >> 16 & 0xFF;
						@Pc(147) int local147 = local137 * 128 + 64 - Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2428;
						if (local147 < 0) {
							local147 = -local147;
						}
						@Pc(160) int local160 = Static1.anIntArray1[local3] >> 8 & 0xFF;
						@Pc(170) int local170 = local160 * 128 + 64 - Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anInt2417;
						if (local170 < 0) {
							local170 = -local170;
						}
						@Pc(184) int local184 = local170 + local147 - 128;
						if (local129 < local184) {
							Static30.anIntArray68[local3] = -100;
							continue;
						}
						if (local184 < 0) {
							local184 = 0;
						}
						local205 = (local129 - local184) * Static116.anInt3035 / local129;
					}
					@Pc(214) Class5_Sub5_Sub1 local214 = local82.method85().method541(Static39.aClass71_2);
					@Pc(219) Class5_Sub7_Sub2 local219 = Static128.method1029(local214, local205);
					local219.method1028(Static40.anIntArray182[local3] - 1);
					Static47.aClass5_Sub7_Sub3_2.method2011(local219);
					Static30.anIntArray68[local3] = -100;
				}
			} else {
				Static101.anInt1025--;
				for (@Pc(25) int local25 = local3; local25 < Static101.anInt1025; local25++) {
					Static38.anIntArray177[local25] = Static38.anIntArray177[local25 + 1];
					Static93.aClass8Array1[local25] = Static93.aClass8Array1[local25 + 1];
					Static40.anIntArray182[local25] = Static40.anIntArray182[local25 + 1];
					Static30.anIntArray68[local25] = Static30.anIntArray68[local25 + 1];
					Static1.anIntArray1[local25] = Static1.anIntArray1[local25 + 1];
				}
				local3--;
			}
		}
		if (Static61.aBoolean88 && !Static6.method117()) {
			if (Static107.anInt2807 != 0 && Static73.anInt2169 != -1) {
				Static61.method1224(Static21.aClass29_Sub1_11, Static73.anInt2169, Static107.anInt2807, 0);
			}
			Static61.aBoolean88 = false;
		}
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V")
	public static void method1891() {
		anIntArray419 = null;
		anIntArray422 = null;
		aClass29_65 = null;
		aClass45_1181 = null;
		aClass45_1180 = null;
		aClass45_1179 = null;
		aCRC32_2 = null;
		aClass45_1178 = null;
		aClass45_1182 = null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!nb;)V")
	public static void method1892(@OriginalArg(1) Class48 arg0) {
		Static49.aClass48_1 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZ)V")
	public static void method1893(@OriginalArg(2) boolean arg0) {
		Static33.aBoolean47 = arg0;
		Static1.anInt3 = 22050;
	}
}
