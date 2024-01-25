import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mfa")
public final class Class215 {

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!mfa", name = "f", descriptor = "I")
	private int anInt6359 = 0;

	@OriginalMember(owner = "client!mfa", name = "g", descriptor = "[J")
	private final long[] aLongArray10 = new long[8];

	@OriginalMember(owner = "client!mfa", name = "h", descriptor = "[J")
	private final long[] aLongArray11 = new long[8];

	@OriginalMember(owner = "client!mfa", name = "k", descriptor = "[B")
	private final byte[] aByteArray53 = new byte[32];

	@OriginalMember(owner = "client!mfa", name = "m", descriptor = "[B")
	private final byte[] aByteArray54 = new byte[64];

	@OriginalMember(owner = "client!mfa", name = "i", descriptor = "I")
	private int anInt6360 = 0;

	@OriginalMember(owner = "client!mfa", name = "d", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!mfa", name = "o", descriptor = "[J")
	private final long[] aLongArray12 = new long[8];

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I[BB)V")
	public void method5006(@OriginalArg(1) byte[] arg0) {
		this.aByteArray54[this.anInt6359] = (byte) (this.aByteArray54[this.anInt6359] | 0x80 >>> (this.anInt6360 & 0x7));
		this.anInt6359++;
		if (this.anInt6359 > 32) {
			while (true) {
				if (this.anInt6359 >= 64) {
					this.method5010();
					this.anInt6359 = 0;
					break;
				}
				this.aByteArray54[this.anInt6359++] = 0;
			}
		}
		while (this.anInt6359 < 32) {
			this.aByteArray54[this.anInt6359++] = 0;
		}
		Static599.method3060(this.aByteArray53, 0, this.aByteArray54, 32, 32);
		this.method5010();
		@Pc(88) int local88 = 0;
		@Pc(90) int local90 = 0;
		while (local88 < 8) {
			@Pc(97) long local97 = this.aLongArray12[local88];
			arg0[local90] = (byte) (local97 >>> 56);
			arg0[local90 + 1] = (byte) (local97 >>> 48);
			arg0[local90 + 2] = (byte) (local97 >>> 40);
			arg0[local90 + 3] = (byte) (local97 >>> 32);
			arg0[local90 + 4] = (byte) (local97 >>> 24);
			arg0[local90 + 5] = (byte) (local97 >>> 16);
			arg0[local90 + 6] = (byte) (local97 >>> 8);
			arg0[local90 + 7] = (byte) local97;
			local90 += 8;
			local88++;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(J[BI)V")
	public void method5008(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(13) int local13 = 0;
		@Pc(23) int local23 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(28) int local28 = this.anInt6360 & 0x7;
		@Pc(30) long local30 = arg0;
		@Pc(32) int local32 = 31;
		@Pc(34) int local34 = 0;
		while (local32 >= 0) {
			local34 += ((int) local30 & 0xFF) + (this.aByteArray53[local32] & 0xFF);
			this.aByteArray53[local32] = (byte) local34;
			local34 >>>= 0x8;
			local30 >>>= 0x8;
			local32--;
		}
		@Pc(89) int local89;
		while (arg0 > 8L) {
			local89 = arg1[local13] << local23 & 0xFF | (arg1[local13 + 1] & 0xFF) >>> 8 - local23;
			if (local89 < 0 || local89 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray54[this.anInt6359] = (byte) (this.aByteArray54[this.anInt6359] | local89 >>> local28);
			this.anInt6359++;
			this.anInt6360 += 8 - local28;
			if (this.anInt6360 == 512) {
				this.method5010();
				this.anInt6360 = this.anInt6359 = 0;
			}
			this.aByteArray54[this.anInt6359] = (byte) (local89 << 8 - local28 & 0xFF);
			this.anInt6360 += local28;
			arg0 -= 8L;
			local13++;
		}
		if (arg0 > 0L) {
			local89 = arg1[local13] << local23 & 0xFF;
			this.aByteArray54[this.anInt6359] = (byte) (this.aByteArray54[this.anInt6359] | local89 >>> local28);
		} else {
			local89 = 0;
		}
		if ((long) local28 + arg0 < 8L) {
			this.anInt6360 = (int) ((long) this.anInt6360 + arg0);
			return;
		}
		this.anInt6359++;
		this.anInt6360 += 8 - local28;
		arg0 -= 8 - local28;
		if (this.anInt6360 == 512) {
			this.method5010();
			this.anInt6360 = this.anInt6359 = 0;
		}
		this.aByteArray54[this.anInt6359] = (byte) (local89 << 8 - local28 & 0xFF);
		this.anInt6360 += (int) arg0;
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(I)V")
	public void method5009() {
		for (@Pc(3) int local3 = 0; local3 < 32; local3++) {
			this.aByteArray53[local3] = 0;
		}
		this.aByteArray54[0] = 0;
		this.anInt6360 = this.anInt6359 = 0;
		for (@Pc(33) int local33 = 0; local33 < 8; local33++) {
			this.aLongArray12[local33] = 0L;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "c", descriptor = "(I)V")
	private void method5010() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray8[local7] = Static403.method6130(Static403.method6130(Static403.method6130(Static564.method7997(255L, (long) this.aByteArray54[local9 + 5]) << 16, Static403.method6130(Static403.method6130(Static564.method7997((long) this.aByteArray54[local9 + 3], 255L) << 32, Static403.method6130(Static564.method7997((long) this.aByteArray54[local9 + 2] << 40, 0xFFL << 40), Static403.method6130(Static564.method7997((long) this.aByteArray54[local9 + 1] << 48, 0xFFL << 48), (long) this.aByteArray54[local9] << 56))), Static564.method7997((long) this.aByteArray54[local9 + 4] << 24, 0xFFL << 24))), Static564.method7997((long) this.aByteArray54[local9 + 6], 255L) << 8), Static564.method7997((long) this.aByteArray54[local9 + 7], 255L));
			local7++;
			local9 += 8;
		}
		for (@Pc(119) int local119 = 0; local119 < 8; local119++) {
			this.aLongArray9[local119] = Static403.method6130(this.aLongArray8[local119], this.aLongArray11[local119] = this.aLongArray12[local119]);
		}
		@Pc(151) int local151;
		for (@Pc(147) int local147 = 1; local147 <= 10; local147++) {
			@Pc(160) int local160;
			@Pc(162) int local162;
			for (local151 = 0; local151 < 8; local151++) {
				this.aLongArray10[local151] = 0L;
				local160 = 0;
				local162 = 56;
				while (local160 < 8) {
					this.aLongArray10[local151] = Static403.method6130(this.aLongArray10[local151], Class85.aLongArrayArray1[local160][(int) (this.aLongArray11[local151 - local160 & 0x7] >>> local162) & 0xFF]);
					local160++;
					local162 -= 8;
				}
			}
			for (local160 = 0; local160 < 8; local160++) {
				this.aLongArray11[local160] = this.aLongArray10[local160];
			}
			this.aLongArray11[0] = Static403.method6130(this.aLongArray11[0], Class85.aLongArray3[local147]);
			@Pc(244) int local244;
			for (local162 = 0; local162 < 8; local162++) {
				this.aLongArray10[local162] = this.aLongArray11[local162];
				local244 = 0;
				@Pc(246) int local246 = 56;
				while (local244 < 8) {
					this.aLongArray10[local162] = Static403.method6130(this.aLongArray10[local162], Class85.aLongArrayArray1[local244][(int) (this.aLongArray9[local162 - local244 & 0x7] >>> local246) & 0xFF]);
					local246 -= 8;
					local244++;
				}
			}
			for (local244 = 0; local244 < 8; local244++) {
				this.aLongArray9[local244] = this.aLongArray10[local244];
			}
		}
		for (local151 = 0; local151 < 8; local151++) {
			this.aLongArray12[local151] = Static403.method6130(this.aLongArray12[local151], Static403.method6130(this.aLongArray8[local151], this.aLongArray9[local151]));
		}
	}
}
