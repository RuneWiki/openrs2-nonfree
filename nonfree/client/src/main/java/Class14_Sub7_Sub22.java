import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class14_Sub7_Sub22 extends Class14_Sub7 {

	@OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
	private int anInt5488 = 4096;

	@OriginalMember(owner = "client!kf", name = "O", descriptor = "[I")
	private final int[] anIntArray307 = new int[3];

	@OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
	private int anInt5491 = 409;

	@OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
	private int anInt5494 = 4096;

	@OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
	private int anInt5493 = 4096;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt5491 = arg1.method7717(-1978450544);
		} else if (arg0 == 1) {
			this.anInt5494 = arg1.method7717(-1978450544);
		} else if (arg0 == 2) {
			this.anInt5488 = arg1.method7717(-1978450544);
		} else if (arg0 == 3) {
			this.anInt5493 = arg1.method7717(-1978450544);
		} else if (arg0 == 4) {
			@Pc(84) int local84 = arg1.method7719();
			this.anIntArray307[1] = local84 >> 4 & 0xFF0;
			this.anIntArray307[2] = local84 >> 12 & 0x0;
			this.anIntArray307[0] = (local84 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655) {
			@Pc(21) int[][] local21 = this.method9384(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static613.anInt10114; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(60) int local60 = local53 - this.anIntArray307[0];
				if (local60 < 0) {
					local60 = -local60;
				}
				if (this.anInt5491 < local60) {
					local37[local47] = local53;
					local41[local47] = local29[local47];
					local45[local47] = local33[local47];
				} else {
					@Pc(97) int local97 = local29[local47];
					local60 = local97 - this.anIntArray307[1];
					if (local60 < 0) {
						local60 = -local60;
					}
					if (this.anInt5491 < local60) {
						local37[local47] = local53;
						local41[local47] = local97;
						local45[local47] = local33[local47];
					} else {
						@Pc(136) int local136 = local33[local47];
						local60 = local136 - this.anIntArray307[2];
						if (local60 < 0) {
							local60 = -local60;
						}
						if (local60 > this.anInt5491) {
							local37[local47] = local53;
							local41[local47] = local97;
							local45[local47] = local136;
						} else {
							local37[local47] = this.anInt5493 * local53 >> 12;
							local41[local47] = local97 * this.anInt5488 >> 12;
							local45[local47] = this.anInt5494 * local136 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
