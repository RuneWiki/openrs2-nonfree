import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class2_Sub1_Sub28 extends Class2_Sub1 {

	@OriginalMember(owner = "client!tc", name = "W", descriptor = "I")
	private int anInt3706 = 4096;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub28() {
		super(1, true);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(30) int[] local30 = this.method3265(arg0 - 1 & Static207.anInt4078, 0);
			@Pc(36) int[] local36 = this.method3265(arg0, 0);
			@Pc(46) int[] local46 = this.method3265(arg0 + 1 & Static207.anInt4078, 0);
			for (@Pc(48) int local48 = 0; local48 < Static135.anInt2897; local48++) {
				@Pc(62) int local62 = this.anInt3706 * (local46[local48] - local30[local48]);
				@Pc(82) int local82 = (local36[Static201.anInt3995 & local48 + 1] - local36[Static201.anInt3995 & local48 - 1]) * this.anInt3706;
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local102 + local96 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(124) int local124 = local116 == 0 ? 0 : 16777216 / local116;
				local16[local48] = 4096 - local124;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3706 = arg0.method269();
		}
	}
}
