import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class8_Sub2_Sub36 extends Class8_Sub2 {

	@OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
	private int anInt10183 = 4096;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub36() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(30) int[] local30 = this.method8505(Static17.anInt866 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method8505(arg0, 0);
			@Pc(46) int[] local46 = this.method8505(arg0 + 1 & Static17.anInt866, 0);
			for (@Pc(48) int local48 = 0; local48 < Static538.anInt9297; local48++) {
				@Pc(61) int local61 = this.anInt10183 * (local46[local48] - local30[local48]);
				@Pc(81) int local81 = this.anInt10183 * (local36[Static263.anInt5634 & local48 + 1] - local36[Static263.anInt5634 & local48 - 1]);
				@Pc(85) int local85 = local81 >> 12;
				@Pc(89) int local89 = local61 >> 12;
				@Pc(95) int local95 = local85 * local85 >> 12;
				@Pc(101) int local101 = local89 * local89 >> 12;
				@Pc(115) int local115 = (int) (Math.sqrt((double) ((float) (local101 + local95 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(126) int local126 = local115 == 0 ? 0 : 16777216 / local115;
				local16[local48] = 4096 - local126;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt10183 = arg1.method8578();
		}
	}
}
