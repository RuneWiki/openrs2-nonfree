import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class5_Sub6_Sub33 extends Class5_Sub6 {

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
	private int anInt8193 = 4096;

	@OriginalMember(owner = "client!qd", name = "B", descriptor = "[I")
	private final int[] anIntArray455 = new int[3];

	@OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
	private int anInt8190 = 4096;

	@OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
	private int anInt8191 = 4096;

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
	private int anInt8194 = 409;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8194 = arg0.method3698();
		} else if (arg1 == 1) {
			this.anInt8190 = arg0.method3698();
		} else if (arg1 == 2) {
			this.anInt8191 = arg0.method3698();
		} else if (arg1 == 3) {
			this.anInt8193 = arg0.method3698();
		} else if (arg1 == 4) {
			@Pc(60) int local60 = arg0.method3633();
			this.anIntArray455[0] = (local60 & 0xFF0000) << 4;
			this.anIntArray455[2] = local60 >> 12 & 0x0;
			this.anIntArray455[1] = local60 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8122(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass242_41.method5691(arg0);
		if (super.aClass242_41.aBoolean487) {
			@Pc(29) int[][] local29 = this.method8116(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local13[0];
			@Pc(49) int[] local49 = local13[1];
			@Pc(53) int[] local53 = local13[2];
			for (@Pc(55) int local55 = 0; local55 < Static421.anInt7443; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(69) int local69 = local61 - this.anIntArray455[0];
				if (local69 < 0) {
					local69 = -local69;
				}
				if (local69 > this.anInt8194) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(103) int local103 = local37[local55];
					local69 = local103 - this.anIntArray455[1];
					if (local69 < 0) {
						local69 = -local69;
					}
					if (this.anInt8194 < local69) {
						local45[local55] = local61;
						local49[local55] = local103;
						local53[local55] = local41[local55];
					} else {
						@Pc(146) int local146 = local41[local55];
						local69 = local146 - this.anIntArray455[2];
						if (local69 < 0) {
							local69 = -local69;
						}
						if (local69 > this.anInt8194) {
							local45[local55] = local61;
							local49[local55] = local103;
							local53[local55] = local146;
						} else {
							local45[local55] = local61 * this.anInt8193 >> 12;
							local49[local55] = this.anInt8191 * local103 >> 12;
							local53[local55] = local146 * this.anInt8190 >> 12;
						}
					}
				}
			}
		}
		return local13;
	}
}
