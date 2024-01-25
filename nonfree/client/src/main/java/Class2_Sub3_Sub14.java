import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class2_Sub3_Sub14 extends Class2_Sub3 {

	@OriginalMember(owner = "client!hn", name = "I", descriptor = "[S")
	private short[] aShortArray56 = new short[512];

	@OriginalMember(owner = "client!hn", name = "K", descriptor = "I")
	private int anInt4899 = 1;

	@OriginalMember(owner = "client!hn", name = "L", descriptor = "[B")
	private byte[] aByteArray58 = new byte[512];

	@OriginalMember(owner = "client!hn", name = "R", descriptor = "I")
	private int anInt4904 = 2048;

	@OriginalMember(owner = "client!hn", name = "Q", descriptor = "I")
	private int anInt4903 = 2;

	@OriginalMember(owner = "client!hn", name = "O", descriptor = "I")
	private int anInt4901 = 0;

	@OriginalMember(owner = "client!hn", name = "J", descriptor = "I")
	private int anInt4898 = 5;

	@OriginalMember(owner = "client!hn", name = "V", descriptor = "I")
	private int anInt4908 = 5;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(Z)V")
	private void method4235() {
		@Pc(16) Random local16 = new Random((long) this.anInt4901);
		this.aShortArray56 = new short[512];
		if (this.anInt4904 > 0) {
			for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
				this.aShortArray56[local28] = (short) Static42.method1597(this.anInt4904, local16);
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)V")
	@Override
	public void method9152() {
		this.aByteArray58 = Static199.method7267(this.anInt4901);
		this.method4235();
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(30) int local30 = this.anInt4898 * Static547.anIntArray641[arg0] + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static222.anInt4971; local40++) {
				Static274.anInt5850 = Integer.MAX_VALUE;
				Static395.anInt7570 = Integer.MAX_VALUE;
				Static498.anInt9232 = Integer.MAX_VALUE;
				Static270.anInt5748 = Integer.MAX_VALUE;
				@Pc(60) int local60 = Static464.anIntArray556[local40] * this.anInt4908 + 2048;
				@Pc(64) int local64 = local60 >> 12;
				@Pc(68) int local68 = local64 + 1;
				@Pc(151) int local151;
				for (@Pc(72) int local72 = local34 - 1; local72 <= local38; local72++) {
					@Pc(93) int local93 = this.aByteArray58[(local72 >= this.anInt4898 ? local72 - this.anInt4898 : local72) & 0xFF] & 0xFF;
					for (@Pc(97) int local97 = local64 - 1; local97 <= local68; local97++) {
						@Pc(122) int local122 = (this.aByteArray58[(this.anInt4908 > local97 ? local97 : local97 - this.anInt4908) + local93 & 0xFF] & 0xFF) * 2;
						@Pc(126) int local126 = -(local97 << 12);
						@Pc(130) int local130 = local122 + 1;
						@Pc(135) int local135 = local126 + local60 - this.aShortArray56[local122];
						@Pc(148) int local148 = local30 - (local72 << 12) - this.aShortArray56[local130];
						local151 = this.anInt4899;
						@Pc(184) int local184;
						if (local151 == 1) {
							local184 = local148 * local148 + local135 * local135 >> 12;
						} else if (local151 == 3) {
							local135 = local135 < 0 ? -local135 : local135;
							local148 = local148 < 0 ? -local148 : local148;
							local184 = local135 <= local148 ? local148 : local135;
						} else if (local151 == 4) {
							local135 = (int) (Math.sqrt((double) ((float) (local135 < 0 ? -local135 : local135) / 4096.0F)) * 4096.0D);
							local148 = (int) (Math.sqrt((double) ((float) (local148 < 0 ? -local148 : local148) / 4096.0F)) * 4096.0D);
							local184 = local148 + local135;
							local184 = local184 * local184 >> 12;
						} else if (local151 == 5) {
							local148 *= local148;
							local135 *= local135;
							local184 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local135 + local148) / 1.6777216E7F))) * 4096.0D);
						} else if (local151 == 2) {
							local184 = (local135 < 0 ? -local135 : local135) + (local148 >= 0 ? local148 : -local148);
						} else {
							local184 = (int) (Math.sqrt((double) ((float) (local135 * local135 + local148 * local148) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static270.anInt5748 > local184) {
							Static274.anInt5850 = Static395.anInt7570;
							Static395.anInt7570 = Static498.anInt9232;
							Static498.anInt9232 = Static270.anInt5748;
							Static270.anInt5748 = local184;
						} else if (Static498.anInt9232 > local184) {
							Static274.anInt5850 = Static395.anInt7570;
							Static395.anInt7570 = Static498.anInt9232;
							Static498.anInt9232 = local184;
						} else if (Static395.anInt7570 > local184) {
							Static274.anInt5850 = Static395.anInt7570;
							Static395.anInt7570 = local184;
						} else if (Static274.anInt5850 > local184) {
							Static274.anInt5850 = local184;
						}
					}
				}
				local151 = this.anInt4903;
				if (local151 == 0) {
					local11[local40] = Static270.anInt5748;
				} else if (local151 == 1) {
					local11[local40] = Static498.anInt9232;
				} else if (local151 == 3) {
					local11[local40] = Static395.anInt7570;
				} else if (local151 == 4) {
					local11[local40] = Static274.anInt5850;
				} else if (local151 == 2) {
					local11[local40] = Static498.anInt9232 - Static270.anInt5748;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4908 = this.anInt4898 = arg0.method8383();
		} else if (arg1 == 1) {
			this.anInt4901 = arg0.method8383();
		} else if (arg1 == 2) {
			this.anInt4904 = arg0.method8326();
		} else if (arg1 == 3) {
			this.anInt4903 = arg0.method8383();
		} else if (arg1 == 4) {
			this.anInt4899 = arg0.method8383();
		} else if (arg1 == 5) {
			this.anInt4908 = arg0.method8383();
		} else if (arg1 == 6) {
			this.anInt4898 = arg0.method8383();
		}
	}
}
