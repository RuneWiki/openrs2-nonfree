import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class2_Sub6_Sub28 extends Class2_Sub6 {

	@OriginalMember(owner = "client!pa", name = "T", descriptor = "I")
	private int anInt4714 = 32768;

	static {
		new Class221(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub28() {
		super(3, false);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5641(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass208_41.method4986(arg0);
		if (super.aClass208_41.aBoolean443) {
			@Pc(23) int[] local23 = this.method5635(arg0, 1);
			@Pc(29) int[] local29 = this.method5635(arg0, 2);
			@Pc(33) int[] local33 = local11[0];
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int[] local41 = local11[2];
			for (@Pc(43) int local43 = 0; local43 < Static151.anInt2711; local43++) {
				@Pc(55) int local55 = local23[local43] * 255 >> 12 & 0xFF;
				@Pc(64) int local64 = local29[local43] * this.anInt4714 >> 12;
				@Pc(72) int local72 = Static60.anIntArray160[local55] * local64 >> 12;
				@Pc(80) int local80 = local64 * Static353.anIntArray753[local55] >> 12;
				@Pc(88) int local88 = local43 + (local72 >> 12) & Static274.anInt1078;
				@Pc(96) int local96 = Static71.anInt1349 & arg0 + (local80 >> 12);
				@Pc(102) int[][] local102 = this.method5640(0, local96);
				local33[local43] = local102[0][local88];
				local37[local43] = local102[1][local88];
				local41[local43] = local102[2][local88];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
	@Override
	public void method5639() {
		Static155.method2588();
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(28) int[] local28 = this.method5635(arg0, 1);
			@Pc(34) int[] local34 = this.method5635(arg0, 2);
			for (@Pc(36) int local36 = 0; local36 < Static151.anInt2711; local36++) {
				@Pc(46) int local46 = local28[local36] >> 4 & 0xFF;
				@Pc(55) int local55 = local34[local36] * this.anInt4714 >> 12;
				@Pc(63) int local63 = Static60.anIntArray160[local46] * local55 >> 12;
				@Pc(71) int local71 = Static353.anIntArray753[local46] * local55 >> 12;
				@Pc(79) int local79 = local36 + (local63 >> 12) & Static274.anInt1078;
				@Pc(87) int local87 = arg0 + (local71 >> 12) & Static71.anInt1349;
				@Pc(95) int[] local95 = this.method5635(local87, 0);
				local18[local36] = local95[local79];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4714 = arg0.method4245() << 4;
		} else if (arg1 == 1) {
			super.aBoolean491 = arg0.method4240() == 1;
		}
	}
}
