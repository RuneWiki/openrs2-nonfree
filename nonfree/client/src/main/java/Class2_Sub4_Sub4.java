import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class2_Sub4_Sub4 extends Class2_Sub4 {

	@OriginalMember(owner = "client!db", name = "Z", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!db", name = "ab", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!db", name = "X", descriptor = "I")
	private int anInt771 = 0;

	@OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
	private int anInt774 = 4;

	@OriginalMember(owner = "client!db", name = "qb", descriptor = "[B")
	private byte[] aByteArray6 = new byte[512];

	@OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
	private int anInt772 = 4;

	@OriginalMember(owner = "client!db", name = "jb", descriptor = "I")
	private int anInt776 = 4;

	@OriginalMember(owner = "client!db", name = "U", descriptor = "Z")
	private boolean aBoolean33 = true;

	@OriginalMember(owner = "client!db", name = "rb", descriptor = "I")
	private int anInt781 = 1638;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
	@Override
	public void method3133() {
		this.aByteArray6 = Static204.method2971(this.anInt771);
		this.method565();
		for (@Pc(19) int local19 = this.anInt774 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray24[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt774--;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I[IB)V")
	private void method562(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(8) int local8 = Static2.anIntArray5[arg0] * this.anInt776;
		@Pc(105) int local105;
		@Pc(119) int local119;
		@Pc(32) int local32;
		@Pc(25) short local25;
		@Pc(96) int local96;
		@Pc(45) int local45;
		@Pc(73) int local73;
		@Pc(39) int local39;
		@Pc(66) int local66;
		@Pc(49) int local49;
		@Pc(77) int local77;
		@Pc(58) int local58;
		@Pc(91) int local91;
		if (this.anInt774 == 1) {
			local25 = this.aShortArray24[0];
			local32 = this.aShortArray23[0] << 12;
			local39 = local32 * this.anInt776 >> 12;
			local45 = local8 * local32 >> 12;
			local49 = local45 >> 12;
			local58 = this.aByteArray6[local49 & 0xFF] & 0xFF;
			local45 &= 0xFFF;
			local66 = Class87.anIntArray315[local45];
			local73 = local32 * this.anInt772 >> 12;
			local77 = local49 + 1;
			if (local39 <= local77) {
				local77 = 0;
			}
			local91 = this.aByteArray6[local77 & 0xFF] & 0xFF;
			if (this.aBoolean33) {
				for (local96 = 0; local96 < Static118.anInt2608; local96++) {
					local105 = this.anInt772 * Static141.anIntArray130[local96];
					local119 = this.method567(local66, local58, local91, local45, local105 * local32 >> 12, local73);
					local119 = local119 * local25 >> 12;
					arg1[local96] = (local119 >> 1) + 2048;
				}
			} else {
				for (local96 = 0; local96 < Static118.anInt2608; local96++) {
					local105 = Static141.anIntArray130[local96] * this.anInt772;
					local119 = this.method567(local66, local58, local91, local45, local105 * local32 >> 12, local73);
					arg1[local96] = local119 * local25 >> 12;
				}
			}
			return;
		}
		local25 = this.aShortArray24[0];
		if (local25 > 8 || local25 < -8) {
			local32 = this.aShortArray23[0] << 12;
			local39 = local32 * this.anInt776 >> 12;
			local73 = this.anInt772 * local32 >> 12;
			local45 = local32 * local8 >> 12;
			local49 = local45 >> 12;
			local77 = local49 + 1;
			if (local77 >= local39) {
				local77 = 0;
			}
			local58 = this.aByteArray6[local49 & 0xFF] & 0xFF;
			local45 &= 0xFFF;
			local91 = this.aByteArray6[local77 & 0xFF] & 0xFF;
			local66 = Class87.anIntArray315[local45];
			for (local96 = 0; local96 < Static118.anInt2608; local96++) {
				local105 = Static141.anIntArray130[local96] * this.anInt772;
				local119 = this.method567(local66, local58, local91, local45, local32 * local105 >> 12, local73);
				arg1[local96] = local119 * local25 >> 12;
			}
		}
		for (@Pc(306) int local306 = 1; local306 < this.anInt774; local306++) {
			local25 = this.aShortArray24[local306];
			if (local25 > 8 || local25 < -8) {
				local32 = this.aShortArray23[local306] << 12;
				local39 = local32 * this.anInt776 >> 12;
				local73 = this.anInt772 * local32 >> 12;
				local45 = local8 * local32 >> 12;
				local49 = local45 >> 12;
				local58 = this.aByteArray6[local49 & 0xFF] & 0xFF;
				local77 = local49 + 1;
				local45 &= 0xFFF;
				local66 = Class87.anIntArray315[local45];
				if (local77 >= local39) {
					local77 = 0;
				}
				local91 = this.aByteArray6[local77 & 0xFF] & 0xFF;
				if (this.aBoolean33 && local306 == this.anInt774 - 1) {
					for (local96 = 0; local96 < Static118.anInt2608; local96++) {
						local105 = this.anInt772 * Static141.anIntArray130[local96];
						local119 = this.method567(local66, local58, local91, local45, local32 * local105 >> 12, local73);
						local119 = (local25 * local119 >> 12) + arg1[local96];
						arg1[local96] = (local119 >> 1) + 2048;
					}
				} else {
					for (local96 = 0; local96 < Static118.anInt2608; local96++) {
						local105 = this.anInt772 * Static141.anIntArray130[local96];
						local119 = this.method567(local66, local58, local91, local45, local32 * local105 >> 12, local73);
						arg1[local96] += local25 * local119 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			this.method562(arg0, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.aBoolean33 = arg1.method1534() == 1;
		} else if (arg0 == 1) {
			this.anInt774 = arg1.method1534();
		} else if (arg0 == 2) {
			this.anInt781 = arg1.method1568();
			if (this.anInt781 < 0) {
				this.aShortArray24 = new short[this.anInt774];
				for (@Pc(73) int local73 = 0; local73 < this.anInt774; local73++) {
					this.aShortArray24[local73] = (short) arg1.method1568();
				}
			}
		} else if (arg0 == 3) {
			this.anInt772 = this.anInt776 = arg1.method1534();
		} else if (arg0 == 4) {
			this.anInt771 = arg1.method1534();
		} else if (arg0 == 5) {
			this.anInt772 = arg1.method1534();
		} else if (arg0 == 6) {
			this.anInt776 = arg1.method1534();
		}
	}

	@OriginalMember(owner = "client!db", name = "f", descriptor = "(B)V")
	private void method565() {
		@Pc(21) int local21;
		if (this.anInt781 > 0) {
			this.aShortArray24 = new short[this.anInt774];
			this.aShortArray23 = new short[this.anInt774];
			for (local21 = 0; local21 < this.anInt774; local21++) {
				this.aShortArray24[local21] = (short) (Math.pow((double) ((float) this.anInt781 / 4096.0F), (double) local21) * 4096.0D);
				this.aShortArray23[local21] = (short) Math.pow(2.0D, (double) local21);
			}
		} else if (this.aShortArray24 != null && this.aShortArray24.length == this.anInt774) {
			this.aShortArray23 = new short[this.anInt774];
			for (local21 = 0; local21 < this.anInt774; local21++) {
				this.aShortArray23[local21] = (short) Math.pow(2.0D, (double) local21);
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIII)I")
	private int method567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg3 - 4096;
		@Pc(18) int local18 = arg4 >> 12;
		@Pc(22) int local22 = arg4 & 0xFFF;
		@Pc(26) int local26 = local18 + 1;
		if (local26 >= arg5) {
			local26 = 0;
		}
		local26 &= 0xFF;
		@Pc(39) int local39 = local22 - 4096;
		@Pc(43) int local43 = Class87.anIntArray315[local22];
		local18 &= 0xFF;
		@Pc(56) int local56 = this.aByteArray6[arg1 + local18] & 0x3;
		@Pc(76) int local76;
		if (local56 > 1) {
			local76 = local56 == 2 ? local22 - arg3 : -local22 - arg3;
		} else {
			local76 = local56 == 0 ? arg3 + local22 : arg3 - local22;
		}
		local56 = this.aByteArray6[local26 + arg1] & 0x3;
		@Pc(120) int local120;
		if (local56 > 1) {
			local120 = local56 == 2 ? local39 - arg3 : -arg3 + -local39;
		} else {
			local120 = local56 == 0 ? arg3 + local39 : arg3 - local39;
		}
		local56 = this.aByteArray6[arg2 + local18] & 0x3;
		@Pc(155) int local155 = ((local120 - local76) * local43 >> 12) + local76;
		if (local56 > 1) {
			local76 = local56 == 2 ? local22 - local14 : -local14 + -local22;
		} else {
			local76 = local56 == 0 ? local14 + local22 : -local22 + local14;
		}
		local56 = this.aByteArray6[local26 + arg2] & 0x3;
		if (local56 > 1) {
			local120 = local56 == 2 ? local39 - local14 : -local39 - local14;
		} else {
			local120 = local56 == 0 ? local39 + local14 : -local39 + local14;
		}
		@Pc(236) int local236 = (local43 * (local120 - local76) >> 12) + local76;
		return local155 + (arg0 * (local236 - local155) >> 12);
	}
}
