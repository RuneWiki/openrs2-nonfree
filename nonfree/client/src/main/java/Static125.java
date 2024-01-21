import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!mh", name = "bb", descriptor = "[I")
	public static int[] anIntArray246;

	@OriginalMember(owner = "client!mh", name = "X", descriptor = "Lclient!bg;")
	public static final Class13 aClass13_8 = new Class13();

	@OriginalMember(owner = "client!mh", name = "ab", descriptor = "I")
	public static int anInt2767 = 0;

	@OriginalMember(owner = "client!mh", name = "cb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_970 = null;

	@OriginalMember(owner = "client!mh", name = "db", descriptor = "[I")
	public static final int[] anIntArray247 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!mh", name = "eb", descriptor = "I")
	public static int anInt2768 = 0;

	@OriginalMember(owner = "client!mh", name = "fb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_971 = Static151.method2243("Hierhin gehen");

	@OriginalMember(owner = "client!mh", name = "gb", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_972 = Static151.method2243("; Max)2Age=");

	@OriginalMember(owner = "client!mh", name = "hb", descriptor = "[Lclient!ef;")
	public static final Class27[] aClass27Array1 = new Class27[50];

	@OriginalMember(owner = "client!mh", name = "ib", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_973 = Static151.method2243("titlebutton");

	@OriginalMember(owner = "client!mh", name = "jb", descriptor = "I")
	public static int anInt2769 = 0;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)Lclient!p;")
	public static Class2_Sub1_Sub18 method1956(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub1_Sub18 local6 = (Class2_Sub1_Sub18) Static139.aClass53_16.method1648((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static13.aClass71_2.method2130(16, arg0);
		local6 = new Class2_Sub1_Sub18();
		if (local20 != null) {
			local6.method2210(new Class2_Sub11(local20));
		}
		Static139.aClass53_16.method1645((long) arg0, local6);
		return local6;
	}
}
