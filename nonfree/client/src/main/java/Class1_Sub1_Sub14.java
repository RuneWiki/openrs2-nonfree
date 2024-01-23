import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ij", name = "Y", descriptor = "I")
	private int anInt2066 = 3072;

	@OriginalMember(owner = "client!ij", name = "X", descriptor = "I")
	private int anInt2065 = 1024;

	@OriginalMember(owner = "client!ij", name = "hb", descriptor = "I")
	private int anInt2074 = 2048;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(26) int[] local26 = this.method3706(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static11.anInt294; local28++) {
				local16[local28] = (local26[local28] * this.anInt2074 >> 12) + this.anInt2065;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(Z)V")
	@Override
	public void method3716() {
		this.anInt2074 = this.anInt2066 - this.anInt2065;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3704(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass71_41.method2050(arg0);
		if (super.aClass71_41.aBoolean221) {
			@Pc(29) int[][] local29 = this.method3713(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static11.anInt294; local55++) {
				local45[local55] = this.anInt2065 + (this.anInt2074 * local33[local55] >> 12);
				local49[local55] = this.anInt2065 + (local37[local55] * this.anInt2074 >> 12);
				local53[local55] = (this.anInt2074 * local41[local55] >> 12) + this.anInt2065;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2065 = arg0.method2964();
		} else if (arg1 == 1) {
			this.anInt2066 = arg0.method2964();
		} else if (arg1 == 2) {
			super.aBoolean442 = arg0.method2945() == 1;
		}
	}
}
