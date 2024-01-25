import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class6_Sub2_Sub30 extends Class6_Sub2 {

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "I")
	private int anInt5253 = 4096;

	@OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
	private int anInt5254 = 409;

	@OriginalMember(owner = "client!qc", name = "E", descriptor = "[I")
	private final int[] anIntArray470 = new int[3];

	@OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
	private int anInt5257 = 4096;

	@OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
	private int anInt5259 = 4096;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5254 = arg0.method3108();
		} else if (arg1 == 1) {
			this.anInt5253 = arg0.method3108();
		} else if (arg1 == 2) {
			this.anInt5259 = arg0.method3108();
		} else if (arg1 == 3) {
			this.anInt5257 = arg0.method3108();
		} else if (arg1 == 4) {
			@Pc(58) int local58 = arg0.method3078();
			this.anIntArray470[1] = local58 >> 4 & 0xFF0;
			this.anIntArray470[2] = local58 >> 12 & 0x0;
			this.anIntArray470[0] = (local58 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5868(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method2911(arg0);
		if (super.aClass130_41.aBoolean230) {
			@Pc(29) int[][] local29 = this.method5867(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static185.anInt4925; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(68) int local68 = local61 - this.anIntArray470[0];
				if (local68 < 0) {
					local68 = -local68;
				}
				if (this.anInt5254 < local68) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(99) int local99 = local37[local55];
					local68 = local99 - this.anIntArray470[1];
					if (local68 < 0) {
						local68 = -local68;
					}
					if (this.anInt5254 < local68) {
						local45[local55] = local61;
						local49[local55] = local99;
						local53[local55] = local41[local55];
					} else {
						@Pc(135) int local135 = local41[local55];
						local68 = local135 - this.anIntArray470[2];
						if (local68 < 0) {
							local68 = -local68;
						}
						if (this.anInt5254 < local68) {
							local45[local55] = local61;
							local49[local55] = local99;
							local53[local55] = local135;
						} else {
							local45[local55] = local61 * this.anInt5257 >> 12;
							local49[local55] = local99 * this.anInt5259 >> 12;
							local53[local55] = local135 * this.anInt5253 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
