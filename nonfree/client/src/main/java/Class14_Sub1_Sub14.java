import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class14_Sub1_Sub14 extends Class14_Sub1 {

	@OriginalMember(owner = "client!fr", name = "J", descriptor = "[I")
	private final int[] anIntArray280 = new int[3];

	@OriginalMember(owner = "client!fr", name = "G", descriptor = "I")
	private int anInt3319 = 3216;

	@OriginalMember(owner = "client!fr", name = "F", descriptor = "I")
	private int anInt3318 = 3216;

	@OriginalMember(owner = "client!fr", name = "I", descriptor = "I")
	private int anInt3321 = 4096;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(22) int local22 = this.anInt3321 * Static391.anInt7194 >> 12;
			@Pc(32) int[] local32 = this.method8897(0, Static52.anInt1266 & arg0 - 1);
			@Pc(38) int[] local38 = this.method8897(0, arg0);
			@Pc(48) int[] local48 = this.method8897(0, arg0 + 1 & Static52.anInt1266);
			for (@Pc(50) int local50 = 0; local50 < Static371.anInt6835; local50++) {
				@Pc(65) int local65 = local22 * (local48[local50] - local32[local50]) >> 12;
				@Pc(86) int local86 = local22 * (local38[Static192.anInt3590 & local50 - 1] - local38[Static192.anInt3590 & local50 + 1]) >> 12;
				@Pc(90) int local90 = local86 >> 4;
				@Pc(94) int local94 = local65 >> 4;
				if (local90 < 0) {
					local90 = -local90;
				}
				if (local90 > 255) {
					local90 = 255;
				}
				if (local94 < 0) {
					local94 = -local94;
				}
				if (local94 > 255) {
					local94 = 255;
				}
				@Pc(135) int local135 = Class277.aByteArray92[local90 + ((local94 + 1) * local94 >> 1)] & 0xFF;
				@Pc(141) int local141 = local135 * local65 >> 8;
				@Pc(147) int local147 = local135 * 4096 >> 8;
				@Pc(153) int local153 = local135 * local86 >> 8;
				@Pc(162) int local162 = this.anIntArray280[0] * local153 >> 12;
				@Pc(171) int local171 = local141 * this.anIntArray280[1] >> 12;
				@Pc(180) int local180 = this.anIntArray280[2] * local147 >> 12;
				local11[local50] = local180 + local162 + local171;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3321 = arg0.method5900();
		} else if (arg1 == 1) {
			this.anInt3318 = arg0.method5900();
		} else if (arg1 == 2) {
			this.anInt3319 = arg0.method5900();
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
	@Override
	public void method8899() {
		this.method2735();
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
	private void method2735() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt3319 / 4096.0F));
		this.anIntArray280[0] = (int) (local11 * Math.sin((double) ((float) this.anInt3318 / 4096.0F)) * 4096.0D);
		this.anIntArray280[1] = (int) (local11 * Math.cos((double) ((float) this.anInt3318 / 4096.0F)) * 4096.0D);
		this.anIntArray280[2] = (int) (Math.sin((double) ((float) this.anInt3319 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray280[0] * this.anIntArray280[0] >> 12;
		@Pc(81) int local81 = this.anIntArray280[1] * this.anIntArray280[1] >> 12;
		@Pc(93) int local93 = this.anIntArray280[2] * this.anIntArray280[2] >> 12;
		@Pc(116) int local116 = (int) (Math.sqrt((double) (local69 + local81 + local93 >> 12)) * 4096.0D);
		if (local116 != 0) {
			this.anIntArray280[2] = (this.anIntArray280[2] << 12) / local116;
			this.anIntArray280[0] = (this.anIntArray280[0] << 12) / local116;
			this.anIntArray280[1] = (this.anIntArray280[1] << 12) / local116;
		}
	}
}
