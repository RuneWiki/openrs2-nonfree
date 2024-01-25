import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class14_Sub3_Sub22 extends Class14_Sub3 {

	@OriginalMember(owner = "client!li", name = "O", descriptor = "[S")
	private short[] aShortArray87 = new short[512];

	@OriginalMember(owner = "client!li", name = "L", descriptor = "[B")
	private byte[] aByteArray104 = new byte[512];

	@OriginalMember(owner = "client!li", name = "ab", descriptor = "I")
	private int anInt3700 = 2048;

	@OriginalMember(owner = "client!li", name = "V", descriptor = "I")
	private int anInt3695 = 5;

	@OriginalMember(owner = "client!li", name = "P", descriptor = "I")
	private int anInt3691 = 0;

	@OriginalMember(owner = "client!li", name = "W", descriptor = "I")
	private int anInt3696 = 2;

	@OriginalMember(owner = "client!li", name = "bb", descriptor = "I")
	private int anInt3701 = 1;

	@OriginalMember(owner = "client!li", name = "cb", descriptor = "I")
	private int anInt3702 = 5;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3695 = this.anInt3702 = arg0.method2548();
		} else if (arg1 == 1) {
			this.anInt3691 = arg0.method2548();
		} else if (arg1 == 2) {
			this.anInt3700 = arg0.method2498();
		} else if (arg1 == 3) {
			this.anInt3696 = arg0.method2548();
		} else if (arg1 == 4) {
			this.anInt3701 = arg0.method2548();
		} else if (arg1 == 5) {
			this.anInt3695 = arg0.method2548();
		} else if (arg1 == 6) {
			this.anInt3702 = arg0.method2548();
		}
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(B)V")
	@Override
	public void method5998() {
		this.aByteArray104 = Static332.method5728(this.anInt3691);
		this.method3486();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(32) int local32 = Static213.anIntArray381[arg0] * this.anInt3702 + 2048;
			@Pc(36) int local36 = local32 >> 12;
			@Pc(40) int local40 = local36 + 1;
			for (@Pc(42) int local42 = 0; local42 < Static294.anInt5657; local42++) {
				Static81.anInt2003 = Integer.MAX_VALUE;
				Static334.anInt6458 = Integer.MAX_VALUE;
				Static270.anInt5157 = Integer.MAX_VALUE;
				Static165.anInt5091 = Integer.MAX_VALUE;
				@Pc(61) int local61 = this.anInt3695 * Static346.anIntArray638[local42] + 2048;
				@Pc(65) int local65 = local61 >> 12;
				@Pc(69) int local69 = local65 + 1;
				@Pc(156) int local156;
				for (@Pc(73) int local73 = local36 - 1; local73 <= local40; local73++) {
					@Pc(94) int local94 = this.aByteArray104[(this.anInt3702 > local73 ? local73 : local73 - this.anInt3702) & 0xFF] & 0xFF;
					for (@Pc(98) int local98 = local65 - 1; local98 <= local69; local98++) {
						@Pc(127) int local127 = (this.aByteArray104[(local98 < this.anInt3695 ? local98 : local98 - this.anInt3695) + local94 & 0xFF] & 0xFF) * 2;
						@Pc(131) int local131 = -(local98 << 12);
						@Pc(135) int local135 = local127 + 1;
						@Pc(140) int local140 = local131 + local61 - this.aShortArray87[local127];
						@Pc(153) int local153 = local32 - this.aShortArray87[local135] - (local73 << 12);
						local156 = this.anInt3701;
						@Pc(187) int local187;
						if (local156 == 1) {
							local187 = local140 * local140 + local153 * local153 >> 12;
						} else if (local156 == 3) {
							local140 = local140 >= 0 ? local140 : -local140;
							local153 = local153 >= 0 ? local153 : -local153;
							local187 = local153 >= local140 ? local153 : local140;
						} else if (local156 == 4) {
							local140 = (int) (Math.sqrt((double) ((float) (local140 < 0 ? -local140 : local140) / 4096.0F)) * 4096.0D);
							local153 = (int) (Math.sqrt((double) ((float) (local153 < 0 ? -local153 : local153) / 4096.0F)) * 4096.0D);
							local187 = local153 + local140;
							local187 = local187 * local187 >> 12;
						} else if (local156 == 5) {
							local140 *= local140;
							local153 *= local153;
							local187 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local153 + local140) / 1.6777216E7F))) * 4096.0D);
						} else if (local156 == 2) {
							local187 = (local153 >= 0 ? local153 : -local153) + (local140 < 0 ? -local140 : local140);
						} else {
							local187 = (int) (Math.sqrt((double) ((float) (local153 * local153 + local140 * local140) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static165.anInt5091 > local187) {
							Static81.anInt2003 = Static334.anInt6458;
							Static334.anInt6458 = Static270.anInt5157;
							Static270.anInt5157 = Static165.anInt5091;
							Static165.anInt5091 = local187;
						} else if (local187 < Static270.anInt5157) {
							Static81.anInt2003 = Static334.anInt6458;
							Static334.anInt6458 = Static270.anInt5157;
							Static270.anInt5157 = local187;
						} else if (local187 < Static334.anInt6458) {
							Static81.anInt2003 = Static334.anInt6458;
							Static334.anInt6458 = local187;
						} else if (Static81.anInt2003 > local187) {
							Static81.anInt2003 = local187;
						}
					}
				}
				local156 = this.anInt3696;
				if (local156 == 0) {
					local19[local42] = Static165.anInt5091;
				} else if (local156 == 1) {
					local19[local42] = Static270.anInt5157;
				} else if (local156 == 3) {
					local19[local42] = Static334.anInt6458;
				} else if (local156 == 4) {
					local19[local42] = Static81.anInt2003;
				} else if (local156 == 2) {
					local19[local42] = Static270.anInt5157 - Static165.anInt5091;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!li", name = "g", descriptor = "(I)V")
	private void method3486() {
		@Pc(16) Random local16 = new Random((long) this.anInt3691);
		this.aShortArray87 = new short[512];
		if (this.anInt3700 > 0) {
			for (@Pc(25) int local25 = 0; local25 < 512; local25++) {
				this.aShortArray87[local25] = (short) Static193.method3664(local16, this.anInt3700);
			}
		}
	}
}
