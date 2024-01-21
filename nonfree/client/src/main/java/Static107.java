import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
	public static int anInt2763;

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray23;

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "Lclient!db;")
	public static Class3_Sub2_Sub1_Sub2_Sub1 aClass3_Sub2_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Lclient!eh;")
	private static Class28 aClass28_891 = Static170.method3101("flash2:");

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "Lclient!eh;")
	public static Class28 aClass28_890 = aClass28_891;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
	public static int anInt2762 = 0;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!eh;")
	private static Class28 aClass28_892 = Static170.method3101("Cancel");

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "Lclient!eh;")
	public static Class28 aClass28_893 = aClass28_892;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "Lclient!eh;")
	public static Class28 aClass28_894 = aClass28_891;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method2177() {
		aClass28_893 = null;
		aClass28_894 = null;
		aClass28_892 = null;
		aClass28_890 = null;
		aByteArrayArrayArray23 = null;
		aClass28_891 = null;
		aClass3_Sub2_Sub1_Sub2_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BIII)I")
	public static int method2178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = 256 - arg1;
		return ((arg2 & 0xFF00) * arg1 + (arg0 & 0xFF00) * local9 & 0xFF0000) + (arg1 * (arg2 & 0xFF00FF) + local9 * (arg0 & 0xFF00FF) & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)Lclient!ke;")
	public static Class3_Sub2_Sub11 method2179(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub2_Sub11 local10 = (Class3_Sub2_Sub11) Static146.aClass63_27.method2337((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static22.aClass7_14.method1021(14, arg0);
		local10 = new Class3_Sub2_Sub11();
		if (local20 != null) {
			local10.method1879(new Class3_Sub8(local20));
		}
		Static146.aClass63_27.method2338((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Z")
	public static boolean method2180(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}
}
