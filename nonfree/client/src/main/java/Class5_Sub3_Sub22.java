import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class5_Sub3_Sub22 extends Class5_Sub3 {

	@OriginalMember(owner = "client!od", name = "P", descriptor = "I")
	private int anInt7025 = 2;

	@OriginalMember(owner = "client!od", name = "N", descriptor = "I")
	private int anInt7027 = 5;

	@OriginalMember(owner = "client!od", name = "I", descriptor = "[B")
	private byte[] aByteArray78 = new byte[512];

	@OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
	private int anInt7026 = 5;

	@OriginalMember(owner = "client!od", name = "O", descriptor = "I")
	private int anInt7031 = 2048;

	@OriginalMember(owner = "client!od", name = "S", descriptor = "[S")
	private short[] aShortArray110 = new short[512];

	@OriginalMember(owner = "client!od", name = "L", descriptor = "I")
	private int anInt7028 = 1;

	@OriginalMember(owner = "client!od", name = "U", descriptor = "I")
	private int anInt7029 = 0;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	@Override
	public void method9210() {
		this.aByteArray78 = Static319.method4901(this.anInt7029);
		this.method6121();
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
	private void method6121() {
		@Pc(20) Random local20 = new Random((long) this.anInt7029);
		this.aShortArray110 = new short[512];
		if (this.anInt7031 > 0) {
			for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
				this.aShortArray110[local29] = (short) Static131.method1936(local20, this.anInt7031);
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(30) int local30 = this.anInt7027 * Static458.anIntArray438[arg0] + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static7.anInt102; local40++) {
				Static505.anInt8115 = Integer.MAX_VALUE;
				Static540.anInt8605 = Integer.MAX_VALUE;
				Static95.anInt1610 = Integer.MAX_VALUE;
				Static446.anInt7317 = Integer.MAX_VALUE;
				@Pc(59) int local59 = this.anInt7026 * Static382.anIntArray368[local40] + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(158) int local158;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(95) int local95 = this.aByteArray78[(this.anInt7027 <= local71 ? local71 - this.anInt7027 : local71) & 0xFF] & 0xFF;
					for (@Pc(99) int local99 = local63 - 1; local99 <= local67; local99++) {
						@Pc(130) int local130 = (this.aByteArray78[local95 + (this.anInt7026 <= local99 ? local99 - this.anInt7026 : local99) & 0xFF] & 0xFF) * 2;
						@Pc(134) int local134 = -(local99 << 12);
						@Pc(138) int local138 = local130 + 1;
						@Pc(143) int local143 = local134 + local59 - this.aShortArray110[local130];
						@Pc(155) int local155 = local30 - (local71 << 12) - this.aShortArray110[local138];
						local158 = this.anInt7028;
						@Pc(201) int local201;
						if (local158 == 1) {
							local201 = local155 * local155 + local143 * local143 >> 12;
						} else if (local158 == 3) {
							local143 = local143 < 0 ? -local143 : local143;
							local155 = local155 < 0 ? -local155 : local155;
							local201 = local155 < local143 ? local143 : local155;
						} else if (local158 == 4) {
							local143 = (int) (Math.sqrt((double) ((float) (local143 < 0 ? -local143 : local143) / 4096.0F)) * 4096.0D);
							local155 = (int) (Math.sqrt((double) ((float) (local155 >= 0 ? local155 : -local155) / 4096.0F)) * 4096.0D);
							local201 = local143 + local155;
							local201 = local201 * local201 >> 12;
						} else if (local158 == 5) {
							local155 *= local155;
							local143 *= local143;
							local201 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local155 + local143) / 1.6777216E7F))) * 4096.0D);
						} else if (local158 == 2) {
							local201 = (local155 >= 0 ? local155 : -local155) + (local143 >= 0 ? local143 : -local143);
						} else {
							local201 = (int) (Math.sqrt((double) ((float) (local143 * local143 + local155 * local155) / 1.6777216E7F)) * 4096.0D);
						}
						if (local201 < Static446.anInt7317) {
							Static505.anInt8115 = Static540.anInt8605;
							Static540.anInt8605 = Static95.anInt1610;
							Static95.anInt1610 = Static446.anInt7317;
							Static446.anInt7317 = local201;
						} else if (local201 < Static95.anInt1610) {
							Static505.anInt8115 = Static540.anInt8605;
							Static540.anInt8605 = Static95.anInt1610;
							Static95.anInt1610 = local201;
						} else if (local201 < Static540.anInt8605) {
							Static505.anInt8115 = Static540.anInt8605;
							Static540.anInt8605 = local201;
						} else if (local201 < Static505.anInt8115) {
							Static505.anInt8115 = local201;
						}
					}
				}
				local158 = this.anInt7025;
				if (local158 == 0) {
					local17[local40] = Static446.anInt7317;
				} else if (local158 == 1) {
					local17[local40] = Static95.anInt1610;
				} else if (local158 == 3) {
					local17[local40] = Static540.anInt8605;
				} else if (local158 == 4) {
					local17[local40] = Static505.anInt8115;
				} else if (local158 == 2) {
					local17[local40] = Static95.anInt1610 - Static446.anInt7317;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7026 = this.anInt7027 = arg0.method7291();
		} else if (arg1 == 1) {
			this.anInt7029 = arg0.method7291();
		} else if (arg1 == 2) {
			this.anInt7031 = arg0.method7333();
		} else if (arg1 == 3) {
			this.anInt7025 = arg0.method7291();
		} else if (arg1 == 4) {
			this.anInt7028 = arg0.method7291();
		} else if (arg1 == 5) {
			this.anInt7026 = arg0.method7291();
		} else if (arg1 == 6) {
			this.anInt7027 = arg0.method7291();
		}
	}
}
