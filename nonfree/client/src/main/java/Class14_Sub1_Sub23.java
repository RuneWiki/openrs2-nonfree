import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class14_Sub1_Sub23 extends Class14_Sub1 {

	@OriginalMember(owner = "client!lt", name = "J", descriptor = "I")
	private int anInt6426 = 4096;

	@OriginalMember(owner = "client!lt", name = "L", descriptor = "I")
	private int anInt6428 = 4096;

	@OriginalMember(owner = "client!lt", name = "N", descriptor = "I")
	private int anInt6429 = 4096;

	@OriginalMember(owner = "client!lt", name = "M", descriptor = "[I")
	private final int[] anIntArray464 = new int[3];

	@OriginalMember(owner = "client!lt", name = "K", descriptor = "I")
	private int anInt6427 = 409;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8905(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass279_41.method6840(arg0);
		if (super.aClass279_41.aBoolean571) {
			@Pc(29) int[][] local29 = this.method8904(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static371.anInt6835; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(68) int local68 = local61 - this.anIntArray464[0];
				if (local68 < 0) {
					local68 = -local68;
				}
				if (local68 > this.anInt6427) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(106) int local106 = local37[local55];
					local68 = local106 - this.anIntArray464[1];
					if (local68 < 0) {
						local68 = -local68;
					}
					if (this.anInt6427 < local68) {
						local45[local55] = local61;
						local49[local55] = local106;
						local53[local55] = local41[local55];
					} else {
						@Pc(149) int local149 = local41[local55];
						local68 = local149 - this.anIntArray464[2];
						if (local68 < 0) {
							local68 = -local68;
						}
						if (this.anInt6427 < local68) {
							local45[local55] = local61;
							local49[local55] = local106;
							local53[local55] = local149;
						} else {
							local45[local55] = this.anInt6428 * local61 >> 12;
							local49[local55] = this.anInt6429 * local106 >> 12;
							local53[local55] = this.anInt6426 * local149 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6427 = arg0.method5900();
		} else if (arg1 == 1) {
			this.anInt6426 = arg0.method5900();
		} else if (arg1 == 2) {
			this.anInt6429 = arg0.method5900();
		} else if (arg1 == 3) {
			this.anInt6428 = arg0.method5900();
		} else if (arg1 == 4) {
			@Pc(58) int local58 = arg0.method5862();
			this.anIntArray464[1] = local58 >> 4 & 0xFF0;
			this.anIntArray464[0] = (local58 & 0xFF0000) << 4;
			this.anIntArray464[2] = local58 >> 12 & 0x0;
		}
	}
}
