import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)I")
	public static int method1837(@OriginalArg(0) int arg0) {
		@Pc(12) Class124 local12 = Static270.method4035(arg0);
		@Pc(15) int local15 = local12.anInt3754;
		@Pc(18) int local18 = local12.anInt3756;
		@Pc(21) int local21 = local12.anInt3757;
		@Pc(28) int local28 = Class8_Sub3_Sub9.anIntArray102[local18 - local21];
		return Static8.anIntArray495[local15] >> local21 & local28;
	}
}
