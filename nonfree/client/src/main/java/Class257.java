import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nja")
public final class Class257 {

	@OriginalMember(owner = "client!nja", name = "g", descriptor = "[J")
	private final long[] aLongArray15 = new long[8];

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "I")
	private int anInt7520 = 0;

	@OriginalMember(owner = "client!nja", name = "c", descriptor = "[J")
	private final long[] aLongArray18 = new long[8];

	@OriginalMember(owner = "client!nja", name = "f", descriptor = "I")
	private int anInt7521 = 0;

	@OriginalMember(owner = "client!nja", name = "b", descriptor = "[J")
	private final long[] aLongArray17 = new long[8];

	@OriginalMember(owner = "client!nja", name = "j", descriptor = "[J")
	private final long[] aLongArray16 = new long[8];

	@OriginalMember(owner = "client!nja", name = "n", descriptor = "[B")
	private final byte[] aByteArray63 = new byte[32];

	@OriginalMember(owner = "client!nja", name = "m", descriptor = "[J")
	private long[] aLongArray19 = new long[8];

	@OriginalMember(owner = "client!nja", name = "h", descriptor = "[B")
	private final byte[] aByteArray62 = new byte[64];

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "([BIJ)V")
	public void method6290(@OriginalArg(0) byte[] arg0, @OriginalArg(2) long arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(22) int local22 = this.anInt7520 & 0x7;
		@Pc(24) long local24 = arg1;
		@Pc(26) int local26 = 31;
		@Pc(28) int local28 = 0;
		while (local26 >= 0) {
			local28 += (this.aByteArray63[local26] & 0xFF) + ((int) local24 & 0xFF);
			this.aByteArray63[local26] = (byte) local28;
			local24 >>>= 0x8;
			local28 >>>= 0x8;
			local26--;
		}
		@Pc(90) int local90;
		while (arg1 > 8L) {
			local90 = arg0[local7] << local17 & 0xFF | (arg0[local7 + 1] & 0xFF) >>> 8 - local17;
			if (local90 < 0 || local90 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray62[this.anInt7521] = (byte) (this.aByteArray62[this.anInt7521] | local90 >>> local22);
			this.anInt7521++;
			this.anInt7520 += 8 - local22;
			if (this.anInt7520 == 512) {
				this.method6291(-84);
				this.anInt7520 = this.anInt7521 = 0;
			}
			this.aByteArray62[this.anInt7521] = (byte) (local90 << 8 - local22 & 0xFF);
			local7++;
			this.anInt7520 += local22;
			arg1 -= 8L;
		}
		if (arg1 > 0L) {
			local90 = arg0[local7] << local17 & 0xFF;
			this.aByteArray62[this.anInt7521] = (byte) (this.aByteArray62[this.anInt7521] | local90 >>> local22);
		} else {
			local90 = 0;
		}
		if ((long) local22 + arg1 < 8L) {
			this.anInt7520 = (int) ((long) this.anInt7520 + arg1);
			return;
		}
		this.anInt7520 += 8 - local22;
		arg1 -= (long) (8 - local22);
		this.anInt7521++;
		if (this.anInt7520 == 512) {
			this.method6291(-104);
			this.anInt7520 = this.anInt7521 = 0;
		}
		this.aByteArray62[this.anInt7521] = (byte) (local90 << 8 - local22 & 0xFF);
		this.anInt7520 += (int) arg1;
	}

	@OriginalMember(owner = "client!nja", name = "b", descriptor = "(I)V")
	private void method6291(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray16[local7] = Static364.method5204(Static364.method5204(Static590.method8099((long) this.aByteArray62[local9 + 6], 255L) << 8, Static364.method5204(Static590.method8099(0xFFL << 16, (long) this.aByteArray62[local9 + 5] << 16), Static364.method5204(Static364.method5204(Static590.method8099((long) this.aByteArray62[local9 + 3] << 32, 0xFFL << 32), Static364.method5204(Static364.method5204((long) this.aByteArray62[local9] << 56, Static590.method8099((long) this.aByteArray62[local9 + 1] << 48, 0xFFL << 48)), Static590.method8099((long) this.aByteArray62[local9 + 2] << 40, 0xFFL << 40))), Static590.method8099((long) this.aByteArray62[local9 + 4], 255L) << 24))), Static590.method8099((long) this.aByteArray62[local9 + 7], 255L));
			local7++;
			local9 += 8;
		}
		for (@Pc(123) int local123 = 0; local123 < 8; local123++) {
			this.aLongArray18[local123] = Static364.method5204(this.aLongArray16[local123], this.aLongArray17[local123] = this.aLongArray15[local123]);
		}
		if (arg0 > -36) {
			this.aLongArray19 = null;
		}
		@Pc(169) int local169;
		for (@Pc(165) int local165 = 1; local165 <= 10; local165++) {
			@Pc(178) int local178;
			@Pc(180) int local180;
			for (local169 = 0; local169 < 8; local169++) {
				this.aLongArray19[local169] = 0L;
				local178 = 0;
				local180 = 56;
				while (local178 < 8) {
					this.aLongArray19[local169] = Static364.method5204(this.aLongArray19[local169], Class262.aLongArrayArray1[local178][(int) (this.aLongArray17[local169 - local178 & 0x7] >>> local180) & 0xFF]);
					local180 -= 8;
					local178++;
				}
			}
			for (local178 = 0; local178 < 8; local178++) {
				this.aLongArray17[local178] = this.aLongArray19[local178];
			}
			this.aLongArray17[0] = Static364.method5204(this.aLongArray17[0], Class262.aLongArray20[local165]);
			@Pc(274) int local274;
			for (local180 = 0; local180 < 8; local180++) {
				this.aLongArray19[local180] = this.aLongArray17[local180];
				local274 = 0;
				@Pc(276) int local276 = 56;
				while (local274 < 8) {
					this.aLongArray19[local180] = Static364.method5204(this.aLongArray19[local180], Class262.aLongArrayArray1[local274][(int) (this.aLongArray18[local180 - local274 & 0x7] >>> local276) & 0xFF]);
					local276 -= 8;
					local274++;
				}
			}
			for (local274 = 0; local274 < 8; local274++) {
				this.aLongArray18[local274] = this.aLongArray19[local274];
			}
		}
		for (local169 = 0; local169 < 8; local169++) {
			this.aLongArray15[local169] = Static364.method5204(this.aLongArray15[local169], Static364.method5204(this.aLongArray18[local169], this.aLongArray16[local169]));
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(II[B)V")
	public void method6292(@OriginalArg(2) byte[] arg0) {
		this.aByteArray62[this.anInt7521] = (byte) (this.aByteArray62[this.anInt7521] | 0x80 >>> (this.anInt7520 & 0x7));
		this.anInt7521++;
		if (this.anInt7521 > 32) {
			while (true) {
				if (this.anInt7521 >= 64) {
					this.method6291(-50);
					this.anInt7521 = 0;
					break;
				}
				this.aByteArray62[this.anInt7521++] = 0;
			}
		}
		while (this.anInt7521 < 32) {
			this.aByteArray62[this.anInt7521++] = 0;
		}
		Static735.method9185(this.aByteArray63, 0, this.aByteArray62, 32, 32);
		this.method6291(-121);
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		while (local104 < 8) {
			@Pc(113) long local113 = this.aLongArray15[local104];
			arg0[local106] = (byte) (int) (local113 >>> 56);
			arg0[local106 + 1] = (byte) (int) (local113 >>> 48);
			arg0[local106 + 2] = (byte) (int) (local113 >>> 40);
			arg0[local106 + 3] = (byte) (int) (local113 >>> 32);
			arg0[local106 + 4] = (byte) (int) (local113 >>> 24);
			arg0[local106 + 5] = (byte) (int) (local113 >>> 16);
			arg0[local106 + 6] = (byte) (int) (local113 >>> 8);
			arg0[local106 + 7] = (byte) (int) local113;
			local104++;
			local106 += 8;
		}
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(I)V")
	public void method6294() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray63[local7] = 0;
		}
		this.anInt7520 = this.anInt7521 = 0;
		this.aByteArray62[0] = 0;
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			this.aLongArray15[local35] = 0L;
		}
	}
}
