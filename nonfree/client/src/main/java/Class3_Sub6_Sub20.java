import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class3_Sub6_Sub20 extends Class3_Sub6 {

	@OriginalMember(owner = "client!lb", name = "O", descriptor = "I")
	private int anInt5594 = 2;

	@OriginalMember(owner = "client!lb", name = "M", descriptor = "I")
	private int anInt5592 = 0;

	@OriginalMember(owner = "client!lb", name = "P", descriptor = "I")
	private int anInt5595 = 2048;

	@OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
	private int anInt5600 = 5;

	@OriginalMember(owner = "client!lb", name = "X", descriptor = "I")
	private int anInt5602 = 1;

	@OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
	private int anInt5598 = 5;

	@OriginalMember(owner = "client!lb", name = "W", descriptor = "[B")
	private byte[] aByteArray141 = new byte[512];

	@OriginalMember(owner = "client!lb", name = "Y", descriptor = "[S")
	private short[] aShortArray74 = new short[512];

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5598 = this.anInt5600 = arg0.method6814();
		} else if (arg1 == 1) {
			this.anInt5592 = arg0.method6814();
		} else if (arg1 == 2) {
			this.anInt5595 = arg0.method6811();
		} else if (arg1 == 3) {
			this.anInt5594 = arg0.method6814();
		} else if (arg1 == 4) {
			this.anInt5602 = arg0.method6814();
		} else if (arg1 == 5) {
			this.anInt5598 = arg0.method6814();
		} else if (arg1 == 6) {
			this.anInt5600 = arg0.method6814();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(30) int local30 = Static231.anIntArray217[arg0] * this.anInt5600 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static481.anInt8358; local40++) {
				Static586.anInt10143 = Integer.MAX_VALUE;
				Static147.anInt3428 = Integer.MAX_VALUE;
				Static246.anInt4862 = Integer.MAX_VALUE;
				Static397.anInt6999 = Integer.MAX_VALUE;
				@Pc(59) int local59 = Static595.anIntArray600[local40] * this.anInt5598 + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(149) int local149;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(91) int local91 = this.aByteArray141[(this.anInt5600 > local71 ? local71 : local71 - this.anInt5600) & 0xFF] & 0xFF;
					for (@Pc(95) int local95 = local63 - 1; local95 <= local67; local95++) {
						@Pc(120) int local120 = (this.aByteArray141[local91 + (local95 >= this.anInt5598 ? local95 - this.anInt5598 : local95) & 0xFF] & 0xFF) * 2;
						@Pc(126) int local126 = local59 - (local95 << 12);
						@Pc(130) int local130 = local120 + 1;
						@Pc(134) int local134 = local126 - this.aShortArray74[local120];
						@Pc(146) int local146 = local30 - this.aShortArray74[local130] - (local71 << 12);
						local149 = this.anInt5602;
						@Pc(182) int local182;
						if (local149 == 1) {
							local182 = local146 * local146 + local134 * local134 >> 12;
						} else if (local149 == 3) {
							local134 = local134 >= 0 ? local134 : -local134;
							local146 = local146 >= 0 ? local146 : -local146;
							local182 = local134 <= local146 ? local146 : local134;
						} else if (local149 == 4) {
							local134 = (int) (Math.sqrt((double) ((float) (local134 >= 0 ? local134 : -local134) / 4096.0F)) * 4096.0D);
							local146 = (int) (Math.sqrt((double) ((float) (local146 < 0 ? -local146 : local146) / 4096.0F)) * 4096.0D);
							local182 = local134 + local146;
							local182 = local182 * local182 >> 12;
						} else if (local149 == 5) {
							local134 *= local134;
							local146 *= local146;
							local182 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local146 + local134) / 1.6777216E7F))) * 4096.0D);
						} else if (local149 == 2) {
							local182 = (local146 >= 0 ? local146 : -local146) + (local134 >= 0 ? local134 : -local134);
						} else {
							local182 = (int) (Math.sqrt((double) ((float) (local134 * local134 + local146 * local146) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static397.anInt6999 > local182) {
							Static586.anInt10143 = Static147.anInt3428;
							Static147.anInt3428 = Static246.anInt4862;
							Static246.anInt4862 = Static397.anInt6999;
							Static397.anInt6999 = local182;
						} else if (Static246.anInt4862 > local182) {
							Static586.anInt10143 = Static147.anInt3428;
							Static147.anInt3428 = Static246.anInt4862;
							Static246.anInt4862 = local182;
						} else if (local182 < Static147.anInt3428) {
							Static586.anInt10143 = Static147.anInt3428;
							Static147.anInt3428 = local182;
						} else if (local182 < Static586.anInt10143) {
							Static586.anInt10143 = local182;
						}
					}
				}
				local149 = this.anInt5594;
				if (local149 == 0) {
					local11[local40] = Static397.anInt6999;
				} else if (local149 == 1) {
					local11[local40] = Static246.anInt4862;
				} else if (local149 == 3) {
					local11[local40] = Static147.anInt3428;
				} else if (local149 == 4) {
					local11[local40] = Static586.anInt10143;
				} else if (local149 == 2) {
					local11[local40] = Static246.anInt4862 - Static397.anInt6999;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
	private void method4550() {
		@Pc(12) Random local12 = new Random((long) this.anInt5592);
		this.aShortArray74 = new short[512];
		if (this.anInt5595 > 0) {
			for (@Pc(32) int local32 = 0; local32 < 512; local32++) {
				this.aShortArray74[local32] = (short) Static120.method2330(local12, this.anInt5595);
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	@Override
	public void method8012() {
		this.aByteArray141 = Static365.method5190(this.anInt5592);
		this.method4550();
	}
}
