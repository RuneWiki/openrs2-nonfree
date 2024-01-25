import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class25 {

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "I")
	private int anInt775 = 0;

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "[J")
	private final long[] aLongArray1 = new long[8];

	@OriginalMember(owner = "client!bca", name = "j", descriptor = "[J")
	private final long[] aLongArray3 = new long[8];

	@OriginalMember(owner = "client!bca", name = "k", descriptor = "[J")
	private final long[] aLongArray4 = new long[8];

	@OriginalMember(owner = "client!bca", name = "e", descriptor = "[J")
	private final long[] aLongArray2 = new long[8];

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "[B")
	private final byte[] aByteArray8 = new byte[32];

	@OriginalMember(owner = "client!bca", name = "m", descriptor = "I")
	private int anInt780 = 0;

	@OriginalMember(owner = "client!bca", name = "g", descriptor = "[B")
	private final byte[] aByteArray9 = new byte[64];

	@OriginalMember(owner = "client!bca", name = "l", descriptor = "[J")
	private final long[] aLongArray5 = new long[8];

	static {
		new Class45("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "([BZI)V")
	public void method802(@OriginalArg(0) byte[] arg0) {
		this.aByteArray9[this.anInt780] = (byte) (this.aByteArray9[this.anInt780] | 0x80 >>> (this.anInt775 & 0x7));
		this.anInt780++;
		if (this.anInt780 > 32) {
			while (true) {
				if (this.anInt780 >= 64) {
					this.method804();
					this.anInt780 = 0;
					break;
				}
				this.aByteArray9[this.anInt780++] = 0;
			}
		}
		while (this.anInt780 < 32) {
			this.aByteArray9[this.anInt780++] = 0;
		}
		Static556.method7044(this.aByteArray8, 0, this.aByteArray9, 32, 32);
		this.method804();
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 0;
		while (local93 < 8) {
			@Pc(102) long local102 = this.aLongArray5[local93];
			arg0[local95] = (byte) (local102 >>> 56);
			arg0[local95 + 1] = (byte) (local102 >>> 48);
			arg0[local95 + 2] = (byte) (local102 >>> 40);
			arg0[local95 + 3] = (byte) (local102 >>> 32);
			arg0[local95 + 4] = (byte) (local102 >>> 24);
			arg0[local95 + 5] = (byte) (local102 >>> 16);
			arg0[local95 + 6] = (byte) (local102 >>> 8);
			arg0[local95 + 7] = (byte) local102;
			local95 += 8;
			local93++;
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "([BBJ)V")
	public void method803(@OriginalArg(0) byte[] arg0, @OriginalArg(2) long arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(22) int local22 = this.anInt775 & 0x7;
		@Pc(24) long local24 = arg1;
		@Pc(26) int local26 = 31;
		@Pc(28) int local28 = 0;
		while (local26 >= 0) {
			local28 += ((int) local24 & 0xFF) + (this.aByteArray8[local26] & 0xFF);
			this.aByteArray8[local26] = (byte) local28;
			local24 >>>= 0x8;
			local28 >>>= 0x8;
			local26--;
		}
		@Pc(84) int local84;
		while (arg1 > 8L) {
			local84 = arg0[local7] << local17 & 0xFF | (arg0[local7 + 1] & 0xFF) >>> 8 - local17;
			if (local84 < 0 || local84 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray9[this.anInt780] = (byte) (this.aByteArray9[this.anInt780] | local84 >>> local22);
			this.anInt780++;
			this.anInt775 += 8 - local22;
			if (this.anInt775 == 512) {
				this.method804();
				this.anInt775 = this.anInt780 = 0;
			}
			this.aByteArray9[this.anInt780] = (byte) (local84 << 8 - local22 & 0xFF);
			this.anInt775 += local22;
			local7++;
			arg1 -= 8L;
		}
		if (arg1 > 0L) {
			local84 = arg0[local7] << local17 & 0xFF;
			this.aByteArray9[this.anInt780] = (byte) (this.aByteArray9[this.anInt780] | local84 >>> local22);
		} else {
			local84 = 0;
		}
		if (arg1 + (long) local22 < 8L) {
			this.anInt775 = (int) ((long) this.anInt775 + arg1);
			return;
		}
		this.anInt775 += 8 - local22;
		arg1 -= 8 - local22;
		this.anInt780++;
		if (this.anInt775 == 512) {
			this.method804();
			this.anInt775 = this.anInt780 = 0;
		}
		this.aByteArray9[this.anInt780] = (byte) (local84 << 8 - local22 & 0xFF);
		this.anInt775 += (int) arg1;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
	private void method804() {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		while (local11 < 8) {
			this.aLongArray4[local11] = Static293.method7804(Static293.method7804(Static180.method3527(255L, (long) this.aByteArray9[local13 + 6]) << 8, Static293.method7804(Static293.method7804(Static293.method7804(Static293.method7804(Static180.method3527((long) this.aByteArray9[local13 + 2], 255L) << 40, Static293.method7804(Static180.method3527((long) this.aByteArray9[local13 + 1], 255L) << 48, (long) this.aByteArray9[local13] << 56)), Static180.method3527(0xFFL << 32, (long) this.aByteArray9[local13 + 3] << 32)), Static180.method3527((long) this.aByteArray9[local13 + 4], 255L) << 24), Static180.method3527((long) this.aByteArray9[local13 + 5], 255L) << 16)), Static180.method3527((long) this.aByteArray9[local13 + 7], 255L));
			local13 += 8;
			local11++;
		}
		for (@Pc(119) int local119 = 0; local119 < 8; local119++) {
			this.aLongArray3[local119] = Static293.method7804(this.aLongArray4[local119], this.aLongArray1[local119] = this.aLongArray5[local119]);
		}
		@Pc(149) int local149;
		for (@Pc(145) int local145 = 1; local145 <= 10; local145++) {
			@Pc(158) int local158;
			@Pc(160) int local160;
			for (local149 = 0; local149 < 8; local149++) {
				this.aLongArray2[local149] = 0L;
				local158 = 0;
				local160 = 56;
				while (local158 < 8) {
					this.aLongArray2[local149] = Static293.method7804(this.aLongArray2[local149], Class28_Sub2.aLongArrayArray1[local158][(int) (this.aLongArray1[local149 - local158 & 0x7] >>> local160) & 0xFF]);
					local158++;
					local160 -= 8;
				}
			}
			for (local158 = 0; local158 < 8; local158++) {
				this.aLongArray1[local158] = this.aLongArray2[local158];
			}
			this.aLongArray1[0] = Static293.method7804(this.aLongArray1[0], Class28_Sub2.aLongArray9[local145]);
			@Pc(244) int local244;
			for (local160 = 0; local160 < 8; local160++) {
				this.aLongArray2[local160] = this.aLongArray1[local160];
				local244 = 0;
				@Pc(246) int local246 = 56;
				while (local244 < 8) {
					this.aLongArray2[local160] = Static293.method7804(this.aLongArray2[local160], Class28_Sub2.aLongArrayArray1[local244][(int) (this.aLongArray3[local160 - local244 & 0x7] >>> local246) & 0xFF]);
					local244++;
					local246 -= 8;
				}
			}
			for (local244 = 0; local244 < 8; local244++) {
				this.aLongArray3[local244] = this.aLongArray2[local244];
			}
		}
		for (local149 = 0; local149 < 8; local149++) {
			this.aLongArray5[local149] = Static293.method7804(this.aLongArray5[local149], Static293.method7804(this.aLongArray4[local149], this.aLongArray3[local149]));
		}
	}

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "(I)V")
	public void method808() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray8[local7] = 0;
		}
		this.aByteArray9[0] = 0;
		this.anInt775 = this.anInt780 = 0;
		for (@Pc(39) int local39 = 0; local39 < 8; local39++) {
			this.aLongArray5[local39] = 0L;
		}
	}
}
