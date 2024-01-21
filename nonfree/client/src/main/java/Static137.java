import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
	public static int anInt3248;

	@OriginalMember(owner = "client!qa", name = "F", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!qa", name = "L", descriptor = "I")
	public static int anInt3251;

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "[I")
	public static int[] anIntArray312;

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_42 = new Class66(64);

	@OriginalMember(owner = "client!qa", name = "G", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1196 = Static177.method3050("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!qa", name = "J", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1198 = Static177.method3050(" from your friend list first)3");

	@OriginalMember(owner = "client!qa", name = "H", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1197 = aClass46_1198;

	@OriginalMember(owner = "client!qa", name = "P", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1199 = aClass46_1196;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!la;ILclient!ud;B)V")
	public static void method2392(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62_Sub1 arg2) {
		@Pc(11) Class4_Sub19 local11 = new Class4_Sub19();
		local11.aClass62_Sub1_74 = arg2;
		local11.aClass52_2 = arg0;
		local11.aLong148 = arg1;
		local11.anInt3183 = 1;
		@Pc(30) Class11 local30 = Static166.aClass11_15;
		synchronized (Static166.aClass11_15) {
			Static166.aClass11_15.method272(local11);
		}
		Static124.method2213();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)Lclient!ca;")
	public static Class4_Sub1_Sub4 method2394(@OriginalArg(0) int arg0) {
		@Pc(6) Class4_Sub1_Sub4 local6 = (Class4_Sub1_Sub4) aClass66_42.method2225((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(29) byte[] local29 = Static136.aClass62_34.method2878(Static81.method1612(arg0), Static59.method1125(arg0));
		local6 = new Class4_Sub1_Sub4();
		if (local29 != null) {
			local6.method345(new Class4_Sub11(local29));
		}
		local6.method351();
		aClass66_42.method2222(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
	public static void method2395() {
		@Pc(14) int local14 = Static162.aClass4_Sub11_Sub1_3.method1288(8);
		@Pc(19) int local19;
		if (local14 < Static126.anInt3006) {
			for (local19 = local14; local19 < Static126.anInt3006; local19++) {
				Static130.anIntArray291[Static82.anInt2114++] = Static167.anIntArray369[local19];
			}
		}
		if (Static126.anInt3006 < local14) {
			throw new RuntimeException("gppov1");
		}
		Static126.anInt3006 = 0;
		for (local19 = 0; local19 < local14; local19++) {
			@Pc(57) int local57 = Static167.anIntArray369[local19];
			@Pc(61) Class4_Sub1_Sub1_Sub1_Sub1 local61 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local57];
			@Pc(66) int local66 = Static162.aClass4_Sub11_Sub1_3.method1288(1);
			if (local66 == 0) {
				Static167.anIntArray369[Static126.anInt3006++] = local57;
				local61.anInt2830 = Static142.anInt3325;
			} else {
				@Pc(86) int local86 = Static162.aClass4_Sub11_Sub1_3.method1288(2);
				if (local86 == 0) {
					Static167.anIntArray369[Static126.anInt3006++] = local57;
					local61.anInt2830 = Static142.anInt3325;
					Static121.anIntArray276[Static182.anInt4082++] = local57;
				} else {
					@Pc(133) int local133;
					@Pc(143) int local143;
					if (local86 == 1) {
						Static167.anIntArray369[Static126.anInt3006++] = local57;
						local61.anInt2830 = Static142.anInt3325;
						local133 = Static162.aClass4_Sub11_Sub1_3.method1288(3);
						local61.method2119(local133, false);
						local143 = Static162.aClass4_Sub11_Sub1_3.method1288(1);
						if (local143 == 1) {
							Static121.anIntArray276[Static182.anInt4082++] = local57;
						}
					} else if (local86 == 2) {
						Static167.anIntArray369[Static126.anInt3006++] = local57;
						local61.anInt2830 = Static142.anInt3325;
						local133 = Static162.aClass4_Sub11_Sub1_3.method1288(3);
						local61.method2119(local133, true);
						local143 = Static162.aClass4_Sub11_Sub1_3.method1288(3);
						local61.method2119(local143, true);
						@Pc(195) int local195 = Static162.aClass4_Sub11_Sub1_3.method1288(1);
						if (local195 == 1) {
							Static121.anIntArray276[Static182.anInt4082++] = local57;
						}
					} else if (local86 == 3) {
						Static130.anIntArray291[Static82.anInt2114++] = local57;
					}
				}
			}
		}
	}
}
