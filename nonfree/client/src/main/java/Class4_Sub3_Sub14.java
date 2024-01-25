import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class4_Sub3_Sub14 extends Class4_Sub3 {

	@OriginalMember(owner = "client!gq", name = "G", descriptor = "I")
	private int anInt2789 = 5;

	@OriginalMember(owner = "client!gq", name = "L", descriptor = "I")
	private int anInt2794 = 1;

	@OriginalMember(owner = "client!gq", name = "M", descriptor = "[B")
	private byte[] aByteArray30 = new byte[512];

	@OriginalMember(owner = "client!gq", name = "K", descriptor = "I")
	private int anInt2793 = 0;

	@OriginalMember(owner = "client!gq", name = "H", descriptor = "I")
	private int anInt2790 = 5;

	@OriginalMember(owner = "client!gq", name = "N", descriptor = "I")
	private int anInt2795 = 2;

	@OriginalMember(owner = "client!gq", name = "P", descriptor = "[S")
	private short[] aShortArray33 = new short[512];

	@OriginalMember(owner = "client!gq", name = "Q", descriptor = "I")
	private int anInt2797 = 2048;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "(B)V")
	@Override
	public void method6341() {
		this.aByteArray30 = Static74.method1630(this.anInt2793);
		this.method2510();
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6339(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass157_41.method4027(arg0);
		if (super.aClass157_41.aBoolean315) {
			@Pc(30) int local30 = this.anInt2790 * Static376.anIntArray531[arg0] + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static304.anInt5637; local40++) {
				Static396.anInt7017 = Integer.MAX_VALUE;
				Static121.anInt7696 = Integer.MAX_VALUE;
				Static190.anInt3814 = Integer.MAX_VALUE;
				Static142.anInt2920 = Integer.MAX_VALUE;
				@Pc(60) int local60 = Static231.anIntArray368[local40] * this.anInt2789 + 2048;
				@Pc(64) int local64 = local60 >> 12;
				@Pc(68) int local68 = local64 + 1;
				@Pc(151) int local151;
				for (@Pc(72) int local72 = local34 - 1; local72 <= local38; local72++) {
					@Pc(93) int local93 = this.aByteArray30[(local72 < this.anInt2790 ? local72 : local72 - this.anInt2790) & 0xFF] & 0xFF;
					for (@Pc(97) int local97 = local64 - 1; local97 <= local68; local97++) {
						@Pc(122) int local122 = (this.aByteArray30[(this.anInt2789 <= local97 ? local97 - this.anInt2789 : local97) + local93 & 0xFF] & 0xFF) * 2;
						@Pc(126) int local126 = -(local97 << 12);
						@Pc(130) int local130 = local122 + 1;
						@Pc(135) int local135 = local126 + local60 - this.aShortArray33[local122];
						@Pc(148) int local148 = local30 - this.aShortArray33[local130] - (local72 << 12);
						local151 = this.anInt2794;
						@Pc(184) int local184;
						if (local151 == 1) {
							local184 = local135 * local135 + local148 * local148 >> 12;
						} else if (local151 == 3) {
							local148 = local148 < 0 ? -local148 : local148;
							local135 = local135 >= 0 ? local135 : -local135;
							local184 = local135 <= local148 ? local148 : local135;
						} else if (local151 == 4) {
							local135 = (int) (Math.sqrt((double) ((float) (local135 < 0 ? -local135 : local135) / 4096.0F)) * 4096.0D);
							local148 = (int) (Math.sqrt((double) ((float) (local148 >= 0 ? local148 : -local148) / 4096.0F)) * 4096.0D);
							local184 = local135 + local148;
							local184 = local184 * local184 >> 12;
						} else if (local151 == 5) {
							local135 *= local135;
							local148 *= local148;
							local184 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local135 + local148) / 1.6777216E7F))) * 4096.0D);
						} else if (local151 == 2) {
							local184 = (local135 >= 0 ? local135 : -local135) + (local148 < 0 ? -local148 : local148);
						} else {
							local184 = (int) (Math.sqrt((double) ((float) (local135 * local135 + local148 * local148) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static142.anInt2920 > local184) {
							Static396.anInt7017 = Static121.anInt7696;
							Static121.anInt7696 = Static190.anInt3814;
							Static190.anInt3814 = Static142.anInt2920;
							Static142.anInt2920 = local184;
						} else if (local184 < Static190.anInt3814) {
							Static396.anInt7017 = Static121.anInt7696;
							Static121.anInt7696 = Static190.anInt3814;
							Static190.anInt3814 = local184;
						} else if (local184 < Static121.anInt7696) {
							Static396.anInt7017 = Static121.anInt7696;
							Static121.anInt7696 = local184;
						} else if (local184 < Static396.anInt7017) {
							Static396.anInt7017 = local184;
						}
					}
				}
				local151 = this.anInt2795;
				if (local151 == 0) {
					local16[local40] = Static142.anInt2920;
				} else if (local151 == 1) {
					local16[local40] = Static190.anInt3814;
				} else if (local151 == 3) {
					local16[local40] = Static121.anInt7696;
				} else if (local151 == 4) {
					local16[local40] = Static396.anInt7017;
				} else if (local151 == 2) {
					local16[local40] = Static190.anInt3814 - Static142.anInt2920;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V")
	private void method2510() {
		@Pc(12) Random local12 = new Random((long) this.anInt2793);
		this.aShortArray33 = new short[512];
		if (this.anInt2797 > 0) {
			for (@Pc(32) int local32 = 0; local32 < 512; local32++) {
				this.aShortArray33[local32] = (short) Static127.method2396(local12, this.anInt2797);
			}
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!wn;I)V")
	@Override
	public void method6340(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt2789 = this.anInt2790 = arg1.method4614();
		} else if (arg0 == 1) {
			this.anInt2793 = arg1.method4614();
		} else if (arg0 == 2) {
			this.anInt2797 = arg1.method4560();
		} else if (arg0 == 3) {
			this.anInt2795 = arg1.method4614();
		} else if (arg0 == 4) {
			this.anInt2794 = arg1.method4614();
		} else if (arg0 == 5) {
			this.anInt2789 = arg1.method4614();
		} else if (arg0 == 6) {
			this.anInt2790 = arg1.method4614();
		}
	}
}
