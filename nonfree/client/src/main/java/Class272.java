import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class272 {

	@OriginalMember(owner = "client!or", name = "a", descriptor = "[B")
	private final byte[] aByteArray65 = new byte[32];

	@OriginalMember(owner = "client!or", name = "b", descriptor = "[J")
	private final long[] aLongArray12 = new long[8];

	@OriginalMember(owner = "client!or", name = "e", descriptor = "[J")
	private final long[] aLongArray13 = new long[8];

	@OriginalMember(owner = "client!or", name = "d", descriptor = "I")
	private int anInt6890 = 0;

	@OriginalMember(owner = "client!or", name = "c", descriptor = "I")
	private int anInt6889 = 0;

	@OriginalMember(owner = "client!or", name = "g", descriptor = "[B")
	private final byte[] aByteArray66 = new byte[64];

	@OriginalMember(owner = "client!or", name = "n", descriptor = "[J")
	private final long[] aLongArray16 = new long[8];

	@OriginalMember(owner = "client!or", name = "h", descriptor = "[J")
	private final long[] aLongArray14 = new long[8];

	@OriginalMember(owner = "client!or", name = "k", descriptor = "[J")
	private final long[] aLongArray15 = new long[8];

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
	public void method6068() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray65[local7] = 0;
		}
		this.aByteArray66[0] = 0;
		this.anInt6890 = this.anInt6889 = 0;
		for (@Pc(39) int local39 = 0; local39 < 8; local39++) {
			this.aLongArray14[local39] = 0L;
		}
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
	private void method6070() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray16[local7] = Static484.method6621(Static484.method6621(Static64.method1424(0xFFL << 8, (long) this.aByteArray66[local9 + 6] << 8), Static484.method6621(Static64.method1424(255L, (long) this.aByteArray66[local9 + 5]) << 16, Static484.method6621(Static64.method1424(0xFFL << 24, (long) this.aByteArray66[local9 + 4] << 24), Static484.method6621(Static484.method6621(Static64.method1424((long) this.aByteArray66[local9 + 2] << 40, 0xFFL << 40), Static484.method6621((long) this.aByteArray66[local9] << 56, Static64.method1424((long) this.aByteArray66[local9 + 1] << 48, 0xFFL << 48))), Static64.method1424((long) this.aByteArray66[local9 + 3] << 32, 0xFFL << 32))))), Static64.method1424((long) this.aByteArray66[local9 + 7], 255L));
			local7++;
			local9 += 8;
		}
		for (@Pc(121) int local121 = 0; local121 < 8; local121++) {
			this.aLongArray12[local121] = Static484.method6621(this.aLongArray16[local121], this.aLongArray13[local121] = this.aLongArray14[local121]);
		}
		@Pc(157) int local157;
		for (@Pc(147) int local147 = 1; local147 <= 10; local147++) {
			@Pc(166) int local166;
			@Pc(168) int local168;
			for (local157 = 0; local157 < 8; local157++) {
				this.aLongArray15[local157] = 0L;
				local166 = 0;
				local168 = 56;
				while (local166 < 8) {
					this.aLongArray15[local157] = Static484.method6621(this.aLongArray15[local157], Class4_Sub29_Sub2.aLongArrayArray1[local166][(int) (this.aLongArray13[local157 - local166 & 0x7] >>> local168) & 0xFF]);
					local166++;
					local168 -= 8;
				}
			}
			for (local166 = 0; local166 < 8; local166++) {
				this.aLongArray13[local166] = this.aLongArray15[local166];
			}
			this.aLongArray13[0] = Static484.method6621(this.aLongArray13[0], Class4_Sub29_Sub2.aLongArray9[local147]);
			@Pc(252) int local252;
			for (local168 = 0; local168 < 8; local168++) {
				this.aLongArray15[local168] = this.aLongArray13[local168];
				local252 = 0;
				@Pc(254) int local254 = 56;
				while (local252 < 8) {
					this.aLongArray15[local168] = Static484.method6621(this.aLongArray15[local168], Class4_Sub29_Sub2.aLongArrayArray1[local252][(int) (this.aLongArray12[local168 - local252 & 0x7] >>> local254) & 0xFF]);
					local254 -= 8;
					local252++;
				}
			}
			for (local252 = 0; local252 < 8; local252++) {
				this.aLongArray12[local252] = this.aLongArray15[local252];
			}
		}
		for (local157 = 0; local157 < 8; local157++) {
			this.aLongArray14[local157] = Static484.method6621(this.aLongArray14[local157], Static484.method6621(this.aLongArray16[local157], this.aLongArray12[local157]));
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "([BIB)V")
	public void method6071(@OriginalArg(0) byte[] arg0) {
		this.aByteArray66[this.anInt6889] = (byte) (this.aByteArray66[this.anInt6889] | 0x80 >>> (this.anInt6890 & 0x7));
		this.anInt6889++;
		if (this.anInt6889 > 32) {
			while (true) {
				if (this.anInt6889 >= 64) {
					this.method6070();
					this.anInt6889 = 0;
					break;
				}
				this.aByteArray66[this.anInt6889++] = 0;
			}
		}
		while (this.anInt6889 < 32) {
			this.aByteArray66[this.anInt6889++] = 0;
		}
		Static685.method6464(this.aByteArray65, 0, this.aByteArray66, 32, 32);
		this.method6070();
		@Pc(96) int local96 = 0;
		@Pc(98) int local98 = 0;
		while (local96 < 8) {
			@Pc(105) long local105 = this.aLongArray14[local96];
			arg0[local98] = (byte) (int) (local105 >>> 56);
			arg0[local98 + 1] = (byte) (int) (local105 >>> 48);
			arg0[local98 + 2] = (byte) (int) (local105 >>> 40);
			arg0[local98 + 3] = (byte) (int) (local105 >>> 32);
			arg0[local98 + 4] = (byte) (int) (local105 >>> 24);
			arg0[local98 + 5] = (byte) (int) (local105 >>> 16);
			arg0[local98 + 6] = (byte) (int) (local105 >>> 8);
			arg0[local98 + 7] = (byte) (int) local105;
			local98 += 8;
			local96++;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BJ[B)V")
	public void method6072(@OriginalArg(1) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(28) int local28 = this.anInt6890 & 0x7;
		@Pc(30) long local30 = arg0;
		@Pc(32) int local32 = 31;
		@Pc(34) int local34 = 0;
		while (local32 >= 0) {
			local34 += (this.aByteArray65[local32] & 0xFF) + ((int) local30 & 0xFF);
			this.aByteArray65[local32] = (byte) local34;
			local30 >>>= 0x8;
			local34 >>>= 0x8;
			local32--;
		}
		@Pc(94) int local94;
		while (arg0 > 8L) {
			local94 = arg1[local7] << local17 & 0xFF | (arg1[local7 - -1] & 0xFF) >>> 8 - local17;
			if (local94 < 0 || local94 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray66[this.anInt6889] = (byte) (this.aByteArray66[this.anInt6889] | local94 >>> local28);
			this.anInt6890 += 8 - local28;
			this.anInt6889++;
			if (this.anInt6890 == 512) {
				this.method6070();
				this.anInt6890 = this.anInt6889 = 0;
			}
			this.aByteArray66[this.anInt6889] = (byte) (local94 << 8 - local28 & 0xFF);
			arg0 -= 8L;
			this.anInt6890 += local28;
			local7++;
		}
		if (arg0 > 0L) {
			local94 = arg1[local7] << local17 & 0xFF;
			this.aByteArray66[this.anInt6889] = (byte) (this.aByteArray66[this.anInt6889] | local94 >>> local28);
		} else {
			local94 = 0;
		}
		if (arg0 + (long) local28 < 8L) {
			this.anInt6890 = (int) ((long) this.anInt6890 + arg0);
			return;
		}
		this.anInt6889++;
		arg0 -= (long) (8 - local28);
		this.anInt6890 += 8 - local28;
		if (this.anInt6890 == 512) {
			this.method6070();
			this.anInt6890 = this.anInt6889 = 0;
		}
		this.aByteArray66[this.anInt6889] = (byte) (local94 << 8 - local28 & 0xFF);
		this.anInt6890 += (int) arg0;
	}
}
