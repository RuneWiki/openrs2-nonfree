import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class2_Sub2_Sub8 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cm", name = "Q", descriptor = "I")
	private int anInt987 = 4096;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(30) int[] local30 = this.method5876(0, arg0 - 1 & Static285.anInt5782);
			@Pc(36) int[] local36 = this.method5876(0, arg0);
			@Pc(46) int[] local46 = this.method5876(0, arg0 + 1 & Static285.anInt5782);
			for (@Pc(48) int local48 = 0; local48 < Static339.anInt6735; local48++) {
				@Pc(62) int local62 = this.anInt987 * (local46[local48] - local30[local48]);
				@Pc(82) int local82 = (local36[Static25.anInt1346 & local48 + 1] - local36[local48 - 1 & Static25.anInt1346]) * this.anInt987;
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((float) (local96 + local102 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(128) int local128 = local117 == 0 ? 0 : 16777216 / local117;
				local16[local48] = 4096 - local128;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt987 = arg1.method4464();
		}
	}
}
