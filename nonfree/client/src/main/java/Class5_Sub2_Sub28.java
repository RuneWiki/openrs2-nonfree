import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class5_Sub2_Sub28 extends Class5_Sub2 {

	@OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
	private int anInt8375 = 4096;

	@OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
	private int anInt8379 = 4096;

	@OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
	private int anInt8378 = 4096;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(IZ)[[I")
	@Override
	public int[][] method8827(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass370_41.method8551(arg0);
		if (super.aClass370_41.aBoolean819) {
			@Pc(21) int[][] local21 = this.method8823(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static314.anInt6320; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local33[local47];
				@Pc(61) int local61 = local29[local47];
				if (local57 == local53 && local57 == local61) {
					local37[local47] = local53 * this.anInt8378 >> 12;
					local41[local47] = this.anInt8375 * local57 >> 12;
					local45[local47] = local61 * this.anInt8379 >> 12;
				} else {
					local37[local47] = this.anInt8378;
					local41[local47] = this.anInt8375;
					local45[local47] = this.anInt8379;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8378 = arg0.method8631();
		} else if (arg1 == 1) {
			this.anInt8375 = arg0.method8631();
		} else if (arg1 == 2) {
			this.anInt8379 = arg0.method8631();
		}
	}
}
