import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class200 {

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "[J")
	private final long[] aLongArray11 = new long[8];

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "[J")
	private final long[] aLongArray10 = new long[8];

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "[B")
	private final byte[] aByteArray67 = new byte[32];

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
	private int anInt5379 = 0;

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "[B")
	private final byte[] aByteArray68 = new byte[64];

	@OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
	private int anInt5380 = 0;

	@OriginalMember(owner = "client!kl", name = "o", descriptor = "[J")
	private final long[] aLongArray12 = new long[8];

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V")
	private void method4506() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray8[local7] = Static136.method2177(Static136.method2177(Static315.method5005((long) this.aByteArray68[local9 + 6], 255L) << 8, Static136.method2177(Static136.method2177(Static315.method5005((long) this.aByteArray68[local9 + 4] << 24, 0xFFL << 24), Static136.method2177(Static136.method2177(Static136.method2177(Static315.method5005(255L, (long) this.aByteArray68[local9 + 1]) << 48, (long) this.aByteArray68[local9] << 56), Static315.method5005(255L, (long) this.aByteArray68[local9 + 2]) << 40), Static315.method5005((long) this.aByteArray68[local9 + 3] << 32, 0xFFL << 32))), Static315.method5005(255L, (long) this.aByteArray68[local9 + 5]) << 16)), Static315.method5005((long) this.aByteArray68[local9 + 7], 255L));
			local9 += 8;
			local7++;
		}
		for (@Pc(123) int local123 = 0; local123 < 8; local123++) {
			this.aLongArray12[local123] = Static136.method2177(this.aLongArray8[local123], this.aLongArray10[local123] = this.aLongArray11[local123]);
		}
		@Pc(153) int local153;
		for (@Pc(149) int local149 = 1; local149 <= 10; local149++) {
			@Pc(162) int local162;
			@Pc(164) int local164;
			for (local153 = 0; local153 < 8; local153++) {
				this.aLongArray9[local153] = 0L;
				local162 = 0;
				local164 = 56;
				while (local162 < 8) {
					this.aLongArray9[local153] = Static136.method2177(this.aLongArray9[local153], Class249.aLongArrayArray1[local162][(int) (this.aLongArray10[local153 - local162 & 0x7] >>> local164) & 0xFF]);
					local162++;
					local164 -= 8;
				}
			}
			for (local162 = 0; local162 < 8; local162++) {
				this.aLongArray10[local162] = this.aLongArray9[local162];
			}
			this.aLongArray10[0] = Static136.method2177(this.aLongArray10[0], Class249.aLongArray17[local149]);
			@Pc(248) int local248;
			for (local164 = 0; local164 < 8; local164++) {
				this.aLongArray9[local164] = this.aLongArray10[local164];
				local248 = 0;
				@Pc(250) int local250 = 56;
				while (local248 < 8) {
					this.aLongArray9[local164] = Static136.method2177(this.aLongArray9[local164], Class249.aLongArrayArray1[local248][(int) (this.aLongArray12[local164 - local248 & 0x7] >>> local250) & 0xFF]);
					local250 -= 8;
					local248++;
				}
			}
			for (local248 = 0; local248 < 8; local248++) {
				this.aLongArray12[local248] = this.aLongArray9[local248];
			}
		}
		for (local153 = 0; local153 < 8; local153++) {
			this.aLongArray11[local153] = Static136.method2177(this.aLongArray11[local153], Static136.method2177(this.aLongArray12[local153], this.aLongArray8[local153]));
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
	public void method4507() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray67[local7] = 0;
		}
		this.aByteArray68[0] = 0;
		this.anInt5380 = this.anInt5379 = 0;
		for (@Pc(39) int local39 = 0; local39 < 8; local39++) {
			this.aLongArray11[local39] = 0L;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BJ[B)V")
	public void method4508(@OriginalArg(1) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(21) int local21 = this.anInt5380 & 0x7;
		@Pc(23) long local23 = arg0;
		@Pc(25) int local25 = 31;
		@Pc(27) int local27 = 0;
		while (local25 >= 0) {
			local27 += ((int) local23 & 0xFF) + (this.aByteArray67[local25] & 0xFF);
			this.aByteArray67[local25] = (byte) local27;
			local23 >>>= 0x8;
			local27 >>>= 0x8;
			local25--;
		}
		@Pc(83) int local83;
		while (arg0 > 8L) {
			local83 = arg1[local7] << local16 & 0xFF | (arg1[local7 + 1] & 0xFF) >>> 8 - local16;
			if (local83 < 0 || local83 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray68[this.anInt5379] = (byte) (this.aByteArray68[this.anInt5379] | local83 >>> local21);
			this.anInt5379++;
			this.anInt5380 += 8 - local21;
			if (this.anInt5380 == 512) {
				this.method4506();
				this.anInt5380 = this.anInt5379 = 0;
			}
			this.aByteArray68[this.anInt5379] = (byte) (local83 << 8 - local21 & 0xFF);
			arg0 -= 8L;
			local7++;
			this.anInt5380 += local21;
		}
		if (arg0 <= 0L) {
			local83 = 0;
		} else {
			local83 = arg1[local7] << local16 & 0xFF;
			this.aByteArray68[this.anInt5379] = (byte) (this.aByteArray68[this.anInt5379] | local83 >>> local21);
		}
		if ((long) local21 + arg0 < 8L) {
			this.anInt5380 = (int) ((long) this.anInt5380 + arg0);
			return;
		}
		this.anInt5380 += 8 - local21;
		arg0 -= (long) (8 - local21);
		this.anInt5379++;
		if (this.anInt5380 == 512) {
			this.method4506();
			this.anInt5380 = this.anInt5379 = 0;
		}
		this.aByteArray68[this.anInt5379] = (byte) (local83 << 8 - local21 & 0xFF);
		this.anInt5380 += (int) arg0;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B[BI)V")
	public void method4511(@OriginalArg(1) byte[] arg0) {
		this.aByteArray68[this.anInt5379] = (byte) (this.aByteArray68[this.anInt5379] | 0x80 >>> (this.anInt5380 & 0x7));
		this.anInt5379++;
		if (this.anInt5379 > 32) {
			while (true) {
				if (this.anInt5379 >= 64) {
					this.method4506();
					this.anInt5379 = 0;
					break;
				}
				this.aByteArray68[this.anInt5379++] = 0;
			}
		}
		while (this.anInt5379 < 32) {
			this.aByteArray68[this.anInt5379++] = 0;
		}
		Static681.method2476(this.aByteArray67, 0, this.aByteArray68, 32, 32);
		this.method4506();
		@Pc(92) int local92 = 0;
		@Pc(94) int local94 = 0;
		while (local92 < 8) {
			@Pc(101) long local101 = this.aLongArray11[local92];
			arg0[local94] = (byte) (int) (local101 >>> 56);
			arg0[local94 + 1] = (byte) (int) (local101 >>> 48);
			arg0[local94 + 2] = (byte) (int) (local101 >>> 40);
			arg0[local94 + 3] = (byte) (int) (local101 >>> 32);
			arg0[local94 + 4] = (byte) (int) (local101 >>> 24);
			arg0[local94 + 5] = (byte) (int) (local101 >>> 16);
			arg0[local94 + 6] = (byte) (int) (local101 >>> 8);
			arg0[local94 + 7] = (byte) (int) local101;
			local92++;
			local94 += 8;
		}
	}
}
