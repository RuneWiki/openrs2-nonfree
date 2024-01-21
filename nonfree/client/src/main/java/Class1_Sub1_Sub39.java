import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class1_Sub1_Sub39 extends Class1_Sub1 {

	@OriginalMember(owner = "client!wd", name = "R", descriptor = "[I")
	private int[] anIntArray451;

	@OriginalMember(owner = "client!wd", name = "cb", descriptor = "I")
	private int anInt4111;

	@OriginalMember(owner = "client!wd", name = "fb", descriptor = "I")
	private int anInt4114;

	@OriginalMember(owner = "client!wd", name = "eb", descriptor = "I")
	private int anInt4113;

	@OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
	private int anInt4109;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass40_41.method1589(arg0);
		if (super.aClass40_41.aBoolean168) {
			@Pc(26) int[][] local26 = this.method3013(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local12[0];
			@Pc(46) int[] local46 = local12[1];
			@Pc(50) int[] local50 = local12[2];
			for (@Pc(52) int local52 = 0; local52 < Static65.anInt1933; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(65) int local65 = local58 - this.anIntArray451[0];
				if (local65 < 0) {
					local65 = -local65;
				}
				if (local65 > this.anInt4109) {
					local42[local52] = local58;
					local46[local52] = local34[local52];
					local50[local52] = local38[local52];
				} else {
					@Pc(103) int local103 = local34[local52];
					local65 = local103 - this.anIntArray451[1];
					if (local65 < 0) {
						local65 = -local65;
					}
					if (this.anInt4109 < local65) {
						local42[local52] = local58;
						local46[local52] = local103;
						local50[local52] = local38[local52];
					} else {
						@Pc(144) int local144 = local38[local52];
						local65 = local144 - this.anIntArray451[2];
						if (local65 < 0) {
							local65 = -local65;
						}
						if (this.anInt4109 < local65) {
							local42[local52] = local58;
							local46[local52] = local103;
							local50[local52] = local144;
						} else {
							local42[local52] = this.anInt4111 * local58 >> 12;
							local46[local52] = this.anInt4113 * local103 >> 12;
							local50[local52] = this.anInt4114 * local144 >> 12;
						}
					}
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt4109 = arg1.method1642();
		} else if (arg0 == 1) {
			this.anInt4114 = arg1.method1642();
		} else if (arg0 == 2) {
			this.anInt4113 = arg1.method1642();
		} else if (arg0 == 3) {
			this.anInt4111 = arg1.method1642();
		} else if (arg0 == 4) {
			@Pc(61) int local61 = arg1.method1618();
			this.anIntArray451[0] = (local61 & 0xFF0000) << 4;
			this.anIntArray451[1] = local61 >> 4 & 0xFF0;
			this.anIntArray451[2] = local61 >> 12 & 0x0;
		}
	}
}
