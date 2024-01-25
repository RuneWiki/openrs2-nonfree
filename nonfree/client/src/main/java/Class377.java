import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class377 {

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "[J")
	public static final long[] aLongArray16 = new long[256];

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
	private int anInt10713 = 0;

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "[J")
	private final long[] aLongArray15 = new long[8];

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "[J")
	private final long[] aLongArray12 = new long[8];

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "[J")
	private final long[] aLongArray14 = new long[8];

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "[B")
	private final byte[] aByteArray106 = new byte[64];

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "[J")
	private final long[] aLongArray11 = new long[8];

	@OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
	private int anInt10716 = 0;

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "[J")
	private final long[] aLongArray13 = new long[8];

	@OriginalMember(owner = "client!wn", name = "r", descriptor = "[B")
	private final byte[] aByteArray107 = new byte[32];

	static {
		for (@Pc(9) int local9 = 0; local9 < 256; local9++) {
			@Pc(13) long local13 = (long) local9;
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if ((local13 & 0x1L) == 1L) {
					local13 = local13 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local13 >>>= 0x1;
				}
			}
			aLongArray16[local9] = local13;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([BIJ)V")
	public void method8738(@OriginalArg(0) byte[] arg0, @OriginalArg(2) long arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(27) int local27 = this.anInt10716 & 0x7;
		@Pc(29) long local29 = arg1;
		@Pc(31) int local31 = 31;
		@Pc(33) int local33 = 0;
		while (local31 >= 0) {
			local33 += (this.aByteArray107[local31] & 0xFF) + ((int) local29 & 0xFF);
			this.aByteArray107[local31] = (byte) local33;
			local29 >>>= 0x8;
			local33 >>>= 0x8;
			local31--;
		}
		@Pc(89) int local89;
		while (arg1 > 8L) {
			local89 = arg0[local7] << local17 & 0xFF | (arg0[local7 + 1] & 0xFF) >>> 8 - local17;
			if (local89 < 0 || local89 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray106[this.anInt10713] = (byte) (this.aByteArray106[this.anInt10713] | local89 >>> local27);
			this.anInt10713++;
			this.anInt10716 += 8 - local27;
			if (this.anInt10716 == 512) {
				this.method8741();
				this.anInt10716 = this.anInt10713 = 0;
			}
			this.aByteArray106[this.anInt10713] = (byte) (local89 << 8 - local27 & 0xFF);
			this.anInt10716 += local27;
			arg1 -= 8L;
			local7++;
		}
		if (arg1 > 0L) {
			local89 = arg0[local7] << local17 & 0xFF;
			this.aByteArray106[this.anInt10713] = (byte) (this.aByteArray106[this.anInt10713] | local89 >>> local27);
		} else {
			local89 = 0;
		}
		if (arg1 + (long) local27 < 8L) {
			this.anInt10716 = (int) ((long) this.anInt10716 + arg1);
			return;
		}
		this.anInt10713++;
		arg1 -= (long) (8 - local27);
		this.anInt10716 += 8 - local27;
		if (this.anInt10716 == 512) {
			this.method8741();
			this.anInt10716 = this.anInt10713 = 0;
		}
		this.aByteArray106[this.anInt10713] = (byte) (local89 << 8 - local27 & 0xFF);
		this.anInt10716 += (int) arg1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BI[B)V")
	public void method8739(@OriginalArg(2) byte[] arg0) {
		this.aByteArray106[this.anInt10713] = (byte) (this.aByteArray106[this.anInt10713] | 0x80 >>> (this.anInt10716 & 0x7));
		this.anInt10713++;
		if (this.anInt10713 > 32) {
			while (true) {
				if (this.anInt10713 >= 64) {
					this.method8741();
					this.anInt10713 = 0;
					break;
				}
				this.aByteArray106[this.anInt10713++] = 0;
			}
		}
		while (this.anInt10713 < 32) {
			this.aByteArray106[this.anInt10713++] = 0;
		}
		Static653.method6537(this.aByteArray107, 0, this.aByteArray106, 32, 32);
		this.method8741();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		while (local98 < 8) {
			@Pc(107) long local107 = this.aLongArray12[local98];
			arg0[local100] = (byte) (int) (local107 >>> 56);
			arg0[local100 + 1] = (byte) (int) (local107 >>> 48);
			arg0[local100 + 2] = (byte) (int) (local107 >>> 40);
			arg0[local100 + 3] = (byte) (int) (local107 >>> 32);
			arg0[local100 + 4] = (byte) (int) (local107 >>> 24);
			arg0[local100 + 5] = (byte) (int) (local107 >>> 16);
			arg0[local100 + 6] = (byte) (int) (local107 >>> 8);
			arg0[local100 + 7] = (byte) (int) local107;
			local100 += 8;
			local98++;
		}
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)V")
	public void method8740() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray107[local7] = 0;
		}
		this.aByteArray106[0] = 0;
		this.anInt10716 = this.anInt10713 = 0;
		for (@Pc(33) int local33 = 0; local33 < 8; local33++) {
			this.aLongArray12[local33] = 0L;
		}
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(B)V")
	private void method8741() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray13[local7] = Static121.method2598(Static72.method2066((long) this.aByteArray106[local9 + 7], 255L), Static121.method2598(Static72.method2066(0xFFL << 8, (long) this.aByteArray106[local9 + 6] << 8), Static121.method2598(Static72.method2066(255L, (long) this.aByteArray106[local9 + 5]) << 16, Static121.method2598(Static72.method2066((long) this.aByteArray106[local9 + 4], 255L) << 24, Static121.method2598(Static121.method2598(Static72.method2066(0xFFL << 40, (long) this.aByteArray106[local9 + 2] << 40), Static121.method2598(Static72.method2066(255L, (long) this.aByteArray106[local9 + 1]) << 48, (long) this.aByteArray106[local9] << 56)), Static72.method2066(0xFFL << 32, (long) this.aByteArray106[local9 + 3] << 32))))));
			local7++;
			local9 += 8;
		}
		for (@Pc(117) int local117 = 0; local117 < 8; local117++) {
			this.aLongArray15[local117] = Static121.method2598(this.aLongArray13[local117], this.aLongArray11[local117] = this.aLongArray12[local117]);
		}
		@Pc(149) int local149;
		for (@Pc(145) int local145 = 1; local145 <= 10; local145++) {
			@Pc(158) int local158;
			@Pc(160) int local160;
			for (local149 = 0; local149 < 8; local149++) {
				this.aLongArray14[local149] = 0L;
				local158 = 0;
				local160 = 56;
				while (local158 < 8) {
					this.aLongArray14[local149] = Static121.method2598(this.aLongArray14[local149], Class39.aLongArrayArray1[local158][(int) (this.aLongArray11[local149 - local158 & 0x7] >>> local160) & 0xFF]);
					local158++;
					local160 -= 8;
				}
			}
			for (local158 = 0; local158 < 8; local158++) {
				this.aLongArray11[local158] = this.aLongArray14[local158];
			}
			this.aLongArray11[0] = Static121.method2598(this.aLongArray11[0], Class39.aLongArray2[local145]);
			@Pc(242) int local242;
			for (local160 = 0; local160 < 8; local160++) {
				this.aLongArray14[local160] = this.aLongArray11[local160];
				local242 = 0;
				@Pc(244) int local244 = 56;
				while (local242 < 8) {
					this.aLongArray14[local160] = Static121.method2598(this.aLongArray14[local160], Class39.aLongArrayArray1[local242][(int) (this.aLongArray15[local160 - local242 & 0x7] >>> local244) & 0xFF]);
					local244 -= 8;
					local242++;
				}
			}
			for (local242 = 0; local242 < 8; local242++) {
				this.aLongArray15[local242] = this.aLongArray14[local242];
			}
		}
		for (local149 = 0; local149 < 8; local149++) {
			this.aLongArray12[local149] = Static121.method2598(this.aLongArray12[local149], Static121.method2598(this.aLongArray13[local149], this.aLongArray15[local149]));
		}
	}
}
