import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class198 {

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
	private int anInt4658 = 0;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
	private int anInt4657 = 0;

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "[B")
	private final byte[] aByteArray66 = new byte[32];

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "[B")
	private final byte[] aByteArray65 = new byte[64];

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "[J")
	private final long[] aLongArray10 = new long[8];

	@OriginalMember(owner = "client!jl", name = "o", descriptor = "[J")
	private final long[] aLongArray11 = new long[8];

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "[J")
	private final long[] aLongArray12 = new long[8];

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
	public void method4241() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray66[local7] = 0;
		}
		this.aByteArray65[0] = 0;
		this.anInt4658 = this.anInt4657 = 0;
		for (@Pc(43) int local43 = 0; local43 < 8; local43++) {
			this.aLongArray8[local43] = 0L;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II[B)V")
	public void method4242(@OriginalArg(2) byte[] arg0) {
		this.aByteArray65[this.anInt4657] = (byte) (this.aByteArray65[this.anInt4657] | 0x80 >>> (this.anInt4658 & 0x7));
		this.anInt4657++;
		if (this.anInt4657 > 32) {
			while (true) {
				if (this.anInt4657 >= 64) {
					this.method4245(104);
					this.anInt4657 = 0;
					break;
				}
				this.aByteArray65[this.anInt4657++] = 0;
			}
		}
		while (this.anInt4657 < 32) {
			this.aByteArray65[this.anInt4657++] = 0;
		}
		Static728.method274(this.aByteArray66, 0, this.aByteArray65, 32, 32);
		this.method4245(67);
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		while (local116 < 8) {
			@Pc(125) long local125 = this.aLongArray8[local116];
			arg0[local118] = (byte) (int) (local125 >>> 56);
			arg0[local118 + 1] = (byte) (int) (local125 >>> 48);
			arg0[local118 + 2] = (byte) (int) (local125 >>> 40);
			arg0[local118 + 3] = (byte) (int) (local125 >>> 32);
			arg0[local118 + 4] = (byte) (int) (local125 >>> 24);
			arg0[local118 + 5] = (byte) (int) (local125 >>> 16);
			arg0[local118 + 6] = (byte) (int) (local125 >>> 8);
			arg0[local118 + 7] = (byte) (int) local125;
			local116++;
			local118 += 8;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B[BJ)V")
	public void method4243(@OriginalArg(1) byte[] arg0, @OriginalArg(2) long arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(26) int local26 = this.anInt4658 & 0x7;
		@Pc(28) long local28 = arg1;
		@Pc(30) int local30 = 31;
		@Pc(32) int local32 = 0;
		while (local30 >= 0) {
			local32 += ((int) local28 & 0xFF) + (this.aByteArray66[local30] & 0xFF);
			this.aByteArray66[local30] = (byte) local32;
			local32 >>>= 0x8;
			local28 >>>= 0x8;
			local30--;
		}
		@Pc(94) int local94;
		while (arg1 > 8L) {
			local94 = arg0[local7] << local16 & 0xFF | (arg0[local7 + 1] & 0xFF) >>> 8 - local16;
			if (local94 < 0 || local94 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray65[this.anInt4657] = (byte) (this.aByteArray65[this.anInt4657] | local94 >>> local26);
			this.anInt4657++;
			this.anInt4658 += 8 - local26;
			if (this.anInt4658 == 512) {
				this.method4245(84);
				this.anInt4658 = this.anInt4657 = 0;
			}
			this.aByteArray65[this.anInt4657] = (byte) (local94 << 8 - local26 & 0xFF);
			this.anInt4658 += local26;
			arg1 -= 8L;
			local7++;
		}
		if (arg1 > 0L) {
			local94 = arg0[local7] << local16 & 0xFF;
			this.aByteArray65[this.anInt4657] = (byte) (this.aByteArray65[this.anInt4657] | local94 >>> local26);
		} else {
			local94 = 0;
		}
		if ((long) local26 + arg1 < 8L) {
			this.anInt4658 = (int) ((long) this.anInt4658 + arg1);
			return;
		}
		arg1 -= (long) (8 - local26);
		this.anInt4657++;
		this.anInt4658 += 8 - local26;
		if (this.anInt4658 == 512) {
			this.method4245(78);
			this.anInt4658 = this.anInt4657 = 0;
		}
		this.aByteArray65[this.anInt4657] = (byte) (local94 << 8 - local26 & 0xFF);
		this.anInt4658 += (int) arg1;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	private void method4245(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		while (local3 < 8) {
			this.aLongArray9[local3] = Static491.method7040(Static491.method7040(Static491.method7040(Static491.method7040(Static519.method7354((long) this.aByteArray65[local5 + 4] << 24, 0xFFL << 24), Static491.method7040(Static491.method7040(Static519.method7354(255L, (long) this.aByteArray65[local5 + 2]) << 40, Static491.method7040(Static519.method7354((long) this.aByteArray65[local5 + 1] << 48, 0xFFL << 48), (long) this.aByteArray65[local5] << 56)), Static519.method7354((long) this.aByteArray65[local5 + 3], 255L) << 32)), Static519.method7354(0xFFL << 16, (long) this.aByteArray65[local5 + 5] << 16)), Static519.method7354(255L, (long) this.aByteArray65[local5 + 6]) << 8), Static519.method7354(255L, (long) this.aByteArray65[local5 + 7]));
			local3++;
			local5 += 8;
		}
		for (@Pc(121) int local121 = 0; local121 < 8; local121++) {
			this.aLongArray11[local121] = Static491.method7040(this.aLongArray9[local121], this.aLongArray12[local121] = this.aLongArray8[local121]);
		}
		if (arg0 < 66) {
			this.anInt4657 = 50;
		}
		@Pc(169) int local169;
		for (@Pc(165) int local165 = 1; local165 <= 10; local165++) {
			@Pc(178) int local178;
			@Pc(180) int local180;
			for (local169 = 0; local169 < 8; local169++) {
				this.aLongArray10[local169] = 0L;
				local178 = 0;
				local180 = 56;
				while (local178 < 8) {
					this.aLongArray10[local169] = Static491.method7040(this.aLongArray10[local169], Class155.aLongArrayArray1[local178][(int) (this.aLongArray12[local169 - local178 & 0x7] >>> local180) & 0xFF]);
					local178++;
					local180 -= 8;
				}
			}
			for (local178 = 0; local178 < 8; local178++) {
				this.aLongArray12[local178] = this.aLongArray10[local178];
			}
			this.aLongArray12[0] = Static491.method7040(this.aLongArray12[0], Class155.aLongArray6[local165]);
			@Pc(276) int local276;
			for (local180 = 0; local180 < 8; local180++) {
				this.aLongArray10[local180] = this.aLongArray12[local180];
				local276 = 0;
				@Pc(278) int local278 = 56;
				while (local276 < 8) {
					this.aLongArray10[local180] = Static491.method7040(this.aLongArray10[local180], Class155.aLongArrayArray1[local276][(int) (this.aLongArray11[local180 - local276 & 0x7] >>> local278) & 0xFF]);
					local278 -= 8;
					local276++;
				}
			}
			for (local276 = 0; local276 < 8; local276++) {
				this.aLongArray11[local276] = this.aLongArray10[local276];
			}
		}
		for (local169 = 0; local169 < 8; local169++) {
			this.aLongArray8[local169] = Static491.method7040(this.aLongArray8[local169], Static491.method7040(this.aLongArray9[local169], this.aLongArray11[local169]));
		}
	}
}
