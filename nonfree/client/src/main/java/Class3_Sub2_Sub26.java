import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class3_Sub2_Sub26 extends Class3_Sub2 {

	@OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
	private int anInt6880 = 3216;

	@OriginalMember(owner = "client!nl", name = "G", descriptor = "[I")
	private final int[] anIntArray403 = new int[3];

	@OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
	private int anInt6881 = 4096;

	@OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
	private int anInt6883 = 3216;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub26() {
		super(1, true);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(27) int local27 = Static101.anInt2038 * this.anInt6881 >> 12;
			@Pc(37) int[] local37 = this.method8669(Static575.anInt9412 & arg0 - 1, 0);
			@Pc(43) int[] local43 = this.method8669(arg0, 0);
			@Pc(53) int[] local53 = this.method8669(Static575.anInt9412 & arg0 + 1, 0);
			for (@Pc(55) int local55 = 0; local55 < Static201.anInt3738; local55++) {
				@Pc(70) int local70 = (local53[local55] - local37[local55]) * local27 >> 12;
				@Pc(90) int local90 = (local43[local55 - 1 & Static201.anInt3740] - local43[local55 + 1 & Static201.anInt3740]) * local27 >> 12;
				@Pc(94) int local94 = local90 >> 4;
				@Pc(98) int local98 = local70 >> 4;
				if (local94 < 0) {
					local94 = -local94;
				}
				if (local94 > 255) {
					local94 = 255;
				}
				if (local98 < 0) {
					local98 = -local98;
				}
				if (local98 > 255) {
					local98 = 255;
				}
				@Pc(137) int local137 = Class11.aByteArray4[((local98 + 1) * local98 >> 1) + local94] & 0xFF;
				@Pc(143) int local143 = local137 * local70 >> 8;
				@Pc(149) int local149 = local90 * local137 >> 8;
				@Pc(155) int local155 = local137 * 4096 >> 8;
				@Pc(164) int local164 = this.anIntArray403[2] * local155 >> 12;
				@Pc(173) int local173 = this.anIntArray403[0] * local149 >> 12;
				@Pc(182) int local182 = this.anIntArray403[1] * local143 >> 12;
				local16[local55] = local164 + local182 + local173;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
	@Override
	public void method8673() {
		this.method5989();
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
	private void method5989() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt6880 / 4096.0F));
		this.anIntArray403[0] = (int) (Math.sin((double) ((float) this.anInt6883 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray403[1] = (int) (Math.cos((double) ((float) this.anInt6883 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray403[2] = (int) (Math.sin((double) ((float) this.anInt6880 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray403[0] * this.anIntArray403[0] >> 12;
		@Pc(81) int local81 = this.anIntArray403[1] * this.anIntArray403[1] >> 12;
		@Pc(93) int local93 = this.anIntArray403[2] * this.anIntArray403[2] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local81 + local69 + local93 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray403[2] = (this.anIntArray403[2] << 12) / local106;
			this.anIntArray403[1] = (this.anIntArray403[1] << 12) / local106;
			this.anIntArray403[0] = (this.anIntArray403[0] << 12) / local106;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6881 = arg0.method5610();
		} else if (arg1 == 1) {
			this.anInt6883 = arg0.method5610();
		} else if (arg1 == 2) {
			this.anInt6880 = arg0.method5610();
		}
	}
}
