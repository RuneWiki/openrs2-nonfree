import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class1_Sub2_Sub34 extends Class1_Sub2 {

	@OriginalMember(owner = "client!uc", name = "U", descriptor = "I")
	private int anInt4235 = 2048;

	@OriginalMember(owner = "client!uc", name = "W", descriptor = "I")
	private int anInt4237 = 5;

	@OriginalMember(owner = "client!uc", name = "V", descriptor = "I")
	private int anInt4236 = 0;

	@OriginalMember(owner = "client!uc", name = "db", descriptor = "I")
	private int anInt4238 = 2;

	@OriginalMember(owner = "client!uc", name = "Y", descriptor = "[B")
	private byte[] aByteArray59 = new byte[512];

	@OriginalMember(owner = "client!uc", name = "Z", descriptor = "[S")
	private short[] aShortArray58 = new short[512];

	@OriginalMember(owner = "client!uc", name = "jb", descriptor = "I")
	private int anInt4243 = 5;

	@OriginalMember(owner = "client!uc", name = "ib", descriptor = "I")
	private int anInt4242 = 1;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
	@Override
	public void method3503() {
		this.aByteArray59 = Static115.method1970(this.anInt4236);
		this.method3099();
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V")
	private void method3099() {
		@Pc(12) Random local12 = new Random((long) this.anInt4236);
		this.aShortArray58 = new short[512];
		if (this.anInt4235 > 0) {
			for (@Pc(30) int local30 = 0; local30 < 512; local30++) {
				this.aShortArray58[local30] = (short) Static199.method3113(this.anInt4235, local12);
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(30) int local30 = Static128.anIntArray362[arg0] * this.anInt4237 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static105.anInt2391; local40++) {
				Static74.anInt1823 = Integer.MAX_VALUE;
				Static18.anInt460 = Integer.MAX_VALUE;
				Static218.anInt4722 = Integer.MAX_VALUE;
				Static97.anInt2259 = Integer.MAX_VALUE;
				@Pc(59) int local59 = Static63.anIntArray182[local40] * this.anInt4243 + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(149) int local149;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(91) int local91 = this.aByteArray59[(this.anInt4237 <= local71 ? local71 - this.anInt4237 : local71) & 0xFF] & 0xFF;
					for (@Pc(95) int local95 = local63 - 1; local95 <= local67; local95++) {
						@Pc(120) int local120 = (this.aByteArray59[local91 + (this.anInt4243 > local95 ? local95 : local95 - this.anInt4243) & 0xFF] & 0xFF) * 2;
						@Pc(125) int local125 = local120 + 1;
						@Pc(134) int local134 = local59 - this.aShortArray58[local120] - (local95 << 12);
						@Pc(146) int local146 = local30 - (local71 << 12) - this.aShortArray58[local125];
						local149 = this.anInt4242;
						@Pc(180) int local180;
						if (local149 == 1) {
							local180 = local146 * local146 + local134 * local134 >> 12;
						} else if (local149 == 3) {
							local134 = local134 >= 0 ? local134 : -local134;
							local146 = local146 >= 0 ? local146 : -local146;
							local180 = local146 < local134 ? local134 : local146;
						} else if (local149 == 4) {
							local134 = (int) (Math.sqrt((double) ((float) (local134 >= 0 ? local134 : -local134) / 4096.0F)) * 4096.0D);
							local146 = (int) (Math.sqrt((double) ((float) (local146 < 0 ? -local146 : local146) / 4096.0F)) * 4096.0D);
							local180 = local134 + local146;
							local180 = local180 * local180 >> 12;
						} else if (local149 == 5) {
							local146 *= local146;
							local134 *= local134;
							local180 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local134 + local146) / 1.6777216E7F))) * 4096.0D);
						} else if (local149 == 2) {
							local180 = (local146 >= 0 ? local146 : -local146) + (local134 < 0 ? -local134 : local134);
						} else {
							local180 = (int) (Math.sqrt((double) ((float) (local134 * local134 + local146 * local146) / 1.6777216E7F)) * 4096.0D);
						}
						if (local180 < Static97.anInt2259) {
							Static74.anInt1823 = Static18.anInt460;
							Static18.anInt460 = Static218.anInt4722;
							Static218.anInt4722 = Static97.anInt2259;
							Static97.anInt2259 = local180;
						} else if (Static218.anInt4722 > local180) {
							Static74.anInt1823 = Static18.anInt460;
							Static18.anInt460 = Static218.anInt4722;
							Static218.anInt4722 = local180;
						} else if (Static18.anInt460 > local180) {
							Static74.anInt1823 = Static18.anInt460;
							Static18.anInt460 = local180;
						} else if (local180 < Static74.anInt1823) {
							Static74.anInt1823 = local180;
						}
					}
				}
				local149 = this.anInt4238;
				if (local149 == 0) {
					local7[local40] = Static97.anInt2259;
				} else if (local149 == 1) {
					local7[local40] = Static218.anInt4722;
				} else if (local149 == 3) {
					local7[local40] = Static18.anInt460;
				} else if (local149 == 4) {
					local7[local40] = Static74.anInt1823;
				} else if (local149 == 2) {
					local7[local40] = Static218.anInt4722 - Static97.anInt2259;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4243 = this.anInt4237 = arg0.method895();
		} else if (arg1 == 1) {
			this.anInt4236 = arg0.method895();
		} else if (arg1 == 2) {
			this.anInt4235 = arg0.method946();
		} else if (arg1 == 3) {
			this.anInt4238 = arg0.method895();
		} else if (arg1 == 4) {
			this.anInt4242 = arg0.method895();
		} else if (arg1 == 5) {
			this.anInt4243 = arg0.method895();
		} else if (arg1 == 6) {
			this.anInt4237 = arg0.method895();
		}
	}
}
