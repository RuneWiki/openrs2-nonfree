import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class5_Sub1_Sub39 extends Class5_Sub1 {

	@OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
	private int anInt10703 = 3216;

	@OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
	private int anInt10704 = 4096;

	@OriginalMember(owner = "client!wk", name = "Q", descriptor = "[I")
	private final int[] anIntArray618 = new int[3];

	@OriginalMember(owner = "client!wk", name = "D", descriptor = "I")
	private int anInt10707 = 3216;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub39() {
		super(1, true);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
	@Override
	public void method9204() {
		this.method9216();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt10704 = arg1.method8519();
		} else if (arg0 == 1) {
			this.anInt10707 = arg1.method8519();
		} else if (arg0 == 2) {
			this.anInt10703 = arg1.method8519();
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(22) int local22 = this.anInt10704 * Static8.anInt89 >> 12;
			@Pc(32) int[] local32 = this.method9210(0, Static542.anInt9254 & arg0 - 1);
			@Pc(38) int[] local38 = this.method9210(0, arg0);
			@Pc(50) int[] local50 = this.method9210(0, arg0 + 1 & Static542.anInt9254);
			for (@Pc(52) int local52 = 0; local52 < Static648.anInt9588; local52++) {
				@Pc(67) int local67 = local22 * (local50[local52] - local32[local52]) >> 12;
				@Pc(88) int local88 = local22 * (local38[Static116.anInt3312 & local52 - 1] - local38[Static116.anInt3312 & local52 + 1]) >> 12;
				@Pc(92) int local92 = local88 >> 4;
				if (local92 < 0) {
					local92 = -local92;
				}
				@Pc(101) int local101 = local67 >> 4;
				if (local101 < 0) {
					local101 = -local101;
				}
				if (local92 > 255) {
					local92 = 255;
				}
				if (local101 > 255) {
					local101 = 255;
				}
				@Pc(137) int local137 = Class8_Sub8.aByteArray79[((local101 + 1) * local101 >> 1) + local92] & 0xFF;
				@Pc(143) int local143 = local88 * local137 >> 8;
				@Pc(149) int local149 = local137 * 4096 >> 8;
				@Pc(155) int local155 = local67 * local137 >> 8;
				@Pc(164) int local164 = this.anIntArray618[2] * local149 >> 12;
				@Pc(173) int local173 = this.anIntArray618[1] * local155 >> 12;
				@Pc(182) int local182 = local143 * this.anIntArray618[0] >> 12;
				local11[local52] = local182 + local173 + local164;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V")
	private void method9216() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt10703 / 4096.0F));
		this.anIntArray618[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt10707 / 4096.0F)));
		this.anIntArray618[1] = (int) (Math.cos((double) ((float) this.anInt10707 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray618[2] = (int) (Math.sin((double) ((float) this.anInt10703 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray618[0] * this.anIntArray618[0] >> 12;
		@Pc(81) int local81 = this.anIntArray618[1] * this.anIntArray618[1] >> 12;
		@Pc(93) int local93 = this.anIntArray618[2] * this.anIntArray618[2] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local93 + local81 + local69 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray618[0] = (this.anIntArray618[0] << 12) / local106;
			this.anIntArray618[1] = (this.anIntArray618[1] << 12) / local106;
			this.anIntArray618[2] = (this.anIntArray618[2] << 12) / local106;
		}
	}
}
