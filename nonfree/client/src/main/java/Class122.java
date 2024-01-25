import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class122 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "[I")
	public int[] anIntArray394;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "[I")
	private int[] anIntArray395;

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "[Z")
	public boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
	public int anInt4150;

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "Lclient!qi;")
	public Class247 aClass247_2;

	@OriginalMember(owner = "client!hi", name = "F", descriptor = "[I")
	public int[] anIntArray396;

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
	public int anInt4143 = 0;

	@OriginalMember(owner = "client!hi", name = "o", descriptor = "Z")
	public boolean aBoolean297 = false;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
	public int anInt4145 = 2;

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
	public int anInt4154 = -1;

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
	public int anInt4152 = -1;

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
	public int anInt4153 = -1;

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "Z")
	public boolean aBoolean296 = false;

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
	public int anInt4151 = -1;

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "Z")
	public boolean aBoolean298 = false;

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
	public int anInt4142 = -1;

	@OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
	public int anInt4161 = 99;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
	public int anInt4146 = 5;

	@OriginalMember(owner = "client!hi", name = "E", descriptor = "Z")
	public boolean aBoolean299 = false;

	static {
		new Class67("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZI)I")
	public int method3439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray396[arg1];
		@Pc(14) Class3_Sub10_Sub6 local14 = null;
		@Pc(22) Class3_Sub10_Sub6 local22 = this.aClass247_2.method6032(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean296 || Static497.aBoolean651) && arg0 != -1 && this.anIntArray396.length > arg0) {
			local7 = this.anIntArray396[arg0];
			local14 = this.aClass247_2.method6032(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean299) {
			local5 = 512;
		}
		if (local22.method2659(local26)) {
			local5 |= 0x80;
		}
		if (local22.method2658(local26)) {
			local5 |= 0x100;
		}
		if (local22.method2660(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method2659(local7)) {
				local5 |= 0x80;
			}
			if (local14.method2658(local7)) {
				local5 |= 0x100;
			}
			if (local14.method2660(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray395 != null && arg2) {
			@Pc(147) int local147;
			@Pc(160) Class3_Sub10_Sub6 local160;
			if (arg1 < this.anIntArray395.length) {
				local147 = this.anIntArray395[arg1];
				if (local147 != 65535) {
					local160 = this.aClass247_2.method6032(local147 >> 16);
					local147 &= 0xFFFF;
					if (local160 != null) {
						if (local160.method2659(local147)) {
							local5 |= 0x80;
						}
						if (local160.method2658(local147)) {
							local5 |= 0x100;
						}
						if (local160.method2660(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean296 || Static497.aBoolean651) && arg0 != -1 && this.anIntArray395.length > arg0) {
				local147 = this.anIntArray395[arg0];
				if (local147 != 65535) {
					local160 = this.aClass247_2.method6032(local147 >> 16);
					local147 &= 0xFFFF;
					if (local160 != null) {
						if (local160.method2659(local147)) {
							local5 |= 0x80;
						}
						if (local160.method2658(local147)) {
							local5 |= 0x100;
						}
						if (local160.method2660(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
	public void method3440() {
		if (this.anInt4142 == -1) {
			if (this.aBooleanArray20 == null) {
				this.anInt4142 = 0;
			} else {
				this.anInt4142 = 2;
			}
		}
		if (this.anInt4153 != -1) {
			return;
		}
		if (this.aBooleanArray20 == null) {
			this.anInt4153 = 0;
		} else {
			this.anInt4153 = 2;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!ba;IZII)Lclient!ba;")
	public Class2 method3442(@OriginalArg(0) int arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray394[arg2];
		@Pc(13) int local13 = this.anIntArray396[arg2];
		@Pc(21) Class3_Sub10_Sub6 local21 = this.aClass247_2.method6032(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg1.method5775((byte) 1, arg4, true);
		}
		@Pc(35) Class3_Sub10_Sub6 local35 = null;
		if ((this.aBoolean296 || Static497.aBoolean651) && arg3 != -1 && this.anIntArray396.length > arg3) {
			@Pc(57) int local57 = this.anIntArray396[arg3];
			local35 = this.aClass247_2.method6032(local57 >> 16);
			arg3 = local57 & 0xFFFF;
		}
		@Pc(71) Class3_Sub10_Sub6 local71 = null;
		@Pc(73) Class3_Sub10_Sub6 local73 = null;
		@Pc(75) int local75 = 0;
		@Pc(77) int local77 = 0;
		if (this.anIntArray395 != null) {
			if (this.anIntArray395.length > arg2) {
				local75 = this.anIntArray395[arg2];
				if (local75 != 65535) {
					local71 = this.aClass247_2.method6032(local75 >> 16);
					local75 &= 0xFFFF;
				}
			}
			if ((this.aBoolean296 || Static497.aBoolean651) && arg3 != -1 && this.anIntArray395.length > arg3) {
				local77 = this.anIntArray395[arg3];
				if (local77 != 65535) {
					local73 = this.aClass247_2.method6032(local77 >> 16);
					local77 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean299) {
			arg4 |= 0x200;
		}
		if (local21.method2659(local25)) {
			arg4 |= 0x80;
		}
		if (local21.method2658(local25)) {
			arg4 |= 0x100;
		}
		if (local21.method2660(local25)) {
			arg4 |= 0x400;
		}
		if (local71 != null) {
			if (local71.method2659(local75)) {
				arg4 |= 0x80;
			}
			if (local71.method2658(local75)) {
				arg4 |= 0x100;
			}
			if (local71.method2660(local75)) {
				arg4 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method2659(arg3)) {
				arg4 |= 0x80;
			}
			if (local35.method2658(arg3)) {
				arg4 |= 0x100;
			}
			if (local35.method2660(arg3)) {
				arg4 |= 0x400;
			}
		}
		if (local73 != null) {
			if (local73.method2659(local77)) {
				arg4 |= 0x80;
			}
			if (local73.method2658(local77)) {
				arg4 |= 0x100;
			}
			if (local73.method2660(local77)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(279) Class2 local279 = arg1.method5775((byte) 1, arg4, true);
		local279.method5769(local25, this.aBoolean299, 0, local21, arg0 - 1, arg3, local8, local35);
		if (local71 != null) {
			local279.method5769(local75, this.aBoolean299, 0, local71, arg0 - 1, local77, local8, local73);
		}
		return local279;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!rt;I)V")
	public void method3443(@OriginalArg(0) Class3_Sub27 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7548();
			if (local9 == 0) {
				return;
			}
			this.method3445(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!rt;IB)V")
	private void method3445(@OriginalArg(0) Class3_Sub27 arg0, @OriginalArg(1) int arg1) {
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(47) int local47;
		@Pc(66) int local66;
		if (arg1 == 1) {
			local22 = arg0.method7591();
			this.anIntArray394 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray394[local28] = arg0.method7591();
			}
			this.anIntArray396 = new int[local22];
			for (local47 = 0; local47 < local22; local47++) {
				this.anIntArray396[local47] = arg0.method7591();
			}
			for (local66 = 0; local66 < local22; local66++) {
				this.anIntArray396[local66] += arg0.method7591() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt4152 = arg0.method7591();
		} else if (arg1 == 3) {
			this.aBooleanArray20 = new boolean[256];
			local22 = arg0.method7548();
			for (local28 = 0; local28 < local22; local28++) {
				this.aBooleanArray20[arg0.method7548()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt4146 = arg0.method7548();
		} else if (arg1 == 6) {
			this.anInt4151 = arg0.method7591();
		} else if (arg1 == 7) {
			this.anInt4154 = arg0.method7591();
		} else if (arg1 == 8) {
			this.anInt4161 = arg0.method7548();
		} else if (arg1 == 9) {
			this.anInt4153 = arg0.method7548();
		} else if (arg1 == 10) {
			this.anInt4142 = arg0.method7548();
		} else if (arg1 == 11) {
			this.anInt4145 = arg0.method7548();
		} else if (arg1 == 12) {
			local22 = arg0.method7548();
			this.anIntArray395 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray395[local28] = arg0.method7591();
			}
			for (local47 = 0; local47 < local22; local47++) {
				this.anIntArray395[local47] += arg0.method7591() << 16;
			}
		} else if (arg1 == 13) {
			local22 = arg0.method7591();
			this.anIntArrayArray45 = new int[local22][];
			for (local28 = 0; local28 < local22; local28++) {
				local47 = arg0.method7548();
				if (local47 > 0) {
					this.anIntArrayArray45[local28] = new int[local47];
					this.anIntArrayArray45[local28][0] = arg0.method7551();
					for (local66 = 1; local66 < local47; local66++) {
						this.anIntArrayArray45[local28][local66] = arg0.method7591();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean299 = true;
		} else if (arg1 == 15) {
			this.aBoolean296 = true;
		} else if (arg1 == 16) {
			this.aBoolean297 = true;
		} else if (arg1 == 17) {
			this.anInt4143 = arg0.method7548();
		} else if (arg1 == 18) {
			this.aBoolean298 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIBIIILclient!ba;I)Lclient!ba;")
	public Class2 method3446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2 arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray394[arg3];
		@Pc(18) int local18 = this.anIntArray396[arg3];
		@Pc(26) Class3_Sub10_Sub6 local26 = this.aClass247_2.method6032(local18 >> 16);
		@Pc(30) int local30 = local18 & 0xFFFF;
		if (local26 == null) {
			return arg5.method5775(arg2, arg0, true);
		}
		@Pc(40) Class3_Sub10_Sub6 local40 = null;
		if ((this.aBoolean296 || Static497.aBoolean651) && arg1 != -1 && arg1 < this.anIntArray396.length) {
			@Pc(59) int local59 = this.anIntArray396[arg1];
			local40 = this.aClass247_2.method6032(local59 >> 16);
			arg1 = local59 & 0xFFFF;
		}
		if (this.aBoolean299) {
			arg0 |= 0x200;
		}
		if (local26.method2659(local30)) {
			arg0 |= 0x80;
		}
		if (local26.method2658(local30)) {
			arg0 |= 0x100;
		}
		if (local26.method2660(local30)) {
			arg0 |= 0x400;
		}
		if (local40 != null) {
			if (local40.method2659(arg1)) {
				arg0 |= 0x80;
			}
			if (local40.method2658(arg1)) {
				arg0 |= 0x100;
			}
			if (local40.method2660(arg1)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(148) Class2 local148 = arg5.method5775(arg2, arg0, true);
		local148.method5769(local30, this.aBoolean299, arg4, local26, arg6 - 1, arg1, local8, local40);
		return local148;
	}
}
