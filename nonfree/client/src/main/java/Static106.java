import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!kh", name = "db", descriptor = "I")
	public static int anInt2394;

	@OriginalMember(owner = "client!kh", name = "gb", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!kh", name = "U", descriptor = "Z")
	public static boolean aBoolean111 = false;

	@OriginalMember(owner = "client!kh", name = "W", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_815 = Static151.method2243("Starte 3D)2Softwarebibliothek)3");

	@OriginalMember(owner = "client!kh", name = "X", descriptor = "Z")
	public static boolean aBoolean112 = false;

	@OriginalMember(owner = "client!kh", name = "hb", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_816 = Static151.method2243("Username: ");

	@OriginalMember(owner = "client!kh", name = "kb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_817 = aClass62_816;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V")
	public static void method1669() {
		try {
			if (Static35.anInt841 == 1) {
				@Pc(16) int local16 = Static30.aClass2_Sub2_Sub1_1.method372();
				if (local16 > 0 && Static30.aClass2_Sub2_Sub1_1.method374()) {
					local16 -= Static59.anInt1222;
					if (local16 < 0) {
						local16 = 0;
					}
					Static30.aClass2_Sub2_Sub1_1.method358(local16);
				} else {
					Static30.aClass2_Sub2_Sub1_1.method387();
					Static30.aClass2_Sub2_Sub1_1.method366();
					Static173.aClass2_Sub16_1 = null;
					if (Static21.aClass71_3 == null) {
						Static35.anInt841 = 0;
					} else {
						Static35.anInt841 = 2;
					}
					Static97.aClass30_1 = null;
				}
			}
		} catch (@Pc(55) Exception local55) {
			local55.printStackTrace();
			Static30.aClass2_Sub2_Sub1_1.method387();
			Static21.aClass71_3 = null;
			Static35.anInt841 = 0;
			Static173.aClass2_Sub16_1 = null;
			Static97.aClass30_1 = null;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)Lclient!bi;")
	public static Class2_Sub1_Sub3 method1670(@OriginalArg(0) int arg0) {
		@Pc(6) Class2_Sub1_Sub3 local6 = (Class2_Sub1_Sub3) Static78.aClass53_4.method1648((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static114.aClass71_22.method2130(27, arg0);
		local6 = new Class2_Sub1_Sub3();
		if (local25 != null) {
			local6.method329(new Class2_Sub11(local25));
		}
		Static78.aClass53_4.method1645((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(III)I")
	public static int method1671(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 >> 31 & arg0 - 1;
		return local16 + (arg1 + (arg1 >>> 31)) % arg0;
	}

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)V")
	public static void method1672() {
		Static187.aClass13_16 = new Class13();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II[Lclient!ii;)V")
	public static void method1674(@OriginalArg(1) int arg0, @OriginalArg(2) Class47[] arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg1.length; local15++) {
			@Pc(21) Class47 local21 = arg1[local15];
			if (local21 != null && local21.anInt1877 == arg0 && (!local21.aBoolean95 || !Static85.method1204(local21))) {
				if (local21.anInt1870 == 0) {
					if (!local21.aBoolean95 && Static85.method1204(local21) && Static6.aClass47_1 != local21) {
						continue;
					}
					method1674(local21.anInt1886, arg1);
					if (local21.aClass47Array1 != null) {
						method1674(local21.anInt1886, local21.aClass47Array1);
					}
					@Pc(72) Class2_Sub7 local72 = (Class2_Sub7) Static49.aClass58_7.method1704((long) local21.anInt1886);
					if (local72 != null) {
						Static190.method2726(local72.anInt1410);
					}
				}
				if (local21.anInt1870 == 6) {
					@Pc(101) int local101;
					if (local21.anInt1842 != -1 || local21.anInt1883 != -1) {
						@Pc(96) boolean local96 = Static96.method1460(local21);
						if (local96) {
							local101 = local21.anInt1883;
						} else {
							local101 = local21.anInt1842;
						}
						if (local101 != -1) {
							@Pc(114) Class2_Sub1_Sub25 local114 = Static90.method27(local101);
							if (local114 != null) {
								local21.anInt1898 += Static103.anInt2221;
								while (local114.anIntArray389[local21.anInt1869] < local21.anInt1898) {
									local21.anInt1898 -= local114.anIntArray389[local21.anInt1869];
									local21.anInt1869++;
									if (local114.anIntArray392.length <= local21.anInt1869) {
										local21.anInt1869 -= local114.anInt4368;
										if (local21.anInt1869 < 0 || local114.anIntArray392.length <= local21.anInt1869) {
											local21.anInt1869 = 0;
										}
									}
									Static165.method2410(local21);
								}
							}
						}
					}
					if (local21.anInt1866 != 0 && !local21.aBoolean95) {
						@Pc(197) int local197 = local21.anInt1866 >> 16;
						local101 = local21.anInt1866 << 16 >> 16;
						@Pc(208) int local208 = local197 * Static103.anInt2221;
						local21.anInt1863 = local208 + local21.anInt1863 & 0x7FF;
						local101 *= Static103.anInt2221;
						local21.anInt1859 = local21.anInt1859 + local101 & 0x7FF;
						Static165.method2410(local21);
					}
				}
			}
		}
	}
}
