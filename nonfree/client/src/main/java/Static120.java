import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!lc", name = "W", descriptor = "[Lclient!pg;")
	public static Class64[] aClass64Array3;

	@OriginalMember(owner = "client!lc", name = "N", descriptor = "Lclient!jd;")
	public static Class61 aClass61_50 = new Class61(64);

	@OriginalMember(owner = "client!lc", name = "U", descriptor = "Z")
	public static boolean aBoolean225 = false;

	@OriginalMember(owner = "client!lc", name = "Y", descriptor = "Lclient!sc;")
	public static Class107 aClass107_717 = Static231.method3737("Freie Welt");

	@OriginalMember(owner = "client!lc", name = "cb", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_3 = new CRC32();

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!jb;B)V")
	public static void method2069(@OriginalArg(0) Class28 arg0) {
		Static213.aClass64_Sub1Array10 = Static191.method3122(arg0, Static192.anInt4251);
		Static63.aClass64_Sub1Array4 = new Class64_Sub1[Static213.aClass64_Sub1Array10.length];
		Static201.aClass64_Sub1Array9 = new Class64_Sub1[Static213.aClass64_Sub1Array10.length];
		Static37.aClass64_Sub1Array1 = new Class64_Sub1[Static213.aClass64_Sub1Array10.length];
		for (@Pc(29) int local29 = 0; local29 < Static213.aClass64_Sub1Array10.length; local29++) {
			Static213.aClass64_Sub1Array10[local29].method1881();
			Static63.aClass64_Sub1Array4[local29] = Static213.aClass64_Sub1Array10[local29].method1875();
			Static213.aClass64_Sub1Array10[local29].method1881();
			Static201.aClass64_Sub1Array9[local29] = Static213.aClass64_Sub1Array10[local29].method1875();
			Static213.aClass64_Sub1Array10[local29].method1881();
			Static37.aClass64_Sub1Array1[local29] = Static213.aClass64_Sub1Array10[local29].method1875();
			Static213.aClass64_Sub1Array10[local29].method1881();
		}
		Static61.aClass1_Sub2_Sub2_Sub1Array1 = Static21.method392(arg0, Static112.anInt2481);
		Static110.aClass1_Sub2_Sub2Array6 = Static141.method2352(arg0, Static194.anInt4291);
		Static72.aClass1_Sub2_Sub2Array4 = Static141.method2352(arg0, Static113.anInt2492);
		Static122.aClass1_Sub2_Sub2Array8 = Static141.method2352(arg0, Static184.anInt4143);
		Static151.aClass1_Sub2_Sub2Array9 = Static141.method2352(arg0, Static87.anInt1915);
		Static23.aClass1_Sub2_Sub2Array2 = Static80.method1380(Static219.anInt4794, arg0);
		Static116.aClass1_Sub2_Sub2Array7 = Static80.method1380(Static18.anInt381, arg0);
		Static180.aClass1_Sub2_Sub2_104 = Static6.method2299(Static228.anInt4954, arg0);
		Static201.aClass1_Sub2_Sub2Array10 = Static80.method1380(Static37.anInt768, arg0);
		Static77.aClass1_Sub2_Sub2Array5 = Static80.method1380(Static81.anInt1776, arg0);
		Static131.aClass64Array4 = Static48.method937(Static52.anInt1318, arg0);
		Static93.aClass64Array2 = Static48.method937(Static156.anInt3427, arg0);
		Static64.aClass1_Sub2_Sub15_2.method3338(Static93.aClass64Array2, null);
		Static23.aClass1_Sub2_Sub15_1.method3338(Static93.aClass64Array2, null);
		Static175.aClass1_Sub2_Sub15_3.method3338(Static93.aClass64Array2, null);
		@Pc(167) Class1_Sub2_Sub2_Sub1 local167 = Static113.method1955(arg0, Static194.anInt4292);
		local167.method198();
		Static158.aClass1_Sub2_Sub2_68 = local167;
		@Pc(177) Class1_Sub2_Sub2_Sub1[] local177 = Static21.method392(arg0, Static215.anInt4671);
		for (@Pc(179) int local179 = 0; local179 < local177.length; local179++) {
			local177[local179].method198();
		}
		Static11.aClass1_Sub2_Sub2Array1 = local177;
		@Pc(203) int local203 = (int) (Math.random() * 21.0D) - 10;
		@Pc(210) int local210 = (int) (Math.random() * 21.0D) - 10;
		@Pc(217) int local217 = (int) (Math.random() * 21.0D) - 10;
		@Pc(224) int local224 = (int) (Math.random() * 41.0D) - 20;
		for (@Pc(226) int local226 = 0; local226 < Static61.aClass1_Sub2_Sub2_Sub1Array1.length; local226++) {
			Static61.aClass1_Sub2_Sub2_Sub1Array1[local226].method199(local217 + local224, local224 + local203, local224 + local210);
		}
		Static213.aClass64_Sub1Array10[0].method1874(local217 + local224, local203 - -local224, local224 + local210);
		Static23.aClass1_Sub2_Sub2Array3 = Static61.aClass1_Sub2_Sub2_Sub1Array1;
	}

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
	public static void method2070() {
		Static81.aClass61_27.method1689();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZLclient!ng;)V")
	public static void method2071(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class82 arg1) {
		if (Static137.aClass82_2 != null) {
			try {
				Static137.aClass82_2.method2395();
			} catch (@Pc(8) Exception local8) {
			}
			Static137.aClass82_2 = null;
		}
		Static137.aClass82_2 = arg1;
		Static87.method1497(arg0);
		Static191.aClass1_Sub2_Sub12_1 = null;
		Static141.anInt3122 = 0;
		Static169.aClass1_Sub26_5.anInt4021 = 0;
		Static158.aClass1_Sub26_4 = null;
		while (true) {
			@Pc(37) Class1_Sub2_Sub12 local37 = (Class1_Sub2_Sub12) Static195.aClass50_25.method1358();
			if (local37 == null) {
				while (true) {
					local37 = (Class1_Sub2_Sub12) Static106.aClass50_16.method1358();
					if (local37 == null) {
						if (Static191.aByte16 != 0) {
							try {
								@Pc(89) Class1_Sub26 local89 = new Class1_Sub26(4);
								local89.method2967(4);
								local89.method2967(Static191.aByte16);
								local89.method2963(0);
								Static137.aClass82_2.method2399(4, local89.aByteArray52);
							} catch (@Pc(110) IOException local110) {
								try {
									Static137.aClass82_2.method2395();
								} catch (@Pc(115) Exception local115) {
								}
								Static137.aClass82_2 = null;
								Static171.anInt3714++;
							}
						}
						Static118.anInt2613 = 0;
						Static161.aLong130 = Static209.method3309();
						return;
					}
					Static25.aClass85_2.method2423(local37);
					Static64.aClass50_11.method1362(local37.aLong177, local37);
					Static19.anInt399++;
					Static215.anInt4674--;
				}
			}
			Static83.aClass50_12.method1362(local37.aLong177, local37);
			Static76.anInt1703++;
			Static79.anInt1742--;
		}
	}
}
