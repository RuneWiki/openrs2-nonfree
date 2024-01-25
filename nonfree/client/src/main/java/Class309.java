import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class309 {

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "[J")
	private final long[] aLongArray14 = new long[8];

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "[J")
	private final long[] aLongArray11 = new long[8];

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
	private int anInt8920 = 0;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "[J")
	private final long[] aLongArray12 = new long[8];

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	private int anInt8919 = 0;

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "[B")
	private final byte[] aByteArray123 = new byte[64];

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "[J")
	private final long[] aLongArray15 = new long[8];

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "[J")
	private final long[] aLongArray13 = new long[8];

	@OriginalMember(owner = "client!wa", name = "t", descriptor = "[B")
	private final byte[] aByteArray124 = new byte[32];

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	private void method7219() {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		while (local3 < 8) {
			this.aLongArray12[local3] = Static460.method6394(Static460.method6394(Static429.method6127(0xFFL << 8, (long) this.aByteArray123[local5 + 6] << 8), Static460.method6394(Static429.method6127(255L, (long) this.aByteArray123[local5 + 5]) << 16, Static460.method6394(Static460.method6394(Static429.method6127(255L, (long) this.aByteArray123[local5 + 3]) << 32, Static460.method6394(Static429.method6127(255L, (long) this.aByteArray123[local5 + 2]) << 40, Static460.method6394((long) this.aByteArray123[local5] << 56, Static429.method6127((long) this.aByteArray123[local5 + 1], 255L) << 48))), Static429.method6127(255L, (long) this.aByteArray123[local5 + 4]) << 24))), Static429.method6127((long) this.aByteArray123[local5 + 7], 255L));
			local3++;
			local5 += 8;
		}
		for (@Pc(113) int local113 = 0; local113 < 8; local113++) {
			this.aLongArray11[local113] = Static460.method6394(this.aLongArray12[local113], this.aLongArray14[local113] = this.aLongArray15[local113]);
		}
		@Pc(143) int local143;
		for (@Pc(139) int local139 = 1; local139 <= 10; local139++) {
			@Pc(152) int local152;
			@Pc(154) int local154;
			for (local143 = 0; local143 < 8; local143++) {
				this.aLongArray13[local143] = 0L;
				local152 = 0;
				local154 = 56;
				while (local152 < 8) {
					this.aLongArray13[local143] = Static460.method6394(this.aLongArray13[local143], Class5_Sub42_Sub1.aLongArrayArray1[local152][(int) (this.aLongArray14[local143 - local152 & 0x7] >>> local154) & 0xFF]);
					local152++;
					local154 -= 8;
				}
			}
			for (local152 = 0; local152 < 8; local152++) {
				this.aLongArray14[local152] = this.aLongArray13[local152];
			}
			this.aLongArray14[0] = Static460.method6394(this.aLongArray14[0], Class5_Sub42_Sub1.aLongArray9[local139]);
			@Pc(240) int local240;
			for (local154 = 0; local154 < 8; local154++) {
				this.aLongArray13[local154] = this.aLongArray14[local154];
				local240 = 0;
				@Pc(242) int local242 = 56;
				while (local240 < 8) {
					this.aLongArray13[local154] = Static460.method6394(this.aLongArray13[local154], Class5_Sub42_Sub1.aLongArrayArray1[local240][(int) (this.aLongArray11[local154 - local240 & 0x7] >>> local242) & 0xFF]);
					local242 -= 8;
					local240++;
				}
			}
			for (local240 = 0; local240 < 8; local240++) {
				this.aLongArray11[local240] = this.aLongArray13[local240];
			}
		}
		for (local143 = 0; local143 < 8; local143++) {
			this.aLongArray15[local143] = Static460.method6394(this.aLongArray15[local143], Static460.method6394(this.aLongArray11[local143], this.aLongArray12[local143]));
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(JI[B)V")
	public void method7223(@OriginalArg(0) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(21) int local21 = this.anInt8920 & 0x7;
		@Pc(23) long local23 = arg0;
		@Pc(25) int local25 = 31;
		@Pc(27) int local27 = 0;
		while (local25 >= 0) {
			local27 += ((int) local23 & 0xFF) + (this.aByteArray124[local25] & 0xFF);
			this.aByteArray124[local25] = (byte) local27;
			local23 >>>= 0x8;
			local27 >>>= 0x8;
			local25--;
		}
		@Pc(83) int local83;
		while (arg0 > 8L) {
			local83 = arg1[local7] << local16 & 0xFF | (arg1[local7 - -1] & 0xFF) >>> 8 - local16;
			if (local83 < 0 || local83 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray123[this.anInt8919] = (byte) (this.aByteArray123[this.anInt8919] | local83 >>> local21);
			this.anInt8919++;
			this.anInt8920 += 8 - local21;
			if (this.anInt8920 == 512) {
				this.method7219();
				this.anInt8920 = this.anInt8919 = 0;
			}
			this.aByteArray123[this.anInt8919] = (byte) (local83 << 8 - local21 & 0xFF);
			local7++;
			arg0 -= 8L;
			this.anInt8920 += local21;
		}
		if (arg0 <= 0L) {
			local83 = 0;
		} else {
			local83 = arg1[local7] << local16 & 0xFF;
			this.aByteArray123[this.anInt8919] = (byte) (this.aByteArray123[this.anInt8919] | local83 >>> local21);
		}
		if ((long) local21 + arg0 < 8L) {
			this.anInt8920 = (int) ((long) this.anInt8920 + arg0);
			return;
		}
		this.anInt8920 += 8 - local21;
		arg0 -= 8 - local21;
		this.anInt8919++;
		if (this.anInt8920 == 512) {
			this.method7219();
			this.anInt8920 = this.anInt8919 = 0;
		}
		this.aByteArray123[this.anInt8919] = (byte) (local83 << 8 - local21 & 0xFF);
		this.anInt8920 += (int) arg0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([BII)V")
	public void method7224(@OriginalArg(0) byte[] arg0) {
		this.aByteArray123[this.anInt8919] = (byte) (this.aByteArray123[this.anInt8919] | 0x80 >>> (this.anInt8920 & 0x7));
		this.anInt8919++;
		if (this.anInt8919 > 32) {
			while (true) {
				if (this.anInt8919 >= 64) {
					this.method7219();
					this.anInt8919 = 0;
					break;
				}
				this.aByteArray123[this.anInt8919++] = 0;
			}
		}
		while (this.anInt8919 < 32) {
			this.aByteArray123[this.anInt8919++] = 0;
		}
		Static553.method2534(this.aByteArray124, 0, this.aByteArray123, 32, 32);
		this.method7219();
		@Pc(96) int local96 = 0;
		@Pc(98) int local98 = 0;
		while (local96 < 8) {
			@Pc(105) long local105 = this.aLongArray15[local96];
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

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public void method7225() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray124[local7] = 0;
		}
		this.anInt8920 = this.anInt8919 = 0;
		this.aByteArray123[0] = 0;
		for (@Pc(36) int local36 = 0; local36 < 8; local36++) {
			this.aLongArray15[local36] = 0L;
		}
	}
}
