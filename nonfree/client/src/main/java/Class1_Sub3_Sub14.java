import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class1_Sub3_Sub14 extends Class1_Sub3 {

	@OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
	private int anInt2314 = 1;

	@OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
	private int anInt2318 = 5;

	@OriginalMember(owner = "client!hh", name = "P", descriptor = "[S")
	private short[] aShortArray45 = new short[512];

	@OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
	private int anInt2316 = 2;

	@OriginalMember(owner = "client!hh", name = "R", descriptor = "[B")
	private byte[] aByteArray37 = new byte[512];

	@OriginalMember(owner = "client!hh", name = "ab", descriptor = "I")
	private int anInt2325 = 5;

	@OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
	private int anInt2313 = 2048;

	@OriginalMember(owner = "client!hh", name = "cb", descriptor = "I")
	private int anInt2327 = 0;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(32) int local32 = Static132.anIntArray265[arg0] * this.anInt2318 + 2048;
			@Pc(36) int local36 = local32 >> 12;
			@Pc(40) int local40 = local36 + 1;
			for (@Pc(42) int local42 = 0; local42 < Static227.anInt4511; local42++) {
				Static106.anInt2471 = Integer.MAX_VALUE;
				Static204.anInt4141 = Integer.MAX_VALUE;
				Static52.anInt1185 = Integer.MAX_VALUE;
				Static281.anInt5252 = Integer.MAX_VALUE;
				@Pc(66) int local66 = this.anInt2325 * Static209.anIntArray377[local42] + 2048;
				@Pc(70) int local70 = local66 >> 12;
				@Pc(74) int local74 = local70 + 1;
				@Pc(175) int local175;
				for (@Pc(78) int local78 = local36 - 1; local78 <= local40; local78++) {
					@Pc(108) int local108 = this.aByteArray37[(this.anInt2318 <= local78 ? local78 - this.anInt2318 : local78) & 0xFF] & 0xFF;
					for (@Pc(112) int local112 = local70 - 1; local112 <= local74; local112++) {
						@Pc(146) int local146 = (this.aByteArray37[local108 + (local112 >= this.anInt2325 ? local112 - this.anInt2325 : local112) & 0xFF] & 0xFF) * 2;
						@Pc(151) int local151 = local146 + 1;
						@Pc(160) int local160 = local66 - this.aShortArray45[local146] - (local112 << 12);
						@Pc(172) int local172 = local32 - (local78 << 12) - this.aShortArray45[local151];
						local175 = this.anInt2314;
						@Pc(212) int local212;
						if (local175 == 1) {
							local212 = local172 * local172 + local160 * local160 >> 12;
						} else if (local175 == 3) {
							local160 = local160 < 0 ? -local160 : local160;
							local172 = local172 >= 0 ? local172 : -local172;
							local212 = local172 >= local160 ? local172 : local160;
						} else if (local175 == 4) {
							local160 = (int) (Math.sqrt((double) ((float) (local160 < 0 ? -local160 : local160) / 4096.0F)) * 4096.0D);
							local172 = (int) (Math.sqrt((double) ((float) (local172 < 0 ? -local172 : local172) / 4096.0F)) * 4096.0D);
							local212 = local160 + local172;
							local212 = local212 * local212 >> 12;
						} else if (local175 == 5) {
							local172 *= local172;
							local160 *= local160;
							local212 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local160 + local172) / 1.6777216E7F))) * 4096.0D);
						} else if (local175 == 2) {
							local212 = (local172 >= 0 ? local172 : -local172) + (local160 < 0 ? -local160 : local160);
						} else {
							local212 = (int) (Math.sqrt((double) ((float) (local160 * local160 + local172 * local172) / 1.6777216E7F)) * 4096.0D);
						}
						if (local212 < Static281.anInt5252) {
							Static106.anInt2471 = Static204.anInt4141;
							Static204.anInt4141 = Static52.anInt1185;
							Static52.anInt1185 = Static281.anInt5252;
							Static281.anInt5252 = local212;
						} else if (local212 < Static52.anInt1185) {
							Static106.anInt2471 = Static204.anInt4141;
							Static204.anInt4141 = Static52.anInt1185;
							Static52.anInt1185 = local212;
						} else if (local212 < Static204.anInt4141) {
							Static106.anInt2471 = Static204.anInt4141;
							Static204.anInt4141 = local212;
						} else if (local212 < Static106.anInt2471) {
							Static106.anInt2471 = local212;
						}
					}
				}
				local175 = this.anInt2316;
				if (local175 == 0) {
					local17[local42] = Static281.anInt5252;
				} else if (local175 == 1) {
					local17[local42] = Static52.anInt1185;
				} else if (local175 == 3) {
					local17[local42] = Static204.anInt4141;
				} else if (local175 == 4) {
					local17[local42] = Static106.anInt2471;
				} else if (local175 == 2) {
					local17[local42] = Static52.anInt1185 - Static281.anInt5252;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(B)V")
	private void method1830() {
		@Pc(12) Random local12 = new Random((long) this.anInt2327);
		this.aShortArray45 = new short[512];
		if (this.anInt2313 > 0) {
			for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
				this.aShortArray45[local29] = (short) Static186.method3095(local12, this.anInt2313);
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2325 = this.anInt2318 = arg0.method2690();
		} else if (arg1 == 1) {
			this.anInt2327 = arg0.method2690();
		} else if (arg1 == 2) {
			this.anInt2313 = arg0.method2691();
		} else if (arg1 == 3) {
			this.anInt2316 = arg0.method2690();
		} else if (arg1 == 4) {
			this.anInt2314 = arg0.method2690();
		} else if (arg1 == 5) {
			this.anInt2325 = arg0.method2690();
		} else if (arg1 == 6) {
			this.anInt2318 = arg0.method2690();
		}
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
	@Override
	public void method4447() {
		this.aByteArray37 = Static9.method246(this.anInt2327);
		this.method1830();
	}
}
