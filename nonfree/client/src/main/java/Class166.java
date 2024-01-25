import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class166 {

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
	private int anInt4304 = 0;

	@OriginalMember(owner = "client!iw", name = "h", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!iw", name = "i", descriptor = "[B")
	private final byte[] aByteArray36 = new byte[32];

	@OriginalMember(owner = "client!iw", name = "n", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "[J")
	private final long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!iw", name = "p", descriptor = "I")
	private int anInt4311 = 0;

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "[B")
	private final byte[] aByteArray35 = new byte[64];

	@OriginalMember(owner = "client!iw", name = "r", descriptor = "[J")
	private final long[] aLongArray10 = new long[8];

	@OriginalMember(owner = "client!iw", name = "j", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "([BBJ)V")
	public void method3442(@OriginalArg(0) byte[] arg0, @OriginalArg(2) long arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(21) int local21 = this.anInt4311 & 0x7;
		@Pc(23) long local23 = arg1;
		@Pc(29) int local29 = 31;
		@Pc(31) int local31 = 0;
		while (local29 >= 0) {
			local31 += ((int) local23 & 0xFF) + (this.aByteArray36[local29] & 0xFF);
			this.aByteArray36[local29] = (byte) local31;
			local23 >>>= 0x8;
			local31 >>>= 0x8;
			local29--;
		}
		@Pc(90) int local90;
		while (arg1 > 8L) {
			local90 = arg0[local7] << local16 & 0xFF | (arg0[local7 - -1] & 0xFF) >>> 8 - local16;
			if (local90 < 0 || local90 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray35[this.anInt4304] = (byte) (this.aByteArray35[this.anInt4304] | local90 >>> local21);
			this.anInt4304++;
			this.anInt4311 += 8 - local21;
			if (this.anInt4311 == 512) {
				this.method3446();
				this.anInt4311 = this.anInt4304 = 0;
			}
			this.aByteArray35[this.anInt4304] = (byte) (local90 << 8 - local21 & 0xFF);
			arg1 -= 8L;
			this.anInt4311 += local21;
			local7++;
		}
		if (arg1 <= 0L) {
			local90 = 0;
		} else {
			local90 = arg0[local7] << local16 & 0xFF;
			this.aByteArray35[this.anInt4304] = (byte) (this.aByteArray35[this.anInt4304] | local90 >>> local21);
		}
		if ((long) local21 + arg1 < 8L) {
			this.anInt4311 = (int) ((long) this.anInt4311 + arg1);
			return;
		}
		arg1 -= 8 - local21;
		this.anInt4311 += 8 - local21;
		this.anInt4304++;
		if (this.anInt4311 == 512) {
			this.method3446();
			this.anInt4311 = this.anInt4304 = 0;
		}
		this.aByteArray35[this.anInt4304] = (byte) (local90 << 8 - local21 & 0xFF);
		this.anInt4311 += (int) arg1;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "([BII)V")
	public void method3443(@OriginalArg(0) byte[] arg0) {
		this.aByteArray35[this.anInt4304] = (byte) (this.aByteArray35[this.anInt4304] | 0x80 >>> (this.anInt4311 & 0x7));
		this.anInt4304++;
		if (this.anInt4304 > 32) {
			while (true) {
				if (this.anInt4304 >= 64) {
					this.method3446();
					this.anInt4304 = 0;
					break;
				}
				this.aByteArray35[this.anInt4304++] = 0;
			}
		}
		while (this.anInt4304 < 32) {
			this.aByteArray35[this.anInt4304++] = 0;
		}
		Static598.method774(this.aByteArray36, 0, this.aByteArray35, 32, 32);
		this.method3446();
		@Pc(96) int local96 = 0;
		@Pc(98) int local98 = 0;
		while (local96 < 8) {
			@Pc(105) long local105 = this.aLongArray8[local96];
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

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
	public void method3444() {
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			this.aByteArray36[local15] = 0;
		}
		this.anInt4311 = this.anInt4304 = 0;
		this.aByteArray35[0] = 0;
		for (@Pc(39) int local39 = 0; local39 < 8; local39++) {
			this.aLongArray8[local39] = 0L;
		}
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)V")
	private void method3446() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray7[local7] = Static269.method3927(Static269.method3927(Static269.method3927(Static139.method2404(0xFFL << 16, (long) this.aByteArray35[local9 + 5] << 16), Static269.method3927(Static139.method2404(0xFFL << 24, (long) this.aByteArray35[local9 + 4] << 24), Static269.method3927(Static139.method2404((long) this.aByteArray35[local9 + 3], 255L) << 32, Static269.method3927(Static269.method3927(Static139.method2404(255L, (long) this.aByteArray35[local9 + 1]) << 48, (long) this.aByteArray35[local9] << 56), Static139.method2404(0xFFL << 40, (long) this.aByteArray35[local9 + 2] << 40))))), Static139.method2404((long) this.aByteArray35[local9 + 6], 255L) << 8), Static139.method2404(255L, (long) this.aByteArray35[local9 + 7]));
			local9 += 8;
			local7++;
		}
		for (@Pc(119) int local119 = 0; local119 < 8; local119++) {
			this.aLongArray9[local119] = Static269.method3927(this.aLongArray7[local119], this.aLongArray10[local119] = this.aLongArray8[local119]);
		}
		@Pc(151) int local151;
		for (@Pc(147) int local147 = 1; local147 <= 10; local147++) {
			@Pc(160) int local160;
			@Pc(162) int local162;
			for (local151 = 0; local151 < 8; local151++) {
				this.aLongArray6[local151] = 0L;
				local160 = 0;
				local162 = 56;
				while (local160 < 8) {
					this.aLongArray6[local151] = Static269.method3927(this.aLongArray6[local151], Class289.aLongArrayArray1[local160][(int) (this.aLongArray10[local151 - local160 & 0x7] >>> local162) & 0xFF]);
					local160++;
					local162 -= 8;
				}
			}
			for (local160 = 0; local160 < 8; local160++) {
				this.aLongArray10[local160] = this.aLongArray6[local160];
			}
			this.aLongArray10[0] = Static269.method3927(this.aLongArray10[0], Class289.aLongArray14[local147]);
			@Pc(244) int local244;
			for (local162 = 0; local162 < 8; local162++) {
				this.aLongArray6[local162] = this.aLongArray10[local162];
				local244 = 0;
				@Pc(246) int local246 = 56;
				while (local244 < 8) {
					this.aLongArray6[local162] = Static269.method3927(this.aLongArray6[local162], Class289.aLongArrayArray1[local244][(int) (this.aLongArray9[local162 - local244 & 0x7] >>> local246) & 0xFF]);
					local246 -= 8;
					local244++;
				}
			}
			for (local244 = 0; local244 < 8; local244++) {
				this.aLongArray9[local244] = this.aLongArray6[local244];
			}
		}
		for (local151 = 0; local151 < 8; local151++) {
			this.aLongArray8[local151] = Static269.method3927(this.aLongArray8[local151], Static269.method3927(this.aLongArray7[local151], this.aLongArray9[local151]));
		}
	}
}
