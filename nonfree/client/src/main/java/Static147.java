import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "Lclient!ir;")
	public static Class100 aClass100_63;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "Lclient!ug;")
	public static Class56 aClass56_2;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
	public static int anInt2909;

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array9;

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
	public static int anInt2903 = -1;

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "[I")
	public static final int[] anIntArray208 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
	public static int anInt2908 = -1;

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "[B")
	public static final byte[] aByteArray57 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;)V")
	public static void method2381(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		Static57.anInt1247 = arg0;
		Static88.aString59 = arg1;
		Static15.aString7 = arg2;
		if (Static88.aString59.equals("") || Static15.aString7.equals("")) {
			Static84.anInt1683 = 3;
		} else if (Static287.anInt5784 == -1) {
			Static271.anInt5440 = 1;
			Static84.anInt1683 = -3;
			Static272.anInt5451 = 0;
			Static297.anInt5928 = 0;
			@Pc(40) Class3_Sub4 local40 = new Class3_Sub4(128);
			local40.method3614(10);
			local40.method3650((int) (Math.random() * 9.9999999E7D));
			local40.method3668(Static334.method5497(Static88.aString59));
			local40.method3650((int) (Math.random() * 9.9999999E7D));
			local40.method3624(Static15.aString7);
			local40.method3650((int) (Math.random() * 9.9999999E7D));
			local40.method3626(Static248.aBigInteger2, Static41.aBigInteger1);
			Static291.aClass3_Sub4_Sub2_3.anInt4268 = 0;
			Static291.aClass3_Sub4_Sub2_3.method3614(24);
			Static291.aClass3_Sub4_Sub2_3.method3614(local40.anInt4268 + 2);
			Static291.aClass3_Sub4_Sub2_3.method3660(556);
			Static291.aClass3_Sub4_Sub2_3.method3662(local40.anInt4268, local40.aByteArray70);
		} else {
			Static118.method2063();
		}
	}
}
