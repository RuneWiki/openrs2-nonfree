import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class4_Sub3_Sub24 extends Class4_Sub3 {

	@OriginalMember(owner = "client!lw", name = "R", descriptor = "I")
	private int anInt4673 = 4096;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(30) int[] local30 = this.method6337(0, arg0 - 1 & Static429.anInt7355);
			@Pc(36) int[] local36 = this.method6337(0, arg0);
			@Pc(46) int[] local46 = this.method6337(0, Static429.anInt7355 & arg0 + 1);
			for (@Pc(48) int local48 = 0; local48 < Static304.anInt5637; local48++) {
				@Pc(62) int local62 = this.anInt4673 * (local46[local48] - local30[local48]);
				@Pc(82) int local82 = this.anInt4673 * (local36[Static279.anInt5254 & local48 + 1] - local36[local48 - 1 & Static279.anInt5254]);
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local96 + local102 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(127) int local127 = local116 == 0 ? 0 : 16777216 / local116;
				local16[local48] = 4096 - local127;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt4673 = arg1.method4560();
		}
	}
}
