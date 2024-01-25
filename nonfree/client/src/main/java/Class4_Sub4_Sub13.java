import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class4_Sub4_Sub13 extends Class4_Sub4 {

	@OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
	private int anInt3476 = 32768;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub13() {
		super(3, false);
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6043(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass163_41.method3181(arg0);
		if (super.aClass163_41.aBoolean296) {
			@Pc(28) int[] local28 = this.method6040(arg0, 1);
			@Pc(34) int[] local34 = this.method6040(arg0, 2);
			@Pc(38) int[] local38 = local16[0];
			@Pc(42) int[] local42 = local16[1];
			@Pc(46) int[] local46 = local16[2];
			for (@Pc(48) int local48 = 0; local48 < Static419.anInt6404; local48++) {
				@Pc(60) int local60 = local28[local48] * 255 >> 12 & 0xFF;
				@Pc(69) int local69 = this.anInt3476 * local34[local48] >> 12;
				@Pc(77) int local77 = local69 * Static214.anIntArray275[local60] >> 12;
				@Pc(85) int local85 = Static449.anIntArray563[local60] * local69 >> 12;
				@Pc(93) int local93 = Static211.anInt3669 & (local77 >> 12) + local48;
				@Pc(101) int local101 = Static204.anInt3610 & (local85 >> 12) + arg0;
				@Pc(107) int[][] local107 = this.method6049(local101, 0);
				local38[local48] = local107[0][local93];
				local42[local48] = local107[1][local93];
				local46[local48] = local107[2][local93];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt3476 = arg1.method5028() << 4;
		} else if (arg0 == 1) {
			super.aBoolean535 = arg1.method5007() == 1;
		}
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(Z)V")
	@Override
	public void method6038() {
		Static232.method3165();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(26) int[] local26 = this.method6040(arg0, 1);
			@Pc(34) int[] local34 = this.method6040(arg0, 2);
			for (@Pc(36) int local36 = 0; local36 < Static419.anInt6404; local36++) {
				@Pc(46) int local46 = local26[local36] >> 4 & 0xFF;
				@Pc(55) int local55 = this.anInt3476 * local34[local36] >> 12;
				@Pc(63) int local63 = Static214.anIntArray275[local46] * local55 >> 12;
				@Pc(71) int local71 = local55 * Static449.anIntArray563[local46] >> 12;
				@Pc(80) int local80 = local36 + (local63 >> 12) & Static211.anInt3669;
				@Pc(89) int local89 = arg0 + (local71 >> 12) & Static204.anInt3610;
				@Pc(95) int[] local95 = this.method6040(local89, 0);
				local11[local36] = local95[local80];
			}
		}
		return local11;
	}
}
