import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class3_Sub2_Sub8 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "I")
	private int anInt2587 = 409;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "[I")
	private final int[] anIntArray164 = new int[3];

	@OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
	private int anInt2589 = 4096;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
	private int anInt2586 = 4096;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
	private int anInt2588 = 4096;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8665(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass296_41.method7238(arg0);
		if (super.aClass296_41.aBoolean608) {
			@Pc(29) int[][] local29 = this.method8672(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static201.anInt3738; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray164[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (this.anInt2587 < local69) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(107) int local107 = local37[local55];
					local69 = local107 - this.anIntArray164[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (this.anInt2587 < local69) {
						local45[local55] = local61;
						local49[local55] = local107;
						local53[local55] = local41[local55];
					} else {
						@Pc(144) int local144 = local41[local55];
						local69 = local144 - this.anIntArray164[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (this.anInt2587 < local69) {
							local45[local55] = local61;
							local49[local55] = local107;
							local53[local55] = local144;
						} else {
							local45[local55] = this.anInt2586 * local61 >> 12;
							local49[local55] = this.anInt2588 * local107 >> 12;
							local53[local55] = local144 * this.anInt2589 >> 12;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2587 = arg0.method5610();
		} else if (arg1 == 1) {
			this.anInt2589 = arg0.method5610();
		} else if (arg1 == 2) {
			this.anInt2588 = arg0.method5610();
		} else if (arg1 == 3) {
			this.anInt2586 = arg0.method5610();
		} else if (arg1 == 4) {
			@Pc(62) int local62 = arg0.method5604();
			this.anIntArray164[1] = local62 >> 4 & 0xFF0;
			this.anIntArray164[0] = (local62 & 0xFF0000) << 4;
			this.anIntArray164[2] = local62 >> 12 & 0x0;
		}
	}
}
