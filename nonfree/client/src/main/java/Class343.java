import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class343 {

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
	private int anInt9872 = 0;

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
	private int anInt9877 = 0;

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "[B")
	private final byte[] aByteArray89 = new byte[32];

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "[B")
	private final byte[] aByteArray90 = new byte[64];

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "[J")
	private final long[] aLongArray17 = new long[8];

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "[J")
	private final long[] aLongArray14 = new long[8];

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "[J")
	private final long[] aLongArray18 = new long[8];

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "[J")
	private final long[] aLongArray16 = new long[8];

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "[J")
	private final long[] aLongArray15 = new long[8];

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	private void method7978() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray15[local7] = Static480.method7079(Static306.method5060((long) this.aByteArray90[local9 + 7], 255L), Static480.method7079(Static480.method7079(Static306.method5060((long) this.aByteArray90[local9 + 5], 255L) << 16, Static480.method7079(Static306.method5060((long) this.aByteArray90[local9 + 4], 255L) << 24, Static480.method7079(Static480.method7079(Static480.method7079((long) this.aByteArray90[local9] << 56, Static306.method5060((long) this.aByteArray90[local9 + 1], 255L) << 48), Static306.method5060((long) this.aByteArray90[local9 + 2] << 40, 0xFFL << 40)), Static306.method5060((long) this.aByteArray90[local9 + 3], 255L) << 32))), Static306.method5060((long) this.aByteArray90[local9 + 6], 255L) << 8));
			local9 += 8;
			local7++;
		}
		for (@Pc(115) int local115 = 0; local115 < 8; local115++) {
			this.aLongArray17[local115] = Static480.method7079(this.aLongArray15[local115], this.aLongArray16[local115] = this.aLongArray18[local115]);
		}
		@Pc(147) int local147;
		for (@Pc(143) int local143 = 1; local143 <= 10; local143++) {
			@Pc(156) int local156;
			@Pc(158) int local158;
			for (local147 = 0; local147 < 8; local147++) {
				this.aLongArray14[local147] = 0L;
				local156 = 0;
				local158 = 56;
				while (local156 < 8) {
					this.aLongArray14[local147] = Static480.method7079(this.aLongArray14[local147], Class8_Sub30.aLongArrayArray4[local156][(int) (this.aLongArray16[local147 - local156 & 0x7] >>> local158) & 0xFF]);
					local156++;
					local158 -= 8;
				}
			}
			for (local156 = 0; local156 < 8; local156++) {
				this.aLongArray16[local156] = this.aLongArray14[local156];
			}
			this.aLongArray16[0] = Static480.method7079(this.aLongArray16[0], Class8_Sub30.aLongArray19[local143]);
			@Pc(243) int local243;
			for (local158 = 0; local158 < 8; local158++) {
				this.aLongArray14[local158] = this.aLongArray16[local158];
				local243 = 0;
				@Pc(245) int local245 = 56;
				while (local243 < 8) {
					this.aLongArray14[local158] = Static480.method7079(this.aLongArray14[local158], Class8_Sub30.aLongArrayArray4[local243][(int) (this.aLongArray17[local158 - local243 & 0x7] >>> local245) & 0xFF]);
					local243++;
					local245 -= 8;
				}
			}
			for (local243 = 0; local243 < 8; local243++) {
				this.aLongArray17[local243] = this.aLongArray14[local243];
			}
		}
		for (local147 = 0; local147 < 8; local147++) {
			this.aLongArray18[local147] = Static480.method7079(this.aLongArray18[local147], Static480.method7079(this.aLongArray17[local147], this.aLongArray15[local147]));
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IJ[B)V")
	public void method7981(@OriginalArg(1) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(22) int local22 = this.anInt9877 & 0x7;
		@Pc(24) long local24 = arg0;
		@Pc(26) int local26 = 31;
		@Pc(28) int local28 = 0;
		while (local26 >= 0) {
			local28 += ((int) local24 & 0xFF) + (this.aByteArray89[local26] & 0xFF);
			this.aByteArray89[local26] = (byte) local28;
			local28 >>>= 0x8;
			local24 >>>= 0x8;
			local26--;
		}
		@Pc(87) int local87;
		while (arg0 > 8L) {
			local87 = arg1[local7] << local17 & 0xFF | (arg1[local7 - -1] & 0xFF) >>> 8 - local17;
			if (local87 < 0 || local87 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray90[this.anInt9872] = (byte) (this.aByteArray90[this.anInt9872] | local87 >>> local22);
			this.anInt9872++;
			this.anInt9877 += 8 - local22;
			if (this.anInt9877 == 512) {
				this.method7978();
				this.anInt9877 = this.anInt9872 = 0;
			}
			this.aByteArray90[this.anInt9872] = (byte) (local87 << 8 - local22 & 0xFF);
			this.anInt9877 += local22;
			arg0 -= 8L;
			local7++;
		}
		if (arg0 > (long) 0) {
			local87 = arg1[local7] << local17 & 0xFF;
			this.aByteArray90[this.anInt9872] = (byte) (this.aByteArray90[this.anInt9872] | local87 >>> local22);
		} else {
			local87 = 0;
		}
		if ((long) local22 + arg0 < 8L) {
			this.anInt9877 = (int) ((long) this.anInt9877 + arg0);
			return;
		}
		this.anInt9872++;
		arg0 -= 8 - local22;
		this.anInt9877 += 8 - local22;
		if (this.anInt9877 == 512) {
			this.method7978();
			this.anInt9877 = this.anInt9872 = 0;
		}
		this.aByteArray90[this.anInt9872] = (byte) (local87 << 8 - local22 & 0xFF);
		this.anInt9877 += (int) arg0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB[B)V")
	public void method7982(@OriginalArg(2) byte[] arg0) {
		this.aByteArray90[this.anInt9872] = (byte) (this.aByteArray90[this.anInt9872] | 0x80 >>> (this.anInt9877 & 0x7));
		this.anInt9872++;
		if (this.anInt9872 > 32) {
			while (true) {
				if (this.anInt9872 >= 64) {
					this.method7978();
					this.anInt9872 = 0;
					break;
				}
				this.aByteArray90[this.anInt9872++] = 0;
			}
		}
		while (this.anInt9872 < 32) {
			this.aByteArray90[this.anInt9872++] = 0;
		}
		Static649.method5532(this.aByteArray89, 0, this.aByteArray90, 32, 32);
		this.method7978();
		@Pc(96) int local96 = 0;
		@Pc(98) int local98 = 0;
		while (local96 < 8) {
			@Pc(105) long local105 = this.aLongArray18[local96];
			arg0[local98] = (byte) (local105 >>> 56);
			arg0[local98 + 1] = (byte) (local105 >>> 48);
			arg0[local98 + 2] = (byte) (local105 >>> 40);
			arg0[local98 + 3] = (byte) (local105 >>> 32);
			arg0[local98 + 4] = (byte) (local105 >>> 24);
			arg0[local98 + 5] = (byte) (local105 >>> 16);
			arg0[local98 + 6] = (byte) (local105 >>> 8);
			arg0[local98 + 7] = (byte) local105;
			local98 += 8;
			local96++;
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
	public void method7983() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray89[local7] = 0;
		}
		this.anInt9877 = this.anInt9872 = 0;
		this.aByteArray90[0] = 0;
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			this.aLongArray18[local31] = 0L;
		}
	}
}
