import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gja")
public final class Class135 {

	@OriginalMember(owner = "client!gja", name = "c", descriptor = "[J")
	private final long[] aLongArray12 = new long[8];

	@OriginalMember(owner = "client!gja", name = "h", descriptor = "I")
	private int anInt3857 = 0;

	@OriginalMember(owner = "client!gja", name = "e", descriptor = "[J")
	private final long[] aLongArray13 = new long[8];

	@OriginalMember(owner = "client!gja", name = "g", descriptor = "[J")
	private final long[] aLongArray14 = new long[8];

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "[B")
	private final byte[] aByteArray31 = new byte[64];

	@OriginalMember(owner = "client!gja", name = "o", descriptor = "[J")
	private final long[] aLongArray16 = new long[8];

	@OriginalMember(owner = "client!gja", name = "j", descriptor = "I")
	private int anInt3859 = 0;

	@OriginalMember(owner = "client!gja", name = "m", descriptor = "[J")
	private final long[] aLongArray15 = new long[8];

	@OriginalMember(owner = "client!gja", name = "q", descriptor = "[B")
	private final byte[] aByteArray32 = new byte[32];

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(B)V")
	public void method3280() {
		for (@Pc(7) int local7 = 0; local7 < 32; local7++) {
			this.aByteArray32[local7] = 0;
		}
		this.aByteArray31[0] = 0;
		this.anInt3859 = this.anInt3857 = 0;
		for (@Pc(33) int local33 = 0; local33 < 8; local33++) {
			this.aLongArray13[local33] = 0L;
		}
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)V")
	private void method3281() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		while (local7 < 8) {
			this.aLongArray15[local7] = Static650.method8720(Static494.method7083((long) this.aByteArray31[local9 + 7], 255L), Static650.method8720(Static494.method7083((long) this.aByteArray31[local9 + 6] << 8, 0xFFL << 8), Static650.method8720(Static494.method7083((long) this.aByteArray31[local9 + 5], 255L) << 16, Static650.method8720(Static494.method7083((long) this.aByteArray31[local9 + 4] << 24, 0xFFL << 24), Static650.method8720(Static650.method8720(Static494.method7083((long) this.aByteArray31[local9 + 2], 255L) << 40, Static650.method8720(Static494.method7083((long) this.aByteArray31[local9 + 1] << 48, 0xFFL << 48), (long) this.aByteArray31[local9] << 56)), Static494.method7083(0xFFL << 32, (long) this.aByteArray31[local9 + 3] << 32))))));
			local9 += 8;
			local7++;
		}
		for (@Pc(121) int local121 = 0; local121 < 8; local121++) {
			this.aLongArray14[local121] = Static650.method8720(this.aLongArray15[local121], this.aLongArray12[local121] = this.aLongArray13[local121]);
		}
		@Pc(158) int local158;
		for (@Pc(154) int local154 = 1; local154 <= 10; local154++) {
			@Pc(167) int local167;
			@Pc(169) int local169;
			for (local158 = 0; local158 < 8; local158++) {
				this.aLongArray16[local158] = 0L;
				local167 = 0;
				local169 = 56;
				while (local167 < 8) {
					this.aLongArray16[local158] = Static650.method8720(this.aLongArray16[local158], OutputStream_Sub1.aLongArrayArray1[local167][(int) (this.aLongArray12[local158 - local167 & 0x7] >>> local169) & 0xFF]);
					local167++;
					local169 -= 8;
				}
			}
			for (local167 = 0; local167 < 8; local167++) {
				this.aLongArray12[local167] = this.aLongArray16[local167];
			}
			this.aLongArray12[0] = Static650.method8720(this.aLongArray12[0], OutputStream_Sub1.aLongArray19[local154]);
			@Pc(251) int local251;
			for (local169 = 0; local169 < 8; local169++) {
				this.aLongArray16[local169] = this.aLongArray12[local169];
				local251 = 0;
				@Pc(253) int local253 = 56;
				while (local251 < 8) {
					this.aLongArray16[local169] = Static650.method8720(this.aLongArray16[local169], OutputStream_Sub1.aLongArrayArray1[local251][(int) (this.aLongArray14[local169 - local251 & 0x7] >>> local253) & 0xFF]);
					local253 -= 8;
					local251++;
				}
			}
			for (local251 = 0; local251 < 8; local251++) {
				this.aLongArray14[local251] = this.aLongArray16[local251];
			}
		}
		for (local158 = 0; local158 < 8; local158++) {
			this.aLongArray13[local158] = Static650.method8720(this.aLongArray13[local158], Static650.method8720(this.aLongArray15[local158], this.aLongArray14[local158]));
		}
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(J[BB)V")
	public void method3283(@OriginalArg(0) long arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = 8 - ((int) arg0 & 0x7) & 0x7;
		@Pc(28) int local28 = this.anInt3859 & 0x7;
		@Pc(30) long local30 = arg0;
		@Pc(32) int local32 = 31;
		@Pc(34) int local34 = 0;
		while (local32 >= 0) {
			local34 += (this.aByteArray32[local32] & 0xFF) + ((int) local30 & 0xFF);
			this.aByteArray32[local32] = (byte) local34;
			local30 >>>= 0x8;
			local34 >>>= 0x8;
			local32--;
		}
		@Pc(94) int local94;
		while (arg0 > 8L) {
			local94 = arg1[local7] << local17 & 0xFF | (arg1[local7 - -1] & 0xFF) >>> 8 - local17;
			if (local94 < 0 || local94 >= 256) {
				throw new RuntimeException("LOGIC ERROR");
			}
			this.aByteArray31[this.anInt3857] = (byte) (this.aByteArray31[this.anInt3857] | local94 >>> local28);
			this.anInt3857++;
			this.anInt3859 += 8 - local28;
			if (this.anInt3859 == 512) {
				this.method3281();
				this.anInt3859 = this.anInt3857 = 0;
			}
			this.aByteArray31[this.anInt3857] = (byte) (local94 << 8 - local28 & 0xFF);
			this.anInt3859 += local28;
			arg0 -= 8L;
			local7++;
		}
		if (arg0 > 0L) {
			local94 = arg1[local7] << local17 & 0xFF;
			this.aByteArray31[this.anInt3857] = (byte) (this.aByteArray31[this.anInt3857] | local94 >>> local28);
		} else {
			local94 = 0;
		}
		if (arg0 + (long) local28 < 8L) {
			this.anInt3859 = (int) ((long) this.anInt3859 + arg0);
			return;
		}
		this.anInt3857++;
		arg0 -= (long) (8 - local28);
		this.anInt3859 += 8 - local28;
		if (this.anInt3859 == 512) {
			this.method3281();
			this.anInt3859 = this.anInt3857 = 0;
		}
		this.aByteArray31[this.anInt3857] = (byte) (local94 << 8 - local28 & 0xFF);
		this.anInt3859 += (int) arg0;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(I[BZ)V")
	public void method3284(@OriginalArg(1) byte[] arg0) {
		this.aByteArray31[this.anInt3857] = (byte) (this.aByteArray31[this.anInt3857] | 0x80 >>> (this.anInt3859 & 0x7));
		this.anInt3857++;
		if (this.anInt3857 > 32) {
			while (true) {
				if (this.anInt3857 >= 64) {
					this.method3281();
					this.anInt3857 = 0;
					break;
				}
				this.aByteArray31[this.anInt3857++] = 0;
			}
		}
		while (this.anInt3857 < 32) {
			this.aByteArray31[this.anInt3857++] = 0;
		}
		Static686.method4972(this.aByteArray32, 0, this.aByteArray31, 32, 32);
		this.method3281();
		@Pc(94) int local94 = 0;
		@Pc(96) int local96 = 0;
		while (local94 < 8) {
			@Pc(103) long local103 = this.aLongArray13[local94];
			arg0[local96] = (byte) (int) (local103 >>> 56);
			arg0[local96 + 1] = (byte) (int) (local103 >>> 48);
			arg0[local96 + 2] = (byte) (int) (local103 >>> 40);
			arg0[local96 + 3] = (byte) (int) (local103 >>> 32);
			arg0[local96 + 4] = (byte) (int) (local103 >>> 24);
			arg0[local96 + 5] = (byte) (int) (local103 >>> 16);
			arg0[local96 + 6] = (byte) (int) (local103 >>> 8);
			arg0[local96 + 7] = (byte) (int) local103;
			local94++;
			local96 += 8;
		}
	}
}
