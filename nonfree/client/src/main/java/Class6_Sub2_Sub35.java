import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class6_Sub2_Sub35 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ti", name = "E", descriptor = "Z")
	private boolean aBoolean418 = true;

	@OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
	private int anInt6308 = 4096;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6308 = arg0.method3108();
		} else if (arg1 == 1) {
			this.aBoolean418 = arg0.method3111() == 1;
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5868(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass130_41.method2911(arg0);
		if (super.aClass130_41.aBoolean230) {
			@Pc(30) int[] local30 = this.method5858(0, arg0 - 1 & Static296.anInt4928);
			@Pc(36) int[] local36 = this.method5858(0, arg0);
			@Pc(46) int[] local46 = this.method5858(0, Static296.anInt4928 & arg0 + 1);
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Static185.anInt4925; local60++) {
				@Pc(74) int local74 = (local46[local60] - local30[local60]) * this.anInt6308;
				@Pc(94) int local94 = (local36[Static64.anInt1348 & local60 + 1] - local36[Static64.anInt1348 & local60 - 1]) * this.anInt6308;
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local114 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(134) int local134;
				@Pc(132) int local132;
				@Pc(136) int local136;
				if (local128 == 0) {
					local132 = 0;
					local134 = 0;
					local136 = 0;
				} else {
					local136 = 16777216 / local128;
					local134 = local94 / local128;
					local132 = local74 / local128;
				}
				if (this.aBoolean418) {
					local132 = (local132 >> 1) + 2048;
					local134 = (local134 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
				}
				local50[local60] = local134;
				local54[local60] = local132;
				local58[local60] = local136;
			}
		}
		return local16;
	}
}
