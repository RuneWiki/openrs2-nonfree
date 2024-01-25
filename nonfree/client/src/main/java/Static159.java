import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "Lclient!pe;")
	public static Class254 aClass254_51;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
	public static int anInt3430 = 0;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "Z")
	public static boolean aBoolean265 = false;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "Lclient!ej;")
	public static final Class85 aClass85_1 = new Class85();

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)Z")
	public static boolean method3027(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!iaa;[[BZ)V")
	public static void method3030(@OriginalArg(0) Class152_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(30) Class3_Sub7 local30 = new Class3_Sub7(local23);
				local36 = Static478.anIntArray584[local17] >> 8;
				@Pc(42) int local42 = Static478.anIntArray584[local17] & 0xFF;
				@Pc(48) int local48 = local36 * 64 - Static230.anInt4667;
				@Pc(55) int local55 = local42 * 64 - Static563.anInt10006;
				Static129.method8413();
				arg0.method3649(local55, Static230.anInt4667, local48, Static563.anInt10006, Static403.aClass350Array1, local30);
				arg0.method3670(local12, local55, local30, local48, Static546.aClass15_16);
				if (!arg0.aBoolean335 && Static368.anInt7248 / 8 == local36 && Static187.anInt3746 / 8 == local42 && local12[0] != -1) {
					Static429.aClass140_1 = Static271.aClass176_1.method4570(local12[2], local12[3], local12[0], Static136.aClass272_1, local12[1]);
					Static324.anInt6777 = local12[4];
				}
			}
		}
		for (@Pc(135) int local135 = 0; local135 < local15; local135++) {
			@Pc(148) int local148 = (Static478.anIntArray584[local135] >> 8) * 64 - Static230.anInt4667;
			local36 = (Static478.anIntArray584[local135] & 0xFF) * 64 - Static563.anInt10006;
			@Pc(163) byte[] local163 = arg1[local135];
			if (local163 == null && Static187.anInt3746 < 800) {
				Static129.method8413();
				arg0.method3648(local148, local36);
			}
		}
	}
}
