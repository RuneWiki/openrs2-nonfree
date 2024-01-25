import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class4_Sub6_Sub23 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
	private int anInt4561 = 4096;

	@OriginalMember(owner = "client!ob", name = "Q", descriptor = "I")
	private int anInt4560 = 4096;

	@OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
	private int anInt4558 = 4096;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4560 = arg1.method3401();
		} else if (arg0 == 1) {
			this.anInt4558 = arg1.method3401();
		} else if (arg0 == 2) {
			this.anInt4561 = arg1.method3401();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5694(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass90_41.method2575(arg0);
		if (super.aClass90_41.aBoolean211) {
			@Pc(26) int[][] local26 = this.method5693(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static31.anInt797; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local62 == local58 && local66 == local62) {
					local42[local52] = this.anInt4560 * local58 >> 12;
					local46[local52] = this.anInt4558 * local62 >> 12;
					local50[local52] = this.anInt4561 * local66 >> 12;
				} else {
					local42[local52] = this.anInt4560;
					local46[local52] = this.anInt4558;
					local50[local52] = this.anInt4561;
				}
			}
		}
		return local11;
	}
}
