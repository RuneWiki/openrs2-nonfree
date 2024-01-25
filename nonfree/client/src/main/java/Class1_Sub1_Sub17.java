import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!jda", name = "F", descriptor = "I")
	private int anInt4593 = 4096;

	@OriginalMember(owner = "client!jda", name = "E", descriptor = "I")
	private int anInt4592 = 4096;

	@OriginalMember(owner = "client!jda", name = "K", descriptor = "I")
	private int anInt4596 = 4096;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt4593 = arg1.method4426();
		} else if (arg0 == 1) {
			this.anInt4596 = arg1.method4426();
		} else if (arg0 == 2) {
			this.anInt4592 = arg1.method4426();
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7883(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass153_41.method3557(arg0);
		if (super.aClass153_41.aBoolean340) {
			@Pc(26) int[][] local26 = this.method7880(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static87.anInt1964; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local58 == local62 && local62 == local66) {
					local42[local52] = this.anInt4593 * local58 >> 12;
					local46[local52] = this.anInt4596 * local62 >> 12;
					local50[local52] = local66 * this.anInt4592 >> 12;
				} else {
					local42[local52] = this.anInt4593;
					local46[local52] = this.anInt4596;
					local50[local52] = this.anInt4592;
				}
			}
		}
		return local16;
	}
}
