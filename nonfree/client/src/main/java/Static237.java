import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!lu", name = "xb", descriptor = "Lclient!mo;")
	public static Class166 aClass166_8;

	@OriginalMember(owner = "client!lu", name = "M", descriptor = "J")
	public static long aLong134 = 0L;

	@OriginalMember(owner = "client!lu", name = "N", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_228 = new Class123(20, -1);

	@OriginalMember(owner = "client!lu", name = "Z", descriptor = "I")
	public static int anInt4340 = 999999;

	@OriginalMember(owner = "client!lu", name = "sb", descriptor = "[I")
	public static final int[] anIntArray310 = new int[8];

	@OriginalMember(owner = "client!lu", name = "vb", descriptor = "Lclient!ae;")
	public static final Class6_Sub1 aClass6_Sub1_3 = new Class6_Sub1(new byte[5000]);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
	public static void method3662() {
		@Pc(7) int local7 = Static95.anInt2186;
		@Pc(9) int[] local9 = Static178.anIntArray542;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class3_Sub2_Sub1_Sub2 local19 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local9[local11]];
			if (local19 != null && local19.anInt6539 > 0) {
				local19.anInt6539--;
				if (local19.anInt6539 == 0) {
					local19.aString52 = null;
				}
			}
		}
		for (@Pc(50) int local50 = 0; local50 < Static136.anInt2887; local50++) {
			@Pc(56) int local56 = Static66.anIntArray102[local50];
			@Pc(60) Class3_Sub2_Sub1_Sub1 local60 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local56];
			if (local60 != null && local60.anInt6539 > 0) {
				local60.anInt6539--;
				if (local60.anInt6539 == 0) {
					local60.aString52 = null;
				}
			}
		}
	}
}
