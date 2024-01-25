import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class93 {

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
	private int anInt2185 = 0;

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "[J")
	private final long[] aLongArray4 = new long[8];

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "[J")
	private final long[] aLongArray5 = new long[8];

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "[J")
	private final long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "[J")
	private final long[] aLongArray3 = new long[8];

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
	private int anInt2186 = 0;

	@OriginalMember(owner = "client!eu", name = "q", descriptor = "[B")
	private final byte[] aByteArray37 = new byte[64];

	@OriginalMember(owner = "client!eu", name = "o", descriptor = "[B")
	private final byte[] aByteArray36 = new byte[32];

	@OriginalMember(owner = "client!eu", name = "m", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
	private void method1916() {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		while (local3 < 8) {
			this.aLongArray3[local3] = Static321.method4978(Static495.method6826((long) this.aByteArray37[local5 + 7], 255L), Static321.method4978(Static321.method4978(Static495.method6826(0xFFL << 16, (long) this.aByteArray37[local5 + 5] << 16), Static321.method4978(Static321.method4978(Static495.method6826((long) this.aByteArray37[local5 + 3] << 32, 0xFFL << 32), Static321.method4978(Static495.method6826((long) this.aByteArray37[local5 + 2], 255L) << 40, Static321.method4978(Static495.method6826(0xFFL << 48, (long) this.aByteArray37[local5 + 1] << 48), (long) this.aByteArray37[local5] << 56))), Static495.method6826((long) this.aByteArray37[local5 + 4], 255L) << 24)), Static495.method6826(0xFFL << 8, (long) this.aByteArray37[local5 + 6] << 8)));
			local5 += 8;
			local3++;
		}
		for (@Pc(121) int local121 = 0; local121 < 8; local121++) {
			this.aLongArray6[local121] = Static321.method4978(this.aLongArray3[local121], this.aLongArray4[local121] = this.aLongArray5[local121]);
		}
		@Pc(153) int local153;
		for (@Pc(149) int local149 = 1; local149 <= 10; local149++) {
			@Pc(162) int local162;
			@Pc(164) int local164;
			for (local153 = 0; local153 < 8; local153++) {
				this.aLongArray7[local153] = 0L;
				local162 = 0;
				local164 = 56;
				while (local162 < 8) {
					this.aLongArray7[local153] = Static321.method4978(this.aLongArray7[local153], client.aLongArrayArray1[local162][(int) (this.aLongArray4[local153 - local162 & 0x7] >>> local164) & 0xFF]);
					local162++;
					local164 -= 8;
				}
			}
			for (local162 = 0; local162 < 8; local162++) {
				this.aLongArray4[local162] = this.aLongArray7[local162];
			}
			this.aLongArray4[0] = Static321.method4978(this.aLongArray4[0], client.aLongArray1[local149]);
			@Pc(250) int local250;
			for (local164 = 0; local164 < 8; local164++) {
				this.aLongArray7[local164] = this.aLongArray4[local164];
				local250 = 0;
				@Pc(252) int local252 = 56;
				while (local250 < 8) {
					this.aLongArray7[local164] = Static321.method4978(this.aLongArray7[local164], client.aLongArrayArray1[local250][(int) (this.aLongArray6[local164 - local250 & 0x7] >>> local252) & 0xFF]);
					local252 -= 8;
					local250++;
				}
			}
			for (local250 = 0; local250 < 8; local250++) {
				this.aLongArray6[local250] = this.aLongArray7[local250];
			}
		}
		for (local153 = 0; local153 < 8; local153++) {
			this.aLongArray5[local153] = Static321.method4978(this.aLongArray5[local153], Static321.method4978(this.aLongArray3[local153], this.aLongArray6[local153]));
		}
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(B)V")
	public void method1917() {
		for (@Pc(9) int local9 = 0; local9 < 32; local9++) {
			this.aByteArray36[local9] = 0;
		}
		this.aByteArray37[0] = 0;
		this.anInt2185 = this.anInt2186 = 0;
		for (@Pc(39) int local39 = 0; local39 < 8; local39++) {
			this.aLongArray5[local39] = 0L;
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IJ[B)V")
	public void method1918(@OriginalArg(1) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(13) int local13 = 0;
		@Pc(23) int local23 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(28) int local28 = this.anInt2185 & 0x7;
		@Pc(30) long local30 = arg0;
		@Pc(32) int local32 = 31;
		@Pc(34) int local34 = 0;
		while (local32 >= 0) {
			local34 += ((int) local30 & 0xFF) + (this.aByteArray36[local32] & 0xFF);
			this.aByteArray36[local32] = (byte) local34;
			local30 >>>= 0x8;
			local34 >>>= 0x8;
			local32--;
		}
		@Pc(92) int local92;
		while (arg0 > 8L) {
			local92 = arg1[local13] << local23 & 0xFF | (arg1[local13 + 1] & 0xFF) >>> 8 - local23;
			if (local92 < 0 || local92 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray37[this.anInt2186] = (byte) (this.aByteArray37[this.anInt2186] | local92 >>> local28);
			this.anInt2185 += 8 - local28;
			this.anInt2186++;
			if (this.anInt2185 == 512) {
				this.method1916();
				this.anInt2185 = this.anInt2186 = 0;
			}
			this.aByteArray37[this.anInt2186] = (byte) (local92 << 8 - local28 & 0xFF);
			local13++;
			arg0 -= 8L;
			this.anInt2185 += local28;
		}
		if (arg0 > 0L) {
			local92 = arg1[local13] << local23 & 0xFF;
			this.aByteArray37[this.anInt2186] = (byte) (this.aByteArray37[this.anInt2186] | local92 >>> local28);
		} else {
			local92 = 0;
		}
		if (arg0 + (long) local28 < 8L) {
			this.anInt2185 = (int) ((long) this.anInt2185 + arg0);
			return;
		}
		this.anInt2186++;
		arg0 -= 8 - local28;
		this.anInt2185 += 8 - local28;
		if (this.anInt2185 == 512) {
			this.method1916();
			this.anInt2185 = this.anInt2186 = 0;
		}
		this.aByteArray37[this.anInt2186] = (byte) (local92 << 8 - local28 & 0xFF);
		this.anInt2185 += (int) arg0;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II[B)V")
	public void method1920(@OriginalArg(2) byte[] arg0) {
		this.aByteArray37[this.anInt2186] = (byte) (this.aByteArray37[this.anInt2186] | 0x80 >>> (this.anInt2185 & 0x7));
		this.anInt2186++;
		if (this.anInt2186 > 32) {
			while (true) {
				if (this.anInt2186 >= 64) {
					this.method1916();
					this.anInt2186 = 0;
					break;
				}
				this.aByteArray37[this.anInt2186++] = 0;
			}
		}
		while (this.anInt2186 < 32) {
			this.aByteArray37[this.anInt2186++] = 0;
		}
		Static585.method3080(this.aByteArray36, 0, this.aByteArray37, 32, 32);
		this.method1916();
		@Pc(95) int local95 = 0;
		@Pc(97) int local97 = 0;
		while (local95 < 8) {
			@Pc(104) long local104 = this.aLongArray5[local95];
			arg0[local97] = (byte) (local104 >>> 56);
			arg0[local97 + 1] = (byte) (local104 >>> 48);
			arg0[local97 + 2] = (byte) (local104 >>> 40);
			arg0[local97 + 3] = (byte) (local104 >>> 32);
			arg0[local97 + 4] = (byte) (local104 >>> 24);
			arg0[local97 + 5] = (byte) (local104 >>> 16);
			arg0[local97 + 6] = (byte) (local104 >>> 8);
			arg0[local97 + 7] = (byte) local104;
			local97 += 8;
			local95++;
		}
	}
}
