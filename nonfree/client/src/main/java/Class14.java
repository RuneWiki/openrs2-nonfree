import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class14 {

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "[I")
	public static int[] anIntArray58 = new int[256];

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "J")
	private long aLong21;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "Z")
	public boolean aBoolean20;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
	private int anInt594;

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "J")
	private long aLong22;

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!dc", name = "D", descriptor = "[I")
	private int[] anIntArray61;

	static {
		for (@Pc(38) int local38 = 0; local38 < 256; local38++) {
			@Pc(41) int local41 = local38;
			for (@Pc(43) int local43 = 0; local43 < 8; local43++) {
				if ((local41 & 0x1) == 1) {
					local41 = local41 >>> 1 ^ 0xEDB88320;
				} else {
					local41 >>>= 0x1;
				}
			}
			anIntArray58[local38] = local41;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ[I[IB)V")
	public void method438(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static54.anInt1335; local12++) {
					@Pc(18) Class2_Sub2_Sub7 local18 = Static2.method18(local12);
					if (local18 != null && !local18.aBoolean30 && local18.anInt868 == (arg1 ? 7 : 0) + local8) {
						arg3[Static111.anIntArray346[local8]] = local12 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray60 = arg3;
		this.anIntArray61 = arg2;
		this.aBoolean20 = arg1;
		this.anInt594 = arg0;
		this.method443();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIZ)V")
	public void method440(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 && this.aBoolean20) {
			return;
		}
		@Pc(21) int local21 = this.anIntArray60[Static111.anIntArray346[arg0]];
		if (local21 == 0) {
			return;
		}
		local21 -= 256;
		@Pc(51) Class2_Sub2_Sub7 local51;
		do {
			if (arg1) {
				local21++;
				if (Static54.anInt1335 <= local21) {
					local21 = 0;
				}
			} else {
				local21--;
				if (local21 < 0) {
					local21 = Static54.anInt1335 - 1;
				}
			}
			local51 = Static2.method18(local21);
		} while (local51 == null || local51.aBoolean30 || arg0 + (this.aBoolean20 ? 7 : 0) != local51.anInt868);
		this.anIntArray60[Static111.anIntArray346[arg0]] = local21 + 256;
		this.method443();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)I")
	public int method441() {
		return this.anInt594 == -1 ? (this.anIntArray60[11] << 5) + (this.anIntArray61[0] << 25) + (this.anIntArray61[4] << 20) + (this.anIntArray60[0] << 15) + (this.anIntArray60[8] << 10) + this.anIntArray60[1] : Static8.method168(this.anInt594).anInt1091 + 305419896;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZII)V")
	public void method442(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anIntArray61[arg1];
		if (arg0) {
			local16++;
			if (local16 >= Static106.aShortArrayArray1[arg1].length) {
				local16 = 0;
			}
		} else {
			local16--;
			if (local16 < 0) {
				local16 = Static106.aShortArrayArray1[arg1].length - 1;
			}
		}
		this.anIntArray61[arg1] = local16;
		this.method443();
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
	private void method443() {
		@Pc(8) long local8 = this.aLong22;
		this.aLong22 = 0L;
		@Pc(16) int local16 = this.anIntArray60[5];
		@Pc(21) int local21 = this.anIntArray60[9];
		this.anIntArray60[5] = local21;
		this.anIntArray60[9] = local16;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong22 <<= 0x4;
			if (this.anIntArray60[local33] >= 256) {
				this.aLong22 += this.anIntArray60[local33] - 256;
			}
		}
		if (this.anIntArray60[0] >= 256) {
			this.aLong22 += this.anIntArray60[0] - 256 >> 4;
		}
		if (this.anIntArray60[1] >= 256) {
			this.aLong22 += this.anIntArray60[1] - 256 >> 8;
		}
		for (@Pc(111) int local111 = 0; local111 < 5; local111++) {
			this.aLong22 <<= 0x3;
			this.aLong22 += this.anIntArray61[local111];
		}
		this.aLong22 <<= 0x1;
		this.anIntArray60[9] = local21;
		this.anIntArray60[5] = local16;
		this.aLong22 += this.aBoolean20 ? 1 : 0;
		if (local8 != 0L && local8 != this.aLong22) {
			Static27.aClass16_27.method486(local8);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ic;I)V")
	public void method445(@OriginalArg(0) Class2_Sub10 arg0) {
		arg0.method1486(this.aBoolean20 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray60[Static111.anIntArray346[local16]];
			if (local25 == 0) {
				arg0.method1486(-1);
			} else {
				arg0.method1486(local25 - 256);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method1486(this.anIntArray61[local25]);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)V")
	public void method446(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean20) {
			this.method438(-1, arg0, this.anIntArray61, null);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!ma;Lclient!ma;I)Lclient!na;")
	public Class2_Sub2_Sub2_Sub5 method447(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub2_Sub11 arg1, @OriginalArg(3) Class2_Sub2_Sub11 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt594 != -1) {
			return Static8.method168(this.anInt594).method764(arg1, arg3, arg0, arg2);
		}
		@Pc(24) long local24 = this.aLong22;
		@Pc(27) int[] local27 = this.anIntArray60;
		if (arg2 != null && (arg2.anInt1518 >= 0 || arg2.anInt1508 >= 0)) {
			local27 = new int[12];
			for (@Pc(43) int local43 = 0; local43 < 12; local43++) {
				local27[local43] = this.anIntArray60[local43];
			}
			if (arg2.anInt1518 >= 0) {
				local24 += arg2.anInt1518 - this.anIntArray60[5] << 8;
				local27[5] = arg2.anInt1518;
			}
			if (arg2.anInt1508 >= 0) {
				local24 += arg2.anInt1508 - this.anIntArray60[3] << 16;
				local27[3] = arg2.anInt1508;
			}
		}
		@Pc(114) Class2_Sub2_Sub2_Sub5 local114 = (Class2_Sub2_Sub2_Sub5) Static27.aClass16_27.method490(local24);
		if (local114 == null) {
			@Pc(118) boolean local118 = false;
			for (@Pc(120) int local120 = 0; local120 < 12; local120++) {
				@Pc(126) int local126 = local27[local120];
				if (local126 >= 256 && local126 < 512 && !Static2.method18(local126 - 256).method614()) {
					local118 = true;
				}
				if (local126 >= 512 && !Static35.method1934(local126 - 512).method1225(this.aBoolean20)) {
					local118 = true;
				}
			}
			if (local118) {
				if (this.aLong21 != -1L) {
					local114 = (Class2_Sub2_Sub2_Sub5) Static27.aClass16_27.method490(this.aLong21);
				}
				if (local114 == null) {
					return null;
				}
			}
			if (local114 == null) {
				@Pc(185) int local185 = 0;
				@Pc(188) Class2_Sub2_Sub2_Sub7[] local188 = new Class2_Sub2_Sub2_Sub7[12];
				for (@Pc(190) int local190 = 0; local190 < 12; local190++) {
					@Pc(196) int local196 = local27[local190];
					@Pc(212) Class2_Sub2_Sub2_Sub7 local212;
					if (local196 >= 256 && local196 < 512) {
						local212 = Static2.method18(local196 - 256).method610();
						if (local212 != null) {
							local188[local185++] = local212;
						}
					}
					if (local196 >= 512) {
						local212 = Static35.method1934(local196 - 512).method1229(this.aBoolean20);
						if (local212 != null) {
							local188[local185++] = local212;
						}
					}
				}
				@Pc(251) Class2_Sub2_Sub2_Sub7 local251 = new Class2_Sub2_Sub2_Sub7(local188, local185);
				for (@Pc(253) int local253 = 0; local253 < 5; local253++) {
					if (this.anIntArray61[local253] != 0) {
						local251.method1415(Static106.aShortArrayArray1[local253][0], Static106.aShortArrayArray1[local253][this.anIntArray61[local253]]);
						if (local253 == 1) {
							local251.method1415(Static25.aShortArray3[0], Static25.aShortArray3[this.anIntArray61[local253]]);
						}
					}
				}
				local114 = local251.method1412(64, 850, -30, -50, -30);
				Static27.aClass16_27.method492(local114, local24);
				this.aLong21 = local24;
			}
		}
		if (arg2 == null && arg1 == null) {
			return local114;
		}
		@Pc(337) Class2_Sub2_Sub2_Sub5 local337;
		if (arg2 != null && arg1 != null) {
			local337 = arg2.method1050(arg3, arg0, local114, arg1);
		} else if (arg2 == null) {
			local337 = arg1.method1044(local114, arg0);
		} else {
			local337 = arg2.method1044(local114, arg3);
		}
		return local337;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)Lclient!pf;")
	public Class2_Sub2_Sub2_Sub7 method449() {
		if (this.anInt594 != -1) {
			return Static8.method168(this.anInt594).method766();
		}
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
			@Pc(28) int local28 = this.anIntArray60[local21];
			if (local28 >= 256 && local28 < 512 && !Static2.method18(local28 - 256).method617()) {
				local19 = true;
			}
			if (local28 >= 512 && !Static35.method1934(local28 - 512).method1219(this.aBoolean20)) {
				local19 = true;
			}
		}
		if (local19) {
			return null;
		}
		@Pc(76) Class2_Sub2_Sub2_Sub7[] local76 = new Class2_Sub2_Sub2_Sub7[12];
		@Pc(78) int local78 = 0;
		for (@Pc(80) int local80 = 0; local80 < 12; local80++) {
			@Pc(87) int local87 = this.anIntArray60[local80];
			@Pc(103) Class2_Sub2_Sub2_Sub7 local103;
			if (local87 >= 256 && local87 < 512) {
				local103 = Static2.method18(local87 - 256).method613();
				if (local103 != null) {
					local76[local78++] = local103;
				}
			}
			if (local87 >= 512) {
				local103 = Static35.method1934(local87 - 512).method1223(this.aBoolean20);
				if (local103 != null) {
					local76[local78++] = local103;
				}
			}
		}
		@Pc(145) Class2_Sub2_Sub2_Sub7 local145 = new Class2_Sub2_Sub2_Sub7(local76, local78);
		for (@Pc(147) int local147 = 0; local147 < 5; local147++) {
			if (this.anIntArray61[local147] != 0) {
				local145.method1415(Static106.aShortArrayArray1[local147][0], Static106.aShortArrayArray1[local147][this.anIntArray61[local147]]);
				if (local147 == 1) {
					local145.method1415(Static25.aShortArray3[0], Static25.aShortArray3[this.anIntArray61[local147]]);
				}
			}
		}
		return local145;
	}
}
