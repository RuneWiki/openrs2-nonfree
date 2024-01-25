import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class6_Sub3_Sub38 extends Class6_Sub3 {

	@OriginalMember(owner = "client!vr", name = "G", descriptor = "I")
	private int anInt9701 = 3216;

	@OriginalMember(owner = "client!vr", name = "O", descriptor = "I")
	private int anInt9708 = 3216;

	@OriginalMember(owner = "client!vr", name = "M", descriptor = "I")
	private int anInt9706 = 4096;

	@OriginalMember(owner = "client!vr", name = "Q", descriptor = "[I")
	private final int[] anIntArray705 = new int[3];

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub38() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt9706 = arg1.method6044();
		} else if (arg0 == 1) {
			this.anInt9701 = arg1.method6044();
		} else if (arg0 == 2) {
			this.anInt9708 = arg1.method6044();
		}
	}

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "(I)V")
	@Override
	public void method7957() {
		this.method7766();
	}

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "(I)V")
	private void method7766() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt9708 / 4096.0F));
		this.anIntArray705[0] = (int) (local11 * Math.sin((double) ((float) this.anInt9701 / 4096.0F)) * 4096.0D);
		this.anIntArray705[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt9701 / 4096.0F)));
		this.anIntArray705[2] = (int) (Math.sin((double) ((float) this.anInt9708 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray705[0] * this.anIntArray705[0] >> 12;
		@Pc(81) int local81 = this.anIntArray705[1] * this.anIntArray705[1] >> 12;
		@Pc(93) int local93 = this.anIntArray705[2] * this.anIntArray705[2] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local69 + local81 + local93 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray705[0] = (this.anIntArray705[0] << 12) / local106;
			this.anIntArray705[1] = (this.anIntArray705[1] << 12) / local106;
			this.anIntArray705[2] = (this.anIntArray705[2] << 12) / local106;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(22) int local22 = Static224.anInt4114 * this.anInt9706 >> 12;
			@Pc(32) int[] local32 = this.method7950(0, arg0 - 1 & Static132.anInt2511);
			@Pc(38) int[] local38 = this.method7950(0, arg0);
			@Pc(48) int[] local48 = this.method7950(0, arg0 + 1 & Static132.anInt2511);
			for (@Pc(50) int local50 = 0; local50 < Static35.anInt670; local50++) {
				@Pc(65) int local65 = (local48[local50] - local32[local50]) * local22 >> 12;
				@Pc(86) int local86 = local22 * (local38[local50 - 1 & Static147.anInt2781] - local38[Static147.anInt2781 & local50 + 1]) >> 12;
				@Pc(90) int local90 = local86 >> 4;
				@Pc(94) int local94 = local65 >> 4;
				if (local90 < 0) {
					local90 = -local90;
				}
				if (local94 < 0) {
					local94 = -local94;
				}
				if (local90 > 255) {
					local90 = 255;
				}
				if (local94 > 255) {
					local94 = 255;
				}
				@Pc(136) int local136 = Class239.aByteArray88[local90 + (local94 * (local94 + 1) >> 1)] & 0xFF;
				@Pc(142) int local142 = local86 * local136 >> 8;
				@Pc(148) int local148 = local136 * local65 >> 8;
				@Pc(154) int local154 = local136 * 4096 >> 8;
				@Pc(163) int local163 = local148 * this.anIntArray705[1] >> 12;
				@Pc(172) int local172 = local142 * this.anIntArray705[0] >> 12;
				@Pc(181) int local181 = this.anIntArray705[2] * local154 >> 12;
				local11[local50] = local172 + local163 + local181;
			}
		}
		return local11;
	}
}
