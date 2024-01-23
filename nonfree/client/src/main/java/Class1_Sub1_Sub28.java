import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class1_Sub1_Sub28 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
	private int anInt4283 = 4096;

	@OriginalMember(owner = "client!sf", name = "Z", descriptor = "I")
	private int anInt4281 = 4096;

	@OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
	private int anInt4277 = 4096;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4277 = arg0.method2964();
		} else if (arg1 == 1) {
			this.anInt4281 = arg0.method2964();
		} else if (arg1 == 2) {
			this.anInt4283 = arg0.method2964();
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3704(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass71_41.method2050(arg0);
		if (super.aClass71_41.aBoolean221) {
			@Pc(21) int[][] local21 = this.method3713(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[2];
			@Pc(33) int[] local33 = local21[1];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[2];
			@Pc(45) int[] local45 = local11[1];
			for (@Pc(47) int local47 = 0; local47 < Static11.anInt294; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local29[local47];
				@Pc(61) int local61 = local33[local47];
				if (local57 == local53 && local57 == local61) {
					local37[local47] = this.anInt4277 * local53 >> 12;
					local45[local47] = this.anInt4281 * local57 >> 12;
					local41[local47] = this.anInt4283 * local61 >> 12;
				} else {
					local37[local47] = this.anInt4277;
					local45[local47] = this.anInt4281;
					local41[local47] = this.anInt4283;
				}
			}
		}
		return local11;
	}
}
