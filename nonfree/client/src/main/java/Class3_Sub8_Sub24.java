import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class3_Sub8_Sub24 extends Class3_Sub8 {

	@OriginalMember(owner = "client!qc", name = "H", descriptor = "I")
	private int anInt7628 = 4096;

	@OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
	private int anInt7633 = 4096;

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
	private int anInt7631 = 409;

	@OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
	private int anInt7635 = 4096;

	@OriginalMember(owner = "client!qc", name = "R", descriptor = "[I")
	private final int[] anIntArray415 = new int[3];

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub24() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)[[I")
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
				@Pc(60) int local60 = local53 - this.anIntArray415[0];
				if (local60 < 0) {
					local60 = -local60;
				}
				if (local60 > this.anInt7631) {
					local37[local47] = local53;
					local41[local47] = local29[local47];
					local45[local47] = local33[local47];
				} else {
					@Pc(95) int local95 = local29[local47];
					local60 = local95 - this.anIntArray415[1];
					if (local60 < 0) {
						local60 = -local60;
					}
					if (this.anInt7631 < local60) {
						local37[local47] = local53;
						local41[local47] = local95;
						local45[local47] = local33[local47];
					} else {
						@Pc(139) int local139 = local33[local47];
						local60 = local139 - this.anIntArray415[2];
						if (local60 < 0) {
							local60 = -local60;
						}
						if (this.anInt7631 < local60) {
							local37[local47] = local53;
							local41[local47] = local95;
							local45[local47] = local139;
						} else {
							local37[local47] = local53 * this.anInt7628 >> 12;
							local41[local47] = local95 * this.anInt7633 >> 12;
							local45[local47] = this.anInt7635 * local139 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt7631 = arg1.method7951();
		} else if (arg0 == 1) {
			this.anInt7635 = arg1.method7951();
		} else if (arg0 == 2) {
			this.anInt7633 = arg1.method7951();
		} else if (arg0 == 3) {
			this.anInt7628 = arg1.method7951();
		} else if (arg0 == 4) {
			@Pc(62) int local62 = arg1.method7945();
			this.anIntArray415[1] = local62 >> 4 & 0xFF0;
			this.anIntArray415[2] = local62 >> 12 & 0x0;
			this.anIntArray415[0] = (local62 & 0xFF0000) << 4;
		}
	}
}
