import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class1_Sub1_Sub32 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
	private int anInt3459;

	@OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
	private int anInt3464;

	@OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
	private int anInt3461;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass40_41.method1589(arg0);
		if (super.aClass40_41.aBoolean168) {
			@Pc(26) int[][] local26 = this.method3013(arg0, 0);
			@Pc(30) int[] local30 = local26[1];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local26[0];
			@Pc(42) int[] local42 = local11[2];
			@Pc(46) int[] local46 = local11[0];
			@Pc(50) int[] local50 = local11[1];
			for (@Pc(52) int local52 = 0; local52 < Static65.anInt1933; local52++) {
				@Pc(58) int local58 = local38[local52];
				@Pc(62) int local62 = local30[local52];
				@Pc(66) int local66 = local34[local52];
				if (local66 == local58 && local66 == local62) {
					local46[local52] = this.anInt3459 * local58 >> 12;
					local50[local52] = local66 * this.anInt3461 >> 12;
					local42[local52] = this.anInt3464 * local62 >> 12;
				} else {
					local46[local52] = this.anInt3459;
					local50[local52] = this.anInt3461;
					local42[local52] = this.anInt3464;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt3459 = arg1.method1642();
		} else if (arg0 == 1) {
			this.anInt3461 = arg1.method1642();
		} else if (arg0 == 2) {
			this.anInt3464 = arg1.method1642();
		}
	}
}
