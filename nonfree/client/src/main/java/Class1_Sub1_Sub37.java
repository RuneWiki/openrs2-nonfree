import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class1_Sub1_Sub37 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ui", name = "Y", descriptor = "I")
	private int anInt4493 = 3072;

	@OriginalMember(owner = "client!ui", name = "gb", descriptor = "I")
	private int anInt4499 = 2048;

	@OriginalMember(owner = "client!ui", name = "jb", descriptor = "I")
	private int anInt4501 = 1024;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(28) int[] local28 = this.method3733(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static157.anInt3431; local30++) {
				local18[local30] = (local28[local30] * this.anInt4499 >> 12) + this.anInt4501;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134) {
			@Pc(26) int[][] local26 = this.method3737(0, arg0);
			@Pc(30) int[] local30 = local26[1];
			@Pc(34) int[] local34 = local26[0];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static157.anInt3431; local52++) {
				local42[local52] = (this.anInt4499 * local34[local52] >> 12) + this.anInt4501;
				local46[local52] = (this.anInt4499 * local30[local52] >> 12) + this.anInt4501;
				local50[local52] = (this.anInt4499 * local38[local52] >> 12) + this.anInt4501;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4501 = arg0.method3805();
		} else if (arg1 == 1) {
			this.anInt4493 = arg0.method3805();
		} else if (arg1 == 2) {
			super.aBoolean213 = arg0.method3793() == 1;
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V")
	@Override
	public void method3739() {
		this.anInt4499 = this.anInt4493 - this.anInt4501;
	}
}
