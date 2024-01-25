import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public final class Class129 {

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "[J")
	private final long[] aLongArray5 = new long[8];

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "I")
	private int anInt3756 = 0;

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "[B")
	private final byte[] aByteArray17 = new byte[64];

	@OriginalMember(owner = "client!hda", name = "k", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!hda", name = "e", descriptor = "[J")
	private final long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!hda", name = "m", descriptor = "I")
	private int anInt3761 = 0;

	@OriginalMember(owner = "client!hda", name = "n", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!hda", name = "p", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!hda", name = "j", descriptor = "[B")
	private final byte[] aByteArray18 = new byte[32];

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(J[BI)V")
	public void method3276(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(28) int local28 = this.anInt3761 & 0x7;
		@Pc(30) long local30 = arg0;
		@Pc(32) int local32 = 31;
		@Pc(34) int local34 = 0;
		while (local32 >= 0) {
			local34 += (this.aByteArray18[local32] & 0xFF) + ((int) local30 & 0xFF);
			this.aByteArray18[local32] = (byte) local34;
			local34 >>>= 0x8;
			local30 >>>= 0x8;
			local32--;
		}
		@Pc(94) int local94;
		while (arg0 > 8L) {
			local94 = arg1[local7] << local17 & 0xFF | (arg1[local7 - -1] & 0xFF) >>> 8 - local17;
			if (local94 < 0 || local94 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray17[this.anInt3756] = (byte) (this.aByteArray17[this.anInt3756] | local94 >>> local28);
			this.anInt3756++;
			this.anInt3761 += 8 - local28;
			if (this.anInt3761 == 512) {
				this.method3277();
				this.anInt3761 = this.anInt3756 = 0;
			}
			this.aByteArray17[this.anInt3756] = (byte) (local94 << 8 - local28 & 0xFF);
			arg0 -= 8L;
			local7++;
			this.anInt3761 += local28;
		}
		if (arg0 > 0L) {
			local94 = arg1[local7] << local17 & 0xFF;
			this.aByteArray17[this.anInt3756] = (byte) (this.aByteArray17[this.anInt3756] | local94 >>> local28);
		} else {
			local94 = 0;
		}
		if ((long) local28 + arg0 < 8L) {
			this.anInt3761 = (int) ((long) this.anInt3761 + arg0);
			return;
		}
		this.anInt3756++;
		arg0 -= 8 - local28;
		this.anInt3761 += 8 - local28;
		if (this.anInt3761 == 512) {
			this.method3277();
			this.anInt3761 = this.anInt3756 = 0;
		}
		this.aByteArray17[this.anInt3756] = (byte) (local94 << 8 - local28 & 0xFF);
		this.anInt3761 += (int) arg0;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)V")
	private void method3277() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray7[local7] = Static28.method885(Static28.method885(Static28.method885(Static423.method6099((long) this.aByteArray17[local9 + 5] << 16, 0xFFL << 16), Static28.method885(Static28.method885(Static28.method885(Static28.method885((long) this.aByteArray17[local9] << 56, Static423.method6099((long) this.aByteArray17[local9 + 1] << 48, 0xFFL << 48)), Static423.method6099(0xFFL << 40, (long) this.aByteArray17[local9 + 2] << 40)), Static423.method6099((long) this.aByteArray17[local9 + 3] << 32, 0xFFL << 32)), Static423.method6099(0xFFL << 24, (long) this.aByteArray17[local9 + 4] << 24))), Static423.method6099(255L, (long) this.aByteArray17[local9 + 6]) << 8), Static423.method6099(255L, (long) this.aByteArray17[local9 + 7]));
			local9 += 8;
			local7++;
		}
		for (@Pc(121) int local121 = 0; local121 < 8; local121++) {
			this.aLongArray9[local121] = Static28.method885(this.aLongArray7[local121], this.aLongArray6[local121] = this.aLongArray8[local121]);
		}
		@Pc(153) int local153;
		for (@Pc(149) int local149 = 1; local149 <= 10; local149++) {
			@Pc(162) int local162;
			@Pc(164) int local164;
			for (local153 = 0; local153 < 8; local153++) {
				this.aLongArray5[local153] = 0L;
				local162 = 0;
				local164 = 56;
				while (local162 < 8) {
					this.aLongArray5[local153] = Static28.method885(this.aLongArray5[local153], Class318.aLongArrayArray1[local162][(int) (this.aLongArray6[local153 - local162 & 0x7] >>> local164) & 0xFF]);
					local164 -= 8;
					local162++;
				}
			}
			for (local162 = 0; local162 < 8; local162++) {
				this.aLongArray6[local162] = this.aLongArray5[local162];
			}
			this.aLongArray6[0] = Static28.method885(this.aLongArray6[0], Class318.aLongArray15[local149]);
			@Pc(248) int local248;
			for (local164 = 0; local164 < 8; local164++) {
				this.aLongArray5[local164] = this.aLongArray6[local164];
				local248 = 0;
				@Pc(250) int local250 = 56;
				while (local248 < 8) {
					this.aLongArray5[local164] = Static28.method885(this.aLongArray5[local164], Class318.aLongArrayArray1[local248][(int) (this.aLongArray9[local164 - local248 & 0x7] >>> local250) & 0xFF]);
					local250 -= 8;
					local248++;
				}
			}
			for (local248 = 0; local248 < 8; local248++) {
				this.aLongArray9[local248] = this.aLongArray5[local248];
			}
		}
		for (local153 = 0; local153 < 8; local153++) {
			this.aLongArray8[local153] = Static28.method885(this.aLongArray8[local153], Static28.method885(this.aLongArray9[local153], this.aLongArray7[local153]));
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V")
	public void method3278() {
		for (@Pc(3) int local3 = 0; local3 < 32; local3++) {
			this.aByteArray18[local3] = 0;
		}
		this.anInt3761 = this.anInt3756 = 0;
		this.aByteArray17[0] = 0;
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			this.aLongArray8[local31] = 0L;
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IB[B)V")
	public void method3280(@OriginalArg(2) byte[] arg0) {
		this.aByteArray17[this.anInt3756] = (byte) (this.aByteArray17[this.anInt3756] | 0x80 >>> (this.anInt3761 & 0x7));
		this.anInt3756++;
		if (this.anInt3756 > 32) {
			while (true) {
				if (this.anInt3756 >= 64) {
					this.method3277();
					this.anInt3756 = 0;
					break;
				}
				this.aByteArray17[this.anInt3756++] = 0;
			}
		}
		while (this.anInt3756 < 32) {
			this.aByteArray17[this.anInt3756++] = 0;
		}
		Static601.method2938(this.aByteArray18, 0, this.aByteArray17, 32, 32);
		this.method3277();
		@Pc(92) int local92 = 0;
		@Pc(94) int local94 = 0;
		while (local92 < 8) {
			@Pc(101) long local101 = this.aLongArray8[local92];
			arg0[local94] = (byte) (local101 >>> 56);
			arg0[local94 + 1] = (byte) (local101 >>> 48);
			arg0[local94 + 2] = (byte) (local101 >>> 40);
			arg0[local94 + 3] = (byte) (local101 >>> 32);
			arg0[local94 + 4] = (byte) (local101 >>> 24);
			arg0[local94 + 5] = (byte) (local101 >>> 16);
			arg0[local94 + 6] = (byte) (local101 >>> 8);
			arg0[local94 + 7] = (byte) local101;
			local94 += 8;
			local92++;
		}
	}
}
