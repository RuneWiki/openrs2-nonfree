import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class2_Sub11_Sub15 extends Class2_Sub11 {

	@OriginalMember(owner = "client!mp", name = "M", descriptor = "I")
	private int anInt6679 = 4096;

	@OriginalMember(owner = "client!mp", name = "O", descriptor = "I")
	private int anInt6684 = 409;

	@OriginalMember(owner = "client!mp", name = "R", descriptor = "I")
	private int anInt6685 = 4096;

	@OriginalMember(owner = "client!mp", name = "F", descriptor = "[I")
	private final int[] anIntArray467 = new int[3];

	@OriginalMember(owner = "client!mp", name = "H", descriptor = "I")
	private int anInt6683 = 4096;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt6684 = arg1.method8575();
		} else if (arg0 == 1) {
			this.anInt6685 = arg1.method8575();
		} else if (arg0 == 2) {
			this.anInt6683 = arg1.method8575();
		} else if (arg0 == 3) {
			this.anInt6679 = arg1.method8575();
		} else if (arg0 == 4) {
			@Pc(80) int local80 = arg1.method8583();
			this.anIntArray467[1] = local80 >> 4 & 0xFF0;
			this.anIntArray467[2] = local80 >> 12 & 0x0;
			this.anIntArray467[0] = (local80 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9533(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass370_41.method8744(arg0);
		if (super.aClass370_41.aBoolean846) {
			@Pc(29) int[][] local29 = this.method9538(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static301.anInt10214; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray467[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (local69 > this.anInt6684) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(106) int local106 = local37[local55];
					local69 = local106 - this.anIntArray467[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (local69 > this.anInt6684) {
						local45[local55] = local61;
						local49[local55] = local106;
						local53[local55] = local41[local55];
					} else {
						@Pc(144) int local144 = local41[local55];
						local69 = local144 - this.anIntArray467[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (this.anInt6684 < local69) {
							local45[local55] = local61;
							local49[local55] = local106;
							local53[local55] = local144;
						} else {
							local45[local55] = this.anInt6679 * local61 >> 12;
							local49[local55] = local106 * this.anInt6683 >> 12;
							local53[local55] = this.anInt6685 * local144 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
