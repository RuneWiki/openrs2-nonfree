import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class274 {

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
	private int anInt7286 = 0;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "[J")
	private final long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
	private int anInt7287 = 0;

	@OriginalMember(owner = "client!pu", name = "h", descriptor = "[B")
	private final byte[] aByteArray98 = new byte[32];

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "[B")
	private final byte[] aByteArray99 = new byte[64];

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "[J")
	private final long[] aLongArray10 = new long[8];

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
	private void method6039() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray6[local7] = Static550.method7600(Static550.method7600(Static550.method7600(Static550.method7600(Static218.method3781(0xFFL << 24, (long) this.aByteArray99[local9 + 4] << 24), Static550.method7600(Static550.method7600(Static218.method3781((long) this.aByteArray99[local9 + 2] << 40, 0xFFL << 40), Static550.method7600((long) this.aByteArray99[local9] << 56, Static218.method3781(0xFFL << 48, (long) this.aByteArray99[local9 + 1] << 48))), Static218.method3781((long) this.aByteArray99[local9 + 3], 255L) << 32)), Static218.method3781(255L, (long) this.aByteArray99[local9 + 5]) << 16), Static218.method3781(0xFFL << 8, (long) this.aByteArray99[local9 + 6] << 8)), Static218.method3781(255L, (long) this.aByteArray99[local9 + 7]));
			local9 += 8;
			local7++;
		}
		for (@Pc(121) int local121 = 0; local121 < 8; local121++) {
			this.aLongArray7[local121] = Static550.method7600(this.aLongArray6[local121], this.aLongArray9[local121] = this.aLongArray10[local121]);
		}
		@Pc(153) int local153;
		for (@Pc(149) int local149 = 1; local149 <= 10; local149++) {
			@Pc(162) int local162;
			@Pc(164) int local164;
			for (local153 = 0; local153 < 8; local153++) {
				this.aLongArray8[local153] = 0L;
				local162 = 0;
				local164 = 56;
				while (local162 < 8) {
					this.aLongArray8[local153] = Static550.method7600(this.aLongArray8[local153], Class303.aLongArrayArray3[local162][(int) (this.aLongArray9[local153 - local162 & 0x7] >>> local164) & 0xFF]);
					local162++;
					local164 -= 8;
				}
			}
			for (local162 = 0; local162 < 8; local162++) {
				this.aLongArray9[local162] = this.aLongArray8[local162];
			}
			this.aLongArray9[0] = Static550.method7600(this.aLongArray9[0], Class303.aLongArray18[local149]);
			@Pc(247) int local247;
			for (local164 = 0; local164 < 8; local164++) {
				this.aLongArray8[local164] = this.aLongArray9[local164];
				local247 = 0;
				@Pc(249) int local249 = 56;
				while (local247 < 8) {
					this.aLongArray8[local164] = Static550.method7600(this.aLongArray8[local164], Class303.aLongArrayArray3[local247][(int) (this.aLongArray7[local164 - local247 & 0x7] >>> local249) & 0xFF]);
					local249 -= 8;
					local247++;
				}
			}
			for (local247 = 0; local247 < 8; local247++) {
				this.aLongArray7[local247] = this.aLongArray8[local247];
			}
		}
		for (local153 = 0; local153 < 8; local153++) {
			this.aLongArray10[local153] = Static550.method7600(this.aLongArray10[local153], Static550.method7600(this.aLongArray7[local153], this.aLongArray6[local153]));
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BJ[B)V")
	public void method6041(@OriginalArg(1) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(22) int local22 = this.anInt7286 & 0x7;
		@Pc(24) long local24 = arg0;
		@Pc(26) int local26 = 31;
		@Pc(34) int local34 = 0;
		while (local26 >= 0) {
			local34 += (this.aByteArray98[local26] & 0xFF) + ((int) local24 & 0xFF);
			this.aByteArray98[local26] = (byte) local34;
			local24 >>>= 0x8;
			local34 >>>= 0x8;
			local26--;
		}
		@Pc(93) int local93;
		while (arg0 > 8L) {
			local93 = arg1[local7] << local17 & 0xFF | (arg1[local7 + 1] & 0xFF) >>> 8 - local17;
			if (local93 < 0 || local93 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray99[this.anInt7287] = (byte) (this.aByteArray99[this.anInt7287] | local93 >>> local22);
			this.anInt7286 += 8 - local22;
			this.anInt7287++;
			if (this.anInt7286 == 512) {
				this.method6039();
				this.anInt7286 = this.anInt7287 = 0;
			}
			this.aByteArray99[this.anInt7287] = (byte) (local93 << 8 - local22 & 0xFF);
			arg0 -= 8L;
			this.anInt7286 += local22;
			local7++;
		}
		if (arg0 <= 0L) {
			local93 = 0;
		} else {
			local93 = arg1[local7] << local17 & 0xFF;
			this.aByteArray99[this.anInt7287] = (byte) (this.aByteArray99[this.anInt7287] | local93 >>> local22);
		}
		if ((long) local22 + arg0 < 8L) {
			this.anInt7286 = (int) ((long) this.anInt7286 + arg0);
			return;
		}
		arg0 -= 8 - local22;
		this.anInt7287++;
		this.anInt7286 += 8 - local22;
		if (this.anInt7286 == 512) {
			this.method6039();
			this.anInt7286 = this.anInt7287 = 0;
		}
		this.aByteArray99[this.anInt7287] = (byte) (local93 << 8 - local22 & 0xFF);
		this.anInt7286 += (int) arg0;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II[B)V")
	public void method6042(@OriginalArg(2) byte[] arg0) {
		this.aByteArray99[this.anInt7287] = (byte) (this.aByteArray99[this.anInt7287] | 0x80 >>> (this.anInt7286 & 0x7));
		this.anInt7287++;
		if (this.anInt7287 > 32) {
			while (true) {
				if (this.anInt7287 >= 64) {
					this.method6039();
					this.anInt7287 = 0;
					break;
				}
				this.aByteArray99[this.anInt7287++] = 0;
			}
		}
		while (this.anInt7287 < 32) {
			this.aByteArray99[this.anInt7287++] = 0;
		}
		Static602.method1586(this.aByteArray98, 0, this.aByteArray99, 32, 32);
		this.method6039();
		@Pc(88) int local88 = 0;
		@Pc(98) int local98 = 0;
		while (local88 < 8) {
			@Pc(105) long local105 = this.aLongArray10[local88];
			arg0[local98] = (byte) (local105 >>> 56);
			arg0[local98 + 1] = (byte) (local105 >>> 48);
			arg0[local98 + 2] = (byte) (local105 >>> 40);
			arg0[local98 + 3] = (byte) (local105 >>> 32);
			arg0[local98 + 4] = (byte) (local105 >>> 24);
			arg0[local98 + 5] = (byte) (local105 >>> 16);
			arg0[local98 + 6] = (byte) (local105 >>> 8);
			arg0[local98 + 7] = (byte) local105;
			local98 += 8;
			local88++;
		}
	}

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)V")
	public void method6043() {
		for (@Pc(3) int local3 = 0; local3 < 32; local3++) {
			this.aByteArray98[local3] = 0;
		}
		this.anInt7286 = this.anInt7287 = 0;
		this.aByteArray99[0] = 0;
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			this.aLongArray10[local31] = 0L;
		}
	}
}
