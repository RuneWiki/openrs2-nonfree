import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class3_Sub8_Sub30 extends Class3_Sub8 {

	@OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
	private int anInt8497 = 4096;

	@OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
	private int anInt8501 = 4096;

	@OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
	private int anInt8499 = 4096;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8774(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass326_41.method7329(arg0);
		if (super.aClass326_41.aBoolean628) {
			@Pc(21) int[][] local21 = this.method8779(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static91.anInt1849; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local33[local47];
				@Pc(61) int local61 = local29[local47];
				if (local57 == local53 && local61 == local57) {
					local37[local47] = local53 * this.anInt8497 >> 12;
					local41[local47] = this.anInt8499 * local57 >> 12;
					local45[local47] = local61 * this.anInt8501 >> 12;
				} else {
					local37[local47] = this.anInt8497;
					local41[local47] = this.anInt8499;
					local45[local47] = this.anInt8501;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt8497 = arg1.method7951();
		} else if (arg0 == 1) {
			this.anInt8499 = arg1.method7951();
		} else if (arg0 == 2) {
			this.anInt8501 = arg1.method7951();
		}
	}
}
