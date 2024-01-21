import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!jg", name = "y", descriptor = "Lclient!ff;")
	public static Class24 aClass24_4;

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1244 = Static107.method1838("Type");

	@OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
	public static int anInt2112 = 128;

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "[Lclient!ab;")
	public static Class2_Sub2[] aClass2_Sub2Array1 = new Class2_Sub2[2048];

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1245 = Static107.method1838("Neuer Benutzer");

	@OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
	public static int anInt2114 = 0;

	@OriginalMember(owner = "client!jg", name = "x", descriptor = "[Lclient!mc;")
	public static Class40_Sub1[] aClass40_Sub1Array1 = new Class40_Sub1[256];

	@OriginalMember(owner = "client!jg", name = "A", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1246 = aClass28_1244;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(JZ)Lclient!gg;")
	public static Class28 method1479(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local34++;
			}
			@Pc(52) byte[] local52 = new byte[local34];
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local34--;
				local52[local34] = Static33.aByteArray11[(int) (local56 - arg0 * 37L)];
			}
			@Pc(81) Class28 local81 = new Class28();
			local81.aByteArray14 = local52;
			local81.anInt1718 = local52.length;
			return local81;
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
	public static void method1480() {
		aClass28_1245 = null;
		aClass28_1246 = null;
		Class2_Sub10.anIntArray201 = null;
		aClass2_Sub2Array1 = null;
		aClass40_Sub1Array1 = null;
		aClass24_4 = null;
		aClass28_1244 = null;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B[Lclient!gg;)Lclient!gg;")
	public static Class28 method1481(@OriginalArg(1) Class28[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static16.method411(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
	public static void method1482(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub11 local12 = (Class2_Sub11) Static101.aClass35_6.method1354((long) arg0);
		if (local12 != null) {
			for (@Pc(17) int local17 = 0; local17 < local12.anIntArray203.length; local17++) {
				local12.anIntArray203[local17] = -1;
				local12.anIntArray202[local17] = 0;
			}
		}
	}
}
