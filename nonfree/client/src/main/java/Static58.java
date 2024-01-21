import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "[Lclient!hh;")
	public static Class2_Sub9[] aClass2_Sub9Array1;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "Lclient!id;")
	public static Class35 aClass35_22 = new Class35(4096);

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!gg;")
	public static Class28 aClass28_860 = Static107.method1838("<)4col> x");

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "[Lclient!kh;")
	public static Class43[] aClass43Array37 = new Class43[5000];

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Lclient!gg;")
	public static Class28 aClass28_861 = Static107.method1838("Angreifen");

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	public static int anInt1512 = 127;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
	public static int anInt1513 = 0;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "Z")
	public static boolean aBoolean77 = false;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public static void method1033() {
		aClass2_Sub9Array1 = null;
		aClass43Array37 = null;
		aClass28_861 = null;
		aClass28_860 = null;
		aClass35_22 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)Lclient!kb;")
	public static Class2_Sub4_Sub12 method1034(@OriginalArg(0) int arg0) {
		@Pc(6) Class2_Sub4_Sub12 local6 = (Class2_Sub4_Sub12) Static74.aClass14_101.method603((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static155.aClass40_34.method1771(10, arg0);
		local6 = new Class2_Sub4_Sub12();
		local6.anInt2201 = arg0;
		if (local20 != null) {
			local6.method1566(new Class2_Sub2(local20));
		}
		local6.method1571();
		if (local6.anInt2204 != -1) {
			local6.method1567(method1034(local6.anInt2204), method1034(local6.anInt2205));
		}
		if (!Static108.aBoolean123 && local6.aBoolean110) {
			local6.aClass28_1344 = Static119.aClass28_1671;
			local6.aClass28Array31 = null;
			local6.anInt2228 = 0;
			local6.aClass28Array32 = null;
			local6.aBoolean109 = false;
		}
		Static74.aClass14_101.method607((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)Lclient!ff;")
	public static Class24 method1035(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static23.aClass24ArrayArray1[local7] == null || Static23.aClass24ArrayArray1[local7][local11] == null) {
			@Pc(25) boolean local25 = Static131.method2109(local7);
			if (!local25) {
				return null;
			}
		}
		return Static23.aClass24ArrayArray1[local7][local11];
	}
}
