import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class250 {

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "[J")
	private final long[] aLongArray13 = new long[8];

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "[J")
	private final long[] aLongArray12 = new long[8];

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "[B")
	private final byte[] aByteArray93 = new byte[32];

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "[B")
	private final byte[] aByteArray94 = new byte[64];

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "[J")
	private final long[] aLongArray16 = new long[8];

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "[J")
	private final long[] aLongArray14 = new long[8];

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
	private int anInt7490 = 0;

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "[J")
	private final long[] aLongArray15 = new long[8];

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
	private int anInt7491 = 0;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	public void method6238() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray93[local7] = 0;
		}
		this.anInt7490 = this.anInt7491 = 0;
		this.aByteArray94[0] = 0;
		for (@Pc(41) int local41 = 0; local41 < 8; local41++) {
			this.aLongArray12[local41] = 0L;
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
	private void method6240() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray16[local7] = Static534.method7450(Static534.method7450(Static534.method7450(Static522.method7749(255L, (long) this.aByteArray94[local9 + 5]) << 16, Static534.method7450(Static534.method7450(Static522.method7749(0xFFL << 32, (long) this.aByteArray94[local9 + 3] << 32), Static534.method7450(Static534.method7450((long) this.aByteArray94[local9] << 56, Static522.method7749((long) this.aByteArray94[local9 + 1], 255L) << 48), Static522.method7749(255L, (long) this.aByteArray94[local9 + 2]) << 40)), Static522.method7749(255L, (long) this.aByteArray94[local9 + 4]) << 24)), Static522.method7749((long) this.aByteArray94[local9 + 6] << 8, 0xFFL << 8)), Static522.method7749(255L, (long) this.aByteArray94[local9 + 7]));
			local9 += 8;
			local7++;
		}
		for (@Pc(117) int local117 = 0; local117 < 8; local117++) {
			this.aLongArray13[local117] = Static534.method7450(this.aLongArray16[local117], this.aLongArray15[local117] = this.aLongArray12[local117]);
		}
		@Pc(157) int local157;
		for (@Pc(145) int local145 = 1; local145 <= 10; local145++) {
			@Pc(166) int local166;
			@Pc(168) int local168;
			for (local157 = 0; local157 < 8; local157++) {
				this.aLongArray14[local157] = 0L;
				local166 = 0;
				local168 = 56;
				while (local166 < 8) {
					this.aLongArray14[local157] = Static534.method7450(this.aLongArray14[local157], Class12_Sub22.aLongArrayArray1[local166][(int) (this.aLongArray15[local157 - local166 & 0x7] >>> local168) & 0xFF]);
					local166++;
					local168 -= 8;
				}
			}
			for (local166 = 0; local166 < 8; local166++) {
				this.aLongArray15[local166] = this.aLongArray14[local166];
			}
			this.aLongArray15[0] = Static534.method7450(this.aLongArray15[0], Class12_Sub22.aLongArray8[local145]);
			@Pc(252) int local252;
			for (local168 = 0; local168 < 8; local168++) {
				this.aLongArray14[local168] = this.aLongArray15[local168];
				local252 = 0;
				@Pc(254) int local254 = 56;
				while (local252 < 8) {
					this.aLongArray14[local168] = Static534.method7450(this.aLongArray14[local168], Class12_Sub22.aLongArrayArray1[local252][(int) (this.aLongArray13[local168 - local252 & 0x7] >>> local254) & 0xFF]);
					local252++;
					local254 -= 8;
				}
			}
			for (local252 = 0; local252 < 8; local252++) {
				this.aLongArray13[local252] = this.aLongArray14[local252];
			}
		}
		for (local157 = 0; local157 < 8; local157++) {
			this.aLongArray12[local157] = Static534.method7450(this.aLongArray12[local157], Static534.method7450(this.aLongArray13[local157], this.aLongArray16[local157]));
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(J[BI)V")
	public void method6242(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(21) int local21 = this.anInt7490 & 0x7;
		@Pc(23) long local23 = arg0;
		@Pc(25) int local25 = 31;
		@Pc(27) int local27 = 0;
		while (local25 >= 0) {
			local27 += (this.aByteArray93[local25] & 0xFF) + ((int) local23 & 0xFF);
			this.aByteArray93[local25] = (byte) local27;
			local27 >>>= 0x8;
			local23 >>>= 0x8;
			local25--;
		}
		@Pc(93) int local93;
		while (arg0 > 8L) {
			local93 = arg1[local7] << local16 & 0xFF | (arg1[local7 - -1] & 0xFF) >>> 8 - local16;
			if (local93 < 0 || local93 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray94[this.anInt7491] = (byte) (this.aByteArray94[this.anInt7491] | local93 >>> local21);
			this.anInt7490 += 8 - local21;
			this.anInt7491++;
			if (this.anInt7490 == 512) {
				this.method6240();
				this.anInt7490 = this.anInt7491 = 0;
			}
			this.aByteArray94[this.anInt7491] = (byte) (local93 << 8 - local21 & 0xFF);
			local7++;
			this.anInt7490 += local21;
			arg0 -= 8L;
		}
		if (arg0 > 0L) {
			local93 = arg1[local7] << local16 & 0xFF;
			this.aByteArray94[this.anInt7491] = (byte) (this.aByteArray94[this.anInt7491] | local93 >>> local21);
		} else {
			local93 = 0;
		}
		if (arg0 + (long) local21 < 8L) {
			this.anInt7490 = (int) ((long) this.anInt7490 + arg0);
			return;
		}
		arg0 -= 8 - local21;
		this.anInt7491++;
		this.anInt7490 += 8 - local21;
		if (this.anInt7490 == 512) {
			this.method6240();
			this.anInt7490 = this.anInt7491 = 0;
		}
		this.aByteArray94[this.anInt7491] = (byte) (local93 << 8 - local21 & 0xFF);
		this.anInt7490 += (int) arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([BIB)V")
	public void method6243(@OriginalArg(0) byte[] arg0) {
		this.aByteArray94[this.anInt7491] = (byte) (this.aByteArray94[this.anInt7491] | 0x80 >>> (this.anInt7490 & 0x7));
		this.anInt7491++;
		if (this.anInt7491 > 32) {
			while (true) {
				if (this.anInt7491 >= 64) {
					this.method6240();
					this.anInt7491 = 0;
					break;
				}
				this.aByteArray94[this.anInt7491++] = 0;
			}
		}
		while (this.anInt7491 < 32) {
			this.aByteArray94[this.anInt7491++] = 0;
		}
		Static554.method3498(this.aByteArray93, 0, this.aByteArray94, 32, 32);
		this.method6240();
		@Pc(94) int local94 = 0;
		@Pc(96) int local96 = 0;
		while (local94 < 8) {
			@Pc(103) long local103 = this.aLongArray12[local94];
			arg0[local96] = (byte) (local103 >>> 56);
			arg0[local96 + 1] = (byte) (local103 >>> 48);
			arg0[local96 + 2] = (byte) (local103 >>> 40);
			arg0[local96 + 3] = (byte) (local103 >>> 32);
			arg0[local96 + 4] = (byte) (local103 >>> 24);
			arg0[local96 + 5] = (byte) (local103 >>> 16);
			arg0[local96 + 6] = (byte) (local103 >>> 8);
			arg0[local96 + 7] = (byte) local103;
			local96 += 8;
			local94++;
		}
	}
}
