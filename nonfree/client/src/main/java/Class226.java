import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class226 {

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "[J")
	private final long[] aLongArray10 = new long[8];

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "[B")
	private final byte[] aByteArray57 = new byte[32];

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "[J")
	private final long[] aLongArray11 = new long[8];

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "[J")
	private final long[] aLongArray13 = new long[8];

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "[J")
	private final long[] aLongArray12 = new long[8];

	@OriginalMember(owner = "client!mr", name = "k", descriptor = "[B")
	private final byte[] aByteArray58 = new byte[64];

	@OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
	private int anInt6642 = 0;

	@OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
	private int anInt6643 = 0;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "([BBJ)V")
	public void method5776(@OriginalArg(0) byte[] arg0, @OriginalArg(2) long arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(21) int local21 = this.anInt6642 & 0x7;
		@Pc(31) long local31 = arg1;
		@Pc(33) int local33 = 31;
		@Pc(35) int local35 = 0;
		while (local33 >= 0) {
			local35 += ((int) local31 & 0xFF) + (this.aByteArray57[local33] & 0xFF);
			this.aByteArray57[local33] = (byte) local35;
			local35 >>>= 0x8;
			local31 >>>= 0x8;
			local33--;
		}
		@Pc(91) int local91;
		while (arg1 > 8L) {
			local91 = arg0[local7] << local16 & 0xFF | (arg0[local7 + 1] & 0xFF) >>> 8 - local16;
			if (local91 < 0 || local91 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray58[this.anInt6643] = (byte) (this.aByteArray58[this.anInt6643] | local91 >>> local21);
			this.anInt6643++;
			this.anInt6642 += 8 - local21;
			if (this.anInt6642 == 512) {
				this.method5779();
				this.anInt6642 = this.anInt6643 = 0;
			}
			this.aByteArray58[this.anInt6643] = (byte) (local91 << 8 - local21 & 0xFF);
			this.anInt6642 += local21;
			local7++;
			arg1 -= 8L;
		}
		if (arg1 > 0L) {
			local91 = arg0[local7] << local16 & 0xFF;
			this.aByteArray58[this.anInt6643] = (byte) (this.aByteArray58[this.anInt6643] | local91 >>> local21);
		} else {
			local91 = 0;
		}
		if (arg1 + (long) local21 < 8L) {
			this.anInt6642 = (int) ((long) this.anInt6642 + arg1);
			return;
		}
		this.anInt6643++;
		arg1 -= (long) (8 - local21);
		this.anInt6642 += 8 - local21;
		if (this.anInt6642 == 512) {
			this.method5779();
			this.anInt6642 = this.anInt6643 = 0;
		}
		this.aByteArray58[this.anInt6643] = (byte) (local91 << 8 - local21 & 0xFF);
		this.anInt6642 += (int) arg1;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II[B)V")
	public void method5778(@OriginalArg(2) byte[] arg0) {
		this.aByteArray58[this.anInt6643] = (byte) (this.aByteArray58[this.anInt6643] | 0x80 >>> (this.anInt6642 & 0x7));
		this.anInt6643++;
		if (this.anInt6643 > 32) {
			while (true) {
				if (this.anInt6643 >= 64) {
					this.method5779();
					this.anInt6643 = 0;
					break;
				}
				this.aByteArray58[this.anInt6643++] = 0;
			}
		}
		while (this.anInt6643 < 32) {
			this.aByteArray58[this.anInt6643++] = 0;
		}
		Static651.method749(this.aByteArray57, 0, this.aByteArray58, 32, 32);
		this.method5779();
		@Pc(92) int local92 = 0;
		@Pc(94) int local94 = 0;
		while (local92 < 8) {
			@Pc(101) long local101 = this.aLongArray13[local92];
			arg0[local94] = (byte) (int) (local101 >>> 56);
			arg0[local94 + 1] = (byte) (int) (local101 >>> 48);
			arg0[local94 + 2] = (byte) (int) (local101 >>> 40);
			arg0[local94 + 3] = (byte) (int) (local101 >>> 32);
			arg0[local94 + 4] = (byte) (int) (local101 >>> 24);
			arg0[local94 + 5] = (byte) (int) (local101 >>> 16);
			arg0[local94 + 6] = (byte) (int) (local101 >>> 8);
			arg0[local94 + 7] = (byte) (int) local101;
			local94 += 8;
			local92++;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Z)V")
	private void method5779() {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15 = 0;
		while (local7 < 8) {
			this.aLongArray10[local7] = Static356.method5753(Static356.method5753(Static356.method5753(Static465.method6887(255L, (long) this.aByteArray58[local15 + 5]) << 16, Static356.method5753(Static356.method5753(Static465.method6887(0xFFL << 32, (long) this.aByteArray58[local15 + 3] << 32), Static356.method5753(Static465.method6887(0xFFL << 40, (long) this.aByteArray58[local15 + 2] << 40), Static356.method5753(Static465.method6887(255L, (long) this.aByteArray58[local15 + 1]) << 48, (long) this.aByteArray58[local15] << 56))), Static465.method6887((long) this.aByteArray58[local15 + 4], 255L) << 24)), Static465.method6887(0xFFL << 8, (long) this.aByteArray58[local15 + 6] << 8)), Static465.method6887((long) this.aByteArray58[local15 + 7], 255L));
			local15 += 8;
			local7++;
		}
		for (@Pc(125) int local125 = 0; local125 < 8; local125++) {
			this.aLongArray12[local125] = Static356.method5753(this.aLongArray10[local125], this.aLongArray9[local125] = this.aLongArray13[local125]);
		}
		@Pc(157) int local157;
		for (@Pc(153) int local153 = 1; local153 <= 10; local153++) {
			@Pc(166) int local166;
			@Pc(168) int local168;
			for (local157 = 0; local157 < 8; local157++) {
				this.aLongArray11[local157] = 0L;
				local166 = 0;
				local168 = 56;
				while (local166 < 8) {
					this.aLongArray11[local157] = Static356.method5753(this.aLongArray11[local157], Class135.aLongArrayArray1[local166][(int) (this.aLongArray9[local157 - local166 & 0x7] >>> local168) & 0xFF]);
					local166++;
					local168 -= 8;
				}
			}
			for (local166 = 0; local166 < 8; local166++) {
				this.aLongArray9[local166] = this.aLongArray11[local166];
			}
			this.aLongArray9[0] = Static356.method5753(this.aLongArray9[0], Class135.aLongArray6[local153]);
			@Pc(254) int local254;
			for (local168 = 0; local168 < 8; local168++) {
				this.aLongArray11[local168] = this.aLongArray9[local168];
				local254 = 0;
				@Pc(256) int local256 = 56;
				while (local254 < 8) {
					this.aLongArray11[local168] = Static356.method5753(this.aLongArray11[local168], Class135.aLongArrayArray1[local254][(int) (this.aLongArray12[local168 - local254 & 0x7] >>> local256) & 0xFF]);
					local256 -= 8;
					local254++;
				}
			}
			for (local254 = 0; local254 < 8; local254++) {
				this.aLongArray12[local254] = this.aLongArray11[local254];
			}
		}
		for (local157 = 0; local157 < 8; local157++) {
			this.aLongArray13[local157] = Static356.method5753(this.aLongArray13[local157], Static356.method5753(this.aLongArray10[local157], this.aLongArray12[local157]));
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
	public void method5780() {
		for (@Pc(3) int local3 = 0; local3 < 32; local3++) {
			this.aByteArray57[local3] = 0;
		}
		this.anInt6642 = this.anInt6643 = 0;
		this.aByteArray58[0] = 0;
		for (@Pc(33) int local33 = 0; local33 < 8; local33++) {
			this.aLongArray13[local33] = 0L;
		}
	}
}
