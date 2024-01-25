import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!i", name = "r", descriptor = "[[I")
	public static int[][] anIntArrayArray70;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "J")
	public static long aLong218 = 0L;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "Lclient!hca;")
	public static final Class134 aClass134_10 = new Class134();

	@OriginalMember(owner = "client!i", name = "q", descriptor = "I")
	public static int anInt8799 = -1;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method7209() {
		@Pc(5) int local5 = Static455.anInt8611;
		@Pc(7) int[] local7 = Static492.anIntArray589;
		for (@Pc(9) int local9 = 0; local9 < local5; local9++) {
			@Pc(16) Class2_Sub2_Sub1_Sub1 local16 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local7[local9]];
			if (local16 != null && local16.anInt7632 > 0) {
				local16.anInt7632--;
				if (local16.anInt7632 == 0) {
					local16.aString92 = null;
				}
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static268.anInt5680; local57++) {
			@Pc(63) long local63 = (long) Static304.anIntArray377[local57];
			@Pc(69) Class3_Sub46 local69 = (Class3_Sub46) Static331.aClass25_25.method946(local63);
			if (local69 != null) {
				@Pc(74) Class2_Sub2_Sub1_Sub2 local74 = local69.aClass2_Sub2_Sub1_Sub2_2;
				if (local74.anInt7632 > 0) {
					local74.anInt7632--;
					if (local74.anInt7632 == 0) {
						local74.aString92 = null;
					}
				}
			}
		}
	}
}
