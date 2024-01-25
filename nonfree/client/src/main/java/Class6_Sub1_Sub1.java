import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class6_Sub1_Sub1 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
	private int anInt93 = 32768;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub1() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
	@Override
	public void method5611() {
		Static86.method1476();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(21) int[] local21 = this.method5609(1, arg0);
			@Pc(27) int[] local27 = this.method5609(2, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static299.anInt5659; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = local27[local29] * this.anInt93 >> 12;
				@Pc(56) int local56 = local48 * Static313.anIntArray665[local39] >> 12;
				@Pc(64) int local64 = local48 * Static342.anIntArray707[local39] >> 12;
				@Pc(72) int local72 = Static76.anInt2850 & local29 + (local56 >> 12);
				@Pc(80) int local80 = (local64 >> 12) + arg0 & Static113.anInt2099;
				@Pc(86) int[] local86 = this.method5609(0, local80);
				local11[local29] = local86[local72];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5608(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass220_41.method5816(arg0);
		if (super.aClass220_41.aBoolean429) {
			@Pc(26) int[] local26 = this.method5609(1, arg0);
			@Pc(32) int[] local32 = this.method5609(2, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static299.anInt5659; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = local32[local46] * this.anInt93 >> 12;
				@Pc(75) int local75 = local67 * Static313.anIntArray665[local58] >> 12;
				@Pc(83) int local83 = Static342.anIntArray707[local58] * local67 >> 12;
				@Pc(91) int local91 = (local75 >> 12) + local46 & Static76.anInt2850;
				@Pc(99) int local99 = (local83 >> 12) + arg0 & Static113.anInt2099;
				@Pc(105) int[][] local105 = this.method5618(local99, 0);
				local36[local46] = local105[0][local91];
				local40[local46] = local105[1][local91];
				local44[local46] = local105[2][local91];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt93 = arg0.method4021() << 4;
		} else if (arg1 == 1) {
			super.aBoolean411 = arg0.method3972() == 1;
		}
	}
}
