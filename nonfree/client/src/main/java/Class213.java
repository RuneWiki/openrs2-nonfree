import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class213 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
	private int anInt6311 = 0;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "[J")
	private final long[] aLongArray11 = new long[8];

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "[J")
	private final long[] aLongArray9 = new long[8];

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "[J")
	private final long[] aLongArray10 = new long[8];

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
	private int anInt6316 = 0;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "[B")
	private final byte[] aByteArray76 = new byte[64];

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "[B")
	private final byte[] aByteArray77 = new byte[32];

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public void method5475() {
		for (@Pc(5) int local5 = 0; local5 < 32; local5++) {
			this.aByteArray77[local5] = 0;
		}
		this.aByteArray76[0] = 0;
		this.anInt6311 = this.anInt6316 = 0;
		for (@Pc(28) int local28 = 0; local28 < 8; local28++) {
			this.aLongArray8[local28] = 0L;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([BIJ)V")
	public void method5476(@OriginalArg(0) byte[] arg0, @OriginalArg(2) long arg1) {
		@Pc(5) int local5 = 0;
		@Pc(14) int local14 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(19) int local19 = this.anInt6311 & 0x7;
		@Pc(21) long local21 = arg1;
		@Pc(23) int local23 = 31;
		@Pc(25) int local25 = 0;
		while (local23 >= 0) {
			local25 += ((int) local21 & 0xFF) + (this.aByteArray77[local23] & 0xFF);
			this.aByteArray77[local23] = (byte) local25;
			local25 >>>= 0x8;
			local21 >>>= 0x8;
			local23--;
		}
		@Pc(86) int local86;
		while (arg1 > 8L) {
			local86 = arg0[local5] << local14 & 0xFF | (arg0[local5 + 1] & 0xFF) >>> 8 - local14;
			if (local86 < 0 || local86 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray76[this.anInt6316] = (byte) (this.aByteArray76[this.anInt6316] | local86 >>> local19);
			this.anInt6311 += 8 - local19;
			this.anInt6316++;
			if (this.anInt6311 == 512) {
				this.method5479();
				this.anInt6311 = this.anInt6316 = 0;
			}
			this.aByteArray76[this.anInt6316] = (byte) (local86 << 8 - local19 & 0xFF);
			local5++;
			arg1 -= 8L;
			this.anInt6311 += local19;
		}
		if (arg1 <= 0L) {
			local86 = 0;
		} else {
			local86 = arg0[local5] << local14 & 0xFF;
			this.aByteArray76[this.anInt6316] = (byte) (this.aByteArray76[this.anInt6316] | local86 >>> local19);
		}
		if (arg1 + (long) local19 < 8L) {
			this.anInt6311 = (int) ((long) this.anInt6311 + arg1);
			return;
		}
		this.anInt6311 += 8 - local19;
		this.anInt6316++;
		arg1 -= 8 - local19;
		if (this.anInt6311 == 512) {
			this.method5479();
			this.anInt6311 = this.anInt6316 = 0;
		}
		this.aByteArray76[this.anInt6316] = (byte) (local86 << 8 - local19 & 0xFF);
		this.anInt6311 += (int) arg1;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II[B)V")
	public void method5477(@OriginalArg(2) byte[] arg0) {
		this.aByteArray76[this.anInt6316] = (byte) (this.aByteArray76[this.anInt6316] | 0x80 >>> (this.anInt6311 & 0x7));
		this.anInt6316++;
		if (this.anInt6316 > 32) {
			while (true) {
				if (this.anInt6316 >= 64) {
					this.method5479();
					this.anInt6316 = 0;
					break;
				}
				this.aByteArray76[this.anInt6316++] = 0;
			}
		}
		while (this.anInt6316 < 32) {
			this.aByteArray76[this.anInt6316++] = 0;
		}
		Static555.method5095(this.aByteArray77, 0, this.aByteArray76, 32, 32);
		this.method5479();
		@Pc(84) int local84 = 0;
		@Pc(86) int local86 = 0;
		while (local84 < 8) {
			@Pc(92) long local92 = this.aLongArray8[local84];
			arg0[local86] = (byte) (local92 >>> 56);
			arg0[local86 + 1] = (byte) (local92 >>> 48);
			arg0[local86 + 2] = (byte) (local92 >>> 40);
			arg0[local86 + 3] = (byte) (local92 >>> 32);
			arg0[local86 + 4] = (byte) (local92 >>> 24);
			arg0[local86 + 5] = (byte) (local92 >>> 16);
			arg0[local86 + 6] = (byte) (local92 >>> 8);
			arg0[local86 + 7] = (byte) local92;
			local86 += 8;
			local84++;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
	private void method5479() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		while (local1 < 8) {
			this.aLongArray11[local1] = Static402.method7868(Static264.method4397((long) this.aByteArray76[local3 + 7], 255L), Static402.method7868(Static402.method7868(Static402.method7868(Static402.method7868(Static402.method7868(Static264.method4397((long) this.aByteArray76[local3 + 2] << 40, 0xFFL << 40), Static402.method7868(Static264.method4397(255L, (long) this.aByteArray76[local3 + 1]) << 48, (long) this.aByteArray76[local3] << 56)), Static264.method4397((long) this.aByteArray76[local3 + 3], 255L) << 32), Static264.method4397(255L, (long) this.aByteArray76[local3 + 4]) << 24), Static264.method4397(255L, (long) this.aByteArray76[local3 + 5]) << 16), Static264.method4397((long) this.aByteArray76[local3 + 6] << 8, 0xFFL << 8)));
			local3 += 8;
			local1++;
		}
		for (@Pc(112) int local112 = 0; local112 < 8; local112++) {
			this.aLongArray7[local112] = Static402.method7868(this.aLongArray11[local112], this.aLongArray9[local112] = this.aLongArray8[local112]);
		}
		@Pc(140) int local140;
		for (@Pc(137) int local137 = 1; local137 <= 10; local137++) {
			@Pc(148) int local148;
			@Pc(150) int local150;
			for (local140 = 0; local140 < 8; local140++) {
				this.aLongArray10[local140] = 0L;
				local148 = 0;
				local150 = 56;
				while (local148 < 8) {
					this.aLongArray10[local140] = Static402.method7868(this.aLongArray10[local140], Class54.aLongArrayArray1[local148][(int) (this.aLongArray9[local140 - local148 & 0x7] >>> local150) & 0xFF]);
					local150 -= 8;
					local148++;
				}
			}
			for (local148 = 0; local148 < 8; local148++) {
				this.aLongArray9[local148] = this.aLongArray10[local148];
			}
			this.aLongArray9[0] = Static402.method7868(this.aLongArray9[0], Class54.aLongArray1[local137]);
			@Pc(227) int local227;
			for (local150 = 0; local150 < 8; local150++) {
				this.aLongArray10[local150] = this.aLongArray9[local150];
				local227 = 0;
				@Pc(229) int local229 = 56;
				while (local227 < 8) {
					this.aLongArray10[local150] = Static402.method7868(this.aLongArray10[local150], Class54.aLongArrayArray1[local227][(int) (this.aLongArray7[local150 - local227 & 0x7] >>> local229) & 0xFF]);
					local227++;
					local229 -= 8;
				}
			}
			for (local227 = 0; local227 < 8; local227++) {
				this.aLongArray7[local227] = this.aLongArray10[local227];
			}
		}
		for (local140 = 0; local140 < 8; local140++) {
			this.aLongArray8[local140] = Static402.method7868(this.aLongArray8[local140], Static402.method7868(this.aLongArray11[local140], this.aLongArray7[local140]));
		}
	}
}
