import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!km", name = "c", descriptor = "Lclient!kb;")
	public static Class12_Sub13_Sub2 aClass12_Sub13_Sub2_1;

	@OriginalMember(owner = "client!km", name = "h", descriptor = "I")
	public static int anInt5252;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "[Lclient!aca;")
	public static final Interface1[] anInterface1Array2 = new Interface1[128];

	@OriginalMember(owner = "client!km", name = "d", descriptor = "Lclient!it;")
	public static final Class149 aClass149_4 = new Class149();

	@OriginalMember(owner = "client!km", name = "g", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_77 = new Class45(95, 11);

	@OriginalMember(owner = "client!km", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray50 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!km", name = "j", descriptor = "[I")
	public static final int[] anIntArray372 = new int[25];

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I")
	public static int method4396() {
		return 14;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!qa;Lclient!jt;IIIII)V")
	public static void method4397(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static36.anInt8450) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static537.anInt9566) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static509.anInt9164 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class37 local62 = Static120.aClass37ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static51.aClass215Array6[local17].ba(local23, local32) + Static51.aClass215Array6[local17].ba(local23 + 1, local32) + Static51.aClass215Array6[local17].ba(local23, local32 + 1) + Static51.aClass215Array6[local17].ba(local23 + 1, local32 + 1)) / 4 - (Static51.aClass215Array6[arg2].ba(arg3, arg4) + Static51.aClass215Array6[arg2].ba(arg3 + 1, arg4) + Static51.aClass215Array6[arg2].ba(arg3, arg4 + 1) + Static51.aClass215Array6[arg2].ba(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class30_Sub2 local143 = local62.aClass30_Sub2_2;
									@Pc(146) Class30_Sub2 local146 = local62.aClass30_Sub2_1;
									if (local143 != null && local143.method7901()) {
										arg1.method7904((local32 - arg4) * Static316.anInt6040 + (1 - arg6) * Static225.anInt4810, local1, local140, local143, (local23 - arg3) * Static316.anInt6040 + (1 - arg5) * Static225.anInt4810, arg0);
									}
									if (local146 != null && local146.method7901()) {
										arg1.method7904((local32 - arg4) * Static316.anInt6040 + (1 - arg6) * Static225.anInt4810, local1, local140, local146, (local23 - arg3) * Static316.anInt6040 + (1 - arg5) * Static225.anInt4810, arg0);
									}
									for (@Pc(219) Class243 local219 = local62.aClass243_3; local219 != null; local219 = local219.aClass243_11) {
										@Pc(223) Class30_Sub1 local223 = local219.aClass30_Sub1_2;
										if (local223 != null && local223.method7901() && (local23 == local223.aShort115 || local23 == local3) && (local32 == local223.aShort112 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort113 + 1 - local223.aShort115;
											@Pc(260) int local260 = local223.aShort114 + 1 - local223.aShort112;
											arg1.method7904((local223.aShort112 - arg4) * Static316.anInt6040 + (local260 - arg6) * Static225.anInt4810, local1, local140, local223, (local223.aShort115 - arg3) * Static316.anInt6040 + (local252 - arg5) * Static225.anInt4810, arg0);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BZI)V")
	public static void method4399(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		Static445.anInt8114 = 3;
		Static122.anInt2825 = arg1;
		Static389.method6144(Static488.aClass247_4.anInt7426, Static488.aClass247_4.aString85);
		if (arg0) {
			Static331.method5281(false, "", "");
		} else {
			Static440.method6678();
			Static331.method5281(false, Static36.aString98, Static63.aString91);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!pe;III)V")
	public static void method4400(@OriginalArg(0) Class240 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static544.aClass240ArrayArray1[arg1][arg2] = arg0;
	}
}
