import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class194 {

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "[B")
	private final byte[] aByteArray66 = new byte[32];

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "[J")
	private final long[] aLongArray10 = new long[8];

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
	private int anInt6161 = 0;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
	private int anInt6158 = 0;

	@OriginalMember(owner = "client!lb", name = "m", descriptor = "[J")
	private final long[] aLongArray11 = new long[8];

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "[B")
	private final byte[] aByteArray67 = new byte[64];

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(J[BI)V")
	public void method5214(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(21) int local21 = this.anInt6161 & 0x7;
		@Pc(23) long local23 = arg0;
		@Pc(30) int local30 = 31;
		@Pc(32) int local32 = 0;
		while (local30 >= 0) {
			local32 += (this.aByteArray66[local30] & 0xFF) + ((int) local23 & 0xFF);
			this.aByteArray66[local30] = (byte) local32;
			local23 >>>= 0x8;
			local32 >>>= 0x8;
			local30--;
		}
		@Pc(89) int local89;
		while (arg0 > 8L) {
			local89 = arg1[local7] << local16 & 0xFF | (arg1[local7 + 1] & 0xFF) >>> 8 - local16;
			if (local89 < 0 || local89 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray67[this.anInt6158] = (byte) (this.aByteArray67[this.anInt6158] | local89 >>> local21);
			this.anInt6158++;
			this.anInt6161 += 8 - local21;
			if (this.anInt6161 == 512) {
				this.method5217();
				this.anInt6161 = this.anInt6158 = 0;
			}
			this.aByteArray67[this.anInt6158] = (byte) (local89 << 8 - local21 & 0xFF);
			local7++;
			arg0 -= 8L;
			this.anInt6161 += local21;
		}
		if (arg0 > 0L) {
			local89 = arg1[local7] << local16 & 0xFF;
			this.aByteArray67[this.anInt6158] = (byte) (this.aByteArray67[this.anInt6158] | local89 >>> local21);
		} else {
			local89 = 0;
		}
		if ((long) local21 + arg0 < 8L) {
			this.anInt6161 = (int) ((long) this.anInt6161 + arg0);
			return;
		}
		arg0 -= 8 - local21;
		this.anInt6158++;
		this.anInt6161 += 8 - local21;
		if (this.anInt6161 == 512) {
			this.method5217();
			this.anInt6161 = this.anInt6158 = 0;
		}
		this.aByteArray67[this.anInt6158] = (byte) (local89 << 8 - local21 & 0xFF);
		this.anInt6161 += (int) arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[B)V")
	public void method5215(@OriginalArg(2) byte[] arg0) {
		this.aByteArray67[this.anInt6158] = (byte) (this.aByteArray67[this.anInt6158] | 0x80 >>> (this.anInt6161 & 0x7));
		this.anInt6158++;
		if (this.anInt6158 > 32) {
			while (true) {
				if (this.anInt6158 >= 64) {
					this.method5217();
					this.anInt6158 = 0;
					break;
				}
				this.aByteArray67[this.anInt6158++] = 0;
			}
		}
		while (this.anInt6158 < 32) {
			this.aByteArray67[this.anInt6158++] = 0;
		}
		Static655.method6406(this.aByteArray66, 0, this.aByteArray67, 32, 32);
		this.method5217();
		@Pc(96) int local96 = 0;
		@Pc(98) int local98 = 0;
		while (local96 < 8) {
			@Pc(105) long local105 = this.aLongArray10[local96];
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

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	private void method5217() {
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		while (local9 < 8) {
			this.aLongArray11[local9] = Static502.method7314(Static245.method4651(255L, (long) this.aByteArray67[local11 + 7]), Static502.method7314(Static502.method7314(Static502.method7314(Static502.method7314(Static245.method4651(255L, (long) this.aByteArray67[local11 + 3]) << 32, Static502.method7314(Static502.method7314(Static245.method4651(255L, (long) this.aByteArray67[local11 + 1]) << 48, (long) this.aByteArray67[local11] << 56), Static245.method4651((long) this.aByteArray67[local11 + 2], 255L) << 40)), Static245.method4651(255L, (long) this.aByteArray67[local11 + 4]) << 24), Static245.method4651((long) this.aByteArray67[local11 + 5] << 16, 0xFFL << 16)), Static245.method4651((long) this.aByteArray67[local11 + 6] << 8, 0xFFL << 8)));
			local9++;
			local11 += 8;
		}
		for (@Pc(123) int local123 = 0; local123 < 8; local123++) {
			this.aLongArray8[local123] = Static502.method7314(this.aLongArray11[local123], this.aLongArray9[local123] = this.aLongArray10[local123]);
		}
		@Pc(153) int local153;
		for (@Pc(149) int local149 = 1; local149 <= 10; local149++) {
			@Pc(162) int local162;
			@Pc(164) int local164;
			for (local153 = 0; local153 < 8; local153++) {
				this.aLongArray7[local153] = 0L;
				local162 = 0;
				local164 = 56;
				while (local162 < 8) {
					this.aLongArray7[local153] = Static502.method7314(this.aLongArray7[local153], Class21.aLongArrayArray1[local162][(int) (this.aLongArray9[local153 - local162 & 0x7] >>> local164) & 0xFF]);
					local164 -= 8;
					local162++;
				}
			}
			for (local162 = 0; local162 < 8; local162++) {
				this.aLongArray9[local162] = this.aLongArray7[local162];
			}
			this.aLongArray9[0] = Static502.method7314(this.aLongArray9[0], Class21.aLongArray1[local149]);
			@Pc(243) int local243;
			for (local164 = 0; local164 < 8; local164++) {
				this.aLongArray7[local164] = this.aLongArray9[local164];
				local243 = 0;
				@Pc(245) int local245 = 56;
				while (local243 < 8) {
					this.aLongArray7[local164] = Static502.method7314(this.aLongArray7[local164], Class21.aLongArrayArray1[local243][(int) (this.aLongArray8[local164 - local243 & 0x7] >>> local245) & 0xFF]);
					local245 -= 8;
					local243++;
				}
			}
			for (local243 = 0; local243 < 8; local243++) {
				this.aLongArray8[local243] = this.aLongArray7[local243];
			}
		}
		for (local153 = 0; local153 < 8; local153++) {
			this.aLongArray10[local153] = Static502.method7314(this.aLongArray10[local153], Static502.method7314(this.aLongArray8[local153], this.aLongArray11[local153]));
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public void method5219() {
		for (@Pc(13) int local13 = 0; local13 < 32; local13++) {
			this.aByteArray66[local13] = 0;
		}
		this.aByteArray67[0] = 0;
		this.anInt6161 = this.anInt6158 = 0;
		for (@Pc(39) int local39 = 0; local39 < 8; local39++) {
			this.aLongArray10[local39] = 0L;
		}
	}
}
