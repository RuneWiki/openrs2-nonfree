import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class3_Sub3_Sub20 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
	private int anInt3700 = 3216;

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "[I")
	private final int[] anIntArray251 = new int[3];

	@OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
	private int anInt3699 = 3216;

	@OriginalMember(owner = "client!ld", name = "ab", descriptor = "I")
	private int anInt3712 = 4096;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub20() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(22) int local22 = this.anInt3712 * Static16.anInt519 >> 12;
			@Pc(32) int[] local32 = this.method5733(arg0 - 1 & Static351.anInt6821, 0);
			@Pc(38) int[] local38 = this.method5733(arg0, 0);
			@Pc(48) int[] local48 = this.method5733(Static351.anInt6821 & arg0 + 1, 0);
			for (@Pc(50) int local50 = 0; local50 < Static131.anInt2755; local50++) {
				@Pc(65) int local65 = (local48[local50] - local32[local50]) * local22 >> 12;
				@Pc(85) int local85 = local22 * (local38[local50 - 1 & Static167.anInt3460] - local38[Static167.anInt3460 & local50 + 1]) >> 12;
				@Pc(89) int local89 = local85 >> 4;
				@Pc(93) int local93 = local65 >> 4;
				if (local89 < 0) {
					local89 = -local89;
				}
				if (local89 > 255) {
					local89 = 255;
				}
				if (local93 < 0) {
					local93 = -local93;
				}
				if (local93 > 255) {
					local93 = 255;
				}
				@Pc(132) int local132 = Class152_Sub1.aByteArray75[(local93 * (local93 + 1) >> 1) + local89] & 0xFF;
				@Pc(138) int local138 = local132 * local85 >> 8;
				@Pc(144) int local144 = local65 * local132 >> 8;
				@Pc(150) int local150 = local132 * 4096 >> 8;
				@Pc(159) int local159 = local138 * this.anIntArray251[0] >> 12;
				@Pc(168) int local168 = this.anIntArray251[2] * local150 >> 12;
				@Pc(177) int local177 = this.anIntArray251[1] * local144 >> 12;
				local11[local50] = local159 + local177 + local168;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)V")
	private void method2914() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt3699 / 4096.0F));
		this.anIntArray251[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt3700 / 4096.0F)));
		this.anIntArray251[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt3700 / 4096.0F)));
		this.anIntArray251[2] = (int) (Math.sin((double) ((float) this.anInt3699 / 4096.0F)) * 4096.0D);
		@Pc(74) int local74 = this.anIntArray251[0] * this.anIntArray251[0] >> 12;
		@Pc(86) int local86 = this.anIntArray251[1] * this.anIntArray251[1] >> 12;
		@Pc(98) int local98 = this.anIntArray251[2] * this.anIntArray251[2] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local98 + local86 + local74 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray251[0] = (this.anIntArray251[0] << 12) / local111;
			this.anIntArray251[2] = (this.anIntArray251[2] << 12) / local111;
			this.anIntArray251[1] = (this.anIntArray251[1] << 12) / local111;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3712 = arg0.method3649();
		} else if (arg1 == 1) {
			this.anInt3700 = arg0.method3649();
		} else if (arg1 == 2) {
			this.anInt3699 = arg0.method3649();
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
	@Override
	public void method5730() {
		this.method2914();
	}
}
