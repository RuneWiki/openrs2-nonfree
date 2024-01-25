import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class2_Sub3_Sub13 extends Class2_Sub3 {

	@OriginalMember(owner = "client!h", name = "P", descriptor = "I")
	private int anInt2496 = 4096;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub13() {
		super(1, true);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt2496 = arg1.method3104();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(30) int[] local30 = this.method5700(0, arg0 - 1 & Static241.anInt5135);
			@Pc(36) int[] local36 = this.method5700(0, arg0);
			@Pc(46) int[] local46 = this.method5700(0, arg0 + 1 & Static241.anInt5135);
			for (@Pc(48) int local48 = 0; local48 < Static263.anInt5504; local48++) {
				@Pc(61) int local61 = this.anInt2496 * (local46[local48] - local30[local48]);
				@Pc(81) int local81 = this.anInt2496 * (local36[Static171.anInt3863 & local48 + 1] - local36[Static171.anInt3863 & local48 - 1]);
				@Pc(85) int local85 = local81 >> 12;
				@Pc(89) int local89 = local61 >> 12;
				@Pc(95) int local95 = local85 * local85 >> 12;
				@Pc(101) int local101 = local89 * local89 >> 12;
				@Pc(115) int local115 = (int) (Math.sqrt((double) ((float) (local101 + local95 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(123) int local123 = local115 == 0 ? 0 : 16777216 / local115;
				local11[local48] = 4096 - local123;
			}
		}
		return local11;
	}
}
