import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class2_Sub6_Sub19 extends Class2_Sub6 {

	@OriginalMember(owner = "client!oaa", name = "I", descriptor = "I")
	private int anInt6177 = 4096;

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub19() {
		super(1, true);
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(30) int[] local30 = this.method8461(0, Static53.anInt1098 & arg0 - 1);
			@Pc(36) int[] local36 = this.method8461(0, arg0);
			@Pc(46) int[] local46 = this.method8461(0, arg0 + 1 & Static53.anInt1098);
			for (@Pc(48) int local48 = 0; local48 < Static51.anInt1085; local48++) {
				@Pc(62) int local62 = this.anInt6177 * (local46[local48] - local30[local48]);
				@Pc(82) int local82 = this.anInt6177 * (local36[Static332.anInt5256 & local48 + 1] - local36[local48 - 1 & Static332.anInt5256]);
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

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt6177 = arg1.method8546();
		}
	}
}
