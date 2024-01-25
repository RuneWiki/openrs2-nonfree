import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class4 {

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "[J")
	private final long[] aLongArray1 = new long[8];

	@OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
	private int anInt40 = 0;

	@OriginalMember(owner = "client!aba", name = "i", descriptor = "[J")
	private final long[] aLongArray2 = new long[8];

	@OriginalMember(owner = "client!aba", name = "o", descriptor = "[J")
	private final long[] aLongArray4 = new long[8];

	@OriginalMember(owner = "client!aba", name = "m", descriptor = "[J")
	private final long[] aLongArray3 = new long[8];

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
	private int anInt39 = 0;

	@OriginalMember(owner = "client!aba", name = "h", descriptor = "[B")
	private final byte[] aByteArray2 = new byte[64];

	@OriginalMember(owner = "client!aba", name = "r", descriptor = "[B")
	private final byte[] aByteArray3 = new byte[32];

	@OriginalMember(owner = "client!aba", name = "v", descriptor = "[J")
	private final long[] aLongArray5 = new long[8];

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IJ[B)V")
	public void method48(@OriginalArg(1) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(5) int local5 = 0;
		@Pc(15) int local15 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(26) int local26 = this.anInt39 & 0x7;
		@Pc(28) long local28 = arg0;
		@Pc(30) int local30 = 31;
		@Pc(32) int local32 = 0;
		while (local30 >= 0) {
			local32 += ((int) local28 & 0xFF) + (this.aByteArray3[local30] & 0xFF);
			this.aByteArray3[local30] = (byte) local32;
			local32 >>>= 0x8;
			local28 >>>= 0x8;
			local30--;
		}
		@Pc(85) int local85;
		while (arg0 > 8L) {
			local85 = arg1[local5] << local15 & 0xFF | (arg1[local5 + 1] & 0xFF) >>> 8 - local15;
			if (local85 < 0 || local85 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray2[this.anInt40] = (byte) (this.aByteArray2[this.anInt40] | local85 >>> local26);
			this.anInt40++;
			this.anInt39 += 8 - local26;
			if (this.anInt39 == 512) {
				this.method52();
				this.anInt39 = this.anInt40 = 0;
			}
			this.aByteArray2[this.anInt40] = (byte) (local85 << 8 - local26 & 0xFF);
			arg0 -= 8L;
			local5++;
			this.anInt39 += local26;
		}
		if (arg0 > 0L) {
			local85 = arg1[local5] << local15 & 0xFF;
			this.aByteArray2[this.anInt40] = (byte) (this.aByteArray2[this.anInt40] | local85 >>> local26);
		} else {
			local85 = 0;
		}
		if (arg0 + (long) local26 < 8L) {
			this.anInt39 = (int) ((long) this.anInt39 + arg0);
			return;
		}
		arg0 -= 8 - local26;
		this.anInt39 += 8 - local26;
		this.anInt40++;
		if (this.anInt39 == 512) {
			this.method52();
			this.anInt39 = this.anInt40 = 0;
		}
		this.aByteArray2[this.anInt40] = (byte) (local85 << 8 - local26 & 0xFF);
		this.anInt39 += (int) arg0;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "([BBI)V")
	public void method49(@OriginalArg(0) byte[] arg0) {
		this.aByteArray2[this.anInt40] = (byte) (this.aByteArray2[this.anInt40] | 0x80 >>> (this.anInt39 & 0x7));
		this.anInt40++;
		if (this.anInt40 > 32) {
			while (true) {
				if (this.anInt40 >= 64) {
					this.method52();
					this.anInt40 = 0;
					break;
				}
				this.aByteArray2[this.anInt40++] = 0;
			}
		}
		while (this.anInt40 < 32) {
			this.aByteArray2[this.anInt40++] = 0;
		}
		Static649.method4863(this.aByteArray3, 0, this.aByteArray2, 32, 32);
		this.method52();
		@Pc(91) int local91 = 0;
		@Pc(93) int local93 = 0;
		while (local91 < 8) {
			@Pc(99) long local99 = this.aLongArray4[local91];
			arg0[local93] = (byte) (local99 >>> 56);
			arg0[local93 + 1] = (byte) (local99 >>> 48);
			arg0[local93 + 2] = (byte) (local99 >>> 40);
			arg0[local93 + 3] = (byte) (local99 >>> 32);
			arg0[local93 + 4] = (byte) (local99 >>> 24);
			arg0[local93 + 5] = (byte) (local99 >>> 16);
			arg0[local93 + 6] = (byte) (local99 >>> 8);
			arg0[local93 + 7] = (byte) local99;
			local93 += 8;
			local91++;
		}
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)V")
	public void method50() {
		for (@Pc(1) int local1 = 0; local1 < 32; local1++) {
			this.aByteArray3[local1] = 0;
		}
		this.anInt39 = this.anInt40 = 0;
		this.aByteArray2[0] = 0;
		for (@Pc(33) int local33 = 0; local33 < 8; local33++) {
			this.aLongArray4[local33] = 0L;
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Z)V")
	private void method52() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		while (local1 < 8) {
			this.aLongArray1[local1] = Static118.method2466(Static118.method2466(Static574.method7884(255L, (long) this.aByteArray2[local3 + 6]) << 8, Static118.method2466(Static118.method2466(Static574.method7884(255L, (long) this.aByteArray2[local3 + 4]) << 24, Static118.method2466(Static574.method7884((long) this.aByteArray2[local3 + 3] << 32, 0xFFL << 32), Static118.method2466(Static118.method2466(Static574.method7884((long) this.aByteArray2[local3 + 1] << 48, 0xFFL << 48), (long) this.aByteArray2[local3] << 56), Static574.method7884(0xFFL << 40, (long) this.aByteArray2[local3 + 2] << 40)))), Static574.method7884(255L, (long) this.aByteArray2[local3 + 5]) << 16)), Static574.method7884((long) this.aByteArray2[local3 + 7], 255L));
			local3 += 8;
			local1++;
		}
		for (@Pc(114) int local114 = 0; local114 < 8; local114++) {
			this.aLongArray5[local114] = Static118.method2466(this.aLongArray1[local114], this.aLongArray2[local114] = this.aLongArray4[local114]);
		}
		@Pc(144) int local144;
		for (@Pc(141) int local141 = 1; local141 <= 10; local141++) {
			@Pc(152) int local152;
			@Pc(154) int local154;
			for (local144 = 0; local144 < 8; local144++) {
				this.aLongArray3[local144] = 0L;
				local152 = 0;
				local154 = 56;
				while (local152 < 8) {
					this.aLongArray3[local144] = Static118.method2466(this.aLongArray3[local144], Class12.aLongArrayArray1[local152][(int) (this.aLongArray2[local144 - local152 & 0x7] >>> local154) & 0xFF]);
					local154 -= 8;
					local152++;
				}
			}
			for (local152 = 0; local152 < 8; local152++) {
				this.aLongArray2[local152] = this.aLongArray3[local152];
			}
			this.aLongArray2[0] = Static118.method2466(this.aLongArray2[0], Class12.aLongArray6[local141]);
			@Pc(233) int local233;
			for (local154 = 0; local154 < 8; local154++) {
				this.aLongArray3[local154] = this.aLongArray2[local154];
				local233 = 0;
				@Pc(235) int local235 = 56;
				while (local233 < 8) {
					this.aLongArray3[local154] = Static118.method2466(this.aLongArray3[local154], Class12.aLongArrayArray1[local233][(int) (this.aLongArray5[local154 - local233 & 0x7] >>> local235) & 0xFF]);
					local233++;
					local235 -= 8;
				}
			}
			for (local233 = 0; local233 < 8; local233++) {
				this.aLongArray5[local233] = this.aLongArray3[local233];
			}
		}
		for (local144 = 0; local144 < 8; local144++) {
			this.aLongArray4[local144] = Static118.method2466(this.aLongArray4[local144], Static118.method2466(this.aLongArray5[local144], this.aLongArray1[local144]));
		}
	}
}
