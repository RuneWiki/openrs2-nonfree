import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class4_Sub2_Sub16 extends Class4_Sub2 {

	@OriginalMember(owner = "client!in", name = "R", descriptor = "I")
	private int anInt3223 = 4096;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub16() {
		super(1, true);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(30) int[] local30 = this.method5847(0, arg0 - 1 & Static323.anInt5763);
			@Pc(36) int[] local36 = this.method5847(0, arg0);
			@Pc(46) int[] local46 = this.method5847(0, arg0 + 1 & Static323.anInt5763);
			for (@Pc(48) int local48 = 0; local48 < Static350.anInt6330; local48++) {
				@Pc(61) int local61 = (local46[local48] - local30[local48]) * this.anInt3223;
				@Pc(81) int local81 = this.anInt3223 * (local36[Static144.anInt2707 & local48 + 1] - local36[local48 - 1 & Static144.anInt2707]);
				@Pc(85) int local85 = local81 >> 12;
				@Pc(89) int local89 = local61 >> 12;
				@Pc(95) int local95 = local85 * local85 >> 12;
				@Pc(101) int local101 = local89 * local89 >> 12;
				@Pc(115) int local115 = (int) (Math.sqrt((double) ((float) (local101 + local95 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(123) int local123 = local115 == 0 ? 0 : 16777216 / local115;
				local16[local48] = 4096 - local123;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt3223 = arg1.method4877();
		}
	}
}
