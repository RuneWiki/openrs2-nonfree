import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class3_Sub4_Sub12 extends Class3_Sub4 {

	@OriginalMember(owner = "client!fp", name = "M", descriptor = "I")
	private int anInt2069 = 4096;

	static {
		new Class174(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub12() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(30) int[] local30 = this.method6139(0, Static165.anInt2326 & arg0 - 1);
			@Pc(36) int[] local36 = this.method6139(0, arg0);
			@Pc(46) int[] local46 = this.method6139(0, Static165.anInt2326 & arg0 + 1);
			for (@Pc(48) int local48 = 0; local48 < Static148.anInt2687; local48++) {
				@Pc(62) int local62 = this.anInt2069 * (local46[local48] - local30[local48]);
				@Pc(81) int local81 = (local36[Static225.anInt3793 & local48 + 1] - local36[local48 - 1 & Static225.anInt3793]) * this.anInt2069;
				@Pc(85) int local85 = local81 >> 12;
				@Pc(89) int local89 = local62 >> 12;
				@Pc(95) int local95 = local85 * local85 >> 12;
				@Pc(101) int local101 = local89 * local89 >> 12;
				@Pc(115) int local115 = (int) (Math.sqrt((double) ((float) (local101 + local95 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(126) int local126 = local115 == 0 ? 0 : 16777216 / local115;
				local16[local48] = 4096 - local126;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2069 = arg0.method4083();
		}
	}
}
