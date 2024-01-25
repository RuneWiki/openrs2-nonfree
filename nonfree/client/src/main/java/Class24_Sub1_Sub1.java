import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class24_Sub1_Sub1 extends Class24_Sub1 {

	@OriginalMember(owner = "client!et", name = "pc", descriptor = "Lclient!bd;")
	private Class28 aClass28_1;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!fv;Lclient!hn;IIII)V")
	public Class24_Sub1_Sub1(@OriginalArg(0) Class90_Sub2 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!fv;)V")
	public Class24_Sub1_Sub1(@OriginalArg(0) Class90_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IZZ)V")
	private void method2266(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (super.anIntArray676[arg0] == -2) {
			return;
		}
		@Pc(11) short local11 = super.aShortArray159[arg0];
		@Pc(16) short local16 = super.aShortArray157[arg0];
		@Pc(21) short local21 = super.aShortArray158[arg0];
		@Pc(26) int local26 = super.anIntArray665[local11];
		@Pc(31) int local31 = super.anIntArray665[local16];
		@Pc(36) int local36 = super.anIntArray665[local21];
		@Pc(52) int local52;
		if (arg1 && (local26 == -5000 || local31 == -5000 || local36 == -5000)) {
			local52 = super.anIntArray673[local11];
			@Pc(57) int local57 = super.anIntArray673[local16];
			@Pc(62) int local62 = super.anIntArray673[local21];
			@Pc(67) int local67 = super.anIntArray684[local11];
			@Pc(72) int local72 = super.anIntArray684[local16];
			@Pc(77) int local77 = super.anIntArray684[local21];
			@Pc(82) int local82 = super.anIntArray668[local11];
			@Pc(87) int local87 = super.anIntArray668[local16];
			@Pc(92) int local92 = super.anIntArray668[local21];
			@Pc(96) int local96 = local52 - local57;
			@Pc(100) int local100 = local62 - local57;
			@Pc(104) int local104 = local67 - local72;
			@Pc(108) int local108 = local77 - local72;
			@Pc(112) int local112 = local82 - local87;
			@Pc(116) int local116 = local92 - local87;
			@Pc(124) int local124 = local104 * local116 - local112 * local108;
			@Pc(132) int local132 = local112 * local100 - local96 * local116;
			@Pc(140) int local140 = local96 * local108 - local104 * local100;
			if (local57 * local124 + local72 * local132 + local87 * local140 > 0) {
				this.method2267(arg0);
				return;
			}
		} else if (super.anIntArray666[arg0] != -1 || (local26 - local31) * (super.anIntArray686[local21] - super.anIntArray686[local16]) - (super.anIntArray686[local11] - super.anIntArray686[local16]) * (local36 - local31) > 0) {
			if (local26 >= 0 && local31 >= 0 && local36 >= 0 && local26 <= super.aClass38_6.anInt7481 && local31 <= super.aClass38_6.anInt7481 && local36 <= super.aClass38_6.anInt7481) {
				super.aBooleanArray31[arg0] = false;
			} else {
				super.aBooleanArray31[arg0] = true;
			}
			if (arg2) {
				local52 = super.anIntArray666[arg0];
				if (local52 == -1 || !super.aClass2Array3[local52].aBoolean3) {
					this.method2269(arg0);
				}
				return;
			}
			local52 = super.anIntArray666[arg0];
			if (local52 != -1) {
				@Pc(255) Class2 local255 = super.aClass2Array3[local52];
				@Pc(260) Class125 local260 = super.aClass125Array3[local52];
				if (!local255.aBoolean3) {
					this.method2268(arg0);
				}
				super.aClass90_Sub2_16.method6766(local260.anInt3765, local260.anInt3762, local260.anInt3758, local260.anInt3759, local260.anInt3755, local260.anInt3764, local255.aShort1 & 0xFFFF, local260.anInt3761, local255.aByte2, local255.aByte1);
				return;
			}
			this.method2268(arg0);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class24 method7398(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.method7414(Thread.currentThread());
		@Pc(11) Class24_Sub1 local11;
		@Pc(8) Class24_Sub1 local8;
		if (arg0 == 1) {
			local8 = super.aClass24_Sub1_58;
			local11 = super.aClass24_Sub1_51;
		} else if (arg0 == 2) {
			local8 = super.aClass24_Sub1_59;
			local11 = super.aClass24_Sub1_54;
		} else if (arg0 == 3) {
			local8 = super.aClass24_Sub1_57;
			local11 = super.aClass24_Sub1_55;
		} else if (arg0 == 4) {
			local8 = super.aClass24_Sub1_52;
			local11 = super.aClass24_Sub1_53;
		} else if (arg0 == 5) {
			local8 = super.aClass24_Sub1_56;
			local11 = super.aClass24_Sub1_60;
		} else {
			local11 = local8 = new Class24_Sub1_Sub1(super.aClass90_Sub2_16);
		}
		return this.method7409(local11, local8, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V")
	private void method2267(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass90_Sub2_16.anInt8496;
		@Pc(10) short local10 = super.aShortArray159[arg0];
		@Pc(15) short local15 = super.aShortArray157[arg0];
		@Pc(20) short local20 = super.aShortArray158[arg0];
		@Pc(25) int local25 = super.anIntArray668[local10];
		@Pc(30) int local30 = super.anIntArray668[local15];
		@Pc(35) int local35 = super.anIntArray668[local20];
		if (super.aByteArray111 == null) {
			this.aClass28_1.anInt648 = 0;
		} else {
			this.aClass28_1.anInt648 = super.aByteArray111[arg0] & 0xFF;
		}
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(108) int local108;
		@Pc(121) int local121;
		if (local25 >= local5) {
			super.anIntArray685[0] = super.anIntArray665[local10];
			super.anIntArray681[0] = super.anIntArray686[local10];
			super.anIntArray672[0] = super.anIntArray661[local10];
			local1++;
			super.anIntArray675[0] = super.anIntArray664[arg0] & 0xFFFF;
		} else {
			local96 = super.anIntArray673[local10];
			local101 = super.anIntArray684[local10];
			local108 = super.anIntArray664[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local121 = (local5 - local25) * Class24_Sub1.anIntArray693[local35 - local25];
				super.anIntArray685[0] = super.aClass38_6.anInt7480 + (local96 + ((super.anIntArray673[local20] - local96) * local121 >> 16)) * super.aClass90_Sub2_16.anInt8507 / local5;
				super.anIntArray681[0] = super.aClass38_6.anInt7479 + (local101 + ((super.anIntArray684[local20] - local101) * local121 >> 16)) * super.aClass90_Sub2_16.anInt8503 / local5;
				super.anIntArray672[0] = local5;
				local1++;
				super.anIntArray675[0] = local108 + (((super.anIntArray676[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
			if (local30 >= local5) {
				local121 = (local5 - local25) * Class24_Sub1.anIntArray693[local30 - local25];
				super.anIntArray685[local1] = super.aClass38_6.anInt7480 + (local96 + ((super.anIntArray673[local15] - local96) * local121 >> 16)) * super.aClass90_Sub2_16.anInt8507 / local5;
				super.anIntArray681[local1] = super.aClass38_6.anInt7479 + (local101 + ((super.anIntArray684[local15] - local101) * local121 >> 16)) * super.aClass90_Sub2_16.anInt8503 / local5;
				super.anIntArray672[local1] = local5;
				super.anIntArray675[local1++] = local108 + (((super.anIntArray670[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
		}
		if (local30 >= local5) {
			super.anIntArray685[local1] = super.anIntArray665[local15];
			super.anIntArray681[local1] = super.anIntArray686[local15];
			super.anIntArray672[local1] = super.anIntArray661[local15];
			super.anIntArray675[local1++] = super.anIntArray670[arg0] & 0xFFFF;
		} else {
			local96 = super.anIntArray673[local15];
			local101 = super.anIntArray684[local15];
			local108 = super.anIntArray670[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local121 = (local5 - local30) * Class24_Sub1.anIntArray693[local25 - local30];
				super.anIntArray685[local1] = super.aClass38_6.anInt7480 + (local96 + ((super.anIntArray673[local10] - local96) * local121 >> 16)) * super.aClass90_Sub2_16.anInt8507 / local5;
				super.anIntArray681[local1] = super.aClass38_6.anInt7479 + (local101 + ((super.anIntArray684[local10] - local101) * local121 >> 16)) * super.aClass90_Sub2_16.anInt8503 / local5;
				super.anIntArray672[local1] = local5;
				super.anIntArray675[local1++] = local108 + (((super.anIntArray664[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
			if (local35 >= local5) {
				local121 = (local5 - local30) * Class24_Sub1.anIntArray693[local35 - local30];
				super.anIntArray685[local1] = super.aClass38_6.anInt7480 + (local96 + ((super.anIntArray673[local20] - local96) * local121 >> 16)) * super.aClass90_Sub2_16.anInt8507 / local5;
				super.anIntArray681[local1] = super.aClass38_6.anInt7479 + (local101 + ((super.anIntArray684[local20] - local101) * local121 >> 16)) * super.aClass90_Sub2_16.anInt8503 / local5;
				super.anIntArray672[local1] = local5;
				super.anIntArray675[local1++] = local108 + (((super.anIntArray676[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
		}
		if (local35 >= local5) {
			super.anIntArray685[local1] = super.anIntArray665[local20];
			super.anIntArray681[local1] = super.anIntArray686[local20];
			super.anIntArray672[local1] = super.anIntArray661[local20];
			super.anIntArray675[local1++] = super.anIntArray676[arg0] & 0xFFFF;
		} else {
			local96 = super.anIntArray673[local20];
			local101 = super.anIntArray684[local20];
			local108 = super.anIntArray676[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local121 = (local5 - local35) * Class24_Sub1.anIntArray693[local30 - local35];
				super.anIntArray685[local1] = super.aClass38_6.anInt7480 + (local96 + ((super.anIntArray673[local15] - local96) * local121 >> 16)) * super.aClass90_Sub2_16.anInt8507 / local5;
				super.anIntArray681[local1] = super.aClass38_6.anInt7479 + (local101 + ((super.anIntArray684[local15] - local101) * local121 >> 16)) * super.aClass90_Sub2_16.anInt8503 / local5;
				super.anIntArray672[local1] = local5;
				super.anIntArray675[local1++] = local108 + (((super.anIntArray670[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
			if (local25 >= local5) {
				local121 = (local5 - local35) * Class24_Sub1.anIntArray693[local25 - local35];
				super.anIntArray685[local1] = super.aClass38_6.anInt7480 + (local96 + ((super.anIntArray673[local10] - local96) * local121 >> 16)) * super.aClass90_Sub2_16.anInt8507 / local5;
				super.anIntArray681[local1] = super.aClass38_6.anInt7479 + (local101 + ((super.anIntArray684[local10] - local101) * local121 >> 16)) * super.aClass90_Sub2_16.anInt8503 / local5;
				super.anIntArray672[local1] = local5;
				super.anIntArray675[local1++] = local108 + (((super.anIntArray664[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
		}
		local96 = super.anIntArray685[0];
		local101 = super.anIntArray685[1];
		local108 = super.anIntArray685[2];
		local121 = super.anIntArray681[0];
		@Pc(779) int local779 = super.anIntArray681[1];
		@Pc(784) int local784 = super.anIntArray681[2];
		local25 = super.anIntArray672[0];
		local30 = super.anIntArray672[1];
		local35 = super.anIntArray672[2];
		this.aClass28_1.aBoolean38 = false;
		@Pc(913) int local913;
		@Pc(918) int local918;
		@Pc(923) int local923;
		@Pc(908) int local908;
		if (local1 == 3) {
			if (local96 < 0 || local101 < 0 || local108 < 0 || local96 > super.aClass38_6.anInt7481 || local101 > super.aClass38_6.anInt7481 || local108 > super.aClass38_6.anInt7481) {
				this.aClass28_1.aBoolean38 = true;
			}
			if (super.aShortArray161 != null && super.aShortArray161[arg0] != -1) {
				if (super.aByteArray110 == null || super.aByteArray110[arg0] == -1) {
					local913 = local10;
					local918 = local15;
					local923 = local20;
				} else {
					local908 = super.aByteArray110[arg0] & 0xFF;
					local913 = super.lb[local908];
					local918 = super.anIntArray667[local908];
					local923 = super.anIntArray688[local908];
				}
				if (super.anIntArray676[arg0] == -1) {
					this.aClass28_1.method560(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray673[local913], super.anIntArray673[local918], super.anIntArray673[local923], super.anIntArray684[local913], super.anIntArray684[local918], super.anIntArray684[local923], super.anIntArray668[local913], super.anIntArray668[local918], super.anIntArray668[local923], super.aShortArray161[arg0]);
				} else {
					this.aClass28_1.method560(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray675[0], super.anIntArray675[1], super.anIntArray675[2], super.anIntArray673[local913], super.anIntArray673[local918], super.anIntArray673[local923], super.anIntArray684[local913], super.anIntArray684[local918], super.anIntArray684[local923], super.anIntArray668[local913], super.anIntArray668[local918], super.anIntArray668[local923], super.aShortArray161[arg0]);
				}
			} else if (super.anIntArray676[arg0] == -1) {
				this.aClass28_1.method548(local121, local779, local784, local96, local101, local108, local25, local30, local35, Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]);
			} else {
				this.aClass28_1.method559(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray675[0], super.anIntArray675[1], super.anIntArray675[2]);
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local96 < 0 || local101 < 0 || local108 < 0 || local96 > super.aClass38_6.anInt7481 || local101 > super.aClass38_6.anInt7481 || local108 > super.aClass38_6.anInt7481 || super.anIntArray685[3] < 0 || super.anIntArray685[3] > super.aClass38_6.anInt7481) {
			this.aClass28_1.aBoolean38 = true;
		}
		if (super.aShortArray161 == null || super.aShortArray161[arg0] == -1) {
			if (super.anIntArray676[arg0] == -1) {
				local913 = Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF];
				this.aClass28_1.method548(local121, local779, local784, local96, local101, local108, local25, local30, local35, local913);
				this.aClass28_1.method548(local121, local784, super.anIntArray681[3], local96, local108, super.anIntArray685[3], local25, local30, super.anIntArray672[3], local913);
				return;
			}
			this.aClass28_1.method559(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray675[0], super.anIntArray675[1], super.anIntArray675[2]);
			this.aClass28_1.method559(local121, local784, super.anIntArray681[3], local96, local108, super.anIntArray685[3], local25, local30, super.anIntArray672[3], super.anIntArray675[0], super.anIntArray675[2], super.anIntArray675[3]);
			return;
		}
		if (super.aByteArray110 == null || super.aByteArray110[arg0] == -1) {
			local913 = local10;
			local918 = local15;
			local923 = local20;
		} else {
			local908 = super.aByteArray110[arg0] & 0xFF;
			local913 = super.lb[local908];
			local918 = super.anIntArray667[local908];
			local923 = super.anIntArray688[local908];
		}
		@Pc(1267) short local1267 = super.aShortArray161[arg0];
		if (super.anIntArray676[arg0] == -1) {
			this.aClass28_1.method560(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray673[local913], super.anIntArray673[local918], super.anIntArray673[local923], super.anIntArray684[local913], super.anIntArray684[local918], super.anIntArray684[local923], super.anIntArray668[local913], super.anIntArray668[local918], super.anIntArray668[local923], local1267);
			this.aClass28_1.method560(local121, local784, super.anIntArray681[3], local96, local108, super.anIntArray685[3], local25, local30, super.anIntArray672[3], super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray673[local913], super.anIntArray673[local918], super.anIntArray673[local923], super.anIntArray684[local913], super.anIntArray684[local918], super.anIntArray684[local923], super.anIntArray668[local913], super.anIntArray668[local918], super.anIntArray668[local923], local1267);
			return;
		}
		this.aClass28_1.method560(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray675[0], super.anIntArray675[1], super.anIntArray675[2], super.anIntArray673[local913], super.anIntArray673[local918], super.anIntArray673[local923], super.anIntArray684[local913], super.anIntArray684[local918], super.anIntArray684[local923], super.anIntArray668[local913], super.anIntArray668[local918], super.anIntArray668[local923], local1267);
		this.aClass28_1.method560(local121, local784, super.anIntArray681[3], local96, local108, super.anIntArray685[3], local25, local30, super.anIntArray672[3], super.anIntArray675[0], super.anIntArray675[2], super.anIntArray675[3], super.anIntArray673[local913], super.anIntArray673[local918], super.anIntArray673[local923], super.anIntArray684[local913], super.anIntArray684[local918], super.anIntArray684[local923], super.anIntArray668[local913], super.anIntArray668[local918], super.anIntArray668[local923], local1267);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ZZIIZI)V")
	@Override
	protected void method7422(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(4) int local4;
		if (super.aClass2Array3 != null) {
			local4 = 0;
			while (local4 < super.anInt9347) {
				@Pc(10) Class2 local10 = super.aClass2Array3[local4];
				super.anIntArray666[local10.anInt41] = local4++;
			}
		}
		for (local4 = 0; local4 < super.anInt9349; local4++) {
			if (super.aByteArray111 == null || super.aByteArray111[local4] == 0) {
				this.method2266(local4, arg0, arg1);
			}
		}
		@Pc(50) int local50;
		if (super.aBoolean622) {
			if (super.aByteArray112 == null) {
				for (local50 = 0; local50 < super.anInt9349; local50++) {
					if (super.aByteArray111 == null || super.aByteArray111[local50] != 0) {
						this.method2266(local50, arg0, arg1);
					}
				}
			} else {
				for (local50 = 0; local50 < 12; local50++) {
					for (@Pc(75) int local75 = 0; local75 < super.anInt9349; local75++) {
						if ((super.aByteArray111 == null || super.aByteArray111[local75] != 0) && super.aByteArray112[local75] == local50) {
							this.method2266(local75, arg0, arg1);
						}
					}
				}
			}
		}
		if (!arg4) {
			return;
		}
		for (local50 = 0; local50 < arg5; local50++) {
			@Pc(114) Class60_Sub1_Sub1 local114 = super.aClass60_Sub1_Sub1Array6[local50];
			@Pc(119) int local119 = super.anIntArray674[local50];
			if (local119 == 0) {
				local119 = 1;
			}
			super.aClass90_Sub2_16.method6754(local114, super.anIntArray682[local50], super.anIntArray690[local50], local119, (local114.anInt2707 * super.aClass90_Sub2_16.anInt8507 >> 12) / local119);
		}
	}

	@OriginalMember(owner = "client!et", name = "j", descriptor = "()V")
	@Override
	protected void method7412() {
		this.aClass28_1 = null;
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(I)V")
	private void method2268(@OriginalArg(0) int arg0) {
		@Pc(4) short local4 = super.aShortArray159[arg0];
		@Pc(9) short local9 = super.aShortArray157[arg0];
		@Pc(14) short local14 = super.aShortArray158[arg0];
		this.aClass28_1.aBoolean38 = super.aBooleanArray31[arg0];
		if (super.aByteArray111 == null) {
			this.aClass28_1.anInt648 = 0;
		} else {
			this.aClass28_1.anInt648 = super.aByteArray111[arg0] & 0xFF;
		}
		if (super.aShortArray161 != null && super.aShortArray161[arg0] != -1) {
			@Pc(180) int local180;
			@Pc(185) int local185;
			@Pc(190) int local190;
			if (super.aByteArray110 == null || super.aByteArray110[arg0] == -1) {
				local180 = local4;
				local185 = local9;
				local190 = local14;
			} else {
				@Pc(175) int local175 = super.aByteArray110[arg0] & 0xFF;
				local180 = super.lb[local175];
				local185 = super.anIntArray667[local175];
				local190 = super.anIntArray688[local175];
			}
			if (super.anIntArray676[arg0] == -1) {
				this.aClass28_1.method560(super.anIntArray686[local4], super.anIntArray686[local9], super.anIntArray686[local14], super.anIntArray665[local4], super.anIntArray665[local9], super.anIntArray665[local14], super.anIntArray661[local4], super.anIntArray661[local9], super.anIntArray661[local14], super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray673[local180], super.anIntArray673[local185], super.anIntArray673[local190], super.anIntArray684[local180], super.anIntArray684[local185], super.anIntArray684[local190], super.anIntArray668[local180], super.anIntArray668[local185], super.anIntArray668[local190], super.aShortArray161[arg0]);
			} else {
				this.aClass28_1.method560(super.anIntArray686[local4], super.anIntArray686[local9], super.anIntArray686[local14], super.anIntArray665[local4], super.anIntArray665[local9], super.anIntArray665[local14], super.anIntArray661[local4], super.anIntArray661[local9], super.anIntArray661[local14], super.anIntArray664[arg0], super.anIntArray670[arg0], super.anIntArray676[arg0], super.anIntArray673[local180], super.anIntArray673[local185], super.anIntArray673[local190], super.anIntArray684[local180], super.anIntArray684[local185], super.anIntArray684[local190], super.anIntArray668[local180], super.anIntArray668[local185], super.anIntArray668[local190], super.aShortArray161[arg0]);
			}
		} else if (super.anIntArray676[arg0] == -1) {
			this.aClass28_1.method548(super.anIntArray686[local4], super.anIntArray686[local9], super.anIntArray686[local14], super.anIntArray665[local4], super.anIntArray665[local9], super.anIntArray665[local14], super.anIntArray661[local4], super.anIntArray661[local9], super.anIntArray661[local14], Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]);
		} else {
			this.aClass28_1.method559(super.anIntArray686[local4], super.anIntArray686[local9], super.anIntArray686[local14], super.anIntArray665[local4], super.anIntArray665[local9], super.anIntArray665[local14], super.anIntArray661[local4], super.anIntArray661[local9], super.anIntArray661[local14], super.anIntArray664[arg0] & 0xFFFF, super.anIntArray670[arg0] & 0xFFFF, super.anIntArray676[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(I)V")
	private void method2269(@OriginalArg(0) int arg0) {
		@Pc(8) short local8;
		@Pc(13) short local13;
		@Pc(18) short local18;
		@Pc(27) int local27;
		@Pc(46) int local46;
		@Pc(65) int local65;
		@Pc(81) int local81;
		@Pc(333) int local333;
		@Pc(338) int local338;
		@Pc(343) int local343;
		if (!super.aClass90_Sub2_16.aBoolean551) {
			local8 = super.aShortArray159[arg0];
			local13 = super.aShortArray157[arg0];
			local18 = super.aShortArray158[arg0];
			local27 = super.anIntArray661[local8] - super.aClass90_Sub2_16.anInt8505;
			if (local27 > 255) {
				local27 = 255;
			} else if (local27 < 0) {
				local27 = 0;
			}
			local46 = super.anIntArray661[local13] - super.aClass90_Sub2_16.anInt8505;
			if (local46 > 255) {
				local46 = 255;
			} else if (local46 < 0) {
				local46 = 0;
			}
			local65 = super.anIntArray661[local18] - super.aClass90_Sub2_16.anInt8505;
			if (local65 > 255) {
				local65 = 255;
			} else if (local65 < 0) {
				local65 = 0;
			}
			local81 = local27 + local46 + local65;
			if (local81 != 765) {
				if (local81 == 0) {
					this.method2268(arg0);
				} else {
					if (super.aByteArray111 == null) {
						this.aClass28_1.anInt648 = 0;
					} else {
						this.aClass28_1.anInt648 = super.aByteArray111[arg0] & 0xFF;
					}
					this.aClass28_1.aBoolean38 = super.aBooleanArray31[arg0];
					if (super.aShortArray161 != null && super.aShortArray161[arg0] != -1) {
						if (super.aByteArray110 == null || super.aByteArray110[arg0] == -1) {
							local333 = local8;
							local338 = local13;
							local343 = local18;
						} else {
							@Pc(328) int local328 = super.aByteArray110[arg0] & 0xFF;
							local333 = super.lb[local328];
							local338 = super.anIntArray667[local328];
							local343 = super.anIntArray688[local328];
						}
						if (super.anIntArray676[arg0] == -1) {
							this.aClass28_1.method563(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray665[local8], super.anIntArray665[local13], super.anIntArray665[local18], super.anIntArray661[local8], super.anIntArray661[local13], super.anIntArray661[local18], super.aClass90_Sub2_16.anInt8499, local27, local46, local65, super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray673[local333], super.anIntArray673[local338], super.anIntArray673[local343], super.anIntArray684[local333], super.anIntArray684[local338], super.anIntArray684[local343], super.anIntArray668[local333], super.anIntArray668[local338], super.anIntArray668[local343], super.aShortArray161[arg0]);
						} else {
							this.aClass28_1.method563(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray665[local8], super.anIntArray665[local13], super.anIntArray665[local18], super.anIntArray661[local8], super.anIntArray661[local13], super.anIntArray661[local18], super.aClass90_Sub2_16.anInt8499, local27, local46, local65, super.anIntArray664[arg0], super.anIntArray670[arg0], super.anIntArray676[arg0], super.anIntArray673[local333], super.anIntArray673[local338], super.anIntArray673[local343], super.anIntArray684[local333], super.anIntArray684[local338], super.anIntArray684[local343], super.anIntArray668[local333], super.anIntArray668[local338], super.anIntArray668[local343], super.aShortArray161[arg0]);
						}
					} else if (super.anIntArray676[arg0] == -1) {
						this.aClass28_1.method554(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray665[local8], super.anIntArray665[local13], super.anIntArray665[local18], super.anIntArray661[local8], super.anIntArray661[local13], super.anIntArray661[local18], Static277.method4166(local27 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]), Static277.method4166(local46 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]), Static277.method4166(local65 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]));
					} else {
						this.aClass28_1.method554(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray665[local8], super.anIntArray665[local13], super.anIntArray665[local18], super.anIntArray661[local8], super.anIntArray661[local13], super.anIntArray661[local18], Static277.method4166(local27 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]), Static277.method4166(local46 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray670[arg0] & 0xFFFF]), Static277.method4166(local65 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray676[arg0] & 0xFFFF]));
					}
				}
			}
		} else if (!super.aBooleanArray32[arg0]) {
			local8 = super.aShortArray159[arg0];
			local13 = super.aShortArray157[arg0];
			local18 = super.aShortArray158[arg0];
			local27 = 0;
			local46 = 0;
			local65 = 0;
			if (super.anIntArray683[local8] > super.aClass90_Sub2_16.anInt8510) {
				local27 = 255;
			} else if (super.anIntArray683[local8] > super.aClass90_Sub2_16.anInt8498) {
				local27 = (super.aClass90_Sub2_16.anInt8498 - super.anIntArray683[local8]) * 255 / (super.aClass90_Sub2_16.anInt8498 - super.aClass90_Sub2_16.anInt8510);
			}
			if (super.anIntArray683[local13] > super.aClass90_Sub2_16.anInt8510) {
				local46 = 255;
			} else if (super.anIntArray683[local13] > super.aClass90_Sub2_16.anInt8498) {
				local46 = (super.aClass90_Sub2_16.anInt8498 - super.anIntArray683[local13]) * 255 / (super.aClass90_Sub2_16.anInt8498 - super.aClass90_Sub2_16.anInt8510);
			}
			if (super.anIntArray683[local18] > super.aClass90_Sub2_16.anInt8510) {
				local65 = 255;
			} else if (super.anIntArray683[local18] > super.aClass90_Sub2_16.anInt8498) {
				local65 = (super.aClass90_Sub2_16.anInt8498 - super.anIntArray683[local18]) * 255 / (super.aClass90_Sub2_16.anInt8498 - super.aClass90_Sub2_16.anInt8510);
			}
			if (super.aByteArray111 == null) {
				this.aClass28_1.anInt648 = 0;
			} else {
				this.aClass28_1.anInt648 = super.aByteArray111[arg0] & 0xFF;
			}
			this.aClass28_1.aBoolean38 = super.aBooleanArray31[arg0];
			if (super.aShortArray161 != null && super.aShortArray161[arg0] != -1) {
				if (super.aByteArray110 == null || super.aByteArray110[arg0] == -1) {
					local81 = local8;
					local333 = local13;
					local338 = local18;
				} else {
					local343 = super.aByteArray110[arg0] & 0xFF;
					local81 = super.lb[local343];
					local333 = super.anIntArray667[local343];
					local338 = super.anIntArray688[local343];
				}
				if (super.anIntArray676[arg0] == -1) {
					this.aClass28_1.method563(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray665[local8], super.anIntArray665[local13], super.anIntArray665[local18], super.anIntArray661[local8], super.anIntArray661[local13], super.anIntArray661[local18], super.aClass90_Sub2_16.anInt8499, local27, local46, local65, super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray664[arg0], super.anIntArray673[local81], super.anIntArray673[local333], super.anIntArray673[local338], super.anIntArray684[local81], super.anIntArray684[local333], super.anIntArray684[local338], super.anIntArray668[local81], super.anIntArray668[local333], super.anIntArray668[local338], super.aShortArray161[arg0]);
				} else {
					this.aClass28_1.method563(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray665[local8], super.anIntArray665[local13], super.anIntArray665[local18], super.anIntArray661[local8], super.anIntArray661[local13], super.anIntArray661[local18], super.aClass90_Sub2_16.anInt8499, local27, local46, local65, super.anIntArray664[arg0], super.anIntArray670[arg0], super.anIntArray676[arg0], super.anIntArray673[local81], super.anIntArray673[local333], super.anIntArray673[local338], super.anIntArray684[local81], super.anIntArray684[local333], super.anIntArray684[local338], super.anIntArray668[local81], super.anIntArray668[local333], super.anIntArray668[local338], super.aShortArray161[arg0]);
				}
			} else if (super.anIntArray676[arg0] == -1) {
				this.aClass28_1.method554(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray665[local8], super.anIntArray665[local13], super.anIntArray665[local18], super.anIntArray661[local8], super.anIntArray661[local13], super.anIntArray661[local18], Static277.method4166(local27 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]), Static277.method4166(local46 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]), Static277.method4166(local65 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]));
			} else {
				this.aClass28_1.method554(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray665[local8], super.anIntArray665[local13], super.anIntArray665[local18], super.anIntArray661[local8], super.anIntArray661[local13], super.anIntArray661[local18], Static277.method4166(local27 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray664[arg0] & 0xFFFF]), Static277.method4166(local46 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray670[arg0] & 0xFFFF]), Static277.method4166(local65 << 24 | super.aClass90_Sub2_16.anInt8499, Static246.anIntArray653[super.anIntArray676[arg0] & 0xFFFF]));
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method7423(@OriginalArg(0) Thread arg0) {
		super.method7423(arg0);
		@Pc(8) Class38_Sub2 local8 = (Class38_Sub2) super.aClass90_Sub2_16.method6761(arg0);
		this.aClass28_1 = local8.aClass28_2;
	}

	@OriginalMember(owner = "client!et", name = "n", descriptor = "()V")
	@Override
	protected void method7417() {
		super.aClass38_6.anInt7481 = this.aClass28_1.anInt643;
		super.aClass38_6.anInt7480 = this.aClass28_1.anInt645;
		super.aClass38_6.anInt7479 = this.aClass28_1.anInt646;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
	@Override
	protected void method7403(@OriginalArg(0) int arg0) {
		this.aClass28_1.aBoolean41 = (arg0 & 0x1) == 0;
		this.aClass28_1.aBoolean42 = false;
	}
}
