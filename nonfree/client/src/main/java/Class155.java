import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class155 {

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "[B")
	private final byte[] aByteArray37 = new byte[64];

	@OriginalMember(owner = "client!iaa", name = "f", descriptor = "I")
	private int anInt4256 = 0;

	@OriginalMember(owner = "client!iaa", name = "m", descriptor = "[J")
	private final long[] aLongArray6 = new long[8];

	@OriginalMember(owner = "client!iaa", name = "k", descriptor = "[J")
	private final long[] aLongArray5 = new long[8];

	@OriginalMember(owner = "client!iaa", name = "l", descriptor = "[B")
	private final byte[] aByteArray38 = new byte[32];

	@OriginalMember(owner = "client!iaa", name = "g", descriptor = "[J")
	private final long[] aLongArray4 = new long[8];

	@OriginalMember(owner = "client!iaa", name = "o", descriptor = "[J")
	private final long[] aLongArray7 = new long[8];

	@OriginalMember(owner = "client!iaa", name = "q", descriptor = "I")
	private int anInt4261 = 0;

	@OriginalMember(owner = "client!iaa", name = "s", descriptor = "[J")
	private final long[] aLongArray8 = new long[8];

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)V")
	public void method3639() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray38[local7] = 0;
		}
		this.anInt4256 = this.anInt4261 = 0;
		this.aByteArray37[0] = 0;
		for (@Pc(39) int local39 = 0; local39 < 8; local39++) {
			this.aLongArray6[local39] = 0L;
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZJ[B)V")
	public void method3640(@OriginalArg(1) long arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(15) int local15 = 0;
		@Pc(25) int local25 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(30) int local30 = this.anInt4256 & 0x7;
		@Pc(32) long local32 = arg0;
		@Pc(34) int local34 = 31;
		@Pc(36) int local36 = 0;
		while (local34 >= 0) {
			local36 += ((int) local32 & 0xFF) + (this.aByteArray38[local34] & 0xFF);
			this.aByteArray38[local34] = (byte) local36;
			local36 >>>= 0x8;
			local32 >>>= 0x8;
			local34--;
		}
		@Pc(95) int local95;
		while (arg0 > 8L) {
			local95 = arg1[local15] << local25 & 0xFF | (arg1[local15 + 1] & 0xFF) >>> 8 - local25;
			if (local95 < 0 || local95 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray37[this.anInt4261] = (byte) (this.aByteArray37[this.anInt4261] | local95 >>> local30);
			this.anInt4261++;
			this.anInt4256 += 8 - local30;
			if (this.anInt4256 == 512) {
				this.method3643();
				this.anInt4256 = this.anInt4261 = 0;
			}
			this.aByteArray37[this.anInt4261] = (byte) (local95 << 8 - local30 & 0xFF);
			this.anInt4256 += local30;
			arg0 -= 8L;
			local15++;
		}
		if (arg0 > 0L) {
			local95 = arg1[local15] << local25 & 0xFF;
			this.aByteArray37[this.anInt4261] = (byte) (this.aByteArray37[this.anInt4261] | local95 >>> local30);
		} else {
			local95 = 0;
		}
		if ((long) local30 + arg0 < 8L) {
			this.anInt4256 = (int) ((long) this.anInt4256 + arg0);
			return;
		}
		this.anInt4256 += 8 - local30;
		arg0 -= (long) (8 - local30);
		this.anInt4261++;
		if (this.anInt4256 == 512) {
			this.method3643();
			this.anInt4256 = this.anInt4261 = 0;
		}
		this.aByteArray37[this.anInt4261] = (byte) (local95 << 8 - local30 & 0xFF);
		this.anInt4256 += (int) arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZI[B)V")
	public void method3641(@OriginalArg(2) byte[] arg0) {
		this.aByteArray37[this.anInt4261] = (byte) (this.aByteArray37[this.anInt4261] | 0x80 >>> (this.anInt4256 & 0x7));
		this.anInt4261++;
		if (this.anInt4261 > 32) {
			while (true) {
				if (this.anInt4261 >= 64) {
					this.method3643();
					this.anInt4261 = 0;
					break;
				}
				this.aByteArray37[this.anInt4261++] = 0;
			}
		}
		while (this.anInt4261 < 32) {
			this.aByteArray37[this.anInt4261++] = 0;
		}
		Static681.method4034(this.aByteArray38, 0, this.aByteArray37, 32, 32);
		this.method3643();
		@Pc(90) int local90 = 0;
		@Pc(97) int local97 = 0;
		while (local90 < 8) {
			@Pc(104) long local104 = this.aLongArray6[local90];
			arg0[local97] = (byte) (int) (local104 >>> 56);
			arg0[local97 + 1] = (byte) (int) (local104 >>> 48);
			arg0[local97 + 2] = (byte) (int) (local104 >>> 40);
			arg0[local97 + 3] = (byte) (int) (local104 >>> 32);
			arg0[local97 + 4] = (byte) (int) (local104 >>> 24);
			arg0[local97 + 5] = (byte) (int) (local104 >>> 16);
			arg0[local97 + 6] = (byte) (int) (local104 >>> 8);
			arg0[local97 + 7] = (byte) (int) local104;
			local97 += 8;
			local90++;
		}
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(I)V")
	private void method3643() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray5[local7] = Static136.method2279(Static136.method2279(Static136.method2279(Static136.method2279(Static248.method4093(0xFFL << 24, (long) this.aByteArray37[local9 + 4] << 24), Static136.method2279(Static248.method4093(0xFFL << 32, (long) this.aByteArray37[local9 + 3] << 32), Static136.method2279(Static136.method2279((long) this.aByteArray37[local9] << 56, Static248.method4093((long) this.aByteArray37[local9 + 1] << 48, 0xFFL << 48)), Static248.method4093((long) this.aByteArray37[local9 + 2], 255L) << 40))), Static248.method4093((long) this.aByteArray37[local9 + 5], 255L) << 16), Static248.method4093(0xFFL << 8, (long) this.aByteArray37[local9 + 6] << 8)), Static248.method4093((long) this.aByteArray37[local9 + 7], 255L));
			local9 += 8;
			local7++;
		}
		for (@Pc(129) int local129 = 0; local129 < 8; local129++) {
			this.aLongArray8[local129] = Static136.method2279(this.aLongArray5[local129], this.aLongArray7[local129] = this.aLongArray6[local129]);
		}
		@Pc(161) int local161;
		for (@Pc(157) int local157 = 1; local157 <= 10; local157++) {
			@Pc(170) int local170;
			@Pc(172) int local172;
			for (local161 = 0; local161 < 8; local161++) {
				this.aLongArray4[local161] = 0L;
				local170 = 0;
				local172 = 56;
				while (local170 < 8) {
					this.aLongArray4[local161] = Static136.method2279(this.aLongArray4[local161], Class17_Sub2.aLongArrayArray1[local170][(int) (this.aLongArray7[local161 - local170 & 0x7] >>> local172) & 0xFF]);
					local170++;
					local172 -= 8;
				}
			}
			for (local170 = 0; local170 < 8; local170++) {
				this.aLongArray7[local170] = this.aLongArray4[local170];
			}
			this.aLongArray7[0] = Static136.method2279(this.aLongArray7[0], Class17_Sub2.aLongArray15[local157]);
			@Pc(255) int local255;
			for (local172 = 0; local172 < 8; local172++) {
				this.aLongArray4[local172] = this.aLongArray7[local172];
				local255 = 0;
				@Pc(257) int local257 = 56;
				while (local255 < 8) {
					this.aLongArray4[local172] = Static136.method2279(this.aLongArray4[local172], Class17_Sub2.aLongArrayArray1[local255][(int) (this.aLongArray8[local172 - local255 & 0x7] >>> local257) & 0xFF]);
					local257 -= 8;
					local255++;
				}
			}
			for (local255 = 0; local255 < 8; local255++) {
				this.aLongArray8[local255] = this.aLongArray4[local255];
			}
		}
		for (local161 = 0; local161 < 8; local161++) {
			this.aLongArray6[local161] = Static136.method2279(this.aLongArray6[local161], Static136.method2279(this.aLongArray8[local161], this.aLongArray5[local161]));
		}
	}
}
