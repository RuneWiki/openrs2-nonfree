import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class5_Sub2_Sub30 extends Class5_Sub2 {

	@OriginalMember(owner = "client!tk", name = "I", descriptor = "I")
	private int anInt9343 = 4096;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub30() {
		super(1, true);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass333_41.method7747(arg0);
		if (super.aClass333_41.aBoolean779) {
			@Pc(30) int[] local30 = this.method8945(arg0 - 1 & Static115.anInt2379, 0);
			@Pc(36) int[] local36 = this.method8945(arg0, 0);
			@Pc(46) int[] local46 = this.method8945(Static115.anInt2379 & arg0 + 1, 0);
			for (@Pc(48) int local48 = 0; local48 < Static195.anInt3759; local48++) {
				@Pc(62) int local62 = this.anInt9343 * (local46[local48] - local30[local48]);
				@Pc(82) int local82 = (local36[Static388.anInt6925 & local48 + 1] - local36[Static388.anInt6925 & local48 - 1]) * this.anInt9343;
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local102 + local96 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(124) int local124 = local116 == 0 ? 0 : 16777216 / local116;
				local11[local48] = 4096 - local124;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!mc;II)V")
	@Override
	public void method8944(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9343 = arg0.method7860();
		}
	}
}
