import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class147 {

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
	private int anInt4038 = 0;

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!hw", name = "j", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!hw", name = "i", descriptor = "I")
	private int anInt4041 = 0;

	@OriginalMember(owner = "client!hw", name = "k", descriptor = "[B")
	private final byte[] aByteArray42 = new byte[32];

	@OriginalMember(owner = "client!hw", name = "l", descriptor = "[J")
	private final long[] aLongArray10 = new long[8];

	@OriginalMember(owner = "client!hw", name = "m", descriptor = "[J")
	private final long[] aLongArray11 = new long[8];

	@OriginalMember(owner = "client!hw", name = "n", descriptor = "[B")
	private final byte[] aByteArray43 = new byte[64];

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "([BIZ)V")
	public void method3259(@OriginalArg(0) byte[] arg0) {
		this.aByteArray43[this.anInt4041] = (byte) (this.aByteArray43[this.anInt4041] | 0x80 >>> (this.anInt4038 & 0x7));
		this.anInt4041++;
		if (this.anInt4041 > 32) {
			while (true) {
				if (this.anInt4041 >= 64) {
					this.method3263();
					this.anInt4041 = 0;
					break;
				}
				this.aByteArray43[this.anInt4041++] = 0;
			}
		}
		while (this.anInt4041 < 32) {
			this.aByteArray43[this.anInt4041++] = 0;
		}
		Static598.method1173(this.aByteArray42, 0, this.aByteArray43, 32, 32);
		this.method3263();
		@Pc(88) int local88 = 0;
		@Pc(90) int local90 = 0;
		while (local88 < 8) {
			@Pc(103) long local103 = this.aLongArray11[local88];
			arg0[local90] = (byte) (local103 >>> 56);
			arg0[local90 + 1] = (byte) (local103 >>> 48);
			arg0[local90 + 2] = (byte) (local103 >>> 40);
			arg0[local90 + 3] = (byte) (local103 >>> 32);
			arg0[local90 + 4] = (byte) (local103 >>> 24);
			arg0[local90 + 5] = (byte) (local103 >>> 16);
			arg0[local90 + 6] = (byte) (local103 >>> 8);
			arg0[local90 + 7] = (byte) local103;
			local88++;
			local90 += 8;
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
	public void method3261() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray42[local7] = 0;
		}
		this.anInt4038 = this.anInt4041 = 0;
		this.aByteArray43[0] = 0;
		for (@Pc(39) int local39 = 0; local39 < 8; local39++) {
			this.aLongArray11[local39] = 0L;
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(JZ[B)V")
	public void method3262(@OriginalArg(0) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(22) int local22 = this.anInt4038 & 0x7;
		@Pc(24) long local24 = arg0;
		@Pc(26) int local26 = 31;
		@Pc(28) int local28 = 0;
		while (local26 >= 0) {
			local28 += (this.aByteArray42[local26] & 0xFF) + ((int) local24 & 0xFF);
			this.aByteArray42[local26] = (byte) local28;
			local28 >>>= 0x8;
			local24 >>>= 0x8;
			local26--;
		}
		@Pc(93) int local93;
		while (arg0 > 8L) {
			local93 = arg1[local7] << local17 & 0xFF | (arg1[local7 + 1] & 0xFF) >>> 8 - local17;
			if (local93 < 0 || local93 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray43[this.anInt4041] = (byte) (this.aByteArray43[this.anInt4041] | local93 >>> local22);
			this.anInt4041++;
			this.anInt4038 += 8 - local22;
			if (this.anInt4038 == 512) {
				this.method3263();
				this.anInt4038 = this.anInt4041 = 0;
			}
			this.aByteArray43[this.anInt4041] = (byte) (local93 << 8 - local22 & 0xFF);
			local7++;
			this.anInt4038 += local22;
			arg0 -= 8L;
		}
		if (arg0 > 0L) {
			local93 = arg1[local7] << local17 & 0xFF;
			this.aByteArray43[this.anInt4041] = (byte) (this.aByteArray43[this.anInt4041] | local93 >>> local22);
		} else {
			local93 = 0;
		}
		if ((long) local22 + arg0 < 8L) {
			this.anInt4038 = (int) ((long) this.anInt4038 + arg0);
			return;
		}
		arg0 -= 8 - local22;
		this.anInt4041++;
		this.anInt4038 += 8 - local22;
		if (this.anInt4038 == 512) {
			this.method3263();
			this.anInt4038 = this.anInt4041 = 0;
		}
		this.aByteArray43[this.anInt4041] = (byte) (local93 << 8 - local22 & 0xFF);
		this.anInt4038 += (int) arg0;
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)V")
	private void method3263() {
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		while (local8 < 8) {
			this.aLongArray8[local8] = Static340.method4683(Static340.method4683(Static340.method4683(Static340.method4683(Static340.method4683(Static340.method4683(Static577.method7748((long) this.aByteArray43[local10 + 2], 255L) << 40, Static340.method4683((long) this.aByteArray43[local10] << 56, Static577.method7748(0xFFL << 48, (long) this.aByteArray43[local10 + 1] << 48))), Static577.method7748((long) this.aByteArray43[local10 + 3] << 32, 0xFFL << 32)), Static577.method7748((long) this.aByteArray43[local10 + 4], 255L) << 24), Static577.method7748((long) this.aByteArray43[local10 + 5], 255L) << 16), Static577.method7748((long) this.aByteArray43[local10 + 6] << 8, 0xFFL << 8)), Static577.method7748((long) this.aByteArray43[local10 + 7], 255L));
			local8++;
			local10 += 8;
		}
		for (@Pc(124) int local124 = 0; local124 < 8; local124++) {
			this.aLongArray10[local124] = Static340.method4683(this.aLongArray8[local124], this.aLongArray9[local124] = this.aLongArray11[local124]);
		}
		@Pc(154) int local154;
		for (@Pc(150) int local150 = 1; local150 <= 10; local150++) {
			@Pc(163) int local163;
			@Pc(165) int local165;
			for (local154 = 0; local154 < 8; local154++) {
				this.aLongArray7[local154] = 0L;
				local163 = 0;
				local165 = 56;
				while (local163 < 8) {
					this.aLongArray7[local154] = Static340.method4683(this.aLongArray7[local154], Class304.aLongArrayArray1[local163][(int) (this.aLongArray9[local154 - local163 & 0x7] >>> local165) & 0xFF]);
					local165 -= 8;
					local163++;
				}
			}
			for (local163 = 0; local163 < 8; local163++) {
				this.aLongArray9[local163] = this.aLongArray7[local163];
			}
			this.aLongArray9[0] = Static340.method4683(this.aLongArray9[0], Class304.aLongArray23[local150]);
			@Pc(248) int local248;
			for (local165 = 0; local165 < 8; local165++) {
				this.aLongArray7[local165] = this.aLongArray9[local165];
				local248 = 0;
				@Pc(250) int local250 = 56;
				while (local248 < 8) {
					this.aLongArray7[local165] = Static340.method4683(this.aLongArray7[local165], Class304.aLongArrayArray1[local248][(int) (this.aLongArray10[local165 - local248 & 0x7] >>> local250) & 0xFF]);
					local250 -= 8;
					local248++;
				}
			}
			for (local248 = 0; local248 < 8; local248++) {
				this.aLongArray10[local248] = this.aLongArray7[local248];
			}
		}
		for (local154 = 0; local154 < 8; local154++) {
			this.aLongArray11[local154] = Static340.method4683(this.aLongArray11[local154], Static340.method4683(this.aLongArray10[local154], this.aLongArray8[local154]));
		}
	}
}
