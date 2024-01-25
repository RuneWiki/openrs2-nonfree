import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class6_Sub1_Sub24 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
	private int anInt3811 = 4;

	@OriginalMember(owner = "client!ng", name = "T", descriptor = "I")
	private int anInt3818 = 4;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(27) int[] local27 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(36) int local36 = Static299.anInt5659 / this.anInt3811;
			@Pc(41) int local41 = Static273.anInt6145 / this.anInt3818;
			@Pc(60) int[] local60;
			@Pc(50) int local50;
			if (local41 > 0) {
				local50 = arg0 % local41;
				local60 = this.method5609(0, Static273.anInt6145 * local50 / local41);
			} else {
				local60 = this.method5609(0, 0);
			}
			for (local50 = 0; local50 < Static299.anInt5659; local50++) {
				if (local36 > 0) {
					@Pc(78) int local78 = local50 % local36;
					local27[local50] = local60[local78 * Static299.anInt5659 / local36];
				} else {
					local27[local50] = local60[0];
				}
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3811 = arg0.method3972();
		} else if (arg1 == 1) {
			this.anInt3818 = arg0.method3972();
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5608(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass220_41.method5816(arg0);
		if (super.aClass220_41.aBoolean429) {
			@Pc(27) int local27 = Static299.anInt5659 / this.anInt3811;
			@Pc(32) int local32 = Static273.anInt6145 / this.anInt3818;
			@Pc(40) int[][] local40;
			if (local32 <= 0) {
				local40 = this.method5618(0, 0);
			} else {
				@Pc(46) int local46 = arg0 % local32;
				local40 = this.method5618(local46 * Static273.anInt6145 / local32, 0);
			}
			@Pc(60) int[] local60 = local40[0];
			@Pc(64) int[] local64 = local40[1];
			@Pc(68) int[] local68 = local40[2];
			@Pc(72) int[] local72 = local18[0];
			@Pc(76) int[] local76 = local18[1];
			@Pc(80) int[] local80 = local18[2];
			for (@Pc(82) int local82 = 0; local82 < Static299.anInt5659; local82++) {
				@Pc(99) int local99;
				if (local27 > 0) {
					@Pc(93) int local93 = local82 % local27;
					local99 = Static299.anInt5659 * local93 / local27;
				} else {
					local99 = 0;
				}
				local72[local82] = local60[local99];
				local76[local82] = local64[local99];
				local80[local82] = local68[local99];
			}
		}
		return local18;
	}
}
