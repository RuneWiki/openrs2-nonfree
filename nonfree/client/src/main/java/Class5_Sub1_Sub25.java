import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class5_Sub1_Sub25 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub25() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5763(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass154_41.method3176(arg0);
		if (super.aClass154_41.aBoolean254) {
			@Pc(26) int[] local26 = this.method5772(2, arg0);
			@Pc(32) int[][] local32 = this.method5764(0, arg0);
			@Pc(38) int[][] local38 = this.method5764(1, arg0);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static148.anInt2666; local76++) {
				@Pc(82) int local82 = local26[local76];
				if (local82 == 4096) {
					local42[local76] = local54[local76];
					local46[local76] = local58[local76];
					local50[local76] = local62[local76];
				} else if (local82 == 0) {
					local42[local76] = local66[local76];
					local46[local76] = local70[local76];
					local50[local76] = local74[local76];
				} else {
					@Pc(134) int local134 = 4096 - local82;
					local42[local76] = local66[local76] * local134 + local82 * local54[local76] >> 12;
					local46[local76] = local82 * local58[local76] + local134 * local70[local76] >> 12;
					local50[local76] = local74[local76] * local134 + local62[local76] * local82 >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			super.aBoolean486 = arg1.method5539() == 1;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(28) int[] local28 = this.method5772(0, arg0);
			@Pc(34) int[] local34 = this.method5772(1, arg0);
			@Pc(40) int[] local40 = this.method5772(2, arg0);
			for (@Pc(42) int local42 = 0; local42 < Static148.anInt2666; local42++) {
				@Pc(48) int local48 = local40[local42];
				if (local48 == 4096) {
					local16[local42] = local28[local42];
				} else if (local48 == 0) {
					local16[local42] = local34[local42];
				} else {
					local16[local42] = local28[local42] * local48 + (4096 - local48) * local34[local42] >> 12;
				}
			}
		}
		return local16;
	}
}
