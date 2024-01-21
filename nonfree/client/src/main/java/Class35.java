import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class35 {

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "Z")
	public boolean aBoolean91;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "J")
	private long aLong51;

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
	private int anInt1730;

	@OriginalMember(owner = "client!jf", name = "z", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!jf", name = "C", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!jf", name = "D", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)I")
	public int method1139() {
		return this.anInt1730 == -1 ? this.anIntArray171[1] + (this.anIntArray171[0] << 15) + (this.anIntArray170[4] << 20) + ((this.anIntArray170[0] << 25) - -(this.anIntArray171[8] << 10)) + (this.anIntArray171[11] << 5) : Static115.method2083(this.anInt1730).anInt245 + 305419896;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZII)V")
	public void method1140(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 && this.aBoolean91) {
			return;
		}
		@Pc(21) int local21 = this.anIntArray171[Static110.anIntArray350[arg1]];
		if (local21 == 0) {
			return;
		}
		local21 -= 256;
		@Pc(49) Class3_Sub1_Sub13 local49;
		do {
			if (arg0) {
				local21++;
				if (local21 >= Static107.anInt2874) {
					local21 = 0;
				}
			} else {
				local21--;
				if (local21 < 0) {
					local21 = Static107.anInt2874 - 1;
				}
			}
			local49 = Static54.method1096(local21);
		} while (local49 == null || local49.aBoolean126 || (this.aBoolean91 ? 7 : 0) + arg1 != local49.anInt2245);
		this.anIntArray171[Static110.anIntArray350[arg1]] = local21 + 256;
		this.method1151();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "([I[IIBZ)V")
	public void method1142(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static107.anInt2874; local16++) {
					@Pc(22) Class3_Sub1_Sub13 local22 = Static54.method1096(local16);
					if (local22 != null && !local22.aBoolean126 && local22.anInt2245 == local12 + (arg3 ? 7 : 0)) {
						arg1[Static110.anIntArray350[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.anInt1730 = arg2;
		this.anIntArray170 = arg0;
		this.aBoolean91 = arg3;
		this.anIntArray171 = arg1;
		this.method1151();
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Lclient!fe;")
	public Class3_Sub1_Sub5_Sub2 method1144() {
		if (this.anInt1730 != -1) {
			return Static115.method2083(this.anInt1730).method139();
		}
		@Pc(20) boolean local20 = false;
		for (@Pc(22) int local22 = 0; local22 < 12; local22++) {
			@Pc(29) int local29 = this.anIntArray171[local22];
			if (local29 >= 256 && local29 < 512 && !Static54.method1096(local29 - 256).method1413()) {
				local20 = true;
			}
			if (local29 >= 512 && !Static117.method2099(local29 - 512).method1123(this.aBoolean91)) {
				local20 = true;
			}
		}
		if (local20) {
			return null;
		}
		@Pc(75) Class3_Sub1_Sub5_Sub2[] local75 = new Class3_Sub1_Sub5_Sub2[12];
		@Pc(77) int local77 = 0;
		for (@Pc(79) int local79 = 0; local79 < 12; local79++) {
			@Pc(86) int local86 = this.anIntArray171[local79];
			@Pc(104) Class3_Sub1_Sub5_Sub2 local104;
			if (local86 >= 256 && local86 < 512) {
				local104 = Static54.method1096(local86 - 256).method1420();
				if (local104 != null) {
					local75[local77++] = local104;
				}
			}
			if (local86 >= 512) {
				local104 = Static117.method2099(local86 - 512).method1132(this.aBoolean91);
				if (local104 != null) {
					local75[local77++] = local104;
				}
			}
		}
		@Pc(143) Class3_Sub1_Sub5_Sub2 local143 = new Class3_Sub1_Sub5_Sub2(local75, local77);
		for (@Pc(145) int local145 = 0; local145 < 5; local145++) {
			if (this.anIntArray170[local145] < Static46.aShortArrayArray3[local145].length) {
				local143.method693(Static28.aShortArray8[local145], Static46.aShortArrayArray3[local145][this.anIntArray170[local145]]);
			}
			if (Static86.aShortArrayArray5[local145].length > this.anIntArray170[local145]) {
				local143.method693(Static8.aShortArray3[local145], Static86.aShortArrayArray5[local145][this.anIntArray170[local145]]);
			}
		}
		return local143;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!uc;IILclient!uc;)Lclient!oa;")
	public Class3_Sub1_Sub5_Sub7 method1145(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub17 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class3_Sub1_Sub17 arg3) {
		if (this.anInt1730 != -1) {
			return Static115.method2083(this.anInt1730).method133(arg1, arg3, arg0, arg2);
		}
		@Pc(26) int[] local26 = this.anIntArray171;
		@Pc(29) long local29 = this.aLong52;
		if (arg1 != null && (arg1.anInt3106 >= 0 || arg1.anInt3108 >= 0)) {
			local26 = new int[12];
			for (@Pc(51) int local51 = 0; local51 < 12; local51++) {
				local26[local51] = this.anIntArray171[local51];
			}
			if (arg1.anInt3106 >= 0) {
				local29 += arg1.anInt3106 - this.anIntArray171[5] << 8;
				local26[5] = arg1.anInt3106;
			}
			if (arg1.anInt3108 >= 0) {
				local29 += arg1.anInt3108 - this.anIntArray171[3] << 16;
				local26[3] = arg1.anInt3108;
			}
		}
		@Pc(115) Class3_Sub1_Sub5_Sub7 local115 = (Class3_Sub1_Sub5_Sub7) Static22.aClass66_10.method1970(local29);
		if (local115 == null) {
			@Pc(119) boolean local119 = false;
			for (@Pc(121) int local121 = 0; local121 < 12; local121++) {
				@Pc(127) int local127 = local26[local121];
				if (local127 >= 256 && local127 < 512 && !Static54.method1096(local127 - 256).method1417()) {
					local119 = true;
				}
				if (local127 >= 512 && !Static117.method2099(local127 - 512).method1124(this.aBoolean91)) {
					local119 = true;
				}
			}
			if (local119) {
				if (this.aLong51 != -1L) {
					local115 = (Class3_Sub1_Sub5_Sub7) Static22.aClass66_10.method1970(this.aLong51);
				}
				if (local115 == null) {
					return null;
				}
			}
			if (local115 == null) {
				@Pc(191) Class3_Sub1_Sub5_Sub2[] local191 = new Class3_Sub1_Sub5_Sub2[12];
				@Pc(193) int local193 = 0;
				for (@Pc(195) int local195 = 0; local195 < 12; local195++) {
					@Pc(201) int local201 = local26[local195];
					@Pc(217) Class3_Sub1_Sub5_Sub2 local217;
					if (local201 >= 256 && local201 < 512) {
						local217 = Static54.method1096(local201 - 256).method1412();
						if (local217 != null) {
							local191[local193++] = local217;
						}
					}
					if (local201 >= 512) {
						local217 = Static117.method2099(local201 - 512).method1137(this.aBoolean91);
						if (local217 != null) {
							local191[local193++] = local217;
						}
					}
				}
				@Pc(256) Class3_Sub1_Sub5_Sub2 local256 = new Class3_Sub1_Sub5_Sub2(local191, local193);
				for (@Pc(258) int local258 = 0; local258 < 5; local258++) {
					if (this.anIntArray170[local258] < Static46.aShortArrayArray3[local258].length) {
						local256.method693(Static28.aShortArray8[local258], Static46.aShortArrayArray3[local258][this.anIntArray170[local258]]);
					}
					if (this.anIntArray170[local258] < Static86.aShortArrayArray5[local258].length) {
						local256.method693(Static8.aShortArray3[local258], Static86.aShortArrayArray5[local258][this.anIntArray170[local258]]);
					}
				}
				local115 = local256.method688(64, 850, -30, -50, -30);
				Static22.aClass66_10.method1969(local29, local115);
				this.aLong51 = local29;
			}
		}
		if (arg1 == null && arg3 == null) {
			return local115;
		}
		@Pc(346) Class3_Sub1_Sub5_Sub7 local346;
		if (arg1 != null && arg3 != null) {
			local346 = arg1.method2119(local115, arg0, arg3, arg2);
		} else if (arg1 == null) {
			local346 = arg3.method2117(arg0, local115);
		} else {
			local346 = arg1.method2117(arg2, local115);
		}
		return local346;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZB)V")
	public void method1146(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean91) {
			this.method1142(this.anIntArray170, null, -1, arg0);
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(ZII)V")
	public void method1147(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray170[arg1];
		if (arg0) {
			local8++;
			if (local8 >= Static46.aShortArrayArray3[arg1].length) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static46.aShortArrayArray3[arg1].length - 1;
			}
		}
		this.anIntArray170[arg1] = local8;
		this.method1151();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!m;I)V")
	public void method1149(@OriginalArg(0) Class3_Sub11 arg0) {
		arg0.method992(this.aBoolean91 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray171[Static110.anIntArray350[local16]];
			if (local25 == 0) {
				arg0.method992(-1);
			} else {
				arg0.method992(local25 - 256);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method992(this.anIntArray170[local25]);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	private void method1151() {
		@Pc(8) long local8 = this.aLong52;
		@Pc(17) int local17 = this.anIntArray171[5];
		this.aLong52 = 0L;
		@Pc(25) int local25 = this.anIntArray171[9];
		this.anIntArray171[9] = local17;
		this.anIntArray171[5] = local25;
		for (@Pc(37) int local37 = 0; local37 < 12; local37++) {
			this.aLong52 <<= 0x4;
			if (this.anIntArray171[local37] >= 256) {
				this.aLong52 += this.anIntArray171[local37] - 256;
			}
		}
		if (this.anIntArray171[0] >= 256) {
			this.aLong52 += this.anIntArray171[0] - 256 >> 4;
		}
		if (this.anIntArray171[1] >= 256) {
			this.aLong52 += this.anIntArray171[1] - 256 >> 8;
		}
		for (@Pc(111) int local111 = 0; local111 < 5; local111++) {
			this.aLong52 <<= 0x3;
			this.aLong52 += this.anIntArray170[local111];
		}
		this.anIntArray171[9] = local25;
		this.anIntArray171[5] = local17;
		this.aLong52 <<= 0x1;
		this.aLong52 += this.aBoolean91 ? 1 : 0;
		if (local8 != 0L && local8 != this.aLong52) {
			Static22.aClass66_10.method1968(local8);
		}
	}
}
