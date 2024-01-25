import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class23_Sub3_Sub1 extends Class23_Sub3 {

	@OriginalMember(owner = "client!rv", name = "oc", descriptor = "Lclient!tn;")
	private Class303 aClass303_2;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!uq;Lclient!qda;IIII)V")
	public Class23_Sub3_Sub1(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!uq;)V")
	public Class23_Sub3_Sub1(@OriginalArg(0) Class9_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)V")
	private void method7008(@OriginalArg(0) int arg0) {
		@Pc(4) short local4 = super.aShortArray139[arg0];
		@Pc(9) short local9 = super.aShortArray138[arg0];
		@Pc(14) short local14 = super.aShortArray137[arg0];
		this.aClass303_2.aBoolean666 = super.aBooleanArray33[arg0];
		if (super.aByteArray109 == null) {
			this.aClass303_2.anInt8842 = 0;
		} else {
			this.aClass303_2.anInt8842 = super.aByteArray109[arg0] & 0xFF;
		}
		if (super.aShortArray135 != null && super.aShortArray135[arg0] != -1) {
			@Pc(180) int local180;
			@Pc(185) int local185;
			@Pc(190) int local190;
			if (super.aByteArray107 == null || super.aByteArray107[arg0] == -1) {
				local180 = local4;
				local185 = local9;
				local190 = local14;
			} else {
				@Pc(175) int local175 = super.aByteArray107[arg0] & 0xFF;
				local180 = super.anIntArray691[local175];
				local185 = super.anIntArray678[local175];
				local190 = super.anIntArray692[local175];
			}
			if (super.anIntArray695[arg0] == -1) {
				this.aClass303_2.method7422(super.anIntArray686[local4], super.anIntArray686[local9], super.anIntArray686[local14], super.anIntArray699[local4], super.anIntArray699[local9], super.anIntArray699[local14], super.anIntArray682[local4], super.anIntArray682[local9], super.anIntArray682[local14], super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray666[local180], super.anIntArray666[local185], super.anIntArray666[local190], super.anIntArray684[local180], super.anIntArray684[local185], super.anIntArray684[local190], super.anIntArray672[local180], super.anIntArray672[local185], super.anIntArray672[local190], super.aShortArray135[arg0]);
			} else {
				this.aClass303_2.method7422(super.anIntArray686[local4], super.anIntArray686[local9], super.anIntArray686[local14], super.anIntArray699[local4], super.anIntArray699[local9], super.anIntArray699[local14], super.anIntArray682[local4], super.anIntArray682[local9], super.anIntArray682[local14], super.anIntArray690[arg0], super.anIntArray685[arg0], super.anIntArray695[arg0], super.anIntArray666[local180], super.anIntArray666[local185], super.anIntArray666[local190], super.anIntArray684[local180], super.anIntArray684[local185], super.anIntArray684[local190], super.anIntArray672[local180], super.anIntArray672[local185], super.anIntArray672[local190], super.aShortArray135[arg0]);
			}
		} else if (super.anIntArray695[arg0] == -1) {
			this.aClass303_2.method7423(super.anIntArray686[local4], super.anIntArray686[local9], super.anIntArray686[local14], super.anIntArray699[local4], super.anIntArray699[local9], super.anIntArray699[local14], super.anIntArray682[local4], super.anIntArray682[local9], super.anIntArray682[local14], Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF]);
		} else {
			this.aClass303_2.method7419(super.anIntArray686[local4], super.anIntArray686[local9], super.anIntArray686[local14], super.anIntArray699[local4], super.anIntArray699[local9], super.anIntArray699[local14], super.anIntArray682[local4], super.anIntArray682[local9], super.anIntArray682[local14], super.anIntArray690[arg0] & 0xFFFF, super.anIntArray685[arg0] & 0xFFFF, super.anIntArray695[arg0] & 0xFFFF);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZZIIZI)V")
	@Override
	protected void method7088(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(4) int local4;
		if (super.aClass263Array3 != null) {
			local4 = 0;
			while (local4 < super.anInt8452) {
				@Pc(10) Class263 local10 = super.aClass263Array3[local4];
				super.anIntArray670[local10.anInt7782] = local4++;
			}
		}
		for (local4 = 0; local4 < super.anInt8453; local4++) {
			if (super.aByteArray109 == null || super.aByteArray109[local4] == 0) {
				this.method7009(local4, arg0, arg1);
			}
		}
		@Pc(50) int local50;
		if (super.aBoolean628) {
			if (super.aByteArray108 == null) {
				for (local50 = 0; local50 < super.anInt8453; local50++) {
					if (super.aByteArray109 == null || super.aByteArray109[local50] != 0) {
						this.method7009(local50, arg0, arg1);
					}
				}
			} else {
				for (local50 = 0; local50 < 12; local50++) {
					for (@Pc(75) int local75 = 0; local75 < super.anInt8453; local75++) {
						if ((super.aByteArray109 == null || super.aByteArray109[local75] != 0) && super.aByteArray108[local75] == local50) {
							this.method7009(local75, arg0, arg1);
						}
					}
				}
			}
		}
		if (!arg4) {
			return;
		}
		for (local50 = 0; local50 < arg5; local50++) {
			@Pc(114) Class5_Sub1_Sub1 local114 = super.aClass5_Sub1_Sub1Array5[local50];
			@Pc(119) int local119 = super.anIntArray676[local50];
			if (local119 == 0) {
				local119 = 1;
			}
			super.aClass9_Sub1_15.method1645(local114, super.lb[local50], super.anIntArray689[local50], local119, (local114.anInt6007 * super.aClass9_Sub1_15.anInt1817 >> 12) / local119);
		}
	}

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "()V")
	@Override
	protected void method7103() {
		this.aClass303_2 = null;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(Ljava/lang/Thread;)V")
	@Override
	protected void method7105(@OriginalArg(0) Thread arg0) {
		super.method7105(arg0);
		@Pc(8) Class179_Sub1 local8 = (Class179_Sub1) super.aClass9_Sub1_15.method1653(arg0);
		this.aClass303_2 = local8.aClass303_1;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
	@Override
	protected void method7090(@OriginalArg(0) int arg0) {
		this.aClass303_2.aBoolean670 = (arg0 & 0x1) == 0;
		this.aClass303_2.aBoolean668 = false;
	}

	@OriginalMember(owner = "client!rv", name = "i", descriptor = "()V")
	@Override
	protected void method7089() {
		super.aClass179_6.anInt8694 = this.aClass303_2.anInt8846;
		super.aClass179_6.anInt8695 = this.aClass303_2.anInt8841;
		super.aClass179_6.anInt8693 = this.aClass303_2.anInt8843;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZZ)V")
	private void method7009(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (super.anIntArray695[arg0] == -2) {
			return;
		}
		@Pc(11) short local11 = super.aShortArray139[arg0];
		@Pc(16) short local16 = super.aShortArray138[arg0];
		@Pc(21) short local21 = super.aShortArray137[arg0];
		@Pc(26) int local26 = super.anIntArray699[local11];
		@Pc(31) int local31 = super.anIntArray699[local16];
		@Pc(36) int local36 = super.anIntArray699[local21];
		@Pc(52) int local52;
		if (arg1 && (local26 == -5000 || local31 == -5000 || local36 == -5000)) {
			local52 = super.anIntArray666[local11];
			@Pc(57) int local57 = super.anIntArray666[local16];
			@Pc(62) int local62 = super.anIntArray666[local21];
			@Pc(67) int local67 = super.anIntArray684[local11];
			@Pc(72) int local72 = super.anIntArray684[local16];
			@Pc(77) int local77 = super.anIntArray684[local21];
			@Pc(82) int local82 = super.anIntArray672[local11];
			@Pc(87) int local87 = super.anIntArray672[local16];
			@Pc(92) int local92 = super.anIntArray672[local21];
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
				this.method7010(arg0);
				return;
			}
		} else if (super.anIntArray670[arg0] != -1 || (local26 - local31) * (super.anIntArray686[local21] - super.anIntArray686[local16]) - (super.anIntArray686[local11] - super.anIntArray686[local16]) * (local36 - local31) > 0) {
			if (local26 >= 0 && local31 >= 0 && local36 >= 0 && local26 <= super.aClass179_6.anInt8694 && local31 <= super.aClass179_6.anInt8694 && local36 <= super.aClass179_6.anInt8694) {
				super.aBooleanArray33[arg0] = false;
			} else {
				super.aBooleanArray33[arg0] = true;
			}
			if (arg2) {
				local52 = super.anIntArray670[arg0];
				if (local52 == -1 || !super.aClass263Array3[local52].aBoolean571) {
					this.method7011(arg0);
				}
				return;
			}
			local52 = super.anIntArray670[arg0];
			if (local52 != -1) {
				@Pc(255) Class263 local255 = super.aClass263Array3[local52];
				@Pc(260) Class329 local260 = super.aClass329Array3[local52];
				if (!local255.aBoolean571) {
					this.method7008(arg0);
				}
				super.aClass9_Sub1_15.method1648(local260.anInt9268, local260.anInt9271, local260.anInt9281, local260.anInt9272, local260.anInt9270, local260.anInt9280, local255.aShort82 & 0xFFFF, local260.anInt9276, local255.aByte93, local255.aByte94);
				return;
			}
			this.method7008(arg0);
		}
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)V")
	private void method7010(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5 = super.aClass9_Sub1_15.anInt1811;
		@Pc(10) short local10 = super.aShortArray139[arg0];
		@Pc(15) short local15 = super.aShortArray138[arg0];
		@Pc(20) short local20 = super.aShortArray137[arg0];
		@Pc(25) int local25 = super.anIntArray672[local10];
		@Pc(30) int local30 = super.anIntArray672[local15];
		@Pc(35) int local35 = super.anIntArray672[local20];
		if (super.aByteArray109 == null) {
			this.aClass303_2.anInt8842 = 0;
		} else {
			this.aClass303_2.anInt8842 = super.aByteArray109[arg0] & 0xFF;
		}
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(108) int local108;
		@Pc(121) int local121;
		if (local25 >= local5) {
			super.anIntArray675[0] = super.anIntArray699[local10];
			super.anIntArray696[0] = super.anIntArray686[local10];
			super.anIntArray674[0] = super.anIntArray682[local10];
			local1++;
			super.anIntArray667[0] = super.anIntArray690[arg0] & 0xFFFF;
		} else {
			local96 = super.anIntArray666[local10];
			local101 = super.anIntArray684[local10];
			local108 = super.anIntArray690[arg0] & 0xFFFF;
			if (local35 >= local5) {
				local121 = (local5 - local25) * Class23_Sub3.anIntArray701[local35 - local25];
				super.anIntArray675[0] = super.aClass179_6.anInt8695 + (local96 + ((super.anIntArray666[local20] - local96) * local121 >> 16)) * super.aClass9_Sub1_15.anInt1817 / local5;
				super.anIntArray696[0] = super.aClass179_6.anInt8693 + (local101 + ((super.anIntArray684[local20] - local101) * local121 >> 16)) * super.aClass9_Sub1_15.anInt1827 / local5;
				super.anIntArray674[0] = local5;
				local1++;
				super.anIntArray667[0] = local108 + (((super.anIntArray695[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
			if (local30 >= local5) {
				local121 = (local5 - local25) * Class23_Sub3.anIntArray701[local30 - local25];
				super.anIntArray675[local1] = super.aClass179_6.anInt8695 + (local96 + ((super.anIntArray666[local15] - local96) * local121 >> 16)) * super.aClass9_Sub1_15.anInt1817 / local5;
				super.anIntArray696[local1] = super.aClass179_6.anInt8693 + (local101 + ((super.anIntArray684[local15] - local101) * local121 >> 16)) * super.aClass9_Sub1_15.anInt1827 / local5;
				super.anIntArray674[local1] = local5;
				super.anIntArray667[local1++] = local108 + (((super.anIntArray685[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
		}
		if (local30 >= local5) {
			super.anIntArray675[local1] = super.anIntArray699[local15];
			super.anIntArray696[local1] = super.anIntArray686[local15];
			super.anIntArray674[local1] = super.anIntArray682[local15];
			super.anIntArray667[local1++] = super.anIntArray685[arg0] & 0xFFFF;
		} else {
			local96 = super.anIntArray666[local15];
			local101 = super.anIntArray684[local15];
			local108 = super.anIntArray685[arg0] & 0xFFFF;
			if (local25 >= local5) {
				local121 = (local5 - local30) * Class23_Sub3.anIntArray701[local25 - local30];
				super.anIntArray675[local1] = super.aClass179_6.anInt8695 + (local96 + ((super.anIntArray666[local10] - local96) * local121 >> 16)) * super.aClass9_Sub1_15.anInt1817 / local5;
				super.anIntArray696[local1] = super.aClass179_6.anInt8693 + (local101 + ((super.anIntArray684[local10] - local101) * local121 >> 16)) * super.aClass9_Sub1_15.anInt1827 / local5;
				super.anIntArray674[local1] = local5;
				super.anIntArray667[local1++] = local108 + (((super.anIntArray690[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
			if (local35 >= local5) {
				local121 = (local5 - local30) * Class23_Sub3.anIntArray701[local35 - local30];
				super.anIntArray675[local1] = super.aClass179_6.anInt8695 + (local96 + ((super.anIntArray666[local20] - local96) * local121 >> 16)) * super.aClass9_Sub1_15.anInt1817 / local5;
				super.anIntArray696[local1] = super.aClass179_6.anInt8693 + (local101 + ((super.anIntArray684[local20] - local101) * local121 >> 16)) * super.aClass9_Sub1_15.anInt1827 / local5;
				super.anIntArray674[local1] = local5;
				super.anIntArray667[local1++] = local108 + (((super.anIntArray695[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
		}
		if (local35 >= local5) {
			super.anIntArray675[local1] = super.anIntArray699[local20];
			super.anIntArray696[local1] = super.anIntArray686[local20];
			super.anIntArray674[local1] = super.anIntArray682[local20];
			super.anIntArray667[local1++] = super.anIntArray695[arg0] & 0xFFFF;
		} else {
			local96 = super.anIntArray666[local20];
			local101 = super.anIntArray684[local20];
			local108 = super.anIntArray695[arg0] & 0xFFFF;
			if (local30 >= local5) {
				local121 = (local5 - local35) * Class23_Sub3.anIntArray701[local30 - local35];
				super.anIntArray675[local1] = super.aClass179_6.anInt8695 + (local96 + ((super.anIntArray666[local15] - local96) * local121 >> 16)) * super.aClass9_Sub1_15.anInt1817 / local5;
				super.anIntArray696[local1] = super.aClass179_6.anInt8693 + (local101 + ((super.anIntArray684[local15] - local101) * local121 >> 16)) * super.aClass9_Sub1_15.anInt1827 / local5;
				super.anIntArray674[local1] = local5;
				super.anIntArray667[local1++] = local108 + (((super.anIntArray685[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
			if (local25 >= local5) {
				local121 = (local5 - local35) * Class23_Sub3.anIntArray701[local25 - local35];
				super.anIntArray675[local1] = super.aClass179_6.anInt8695 + (local96 + ((super.anIntArray666[local10] - local96) * local121 >> 16)) * super.aClass9_Sub1_15.anInt1817 / local5;
				super.anIntArray696[local1] = super.aClass179_6.anInt8693 + (local101 + ((super.anIntArray684[local10] - local101) * local121 >> 16)) * super.aClass9_Sub1_15.anInt1827 / local5;
				super.anIntArray674[local1] = local5;
				super.anIntArray667[local1++] = local108 + (((super.anIntArray690[arg0] & 0xFFFF) - local108) * local121 >> 16);
			}
		}
		local96 = super.anIntArray675[0];
		local101 = super.anIntArray675[1];
		local108 = super.anIntArray675[2];
		local121 = super.anIntArray696[0];
		@Pc(779) int local779 = super.anIntArray696[1];
		@Pc(784) int local784 = super.anIntArray696[2];
		local25 = super.anIntArray674[0];
		local30 = super.anIntArray674[1];
		local35 = super.anIntArray674[2];
		this.aClass303_2.aBoolean666 = false;
		@Pc(913) int local913;
		@Pc(918) int local918;
		@Pc(923) int local923;
		@Pc(908) int local908;
		if (local1 == 3) {
			if (local96 < 0 || local101 < 0 || local108 < 0 || local96 > super.aClass179_6.anInt8694 || local101 > super.aClass179_6.anInt8694 || local108 > super.aClass179_6.anInt8694) {
				this.aClass303_2.aBoolean666 = true;
			}
			if (super.aShortArray135 != null && super.aShortArray135[arg0] != -1) {
				if (super.aByteArray107 == null || super.aByteArray107[arg0] == -1) {
					local913 = local10;
					local918 = local15;
					local923 = local20;
				} else {
					local908 = super.aByteArray107[arg0] & 0xFF;
					local913 = super.anIntArray691[local908];
					local918 = super.anIntArray678[local908];
					local923 = super.anIntArray692[local908];
				}
				if (super.anIntArray695[arg0] == -1) {
					this.aClass303_2.method7422(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray666[local913], super.anIntArray666[local918], super.anIntArray666[local923], super.anIntArray684[local913], super.anIntArray684[local918], super.anIntArray684[local923], super.anIntArray672[local913], super.anIntArray672[local918], super.anIntArray672[local923], super.aShortArray135[arg0]);
				} else {
					this.aClass303_2.method7422(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray667[0], super.anIntArray667[1], super.anIntArray667[2], super.anIntArray666[local913], super.anIntArray666[local918], super.anIntArray666[local923], super.anIntArray684[local913], super.anIntArray684[local918], super.anIntArray684[local923], super.anIntArray672[local913], super.anIntArray672[local918], super.anIntArray672[local923], super.aShortArray135[arg0]);
				}
			} else if (super.anIntArray695[arg0] == -1) {
				this.aClass303_2.method7423(local121, local779, local784, local96, local101, local108, local25, local30, local35, Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF]);
			} else {
				this.aClass303_2.method7419(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray667[0], super.anIntArray667[1], super.anIntArray667[2]);
			}
		}
		if (local1 != 4) {
			return;
		}
		if (local96 < 0 || local101 < 0 || local108 < 0 || local96 > super.aClass179_6.anInt8694 || local101 > super.aClass179_6.anInt8694 || local108 > super.aClass179_6.anInt8694 || super.anIntArray675[3] < 0 || super.anIntArray675[3] > super.aClass179_6.anInt8694) {
			this.aClass303_2.aBoolean666 = true;
		}
		if (super.aShortArray135 == null || super.aShortArray135[arg0] == -1) {
			if (super.anIntArray695[arg0] == -1) {
				local913 = Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF];
				this.aClass303_2.method7423(local121, local779, local784, local96, local101, local108, local25, local30, local35, local913);
				this.aClass303_2.method7423(local121, local784, super.anIntArray696[3], local96, local108, super.anIntArray675[3], local25, local30, super.anIntArray674[3], local913);
				return;
			}
			this.aClass303_2.method7419(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray667[0], super.anIntArray667[1], super.anIntArray667[2]);
			this.aClass303_2.method7419(local121, local784, super.anIntArray696[3], local96, local108, super.anIntArray675[3], local25, local30, super.anIntArray674[3], super.anIntArray667[0], super.anIntArray667[2], super.anIntArray667[3]);
			return;
		}
		if (super.aByteArray107 == null || super.aByteArray107[arg0] == -1) {
			local913 = local10;
			local918 = local15;
			local923 = local20;
		} else {
			local908 = super.aByteArray107[arg0] & 0xFF;
			local913 = super.anIntArray691[local908];
			local918 = super.anIntArray678[local908];
			local923 = super.anIntArray692[local908];
		}
		@Pc(1267) short local1267 = super.aShortArray135[arg0];
		if (super.anIntArray695[arg0] == -1) {
			this.aClass303_2.method7422(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray666[local913], super.anIntArray666[local918], super.anIntArray666[local923], super.anIntArray684[local913], super.anIntArray684[local918], super.anIntArray684[local923], super.anIntArray672[local913], super.anIntArray672[local918], super.anIntArray672[local923], local1267);
			this.aClass303_2.method7422(local121, local784, super.anIntArray696[3], local96, local108, super.anIntArray675[3], local25, local30, super.anIntArray674[3], super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray666[local913], super.anIntArray666[local918], super.anIntArray666[local923], super.anIntArray684[local913], super.anIntArray684[local918], super.anIntArray684[local923], super.anIntArray672[local913], super.anIntArray672[local918], super.anIntArray672[local923], local1267);
			return;
		}
		this.aClass303_2.method7422(local121, local779, local784, local96, local101, local108, local25, local30, local35, super.anIntArray667[0], super.anIntArray667[1], super.anIntArray667[2], super.anIntArray666[local913], super.anIntArray666[local918], super.anIntArray666[local923], super.anIntArray684[local913], super.anIntArray684[local918], super.anIntArray684[local923], super.anIntArray672[local913], super.anIntArray672[local918], super.anIntArray672[local923], local1267);
		this.aClass303_2.method7422(local121, local784, super.anIntArray696[3], local96, local108, super.anIntArray675[3], local25, local30, super.anIntArray674[3], super.anIntArray667[0], super.anIntArray667[2], super.anIntArray667[3], super.anIntArray666[local913], super.anIntArray666[local918], super.anIntArray666[local923], super.anIntArray684[local913], super.anIntArray684[local918], super.anIntArray684[local923], super.anIntArray672[local913], super.anIntArray672[local918], super.anIntArray672[local923], local1267);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class23 method7068(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.method7083(Thread.currentThread());
		@Pc(11) Class23_Sub3 local11;
		@Pc(8) Class23_Sub3 local8;
		if (arg0 == 1) {
			local8 = super.aClass23_Sub3_47;
			local11 = super.aClass23_Sub3_44;
		} else if (arg0 == 2) {
			local8 = super.aClass23_Sub3_49;
			local11 = super.aClass23_Sub3_43;
		} else if (arg0 == 3) {
			local8 = super.aClass23_Sub3_46;
			local11 = super.aClass23_Sub3_45;
		} else if (arg0 == 4) {
			local8 = super.aClass23_Sub3_48;
			local11 = super.aClass23_Sub3_42;
		} else if (arg0 == 5) {
			local8 = super.aClass23_Sub3_41;
			local11 = super.aClass23_Sub3_50;
		} else {
			local11 = local8 = new Class23_Sub3_Sub1(super.aClass9_Sub1_15);
		}
		return this.method7092(local11, local8, arg1, arg0 != 0, arg2);
	}

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "(I)V")
	private void method7011(@OriginalArg(0) int arg0) {
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
		if (!super.aClass9_Sub1_15.aBoolean183) {
			local8 = super.aShortArray139[arg0];
			local13 = super.aShortArray138[arg0];
			local18 = super.aShortArray137[arg0];
			local27 = super.anIntArray682[local8] - super.aClass9_Sub1_15.anInt1807;
			if (local27 > 255) {
				local27 = 255;
			} else if (local27 < 0) {
				local27 = 0;
			}
			local46 = super.anIntArray682[local13] - super.aClass9_Sub1_15.anInt1807;
			if (local46 > 255) {
				local46 = 255;
			} else if (local46 < 0) {
				local46 = 0;
			}
			local65 = super.anIntArray682[local18] - super.aClass9_Sub1_15.anInt1807;
			if (local65 > 255) {
				local65 = 255;
			} else if (local65 < 0) {
				local65 = 0;
			}
			local81 = local27 + local46 + local65;
			if (local81 != 765) {
				if (local81 == 0) {
					this.method7008(arg0);
				} else {
					if (super.aByteArray109 == null) {
						this.aClass303_2.anInt8842 = 0;
					} else {
						this.aClass303_2.anInt8842 = super.aByteArray109[arg0] & 0xFF;
					}
					this.aClass303_2.aBoolean666 = super.aBooleanArray33[arg0];
					if (super.aShortArray135 != null && super.aShortArray135[arg0] != -1) {
						if (super.aByteArray107 == null || super.aByteArray107[arg0] == -1) {
							local333 = local8;
							local338 = local13;
							local343 = local18;
						} else {
							@Pc(328) int local328 = super.aByteArray107[arg0] & 0xFF;
							local333 = super.anIntArray691[local328];
							local338 = super.anIntArray678[local328];
							local343 = super.anIntArray692[local328];
						}
						if (super.anIntArray695[arg0] == -1) {
							this.aClass303_2.method7416(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], super.anIntArray682[local8], super.anIntArray682[local13], super.anIntArray682[local18], super.aClass9_Sub1_15.anInt1822, local27, local46, local65, super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray666[local333], super.anIntArray666[local338], super.anIntArray666[local343], super.anIntArray684[local333], super.anIntArray684[local338], super.anIntArray684[local343], super.anIntArray672[local333], super.anIntArray672[local338], super.anIntArray672[local343], super.aShortArray135[arg0]);
						} else {
							this.aClass303_2.method7416(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], super.anIntArray682[local8], super.anIntArray682[local13], super.anIntArray682[local18], super.aClass9_Sub1_15.anInt1822, local27, local46, local65, super.anIntArray690[arg0], super.anIntArray685[arg0], super.anIntArray695[arg0], super.anIntArray666[local333], super.anIntArray666[local338], super.anIntArray666[local343], super.anIntArray684[local333], super.anIntArray684[local338], super.anIntArray684[local343], super.anIntArray672[local333], super.anIntArray672[local338], super.anIntArray672[local343], super.aShortArray135[arg0]);
						}
					} else if (super.anIntArray695[arg0] == -1) {
						this.aClass303_2.method7404(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], super.anIntArray682[local8], super.anIntArray682[local13], super.anIntArray682[local18], Static571.method8046(Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF], local27 << 24 | super.aClass9_Sub1_15.anInt1822), Static571.method8046(Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF], local46 << 24 | super.aClass9_Sub1_15.anInt1822), Static571.method8046(Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF], local65 << 24 | super.aClass9_Sub1_15.anInt1822));
					} else {
						this.aClass303_2.method7404(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], super.anIntArray682[local8], super.anIntArray682[local13], super.anIntArray682[local18], Static571.method8046(Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF], local27 << 24 | super.aClass9_Sub1_15.anInt1822), Static571.method8046(Static29.anIntArray66[super.anIntArray685[arg0] & 0xFFFF], local46 << 24 | super.aClass9_Sub1_15.anInt1822), Static571.method8046(Static29.anIntArray66[super.anIntArray695[arg0] & 0xFFFF], local65 << 24 | super.aClass9_Sub1_15.anInt1822));
					}
				}
			}
		} else if (!super.aBooleanArray34[arg0]) {
			local8 = super.aShortArray139[arg0];
			local13 = super.aShortArray138[arg0];
			local18 = super.aShortArray137[arg0];
			local27 = 0;
			local46 = 0;
			local65 = 0;
			if (super.anIntArray681[local8] > super.aClass9_Sub1_15.anInt1826) {
				local27 = 255;
			} else if (super.anIntArray681[local8] > super.aClass9_Sub1_15.anInt1810) {
				local27 = (super.aClass9_Sub1_15.anInt1810 - super.anIntArray681[local8]) * 255 / (super.aClass9_Sub1_15.anInt1810 - super.aClass9_Sub1_15.anInt1826);
			}
			if (super.anIntArray681[local13] > super.aClass9_Sub1_15.anInt1826) {
				local46 = 255;
			} else if (super.anIntArray681[local13] > super.aClass9_Sub1_15.anInt1810) {
				local46 = (super.aClass9_Sub1_15.anInt1810 - super.anIntArray681[local13]) * 255 / (super.aClass9_Sub1_15.anInt1810 - super.aClass9_Sub1_15.anInt1826);
			}
			if (super.anIntArray681[local18] > super.aClass9_Sub1_15.anInt1826) {
				local65 = 255;
			} else if (super.anIntArray681[local18] > super.aClass9_Sub1_15.anInt1810) {
				local65 = (super.aClass9_Sub1_15.anInt1810 - super.anIntArray681[local18]) * 255 / (super.aClass9_Sub1_15.anInt1810 - super.aClass9_Sub1_15.anInt1826);
			}
			if (super.aByteArray109 == null) {
				this.aClass303_2.anInt8842 = 0;
			} else {
				this.aClass303_2.anInt8842 = super.aByteArray109[arg0] & 0xFF;
			}
			this.aClass303_2.aBoolean666 = super.aBooleanArray33[arg0];
			if (super.aShortArray135 != null && super.aShortArray135[arg0] != -1) {
				if (super.aByteArray107 == null || super.aByteArray107[arg0] == -1) {
					local81 = local8;
					local333 = local13;
					local338 = local18;
				} else {
					local343 = super.aByteArray107[arg0] & 0xFF;
					local81 = super.anIntArray691[local343];
					local333 = super.anIntArray678[local343];
					local338 = super.anIntArray692[local343];
				}
				if (super.anIntArray695[arg0] == -1) {
					this.aClass303_2.method7416(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], super.anIntArray682[local8], super.anIntArray682[local13], super.anIntArray682[local18], super.aClass9_Sub1_15.anInt1822, local27, local46, local65, super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray690[arg0], super.anIntArray666[local81], super.anIntArray666[local333], super.anIntArray666[local338], super.anIntArray684[local81], super.anIntArray684[local333], super.anIntArray684[local338], super.anIntArray672[local81], super.anIntArray672[local333], super.anIntArray672[local338], super.aShortArray135[arg0]);
				} else {
					this.aClass303_2.method7416(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], super.anIntArray682[local8], super.anIntArray682[local13], super.anIntArray682[local18], super.aClass9_Sub1_15.anInt1822, local27, local46, local65, super.anIntArray690[arg0], super.anIntArray685[arg0], super.anIntArray695[arg0], super.anIntArray666[local81], super.anIntArray666[local333], super.anIntArray666[local338], super.anIntArray684[local81], super.anIntArray684[local333], super.anIntArray684[local338], super.anIntArray672[local81], super.anIntArray672[local333], super.anIntArray672[local338], super.aShortArray135[arg0]);
				}
			} else if (super.anIntArray695[arg0] == -1) {
				this.aClass303_2.method7404(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], super.anIntArray682[local8], super.anIntArray682[local13], super.anIntArray682[local18], Static571.method8046(Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF], local27 << 24 | super.aClass9_Sub1_15.anInt1822), Static571.method8046(Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF], local46 << 24 | super.aClass9_Sub1_15.anInt1822), Static571.method8046(Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF], local65 << 24 | super.aClass9_Sub1_15.anInt1822));
			} else {
				this.aClass303_2.method7404(super.anIntArray686[local8], super.anIntArray686[local13], super.anIntArray686[local18], super.anIntArray699[local8], super.anIntArray699[local13], super.anIntArray699[local18], super.anIntArray682[local8], super.anIntArray682[local13], super.anIntArray682[local18], Static571.method8046(Static29.anIntArray66[super.anIntArray690[arg0] & 0xFFFF], local27 << 24 | super.aClass9_Sub1_15.anInt1822), Static571.method8046(Static29.anIntArray66[super.anIntArray685[arg0] & 0xFFFF], local46 << 24 | super.aClass9_Sub1_15.anInt1822), Static571.method8046(Static29.anIntArray66[super.anIntArray695[arg0] & 0xFFFF], local65 << 24 | super.aClass9_Sub1_15.anInt1822));
			}
		}
	}
}
