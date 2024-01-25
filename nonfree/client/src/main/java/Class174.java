import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class174 {

	@OriginalMember(owner = "client!km", name = "b", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!km", name = "d", descriptor = "I")
	private int anInt5776 = 0;

	@OriginalMember(owner = "client!km", name = "j", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!km", name = "k", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!km", name = "m", descriptor = "I")
	private int anInt5781 = 0;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "[J")
	private final long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!km", name = "r", descriptor = "[B")
	private final byte[] aByteArray63 = new byte[32];

	@OriginalMember(owner = "client!km", name = "q", descriptor = "[B")
	private final byte[] aByteArray62 = new byte[64];

	@OriginalMember(owner = "client!km", name = "n", descriptor = "[J")
	private final long[] aLongArray10 = new long[8];

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IJ[B)V")
	public void method5059(@OriginalArg(1) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(21) int local21 = this.anInt5776 & 0x7;
		@Pc(23) long local23 = arg0;
		@Pc(25) int local25 = 31;
		@Pc(27) int local27 = 0;
		while (local25 >= 0) {
			local27 += (this.aByteArray63[local25] & 0xFF) + ((int) local23 & 0xFF);
			this.aByteArray63[local25] = (byte) local27;
			local23 >>>= 0x8;
			local27 >>>= 0x8;
			local25--;
		}
		@Pc(87) int local87;
		while (arg0 > 8L) {
			local87 = arg1[local7] << local16 & 0xFF | (arg1[local7 + 1] & 0xFF) >>> 8 - local16;
			if (local87 < 0 || local87 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray62[this.anInt5781] = (byte) (this.aByteArray62[this.anInt5781] | local87 >>> local21);
			this.anInt5781++;
			this.anInt5776 += 8 - local21;
			if (this.anInt5776 == 512) {
				this.method5065();
				this.anInt5776 = this.anInt5781 = 0;
			}
			this.aByteArray62[this.anInt5781] = (byte) (local87 << 8 - local21 & 0xFF);
			this.anInt5776 += local21;
			arg0 -= 8L;
			local7++;
		}
		if (arg0 <= 0L) {
			local87 = 0;
		} else {
			local87 = arg1[local7] << local16 & 0xFF;
			this.aByteArray62[this.anInt5781] = (byte) (this.aByteArray62[this.anInt5781] | local87 >>> local21);
		}
		if (arg0 + (long) local21 < 8L) {
			this.anInt5776 = (int) ((long) this.anInt5776 + arg0);
			return;
		}
		this.anInt5776 += 8 - local21;
		arg0 -= (long) (8 - local21);
		this.anInt5781++;
		if (this.anInt5776 == 512) {
			this.method5065();
			this.anInt5776 = this.anInt5781 = 0;
		}
		this.aByteArray62[this.anInt5781] = (byte) (local87 << 8 - local21 & 0xFF);
		this.anInt5776 += (int) arg0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([BII)V")
	public void method5062(@OriginalArg(0) byte[] arg0) {
		this.aByteArray62[this.anInt5781] = (byte) (this.aByteArray62[this.anInt5781] | 0x80 >>> (this.anInt5776 & 0x7));
		this.anInt5781++;
		if (this.anInt5781 > 32) {
			while (true) {
				if (this.anInt5781 >= 64) {
					this.method5065();
					this.anInt5781 = 0;
					break;
				}
				this.aByteArray62[this.anInt5781++] = 0;
			}
		}
		while (this.anInt5781 < 32) {
			this.aByteArray62[this.anInt5781++] = 0;
		}
		Static655.method5836(this.aByteArray63, 0, this.aByteArray62, 32, 32);
		this.method5065();
		@Pc(92) int local92 = 0;
		@Pc(94) int local94 = 0;
		while (local92 < 8) {
			@Pc(101) long local101 = this.aLongArray9[local92];
			arg0[local94] = (byte) (int) (local101 >>> 56);
			arg0[local94 + 1] = (byte) (int) (local101 >>> 48);
			arg0[local94 + 2] = (byte) (int) (local101 >>> 40);
			arg0[local94 + 3] = (byte) (int) (local101 >>> 32);
			arg0[local94 + 4] = (byte) (int) (local101 >>> 24);
			arg0[local94 + 5] = (byte) (int) (local101 >>> 16);
			arg0[local94 + 6] = (byte) (int) (local101 >>> 8);
			arg0[local94 + 7] = (byte) (int) local101;
			local94 += 8;
			local92++;
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
	public void method5064() {
		for (@Pc(3) int local3 = 0; local3 < 32; local3++) {
			this.aByteArray63[local3] = 0;
		}
		this.aByteArray62[0] = 0;
		this.anInt5776 = this.anInt5781 = 0;
		for (@Pc(33) int local33 = 0; local33 < 8; local33++) {
			this.aLongArray9[local33] = 0L;
		}
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V")
	private void method5065() {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		while (local3 < 8) {
			this.aLongArray7[local3] = Static200.method3539(Static448.method6927((long) this.aByteArray62[local5 + 7], 255L), Static200.method3539(Static448.method6927((long) this.aByteArray62[local5 + 6] << 8, 0xFFL << 8), Static200.method3539(Static448.method6927((long) this.aByteArray62[local5 + 5], 255L) << 16, Static200.method3539(Static448.method6927(0xFFL << 24, (long) this.aByteArray62[local5 + 4] << 24), Static200.method3539(Static200.method3539(Static448.method6927((long) this.aByteArray62[local5 + 2] << 40, 0xFFL << 40), Static200.method3539(Static448.method6927(0xFFL << 48, (long) this.aByteArray62[local5 + 1] << 48), (long) this.aByteArray62[local5] << 56)), Static448.method6927((long) this.aByteArray62[local5 + 3] << 32, 0xFFL << 32))))));
			local5 += 8;
			local3++;
		}
		for (@Pc(123) int local123 = 0; local123 < 8; local123++) {
			this.aLongArray6[local123] = Static200.method3539(this.aLongArray7[local123], this.aLongArray8[local123] = this.aLongArray9[local123]);
		}
		@Pc(153) int local153;
		for (@Pc(149) int local149 = 1; local149 <= 10; local149++) {
			@Pc(162) int local162;
			@Pc(164) int local164;
			for (local153 = 0; local153 < 8; local153++) {
				this.aLongArray10[local153] = 0L;
				local162 = 0;
				local164 = 56;
				while (local162 < 8) {
					this.aLongArray10[local153] = Static200.method3539(this.aLongArray10[local153], Class333.aLongArrayArray1[local162][(int) (this.aLongArray8[local153 - local162 & 0x7] >>> local164) & 0xFF]);
					local162++;
					local164 -= 8;
				}
			}
			for (local162 = 0; local162 < 8; local162++) {
				this.aLongArray8[local162] = this.aLongArray10[local162];
			}
			this.aLongArray8[0] = Static200.method3539(this.aLongArray8[0], Class333.aLongArray14[local149]);
			@Pc(246) int local246;
			for (local164 = 0; local164 < 8; local164++) {
				this.aLongArray10[local164] = this.aLongArray8[local164];
				local246 = 0;
				@Pc(248) int local248 = 56;
				while (local246 < 8) {
					this.aLongArray10[local164] = Static200.method3539(this.aLongArray10[local164], Class333.aLongArrayArray1[local246][(int) (this.aLongArray6[local164 - local246 & 0x7] >>> local248) & 0xFF]);
					local248 -= 8;
					local246++;
				}
			}
			for (local246 = 0; local246 < 8; local246++) {
				this.aLongArray6[local246] = this.aLongArray10[local246];
			}
		}
		for (local153 = 0; local153 < 8; local153++) {
			this.aLongArray9[local153] = Static200.method3539(this.aLongArray9[local153], Static200.method3539(this.aLongArray6[local153], this.aLongArray7[local153]));
		}
	}
}
