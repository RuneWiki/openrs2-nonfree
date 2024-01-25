import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class3_Sub3_Sub24 extends Class3_Sub3 {

	@OriginalMember(owner = "client!mo", name = "N", descriptor = "I")
	private int anInt4136 = 2;

	@OriginalMember(owner = "client!mo", name = "O", descriptor = "I")
	private int anInt4137 = 0;

	@OriginalMember(owner = "client!mo", name = "S", descriptor = "I")
	private int anInt4141 = 1;

	@OriginalMember(owner = "client!mo", name = "R", descriptor = "I")
	private int anInt4140 = 5;

	@OriginalMember(owner = "client!mo", name = "J", descriptor = "I")
	private int anInt4134 = 5;

	@OriginalMember(owner = "client!mo", name = "U", descriptor = "I")
	private int anInt4143 = 2048;

	@OriginalMember(owner = "client!mo", name = "V", descriptor = "[B")
	private byte[] aByteArray69 = new byte[512];

	@OriginalMember(owner = "client!mo", name = "W", descriptor = "[S")
	private short[] aShortArray84 = new short[512];

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)V")
	@Override
	public void method5730() {
		this.aByteArray69 = Static286.method4929(this.anInt4137);
		this.method3517();
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(30) int local30 = Static269.anIntArray433[arg0] * this.anInt4134 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static131.anInt2755; local40++) {
				Static348.anInt6766 = Integer.MAX_VALUE;
				Static352.anInt6825 = Integer.MAX_VALUE;
				Static255.anInt6075 = Integer.MAX_VALUE;
				Static148.anInt2914 = Integer.MAX_VALUE;
				@Pc(59) int local59 = Static151.anIntArray211[local40] * this.anInt4140 + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(149) int local149;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(92) int local92 = this.aByteArray69[(local71 >= this.anInt4134 ? local71 - this.anInt4134 : local71) & 0xFF] & 0xFF;
					for (@Pc(96) int local96 = local63 - 1; local96 <= local67; local96++) {
						@Pc(121) int local121 = (this.aByteArray69[(local96 < this.anInt4140 ? local96 : local96 - this.anInt4140) + local92 & 0xFF] & 0xFF) * 2;
						@Pc(126) int local126 = local121 + 1;
						@Pc(133) int local133 = local59 - this.aShortArray84[local121] - (local96 << 12);
						@Pc(146) int local146 = local30 - this.aShortArray84[local126] - (local71 << 12);
						local149 = this.anInt4141;
						@Pc(183) int local183;
						if (local149 == 1) {
							local183 = local133 * local133 + local146 * local146 >> 12;
						} else if (local149 == 3) {
							local133 = local133 >= 0 ? local133 : -local133;
							local146 = local146 < 0 ? -local146 : local146;
							local183 = local133 > local146 ? local133 : local146;
						} else if (local149 == 4) {
							local133 = (int) (Math.sqrt((double) ((float) (local133 >= 0 ? local133 : -local133) / 4096.0F)) * 4096.0D);
							local146 = (int) (Math.sqrt((double) ((float) (local146 >= 0 ? local146 : -local146) / 4096.0F)) * 4096.0D);
							local183 = local146 + local133;
							local183 = local183 * local183 >> 12;
						} else if (local149 == 5) {
							local133 *= local133;
							local146 *= local146;
							local183 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local133 + local146) / 1.6777216E7F))) * 4096.0D);
						} else if (local149 == 2) {
							local183 = (local133 >= 0 ? local133 : -local133) + (local146 >= 0 ? local146 : -local146);
						} else {
							local183 = (int) (Math.sqrt((double) ((float) (local133 * local133 + local146 * local146) / 1.6777216E7F)) * 4096.0D);
						}
						if (local183 < Static148.anInt2914) {
							Static348.anInt6766 = Static352.anInt6825;
							Static352.anInt6825 = Static255.anInt6075;
							Static255.anInt6075 = Static148.anInt2914;
							Static148.anInt2914 = local183;
						} else if (Static255.anInt6075 > local183) {
							Static348.anInt6766 = Static352.anInt6825;
							Static352.anInt6825 = Static255.anInt6075;
							Static255.anInt6075 = local183;
						} else if (local183 < Static352.anInt6825) {
							Static348.anInt6766 = Static352.anInt6825;
							Static352.anInt6825 = local183;
						} else if (local183 < Static348.anInt6766) {
							Static348.anInt6766 = local183;
						}
					}
				}
				local149 = this.anInt4136;
				if (local149 == 0) {
					local17[local40] = Static148.anInt2914;
				} else if (local149 == 1) {
					local17[local40] = Static255.anInt6075;
				} else if (local149 == 3) {
					local17[local40] = Static352.anInt6825;
				} else if (local149 == 4) {
					local17[local40] = Static348.anInt6766;
				} else if (local149 == 2) {
					local17[local40] = Static255.anInt6075 - Static148.anInt2914;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(B)V")
	private void method3517() {
		@Pc(16) Random local16 = new Random((long) this.anInt4137);
		this.aShortArray84 = new short[512];
		if (this.anInt4143 > 0) {
			for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
				this.aShortArray84[local28] = (short) Static54.method915(this.anInt4143, local16);
			}
		}
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4140 = this.anInt4134 = arg0.method3643();
		} else if (arg1 == 1) {
			this.anInt4137 = arg0.method3643();
		} else if (arg1 == 2) {
			this.anInt4143 = arg0.method3649();
		} else if (arg1 == 3) {
			this.anInt4136 = arg0.method3643();
		} else if (arg1 == 4) {
			this.anInt4141 = arg0.method3643();
		} else if (arg1 == 5) {
			this.anInt4140 = arg0.method3643();
		} else if (arg1 == 6) {
			this.anInt4134 = arg0.method3643();
		}
	}
}
