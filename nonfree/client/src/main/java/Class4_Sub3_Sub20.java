import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class4_Sub3_Sub20 extends Class4_Sub3 {

	@OriginalMember(owner = "client!kp", name = "G", descriptor = "[I")
	private final int[] anIntArray325 = new int[3];

	@OriginalMember(owner = "client!kp", name = "L", descriptor = "I")
	private int anInt4279 = 3216;

	@OriginalMember(owner = "client!kp", name = "K", descriptor = "I")
	private int anInt4278 = 4096;

	@OriginalMember(owner = "client!kp", name = "R", descriptor = "I")
	private int anInt4284 = 3216;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub20() {
		super(1, true);
	}

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "(B)V")
	@Override
	public void method6341() {
		this.method3698();
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt4278 = arg1.method4560();
		} else if (arg0 == 1) {
			this.anInt4284 = arg1.method4560();
		} else if (arg0 == 2) {
			this.anInt4279 = arg1.method4560();
		}
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(22) int local22 = Static206.anInt4215 * this.anInt4278 >> 12;
			@Pc(32) int[] local32 = this.method6337(0, Static429.anInt7355 & arg0 - 1);
			@Pc(38) int[] local38 = this.method6337(0, arg0);
			@Pc(48) int[] local48 = this.method6337(0, arg0 + 1 & Static429.anInt7355);
			for (@Pc(50) int local50 = 0; local50 < Static304.anInt5637; local50++) {
				@Pc(65) int local65 = local22 * (local48[local50] - local32[local50]) >> 12;
				@Pc(86) int local86 = local22 * (local38[Static279.anInt5254 & local50 - 1] - local38[Static279.anInt5254 & local50 + 1]) >> 12;
				@Pc(90) int local90 = local86 >> 4;
				if (local90 < 0) {
					local90 = -local90;
				}
				@Pc(99) int local99 = local65 >> 4;
				if (local90 > 255) {
					local90 = 255;
				}
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				@Pc(136) int local136 = Class52.aByteArray21[local90 + ((local99 + 1) * local99 >> 1)] & 0xFF;
				@Pc(142) int local142 = local136 * local86 >> 8;
				@Pc(148) int local148 = local65 * local136 >> 8;
				@Pc(154) int local154 = local136 * 4096 >> 8;
				@Pc(163) int local163 = local148 * this.anIntArray325[1] >> 12;
				@Pc(172) int local172 = local154 * this.anIntArray325[2] >> 12;
				@Pc(181) int local181 = local142 * this.anIntArray325[0] >> 12;
				local11[local50] = local163 + local181 + local172;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "(B)V")
	private void method3698() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt4279 / 4096.0F));
		this.anIntArray325[0] = (int) (Math.sin((double) ((float) this.anInt4284 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray325[1] = (int) (Math.cos((double) ((float) this.anInt4284 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray325[2] = (int) (Math.sin((double) ((float) this.anInt4279 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray325[0] * this.anIntArray325[0] >> 12;
		@Pc(81) int local81 = this.anIntArray325[1] * this.anIntArray325[1] >> 12;
		@Pc(93) int local93 = this.anIntArray325[2] * this.anIntArray325[2] >> 12;
		@Pc(107) int local107 = (int) (Math.sqrt((double) (local69 + local81 + local93 >> 12)) * 4096.0D);
		if (local107 != 0) {
			this.anIntArray325[0] = (this.anIntArray325[0] << 12) / local107;
			this.anIntArray325[2] = (this.anIntArray325[2] << 12) / local107;
			this.anIntArray325[1] = (this.anIntArray325[1] << 12) / local107;
		}
	}
}
