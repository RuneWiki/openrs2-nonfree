import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class4_Sub1_Sub9 extends Class4_Sub1 {

	@OriginalMember(owner = "client!fi", name = "P", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!fi", name = "U", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
	public int anInt1657 = 4;

	@OriginalMember(owner = "client!fi", name = "N", descriptor = "[B")
	private byte[] aByteArray20 = new byte[512];

	@OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
	public int anInt1655 = 0;

	@OriginalMember(owner = "client!fi", name = "O", descriptor = "Z")
	public boolean aBoolean98 = true;

	@OriginalMember(owner = "client!fi", name = "X", descriptor = "I")
	public int anInt1663 = 4;

	@OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
	public int anInt1659 = 1638;

	@OriginalMember(owner = "client!fi", name = "bb", descriptor = "I")
	public int anInt1667 = 4;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.aBoolean98 = arg1.method3110() == 1;
		} else if (arg0 == 1) {
			this.anInt1667 = arg1.method3110();
		} else if (arg0 == 2) {
			this.anInt1659 = arg1.method3072();
			if (this.anInt1659 < 0) {
				this.aShortArray33 = new short[this.anInt1667];
				for (@Pc(80) int local80 = 0; local80 < this.anInt1667; local80++) {
					this.aShortArray33[local80] = (short) arg1.method3072();
				}
			}
		} else if (arg0 == 3) {
			this.anInt1663 = this.anInt1657 = arg1.method3110();
		} else if (arg0 == 4) {
			this.anInt1655 = arg1.method3110();
		} else if (arg0 == 5) {
			this.anInt1663 = arg1.method3110();
		} else if (arg0 == 6) {
			this.anInt1657 = arg1.method3110();
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I[II)V")
	public void method1360(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt1657 * Static10.anIntArray7[arg1];
		@Pc(107) int local107;
		@Pc(121) int local121;
		@Pc(32) int local32;
		@Pc(25) short local25;
		@Pc(97) int local97;
		@Pc(52) int local52;
		@Pc(39) int local39;
		@Pc(46) int local46;
		@Pc(92) int local92;
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(69) int local69;
		@Pc(84) int local84;
		if (this.anInt1667 == 1) {
			local25 = this.aShortArray33[0];
			local32 = this.aShortArray34[0] << 12;
			local39 = this.anInt1663 * local32 >> 12;
			local46 = this.anInt1657 * local32 >> 12;
			local52 = local16 * local32 >> 12;
			local56 = local52 >> 12;
			local60 = local56 + 1;
			local69 = this.aByteArray20[local56 & 0xFF] & 0xFF;
			if (local60 >= local46) {
				local60 = 0;
			}
			local84 = this.aByteArray20[local60 & 0xFF] & 0xFF;
			local52 &= 0xFFF;
			local92 = Class17.anIntArray82[local52];
			if (this.aBoolean98) {
				for (local97 = 0; local97 < Static68.anInt1753; local97++) {
					local107 = this.anInt1663 * Static94.anIntArray163[local97];
					local121 = this.method1365(local69, local39, local52, local32 * local107 >> 12, local92, local84);
					local121 = local121 * local25 >> 12;
					arg0[local97] = (local121 >> 1) + 2048;
				}
			} else {
				for (local97 = 0; local97 < Static68.anInt1753; local97++) {
					local107 = Static94.anIntArray163[local97] * this.anInt1663;
					local121 = this.method1365(local69, local39, local52, local107 * local32 >> 12, local92, local84);
					arg0[local97] = local121 * local25 >> 12;
				}
			}
			return;
		}
		local25 = this.aShortArray33[0];
		if (local25 > 8 || local25 < -8) {
			local32 = this.aShortArray34[0] << 12;
			local52 = local16 * local32 >> 12;
			local46 = local32 * this.anInt1657 >> 12;
			local56 = local52 >> 12;
			local39 = local32 * this.anInt1663 >> 12;
			local52 &= 0xFFF;
			local92 = Class17.anIntArray82[local52];
			local69 = this.aByteArray20[local56 & 0xFF] & 0xFF;
			local60 = local56 + 1;
			if (local46 <= local60) {
				local60 = 0;
			}
			local84 = this.aByteArray20[local60 & 0xFF] & 0xFF;
			for (local97 = 0; local97 < Static68.anInt1753; local97++) {
				local107 = Static94.anIntArray163[local97] * this.anInt1663;
				local121 = this.method1365(local69, local39, local52, local107 * local32 >> 12, local92, local84);
				arg0[local97] = local25 * local121 >> 12;
			}
		}
		for (@Pc(302) int local302 = 1; local302 < this.anInt1667; local302++) {
			local25 = this.aShortArray33[local302];
			if (local25 > 8 || local25 < -8) {
				local32 = this.aShortArray34[local302] << 12;
				local52 = local32 * local16 >> 12;
				local39 = this.anInt1663 * local32 >> 12;
				local56 = local52 >> 12;
				local52 &= 0xFFF;
				local46 = this.anInt1657 * local32 >> 12;
				local60 = local56 + 1;
				local92 = Class17.anIntArray82[local52];
				local69 = this.aByteArray20[local56 & 0xFF] & 0xFF;
				if (local46 <= local60) {
					local60 = 0;
				}
				local84 = this.aByteArray20[local60 & 0xFF] & 0xFF;
				if (this.aBoolean98 && this.anInt1667 - 1 == local302) {
					for (local97 = 0; local97 < Static68.anInt1753; local97++) {
						local107 = Static94.anIntArray163[local97] * this.anInt1663;
						local121 = this.method1365(local69, local39, local52, local107 * local32 >> 12, local92, local84);
						local121 = arg0[local97] + (local25 * local121 >> 12);
						arg0[local97] = (local121 >> 1) + 2048;
					}
				} else {
					for (local97 = 0; local97 < Static68.anInt1753; local97++) {
						local107 = Static94.anIntArray163[local97] * this.anInt1663;
						local121 = this.method1365(local69, local39, local52, local107 * local32 >> 12, local92, local84);
						arg0[local97] += local25 * local121 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			this.method1360(local16, arg0);
		}
		return local16;
	}

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V")
	private void method1364() {
		@Pc(23) int local23;
		if (this.anInt1659 > 0) {
			this.aShortArray33 = new short[this.anInt1667];
			this.aShortArray34 = new short[this.anInt1667];
			for (local23 = 0; local23 < this.anInt1667; local23++) {
				this.aShortArray33[local23] = (short) (Math.pow((double) ((float) this.anInt1659 / 4096.0F), (double) local23) * 4096.0D);
				this.aShortArray34[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		} else if (this.aShortArray33 != null && this.anInt1667 == this.aShortArray33.length) {
			this.aShortArray34 = new short[this.anInt1667];
			for (local23 = 0; local23 < this.anInt1667; local23++) {
				this.aShortArray34[local23] = (short) Math.pow(2.0D, (double) local23);
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	@Override
	public void method4537() {
		this.aByteArray20 = Static173.method2813(this.anInt1655);
		this.method1364();
		for (@Pc(19) int local19 = this.anInt1667 - 1; local19 >= 1; local19--) {
			@Pc(33) short local33 = this.aShortArray33[local19];
			if (local33 > 8 || local33 < -8) {
				break;
			}
			this.anInt1667--;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIII)I")
	private int method1365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 - 4096;
		@Pc(13) int local13 = arg3 >> 12;
		@Pc(17) int local17 = local13 + 1;
		@Pc(26) int local26 = arg3 & 0xFFF;
		if (local17 >= arg1) {
			local17 = 0;
		}
		local13 &= 0xFF;
		@Pc(44) int local44 = local26 - 4096;
		local17 &= 0xFF;
		@Pc(57) int local57 = this.aByteArray20[local13 + arg0] & 0x3;
		@Pc(75) int local75;
		if (local57 > 1) {
			local75 = local57 == 2 ? local26 - arg2 : -local26 - arg2;
		} else {
			local75 = local57 == 0 ? arg2 + local26 : -local26 + arg2;
		}
		local57 = this.aByteArray20[arg0 + local17] & 0x3;
		@Pc(114) int local114;
		if (local57 <= 1) {
			local114 = local57 == 0 ? arg2 + local44 : arg2 + -local44;
		} else {
			local114 = local57 == 2 ? local44 - arg2 : -local44 - arg2;
		}
		local57 = this.aByteArray20[arg5 + local13] & 0x3;
		@Pc(144) int local144 = Class17.anIntArray82[local26];
		@Pc(155) int local155 = local75 + ((local114 - local75) * local144 >> 12);
		if (local57 <= 1) {
			local75 = local57 == 0 ? local26 + local9 : local9 + -local26;
		} else {
			local75 = local57 == 2 ? local26 - local9 : -local9 + -local26;
		}
		local57 = this.aByteArray20[local17 + arg5] & 0x3;
		if (local57 > 1) {
			local114 = local57 == 2 ? local44 - local9 : -local44 - local9;
		} else {
			local114 = local57 == 0 ? local9 + local44 : -local44 + local9;
		}
		@Pc(243) int local243 = local75 + ((local114 - local75) * local144 >> 12);
		return (arg4 * (local243 - local155) >> 12) + local155;
	}
}
