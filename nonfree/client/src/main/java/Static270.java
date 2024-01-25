import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!no", name = "f", descriptor = "I")
	public static int anInt5901;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "I")
	public static int anInt5898 = 0;

	@OriginalMember(owner = "client!no", name = "b", descriptor = "Z")
	public static boolean aBoolean440 = false;

	@OriginalMember(owner = "client!no", name = "c", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_80 = new Class212(0, -1);

	@OriginalMember(owner = "client!no", name = "d", descriptor = "I")
	public static int anInt5899 = 0;

	@OriginalMember(owner = "client!no", name = "g", descriptor = "I")
	public static int anInt5902 = 0;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!th;[[BB)V")
	public static void method4893(@OriginalArg(0) Class191_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(30) Class4_Sub20 local30 = new Class4_Sub20(local23);
				local36 = Static109.anIntArray203[local17] >> 8;
				@Pc(42) int local42 = Static109.anIntArray203[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static426.anInt7325;
				@Pc(56) int local56 = local42 * 64 - Static72.anInt1776;
				Static256.method4185();
				arg0.method5568(Static335.aClass253Array1, Static426.anInt7325, local49, local56, Static72.anInt1776, local30);
				arg0.method5589(local49, local12, Static30.aClass30_3, local56, local30);
				if (!arg0.aBoolean513 && Static245.anInt4783 / 8 == local36 && local42 == Static462.anInt7854 / 8 && local12[0] != -1) {
					Static91.aClass265_1 = Static104.aClass180_1.method4409(Static348.aClass237_1, local12[3], local12[1], local12[2], local12[0]);
					Static90.anInt6146 = local12[4];
				}
			}
		}
		for (@Pc(127) int local127 = 0; local127 < local15; local127++) {
			@Pc(141) int local141 = (Static109.anIntArray203[local127] >> 8) * 64 - Static426.anInt7325;
			local36 = (Static109.anIntArray203[local127] & 0xFF) * 64 - Static72.anInt1776;
			@Pc(156) byte[] local156 = arg1[local127];
			if (local156 == null && Static462.anInt7854 < 800) {
				Static256.method4185();
				arg0.method5565(local36, local141);
			}
		}
	}
}
