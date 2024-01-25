import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class1_Sub8_Sub11 extends Class1_Sub8 {

	@OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
	private int anInt2928 = 3072;

	@OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
	private int anInt2930 = 2048;

	@OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
	private int anInt2932 = 1024;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6030(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method3108(arg0);
		if (super.aClass130_41.aBoolean246) {
			@Pc(29) int[][] local29 = this.method6035(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static18.anInt439; local55++) {
				local45[local55] = this.anInt2932 + (local33[local55] * this.anInt2930 >> 12);
				local49[local55] = (this.anInt2930 * local37[local55] >> 12) + this.anInt2932;
				local53[local55] = this.anInt2932 + (local41[local55] * this.anInt2930 >> 12);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)V")
	@Override
	public void method6033() {
		this.anInt2930 = this.anInt2928 - this.anInt2932;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt2932 = arg1.method1177();
		} else if (arg0 == 1) {
			this.anInt2928 = arg1.method1177();
		} else if (arg0 == 2) {
			super.aBoolean508 = arg1.method1171() == 1;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(29) int[] local29 = this.method6037(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static18.anInt439; local31++) {
				local11[local31] = this.anInt2932 + (local29[local31] * this.anInt2930 >> 12);
			}
		}
		return local11;
	}
}
