import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class3_Sub4_Sub19 extends Class3_Sub4 {

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub19() {
		super(3, false);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			super.aBoolean524 = arg1.method6053() == 1;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455) {
			@Pc(26) int[] local26 = this.method5960(2, arg0);
			@Pc(32) int[][] local32 = this.method5962(0, arg0);
			@Pc(38) int[][] local38 = this.method5962(1, arg0);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static106.anInt2356; local76++) {
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
					@Pc(137) int local137 = 4096 - local82;
					local42[local76] = local66[local76] * local137 + local82 * local54[local76] >> 12;
					local46[local76] = local70[local76] * local137 + local82 * local58[local76] >> 12;
					local50[local76] = local137 * local74[local76] + local82 * local62[local76] >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(26) int[] local26 = this.method5960(0, arg0);
			@Pc(34) int[] local34 = this.method5960(1, arg0);
			@Pc(40) int[] local40 = this.method5960(2, arg0);
			for (@Pc(42) int local42 = 0; local42 < Static106.anInt2356; local42++) {
				@Pc(48) int local48 = local40[local42];
				if (local48 == 4096) {
					local16[local42] = local26[local42];
				} else if (local48 == 0) {
					local16[local42] = local34[local42];
				} else {
					local16[local42] = local26[local42] * local48 + (4096 - local48) * local34[local42] >> 12;
				}
			}
		}
		return local16;
	}
}
