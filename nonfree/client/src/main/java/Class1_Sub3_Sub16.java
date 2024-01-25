import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class1_Sub3_Sub16 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
	private int anInt3270 = 4096;

	@OriginalMember(owner = "client!fm", name = "G", descriptor = "[I")
	private final int[] anIntArray262 = new int[3];

	@OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
	private int anInt3276 = 4096;

	@OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
	private int anInt3279 = 409;

	@OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
	private int anInt3275 = 4096;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3279 = arg0.method3056();
		} else if (arg1 == 1) {
			this.anInt3275 = arg0.method3056();
		} else if (arg1 == 2) {
			this.anInt3276 = arg0.method3056();
		} else if (arg1 == 3) {
			this.anInt3270 = arg0.method3056();
		} else if (arg1 == 4) {
			@Pc(64) int local64 = arg0.method3039();
			this.anIntArray262[2] = local64 >> 12 & 0x0;
			this.anIntArray262[1] = local64 >> 4 & 0xFF0;
			this.anIntArray262[0] = (local64 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7913(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass233_41.method5782(arg0);
		if (super.aClass233_41.aBoolean439) {
			@Pc(21) int[][] local21 = this.method7910(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static236.anInt4609; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(60) int local60 = local53 - this.anIntArray262[0];
				if (local60 < 0) {
					local60 = -local60;
				}
				if (this.anInt3279 < local60) {
					local37[local47] = local53;
					local41[local47] = local29[local47];
					local45[local47] = local33[local47];
				} else {
					@Pc(91) int local91 = local29[local47];
					local60 = local91 - this.anIntArray262[1];
					if (local60 < 0) {
						local60 = -local60;
					}
					if (this.anInt3279 < local60) {
						local37[local47] = local53;
						local41[local47] = local91;
						local45[local47] = local33[local47];
					} else {
						@Pc(130) int local130 = local33[local47];
						local60 = local130 - this.anIntArray262[2];
						if (local60 < 0) {
							local60 = -local60;
						}
						if (local60 > this.anInt3279) {
							local37[local47] = local53;
							local41[local47] = local91;
							local45[local47] = local130;
						} else {
							local37[local47] = local53 * this.anInt3270 >> 12;
							local41[local47] = local91 * this.anInt3276 >> 12;
							local45[local47] = this.anInt3275 * local130 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
