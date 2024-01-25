import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class2_Sub3_Sub14 extends Class2_Sub3 {

	@OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
	private int anInt2585 = 3216;

	@OriginalMember(owner = "client!hf", name = "K", descriptor = "[I")
	private final int[] anIntArray212 = new int[3];

	@OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
	private int anInt2593 = 3216;

	@OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
	private int anInt2595 = 4096;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt2595 = arg1.method3104();
		} else if (arg0 == 1) {
			this.anInt2585 = arg1.method3104();
		} else if (arg0 == 2) {
			this.anInt2593 = arg1.method3104();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(24) int local24 = Static13.anInt218 * this.anInt2595 >> 12;
			@Pc(36) int[] local36 = this.method5700(0, arg0 - 1 & Static241.anInt5135);
			@Pc(42) int[] local42 = this.method5700(0, arg0);
			@Pc(52) int[] local52 = this.method5700(0, Static241.anInt5135 & arg0 + 1);
			for (@Pc(54) int local54 = 0; local54 < Static263.anInt5504; local54++) {
				@Pc(69) int local69 = local24 * (local52[local54] - local36[local54]) >> 12;
				@Pc(89) int local89 = local24 * (local42[local54 - 1 & Static171.anInt3863] - local42[local54 + 1 & Static171.anInt3863]) >> 12;
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
				@Pc(138) int local138 = Class207.aByteArray89[(local97 * (local97 + 1) >> 1) + local93] & 0xFF;
				@Pc(144) int local144 = local69 * local138 >> 8;
				@Pc(150) int local150 = local138 * local89 >> 8;
				@Pc(156) int local156 = local138 * 4096 >> 8;
				@Pc(165) int local165 = this.anIntArray212[1] * local144 >> 12;
				@Pc(174) int local174 = this.anIntArray212[2] * local156 >> 12;
				@Pc(183) int local183 = local150 * this.anIntArray212[0] >> 12;
				local13[local54] = local165 + local183 + local174;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
	@Override
	public void method5708() {
		this.method2383();
	}

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)V")
	private void method2383() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt2593 / 4096.0F));
		this.anIntArray212[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt2585 / 4096.0F)));
		this.anIntArray212[1] = (int) (Math.cos((double) ((float) this.anInt2585 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray212[2] = (int) (Math.sin((double) ((float) this.anInt2593 / 4096.0F)) * 4096.0D);
		@Pc(74) int local74 = this.anIntArray212[0] * this.anIntArray212[0] >> 12;
		@Pc(86) int local86 = this.anIntArray212[1] * this.anIntArray212[1] >> 12;
		@Pc(98) int local98 = this.anIntArray212[2] * this.anIntArray212[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local74 + local86 + local98 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray212[0] = (this.anIntArray212[0] << 12) / local112;
			this.anIntArray212[2] = (this.anIntArray212[2] << 12) / local112;
			this.anIntArray212[1] = (this.anIntArray212[1] << 12) / local112;
		}
	}
}
