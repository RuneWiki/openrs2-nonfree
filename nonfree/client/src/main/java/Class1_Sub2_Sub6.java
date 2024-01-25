import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
	private int anInt1258 = 4096;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(30) int[] local30 = this.method5964(Static464.anInt6761 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method5964(arg0, 0);
			@Pc(46) int[] local46 = this.method5964(arg0 + 1 & Static464.anInt6761, 0);
			for (@Pc(48) int local48 = 0; local48 < Static218.anInt3990; local48++) {
				@Pc(62) int local62 = this.anInt1258 * (local46[local48] - local30[local48]);
				@Pc(82) int local82 = this.anInt1258 * (local36[Static147.anInt2302 & local48 + 1] - local36[Static147.anInt2302 & local48 - 1]);
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local96 + local102 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(127) int local127 = local116 == 0 ? 0 : 16777216 / local116;
				local11[local48] = 4096 - local127;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1258 = arg0.method2896();
		}
	}
}
