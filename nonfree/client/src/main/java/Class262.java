import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qba")
public final class Class262 {

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "[J")
	private final long[] aLongArray11 = new long[8];

	@OriginalMember(owner = "client!qba", name = "d", descriptor = "[J")
	private final long[] aLongArray12 = new long[8];

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "I")
	private int anInt8187 = 0;

	@OriginalMember(owner = "client!qba", name = "f", descriptor = "[J")
	private final long[] aLongArray13 = new long[8];

	@OriginalMember(owner = "client!qba", name = "h", descriptor = "[J")
	private final long[] aLongArray14 = new long[8];

	@OriginalMember(owner = "client!qba", name = "j", descriptor = "[B")
	private final byte[] aByteArray88 = new byte[64];

	@OriginalMember(owner = "client!qba", name = "l", descriptor = "I")
	private int anInt8192 = 0;

	@OriginalMember(owner = "client!qba", name = "m", descriptor = "[B")
	private final byte[] aByteArray89 = new byte[32];

	@OriginalMember(owner = "client!qba", name = "n", descriptor = "[J")
	private final long[] aLongArray15 = new long[8];

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)V")
	private void method6740() {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		while (local5 < 8) {
			this.aLongArray14[local5] = Static36.method1093(Static227.method3887(255L, (long) this.aByteArray88[local7 + 7]), Static36.method1093(Static227.method3887(255L, (long) this.aByteArray88[local7 + 6]) << 8, Static36.method1093(Static36.method1093(Static36.method1093(Static36.method1093(Static36.method1093(Static227.method3887((long) this.aByteArray88[local7 + 1], 255L) << 48, (long) this.aByteArray88[local7] << 56), Static227.method3887(0xFFL << 40, (long) this.aByteArray88[local7 + 2] << 40)), Static227.method3887(0xFFL << 32, (long) this.aByteArray88[local7 + 3] << 32)), Static227.method3887(255L, (long) this.aByteArray88[local7 + 4]) << 24), Static227.method3887(255L, (long) this.aByteArray88[local7 + 5]) << 16)));
			local5++;
			local7 += 8;
		}
		for (@Pc(114) int local114 = 0; local114 < 8; local114++) {
			this.aLongArray12[local114] = Static36.method1093(this.aLongArray14[local114], this.aLongArray11[local114] = this.aLongArray15[local114]);
		}
		@Pc(142) int local142;
		for (@Pc(139) int local139 = 1; local139 <= 10; local139++) {
			@Pc(150) int local150;
			@Pc(152) int local152;
			for (local142 = 0; local142 < 8; local142++) {
				this.aLongArray13[local142] = 0L;
				local150 = 0;
				local152 = 56;
				while (local150 < 8) {
					this.aLongArray13[local142] = Static36.method1093(this.aLongArray13[local142], Class94_Sub1.aLongArrayArray1[local150][(int) (this.aLongArray11[local142 - local150 & 0x7] >>> local152) & 0xFF]);
					local150++;
					local152 -= 8;
				}
			}
			for (local150 = 0; local150 < 8; local150++) {
				this.aLongArray11[local150] = this.aLongArray13[local150];
			}
			this.aLongArray11[0] = Static36.method1093(this.aLongArray11[0], Class94_Sub1.aLongArray5[local139]);
			@Pc(233) int local233;
			for (local152 = 0; local152 < 8; local152++) {
				this.aLongArray13[local152] = this.aLongArray11[local152];
				local233 = 0;
				@Pc(235) int local235 = 56;
				while (local233 < 8) {
					this.aLongArray13[local152] = Static36.method1093(this.aLongArray13[local152], Class94_Sub1.aLongArrayArray1[local233][(int) (this.aLongArray12[local152 - local233 & 0x7] >>> local235) & 0xFF]);
					local233++;
					local235 -= 8;
				}
			}
			for (local233 = 0; local233 < 8; local233++) {
				this.aLongArray12[local233] = this.aLongArray13[local233];
			}
		}
		for (local142 = 0; local142 < 8; local142++) {
			this.aLongArray15[local142] = Static36.method1093(this.aLongArray15[local142], Static36.method1093(this.aLongArray12[local142], this.aLongArray14[local142]));
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(J[BB)V")
	public void method6741(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(5) int local5 = 0;
		@Pc(15) int local15 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(20) int local20 = this.anInt8187 & 0x7;
		@Pc(22) long local22 = arg0;
		@Pc(30) int local30 = 31;
		@Pc(32) int local32 = 0;
		while (local30 >= 0) {
			local32 += (this.aByteArray89[local30] & 0xFF) + ((int) local22 & 0xFF);
			this.aByteArray89[local30] = (byte) local32;
			local32 >>>= 0x8;
			local22 >>>= 0x8;
			local30--;
		}
		@Pc(89) int local89;
		while (arg0 > 8L) {
			local89 = arg1[local5] << local15 & 0xFF | (arg1[local5 + 1] & 0xFF) >>> 8 - local15;
			if (local89 < 0 || local89 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray88[this.anInt8192] = (byte) (this.aByteArray88[this.anInt8192] | local89 >>> local20);
			this.anInt8187 += 8 - local20;
			this.anInt8192++;
			if (this.anInt8187 == 512) {
				this.method6740();
				this.anInt8187 = this.anInt8192 = 0;
			}
			this.aByteArray88[this.anInt8192] = (byte) (local89 << 8 - local20 & 0xFF);
			this.anInt8187 += local20;
			arg0 -= 8L;
			local5++;
		}
		if (arg0 > 0L) {
			local89 = arg1[local5] << local15 & 0xFF;
			this.aByteArray88[this.anInt8192] = (byte) (this.aByteArray88[this.anInt8192] | local89 >>> local20);
		} else {
			local89 = 0;
		}
		if ((long) local20 + arg0 < 8L) {
			this.anInt8187 = (int) ((long) this.anInt8187 + arg0);
			return;
		}
		this.anInt8192++;
		arg0 -= 8 - local20;
		this.anInt8187 += 8 - local20;
		if (this.anInt8187 == 512) {
			this.method6740();
			this.anInt8187 = this.anInt8192 = 0;
		}
		this.aByteArray88[this.anInt8192] = (byte) (local89 << 8 - local20 & 0xFF);
		this.anInt8187 += (int) arg0;
	}

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "(I)V")
	public void method6742() {
		for (@Pc(5) int local5 = 0; local5 < 32; local5++) {
			this.aByteArray89[local5] = 0;
		}
		this.anInt8187 = this.anInt8192 = 0;
		this.aByteArray88[0] = 0;
		for (@Pc(36) int local36 = 0; local36 < 8; local36++) {
			this.aLongArray15[local36] = 0L;
		}
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(IB[B)V")
	public void method6743(@OriginalArg(2) byte[] arg0) {
		this.aByteArray88[this.anInt8192] = (byte) (this.aByteArray88[this.anInt8192] | 0x80 >>> (this.anInt8187 & 0x7));
		this.anInt8192++;
		if (this.anInt8192 > 32) {
			while (true) {
				if (this.anInt8192 >= 64) {
					this.method6740();
					this.anInt8192 = 0;
					break;
				}
				this.aByteArray88[this.anInt8192++] = 0;
			}
		}
		while (this.anInt8192 < 32) {
			this.aByteArray88[this.anInt8192++] = 0;
		}
		Static602.method4666(this.aByteArray89, 0, this.aByteArray88, 32, 32);
		this.method6740();
		@Pc(90) int local90 = 0;
		@Pc(92) int local92 = 0;
		while (local90 < 8) {
			@Pc(98) long local98 = this.aLongArray15[local90];
			arg0[local92] = (byte) (local98 >>> 56);
			arg0[local92 + 1] = (byte) (local98 >>> 48);
			arg0[local92 + 2] = (byte) (local98 >>> 40);
			arg0[local92 + 3] = (byte) (local98 >>> 32);
			arg0[local92 + 4] = (byte) (local98 >>> 24);
			arg0[local92 + 5] = (byte) (local98 >>> 16);
			arg0[local92 + 6] = (byte) (local98 >>> 8);
			arg0[local92 + 7] = (byte) local98;
			local90++;
			local92 += 8;
		}
	}
}
