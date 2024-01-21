import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class54 {

	@OriginalMember(owner = "client!o", name = "f", descriptor = "J")
	private long aLong53;

	@OriginalMember(owner = "client!o", name = "o", descriptor = "[I")
	private int[] anIntArray253;

	@OriginalMember(owner = "client!o", name = "q", descriptor = "I")
	private int anInt1765;

	@OriginalMember(owner = "client!o", name = "y", descriptor = "Z")
	public boolean aBoolean107;

	@OriginalMember(owner = "client!o", name = "A", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!o", name = "C", descriptor = "J")
	private long aLong54;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	private void method1244() {
		@Pc(8) long local8 = this.aLong54;
		@Pc(13) int local13 = this.anIntArray253[5];
		this.aLong54 = 0L;
		@Pc(21) int local21 = this.anIntArray253[9];
		this.anIntArray253[5] = local21;
		this.anIntArray253[9] = local13;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong54 <<= 0x4;
			if (this.anIntArray253[local33] >= 256) {
				this.aLong54 += this.anIntArray253[local33] - 256;
			}
		}
		if (this.anIntArray253[0] >= 256) {
			this.aLong54 += this.anIntArray253[0] - 256 >> 4;
		}
		if (this.anIntArray253[1] >= 256) {
			this.aLong54 += this.anIntArray253[1] - 256 >> 8;
		}
		for (@Pc(119) int local119 = 0; local119 < 5; local119++) {
			this.aLong54 <<= 0x3;
			this.aLong54 += this.anIntArray254[local119];
		}
		this.anIntArray253[5] = local13;
		this.anIntArray253[9] = local21;
		this.aLong54 <<= 0x1;
		this.aLong54 += this.aBoolean107 ? 1 : 0;
		if (local8 != 0L && local8 != this.aLong54) {
			Static90.aClass19_21.method419(local8);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)Lclient!kc;")
	public Class1_Sub1_Sub2_Sub3 method1245() {
		if (this.anInt1765 != -1) {
			return Static42.method697(this.anInt1765).method1656();
		}
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
			@Pc(28) int local28 = this.anIntArray253[local21];
			if (local28 >= 256 && local28 < 512 && !Static86.method1414(local28 - 256).method2061()) {
				local19 = true;
			}
			if (local28 >= 512 && !Static106.method1739(local28 - 512).method714(this.aBoolean107)) {
				local19 = true;
			}
		}
		if (local19) {
			return null;
		}
		@Pc(75) int local75 = 0;
		@Pc(78) Class1_Sub1_Sub2_Sub3[] local78 = new Class1_Sub1_Sub2_Sub3[12];
		for (@Pc(85) int local85 = 0; local85 < 12; local85++) {
			@Pc(92) int local92 = this.anIntArray253[local85];
			@Pc(110) Class1_Sub1_Sub2_Sub3 local110;
			if (local92 >= 256 && local92 < 512) {
				local110 = Static86.method1414(local92 - 256).method2066();
				if (local110 != null) {
					local78[local75++] = local110;
				}
			}
			if (local92 >= 512) {
				local110 = Static106.method1739(local92 - 512).method719(this.aBoolean107);
				if (local110 != null) {
					local78[local75++] = local110;
				}
			}
		}
		@Pc(149) Class1_Sub1_Sub2_Sub3 local149 = new Class1_Sub1_Sub2_Sub3(local78, local75);
		for (@Pc(151) int local151 = 0; local151 < 5; local151++) {
			if (this.anIntArray254[local151] != 0) {
				local149.method1013(Static83.aShortArrayArray1[local151][0], Static83.aShortArrayArray1[local151][this.anIntArray254[local151]]);
				if (local151 == 1) {
					local149.method1013(Static17.aShortArray3[0], Static17.aShortArray3[this.anIntArray254[local151]]);
				}
			}
		}
		return local149;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!id;B)V")
	public void method1247(@OriginalArg(0) Class1_Sub6 arg0) {
		arg0.method1853(this.aBoolean107 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray253[Static95.anIntArray316[local16]];
			if (local25 == 0) {
				arg0.method1853(-1);
			} else {
				arg0.method1853(local25 - 256);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method1853(this.anIntArray254[local25]);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZIB[I[I)V")
	public void method1249(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static93.anInt2074; local16++) {
					@Pc(22) Class1_Sub1_Sub17 local22 = Static86.method1414(local16);
					if (local22 != null && !local22.aBoolean168 && local22.anInt2803 == (arg0 ? 7 : 0) + local12) {
						arg3[Static95.anIntArray316[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.anInt1765 = arg1;
		this.aBoolean107 = arg0;
		this.anIntArray254 = arg2;
		this.anIntArray253 = arg3;
		this.method1244();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZII)V")
	public void method1250(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anIntArray254[arg1];
		if (arg0) {
			local15++;
			if (local15 >= Static83.aShortArrayArray1[arg1].length) {
				local15 = 0;
			}
		} else {
			local15--;
			if (local15 < 0) {
				local15 = Static83.aShortArrayArray1[arg1].length - 1;
			}
		}
		this.anIntArray254[arg1] = local15;
		this.method1244();
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)I")
	public int method1252() {
		return this.anInt1765 == -1 ? this.anIntArray253[1] + (this.anIntArray253[11] << 5) + (this.anIntArray253[0] << 15) + (this.anIntArray254[0] << 25) + (this.anIntArray254[4] << 20) + (this.anIntArray253[8] << 10) : Static42.method697(this.anInt1765).anInt2306 + 305419896;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZIB)V")
	public void method1254(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1 && this.aBoolean107) {
			return;
		}
		@Pc(21) int local21 = this.anIntArray253[Static95.anIntArray316[arg1]];
		if (local21 == 0) {
			return;
		}
		local21 -= 256;
		@Pc(46) Class1_Sub1_Sub17 local46;
		do {
			if (arg0) {
				local21++;
				if (local21 >= Static93.anInt2074) {
					local21 = 0;
				}
			} else {
				local21--;
				if (local21 < 0) {
					local21 = Static93.anInt2074 - 1;
				}
			}
			local46 = Static86.method1414(local21);
		} while (local46 == null || local46.aBoolean168 || local46.anInt2803 != (this.aBoolean107 ? 7 : 0) + arg1);
		this.anIntArray253[Static95.anIntArray316[arg1]] = local21 + 256;
		this.method1244();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)V")
	public void method1255(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean107 != arg0) {
			this.method1249(arg0, -1, this.anIntArray254, null);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!e;IILclient!e;)Lclient!ue;")
	public Class1_Sub1_Sub2_Sub7 method1256(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub1_Sub4 arg3) {
		if (this.anInt1765 != -1) {
			return Static42.method697(this.anInt1765).method1651(arg0, arg1, arg2, arg3);
		}
		@Pc(25) int[] local25 = this.anIntArray253;
		@Pc(28) long local28 = this.aLong54;
		if (arg1 != null && (arg1.anInt697 >= 0 || arg1.anInt708 >= 0)) {
			local25 = new int[12];
			for (@Pc(44) int local44 = 0; local44 < 12; local44++) {
				local25[local44] = this.anIntArray253[local44];
			}
			if (arg1.anInt697 >= 0) {
				local28 += arg1.anInt697 - this.anIntArray253[5] << 8;
				local25[5] = arg1.anInt697;
			}
			if (arg1.anInt708 >= 0) {
				local28 += arg1.anInt708 - this.anIntArray253[3] << 16;
				local25[3] = arg1.anInt708;
			}
		}
		@Pc(107) Class1_Sub1_Sub2_Sub7 local107 = (Class1_Sub1_Sub2_Sub7) Static90.aClass19_21.method410(local28);
		if (local107 == null) {
			@Pc(111) boolean local111 = false;
			for (@Pc(113) int local113 = 0; local113 < 12; local113++) {
				@Pc(119) int local119 = local25[local113];
				if (local119 >= 256 && local119 < 512 && !Static86.method1414(local119 - 256).method2057()) {
					local111 = true;
				}
				if (local119 >= 512 && !Static106.method1739(local119 - 512).method713(this.aBoolean107)) {
					local111 = true;
				}
			}
			if (local111) {
				if (this.aLong53 != -1L) {
					local107 = (Class1_Sub1_Sub2_Sub7) Static90.aClass19_21.method410(this.aLong53);
				}
				if (local107 == null) {
					return null;
				}
			}
			if (local107 == null) {
				@Pc(185) Class1_Sub1_Sub2_Sub3[] local185 = new Class1_Sub1_Sub2_Sub3[12];
				@Pc(187) int local187 = 0;
				for (@Pc(189) int local189 = 0; local189 < 12; local189++) {
					@Pc(195) int local195 = local25[local189];
					@Pc(213) Class1_Sub1_Sub2_Sub3 local213;
					if (local195 >= 256 && local195 < 512) {
						local213 = Static86.method1414(local195 - 256).method2060();
						if (local213 != null) {
							local185[local187++] = local213;
						}
					}
					if (local195 >= 512) {
						local213 = Static106.method1739(local195 - 512).method722(this.aBoolean107);
						if (local213 != null) {
							local185[local187++] = local213;
						}
					}
				}
				@Pc(252) Class1_Sub1_Sub2_Sub3 local252 = new Class1_Sub1_Sub2_Sub3(local185, local187);
				for (@Pc(254) int local254 = 0; local254 < 5; local254++) {
					if (this.anIntArray254[local254] != 0) {
						local252.method1013(Static83.aShortArrayArray1[local254][0], Static83.aShortArrayArray1[local254][this.anIntArray254[local254]]);
						if (local254 == 1) {
							local252.method1013(Static17.aShortArray3[0], Static17.aShortArray3[this.anIntArray254[local254]]);
						}
					}
				}
				local107 = local252.method1002(64, 850, -30, -50, -30);
				Static90.aClass19_21.method409(local107, local28);
				this.aLong53 = local28;
			}
		}
		if (arg1 == null && arg3 == null) {
			return local107;
		}
		@Pc(332) Class1_Sub1_Sub2_Sub7 local332;
		if (arg1 != null && arg3 != null) {
			local332 = arg1.method450(arg0, arg2, arg3, local107);
		} else if (arg1 == null) {
			local332 = arg3.method456(local107, arg0);
		} else {
			local332 = arg1.method456(local107, arg2);
		}
		return local332;
	}
}
