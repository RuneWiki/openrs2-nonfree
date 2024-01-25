import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class253 {

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "[J")
	private final long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "[B")
	private final byte[] aByteArray64 = new byte[64];

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!nu", name = "j", descriptor = "I")
	private int anInt6361 = 0;

	@OriginalMember(owner = "client!nu", name = "k", descriptor = "I")
	private int anInt6362 = 0;

	@OriginalMember(owner = "client!nu", name = "h", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!nu", name = "l", descriptor = "[J")
	private final long[] aLongArray10 = new long[8];

	@OriginalMember(owner = "client!nu", name = "n", descriptor = "[B")
	private final byte[] aByteArray65 = new byte[32];

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "([BJI)V")
	public void method5636(@OriginalArg(0) byte[] arg0, @OriginalArg(1) long arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(22) int local22 = this.anInt6361 & 0x7;
		@Pc(24) long local24 = arg1;
		@Pc(26) int local26 = 31;
		@Pc(28) int local28 = 0;
		while (local26 >= 0) {
			local28 += ((int) local24 & 0xFF) + (this.aByteArray65[local26] & 0xFF);
			this.aByteArray65[local26] = (byte) local28;
			local28 >>>= 0x8;
			local24 >>>= 0x8;
			local26--;
		}
		@Pc(92) int local92;
		while (arg1 > 8L) {
			local92 = arg0[local7] << local17 & 0xFF | (arg0[local7 + 1] & 0xFF) >>> 8 - local17;
			if (local92 < 0 || local92 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray64[this.anInt6362] = (byte) (this.aByteArray64[this.anInt6362] | local92 >>> local22);
			this.anInt6361 += 8 - local22;
			this.anInt6362++;
			if (this.anInt6361 == 512) {
				this.method5640();
				this.anInt6361 = this.anInt6362 = 0;
			}
			this.aByteArray64[this.anInt6362] = (byte) (local92 << 8 - local22 & 0xFF);
			arg1 -= 8L;
			local7++;
			this.anInt6361 += local22;
		}
		if (arg1 <= 0L) {
			local92 = 0;
		} else {
			local92 = arg0[local7] << local17 & 0xFF;
			this.aByteArray64[this.anInt6362] = (byte) (this.aByteArray64[this.anInt6362] | local92 >>> local22);
		}
		if ((long) local22 + arg1 < 8L) {
			this.anInt6361 = (int) ((long) this.anInt6361 + arg1);
			return;
		}
		this.anInt6362++;
		this.anInt6361 += 8 - local22;
		arg1 -= 8 - local22;
		if (this.anInt6361 == 512) {
			this.method5640();
			this.anInt6361 = this.anInt6362 = 0;
		}
		this.aByteArray64[this.anInt6362] = (byte) (local92 << 8 - local22 & 0xFF);
		this.anInt6361 += (int) arg1;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
	public void method5638() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray65[local7] = 0;
		}
		this.aByteArray64[0] = 0;
		this.anInt6361 = this.anInt6362 = 0;
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			this.aLongArray10[local31] = 0L;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "([BII)V")
	public void method5639(@OriginalArg(0) byte[] arg0) {
		this.aByteArray64[this.anInt6362] = (byte) (this.aByteArray64[this.anInt6362] | 0x80 >>> (this.anInt6361 & 0x7));
		this.anInt6362++;
		if (this.anInt6362 > 32) {
			while (true) {
				if (this.anInt6362 >= 64) {
					this.method5640();
					this.anInt6362 = 0;
					break;
				}
				this.aByteArray64[this.anInt6362++] = 0;
			}
		}
		while (this.anInt6362 < 32) {
			this.aByteArray64[this.anInt6362++] = 0;
		}
		Static652.method4548(this.aByteArray65, 0, this.aByteArray64, 32, 32);
		this.method5640();
		@Pc(96) int local96 = 0;
		@Pc(98) int local98 = 0;
		while (local96 < 8) {
			@Pc(105) long local105 = this.aLongArray10[local96];
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

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V")
	private void method5640() {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		while (local3 < 8) {
			this.aLongArray6[local3] = Static63.method1049(Static482.method7144(255L, (long) this.aByteArray64[local5 + 7]), Static63.method1049(Static482.method7144((long) this.aByteArray64[local5 + 6], 255L) << 8, Static63.method1049(Static482.method7144(0xFFL << 16, (long) this.aByteArray64[local5 + 5] << 16), Static63.method1049(Static482.method7144(0xFFL << 24, (long) this.aByteArray64[local5 + 4] << 24), Static63.method1049(Static63.method1049(Static63.method1049(Static482.method7144(255L, (long) this.aByteArray64[local5 + 1]) << 48, (long) this.aByteArray64[local5] << 56), Static482.method7144(255L, (long) this.aByteArray64[local5 + 2]) << 40), Static482.method7144(255L, (long) this.aByteArray64[local5 + 3]) << 32)))));
			local3++;
			local5 += 8;
		}
		for (@Pc(117) int local117 = 0; local117 < 8; local117++) {
			this.aLongArray7[local117] = Static63.method1049(this.aLongArray6[local117], this.aLongArray9[local117] = this.aLongArray10[local117]);
		}
		@Pc(155) int local155;
		for (@Pc(151) int local151 = 1; local151 <= 10; local151++) {
			@Pc(164) int local164;
			@Pc(166) int local166;
			for (local155 = 0; local155 < 8; local155++) {
				this.aLongArray8[local155] = 0L;
				local164 = 0;
				local166 = 56;
				while (local164 < 8) {
					this.aLongArray8[local155] = Static63.method1049(this.aLongArray8[local155], Class5_Sub52.aLongArrayArray1[local164][(int) (this.aLongArray9[local155 - local164 & 0x7] >>> local166) & 0xFF]);
					local164++;
					local166 -= 8;
				}
			}
			for (local164 = 0; local164 < 8; local164++) {
				this.aLongArray9[local164] = this.aLongArray8[local164];
			}
			this.aLongArray9[0] = Static63.method1049(this.aLongArray9[0], Class5_Sub52.aLongArray15[local151]);
			@Pc(249) int local249;
			for (local166 = 0; local166 < 8; local166++) {
				this.aLongArray8[local166] = this.aLongArray9[local166];
				local249 = 0;
				@Pc(251) int local251 = 56;
				while (local249 < 8) {
					this.aLongArray8[local166] = Static63.method1049(this.aLongArray8[local166], Class5_Sub52.aLongArrayArray1[local249][(int) (this.aLongArray7[local166 - local249 & 0x7] >>> local251) & 0xFF]);
					local249++;
					local251 -= 8;
				}
			}
			for (local249 = 0; local249 < 8; local249++) {
				this.aLongArray7[local249] = this.aLongArray8[local249];
			}
		}
		for (local155 = 0; local155 < 8; local155++) {
			this.aLongArray10[local155] = Static63.method1049(this.aLongArray10[local155], Static63.method1049(this.aLongArray7[local155], this.aLongArray6[local155]));
		}
	}
}
