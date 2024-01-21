import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!va", name = "bb", descriptor = "[Lclient!rd;")
	public static Class63[] aClass63Array22;

	@OriginalMember(owner = "client!va", name = "db", descriptor = "I")
	public static int anInt3132;

	@OriginalMember(owner = "client!va", name = "fb", descriptor = "Lclient!ba;")
	public static Class8 aClass8_3;

	@OriginalMember(owner = "client!va", name = "ib", descriptor = "Lclient!ge;")
	public static Class7 aClass7_58;

	@OriginalMember(owner = "client!va", name = "Z", descriptor = "[Lclient!rd;")
	public static Class63[] aClass63Array21 = new Class63[5];

	@OriginalMember(owner = "client!va", name = "hb", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1709 = Static80.method1463("This computers address has been blocked");

	@OriginalMember(owner = "client!va", name = "ab", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1708 = aClass63_1709;

	@OriginalMember(owner = "client!va", name = "jb", descriptor = "I")
	public static int anInt3134 = 1;

	@OriginalMember(owner = "client!va", name = "mb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1710 = Static80.method1463("Hidden)2");

	@OriginalMember(owner = "client!va", name = "nb", descriptor = "[[I")
	public static int[][] anIntArrayArray37 = new int[104][104];

	@OriginalMember(owner = "client!va", name = "ob", descriptor = "I")
	public static int anInt3137 = 0;

	@OriginalMember(owner = "client!va", name = "pb", descriptor = "I")
	public static int anInt3138 = 0;

	@OriginalMember(owner = "client!va", name = "rb", descriptor = "J")
	public static long aLong89 = 0L;

	@OriginalMember(owner = "client!va", name = "tb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1711 = Static80.method1463("m");

	@OriginalMember(owner = "client!va", name = "ub", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1712 = Static80.method1463("Ausw-=hlen");

	@OriginalMember(owner = "client!va", name = "g", descriptor = "(I)V")
	public static void method2093() {
		aClass63_1710 = null;
		aClass63_1708 = null;
		aClass63Array21 = null;
		anIntArrayArray37 = null;
		aClass7_58 = null;
		aClass8_3 = null;
		aClass63_1712 = null;
		aClass63Array22 = null;
		aClass63_1709 = null;
		aClass63_1711 = null;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(III)I")
	public static int method2094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class6_Sub7 local12 = (Class6_Sub7) Static72.aClass2_8.method20((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(24) int local24 = 0;
			for (@Pc(31) int local31 = 0; local31 < local12.anIntArray146.length; local31++) {
				if (arg0 == local12.anIntArray147[local31]) {
					local24 += local12.anIntArray146[local31];
				}
			}
			return local24;
		}
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(B)Z")
	public static boolean method2095() {
		return Static69.anInt1998 == 0 ? Static1.aClass6_Sub6_Sub4_1.method1934() : true;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IZBI)V")
	public static void method2096(@OriginalArg(1) boolean arg0) {
		Static73.anInt2059 = 22050;
		Static68.anInt1975 = 2;
		Static52.aBoolean78 = arg0;
	}
}
