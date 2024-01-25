import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public final class Class6_Sub3_Sub11 extends Class6_Sub3 {

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub11() {
		super(3, false);
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(26) int[] local26 = this.method7950(0, arg0);
			@Pc(32) int[] local32 = this.method7950(1, arg0);
			@Pc(38) int[] local38 = this.method7950(2, arg0);
			for (@Pc(40) int local40 = 0; local40 < Static35.anInt670; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = local26[local40] * local46 + local32[local40] * (4096 - local46) >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			super.aBoolean674 = arg1.method6019() == 1;
		}
	}

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7959(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass263_41.method5967(arg0);
		if (super.aClass263_41.aBoolean505) {
			@Pc(26) int[] local26 = this.method7950(2, arg0);
			@Pc(32) int[][] local32 = this.method7961(arg0, 0);
			@Pc(38) int[][] local38 = this.method7961(arg0, 1);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static35.anInt670; local76++) {
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
					@Pc(117) int local117 = 4096 - local82;
					local42[local76] = local82 * local54[local76] + local117 * local66[local76] >> 12;
					local46[local76] = local82 * local58[local76] + local70[local76] * local117 >> 12;
					local50[local76] = local117 * local74[local76] + local82 * local62[local76] >> 12;
				}
			}
		}
		return local16;
	}
}
