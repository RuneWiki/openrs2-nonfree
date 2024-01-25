import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nia")
public final class Class5_Sub1_Sub21 extends Class5_Sub1 {

	@OriginalMember(owner = "client!nia", name = "I", descriptor = "I")
	private int anInt6784 = 4096;

	@OriginalMember(owner = "client!nia", name = "G", descriptor = "I")
	private int anInt6783 = 4096;

	@OriginalMember(owner = "client!nia", name = "L", descriptor = "I")
	private int anInt6779 = 4096;

	@OriginalMember(owner = "client!nia", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9205(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass307_41.method7497(arg0);
		if (super.aClass307_41.aBoolean662) {
			@Pc(21) int[][] local21 = this.method9203(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static648.anInt9588; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local33[local47];
				@Pc(61) int local61 = local29[local47];
				if (local57 == local53 && local61 == local57) {
					local37[local47] = this.anInt6783 * local53 >> 12;
					local41[local47] = local57 * this.anInt6779 >> 12;
					local45[local47] = this.anInt6784 * local61 >> 12;
				} else {
					local37[local47] = this.anInt6783;
					local41[local47] = this.anInt6779;
					local45[local47] = this.anInt6784;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt6783 = arg1.method8519();
		} else if (arg0 == 1) {
			this.anInt6779 = arg1.method8519();
		} else if (arg0 == 2) {
			this.anInt6784 = arg1.method8519();
		}
	}
}
