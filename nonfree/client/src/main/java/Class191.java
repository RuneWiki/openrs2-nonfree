import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lda")
public final class Class191 {

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "[B")
	private final byte[] aByteArray87 = new byte[32];

	@OriginalMember(owner = "client!lda", name = "k", descriptor = "[J")
	private final long[] aLongArray10 = new long[8];

	@OriginalMember(owner = "client!lda", name = "h", descriptor = "I")
	private int anInt6470 = 0;

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
	private int anInt6466 = 0;

	@OriginalMember(owner = "client!lda", name = "l", descriptor = "[J")
	private final long[] aLongArray11 = new long[8];

	@OriginalMember(owner = "client!lda", name = "m", descriptor = "[J")
	private final long[] aLongArray12 = new long[8];

	@OriginalMember(owner = "client!lda", name = "o", descriptor = "[B")
	private final byte[] aByteArray88 = new byte[64];

	@OriginalMember(owner = "client!lda", name = "i", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!lda", name = "n", descriptor = "[J")
	private final long[] aLongArray13 = new long[8];

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V")
	private void method5511() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray12[local7] = Static366.method6228(Static366.method6228(Static186.method3884(255L, (long) this.aByteArray88[local9 + 6]) << 8, Static366.method6228(Static186.method3884((long) this.aByteArray88[local9 + 5] << 16, 0xFFL << 16), Static366.method6228(Static366.method6228(Static186.method3884(0xFFL << 32, (long) this.aByteArray88[local9 + 3] << 32), Static366.method6228(Static366.method6228(Static186.method3884(0xFFL << 48, (long) this.aByteArray88[local9 + 1] << 48), (long) this.aByteArray88[local9] << 56), Static186.method3884((long) this.aByteArray88[local9 + 2] << 40, 0xFFL << 40))), Static186.method3884((long) this.aByteArray88[local9 + 4], 255L) << 24))), Static186.method3884(255L, (long) this.aByteArray88[local9 + 7]));
			local9 += 8;
			local7++;
		}
		for (@Pc(121) int local121 = 0; local121 < 8; local121++) {
			this.aLongArray9[local121] = Static366.method6228(this.aLongArray12[local121], this.aLongArray11[local121] = this.aLongArray13[local121]);
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
					this.aLongArray10[local151] = Static366.method6228(this.aLongArray10[local151], InputStream_Sub1.aLongArrayArray1[local160][(int) (this.aLongArray11[local151 - local160 & 0x7] >>> local162) & 0xFF]);
					local162 -= 8;
					local160++;
				}
			}
			for (local160 = 0; local160 < 8; local160++) {
				this.aLongArray11[local160] = this.aLongArray10[local160];
			}
			this.aLongArray11[0] = Static366.method6228(this.aLongArray11[0], InputStream_Sub1.aLongArray5[local147]);
			@Pc(245) int local245;
			for (local162 = 0; local162 < 8; local162++) {
				this.aLongArray10[local162] = this.aLongArray11[local162];
				local245 = 0;
				@Pc(247) int local247 = 56;
				while (local245 < 8) {
					this.aLongArray10[local162] = Static366.method6228(this.aLongArray10[local162], InputStream_Sub1.aLongArrayArray1[local245][(int) (this.aLongArray9[local162 - local245 & 0x7] >>> local247) & 0xFF]);
					local247 -= 8;
					local245++;
				}
			}
			for (local245 = 0; local245 < 8; local245++) {
				this.aLongArray9[local245] = this.aLongArray10[local245];
			}
		}
		for (local151 = 0; local151 < 8; local151++) {
			this.aLongArray13[local151] = Static366.method6228(this.aLongArray13[local151], Static366.method6228(this.aLongArray12[local151], this.aLongArray9[local151]));
		}
	}

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)V")
	public void method5513() {
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			this.aByteArray87[local15] = 0;
		}
		this.aByteArray88[0] = 0;
		this.anInt6466 = this.anInt6470 = 0;
		for (@Pc(39) int local39 = 0; local39 < 8; local39++) {
			this.aLongArray13[local39] = 0L;
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(J[BI)V")
	public void method5516(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(21) int local21 = this.anInt6466 & 0x7;
		@Pc(23) long local23 = arg0;
		@Pc(25) int local25 = 31;
		@Pc(27) int local27 = 0;
		while (local25 >= 0) {
			local27 += (this.aByteArray87[local25] & 0xFF) + ((int) local23 & 0xFF);
			this.aByteArray87[local25] = (byte) local27;
			local23 >>>= 0x8;
			local27 >>>= 0x8;
			local25--;
		}
		@Pc(92) int local92;
		while (arg0 > 8L) {
			local92 = arg1[local7] << local16 & 0xFF | (arg1[local7 + 1] & 0xFF) >>> 8 - local16;
			if (local92 < 0 || local92 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray88[this.anInt6470] = (byte) (this.aByteArray88[this.anInt6470] | local92 >>> local21);
			this.anInt6470++;
			this.anInt6466 += 8 - local21;
			if (this.anInt6466 == 512) {
				this.method5511();
				this.anInt6466 = this.anInt6470 = 0;
			}
			this.aByteArray88[this.anInt6470] = (byte) (local92 << 8 - local21 & 0xFF);
			local7++;
			arg0 -= 8L;
			this.anInt6466 += local21;
		}
		if (arg0 > 0L) {
			local92 = arg1[local7] << local16 & 0xFF;
			this.aByteArray88[this.anInt6470] = (byte) (this.aByteArray88[this.anInt6470] | local92 >>> local21);
		} else {
			local92 = 0;
		}
		if (arg0 + (long) local21 < 8L) {
			this.anInt6466 = (int) ((long) this.anInt6466 + arg0);
			return;
		}
		this.anInt6466 += 8 - local21;
		arg0 -= 8 - local21;
		this.anInt6470++;
		if (this.anInt6466 == 512) {
			this.method5511();
			this.anInt6466 = this.anInt6470 = 0;
		}
		this.aByteArray88[this.anInt6470] = (byte) (local92 << 8 - local21 & 0xFF);
		this.anInt6466 += (int) arg0;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZI[B)V")
	public void method5517(@OriginalArg(2) byte[] arg0) {
		this.aByteArray88[this.anInt6470] = (byte) (this.aByteArray88[this.anInt6470] | 0x80 >>> (this.anInt6466 & 0x7));
		this.anInt6470++;
		if (this.anInt6470 > 32) {
			while (true) {
				if (this.anInt6470 >= 64) {
					this.method5511();
					this.anInt6470 = 0;
					break;
				}
				this.aByteArray88[this.anInt6470++] = 0;
			}
		}
		while (this.anInt6470 < 32) {
			this.aByteArray88[this.anInt6470++] = 0;
		}
		Static653.method7723(this.aByteArray87, 0, this.aByteArray88, 32, 32);
		this.method5511();
		@Pc(90) int local90 = 0;
		@Pc(101) int local101 = 0;
		while (local90 < 8) {
			@Pc(108) long local108 = this.aLongArray13[local90];
			arg0[local101] = (byte) (local108 >>> 56);
			arg0[local101 + 1] = (byte) (local108 >>> 48);
			arg0[local101 + 2] = (byte) (local108 >>> 40);
			arg0[local101 + 3] = (byte) (local108 >>> 32);
			arg0[local101 + 4] = (byte) (local108 >>> 24);
			arg0[local101 + 5] = (byte) (local108 >>> 16);
			arg0[local101 + 6] = (byte) (local108 >>> 8);
			arg0[local101 + 7] = (byte) local108;
			local90++;
			local101 += 8;
		}
	}
}
