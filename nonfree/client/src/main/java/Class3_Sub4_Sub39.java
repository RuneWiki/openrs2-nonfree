import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class3_Sub4_Sub39 extends Class3_Sub4 {

	@OriginalMember(owner = "client!wg", name = "K", descriptor = "[B")
	private byte[] aByteArray121 = new byte[512];

	@OriginalMember(owner = "client!wg", name = "S", descriptor = "[S")
	private short[] aShortArray119 = new short[512];

	@OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
	private int anInt7525 = 5;

	@OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
	private int anInt7524 = 0;

	@OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
	private int anInt7519 = 1;

	@OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
	private int anInt7522 = 2;

	@OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
	private int anInt7517 = 5;

	@OriginalMember(owner = "client!wg", name = "U", descriptor = "I")
	private int anInt7521 = 2048;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7525 = this.anInt7517 = arg0.method4096();
		} else if (arg1 == 1) {
			this.anInt7524 = arg0.method4096();
		} else if (arg1 == 2) {
			this.anInt7521 = arg0.method4083();
		} else if (arg1 == 3) {
			this.anInt7522 = arg0.method4096();
		} else if (arg1 == 4) {
			this.anInt7519 = arg0.method4096();
		} else if (arg1 == 5) {
			this.anInt7525 = arg0.method4096();
		} else if (arg1 == 6) {
			this.anInt7517 = arg0.method4096();
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(B)V")
	private void method6148() {
		@Pc(12) Random local12 = new Random((long) this.anInt7524);
		this.aShortArray119 = new short[512];
		if (this.anInt7521 > 0) {
			for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
				this.aShortArray119[local24] = (short) Static438.method2068(local12, this.anInt7521);
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			@Pc(30) int local30 = this.anInt7517 * Static317.anIntArray337[arg0] + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static148.anInt2687; local40++) {
				Static323.anInt5412 = Integer.MAX_VALUE;
				Static249.anInt4238 = Integer.MAX_VALUE;
				Static366.anInt6205 = Integer.MAX_VALUE;
				Static68.anInt1282 = Integer.MAX_VALUE;
				@Pc(60) int local60 = Static401.anIntArray419[local40] * this.anInt7525 + 2048;
				@Pc(64) int local64 = local60 >> 12;
				@Pc(68) int local68 = local64 + 1;
				@Pc(149) int local149;
				for (@Pc(72) int local72 = local34 - 1; local72 <= local38; local72++) {
					@Pc(93) int local93 = this.aByteArray121[(local72 < this.anInt7517 ? local72 : local72 - this.anInt7517) & 0xFF] & 0xFF;
					for (@Pc(97) int local97 = local64 - 1; local97 <= local68; local97++) {
						@Pc(122) int local122 = (this.aByteArray121[(this.anInt7525 <= local97 ? local97 - this.anInt7525 : local97) + local93 & 0xFF] & 0xFF) * 2;
						@Pc(126) int local126 = local97 << 12;
						@Pc(130) int local130 = local122 + 1;
						@Pc(134) int local134 = local60 - local126 - this.aShortArray119[local122];
						@Pc(146) int local146 = local30 - this.aShortArray119[local130] - (local72 << 12);
						local149 = this.anInt7519;
						@Pc(183) int local183;
						if (local149 == 1) {
							local183 = local134 * local134 + local146 * local146 >> 12;
						} else if (local149 == 3) {
							local146 = local146 >= 0 ? local146 : -local146;
							local134 = local134 >= 0 ? local134 : -local134;
							local183 = local134 <= local146 ? local146 : local134;
						} else if (local149 == 4) {
							local134 = (int) (Math.sqrt((double) ((float) (local134 >= 0 ? local134 : -local134) / 4096.0F)) * 4096.0D);
							local146 = (int) (Math.sqrt((double) ((float) (local146 < 0 ? -local146 : local146) / 4096.0F)) * 4096.0D);
							local183 = local134 + local146;
							local183 = local183 * local183 >> 12;
						} else if (local149 == 5) {
							local146 *= local146;
							local134 *= local134;
							local183 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local146 + local134) / 1.6777216E7F))) * 4096.0D);
						} else if (local149 == 2) {
							local183 = (local146 < 0 ? -local146 : local146) + (local134 >= 0 ? local134 : -local134);
						} else {
							local183 = (int) (Math.sqrt((double) ((float) (local134 * local134 + local146 * local146) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static68.anInt1282 > local183) {
							Static323.anInt5412 = Static249.anInt4238;
							Static249.anInt4238 = Static366.anInt6205;
							Static366.anInt6205 = Static68.anInt1282;
							Static68.anInt1282 = local183;
						} else if (local183 < Static366.anInt6205) {
							Static323.anInt5412 = Static249.anInt4238;
							Static249.anInt4238 = Static366.anInt6205;
							Static366.anInt6205 = local183;
						} else if (Static249.anInt4238 > local183) {
							Static323.anInt5412 = Static249.anInt4238;
							Static249.anInt4238 = local183;
						} else if (Static323.anInt5412 > local183) {
							Static323.anInt5412 = local183;
						}
					}
				}
				local149 = this.anInt7522;
				if (local149 == 0) {
					local17[local40] = Static68.anInt1282;
				} else if (local149 == 1) {
					local17[local40] = Static366.anInt6205;
				} else if (local149 == 3) {
					local17[local40] = Static249.anInt4238;
				} else if (local149 == 4) {
					local17[local40] = Static323.anInt5412;
				} else if (local149 == 2) {
					local17[local40] = Static366.anInt6205 - Static68.anInt1282;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)V")
	@Override
	public void method6146() {
		this.aByteArray121 = Static82.method1476(this.anInt7524);
		this.method6148();
	}
}
