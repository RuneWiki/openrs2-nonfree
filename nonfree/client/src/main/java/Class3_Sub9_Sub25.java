import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class3_Sub9_Sub25 extends Class3_Sub9 {

	@OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
	private int anInt5558 = 4096;

	@OriginalMember(owner = "client!lf", name = "G", descriptor = "[I")
	private final int[] anIntArray496 = new int[3];

	@OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
	private int anInt5567 = 3216;

	@OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
	private int anInt5562 = 3216;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub25() {
		super(1, true);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5558 = arg0.method8593();
		} else if (arg1 == 1) {
			this.anInt5562 = arg0.method8593();
		} else if (arg1 == 2) {
			this.anInt5567 = arg0.method8593();
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(27) int local27 = this.anInt5558 * Static154.anInt3055 >> 12;
			@Pc(37) int[] local37 = this.method9162(Static636.anInt10126 & arg0 - 1, 0);
			@Pc(43) int[] local43 = this.method9162(arg0, 0);
			@Pc(53) int[] local53 = this.method9162(Static636.anInt10126 & arg0 + 1, 0);
			for (@Pc(55) int local55 = 0; local55 < Static62.anInt1251; local55++) {
				@Pc(70) int local70 = (local53[local55] - local37[local55]) * local27 >> 12;
				@Pc(90) int local90 = local27 * (local43[local55 - 1 & Static302.anInt5067] - local43[local55 + 1 & Static302.anInt5067]) >> 12;
				@Pc(94) int local94 = local90 >> 4;
				if (local94 < 0) {
					local94 = -local94;
				}
				@Pc(103) int local103 = local70 >> 4;
				if (local103 < 0) {
					local103 = -local103;
				}
				if (local94 > 255) {
					local94 = 255;
				}
				if (local103 > 255) {
					local103 = 255;
				}
				@Pc(134) int local134 = Class219.aByteArray64[((local103 + 1) * local103 >> 1) + local94] & 0xFF;
				@Pc(140) int local140 = local134 * 4096 >> 8;
				@Pc(146) int local146 = local134 * local90 >> 8;
				@Pc(152) int local152 = local70 * local134 >> 8;
				@Pc(161) int local161 = this.anIntArray496[2] * local140 >> 12;
				@Pc(170) int local170 = this.anIntArray496[1] * local152 >> 12;
				@Pc(179) int local179 = local146 * this.anIntArray496[0] >> 12;
				local16[local55] = local179 + local170 + local161;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(B)V")
	private void method5083() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt5567 / 4096.0F));
		this.anIntArray496[0] = (int) (Math.sin((double) ((float) this.anInt5562 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray496[1] = (int) (local11 * Math.cos((double) ((float) this.anInt5562 / 4096.0F)) * 4096.0D);
		this.anIntArray496[2] = (int) (Math.sin((double) ((float) this.anInt5567 / 4096.0F)) * 4096.0D);
		@Pc(80) int local80 = this.anIntArray496[0] * this.anIntArray496[0] >> 12;
		@Pc(92) int local92 = this.anIntArray496[1] * this.anIntArray496[1] >> 12;
		@Pc(104) int local104 = this.anIntArray496[2] * this.anIntArray496[2] >> 12;
		@Pc(117) int local117 = (int) (Math.sqrt((double) (local92 + local80 + local104 >> 12)) * 4096.0D);
		if (local117 != 0) {
			this.anIntArray496[0] = (this.anIntArray496[0] << 12) / local117;
			this.anIntArray496[2] = (this.anIntArray496[2] << 12) / local117;
			this.anIntArray496[1] = (this.anIntArray496[1] << 12) / local117;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
	@Override
	public void method9163() {
		this.method5083();
	}
}
