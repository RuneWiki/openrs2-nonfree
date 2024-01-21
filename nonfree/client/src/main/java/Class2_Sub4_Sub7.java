import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class2_Sub4_Sub7 extends Class2_Sub4 {

	@OriginalMember(owner = "client!fj", name = "ab", descriptor = "I")
	private int anInt1263 = 4096;

	@OriginalMember(owner = "client!fj", name = "gb", descriptor = "[I")
	private final int[] anIntArray100 = new int[3];

	@OriginalMember(owner = "client!fj", name = "Y", descriptor = "I")
	private int anInt1262 = 3216;

	@OriginalMember(owner = "client!fj", name = "ib", descriptor = "I")
	private int anInt1267 = 3216;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub7() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1263 = arg1.method1557();
		} else if (arg0 == 1) {
			this.anInt1262 = arg1.method1557();
		} else if (arg0 == 2) {
			this.anInt1267 = arg1.method1557();
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(22) int local22 = Static204.anInt4232 * this.anInt1263 >> 12;
			@Pc(34) int[] local34 = this.method3129(0, arg0 - 1 & Static167.anInt3559);
			@Pc(40) int[] local40 = this.method3129(0, arg0);
			@Pc(50) int[] local50 = this.method3129(0, arg0 + 1 & Static167.anInt3559);
			for (@Pc(52) int local52 = 0; local52 < Static118.anInt2608; local52++) {
				@Pc(67) int local67 = (local50[local52] - local34[local52]) * local22 >> 12;
				@Pc(88) int local88 = local22 * (local40[Static82.anInt1734 & local52 - 1] - local40[local52 + 1 & Static82.anInt1734]) >> 12;
				@Pc(92) int local92 = local88 >> 4;
				if (local92 < 0) {
					local92 = -local92;
				}
				if (local92 > 255) {
					local92 = 255;
				}
				@Pc(109) int local109 = local67 >> 4;
				if (local109 < 0) {
					local109 = -local109;
				}
				if (local109 > 255) {
					local109 = 255;
				}
				@Pc(138) int local138 = Class2_Sub4_Sub17.aByteArray27[local92 + (local109 * (local109 + 1) >> 1)] & 0xFF;
				@Pc(144) int local144 = local138 * 4096 >> 8;
				@Pc(150) int local150 = local88 * local138 >> 8;
				@Pc(159) int local159 = this.anIntArray100[0] * local150 >> 12;
				@Pc(165) int local165 = local67 * local138 >> 8;
				@Pc(174) int local174 = local165 * this.anIntArray100[1] >> 12;
				@Pc(183) int local183 = this.anIntArray100[2] * local144 >> 12;
				local11[local52] = local183 + local159 + local174;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "(I)V")
	private void method841() {
		@Pc(7) double local7 = Math.cos((double) ((float) this.anInt1267 / 4096.0F));
		this.anIntArray100[0] = (int) (local7 * 4096.0D * Math.sin((double) ((float) this.anInt1262 / 4096.0F)));
		this.anIntArray100[1] = (int) (local7 * 4096.0D * Math.cos((double) ((float) this.anInt1262 / 4096.0F)));
		this.anIntArray100[2] = (int) (Math.sin((double) ((float) this.anInt1267 / 4096.0F)) * 4096.0D);
		@Pc(73) int local73 = this.anIntArray100[1] * this.anIntArray100[1] >> 12;
		@Pc(85) int local85 = this.anIntArray100[0] * this.anIntArray100[0] >> 12;
		@Pc(97) int local97 = this.anIntArray100[2] * this.anIntArray100[2] >> 12;
		@Pc(110) int local110 = (int) (Math.sqrt((double) (local73 + local85 + local97 >> 12)) * 4096.0D);
		if (local110 != 0) {
			this.anIntArray100[1] = (this.anIntArray100[1] << 12) / local110;
			this.anIntArray100[0] = (this.anIntArray100[0] << 12) / local110;
			this.anIntArray100[2] = (this.anIntArray100[2] << 12) / local110;
		}
	}

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)V")
	@Override
	public void method3133() {
		this.method841();
	}
}
