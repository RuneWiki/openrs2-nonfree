import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class35 {

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "[I")
	private int[] anIntArray185;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
	private int anInt1337;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!ja", name = "w", descriptor = "[I")
	private int[] anIntArray186;

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "Z")
	public boolean aBoolean70;

	@OriginalMember(owner = "client!ja", name = "A", descriptor = "J")
	private long aLong34;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)I")
	public int method910() {
		return this.anInt1337 == -1 ? (this.anIntArray186[11] << 5) + (this.anIntArray185[4] << 20) + (this.anIntArray185[0] << 25) + (this.anIntArray186[0] << 15) + (this.anIntArray186[8] << 10) + this.anIntArray186[1] : Static63.method1331(this.anInt1337).anInt1389 + 305419896;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I[I[IZI)V")
	public void method912(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3) {
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(6) int local6 = 0; local6 < 7; local6++) {
				for (@Pc(9) int local9 = 0; local9 < Static87.anInt2325; local9++) {
					@Pc(14) Class2_Sub1_Sub3 local14 = Static54.method1054(local9);
					if (local14 != null && !local14.aBoolean9 && local14.anInt247 == local6 + (arg3 ? 7 : 0)) {
						arg1[Static22.anIntArray69[local6]] = local9 + 256;
						break;
					}
				}
			}
		}
		this.aBoolean70 = arg3;
		this.anIntArray186 = arg1;
		this.anIntArray185 = arg2;
		this.anInt1337 = arg0;
		this.method922();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!g;Z)V")
	public void method914(@OriginalArg(0) Class2_Sub5 arg0) {
		arg0.method1252(this.aBoolean70 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray186[Static22.anIntArray69[local16]];
			if (local25 == 0) {
				arg0.method1252(-1);
			} else {
				arg0.method1252(local25 - 256);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method1252(this.anIntArray185[local25]);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!aa;ILclient!aa;II)Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 method915(@OriginalArg(0) Class2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub1 arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1337 != -1) {
			return Static63.method1331(this.anInt1337).method948(arg1, arg0, arg3, arg2);
		}
		@Pc(32) long local32 = this.aLong32;
		@Pc(35) int[] local35 = this.anIntArray186;
		if (arg0 != null && (arg0.anInt72 >= 0 || arg0.anInt88 >= 0)) {
			local35 = new int[12];
			for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
				local35[local54] = this.anIntArray186[local54];
			}
			if (arg0.anInt72 >= 0) {
				local32 += arg0.anInt72 - this.anIntArray186[5] << 8;
				local35[5] = arg0.anInt72;
			}
			if (arg0.anInt88 >= 0) {
				local32 += arg0.anInt88 - this.anIntArray186[3] << 16;
				local35[3] = arg0.anInt88;
			}
		}
		@Pc(120) Class2_Sub1_Sub2_Sub2 local120 = (Class2_Sub1_Sub2_Sub2) Static85.aClass54_24.method1634(local32);
		if (local120 == null) {
			@Pc(124) boolean local124 = false;
			for (@Pc(126) int local126 = 0; local126 < 12; local126++) {
				@Pc(132) int local132 = local35[local126];
				if (local132 >= 256 && local132 < 512 && !Static54.method1054(local132 - 256).method168()) {
					local124 = true;
				}
				if (local132 >= 512 && !Static66.method1384(local132 - 512).method898(this.aBoolean70)) {
					local124 = true;
				}
			}
			if (local124) {
				if (this.aLong34 != -1L) {
					local120 = (Class2_Sub1_Sub2_Sub2) Static85.aClass54_24.method1634(this.aLong34);
				}
				if (local120 == null) {
					return null;
				}
			}
			if (local120 == null) {
				@Pc(194) Class2_Sub1_Sub2_Sub2[] local194 = new Class2_Sub1_Sub2_Sub2[12];
				@Pc(196) int local196 = 0;
				@Pc(204) int local204;
				for (@Pc(198) int local198 = 0; local198 < 12; local198++) {
					local204 = local35[local198];
					@Pc(220) Class2_Sub1_Sub2_Sub2 local220;
					if (local204 >= 256 && local204 < 512) {
						local220 = Static54.method1054(local204 - 256).method166();
						if (local220 != null) {
							local194[local196++] = local220;
						}
					}
					if (local204 >= 512) {
						local220 = Static66.method1384(local204 - 512).method905(this.aBoolean70);
						if (local220 != null) {
							local194[local196++] = local220;
						}
					}
				}
				local120 = new Class2_Sub1_Sub2_Sub2(local194, local196);
				for (local204 = 0; local204 < 5; local204++) {
					if (this.anIntArray185[local204] != 0) {
						local120.method716(Static61.anIntArrayArray18[local204][0], Static61.anIntArrayArray18[local204][this.anIntArray185[local204]]);
						if (local204 == 1) {
							local120.method716(Static24.anIntArray73[0], Static24.anIntArray73[this.anIntArray185[local204]]);
						}
					}
				}
				local120.method693();
				local120.method712(64, 850, -30, -50, -30, true);
				Static85.aClass54_24.method1637(local32, local120);
				this.aLong34 = local32;
			}
		}
		if (arg0 == null && arg2 == null) {
			return local120;
		}
		@Pc(340) Class2_Sub1_Sub2_Sub2 local340;
		if (arg0 != null && arg2 != null) {
			local340 = arg0.method54(local120, arg1, arg3, arg2);
		} else if (arg0 == null) {
			local340 = arg2.method58(arg1, local120);
		} else {
			local340 = arg0.method58(arg3, local120);
		}
		return local340;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(Z)Lclient!ga;")
	public Class2_Sub1_Sub2_Sub2 method917() {
		if (this.anInt1337 != -1) {
			return Static63.method1331(this.anInt1337).method942();
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < 12; local25++) {
			@Pc(32) int local32 = this.anIntArray186[local25];
			if (local32 >= 256 && local32 < 512 && !Static54.method1054(local32 - 256).method160()) {
				local23 = true;
			}
			if (local32 >= 512 && !Static66.method1384(local32 - 512).method909(this.aBoolean70)) {
				local23 = true;
			}
		}
		if (local23) {
			return null;
		}
		@Pc(82) Class2_Sub1_Sub2_Sub2[] local82 = new Class2_Sub1_Sub2_Sub2[12];
		@Pc(84) int local84 = 0;
		for (@Pc(86) int local86 = 0; local86 < 12; local86++) {
			@Pc(93) int local93 = this.anIntArray186[local86];
			@Pc(111) Class2_Sub1_Sub2_Sub2 local111;
			if (local93 >= 256 && local93 < 512) {
				local111 = Static54.method1054(local93 - 256).method161();
				if (local111 != null) {
					local82[local84++] = local111;
				}
			}
			if (local93 >= 512) {
				local111 = Static66.method1384(local93 - 512).method899(this.aBoolean70);
				if (local111 != null) {
					local82[local84++] = local111;
				}
			}
		}
		@Pc(148) Class2_Sub1_Sub2_Sub2 local148 = new Class2_Sub1_Sub2_Sub2(local82, local84);
		for (@Pc(150) int local150 = 0; local150 < 5; local150++) {
			if (this.anIntArray185[local150] != 0) {
				local148.method716(Static61.anIntArrayArray18[local150][0], Static61.anIntArrayArray18[local150][this.anIntArray185[local150]]);
				if (local150 == 1) {
					local148.method716(Static24.anIntArray73[0], Static24.anIntArray73[this.anIntArray185[local150]]);
				}
			}
		}
		return local148;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZB)V")
	public void method920(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean70 != arg0) {
			this.method912(-1, null, this.anIntArray185, arg0);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIZ)V")
	public void method921(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = this.anIntArray185[arg0];
		if (arg1) {
			local11++;
			if (local11 >= Static61.anIntArrayArray18[arg0].length) {
				local11 = 0;
			}
		} else {
			local11--;
			if (local11 < 0) {
				local11 = Static61.anIntArrayArray18[arg0].length - 1;
			}
		}
		this.anIntArray185[arg0] = local11;
		this.method922();
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	private void method922() {
		@Pc(6) long local6 = this.aLong32;
		@Pc(11) int local11 = this.anIntArray186[5];
		@Pc(16) int local16 = this.anIntArray186[9];
		this.anIntArray186[5] = local16;
		this.anIntArray186[9] = local11;
		this.aLong32 = 0L;
		for (@Pc(31) int local31 = 0; local31 < 12; local31++) {
			this.aLong32 <<= 0x4;
			if (this.anIntArray186[local31] >= 256) {
				this.aLong32 += this.anIntArray186[local31] - 256;
			}
		}
		if (this.anIntArray186[0] >= 256) {
			this.aLong32 += this.anIntArray186[0] - 256 >> 4;
		}
		if (this.anIntArray186[1] >= 256) {
			this.aLong32 += this.anIntArray186[1] - 256 >> 8;
		}
		for (@Pc(114) int local114 = 0; local114 < 5; local114++) {
			this.aLong32 <<= 0x3;
			this.aLong32 += this.anIntArray185[local114];
		}
		this.aLong32 <<= 0x1;
		this.aLong32 += this.aBoolean70 ? 1 : 0;
		this.anIntArray186[5] = local11;
		this.anIntArray186[9] = local16;
		if (local6 != 0L && this.aLong32 != local6) {
			Static85.aClass54_24.method1633(local6);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZZ)V")
	public void method923(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 && this.aBoolean70) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray186[Static22.anIntArray69[arg0]];
		if (local19 == 0) {
			return;
		}
		local19 -= 256;
		@Pc(46) Class2_Sub1_Sub3 local46;
		do {
			if (arg1) {
				local19++;
				if (Static87.anInt2325 <= local19) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static87.anInt2325 - 1;
				}
			}
			local46 = Static54.method1054(local19);
		} while (local46 == null || local46.aBoolean9 || local46.anInt247 != (this.aBoolean70 ? 7 : 0) + arg0);
		this.anIntArray186[Static22.anIntArray69[arg0]] = local19 + 256;
		this.method922();
	}
}
