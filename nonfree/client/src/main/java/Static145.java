import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
	public static int anInt3068;

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "Lclient!sl;")
	public static final Class310 aClass310_11 = new Class310(16);

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_89 = new Class272(3, 1);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
	public static void method2748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) String arg6) {
		@Pc(11) Class9_Sub7 local11 = new Class9_Sub7();
		local11.anInt4267 = arg5;
		local11.anInt4268 = arg2;
		local11.aString56 = arg6;
		local11.anInt4266 = arg3;
		local11.anInt4271 = Static305.anInt5560 + arg1;
		local11.anInt4273 = arg0;
		local11.anInt4269 = arg4;
		Static479.aClass309_11.method6595(local11);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIBI)V")
	public static void method2749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static157.method2835(Static69.anInt1918, Static385.anInt6630, arg2);
		@Pc(17) int local17 = Static157.method2835(Static69.anInt1918, Static385.anInt6630, arg3);
		@Pc(23) int local23 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg0);
		@Pc(29) int local29 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg4);
		for (@Pc(35) int local35 = local11; local35 <= local17; local35++) {
			Static337.method5150(local29, arg1, local23, Static176.anIntArrayArray28[local35]);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
	public static void method2750() {
		if (Static4.aClass43_1 == null) {
			return;
		}
		Static120.aClass309_5.method6588();
		Static125.method2539();
		Static79.method1727();
		Static582.method7701();
		Static388.method5728();
		Static524.method6965();
		if (Static461.aClass242_1 != null) {
			Static461.aClass242_1.method5528();
		}
		Static355.method5322();
		Static65.method1513();
		Static230.method3915();
		Static551.method7382();
		Static81.method1765(false);
		for (@Pc(38) int local38 = 0; local38 < 2048; local38++) {
			@Pc(44) Class9_Sub1_Sub1_Sub2_Sub2 local44 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local38];
			if (local44 != null) {
				for (@Pc(48) int local48 = 0; local48 < local44.aClass57Array3.length; local48++) {
					local44.aClass57Array3[local48] = null;
				}
			}
		}
		for (@Pc(67) int local67 = 0; local67 < Static568.anInt9131; local67++) {
			@Pc(74) Class9_Sub1_Sub1_Sub2_Sub1 local74 = Static341.aClass3_Sub39Array1[local67].aClass9_Sub1_Sub1_Sub2_Sub1_2;
			if (local74 != null) {
				for (@Pc(78) int local78 = 0; local78 < local74.aClass57Array3.length; local78++) {
					local74.aClass57Array3[local78] = null;
				}
			}
		}
		Static315.aClass109_4 = null;
		Static328.aClass109_5 = null;
		Static4.aClass43_1.method7179();
		Static4.aClass43_1 = null;
	}
}
