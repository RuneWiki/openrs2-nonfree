import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class1_Sub5_Sub13 extends Class1_Sub5 {

	@OriginalMember(owner = "client!ks", name = "Q", descriptor = "I")
	private int anInt3355 = 2;

	@OriginalMember(owner = "client!ks", name = "V", descriptor = "I")
	private int anInt3359 = 5;

	@OriginalMember(owner = "client!ks", name = "K", descriptor = "[B")
	private byte[] aByteArray40 = new byte[512];

	@OriginalMember(owner = "client!ks", name = "T", descriptor = "[S")
	private short[] aShortArray49 = new short[512];

	@OriginalMember(owner = "client!ks", name = "X", descriptor = "I")
	private int anInt3360 = 0;

	@OriginalMember(owner = "client!ks", name = "Z", descriptor = "I")
	private int anInt3361 = 1;

	@OriginalMember(owner = "client!ks", name = "S", descriptor = "I")
	private int anInt3357 = 2048;

	@OriginalMember(owner = "client!ks", name = "ab", descriptor = "I")
	private int anInt3362 = 5;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "(I)V")
	private void method2850() {
		@Pc(12) Random local12 = new Random((long) this.anInt3360);
		this.aShortArray49 = new short[512];
		if (this.anInt3357 > 0) {
			for (@Pc(21) int local21 = 0; local21 < 512; local21++) {
				this.aShortArray49[local21] = (short) Static304.method5274(local12, this.anInt3357);
			}
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(30) int local30 = Static191.anIntArray379[arg0] * this.anInt3362 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static75.anInt1566; local40++) {
				Static66.anInt1455 = Integer.MAX_VALUE;
				Static190.anInt3965 = Integer.MAX_VALUE;
				Static273.anInt5607 = Integer.MAX_VALUE;
				Static34.anInt653 = Integer.MAX_VALUE;
				@Pc(60) int local60 = Static49.anIntArray492[local40] * this.anInt3359 + 2048;
				@Pc(64) int local64 = local60 >> 12;
				@Pc(68) int local68 = local64 + 1;
				@Pc(159) int local159;
				for (@Pc(72) int local72 = local34 - 1; local72 <= local38; local72++) {
					@Pc(97) int local97 = this.aByteArray40[(this.anInt3362 > local72 ? local72 : local72 - this.anInt3362) & 0xFF] & 0xFF;
					for (@Pc(101) int local101 = local64 - 1; local101 <= local68; local101++) {
						@Pc(130) int local130 = (this.aByteArray40[local97 + (local101 >= this.anInt3359 ? local101 - this.anInt3359 : local101) & 0xFF] & 0xFF) * 2;
						@Pc(135) int local135 = local130 + 1;
						@Pc(143) int local143 = local60 - this.aShortArray49[local130] - (local101 << 12);
						@Pc(156) int local156 = local30 - (local72 << 12) - this.aShortArray49[local135];
						local159 = this.anInt3361;
						@Pc(192) int local192;
						if (local159 == 1) {
							local192 = local156 * local156 + local143 * local143 >> 12;
						} else if (local159 == 3) {
							local143 = local143 >= 0 ? local143 : -local143;
							local156 = local156 < 0 ? -local156 : local156;
							local192 = local143 > local156 ? local143 : local156;
						} else if (local159 == 4) {
							local143 = (int) (Math.sqrt((double) ((float) (local143 < 0 ? -local143 : local143) / 4096.0F)) * 4096.0D);
							local156 = (int) (Math.sqrt((double) ((float) (local156 >= 0 ? local156 : -local156) / 4096.0F)) * 4096.0D);
							local192 = local143 + local156;
							local192 = local192 * local192 >> 12;
						} else if (local159 == 5) {
							local156 *= local156;
							local143 *= local143;
							local192 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local143 + local156) / 1.6777216E7F))) * 4096.0D);
						} else if (local159 == 2) {
							local192 = (local143 >= 0 ? local143 : -local143) + (local156 < 0 ? -local156 : local156);
						} else {
							local192 = (int) (Math.sqrt((double) ((float) (local156 * local156 + local143 * local143) / 1.6777216E7F)) * 4096.0D);
						}
						if (local192 < Static34.anInt653) {
							Static66.anInt1455 = Static190.anInt3965;
							Static190.anInt3965 = Static273.anInt5607;
							Static273.anInt5607 = Static34.anInt653;
							Static34.anInt653 = local192;
						} else if (local192 < Static273.anInt5607) {
							Static66.anInt1455 = Static190.anInt3965;
							Static190.anInt3965 = Static273.anInt5607;
							Static273.anInt5607 = local192;
						} else if (local192 < Static190.anInt3965) {
							Static66.anInt1455 = Static190.anInt3965;
							Static190.anInt3965 = local192;
						} else if (Static66.anInt1455 > local192) {
							Static66.anInt1455 = local192;
						}
					}
				}
				local159 = this.anInt3355;
				if (local159 == 0) {
					local11[local40] = Static34.anInt653;
				} else if (local159 == 1) {
					local11[local40] = Static273.anInt5607;
				} else if (local159 == 3) {
					local11[local40] = Static190.anInt3965;
				} else if (local159 == 4) {
					local11[local40] = Static66.anInt1455;
				} else if (local159 == 2) {
					local11[local40] = Static273.anInt5607 - Static34.anInt653;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3359 = this.anInt3362 = arg0.method5720();
		} else if (arg1 == 1) {
			this.anInt3360 = arg0.method5720();
		} else if (arg1 == 2) {
			this.anInt3357 = arg0.method5715();
		} else if (arg1 == 3) {
			this.anInt3355 = arg0.method5720();
		} else if (arg1 == 4) {
			this.anInt3361 = arg0.method5720();
		} else if (arg1 == 5) {
			this.anInt3359 = arg0.method5720();
		} else if (arg1 == 6) {
			this.anInt3362 = arg0.method5720();
		}
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)V")
	@Override
	public void method5801() {
		this.aByteArray40 = Static218.method4016(this.anInt3360);
		this.method2850();
	}
}
