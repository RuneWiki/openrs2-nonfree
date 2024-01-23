import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class4_Sub1_Sub12 extends Class4_Sub1 {

	@OriginalMember(owner = "client!jj", name = "T", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!jj", name = "db", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!jj", name = "U", descriptor = "[B")
	private byte[] aByteArray19 = new byte[512];

	@OriginalMember(owner = "client!jj", name = "hb", descriptor = "Z")
	public boolean aBoolean181 = true;

	@OriginalMember(owner = "client!jj", name = "Z", descriptor = "I")
	public int anInt2620 = 1638;

	@OriginalMember(owner = "client!jj", name = "gb", descriptor = "I")
	public int anInt2625 = 4;

	@OriginalMember(owner = "client!jj", name = "kb", descriptor = "I")
	public int anInt2628 = 4;

	@OriginalMember(owner = "client!jj", name = "ab", descriptor = "I")
	public int anInt2621 = 0;

	@OriginalMember(owner = "client!jj", name = "nb", descriptor = "I")
	public int anInt2631 = 4;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "(B)V")
	private void method2050() {
		@Pc(29) int local29;
		if (this.anInt2620 > 0) {
			this.aShortArray38 = new short[this.anInt2628];
			this.aShortArray37 = new short[this.anInt2628];
			for (local29 = 0; local29 < this.anInt2628; local29++) {
				this.aShortArray37[local29] = (short) (Math.pow((double) ((float) this.anInt2620 / 4096.0F), (double) local29) * 4096.0D);
				this.aShortArray38[local29] = (short) Math.pow(2.0D, (double) local29);
			}
		} else if (this.aShortArray37 != null && this.aShortArray37.length == this.anInt2628) {
			this.aShortArray38 = new short[this.anInt2628];
			for (local29 = 0; local29 < this.anInt2628; local29++) {
				this.aShortArray38[local29] = (short) Math.pow(2.0D, (double) local29);
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean181 = arg0.method4666() == 1;
		} else if (arg1 == 1) {
			this.anInt2628 = arg0.method4666();
		} else if (arg1 == 2) {
			this.anInt2620 = arg0.method4613();
			if (this.anInt2620 < 0) {
				this.aShortArray37 = new short[this.anInt2628];
				for (@Pc(81) int local81 = 0; local81 < this.anInt2628; local81++) {
					this.aShortArray37[local81] = (short) arg0.method4613();
				}
			}
		} else if (arg1 == 3) {
			this.anInt2631 = this.anInt2625 = arg0.method4666();
		} else if (arg1 == 4) {
			this.anInt2621 = arg0.method4666();
		} else if (arg1 == 5) {
			this.anInt2631 = arg0.method4666();
		} else if (arg1 == 6) {
			this.anInt2625 = arg0.method4666();
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIII)I")
	private int method2052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) int local5 = arg5 - 4096;
		@Pc(13) int local13 = arg0 >> 12;
		@Pc(17) int local17 = arg0 & 0xFFF;
		@Pc(21) int local21 = local13 + 1;
		@Pc(25) int local25 = local13 & 0xFF;
		if (local21 >= arg4) {
			local21 = 0;
		}
		@Pc(35) int local35 = local17 - 4096;
		local21 &= 0xFF;
		@Pc(48) int local48 = this.aByteArray19[arg3 + local25] & 0x3;
		@Pc(65) int local65;
		if (local48 <= 1) {
			local65 = local48 == 0 ? arg5 + local17 : -local17 + arg5;
		} else {
			local65 = local48 == 2 ? local17 - arg5 : -arg5 + -local17;
		}
		local48 = this.aByteArray19[arg3 + local21] & 0x3;
		@Pc(96) int local96 = Class35.anIntArray61[local17];
		@Pc(115) int local115;
		if (local48 > 1) {
			local115 = local48 == 2 ? local35 - arg5 : -local35 + -arg5;
		} else {
			local115 = local48 == 0 ? arg5 + local35 : arg5 - local35;
		}
		local48 = this.aByteArray19[local25 + arg1] & 0x3;
		@Pc(150) int local150 = local65 + (local96 * (local115 - local65) >> 12);
		if (local48 > 1) {
			local65 = local48 == 2 ? local17 - local5 : -local17 - local5;
		} else {
			local65 = local48 == 0 ? local5 + local17 : -local17 + local5;
		}
		local48 = this.aByteArray19[arg1 + local21] & 0x3;
		if (local48 <= 1) {
			local115 = local48 == 0 ? local5 + local35 : -local35 + local5;
		} else {
			local115 = local48 == 2 ? local35 - local5 : -local5 + -local35;
		}
		@Pc(234) int local234 = local65 + ((local115 - local65) * local96 >> 12);
		return local150 + ((local234 - local150) * arg2 >> 12);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			this.method2054(local15, arg0);
		}
		return local15;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([III)V")
	public void method2054(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(20) int local20 = this.anInt2625 * Static237.anIntArray478[arg1];
		@Pc(120) int local120;
		@Pc(134) int local134;
		@Pc(38) int local38;
		@Pc(31) short local31;
		@Pc(106) int local106;
		@Pc(58) int local58;
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(79) int local79;
		@Pc(62) int local62;
		@Pc(83) int local83;
		@Pc(75) int local75;
		@Pc(101) int local101;
		if (this.anInt2628 == 1) {
			local31 = this.aShortArray37[0];
			local38 = this.aShortArray38[0] << 12;
			local45 = local38 * this.anInt2631 >> 12;
			local52 = this.anInt2625 * local38 >> 12;
			local58 = local38 * local20 >> 12;
			local62 = local58 >> 12;
			@Pc(66) int local66 = local58 & 0xFFF;
			local75 = this.aByteArray19[local62 & 0xFF] & 0xFF;
			local79 = Class35.anIntArray61[local66];
			local83 = local62 + 1;
			if (local52 <= local83) {
				local83 = 0;
			}
			local101 = this.aByteArray19[local83 & 0xFF] & 0xFF;
			if (this.aBoolean181) {
				for (local106 = 0; local106 < Static73.anInt1626; local106++) {
					local120 = Static138.anIntArray231[local106] * this.anInt2631;
					local134 = this.method2052(local38 * local120 >> 12, local101, local79, local75, local45, local66);
					local134 = local134 * local31 >> 12;
					arg0[local106] = (local134 >> 1) + 2048;
				}
			} else {
				for (local106 = 0; local106 < Static73.anInt1626; local106++) {
					local120 = Static138.anIntArray231[local106] * this.anInt2631;
					local134 = this.method2052(local38 * local120 >> 12, local101, local79, local75, local45, local66);
					arg0[local106] = local31 * local134 >> 12;
				}
			}
			return;
		}
		local31 = this.aShortArray37[0];
		if (local31 > 8 || local31 < -8) {
			local38 = this.aShortArray38[0] << 12;
			local58 = local38 * local20 >> 12;
			local62 = local58 >> 12;
			local45 = this.anInt2631 * local38 >> 12;
			local52 = local38 * this.anInt2625 >> 12;
			local58 &= 0xFFF;
			local75 = this.aByteArray19[local62 & 0xFF] & 0xFF;
			local79 = Class35.anIntArray61[local58];
			local83 = local62 + 1;
			if (local83 >= local52) {
				local83 = 0;
			}
			local101 = this.aByteArray19[local83 & 0xFF] & 0xFF;
			for (local106 = 0; local106 < Static73.anInt1626; local106++) {
				local120 = this.anInt2631 * Static138.anIntArray231[local106];
				local134 = this.method2052(local38 * local120 >> 12, local101, local79, local75, local45, local58);
				arg0[local106] = local31 * local134 >> 12;
			}
		}
		for (@Pc(314) int local314 = 1; local314 < this.anInt2628; local314++) {
			local31 = this.aShortArray37[local314];
			if (local31 > 8 || local31 < -8) {
				local38 = this.aShortArray38[local314] << 12;
				local45 = local38 * this.anInt2631 >> 12;
				local58 = local20 * local38 >> 12;
				local52 = this.anInt2625 * local38 >> 12;
				local62 = local58 >> 12;
				local83 = local62 + 1;
				local58 &= 0xFFF;
				local75 = this.aByteArray19[local62 & 0xFF] & 0xFF;
				if (local83 >= local52) {
					local83 = 0;
				}
				local101 = this.aByteArray19[local83 & 0xFF] & 0xFF;
				local79 = Class35.anIntArray61[local58];
				if (this.aBoolean181 && local314 == this.anInt2628 - 1) {
					for (local106 = 0; local106 < Static73.anInt1626; local106++) {
						local120 = Static138.anIntArray231[local106] * this.anInt2631;
						local134 = this.method2052(local120 * local38 >> 12, local101, local79, local75, local45, local58);
						local134 = arg0[local106] + (local31 * local134 >> 12);
						arg0[local106] = (local134 >> 1) + 2048;
					}
				} else {
					for (local106 = 0; local106 < Static73.anInt1626; local106++) {
						local120 = Static138.anIntArray231[local106] * this.anInt2631;
						local134 = this.method2052(local38 * local120 >> 12, local101, local79, local75, local45, local58);
						arg0[local106] += local31 * local134 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)V")
	@Override
	public void method4737() {
		this.aByteArray19 = Static207.method3334(this.anInt2621);
		this.method2050();
		for (@Pc(19) int local19 = this.anInt2628 - 1; local19 >= 1; local19--) {
			@Pc(35) short local35 = this.aShortArray37[local19];
			if (local35 > 8 || local35 < -8) {
				break;
			}
			this.anInt2628--;
		}
	}
}
