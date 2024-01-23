import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class2_Sub1_Sub31 extends Class2_Sub1 {

	@OriginalMember(owner = "client!o", name = "I", descriptor = "I")
	private int anInt4168 = 4096;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub31() {
		super(1, true);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4168 = arg0.method2130();
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(25) int[] local25 = this.method4601(arg0 - 1 & Static107.anInt2459, 0);
			@Pc(33) int[] local33 = this.method4601(arg0, 0);
			@Pc(43) int[] local43 = this.method4601(Static107.anInt2459 & arg0 + 1, 0);
			for (@Pc(45) int local45 = 0; local45 < Static281.anInt5558; local45++) {
				@Pc(68) int local68 = (local33[Static226.anInt6054 & local45 + 1] - local33[Static226.anInt6054 & local45 - 1]) * this.anInt4168;
				@Pc(72) int local72 = local68 >> 12;
				@Pc(84) int local84 = this.anInt4168 * (local43[local45] - local25[local45]);
				@Pc(88) int local88 = local84 >> 12;
				@Pc(94) int local94 = local72 * local72 >> 12;
				@Pc(100) int local100 = local88 * local88 >> 12;
				@Pc(115) int local115 = (int) (Math.sqrt((double) ((float) (local94 + local100 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(126) int local126 = local115 == 0 ? 0 : 16777216 / local115;
				local11[local45] = 4096 - local126;
			}
		}
		return local11;
	}
}
