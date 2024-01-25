import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hia")
public final class Class5_Sub2_Sub15 extends Class5_Sub2 {

	@OriginalMember(owner = "client!hia", name = "D", descriptor = "I")
	private int anInt3682 = 5;

	@OriginalMember(owner = "client!hia", name = "F", descriptor = "I")
	private int anInt3683 = 2;

	@OriginalMember(owner = "client!hia", name = "H", descriptor = "I")
	private int anInt3685 = 2048;

	@OriginalMember(owner = "client!hia", name = "J", descriptor = "I")
	private int anInt3687 = 0;

	@OriginalMember(owner = "client!hia", name = "I", descriptor = "I")
	private int anInt3686 = 5;

	@OriginalMember(owner = "client!hia", name = "E", descriptor = "[S")
	private short[] aShortArray55 = new short[512];

	@OriginalMember(owner = "client!hia", name = "M", descriptor = "[B")
	private byte[] aByteArray30 = new byte[512];

	@OriginalMember(owner = "client!hia", name = "C", descriptor = "I")
	private int anInt3681 = 1;

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3682 = this.anInt3686 = arg0.method8645();
		} else if (arg1 == 1) {
			this.anInt3687 = arg0.method8645();
		} else if (arg1 == 2) {
			this.anInt3685 = arg0.method8631();
		} else if (arg1 == 3) {
			this.anInt3683 = arg0.method8645();
		} else if (arg1 == 4) {
			this.anInt3681 = arg0.method8645();
		} else if (arg1 == 5) {
			this.anInt3682 = arg0.method8645();
		} else if (arg1 == 6) {
			this.anInt3686 = arg0.method8645();
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)V")
	@Override
	public void method8819() {
		this.aByteArray30 = Static522.method6791(this.anInt3687);
		this.method3255();
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(B)V")
	private void method3255() {
		@Pc(16) Random local16 = new Random((long) this.anInt3687);
		this.aShortArray55 = new short[512];
		if (this.anInt3685 > 0) {
			for (@Pc(25) int local25 = 0; local25 < 512; local25++) {
				this.aShortArray55[local25] = (short) Static57.method964(this.anInt3685, local16);
			}
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(29) int local29 = Static61.anIntArray80[arg0] * this.anInt3686 + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static314.anInt6320; local39++) {
				Static559.anInt9206 = Integer.MAX_VALUE;
				Static144.anInt2355 = Integer.MAX_VALUE;
				Static498.anInt8483 = Integer.MAX_VALUE;
				Static418.anInt7170 = Integer.MAX_VALUE;
				@Pc(58) int local58 = this.anInt3682 * Static68.anIntArray94[local39] + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(153) int local153;
				for (@Pc(70) int local70 = local33 - 1; local70 <= local37; local70++) {
					@Pc(91) int local91 = this.aByteArray30[(local70 < this.anInt3686 ? local70 : local70 - this.anInt3686) & 0xFF] & 0xFF;
					for (@Pc(95) int local95 = local62 - 1; local95 <= local66; local95++) {
						@Pc(124) int local124 = (this.aByteArray30[local91 + (local95 < this.anInt3682 ? local95 : local95 - this.anInt3682) & 0xFF] & 0xFF) * 2;
						@Pc(129) int local129 = local124 + 1;
						@Pc(137) int local137 = local58 - this.aShortArray55[local124] - (local95 << 12);
						@Pc(150) int local150 = local29 - (local70 << 12) - this.aShortArray55[local129];
						local153 = this.anInt3681;
						@Pc(182) int local182;
						if (local153 == 1) {
							local182 = local137 * local137 + local150 * local150 >> 12;
						} else if (local153 == 3) {
							local150 = local150 < 0 ? -local150 : local150;
							local137 = local137 >= 0 ? local137 : -local137;
							local182 = local137 <= local150 ? local150 : local137;
						} else if (local153 == 4) {
							local137 = (int) (Math.sqrt((double) ((float) (local137 >= 0 ? local137 : -local137) / 4096.0F)) * 4096.0D);
							local150 = (int) (Math.sqrt((double) ((float) (local150 < 0 ? -local150 : local150) / 4096.0F)) * 4096.0D);
							local182 = local137 + local150;
							local182 = local182 * local182 >> 12;
						} else if (local153 == 5) {
							local150 *= local150;
							local137 *= local137;
							local182 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local137 + local150) / 1.6777216E7F))) * 4096.0D);
						} else if (local153 == 2) {
							local182 = (local150 < 0 ? -local150 : local150) + (local137 >= 0 ? local137 : -local137);
						} else {
							local182 = (int) (Math.sqrt((double) ((float) (local150 * local150 + local137 * local137) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static418.anInt7170 > local182) {
							Static559.anInt9206 = Static144.anInt2355;
							Static144.anInt2355 = Static498.anInt8483;
							Static498.anInt8483 = Static418.anInt7170;
							Static418.anInt7170 = local182;
						} else if (local182 < Static498.anInt8483) {
							Static559.anInt9206 = Static144.anInt2355;
							Static144.anInt2355 = Static498.anInt8483;
							Static498.anInt8483 = local182;
						} else if (Static144.anInt2355 > local182) {
							Static559.anInt9206 = Static144.anInt2355;
							Static144.anInt2355 = local182;
						} else if (local182 < Static559.anInt9206) {
							Static559.anInt9206 = local182;
						}
					}
				}
				local153 = this.anInt3683;
				if (local153 == 0) {
					local16[local39] = Static418.anInt7170;
				} else if (local153 == 1) {
					local16[local39] = Static498.anInt8483;
				} else if (local153 == 3) {
					local16[local39] = Static144.anInt2355;
				} else if (local153 == 4) {
					local16[local39] = Static559.anInt9206;
				} else if (local153 == 2) {
					local16[local39] = Static498.anInt8483 - Static418.anInt7170;
				}
			}
		}
		return local16;
	}
}
