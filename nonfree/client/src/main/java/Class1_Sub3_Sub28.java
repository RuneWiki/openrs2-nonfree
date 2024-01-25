import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class1_Sub3_Sub28 extends Class1_Sub3 {

	@OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
	private int anInt6497 = 4096;

	@OriginalMember(owner = "client!pg", name = "O", descriptor = "I")
	private int anInt6505 = 3216;

	@OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
	private int anInt6502 = 3216;

	@OriginalMember(owner = "client!pg", name = "P", descriptor = "[I")
	private final int[] anIntArray658 = new int[3];

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub28() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass12_41.method502(arg0);
		if (super.aClass12_41.aBoolean23) {
			@Pc(22) int local22 = Static204.anInt4014 * this.anInt6497 >> 12;
			@Pc(32) int[] local32 = this.method7128(0, arg0 - 1 & Static323.anInt5914);
			@Pc(38) int[] local38 = this.method7128(0, arg0);
			@Pc(48) int[] local48 = this.method7128(0, arg0 + 1 & Static323.anInt5914);
			for (@Pc(50) int local50 = 0; local50 < Static452.anInt7734; local50++) {
				@Pc(64) int local64 = local22 * (local48[local50] - local32[local50]) >> 12;
				@Pc(85) int local85 = (local38[local50 - 1 & Static80.anInt1453] - local38[Static80.anInt1453 & local50 + 1]) * local22 >> 12;
				@Pc(89) int local89 = local85 >> 4;
				@Pc(93) int local93 = local64 >> 4;
				if (local89 < 0) {
					local89 = -local89;
				}
				if (local93 < 0) {
					local93 = -local93;
				}
				if (local89 > 255) {
					local89 = 255;
				}
				if (local93 > 255) {
					local93 = 255;
				}
				@Pc(130) int local130 = Class282.aByteArray110[local89 + (local93 * (local93 + 1) >> 1)] & 0xFF;
				@Pc(136) int local136 = local130 * local85 >> 8;
				@Pc(142) int local142 = local130 * local64 >> 8;
				@Pc(148) int local148 = local130 * 4096 >> 8;
				@Pc(157) int local157 = local142 * this.anIntArray658[1] >> 12;
				@Pc(166) int local166 = local136 * this.anIntArray658[0] >> 12;
				@Pc(175) int local175 = local148 * this.anIntArray658[2] >> 12;
				local11[local50] = local175 + local157 + local166;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "(I)V")
	private void method5467() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt6502 / 4096.0F));
		this.anIntArray658[0] = (int) (local11 * Math.sin((double) ((float) this.anInt6505 / 4096.0F)) * 4096.0D);
		this.anIntArray658[1] = (int) (Math.cos((double) ((float) this.anInt6505 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray658[2] = (int) (Math.sin((double) ((float) this.anInt6502 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray658[0] * this.anIntArray658[0] >> 12;
		@Pc(81) int local81 = this.anIntArray658[1] * this.anIntArray658[1] >> 12;
		@Pc(99) int local99 = this.anIntArray658[2] * this.anIntArray658[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local99 + local81 + local69 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray658[0] = (this.anIntArray658[0] << 12) / local112;
			this.anIntArray658[2] = (this.anIntArray658[2] << 12) / local112;
			this.anIntArray658[1] = (this.anIntArray658[1] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)V")
	@Override
	public void method7126() {
		this.method5467();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6497 = arg0.method3967();
		} else if (arg1 == 1) {
			this.anInt6505 = arg0.method3967();
		} else if (arg1 == 2) {
			this.anInt6502 = arg0.method3967();
		}
	}
}
