import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ka", name = "qb", descriptor = "I")
	public static int anInt1724;

	@OriginalMember(owner = "client!ka", name = "Hb", descriptor = "I")
	public static int anInt1739;

	@OriginalMember(owner = "client!ka", name = "pb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_894 = Static23.method501("Loaded title screen");

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "Lclient!mc;")
	public static Class42 aClass42_892 = aClass42_894;

	@OriginalMember(owner = "client!ka", name = "M", descriptor = "Lclient!mc;")
	private static Class42 aClass42_893 = Static23.method501("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!ka", name = "W", descriptor = "Lclient!kc;")
	public static Class37 aClass37_20 = new Class37(64);

	@OriginalMember(owner = "client!ka", name = "rb", descriptor = "I")
	public static int anInt1725 = 0;

	@OriginalMember(owner = "client!ka", name = "vb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_895 = aClass42_893;

	@OriginalMember(owner = "client!ka", name = "Fb", descriptor = "I")
	public static int anInt1738 = 0;

	@OriginalMember(owner = "client!ka", name = "Gb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_896 = Static23.method501("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!ka", name = "Jb", descriptor = "Lclient!mc;")
	public static Class42 aClass42_897 = Static23.method501("(U4");

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V")
	public static void method1191() {
		@Pc(16) int local16;
		for (@Pc(5) int local5 = -1; local5 < Static27.anInt770; local5++) {
			if (local5 == -1) {
				local16 = 2047;
			} else {
				local16 = Static68.anIntArray240[local5];
			}
			@Pc(25) Class1_Sub1_Sub8_Sub1_Sub2 local25 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local16];
			if (local25 != null && local25.anInt2557 > 0) {
				local25.anInt2557--;
				if (local25.anInt2557 == 0) {
					local25.aClass42_1380 = null;
				}
			}
		}
		for (local16 = 0; local16 < Static91.anInt2403; local16++) {
			@Pc(57) int local57 = Static98.anIntArray375[local16];
			@Pc(61) Class1_Sub1_Sub8_Sub1_Sub1 local61 = Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local57];
			if (local61 != null && local61.anInt2557 > 0) {
				local61.anInt2557--;
				if (local61.anInt2557 == 0) {
					local61.aClass42_1380 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
	public static void method1194() {
		aClass42_894 = null;
		aClass42_892 = null;
		aClass42_893 = null;
		aClass42_896 = null;
		aClass37_20 = null;
		aClass42_895 = null;
		aClass42_897 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIBIIII)I")
	public static int method1196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(17) int local17 = arg1;
			arg1 = arg0;
			arg0 = local17;
		}
		@Pc(25) int local25 = arg4 & 0x3;
		if (local25 == 0) {
			return arg5;
		} else if (local25 == 1) {
			return 8 - arg3 - arg1;
		} else if (local25 == 2) {
			return 7 + 1 - arg5 - arg0;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "(I)V")
	public static void method1215() {
		Static27.aClass37_11.method976();
	}
}
