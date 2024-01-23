import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!mg", name = "Gb", descriptor = "Z")
	public static boolean aBoolean52;

	@OriginalMember(owner = "client!mg", name = "yb", descriptor = "Lclient!sf;")
	public static Class89 aClass89_2 = new Class89();

	@OriginalMember(owner = "client!mg", name = "zb", descriptor = "[[B")
	public static byte[][] aByteArrayArray4 = new byte[250][];

	@OriginalMember(owner = "client!mg", name = "Bb", descriptor = "Lclient!i;")
	private static Class41 aClass41_331 = Static184.method2923("green:");

	@OriginalMember(owner = "client!mg", name = "Ab", descriptor = "Lclient!i;")
	public static Class41 aClass41_330 = aClass41_331;

	@OriginalMember(owner = "client!mg", name = "Cb", descriptor = "I")
	public static int anInt1020 = 50;

	@OriginalMember(owner = "client!mg", name = "Db", descriptor = "Lclient!i;")
	public static Class41 aClass41_332 = aClass41_331;

	@OriginalMember(owner = "client!mg", name = "Jb", descriptor = "Lclient!i;")
	private static Class41 aClass41_334 = Static184.method2923("Loaded textures");

	@OriginalMember(owner = "client!mg", name = "Ib", descriptor = "Lclient!i;")
	public static Class41 aClass41_333 = aClass41_334;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(Z)V")
	public static void method796() {
		Static77.anInt1991 = -1;
		Static100.anInt2441 = 0;
		Static211.anInt4701 = -1;
		Static131.aClass2_Sub3_Sub1_2.anInt239 = 0;
		Static170.anInt3984 = 0;
		Static179.anInt4150 = 0;
		Static219.anInt4791 = 0;
		Static88.anInt2197 = -1;
		Static204.aClass2_Sub3_Sub1_3.anInt239 = 0;
		Static202.anInt1733 = 0;
		Static42.anInt229 = -1;
		Static102.anInt2490 = 0;
		Static94.aBoolean123 = false;
		for (@Pc(35) int local35 = 0; local35 < Static216.aClass12_Sub3_Sub1Array1.length; local35++) {
			if (Static216.aClass12_Sub3_Sub1Array1[local35] != null) {
				Static216.aClass12_Sub3_Sub1Array1[local35].anInt3943 = -1;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static199.aClass12_Sub3_Sub2Array1.length; local53++) {
			if (Static199.aClass12_Sub3_Sub2Array1[local53] != null) {
				Static199.aClass12_Sub3_Sub2Array1[local53].anInt3943 = -1;
			}
		}
		Static38.method801();
		Static116.method1955(30);
		for (@Pc(80) int local80 = 0; local80 < 100; local80++) {
			Static199.aBooleanArray23[local80] = true;
		}
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)I")
	public static int method798(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "([Lclient!i;B)[Lclient!i;")
	public static Class41[] method799(@OriginalArg(0) Class41[] arg0) {
		@Pc(4) Class41[] local4 = new Class41[5];
		for (@Pc(6) int local6 = 0; local6 < 5; local6++) {
			local4[local6] = Static149.method2324(new Class41[] { Static152.method2471(local6), Static152.aClass41_963 });
			if (arg0 != null && arg0[local6] != null) {
				local4[local6] = Static149.method2324(new Class41[] { local4[local6], arg0[local6] });
			}
		}
		return local4;
	}
}
