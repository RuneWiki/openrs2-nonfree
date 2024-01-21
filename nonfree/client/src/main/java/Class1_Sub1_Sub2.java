import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!af", name = "hb", descriptor = "I")
	private int anInt139 = 4096;

	@OriginalMember(owner = "client!af", name = "kb", descriptor = "I")
	private int anInt140 = 3216;

	@OriginalMember(owner = "client!af", name = "fb", descriptor = "I")
	private int anInt137 = 3216;

	@OriginalMember(owner = "client!af", name = "jb", descriptor = "[I")
	private final int[] anIntArray16 = new int[3];

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub2() {
		super(1, true);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(26) int local26 = this.anInt139 * Static89.anInt1921 >> 12;
			@Pc(36) int[] local36 = this.method3393(Static15.anInt388 & arg0 - 1, 0);
			@Pc(42) int[] local42 = this.method3393(arg0, 0);
			@Pc(52) int[] local52 = this.method3393(Static15.anInt388 & arg0 + 1, 0);
			for (@Pc(54) int local54 = 0; local54 < Static107.anInt2321; local54++) {
				@Pc(69) int local69 = local26 * (local52[local54] - local36[local54]) >> 12;
				@Pc(90) int local90 = local26 * (local42[Static144.anInt2893 & local54 - 1] - local42[local54 + 1 & Static144.anInt2893]) >> 12;
				@Pc(94) int local94 = local90 >> 4;
				if (local94 < 0) {
					local94 = -local94;
				}
				@Pc(103) int local103 = local69 >> 4;
				if (local103 < 0) {
					local103 = -local103;
				}
				if (local94 > 255) {
					local94 = 255;
				}
				if (local103 > 255) {
					local103 = 255;
				}
				@Pc(136) int local136 = Class1_Sub23.aByteArray44[(local103 * (local103 + 1) >> 1) + local94] & 0xFF;
				@Pc(142) int local142 = local136 * 4096 >> 8;
				@Pc(148) int local148 = local136 * local90 >> 8;
				@Pc(157) int local157 = local148 * this.anIntArray16[0] >> 12;
				@Pc(163) int local163 = local136 * local69 >> 8;
				@Pc(172) int local172 = local142 * this.anIntArray16[2] >> 12;
				@Pc(181) int local181 = local163 * this.anIntArray16[1] >> 12;
				local15[local54] = local181 + local157 + local172;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V")
	private void method123() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt137 / 4096.0F));
		this.anIntArray16[0] = (int) (local11 * Math.sin((double) ((float) this.anInt140 / 4096.0F)) * 4096.0D);
		this.anIntArray16[1] = (int) (Math.cos((double) ((float) this.anInt140 / 4096.0F)) * 4096.0D * local11);
		this.anIntArray16[2] = (int) (Math.sin((double) ((float) this.anInt137 / 4096.0F)) * 4096.0D);
		@Pc(74) int local74 = this.anIntArray16[0] * this.anIntArray16[0] >> 12;
		@Pc(86) int local86 = this.anIntArray16[1] * this.anIntArray16[1] >> 12;
		@Pc(98) int local98 = this.anIntArray16[2] * this.anIntArray16[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local86 + local74 + local98 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray16[0] = (this.anIntArray16[0] << 12) / local112;
			this.anIntArray16[2] = (this.anIntArray16[2] << 12) / local112;
			this.anIntArray16[1] = (this.anIntArray16[1] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt139 = arg0.method3023();
		} else if (arg1 == 1) {
			this.anInt140 = arg0.method3023();
		} else if (arg1 == 2) {
			this.anInt137 = arg0.method3023();
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
	@Override
	public void method3388() {
		this.method123();
	}
}
