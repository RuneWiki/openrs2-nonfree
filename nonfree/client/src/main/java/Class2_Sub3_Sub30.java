import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class2_Sub3_Sub30 extends Class2_Sub3 {

	@OriginalMember(owner = "client!se", name = "R", descriptor = "[I")
	public static int[] anIntArray290 = new int[99];

	@OriginalMember(owner = "client!se", name = "T", descriptor = "[I")
	private int[] anIntArray291;

	@OriginalMember(owner = "client!se", name = "S", descriptor = "I")
	private int anInt3245;

	@OriginalMember(owner = "client!se", name = "ab", descriptor = "I")
	private int anInt3251;

	@OriginalMember(owner = "client!se", name = "W", descriptor = "I")
	private int anInt3248;

	static {
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < 99; local20++) {
			@Pc(25) int local25 = local20 + 1;
			@Pc(38) int local38 = (int) (Math.pow(2.0D, (double) local25 / 7.0D) * 300.0D + (double) local25);
			local18 += local38;
			anIntArray290[local20] = local18 / 4;
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(I)V")
	@Override
	public void method3019() {
		this.method2500();
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V")
	private void method2500() {
		@Pc(10) double local10 = Math.cos((double) (this.anInt3245 / 4096));
		this.anIntArray291[0] = (int) (local10 * 4096.0D * Math.sin((double) (this.anInt3248 / 4096)));
		this.anIntArray291[1] = (int) (Math.cos((double) (this.anInt3248 / 4096)) * 4096.0D * local10);
		this.anIntArray291[2] = (int) (Math.sin((double) (this.anInt3245 / 4096)) * 4096.0D);
		@Pc(65) int local65 = this.anIntArray291[2] * this.anIntArray291[2] >> 12;
		@Pc(77) int local77 = this.anIntArray291[0] * this.anIntArray291[0] >> 12;
		@Pc(89) int local89 = this.anIntArray291[1] * this.anIntArray291[1] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local65 + local77 + local89 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray291[1] = (this.anIntArray291[1] << 12) / local106;
			this.anIntArray291[0] = (this.anIntArray291[0] << 12) / local106;
			this.anIntArray291[2] = (this.anIntArray291[2] << 12) / local106;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt3251 = arg1.method2933();
		} else if (arg0 == 1) {
			this.anInt3248 = arg1.method2933();
		} else if (arg0 == 2) {
			this.anInt3245 = arg1.method2933();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(26) int[] local26 = this.method3011(Static134.anInt2915 & arg0 - 1, 0);
			@Pc(32) int[] local32 = this.method3011(arg0, 0);
			@Pc(42) int[] local42 = this.method3011(arg0 + 1 & Static134.anInt2915, 0);
			for (@Pc(44) int local44 = 0; local44 < Static53.anInt1184; local44++) {
				@Pc(66) int local66 = this.anInt3251 * (local32[Static27.anInt588 & local44 + 1] - local32[local44 - 1 & Static27.anInt588]);
				@Pc(78) int local78 = (local42[local44] - local26[local44]) * this.anInt3251;
				@Pc(82) int local82 = local66 >> 12;
				@Pc(86) int local86 = local78 >> 12;
				@Pc(92) int local92 = local82 * local82 >> 12;
				@Pc(98) int local98 = local86 * local86 >> 12;
				@Pc(112) int local112 = (int) (Math.sqrt((double) ((local92 + local98 + 4096) / 4096)) * 4096.0D);
				@Pc(118) int local118;
				@Pc(116) int local116;
				@Pc(120) int local120;
				if (local112 == 0) {
					local116 = 0;
					local118 = 0;
					local120 = 0;
				} else {
					local120 = 16777216 / local112;
					local116 = local78 / local112;
					local118 = local66 / local112;
				}
				local118 = this.anIntArray291[0] * local118 >> 12;
				local120 = this.anIntArray291[2] * local120 >> 12;
				local116 = local116 * this.anIntArray291[1] >> 12;
				local12[local44] = local118 + local116 + local120;
			}
		}
		return local12;
	}
}
