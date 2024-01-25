import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class3_Sub3_Sub13 extends Class3_Sub3 {

	@OriginalMember(owner = "client!fp", name = "J", descriptor = "I")
	private int anInt2035 = 1024;

	@OriginalMember(owner = "client!fp", name = "I", descriptor = "I")
	private int anInt2034 = 3072;

	@OriginalMember(owner = "client!fp", name = "X", descriptor = "I")
	private int anInt2043 = 2048;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)V")
	@Override
	public void method5730() {
		this.anInt2043 = this.anInt2034 - this.anInt2035;
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(26) int[] local26 = this.method5733(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static131.anInt2755; local28++) {
				local11[local28] = (local26[local28] * this.anInt2043 >> 12) + this.anInt2035;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2035 = arg0.method3649();
		} else if (arg1 == 1) {
			this.anInt2034 = arg0.method3649();
		} else if (arg1 == 2) {
			super.aBoolean454 = arg0.method3643() == 1;
		}
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method5734(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass84_41.method2091(arg0);
		if (super.aClass84_41.aBoolean144) {
			@Pc(26) int[][] local26 = this.method5729(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static131.anInt2755; local52++) {
				local42[local52] = this.anInt2035 + (this.anInt2043 * local30[local52] >> 12);
				local46[local52] = (this.anInt2043 * local34[local52] >> 12) + this.anInt2035;
				local50[local52] = (this.anInt2043 * local38[local52] >> 12) + this.anInt2035;
			}
		}
		return local16;
	}
}
