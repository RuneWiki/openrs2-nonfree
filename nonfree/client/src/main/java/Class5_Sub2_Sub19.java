import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class5_Sub2_Sub19 extends Class5_Sub2 {

	@OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
	private int anInt3302 = 4096;

	@OriginalMember(owner = "client!kk", name = "L", descriptor = "[I")
	private final int[] anIntArray230 = new int[3];

	@OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
	private int anInt3303 = 4096;

	@OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
	private int anInt3305 = 409;

	@OriginalMember(owner = "client!kk", name = "Q", descriptor = "I")
	private int anInt3306 = 4096;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5806(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass154_41.method4027(arg0);
		if (super.aClass154_41.aBoolean336) {
			@Pc(29) int[][] local29 = this.method5818(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static15.anInt493; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(68) int local68 = local61 - this.anIntArray230[0];
				if (local68 < 0) {
					local68 = -local68;
				}
				if (this.anInt3305 < local68) {
					local45[local55] = local61;
					local49[local55] = local37[local55];
					local53[local55] = local41[local55];
				} else {
					@Pc(106) int local106 = local37[local55];
					local68 = local106 - this.anIntArray230[1];
					if (local68 < 0) {
						local68 = -local68;
					}
					if (local68 > this.anInt3305) {
						local45[local55] = local61;
						local49[local55] = local106;
						local53[local55] = local41[local55];
					} else {
						@Pc(149) int local149 = local41[local55];
						local68 = local149 - this.anIntArray230[2];
						if (local68 < 0) {
							local68 = -local68;
						}
						if (this.anInt3305 < local68) {
							local45[local55] = local61;
							local49[local55] = local106;
							local53[local55] = local149;
						} else {
							local45[local55] = this.anInt3303 * local61 >> 12;
							local49[local55] = local106 * this.anInt3302 >> 12;
							local53[local55] = local149 * this.anInt3306 >> 12;
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3305 = arg0.method1845();
		} else if (arg1 == 1) {
			this.anInt3306 = arg0.method1845();
		} else if (arg1 == 2) {
			this.anInt3302 = arg0.method1845();
		} else if (arg1 == 3) {
			this.anInt3303 = arg0.method1845();
		} else if (arg1 == 4) {
			@Pc(53) int local53 = arg0.method1843();
			this.anIntArray230[2] = local53 >> 12 & 0x0;
			this.anIntArray230[0] = (local53 & 0xFF0000) << 4;
			this.anIntArray230[1] = local53 >> 4 & 0xFF0;
		}
	}
}
