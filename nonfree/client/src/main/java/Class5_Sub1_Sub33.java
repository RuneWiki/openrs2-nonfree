import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class5_Sub1_Sub33 extends Class5_Sub1 {

	@OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
	private int anInt3490 = 4096;

	@OriginalMember(owner = "client!sc", name = "P", descriptor = "Z")
	private boolean aBoolean156 = true;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183) {
			@Pc(30) int[] local30 = this.method3196(arg0 - 1 & Static3.anInt74, 0);
			@Pc(36) int[] local36 = this.method3196(arg0, 0);
			@Pc(46) int[] local46 = this.method3196(Static3.anInt74 & arg0 + 1, 0);
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[1];
			@Pc(58) int[] local58 = local11[2];
			for (@Pc(60) int local60 = 0; local60 < Static174.anInt3489; local60++) {
				@Pc(73) int local73 = (local46[local60] - local30[local60]) * this.anInt3490;
				@Pc(92) int local92 = (local36[Static189.anInt3753 & local60 + 1] - local36[Static189.anInt3753 & local60 - 1]) * this.anInt3490;
				@Pc(96) int local96 = local73 >> 12;
				@Pc(100) int local100 = local92 >> 12;
				@Pc(106) int local106 = local96 * local96 >> 12;
				@Pc(112) int local112 = local100 * local100 >> 12;
				@Pc(126) int local126 = (int) (Math.sqrt((double) ((float) (local112 + local106 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(136) int local136;
				@Pc(140) int local140;
				@Pc(132) int local132;
				if (local126 == 0) {
					local140 = 0;
					local132 = 0;
					local136 = 0;
				} else {
					local132 = 16777216 / local126;
					local136 = local92 / local126;
					local140 = local73 / local126;
				}
				if (this.aBoolean156) {
					local136 = (local136 >> 1) + 2048;
					local140 = (local140 >> 1) + 2048;
					local132 = (local132 >> 1) + 2048;
				}
				local50[local60] = local136;
				local54[local60] = local140;
				local58[local60] = local132;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3490 = arg0.method3077();
		} else if (arg1 == 1) {
			this.aBoolean156 = arg0.method3062() == 1;
		}
	}
}
