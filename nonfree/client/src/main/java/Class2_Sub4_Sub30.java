import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class2_Sub4_Sub30 extends Class2_Sub4 {

	@OriginalMember(owner = "client!re", name = "gb", descriptor = "I")
	private int anInt3631 = 3072;

	@OriginalMember(owner = "client!re", name = "Y", descriptor = "I")
	private int anInt3627 = 2048;

	@OriginalMember(owner = "client!re", name = "pb", descriptor = "I")
	private int anInt3633 = 1024;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3633 = arg1.method1557();
		} else if (arg0 == 1) {
			this.anInt3631 = arg1.method1557();
		} else if (arg0 == 2) {
			super.aBoolean190 = arg1.method1534() == 1;
		}
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
	@Override
	public void method3133() {
		this.anInt3627 = this.anInt3631 - this.anInt3633;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3122(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass99_41.method2748(arg0);
		if (super.aClass99_41.aBoolean176) {
			@Pc(29) int[][] local29 = this.method3130(arg0, 0);
			@Pc(33) int[] local33 = local29[1];
			@Pc(37) int[] local37 = local29[2];
			@Pc(41) int[] local41 = local29[0];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static118.anInt2608; local55++) {
				local45[local55] = this.anInt3633 + (this.anInt3627 * local41[local55] >> 12);
				local49[local55] = this.anInt3633 + (this.anInt3627 * local33[local55] >> 12);
				local53[local55] = (local37[local55] * this.anInt3627 >> 12) + this.anInt3633;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(25) int[] local25 = this.method3129(0, arg0);
			for (@Pc(27) int local27 = 0; local27 < Static118.anInt2608; local27++) {
				local9[local27] = (local25[local27] * this.anInt3627 >> 12) + this.anInt3633;
			}
		}
		return local9;
	}
}
