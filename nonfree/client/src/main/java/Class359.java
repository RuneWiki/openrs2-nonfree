import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class359 {

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "[J")
	private final long[] aLongArray15 = new long[8];

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
	private int anInt9521 = 0;

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "[J")
	private final long[] aLongArray17 = new long[8];

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
	private int anInt9525 = 0;

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "[B")
	private final byte[] aByteArray101 = new byte[64];

	@OriginalMember(owner = "client!wj", name = "r", descriptor = "[J")
	private final long[] aLongArray19 = new long[8];

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "[J")
	private final long[] aLongArray16 = new long[8];

	@OriginalMember(owner = "client!wj", name = "n", descriptor = "[B")
	private final byte[] aByteArray102 = new byte[32];

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "[J")
	private final long[] aLongArray18 = new long[8];

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	public void method7916() {
		for (@Pc(3) int local3 = 0; local3 < 32; local3++) {
			this.aByteArray102[local3] = 0;
		}
		this.anInt9521 = this.anInt9525 = 0;
		this.aByteArray101[0] = 0;
		for (@Pc(39) int local39 = 0; local39 < 8; local39++) {
			this.aLongArray17[local39] = 0L;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
	private void method7917() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray19[local7] = Static295.method7106(Static114.method1696(255L, (long) this.aByteArray101[local9 + 7]), Static295.method7106(Static114.method1696(255L, (long) this.aByteArray101[local9 + 6]) << 8, Static295.method7106(Static295.method7106(Static114.method1696((long) this.aByteArray101[local9 + 4] << 24, 0xFFL << 24), Static295.method7106(Static114.method1696((long) this.aByteArray101[local9 + 3] << 32, 0xFFL << 32), Static295.method7106(Static295.method7106(Static114.method1696((long) this.aByteArray101[local9 + 1] << 48, 0xFFL << 48), (long) this.aByteArray101[local9] << 56), Static114.method1696((long) this.aByteArray101[local9 + 2], 255L) << 40))), Static114.method1696(255L, (long) this.aByteArray101[local9 + 5]) << 16)));
			local7++;
			local9 += 8;
		}
		for (@Pc(117) int local117 = 0; local117 < 8; local117++) {
			this.aLongArray16[local117] = Static295.method7106(this.aLongArray19[local117], this.aLongArray15[local117] = this.aLongArray17[local117]);
		}
		@Pc(149) int local149;
		for (@Pc(145) int local145 = 1; local145 <= 10; local145++) {
			@Pc(158) int local158;
			@Pc(160) int local160;
			for (local149 = 0; local149 < 8; local149++) {
				this.aLongArray18[local149] = 0L;
				local158 = 0;
				local160 = 56;
				while (local158 < 8) {
					this.aLongArray18[local149] = Static295.method7106(this.aLongArray18[local149], Class127_Sub1_Sub1.aLongArrayArray1[local158][(int) (this.aLongArray15[local149 - local158 & 0x7] >>> local160) & 0xFF]);
					local158++;
					local160 -= 8;
				}
			}
			for (local158 = 0; local158 < 8; local158++) {
				this.aLongArray15[local158] = this.aLongArray18[local158];
			}
			this.aLongArray15[0] = Static295.method7106(this.aLongArray15[0], Class127_Sub1_Sub1.aLongArray5[local145]);
			@Pc(242) int local242;
			for (local160 = 0; local160 < 8; local160++) {
				this.aLongArray18[local160] = this.aLongArray15[local160];
				local242 = 0;
				@Pc(244) int local244 = 56;
				while (local242 < 8) {
					this.aLongArray18[local160] = Static295.method7106(this.aLongArray18[local160], Class127_Sub1_Sub1.aLongArrayArray1[local242][(int) (this.aLongArray16[local160 - local242 & 0x7] >>> local244) & 0xFF]);
					local242++;
					local244 -= 8;
				}
			}
			for (local242 = 0; local242 < 8; local242++) {
				this.aLongArray16[local242] = this.aLongArray18[local242];
			}
		}
		for (local149 = 0; local149 < 8; local149++) {
			this.aLongArray17[local149] = Static295.method7106(this.aLongArray17[local149], Static295.method7106(this.aLongArray16[local149], this.aLongArray19[local149]));
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "([BJI)V")
	public void method7918(@OriginalArg(0) byte[] arg0, @OriginalArg(1) long arg1) {
		@Pc(13) int local13 = 0;
		@Pc(23) int local23 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(28) int local28 = this.anInt9521 & 0x7;
		@Pc(30) long local30 = arg1;
		@Pc(32) int local32 = 31;
		@Pc(34) int local34 = 0;
		while (local32 >= 0) {
			local34 += ((int) local30 & 0xFF) + (this.aByteArray102[local32] & 0xFF);
			this.aByteArray102[local32] = (byte) local34;
			local30 >>>= 0x8;
			local34 >>>= 0x8;
			local32--;
		}
		@Pc(93) int local93;
		while (arg1 > 8L) {
			local93 = arg0[local13] << local23 & 0xFF | (arg0[local13 + 1] & 0xFF) >>> 8 - local23;
			if (local93 < 0 || local93 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray101[this.anInt9525] = (byte) (this.aByteArray101[this.anInt9525] | local93 >>> local28);
			this.anInt9525++;
			this.anInt9521 += 8 - local28;
			if (this.anInt9521 == 512) {
				this.method7917();
				this.anInt9521 = this.anInt9525 = 0;
			}
			this.aByteArray101[this.anInt9525] = (byte) (local93 << 8 - local28 & 0xFF);
			this.anInt9521 += local28;
			arg1 -= 8L;
			local13++;
		}
		if (arg1 > 0L) {
			local93 = arg0[local13] << local23 & 0xFF;
			this.aByteArray101[this.anInt9525] = (byte) (this.aByteArray101[this.anInt9525] | local93 >>> local28);
		} else {
			local93 = 0;
		}
		if ((long) local28 + arg1 < 8L) {
			this.anInt9521 = (int) ((long) this.anInt9521 + arg1);
			return;
		}
		this.anInt9521 += 8 - local28;
		arg1 -= 8 - local28;
		this.anInt9525++;
		if (this.anInt9521 == 512) {
			this.method7917();
			this.anInt9521 = this.anInt9525 = 0;
		}
		this.aByteArray101[this.anInt9525] = (byte) (local93 << 8 - local28 & 0xFF);
		this.anInt9521 += (int) arg1;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "([BII)V")
	public void method7920(@OriginalArg(0) byte[] arg0) {
		this.aByteArray101[this.anInt9525] = (byte) (this.aByteArray101[this.anInt9525] | 0x80 >>> (this.anInt9521 & 0x7));
		this.anInt9525++;
		if (this.anInt9525 > 32) {
			while (true) {
				if (this.anInt9525 >= 64) {
					this.method7917();
					this.anInt9525 = 0;
					break;
				}
				this.aByteArray101[this.anInt9525++] = 0;
			}
		}
		while (this.anInt9525 < 32) {
			this.aByteArray101[this.anInt9525++] = 0;
		}
		Static598.method1137(this.aByteArray102, 0, this.aByteArray101, 32, 32);
		this.method7917();
		@Pc(88) int local88 = 0;
		@Pc(90) int local90 = 0;
		while (local88 < 8) {
			@Pc(97) long local97 = this.aLongArray17[local88];
			arg0[local90] = (byte) (local97 >>> 56);
			arg0[local90 + 1] = (byte) (local97 >>> 48);
			arg0[local90 + 2] = (byte) (local97 >>> 40);
			arg0[local90 + 3] = (byte) (local97 >>> 32);
			arg0[local90 + 4] = (byte) (local97 >>> 24);
			arg0[local90 + 5] = (byte) (local97 >>> 16);
			arg0[local90 + 6] = (byte) (local97 >>> 8);
			arg0[local90 + 7] = (byte) local97;
			local90 += 8;
			local88++;
		}
	}
}
