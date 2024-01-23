import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!oh", name = "Q", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!oh", name = "Y", descriptor = "I")
	public static int anInt3423 = 0;

	@OriginalMember(owner = "client!oh", name = "ab", descriptor = "I")
	public static int anInt3424 = 0;

	@OriginalMember(owner = "client!oh", name = "jb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_626 = Static199.method3560("Wordpack geladen)3");

	@OriginalMember(owner = "client!oh", name = "nb", descriptor = "Lclient!he;")
	public static Class44 aClass44_39 = new Class44();

	@OriginalMember(owner = "client!oh", name = "ob", descriptor = "I")
	public static int anInt3435 = 0;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!oe;I)I")
	public static int method2680(@OriginalArg(0) Class72 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method3175(Static131.anInt2978)) {
			local5++;
		}
		if (arg0.method3175(Static64.anInt1249)) {
			local5++;
		}
		if (arg0.method3175(Static19.anInt362)) {
			local5++;
		}
		if (arg0.method3175(Static154.anInt3543)) {
			local5++;
		}
		if (arg0.method3175(Static28.anInt502)) {
			local5++;
		}
		if (arg0.method3175(Static48.anInt870)) {
			local5++;
		}
		if (arg0.method3175(Static23.anInt420)) {
			local5++;
		}
		if (arg0.method3175(Static35.anInt584)) {
			local5++;
		}
		if (arg0.method3175(Static213.anInt2030)) {
			local5++;
		}
		if (arg0.method3175(Static178.anInt4146)) {
			local5++;
		}
		if (arg0.method3175(Static199.anInt4490)) {
			local5++;
		}
		if (arg0.method3175(Static226.anInt4897)) {
			local5++;
		}
		if (arg0.method3175(Static111.anInt2450)) {
			local5++;
		}
		local5++;
		if (arg0.method3175(Static108.anInt2401)) {
			local5++;
		}
		if (arg0.method3175(Static116.anInt2728)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V")
	public static void method2684() {
		Static216.anInt4727 = 0;
		Static189.anInt4412 = -1;
		Static2.anInt44 = 0;
		Static138.anInt3182 = 0;
		Static145.anInt3288 = 0;
		Static200.anInt4496 = -1;
		Static152.anInt3520 = 0;
		Static21.anInt401 = -1;
		Static161.aClass2_Sub23_Sub1_5.anInt2703 = 0;
		Static139.aClass2_Sub23_Sub1_4.anInt2703 = 0;
		Static202.aBoolean194 = false;
		Static181.anInt4200 = -1;
		Static8.anInt268 = 0;
		for (@Pc(43) int local43 = 0; local43 < Static213.aClass5_Sub2_Sub2Array3.length; local43++) {
			if (Static213.aClass5_Sub2_Sub2Array3[local43] != null) {
				Static213.aClass5_Sub2_Sub2Array3[local43].anInt1841 = -1;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < Static95.aClass5_Sub2_Sub1Array1.length; local61++) {
			if (Static95.aClass5_Sub2_Sub1Array1[local61] != null) {
				Static95.aClass5_Sub2_Sub1Array1[local61].anInt1841 = -1;
			}
		}
		Static20.method285();
		Static145.anInt3290 = 1;
		Static125.method1281(30);
		for (@Pc(90) int local90 = 0; local90 < 100; local90++) {
			Static165.aBooleanArray111[local90] = true;
		}
		Static159.aClass44_50.method1362();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!je;I)V")
	public static void method2685(@OriginalArg(0) Class52 arg0) {
		Static226.aClass52_1 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)V")
	public static void method2686(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class2_Sub7 local12 = (Class2_Sub7) Static108.aClass103_13.method3668(); local12 != null; local12 = (Class2_Sub7) Static108.aClass103_13.method3666()) {
			if ((local12.aLong188 >> 48 & 0xFFFFL) == (long) arg0) {
				local12.method3986();
			}
		}
	}
}
