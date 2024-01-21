import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "[I")
	public static int[] anIntArray274;

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
	public static int anInt2380;

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "[Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array13;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "Lclient!ec;")
	public static Class22 aClass22_686 = Static60.method1113("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "Lclient!ja;")
	public static Class33 aClass33_27 = new Class33(64);

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
	public static int anInt2382 = 0;

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "Lclient!ec;")
	private static Class22 aClass22_688 = Static60.method1113("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "Lclient!ec;")
	public static Class22 aClass22_687 = aClass22_688;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
	public static void method1570() {
		@Pc(10) int local10 = Static133.aClass4_Sub11_Sub1_3.method748(8);
		@Pc(19) int local19;
		if (Static51.anInt1461 > local10) {
			for (local19 = local10; local19 < Static51.anInt1461; local19++) {
				Static23.anIntArray60[Static84.anInt2252++] = Static115.anIntArray310[local19];
			}
		}
		if (Static51.anInt1461 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static51.anInt1461 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(57) int local57 = Static115.anIntArray310[local19];
			@Pc(61) Class4_Sub1_Sub3_Sub2_Sub1 local61 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local57];
			@Pc(66) int local66 = Static133.aClass4_Sub11_Sub1_3.method748(1);
			if (local66 == 0) {
				Static115.anIntArray310[Static51.anInt1461++] = local57;
				local61.anInt2475 = Static117.anInt2877;
			} else {
				@Pc(89) int local89 = Static133.aClass4_Sub11_Sub1_3.method748(2);
				if (local89 == 0) {
					Static115.anIntArray310[Static51.anInt1461++] = local57;
					local61.anInt2475 = Static117.anInt2877;
					Static51.anIntArray146[Static50.anInt1405++] = local57;
				} else {
					@Pc(133) int local133;
					@Pc(143) int local143;
					if (local89 == 1) {
						Static115.anIntArray310[Static51.anInt1461++] = local57;
						local61.anInt2475 = Static117.anInt2877;
						local133 = Static133.aClass4_Sub11_Sub1_3.method748(3);
						local61.method1608(local133, false);
						local143 = Static133.aClass4_Sub11_Sub1_3.method748(1);
						if (local143 == 1) {
							Static51.anIntArray146[Static50.anInt1405++] = local57;
						}
					} else if (local89 == 2) {
						Static115.anIntArray310[Static51.anInt1461++] = local57;
						local61.anInt2475 = Static117.anInt2877;
						local133 = Static133.aClass4_Sub11_Sub1_3.method748(3);
						local61.method1608(local133, true);
						local143 = Static133.aClass4_Sub11_Sub1_3.method748(3);
						local61.method1608(local143, true);
						@Pc(197) int local197 = Static133.aClass4_Sub11_Sub1_3.method748(1);
						if (local197 == 1) {
							Static51.anIntArray146[Static50.anInt1405++] = local57;
						}
					} else if (local89 == 3) {
						Static23.anIntArray60[Static84.anInt2252++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!ea;I)V")
	public static void method1571(@OriginalArg(0) Class20 arg0) {
		Static107.aClass20_51 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
	public static void method1572() {
		aClass4_Sub1_Sub2_Sub2Array13 = null;
		aClass33_27 = null;
		aClass22_688 = null;
		aClass22_687 = null;
		aClass22_686 = null;
		anIntArray274 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(JI)Lclient!ec;")
	public static Class22 method1575(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) long local34 = arg0; local34 != 0L; local34 /= 37L) {
				local32++;
			}
			@Pc(48) byte[] local48 = new byte[local32];
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local32--;
				local48[local32] = Static25.aByteArray6[(int) (local52 - arg0 * 37L)];
			}
			@Pc(79) Class22 local79 = new Class22();
			local79.aByteArray7 = local48;
			local79.anInt668 = local48.length;
			return local79;
		}
	}
}
