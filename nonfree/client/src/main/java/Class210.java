import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class210 {

	@OriginalMember(owner = "client!lca", name = "j", descriptor = "[J")
	private long[] aLongArray17 = new long[8];

	@OriginalMember(owner = "client!lca", name = "p", descriptor = "[J")
	private final long[] aLongArray16 = new long[8];

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "[J")
	private final long[] aLongArray15 = new long[8];

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "I")
	private int anInt5934 = 0;

	@OriginalMember(owner = "client!lca", name = "l", descriptor = "[J")
	private final long[] aLongArray18 = new long[8];

	@OriginalMember(owner = "client!lca", name = "d", descriptor = "[J")
	private final long[] aLongArray19 = new long[8];

	@OriginalMember(owner = "client!lca", name = "g", descriptor = "[B")
	private final byte[] aByteArray47 = new byte[64];

	@OriginalMember(owner = "client!lca", name = "h", descriptor = "[B")
	private final byte[] aByteArray48 = new byte[32];

	@OriginalMember(owner = "client!lca", name = "q", descriptor = "I")
	private int anInt5932 = 0;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(BJ[B)V")
	public void method5048(@OriginalArg(1) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(22) int local22 = this.anInt5932 & 0x7;
		@Pc(24) long local24 = arg0;
		@Pc(34) int local34 = 31;
		@Pc(36) int local36 = 0;
		while (local34 >= 0) {
			local36 += (this.aByteArray48[local34] & 0xFF) + ((int) local24 & 0xFF);
			this.aByteArray48[local34] = (byte) local36;
			local24 >>>= 0x8;
			local36 >>>= 0x8;
			local34--;
		}
		@Pc(101) int local101;
		while (arg0 > 8L) {
			local101 = arg1[local7] << local17 & 0xFF | (arg1[local7 + 1] & 0xFF) >>> 8 - local17;
			if (local101 < 0 || local101 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray47[this.anInt5934] = (byte) (this.aByteArray47[this.anInt5934] | local101 >>> local22);
			this.anInt5932 += 8 - local22;
			this.anInt5934++;
			if (this.anInt5932 == 512) {
				this.method5054(-63);
				this.anInt5932 = this.anInt5934 = 0;
			}
			this.aByteArray47[this.anInt5934] = (byte) (local101 << 8 - local22 & 0xFF);
			local7++;
			this.anInt5932 += local22;
			arg0 -= 8L;
		}
		if (arg0 > 0L) {
			local101 = arg1[local7] << local17 & 0xFF;
			this.aByteArray47[this.anInt5934] = (byte) (this.aByteArray47[this.anInt5934] | local101 >>> local22);
		} else {
			local101 = 0;
		}
		if (arg0 + (long) local22 < 8L) {
			this.anInt5932 = (int) ((long) this.anInt5932 + arg0);
			return;
		}
		this.anInt5934++;
		this.anInt5932 += 8 - local22;
		arg0 -= (long) (8 - local22);
		if (this.anInt5932 == 512) {
			this.method5054(-71);
			this.anInt5932 = this.anInt5934 = 0;
		}
		this.aByteArray47[this.anInt5934] = (byte) (local101 << 8 - local22 & 0xFF);
		this.anInt5932 += (int) arg0;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V")
	public void method5050() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray48[local7] = 0;
		}
		this.anInt5932 = this.anInt5934 = 0;
		this.aByteArray47[0] = 0;
		for (@Pc(34) int local34 = 0; local34 < 8; local34++) {
			this.aLongArray19[local34] = 0L;
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
	private void method5054(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		while (local3 < 8) {
			this.aLongArray15[local3] = Static379.method5558(Static164.method2212(255L, (long) this.aByteArray47[local5 + 7]), Static379.method5558(Static379.method5558(Static164.method2212((long) this.aByteArray47[local5 + 5], 255L) << 16, Static379.method5558(Static379.method5558(Static379.method5558(Static164.method2212((long) this.aByteArray47[local5 + 2] << 40, 0xFFL << 40), Static379.method5558((long) this.aByteArray47[local5] << 56, Static164.method2212(0xFFL << 48, (long) this.aByteArray47[local5 + 1] << 48))), Static164.method2212((long) this.aByteArray47[local5 + 3], 255L) << 32), Static164.method2212(0xFFL << 24, (long) this.aByteArray47[local5 + 4] << 24))), Static164.method2212((long) this.aByteArray47[local5 + 6], 255L) << 8));
			local5 += 8;
			local3++;
		}
		for (@Pc(119) int local119 = 0; local119 < 8; local119++) {
			this.aLongArray16[local119] = Static379.method5558(this.aLongArray15[local119], this.aLongArray18[local119] = this.aLongArray19[local119]);
		}
		if (arg0 > -7) {
			this.aLongArray17 = null;
		}
		@Pc(167) int local167;
		for (@Pc(163) int local163 = 1; local163 <= 10; local163++) {
			@Pc(176) int local176;
			@Pc(178) int local178;
			for (local167 = 0; local167 < 8; local167++) {
				this.aLongArray17[local167] = 0L;
				local176 = 0;
				local178 = 56;
				while (local176 < 8) {
					this.aLongArray17[local167] = Static379.method5558(this.aLongArray17[local167], Class202.aLongArrayArray1[local176][(int) (this.aLongArray18[local167 - local176 & 0x7] >>> local178) & 0xFF]);
					local176++;
					local178 -= 8;
				}
			}
			for (local176 = 0; local176 < 8; local176++) {
				this.aLongArray18[local176] = this.aLongArray17[local176];
			}
			this.aLongArray18[0] = Static379.method5558(this.aLongArray18[0], Class202.aLongArray12[local163]);
			@Pc(274) int local274;
			for (local178 = 0; local178 < 8; local178++) {
				this.aLongArray17[local178] = this.aLongArray18[local178];
				local274 = 0;
				@Pc(276) int local276 = 56;
				while (local274 < 8) {
					this.aLongArray17[local178] = Static379.method5558(this.aLongArray17[local178], Class202.aLongArrayArray1[local274][(int) (this.aLongArray16[local178 - local274 & 0x7] >>> local276) & 0xFF]);
					local274++;
					local276 -= 8;
				}
			}
			for (local274 = 0; local274 < 8; local274++) {
				this.aLongArray16[local274] = this.aLongArray17[local274];
			}
		}
		for (local167 = 0; local167 < 8; local167++) {
			this.aLongArray19[local167] = Static379.method5558(this.aLongArray19[local167], Static379.method5558(this.aLongArray15[local167], this.aLongArray16[local167]));
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(BI[B)V")
	public void method5057(@OriginalArg(2) byte[] arg0) {
		this.aByteArray47[this.anInt5934] = (byte) (this.aByteArray47[this.anInt5934] | 0x80 >>> (this.anInt5932 & 0x7));
		this.anInt5934++;
		if (this.anInt5934 > 32) {
			while (true) {
				if (this.anInt5934 >= 64) {
					this.method5054(-28);
					this.anInt5934 = 0;
					break;
				}
				this.aByteArray47[this.anInt5934++] = 0;
			}
		}
		while (this.anInt5934 < 32) {
			this.aByteArray47[this.anInt5934++] = 0;
		}
		Static682.method799(this.aByteArray48, 0, this.aByteArray47, 32, 32);
		this.method5054(-47);
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		while (local110 < 8) {
			@Pc(119) long local119 = this.aLongArray19[local110];
			arg0[local112] = (byte) (int) (local119 >>> 56);
			arg0[local112 + 1] = (byte) (int) (local119 >>> 48);
			arg0[local112 + 2] = (byte) (int) (local119 >>> 40);
			arg0[local112 + 3] = (byte) (int) (local119 >>> 32);
			arg0[local112 + 4] = (byte) (int) (local119 >>> 24);
			arg0[local112 + 5] = (byte) (int) (local119 >>> 16);
			arg0[local112 + 6] = (byte) (int) (local119 >>> 8);
			arg0[local112 + 7] = (byte) (int) local119;
			local112 += 8;
			local110++;
		}
	}
}
