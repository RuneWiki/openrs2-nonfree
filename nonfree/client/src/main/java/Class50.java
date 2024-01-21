import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class50 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "J")
	private long aLong86;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "J")
	private long aLong87;

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
	private int anInt2538;

	@OriginalMember(owner = "client!ob", name = "E", descriptor = "[I")
	private int[] anIntArray262;

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "Z")
	public boolean aBoolean90;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZIZ)V")
	public void method1631(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1 && this.aBoolean90) {
			return;
		}
		@Pc(25) int local25 = this.anIntArray257[Static117.anIntArray340[arg1]];
		if (local25 == 0) {
			return;
		}
		local25 -= 256;
		@Pc(57) Class3_Sub1_Sub3 local57;
		do {
			if (arg0) {
				local25++;
				if (Static29.anInt1010 <= local25) {
					local25 = 0;
				}
			} else {
				local25--;
				if (local25 < 0) {
					local25 = Static29.anInt1010 - 1;
				}
			}
			local57 = Static16.method483(local25);
		} while (local57 == null || local57.aBoolean26 || arg1 + (this.aBoolean90 ? 7 : 0) != local57.anInt836);
		this.anIntArray257[Static117.anIntArray340[arg1]] = local25 + 256;
		this.method1641();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLclient!la;)V")
	public void method1632(@OriginalArg(1) Class3_Sub12 arg0) {
		arg0.method1937(this.aBoolean90 ? 1 : 0);
		@Pc(29) int local29;
		for (@Pc(18) int local18 = 0; local18 < 7; local18++) {
			local29 = this.anIntArray257[Static117.anIntArray340[local18]];
			if (local29 == 0) {
				arg0.method1937(-1);
			} else {
				arg0.method1937(local29 - 256);
			}
		}
		for (local29 = 0; local29 < 5; local29++) {
			arg0.method1937(this.anIntArray262[local29]);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZI)V")
	public void method1633(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = this.anIntArray262[arg0];
		if (arg1) {
			local8++;
			if (local8 >= Static66.aShortArrayArray1[arg0].length) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static66.aShortArrayArray1[arg0].length - 1;
			}
		}
		this.anIntArray262[arg0] = local8;
		this.method1641();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZ)V")
	public void method1634(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean90 != arg0) {
			this.method1635(arg0, this.anIntArray262, null, -1);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z[I[IIB)V")
	public void method1635(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static29.anInt1010; local16++) {
					@Pc(22) Class3_Sub1_Sub3 local22 = Static16.method483(local16);
					if (local22 != null && !local22.aBoolean26 && (arg0 ? 7 : 0) + local12 == local22.anInt836) {
						arg2[Static117.anIntArray340[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.aBoolean90 = arg0;
		this.anIntArray257 = arg2;
		this.anInt2538 = arg3;
		this.anIntArray262 = arg1;
		this.method1641();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!nf;ILclient!nf;B)Lclient!ea;")
	public Class3_Sub1_Sub1_Sub4 method1639(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1_Sub14 arg3) {
		if (this.anInt2538 != -1) {
			return Static81.method1638(this.anInt2538).method2091(arg1, arg3, arg2, arg0);
		}
		@Pc(35) long local35 = this.aLong86;
		@Pc(38) int[] local38 = this.anIntArray257;
		if (arg1 != null && (arg1.anInt2483 >= 0 || arg1.anInt2480 >= 0)) {
			local38 = new int[12];
			for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
				local38[local54] = this.anIntArray257[local54];
			}
			if (arg1.anInt2483 >= 0) {
				local35 += arg1.anInt2483 - this.anIntArray257[5] << 8;
				local38[5] = arg1.anInt2483;
			}
			if (arg1.anInt2480 >= 0) {
				local35 += arg1.anInt2480 - this.anIntArray257[3] << 16;
				local38[3] = arg1.anInt2480;
			}
		}
		@Pc(121) Class3_Sub1_Sub1_Sub4 local121 = (Class3_Sub1_Sub1_Sub4) Static122.aClass17_11.method643(local35);
		if (local121 == null) {
			@Pc(125) boolean local125 = false;
			for (@Pc(127) int local127 = 0; local127 < 12; local127++) {
				@Pc(133) int local133 = local38[local127];
				if (local133 >= 256 && local133 < 512 && !Static16.method483(local133 - 256).method540()) {
					local125 = true;
				}
				if (local133 >= 512 && !Static22.method568(local133 - 512).method1194(this.aBoolean90)) {
					local125 = true;
				}
			}
			if (local125) {
				if (this.aLong87 != -1L) {
					local121 = (Class3_Sub1_Sub1_Sub4) Static122.aClass17_11.method643(this.aLong87);
				}
				if (local121 == null) {
					return null;
				}
			}
			if (local121 == null) {
				@Pc(194) int local194 = 0;
				@Pc(197) Class3_Sub1_Sub1_Sub7[] local197 = new Class3_Sub1_Sub1_Sub7[12];
				for (@Pc(199) int local199 = 0; local199 < 12; local199++) {
					@Pc(205) int local205 = local38[local199];
					@Pc(221) Class3_Sub1_Sub1_Sub7 local221;
					if (local205 >= 256 && local205 < 512) {
						local221 = Static16.method483(local205 - 256).method536();
						if (local221 != null) {
							local197[local194++] = local221;
						}
					}
					if (local205 >= 512) {
						local221 = Static22.method568(local205 - 512).method1201(this.aBoolean90);
						if (local221 != null) {
							local197[local194++] = local221;
						}
					}
				}
				@Pc(260) Class3_Sub1_Sub1_Sub7 local260 = new Class3_Sub1_Sub1_Sub7(local197, local194);
				for (@Pc(262) int local262 = 0; local262 < 5; local262++) {
					if (this.anIntArray262[local262] != 0) {
						local260.method2233(Static66.aShortArrayArray1[local262][0], Static66.aShortArrayArray1[local262][this.anIntArray262[local262]]);
						if (local262 == 1) {
							local260.method2233(Static4.aShortArray1[0], Static4.aShortArray1[this.anIntArray262[local262]]);
						}
					}
				}
				local121 = local260.method2229(64, 850, -30, -50, -30);
				Static122.aClass17_11.method644(local35, local121);
				this.aLong87 = local35;
			}
		}
		if (arg1 == null && arg3 == null) {
			return local121;
		}
		@Pc(336) Class3_Sub1_Sub1_Sub4 local336;
		if (arg1 != null && arg3 != null) {
			local336 = arg1.method1603(arg3, arg2, local121, arg0);
		} else if (arg1 == null) {
			local336 = arg3.method1597(local121, arg2);
		} else {
			local336 = arg1.method1597(local121, arg0);
		}
		return local336;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Lclient!ue;")
	public Class3_Sub1_Sub1_Sub7 method1640() {
		if (this.anInt2538 != -1) {
			return Static81.method1638(this.anInt2538).method2089();
		}
		@Pc(24) boolean local24 = false;
		for (@Pc(26) int local26 = 0; local26 < 12; local26++) {
			@Pc(33) int local33 = this.anIntArray257[local26];
			if (local33 >= 256 && local33 < 512 && !Static16.method483(local33 - 256).method541()) {
				local24 = true;
			}
			if (local33 >= 512 && !Static22.method568(local33 - 512).method1198(this.aBoolean90)) {
				local24 = true;
			}
		}
		if (local24) {
			return null;
		}
		@Pc(79) Class3_Sub1_Sub1_Sub7[] local79 = new Class3_Sub1_Sub1_Sub7[12];
		@Pc(81) int local81 = 0;
		for (@Pc(83) int local83 = 0; local83 < 12; local83++) {
			@Pc(90) int local90 = this.anIntArray257[local83];
			@Pc(106) Class3_Sub1_Sub1_Sub7 local106;
			if (local90 >= 256 && local90 < 512) {
				local106 = Static16.method483(local90 - 256).method538();
				if (local106 != null) {
					local79[local81++] = local106;
				}
			}
			if (local90 >= 512) {
				local106 = Static22.method568(local90 - 512).method1188(this.aBoolean90);
				if (local106 != null) {
					local79[local81++] = local106;
				}
			}
		}
		@Pc(145) Class3_Sub1_Sub1_Sub7 local145 = new Class3_Sub1_Sub1_Sub7(local79, local81);
		for (@Pc(147) int local147 = 0; local147 < 5; local147++) {
			if (this.anIntArray262[local147] != 0) {
				local145.method2233(Static66.aShortArrayArray1[local147][0], Static66.aShortArrayArray1[local147][this.anIntArray262[local147]]);
				if (local147 == 1) {
					local145.method2233(Static4.aShortArray1[0], Static4.aShortArray1[this.anIntArray262[local147]]);
				}
			}
		}
		return local145;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
	private void method1641() {
		@Pc(8) long local8 = this.aLong86;
		this.aLong86 = 0L;
		@Pc(16) int local16 = this.anIntArray257[5];
		@Pc(21) int local21 = this.anIntArray257[9];
		this.anIntArray257[5] = local21;
		this.anIntArray257[9] = local16;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong86 <<= 0x4;
			if (this.anIntArray257[local33] >= 256) {
				this.aLong86 += this.anIntArray257[local33] - 256;
			}
		}
		if (this.anIntArray257[0] >= 256) {
			this.aLong86 += this.anIntArray257[0] - 256 >> 4;
		}
		if (this.anIntArray257[1] >= 256) {
			this.aLong86 += this.anIntArray257[1] - 256 >> 8;
		}
		for (@Pc(111) int local111 = 0; local111 < 5; local111++) {
			this.aLong86 <<= 0x3;
			this.aLong86 += this.anIntArray262[local111];
		}
		this.aLong86 <<= 0x1;
		this.anIntArray257[5] = local16;
		this.aLong86 += this.aBoolean90 ? 1 : 0;
		this.anIntArray257[9] = local21;
		if (local8 != 0L && local8 != this.aLong86) {
			Static122.aClass17_11.method649(local8);
		}
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)I")
	public int method1642() {
		return this.anInt2538 == -1 ? this.anIntArray257[1] + (this.anIntArray257[0] << 15) + (this.anIntArray262[4] << 20) + (this.anIntArray262[0] << 25) + (this.anIntArray257[8] << 10) + (this.anIntArray257[11] << 5) : Static81.method1638(this.anInt2538).anInt3172 + 305419896;
	}
}
