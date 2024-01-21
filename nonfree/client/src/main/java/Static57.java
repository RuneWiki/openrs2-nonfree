import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!g", name = "lc", descriptor = "Z")
	public static boolean aBoolean70;

	@OriginalMember(owner = "client!g", name = "gc", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[104][104];

	@OriginalMember(owner = "client!g", name = "hc", descriptor = "I")
	public static int anInt1304 = 0;

	@OriginalMember(owner = "client!g", name = "ic", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_448 = Static161.method2452("_");

	@OriginalMember(owner = "client!g", name = "nc", descriptor = "I")
	public static int anInt1307 = 0;

	@OriginalMember(owner = "client!g", name = "pc", descriptor = "I")
	public static int anInt1309 = 1;

	@OriginalMember(owner = "client!g", name = "qc", descriptor = "[Lclient!ce;")
	public static final Class5_Sub6[] aClass5_Sub6Array1 = new Class5_Sub6[2048];

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!mf;I)Z")
	public static boolean method993(@OriginalArg(0) Class69 arg0) {
		if (arg0.anInt2550 == 205) {
			Static170.anInt3428 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(I)V")
	public static void method994() {
		if (Static30.aClass15_1 != null) {
			@Pc(3) Class15 local3 = Static30.aClass15_1;
			synchronized (Static30.aClass15_1) {
				Static30.aClass15_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lclient!mi;")
	public static Class5_Sub2_Sub12 method995(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub2_Sub12 local10 = (Class5_Sub2_Sub12) Static32.aClass8_9.method227((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(30) byte[] local30;
		if (arg0 >= 32768) {
			local30 = Static30.aClass23_17.method738(arg0 & 0x7FFF, 1);
		} else {
			local30 = Static70.aClass23_29.method738(arg0, 1);
		}
		local10 = new Class5_Sub2_Sub12();
		if (local30 != null) {
			local10.method1936(new Class5_Sub6(local30));
		}
		Static32.aClass8_9.method232((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!he;IZ)V")
	public static void method996(@OriginalArg(0) Class39 arg0, @OriginalArg(2) boolean arg1) {
		if (Static146.aClass39_2 != null) {
			try {
				Static146.aClass39_2.method1175();
			} catch (@Pc(12) Exception local12) {
			}
			Static146.aClass39_2 = null;
		}
		Static146.aClass39_2 = arg0;
		Static17.method285(arg1);
		Static101.anInt2162 = 0;
		Static3.aClass5_Sub2_Sub26_1 = null;
		Static144.aClass5_Sub6_2.anInt4050 = 0;
		Static52.aClass5_Sub6_1 = null;
		while (true) {
			@Pc(33) Class5_Sub2_Sub26 local33 = (Class5_Sub2_Sub26) Static86.aClass75_9.method2067();
			if (local33 == null) {
				while (true) {
					local33 = (Class5_Sub2_Sub26) Static178.aClass75_14.method2067();
					if (local33 == null) {
						if (Static189.aByte12 != 0) {
							try {
								@Pc(88) Class5_Sub6 local88 = new Class5_Sub6(4);
								local88.method3061(4);
								local88.method3061(Static189.aByte12);
								local88.method3044(0);
								Static146.aClass39_2.method1176(4, local88.aByteArray56);
							} catch (@Pc(111) IOException local111) {
								try {
									Static146.aClass39_2.method1175();
								} catch (@Pc(116) Exception local116) {
								}
								Static103.anInt2175++;
								Static146.aClass39_2 = null;
							}
						}
						Static119.anInt2509 = 0;
						Static46.aLong56 = Static188.method2822();
						return;
					}
					Static217.aClass32_2.method922(local33);
					Static59.aClass75_6.method2069(local33, local33.aLong253);
					Static129.anInt2691++;
					Static201.anInt1746--;
				}
			}
			Static18.aClass75_2.method2069(local33, local33.aLong253);
			Static9.anInt210--;
			Static26.anInt4032++;
		}
	}
}
