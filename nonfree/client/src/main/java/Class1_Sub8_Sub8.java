import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class1_Sub8_Sub8 extends Class1_Sub8 {

	@OriginalMember(owner = "client!er", name = "P", descriptor = "I")
	private int anInt2413 = 4096;

	@OriginalMember(owner = "client!er", name = "I", descriptor = "I")
	private int anInt2407 = 0;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt2407 = arg1.method1177();
		} else if (arg0 == 1) {
			this.anInt2413 = arg1.method1177();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(29) int[] local29 = this.method6037(0, arg0);
			for (@Pc(31) int local31 = 0; local31 < Static18.anInt439; local31++) {
				@Pc(37) int local37 = local29[local31];
				local11[local31] = local37 >= this.anInt2407 && local37 <= this.anInt2413 ? 4096 : 0;
			}
		}
		return local11;
	}
}
