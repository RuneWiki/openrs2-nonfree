import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class13 {

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "[B")
	private final byte[] aByteArray16 = new byte[64];

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "[J")
	private final long[] aLongArray2 = new long[8];

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
	private int anInt357 = 0;

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
	private int anInt359 = 0;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "[J")
	private final long[] aLongArray1 = new long[8];

	@OriginalMember(owner = "client!aj", name = "q", descriptor = "[J")
	private final long[] aLongArray4 = new long[8];

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "[J")
	private final long[] aLongArray3 = new long[8];

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "[J")
	private final long[] aLongArray5 = new long[8];

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "[B")
	private final byte[] aByteArray17 = new byte[32];

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
	private void method464() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray4[local7] = Static483.method7198(Static397.method6345((long) this.aByteArray16[local9 + 7], 255L), Static483.method7198(Static397.method6345((long) this.aByteArray16[local9 + 6] << 8, 0xFFL << 8), Static483.method7198(Static483.method7198(Static397.method6345(0xFFL << 24, (long) this.aByteArray16[local9 + 4] << 24), Static483.method7198(Static483.method7198(Static397.method6345(255L, (long) this.aByteArray16[local9 + 2]) << 40, Static483.method7198((long) this.aByteArray16[local9] << 56, Static397.method6345(0xFFL << 48, (long) this.aByteArray16[local9 + 1] << 48))), Static397.method6345(255L, (long) this.aByteArray16[local9 + 3]) << 32)), Static397.method6345(0xFFL << 16, (long) this.aByteArray16[local9 + 5] << 16))));
			local9 += 8;
			local7++;
		}
		for (@Pc(119) int local119 = 0; local119 < 8; local119++) {
			this.aLongArray1[local119] = Static483.method7198(this.aLongArray4[local119], this.aLongArray5[local119] = this.aLongArray3[local119]);
		}
		@Pc(154) int local154;
		for (@Pc(150) int local150 = 1; local150 <= 10; local150++) {
			@Pc(163) int local163;
			@Pc(165) int local165;
			for (local154 = 0; local154 < 8; local154++) {
				this.aLongArray2[local154] = 0L;
				local163 = 0;
				local165 = 56;
				while (local163 < 8) {
					this.aLongArray2[local154] = Static483.method7198(this.aLongArray2[local154], Class203.aLongArrayArray1[local163][(int) (this.aLongArray5[local154 - local163 & 0x7] >>> local165) & 0xFF]);
					local163++;
					local165 -= 8;
				}
			}
			for (local163 = 0; local163 < 8; local163++) {
				this.aLongArray5[local163] = this.aLongArray2[local163];
			}
			this.aLongArray5[0] = Static483.method7198(this.aLongArray5[0], Class203.aLongArray10[local150]);
			@Pc(248) int local248;
			for (local165 = 0; local165 < 8; local165++) {
				this.aLongArray2[local165] = this.aLongArray5[local165];
				local248 = 0;
				@Pc(250) int local250 = 56;
				while (local248 < 8) {
					this.aLongArray2[local165] = Static483.method7198(this.aLongArray2[local165], Class203.aLongArrayArray1[local248][(int) (this.aLongArray1[local165 - local248 & 0x7] >>> local250) & 0xFF]);
					local248++;
					local250 -= 8;
				}
			}
			for (local248 = 0; local248 < 8; local248++) {
				this.aLongArray1[local248] = this.aLongArray2[local248];
			}
		}
		for (local154 = 0; local154 < 8; local154++) {
			this.aLongArray3[local154] = Static483.method7198(this.aLongArray3[local154], Static483.method7198(this.aLongArray1[local154], this.aLongArray4[local154]));
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(J[BB)V")
	public void method465(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(22) int local22 = this.anInt359 & 0x7;
		@Pc(32) long local32 = arg0;
		@Pc(34) int local34 = 31;
		@Pc(36) int local36 = 0;
		while (local34 >= 0) {
			local36 += ((int) local32 & 0xFF) + (this.aByteArray17[local34] & 0xFF);
			this.aByteArray17[local34] = (byte) local36;
			local36 >>>= 0x8;
			local32 >>>= 0x8;
			local34--;
		}
		@Pc(95) int local95;
		while (arg0 > 8L) {
			local95 = arg1[local7] << local17 & 0xFF | (arg1[local7 + 1] & 0xFF) >>> 8 - local17;
			if (local95 < 0 || local95 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray16[this.anInt357] = (byte) (this.aByteArray16[this.anInt357] | local95 >>> local22);
			this.anInt359 += 8 - local22;
			this.anInt357++;
			if (this.anInt359 == 512) {
				this.method464();
				this.anInt359 = this.anInt357 = 0;
			}
			this.aByteArray16[this.anInt357] = (byte) (local95 << 8 - local22 & 0xFF);
			arg0 -= 8L;
			this.anInt359 += local22;
			local7++;
		}
		if (arg0 <= 0L) {
			local95 = 0;
		} else {
			local95 = arg1[local7] << local17 & 0xFF;
			this.aByteArray16[this.anInt357] = (byte) (this.aByteArray16[this.anInt357] | local95 >>> local22);
		}
		if (arg0 + (long) local22 < 8L) {
			this.anInt359 = (int) ((long) this.anInt359 + arg0);
			return;
		}
		this.anInt357++;
		arg0 -= 8 - local22;
		this.anInt359 += 8 - local22;
		if (this.anInt359 == 512) {
			this.method464();
			this.anInt359 = this.anInt357 = 0;
		}
		this.aByteArray16[this.anInt357] = (byte) (local95 << 8 - local22 & 0xFF);
		this.anInt359 += (int) arg0;
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
	public void method467() {
		for (@Pc(3) int local3 = 0; local3 < 32; local3++) {
			this.aByteArray17[local3] = 0;
		}
		this.anInt359 = this.anInt357 = 0;
		this.aByteArray16[0] = 0;
		for (@Pc(33) int local33 = 0; local33 < 8; local33++) {
			this.aLongArray3[local33] = 0L;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B[BI)V")
	public void method468(@OriginalArg(1) byte[] arg0) {
		this.aByteArray16[this.anInt357] = (byte) (this.aByteArray16[this.anInt357] | 0x80 >>> (this.anInt359 & 0x7));
		this.anInt357++;
		if (this.anInt357 > 32) {
			while (true) {
				if (this.anInt357 >= 64) {
					this.method464();
					this.anInt357 = 0;
					break;
				}
				this.aByteArray16[this.anInt357++] = 0;
			}
		}
		while (this.anInt357 < 32) {
			this.aByteArray16[this.anInt357++] = 0;
		}
		Static553.method3373(this.aByteArray17, 0, this.aByteArray16, 32, 32);
		this.method464();
		@Pc(94) int local94 = 0;
		@Pc(96) int local96 = 0;
		while (local94 < 8) {
			@Pc(103) long local103 = this.aLongArray3[local94];
			arg0[local96] = (byte) (local103 >>> 56);
			arg0[local96 + 1] = (byte) (local103 >>> 48);
			arg0[local96 + 2] = (byte) (local103 >>> 40);
			arg0[local96 + 3] = (byte) (local103 >>> 32);
			arg0[local96 + 4] = (byte) (local103 >>> 24);
			arg0[local96 + 5] = (byte) (local103 >>> 16);
			arg0[local96 + 6] = (byte) (local103 >>> 8);
			arg0[local96 + 7] = (byte) local103;
			local94++;
			local96 += 8;
		}
	}
}
