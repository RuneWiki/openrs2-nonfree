import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class3_Sub6_Sub7 extends Class3_Sub6 {

	@OriginalMember(owner = "client!eh", name = "S", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!eh", name = "Z", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
	public int anInt2846 = 4;

	@OriginalMember(owner = "client!eh", name = "bb", descriptor = "I")
	public int anInt2856 = 1638;

	@OriginalMember(owner = "client!eh", name = "cb", descriptor = "I")
	public int anInt2857 = 0;

	@OriginalMember(owner = "client!eh", name = "U", descriptor = "[B")
	private byte[] aByteArray61 = new byte[512];

	@OriginalMember(owner = "client!eh", name = "eb", descriptor = "Z")
	public boolean aBoolean196 = true;

	@OriginalMember(owner = "client!eh", name = "Y", descriptor = "I")
	public int anInt2854 = 4;

	@OriginalMember(owner = "client!eh", name = "X", descriptor = "I")
	public int anInt2853 = 4;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			this.method2362(local14, arg0);
		}
		return local14;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIBIII)I")
	private int method2359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg5 >> 12;
		@Pc(21) int local21 = local9 + 1;
		@Pc(25) int local25 = arg5 & 0xFFF;
		@Pc(29) int local29 = local9 & 0xFF;
		if (arg0 <= local21) {
			local21 = 0;
		}
		local21 &= 0xFF;
		@Pc(42) int local42 = local25 - 4096;
		@Pc(46) int local46 = arg2 - 4096;
		@Pc(55) int local55 = this.aByteArray61[arg4 + local29] & 0x3;
		@Pc(59) int local59 = Class32_Sub5.anIntArray375[local25];
		@Pc(79) int local79;
		if (local55 > 1) {
			local79 = local55 == 2 ? local25 - arg2 : -arg2 + -local25;
		} else {
			local79 = local55 == 0 ? arg2 + local25 : -local25 + arg2;
		}
		local55 = this.aByteArray61[arg4 + local21] & 0x3;
		@Pc(125) int local125;
		if (local55 > 1) {
			local125 = local55 == 2 ? local42 - arg2 : -arg2 + -local42;
		} else {
			local125 = local55 == 0 ? arg2 + local42 : arg2 - local42;
		}
		@Pc(148) int local148 = ((local125 - local79) * local59 >> 12) + local79;
		local55 = this.aByteArray61[arg1 + local29] & 0x3;
		if (local55 <= 1) {
			local79 = local55 == 0 ? local46 + local25 : -local25 + local46;
		} else {
			local79 = local55 == 2 ? local25 - local46 : -local46 + -local25;
		}
		local55 = this.aByteArray61[arg1 + local21] & 0x3;
		if (local55 <= 1) {
			local125 = local55 == 0 ? local42 + local46 : local46 + -local42;
		} else {
			local125 = local55 == 2 ? local42 - local46 : -local42 + -local46;
		}
		@Pc(242) int local242 = ((local125 - local79) * local59 >> 12) + local79;
		return (arg3 * (local242 - local148) >> 12) + local148;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean196 = arg0.method6814() == 1;
		} else if (arg1 == 1) {
			this.anInt2854 = arg0.method6814();
		} else if (arg1 == 2) {
			this.anInt2856 = arg0.method6789();
			if (this.anInt2856 < 0) {
				this.aShortArray48 = new short[this.anInt2854];
				for (@Pc(79) int local79 = 0; local79 < this.anInt2854; local79++) {
					this.aShortArray48[local79] = (short) arg0.method6789();
				}
				return;
			}
		} else if (arg1 == 3) {
			this.anInt2853 = this.anInt2846 = arg0.method6814();
			return;
		} else if (arg1 == 4) {
			this.anInt2857 = arg0.method6814();
			return;
		} else if (arg1 == 5) {
			this.anInt2853 = arg0.method6814();
			return;
		} else if (arg1 == 6) {
			this.anInt2846 = arg0.method6814();
			return;
		}
	}

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "(I)V")
	private void method2360() {
		@Pc(20) int local20;
		if (this.anInt2856 > 0) {
			this.aShortArray48 = new short[this.anInt2854];
			this.aShortArray47 = new short[this.anInt2854];
			for (local20 = 0; local20 < this.anInt2854; local20++) {
				this.aShortArray48[local20] = (short) (Math.pow((double) ((float) this.anInt2856 / 4096.0F), (double) local20) * 4096.0D);
				this.aShortArray47[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		} else if (this.aShortArray48 != null && this.anInt2854 == this.aShortArray48.length) {
			this.aShortArray47 = new short[this.anInt2854];
			for (local20 = 0; local20 < this.anInt2854; local20++) {
				this.aShortArray47[local20] = (short) Math.pow(2.0D, (double) local20);
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[II)V")
	public void method2362(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static231.anIntArray217[arg1] * this.anInt2846;
		@Pc(115) int local115;
		@Pc(129) int local129;
		@Pc(33) int local33;
		@Pc(38) short local38;
		@Pc(106) int local106;
		@Pc(51) int local51;
		@Pc(58) int local58;
		@Pc(45) int local45;
		@Pc(92) int local92;
		@Pc(62) int local62;
		@Pc(66) int local66;
		@Pc(101) int local101;
		@Pc(88) int local88;
		if (this.anInt2854 == 1) {
			local33 = this.aShortArray47[0] << 12;
			local38 = this.aShortArray48[0];
			local45 = local33 * this.anInt2846 >> 12;
			local51 = local33 * local12 >> 12;
			local58 = local33 * this.anInt2853 >> 12;
			local62 = local51 >> 12;
			local66 = local62 + 1;
			if (local45 <= local66) {
				local66 = 0;
			}
			local51 &= 0xFFF;
			local88 = this.aByteArray61[local66 & 0xFF] & 0xFF;
			local92 = Class32_Sub5.anIntArray375[local51];
			local101 = this.aByteArray61[local62 & 0xFF] & 0xFF;
			if (this.aBoolean196) {
				for (local106 = 0; local106 < Static481.anInt8358; local106++) {
					local115 = Static595.anIntArray600[local106] * this.anInt2853;
					local129 = this.method2359(local58, local88, local51, local92, local101, local33 * local115 >> 12);
					local129 = local38 * local129 >> 12;
					arg0[local106] = (local129 >> 1) + 2048;
				}
			} else {
				for (local106 = 0; local106 < Static481.anInt8358; local106++) {
					local115 = this.anInt2853 * Static595.anIntArray600[local106];
					local129 = this.method2359(local58, local88, local51, local92, local101, local115 * local33 >> 12);
					arg0[local106] = local38 * local129 >> 12;
				}
			}
			return;
		}
		local38 = this.aShortArray48[0];
		if (local38 > 8 || local38 < -8) {
			local33 = this.aShortArray47[0] << 12;
			local58 = this.anInt2853 * local33 >> 12;
			local51 = local33 * local12 >> 12;
			local45 = this.anInt2846 * local33 >> 12;
			local62 = local51 >> 12;
			local66 = local62 + 1;
			if (local45 <= local66) {
				local66 = 0;
			}
			local51 &= 0xFFF;
			local88 = this.aByteArray61[local66 & 0xFF] & 0xFF;
			local101 = this.aByteArray61[local62 & 0xFF] & 0xFF;
			local92 = Class32_Sub5.anIntArray375[local51];
			for (local106 = 0; local106 < Static481.anInt8358; local106++) {
				local115 = Static595.anIntArray600[local106] * this.anInt2853;
				local129 = this.method2359(local58, local88, local51, local92, local101, local33 * local115 >> 12);
				arg0[local106] = local38 * local129 >> 12;
			}
		}
		for (@Pc(306) int local306 = 1; local306 < this.anInt2854; local306++) {
			local38 = this.aShortArray48[local306];
			if (local38 > 8 || local38 < -8) {
				local33 = this.aShortArray47[local306] << 12;
				local45 = local33 * this.anInt2846 >> 12;
				local51 = local33 * local12 >> 12;
				local58 = this.anInt2853 * local33 >> 12;
				local62 = local51 >> 12;
				local66 = local62 + 1;
				if (local45 <= local66) {
					local66 = 0;
				}
				local51 &= 0xFFF;
				local88 = this.aByteArray61[local66 & 0xFF] & 0xFF;
				local101 = this.aByteArray61[local62 & 0xFF] & 0xFF;
				local92 = Class32_Sub5.anIntArray375[local51];
				if (this.aBoolean196 && local306 == this.anInt2854 - 1) {
					for (local106 = 0; local106 < Static481.anInt8358; local106++) {
						local115 = this.anInt2853 * Static595.anIntArray600[local106];
						local129 = this.method2359(local58, local88, local51, local92, local101, local33 * local115 >> 12);
						local129 = (local129 * local38 >> 12) + arg0[local106];
						arg0[local106] = (local129 >> 1) + 2048;
					}
				} else {
					for (local106 = 0; local106 < Static481.anInt8358; local106++) {
						local115 = Static595.anIntArray600[local106] * this.anInt2853;
						local129 = this.method2359(local58, local88, local51, local92, local101, local115 * local33 >> 12);
						arg0[local106] += local38 * local129 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
	@Override
	public void method8012() {
		this.aByteArray61 = Static365.method5190(this.anInt2857);
		this.method2360();
		for (@Pc(27) int local27 = this.anInt2854 - 1; local27 >= 1; local27--) {
			@Pc(34) short local34 = this.aShortArray48[local27];
			if (local34 > 8) {
				return;
			}
			if (local34 < -8) {
				return;
			}
			this.anInt2854--;
		}
	}
}
