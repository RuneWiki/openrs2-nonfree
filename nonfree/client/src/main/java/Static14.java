import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "Z")
	public static boolean aBoolean153;

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "Lclient!lc;")
	public static Class98 aClass98_58;

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
	public static int anInt2097;

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "Z")
	public static boolean aBoolean154 = true;

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
	public static int anInt2091 = 0;

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
	public static int anInt2092 = 0;

	@OriginalMember(owner = "client!ba", name = "A", descriptor = "Lclient!cc;")
	public static Class22 aClass22_9 = null;

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "[[B")
	public static byte[][] aByteArrayArray10 = new byte[250][];

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)Z")
	public static boolean method1602() {
		try {
			if (Static42.anInt863 == 2) {
				if (Static196.aClass4_Sub18_2 == null) {
					Static196.aClass4_Sub18_2 = Static304.method2171(Static125.aClass98_78, Static297.anInt5500, Static150.anInt3042);
					if (Static196.aClass4_Sub18_2 == null) {
						return false;
					}
				}
				if (Static2.aClass102_1 == null) {
					Static2.aClass102_1 = new Class102(Static206.aClass98_125, Static182.aClass98_103);
				}
				if (Static67.aClass4_Sub9_Sub2_1.method1183(Static2.aClass102_1, Static196.aClass4_Sub18_2, Static137.aClass98_82)) {
					Static67.aClass4_Sub9_Sub2_1.method1188();
					Static67.aClass4_Sub9_Sub2_1.method1169(Static217.anInt4316);
					Static67.aClass4_Sub9_Sub2_1.method1174(Static147.aBoolean197, Static196.aClass4_Sub18_2);
					Static196.aClass4_Sub18_2 = null;
					Static42.anInt863 = 0;
					Static2.aClass102_1 = null;
					Static125.aClass98_78 = null;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static67.aClass4_Sub9_Sub2_1.method1208();
			Static196.aClass4_Sub18_2 = null;
			Static42.anInt863 = 0;
			Static125.aClass98_78 = null;
			Static2.aClass102_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[B)Lclient!wh;")
	public static Class4_Sub2_Sub12 method1603(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(20) Class4_Sub2_Sub12 local20;
		if (Static178.aBoolean216) {
			local20 = new Class4_Sub2_Sub12_Sub2(arg0, Static262.anIntArray439, Static100.anIntArray223, Static159.anIntArray285, Static46.anIntArray120, Static274.aByteArrayArray20);
		} else {
			local20 = new Class4_Sub2_Sub12_Sub1(arg0, Static262.anIntArray439, Static100.anIntArray223, Static159.anIntArray285, Static46.anIntArray120, Static274.aByteArrayArray20);
		}
		Static268.method4006();
		return local20;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)I")
	public static int method1604(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!tk;)[Lclient!jd;")
	public static Class76[] method1605(@OriginalArg(1) Class164 arg0) {
		if (!arg0.method3940()) {
			return new Class76[0];
		}
		@Pc(17) Class123 local17 = arg0.method3933();
		while (local17.anInt3791 == 0) {
			Static122.method2061(10L);
		}
		if (local17.anInt3791 == 2) {
			return new Class76[0];
		}
		@Pc(45) int[] local45 = (int[]) local17.anObject4;
		@Pc(51) Class76[] local51 = new Class76[local45.length >> 2];
		for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
			@Pc(61) Class76 local61 = new Class76();
			local51[local53] = local61;
			local61.anInt2653 = local45[local53 << 2];
			local61.anInt2645 = local45[(local53 << 2) + 1];
			local61.anInt2647 = local45[(local53 << 2) + 2];
			local61.anInt2649 = local45[(local53 << 2) + 3];
		}
		return local51;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)V")
	public static void method1607() {
		Static158.aClass33_27.method838(5);
		Static215.aClass33_31.method838(5);
		Static6.aClass33_2.method838(5);
		Static40.aClass33_5.method838(5);
	}

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)V")
	public static void method1608() {
		aByteArrayArray10 = null;
		aClass22_9 = null;
		aClass98_58 = null;
	}
}
