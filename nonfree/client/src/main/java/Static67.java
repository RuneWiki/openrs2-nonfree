import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!kf", name = "L", descriptor = "Z")
	public static boolean aBoolean95;

	@OriginalMember(owner = "client!kf", name = "N", descriptor = "[Lclient!e;")
	public static Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array7;

	@OriginalMember(owner = "client!kf", name = "Q", descriptor = "Lclient!ie;")
	public static Class35 aClass35_18;

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
	public static int anInt1765 = 0;

	@OriginalMember(owner = "client!kf", name = "G", descriptor = "Lclient!id;")
	private static Class34 aClass34_835 = Static9.method266("wave2:");

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "Lclient!id;")
	public static Class34 aClass34_832 = aClass34_835;

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
	public static int anInt1766 = 0;

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "Lclient!id;")
	public static Class34 aClass34_833 = aClass34_835;

	@OriginalMember(owner = "client!kf", name = "M", descriptor = "Lclient!id;")
	private static Class34 aClass34_837 = Static9.method266("white:");

	@OriginalMember(owner = "client!kf", name = "A", descriptor = "Lclient!id;")
	public static Class34 aClass34_834 = aClass34_837;

	@OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
	public static int anInt1767 = 0;

	@OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
	public static int anInt1768 = -1;

	@OriginalMember(owner = "client!kf", name = "K", descriptor = "Lclient!id;")
	public static Class34 aClass34_836 = aClass34_837;

	@OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
	public static int anInt1773 = -1;

	@OriginalMember(owner = "client!kf", name = "P", descriptor = "Lclient!id;")
	public static Class34 aClass34_838 = Static9.method266("title)3jpg");

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)I")
	public static int method1129(@OriginalArg(1) int arg0) {
		@Pc(9) Class1_Sub1_Sub3 local9 = Static105.method1721(arg0);
		@Pc(12) int local12 = local9.anInt360;
		@Pc(15) int local15 = local9.anInt367;
		@Pc(18) int local18 = local9.anInt357;
		@Pc(25) int local25 = Class43.anIntArray212[local18 - local15];
		return Static39.anIntArray116[local12] >> local15 & local25;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILclient!gd;II)V")
	public static void method1130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub6 arg2, @OriginalArg(4) int arg3) {
		if (Static31.anInt924 >= 50 || Static66.anInt1753 == 0 || (arg2.anIntArray124 == null || arg0 >= arg2.anIntArray124.length)) {
			return;
		}
		@Pc(27) int local27 = arg2.anIntArray124[arg0];
		if (local27 == 0) {
			return;
		}
		@Pc(34) int local34 = local27 >> 8;
		Static114.anIntArray345[Static31.anInt924] = local34;
		@Pc(44) int local44 = local27 >> 4 & 0x7;
		Static17.anIntArray66[Static31.anInt924] = local44;
		Static30.anIntArray90[Static31.anInt924] = 0;
		Static7.aClass72Array1[Static31.anInt924] = null;
		@Pc(65) int local65 = local27 & 0xF;
		@Pc(71) int local71 = (arg3 - 64) / 128;
		@Pc(77) int local77 = (arg1 - 64) / 128;
		Static100.anIntArray316[Static31.anInt924] = (local77 << 8) + (local71 << 16) + local65;
		Static31.anInt924++;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
	public static void method1131() {
		aClass34_836 = null;
		aClass34_832 = null;
		aClass34_838 = null;
		aClass34_833 = null;
		aClass34_837 = null;
		aClass34_834 = null;
		aClass35_18 = null;
		aClass1_Sub1_Sub2_Sub2Array7 = null;
		aClass34_835 = null;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)[Lclient!ae;")
	public static Class1_Sub1_Sub2_Sub1[] method1132() {
		@Pc(8) Class1_Sub1_Sub2_Sub1[] local8 = new Class1_Sub1_Sub2_Sub1[Static32.anInt1454];
		for (@Pc(10) int local10 = 0; local10 < Static32.anInt1454; local10++) {
			@Pc(20) Class1_Sub1_Sub2_Sub1 local20 = local8[local10] = new Class1_Sub1_Sub2_Sub1();
			local20.anInt333 = Static123.anInt2913;
			local20.anInt337 = Static78.anInt2092;
			local20.anInt335 = Static78.anIntArray244[local10];
			local20.anInt332 = Static87.anIntArray297[local10];
			local20.anInt336 = Static91.anIntArray298[local10];
			local20.anInt334 = Static116.anIntArray351[local10];
			@Pc(52) int local52 = local20.anInt336 * local20.anInt334;
			@Pc(56) byte[] local56 = Static77.aByteArrayArray7[local10];
			local20.anIntArray26 = new int[local52];
			for (@Pc(62) int local62 = 0; local62 < local52; local62++) {
				local20.anIntArray26[local62] = Static32.anIntArray150[local56[local62] & 0xFF];
			}
		}
		Static5.method212();
		return local8;
	}
}
