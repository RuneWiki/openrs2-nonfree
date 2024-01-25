import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class4_Sub6_Sub39 extends Class4_Sub6 {

	@OriginalMember(owner = "client!wr", name = "L", descriptor = "I")
	private int anInt6817 = 4096;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub39() {
		super(1, true);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(30) int[] local30 = this.method5702(arg0 - 1 & Static341.anInt266, 0);
			@Pc(36) int[] local36 = this.method5702(arg0, 0);
			@Pc(46) int[] local46 = this.method5702(Static341.anInt266 & arg0 + 1, 0);
			for (@Pc(48) int local48 = 0; local48 < Static31.anInt797; local48++) {
				@Pc(61) int local61 = this.anInt6817 * (local46[local48] - local30[local48]);
				@Pc(81) int local81 = this.anInt6817 * (local36[local48 + 1 & Static335.anInt6403] - local36[local48 - 1 & Static335.anInt6403]);
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

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt6817 = arg1.method3401();
		}
	}
}
