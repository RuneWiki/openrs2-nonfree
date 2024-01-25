import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class10_Sub2_Sub26 extends Class10_Sub2 {

	@OriginalMember(owner = "client!ou", name = "R", descriptor = "I")
	private int anInt5236 = 4096;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub26() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(30) int[] local30 = this.method6041(arg0 - 1 & Static140.anInt2877, 0);
			@Pc(36) int[] local36 = this.method6041(arg0, 0);
			@Pc(46) int[] local46 = this.method6041(Static140.anInt2877 & arg0 + 1, 0);
			for (@Pc(48) int local48 = 0; local48 < Static121.anInt2458; local48++) {
				@Pc(62) int local62 = (local46[local48] - local30[local48]) * this.anInt5236;
				@Pc(82) int local82 = this.anInt5236 * (local36[Static429.anInt7203 & local48 + 1] - local36[Static429.anInt7203 & local48 - 1]);
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local102 + local96 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(124) int local124 = local116 == 0 ? 0 : 16777216 / local116;
				local11[local48] = 4096 - local124;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt5236 = arg1.method2485();
		}
	}
}
