import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class81 {

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "[B")
	private final byte[] aByteArray30 = new byte[32];

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "[J")
	private final long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "[J")
	private final long[] aLongArray5 = new long[8];

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
	private int anInt2264 = 0;

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
	private int anInt2261 = 0;

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "[B")
	private final byte[] aByteArray31 = new byte[64];

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "([BIJ)V")
	public void method1904(@OriginalArg(0) byte[] arg0, @OriginalArg(2) long arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(22) int local22 = this.anInt2264 & 0x7;
		@Pc(28) long local28 = arg1;
		@Pc(30) int local30 = 31;
		@Pc(32) int local32 = 0;
		while (local30 >= 0) {
			local32 += ((int) local28 & 0xFF) + (this.aByteArray30[local30] & 0xFF);
			this.aByteArray30[local30] = (byte) local32;
			local32 >>>= 0x8;
			local28 >>>= 0x8;
			local30--;
		}
		@Pc(91) int local91;
		while (arg1 > 8L) {
			local91 = arg0[local7] << local17 & 0xFF | (arg0[local7 - -1] & 0xFF) >>> 8 - local17;
			if (local91 < 0 || local91 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray31[this.anInt2261] = (byte) (this.aByteArray31[this.anInt2261] | local91 >>> local22);
			this.anInt2261++;
			this.anInt2264 += 8 - local22;
			if (this.anInt2264 == 512) {
				this.method1905();
				this.anInt2264 = this.anInt2261 = 0;
			}
			this.aByteArray31[this.anInt2261] = (byte) (local91 << 8 - local22 & 0xFF);
			arg1 -= 8L;
			local7++;
			this.anInt2264 += local22;
		}
		if (arg1 <= 0L) {
			local91 = 0;
		} else {
			local91 = arg0[local7] << local17 & 0xFF;
			this.aByteArray31[this.anInt2261] = (byte) (this.aByteArray31[this.anInt2261] | local91 >>> local22);
		}
		if (arg1 + (long) local22 < 8L) {
			this.anInt2264 = (int) ((long) this.anInt2264 + arg1);
			return;
		}
		this.anInt2261++;
		arg1 -= 8 - local22;
		this.anInt2264 += 8 - local22;
		if (this.anInt2264 == 512) {
			this.method1905();
			this.anInt2264 = this.anInt2261 = 0;
		}
		this.aByteArray31[this.anInt2261] = (byte) (local91 << 8 - local22 & 0xFF);
		this.anInt2264 += (int) arg1;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	private void method1905() {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		while (local3 < 8) {
			this.aLongArray8[local3] = Static162.method2506(Static232.method4014(255L, (long) this.aByteArray31[local5 + 7]), Static162.method2506(Static162.method2506(Static232.method4014(255L, (long) this.aByteArray31[local5 + 5]) << 16, Static162.method2506(Static232.method4014(255L, (long) this.aByteArray31[local5 + 4]) << 24, Static162.method2506(Static162.method2506(Static162.method2506((long) this.aByteArray31[local5] << 56, Static232.method4014((long) this.aByteArray31[local5 + 1], 255L) << 48), Static232.method4014(255L, (long) this.aByteArray31[local5 + 2]) << 40), Static232.method4014((long) this.aByteArray31[local5 + 3] << 32, 0xFFL << 32)))), Static232.method4014((long) this.aByteArray31[local5 + 6] << 8, 0xFFL << 8)));
			local3++;
			local5 += 8;
		}
		for (@Pc(117) int local117 = 0; local117 < 8; local117++) {
			this.aLongArray9[local117] = Static162.method2506(this.aLongArray8[local117], this.aLongArray6[local117] = this.aLongArray7[local117]);
		}
		@Pc(155) int local155;
		for (@Pc(151) int local151 = 1; local151 <= 10; local151++) {
			@Pc(164) int local164;
			@Pc(166) int local166;
			for (local155 = 0; local155 < 8; local155++) {
				this.aLongArray5[local155] = 0L;
				local164 = 0;
				local166 = 56;
				while (local164 < 8) {
					this.aLongArray5[local155] = Static162.method2506(this.aLongArray5[local155], Class160.aLongArrayArray1[local164][(int) (this.aLongArray6[local155 - local164 & 0x7] >>> local166) & 0xFF]);
					local164++;
					local166 -= 8;
				}
			}
			for (local164 = 0; local164 < 8; local164++) {
				this.aLongArray6[local164] = this.aLongArray5[local164];
			}
			this.aLongArray6[0] = Static162.method2506(this.aLongArray6[0], Class160.aLongArray13[local151]);
			@Pc(247) int local247;
			for (local166 = 0; local166 < 8; local166++) {
				this.aLongArray5[local166] = this.aLongArray6[local166];
				local247 = 0;
				@Pc(249) int local249 = 56;
				while (local247 < 8) {
					this.aLongArray5[local166] = Static162.method2506(this.aLongArray5[local166], Class160.aLongArrayArray1[local247][(int) (this.aLongArray9[local166 - local247 & 0x7] >>> local249) & 0xFF]);
					local247++;
					local249 -= 8;
				}
			}
			for (local247 = 0; local247 < 8; local247++) {
				this.aLongArray9[local247] = this.aLongArray5[local247];
			}
		}
		for (local155 = 0; local155 < 8; local155++) {
			this.aLongArray7[local155] = Static162.method2506(this.aLongArray7[local155], Static162.method2506(this.aLongArray8[local155], this.aLongArray9[local155]));
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB[B)V")
	public void method1907(@OriginalArg(2) byte[] arg0) {
		this.aByteArray31[this.anInt2261] = (byte) (this.aByteArray31[this.anInt2261] | 0x80 >>> (this.anInt2264 & 0x7));
		this.anInt2261++;
		if (this.anInt2261 > 32) {
			while (true) {
				if (this.anInt2261 >= 64) {
					this.method1905();
					this.anInt2261 = 0;
					break;
				}
				this.aByteArray31[this.anInt2261++] = 0;
			}
		}
		while (this.anInt2261 < 32) {
			this.aByteArray31[this.anInt2261++] = 0;
		}
		Static551.method3488(this.aByteArray30, 0, this.aByteArray31, 32, 32);
		this.method1905();
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		while (local100 < 8) {
			@Pc(109) long local109 = this.aLongArray7[local100];
			arg0[local102] = (byte) (local109 >>> 56);
			arg0[local102 + 1] = (byte) (local109 >>> 48);
			arg0[local102 + 2] = (byte) (local109 >>> 40);
			arg0[local102 + 3] = (byte) (local109 >>> 32);
			arg0[local102 + 4] = (byte) (local109 >>> 24);
			arg0[local102 + 5] = (byte) (local109 >>> 16);
			arg0[local102 + 6] = (byte) (local109 >>> 8);
			arg0[local102 + 7] = (byte) local109;
			local102 += 8;
			local100++;
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
	public void method1908() {
		for (@Pc(3) int local3 = 0; local3 < 32; local3++) {
			this.aByteArray30[local3] = 0;
		}
		this.aByteArray31[0] = 0;
		this.anInt2264 = this.anInt2261 = 0;
		for (@Pc(39) int local39 = 0; local39 < 8; local39++) {
			this.aLongArray7[local39] = 0L;
		}
	}
}
