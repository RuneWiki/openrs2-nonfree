import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class4_Sub1_Sub27 extends Class4_Sub1 {

	@OriginalMember(owner = "client!rh", name = "cb", descriptor = "[S")
	private short[] aShortArray81 = new short[512];

	@OriginalMember(owner = "client!rh", name = "fb", descriptor = "I")
	private int anInt4554 = 2;

	@OriginalMember(owner = "client!rh", name = "eb", descriptor = "I")
	private int anInt4553 = 2048;

	@OriginalMember(owner = "client!rh", name = "Z", descriptor = "I")
	private int anInt4550 = 0;

	@OriginalMember(owner = "client!rh", name = "Y", descriptor = "I")
	private int anInt4549 = 1;

	@OriginalMember(owner = "client!rh", name = "db", descriptor = "I")
	private int anInt4552 = 5;

	@OriginalMember(owner = "client!rh", name = "gb", descriptor = "[B")
	private byte[] aByteArray61 = new byte[512];

	@OriginalMember(owner = "client!rh", name = "mb", descriptor = "I")
	private int anInt4558 = 5;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "(B)V")
	@Override
	public void method4737() {
		this.aByteArray61 = Static207.method3334(this.anInt4550);
		this.method3752();
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(30) int local30 = Static237.anIntArray478[arg0] * this.anInt4558 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static73.anInt1626; local40++) {
				Static194.anInt5206 = Integer.MAX_VALUE;
				Static151.anInt2979 = Integer.MAX_VALUE;
				Static155.anInt2464 = Integer.MAX_VALUE;
				Static219.anInt4261 = Integer.MAX_VALUE;
				@Pc(65) int local65 = Static138.anIntArray231[local40] * this.anInt4552 + 2048;
				@Pc(69) int local69 = local65 >> 12;
				@Pc(73) int local73 = local69 + 1;
				@Pc(167) int local167;
				for (@Pc(77) int local77 = local34 - 1; local77 <= local38; local77++) {
					@Pc(106) int local106 = this.aByteArray61[(local77 >= this.anInt4558 ? local77 - this.anInt4558 : local77) & 0xFF] & 0xFF;
					for (@Pc(110) int local110 = local69 - 1; local110 <= local73; local110++) {
						@Pc(137) int local137 = (this.aByteArray61[local106 + (this.anInt4552 <= local110 ? local110 - this.anInt4552 : local110) & 0xFF] & 0xFF) * 2;
						@Pc(143) int local143 = local65 - (local110 << 12);
						@Pc(147) int local147 = local137 + 1;
						@Pc(151) int local151 = local143 - this.aShortArray81[local137];
						@Pc(164) int local164 = local30 - (local77 << 12) - this.aShortArray81[local147];
						local167 = this.anInt4549;
						@Pc(203) int local203;
						if (local167 == 1) {
							local203 = local164 * local164 + local151 * local151 >> 12;
						} else if (local167 == 3) {
							local151 = local151 >= 0 ? local151 : -local151;
							local164 = local164 < 0 ? -local164 : local164;
							local203 = local164 >= local151 ? local164 : local151;
						} else if (local167 == 4) {
							local151 = (int) (Math.sqrt((double) ((float) (local151 < 0 ? -local151 : local151) / 4096.0F)) * 4096.0D);
							local164 = (int) (Math.sqrt((double) ((float) (local164 >= 0 ? local164 : -local164) / 4096.0F)) * 4096.0D);
							local203 = local164 + local151;
							local203 = local203 * local203 >> 12;
						} else if (local167 == 5) {
							local151 *= local151;
							local164 *= local164;
							local203 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local151 + local164) / 1.6777216E7F))) * 4096.0D);
						} else if (local167 == 2) {
							local203 = (local151 < 0 ? -local151 : local151) + (local164 >= 0 ? local164 : -local164);
						} else {
							local203 = (int) (Math.sqrt((double) ((float) (local151 * local151 + local164 * local164) / 1.6777216E7F)) * 4096.0D);
						}
						if (local203 < Static219.anInt4261) {
							Static194.anInt5206 = Static151.anInt2979;
							Static151.anInt2979 = Static155.anInt2464;
							Static155.anInt2464 = Static219.anInt4261;
							Static219.anInt4261 = local203;
						} else if (local203 < Static155.anInt2464) {
							Static194.anInt5206 = Static151.anInt2979;
							Static151.anInt2979 = Static155.anInt2464;
							Static155.anInt2464 = local203;
						} else if (local203 < Static151.anInt2979) {
							Static194.anInt5206 = Static151.anInt2979;
							Static151.anInt2979 = local203;
						} else if (Static194.anInt5206 > local203) {
							Static194.anInt5206 = local203;
						}
					}
				}
				local167 = this.anInt4554;
				if (local167 == 0) {
					local17[local40] = Static219.anInt4261;
				} else if (local167 == 1) {
					local17[local40] = Static155.anInt2464;
				} else if (local167 == 3) {
					local17[local40] = Static151.anInt2979;
				} else if (local167 == 4) {
					local17[local40] = Static194.anInt5206;
				} else if (local167 == 2) {
					local17[local40] = Static155.anInt2464 - Static219.anInt4261;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)V")
	private void method3752() {
		@Pc(16) Random local16 = new Random((long) this.anInt4550);
		this.aShortArray81 = new short[512];
		if (this.anInt4553 > 0) {
			for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
				this.aShortArray81[local27] = (short) Static44.method716(local16, this.anInt4553);
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4552 = this.anInt4558 = arg0.method4666();
		} else if (arg1 == 1) {
			this.anInt4550 = arg0.method4666();
		} else if (arg1 == 2) {
			this.anInt4553 = arg0.method4653();
		} else if (arg1 == 3) {
			this.anInt4554 = arg0.method4666();
		} else if (arg1 == 4) {
			this.anInt4549 = arg0.method4666();
		} else if (arg1 == 5) {
			this.anInt4552 = arg0.method4666();
		} else if (arg1 == 6) {
			this.anInt4558 = arg0.method4666();
		}
	}
}
