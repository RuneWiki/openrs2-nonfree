import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class281 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
	private int anInt7379 = 0;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
	private int anInt7384 = 0;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "[B")
	private final byte[] aByteArray88 = new byte[32];

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "[J")
	private final long[] aLongArray33 = new long[8];

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "[J")
	private final long[] aLongArray36 = new long[8];

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "[J")
	private final long[] aLongArray34 = new long[8];

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "[B")
	private final byte[] aByteArray89 = new byte[64];

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "[J")
	private final long[] aLongArray35 = new long[8];

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "[J")
	private final long[] aLongArray32 = new long[8];

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([BJB)V")
	public void method6245(@OriginalArg(0) byte[] arg0, @OriginalArg(1) long arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(21) int local21 = this.anInt7384 & 0x7;
		@Pc(31) long local31 = arg1;
		@Pc(33) int local33 = 31;
		@Pc(35) int local35 = 0;
		while (local33 >= 0) {
			local35 += ((int) local31 & 0xFF) + (this.aByteArray88[local33] & 0xFF);
			this.aByteArray88[local33] = (byte) local35;
			local35 >>>= 0x8;
			local31 >>>= 0x8;
			local33--;
		}
		@Pc(90) int local90;
		while (arg1 > 8L) {
			local90 = arg0[local7] << local16 & 0xFF | (arg0[local7 + 1] & 0xFF) >>> 8 - local16;
			if (local90 < 0 || local90 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray89[this.anInt7379] = (byte) (this.aByteArray89[this.anInt7379] | local90 >>> local21);
			this.anInt7384 += 8 - local21;
			this.anInt7379++;
			if (this.anInt7384 == 512) {
				this.method6248();
				this.anInt7384 = this.anInt7379 = 0;
			}
			this.aByteArray89[this.anInt7379] = (byte) (local90 << 8 - local21 & 0xFF);
			local7++;
			this.anInt7384 += local21;
			arg1 -= 8L;
		}
		if (arg1 > 0L) {
			local90 = arg0[local7] << local16 & 0xFF;
			this.aByteArray89[this.anInt7379] = (byte) (this.aByteArray89[this.anInt7379] | local90 >>> local21);
		} else {
			local90 = 0;
		}
		if (arg1 + (long) local21 < 8L) {
			this.anInt7384 = (int) ((long) this.anInt7384 + arg1);
			return;
		}
		arg1 -= 8 - local21;
		this.anInt7384 += 8 - local21;
		this.anInt7379++;
		if (this.anInt7384 == 512) {
			this.method6248();
			this.anInt7384 = this.anInt7379 = 0;
		}
		this.aByteArray89[this.anInt7379] = (byte) (local90 << 8 - local21 & 0xFF);
		this.anInt7384 += (int) arg1;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
	public void method6246() {
		for (@Pc(13) int local13 = 0; local13 < 32; local13++) {
			this.aByteArray88[local13] = 0;
		}
		this.anInt7384 = this.anInt7379 = 0;
		this.aByteArray89[0] = 0;
		for (@Pc(39) int local39 = 0; local39 < 8; local39++) {
			this.aLongArray35[local39] = 0L;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([BIB)V")
	public void method6247(@OriginalArg(0) byte[] arg0) {
		this.aByteArray89[this.anInt7379] = (byte) (this.aByteArray89[this.anInt7379] | 0x80 >>> (this.anInt7384 & 0x7));
		this.anInt7379++;
		if (this.anInt7379 > 32) {
			while (true) {
				if (this.anInt7379 >= 64) {
					this.method6248();
					this.anInt7379 = 0;
					break;
				}
				this.aByteArray89[this.anInt7379++] = 0;
			}
		}
		while (this.anInt7379 < 32) {
			this.aByteArray89[this.anInt7379++] = 0;
		}
		Static653.method5398(this.aByteArray88, 0, this.aByteArray89, 32, 32);
		this.method6248();
		@Pc(96) int local96 = 0;
		@Pc(98) int local98 = 0;
		while (local96 < 8) {
			@Pc(105) long local105 = this.aLongArray35[local96];
			arg0[local98] = (byte) (local105 >>> 56);
			arg0[local98 + 1] = (byte) (local105 >>> 48);
			arg0[local98 + 2] = (byte) (local105 >>> 40);
			arg0[local98 + 3] = (byte) (local105 >>> 32);
			arg0[local98 + 4] = (byte) (local105 >>> 24);
			arg0[local98 + 5] = (byte) (local105 >>> 16);
			arg0[local98 + 6] = (byte) (local105 >>> 8);
			arg0[local98 + 7] = (byte) local105;
			local96++;
			local98 += 8;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
	private void method6248() {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		while (local3 < 8) {
			this.aLongArray36[local3] = Static49.method7190(Static49.method7190(Static452.method6141(0xFFL << 8, (long) this.aByteArray89[local5 + 6] << 8), Static49.method7190(Static49.method7190(Static49.method7190(Static49.method7190(Static452.method6141((long) this.aByteArray89[local5 + 2], 255L) << 40, Static49.method7190(Static452.method6141((long) this.aByteArray89[local5 + 1], 255L) << 48, (long) this.aByteArray89[local5] << 56)), Static452.method6141(255L, (long) this.aByteArray89[local5 + 3]) << 32), Static452.method6141((long) this.aByteArray89[local5 + 4], 255L) << 24), Static452.method6141((long) this.aByteArray89[local5 + 5], 255L) << 16)), Static452.method6141((long) this.aByteArray89[local5 + 7], 255L));
			local3++;
			local5 += 8;
		}
		for (@Pc(113) int local113 = 0; local113 < 8; local113++) {
			this.aLongArray32[local113] = Static49.method7190(this.aLongArray36[local113], this.aLongArray34[local113] = this.aLongArray35[local113]);
		}
		@Pc(145) int local145;
		for (@Pc(141) int local141 = 1; local141 <= 10; local141++) {
			@Pc(154) int local154;
			@Pc(156) int local156;
			for (local145 = 0; local145 < 8; local145++) {
				this.aLongArray33[local145] = 0L;
				local154 = 0;
				local156 = 56;
				while (local154 < 8) {
					this.aLongArray33[local145] = Static49.method7190(this.aLongArray33[local145], Class6_Sub24.aLongArrayArray1[local154][(int) (this.aLongArray34[local145 - local154 & 0x7] >>> local156) & 0xFF]);
					local154++;
					local156 -= 8;
				}
			}
			for (local154 = 0; local154 < 8; local154++) {
				this.aLongArray34[local154] = this.aLongArray33[local154];
			}
			this.aLongArray34[0] = Static49.method7190(this.aLongArray34[0], Class6_Sub24.aLongArray45[local141]);
			@Pc(238) int local238;
			for (local156 = 0; local156 < 8; local156++) {
				this.aLongArray33[local156] = this.aLongArray34[local156];
				local238 = 0;
				@Pc(240) int local240 = 56;
				while (local238 < 8) {
					this.aLongArray33[local156] = Static49.method7190(this.aLongArray33[local156], Class6_Sub24.aLongArrayArray1[local238][(int) (this.aLongArray32[local156 - local238 & 0x7] >>> local240) & 0xFF]);
					local238++;
					local240 -= 8;
				}
			}
			for (local238 = 0; local238 < 8; local238++) {
				this.aLongArray32[local238] = this.aLongArray33[local238];
			}
		}
		for (local145 = 0; local145 < 8; local145++) {
			this.aLongArray35[local145] = Static49.method7190(this.aLongArray35[local145], Static49.method7190(this.aLongArray32[local145], this.aLongArray36[local145]));
		}
	}
}
