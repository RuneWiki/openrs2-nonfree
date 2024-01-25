import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class6_Sub1_Sub4 extends Class6_Sub1 {

	@OriginalMember(owner = "client!bu", name = "F", descriptor = "I")
	private int anInt1808 = 4096;

	@OriginalMember(owner = "client!bu", name = "E", descriptor = "I")
	private int anInt1807 = 4096;

	@OriginalMember(owner = "client!bu", name = "I", descriptor = "I")
	private int anInt1810 = 4096;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8728(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass239_41.method6263(arg0);
		if (super.aClass239_41.aBoolean585) {
			@Pc(26) int[][] local26 = this.method8725(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static53.anInt1787; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local58 == local62 && local62 == local66) {
					local42[local52] = this.anInt1807 * local58 >> 12;
					local46[local52] = local62 * this.anInt1810 >> 12;
					local50[local52] = local66 * this.anInt1808 >> 12;
				} else {
					local42[local52] = this.anInt1807;
					local46[local52] = this.anInt1810;
					local50[local52] = this.anInt1808;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1807 = arg1.method8220();
		} else if (arg0 == 1) {
			this.anInt1810 = arg1.method8220();
		} else if (arg0 == 2) {
			this.anInt1808 = arg1.method8220();
		}
	}
}
