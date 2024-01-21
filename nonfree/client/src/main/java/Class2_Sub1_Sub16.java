import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class2_Sub1_Sub16 extends Class2_Sub1 {

	@OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
	private int anInt1507;

	@OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
	private int anInt1511;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(21) int[] local21 = this.method2796(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static120.anInt2812; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (local29 < this.anInt1511) {
					local7[local23] = this.anInt1511;
				} else if (this.anInt1507 < local29) {
					local7[local23] = this.anInt1507;
				} else {
					local7[local23] = local29;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2792(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass66_39.method1971(arg0);
		if (super.aClass66_39.aBoolean123) {
			@Pc(21) int[][] local21 = this.method2794(0, arg0);
			@Pc(25) int[] local25 = local21[1];
			@Pc(29) int[] local29 = local11[0];
			@Pc(33) int[] local33 = local21[0];
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int[] local41 = local11[2];
			@Pc(45) int[] local45 = local21[2];
			for (@Pc(47) int local47 = 0; local47 < Static120.anInt2812; local47++) {
				@Pc(53) int local53 = local33[local47];
				@Pc(57) int local57 = local25[local47];
				@Pc(61) int local61 = local45[local47];
				if (local53 < this.anInt1511) {
					local29[local47] = this.anInt1511;
				} else if (this.anInt1507 >= local53) {
					local29[local47] = local53;
				} else {
					local29[local47] = this.anInt1507;
				}
				if (this.anInt1511 > local57) {
					local37[local47] = this.anInt1511;
				} else if (this.anInt1507 < local57) {
					local37[local47] = this.anInt1507;
				} else {
					local37[local47] = local57;
				}
				if (local61 < this.anInt1511) {
					local41[local47] = this.anInt1511;
				} else if (this.anInt1507 >= local61) {
					local41[local47] = local61;
				} else {
					local41[local47] = this.anInt1507;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1511 = arg0.method1397();
		} else if (arg1 == 1) {
			this.anInt1507 = arg0.method1397();
		} else if (arg1 == 2) {
			super.aBoolean175 = arg0.method1402() == 1;
		}
	}
}
