import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class131 {

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "[J")
	private final long[] aLongArray5 = new long[8];

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "[B")
	private final byte[] aByteArray27 = new byte[32];

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
	private int anInt3737 = 0;

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "[J")
	private final long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "[B")
	private final byte[] aByteArray28 = new byte[64];

	@OriginalMember(owner = "client!gj", name = "r", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "[J")
	private final long[] aLongArray4 = new long[8];

	@OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
	private int anInt3741 = 0;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
	public void method3202() {
		for (@Pc(11) int local11 = 0; local11 < 32; local11++) {
			this.aByteArray27[local11] = 0;
		}
		this.aByteArray28[0] = 0;
		this.anInt3741 = this.anInt3737 = 0;
		for (@Pc(37) int local37 = 0; local37 < 8; local37++) {
			this.aLongArray6[local37] = 0L;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI[B)V")
	public void method3204(@OriginalArg(2) byte[] arg0) {
		this.aByteArray28[this.anInt3737] = (byte) (this.aByteArray28[this.anInt3737] | 0x80 >>> (this.anInt3741 & 0x7));
		this.anInt3737++;
		if (this.anInt3737 > 32) {
			while (true) {
				if (this.anInt3737 >= 64) {
					this.method3207();
					this.anInt3737 = 0;
					break;
				}
				this.aByteArray28[this.anInt3737++] = 0;
			}
		}
		while (this.anInt3737 < 32) {
			this.aByteArray28[this.anInt3737++] = 0;
		}
		Static650.method2274(this.aByteArray27, 0, this.aByteArray28, 32, 32);
		this.method3207();
		@Pc(86) int local86 = 0;
		@Pc(88) int local88 = 0;
		while (local86 < 8) {
			@Pc(95) long local95 = this.aLongArray6[local86];
			arg0[local88] = (byte) (int) (local95 >>> 56);
			arg0[local88 + 1] = (byte) (int) (local95 >>> 48);
			arg0[local88 + 2] = (byte) (int) (local95 >>> 40);
			arg0[local88 + 3] = (byte) (int) (local95 >>> 32);
			arg0[local88 + 4] = (byte) (int) (local95 >>> 24);
			arg0[local88 + 5] = (byte) (int) (local95 >>> 16);
			arg0[local88 + 6] = (byte) (int) (local95 >>> 8);
			arg0[local88 + 7] = (byte) (int) local95;
			local86++;
			local88 += 8;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
	private void method3207() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray5[local7] = Static31.method729(Static225.method3619((long) this.aByteArray28[local9 + 7], 255L), Static31.method729(Static31.method729(Static31.method729(Static31.method729(Static31.method729(Static225.method3619((long) this.aByteArray28[local9 + 2], 255L) << 40, Static31.method729((long) this.aByteArray28[local9] << 56, Static225.method3619((long) this.aByteArray28[local9 + 1], 255L) << 48)), Static225.method3619((long) this.aByteArray28[local9 + 3] << 32, 0xFFL << 32)), Static225.method3619((long) this.aByteArray28[local9 + 4], 255L) << 24), Static225.method3619(0xFFL << 16, (long) this.aByteArray28[local9 + 5] << 16)), Static225.method3619(255L, (long) this.aByteArray28[local9 + 6]) << 8));
			local9 += 8;
			local7++;
		}
		for (@Pc(121) int local121 = 0; local121 < 8; local121++) {
			this.aLongArray8[local121] = Static31.method729(this.aLongArray5[local121], this.aLongArray4[local121] = this.aLongArray6[local121]);
		}
		@Pc(151) int local151;
		for (@Pc(147) int local147 = 1; local147 <= 10; local147++) {
			@Pc(160) int local160;
			@Pc(162) int local162;
			for (local151 = 0; local151 < 8; local151++) {
				this.aLongArray7[local151] = 0L;
				local160 = 0;
				local162 = 56;
				while (local160 < 8) {
					this.aLongArray7[local151] = Static31.method729(this.aLongArray7[local151], Class2_Sub11_Sub1.aLongArrayArray1[local160][(int) (this.aLongArray4[local151 - local160 & 0x7] >>> local162) & 0xFF]);
					local160++;
					local162 -= 8;
				}
			}
			for (local160 = 0; local160 < 8; local160++) {
				this.aLongArray4[local160] = this.aLongArray7[local160];
			}
			this.aLongArray4[0] = Static31.method729(this.aLongArray4[0], Class2_Sub11_Sub1.aLongArray2[local147]);
			@Pc(242) int local242;
			for (local162 = 0; local162 < 8; local162++) {
				this.aLongArray7[local162] = this.aLongArray4[local162];
				local242 = 0;
				@Pc(244) int local244 = 56;
				while (local242 < 8) {
					this.aLongArray7[local162] = Static31.method729(this.aLongArray7[local162], Class2_Sub11_Sub1.aLongArrayArray1[local242][(int) (this.aLongArray8[local162 - local242 & 0x7] >>> local244) & 0xFF]);
					local244 -= 8;
					local242++;
				}
			}
			for (local242 = 0; local242 < 8; local242++) {
				this.aLongArray8[local242] = this.aLongArray7[local242];
			}
		}
		for (local151 = 0; local151 < 8; local151++) {
			this.aLongArray6[local151] = Static31.method729(this.aLongArray6[local151], Static31.method729(this.aLongArray8[local151], this.aLongArray5[local151]));
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(J[BI)V")
	public void method3209(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(22) int local22 = this.anInt3741 & 0x7;
		@Pc(24) long local24 = arg0;
		@Pc(34) int local34 = 31;
		@Pc(36) int local36 = 0;
		while (local34 >= 0) {
			local36 += ((int) local24 & 0xFF) + (this.aByteArray27[local34] & 0xFF);
			this.aByteArray27[local34] = (byte) local36;
			local24 >>>= 0x8;
			local36 >>>= 0x8;
			local34--;
		}
		@Pc(95) int local95;
		while (arg0 > 8L) {
			local95 = arg1[local7] << local17 & 0xFF | (arg1[local7 + 1] & 0xFF) >>> 8 - local17;
			if (local95 < 0 || local95 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray28[this.anInt3737] = (byte) (this.aByteArray28[this.anInt3737] | local95 >>> local22);
			this.anInt3741 += 8 - local22;
			this.anInt3737++;
			if (this.anInt3741 == 512) {
				this.method3207();
				this.anInt3741 = this.anInt3737 = 0;
			}
			this.aByteArray28[this.anInt3737] = (byte) (local95 << 8 - local22 & 0xFF);
			arg0 -= 8L;
			local7++;
			this.anInt3741 += local22;
		}
		if (arg0 > 0L) {
			local95 = arg1[local7] << local17 & 0xFF;
			this.aByteArray28[this.anInt3737] = (byte) (this.aByteArray28[this.anInt3737] | local95 >>> local22);
		} else {
			local95 = 0;
		}
		if ((long) local22 + arg0 < 8L) {
			this.anInt3741 = (int) ((long) this.anInt3741 + arg0);
			return;
		}
		this.anInt3737++;
		arg0 -= (long) (8 - local22);
		this.anInt3741 += 8 - local22;
		if (this.anInt3741 == 512) {
			this.method3207();
			this.anInt3741 = this.anInt3737 = 0;
		}
		this.aByteArray28[this.anInt3737] = (byte) (local95 << 8 - local22 & 0xFF);
		this.anInt3741 += (int) arg0;
	}
}
