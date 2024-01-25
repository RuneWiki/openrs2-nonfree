import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class4_Sub6_Sub37 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ur", name = "K", descriptor = "I")
	private int anInt6304 = 32768;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub37() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt6304 = arg1.method3401() << 4;
		} else if (arg0 == 1) {
			super.aBoolean489 = arg1.method3440() == 1;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(21) int[] local21 = this.method5702(arg0, 1);
			@Pc(27) int[] local27 = this.method5702(arg0, 2);
			for (@Pc(29) int local29 = 0; local29 < Static31.anInt797; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = local27[local29] * this.anInt6304 >> 12;
				@Pc(56) int local56 = local48 * Static232.anIntArray392[local39] >> 12;
				@Pc(64) int local64 = local48 * Static7.anIntArray5[local39] >> 12;
				@Pc(72) int local72 = Static335.anInt6403 & local29 + (local56 >> 12);
				@Pc(80) int local80 = (local64 >> 12) + arg0 & Static341.anInt266;
				@Pc(86) int[] local86 = this.method5702(local80, 0);
				local11[local29] = local86[local72];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "(B)V")
	@Override
	public void method5700() {
		Static147.method2993();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5694(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass90_41.method2575(arg0);
		if (super.aClass90_41.aBoolean211) {
			@Pc(28) int[] local28 = this.method5702(arg0, 1);
			@Pc(34) int[] local34 = this.method5702(arg0, 2);
			@Pc(38) int[] local38 = local18[0];
			@Pc(42) int[] local42 = local18[1];
			@Pc(46) int[] local46 = local18[2];
			for (@Pc(48) int local48 = 0; local48 < Static31.anInt797; local48++) {
				@Pc(60) int local60 = local28[local48] * 255 >> 12 & 0xFF;
				@Pc(69) int local69 = this.anInt6304 * local34[local48] >> 12;
				@Pc(77) int local77 = local69 * Static232.anIntArray392[local60] >> 12;
				@Pc(85) int local85 = Static7.anIntArray5[local60] * local69 >> 12;
				@Pc(93) int local93 = Static335.anInt6403 & local48 + (local77 >> 12);
				@Pc(101) int local101 = Static341.anInt266 & (local85 >> 12) + arg0;
				@Pc(109) int[][] local109 = this.method5693(0, local101);
				local38[local48] = local109[0][local93];
				local42[local48] = local109[1][local93];
				local46[local48] = local109[2][local93];
			}
		}
		return local18;
	}
}
