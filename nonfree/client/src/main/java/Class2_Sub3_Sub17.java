import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class2_Sub3_Sub17 extends Class2_Sub3 {

	@OriginalMember(owner = "client!o", name = "gb", descriptor = "I")
	private int anInt2784;

	@OriginalMember(owner = "client!o", name = "ub", descriptor = "I")
	private int anInt2792;

	@OriginalMember(owner = "client!o", name = "hb", descriptor = "I")
	private int anInt2785;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(28) int[] local28 = this.method2901(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static54.anInt1423; local30++) {
				local11[local30] = this.anInt2784 + (this.anInt2785 * local28[local30] >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(Z)V")
	@Override
	public void method2892() {
		this.anInt2785 = this.anInt2792 - this.anInt2784;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method2894(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass12_39.method485(arg0);
		if (super.aClass12_39.aBoolean24) {
			@Pc(25) int[][] local25 = this.method2900(arg0, 0);
			@Pc(29) int[] local29 = local25[2];
			@Pc(33) int[] local33 = local15[0];
			@Pc(37) int[] local37 = local25[1];
			@Pc(41) int[] local41 = local15[1];
			@Pc(45) int[] local45 = local15[2];
			@Pc(49) int[] local49 = local25[0];
			for (@Pc(51) int local51 = 0; local51 < Static54.anInt1423; local51++) {
				local33[local51] = this.anInt2784 + (local49[local51] * this.anInt2785 >> 12);
				local41[local51] = this.anInt2784 + (this.anInt2785 * local37[local51] >> 12);
				local45[local51] = (local29[local51] * this.anInt2785 >> 12) + this.anInt2784;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt2784 = arg1.method1680();
		} else if (arg0 == 1) {
			this.anInt2792 = arg1.method1680();
		} else if (arg0 == 2) {
			super.aBoolean173 = arg1.method1698() == 1;
		}
	}
}
