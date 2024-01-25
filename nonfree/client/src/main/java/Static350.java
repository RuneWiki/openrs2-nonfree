import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
	public static int anInt6571 = 2;

	@OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
	public static int anInt6572 = 0;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BLclient!faa;Lclient!oa;)V")
	public static void method5307(@OriginalArg(1) Class97 arg0, @OriginalArg(2) Class90 arg1) {
		@Pc(31) boolean local31 = Static119.aClass244_4.method5712(arg0.aBoolean201 ? Static461.aClass15_Sub2_Sub4_Sub2_2.aClass212_1 : null, arg0.anInt2634, arg1, arg0.anInt2689, arg0.anInt2607, arg0.anInt2647 | 0xFF000000, arg0.anInt2660) == null;
		if (local31) {
			Static212.aClass298_207.method6812(new Class6_Sub9(arg0.anInt2607, arg0.anInt2660, arg0.anInt2634, arg0.anInt2647 | 0xFF000000, arg0.anInt2689, arg0.aBoolean201));
			Static479.method6666(arg0);
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	public static void method5308() {
		if (Static554.aClass90_12 == null) {
			return;
		}
		Static260.aClass349_8.method7897();
		Static61.method883();
		Static299.method4522();
		Static409.method5886();
		Static308.method4620();
		Static421.method5969();
		if (Static145.aClass141_1 != null) {
			Static145.aClass141_1.method3490();
		}
		Static586.method7963();
		Static113.method1759();
		Static209.method3411();
		Static227.method3565();
		Static138.method2968(false);
		for (@Pc(39) int local39 = 0; local39 < 2048; local39++) {
			@Pc(45) Class15_Sub2_Sub4_Sub2 local45 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local39];
			if (local45 != null) {
				local45.aClass6_Sub42_3 = null;
				for (@Pc(52) int local52 = 0; local52 < local45.aClass24Array3.length; local52++) {
					local45.aClass24Array3[local52] = null;
				}
			}
		}
		for (@Pc(73) int local73 = 0; local73 < Static192.anInt3744; local73++) {
			@Pc(80) Class15_Sub2_Sub4_Sub1 local80 = Static324.aClass6_Sub49Array1[local73].aClass15_Sub2_Sub4_Sub1_2;
			if (local80 != null) {
				for (@Pc(84) int local84 = 0; local84 < local80.aClass24Array3.length; local84++) {
					local80.aClass24Array3[local84] = null;
				}
			}
		}
		Static211.aClass93_7 = null;
		Static445.aClass93_8 = null;
		Static554.aClass90_12.method7462();
		Static554.aClass90_12 = null;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "([Lclient!faa;BI)V")
	public static void method5309(@OriginalArg(0) Class97[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			@Pc(14) Class97 local14 = arg0[local8];
			if (local14 != null && arg1 == local14.anInt2655 && !Static74.method1046(local14)) {
				if (local14.anInt2637 == 0) {
					method5309(arg0, local14.anInt2678);
					if (local14.aClass97Array2 != null) {
						method5309(local14.aClass97Array2, local14.anInt2678);
					}
					@Pc(48) Class6_Sub43 local48 = (Class6_Sub43) Static162.aClass234_23.method5464((long) local14.anInt2678);
					if (local48 != null) {
						Static473.method6556(local48.anInt8192);
					}
				}
				if (local14.anInt2637 == 6 && local14.anInt2620 != -1) {
					@Pc(71) Class63 local71 = Static388.aClass324_2.method7265(local14.anInt2620);
					if (local71 != null) {
						local14.anInt2685 += Static415.anInt7409;
						while (local71.anIntArray128[local14.anInt2601] < local14.anInt2685) {
							local14.anInt2685 -= local71.anIntArray128[local14.anInt2601];
							local14.anInt2601++;
							if (local14.anInt2601 >= local71.anIntArray127.length) {
								local14.anInt2601 -= local71.anInt1378;
								if (local14.anInt2601 < 0 || local71.anIntArray127.length <= local14.anInt2601) {
									local14.anInt2601 = 0;
								}
							}
							local14.anInt2626 = local14.anInt2601 + 1;
							if (local14.anInt2626 >= local71.anIntArray127.length) {
								local14.anInt2626 -= local71.anInt1378;
								if (local14.anInt2626 < 0 || local71.anIntArray127.length <= local14.anInt2626) {
									local14.anInt2626 = -1;
								}
							}
							Static479.method6666(local14);
						}
					}
				}
			}
		}
	}
}
