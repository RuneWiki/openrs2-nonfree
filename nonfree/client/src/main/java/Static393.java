import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "Lclient!hw;")
	public static Class151 aClass151_10;

	@OriginalMember(owner = "client!nha", name = "n", descriptor = "I")
	public static int anInt6584;

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "I")
	public static int anInt6574 = 104;

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(II)V")
	public static void method5574(@OriginalArg(1) int arg0) {
		Static291.anInt4915 = arg0;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(BLclient!sha;II)V")
	public static void method5578(@OriginalArg(1) Class321 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class1 local13 = arg0.method7689(Static546.aClass132_13);
		if (local13 == null) {
			return;
		}
		Static546.aClass132_13.KA(arg1, arg2, arg0.anInt9103 + arg1, arg0.anInt9077 + arg2);
		if (Static426.anInt7557 < 3) {
			Static3.aClass9_9.method8922((float) arg0.anInt9103 / 2.0F + (float) arg1, (float) arg2 + (float) arg0.anInt9077 / 2.0F, ((int) -Static228.aFloat26 & 0x3FFF) << 2, local13, arg1, arg2);
		} else {
			Static546.aClass132_13.A(-16777216, local13, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "(B)Z")
	public static boolean method5579() {
		try {
			if (Static338.anInt5833 == 2) {
				if (Static488.aClass6_Sub53_2 == null) {
					Static488.aClass6_Sub53_2 = Static686.method8106(Static589.aClass8_129, Static363.anInt6191, Static194.anInt3305);
					if (Static488.aClass6_Sub53_2 == null) {
						return false;
					}
				}
				if (Static622.aClass158_1 == null) {
					Static622.aClass158_1 = new Class158(Static269.aClass8_71, Static560.aClass8_18);
				}
				@Pc(36) Class6_Sub8_Sub4 local36 = Static544.aClass6_Sub8_Sub4_10;
				if (Static471.aClass6_Sub8_Sub4_9 != null) {
					local36 = Static471.aClass6_Sub8_Sub4_9;
				}
				if (local36.method5097(Static162.aClass8_50, Static488.aClass6_Sub53_2, Static622.aClass158_1)) {
					Static544.aClass6_Sub8_Sub4_10 = local36;
					Static544.aClass6_Sub8_Sub4_10.method5067();
					@Pc(66) int local66;
					if (Static557.anInt9343 <= 0) {
						Static338.anInt5833 = 0;
						Static544.aClass6_Sub8_Sub4_10.method5066(Static382.anInt6400);
						for (local66 = 0; local66 < Static490.anIntArray539.length; local66++) {
							Static544.aClass6_Sub8_Sub4_10.method5068(Static490.anIntArray539[local66], local66);
							Static490.anIntArray539[local66] = 255;
						}
					} else {
						Static338.anInt5833 = 3;
						Static544.aClass6_Sub8_Sub4_10.method5066(Static382.anInt6400 >= Static557.anInt9343 ? Static557.anInt9343 : Static382.anInt6400);
						for (local66 = 0; local66 < Static490.anIntArray539.length; local66++) {
							Static544.aClass6_Sub8_Sub4_10.method5068(Static490.anIntArray539[local66], local66);
							Static490.anIntArray539[local66] = 255;
						}
					}
					if (Static471.aClass6_Sub8_Sub4_9 == null) {
						if (Static264.aLong133 > 0L) {
							Static544.aClass6_Sub8_Sub4_10.method5096(Static459.aBoolean514, Static488.aClass6_Sub53_2, Static264.aLong133);
						} else {
							Static544.aClass6_Sub8_Sub4_10.method5094(Static459.aBoolean514, Static488.aClass6_Sub53_2);
						}
					}
					if (Static292.aClass64_3 != null) {
						Static292.aClass64_3.method1730(Static544.aClass6_Sub8_Sub4_10);
					}
					Static471.aClass6_Sub8_Sub4_9 = null;
					Static589.aClass8_129 = null;
					Static622.aClass158_1 = null;
					Static264.aLong133 = 0L;
					Static488.aClass6_Sub53_2 = null;
					return true;
				}
			}
		} catch (@Pc(162) Exception local162) {
			local162.printStackTrace();
			Static544.aClass6_Sub8_Sub4_10.method5098();
			Static622.aClass158_1 = null;
			Static488.aClass6_Sub53_2 = null;
			Static338.anInt5833 = 0;
			Static589.aClass8_129 = null;
			Static471.aClass6_Sub8_Sub4_9 = null;
		}
		return false;
	}
}
