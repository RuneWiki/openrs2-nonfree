import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class6_Sub4_Sub24 extends Class6_Sub4 {

	@OriginalMember(owner = "client!ln", name = "E", descriptor = "I")
	private int anInt6157 = 4096;

	@OriginalMember(owner = "client!ln", name = "J", descriptor = "I")
	private int anInt6162 = 3216;

	@OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
	private int anInt6163 = 3216;

	@OriginalMember(owner = "client!ln", name = "M", descriptor = "[I")
	private final int[] anIntArray362 = new int[3];

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt6157 = arg1.method8571();
		} else if (arg0 == 1) {
			this.anInt6162 = arg1.method8571();
		} else if (arg0 == 2) {
			this.anInt6163 = arg1.method8571();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			@Pc(22) int local22 = this.anInt6157 * Static569.anInt9580 >> 12;
			@Pc(32) int[] local32 = this.method8313(Static2.anInt12 & arg0 - 1, 0);
			@Pc(38) int[] local38 = this.method8313(arg0, 0);
			@Pc(48) int[] local48 = this.method8313(arg0 + 1 & Static2.anInt12, 0);
			for (@Pc(50) int local50 = 0; local50 < Static6.anInt111; local50++) {
				@Pc(64) int local64 = (local48[local50] - local32[local50]) * local22 >> 12;
				@Pc(85) int local85 = (local38[local50 - 1 & Static325.anInt6209] - local38[local50 + 1 & Static325.anInt6209]) * local22 >> 12;
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
				@Pc(130) int local130 = Class313.aByteArray106[((local93 + 1) * local93 >> 1) + local89] & 0xFF;
				@Pc(136) int local136 = local85 * local130 >> 8;
				@Pc(142) int local142 = local130 * local64 >> 8;
				@Pc(148) int local148 = local130 * 4096 >> 8;
				@Pc(157) int local157 = this.anIntArray362[2] * local148 >> 12;
				@Pc(166) int local166 = local136 * this.anIntArray362[0] >> 12;
				@Pc(175) int local175 = this.anIntArray362[1] * local142 >> 12;
				local11[local50] = local166 + local175 + local157;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "(B)V")
	private void method5362() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt6163 / 4096.0F));
		this.anIntArray362[0] = (int) (local11 * Math.sin((double) ((float) this.anInt6162 / 4096.0F)) * 4096.0D);
		this.anIntArray362[1] = (int) (local11 * Math.cos((double) ((float) this.anInt6162 / 4096.0F)) * 4096.0D);
		this.anIntArray362[2] = (int) (Math.sin((double) ((float) this.anInt6163 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray362[0] * this.anIntArray362[0] >> 12;
		@Pc(81) int local81 = this.anIntArray362[1] * this.anIntArray362[1] >> 12;
		@Pc(93) int local93 = this.anIntArray362[2] * this.anIntArray362[2] >> 12;
		@Pc(114) int local114 = (int) (Math.sqrt((double) (local93 + local69 + local81 >> 12)) * 4096.0D);
		if (local114 != 0) {
			this.anIntArray362[2] = (this.anIntArray362[2] << 12) / local114;
			this.anIntArray362[1] = (this.anIntArray362[1] << 12) / local114;
			this.anIntArray362[0] = (this.anIntArray362[0] << 12) / local114;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
	@Override
	public void method8315() {
		this.method5362();
	}
}
