import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class259 {

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
	private int anInt7847 = 0;

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
	private int anInt7849 = 0;

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "[B")
	private final byte[] aByteArray92 = new byte[32];

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "[J")
	private final long[] aLongArray20 = new long[8];

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "[J")
	private final long[] aLongArray22 = new long[8];

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "[B")
	private final byte[] aByteArray91 = new byte[64];

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "[J")
	private final long[] aLongArray21 = new long[8];

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "[J")
	private final long[] aLongArray24 = new long[8];

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "[J")
	private final long[] aLongArray23 = new long[8];

	static {
		new Class67("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(JI[B)V")
	public void method6496(@OriginalArg(0) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(22) int local22 = this.anInt7849 & 0x7;
		@Pc(24) long local24 = arg0;
		@Pc(26) int local26 = 31;
		@Pc(28) int local28 = 0;
		while (local26 >= 0) {
			local28 += (this.aByteArray92[local26] & 0xFF) + ((int) local24 & 0xFF);
			this.aByteArray92[local26] = (byte) local28;
			local28 >>>= 0x8;
			local24 >>>= 0x8;
			local26--;
		}
		@Pc(87) int local87;
		while (arg0 > 8L) {
			local87 = arg1[local7] << local17 & 0xFF | (arg1[local7 - -1] & 0xFF) >>> 8 - local17;
			if (local87 < 0 || local87 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray91[this.anInt7847] = (byte) (this.aByteArray91[this.anInt7847] | local87 >>> local22);
			this.anInt7847++;
			this.anInt7849 += 8 - local22;
			if (this.anInt7849 == 512) {
				this.method6497();
				this.anInt7849 = this.anInt7847 = 0;
			}
			this.aByteArray91[this.anInt7847] = (byte) (local87 << 8 - local22 & 0xFF);
			arg0 -= 8L;
			this.anInt7849 += local22;
			local7++;
		}
		if (arg0 > 0L) {
			local87 = arg1[local7] << local17 & 0xFF;
			this.aByteArray91[this.anInt7847] = (byte) (this.aByteArray91[this.anInt7847] | local87 >>> local22);
		} else {
			local87 = 0;
		}
		if (arg0 + (long) local22 < 8L) {
			this.anInt7849 = (int) ((long) this.anInt7849 + arg0);
			return;
		}
		arg0 -= 8 - local22;
		this.anInt7849 += 8 - local22;
		this.anInt7847++;
		if (this.anInt7849 == 512) {
			this.method6497();
			this.anInt7849 = this.anInt7847 = 0;
		}
		this.aByteArray91[this.anInt7847] = (byte) (local87 << 8 - local22 & 0xFF);
		this.anInt7849 += (int) arg0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
	private void method6497() {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		while (local3 < 8) {
			this.aLongArray23[local3] = Static227.method4091(Static346.method5508((long) this.aByteArray91[local5 + 7], 255L), Static227.method4091(Static346.method5508((long) this.aByteArray91[local5 + 6], 255L) << 8, Static227.method4091(Static346.method5508((long) this.aByteArray91[local5 + 5] << 16, 0xFFL << 16), Static227.method4091(Static227.method4091(Static227.method4091(Static346.method5508((long) this.aByteArray91[local5 + 2] << 40, 0xFFL << 40), Static227.method4091((long) this.aByteArray91[local5] << 56, Static346.method5508(0xFFL << 48, (long) this.aByteArray91[local5 + 1] << 48))), Static346.method5508(0xFFL << 32, (long) this.aByteArray91[local5 + 3] << 32)), Static346.method5508((long) this.aByteArray91[local5 + 4] << 24, 0xFFL << 24)))));
			local5 += 8;
			local3++;
		}
		for (@Pc(121) int local121 = 0; local121 < 8; local121++) {
			this.aLongArray22[local121] = Static227.method4091(this.aLongArray23[local121], this.aLongArray24[local121] = this.aLongArray21[local121]);
		}
		@Pc(157) int local157;
		for (@Pc(153) int local153 = 1; local153 <= 10; local153++) {
			@Pc(166) int local166;
			@Pc(168) int local168;
			for (local157 = 0; local157 < 8; local157++) {
				this.aLongArray20[local157] = 0L;
				local166 = 0;
				local168 = 56;
				while (local166 < 8) {
					this.aLongArray20[local157] = Static227.method4091(this.aLongArray20[local157], Class6_Sub4_Sub2.aLongArrayArray1[local166][(int) (this.aLongArray24[local157 - local166 & 0x7] >>> local168) & 0xFF]);
					local168 -= 8;
					local166++;
				}
			}
			for (local166 = 0; local166 < 8; local166++) {
				this.aLongArray24[local166] = this.aLongArray20[local166];
			}
			this.aLongArray24[0] = Static227.method4091(this.aLongArray24[0], Class6_Sub4_Sub2.aLongArray13[local153]);
			@Pc(254) int local254;
			for (local168 = 0; local168 < 8; local168++) {
				this.aLongArray20[local168] = this.aLongArray24[local168];
				local254 = 0;
				@Pc(256) int local256 = 56;
				while (local254 < 8) {
					this.aLongArray20[local168] = Static227.method4091(this.aLongArray20[local168], Class6_Sub4_Sub2.aLongArrayArray1[local254][(int) (this.aLongArray22[local168 - local254 & 0x7] >>> local256) & 0xFF]);
					local254++;
					local256 -= 8;
				}
			}
			for (local254 = 0; local254 < 8; local254++) {
				this.aLongArray22[local254] = this.aLongArray20[local254];
			}
		}
		for (local157 = 0; local157 < 8; local157++) {
			this.aLongArray21[local157] = Static227.method4091(this.aLongArray21[local157], Static227.method4091(this.aLongArray22[local157], this.aLongArray23[local157]));
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V")
	public void method6499() {
		for (@Pc(3) int local3 = 0; local3 < 32; local3++) {
			this.aByteArray92[local3] = 0;
		}
		this.aByteArray91[0] = 0;
		this.anInt7849 = this.anInt7847 = 0;
		for (@Pc(39) int local39 = 0; local39 < 8; local39++) {
			this.aLongArray21[local39] = 0L;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([BBI)V")
	public void method6502(@OriginalArg(0) byte[] arg0) {
		this.aByteArray91[this.anInt7847] = (byte) (this.aByteArray91[this.anInt7847] | 0x80 >>> (this.anInt7849 & 0x7));
		this.anInt7847++;
		if (this.anInt7847 > 32) {
			while (true) {
				if (this.anInt7847 >= 64) {
					this.method6497();
					this.anInt7847 = 0;
					break;
				}
				this.aByteArray91[this.anInt7847++] = 0;
			}
		}
		while (this.anInt7847 < 32) {
			this.aByteArray91[this.anInt7847++] = 0;
		}
		Static559.method5957(this.aByteArray92, 0, this.aByteArray91, 32, 32);
		this.method6497();
		@Pc(86) int local86 = 0;
		@Pc(88) int local88 = 0;
		while (local86 < 8) {
			@Pc(95) long local95 = this.aLongArray21[local86];
			arg0[local88] = (byte) (local95 >>> 56);
			arg0[local88 + 1] = (byte) (local95 >>> 48);
			arg0[local88 + 2] = (byte) (local95 >>> 40);
			arg0[local88 + 3] = (byte) (local95 >>> 32);
			arg0[local88 + 4] = (byte) (local95 >>> 24);
			arg0[local88 + 5] = (byte) (local95 >>> 16);
			arg0[local88 + 6] = (byte) (local95 >>> 8);
			arg0[local88 + 7] = (byte) local95;
			local88 += 8;
			local86++;
		}
	}
}
