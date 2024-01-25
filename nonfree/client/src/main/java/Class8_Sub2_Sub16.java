import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class8_Sub2_Sub16 extends Class8_Sub2 {

	@OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
	private int anInt4689 = 4096;

	@OriginalMember(owner = "client!hi", name = "J", descriptor = "I")
	private int anInt4692 = 4096;

	@OriginalMember(owner = "client!hi", name = "K", descriptor = "I")
	private int anInt4693 = 4096;

	@OriginalMember(owner = "client!hi", name = "G", descriptor = "[I")
	private final int[] anIntArray257 = new int[3];

	@OriginalMember(owner = "client!hi", name = "H", descriptor = "I")
	private int anInt4690 = 409;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8500(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass269_41.method6817(arg0);
		if (super.aClass269_41.aBoolean591) {
			@Pc(29) int[][] local29 = this.method8510(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static538.anInt9297; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray257[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (local69 > this.anInt4690) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(100) int local100 = local37[local55];
					local69 = local100 - this.anIntArray257[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (local69 > this.anInt4690) {
						local45[local55] = local61;
						local49[local55] = local100;
						local53[local55] = local41[local55];
					} else {
						@Pc(140) int local140 = local41[local55];
						local69 = local140 - this.anIntArray257[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (this.anInt4690 < local69) {
							local45[local55] = local61;
							local49[local55] = local100;
							local53[local55] = local140;
						} else {
							local45[local55] = this.anInt4689 * local61 >> 12;
							local49[local55] = this.anInt4693 * local100 >> 12;
							local53[local55] = this.anInt4692 * local140 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt4690 = arg1.method8578();
		} else if (arg0 == 1) {
			this.anInt4692 = arg1.method8578();
		} else if (arg0 == 2) {
			this.anInt4693 = arg1.method8578();
		} else if (arg0 == 3) {
			this.anInt4689 = arg1.method8578();
		} else if (arg0 == 4) {
			@Pc(60) int local60 = arg1.method8560();
			this.anIntArray257[2] = local60 >> 12 & 0x0;
			this.anIntArray257[0] = (local60 & 0xFF0000) << 4;
			this.anIntArray257[1] = local60 >> 4 & 0xFF0;
		}
	}
}
