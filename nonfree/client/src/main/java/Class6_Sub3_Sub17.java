import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class6_Sub3_Sub17 extends Class6_Sub3 {

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
	private int anInt3905 = 2048;

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
	private int anInt3906 = 1;

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
	private int anInt3907 = 5;

	@OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
	private int anInt3903 = 0;

	@OriginalMember(owner = "client!jd", name = "N", descriptor = "[S")
	private short[] aShortArray77 = new short[512];

	@OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
	private int anInt3913 = 2;

	@OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
	private int anInt3914 = 5;

	@OriginalMember(owner = "client!jd", name = "Q", descriptor = "[B")
	private byte[] aByteArray51 = new byte[512];

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V")
	private void method3368() {
		@Pc(12) Random local12 = new Random((long) this.anInt3903);
		this.aShortArray77 = new short[512];
		if (this.anInt3905 > 0) {
			for (@Pc(21) int local21 = 0; local21 < 512; local21++) {
				this.aShortArray77[local21] = (short) Static29.method431(this.anInt3905, local12);
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			@Pc(32) int local32 = Static564.anIntArray703[arg0] * this.anInt3914 + 2048;
			@Pc(36) int local36 = local32 >> 12;
			@Pc(40) int local40 = local36 + 1;
			for (@Pc(42) int local42 = 0; local42 < Static447.anInt8568; local42++) {
				Static36.anInt601 = Integer.MAX_VALUE;
				Static341.anInt6077 = Integer.MAX_VALUE;
				Static442.anInt7687 = Integer.MAX_VALUE;
				Static378.anInt6496 = Integer.MAX_VALUE;
				@Pc(61) int local61 = Static157.anIntArray321[local42] * this.anInt3907 + 2048;
				@Pc(65) int local65 = local61 >> 12;
				@Pc(69) int local69 = local65 + 1;
				@Pc(150) int local150;
				for (@Pc(73) int local73 = local36 - 1; local73 <= local40; local73++) {
					@Pc(93) int local93 = this.aByteArray51[(local73 >= this.anInt3914 ? local73 - this.anInt3914 : local73) & 0xFF] & 0xFF;
					for (@Pc(97) int local97 = local65 - 1; local97 <= local69; local97++) {
						@Pc(121) int local121 = (this.aByteArray51[(this.anInt3907 > local97 ? local97 : local97 - this.anInt3907) + local93 & 0xFF] & 0xFF) * 2;
						@Pc(125) int local125 = local121 + 1;
						@Pc(135) int local135 = local61 - this.aShortArray77[local121] - (local97 << 12);
						@Pc(147) int local147 = local32 - this.aShortArray77[local125] - (local73 << 12);
						local150 = this.anInt3906;
						@Pc(183) int local183;
						if (local150 == 1) {
							local183 = local147 * local147 + local135 * local135 >> 12;
						} else if (local150 == 3) {
							local147 = local147 < 0 ? -local147 : local147;
							local135 = local135 < 0 ? -local135 : local135;
							local183 = local147 >= local135 ? local147 : local135;
						} else if (local150 == 4) {
							local135 = (int) (Math.sqrt((double) ((float) (local135 < 0 ? -local135 : local135) / 4096.0F)) * 4096.0D);
							local147 = (int) (Math.sqrt((double) ((float) (local147 >= 0 ? local147 : -local147) / 4096.0F)) * 4096.0D);
							local183 = local147 + local135;
							local183 = local183 * local183 >> 12;
						} else if (local150 == 5) {
							local147 *= local147;
							local135 *= local135;
							local183 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local147 + local135) / 1.6777216E7F))) * 4096.0D);
						} else if (local150 == 2) {
							local183 = (local147 >= 0 ? local147 : -local147) + (local135 < 0 ? -local135 : local135);
						} else {
							local183 = (int) (Math.sqrt((double) ((float) (local135 * local135 + local147 * local147) / 1.6777216E7F)) * 4096.0D);
						}
						if (local183 < Static378.anInt6496) {
							Static36.anInt601 = Static341.anInt6077;
							Static341.anInt6077 = Static442.anInt7687;
							Static442.anInt7687 = Static378.anInt6496;
							Static378.anInt6496 = local183;
						} else if (Static442.anInt7687 > local183) {
							Static36.anInt601 = Static341.anInt6077;
							Static341.anInt6077 = Static442.anInt7687;
							Static442.anInt7687 = local183;
						} else if (local183 < Static341.anInt6077) {
							Static36.anInt601 = Static341.anInt6077;
							Static341.anInt6077 = local183;
						} else if (local183 < Static36.anInt601) {
							Static36.anInt601 = local183;
						}
					}
				}
				local150 = this.anInt3913;
				if (local150 == 0) {
					local19[local42] = Static378.anInt6496;
				} else if (local150 == 1) {
					local19[local42] = Static442.anInt7687;
				} else if (local150 == 3) {
					local19[local42] = Static341.anInt6077;
				} else if (local150 == 4) {
					local19[local42] = Static36.anInt601;
				} else if (local150 == 2) {
					local19[local42] = Static442.anInt7687 - Static378.anInt6496;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V")
	@Override
	public void method7832() {
		this.aByteArray51 = Static201.method5197(this.anInt3903);
		this.method3368();
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt3907 = this.anInt3914 = arg1.method6041();
		} else if (arg0 == 1) {
			this.anInt3903 = arg1.method6041();
		} else if (arg0 == 2) {
			this.anInt3905 = arg1.method6006();
		} else if (arg0 == 3) {
			this.anInt3913 = arg1.method6041();
		} else if (arg0 == 4) {
			this.anInt3906 = arg1.method6041();
		} else if (arg0 == 5) {
			this.anInt3907 = arg1.method6041();
		} else if (arg0 == 6) {
			this.anInt3914 = arg1.method6041();
		}
	}
}
