import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class58 {

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "Lclient!cl;")
	public Class45 aClass45_1;

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "[I")
	public int[] anIntArray65;

	@OriginalMember(owner = "client!dn", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
	public int anInt1435;

	@OriginalMember(owner = "client!dn", name = "t", descriptor = "[I")
	public int[] anIntArray66;

	@OriginalMember(owner = "client!dn", name = "x", descriptor = "[Z")
	public boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!dn", name = "B", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
	public int anInt1430 = -1;

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
	public int anInt1427 = -1;

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
	public int anInt1436 = 2;

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
	public int anInt1428 = -1;

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "Z")
	public boolean aBoolean123 = false;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
	public int anInt1429 = 99;

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "Z")
	public boolean aBoolean122 = false;

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
	public int anInt1437 = -1;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "Z")
	public boolean aBoolean121 = false;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
	public int anInt1426 = 5;

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
	public int anInt1434 = -1;

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "Z")
	public boolean aBoolean124 = false;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
	public void method1131() {
		if (this.anInt1430 == -1) {
			if (this.aBooleanArray6 == null) {
				this.anInt1430 = 0;
			} else {
				this.anInt1430 = 2;
			}
		}
		if (this.anInt1437 != -1) {
			return;
		}
		if (this.aBooleanArray6 == null) {
			this.anInt1437 = 0;
		} else {
			this.anInt1437 = 2;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BLclient!ti;)V")
	public void method1132(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4548();
			if (local13 == 0) {
				return;
			}
			this.method1135(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIZI)I")
	public int method1133(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray65[arg2];
		@Pc(14) Class1_Sub1_Sub16 local14 = null;
		@Pc(29) Class1_Sub1_Sub16 local29 = this.aClass45_1.method689(local12 >> 16);
		@Pc(33) int local33 = local12 & 0xFFFF;
		if (local29 == null) {
			return 0;
		}
		if ((this.aBoolean124 || Static147.aBoolean259) && arg0 != -1 && arg0 < this.anIntArray65.length) {
			local7 = this.anIntArray65[arg0];
			local14 = this.aClass45_1.method689(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean121) {
			local5 = 512;
		}
		if (local29.method5532(local33)) {
			local5 |= 0x80;
		}
		if (local29.method5530(local33)) {
			local5 |= 0x100;
		}
		if (local29.method5531(local33)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method5532(local7)) {
				local5 |= 0x80;
			}
			if (local14.method5530(local7)) {
				local5 |= 0x100;
			}
			if (local14.method5531(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray67 != null && arg1) {
			@Pc(149) int local149;
			@Pc(162) Class1_Sub1_Sub16 local162;
			if (this.anIntArray67.length > arg2) {
				local149 = this.anIntArray67[arg2];
				if (local149 != 65535) {
					local162 = this.aClass45_1.method689(local149 >> 16);
					local149 &= 0xFFFF;
					if (local162 != null) {
						if (local162.method5532(local149)) {
							local5 |= 0x80;
						}
						if (local162.method5530(local149)) {
							local5 |= 0x100;
						}
						if (local162.method5531(local149)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean124 || Static147.aBoolean259) && arg0 != -1 && arg0 < this.anIntArray67.length) {
				local149 = this.anIntArray67[arg0];
				if (local149 != 65535) {
					local162 = this.aClass45_1.method689(local149 >> 16);
					local149 &= 0xFFFF;
					if (local162 != null) {
						if (local162.method5532(local149)) {
							local5 |= 0x80;
						}
						if (local162.method5530(local149)) {
							local5 |= 0x100;
						}
						if (local162.method5531(local149)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIBILclient!c;I)Lclient!c;")
	public Class37 method1134(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray66[arg0];
		@Pc(13) int local13 = this.anIntArray65[arg0];
		@Pc(21) Class1_Sub1_Sub16 local21 = this.aClass45_1.method689(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg5.method4155(arg3, arg1, true);
		}
		@Pc(35) Class1_Sub1_Sub16 local35 = null;
		if ((this.aBoolean124 || Static147.aBoolean259) && arg4 != -1 && arg4 < this.anIntArray65.length) {
			@Pc(58) int local58 = this.anIntArray65[arg4];
			local35 = this.aClass45_1.method689(local58 >> 16);
			arg4 = local58 & 0xFFFF;
		}
		if (this.aBoolean121) {
			arg1 |= 0x200;
		}
		if (local21.method5532(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method5530(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method5531(local25)) {
			arg1 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method5532(arg4)) {
				arg1 |= 0x80;
			}
			if (local35.method5530(arg4)) {
				arg1 |= 0x100;
			}
			if (local35.method5531(arg4)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(150) Class37 local150 = arg5.method4155(arg3, arg1, true);
		local150.method4160(arg6 - 1, this.aBoolean121, local21, local25, local8, local35, arg4, arg2);
		return local150;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!ti;B)V")
	private void method1135(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		@Pc(6) int local6;
		@Pc(12) int local12;
		@Pc(34) int local34;
		@Pc(52) int local52;
		if (arg0 == 1) {
			local6 = arg1.method4498();
			this.anIntArray66 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray66[local12] = arg1.method4498();
			}
			this.anIntArray65 = new int[local6];
			for (local34 = 0; local34 < local6; local34++) {
				this.anIntArray65[local34] = arg1.method4498();
			}
			for (local52 = 0; local52 < local6; local52++) {
				this.anIntArray65[local52] = (arg1.method4498() << 16) + this.anIntArray65[local52];
			}
		} else if (arg0 == 2) {
			this.anInt1434 = arg1.method4498();
		} else if (arg0 == 3) {
			this.aBooleanArray6 = new boolean[256];
			local6 = arg1.method4548();
			for (local12 = 0; local12 < local6; local12++) {
				this.aBooleanArray6[arg1.method4548()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean123 = true;
		} else if (arg0 == 5) {
			this.anInt1426 = arg1.method4548();
		} else if (arg0 == 6) {
			this.anInt1427 = arg1.method4498();
		} else if (arg0 == 7) {
			this.anInt1428 = arg1.method4498();
		} else if (arg0 == 8) {
			this.anInt1429 = arg1.method4548();
		} else if (arg0 == 9) {
			this.anInt1437 = arg1.method4548();
		} else if (arg0 == 10) {
			this.anInt1430 = arg1.method4548();
		} else if (arg0 == 11) {
			this.anInt1436 = arg1.method4548();
		} else if (arg0 == 12) {
			local6 = arg1.method4548();
			this.anIntArray67 = new int[local6];
			for (local12 = 0; local12 < local6; local12++) {
				this.anIntArray67[local12] = arg1.method4498();
			}
			for (local34 = 0; local34 < local6; local34++) {
				this.anIntArray67[local34] = (arg1.method4498() << 16) + this.anIntArray67[local34];
			}
		} else if (arg0 == 13) {
			local6 = arg1.method4498();
			this.anIntArrayArray5 = new int[local6][];
			for (local12 = 0; local12 < local6; local12++) {
				local34 = arg1.method4548();
				if (local34 > 0) {
					this.anIntArrayArray5[local12] = new int[local34];
					this.anIntArrayArray5[local12][0] = arg1.method4496();
					for (local52 = 1; local52 < local34; local52++) {
						this.anIntArrayArray5[local12][local52] = arg1.method4498();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean121 = true;
		} else if (arg0 == 15) {
			this.aBoolean124 = true;
		} else if (arg0 == 16) {
			this.aBoolean122 = true;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIILclient!c;B)Lclient!c;")
	public Class37 method1137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class37 arg4) {
		@Pc(8) int local8 = this.anIntArray66[arg1];
		@Pc(13) int local13 = this.anIntArray65[arg1];
		@Pc(21) Class1_Sub1_Sub16 local21 = this.aClass45_1.method689(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method4155((byte) 1, arg3, true);
		}
		@Pc(35) Class1_Sub1_Sub16 local35 = null;
		if ((this.aBoolean124 || Static147.aBoolean259) && arg2 != -1 && arg2 < this.anIntArray65.length) {
			@Pc(59) int local59 = this.anIntArray65[arg2];
			local35 = this.aClass45_1.method689(local59 >> 16);
			arg2 = local59 & 0xFFFF;
		}
		@Pc(73) Class1_Sub1_Sub16 local73 = null;
		@Pc(75) Class1_Sub1_Sub16 local75 = null;
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		if (this.anIntArray67 != null) {
			if (arg1 < this.anIntArray67.length) {
				local77 = this.anIntArray67[arg1];
				if (local77 != 65535) {
					local73 = this.aClass45_1.method689(local77 >> 16);
					local77 &= 0xFFFF;
				}
			}
			if ((this.aBoolean124 || Static147.aBoolean259) && arg2 != -1 && this.anIntArray67.length > arg2) {
				local79 = this.anIntArray67[arg2];
				if (local79 != 65535) {
					local75 = this.aClass45_1.method689(local79 >> 16);
					local79 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean121) {
			arg3 |= 0x200;
		}
		if (local21.method5532(local25)) {
			arg3 |= 0x80;
		}
		if (local21.method5530(local25)) {
			arg3 |= 0x100;
		}
		if (local21.method5531(local25)) {
			arg3 |= 0x400;
		}
		if (local73 != null) {
			if (local73.method5532(local77)) {
				arg3 |= 0x80;
			}
			if (local73.method5530(local77)) {
				arg3 |= 0x100;
			}
			if (local73.method5531(local77)) {
				arg3 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method5532(arg2)) {
				arg3 |= 0x80;
			}
			if (local35.method5530(arg2)) {
				arg3 |= 0x100;
			}
			if (local35.method5531(arg2)) {
				arg3 |= 0x400;
			}
		}
		if (local75 != null) {
			if (local75.method5532(local79)) {
				arg3 |= 0x80;
			}
			if (local75.method5530(local79)) {
				arg3 |= 0x100;
			}
			if (local75.method5531(local79)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(280) Class37 local280 = arg4.method4155((byte) 1, arg3, true);
		local280.method4160(arg0 - 1, this.aBoolean121, local21, local25, local8, local35, arg2, 0);
		if (local73 != null) {
			local280.method4160(arg0 - 1, this.aBoolean121, local73, local77, local8, local75, local79, 0);
		}
		return local280;
	}
}
