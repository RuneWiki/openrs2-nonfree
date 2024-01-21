import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class1_Sub4_Sub17 extends Class1_Sub4 {

	@OriginalMember(owner = "client!mb", name = "bb", descriptor = "[I")
	private int[] anIntArray264;

	@OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
	private int anInt2916;

	@OriginalMember(owner = "client!mb", name = "lb", descriptor = "I")
	private int anInt2922;

	@OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
	private int anInt2912;

	@OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
	private int anInt2917;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2917 = arg0.method546();
		} else if (arg1 == 1) {
			this.anInt2912 = arg0.method546();
		} else if (arg1 == 2) {
			this.anInt2922 = arg0.method546();
		} else if (arg1 == 3) {
			this.anInt2916 = arg0.method546();
		} else if (arg1 == 4) {
			@Pc(63) int local63 = arg0.method501();
			this.anIntArray264[2] = local63 >> 12 & 0x0;
			this.anIntArray264[1] = local63 >> 4 & 0xFF0;
			this.anIntArray264[0] = (local63 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3214(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass35_38.method1569(arg0);
		if (super.aClass35_38.aBoolean89) {
			@Pc(21) int[][] local21 = this.method3217(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static73.anInt1888; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(61) int local61 = local53 - this.anIntArray264[0];
				if (local61 < 0) {
					local61 = -local61;
				}
				if (this.anInt2917 < local61) {
					local37[local47] = local53;
					local41[local47] = local29[local47];
					local45[local47] = local33[local47];
				} else {
					@Pc(92) int local92 = local29[local47];
					local61 = local92 - this.anIntArray264[1];
					if (local61 < 0) {
						local61 = -local61;
					}
					if (local61 > this.anInt2917) {
						local37[local47] = local53;
						local41[local47] = local92;
						local45[local47] = local33[local47];
					} else {
						@Pc(128) int local128 = local33[local47];
						local61 = local128 - this.anIntArray264[2];
						if (local61 < 0) {
							local61 = -local61;
						}
						if (this.anInt2917 < local61) {
							local37[local47] = local53;
							local41[local47] = local92;
							local45[local47] = local128;
						} else {
							local37[local47] = this.anInt2916 * local53 >> 12;
							local41[local47] = local92 * this.anInt2922 >> 12;
							local45[local47] = local128 * this.anInt2912 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
