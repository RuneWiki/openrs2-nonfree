import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
	public static int anInt2166;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Lclient!sb;")
	public static Class65 aClass65_28 = new Class65(4096);

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1142 = Static106.method1849("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1143 = Static106.method1849("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1144 = aClass66_1142;

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "[Lclient!sc;")
	public static Class66[] aClass66Array13 = new Class66[1000];

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1145 = aClass66_1143;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "[Lclient!sc;")
	public static Class66[] aClass66Array14 = new Class66[1000];

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
	public static int anInt2165 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1479(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static139.method1493(arg0, 0, local14, 0, local6);
		return local14;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method1480(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class1_Sub12 local13 = new Class1_Sub12(arg0);
		@Pc(17) int local17 = local13.method1190();
		@Pc(21) int local21 = local13.method1210();
		if (local21 < 0 || Static75.anInt2097 != 0 && Static75.anInt2097 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(91) byte[] local91 = new byte[local21];
			local13.method1186(local21, local91);
			return local91;
		} else {
			@Pc(48) int local48 = local13.method1210();
			if (local48 < 0 || Static75.anInt2097 != 0 && Static75.anInt2097 < local48) {
				throw new RuntimeException();
			}
			@Pc(65) byte[] local65 = new byte[local48];
			if (local17 == 1) {
				Static30.method564(local65, local48, arg0, local21);
			} else {
				Static71.aClass79_1.method2035(local65, local13);
			}
			return local65;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public static void method1481() {
		aClass66_1142 = null;
		aClass66Array13 = null;
		aClass66_1143 = null;
		aClass66_1144 = null;
		aClass66_1145 = null;
		aClass65_28 = null;
		aClass66Array14 = null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIII)I")
	public static int method1482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}
}
