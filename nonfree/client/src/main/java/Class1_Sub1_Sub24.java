import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class1_Sub1_Sub24 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ka", name = "ab", descriptor = "I")
	private int anInt2476;

	@OriginalMember(owner = "client!ka", name = "bb", descriptor = "I")
	private int anInt2477;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(26) int[] local26 = this.method3012(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static65.anInt1933; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (this.anInt2477 > local34) {
					local16[local28] = this.anInt2477;
				} else if (local34 > this.anInt2476) {
					local16[local28] = this.anInt2476;
				} else {
					local16[local28] = local34;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2477 = arg1.method1642();
		} else if (arg0 == 1) {
			this.anInt2476 = arg1.method1642();
		} else if (arg0 == 2) {
			super.aBoolean319 = arg1.method1607() == 1;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass40_41.method1589(arg0);
		if (super.aClass40_41.aBoolean168) {
			@Pc(26) int[][] local26 = this.method3013(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static65.anInt1933; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt2477) {
					local42[local52] = this.anInt2477;
				} else if (this.anInt2476 >= local58) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt2476;
				}
				if (local62 < this.anInt2477) {
					local46[local52] = this.anInt2477;
				} else if (local62 <= this.anInt2476) {
					local46[local52] = local62;
				} else {
					local46[local52] = this.anInt2476;
				}
				if (this.anInt2477 > local66) {
					local50[local52] = this.anInt2477;
				} else if (this.anInt2476 >= local66) {
					local50[local52] = local66;
				} else {
					local50[local52] = this.anInt2476;
				}
			}
		}
		return local16;
	}
}
