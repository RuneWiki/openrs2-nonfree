import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class1_Sub1_Sub25 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
	private int anInt3794 = 4096;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3794 = arg0.method2964();
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(30) int[] local30 = this.method3706(arg0 - 1 & Static30.anInt589, 0);
			@Pc(36) int[] local36 = this.method3706(arg0, 0);
			@Pc(46) int[] local46 = this.method3706(Static30.anInt589 & arg0 + 1, 0);
			for (@Pc(48) int local48 = 0; local48 < Static11.anInt294; local48++) {
				@Pc(62) int local62 = (local46[local48] - local30[local48]) * this.anInt3794;
				@Pc(82) int local82 = this.anInt3794 * (local36[Static147.anInt3169 & local48 + 1] - local36[local48 - 1 & Static147.anInt3169]);
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((float) (local96 + local102 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(125) int local125 = local117 == 0 ? 0 : 16777216 / local117;
				local16[local48] = 4096 - local125;
			}
		}
		return local16;
	}
}
