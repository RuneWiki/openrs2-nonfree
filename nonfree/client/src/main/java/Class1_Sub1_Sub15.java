import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hj", name = "L", descriptor = "[I")
	private int[] anIntArray230 = new int[3];

	@OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
	private int anInt2326 = 3216;

	@OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
	private int anInt2327 = 4096;

	@OriginalMember(owner = "client!hj", name = "Y", descriptor = "I")
	private int anInt2333 = 3216;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub15() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(27) int local27 = this.anInt2327 * Static220.anInt4684 >> 12;
			@Pc(37) int[] local37 = this.method4716(0, Static279.anInt5616 & arg0 - 1);
			@Pc(43) int[] local43 = this.method4716(0, arg0);
			@Pc(53) int[] local53 = this.method4716(0, arg0 + 1 & Static279.anInt5616);
			for (@Pc(55) int local55 = 0; local55 < Static62.anInt1350; local55++) {
				@Pc(75) int local75 = (local53[local55] - local37[local55]) * local27 >> 12;
				@Pc(95) int local95 = (local43[Static302.anInt6003 & local55 - 1] - local43[Static302.anInt6003 & local55 + 1]) * local27 >> 12;
				@Pc(99) int local99 = local75 >> 4;
				@Pc(103) int local103 = local95 >> 4;
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local103 < 0) {
					local103 = -local103;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				if (local103 > 255) {
					local103 = 255;
				}
				@Pc(148) int local148 = Class138.aByteArray64[local103 + (local99 * (local99 + 1) >> 1)] & 0xFF;
				@Pc(154) int local154 = local148 * local75 >> 8;
				@Pc(160) int local160 = local95 * local148 >> 8;
				@Pc(169) int local169 = local154 * this.anIntArray230[1] >> 12;
				@Pc(175) int local175 = local148 * 4096 >> 8;
				@Pc(184) int local184 = this.anIntArray230[0] * local160 >> 12;
				@Pc(193) int local193 = local175 * this.anIntArray230[2] >> 12;
				local16[local55] = local193 + local169 + local184;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)V")
	@Override
	public void method4720() {
		this.method1725();
	}

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "(B)V")
	private void method1725() {
		@Pc(7) double local7 = Math.cos((double) ((float) this.anInt2333 / 4096.0F));
		this.anIntArray230[0] = (int) (Math.sin((double) ((float) this.anInt2326 / 4096.0F)) * local7 * 4096.0D);
		this.anIntArray230[1] = (int) (local7 * 4096.0D * Math.cos((double) ((float) this.anInt2326 / 4096.0F)));
		this.anIntArray230[2] = (int) (Math.sin((double) ((float) this.anInt2333 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray230[2] * this.anIntArray230[2] >> 12;
		@Pc(81) int local81 = this.anIntArray230[1] * this.anIntArray230[1] >> 12;
		@Pc(93) int local93 = this.anIntArray230[0] * this.anIntArray230[0] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local69 + local93 + local81 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray230[2] = (this.anIntArray230[2] << 12) / local111;
			this.anIntArray230[0] = (this.anIntArray230[0] << 12) / local111;
			this.anIntArray230[1] = (this.anIntArray230[1] << 12) / local111;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2327 = arg0.method2244();
		} else if (arg1 == 1) {
			this.anInt2326 = arg0.method2244();
		} else if (arg1 == 2) {
			this.anInt2333 = arg0.method2244();
		}
	}
}
