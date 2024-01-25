import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class8_Sub2_Sub32 extends Class8_Sub2 {

	@OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
	private int anInt9445 = 4;

	@OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
	private int anInt9448 = 4;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8500(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass269_41.method6817(arg0);
		if (super.aClass269_41.aBoolean591) {
			@Pc(20) int local20 = Static538.anInt9297 / this.anInt9445;
			@Pc(25) int local25 = Static159.anInt8698 / this.anInt9448;
			@Pc(44) int[][] local44;
			if (local25 > 0) {
				@Pc(34) int local34 = arg0 % local25;
				local44 = this.method8510(0, Static159.anInt8698 * local34 / local25);
			} else {
				local44 = this.method8510(0, 0);
			}
			@Pc(56) int[] local56 = local44[0];
			@Pc(60) int[] local60 = local44[1];
			@Pc(64) int[] local64 = local44[2];
			@Pc(68) int[] local68 = local11[0];
			@Pc(72) int[] local72 = local11[1];
			@Pc(76) int[] local76 = local11[2];
			for (@Pc(78) int local78 = 0; local78 < Static538.anInt9297; local78++) {
				@Pc(95) int local95;
				if (local20 > 0) {
					@Pc(89) int local89 = local78 % local20;
					local95 = local89 * Static538.anInt9297 / local20;
				} else {
					local95 = 0;
				}
				local68[local78] = local56[local95];
				local72[local78] = local60[local95];
				local76[local78] = local64[local95];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt9445 = arg1.method8525();
		} else if (arg0 == 1) {
			this.anInt9448 = arg1.method8525();
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(25) int local25 = Static538.anInt9297 / this.anInt9445;
			@Pc(30) int local30 = Static159.anInt8698 / this.anInt9448;
			@Pc(46) int[] local46;
			@Pc(36) int local36;
			if (local30 > 0) {
				local36 = arg0 % local30;
				local46 = this.method8505(Static159.anInt8698 * local36 / local30, 0);
			} else {
				local46 = this.method8505(0, 0);
			}
			for (local36 = 0; local36 < Static538.anInt9297; local36++) {
				if (local25 <= 0) {
					local11[local36] = local46[0];
				} else {
					@Pc(72) int local72 = local36 % local25;
					local11[local36] = local46[Static538.anInt9297 * local72 / local25];
				}
			}
		}
		return local11;
	}
}
