import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class152 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "[B")
	private final byte[] aByteArray42 = new byte[32];

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
	private int anInt3141 = 0;

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "[J")
	private final long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "[B")
	private final byte[] aByteArray43 = new byte[64];

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "[J")
	private final long[] aLongArray10 = new long[8];

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
	private int anInt3140 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public void method2652() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray42[local7] = 0;
		}
		this.anInt3141 = this.anInt3140 = 0;
		this.aByteArray43[0] = 0;
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			this.aLongArray7[local31] = 0L;
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
	private void method2653() {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		while (local3 < 8) {
			this.aLongArray10[local3] = Static294.method7719(Static294.method7719(Static294.method7719(Static515.method6651(0xFFL << 16, (long) this.aByteArray43[local5 + 5] << 16), Static294.method7719(Static294.method7719(Static294.method7719(Static515.method6651((long) this.aByteArray43[local5 + 2] << 40, 0xFFL << 40), Static294.method7719((long) this.aByteArray43[local5] << 56, Static515.method6651(0xFFL << 48, (long) this.aByteArray43[local5 + 1] << 48))), Static515.method6651(255L, (long) this.aByteArray43[local5 + 3]) << 32), Static515.method6651((long) this.aByteArray43[local5 + 4], 255L) << 24)), Static515.method6651(0xFFL << 8, (long) this.aByteArray43[local5 + 6] << 8)), Static515.method6651((long) this.aByteArray43[local5 + 7], 255L));
			local3++;
			local5 += 8;
		}
		for (@Pc(129) int local129 = 0; local129 < 8; local129++) {
			this.aLongArray8[local129] = Static294.method7719(this.aLongArray10[local129], this.aLongArray6[local129] = this.aLongArray7[local129]);
		}
		@Pc(159) int local159;
		for (@Pc(155) int local155 = 1; local155 <= 10; local155++) {
			@Pc(168) int local168;
			@Pc(170) int local170;
			for (local159 = 0; local159 < 8; local159++) {
				this.aLongArray9[local159] = 0L;
				local168 = 0;
				local170 = 56;
				while (local168 < 8) {
					this.aLongArray9[local159] = Static294.method7719(this.aLongArray9[local159], Class330.aLongArrayArray1[local168][(int) (this.aLongArray6[local159 - local168 & 0x7] >>> local170) & 0xFF]);
					local168++;
					local170 -= 8;
				}
			}
			for (local168 = 0; local168 < 8; local168++) {
				this.aLongArray6[local168] = this.aLongArray9[local168];
			}
			this.aLongArray6[0] = Static294.method7719(this.aLongArray6[0], Class330.aLongArray16[local155]);
			@Pc(250) int local250;
			for (local170 = 0; local170 < 8; local170++) {
				this.aLongArray9[local170] = this.aLongArray6[local170];
				local250 = 0;
				@Pc(252) int local252 = 56;
				while (local250 < 8) {
					this.aLongArray9[local170] = Static294.method7719(this.aLongArray9[local170], Class330.aLongArrayArray1[local250][(int) (this.aLongArray8[local170 - local250 & 0x7] >>> local252) & 0xFF]);
					local252 -= 8;
					local250++;
				}
			}
			for (local250 = 0; local250 < 8; local250++) {
				this.aLongArray8[local250] = this.aLongArray9[local250];
			}
		}
		for (local159 = 0; local159 < 8; local159++) {
			this.aLongArray7[local159] = Static294.method7719(this.aLongArray7[local159], Static294.method7719(this.aLongArray8[local159], this.aLongArray10[local159]));
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([BJZ)V")
	public void method2654(@OriginalArg(0) byte[] arg0, @OriginalArg(1) long arg1) {
		@Pc(7) int local7 = 0;
		@Pc(25) int local25 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(30) int local30 = this.anInt3141 & 0x7;
		@Pc(32) long local32 = arg1;
		@Pc(34) int local34 = 31;
		@Pc(36) int local36 = 0;
		while (local34 >= 0) {
			local36 += ((int) local32 & 0xFF) + (this.aByteArray42[local34] & 0xFF);
			this.aByteArray42[local34] = (byte) local36;
			local32 >>>= 0x8;
			local36 >>>= 0x8;
			local34--;
		}
		@Pc(91) int local91;
		while (arg1 > 8L) {
			local91 = arg0[local7] << local25 & 0xFF | (arg0[local7 + 1] & 0xFF) >>> 8 - local25;
			if (local91 < 0 || local91 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray43[this.anInt3140] = (byte) (this.aByteArray43[this.anInt3140] | local91 >>> local30);
			this.anInt3141 += 8 - local30;
			this.anInt3140++;
			if (this.anInt3141 == 512) {
				this.method2653();
				this.anInt3141 = this.anInt3140 = 0;
			}
			this.aByteArray43[this.anInt3140] = (byte) (local91 << 8 - local30 & 0xFF);
			arg1 -= 8L;
			local7++;
			this.anInt3141 += local30;
		}
		if (arg1 <= 0L) {
			local91 = 0;
		} else {
			local91 = arg0[local7] << local25 & 0xFF;
			this.aByteArray43[this.anInt3140] = (byte) (this.aByteArray43[this.anInt3140] | local91 >>> local30);
		}
		if (arg1 + (long) local30 < 8L) {
			this.anInt3141 = (int) ((long) this.anInt3141 + arg1);
			return;
		}
		arg1 -= 8 - local30;
		this.anInt3140++;
		this.anInt3141 += 8 - local30;
		if (this.anInt3141 == 512) {
			this.method2653();
			this.anInt3141 = this.anInt3140 = 0;
		}
		this.aByteArray43[this.anInt3140] = (byte) (local91 << 8 - local30 & 0xFF);
		this.anInt3141 += (int) arg1;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ[B)V")
	public void method2657(@OriginalArg(2) byte[] arg0) {
		this.aByteArray43[this.anInt3140] = (byte) (this.aByteArray43[this.anInt3140] | 0x80 >>> (this.anInt3141 & 0x7));
		this.anInt3140++;
		if (this.anInt3140 > 32) {
			while (true) {
				if (this.anInt3140 >= 64) {
					this.method2653();
					this.anInt3140 = 0;
					break;
				}
				this.aByteArray43[this.anInt3140++] = 0;
			}
		}
		while (this.anInt3140 < 32) {
			this.aByteArray43[this.anInt3140++] = 0;
		}
		Static598.method4261(this.aByteArray42, 0, this.aByteArray43, 32, 32);
		this.method2653();
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 0;
		while (local93 < 8) {
			@Pc(102) long local102 = this.aLongArray7[local93];
			arg0[local95] = (byte) (local102 >>> 56);
			arg0[local95 + 1] = (byte) (local102 >>> 48);
			arg0[local95 + 2] = (byte) (local102 >>> 40);
			arg0[local95 + 3] = (byte) (local102 >>> 32);
			arg0[local95 + 4] = (byte) (local102 >>> 24);
			arg0[local95 + 5] = (byte) (local102 >>> 16);
			arg0[local95 + 6] = (byte) (local102 >>> 8);
			arg0[local95 + 7] = (byte) local102;
			local95 += 8;
			local93++;
		}
	}
}
