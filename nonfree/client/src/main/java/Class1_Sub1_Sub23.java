import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class1_Sub1_Sub23 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pa", name = "bb", descriptor = "I")
	private int anInt2887 = 0;

	@OriginalMember(owner = "client!pa", name = "db", descriptor = "I")
	private int anInt2889 = 4096;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(17) int[] local17 = this.method3393(arg0, 0);
			for (@Pc(19) int local19 = 0; local19 < Static107.anInt2321; local19++) {
				@Pc(25) int local25 = local17[local19];
				if (local25 < this.anInt2887) {
					local7[local19] = this.anInt2887;
				} else if (local25 > this.anInt2889) {
					local7[local19] = this.anInt2889;
				} else {
					local7[local19] = local25;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2887 = arg0.method3023();
		} else if (arg1 == 1) {
			this.anInt2889 = arg0.method3023();
		} else if (arg1 == 2) {
			super.aBoolean241 = arg0.method3010() == 1;
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166) {
			@Pc(26) int[][] local26 = this.method3397(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local26[1];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static107.anInt2321; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local38[local52];
				@Pc(66) int local66 = local34[local52];
				if (local58 < this.anInt2887) {
					local42[local52] = this.anInt2887;
				} else if (this.anInt2889 >= local58) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt2889;
				}
				if (this.anInt2887 > local62) {
					local46[local52] = this.anInt2887;
				} else if (local62 <= this.anInt2889) {
					local46[local52] = local62;
				} else {
					local46[local52] = this.anInt2889;
				}
				if (this.anInt2887 > local66) {
					local50[local52] = this.anInt2887;
				} else if (local66 > this.anInt2889) {
					local50[local52] = this.anInt2889;
				} else {
					local50[local52] = local66;
				}
			}
		}
		return local16;
	}
}
