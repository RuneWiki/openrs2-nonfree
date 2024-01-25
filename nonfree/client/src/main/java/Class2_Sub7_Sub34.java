import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class2_Sub7_Sub34 extends Class2_Sub7 {

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub34() {
		super(3, false);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(29) int[] local29 = this.method7581(arg0, 0);
			@Pc(35) int[] local35 = this.method7581(arg0, 1);
			@Pc(41) int[] local41 = this.method7581(arg0, 2);
			for (@Pc(43) int local43 = 0; local43 < Static352.anInt6485; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local19[local43] = local29[local43];
				} else if (local49 == 0) {
					local19[local43] = local35[local43];
				} else {
					local19[local43] = local35[local43] * (4096 - local49) + local49 * local29[local43] >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7585(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass180_41.method4533(arg0);
		if (super.aClass180_41.aBoolean392) {
			@Pc(26) int[] local26 = this.method7581(arg0, 2);
			@Pc(32) int[][] local32 = this.method7589(0, arg0);
			@Pc(38) int[][] local38 = this.method7589(1, arg0);
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static352.anInt6485; local76++) {
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
					@Pc(95) int local95 = 4096 - local82;
					local42[local76] = local95 * local66[local76] + local82 * local54[local76] >> 12;
					local46[local76] = local95 * local70[local76] + local58[local76] * local82 >> 12;
					local50[local76] = local62[local76] * local82 + local74[local76] * local95 >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			super.aBoolean649 = arg1.method5170() == 1;
		}
	}
}
