import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class6_Sub1_Sub33 extends Class6_Sub1 {

	@OriginalMember(owner = "client!sm", name = "S", descriptor = "I")
	private int anInt5501 = 4096;

	@OriginalMember(owner = "client!sm", name = "R", descriptor = "I")
	private int anInt5500 = 0;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(21) int[] local21 = this.method5609(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static299.anInt5659; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (local29 < this.anInt5500) {
					local11[local23] = this.anInt5500;
				} else if (local29 <= this.anInt5501) {
					local11[local23] = local29;
				} else {
					local11[local23] = this.anInt5501;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5608(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5816(arg0);
		if (super.aClass220_41.aBoolean429) {
			@Pc(26) int[][] local26 = this.method5618(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			for (@Pc(52) int local52 = 0; local52 < Static299.anInt5659; local52++) {
				@Pc(58) int local58 = local30[local52];
				@Pc(62) int local62 = local34[local52];
				@Pc(66) int local66 = local38[local52];
				if (local58 < this.anInt5500) {
					local42[local52] = this.anInt5500;
				} else if (local58 > this.anInt5501) {
					local42[local52] = this.anInt5501;
				} else {
					local42[local52] = local58;
				}
				if (this.anInt5500 > local62) {
					local46[local52] = this.anInt5500;
				} else if (this.anInt5501 >= local62) {
					local46[local52] = local62;
				} else {
					local46[local52] = this.anInt5501;
				}
				if (this.anInt5500 > local66) {
					local50[local52] = this.anInt5500;
				} else if (local66 > this.anInt5501) {
					local50[local52] = this.anInt5501;
				} else {
					local50[local52] = local66;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5500 = arg0.method4021();
		} else if (arg1 == 1) {
			this.anInt5501 = arg0.method4021();
		} else if (arg1 == 2) {
			super.aBoolean411 = arg0.method3972() == 1;
		}
	}
}
