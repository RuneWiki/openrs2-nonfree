import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class73 {

	@OriginalMember(owner = "client!du", name = "b", descriptor = "[J")
	private final long[] aLongArray3 = new long[8];

	@OriginalMember(owner = "client!du", name = "d", descriptor = "I")
	private int anInt2284 = 0;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "[J")
	private final long[] aLongArray2 = new long[8];

	@OriginalMember(owner = "client!du", name = "e", descriptor = "[J")
	private final long[] aLongArray4 = new long[8];

	@OriginalMember(owner = "client!du", name = "f", descriptor = "[B")
	private final byte[] aByteArray21 = new byte[64];

	@OriginalMember(owner = "client!du", name = "l", descriptor = "[B")
	private final byte[] aByteArray22 = new byte[32];

	@OriginalMember(owner = "client!du", name = "p", descriptor = "I")
	private int anInt2291 = 0;

	@OriginalMember(owner = "client!du", name = "o", descriptor = "[J")
	private final long[] aLongArray5 = new long[8];

	@OriginalMember(owner = "client!du", name = "r", descriptor = "[J")
	private final long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(B)V")
	public void method2183() {
		for (@Pc(3) int local3 = 0; local3 < 32; local3++) {
			this.aByteArray22[local3] = 0;
		}
		this.aByteArray21[0] = 0;
		this.anInt2291 = this.anInt2284 = 0;
		for (@Pc(41) int local41 = 0; local41 < 8; local41++) {
			this.aLongArray2[local41] = 0L;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
	private void method2186() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray5[local7] = Static446.method6893(Static295.method8180((long) this.aByteArray21[local9 + 7], 255L), Static446.method6893(Static295.method8180(255L, (long) this.aByteArray21[local9 + 6]) << 8, Static446.method6893(Static446.method6893(Static295.method8180(0xFFL << 24, (long) this.aByteArray21[local9 + 4] << 24), Static446.method6893(Static295.method8180(0xFFL << 32, (long) this.aByteArray21[local9 + 3] << 32), Static446.method6893(Static295.method8180((long) this.aByteArray21[local9 + 2], 255L) << 40, Static446.method6893(Static295.method8180((long) this.aByteArray21[local9 + 1], 255L) << 48, (long) this.aByteArray21[local9] << 56)))), Static295.method8180(0xFFL << 16, (long) this.aByteArray21[local9 + 5] << 16))));
			local7++;
			local9 += 8;
		}
		for (@Pc(119) int local119 = 0; local119 < 8; local119++) {
			this.aLongArray6[local119] = Static446.method6893(this.aLongArray5[local119], this.aLongArray3[local119] = this.aLongArray2[local119]);
		}
		@Pc(155) int local155;
		for (@Pc(151) int local151 = 1; local151 <= 10; local151++) {
			@Pc(164) int local164;
			@Pc(166) int local166;
			for (local155 = 0; local155 < 8; local155++) {
				this.aLongArray4[local155] = 0L;
				local164 = 0;
				local166 = 56;
				while (local164 < 8) {
					this.aLongArray4[local155] = Static446.method6893(this.aLongArray4[local155], Class193.aLongArrayArray1[local164][(int) (this.aLongArray3[local155 - local164 & 0x7] >>> local166) & 0xFF]);
					local166 -= 8;
					local164++;
				}
			}
			for (local164 = 0; local164 < 8; local164++) {
				this.aLongArray3[local164] = this.aLongArray4[local164];
			}
			this.aLongArray3[0] = Static446.method6893(this.aLongArray3[0], Class193.aLongArray11[local151]);
			@Pc(252) int local252;
			for (local166 = 0; local166 < 8; local166++) {
				this.aLongArray4[local166] = this.aLongArray3[local166];
				local252 = 0;
				@Pc(254) int local254 = 56;
				while (local252 < 8) {
					this.aLongArray4[local166] = Static446.method6893(this.aLongArray4[local166], Class193.aLongArrayArray1[local252][(int) (this.aLongArray6[local166 - local252 & 0x7] >>> local254) & 0xFF]);
					local252++;
					local254 -= 8;
				}
			}
			for (local252 = 0; local252 < 8; local252++) {
				this.aLongArray6[local252] = this.aLongArray4[local252];
			}
		}
		for (local155 = 0; local155 < 8; local155++) {
			this.aLongArray2[local155] = Static446.method6893(this.aLongArray2[local155], Static446.method6893(this.aLongArray6[local155], this.aLongArray5[local155]));
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Z[BI)V")
	public void method2187(@OriginalArg(1) byte[] arg0) {
		this.aByteArray21[this.anInt2284] = (byte) (this.aByteArray21[this.anInt2284] | 0x80 >>> (this.anInt2291 & 0x7));
		this.anInt2284++;
		if (this.anInt2284 > 32) {
			while (true) {
				if (this.anInt2284 >= 64) {
					this.method2186();
					this.anInt2284 = 0;
					break;
				}
				this.aByteArray21[this.anInt2284++] = 0;
			}
		}
		while (this.anInt2284 < 32) {
			this.aByteArray21[this.anInt2284++] = 0;
		}
		Static597.method3730(this.aByteArray22, 0, this.aByteArray21, 32, 32);
		this.method2186();
		@Pc(92) int local92 = 0;
		@Pc(100) int local100 = 0;
		while (local92 < 8) {
			@Pc(107) long local107 = this.aLongArray2[local92];
			arg0[local100] = (byte) (local107 >>> 56);
			arg0[local100 + 1] = (byte) (local107 >>> 48);
			arg0[local100 + 2] = (byte) (local107 >>> 40);
			arg0[local100 + 3] = (byte) (local107 >>> 32);
			arg0[local100 + 4] = (byte) (local107 >>> 24);
			arg0[local100 + 5] = (byte) (local107 >>> 16);
			arg0[local100 + 6] = (byte) (local107 >>> 8);
			arg0[local100 + 7] = (byte) local107;
			local100 += 8;
			local92++;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I[BJ)V")
	public void method2188(@OriginalArg(1) byte[] arg0, @OriginalArg(2) long arg1) {
		@Pc(7) int local7 = 0;
		@Pc(25) int local25 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(30) int local30 = this.anInt2291 & 0x7;
		@Pc(32) long local32 = arg1;
		@Pc(34) int local34 = 31;
		@Pc(36) int local36 = 0;
		while (local34 >= 0) {
			local36 += (this.aByteArray22[local34] & 0xFF) + ((int) local32 & 0xFF);
			this.aByteArray22[local34] = (byte) local36;
			local36 >>>= 0x8;
			local32 >>>= 0x8;
			local34--;
		}
		@Pc(95) int local95;
		while (arg1 > 8L) {
			local95 = arg0[local7] << local25 & 0xFF | (arg0[local7 + 1] & 0xFF) >>> 8 - local25;
			if (local95 < 0 || local95 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray21[this.anInt2284] = (byte) (this.aByteArray21[this.anInt2284] | local95 >>> local30);
			this.anInt2291 += 8 - local30;
			this.anInt2284++;
			if (this.anInt2291 == 512) {
				this.method2186();
				this.anInt2291 = this.anInt2284 = 0;
			}
			this.aByteArray21[this.anInt2284] = (byte) (local95 << 8 - local30 & 0xFF);
			arg1 -= 8L;
			this.anInt2291 += local30;
			local7++;
		}
		if (arg1 > 0L) {
			local95 = arg0[local7] << local25 & 0xFF;
			this.aByteArray21[this.anInt2284] = (byte) (this.aByteArray21[this.anInt2284] | local95 >>> local30);
		} else {
			local95 = 0;
		}
		if ((long) local30 + arg1 < 8L) {
			this.anInt2291 = (int) ((long) this.anInt2291 + arg1);
			return;
		}
		this.anInt2284++;
		this.anInt2291 += 8 - local30;
		arg1 -= 8 - local30;
		if (this.anInt2291 == 512) {
			this.method2186();
			this.anInt2291 = this.anInt2284 = 0;
		}
		this.aByteArray21[this.anInt2284] = (byte) (local95 << 8 - local30 & 0xFF);
		this.anInt2291 += (int) arg1;
	}
}
