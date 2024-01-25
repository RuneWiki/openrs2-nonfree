import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class2_Sub10_Sub35 extends Class2_Sub10 {

	@OriginalMember(owner = "client!v", name = "C", descriptor = "Z")
	private boolean aBoolean714 = true;

	@OriginalMember(owner = "client!v", name = "D", descriptor = "I")
	private int anInt9684 = 4096;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9684 = arg0.method6884();
		} else if (arg1 == 1) {
			this.aBoolean714 = arg0.method6904() == 1;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8411(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass250_41.method6392(arg0);
		if (super.aClass250_41.aBoolean573) {
			@Pc(25) int[] local25 = this.method8402(arg0 - 1 & Static93.anInt1860, 0);
			@Pc(31) int[] local31 = this.method8402(arg0, 0);
			@Pc(41) int[] local41 = this.method8402(arg0 + 1 & Static93.anInt1860, 0);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static93.anInt1862; local55++) {
				@Pc(69) int local69 = this.anInt9684 * (local41[local55] - local25[local55]);
				@Pc(89) int local89 = this.anInt9684 * (local31[Static603.anInt9994 & local55 + 1] - local31[Static603.anInt9994 & local55 - 1]);
				@Pc(93) int local93 = local89 >> 12;
				@Pc(97) int local97 = local69 >> 12;
				@Pc(103) int local103 = local93 * local93 >> 12;
				@Pc(109) int local109 = local97 * local97 >> 12;
				@Pc(123) int local123 = (int) (Math.sqrt((double) ((float) (local103 + local109 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(136) int local136;
				@Pc(132) int local132;
				@Pc(140) int local140;
				if (local123 == 0) {
					local140 = 0;
					local132 = 0;
					local136 = 0;
				} else {
					local132 = local69 / local123;
					local136 = local89 / local123;
					local140 = 16777216 / local123;
				}
				if (this.aBoolean714) {
					local132 = (local132 >> 1) + 2048;
					local140 = (local140 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
				}
				local45[local55] = local136;
				local49[local55] = local132;
				local53[local55] = local140;
			}
		}
		return local11;
	}
}
