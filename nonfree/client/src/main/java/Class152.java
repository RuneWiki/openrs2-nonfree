import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class152 {

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "[B")
	private final byte[] aByteArray35 = new byte[32];

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "[J")
	private final long[] aLongArray3 = new long[8];

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "[J")
	private final long[] aLongArray4 = new long[8];

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "[J")
	private final long[] aLongArray5 = new long[8];

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
	private int anInt3839 = 0;

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "[B")
	private final byte[] aByteArray36 = new byte[64];

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "[J")
	private final long[] aLongArray2 = new long[8];

	@OriginalMember(owner = "client!gu", name = "n", descriptor = "[J")
	private final long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "I")
	private int anInt3842 = 0;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
	private void method3289() {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = 0;
		while (local7 < 8) {
			this.aLongArray5[local7] = Static403.method5755(Static206.method3267(255L, (long) this.aByteArray36[local13 + 7]), Static403.method5755(Static403.method5755(Static403.method5755(Static206.method3267(255L, (long) this.aByteArray36[local13 + 4]) << 24, Static403.method5755(Static403.method5755(Static206.method3267(255L, (long) this.aByteArray36[local13 + 2]) << 40, Static403.method5755((long) this.aByteArray36[local13] << 56, Static206.method3267((long) this.aByteArray36[local13 + 1] << 48, 0xFFL << 48))), Static206.method3267(255L, (long) this.aByteArray36[local13 + 3]) << 32)), Static206.method3267(0xFFL << 16, (long) this.aByteArray36[local13 + 5] << 16)), Static206.method3267((long) this.aByteArray36[local13 + 6] << 8, 0xFFL << 8)));
			local13 += 8;
			local7++;
		}
		for (@Pc(123) int local123 = 0; local123 < 8; local123++) {
			this.aLongArray6[local123] = Static403.method5755(this.aLongArray5[local123], this.aLongArray4[local123] = this.aLongArray2[local123]);
		}
		@Pc(153) int local153;
		for (@Pc(149) int local149 = 1; local149 <= 10; local149++) {
			@Pc(162) int local162;
			@Pc(164) int local164;
			for (local153 = 0; local153 < 8; local153++) {
				this.aLongArray3[local153] = 0L;
				local162 = 0;
				local164 = 56;
				while (local162 < 8) {
					this.aLongArray3[local153] = Static403.method5755(this.aLongArray3[local153], IOException_Sub1.aLongArrayArray1[local162][(int) (this.aLongArray4[local153 - local162 & 0x7] >>> local164) & 0xFF]);
					local162++;
					local164 -= 8;
				}
			}
			for (local162 = 0; local162 < 8; local162++) {
				this.aLongArray4[local162] = this.aLongArray3[local162];
			}
			this.aLongArray4[0] = Static403.method5755(this.aLongArray4[0], IOException_Sub1.aLongArray22[local149]);
			@Pc(248) int local248;
			for (local164 = 0; local164 < 8; local164++) {
				this.aLongArray3[local164] = this.aLongArray4[local164];
				local248 = 0;
				@Pc(250) int local250 = 56;
				while (local248 < 8) {
					this.aLongArray3[local164] = Static403.method5755(this.aLongArray3[local164], IOException_Sub1.aLongArrayArray1[local248][(int) (this.aLongArray6[local164 - local248 & 0x7] >>> local250) & 0xFF]);
					local250 -= 8;
					local248++;
				}
			}
			for (local248 = 0; local248 < 8; local248++) {
				this.aLongArray6[local248] = this.aLongArray3[local248];
			}
		}
		for (local153 = 0; local153 < 8; local153++) {
			this.aLongArray2[local153] = Static403.method5755(this.aLongArray2[local153], Static403.method5755(this.aLongArray5[local153], this.aLongArray6[local153]));
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I[BI)V")
	public void method3290(@OriginalArg(1) byte[] arg0) {
		this.aByteArray36[this.anInt3842] = (byte) (this.aByteArray36[this.anInt3842] | 0x80 >>> (this.anInt3839 & 0x7));
		this.anInt3842++;
		if (this.anInt3842 > 32) {
			while (true) {
				if (this.anInt3842 >= 64) {
					this.method3289();
					this.anInt3842 = 0;
					break;
				}
				this.aByteArray36[this.anInt3842++] = 0;
			}
		}
		while (this.anInt3842 < 32) {
			this.aByteArray36[this.anInt3842++] = 0;
		}
		Static689.method8055(this.aByteArray35, 0, this.aByteArray36, 32, 32);
		this.method3289();
		@Pc(90) int local90 = 0;
		@Pc(92) int local92 = 0;
		while (local90 < 8) {
			@Pc(99) long local99 = this.aLongArray2[local90];
			arg0[local92] = (byte) (int) (local99 >>> 56);
			arg0[local92 + 1] = (byte) (int) (local99 >>> 48);
			arg0[local92 + 2] = (byte) (int) (local99 >>> 40);
			arg0[local92 + 3] = (byte) (int) (local99 >>> 32);
			arg0[local92 + 4] = (byte) (int) (local99 >>> 24);
			arg0[local92 + 5] = (byte) (int) (local99 >>> 16);
			arg0[local92 + 6] = (byte) (int) (local99 >>> 8);
			arg0[local92 + 7] = (byte) (int) local99;
			local90++;
			local92 += 8;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
	public void method3293() {
		for (@Pc(3) int local3 = 0; local3 < 32; local3++) {
			this.aByteArray35[local3] = 0;
		}
		this.aByteArray36[0] = 0;
		this.anInt3839 = this.anInt3842 = 0;
		for (@Pc(40) int local40 = 0; local40 < 8; local40++) {
			this.aLongArray2[local40] = 0L;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(JB[B)V")
	public void method3295(@OriginalArg(0) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(21) int local21 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(26) int local26 = this.anInt3839 & 0x7;
		@Pc(28) long local28 = arg0;
		@Pc(30) int local30 = 31;
		@Pc(32) int local32 = 0;
		while (local30 >= 0) {
			local32 += ((int) local28 & 0xFF) + (this.aByteArray35[local30] & 0xFF);
			this.aByteArray35[local30] = (byte) local32;
			local28 >>>= 0x8;
			local32 >>>= 0x8;
			local30--;
		}
		@Pc(88) int local88;
		while (arg0 > 8L) {
			local88 = arg1[local7] << local21 & 0xFF | (arg1[local7 + 1] & 0xFF) >>> 8 - local21;
			if (local88 < 0 || local88 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray36[this.anInt3842] = (byte) (this.aByteArray36[this.anInt3842] | local88 >>> local26);
			this.anInt3839 += 8 - local26;
			this.anInt3842++;
			if (this.anInt3839 == 512) {
				this.method3289();
				this.anInt3839 = this.anInt3842 = 0;
			}
			this.aByteArray36[this.anInt3842] = (byte) (local88 << 8 - local26 & 0xFF);
			arg0 -= 8L;
			this.anInt3839 += local26;
			local7++;
		}
		if (arg0 > 0L) {
			local88 = arg1[local7] << local21 & 0xFF;
			this.aByteArray36[this.anInt3842] = (byte) (this.aByteArray36[this.anInt3842] | local88 >>> local26);
		} else {
			local88 = 0;
		}
		if (arg0 + (long) local26 < 8L) {
			this.anInt3839 = (int) ((long) this.anInt3839 + arg0);
			return;
		}
		this.anInt3842++;
		this.anInt3839 += 8 - local26;
		arg0 -= (long) (8 - local26);
		if (this.anInt3839 == 512) {
			this.method3289();
			this.anInt3839 = this.anInt3842 = 0;
		}
		this.aByteArray36[this.anInt3842] = (byte) (local88 << 8 - local26 & 0xFF);
		this.anInt3839 += (int) arg0;
	}
}
