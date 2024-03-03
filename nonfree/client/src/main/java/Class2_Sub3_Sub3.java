import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class2_Sub3_Sub3 extends Class2_Sub3 {

	@OriginalMember(owner = "client!aj", name = "R", descriptor = "Lclient!h;")
	public static final Class89 aClass89_12 = new Class89(58, 0);

	@OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
	private int anInt246 = 4096;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V", line = 14)
	public Class2_Sub3_Sub3() {
		super(1, true);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(BI)[I", line = 17)
	@Override
	public int[] method6486(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass158_41.method3997(arg0);
		if (super.aClass158_41.aBoolean265) {
			@Pc(30) int[] local30 = this.method6474(0, Static139.anInt2715 & arg0 - 1);
			@Pc(36) int[] local36 = this.method6474(0, arg0);
			@Pc(46) int[] local46 = this.method6474(0, Static139.anInt2715 & arg0 + 1);
			for (@Pc(48) int local48 = 0; local48 < Static211.anInt4031; local48++) {
				@Pc(62) int local62 = (local46[local48] - local30[local48]) * this.anInt246;
				@Pc(82) int local82 = (local36[Static69.anInt1719 & local48 + 1] - local36[Static69.anInt1719 & local48 - 1]) * this.anInt246;
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local102 + local96 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(127) int local127 = local116 == 0 ? 0 : 16777216 / local116;
				local16[local48] = 4096 - local127;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!bt;I)V", line = 96)
	@Override
	public void method6485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt246 = arg1.method4830();
		}
	}
}
