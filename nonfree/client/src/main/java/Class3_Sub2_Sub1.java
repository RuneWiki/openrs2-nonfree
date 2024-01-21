import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ac", name = "eb", descriptor = "Z")
	private boolean aBoolean6 = true;

	@OriginalMember(owner = "client!ac", name = "lb", descriptor = "I")
	private int anInt71 = 4096;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt71 = arg0.method1270();
		} else if (arg1 == 1) {
			this.aBoolean6 = arg0.method1278() == 1;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135) {
			@Pc(30) int[] local30 = this.method3328(0, arg0 - 1 & Static170.anInt1101);
			@Pc(36) int[] local36 = this.method3328(0, arg0);
			@Pc(46) int[] local46 = this.method3328(0, Static170.anInt1101 & arg0 + 1);
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local16[0];
			@Pc(58) int[] local58 = local16[1];
			for (@Pc(60) int local60 = 0; local60 < Static190.anInt3865; local60++) {
				@Pc(73) int local73 = (local46[local60] - local30[local60]) * this.anInt71;
				@Pc(93) int local93 = this.anInt71 * (local36[local60 + 1 & Static134.anInt2681] - local36[Static134.anInt2681 & local60 - 1]);
				@Pc(97) int local97 = local93 >> 12;
				@Pc(101) int local101 = local73 >> 12;
				@Pc(107) int local107 = local97 * local97 >> 12;
				@Pc(113) int local113 = local101 * local101 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local107 + local113 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(132) int local132;
				@Pc(136) int local136;
				@Pc(134) int local134;
				if (local128 == 0) {
					local132 = 0;
					local134 = 0;
					local136 = 0;
				} else {
					local134 = 16777216 / local128;
					local132 = local93 / local128;
					local136 = local73 / local128;
				}
				if (this.aBoolean6) {
					local132 = (local132 >> 1) + 2048;
					local134 = (local134 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
				}
				local54[local60] = local132;
				local58[local60] = local136;
				local50[local60] = local134;
			}
		}
		return local16;
	}
}
