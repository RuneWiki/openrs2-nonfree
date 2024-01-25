import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class175 {

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "[J")
	private final long[] aLongArray11 = new long[8];

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "[B")
	private final byte[] aByteArray38 = new byte[64];

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "[J")
	private final long[] aLongArray10 = new long[8];

	@OriginalMember(owner = "client!ik", name = "p", descriptor = "[J")
	private final long[] aLongArray12 = new long[8];

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
	private int anInt4976 = 0;

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
	private int anInt4978 = 0;

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "[B")
	private final byte[] aByteArray37 = new byte[32];

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
	private void method4507(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		while (local3 < 8) {
			this.aLongArray8[local3] = Static671.method8896(Static671.method8896(Static671.method8896(Static671.method8896(Static671.method8896(Static493.method7297((long) this.aByteArray38[local5 + 3] << 32, 0xFFL << 32), Static671.method8896(Static671.method8896((long) this.aByteArray38[local5] << 56, Static493.method7297((long) this.aByteArray38[local5 + 1], 255L) << 48), Static493.method7297((long) this.aByteArray38[local5 + 2], 255L) << 40)), Static493.method7297(255L, (long) this.aByteArray38[local5 + 4]) << 24), Static493.method7297(0xFFL << 16, (long) this.aByteArray38[local5 + 5] << 16)), Static493.method7297((long) this.aByteArray38[local5 + 6], 255L) << 8), Static493.method7297((long) this.aByteArray38[local5 + 7], 255L));
			local5 += 8;
			local3++;
		}
		for (@Pc(117) int local117 = 0; local117 < 8; local117++) {
			this.aLongArray11[local117] = Static671.method8896(this.aLongArray8[local117], this.aLongArray12[local117] = this.aLongArray10[local117]);
		}
		if (arg0 <= 23) {
			this.method4512((byte) 3);
		}
		@Pc(165) int local165;
		for (@Pc(161) int local161 = 1; local161 <= 10; local161++) {
			@Pc(174) int local174;
			@Pc(176) int local176;
			for (local165 = 0; local165 < 8; local165++) {
				this.aLongArray9[local165] = 0L;
				local174 = 0;
				local176 = 56;
				while (local174 < 8) {
					this.aLongArray9[local165] = Static671.method8896(this.aLongArray9[local165], Class6_Sub8_Sub22.aLongArrayArray1[local174][(int) (this.aLongArray12[local165 - local174 & 0x7] >>> local176) & 0xFF]);
					local176 -= 8;
					local174++;
				}
			}
			for (local174 = 0; local174 < 8; local174++) {
				this.aLongArray12[local174] = this.aLongArray9[local174];
			}
			this.aLongArray12[0] = Static671.method8896(this.aLongArray12[0], Class6_Sub8_Sub22.aLongArray16[local161]);
			@Pc(270) int local270;
			for (local176 = 0; local176 < 8; local176++) {
				this.aLongArray9[local176] = this.aLongArray12[local176];
				local270 = 0;
				@Pc(272) int local272 = 56;
				while (local270 < 8) {
					this.aLongArray9[local176] = Static671.method8896(this.aLongArray9[local176], Class6_Sub8_Sub22.aLongArrayArray1[local270][(int) (this.aLongArray11[local176 - local270 & 0x7] >>> local272) & 0xFF]);
					local272 -= 8;
					local270++;
				}
			}
			for (local270 = 0; local270 < 8; local270++) {
				this.aLongArray11[local270] = this.aLongArray9[local270];
			}
		}
		for (local165 = 0; local165 < 8; local165++) {
			this.aLongArray10[local165] = Static671.method8896(this.aLongArray10[local165], Static671.method8896(this.aLongArray8[local165], this.aLongArray11[local165]));
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([BIB)V")
	public void method4508(@OriginalArg(0) byte[] arg0) {
		this.aByteArray38[this.anInt4976] = (byte) (this.aByteArray38[this.anInt4976] | 0x80 >>> (this.anInt4978 & 0x7));
		this.anInt4976++;
		if (this.anInt4976 > 32) {
			while (true) {
				if (this.anInt4976 >= 64) {
					this.method4507((byte) 103);
					this.anInt4976 = 0;
					break;
				}
				this.aByteArray38[this.anInt4976++] = 0;
			}
		}
		while (this.anInt4976 < 32) {
			this.aByteArray38[this.anInt4976++] = 0;
		}
		Static695.method5648(this.aByteArray37, 0, this.aByteArray38, 32, 32);
		this.method4507((byte) 112);
		@Pc(113) int local113 = 0;
		@Pc(115) int local115 = 0;
		while (local113 < 8) {
			@Pc(122) long local122 = this.aLongArray10[local113];
			arg0[local115] = (byte) (int) (local122 >>> 56);
			arg0[local115 + 1] = (byte) (int) (local122 >>> 48);
			arg0[local115 + 2] = (byte) (int) (local122 >>> 40);
			arg0[local115 + 3] = (byte) (int) (local122 >>> 32);
			arg0[local115 + 4] = (byte) (int) (local122 >>> 24);
			arg0[local115 + 5] = (byte) (int) (local122 >>> 16);
			arg0[local115 + 6] = (byte) (int) (local122 >>> 8);
			arg0[local115 + 7] = (byte) (int) local122;
			local113++;
			local115 += 8;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(JI[B)V")
	public void method4510(@OriginalArg(0) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(21) int local21 = this.anInt4978 & 0x7;
		@Pc(23) long local23 = arg0;
		@Pc(25) int local25 = 31;
		@Pc(27) int local27 = 0;
		while (local25 >= 0) {
			local27 += (this.aByteArray37[local25] & 0xFF) + ((int) local23 & 0xFF);
			this.aByteArray37[local25] = (byte) local27;
			local27 >>>= 0x8;
			local23 >>>= 0x8;
			local25--;
		}
		@Pc(89) int local89;
		while (arg0 > 8L) {
			local89 = arg1[local7] << local16 & 0xFF | (arg1[local7 - -1] & 0xFF) >>> 8 - local16;
			if (local89 < 0 || local89 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray38[this.anInt4976] = (byte) (this.aByteArray38[this.anInt4976] | local89 >>> local21);
			this.anInt4978 += 8 - local21;
			this.anInt4976++;
			if (this.anInt4978 == 512) {
				this.method4507((byte) 87);
				this.anInt4978 = this.anInt4976 = 0;
			}
			this.aByteArray38[this.anInt4976] = (byte) (local89 << 8 - local21 & 0xFF);
			local7++;
			arg0 -= 8L;
			this.anInt4978 += local21;
		}
		if (256 != 256) {
			return;
		}
		if (arg0 > 0L) {
			local89 = arg1[local7] << local16 & 0xFF;
			this.aByteArray38[this.anInt4976] = (byte) (this.aByteArray38[this.anInt4976] | local89 >>> local21);
		} else {
			local89 = 0;
		}
		if ((long) local21 + arg0 < 8L) {
			this.anInt4978 = (int) ((long) this.anInt4978 + arg0);
			return;
		}
		this.anInt4978 += 8 - local21;
		this.anInt4976++;
		arg0 -= (long) (8 - local21);
		if (this.anInt4978 == 512) {
			this.method4507((byte) 76);
			this.anInt4978 = this.anInt4976 = 0;
		}
		this.aByteArray38[this.anInt4976] = (byte) (local89 << 8 - local21 & 0xFF);
		this.anInt4978 += (int) arg0;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
	public void method4512(@OriginalArg(0) byte arg0) {
		if (arg0 != -32) {
			Static259.method4511(-44);
		}
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			this.aByteArray37[local15] = 0;
		}
		this.anInt4978 = this.anInt4976 = 0;
		this.aByteArray38[0] = 0;
		for (@Pc(41) int local41 = 0; local41 < 8; local41++) {
			this.aLongArray10[local41] = 0L;
		}
	}
}
