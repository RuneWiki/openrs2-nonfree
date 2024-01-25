import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class1_Sub3_Sub15 extends Class1_Sub3 {

	@OriginalMember(owner = "client!jk", name = "T", descriptor = "I")
	private int anInt4398 = 32768;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub15() {
		super(3, false);
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V")
	@Override
	public void method8197() {
		Static371.method5980();
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8190(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass281_41.method7073(arg0);
		if (super.aClass281_41.aBoolean590) {
			@Pc(26) int[] local26 = this.method8201(1, arg0);
			@Pc(32) int[] local32 = this.method8201(2, arg0);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			for (@Pc(46) int local46 = 0; local46 < Static254.anInt4973; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = this.anInt4398 * local32[local46] >> 12;
				@Pc(75) int local75 = local67 * Static246.anIntArray361[local58] >> 12;
				@Pc(83) int local83 = local67 * Static494.anIntArray759[local58] >> 12;
				@Pc(91) int local91 = local46 + (local75 >> 12) & Static184.anInt3830;
				@Pc(99) int local99 = (local83 >> 12) + arg0 & Static109.anInt2298;
				@Pc(105) int[][] local105 = this.method8199(0, local99);
				local36[local46] = local105[0][local91];
				local40[local46] = local105[1][local91];
				local44[local46] = local105[2][local91];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt4398 = arg1.method4494() << 4;
		} else if (arg0 == 1) {
			super.aBoolean708 = arg1.method4487() == 1;
		}
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(26) int[] local26 = this.method8201(1, arg0);
			@Pc(32) int[] local32 = this.method8201(2, arg0);
			for (@Pc(34) int local34 = 0; local34 < Static254.anInt4973; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = local32[local34] * this.anInt4398 >> 12;
				@Pc(61) int local61 = Static246.anIntArray361[local44] * local53 >> 12;
				@Pc(69) int local69 = local53 * Static494.anIntArray759[local44] >> 12;
				@Pc(77) int local77 = Static184.anInt3830 & (local61 >> 12) + local34;
				@Pc(85) int local85 = arg0 + (local69 >> 12) & Static109.anInt2298;
				@Pc(91) int[] local91 = this.method8201(0, local85);
				local11[local34] = local91[local77];
			}
		}
		return local11;
	}
}
