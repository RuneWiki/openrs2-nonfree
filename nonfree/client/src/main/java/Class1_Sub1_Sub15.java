import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
	private int anInt1948 = 4096;

	@OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
	private int anInt1947 = 0;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(26) int[] local26 = this.method3580(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static115.anInt2578; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (this.anInt1947 > local34) {
					local16[local28] = this.anInt1947;
				} else if (this.anInt1948 >= local34) {
					local16[local28] = local34;
				} else {
					local16[local28] = this.anInt1948;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1947 = arg0.method2765();
		} else if (arg1 == 1) {
			this.anInt1948 = arg0.method2765();
		} else if (arg1 == 2) {
			super.aBoolean231 = arg0.method2771() == 1;
		}
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80) {
			@Pc(26) int[][] local26 = this.method3579(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[2];
			@Pc(50) int[] local50 = local16[1];
			for (@Pc(52) int local52 = 0; local52 < Static115.anInt2578; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt1947) {
					local42[local52] = this.anInt1947;
				} else if (local58 <= this.anInt1948) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt1948;
				}
				if (local62 < this.anInt1947) {
					local50[local52] = this.anInt1947;
				} else if (local62 > this.anInt1948) {
					local50[local52] = this.anInt1948;
				} else {
					local50[local52] = local62;
				}
				if (local66 < this.anInt1947) {
					local46[local52] = this.anInt1947;
				} else if (local66 <= this.anInt1948) {
					local46[local52] = local66;
				} else {
					local46[local52] = this.anInt1948;
				}
			}
		}
		return local16;
	}
}
