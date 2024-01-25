import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class7_Sub3_Sub15 extends Class7_Sub3 {

	@OriginalMember(owner = "client!jl", name = "F", descriptor = "Z")
	private boolean aBoolean207 = true;

	@OriginalMember(owner = "client!jl", name = "K", descriptor = "I")
	private int anInt3449 = 4096;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method5596(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass235_41.method4862(arg0);
		if (super.aClass235_41.aBoolean402) {
			@Pc(30) int[] local30 = this.method5591(0, arg0 - 1 & Static25.anInt366);
			@Pc(36) int[] local36 = this.method5591(0, arg0);
			@Pc(46) int[] local46 = this.method5591(0, Static25.anInt366 & arg0 + 1);
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Static58.anInt1052; local60++) {
				@Pc(73) int local73 = (local46[local60] - local30[local60]) * this.anInt3449;
				@Pc(93) int local93 = (local36[local60 + 1 & Static410.anInt6497] - local36[Static410.anInt6497 & local60 - 1]) * this.anInt3449;
				@Pc(97) int local97 = local93 >> 12;
				@Pc(101) int local101 = local73 >> 12;
				@Pc(107) int local107 = local97 * local97 >> 12;
				@Pc(113) int local113 = local101 * local101 >> 12;
				@Pc(127) int local127 = (int) (Math.sqrt((double) ((float) (local113 + local107 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(134) int local134;
				@Pc(136) int local136;
				@Pc(138) int local138;
				if (local127 == 0) {
					local134 = 0;
					local136 = 0;
					local138 = 0;
				} else {
					local134 = local93 / local127;
					local136 = local73 / local127;
					local138 = 16777216 / local127;
				}
				if (this.aBoolean207) {
					local138 = (local138 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
					local134 = (local134 >> 1) + 2048;
				}
				local50[local60] = local134;
				local54[local60] = local136;
				local58[local60] = local138;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt3449 = arg1.method3943();
		} else if (arg0 == 1) {
			this.aBoolean207 = arg1.method3981() == 1;
		}
	}
}
