import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class2_Sub7_Sub7 extends Class2_Sub7 {

	@OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
	private int anInt2473 = 4096;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub7() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(30) int[] local30 = this.method7581(arg0 - 1 & Static126.anInt7690, 0);
			@Pc(36) int[] local36 = this.method7581(arg0, 0);
			@Pc(46) int[] local46 = this.method7581(arg0 + 1 & Static126.anInt7690, 0);
			for (@Pc(48) int local48 = 0; local48 < Static352.anInt6485; local48++) {
				@Pc(62) int local62 = this.anInt2473 * (local46[local48] - local30[local48]);
				@Pc(82) int local82 = this.anInt2473 * (local36[local48 + 1 & Static38.anInt733] - local36[Static38.anInt733 & local48 - 1]);
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

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt2473 = arg1.method5229();
		}
	}
}
