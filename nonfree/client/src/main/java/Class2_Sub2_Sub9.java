import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class2_Sub2_Sub9 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
	private int anInt2435 = 1024;

	@OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
	private int anInt2436 = 2048;

	@OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
	private int anInt2438 = 3072;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5836(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass175_41.method4051(arg0);
		if (super.aClass175_41.aBoolean375) {
			@Pc(29) int[][] local29 = this.method5840(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static429.anInt6518; local55++) {
				local45[local55] = this.anInt2435 + (this.anInt2436 * local33[local55] >> 12);
				local49[local55] = (local37[local55] * this.anInt2436 >> 12) + this.anInt2435;
				local53[local55] = (local41[local55] * this.anInt2436 >> 12) + this.anInt2435;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)V")
	@Override
	public void method5845() {
		this.anInt2436 = this.anInt2438 - this.anInt2435;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2435 = arg0.method5500();
		} else if (arg1 == 1) {
			this.anInt2438 = arg0.method5500();
		} else if (arg1 == 2) {
			super.aBoolean488 = arg0.method5495() == 1;
		}
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(29) int[] local29 = this.method5839(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static429.anInt6518; local31++) {
				local11[local31] = (local29[local31] * this.anInt2436 >> 12) + this.anInt2435;
			}
		}
		return local11;
	}
}
