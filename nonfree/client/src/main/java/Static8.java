import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ag", name = "hb", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ag", name = "Q", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_53 = Static81.method1507("Oct");

	@OriginalMember(owner = "client!ag", name = "R", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_54 = Static81.method1507("May");

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
	public static int anInt202 = 0;

	@OriginalMember(owner = "client!ag", name = "T", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_55 = Static81.method1507("Apr");

	@OriginalMember(owner = "client!ag", name = "ab", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_56 = Static81.method1507("Hidden)2");

	@OriginalMember(owner = "client!ag", name = "bb", descriptor = "[Lclient!dj;")
	public static final Class24[] aClass24Array1 = new Class24[100];

	@OriginalMember(owner = "client!ag", name = "cb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_57 = Static81.method1507("Feb");

	@OriginalMember(owner = "client!ag", name = "db", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_58 = Static81.method1507("Jul");

	@OriginalMember(owner = "client!ag", name = "tb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_65 = Static81.method1507("Jan");

	@OriginalMember(owner = "client!ag", name = "kb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_61 = Static81.method1507("Mar");

	@OriginalMember(owner = "client!ag", name = "qb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_64 = Static81.method1507("Jun");

	@OriginalMember(owner = "client!ag", name = "ob", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_63 = Static81.method1507("Aug");

	@OriginalMember(owner = "client!ag", name = "fb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_59 = Static81.method1507("Sep");

	@OriginalMember(owner = "client!ag", name = "ib", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_60 = Static81.method1507("Nov");

	@OriginalMember(owner = "client!ag", name = "mb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_62 = Static81.method1507("Dec");

	@OriginalMember(owner = "client!ag", name = "eb", descriptor = "[Lclient!dj;")
	public static final Class24[] aClass24Array2 = new Class24[] { aClass24_65, aClass24_57, aClass24_61, aClass24_55, aClass24_54, aClass24_64, aClass24_58, aClass24_63, aClass24_59, aClass24_53, aClass24_60, aClass24_62 };

	@OriginalMember(owner = "client!ag", name = "rb", descriptor = "I")
	public static int anInt214 = 2;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)Z")
	public static boolean method210() {
		try {
			if (Static91.anInt2111 == 2) {
				if (Static163.aClass1_Sub19_1 == null) {
					Static163.aClass1_Sub19_1 = Static218.method2256(Static120.aClass69_29, Static116.anInt2596, Static47.anInt1175);
					if (Static163.aClass1_Sub19_1 == null) {
						return false;
					}
				}
				if (Static176.aClass14_32 == null) {
					Static176.aClass14_32 = new Class14(Static126.aClass69_30, Static46.aClass69_11);
				}
				if (Static107.aClass1_Sub3_Sub4_1.method2887(Static7.aClass69_1, Static176.aClass14_32, Static163.aClass1_Sub19_1)) {
					Static107.aClass1_Sub3_Sub4_1.method2867();
					Static107.aClass1_Sub3_Sub4_1.method2872(Static16.anInt377);
					Static107.aClass1_Sub3_Sub4_1.method2870(Static152.aBoolean156, Static163.aClass1_Sub19_1);
					Static91.anInt2111 = 0;
					Static176.aClass14_32 = null;
					Static120.aClass69_29 = null;
					Static163.aClass1_Sub19_1 = null;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static107.aClass1_Sub3_Sub4_1.method2888();
			Static176.aClass14_32 = null;
			Static163.aClass1_Sub19_1 = null;
			Static120.aClass69_29 = null;
			Static91.anInt2111 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method213(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static214.method348(arg0, 0, local14, 0, local11);
		return local14;
	}
}
