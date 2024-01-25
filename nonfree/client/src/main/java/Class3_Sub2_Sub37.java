import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class3_Sub2_Sub37 extends Class3_Sub2 {

	@OriginalMember(owner = "client!va", name = "G", descriptor = "[S")
	private short[] aShortArray142 = new short[512];

	@OriginalMember(owner = "client!va", name = "H", descriptor = "I")
	private int anInt9823 = 5;

	@OriginalMember(owner = "client!va", name = "I", descriptor = "I")
	private int anInt9824 = 0;

	@OriginalMember(owner = "client!va", name = "K", descriptor = "I")
	private int anInt9826 = 2048;

	@OriginalMember(owner = "client!va", name = "F", descriptor = "I")
	private int anInt9822 = 5;

	@OriginalMember(owner = "client!va", name = "P", descriptor = "I")
	private int anInt9829 = 2;

	@OriginalMember(owner = "client!va", name = "N", descriptor = "I")
	private int anInt9828 = 1;

	@OriginalMember(owner = "client!va", name = "O", descriptor = "[B")
	private byte[] aByteArray99 = new byte[512];

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			@Pc(32) int local32 = this.anInt9822 * Static328.anIntArray387[arg0] + 2048;
			@Pc(36) int local36 = local32 >> 12;
			@Pc(40) int local40 = local36 + 1;
			for (@Pc(42) int local42 = 0; local42 < Static164.anInt8839; local42++) {
				Static571.anInt9680 = Integer.MAX_VALUE;
				Static623.anInt10320 = Integer.MAX_VALUE;
				Static332.anInt6616 = Integer.MAX_VALUE;
				Static8.anInt71 = Integer.MAX_VALUE;
				@Pc(61) int local61 = this.anInt9823 * Static352.anIntArray400[local42] + 2048;
				@Pc(65) int local65 = local61 >> 12;
				@Pc(69) int local69 = local65 + 1;
				@Pc(154) int local154;
				for (@Pc(73) int local73 = local36 - 1; local73 <= local40; local73++) {
					@Pc(98) int local98 = this.aByteArray99[(this.anInt9822 <= local73 ? local73 - this.anInt9822 : local73) & 0xFF] & 0xFF;
					for (@Pc(102) int local102 = local65 - 1; local102 <= local69; local102++) {
						@Pc(127) int local127 = (this.aByteArray99[(this.anInt9823 <= local102 ? local102 - this.anInt9823 : local102) + local98 & 0xFF] & 0xFF) * 2;
						@Pc(131) int local131 = local127 + 1;
						@Pc(140) int local140 = local61 - this.aShortArray142[local127] - (local102 << 12);
						@Pc(151) int local151 = local32 - this.aShortArray142[local131] - (local73 << 12);
						local154 = this.anInt9828;
						@Pc(189) int local189;
						if (local154 == 1) {
							local189 = local140 * local140 + local151 * local151 >> 12;
						} else if (local154 == 3) {
							local140 = local140 >= 0 ? local140 : -local140;
							local151 = local151 >= 0 ? local151 : -local151;
							local189 = local151 >= local140 ? local151 : local140;
						} else if (local154 == 4) {
							local140 = (int) (Math.sqrt((double) ((float) (local140 < 0 ? -local140 : local140) / 4096.0F)) * 4096.0D);
							local151 = (int) (Math.sqrt((double) ((float) (local151 < 0 ? -local151 : local151) / 4096.0F)) * 4096.0D);
							local189 = local151 + local140;
							local189 = local189 * local189 >> 12;
						} else if (local154 == 5) {
							local140 *= local140;
							local151 *= local151;
							local189 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local151 + local140) / 1.6777216E7F))) * 4096.0D);
						} else if (local154 == 2) {
							local189 = (local140 < 0 ? -local140 : local140) + (local151 >= 0 ? local151 : -local151);
						} else {
							local189 = (int) (Math.sqrt((double) ((float) (local151 * local151 + local140 * local140) / 1.6777216E7F)) * 4096.0D);
						}
						if (local189 < Static8.anInt71) {
							Static571.anInt9680 = Static623.anInt10320;
							Static623.anInt10320 = Static332.anInt6616;
							Static332.anInt6616 = Static8.anInt71;
							Static8.anInt71 = local189;
						} else if (local189 < Static332.anInt6616) {
							Static571.anInt9680 = Static623.anInt10320;
							Static623.anInt10320 = Static332.anInt6616;
							Static332.anInt6616 = local189;
						} else if (Static623.anInt10320 > local189) {
							Static571.anInt9680 = Static623.anInt10320;
							Static623.anInt10320 = local189;
						} else if (Static571.anInt9680 > local189) {
							Static571.anInt9680 = local189;
						}
					}
				}
				local154 = this.anInt9829;
				if (local154 == 0) {
					local19[local42] = Static8.anInt71;
				} else if (local154 == 1) {
					local19[local42] = Static332.anInt6616;
				} else if (local154 == 3) {
					local19[local42] = Static623.anInt10320;
				} else if (local154 == 4) {
					local19[local42] = Static571.anInt9680;
				} else if (local154 == 2) {
					local19[local42] = Static332.anInt6616 - Static8.anInt71;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V")
	private void method8087() {
		@Pc(12) Random local12 = new Random((long) this.anInt9824);
		this.aShortArray142 = new short[512];
		if (this.anInt9826 > 0) {
			for (@Pc(21) int local21 = 0; local21 < 512; local21++) {
				this.aShortArray142[local21] = (short) Static106.method2589(local12, this.anInt9826);
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt9823 = this.anInt9822 = arg1.method8401();
		} else if (arg0 == 1) {
			this.anInt9824 = arg1.method8401();
		} else if (arg0 == 2) {
			this.anInt9826 = arg1.method8414();
		} else if (arg0 == 3) {
			this.anInt9829 = arg1.method8401();
		} else if (arg0 == 4) {
			this.anInt9828 = arg1.method8401();
		} else if (arg0 == 5) {
			this.anInt9823 = arg1.method8401();
		} else if (arg0 == 6) {
			this.anInt9822 = arg1.method8401();
		}
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
	@Override
	public void method8332() {
		this.aByteArray99 = Static141.method3157(this.anInt9824);
		this.method8087();
	}
}
