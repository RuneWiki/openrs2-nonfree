import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class2_Sub7_Sub23 extends Class2_Sub7 {

	@OriginalMember(owner = "client!mda", name = "L", descriptor = "I")
	private int anInt5415 = 0;

	@OriginalMember(owner = "client!mda", name = "M", descriptor = "I")
	private int anInt5416 = 4096;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7585(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass180_41.method4533(arg0);
		if (super.aClass180_41.aBoolean392) {
			@Pc(26) int[][] local26 = this.method7589(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static352.anInt6485; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt5415) {
					local42[local52] = this.anInt5415;
				} else if (local58 <= this.anInt5416) {
					local42[local52] = local58;
				} else {
					local42[local52] = this.anInt5416;
				}
				if (local62 < this.anInt5415) {
					local46[local52] = this.anInt5415;
				} else if (local62 <= this.anInt5416) {
					local46[local52] = local62;
				} else {
					local46[local52] = this.anInt5416;
				}
				if (this.anInt5415 > local66) {
					local50[local52] = this.anInt5415;
				} else if (this.anInt5416 < local66) {
					local50[local52] = this.anInt5416;
				} else {
					local50[local52] = local66;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(27) int[] local27 = this.method7581(arg0, 0);
			for (@Pc(29) int local29 = 0; local29 < Static352.anInt6485; local29++) {
				@Pc(35) int local35 = local27[local29];
				if (local35 < this.anInt5415) {
					local17[local29] = this.anInt5415;
				} else if (this.anInt5416 < local35) {
					local17[local29] = this.anInt5416;
				} else {
					local17[local29] = local35;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt5415 = arg1.method5229();
		} else if (arg0 == 1) {
			this.anInt5416 = arg1.method5229();
		} else if (arg0 == 2) {
			super.aBoolean649 = arg1.method5170() == 1;
		}
	}
}
