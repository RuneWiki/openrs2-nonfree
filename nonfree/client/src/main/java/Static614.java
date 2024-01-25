import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static614 {

	@OriginalMember(owner = "client!vv", name = "o", descriptor = "Lclient!sq;")
	public static Class2_Sub8_Sub4 aClass2_Sub8_Sub4_2;

	@OriginalMember(owner = "client!vv", name = "r", descriptor = "I")
	public static int anInt10750 = 0;

	@OriginalMember(owner = "client!vv", name = "C", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray20 = new int[2][][];

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(BZLclient!ke;)V")
	public static void method8975(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub1_Sub3_Sub3_Sub2 arg1) {
		if (Static298.anInt6262 >= 400) {
			return;
		}
		if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 != arg1) {
			@Pc(184) String local184;
			@Pc(108) int local108;
			if (arg1.anInt6143 == 0) {
				@Pc(61) boolean local61 = true;
				if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6140 != -1 && arg1.anInt6140 != -1) {
					@Pc(85) int local85 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6106 > arg1.anInt6106 ? Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6106 : arg1.anInt6106;
					@Pc(96) int local96 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6140 >= arg1.anInt6140 ? arg1.anInt6140 : Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6140;
					local108 = local85 * 10 / 100 + local96 + 5;
					@Pc(115) int local115 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6106 - arg1.anInt6106;
					if (local115 < 0) {
						local115 = -local115;
					}
					if (local115 > local108) {
						local61 = false;
					}
				}
				@Pc(145) String local145 = Static557.aClass316_6 == Static423.aClass316_4 ? Static588.aClass351_32.method8691(Static476.anInt8915) : Static588.aClass351_30.method8691(Static476.anInt8915);
				if (arg1.anInt6136 <= arg1.anInt6106) {
					local184 = arg1.method5226() + (local61 ? Static557.method8308(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6106, arg1.anInt6106) : "<col=ffffff>") + " (" + local145 + arg1.anInt6106 + ")";
				} else {
					local184 = arg1.method5226() + (local61 ? Static557.method8308(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6106, arg1.anInt6106) : "<col=ffffff>") + " (" + local145 + arg1.anInt6106 + "+" + (arg1.anInt6136 - arg1.anInt6106) + ")";
				}
			} else if (arg1.anInt6143 == -1) {
				local184 = arg1.method5226();
			} else {
				local184 = arg1.method5226() + " (" + Static588.aClass351_31.method8691(Static476.anInt8915) + arg1.anInt6143 + ")";
			}
			if (Static475.aBoolean695 && !arg0 && (Static237.anInt5148 & 0x8) != 0) {
				Static202.method4065(false, Static225.aString47 + " -> <col=ffffff>" + local184, 0, false, 0, -1, true, 51, (long) arg1.anInt6083, Static225.aString48, (long) arg1.anInt6083, Static183.anInt4410);
			}
			if (arg0) {
				Static202.method4065(true, "", 0, false, 0, 0, false, -1, (long) arg1.anInt6083, "<col=cccccc>" + local184, 0L, -1);
			} else {
				for (@Pc(333) int local333 = 7; local333 >= 0; local333--) {
					if (Static355.aStringArray32[local333] != null) {
						@Pc(341) short local341 = 0;
						if (Static423.aClass316_4 == Static195.aClass316_2 && Static355.aStringArray32[local333].equalsIgnoreCase(Static588.aClass351_25.method8691(Static476.anInt8915))) {
							if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6106 < arg1.anInt6106) {
								local341 = 2000;
							}
							if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6126 != 0 && arg1.anInt6126 != 0) {
								if (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt6126 == arg1.anInt6126) {
									local341 = 2000;
								} else {
									local341 = 0;
								}
							}
						} else if (Static292.aBooleanArray15[local333]) {
							local341 = 2000;
						}
						@Pc(396) short local396 = (short) (local341 + Static559.aShortArray141[local333]);
						local108 = Static599.anIntArray680[local333] == -1 ? Static237.anInt5154 : Static599.anIntArray680[local333];
						Static202.method4065(false, "<col=ffffff>" + local184, 0, false, 0, -1, true, local396, (long) arg1.anInt6083, Static355.aStringArray32[local333], (long) arg1.anInt6083, local108);
					}
				}
			}
			if (!arg0) {
				for (@Pc(450) Class2_Sub6_Sub3 local450 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8524(); local450 != null; local450 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8519()) {
					if (local450.anInt2631 == 19) {
						local450.aString20 = "<col=ffffff>" + local184;
						return;
					}
				}
			}
		} else if (Static475.aBoolean695 && (Static237.anInt5148 & 0x10) != 0) {
			Static202.method4065(false, Static225.aString47 + " -> <col=ffffff>" + Static588.aClass351_39.method8691(Static476.anInt8915), 0, false, 0, -1, true, 50, (long) arg1.anInt6083, Static225.aString48, 0L, Static183.anInt4410);
		}
	}
}
