import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class4_Sub2_Sub34 extends Class4_Sub2 {

	@OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
	private int anInt9712 = 4096;

	@OriginalMember(owner = "client!uf", name = "P", descriptor = "[I")
	private final int[] anIntArray550 = new int[3];

	@OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
	private int anInt9715 = 3216;

	@OriginalMember(owner = "client!uf", name = "S", descriptor = "I")
	private int anInt9719 = 3216;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub34() {
		super(1, true);
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
	@Override
	public void method8210() {
		this.method7483();
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(30) int local30 = Static170.anInt3583 * this.anInt9712 >> 12;
			@Pc(40) int[] local40 = this.method8208(0, Static565.anInt5164 & arg0 - 1);
			@Pc(46) int[] local46 = this.method8208(0, arg0);
			@Pc(56) int[] local56 = this.method8208(0, arg0 + 1 & Static565.anInt5164);
			for (@Pc(58) int local58 = 0; local58 < Static417.anInt5248; local58++) {
				@Pc(73) int local73 = (local56[local58] - local40[local58]) * local30 >> 12;
				@Pc(94) int local94 = local30 * (local46[local58 - 1 & Static359.anInt6929] - local46[local58 + 1 & Static359.anInt6929]) >> 12;
				@Pc(98) int local98 = local94 >> 4;
				if (local98 < 0) {
					local98 = -local98;
				}
				@Pc(110) int local110 = local73 >> 4;
				if (local98 > 255) {
					local98 = 255;
				}
				if (local110 < 0) {
					local110 = -local110;
				}
				if (local110 > 255) {
					local110 = 255;
				}
				@Pc(145) int local145 = Class85.aByteArray17[local98 + (local110 * (local110 + 1) >> 1)] & 0xFF;
				@Pc(151) int local151 = local145 * local94 >> 8;
				@Pc(157) int local157 = local145 * 4096 >> 8;
				@Pc(163) int local163 = local145 * local73 >> 8;
				@Pc(172) int local172 = this.anIntArray550[2] * local157 >> 12;
				@Pc(181) int local181 = this.anIntArray550[1] * local163 >> 12;
				@Pc(190) int local190 = local151 * this.anIntArray550[0] >> 12;
				local19[local58] = local190 + local181 + local172;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9712 = arg0.method7054();
		} else if (arg1 == 1) {
			this.anInt9719 = arg0.method7054();
		} else if (arg1 == 2) {
			this.anInt9715 = arg0.method7054();
		}
	}

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)V")
	private void method7483() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt9715 / 4096.0F));
		this.anIntArray550[0] = (int) (Math.sin((double) ((float) this.anInt9719 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray550[1] = (int) (Math.cos((double) ((float) this.anInt9719 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray550[2] = (int) (Math.sin((double) ((float) this.anInt9715 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray550[0] * this.anIntArray550[0] >> 12;
		@Pc(81) int local81 = this.anIntArray550[1] * this.anIntArray550[1] >> 12;
		@Pc(93) int local93 = this.anIntArray550[2] * this.anIntArray550[2] >> 12;
		@Pc(110) int local110 = (int) (Math.sqrt((double) (local93 + local69 + local81 >> 12)) * 4096.0D);
		if (local110 != 0) {
			this.anIntArray550[0] = (this.anIntArray550[0] << 12) / local110;
			this.anIntArray550[2] = (this.anIntArray550[2] << 12) / local110;
			this.anIntArray550[1] = (this.anIntArray550[1] << 12) / local110;
		}
	}
}
