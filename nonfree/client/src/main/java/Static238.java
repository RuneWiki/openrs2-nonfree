import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
	public static int anInt3979 = -1;

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "[I")
	public static final int[] anIntArray294 = new int[1000];

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "Lclient!ps;")
	public static Class273 aClass273_6 = null;

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
	public static int anInt3981 = 0;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V")
	public static void method3426() {
		Static484.method6237();
		Static593.anInt9634 = 0;
		Static511.aClass349_152 = null;
		Static361.aClass2_Sub7_Sub2_1.anInt5186 = 0;
		Static577.aClass349_162 = null;
		Static149.aClass349_37 = null;
		Static154.aClass349_41 = null;
		Static528.anInt8479 = 0;
		Static210.anInt3053 = 0;
		Static136.method1879();
		Static176.method2279();
		for (@Pc(38) int local38 = 0; local38 < 2048; local38++) {
			Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local38] = null;
		}
		Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30 = null;
		for (@Pc(52) int local52 = 0; local52 < Static51.anInt912; local52++) {
			@Pc(59) Class12_Sub2_Sub1_Sub4_Sub2 local59 = Static379.aClass2_Sub5Array1[local52].aClass12_Sub2_Sub1_Sub4_Sub2_1;
			if (local59 != null) {
				local59.anInt8424 = -1;
			}
		}
		Static497.method6444();
		Static203.anInt2978 = -1;
		Static148.anInt2359 = -1;
		Static489.anInt7763 = 1;
		Static115.method1686(10);
		for (@Pc(81) int local81 = 0; local81 < 100; local81++) {
			Static255.aBooleanArray17[local81] = true;
		}
		Static499.method6471();
		Static537.aLong247 = 0L;
		Static535.aClass2_Sub8_2 = null;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IB)V")
	public static void method3427(@OriginalArg(0) int arg0) {
		Static88.anInt1491 = arg0;
		Static409.aClass21_59.method313();
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
	public static void method3428() {
		Static316.aClass38_27 = null;
		Static5.aClass38_1 = null;
		Static348.aClass38_29 = null;
		Static349.aClass38_31 = null;
		Static86.aClass38_8 = null;
		Static25.aClass38_5 = null;
		Static369.aClass38_43 = null;
		Static412.aClass38_30 = null;
		Static389.aClass38Array21 = null;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILclient!u;)V")
	public static void method3429(@OriginalArg(1) Class12_Sub2_Sub1_Sub4_Sub2 arg0) {
		for (@Pc(13) Class2_Sub40 local13 = (Class2_Sub40) Static524.aClass70_58.method1264(); local13 != null; local13 = (Class2_Sub40) Static524.aClass70_58.method1261()) {
			if (arg0 == local13.aClass12_Sub2_Sub1_Sub4_Sub2_2) {
				if (local13.aClass2_Sub3_Sub3_2 != null) {
					Static246.aClass2_Sub3_Sub4_2.method6705(local13.aClass2_Sub3_Sub3_2);
					local13.aClass2_Sub3_Sub3_2 = null;
				}
				local13.method7657();
				return;
			}
		}
	}
}
