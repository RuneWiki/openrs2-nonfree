import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class14_Sub1_Sub30 extends Class14_Sub1 {

	@OriginalMember(owner = "client!qda", name = "M", descriptor = "[S")
	private short[] aShortArray120 = new short[512];

	@OriginalMember(owner = "client!qda", name = "H", descriptor = "I")
	private int anInt8290 = 2;

	@OriginalMember(owner = "client!qda", name = "O", descriptor = "[B")
	private byte[] aByteArray96 = new byte[512];

	@OriginalMember(owner = "client!qda", name = "Q", descriptor = "I")
	private int anInt8294 = 0;

	@OriginalMember(owner = "client!qda", name = "K", descriptor = "I")
	private int anInt8291 = 5;

	@OriginalMember(owner = "client!qda", name = "R", descriptor = "I")
	private int anInt8295 = 2048;

	@OriginalMember(owner = "client!qda", name = "U", descriptor = "I")
	private int anInt8298 = 5;

	@OriginalMember(owner = "client!qda", name = "V", descriptor = "I")
	private int anInt8299 = 1;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(24) int local24 = this.anInt8291 * Static336.anIntArray458[arg0] + 2048;
			@Pc(28) int local28 = local24 >> 12;
			@Pc(32) int local32 = local28 + 1;
			for (@Pc(34) int local34 = 0; local34 < Static371.anInt6835; local34++) {
				Static487.anInt9462 = Integer.MAX_VALUE;
				Static528.anInt9163 = Integer.MAX_VALUE;
				Static425.anInt7650 = Integer.MAX_VALUE;
				Static489.anInt8756 = Integer.MAX_VALUE;
				@Pc(53) int local53 = this.anInt8298 * Static160.anIntArray258[local34] + 2048;
				@Pc(57) int local57 = local53 >> 12;
				@Pc(61) int local61 = local57 + 1;
				@Pc(146) int local146;
				for (@Pc(65) int local65 = local28 - 1; local65 <= local32; local65++) {
					@Pc(89) int local89 = this.aByteArray96[(this.anInt8291 > local65 ? local65 : local65 - this.anInt8291) & 0xFF] & 0xFF;
					for (@Pc(93) int local93 = local57 - 1; local93 <= local61; local93++) {
						@Pc(118) int local118 = (this.aByteArray96[local89 + (local93 >= this.anInt8298 ? local93 - this.anInt8298 : local93) & 0xFF] & 0xFF) * 2;
						@Pc(122) int local122 = -(local93 << 12);
						@Pc(126) int local126 = local118 + 1;
						@Pc(131) int local131 = local122 + local53 - this.aShortArray120[local118];
						@Pc(143) int local143 = local24 - (local65 << 12) - this.aShortArray120[local126];
						local146 = this.anInt8299;
						@Pc(180) int local180;
						if (local146 == 1) {
							local180 = local131 * local131 + local143 * local143 >> 12;
						} else if (local146 == 3) {
							local131 = local131 >= 0 ? local131 : -local131;
							local143 = local143 >= 0 ? local143 : -local143;
							local180 = local131 > local143 ? local131 : local143;
						} else if (local146 == 4) {
							local131 = (int) (Math.sqrt((double) ((float) (local131 >= 0 ? local131 : -local131) / 4096.0F)) * 4096.0D);
							local143 = (int) (Math.sqrt((double) ((float) (local143 >= 0 ? local143 : -local143) / 4096.0F)) * 4096.0D);
							local180 = local131 + local143;
							local180 = local180 * local180 >> 12;
						} else if (local146 == 5) {
							local143 *= local143;
							local131 *= local131;
							local180 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local131 + local143) / 1.6777216E7F))) * 4096.0D);
						} else if (local146 == 2) {
							local180 = (local131 >= 0 ? local131 : -local131) + (local143 >= 0 ? local143 : -local143);
						} else {
							local180 = (int) (Math.sqrt((double) ((float) (local131 * local131 + local143 * local143) / 1.6777216E7F)) * 4096.0D);
						}
						if (local180 < Static489.anInt8756) {
							Static487.anInt9462 = Static528.anInt9163;
							Static528.anInt9163 = Static425.anInt7650;
							Static425.anInt7650 = Static489.anInt8756;
							Static489.anInt8756 = local180;
						} else if (local180 < Static425.anInt7650) {
							Static487.anInt9462 = Static528.anInt9163;
							Static528.anInt9163 = Static425.anInt7650;
							Static425.anInt7650 = local180;
						} else if (local180 < Static528.anInt9163) {
							Static487.anInt9462 = Static528.anInt9163;
							Static528.anInt9163 = local180;
						} else if (local180 < Static487.anInt9462) {
							Static487.anInt9462 = local180;
						}
					}
				}
				local146 = this.anInt8290;
				if (local146 == 0) {
					local11[local34] = Static489.anInt8756;
				} else if (local146 == 1) {
					local11[local34] = Static425.anInt7650;
				} else if (local146 == 3) {
					local11[local34] = Static528.anInt9163;
				} else if (local146 == 4) {
					local11[local34] = Static487.anInt9462;
				} else if (local146 == 2) {
					local11[local34] = Static425.anInt7650 - Static489.anInt8756;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V")
	@Override
	public void method8899() {
		this.aByteArray96 = Static411.method6080(this.anInt8294);
		this.method6900();
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8298 = this.anInt8291 = arg0.method5866();
		} else if (arg1 == 1) {
			this.anInt8294 = arg0.method5866();
		} else if (arg1 == 2) {
			this.anInt8295 = arg0.method5900();
		} else if (arg1 == 3) {
			this.anInt8290 = arg0.method5866();
		} else if (arg1 == 4) {
			this.anInt8299 = arg0.method5866();
		} else if (arg1 == 5) {
			this.anInt8298 = arg0.method5866();
		} else if (arg1 == 6) {
			this.anInt8291 = arg0.method5866();
		}
	}

	@OriginalMember(owner = "client!qda", name = "e", descriptor = "(B)V")
	private void method6900() {
		@Pc(16) Random local16 = new Random((long) this.anInt8294);
		this.aShortArray120 = new short[512];
		if (this.anInt8295 > 0) {
			for (@Pc(25) int local25 = 0; local25 < 512; local25++) {
				this.aShortArray120[local25] = (short) Static251.method3688(local16, this.anInt8295);
			}
		}
	}
}
