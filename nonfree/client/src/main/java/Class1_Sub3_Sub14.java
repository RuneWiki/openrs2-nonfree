import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class1_Sub3_Sub14 extends Class1_Sub3 {

	@OriginalMember(owner = "client!gp", name = "I", descriptor = "I")
	private int anInt2410 = 3072;

	@OriginalMember(owner = "client!gp", name = "K", descriptor = "I")
	private int anInt2412 = 1024;

	@OriginalMember(owner = "client!gp", name = "R", descriptor = "I")
	private int anInt2418 = 2048;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "(I)V")
	@Override
	public void method5535() {
		this.anInt2418 = this.anInt2410 - this.anInt2412;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415) {
			@Pc(26) int[][] local26 = this.method5528(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static153.anInt3378; local52++) {
				local42[local52] = this.anInt2412 + (this.anInt2418 * local30[local52] >> 12);
				local46[local52] = this.anInt2412 + (this.anInt2418 * local34[local52] >> 12);
				local50[local52] = (local38[local52] * this.anInt2418 >> 12) + this.anInt2412;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(29) int[] local29 = this.method5532(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static153.anInt3378; local31++) {
				local11[local31] = this.anInt2412 + (this.anInt2418 * local29[local31] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2412 = arg1.method4556();
		} else if (arg0 == 1) {
			this.anInt2410 = arg1.method4556();
		} else if (arg0 == 2) {
			super.aBoolean647 = arg1.method4532() == 1;
		}
	}
}
