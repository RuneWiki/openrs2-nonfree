import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class3_Sub2_Sub32 extends Class3_Sub2 {

	@OriginalMember(owner = "client!qp", name = "J", descriptor = "I")
	private int anInt8060 = 4096;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8060 = arg0.method5610();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(30) int[] local30 = this.method8669(arg0 - 1 & Static575.anInt9412, 0);
			@Pc(36) int[] local36 = this.method8669(arg0, 0);
			@Pc(46) int[] local46 = this.method8669(Static575.anInt9412 & arg0 + 1, 0);
			for (@Pc(48) int local48 = 0; local48 < Static201.anInt3738; local48++) {
				@Pc(62) int local62 = this.anInt8060 * (local46[local48] - local30[local48]);
				@Pc(82) int local82 = this.anInt8060 * (local36[Static201.anInt3740 & local48 + 1] - local36[Static201.anInt3740 & local48 - 1]);
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local102 + local96 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(124) int local124 = local116 == 0 ? 0 : 16777216 / local116;
				local16[local48] = 4096 - local124;
			}
		}
		return local16;
	}
}
