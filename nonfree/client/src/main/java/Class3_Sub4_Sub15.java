import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class3_Sub4_Sub15 extends Class3_Sub4 {

	@OriginalMember(owner = "client!gv", name = "L", descriptor = "I")
	private int anInt2581 = 3072;

	@OriginalMember(owner = "client!gv", name = "K", descriptor = "I")
	private int anInt2580 = 1024;

	@OriginalMember(owner = "client!gv", name = "N", descriptor = "I")
	private int anInt2583 = 2048;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method6144(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass148_41.method3566(arg0);
		if (super.aClass148_41.aBoolean309) {
			@Pc(29) int[][] local29 = this.method6138(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static148.anInt2687; local55++) {
				local45[local55] = (this.anInt2583 * local33[local55] >> 12) + this.anInt2580;
				local49[local55] = (local37[local55] * this.anInt2583 >> 12) + this.anInt2580;
				local53[local55] = this.anInt2580 + (this.anInt2583 * local41[local55] >> 12);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2580 = arg0.method4083();
		} else if (arg1 == 1) {
			this.anInt2581 = arg0.method4083();
		} else if (arg1 == 2) {
			super.aBoolean504 = arg0.method4096() == 1;
		}
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(27) int[] local27 = this.method6139(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static148.anInt2687; local29++) {
				local17[local29] = this.anInt2580 + (this.anInt2583 * local27[local29] >> 12);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "(I)V")
	@Override
	public void method6146() {
		this.anInt2583 = this.anInt2581 - this.anInt2580;
	}
}
