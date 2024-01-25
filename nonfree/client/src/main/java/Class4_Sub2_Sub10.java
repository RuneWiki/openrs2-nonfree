import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class4_Sub2_Sub10 extends Class4_Sub2 {

	@OriginalMember(owner = "client!fl", name = "L", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!fl", name = "P", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!fl", name = "U", descriptor = "I")
	public int anInt2451 = 4;

	@OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
	public int anInt2447 = 1638;

	@OriginalMember(owner = "client!fl", name = "M", descriptor = "Z")
	public boolean aBoolean188 = true;

	@OriginalMember(owner = "client!fl", name = "W", descriptor = "I")
	public int anInt2453 = 4;

	@OriginalMember(owner = "client!fl", name = "Q", descriptor = "[B")
	private byte[] aByteArray19 = new byte[512];

	@OriginalMember(owner = "client!fl", name = "V", descriptor = "I")
	public int anInt2452 = 0;

	@OriginalMember(owner = "client!fl", name = "R", descriptor = "I")
	public int anInt2449 = 4;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.aBoolean188 = arg1.method4864() == 1;
		} else if (arg0 == 1) {
			this.anInt2451 = arg1.method4864();
		} else if (arg0 == 2) {
			this.anInt2447 = arg1.method4889();
			if (this.anInt2447 < 0) {
				this.aShortArray28 = new short[this.anInt2451];
				for (@Pc(68) int local68 = 0; local68 < this.anInt2451; local68++) {
					this.aShortArray28[local68] = (short) arg1.method4889();
				}
			}
		} else if (arg0 == 3) {
			this.anInt2449 = this.anInt2453 = arg1.method4864();
		} else if (arg0 == 4) {
			this.anInt2452 = arg1.method4864();
		} else if (arg0 == 5) {
			this.anInt2449 = arg1.method4864();
		} else if (arg0 == 6) {
			this.anInt2453 = arg1.method4864();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIIZ)I")
	private int method1837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) int local14 = arg4 >> 12;
		@Pc(18) int local18 = local14 + 1;
		@Pc(22) int local22 = local14 & 0xFF;
		@Pc(26) int local26 = arg4 & 0xFFF;
		if (arg0 <= local18) {
			local18 = 0;
		}
		@Pc(35) int local35 = local26 - 4096;
		local18 &= 0xFF;
		@Pc(43) int local43 = arg5 - 4096;
		@Pc(53) int local53 = this.aByteArray19[local22 + arg3] & 0x3;
		@Pc(57) int local57 = Class2_Sub7.anIntArray508[local26];
		@Pc(76) int local76;
		if (local53 <= 1) {
			local76 = local53 == 0 ? arg5 + local26 : -local26 + arg5;
		} else {
			local76 = local53 == 2 ? local26 - arg5 : -arg5 + -local26;
		}
		local53 = this.aByteArray19[local18 + arg3] & 0x3;
		@Pc(116) int local116;
		if (local53 <= 1) {
			local116 = local53 == 0 ? arg5 + local35 : arg5 - local35;
		} else {
			local116 = local53 == 2 ? local35 - arg5 : -local35 - arg5;
		}
		@Pc(142) int local142 = (local57 * (local116 - local76) >> 12) + local76;
		local53 = this.aByteArray19[local22 + arg1] & 0x3;
		if (local53 > 1) {
			local76 = local53 == 2 ? local26 - local43 : -local43 + -local26;
		} else {
			local76 = local53 == 0 ? local43 + local26 : -local26 + local43;
		}
		local53 = this.aByteArray19[local18 + arg1] & 0x3;
		if (local53 <= 1) {
			local116 = local53 == 0 ? local35 + local43 : local43 - local35;
		} else {
			local116 = local53 == 2 ? local35 - local43 : -local35 + -local43;
		}
		@Pc(236) int local236 = (local57 * (local116 - local76) >> 12) + local76;
		return local142 + ((local236 - local142) * arg2 >> 12);
	}

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)V")
	private void method1839() {
		@Pc(23) int local23;
		if (this.anInt2447 > 0) {
			this.aShortArray27 = new short[this.anInt2451];
			this.aShortArray28 = new short[this.anInt2451];
			for (local23 = 0; local23 < this.anInt2451; local23++) {
				this.aShortArray28[local23] = (short) (Math.pow((double) ((float) this.anInt2447 / 4096.0F), (double) local23) * 4096.0D);
				this.aShortArray27[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		} else if (this.aShortArray28 != null && this.aShortArray28.length == this.anInt2451) {
			this.aShortArray27 = new short[this.anInt2451];
			for (local23 = 0; local23 < this.anInt2451; local23++) {
				this.aShortArray27[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			this.method1841(arg0, local14);
		}
		return local14;
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V")
	@Override
	public void method5845() {
		this.aByteArray19 = Static92.method1504(this.anInt2452);
		this.method1839();
		for (@Pc(27) int local27 = this.anInt2451 - 1; local27 >= 1; local27--) {
			@Pc(34) short local34 = this.aShortArray28[local27];
			if (local34 > 8) {
				return;
			}
			if (local34 < -8) {
				return;
			}
			this.anInt2451--;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB[I)V")
	public void method1841(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = Static293.anIntArray461[arg0] * this.anInt2453;
		@Pc(115) int local115;
		@Pc(129) int local129;
		@Pc(33) int local33;
		@Pc(38) short local38;
		@Pc(106) int local106;
		@Pc(58) int local58;
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(92) int local92;
		@Pc(62) int local62;
		@Pc(66) int local66;
		@Pc(88) int local88;
		@Pc(101) int local101;
		if (this.anInt2451 == 1) {
			local33 = this.aShortArray27[0] << 12;
			local38 = this.aShortArray28[0];
			local45 = local33 * this.anInt2449 >> 12;
			local52 = this.anInt2453 * local33 >> 12;
			local58 = local12 * local33 >> 12;
			local62 = local58 >> 12;
			local66 = local62 + 1;
			local58 &= 0xFFF;
			if (local52 <= local66) {
				local66 = 0;
			}
			local88 = this.aByteArray19[local62 & 0xFF] & 0xFF;
			local92 = Class2_Sub7.anIntArray508[local58];
			local101 = this.aByteArray19[local66 & 0xFF] & 0xFF;
			if (this.aBoolean188) {
				for (local106 = 0; local106 < Static350.anInt6330; local106++) {
					local115 = this.anInt2449 * Static197.anIntArray566[local106];
					local129 = this.method1837(local45, local101, local92, local88, local33 * local115 >> 12, local58);
					local129 = local38 * local129 >> 12;
					arg1[local106] = (local129 >> 1) + 2048;
				}
			} else {
				for (local106 = 0; local106 < Static350.anInt6330; local106++) {
					local115 = this.anInt2449 * Static197.anIntArray566[local106];
					local129 = this.method1837(local45, local101, local92, local88, local33 * local115 >> 12, local58);
					arg1[local106] = local129 * local38 >> 12;
				}
			}
			return;
		}
		local38 = this.aShortArray28[0];
		if (local38 > 8 || local38 < -8) {
			local33 = this.aShortArray27[0] << 12;
			local52 = this.anInt2453 * local33 >> 12;
			local45 = this.anInt2449 * local33 >> 12;
			local58 = local33 * local12 >> 12;
			local62 = local58 >> 12;
			local66 = local62 + 1;
			if (local52 <= local66) {
				local66 = 0;
			}
			local58 &= 0xFFF;
			local88 = this.aByteArray19[local62 & 0xFF] & 0xFF;
			local101 = this.aByteArray19[local66 & 0xFF] & 0xFF;
			local92 = Class2_Sub7.anIntArray508[local58];
			for (local106 = 0; local106 < Static350.anInt6330; local106++) {
				local115 = Static197.anIntArray566[local106] * this.anInt2449;
				local129 = this.method1837(local45, local101, local92, local88, local115 * local33 >> 12, local58);
				arg1[local106] = local38 * local129 >> 12;
			}
		}
		for (@Pc(314) int local314 = 1; local314 < this.anInt2451; local314++) {
			local38 = this.aShortArray28[local314];
			if (local38 > 8 || local38 < -8) {
				local33 = this.aShortArray27[local314] << 12;
				local45 = this.anInt2449 * local33 >> 12;
				local52 = this.anInt2453 * local33 >> 12;
				local58 = local33 * local12 >> 12;
				local62 = local58 >> 12;
				local66 = local62 + 1;
				if (local52 <= local66) {
					local66 = 0;
				}
				local58 &= 0xFFF;
				local88 = this.aByteArray19[local62 & 0xFF] & 0xFF;
				local92 = Class2_Sub7.anIntArray508[local58];
				local101 = this.aByteArray19[local66 & 0xFF] & 0xFF;
				if (this.aBoolean188 && this.anInt2451 - 1 == local314) {
					for (local106 = 0; local106 < Static350.anInt6330; local106++) {
						local115 = Static197.anIntArray566[local106] * this.anInt2449;
						local129 = this.method1837(local45, local101, local92, local88, local115 * local33 >> 12, local58);
						local129 = (local129 * local38 >> 12) + arg1[local106];
						arg1[local106] = (local129 >> 1) + 2048;
					}
				} else {
					for (local106 = 0; local106 < Static350.anInt6330; local106++) {
						local115 = this.anInt2449 * Static197.anIntArray566[local106];
						local129 = this.method1837(local45, local101, local92, local88, local33 * local115 >> 12, local58);
						arg1[local106] += local38 * local129 >> 12;
					}
				}
			}
		}
	}
}
