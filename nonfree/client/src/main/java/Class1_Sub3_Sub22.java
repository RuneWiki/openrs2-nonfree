import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class1_Sub3_Sub22 extends Class1_Sub3 {

	@OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
	private int anInt5538 = 4096;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub22() {
		super(1, true);
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(31) int[] local31 = this.method8201(0, arg0 - 1 & Static109.anInt2298);
			@Pc(37) int[] local37 = this.method8201(0, arg0);
			@Pc(47) int[] local47 = this.method8201(0, Static109.anInt2298 & arg0 + 1);
			for (@Pc(49) int local49 = 0; local49 < Static254.anInt4973; local49++) {
				@Pc(62) int local62 = this.anInt5538 * (local47[local49] - local31[local49]);
				@Pc(82) int local82 = (local37[Static184.anInt3830 & local49 + 1] - local37[local49 - 1 & Static184.anInt3830]) * this.anInt5538;
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local96 + local102 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(124) int local124 = local116 == 0 ? 0 : 16777216 / local116;
				local17[local49] = 4096 - local124;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt5538 = arg1.method4494();
		}
	}
}
