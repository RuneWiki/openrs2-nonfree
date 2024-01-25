import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class130 {

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "[J")
	private final long[] aLongArray5 = new long[8];

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "[J")
	private final long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
	private int anInt4322 = 0;

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "[B")
	private final byte[] aByteArray104 = new byte[64];

	@OriginalMember(owner = "client!hp", name = "j", descriptor = "[B")
	private final byte[] aByteArray103 = new byte[32];

	@OriginalMember(owner = "client!hp", name = "o", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!hp", name = "l", descriptor = "I")
	private int anInt4327 = 0;

	@OriginalMember(owner = "client!hp", name = "q", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "([BIB)V")
	public void method3485(@OriginalArg(0) byte[] arg0) {
		this.aByteArray104[this.anInt4327] = (byte) (this.aByteArray104[this.anInt4327] | 0x80 >>> (this.anInt4322 & 0x7));
		this.anInt4327++;
		if (this.anInt4327 > 32) {
			while (true) {
				if (this.anInt4327 >= 64) {
					this.method3490();
					this.anInt4327 = 0;
					break;
				}
				this.aByteArray104[this.anInt4327++] = 0;
			}
		}
		while (this.anInt4327 < 32) {
			this.aByteArray104[this.anInt4327++] = 0;
		}
		Static604.method6225(this.aByteArray103, 0, this.aByteArray104, 32, 32);
		this.method3490();
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 0;
		while (local93 < 8) {
			@Pc(102) long local102 = this.aLongArray5[local93];
			arg0[local95] = (byte) (local102 >>> 56);
			arg0[local95 + 1] = (byte) (local102 >>> 48);
			arg0[local95 + 2] = (byte) (local102 >>> 40);
			arg0[local95 + 3] = (byte) (local102 >>> 32);
			arg0[local95 + 4] = (byte) (local102 >>> 24);
			arg0[local95 + 5] = (byte) (local102 >>> 16);
			arg0[local95 + 6] = (byte) (local102 >>> 8);
			arg0[local95 + 7] = (byte) local102;
			local93++;
			local95 += 8;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(JZ[B)V")
	public void method3486(@OriginalArg(0) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(22) int local22 = this.anInt4322 & 0x7;
		@Pc(24) long local24 = arg0;
		@Pc(26) int local26 = 31;
		@Pc(28) int local28 = 0;
		while (local26 >= 0) {
			local28 += ((int) local24 & 0xFF) + (this.aByteArray103[local26] & 0xFF);
			this.aByteArray103[local26] = (byte) local28;
			local28 >>>= 0x8;
			local24 >>>= 0x8;
			local26--;
		}
		@Pc(92) int local92;
		while (arg0 > 8L) {
			local92 = arg1[local7] << local17 & 0xFF | (arg1[local7 + 1] & 0xFF) >>> 8 - local17;
			if (local92 < 0 || local92 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray104[this.anInt4327] = (byte) (this.aByteArray104[this.anInt4327] | local92 >>> local22);
			this.anInt4322 += 8 - local22;
			this.anInt4327++;
			if (this.anInt4322 == 512) {
				this.method3490();
				this.anInt4322 = this.anInt4327 = 0;
			}
			this.aByteArray104[this.anInt4327] = (byte) (local92 << 8 - local22 & 0xFF);
			this.anInt4322 += local22;
			local7++;
			arg0 -= 8L;
		}
		if (arg0 > 0L) {
			local92 = arg1[local7] << local17 & 0xFF;
			this.aByteArray104[this.anInt4327] = (byte) (this.aByteArray104[this.anInt4327] | local92 >>> local22);
		} else {
			local92 = 0;
		}
		if (arg0 + (long) local22 < 8L) {
			this.anInt4322 = (int) ((long) this.anInt4322 + arg0);
			return;
		}
		this.anInt4327++;
		arg0 -= 8 - local22;
		this.anInt4322 += 8 - local22;
		if (this.anInt4322 == 512) {
			this.method3490();
			this.anInt4322 = this.anInt4327 = 0;
		}
		this.aByteArray104[this.anInt4327] = (byte) (local92 << 8 - local22 & 0xFF);
		this.anInt4322 += (int) arg0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
	public void method3489() {
		for (@Pc(3) int local3 = 0; local3 < 32; local3++) {
			this.aByteArray103[local3] = 0;
		}
		this.anInt4322 = this.anInt4327 = 0;
		this.aByteArray104[0] = 0;
		for (@Pc(41) int local41 = 0; local41 < 8; local41++) {
			this.aLongArray5[local41] = 0L;
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
	private void method3490() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray8[local7] = Static531.method7277(Static191.method3354(255L, (long) this.aByteArray104[local9 + 7]), Static531.method7277(Static531.method7277(Static531.method7277(Static531.method7277(Static531.method7277(Static191.method3354(255L, (long) this.aByteArray104[local9 + 2]) << 40, Static531.method7277((long) this.aByteArray104[local9] << 56, Static191.method3354((long) this.aByteArray104[local9 + 1] << 48, 0xFFL << 48))), Static191.method3354(255L, (long) this.aByteArray104[local9 + 3]) << 32), Static191.method3354((long) this.aByteArray104[local9 + 4], 255L) << 24), Static191.method3354((long) this.aByteArray104[local9 + 5], 255L) << 16), Static191.method3354(255L, (long) this.aByteArray104[local9 + 6]) << 8));
			local9 += 8;
			local7++;
		}
		for (@Pc(113) int local113 = 0; local113 < 8; local113++) {
			this.aLongArray6[local113] = Static531.method7277(this.aLongArray8[local113], this.aLongArray7[local113] = this.aLongArray5[local113]);
		}
		@Pc(143) int local143;
		for (@Pc(139) int local139 = 1; local139 <= 10; local139++) {
			@Pc(152) int local152;
			@Pc(154) int local154;
			for (local143 = 0; local143 < 8; local143++) {
				this.aLongArray9[local143] = 0L;
				local152 = 0;
				local154 = 56;
				while (local152 < 8) {
					this.aLongArray9[local143] = Static531.method7277(this.aLongArray9[local143], Class226.aLongArrayArray1[local152][(int) (this.aLongArray7[local143 - local152 & 0x7] >>> local154) & 0xFF]);
					local154 -= 8;
					local152++;
				}
			}
			for (local152 = 0; local152 < 8; local152++) {
				this.aLongArray7[local152] = this.aLongArray9[local152];
			}
			this.aLongArray7[0] = Static531.method7277(this.aLongArray7[0], Class226.aLongArray12[local139]);
			@Pc(235) int local235;
			for (local154 = 0; local154 < 8; local154++) {
				this.aLongArray9[local154] = this.aLongArray7[local154];
				local235 = 0;
				@Pc(237) int local237 = 56;
				while (local235 < 8) {
					this.aLongArray9[local154] = Static531.method7277(this.aLongArray9[local154], Class226.aLongArrayArray1[local235][(int) (this.aLongArray6[local154 - local235 & 0x7] >>> local237) & 0xFF]);
					local235++;
					local237 -= 8;
				}
			}
			for (local235 = 0; local235 < 8; local235++) {
				this.aLongArray6[local235] = this.aLongArray9[local235];
			}
		}
		for (local143 = 0; local143 < 8; local143++) {
			this.aLongArray5[local143] = Static531.method7277(this.aLongArray5[local143], Static531.method7277(this.aLongArray6[local143], this.aLongArray8[local143]));
		}
	}
}
