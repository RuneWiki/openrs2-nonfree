import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class1_Sub1_Sub19 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
	private int anInt2371 = 3216;

	@OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
	private int anInt2370 = 3216;

	@OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
	private int anInt2373 = 4096;

	@OriginalMember(owner = "client!ii", name = "K", descriptor = "[I")
	private int[] anIntArray167 = new int[3];

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub19() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(23) int[] local23 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(34) int local34 = Static53.anInt1156 * this.anInt2373 >> 12;
			@Pc(44) int[] local44 = this.method4464(arg0 - 1 & Static202.anInt3956, 0);
			@Pc(50) int[] local50 = this.method4464(arg0, 0);
			@Pc(60) int[] local60 = this.method4464(arg0 + 1 & Static202.anInt3956, 0);
			for (@Pc(62) int local62 = 0; local62 < Static6.anInt4960; local62++) {
				@Pc(78) int local78 = (local60[local62] - local44[local62]) * local34 >> 12;
				@Pc(99) int local99 = (local50[local62 - 1 & Static274.anInt5042] - local50[Static274.anInt5042 & local62 + 1]) * local34 >> 12;
				@Pc(103) int local103 = local99 >> 4;
				if (local103 < 0) {
					local103 = -local103;
				}
				@Pc(115) int local115 = local78 >> 4;
				if (local103 > 255) {
					local103 = 255;
				}
				if (local115 < 0) {
					local115 = -local115;
				}
				if (local115 > 255) {
					local115 = 255;
				}
				@Pc(146) int local146 = Class1.aByteArray188[(local115 * (local115 + 1) >> 1) + local103] & 0xFF;
				@Pc(152) int local152 = local78 * local146 >> 8;
				@Pc(161) int local161 = this.anIntArray167[1] * local152 >> 12;
				@Pc(167) int local167 = local146 * local99 >> 8;
				@Pc(173) int local173 = local146 * 4096 >> 8;
				@Pc(182) int local182 = local173 * this.anIntArray167[2] >> 12;
				@Pc(191) int local191 = this.anIntArray167[0] * local167 >> 12;
				local23[local62] = local161 + local191 + local182;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(B)V")
	@Override
	public void method4460() {
		this.method2103();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2373 = arg0.method1879();
		} else if (arg1 == 1) {
			this.anInt2371 = arg0.method1879();
		} else if (arg1 == 2) {
			this.anInt2370 = arg0.method1879();
		}
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
	private void method2103() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt2370 / 4096.0F));
		this.anIntArray167[0] = (int) (local11 * Math.sin((double) ((float) this.anInt2371 / 4096.0F)) * 4096.0D);
		this.anIntArray167[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt2371 / 4096.0F)));
		this.anIntArray167[2] = (int) (Math.sin((double) ((float) this.anInt2370 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray167[1] * this.anIntArray167[1] >> 12;
		@Pc(81) int local81 = this.anIntArray167[0] * this.anIntArray167[0] >> 12;
		@Pc(93) int local93 = this.anIntArray167[2] * this.anIntArray167[2] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local93 + local69 + local81 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray167[1] = (this.anIntArray167[1] << 12) / local106;
			this.anIntArray167[0] = (this.anIntArray167[0] << 12) / local106;
			this.anIntArray167[2] = (this.anIntArray167[2] << 12) / local106;
		}
	}
}
