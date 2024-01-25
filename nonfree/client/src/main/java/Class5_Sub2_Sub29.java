import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class5_Sub2_Sub29 extends Class5_Sub2 {

	@OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
	private int anInt8673 = 4096;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub29() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(30) int[] local30 = this.method9042(arg0 - 1 & Static273.anInt4903, 0);
			@Pc(36) int[] local36 = this.method9042(arg0, 0);
			@Pc(46) int[] local46 = this.method9042(arg0 + 1 & Static273.anInt4903, 0);
			for (@Pc(48) int local48 = 0; local48 < Static597.anInt10025; local48++) {
				@Pc(62) int local62 = (local46[local48] - local30[local48]) * this.anInt8673;
				@Pc(82) int local82 = this.anInt8673 * (local36[local48 + 1 & Static28.anInt365] - local36[Static28.anInt365 & local48 - 1]);
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local96 + local102 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(124) int local124 = local116 == 0 ? 0 : 16777216 / local116;
				local11[local48] = 4096 - local124;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8673 = arg0.method5968();
		}
	}
}
