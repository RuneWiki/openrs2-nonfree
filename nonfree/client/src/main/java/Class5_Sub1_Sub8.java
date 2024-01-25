import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class5_Sub1_Sub8 extends Class5_Sub1 {

	@OriginalMember(owner = "client!bt", name = "H", descriptor = "I")
	private int anInt761 = 4096;

	@OriginalMember(owner = "client!bt", name = "G", descriptor = "I")
	private int anInt760 = 4096;

	@OriginalMember(owner = "client!bt", name = "D", descriptor = "I")
	private int anInt758 = 4096;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt761 = arg1.method5598();
		} else if (arg0 == 1) {
			this.anInt758 = arg1.method5598();
		} else if (arg0 == 2) {
			this.anInt760 = arg1.method5598();
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5763(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass154_41.method3176(arg0);
		if (super.aClass154_41.aBoolean254) {
			@Pc(26) int[][] local26 = this.method5764(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static148.anInt2666; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local62 == local58 && local62 == local66) {
					local42[local52] = this.anInt761 * local58 >> 12;
					local46[local52] = local62 * this.anInt758 >> 12;
					local50[local52] = this.anInt760 * local66 >> 12;
				} else {
					local42[local52] = this.anInt761;
					local46[local52] = this.anInt758;
					local50[local52] = this.anInt760;
				}
			}
		}
		return local11;
	}
}
