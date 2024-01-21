import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "[I")
	public static int[] anIntArray7;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "[I")
	public static int[] anIntArray8;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "Lclient!u;")
	private static Class74 aClass74_44 = Static72.method1077("glow2:");

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Lclient!u;")
	private static Class74 aClass74_45 = Static72.method1077("Enter name of player to add to list");

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray2 = new int[104][104];

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "Lclient!u;")
	public static Class74 aClass74_46 = aClass74_44;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Lclient!u;")
	public static Class74 aClass74_47 = Static72.method1077("@yel@*V");

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "Lclient!u;")
	public static Class74 aClass74_48 = aClass74_44;

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "Lclient!u;")
	private static Class74 aClass74_49 = Static72.method1077("System update in: ");

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "Lclient!u;")
	public static Class74 aClass74_50 = aClass74_45;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Lclient!u;")
	public static Class74 aClass74_51 = aClass74_49;

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
	public static int anInt61 = 0;

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Lclient!e;")
	public static Class16 aClass16_4 = new Class16(64);

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
	public static int anInt62 = 0;

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
	public static int anInt63 = 0;

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
	public static int anInt64 = 0;

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "Lclient!da;")
	public static Class13 aClass13_4 = new Class13();

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIZ)I")
	public static int method30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class2_Sub12 local12 = (Class2_Sub12) Static87.aClass58_36.method1307((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = 0; local31 < local12.anIntArray157.length; local31++) {
				if (local12.anIntArray155[local31] == arg0) {
					local29 += local12.anIntArray157[local31];
				}
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method31() {
		if (Static6.aClass62_1 != null) {
			Static6.aClass62_1.method1347();
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2 method32() {
		@Pc(9) Class2_Sub2_Sub1_Sub2 local9 = new Class2_Sub2_Sub1_Sub2();
		local9.anInt287 = Static17.anIntArray54[0];
		local9.anInt291 = Static41.anInt966;
		local9.anInt288 = Static66.anInt1466;
		local9.anInt289 = Static71.anIntArray194[0];
		local9.anInt290 = Static51.anIntArray312[0];
		@Pc(41) int local41 = local9.anInt287 * local9.anInt289;
		local9.anIntArray31 = new int[local41];
		local9.anInt286 = Static91.anIntArray265[0];
		@Pc(54) byte[] local54 = Static24.aByteArrayArray3[0];
		for (@Pc(56) int local56 = 0; local56 < local41; local56++) {
			local9.anIntArray31[local56] = Static57.anIntArray156[local54[local56] & 0xFF];
		}
		Static37.method1354();
		return local9;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZII)I")
	public static int method33(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static111.method1678(arg0 - 1, arg1 + -1) + Static111.method1678(arg0 - 1, arg1 - -1) + Static111.method1678(arg0 + 1, arg1 + -1) + Static111.method1678(arg0 + 1, arg1 + 1);
		@Pc(77) int local77 = Static111.method1678(arg0, arg1 - 1) + Static111.method1678(arg0, arg1 + 1) + Static111.method1678(arg0 + -1, arg1) + Static111.method1678(arg0 - -1, arg1);
		@Pc(82) int local82 = Static111.method1678(arg0, arg1);
		return local41 / 16 + local77 / 8 + local82 / 4;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method34() {
		aClass74_46 = null;
		aClass74_48 = null;
		aClass74_44 = null;
		anIntArrayArray2 = null;
		aClass13_4 = null;
		anIntArray8 = null;
		aClass74_51 = null;
		aClass74_45 = null;
		aClass74_50 = null;
		aClass74_47 = null;
		anIntArray7 = null;
		aClass16_4 = null;
		aClass74_49 = null;
	}
}
