import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ee", name = "hb", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!ee", name = "jb", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!ee", name = "db", descriptor = "I")
	private int anInt1193 = 4;

	@OriginalMember(owner = "client!ee", name = "Y", descriptor = "I")
	private int anInt1188 = 0;

	@OriginalMember(owner = "client!ee", name = "kb", descriptor = "I")
	private int anInt1197 = 4;

	@OriginalMember(owner = "client!ee", name = "lb", descriptor = "[B")
	private byte[] aByteArray10 = new byte[512];

	@OriginalMember(owner = "client!ee", name = "bb", descriptor = "I")
	private int anInt1191 = 4;

	@OriginalMember(owner = "client!ee", name = "fb", descriptor = "I")
	private int anInt1194 = 1638;

	@OriginalMember(owner = "client!ee", name = "mb", descriptor = "Z")
	private boolean aBoolean58 = true;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIII)I")
	private int method861(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg2 - 4096;
		@Pc(18) int local18 = arg5 >> 12;
		@Pc(22) int local22 = local18 + 1;
		if (local22 >= arg1) {
			local22 = 0;
		}
		local22 &= 0xFF;
		local18 &= 0xFF;
		@Pc(43) int local43 = arg5 & 0xFFF;
		@Pc(47) int local47 = local43 - 4096;
		@Pc(56) int local56 = this.aByteArray10[local18 + arg4] & 0x3;
		@Pc(74) int local74;
		if (local56 <= 1) {
			local74 = local56 == 0 ? arg2 + local43 : arg2 - local43;
		} else {
			local74 = local56 == 2 ? local43 - arg2 : -local43 - arg2;
		}
		@Pc(95) int local95 = Class1_Sub2_Sub9.anIntArray108[local43];
		local56 = this.aByteArray10[local22 + arg4] & 0x3;
		@Pc(124) int local124;
		if (local56 > 1) {
			local124 = local56 == 2 ? local47 - arg2 : -arg2 + -local47;
		} else {
			local124 = local56 == 0 ? arg2 + local47 : arg2 + -local47;
		}
		@Pc(151) int local151 = ((local124 - local74) * local95 >> 12) + local74;
		local56 = this.aByteArray10[local18 + arg0] & 0x3;
		if (local56 <= 1) {
			local74 = local56 == 0 ? local14 + local43 : local14 + -local43;
		} else {
			local74 = local56 == 2 ? local43 - local14 : -local43 - local14;
		}
		local56 = this.aByteArray10[arg0 + local22] & 0x3;
		if (local56 <= 1) {
			local124 = local56 == 0 ? local14 + local47 : -local47 + local14;
		} else {
			local124 = local56 == 2 ? local47 - local14 : -local47 + -local14;
		}
		@Pc(247) int local247 = local74 + ((local124 - local74) * local95 >> 12);
		return local151 + ((local247 - local151) * arg3 >> 12);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V")
	@Override
	public void method3739() {
		this.aByteArray10 = Static28.method526(this.anInt1188);
		this.method862();
		for (@Pc(19) int local19 = this.anInt1191 - 1; local19 >= 1; local19--) {
			@Pc(26) short local26 = this.aShortArray7[local19];
			if (local26 > 8 || local26 < -8) {
				break;
			}
			this.anInt1191--;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean58 = arg0.method3793() == 1;
		} else if (arg1 == 1) {
			this.anInt1191 = arg0.method3793();
		} else if (arg1 == 2) {
			this.anInt1194 = arg0.method3817();
			if (this.anInt1194 < 0) {
				this.aShortArray7 = new short[this.anInt1191];
				for (@Pc(77) int local77 = 0; local77 < this.anInt1191; local77++) {
					this.aShortArray7[local77] = (short) arg0.method3817();
				}
			}
		} else if (arg1 == 3) {
			this.anInt1197 = this.anInt1193 = arg0.method3793();
		} else if (arg1 == 4) {
			this.anInt1188 = arg0.method3793();
		} else if (arg1 == 5) {
			this.anInt1197 = arg0.method3793();
		} else if (arg1 == 6) {
			this.anInt1193 = arg0.method3793();
		}
	}

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "(I)V")
	private void method862() {
		@Pc(26) int local26;
		if (this.anInt1194 > 0) {
			this.aShortArray6 = new short[this.anInt1191];
			this.aShortArray7 = new short[this.anInt1191];
			for (local26 = 0; local26 < this.anInt1191; local26++) {
				this.aShortArray7[local26] = (short) (Math.pow((double) ((float) this.anInt1194 / 4096.0F), (double) local26) * 4096.0D);
				this.aShortArray6[local26] = (short) Math.pow(2.0D, (double) local26);
			}
		} else if (this.aShortArray7 != null && this.anInt1191 == this.aShortArray7.length) {
			this.aShortArray6 = new short[this.anInt1191];
			for (local26 = 0; local26 < this.anInt1191; local26++) {
				this.aShortArray6[local26] = (short) Math.pow(2.0D, (double) local26);
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[I)V")
	private void method864(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(17) int local17 = this.anInt1193 * Static211.anIntArray334[arg0];
		@Pc(108) int local108;
		@Pc(122) int local122;
		@Pc(30) int local30;
		@Pc(63) short local63;
		@Pc(99) int local99;
		@Pc(43) int local43;
		@Pc(37) int local37;
		@Pc(50) int local50;
		@Pc(94) int local94;
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(81) int local81;
		@Pc(90) int local90;
		if (this.anInt1191 == 1) {
			local30 = this.aShortArray6[0] << 12;
			local37 = local30 * this.anInt1197 >> 12;
			local43 = local17 * local30 >> 12;
			local50 = this.anInt1193 * local30 >> 12;
			local54 = local43 >> 12;
			local58 = local54 + 1;
			local63 = this.aShortArray7[0];
			local43 &= 0xFFF;
			if (local58 >= local50) {
				local58 = 0;
			}
			local81 = this.aByteArray10[local54 & 0xFF] & 0xFF;
			local90 = this.aByteArray10[local58 & 0xFF] & 0xFF;
			local94 = Class1_Sub2_Sub9.anIntArray108[local43];
			if (this.aBoolean58) {
				for (local99 = 0; local99 < Static157.anInt3431; local99++) {
					local108 = this.anInt1197 * Static73.anIntArray105[local99];
					local122 = this.method861(local90, local37, local43, local94, local81, local30 * local108 >> 12);
					local122 = local122 * local63 >> 12;
					arg1[local99] = (local122 >> 1) + 2048;
				}
			} else {
				for (local99 = 0; local99 < Static157.anInt3431; local99++) {
					local108 = Static73.anIntArray105[local99] * this.anInt1197;
					local122 = this.method861(local90, local37, local43, local94, local81, local108 * local30 >> 12);
					arg1[local99] = local63 * local122 >> 12;
				}
			}
			return;
		}
		local63 = this.aShortArray7[0];
		if (local63 > 8 || local63 < -8) {
			local30 = this.aShortArray6[0] << 12;
			local50 = local30 * this.anInt1193 >> 12;
			local37 = this.anInt1197 * local30 >> 12;
			local43 = local17 * local30 >> 12;
			local54 = local43 >> 12;
			@Pc(227) int local227 = local43 & 0xFFF;
			local81 = this.aByteArray10[local54 & 0xFF] & 0xFF;
			local94 = Class1_Sub2_Sub9.anIntArray108[local227];
			local58 = local54 + 1;
			if (local50 <= local58) {
				local58 = 0;
			}
			local90 = this.aByteArray10[local58 & 0xFF] & 0xFF;
			for (local99 = 0; local99 < Static157.anInt3431; local99++) {
				local108 = this.anInt1197 * Static73.anIntArray105[local99];
				local122 = this.method861(local90, local37, local227, local94, local81, local30 * local108 >> 12);
				arg1[local99] = local63 * local122 >> 12;
			}
		}
		for (@Pc(301) int local301 = 1; local301 < this.anInt1191; local301++) {
			local63 = this.aShortArray7[local301];
			if (local63 > 8 || local63 < -8) {
				local30 = this.aShortArray6[local301] << 12;
				local37 = local30 * this.anInt1197 >> 12;
				local43 = local17 * local30 >> 12;
				local50 = local30 * this.anInt1193 >> 12;
				local54 = local43 >> 12;
				local58 = local54 + 1;
				local43 &= 0xFFF;
				local81 = this.aByteArray10[local54 & 0xFF] & 0xFF;
				local94 = Class1_Sub2_Sub9.anIntArray108[local43];
				if (local58 >= local50) {
					local58 = 0;
				}
				local90 = this.aByteArray10[local58 & 0xFF] & 0xFF;
				if (this.aBoolean58 && this.anInt1191 - 1 == local301) {
					for (local99 = 0; local99 < Static157.anInt3431; local99++) {
						local108 = this.anInt1197 * Static73.anIntArray105[local99];
						local122 = this.method861(local90, local37, local43, local94, local81, local30 * local108 >> 12);
						local122 = (local122 * local63 >> 12) + arg1[local99];
						arg1[local99] = (local122 >> 1) + 2048;
					}
				} else {
					for (local99 = 0; local99 < Static157.anInt3431; local99++) {
						local108 = this.anInt1197 * Static73.anIntArray105[local99];
						local122 = this.method861(local90, local37, local43, local94, local81, local30 * local108 >> 12);
						arg1[local99] += local122 * local63 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			this.method864(arg0, local17);
		}
		return local17;
	}
}
