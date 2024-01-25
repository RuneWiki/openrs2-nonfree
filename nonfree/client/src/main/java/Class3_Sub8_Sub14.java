import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class3_Sub8_Sub14 extends Class3_Sub8 {

	@OriginalMember(owner = "client!ki", name = "K", descriptor = "I")
	private int anInt5196 = 4096;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt5196 = arg1.method7951();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(30) int[] local30 = this.method8776(Static635.anInt10496 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method8776(arg0, 0);
			@Pc(46) int[] local46 = this.method8776(Static635.anInt10496 & arg0 + 1, 0);
			for (@Pc(48) int local48 = 0; local48 < Static91.anInt1849; local48++) {
				@Pc(62) int local62 = (local46[local48] - local30[local48]) * this.anInt5196;
				@Pc(82) int local82 = (local36[local48 + 1 & Static348.anInt5973] - local36[Static348.anInt5973 & local48 - 1]) * this.anInt5196;
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local62 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(116) int local116 = (int) (Math.sqrt((double) ((float) (local96 + local102 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(124) int local124 = local116 == 0 ? 0 : 16777216 / local116;
				local16[local48] = 4096 - local124;
			}
		}
		return local16;
	}
}
