import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class5_Sub3_Sub26 extends Class5_Sub3 {

	@OriginalMember(owner = "client!raa", name = "Q", descriptor = "[I")
	private final int[] anIntArray464 = new int[3];

	@OriginalMember(owner = "client!raa", name = "R", descriptor = "I")
	private int anInt8112 = 3216;

	@OriginalMember(owner = "client!raa", name = "S", descriptor = "I")
	private int anInt8113 = 3216;

	@OriginalMember(owner = "client!raa", name = "N", descriptor = "I")
	private int anInt8118 = 4096;

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub26() {
		super(1, true);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(32) int local32 = this.anInt8118 * Static373.anInt6285 >> 12;
			@Pc(42) int[] local42 = this.method9205(arg0 - 1 & Static652.anInt10663, 0);
			@Pc(48) int[] local48 = this.method9205(arg0, 0);
			@Pc(58) int[] local58 = this.method9205(arg0 + 1 & Static652.anInt10663, 0);
			for (@Pc(60) int local60 = 0; local60 < Static7.anInt102; local60++) {
				@Pc(75) int local75 = (local58[local60] - local42[local60]) * local32 >> 12;
				@Pc(96) int local96 = local32 * (local48[Static517.anInt8205 & local60 - 1] - local48[local60 + 1 & Static517.anInt8205]) >> 12;
				@Pc(100) int local100 = local96 >> 4;
				@Pc(104) int local104 = local75 >> 4;
				if (local100 < 0) {
					local100 = -local100;
				}
				if (local104 < 0) {
					local104 = -local104;
				}
				if (local100 > 255) {
					local100 = 255;
				}
				if (local104 > 255) {
					local104 = 255;
				}
				@Pc(143) int local143 = Class86.aByteArray22[local100 + (local104 * (local104 + 1) >> 1)] & 0xFF;
				@Pc(149) int local149 = local143 * local96 >> 8;
				@Pc(155) int local155 = local75 * local143 >> 8;
				@Pc(161) int local161 = local143 * 4096 >> 8;
				@Pc(170) int local170 = local155 * this.anIntArray464[1] >> 12;
				@Pc(179) int local179 = local149 * this.anIntArray464[0] >> 12;
				@Pc(188) int local188 = this.anIntArray464[2] * local161 >> 12;
				local21[local60] = local188 + local170 + local179;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8118 = arg0.method7333();
		} else if (arg1 == 1) {
			this.anInt8113 = arg0.method7333();
		} else if (arg1 == 2) {
			this.anInt8112 = arg0.method7333();
		}
	}

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "(B)V")
	private void method7007() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt8112 / 4096.0F));
		this.anIntArray464[0] = (int) (Math.sin((double) ((float) this.anInt8113 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray464[1] = (int) (Math.cos((double) ((float) this.anInt8113 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray464[2] = (int) (Math.sin((double) ((float) this.anInt8112 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray464[0] * this.anIntArray464[0] >> 12;
		@Pc(81) int local81 = this.anIntArray464[1] * this.anIntArray464[1] >> 12;
		@Pc(93) int local93 = this.anIntArray464[2] * this.anIntArray464[2] >> 12;
		@Pc(117) int local117 = (int) (Math.sqrt((double) (local81 + local69 + local93 >> 12)) * 4096.0D);
		if (local117 != 0) {
			this.anIntArray464[0] = (this.anIntArray464[0] << 12) / local117;
			this.anIntArray464[1] = (this.anIntArray464[1] << 12) / local117;
			this.anIntArray464[2] = (this.anIntArray464[2] << 12) / local117;
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V")
	@Override
	public void method9210() {
		this.method7007();
	}
}
