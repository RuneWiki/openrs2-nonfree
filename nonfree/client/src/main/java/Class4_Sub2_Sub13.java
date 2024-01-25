import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class4_Sub2_Sub13 extends Class4_Sub2 {

	@OriginalMember(owner = "client!hq", name = "L", descriptor = "I")
	private int anInt2974 = 4096;

	@OriginalMember(owner = "client!hq", name = "J", descriptor = "I")
	private int anInt2972 = 0;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(26) int[] local26 = this.method5847(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static350.anInt6330; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (this.anInt2972 > local34) {
					local11[local28] = this.anInt2972;
				} else if (this.anInt2974 < local34) {
					local11[local28] = this.anInt2974;
				} else {
					local11[local28] = local34;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt2972 = arg1.method4877();
		} else if (arg0 == 1) {
			this.anInt2974 = arg1.method4877();
		} else if (arg0 == 2) {
			super.aBoolean501 = arg1.method4864() == 1;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5842(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass207_41.method4800(arg0);
		if (super.aClass207_41.aBoolean426) {
			@Pc(26) int[][] local26 = this.method5848(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static350.anInt6330; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (this.anInt2972 > local58) {
					local42[local52] = this.anInt2972;
				} else if (local58 > this.anInt2974) {
					local42[local52] = this.anInt2974;
				} else {
					local42[local52] = local58;
				}
				if (local62 < this.anInt2972) {
					local46[local52] = this.anInt2972;
				} else if (local62 > this.anInt2974) {
					local46[local52] = this.anInt2974;
				} else {
					local46[local52] = local62;
				}
				if (this.anInt2972 > local66) {
					local50[local52] = this.anInt2972;
				} else if (this.anInt2974 >= local66) {
					local50[local52] = local66;
				} else {
					local50[local52] = this.anInt2974;
				}
			}
		}
		return local16;
	}
}
