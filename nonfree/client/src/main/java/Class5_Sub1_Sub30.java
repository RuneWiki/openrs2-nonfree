import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class5_Sub1_Sub30 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
	private int anInt4964 = 32768;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub30() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5763(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass154_41.method3176(arg0);
		if (super.aClass154_41.aBoolean254) {
			@Pc(26) int[] local26 = this.method5772(1, arg0);
			@Pc(32) int[] local32 = this.method5772(2, arg0);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			for (@Pc(46) int local46 = 0; local46 < Static148.anInt2666; local46++) {
				@Pc(58) int local58 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(67) int local67 = local32[local46] * this.anInt4964 >> 12;
				@Pc(75) int local75 = Static412.anIntArray467[local58] * local67 >> 12;
				@Pc(83) int local83 = Static451.anIntArray501[local58] * local67 >> 12;
				@Pc(91) int local91 = local46 + (local75 >> 12) & Static273.anInt4299;
				@Pc(100) int local100 = Static157.anInt2733 & arg0 + (local83 >> 12);
				@Pc(106) int[][] local106 = this.method5764(0, local100);
				local36[local46] = local106[0][local91];
				local40[local46] = local106[1][local91];
				local44[local46] = local106[2][local91];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt4964 = arg1.method5598() << 4;
		} else if (arg0 == 1) {
			super.aBoolean486 = arg1.method5539() == 1;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			@Pc(23) int[] local23 = this.method5772(1, arg0);
			@Pc(29) int[] local29 = this.method5772(2, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static148.anInt2666; local31++) {
				@Pc(41) int local41 = local23[local31] >> 4 & 0xFF;
				@Pc(50) int local50 = this.anInt4964 * local29[local31] >> 12;
				@Pc(58) int local58 = Static412.anIntArray467[local41] * local50 >> 12;
				@Pc(66) int local66 = local50 * Static451.anIntArray501[local41] >> 12;
				@Pc(74) int local74 = Static273.anInt4299 & (local58 >> 12) + local31;
				@Pc(82) int local82 = Static157.anInt2733 & (local66 >> 12) + arg0;
				@Pc(88) int[] local88 = this.method5772(0, local82);
				local11[local31] = local88[local74];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	@Override
	public void method5762() {
		Static56.method929();
	}
}
