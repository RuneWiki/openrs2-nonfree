import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class1_Sub1_Sub31 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qh", name = "O", descriptor = "[S")
	private short[] aShortArray125;

	@OriginalMember(owner = "client!qh", name = "S", descriptor = "[S")
	private short[] aShortArray126;

	@OriginalMember(owner = "client!qh", name = "D", descriptor = "Z")
	public boolean aBoolean589 = true;

	@OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
	public int anInt7550 = 4;

	@OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
	public int anInt7548 = 4;

	@OriginalMember(owner = "client!qh", name = "I", descriptor = "I")
	public int anInt7549 = 4;

	@OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
	public int anInt7551 = 0;

	@OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
	public int anInt7553 = 1638;

	@OriginalMember(owner = "client!qh", name = "Q", descriptor = "[B")
	private byte[] aByteArray88 = new byte[512];

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			this.method6012(local17, arg0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	@Override
	public void method7699() {
		this.aByteArray88 = Static140.method7609(this.anInt7551);
		this.method6015();
		for (@Pc(21) int local21 = this.anInt7550 - 1; local21 >= 1; local21--) {
			@Pc(34) short local34 = this.aShortArray125[local21];
			if (local34 > 8) {
				return;
			}
			if (local34 < -8) {
				return;
			}
			this.anInt7550--;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[II)V")
	public void method6012(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = Static445.anIntArray590[arg1] * this.anInt7549;
		@Pc(109) int local109;
		@Pc(123) int local123;
		@Pc(32) int local32;
		@Pc(25) short local25;
		@Pc(100) int local100;
		@Pc(45) int local45;
		@Pc(39) int local39;
		@Pc(52) int local52;
		@Pc(95) int local95;
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(82) int local82;
		@Pc(91) int local91;
		if (this.anInt7550 == 1) {
			local25 = this.aShortArray125[0];
			local32 = this.aShortArray126[0] << 12;
			local39 = this.anInt7548 * local32 >> 12;
			local45 = local32 * local16 >> 12;
			local52 = this.anInt7549 * local32 >> 12;
			local56 = local45 >> 12;
			local60 = local56 + 1;
			if (local60 >= local52) {
				local60 = 0;
			}
			local45 &= 0xFFF;
			local82 = this.aByteArray88[local56 & 0xFF] & 0xFF;
			local91 = this.aByteArray88[local60 & 0xFF] & 0xFF;
			local95 = Class83_Sub2_Sub1.anIntArray514[local45];
			if (this.aBoolean589) {
				for (local100 = 0; local100 < Static279.anInt4906; local100++) {
					local109 = this.anInt7548 * Static557.anIntArray708[local100];
					local123 = this.method6014(local45, local39, local109 * local32 >> 12, local95, local82, local91);
					local123 = local25 * local123 >> 12;
					arg0[local100] = (local123 >> 1) + 2048;
				}
			} else {
				for (local100 = 0; local100 < Static279.anInt4906; local100++) {
					local109 = Static557.anIntArray708[local100] * this.anInt7548;
					local123 = this.method6014(local45, local39, local109 * local32 >> 12, local95, local82, local91);
					arg0[local100] = local25 * local123 >> 12;
				}
			}
			return;
		}
		local25 = this.aShortArray125[0];
		if (local25 > 8 || local25 < -8) {
			local32 = this.aShortArray126[0] << 12;
			local39 = local32 * this.anInt7548 >> 12;
			local45 = local32 * local16 >> 12;
			local52 = local32 * this.anInt7549 >> 12;
			local56 = local45 >> 12;
			local60 = local56 + 1;
			if (local60 >= local52) {
				local60 = 0;
			}
			local45 &= 0xFFF;
			local91 = this.aByteArray88[local60 & 0xFF] & 0xFF;
			local95 = Class83_Sub2_Sub1.anIntArray514[local45];
			local82 = this.aByteArray88[local56 & 0xFF] & 0xFF;
			for (local100 = 0; local100 < Static279.anInt4906; local100++) {
				local109 = Static557.anIntArray708[local100] * this.anInt7548;
				local123 = this.method6014(local45, local39, local109 * local32 >> 12, local95, local82, local91);
				arg0[local100] = local25 * local123 >> 12;
			}
		}
		for (@Pc(302) int local302 = 1; local302 < this.anInt7550; local302++) {
			local25 = this.aShortArray125[local302];
			if (local25 > 8 || local25 < -8) {
				local32 = this.aShortArray126[local302] << 12;
				local39 = local32 * this.anInt7548 >> 12;
				local45 = local32 * local16 >> 12;
				local52 = local32 * this.anInt7549 >> 12;
				local56 = local45 >> 12;
				local60 = local56 + 1;
				local45 &= 0xFFF;
				if (local60 >= local52) {
					local60 = 0;
				}
				local91 = this.aByteArray88[local60 & 0xFF] & 0xFF;
				local82 = this.aByteArray88[local56 & 0xFF] & 0xFF;
				local95 = Class83_Sub2_Sub1.anIntArray514[local45];
				if (this.aBoolean589 && this.anInt7550 - 1 == local302) {
					for (local100 = 0; local100 < Static279.anInt4906; local100++) {
						local109 = this.anInt7548 * Static557.anIntArray708[local100];
						local123 = this.method6014(local45, local39, local32 * local109 >> 12, local95, local82, local91);
						local123 = arg0[local100] + (local123 * local25 >> 12);
						arg0[local100] = (local123 >> 1) + 2048;
					}
				} else {
					for (local100 = 0; local100 < Static279.anInt4906; local100++) {
						local109 = Static557.anIntArray708[local100] * this.anInt7548;
						local123 = this.method6014(local45, local39, local32 * local109 >> 12, local95, local82, local91);
						arg0[local100] += local25 * local123 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIBIII)I")
	private int method6014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg2 >> 12;
		@Pc(18) int local18 = local14 + 1;
		@Pc(22) int local22 = arg2 & 0xFFF;
		if (arg1 <= local18) {
			local18 = 0;
		}
		local14 &= 0xFF;
		@Pc(35) int local35 = local22 - 4096;
		local18 &= 0xFF;
		@Pc(43) int local43 = arg0 - 4096;
		@Pc(52) int local52 = this.aByteArray88[local14 + arg4] & 0x3;
		@Pc(56) int local56 = Class83_Sub2_Sub1.anIntArray514[local22];
		@Pc(76) int local76;
		if (local52 > 1) {
			local76 = local52 == 2 ? local22 - arg0 : -arg0 + -local22;
		} else {
			local76 = local52 == 0 ? arg0 + local22 : -local22 + arg0;
		}
		local52 = this.aByteArray88[arg4 + local18] & 0x3;
		@Pc(116) int local116;
		if (local52 <= 1) {
			local116 = local52 == 0 ? local35 + arg0 : arg0 - local35;
		} else {
			local116 = local52 == 2 ? local35 - arg0 : -local35 + -arg0;
		}
		@Pc(144) int local144 = ((local116 - local76) * local56 >> 12) + local76;
		local52 = this.aByteArray88[arg5 + local14] & 0x3;
		if (local52 > 1) {
			local76 = local52 == 2 ? local22 - local43 : -local22 - local43;
		} else {
			local76 = local52 == 0 ? local43 + local22 : -local22 + local43;
		}
		local52 = this.aByteArray88[local18 + arg5] & 0x3;
		if (local52 <= 1) {
			local116 = local52 == 0 ? local35 + local43 : -local35 + local43;
		} else {
			local116 = local52 == 2 ? local35 - local43 : -local35 + -local43;
		}
		@Pc(241) int local241 = local76 + ((local116 - local76) * local56 >> 12);
		return local144 + (arg3 * (local241 - local144) >> 12);
	}

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "(I)V")
	private void method6015() {
		@Pc(23) int local23;
		if (this.anInt7553 > 0) {
			this.aShortArray125 = new short[this.anInt7550];
			this.aShortArray126 = new short[this.anInt7550];
			for (local23 = 0; local23 < this.anInt7550; local23++) {
				this.aShortArray125[local23] = (short) (Math.pow((double) ((float) this.anInt7553 / 4096.0F), (double) local23) * 4096.0D);
				this.aShortArray126[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		} else if (this.aShortArray125 != null && this.anInt7550 == this.aShortArray125.length) {
			this.aShortArray126 = new short[this.anInt7550];
			for (local23 = 0; local23 < this.anInt7550; local23++) {
				this.aShortArray126[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean589 = arg0.method5750() == 1;
		} else if (arg1 == 1) {
			this.anInt7550 = arg0.method5750();
		} else if (arg1 == 2) {
			this.anInt7553 = arg0.method5738();
			if (this.anInt7553 < 0) {
				this.aShortArray125 = new short[this.anInt7550];
				for (@Pc(79) int local79 = 0; local79 < this.anInt7550; local79++) {
					this.aShortArray125[local79] = (short) arg0.method5738();
				}
			}
		} else if (arg1 == 3) {
			this.anInt7548 = this.anInt7549 = arg0.method5750();
		} else if (arg1 == 4) {
			this.anInt7551 = arg0.method5750();
		} else if (arg1 == 5) {
			this.anInt7548 = arg0.method5750();
		} else if (arg1 == 6) {
			this.anInt7549 = arg0.method5750();
		}
	}
}
