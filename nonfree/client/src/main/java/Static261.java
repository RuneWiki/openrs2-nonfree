import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!ka", name = "M", descriptor = "[[I")
	public static int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_29 = new Class33(14, 1);

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_30 = new Class33(15, 4);

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_31 = new Class33(16, -2);

	@OriginalMember(owner = "client!ka", name = "A", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_32 = new Class33(17, 0);

	@OriginalMember(owner = "client!ka", name = "B", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_33 = new Class33(18, -2);

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_34 = new Class33(19, -2);

	@OriginalMember(owner = "client!ka", name = "D", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_35 = new Class33(20, 6);

	@OriginalMember(owner = "client!ka", name = "E", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_36 = new Class33(21, 9);

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_37 = new Class33(22, -2);

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_38 = new Class33(23, 4);

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_39 = new Class33(24, -1);

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_40 = new Class33(25, -2);

	@OriginalMember(owner = "client!ka", name = "J", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_41 = new Class33(26, 0);

	@OriginalMember(owner = "client!ka", name = "K", descriptor = "Lclient!bn;")
	public static final Class33 aClass33_42 = new Class33(27, 0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)V")
	public static void method3819(@OriginalArg(0) boolean arg0) {
		while (true) {
			if (Static89.aClass3_Sub7_Sub1_2.method1495(Static79.anInt10464) >= 15) {
				@Pc(12) int local12 = Static89.aClass3_Sub7_Sub1_2.method1499(15);
				if (local12 != 32767) {
					@Pc(17) boolean local17 = false;
					@Pc(24) Class3_Sub46 local24 = (Class3_Sub46) Static331.aClass25_25.method946((long) local12);
					@Pc(30) Class2_Sub2_Sub1_Sub2 local30;
					if (local24 == null) {
						local30 = new Class2_Sub2_Sub1_Sub2();
						local30.anInt7603 = local12;
						local24 = new Class3_Sub46(local30);
						Static331.aClass25_25.method945(local24, (long) local12);
						local17 = true;
						Static60.aClass3_Sub46Array1[Static17.anInt6046++] = local24;
					}
					local30 = local24.aClass2_Sub2_Sub1_Sub2_2;
					Static304.anIntArray377[Static268.anInt5680++] = local12;
					local30.anInt7628 = Static129.anInt10429;
					if (local30.aClass169_1 != null && local30.aClass169_1.method4176()) {
						Static432.method4773(local30);
					}
					@Pc(86) int local86 = Static89.aClass3_Sub7_Sub1_2.method1499(1);
					@Pc(91) int local91 = Static89.aClass3_Sub7_Sub1_2.method1499(1);
					if (local91 == 1) {
						Static139.anIntArray206[Static452.anInt3253++] = local12;
					}
					@Pc(111) int local111;
					if (arg0) {
						local111 = Static89.aClass3_Sub7_Sub1_2.method1499(8);
						if (local111 > 127) {
							local111 -= 256;
						}
					} else {
						local111 = Static89.aClass3_Sub7_Sub1_2.method1499(5);
						if (local111 > 15) {
							local111 -= 32;
						}
					}
					@Pc(134) int local134 = Static89.aClass3_Sub7_Sub1_2.method1499(2);
					local30.method6322(Static121.aClass118_2.method3029(Static89.aClass3_Sub7_Sub1_2.method1499(14)));
					@Pc(151) int local151;
					if (arg0) {
						local151 = Static89.aClass3_Sub7_Sub1_2.method1499(8);
						if (local151 > 127) {
							local151 -= 256;
						}
					} else {
						local151 = Static89.aClass3_Sub7_Sub1_2.method1499(5);
						if (local151 > 15) {
							local151 -= 32;
						}
					}
					@Pc(182) int local182 = Static89.aClass3_Sub7_Sub1_2.method1499(3) + 4 << 11 & 0x3F0F;
					local30.method6315(local30.aClass169_1.anInt4979);
					local30.anInt7591 = local30.aClass169_1.anInt4970 << 3;
					if (local17) {
						local30.method6301(local182, true);
					}
					local30.method6320(local30.method6311(), local111 + Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray488[0], Static443.aClass2_Sub2_Sub1_Sub1_2.anIntArray487[0] + local151, local86 == 1, local134);
					if (local30.aClass169_1.method4176()) {
						Static93.method2098(local30.anIntArray487[0], null, local30, 0, null, local30.aByte103, local30.anIntArray488[0]);
					}
					continue;
				}
			}
			Static89.aClass3_Sub7_Sub1_2.method1491();
			return;
		}
	}
}
