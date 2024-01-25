import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Lclient!pg;")
	public static Interface6 anInterface6_4;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "Lclient!kb;")
	public static Class52 aClass52_21;

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
	public static int anInt4014;

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "[Lclient!vi;")
	public static Class36_Sub2_Sub1_Sub1[] aClass36_Sub2_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString262 = "Stellar Dawn is loading - please wait...";

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
	public static int anInt4016 = 0;

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "Lclient!on;")
	public static final Class154 aClass154_6 = new Class154(128);

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray31 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(FIZIIIII)[I")
	public static int[] method3599(@OriginalArg(0) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class7_Sub4_Sub13 local10 = new Class7_Sub4_Sub13();
		local10.anInt3154 = 8;
		local10.anInt3160 = 8;
		local10.anInt3167 = (int) ((float) 4096 * arg0);
		local10.anInt3165 = 4;
		local10.aBoolean238 = true;
		local10.anInt3156 = 35;
		local10.method5635();
		Static168.method3214(1, 2048);
		local10.method2914(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
	public static void method3600() {
		Static250.anInt4908 = -1;
		Static254.anInt4944 = 0;
		Static129.anInt2826 = 1;
		Static61.anInt1532 = -1;
		Static301.aBoolean425 = false;
		Static98.aClass180_12 = null;
		Static286.anInt5630 = 2;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLclient!cc;[I[I[I)V")
	public static void method3602(@OriginalArg(1) Class22_Sub2_Sub1_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			@Pc(6) int local6 = arg1[local1];
			@Pc(10) int local10 = arg2[local1];
			@Pc(14) int local14 = arg3[local1];
			@Pc(16) int local16 = 0;
			while (local10 != 0 && local16 < arg0.aClass190Array3.length) {
				if ((local10 & 0x1) != 0) {
					if (local6 == -1) {
						arg0.aClass190Array3[local16] = null;
					} else {
						@Pc(38) Class170 local38 = Static261.method4379(local6);
						@Pc(41) int local41 = local38.anInt4968;
						@Pc(46) Class190 local46 = arg0.aClass190Array3[local16];
						if (local46 != null) {
							if (local6 == local46.anInt5765) {
								if (local41 == 0) {
									local46 = arg0.aClass190Array3[local16] = null;
								} else if (local41 == 1) {
									local46.anInt5763 = 0;
									local46.anInt5761 = 1;
									local46.anInt5759 = 0;
									local46.anInt5760 = 0;
									local46.anInt5764 = local14;
									Static219.method3870(local38, arg0.anInt5967, arg0 == Static252.aClass22_Sub2_Sub1_Sub1_4, 0, arg0.anInt5973);
								} else if (local41 == 2) {
									local46.anInt5763 = 0;
								}
							} else if (local38.anInt4963 >= Static261.method4379(local46.anInt5765).anInt4963) {
								local46 = arg0.aClass190Array3[local16] = null;
							}
						}
						if (local46 == null) {
							local46 = arg0.aClass190Array3[local16] = new Class190();
							local46.anInt5761 = 1;
							local46.anInt5759 = 0;
							local46.anInt5763 = 0;
							local46.anInt5764 = local14;
							local46.anInt5765 = local6;
							local46.anInt5760 = 0;
							Static219.method3870(local38, arg0.anInt5967, Static252.aClass22_Sub2_Sub1_Sub1_4 == arg0, 0, arg0.anInt5973);
						}
					}
				}
				local16++;
				local10 >>>= 0x1;
			}
		}
	}
}
