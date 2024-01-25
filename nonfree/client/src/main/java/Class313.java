import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uca")
public final class Class313 {

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "I")
	private int anInt8990 = 0;

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "[B")
	private final byte[] aByteArray117 = new byte[64];

	@OriginalMember(owner = "client!uca", name = "f", descriptor = "I")
	private int anInt8993 = 0;

	@OriginalMember(owner = "client!uca", name = "m", descriptor = "[J")
	private final long[] aLongArray15 = new long[8];

	@OriginalMember(owner = "client!uca", name = "h", descriptor = "[J")
	private final long[] aLongArray12 = new long[8];

	@OriginalMember(owner = "client!uca", name = "l", descriptor = "[J")
	private final long[] aLongArray14 = new long[8];

	@OriginalMember(owner = "client!uca", name = "k", descriptor = "[J")
	private final long[] aLongArray13 = new long[8];

	@OriginalMember(owner = "client!uca", name = "p", descriptor = "[B")
	private final byte[] aByteArray118 = new byte[32];

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "[J")
	private final long[] aLongArray11 = new long[8];

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(I[BI)V")
	public void method7545(@OriginalArg(1) byte[] arg0) {
		this.aByteArray117[this.anInt8993] = (byte) (this.aByteArray117[this.anInt8993] | 0x80 >>> (this.anInt8990 & 0x7));
		this.anInt8993++;
		if (this.anInt8993 > 32) {
			while (true) {
				if (this.anInt8993 >= 64) {
					this.method7548();
					this.anInt8993 = 0;
					break;
				}
				this.aByteArray117[this.anInt8993++] = 0;
			}
		}
		while (this.anInt8993 < 32) {
			this.aByteArray117[this.anInt8993++] = 0;
		}
		Static589.method5382(this.aByteArray118, 0, this.aByteArray117, 32, 32);
		this.method7548();
		@Pc(96) int local96 = 0;
		@Pc(98) int local98 = 0;
		while (local96 < 8) {
			@Pc(105) long local105 = this.aLongArray15[local96];
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

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(J[BB)V")
	public void method7546(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(21) int local21 = this.anInt8990 & 0x7;
		@Pc(23) long local23 = arg0;
		@Pc(25) int local25 = 31;
		@Pc(35) int local35 = 0;
		while (local25 >= 0) {
			local35 += (this.aByteArray118[local25] & 0xFF) + ((int) local23 & 0xFF);
			this.aByteArray118[local25] = (byte) local35;
			local35 >>>= 0x8;
			local23 >>>= 0x8;
			local25--;
		}
		@Pc(91) int local91;
		while (arg0 > 8L) {
			local91 = arg1[local7] << local16 & 0xFF | (arg1[local7 + 1] & 0xFF) >>> 8 - local16;
			if (local91 < 0 || local91 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray117[this.anInt8993] = (byte) (this.aByteArray117[this.anInt8993] | local91 >>> local21);
			this.anInt8990 += 8 - local21;
			this.anInt8993++;
			if (this.anInt8990 == 512) {
				this.method7548();
				this.anInt8990 = this.anInt8993 = 0;
			}
			this.aByteArray117[this.anInt8993] = (byte) (local91 << 8 - local21 & 0xFF);
			arg0 -= 8L;
			this.anInt8990 += local21;
			local7++;
		}
		if (arg0 > 0L) {
			local91 = arg1[local7] << local16 & 0xFF;
			this.aByteArray117[this.anInt8993] = (byte) (this.aByteArray117[this.anInt8993] | local91 >>> local21);
		} else {
			local91 = 0;
		}
		if ((long) local21 + arg0 < 8L) {
			this.anInt8990 = (int) ((long) this.anInt8990 + arg0);
			return;
		}
		arg0 -= 8 - local21;
		this.anInt8990 += 8 - local21;
		this.anInt8993++;
		if (this.anInt8990 == 512) {
			this.method7548();
			this.anInt8990 = this.anInt8993 = 0;
		}
		this.aByteArray117[this.anInt8993] = (byte) (local91 << 8 - local21 & 0xFF);
		this.anInt8990 += (int) arg0;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)V")
	private void method7548() {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 0;
		while (local7 < 8) {
			this.aLongArray12[local7] = Static446.method5086(Static220.method3991((long) this.aByteArray117[local17 + 7], 255L), Static446.method5086(Static220.method3991(0xFFL << 8, (long) this.aByteArray117[local17 + 6] << 8), Static446.method5086(Static446.method5086(Static446.method5086(Static446.method5086(Static220.method3991((long) this.aByteArray117[local17 + 2], 255L) << 40, Static446.method5086((long) this.aByteArray117[local17] << 56, Static220.method3991((long) this.aByteArray117[local17 + 1], 255L) << 48)), Static220.method3991((long) this.aByteArray117[local17 + 3], 255L) << 32), Static220.method3991(255L, (long) this.aByteArray117[local17 + 4]) << 24), Static220.method3991(0xFFL << 16, (long) this.aByteArray117[local17 + 5] << 16))));
			local7++;
			local17 += 8;
		}
		for (@Pc(123) int local123 = 0; local123 < 8; local123++) {
			this.aLongArray11[local123] = Static446.method5086(this.aLongArray12[local123], this.aLongArray14[local123] = this.aLongArray15[local123]);
		}
		@Pc(155) int local155;
		for (@Pc(151) int local151 = 1; local151 <= 10; local151++) {
			@Pc(164) int local164;
			@Pc(166) int local166;
			for (local155 = 0; local155 < 8; local155++) {
				this.aLongArray13[local155] = 0L;
				local164 = 0;
				local166 = 56;
				while (local164 < 8) {
					this.aLongArray13[local155] = Static446.method5086(this.aLongArray13[local155], Class6_Sub40.aLongArrayArray1[local164][(int) (this.aLongArray14[local155 - local164 & 0x7] >>> local166) & 0xFF]);
					local166 -= 8;
					local164++;
				}
			}
			for (local164 = 0; local164 < 8; local164++) {
				this.aLongArray14[local164] = this.aLongArray13[local164];
			}
			this.aLongArray14[0] = Static446.method5086(this.aLongArray14[0], Class6_Sub40.aLongArray9[local151]);
			@Pc(248) int local248;
			for (local166 = 0; local166 < 8; local166++) {
				this.aLongArray13[local166] = this.aLongArray14[local166];
				local248 = 0;
				@Pc(250) int local250 = 56;
				while (local248 < 8) {
					this.aLongArray13[local166] = Static446.method5086(this.aLongArray13[local166], Class6_Sub40.aLongArrayArray1[local248][(int) (this.aLongArray11[local166 - local248 & 0x7] >>> local250) & 0xFF]);
					local248++;
					local250 -= 8;
				}
			}
			for (local248 = 0; local248 < 8; local248++) {
				this.aLongArray11[local248] = this.aLongArray13[local248];
			}
		}
		for (local155 = 0; local155 < 8; local155++) {
			this.aLongArray15[local155] = Static446.method5086(this.aLongArray15[local155], Static446.method5086(this.aLongArray12[local155], this.aLongArray11[local155]));
		}
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)V")
	public void method7550() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray118[local7] = 0;
		}
		this.anInt8990 = this.anInt8993 = 0;
		this.aByteArray117[0] = 0;
		for (@Pc(39) int local39 = 0; local39 < 8; local39++) {
			this.aLongArray15[local39] = 0L;
		}
	}
}
