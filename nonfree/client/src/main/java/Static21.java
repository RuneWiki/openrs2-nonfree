import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!cd", name = "N", descriptor = "Z")
	public static boolean aBoolean19 = false;

	@OriginalMember(owner = "client!cd", name = "P", descriptor = "[Lclient!ob;")
	public static Class16_Sub1[] aClass16_Sub1Array1 = new Class16_Sub1[256];

	@OriginalMember(owner = "client!cd", name = "R", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!cd", name = "Z", descriptor = "Lclient!ea;")
	private static Class18 aClass18_188 = Static8.method128("Please try using a different world)3");

	@OriginalMember(owner = "client!cd", name = "T", descriptor = "Lclient!ea;")
	public static Class18 aClass18_185 = aClass18_188;

	@OriginalMember(owner = "client!cd", name = "U", descriptor = "[J")
	public static long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!cd", name = "V", descriptor = "[S")
	public static short[] aShortArray10 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!cd", name = "W", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[1000][];

	@OriginalMember(owner = "client!cd", name = "X", descriptor = "Lclient!ea;")
	public static Class18 aClass18_186 = aClass18_188;

	@OriginalMember(owner = "client!cd", name = "Y", descriptor = "Lclient!ea;")
	public static Class18 aClass18_187 = aClass18_188;

	@OriginalMember(owner = "client!cd", name = "ab", descriptor = "Lclient!ea;")
	public static Class18 aClass18_189 = aClass18_188;

	@OriginalMember(owner = "client!cd", name = "bb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_190 = aClass18_188;

	@OriginalMember(owner = "client!cd", name = "cb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_191 = aClass18_188;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([BI)Lclient!m;")
	public static Class1_Sub1_Sub8_Sub2_Sub1 method369(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(23) Class1_Sub1_Sub8_Sub2_Sub1 local23 = new Class1_Sub1_Sub8_Sub2_Sub1(arg0, Static131.anIntArray333, Static129.anIntArray331, Static26.anIntArray54, Static145.anIntArray375, Static9.anIntArray13, Static22.aByteArrayArray4);
			Static76.method1682();
			return local23;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIBLclient!ea;)V")
	public static void method370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class18 arg3) {
		@Pc(8) Class20 local8 = Static168.method3089(arg1, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray14 != null) {
			@Pc(22) Class1_Sub10 local22 = new Class1_Sub10();
			local22.anInt1455 = arg0;
			local22.anObjectArray28 = local8.anObjectArray14;
			local22.aClass20_6 = local8;
			local22.aClass18_355 = arg3;
			Static97.method2118(local22);
		}
		@Pc(40) boolean local40 = true;
		if (local8.anInt1221 > 0) {
			local40 = Static178.method3190(local8);
		}
		if (!local40 || !Static80.method1789(arg0 - 1, Static36.method758(local8))) {
			return;
		}
		if (arg0 == 1) {
			Static95.aClass1_Sub6_Sub1_1.method555(234);
			Static95.aClass1_Sub6_Sub1_1.method513(arg1);
			Static95.aClass1_Sub6_Sub1_1.method531(arg2);
		}
		if (arg0 == 2) {
			Static95.aClass1_Sub6_Sub1_1.method555(87);
			Static95.aClass1_Sub6_Sub1_1.method513(arg1);
			Static95.aClass1_Sub6_Sub1_1.method531(arg2);
		}
		if (arg0 == 3) {
			Static95.aClass1_Sub6_Sub1_1.method555(37);
			Static95.aClass1_Sub6_Sub1_1.method513(arg1);
			Static95.aClass1_Sub6_Sub1_1.method531(arg2);
		}
		if (arg0 == 4) {
			Static95.aClass1_Sub6_Sub1_1.method555(3);
			Static95.aClass1_Sub6_Sub1_1.method513(arg1);
			Static95.aClass1_Sub6_Sub1_1.method531(arg2);
		}
		if (arg0 == 5) {
			Static95.aClass1_Sub6_Sub1_1.method555(70);
			Static95.aClass1_Sub6_Sub1_1.method513(arg1);
			Static95.aClass1_Sub6_Sub1_1.method531(arg2);
		}
		if (arg0 == 6) {
			Static95.aClass1_Sub6_Sub1_1.method555(29);
			Static95.aClass1_Sub6_Sub1_1.method513(arg1);
			Static95.aClass1_Sub6_Sub1_1.method531(arg2);
		}
		if (arg0 == 7) {
			Static95.aClass1_Sub6_Sub1_1.method555(192);
			Static95.aClass1_Sub6_Sub1_1.method513(arg1);
			Static95.aClass1_Sub6_Sub1_1.method531(arg2);
		}
		if (arg0 == 8) {
			Static95.aClass1_Sub6_Sub1_1.method555(154);
			Static95.aClass1_Sub6_Sub1_1.method513(arg1);
			Static95.aClass1_Sub6_Sub1_1.method531(arg2);
		}
		if (arg0 == 9) {
			Static95.aClass1_Sub6_Sub1_1.method555(65);
			Static95.aClass1_Sub6_Sub1_1.method513(arg1);
			Static95.aClass1_Sub6_Sub1_1.method531(arg2);
		}
		if (arg0 == 10) {
			Static95.aClass1_Sub6_Sub1_1.method555(156);
			Static95.aClass1_Sub6_Sub1_1.method513(arg1);
			Static95.aClass1_Sub6_Sub1_1.method531(arg2);
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
	public static void method371() {
		aByteArrayArray3 = null;
		aClass16_Sub1Array1 = null;
		aClass18_191 = null;
		aCRC32_1 = null;
		aLongArray2 = null;
		aClass18_185 = null;
		aClass18_188 = null;
		aClass18_187 = null;
		aClass18_189 = null;
		aClass18_186 = null;
		aShortArray10 = null;
		aClass18_190 = null;
	}
}
