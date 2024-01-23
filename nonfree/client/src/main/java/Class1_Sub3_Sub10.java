import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class1_Sub3_Sub10 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fg", name = "J", descriptor = "[I")
	private int[] anIntArray151 = new int[3];

	@OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
	private int anInt1598 = 3216;

	@OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
	private int anInt1595 = 4096;

	@OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
	private int anInt1600 = 3216;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub10() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1595 = arg0.method2691();
		} else if (arg1 == 1) {
			this.anInt1600 = arg0.method2691();
		} else if (arg1 == 2) {
			this.anInt1598 = arg0.method2691();
		}
	}

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
	@Override
	public void method4447() {
		this.method1305();
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(27) int local27 = Static268.anInt5247 * this.anInt1595 >> 12;
			@Pc(37) int[] local37 = this.method4450(0, Static202.anInt4099 & arg0 - 1);
			@Pc(43) int[] local43 = this.method4450(0, arg0);
			@Pc(53) int[] local53 = this.method4450(0, arg0 + 1 & Static202.anInt4099);
			for (@Pc(55) int local55 = 0; local55 < Static227.anInt4511; local55++) {
				@Pc(71) int local71 = (local53[local55] - local37[local55]) * local27 >> 12;
				@Pc(92) int local92 = (local43[Static229.anInt4527 & local55 - 1] - local43[Static229.anInt4527 & local55 + 1]) * local27 >> 12;
				@Pc(96) int local96 = local71 >> 4;
				@Pc(100) int local100 = local92 >> 4;
				if (local100 < 0) {
					local100 = -local100;
				}
				if (local100 > 255) {
					local100 = 255;
				}
				if (local96 < 0) {
					local96 = -local96;
				}
				if (local96 > 255) {
					local96 = 255;
				}
				@Pc(143) int local143 = Class1_Sub3_Sub13.aByteArray33[(local96 * (local96 + 1) >> 1) + local100] & 0xFF;
				@Pc(149) int local149 = local143 * local71 >> 8;
				@Pc(155) int local155 = local92 * local143 >> 8;
				@Pc(164) int local164 = this.anIntArray151[0] * local155 >> 12;
				@Pc(173) int local173 = this.anIntArray151[1] * local149 >> 12;
				@Pc(179) int local179 = local143 * 4096 >> 8;
				@Pc(188) int local188 = local179 * this.anIntArray151[2] >> 12;
				local11[local55] = local164 + local173 + local188;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V")
	private void method1305() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt1598 / 4096.0F));
		this.anIntArray151[0] = (int) (Math.sin((double) ((float) this.anInt1600 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray151[1] = (int) (Math.cos((double) ((float) this.anInt1600 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray151[2] = (int) ((double) 4096 * Math.sin((double) ((float) this.anInt1598 / 4096.0F)));
		@Pc(70) int local70 = this.anIntArray151[1] * this.anIntArray151[1] >> 12;
		@Pc(82) int local82 = this.anIntArray151[2] * this.anIntArray151[2] >> 12;
		@Pc(94) int local94 = this.anIntArray151[0] * this.anIntArray151[0] >> 12;
		@Pc(107) int local107 = (int) (Math.sqrt((double) (local70 + local94 + local82 >> 12)) * 4096.0D);
		if (local107 != 0) {
			this.anIntArray151[0] = (this.anIntArray151[0] << 12) / local107;
			this.anIntArray151[1] = (this.anIntArray151[1] << 12) / local107;
			this.anIntArray151[2] = (this.anIntArray151[2] << 12) / local107;
		}
	}
}
