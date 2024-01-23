import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class1_Sub2_Sub36 extends Class1_Sub2 {

	@OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
	private int anInt5480 = 1;

	@OriginalMember(owner = "client!uj", name = "P", descriptor = "[S")
	private short[] aShortArray91 = new short[512];

	@OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
	private int anInt5483 = 5;

	@OriginalMember(owner = "client!uj", name = "cb", descriptor = "I")
	private int anInt5486 = 0;

	@OriginalMember(owner = "client!uj", name = "R", descriptor = "I")
	private int anInt5479 = 5;

	@OriginalMember(owner = "client!uj", name = "bb", descriptor = "[B")
	private byte[] aByteArray69 = new byte[512];

	@OriginalMember(owner = "client!uj", name = "Q", descriptor = "I")
	private int anInt5478 = 2;

	@OriginalMember(owner = "client!uj", name = "Z", descriptor = "I")
	private int anInt5484 = 2048;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5479 = this.anInt5483 = arg0.method2595();
		} else if (arg1 == 1) {
			this.anInt5486 = arg0.method2595();
		} else if (arg1 == 2) {
			this.anInt5484 = arg0.method2593();
		} else if (arg1 == 3) {
			this.anInt5478 = arg0.method2595();
		} else if (arg1 == 4) {
			this.anInt5480 = arg0.method2595();
		} else if (arg1 == 5) {
			this.anInt5479 = arg0.method2595();
		} else if (arg1 == 6) {
			this.anInt5483 = arg0.method2595();
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(28) int local28 = Static7.anIntArray13[arg0] * this.anInt5483 + 2048;
			@Pc(32) int local32 = local28 >> 12;
			@Pc(36) int local36 = local32 + 1;
			for (@Pc(38) int local38 = 0; local38 < Static299.anInt5670; local38++) {
				Static282.anInt5386 = Integer.MAX_VALUE;
				Static88.anInt1610 = Integer.MAX_VALUE;
				Static119.anInt5885 = Integer.MAX_VALUE;
				Static15.anInt238 = Integer.MAX_VALUE;
				@Pc(58) int local58 = Static310.anIntArray108[local38] * this.anInt5479 + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(161) int local161;
				for (@Pc(70) int local70 = local32 - 1; local70 <= local36; local70++) {
					@Pc(96) int local96 = this.aByteArray69[(this.anInt5483 <= local70 ? local70 - this.anInt5483 : local70) & 0xFF] & 0xFF;
					for (@Pc(100) int local100 = local62 - 1; local100 <= local66; local100++) {
						@Pc(134) int local134 = (this.aByteArray69[local96 + (this.anInt5479 > local100 ? local100 : local100 - this.anInt5479) & 0xFF] & 0xFF) * 2;
						@Pc(138) int local138 = local134 + 1;
						@Pc(147) int local147 = local58 - this.aShortArray91[local134] - (local100 << 12);
						@Pc(158) int local158 = local28 - (local70 << 12) - this.aShortArray91[local138];
						local161 = this.anInt5480;
						@Pc(202) int local202;
						if (local161 == 1) {
							local202 = local158 * local158 + local147 * local147 >> 12;
						} else if (local161 == 3) {
							local147 = local147 < 0 ? -local147 : local147;
							local158 = local158 < 0 ? -local158 : local158;
							local202 = local158 < local147 ? local147 : local158;
						} else if (local161 == 4) {
							local147 = (int) (Math.sqrt((double) ((float) (local147 < 0 ? -local147 : local147) / 4096.0F)) * 4096.0D);
							local158 = (int) (Math.sqrt((double) ((float) (local158 < 0 ? -local158 : local158) / 4096.0F)) * 4096.0D);
							local202 = local147 + local158;
							local202 = local202 * local202 >> 12;
						} else if (local161 == 5) {
							local147 *= local147;
							local158 *= local158;
							local202 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local147 + local158) / 1.6777216E7F))) * 4096.0D);
						} else if (local161 == 2) {
							local202 = (local158 < 0 ? -local158 : local158) + (local147 < 0 ? -local147 : local147);
						} else {
							local202 = (int) (Math.sqrt((double) ((float) (local147 * local147 + local158 * local158) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static15.anInt238 > local202) {
							Static282.anInt5386 = Static88.anInt1610;
							Static88.anInt1610 = Static119.anInt5885;
							Static119.anInt5885 = Static15.anInt238;
							Static15.anInt238 = local202;
						} else if (local202 < Static119.anInt5885) {
							Static282.anInt5386 = Static88.anInt1610;
							Static88.anInt1610 = Static119.anInt5885;
							Static119.anInt5885 = local202;
						} else if (local202 < Static88.anInt1610) {
							Static282.anInt5386 = Static88.anInt1610;
							Static88.anInt1610 = local202;
						} else if (local202 < Static282.anInt5386) {
							Static282.anInt5386 = local202;
						}
					}
				}
				local161 = this.anInt5478;
				if (local161 == 0) {
					local13[local38] = Static15.anInt238;
				} else if (local161 == 1) {
					local13[local38] = Static119.anInt5885;
				} else if (local161 == 3) {
					local13[local38] = Static88.anInt1610;
				} else if (local161 == 4) {
					local13[local38] = Static282.anInt5386;
				} else if (local161 == 2) {
					local13[local38] = Static119.anInt5885 - Static15.anInt238;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "(I)V")
	private void method4280() {
		@Pc(12) Random local12 = new Random((long) this.anInt5486);
		this.aShortArray91 = new short[512];
		if (this.anInt5484 > 0) {
			for (@Pc(23) int local23 = 0; local23 < 512; local23++) {
				this.aShortArray91[local23] = (short) Static165.method2794(local12, this.anInt5484);
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V")
	@Override
	public void method4578() {
		this.aByteArray69 = Static191.method3129(this.anInt5486);
		this.method4280();
	}
}
