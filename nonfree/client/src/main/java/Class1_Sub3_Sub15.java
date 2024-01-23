import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class1_Sub3_Sub15 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ha", name = "U", descriptor = "I")
	private int anInt1556 = 4096;

	@OriginalMember(owner = "client!ha", name = "Y", descriptor = "Z")
	private boolean aBoolean72 = true;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90) {
			@Pc(30) int[] local30 = this.method3468(arg0 - 1 & Static171.anInt3496, 0);
			@Pc(36) int[] local36 = this.method3468(arg0, 0);
			@Pc(46) int[] local46 = this.method3468(Static171.anInt3496 & arg0 + 1, 0);
			@Pc(50) int[] local50 = local11[0];
			@Pc(54) int[] local54 = local11[2];
			@Pc(58) int[] local58 = local11[1];
			for (@Pc(60) int local60 = 0; local60 < Static76.anInt1531; local60++) {
				@Pc(82) int local82 = (local36[Static121.anInt2385 & local60 + 1] - local36[Static121.anInt2385 & local60 - 1]) * this.anInt1556;
				@Pc(93) int local93 = this.anInt1556 * (local46[local60] - local30[local60]);
				@Pc(97) int local97 = local82 >> 12;
				@Pc(101) int local101 = local93 >> 12;
				@Pc(107) int local107 = local101 * local101 >> 12;
				@Pc(113) int local113 = local97 * local97 >> 12;
				@Pc(127) int local127 = (int) (Math.sqrt((double) ((float) (local107 + local113 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(144) int local144;
				@Pc(140) int local140;
				@Pc(136) int local136;
				if (local127 == 0) {
					local144 = 0;
					local140 = 0;
					local136 = 0;
				} else {
					local136 = 16777216 / local127;
					local140 = local93 / local127;
					local144 = local82 / local127;
				}
				if (this.aBoolean72) {
					local136 = (local136 >> 1) + 2048;
					local144 = (local144 >> 1) + 2048;
					local140 = (local140 >> 1) + 2048;
				}
				local50[local60] = local144;
				local58[local60] = local140;
				local54[local60] = local136;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt1556 = arg1.method2178();
		} else if (arg0 == 1) {
			this.aBoolean72 = arg1.method2142() == 1;
		}
	}
}
