import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eia")
public final class Class96 {

	@OriginalMember(owner = "client!eia", name = "r", descriptor = "[J")
	private final long[] aLongArray10 = new long[8];

	@OriginalMember(owner = "client!eia", name = "d", descriptor = "[J")
	private final long[] aLongArray11 = new long[8];

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "[B")
	private final byte[] aByteArray36 = new byte[64];

	@OriginalMember(owner = "client!eia", name = "g", descriptor = "[J")
	private final long[] aLongArray12 = new long[8];

	@OriginalMember(owner = "client!eia", name = "f", descriptor = "I")
	private int anInt2091 = 0;

	@OriginalMember(owner = "client!eia", name = "m", descriptor = "I")
	private int anInt2095 = 0;

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "[J")
	private final long[] aLongArray13 = new long[8];

	@OriginalMember(owner = "client!eia", name = "l", descriptor = "[B")
	private final byte[] aByteArray35 = new byte[32];

	@OriginalMember(owner = "client!eia", name = "o", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(II[B)V")
	public void method2019(@OriginalArg(2) byte[] arg0) {
		this.aByteArray36[this.anInt2095] = (byte) (this.aByteArray36[this.anInt2095] | 0x80 >>> (this.anInt2091 & 0x7));
		this.anInt2095++;
		if (this.anInt2095 > 32) {
			while (true) {
				if (this.anInt2095 >= 64) {
					this.method2026();
					this.anInt2095 = 0;
					break;
				}
				this.aByteArray36[this.anInt2095++] = 0;
			}
		}
		while (this.anInt2095 < 32) {
			this.aByteArray36[this.anInt2095++] = 0;
		}
		Static691.method82(this.aByteArray35, 0, this.aByteArray36, 32, 32);
		this.method2026();
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		while (local107 < 8) {
			@Pc(116) long local116 = this.aLongArray13[local107];
			arg0[local109] = (byte) (int) (local116 >>> 56);
			arg0[local109 + 1] = (byte) (int) (local116 >>> 48);
			arg0[local109 + 2] = (byte) (int) (local116 >>> 40);
			arg0[local109 + 3] = (byte) (int) (local116 >>> 32);
			arg0[local109 + 4] = (byte) (int) (local116 >>> 24);
			arg0[local109 + 5] = (byte) (int) (local116 >>> 16);
			arg0[local109 + 6] = (byte) (int) (local116 >>> 8);
			arg0[local109 + 7] = (byte) (int) local116;
			local107++;
			local109 += 8;
		}
	}

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "(I)V")
	public void method2021() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray35[local7] = 0;
		}
		this.anInt2091 = this.anInt2095 = 0;
		this.aByteArray36[0] = 0;
		for (@Pc(33) int local33 = 0; local33 < 8; local33++) {
			this.aLongArray13[local33] = 0L;
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(BJ[B)V")
	public void method2025(@OriginalArg(1) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(21) int local21 = this.anInt2091 & 0x7;
		@Pc(23) long local23 = arg0;
		@Pc(25) int local25 = 31;
		@Pc(27) int local27 = 0;
		while (local25 >= 0) {
			local27 += (this.aByteArray35[local25] & 0xFF) + ((int) local23 & 0xFF);
			this.aByteArray35[local25] = (byte) local27;
			local27 >>>= 0x8;
			local23 >>>= 0x8;
			local25--;
		}
		@Pc(88) int local88;
		while (arg0 > 8L) {
			local88 = arg1[local7] << local16 & 0xFF | (arg1[local7 - -1] & 0xFF) >>> 8 - local16;
			if (local88 < 0 || local88 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray36[this.anInt2095] = (byte) (this.aByteArray36[this.anInt2095] | local88 >>> local21);
			this.anInt2095++;
			this.anInt2091 += 8 - local21;
			if (this.anInt2091 == 512) {
				this.method2026();
				this.anInt2091 = this.anInt2095 = 0;
			}
			this.aByteArray36[this.anInt2095] = (byte) (local88 << 8 - local21 & 0xFF);
			local7++;
			arg0 -= 8L;
			this.anInt2091 += local21;
		}
		if (arg0 <= 0L) {
			local88 = 0;
		} else {
			local88 = arg1[local7] << local16 & 0xFF;
			this.aByteArray36[this.anInt2095] = (byte) (this.aByteArray36[this.anInt2095] | local88 >>> local21);
		}
		if ((long) local21 + arg0 < 8L) {
			this.anInt2091 = (int) ((long) this.anInt2091 + arg0);
			return;
		}
		this.anInt2095++;
		arg0 -= (long) (8 - local21);
		this.anInt2091 += 8 - local21;
		if (this.anInt2091 == 512) {
			this.method2026();
			this.anInt2091 = this.anInt2095 = 0;
		}
		this.aByteArray36[this.anInt2095] = (byte) (local88 << 8 - local21 & 0xFF);
		this.anInt2091 += (int) arg0;
	}

	@OriginalMember(owner = "client!eia", name = "c", descriptor = "(I)V")
	private void method2026() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray12[local7] = Static669.method9281(Static669.method9281(Static190.method2833(0xFFL << 8, (long) this.aByteArray36[local9 + 6] << 8), Static669.method9281(Static190.method2833((long) this.aByteArray36[local9 + 5], 255L) << 16, Static669.method9281(Static669.method9281(Static190.method2833((long) this.aByteArray36[local9 + 3] << 32, 0xFFL << 32), Static669.method9281(Static190.method2833(0xFFL << 40, (long) this.aByteArray36[local9 + 2] << 40), Static669.method9281(Static190.method2833((long) this.aByteArray36[local9 + 1], 255L) << 48, (long) this.aByteArray36[local9] << 56))), Static190.method2833((long) this.aByteArray36[local9 + 4] << 24, 0xFFL << 24)))), Static190.method2833((long) this.aByteArray36[local9 + 7], 255L));
			local7++;
			local9 += 8;
		}
		for (@Pc(121) int local121 = 0; local121 < 8; local121++) {
			this.aLongArray10[local121] = Static669.method9281(this.aLongArray12[local121], this.aLongArray9[local121] = this.aLongArray13[local121]);
		}
		if (-3 != -3) {
			return;
		}
		@Pc(166) int local166;
		for (@Pc(162) int local162 = 1; local162 <= 10; local162++) {
			@Pc(175) int local175;
			@Pc(177) int local177;
			for (local166 = 0; local166 < 8; local166++) {
				this.aLongArray11[local166] = 0L;
				local175 = 0;
				local177 = 56;
				while (local175 < 8) {
					this.aLongArray11[local166] = Static669.method9281(this.aLongArray11[local166], Class43_Sub10.aLongArrayArray1[local175][(int) (this.aLongArray9[local166 - local175 & 0x7] >>> local177) & 0xFF]);
					local177 -= 8;
					local175++;
				}
			}
			for (local175 = 0; local175 < 8; local175++) {
				this.aLongArray9[local175] = this.aLongArray11[local175];
			}
			this.aLongArray9[0] = Static669.method9281(this.aLongArray9[0], Class43_Sub10.aLongArray14[local162]);
			@Pc(273) int local273;
			for (local177 = 0; local177 < 8; local177++) {
				this.aLongArray11[local177] = this.aLongArray9[local177];
				local273 = 0;
				@Pc(275) int local275 = 56;
				while (local273 < 8) {
					this.aLongArray11[local177] = Static669.method9281(this.aLongArray11[local177], Class43_Sub10.aLongArrayArray1[local273][(int) (this.aLongArray10[local177 - local273 & 0x7] >>> local275) & 0xFF]);
					local275 -= 8;
					local273++;
				}
			}
			for (local273 = 0; local273 < 8; local273++) {
				this.aLongArray10[local273] = this.aLongArray11[local273];
			}
		}
		for (local166 = 0; local166 < 8; local166++) {
			this.aLongArray13[local166] = Static669.method9281(this.aLongArray13[local166], Static669.method9281(this.aLongArray12[local166], this.aLongArray10[local166]));
		}
	}
}
