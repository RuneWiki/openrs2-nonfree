import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class4_Sub4_Sub32 extends Class4_Sub4 {

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
	private int anInt6531 = 3216;

	@OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
	private int anInt6533 = 4096;

	@OriginalMember(owner = "client!uc", name = "P", descriptor = "[I")
	private final int[] anIntArray512 = new int[3];

	@OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
	private int anInt6536 = 3216;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass103_41.method1977(arg0);
		if (super.aClass103_41.aBoolean164) {
			@Pc(24) int local24 = this.anInt6533 * Static449.anInt7499 >> 12;
			@Pc(34) int[] local34 = this.method6040(arg0 - 1 & Static204.anInt3610, 0);
			@Pc(42) int[] local42 = this.method6040(arg0, 0);
			@Pc(52) int[] local52 = this.method6040(Static204.anInt3610 & arg0 + 1, 0);
			for (@Pc(54) int local54 = 0; local54 < Static419.anInt6404; local54++) {
				@Pc(69) int local69 = local24 * (local52[local54] - local34[local54]) >> 12;
				@Pc(89) int local89 = (local42[Static211.anInt3669 & local54 - 1] - local42[Static211.anInt3669 & local54 + 1]) * local24 >> 12;
				@Pc(93) int local93 = local89 >> 4;
				@Pc(97) int local97 = local69 >> 4;
				if (local93 < 0) {
					local93 = -local93;
				}
				if (local93 > 255) {
					local93 = 255;
				}
				if (local97 < 0) {
					local97 = -local97;
				}
				if (local97 > 255) {
					local97 = 255;
				}
				@Pc(136) int local136 = Class142.aByteArray35[local93 + ((local97 + 1) * local97 >> 1)] & 0xFF;
				@Pc(142) int local142 = local136 * 4096 >> 8;
				@Pc(148) int local148 = local89 * local136 >> 8;
				@Pc(154) int local154 = local69 * local136 >> 8;
				@Pc(163) int local163 = this.anIntArray512[2] * local142 >> 12;
				@Pc(172) int local172 = local148 * this.anIntArray512[0] >> 12;
				@Pc(181) int local181 = this.anIntArray512[1] * local154 >> 12;
				local13[local54] = local163 + local172 + local181;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V")
	private void method5295() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt6536 / 4096.0F));
		this.anIntArray512[0] = (int) (Math.sin((double) ((float) this.anInt6531 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray512[1] = (int) (Math.cos((double) ((float) this.anInt6531 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray512[2] = (int) (Math.sin((double) ((float) this.anInt6536 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray512[0] * this.anIntArray512[0] >> 12;
		@Pc(81) int local81 = this.anIntArray512[1] * this.anIntArray512[1] >> 12;
		@Pc(97) int local97 = this.anIntArray512[2] * this.anIntArray512[2] >> 12;
		@Pc(110) int local110 = (int) (Math.sqrt((double) (local81 + local69 + local97 >> 12)) * 4096.0D);
		if (local110 != 0) {
			this.anIntArray512[0] = (this.anIntArray512[0] << 12) / local110;
			this.anIntArray512[2] = (this.anIntArray512[2] << 12) / local110;
			this.anIntArray512[1] = (this.anIntArray512[1] << 12) / local110;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt6533 = arg1.method5028();
		} else if (arg0 == 1) {
			this.anInt6531 = arg1.method5028();
		} else if (arg0 == 2) {
			this.anInt6536 = arg1.method5028();
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V")
	@Override
	public void method6038() {
		this.method5295();
	}
}
