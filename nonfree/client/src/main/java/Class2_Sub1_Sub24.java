import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class2_Sub1_Sub24 extends Class2_Sub1 {

	@OriginalMember(owner = "client!pu", name = "O", descriptor = "I")
	private int anInt5443 = 3216;

	@OriginalMember(owner = "client!pu", name = "Q", descriptor = "[I")
	private final int[] anIntArray360 = new int[3];

	@OriginalMember(owner = "client!pu", name = "K", descriptor = "I")
	private int anInt5441 = 4096;

	@OriginalMember(owner = "client!pu", name = "V", descriptor = "I")
	private int anInt5448 = 3216;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub24() {
		super(1, true);
	}

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "(I)V")
	private void method4415() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt5443 / 4096.0F));
		this.anIntArray360[0] = (int) (local11 * Math.sin((double) ((float) this.anInt5448 / 4096.0F)) * 4096.0D);
		this.anIntArray360[1] = (int) (Math.cos((double) ((float) this.anInt5448 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray360[2] = (int) (Math.sin((double) ((float) this.anInt5443 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray360[0] * this.anIntArray360[0] >> 12;
		@Pc(81) int local81 = this.anIntArray360[1] * this.anIntArray360[1] >> 12;
		@Pc(93) int local93 = this.anIntArray360[2] * this.anIntArray360[2] >> 12;
		@Pc(107) int local107 = (int) (Math.sqrt((double) (local69 + local81 + local93 >> 12)) * 4096.0D);
		if (local107 != 0) {
			this.anIntArray360[1] = (this.anIntArray360[1] << 12) / local107;
			this.anIntArray360[0] = (this.anIntArray360[0] << 12) / local107;
			this.anIntArray360[2] = (this.anIntArray360[2] << 12) / local107;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt5441 = arg1.method3711();
		} else if (arg0 == 1) {
			this.anInt5448 = arg1.method3711();
		} else if (arg0 == 2) {
			this.anInt5443 = arg1.method3711();
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(27) int local27 = this.anInt5441 * Static270.anInt4969 >> 12;
			@Pc(37) int[] local37 = this.method6037(arg0 - 1 & Static36.anInt893, 0);
			@Pc(43) int[] local43 = this.method6037(arg0, 0);
			@Pc(53) int[] local53 = this.method6037(Static36.anInt893 & arg0 + 1, 0);
			for (@Pc(55) int local55 = 0; local55 < Static131.anInt2581; local55++) {
				@Pc(70) int local70 = (local53[local55] - local37[local55]) * local27 >> 12;
				@Pc(91) int local91 = (local43[local55 - 1 & Static287.anInt5227] - local43[local55 + 1 & Static287.anInt5227]) * local27 >> 12;
				@Pc(95) int local95 = local91 >> 4;
				@Pc(99) int local99 = local70 >> 4;
				if (local95 < 0) {
					local95 = -local95;
				}
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local95 > 255) {
					local95 = 255;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				@Pc(136) int local136 = Class84.aByteArray62[(local99 * (local99 + 1) >> 1) + local95] & 0xFF;
				@Pc(142) int local142 = local136 * local91 >> 8;
				@Pc(148) int local148 = local136 * 4096 >> 8;
				@Pc(154) int local154 = local136 * local70 >> 8;
				@Pc(163) int local163 = local148 * this.anIntArray360[2] >> 12;
				@Pc(172) int local172 = this.anIntArray360[0] * local142 >> 12;
				@Pc(181) int local181 = local154 * this.anIntArray360[1] >> 12;
				local11[local55] = local172 + local181 + local163;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V")
	@Override
	public void method6034() {
		this.method4415();
	}
}
