import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class2_Sub1_Sub36 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ur", name = "N", descriptor = "I")
	private int anInt6582 = 4096;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub36() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(30) int[] local30 = this.method6069(0, Static67.anInt1510 & arg0 - 1);
			@Pc(36) int[] local36 = this.method6069(0, arg0);
			@Pc(46) int[] local46 = this.method6069(0, Static67.anInt1510 & arg0 + 1);
			for (@Pc(48) int local48 = 0; local48 < Static391.anInt7118; local48++) {
				@Pc(61) int local61 = (local46[local48] - local30[local48]) * this.anInt6582;
				@Pc(80) int local80 = this.anInt6582 * (local36[local48 + 1 & Static235.anInt4676] - local36[local48 - 1 & Static235.anInt4676]);
				@Pc(84) int local84 = local80 >> 12;
				@Pc(88) int local88 = local61 >> 12;
				@Pc(94) int local94 = local84 * local84 >> 12;
				@Pc(100) int local100 = local88 * local88 >> 12;
				@Pc(115) int local115 = (int) (Math.sqrt((double) ((float) (local94 + local100 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(126) int local126 = local115 == 0 ? 0 : 16777216 / local115;
				local11[local48] = 4096 - local126;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt6582 = arg1.method5753();
		}
	}
}
