import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!tn", name = "E", descriptor = "I")
	public static int anInt9543;

	@OriginalMember(owner = "client!tn", name = "J", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_141 = new Class289(22, 7);

	@OriginalMember(owner = "client!tn", name = "K", descriptor = "[I")
	public static final int[] anIntArray644 = new int[64];

	@OriginalMember(owner = "client!tn", name = "N", descriptor = "[F")
	public static final float[] aFloatArray72 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!tn", name = "P", descriptor = "J")
	public static long aLong279 = 1L;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V")
	public static void method8040() {
		Static248.aClass10_21.method375();
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!sha;II)Ljava/lang/String;")
	public static String method8041(@OriginalArg(0) Class321 arg0, @OriginalArg(2) int arg1) {
		if (!Static83.method1453(arg0).method5786(arg1) && arg0.anObjectArray22 == null) {
			return null;
		} else if (arg0.aStringArray55 == null || arg0.aStringArray55.length <= arg1 || arg0.aStringArray55[arg1] == null || arg0.aStringArray55[arg1].trim().length() == 0) {
			return Static383.aBoolean423 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray55[arg1];
		}
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(II)V")
	public static void method8042(@OriginalArg(1) int arg0) {
		Static534.anInt8752 = arg0;
		Static229.aClass10_18.method375();
	}

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "(B)I")
	public static int method8043() {
		if (Static489.aClass321_39 == null) {
			if (!Static277.aBoolean303 && Static593.aClass6_Sub4_Sub12_4 != null) {
				return Static593.aClass6_Sub4_Sub12_4.anInt7580;
			}
			@Pc(15) int local15 = Static193.aClass128_1.method5191();
			@Pc(19) int local19 = Static193.aClass128_1.method5188();
			@Pc(54) int local54;
			@Pc(56) int local56;
			@Pc(68) int local68;
			@Pc(136) Class6_Sub4_Sub12 local136;
			if (Static217.aBoolean218) {
				@Pc(131) Class180 local131;
				if (local15 > Static643.anInt10391 && Static643.anInt10391 + Static279.anInt4804 > local15) {
					local54 = -1;
					for (local56 = 0; local56 < Static305.anInt5201; local56++) {
						if (Static292.aBoolean317) {
							local68 = local56 * 16 + Static32.anInt784 + 33;
							if (local68 - 13 < local19 && local19 <= local68 + 3) {
								local54 = local56;
							}
						} else {
							local68 = local56 * 16 + Static32.anInt784 + 31;
							if (local68 - 13 < local19 && local68 + 3 >= local19) {
								local54 = local56;
							}
						}
					}
					if (local54 != -1) {
						local68 = 0;
						local131 = new Class180(Static258.aClass384_7);
						for (@Pc(231) Class6_Sub4_Sub10 local231 = (Class6_Sub4_Sub10) local131.method4135(); local231 != null; local231 = (Class6_Sub4_Sub10) local131.method4137()) {
							if (local54 == local68++) {
								return ((Class6_Sub4_Sub12) local231.aClass384_11.aClass6_Sub4_62.aClass6_Sub4_67).anInt7580;
							}
						}
					}
				} else if (Static275.aClass6_Sub4_Sub10_1 != null && local15 > Static347.anInt10656 && local15 < Static314.anInt5338 + Static347.anInt10656) {
					local54 = -1;
					for (local56 = 0; local56 < Static275.aClass6_Sub4_Sub10_1.anInt5448; local56++) {
						if (Static292.aBoolean317) {
							local68 = local56 * 16 + Static166.anInt2811 + 33;
							if (local19 > local68 - 13 && local19 <= local68 + 3) {
								local54 = local56;
							}
						} else {
							local68 = local56 * 16 + Static166.anInt2811 + 31;
							if (local19 > local68 - 13 && local68 + 3 >= local19) {
								local54 = local56;
							}
						}
					}
					if (local54 != -1) {
						local68 = 0;
						local131 = new Class180(Static275.aClass6_Sub4_Sub10_1.aClass384_11);
						for (local136 = (Class6_Sub4_Sub12) local131.method4135(); local136 != null; local136 = (Class6_Sub4_Sub12) local131.method4137()) {
							if (local54 == local68++) {
								return local136.anInt7580;
							}
						}
					}
				}
			} else if (local15 > Static643.anInt10391 && local15 < Static279.anInt4804 + Static643.anInt10391) {
				local54 = -1;
				for (local56 = 0; local56 < Static183.anInt3155; local56++) {
					if (Static292.aBoolean317) {
						local68 = Static32.anInt784 + (-local56 + Static183.anInt3155 + -1) * 16 + 33;
						if (local68 - 13 < local19 && local19 <= local68 + 3) {
							local54 = local56;
						}
					} else {
						local68 = (Static183.anInt3155 - local56 - 1) * 16 + Static32.anInt784 + 31;
						if (local68 - 13 < local19 && local19 <= local68 + 3) {
							local54 = local56;
						}
					}
				}
				if (local54 != -1) {
					local68 = 0;
					@Pc(364) Class364 local364 = new Class364(Static31.aClass362_3);
					for (local136 = (Class6_Sub4_Sub12) local364.method8570(); local136 != null; local136 = (Class6_Sub4_Sub12) local364.method8572()) {
						if (local68++ == local54) {
							return local136.anInt7580;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)Z")
	public static boolean method8044() {
		return Static366.aBoolean413;
	}
}
