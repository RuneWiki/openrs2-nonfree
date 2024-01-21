import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!la", name = "Zb", descriptor = "[[Lclient!wa;")
	public static Class6_Sub3_Sub17[][] aClass6_Sub3_Sub17ArrayArray1;

	@OriginalMember(owner = "client!la", name = "fc", descriptor = "I")
	public static int anInt1975;

	@OriginalMember(owner = "client!la", name = "jc", descriptor = "Lclient!ge;")
	public static Class7 aClass7_39;

	@OriginalMember(owner = "client!la", name = "rc", descriptor = "I")
	public static int anInt1982;

	@OriginalMember(owner = "client!la", name = "Xb", descriptor = "[I")
	public static int[] anIntArray223 = new int[50];

	@OriginalMember(owner = "client!la", name = "dc", descriptor = "I")
	public static int anInt1973 = 0;

	@OriginalMember(owner = "client!la", name = "ec", descriptor = "I")
	public static int anInt1974 = 0;

	@OriginalMember(owner = "client!la", name = "ic", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1028 = Static80.method1463("as it was used to break our rules)3");

	@OriginalMember(owner = "client!la", name = "kc", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1029 = Static80.method1463("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!la", name = "mc", descriptor = "[I")
	public static int[] anIntArray224 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!la", name = "pc", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1030 = aClass63_1028;

	@OriginalMember(owner = "client!la", name = "tc", descriptor = "[Lclient!af;")
	public static Class7_Sub1[] aClass7_Sub1Array1 = new Class7_Sub1[256];

	@OriginalMember(owner = "client!la", name = "s", descriptor = "(I)V")
	public static void method1342() {
		Static86.aClass56_1.method2001();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static31.aLongArray1[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static109.aLongArray6[local24] = 0L;
		}
		Static70.anInt2003 = 0;
	}

	@OriginalMember(owner = "client!la", name = "m", descriptor = "(II)Lclient!fd;")
	public static Class6_Sub3_Sub6 method1345(@OriginalArg(1) int arg0) {
		@Pc(13) Class6_Sub3_Sub6 local13 = (Class6_Sub3_Sub6) Static106.aClass49_27.method1397((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(27) byte[] local27 = aClass7_39.method110(14, arg0);
		local13 = new Class6_Sub3_Sub6();
		if (local27 != null) {
			local13.method864(new Class6_Sub4(local27));
		}
		Static106.aClass49_27.method1396((long) arg0, local13);
		return local13;
	}

	@OriginalMember(owner = "client!la", name = "m", descriptor = "(B)V")
	public static void method1346() {
		aClass63_1030 = null;
		aClass6_Sub3_Sub17ArrayArray1 = null;
		aClass7_Sub1Array1 = null;
		anIntArray223 = null;
		aClass7_39 = null;
		anIntArray224 = null;
		aClass63_1028 = null;
		aClass63_1029 = null;
	}
}
