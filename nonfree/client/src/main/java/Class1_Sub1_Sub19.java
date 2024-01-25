import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class1_Sub1_Sub19 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
	private int anInt3657 = 4096;

	@OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
	private int anInt3660 = 4096;

	@OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
	private int anInt3662 = 4096;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5626(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass117_41.method2345(arg0);
		if (super.aClass117_41.aBoolean221) {
			@Pc(21) int[][] local21 = this.method5624(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static434.anInt4326; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local33[local47];
				@Pc(61) int local61 = local29[local47];
				if (local57 == local53 && local57 == local61) {
					local37[local47] = local53 * this.anInt3657 >> 12;
					local41[local47] = this.anInt3660 * local57 >> 12;
					local45[local47] = this.anInt3662 * local61 >> 12;
				} else {
					local37[local47] = this.anInt3657;
					local41[local47] = this.anInt3660;
					local45[local47] = this.anInt3662;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3657 = arg1.method4485();
		} else if (arg0 == 1) {
			this.anInt3660 = arg1.method4485();
		} else if (arg0 == 2) {
			this.anInt3662 = arg1.method4485();
		}
	}
}
