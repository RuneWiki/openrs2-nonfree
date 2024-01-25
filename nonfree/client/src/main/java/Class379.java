import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class379 {

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "[B")
	private final byte[] aByteArray107 = new byte[32];

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "[J")
	private final long[] aLongArray24 = new long[8];

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "[J")
	private final long[] aLongArray22 = new long[8];

	@OriginalMember(owner = "client!wv", name = "p", descriptor = "[J")
	private final long[] aLongArray25 = new long[8];

	@OriginalMember(owner = "client!wv", name = "r", descriptor = "[J")
	private final long[] aLongArray26 = new long[8];

	@OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
	private int anInt10208 = 0;

	@OriginalMember(owner = "client!wv", name = "s", descriptor = "I")
	private int anInt10212 = 0;

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "[J")
	private final long[] aLongArray23 = new long[8];

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "[B")
	private final byte[] aByteArray108 = new byte[64];

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
	private void method8744() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray25[local7] = Static266.method4391(Static416.method6560((long) this.aByteArray108[local9 + 7], 255L), Static266.method4391(Static266.method4391(Static416.method6560((long) this.aByteArray108[local9 + 5] << 16, 0xFFL << 16), Static266.method4391(Static266.method4391(Static416.method6560((long) this.aByteArray108[local9 + 3], 255L) << 32, Static266.method4391(Static416.method6560((long) this.aByteArray108[local9 + 2] << 40, 0xFFL << 40), Static266.method4391((long) this.aByteArray108[local9] << 56, Static416.method6560((long) this.aByteArray108[local9 + 1] << 48, 0xFFL << 48)))), Static416.method6560(255L, (long) this.aByteArray108[local9 + 4]) << 24)), Static416.method6560(255L, (long) this.aByteArray108[local9 + 6]) << 8));
			local9 += 8;
			local7++;
		}
		for (@Pc(117) int local117 = 0; local117 < 8; local117++) {
			this.aLongArray23[local117] = Static266.method4391(this.aLongArray25[local117], this.aLongArray26[local117] = this.aLongArray22[local117]);
		}
		@Pc(149) int local149;
		for (@Pc(145) int local145 = 1; local145 <= 10; local145++) {
			@Pc(158) int local158;
			@Pc(160) int local160;
			for (local149 = 0; local149 < 8; local149++) {
				this.aLongArray24[local149] = 0L;
				local158 = 0;
				local160 = 56;
				while (local158 < 8) {
					this.aLongArray24[local149] = Static266.method4391(this.aLongArray24[local149], Class113.aLongArrayArray1[local158][(int) (this.aLongArray26[local149 - local158 & 0x7] >>> local160) & 0xFF]);
					local160 -= 8;
					local158++;
				}
			}
			for (local158 = 0; local158 < 8; local158++) {
				this.aLongArray26[local158] = this.aLongArray24[local158];
			}
			this.aLongArray26[0] = Static266.method4391(this.aLongArray26[0], Class113.aLongArray8[local145]);
			@Pc(244) int local244;
			for (local160 = 0; local160 < 8; local160++) {
				this.aLongArray24[local160] = this.aLongArray26[local160];
				local244 = 0;
				@Pc(246) int local246 = 56;
				while (local244 < 8) {
					this.aLongArray24[local160] = Static266.method4391(this.aLongArray24[local160], Class113.aLongArrayArray1[local244][(int) (this.aLongArray23[local160 - local244 & 0x7] >>> local246) & 0xFF]);
					local244++;
					local246 -= 8;
				}
			}
			for (local244 = 0; local244 < 8; local244++) {
				this.aLongArray23[local244] = this.aLongArray24[local244];
			}
		}
		for (local149 = 0; local149 < 8; local149++) {
			this.aLongArray22[local149] = Static266.method4391(this.aLongArray22[local149], Static266.method4391(this.aLongArray25[local149], this.aLongArray23[local149]));
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II[B)V")
	public void method8748(@OriginalArg(2) byte[] arg0) {
		this.aByteArray108[this.anInt10208] = (byte) (this.aByteArray108[this.anInt10208] | 0x80 >>> (this.anInt10212 & 0x7));
		this.anInt10208++;
		if (this.anInt10208 > 32) {
			while (true) {
				if (this.anInt10208 >= 64) {
					this.method8744();
					this.anInt10208 = 0;
					break;
				}
				this.aByteArray108[this.anInt10208++] = 0;
			}
		}
		while (this.anInt10208 < 32) {
			this.aByteArray108[this.anInt10208++] = 0;
		}
		Static653.method6858(this.aByteArray107, 0, this.aByteArray108, 32, 32);
		this.method8744();
		@Pc(96) int local96 = 0;
		@Pc(98) int local98 = 0;
		while (local96 < 8) {
			@Pc(105) long local105 = this.aLongArray22[local96];
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

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "(I)V")
	public void method8749() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray107[local7] = 0;
		}
		this.anInt10212 = this.anInt10208 = 0;
		this.aByteArray108[0] = 0;
		for (@Pc(33) int local33 = 0; local33 < 8; local33++) {
			this.aLongArray22[local33] = 0L;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BJ[B)V")
	public void method8752(@OriginalArg(1) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(22) int local22 = this.anInt10212 & 0x7;
		@Pc(24) long local24 = arg0;
		@Pc(26) int local26 = 31;
		@Pc(28) int local28 = 0;
		while (local26 >= 0) {
			local28 += (this.aByteArray107[local26] & 0xFF) + ((int) local24 & 0xFF);
			this.aByteArray107[local26] = (byte) local28;
			local28 >>>= 0x8;
			local24 >>>= 0x8;
			local26--;
		}
		@Pc(92) int local92;
		while (arg0 > 8L) {
			local92 = arg1[local7] << local17 & 0xFF | (arg1[local7 + 1] & 0xFF) >>> 8 - local17;
			if (local92 < 0 || local92 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray108[this.anInt10208] = (byte) (this.aByteArray108[this.anInt10208] | local92 >>> local22);
			this.anInt10208++;
			this.anInt10212 += 8 - local22;
			if (this.anInt10212 == 512) {
				this.method8744();
				this.anInt10212 = this.anInt10208 = 0;
			}
			this.aByteArray108[this.anInt10208] = (byte) (local92 << 8 - local22 & 0xFF);
			arg0 -= 8L;
			this.anInt10212 += local22;
			local7++;
		}
		if (arg0 <= 0L) {
			local92 = 0;
		} else {
			local92 = arg1[local7] << local17 & 0xFF;
			this.aByteArray108[this.anInt10208] = (byte) (this.aByteArray108[this.anInt10208] | local92 >>> local22);
		}
		if ((long) local22 + arg0 < 8L) {
			this.anInt10212 = (int) ((long) this.anInt10212 + arg0);
			return;
		}
		arg0 -= 8 - local22;
		this.anInt10212 += 8 - local22;
		this.anInt10208++;
		if (this.anInt10212 == 512) {
			this.method8744();
			this.anInt10212 = this.anInt10208 = 0;
		}
		this.aByteArray108[this.anInt10208] = (byte) (local92 << 8 - local22 & 0xFF);
		this.anInt10212 += (int) arg0;
	}
}
