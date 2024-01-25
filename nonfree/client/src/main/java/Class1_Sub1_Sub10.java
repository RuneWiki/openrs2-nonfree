import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!es", name = "R", descriptor = "I")
	private int anInt1808 = 4096;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub10() {
		super(1, true);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(30) int[] local30 = this.method5620(Static249.anInt4068 & arg0 - 1, 0);
			@Pc(36) int[] local36 = this.method5620(arg0, 0);
			@Pc(46) int[] local46 = this.method5620(arg0 + 1 & Static249.anInt4068, 0);
			for (@Pc(48) int local48 = 0; local48 < Static434.anInt4326; local48++) {
				@Pc(62) int local62 = (local46[local48] - local30[local48]) * this.anInt1808;
				@Pc(81) int local81 = this.anInt1808 * (local36[Static429.anInt7144 & local48 + 1] - local36[Static429.anInt7144 & local48 - 1]);
				@Pc(85) int local85 = local81 >> 12;
				@Pc(89) int local89 = local62 >> 12;
				@Pc(95) int local95 = local85 * local85 >> 12;
				@Pc(101) int local101 = local89 * local89 >> 12;
				@Pc(115) int local115 = (int) (Math.sqrt((double) ((float) (local101 + local95 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(123) int local123 = local115 == 0 ? 0 : 16777216 / local115;
				local16[local48] = 4096 - local123;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1808 = arg1.method4485();
		}
	}
}
