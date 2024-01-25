import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class6_Sub3_Sub34 extends Class6_Sub3 {

	@OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
	private int anInt9132 = 4096;

	@OriginalMember(owner = "client!vf", name = "C", descriptor = "[I")
	private final int[] anIntArray689 = new int[3];

	@OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
	private int anInt9135 = 4096;

	@OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
	private int anInt9136 = 409;

	@OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
	private int anInt9134 = 4096;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7822(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass103_41.method2141(arg0);
		if (super.aClass103_41.aBoolean172) {
			@Pc(29) int[][] local29 = this.method7823(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static447.anInt8568; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray689[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (local69 > this.anInt9136) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(104) int local104 = local37[local55];
					local69 = local104 - this.anIntArray689[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (this.anInt9136 < local69) {
						local45[local55] = local61;
						local49[local55] = local104;
						local53[local55] = local41[local55];
					} else {
						@Pc(147) int local147 = local41[local55];
						local69 = local147 - this.anIntArray689[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (local69 > this.anInt9136) {
							local45[local55] = local61;
							local49[local55] = local104;
							local53[local55] = local147;
						} else {
							local45[local55] = local61 * this.anInt9134 >> 12;
							local49[local55] = local104 * this.anInt9135 >> 12;
							local53[local55] = this.anInt9132 * local147 >> 12;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt9136 = arg1.method6006();
		} else if (arg0 == 1) {
			this.anInt9132 = arg1.method6006();
		} else if (arg0 == 2) {
			this.anInt9135 = arg1.method6006();
		} else if (arg0 == 3) {
			this.anInt9134 = arg1.method6006();
		} else if (arg0 == 4) {
			@Pc(58) int local58 = arg1.method5988();
			this.anIntArray689[2] = local58 >> 12 & 0x0;
			this.anIntArray689[1] = local58 >> 4 & 0xFF0;
			this.anIntArray689[0] = (local58 & 0xFF0000) << 4;
		}
	}
}
