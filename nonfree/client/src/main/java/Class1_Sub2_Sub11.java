import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!h", name = "X", descriptor = "[I")
	private int[] anIntArray202 = new int[3];

	@OriginalMember(owner = "client!h", name = "W", descriptor = "I")
	private int anInt1740 = 3216;

	@OriginalMember(owner = "client!h", name = "fb", descriptor = "I")
	private int anInt1748 = 4096;

	@OriginalMember(owner = "client!h", name = "gb", descriptor = "I")
	private int anInt1749 = 3216;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub11() {
		super(1, true);
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(B)V")
	private void method1279() {
		@Pc(7) double local7 = Math.cos((double) ((float) this.anInt1740 / 4096.0F));
		this.anIntArray202[0] = (int) (Math.sin((double) ((float) this.anInt1749 / 4096.0F)) * 4096.0D * local7);
		this.anIntArray202[1] = (int) (local7 * Math.cos((double) ((float) this.anInt1749 / 4096.0F)) * 4096.0D);
		this.anIntArray202[2] = (int) (Math.sin((double) ((float) this.anInt1740 / 4096.0F)) * 4096.0D);
		@Pc(79) int local79 = this.anIntArray202[2] * this.anIntArray202[2] >> 12;
		@Pc(91) int local91 = this.anIntArray202[0] * this.anIntArray202[0] >> 12;
		@Pc(103) int local103 = this.anIntArray202[1] * this.anIntArray202[1] >> 12;
		@Pc(116) int local116 = (int) (Math.sqrt((double) (local79 + local91 + local103 >> 12)) * 4096.0D);
		if (local116 != 0) {
			this.anIntArray202[0] = (this.anIntArray202[0] << 12) / local116;
			this.anIntArray202[2] = (this.anIntArray202[2] << 12) / local116;
			this.anIntArray202[1] = (this.anIntArray202[1] << 12) / local116;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1748 = arg0.method946();
		} else if (arg1 == 1) {
			this.anInt1749 = arg0.method946();
		} else if (arg1 == 2) {
			this.anInt1740 = arg0.method946();
		}
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
	@Override
	public void method3503() {
		this.method1279();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(27) int local27 = Static2.anInt51 * this.anInt1748 >> 12;
			@Pc(39) int[] local39 = this.method3514(Static92.anInt2170 & arg0 - 1, 0);
			@Pc(45) int[] local45 = this.method3514(arg0, 0);
			@Pc(55) int[] local55 = this.method3514(arg0 + 1 & Static92.anInt2170, 0);
			for (@Pc(57) int local57 = 0; local57 < Static105.anInt2391; local57++) {
				@Pc(72) int local72 = local27 * (local55[local57] - local39[local57]) >> 12;
				@Pc(76) int local76 = local72 >> 4;
				if (local76 < 0) {
					local76 = -local76;
				}
				@Pc(104) int local104 = local27 * (local45[Static32.anInt814 & local57 - 1] - local45[Static32.anInt814 & local57 + 1]) >> 12;
				if (local76 > 255) {
					local76 = 255;
				}
				@Pc(115) int local115 = local104 >> 4;
				if (local115 < 0) {
					local115 = -local115;
				}
				if (local115 > 255) {
					local115 = 255;
				}
				@Pc(141) int local141 = Class1_Sub2_Sub28.aByteArray43[(local76 * (local76 + 1) >> 1) + local115] & 0xFF;
				@Pc(147) int local147 = local72 * local141 >> 8;
				@Pc(156) int local156 = this.anIntArray202[1] * local147 >> 12;
				@Pc(162) int local162 = local141 * local104 >> 8;
				@Pc(171) int local171 = this.anIntArray202[0] * local162 >> 12;
				@Pc(177) int local177 = local141 * 4096 >> 8;
				@Pc(186) int local186 = this.anIntArray202[2] * local177 >> 12;
				local16[local57] = local186 + local171 + local156;
			}
		}
		return local16;
	}
}
