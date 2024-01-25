import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class2_Sub4_Sub38 extends Class2_Sub4 {

	@OriginalMember(owner = "client!vl", name = "R", descriptor = "I")
	private int anInt6232 = 32768;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub38() {
		super(3, false);
	}

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "(I)V")
	@Override
	public void method5596() {
		Static299.method4462();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6232 = arg0.method5312() << 4;
		} else if (arg1 == 1) {
			super.aBoolean465 = arg0.method5350() == 1;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			@Pc(28) int[] local28 = this.method5600(arg0, 1);
			@Pc(34) int[] local34 = this.method5600(arg0, 2);
			for (@Pc(36) int local36 = 0; local36 < Static76.anInt1458; local36++) {
				@Pc(46) int local46 = local28[local36] >> 4 & 0xFF;
				@Pc(55) int local55 = this.anInt6232 * local34[local36] >> 12;
				@Pc(63) int local63 = Static61.anIntArray261[local46] * local55 >> 12;
				@Pc(71) int local71 = Static1.anIntArray1354[local46] * local55 >> 12;
				@Pc(79) int local79 = Static269.anInt4657 & local36 + (local63 >> 12);
				@Pc(87) int local87 = Static283.anInt4900 & (local71 >> 12) + arg0;
				@Pc(93) int[] local93 = this.method5600(local87, 0);
				local11[local36] = local93[local79];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method5594(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass170_41.method3736(arg0);
		if (super.aClass170_41.aBoolean309) {
			@Pc(26) int[] local26 = this.method5600(arg0, 1);
			@Pc(32) int[] local32 = this.method5600(arg0, 2);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			for (@Pc(46) int local46 = 0; local46 < Static76.anInt1458; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = local32[local46] * this.anInt6232 >> 12;
				@Pc(75) int local75 = Static61.anIntArray261[local58] * local67 >> 12;
				@Pc(83) int local83 = Static1.anIntArray1354[local58] * local67 >> 12;
				@Pc(91) int local91 = Static269.anInt4657 & (local75 >> 12) + local46;
				@Pc(99) int local99 = Static283.anInt4900 & (local83 >> 12) + arg0;
				@Pc(105) int[][] local105 = this.method5591(local99, 0);
				local36[local46] = local105[0][local91];
				local40[local46] = local105[1][local91];
				local44[local46] = local105[2][local91];
			}
		}
		return local16;
	}
}
