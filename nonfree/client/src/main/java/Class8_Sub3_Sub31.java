import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class8_Sub3_Sub31 extends Class8_Sub3 {

	@OriginalMember(owner = "client!pn", name = "P", descriptor = "I")
	private int anInt4305 = 32768;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub31() {
		super(3, false);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt4305 = arg1.method2375() << 4;
		} else if (arg0 == 1) {
			this.aBoolean469 = arg1.method2334() == 1;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451) {
			@Pc(26) int[] local26 = this.method4230(arg0, 1);
			@Pc(32) int[] local32 = this.method4230(arg0, 2);
			@Pc(36) int[] local36 = local12[1];
			@Pc(40) int[] local40 = local12[0];
			@Pc(44) int[] local44 = local12[2];
			for (@Pc(46) int local46 = 0; local46 < Static239.anInt4789; local46++) {
				@Pc(62) int local62 = local32[local46] * this.anInt4305 >> 12;
				@Pc(72) int local72 = local26[local46] * 255 >> 12 & 0xFF;
				@Pc(80) int local80 = local62 * Static19.anIntArray36[local72] >> 12;
				@Pc(88) int local88 = Static15.anIntArray18[local72] * local62 >> 12;
				@Pc(96) int local96 = Static51.anInt1120 & (local80 >> 12) + arg0;
				@Pc(105) int local105 = local46 + (local88 >> 12) & Static214.anInt4402;
				@Pc(111) int[][] local111 = this.method4224(local96, 0);
				local40[local46] = local111[0][local105];
				local36[local46] = local111[1][local105];
				local44[local46] = local111[2][local105];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)V")
	@Override
	public void method4220() {
		Static111.method1828();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(28) int[] local28 = this.method4230(arg0, 1);
			@Pc(34) int[] local34 = this.method4230(arg0, 2);
			for (@Pc(36) int local36 = 0; local36 < Static239.anInt4789; local36++) {
				@Pc(51) int local51 = local28[local36] >> 4 & 0xFF;
				@Pc(60) int local60 = this.anInt4305 * local34[local36] >> 12;
				@Pc(68) int local68 = Static15.anIntArray18[local51] * local60 >> 12;
				@Pc(76) int local76 = local60 * Static19.anIntArray36[local51] >> 12;
				@Pc(84) int local84 = arg0 + (local76 >> 12) & Static51.anInt1120;
				@Pc(92) int local92 = local36 + (local68 >> 12) & Static214.anInt4402;
				@Pc(98) int[] local98 = this.method4230(local84, 0);
				local7[local36] = local98[local92];
			}
		}
		return local7;
	}
}
