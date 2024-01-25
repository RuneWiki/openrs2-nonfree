import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class72 {

	@OriginalMember(owner = "client!db", name = "b", descriptor = "[J")
	private final long[] aLongArray5 = new long[8];

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	private int anInt1471 = 0;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!db", name = "l", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!db", name = "f", descriptor = "[B")
	private final byte[] aByteArray19 = new byte[64];

	@OriginalMember(owner = "client!db", name = "g", descriptor = "[B")
	private final byte[] aByteArray20 = new byte[32];

	@OriginalMember(owner = "client!db", name = "o", descriptor = "[J")
	private final long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!db", name = "j", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	private int anInt1478 = 0;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B[BJ)V")
	public void method1374(@OriginalArg(1) byte[] arg0, @OriginalArg(2) long arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(22) int local22 = this.anInt1478 & 0x7;
		@Pc(24) long local24 = arg1;
		@Pc(26) int local26 = 31;
		@Pc(28) int local28 = 0;
		while (local26 >= 0) {
			local28 += (this.aByteArray20[local26] & 0xFF) + ((int) local24 & 0xFF);
			this.aByteArray20[local26] = (byte) local28;
			local24 >>>= 0x8;
			local28 >>>= 0x8;
			local26--;
		}
		@Pc(98) int local98;
		while (arg1 > 8L) {
			local98 = arg0[local7] << local17 & 0xFF | (arg0[local7 + 1] & 0xFF) >>> 8 - local17;
			if (local98 < 0 || local98 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray19[this.anInt1471] = (byte) (this.aByteArray19[this.anInt1471] | local98 >>> local22);
			this.anInt1471++;
			this.anInt1478 += 8 - local22;
			if (this.anInt1478 == 512) {
				this.method1379();
				this.anInt1478 = this.anInt1471 = 0;
			}
			this.aByteArray19[this.anInt1471] = (byte) (local98 << 8 - local22 & 0xFF);
			arg1 -= 8L;
			this.anInt1478 += local22;
			local7++;
		}
		if (arg1 <= 0L) {
			local98 = 0;
		} else {
			local98 = arg0[local7] << local17 & 0xFF;
			this.aByteArray19[this.anInt1471] = (byte) (this.aByteArray19[this.anInt1471] | local98 >>> local22);
		}
		if (arg1 + (long) local22 < 8L) {
			this.anInt1478 = (int) ((long) this.anInt1478 + arg1);
			return;
		}
		arg1 -= (long) (8 - local22);
		this.anInt1471++;
		this.anInt1478 += 8 - local22;
		if (this.anInt1478 == 512) {
			this.method1379();
			this.anInt1478 = this.anInt1471 = 0;
		}
		this.aByteArray19[this.anInt1471] = (byte) (local98 << 8 - local22 & 0xFF);
		this.anInt1478 += (int) arg1;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([BII)V")
	public void method1375(@OriginalArg(0) byte[] arg0) {
		this.aByteArray19[this.anInt1471] = (byte) (this.aByteArray19[this.anInt1471] | 0x80 >>> (this.anInt1478 & 0x7));
		this.anInt1471++;
		if (this.anInt1471 > 32) {
			while (true) {
				if (this.anInt1471 >= 64) {
					this.method1379();
					this.anInt1471 = 0;
					break;
				}
				this.aByteArray19[this.anInt1471++] = 0;
			}
		}
		while (this.anInt1471 < 32) {
			this.aByteArray19[this.anInt1471++] = 0;
		}
		Static693.method8320(this.aByteArray20, 0, this.aByteArray19, 32, 32);
		this.method1379();
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		while (local100 < 8) {
			@Pc(109) long local109 = this.aLongArray8[local100];
			arg0[local102] = (byte) (int) (local109 >>> 56);
			arg0[local102 + 1] = (byte) (int) (local109 >>> 48);
			arg0[local102 + 2] = (byte) (int) (local109 >>> 40);
			arg0[local102 + 3] = (byte) (int) (local109 >>> 32);
			arg0[local102 + 4] = (byte) (int) (local109 >>> 24);
			arg0[local102 + 5] = (byte) (int) (local109 >>> 16);
			arg0[local102 + 6] = (byte) (int) (local109 >>> 8);
			arg0[local102 + 7] = (byte) (int) local109;
			local100++;
			local102 += 8;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public void method1376() {
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			this.aByteArray20[local12] = 0;
		}
		this.anInt1478 = this.anInt1471 = 0;
		this.aByteArray19[0] = 0;
		for (@Pc(40) int local40 = 0; local40 < 8; local40++) {
			this.aLongArray8[local40] = 0L;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	private void method1379() {
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		while (local8 < 8) {
			this.aLongArray7[local8] = Static92.method8232(Static646.method8929((long) this.aByteArray19[local10 + 7], 255L), Static92.method8232(Static92.method8232(Static646.method8929(255L, (long) this.aByteArray19[local10 + 5]) << 16, Static92.method8232(Static646.method8929((long) this.aByteArray19[local10 + 4], 255L) << 24, Static92.method8232(Static646.method8929(255L, (long) this.aByteArray19[local10 + 3]) << 32, Static92.method8232(Static646.method8929(255L, (long) this.aByteArray19[local10 + 2]) << 40, Static92.method8232(Static646.method8929((long) this.aByteArray19[local10 + 1], 255L) << 48, (long) this.aByteArray19[local10] << 56))))), Static646.method8929(0xFFL << 8, (long) this.aByteArray19[local10 + 6] << 8)));
			local10 += 8;
			local8++;
		}
		for (@Pc(122) int local122 = 0; local122 < 8; local122++) {
			this.aLongArray5[local122] = Static92.method8232(this.aLongArray7[local122], this.aLongArray6[local122] = this.aLongArray8[local122]);
		}
		@Pc(160) int local160;
		for (@Pc(154) int local154 = 1; local154 <= 10; local154++) {
			@Pc(169) int local169;
			@Pc(171) int local171;
			for (local160 = 0; local160 < 8; local160++) {
				this.aLongArray9[local160] = 0L;
				local169 = 0;
				local171 = 56;
				while (local169 < 8) {
					this.aLongArray9[local160] = Static92.method8232(this.aLongArray9[local160], Class6.aLongArrayArray1[local169][(int) (this.aLongArray6[local160 - local169 & 0x7] >>> local171) & 0xFF]);
					local169++;
					local171 -= 8;
				}
			}
			for (local169 = 0; local169 < 8; local169++) {
				this.aLongArray6[local169] = this.aLongArray9[local169];
			}
			this.aLongArray6[0] = Static92.method8232(this.aLongArray6[0], Class6.aLongArray1[local154]);
			@Pc(267) int local267;
			for (local171 = 0; local171 < 8; local171++) {
				this.aLongArray9[local171] = this.aLongArray6[local171];
				local267 = 0;
				@Pc(269) int local269 = 56;
				while (local267 < 8) {
					this.aLongArray9[local171] = Static92.method8232(this.aLongArray9[local171], Class6.aLongArrayArray1[local267][(int) (this.aLongArray5[local171 - local267 & 0x7] >>> local269) & 0xFF]);
					local269 -= 8;
					local267++;
				}
			}
			for (local267 = 0; local267 < 8; local267++) {
				this.aLongArray5[local267] = this.aLongArray9[local267];
			}
		}
		for (local160 = 0; local160 < 8; local160++) {
			this.aLongArray8[local160] = Static92.method8232(this.aLongArray8[local160], Static92.method8232(this.aLongArray7[local160], this.aLongArray5[local160]));
		}
	}
}
