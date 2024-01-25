import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gm", name = "I", descriptor = "I")
	private int anInt2359 = 4096;

	@OriginalMember(owner = "client!gm", name = "N", descriptor = "I")
	private int anInt2363 = 0;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6004(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method1356(arg0);
		if (super.aClass34_41.aBoolean100) {
			@Pc(26) int[][] local26 = this.method6006(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static85.anInt1910; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt2363) {
					local42[local52] = this.anInt2363;
				} else if (this.anInt2359 >= local58) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt2359;
				}
				if (local62 < this.anInt2363) {
					local46[local52] = this.anInt2363;
				} else if (local62 <= this.anInt2359) {
					local46[local52] = local62;
				} else {
					local46[local52] = this.anInt2359;
				}
				if (local66 < this.anInt2363) {
					local50[local52] = this.anInt2363;
				} else if (local66 > this.anInt2359) {
					local50[local52] = this.anInt2359;
				} else {
					local50[local52] = local66;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(26) int[] local26 = this.method6013(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static85.anInt1910; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (local34 < this.anInt2363) {
					local16[local28] = this.anInt2363;
				} else if (local34 > this.anInt2359) {
					local16[local28] = this.anInt2359;
				} else {
					local16[local28] = local34;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt2363 = arg1.method2161();
		} else if (arg0 == 1) {
			this.anInt2359 = arg1.method2161();
		} else if (arg0 == 2) {
			super.aBoolean509 = arg1.method2132() == 1;
		}
	}
}
