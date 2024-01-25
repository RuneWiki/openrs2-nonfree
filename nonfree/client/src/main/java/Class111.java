import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fia")
public final class Class111 {

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "I")
	private int anInt2606 = 0;

	@OriginalMember(owner = "client!fia", name = "f", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!fia", name = "e", descriptor = "[B")
	private final byte[] aByteArray28 = new byte[64];

	@OriginalMember(owner = "client!fia", name = "j", descriptor = "[J")
	private final long[] aLongArray10 = new long[8];

	@OriginalMember(owner = "client!fia", name = "i", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!fia", name = "d", descriptor = "I")
	private int anInt2607 = 0;

	@OriginalMember(owner = "client!fia", name = "k", descriptor = "[J")
	private final long[] aLongArray11 = new long[8];

	@OriginalMember(owner = "client!fia", name = "c", descriptor = "[B")
	private final byte[] aByteArray27 = new byte[32];

	@OriginalMember(owner = "client!fia", name = "o", descriptor = "[J")
	private final long[] aLongArray12 = new long[8];

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "([BII)V")
	public void method2219(@OriginalArg(0) byte[] arg0) {
		this.aByteArray28[this.anInt2607] = (byte) (this.aByteArray28[this.anInt2607] | 0x80 >>> (this.anInt2606 & 0x7));
		this.anInt2607++;
		if (this.anInt2607 > 32) {
			while (true) {
				if (this.anInt2607 >= 64) {
					this.method2221();
					this.anInt2607 = 0;
					break;
				}
				this.aByteArray28[this.anInt2607++] = 0;
			}
		}
		while (this.anInt2607 < 32) {
			this.aByteArray28[this.anInt2607++] = 0;
		}
		Static679.method1563(this.aByteArray27, 0, this.aByteArray28, 32, 32);
		this.method2221();
		@Pc(86) int local86 = 0;
		@Pc(88) int local88 = 0;
		while (local86 < 8) {
			@Pc(101) long local101 = this.aLongArray9[local86];
			arg0[local88] = (byte) (int) (local101 >>> 56);
			arg0[local88 + 1] = (byte) (int) (local101 >>> 48);
			arg0[local88 + 2] = (byte) (int) (local101 >>> 40);
			arg0[local88 + 3] = (byte) (int) (local101 >>> 32);
			arg0[local88 + 4] = (byte) (int) (local101 >>> 24);
			arg0[local88 + 5] = (byte) (int) (local101 >>> 16);
			arg0[local88 + 6] = (byte) (int) (local101 >>> 8);
			arg0[local88 + 7] = (byte) (int) local101;
			local86++;
			local88 += 8;
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(Z)V")
	private void method2221() {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		while (local3 < 8) {
			this.aLongArray12[local3] = Static27.method6635(Static45.method946((long) this.aByteArray28[local5 + 7], 255L), Static27.method6635(Static27.method6635(Static45.method946(255L, (long) this.aByteArray28[local5 + 5]) << 16, Static27.method6635(Static27.method6635(Static45.method946((long) this.aByteArray28[local5 + 3] << 32, 0xFFL << 32), Static27.method6635(Static45.method946((long) this.aByteArray28[local5 + 2], 255L) << 40, Static27.method6635(Static45.method946((long) this.aByteArray28[local5 + 1], 255L) << 48, (long) this.aByteArray28[local5] << 56))), Static45.method946(255L, (long) this.aByteArray28[local5 + 4]) << 24)), Static45.method946(255L, (long) this.aByteArray28[local5 + 6]) << 8));
			local3++;
			local5 += 8;
		}
		for (@Pc(120) int local120 = 0; local120 < 8; local120++) {
			this.aLongArray8[local120] = Static27.method6635(this.aLongArray12[local120], this.aLongArray10[local120] = this.aLongArray9[local120]);
		}
		@Pc(150) int local150;
		for (@Pc(146) int local146 = 1; local146 <= 10; local146++) {
			@Pc(159) int local159;
			@Pc(161) int local161;
			for (local150 = 0; local150 < 8; local150++) {
				this.aLongArray11[local150] = 0L;
				local159 = 0;
				local161 = 56;
				while (local159 < 8) {
					this.aLongArray11[local150] = Static27.method6635(this.aLongArray11[local150], Class101.aLongArrayArray1[local159][(int) (this.aLongArray10[local150 - local159 & 0x7] >>> local161) & 0xFF]);
					local159++;
					local161 -= 8;
				}
			}
			for (local159 = 0; local159 < 8; local159++) {
				this.aLongArray10[local159] = this.aLongArray11[local159];
			}
			this.aLongArray10[0] = Static27.method6635(this.aLongArray10[0], Class101.aLongArray7[local146]);
			@Pc(241) int local241;
			for (local161 = 0; local161 < 8; local161++) {
				this.aLongArray11[local161] = this.aLongArray10[local161];
				local241 = 0;
				@Pc(243) int local243 = 56;
				while (local241 < 8) {
					this.aLongArray11[local161] = Static27.method6635(this.aLongArray11[local161], Class101.aLongArrayArray1[local241][(int) (this.aLongArray8[local161 - local241 & 0x7] >>> local243) & 0xFF]);
					local241++;
					local243 -= 8;
				}
			}
			for (local241 = 0; local241 < 8; local241++) {
				this.aLongArray8[local241] = this.aLongArray11[local241];
			}
		}
		for (local150 = 0; local150 < 8; local150++) {
			this.aLongArray9[local150] = Static27.method6635(this.aLongArray9[local150], Static27.method6635(this.aLongArray8[local150], this.aLongArray12[local150]));
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(BJ[B)V")
	public void method2222(@OriginalArg(1) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(29) int local29 = this.anInt2606 & 0x7;
		@Pc(31) long local31 = arg0;
		@Pc(33) int local33 = 31;
		@Pc(35) int local35 = 0;
		while (local33 >= 0) {
			local35 += ((int) local31 & 0xFF) + (this.aByteArray27[local33] & 0xFF);
			this.aByteArray27[local33] = (byte) local35;
			local31 >>>= 0x8;
			local35 >>>= 0x8;
			local33--;
		}
		@Pc(94) int local94;
		while (arg0 > 8L) {
			local94 = arg1[local7] << local16 & 0xFF | (arg1[local7 - -1] & 0xFF) >>> 8 - local16;
			if (local94 < 0 || local94 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray28[this.anInt2607] = (byte) (this.aByteArray28[this.anInt2607] | local94 >>> local29);
			this.anInt2607++;
			this.anInt2606 += 8 - local29;
			if (this.anInt2606 == 512) {
				this.method2221();
				this.anInt2606 = this.anInt2607 = 0;
			}
			this.aByteArray28[this.anInt2607] = (byte) (local94 << 8 - local29 & 0xFF);
			local7++;
			this.anInt2606 += local29;
			arg0 -= 8L;
		}
		if (arg0 > 0L) {
			local94 = arg1[local7] << local16 & 0xFF;
			this.aByteArray28[this.anInt2607] = (byte) (this.aByteArray28[this.anInt2607] | local94 >>> local29);
		} else {
			local94 = 0;
		}
		if ((long) local29 + arg0 < 8L) {
			this.anInt2606 = (int) ((long) this.anInt2606 + arg0);
			return;
		}
		arg0 -= (long) (8 - local29);
		this.anInt2607++;
		this.anInt2606 += 8 - local29;
		if (this.anInt2606 == 512) {
			this.method2221();
			this.anInt2606 = this.anInt2607 = 0;
		}
		this.aByteArray28[this.anInt2607] = (byte) (local94 << 8 - local29 & 0xFF);
		this.anInt2606 += (int) arg0;
	}

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "(Z)V")
	public void method2223() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray27[local7] = 0;
		}
		this.anInt2606 = this.anInt2607 = 0;
		this.aByteArray28[0] = 0;
		for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
			this.aLongArray9[local31] = 0L;
		}
	}
}
