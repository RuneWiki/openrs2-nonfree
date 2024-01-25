import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class6_Sub1_Sub31 extends Class6_Sub1 {

	@OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
	private int anInt5203 = 4096;

	@OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
	private int anInt5205 = 3216;

	@OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
	private int anInt5209 = 3216;

	@OriginalMember(owner = "client!rj", name = "V", descriptor = "[I")
	private final int[] anIntArray564 = new int[3];

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub31() {
		super(1, true);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5203 = arg0.method4021();
		} else if (arg1 == 1) {
			this.anInt5205 = arg0.method4021();
		} else if (arg1 == 2) {
			this.anInt5209 = arg0.method4021();
		}
	}

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)V")
	private void method4750() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt5209 / 4096.0F));
		this.anIntArray564[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt5205 / 4096.0F)));
		this.anIntArray564[1] = (int) (Math.cos((double) ((float) this.anInt5205 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray564[2] = (int) (Math.sin((double) ((float) this.anInt5209 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray564[0] * this.anIntArray564[0] >> 12;
		@Pc(81) int local81 = this.anIntArray564[1] * this.anIntArray564[1] >> 12;
		@Pc(97) int local97 = this.anIntArray564[2] * this.anIntArray564[2] >> 12;
		@Pc(110) int local110 = (int) (Math.sqrt((double) (local97 + local69 + local81 >> 12)) * 4096.0D);
		if (local110 != 0) {
			this.anIntArray564[1] = (this.anIntArray564[1] << 12) / local110;
			this.anIntArray564[2] = (this.anIntArray564[2] << 12) / local110;
			this.anIntArray564[0] = (this.anIntArray564[0] << 12) / local110;
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(27) int local27 = this.anInt5203 * Static75.anInt1394 >> 12;
			@Pc(37) int[] local37 = this.method5609(0, arg0 - 1 & Static113.anInt2099);
			@Pc(43) int[] local43 = this.method5609(0, arg0);
			@Pc(53) int[] local53 = this.method5609(0, arg0 + 1 & Static113.anInt2099);
			for (@Pc(55) int local55 = 0; local55 < Static299.anInt5659; local55++) {
				@Pc(70) int local70 = (local53[local55] - local37[local55]) * local27 >> 12;
				@Pc(91) int local91 = local27 * (local43[Static76.anInt2850 & local55 - 1] - local43[local55 + 1 & Static76.anInt2850]) >> 12;
				@Pc(95) int local95 = local91 >> 4;
				if (local95 < 0) {
					local95 = -local95;
				}
				@Pc(104) int local104 = local70 >> 4;
				if (local95 > 255) {
					local95 = 255;
				}
				if (local104 < 0) {
					local104 = -local104;
				}
				if (local104 > 255) {
					local104 = 255;
				}
				@Pc(140) int local140 = Class141.aByteArray65[((local104 + 1) * local104 >> 1) + local95] & 0xFF;
				@Pc(146) int local146 = local140 * 4096 >> 8;
				@Pc(152) int local152 = local140 * local70 >> 8;
				@Pc(158) int local158 = local91 * local140 >> 8;
				@Pc(167) int local167 = this.anIntArray564[2] * local146 >> 12;
				@Pc(176) int local176 = local152 * this.anIntArray564[1] >> 12;
				@Pc(185) int local185 = local158 * this.anIntArray564[0] >> 12;
				local16[local55] = local185 + local176 + local167;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
	@Override
	public void method5611() {
		this.method4750();
	}
}
