import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class1_Sub3_Sub36 extends Class1_Sub3 {

	@OriginalMember(owner = "client!vv", name = "P", descriptor = "I")
	private int anInt7503 = 0;

	@OriginalMember(owner = "client!vv", name = "Q", descriptor = "I")
	private int anInt7504 = 4096;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7503 = arg0.method4093();
		} else if (arg1 == 1) {
			this.anInt7504 = arg0.method4093();
		} else if (arg1 == 2) {
			super.aBoolean494 = arg0.method4130() == 1;
		}
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(26) int[] local26 = this.method6076(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static347.anInt5974; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (local34 < this.anInt7503) {
					local16[local28] = this.anInt7503;
				} else if (this.anInt7504 < local34) {
					local16[local28] = this.anInt7504;
				} else {
					local16[local28] = local34;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6083(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass20_41.method474(arg0);
		if (super.aClass20_41.aBoolean14) {
			@Pc(26) int[][] local26 = this.method6072(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static347.anInt5974; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (this.anInt7503 > local58) {
					local42[local52] = this.anInt7503;
				} else if (this.anInt7504 < local58) {
					local42[local52] = this.anInt7504;
				} else {
					local42[local52] = local58;
				}
				if (local62 < this.anInt7503) {
					local46[local52] = this.anInt7503;
				} else if (this.anInt7504 >= local62) {
					local46[local52] = local62;
				} else {
					local46[local52] = this.anInt7504;
				}
				if (local66 < this.anInt7503) {
					local50[local52] = this.anInt7503;
				} else if (local66 <= this.anInt7504) {
					local50[local52] = local66;
				} else {
					local50[local52] = this.anInt7504;
				}
			}
		}
		return local16;
	}
}
