import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class243 {

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "[J")
	private final long[] aLongArray15 = new long[8];

	@OriginalMember(owner = "client!nq", name = "l", descriptor = "[B")
	private final byte[] aByteArray73 = new byte[32];

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "[B")
	private final byte[] aByteArray72 = new byte[64];

	@OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
	private int anInt6565 = 0;

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
	private int anInt6563 = 0;

	@OriginalMember(owner = "client!nq", name = "n", descriptor = "[J")
	private final long[] aLongArray18 = new long[8];

	@OriginalMember(owner = "client!nq", name = "f", descriptor = "[J")
	private final long[] aLongArray16 = new long[8];

	@OriginalMember(owner = "client!nq", name = "o", descriptor = "[J")
	private final long[] aLongArray19 = new long[8];

	@OriginalMember(owner = "client!nq", name = "m", descriptor = "[J")
	private final long[] aLongArray17 = new long[8];

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(II[B)V")
	public void method5859(@OriginalArg(2) byte[] arg0) {
		this.aByteArray72[this.anInt6563] = (byte) (this.aByteArray72[this.anInt6563] | 0x80 >>> (this.anInt6565 & 0x7));
		this.anInt6563++;
		if (this.anInt6563 > 32) {
			while (true) {
				if (this.anInt6563 >= 64) {
					this.method5861();
					this.anInt6563 = 0;
					break;
				}
				this.aByteArray72[this.anInt6563++] = 0;
			}
		}
		while (this.anInt6563 < 32) {
			this.aByteArray72[this.anInt6563++] = 0;
		}
		Static684.method5324(this.aByteArray73, 0, this.aByteArray72, 32, 32);
		this.method5861();
		@Pc(94) int local94 = 0;
		@Pc(96) int local96 = 0;
		while (local94 < 8) {
			@Pc(103) long local103 = this.aLongArray18[local94];
			arg0[local96] = (byte) (int) (local103 >>> 56);
			arg0[local96 + 1] = (byte) (int) (local103 >>> 48);
			arg0[local96 + 2] = (byte) (int) (local103 >>> 40);
			arg0[local96 + 3] = (byte) (int) (local103 >>> 32);
			arg0[local96 + 4] = (byte) (int) (local103 >>> 24);
			arg0[local96 + 5] = (byte) (int) (local103 >>> 16);
			arg0[local96 + 6] = (byte) (int) (local103 >>> 8);
			arg0[local96 + 7] = (byte) (int) local103;
			local96 += 8;
			local94++;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
	private void method5861() {
		@Pc(3) int local3 = 0;
		@Pc(12) int local12 = 0;
		while (local3 < 8) {
			this.aLongArray16[local3] = Static154.method2815(Static25.method663((long) this.aByteArray72[local12 + 7], 255L), Static154.method2815(Static154.method2815(Static25.method663(0xFFL << 16, (long) this.aByteArray72[local12 + 5] << 16), Static154.method2815(Static154.method2815(Static25.method663(255L, (long) this.aByteArray72[local12 + 3]) << 32, Static154.method2815(Static154.method2815(Static25.method663((long) this.aByteArray72[local12 + 1] << 48, 0xFFL << 48), (long) this.aByteArray72[local12] << 56), Static25.method663(255L, (long) this.aByteArray72[local12 + 2]) << 40)), Static25.method663(0xFFL << 24, (long) this.aByteArray72[local12 + 4] << 24))), Static25.method663(255L, (long) this.aByteArray72[local12 + 6]) << 8));
			local3++;
			local12 += 8;
		}
		for (@Pc(126) int local126 = 0; local126 < 8; local126++) {
			this.aLongArray15[local126] = Static154.method2815(this.aLongArray16[local126], this.aLongArray17[local126] = this.aLongArray18[local126]);
		}
		@Pc(156) int local156;
		for (@Pc(152) int local152 = 1; local152 <= 10; local152++) {
			@Pc(165) int local165;
			@Pc(167) int local167;
			for (local156 = 0; local156 < 8; local156++) {
				this.aLongArray19[local156] = 0L;
				local165 = 0;
				local167 = 56;
				while (local165 < 8) {
					this.aLongArray19[local156] = Static154.method2815(this.aLongArray19[local156], Class249.aLongArrayArray1[local165][(int) (this.aLongArray17[local156 - local165 & 0x7] >>> local167) & 0xFF]);
					local165++;
					local167 -= 8;
				}
			}
			for (local165 = 0; local165 < 8; local165++) {
				this.aLongArray17[local165] = this.aLongArray19[local165];
			}
			this.aLongArray17[0] = Static154.method2815(this.aLongArray17[0], Class249.aLongArray20[local152]);
			@Pc(249) int local249;
			for (local167 = 0; local167 < 8; local167++) {
				this.aLongArray19[local167] = this.aLongArray17[local167];
				local249 = 0;
				@Pc(251) int local251 = 56;
				while (local249 < 8) {
					this.aLongArray19[local167] = Static154.method2815(this.aLongArray19[local167], Class249.aLongArrayArray1[local249][(int) (this.aLongArray15[local167 - local249 & 0x7] >>> local251) & 0xFF]);
					local249++;
					local251 -= 8;
				}
			}
			for (local249 = 0; local249 < 8; local249++) {
				this.aLongArray15[local249] = this.aLongArray19[local249];
			}
		}
		for (local156 = 0; local156 < 8; local156++) {
			this.aLongArray18[local156] = Static154.method2815(this.aLongArray18[local156], Static154.method2815(this.aLongArray15[local156], this.aLongArray16[local156]));
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V")
	public void method5862() {
		for (@Pc(3) int local3 = 0; local3 < 32; local3++) {
			this.aByteArray73[local3] = 0;
		}
		this.anInt6565 = this.anInt6563 = 0;
		this.aByteArray72[0] = 0;
		for (@Pc(40) int local40 = 0; local40 < 8; local40++) {
			this.aLongArray18[local40] = 0L;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "([BBJ)V")
	public void method5863(@OriginalArg(0) byte[] arg0, @OriginalArg(2) long arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(21) int local21 = this.anInt6565 & 0x7;
		@Pc(23) long local23 = arg1;
		@Pc(30) int local30 = 31;
		@Pc(32) int local32 = 0;
		while (local30 >= 0) {
			local32 += (this.aByteArray73[local30] & 0xFF) + ((int) local23 & 0xFF);
			this.aByteArray73[local30] = (byte) local32;
			local23 >>>= 0x8;
			local32 >>>= 0x8;
			local30--;
		}
		@Pc(92) int local92;
		while (arg1 > 8L) {
			local92 = arg0[local7] << local16 & 0xFF | (arg0[local7 + 1] & 0xFF) >>> 8 - local16;
			if (local92 < 0 || local92 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray72[this.anInt6563] = (byte) (this.aByteArray72[this.anInt6563] | local92 >>> local21);
			this.anInt6563++;
			this.anInt6565 += 8 - local21;
			if (this.anInt6565 == 512) {
				this.method5861();
				this.anInt6565 = this.anInt6563 = 0;
			}
			this.aByteArray72[this.anInt6563] = (byte) (local92 << 8 - local21 & 0xFF);
			this.anInt6565 += local21;
			local7++;
			arg1 -= 8L;
		}
		if (arg1 <= 0L) {
			local92 = 0;
		} else {
			local92 = arg0[local7] << local16 & 0xFF;
			this.aByteArray72[this.anInt6563] = (byte) (this.aByteArray72[this.anInt6563] | local92 >>> local21);
		}
		if ((long) local21 + arg1 < 8L) {
			this.anInt6565 = (int) ((long) this.anInt6565 + arg1);
			return;
		}
		this.anInt6563++;
		this.anInt6565 += 8 - local21;
		arg1 -= (long) (8 - local21);
		if (this.anInt6565 == 512) {
			this.method5861();
			this.anInt6565 = this.anInt6563 = 0;
		}
		this.aByteArray72[this.anInt6563] = (byte) (local92 << 8 - local21 & 0xFF);
		this.anInt6565 += (int) arg1;
	}
}
