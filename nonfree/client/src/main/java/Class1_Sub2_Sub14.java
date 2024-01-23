import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ig", name = "db", descriptor = "I")
	private int anInt1992 = 4096;

	@OriginalMember(owner = "client!ig", name = "cb", descriptor = "I")
	private int anInt1991 = 0;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1991 = arg0.method946();
		} else if (arg1 == 1) {
			this.anInt1992 = arg0.method946();
		} else if (arg1 == 2) {
			super.aBoolean265 = arg0.method895() == 1;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(21) int[] local21 = this.method3514(arg0, 0);
			for (@Pc(23) int local23 = 0; local23 < Static105.anInt2391; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (local29 < this.anInt1991) {
					local11[local23] = this.anInt1991;
				} else if (this.anInt1992 < local29) {
					local11[local23] = this.anInt1992;
				} else {
					local11[local23] = local29;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175) {
			@Pc(26) int[][] local26 = this.method3501(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[2];
			@Pc(38) int[] local38 = local26[1];
			@Pc(42) int[] local42 = local16[1];
			@Pc(46) int[] local46 = local16[0];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static105.anInt2391; local52++) {
				@Pc(58) int local58 = local38[local52];
				@Pc(62) int local62 = local30[local52];
				@Pc(66) int local66 = local34[local52];
				if (this.anInt1991 > local62) {
					local46[local52] = this.anInt1991;
				} else if (this.anInt1992 < local62) {
					local46[local52] = this.anInt1992;
				} else {
					local46[local52] = local62;
				}
				if (this.anInt1991 > local58) {
					local42[local52] = this.anInt1991;
				} else if (local58 > this.anInt1992) {
					local42[local52] = this.anInt1992;
				} else {
					local42[local52] = local58;
				}
				if (this.anInt1991 > local66) {
					local50[local52] = this.anInt1991;
				} else if (this.anInt1992 >= local66) {
					local50[local52] = local66;
				} else {
					local50[local52] = this.anInt1992;
				}
			}
		}
		return local16;
	}
}
