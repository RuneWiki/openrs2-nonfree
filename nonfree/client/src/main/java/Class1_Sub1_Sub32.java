import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class1_Sub1_Sub32 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
	private int anInt5607 = 3216;

	@OriginalMember(owner = "client!sg", name = "S", descriptor = "[I")
	private final int[] anIntArray426 = new int[3];

	@OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
	private int anInt5612 = 4096;

	@OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
	private int anInt5610 = 3216;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)V")
	private void method5102() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt5607 / 4096.0F));
		this.anIntArray426[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt5610 / 4096.0F)));
		this.anIntArray426[1] = (int) (local11 * Math.cos((double) ((float) this.anInt5610 / 4096.0F)) * 4096.0D);
		this.anIntArray426[2] = (int) (Math.sin((double) ((float) this.anInt5607 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray426[0] * this.anIntArray426[0] >> 12;
		@Pc(81) int local81 = this.anIntArray426[1] * this.anIntArray426[1] >> 12;
		@Pc(98) int local98 = this.anIntArray426[2] * this.anIntArray426[2] >> 12;
		@Pc(112) int local112 = (int) (Math.sqrt((double) (local81 + local69 + local98 >> 12)) * 4096.0D);
		if (local112 != 0) {
			this.anIntArray426[1] = (this.anIntArray426[1] << 12) / local112;
			this.anIntArray426[0] = (this.anIntArray426[0] << 12) / local112;
			this.anIntArray426[2] = (this.anIntArray426[2] << 12) / local112;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5612 = arg1.method2161();
		} else if (arg0 == 1) {
			this.anInt5610 = arg1.method2161();
		} else if (arg0 == 2) {
			this.anInt5607 = arg1.method2161();
		}
	}

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "(I)V")
	@Override
	public void method6008() {
		this.method5102();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(27) int local27 = this.anInt5612 * Static253.anInt5162 >> 12;
			@Pc(39) int[] local39 = this.method6013(Static279.anInt5435 & arg0 - 1, 0);
			@Pc(45) int[] local45 = this.method6013(arg0, 0);
			@Pc(55) int[] local55 = this.method6013(Static279.anInt5435 & arg0 + 1, 0);
			for (@Pc(57) int local57 = 0; local57 < Static85.anInt1910; local57++) {
				@Pc(72) int local72 = (local55[local57] - local39[local57]) * local27 >> 12;
				@Pc(92) int local92 = local27 * (local45[local57 - 1 & Static346.anInt6542] - local45[Static346.anInt6542 & local57 + 1]) >> 12;
				@Pc(96) int local96 = local92 >> 4;
				@Pc(100) int local100 = local72 >> 4;
				if (local96 < 0) {
					local96 = -local96;
				}
				if (local100 < 0) {
					local100 = -local100;
				}
				if (local96 > 255) {
					local96 = 255;
				}
				if (local100 > 255) {
					local100 = 255;
				}
				@Pc(137) int local137 = Class1_Sub6_Sub1.aByteArray42[local96 + (local100 * (local100 + 1) >> 1)] & 0xFF;
				@Pc(143) int local143 = local137 * 4096 >> 8;
				@Pc(149) int local149 = local92 * local137 >> 8;
				@Pc(155) int local155 = local137 * local72 >> 8;
				@Pc(164) int local164 = this.anIntArray426[2] * local143 >> 12;
				@Pc(173) int local173 = this.anIntArray426[1] * local155 >> 12;
				@Pc(182) int local182 = this.anIntArray426[0] * local149 >> 12;
				local16[local57] = local164 + local182 + local173;
			}
		}
		return local16;
	}
}
