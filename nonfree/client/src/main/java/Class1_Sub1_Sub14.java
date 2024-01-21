import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!he", name = "lb", descriptor = "I")
	private int anInt1783 = 2048;

	@OriginalMember(owner = "client!he", name = "rb", descriptor = "I")
	private int anInt1787 = 1024;

	@OriginalMember(owner = "client!he", name = "jb", descriptor = "I")
	private int anInt1782 = 3072;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt1787 = arg1.method1753();
		} else if (arg0 == 1) {
			this.anInt1782 = arg1.method1753();
		} else if (arg0 == 2) {
			super.aBoolean185 = arg1.method1738() == 1;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(28) int[] local28 = this.method3303(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static176.anInt3921; local30++) {
				local16[local30] = this.anInt1787 + (local28[local30] * this.anInt1783 >> 12);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	@Override
	public void method3301() {
		this.anInt1783 = this.anInt1782 - this.anInt1787;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82) {
			@Pc(26) int[][] local26 = this.method3307(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local16[1];
			@Pc(42) int[] local42 = local26[2];
			@Pc(46) int[] local46 = local16[0];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static176.anInt3921; local52++) {
				local46[local52] = this.anInt1787 + (this.anInt1783 * local30[local52] >> 12);
				local38[local52] = this.anInt1787 + (this.anInt1783 * local34[local52] >> 12);
				local50[local52] = (local42[local52] * this.anInt1783 >> 12) + this.anInt1787;
			}
		}
		return local16;
	}
}
