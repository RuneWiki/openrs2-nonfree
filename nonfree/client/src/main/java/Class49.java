import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class49 {

	@OriginalMember(owner = "client!lf", name = "A", descriptor = "[I")
	public static int[] anIntArray190 = new int[32];

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "J")
	private long aLong54;

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "[I")
	private int[] anIntArray189;

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
	private int anInt1644;

	@OriginalMember(owner = "client!lf", name = "z", descriptor = "J")
	private long aLong55;

	@OriginalMember(owner = "client!lf", name = "C", descriptor = "Z")
	public boolean aBoolean57;

	static {
		@Pc(15) int local15 = 2;
		for (@Pc(17) int local17 = 0; local17 < 32; local17++) {
			anIntArray190[local17] = local15 - 1;
			local15 += local15;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLclient!tf;)V")
	public void method1052(@OriginalArg(1) Class4_Sub9 arg0) {
		arg0.method819(this.aBoolean57 ? 1 : 0);
		@Pc(21) int local21;
		for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
			local21 = this.anIntArray188[Static2.anIntArray3[local12]];
			if (local21 == 0) {
				arg0.method819(-1);
			} else {
				arg0.method819(local21 - 256);
			}
		}
		for (local21 = 0; local21 < 5; local21++) {
			arg0.method819(this.anIntArray189[local21]);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)I")
	public int method1054() {
		return this.anInt1644 == -1 ? (this.anIntArray188[8] << 10) + (this.anIntArray189[4] << 20) + (this.anIntArray189[0] << 25) + (this.anIntArray188[0] << 15) + (this.anIntArray188[11] << 5) + this.anIntArray188[1] : Static110.method1820(this.anInt1644).anInt2203 + 305419896;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([I[IIIZ)V")
	public void method1057(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static62.anInt1587; local16++) {
					@Pc(24) Class4_Sub3_Sub7 local24 = Static9.method98(local16);
					if (local24 != null && !local24.aBoolean39 && local24.anInt1007 == (arg3 ? 7 : 0) + local12) {
						arg0[Static2.anIntArray3[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.aBoolean57 = arg3;
		this.anIntArray189 = arg1;
		this.anInt1644 = arg2;
		this.anIntArray188 = arg0;
		this.method1058();
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	private void method1058() {
		@Pc(10) int local10 = this.anIntArray188[5];
		@Pc(13) long local13 = this.aLong54;
		@Pc(18) int local18 = this.anIntArray188[9];
		this.anIntArray188[5] = local18;
		this.aLong54 = 0L;
		this.anIntArray188[9] = local10;
		for (@Pc(39) int local39 = 0; local39 < 12; local39++) {
			this.aLong54 <<= 0x4;
			if (this.anIntArray188[local39] >= 256) {
				this.aLong54 += this.anIntArray188[local39] - 256;
			}
		}
		if (this.anIntArray188[0] >= 256) {
			this.aLong54 += this.anIntArray188[0] - 256 >> 4;
		}
		if (this.anIntArray188[1] >= 256) {
			this.aLong54 += this.anIntArray188[1] - 256 >> 8;
		}
		for (@Pc(113) int local113 = 0; local113 < 5; local113++) {
			this.aLong54 <<= 0x3;
			this.aLong54 += this.anIntArray189[local113];
		}
		this.anIntArray188[9] = local18;
		this.anIntArray188[5] = local10;
		this.aLong54 <<= 0x1;
		this.aLong54 += this.aBoolean57 ? 1 : 0;
		if (local13 != 0L && local13 != this.aLong54) {
			Static75.aClass12_10.method287(local13);
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(ZI)V")
	public void method1059(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean57 != arg0) {
			this.method1057(null, this.anIntArray189, -1, arg0);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZZ)V")
	public void method1060(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 && this.aBoolean57) {
			return;
		}
		@Pc(21) int local21 = this.anIntArray188[Static2.anIntArray3[arg0]];
		if (local21 == 0) {
			return;
		}
		local21 -= 256;
		@Pc(49) Class4_Sub3_Sub7 local49;
		do {
			if (arg1) {
				local21++;
				if (local21 >= Static62.anInt1587) {
					local21 = 0;
				}
			} else {
				local21--;
				if (local21 < 0) {
					local21 = Static62.anInt1587 - 1;
				}
			}
			local49 = Static9.method98(local21);
		} while (local49 == null || local49.aBoolean39 || arg0 + (this.aBoolean57 ? 7 : 0) != local49.anInt1007);
		this.anIntArray188[Static2.anIntArray3[arg0]] = local21 + 256;
		this.method1058();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZIZ)V")
	public void method1061(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = this.anIntArray189[arg0];
		if (arg1) {
			local8++;
			if (local8 >= Static109.aShortArrayArray34[arg0].length) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static109.aShortArrayArray34[arg0].length - 1;
			}
		}
		this.anIntArray189[arg0] = local8;
		this.method1058();
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(I)Lclient!pf;")
	public Class4_Sub3_Sub1_Sub5 method1062() {
		if (this.anInt1644 != -1) {
			return Static110.method1820(this.anInt1644).method1520();
		}
		@Pc(25) boolean local25 = false;
		for (@Pc(27) int local27 = 0; local27 < 12; local27++) {
			@Pc(34) int local34 = this.anIntArray188[local27];
			if (local34 >= 256 && local34 < 512 && !Static9.method98(local34 - 256).method563()) {
				local25 = true;
			}
			if (local34 >= 512 && !Static112.method1854(local34 - 512).method1972(this.aBoolean57)) {
				local25 = true;
			}
		}
		if (local25) {
			return null;
		}
		@Pc(77) int local77 = 0;
		@Pc(80) Class4_Sub3_Sub1_Sub5[] local80 = new Class4_Sub3_Sub1_Sub5[12];
		for (@Pc(82) int local82 = 0; local82 < 12; local82++) {
			@Pc(89) int local89 = this.anIntArray188[local82];
			@Pc(105) Class4_Sub3_Sub1_Sub5 local105;
			if (local89 >= 256 && local89 < 512) {
				local105 = Static9.method98(local89 - 256).method557();
				if (local105 != null) {
					local80[local77++] = local105;
				}
			}
			if (local89 >= 512) {
				local105 = Static112.method1854(local89 - 512).method1965(this.aBoolean57);
				if (local105 != null) {
					local80[local77++] = local105;
				}
			}
		}
		@Pc(144) Class4_Sub3_Sub1_Sub5 local144 = new Class4_Sub3_Sub1_Sub5(local80, local77);
		for (@Pc(146) int local146 = 0; local146 < 5; local146++) {
			if (this.anIntArray189[local146] < Static109.aShortArrayArray34[local146].length) {
				local144.method1433(Static8.aShortArray2[local146], Static109.aShortArrayArray34[local146][this.anIntArray189[local146]]);
			}
			if (Static79.aShortArrayArray22[local146].length > this.anIntArray189[local146]) {
				local144.method1433(Static41.aShortArray15[local146], Static79.aShortArrayArray22[local146][this.anIntArray189[local146]]);
			}
		}
		return local144;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!ne;BILclient!ne;)Lclient!qb;")
	public Class4_Sub3_Sub1_Sub7 method1065(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub3_Sub10 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4_Sub3_Sub10 arg3) {
		if (this.anInt1644 != -1) {
			return Static110.method1820(this.anInt1644).method1521(arg3, arg1, arg0, arg2);
		}
		@Pc(26) long local26 = this.aLong54;
		@Pc(29) int[] local29 = this.anIntArray188;
		if (arg3 != null && (arg3.anInt1880 >= 0 || arg3.anInt1862 >= 0)) {
			local29 = new int[12];
			for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
				local29[local50] = this.anIntArray188[local50];
			}
			if (arg3.anInt1880 >= 0) {
				local26 += arg3.anInt1880 - this.anIntArray188[5] << 8;
				local29[5] = arg3.anInt1880;
			}
			if (arg3.anInt1862 >= 0) {
				local26 += arg3.anInt1862 - this.anIntArray188[3] << 16;
				local29[3] = arg3.anInt1862;
			}
		}
		@Pc(112) Class4_Sub3_Sub1_Sub7 local112 = (Class4_Sub3_Sub1_Sub7) Static75.aClass12_10.method289(local26);
		if (local112 == null) {
			@Pc(116) boolean local116 = false;
			for (@Pc(118) int local118 = 0; local118 < 12; local118++) {
				@Pc(124) int local124 = local29[local118];
				if (local124 >= 256 && local124 < 512 && !Static9.method98(local124 - 256).method554()) {
					local116 = true;
				}
				if (local124 >= 512 && !Static112.method1854(local124 - 512).method1963(this.aBoolean57)) {
					local116 = true;
				}
			}
			if (local116) {
				if (this.aLong55 != -1L) {
					local112 = (Class4_Sub3_Sub1_Sub7) Static75.aClass12_10.method289(this.aLong55);
				}
				if (local112 == null) {
					return null;
				}
			}
			if (local112 == null) {
				@Pc(186) Class4_Sub3_Sub1_Sub5[] local186 = new Class4_Sub3_Sub1_Sub5[12];
				@Pc(188) int local188 = 0;
				for (@Pc(190) int local190 = 0; local190 < 12; local190++) {
					@Pc(196) int local196 = local29[local190];
					@Pc(214) Class4_Sub3_Sub1_Sub5 local214;
					if (local196 >= 256 && local196 < 512) {
						local214 = Static9.method98(local196 - 256).method555();
						if (local214 != null) {
							local186[local188++] = local214;
						}
					}
					if (local196 >= 512) {
						local214 = Static112.method1854(local196 - 512).method1967(this.aBoolean57);
						if (local214 != null) {
							local186[local188++] = local214;
						}
					}
				}
				@Pc(253) Class4_Sub3_Sub1_Sub5 local253 = new Class4_Sub3_Sub1_Sub5(local186, local188);
				for (@Pc(255) int local255 = 0; local255 < 5; local255++) {
					if (Static109.aShortArrayArray34[local255].length > this.anIntArray189[local255]) {
						local253.method1433(Static8.aShortArray2[local255], Static109.aShortArrayArray34[local255][this.anIntArray189[local255]]);
					}
					if (this.anIntArray189[local255] < Static79.aShortArrayArray22[local255].length) {
						local253.method1433(Static41.aShortArray15[local255], Static79.aShortArrayArray22[local255][this.anIntArray189[local255]]);
					}
				}
				local112 = local253.method1444(64, 850, -30, -50, -30);
				Static75.aClass12_10.method290(local112, local26);
				this.aLong55 = local26;
			}
		}
		if (arg3 == null && arg1 == null) {
			return local112;
		}
		@Pc(343) Class4_Sub3_Sub1_Sub7 local343;
		if (arg3 != null && arg1 != null) {
			local343 = arg3.method1262(arg0, arg1, arg2, local112);
		} else if (arg3 == null) {
			local343 = arg1.method1259(arg2, local112);
		} else {
			local343 = arg3.method1259(arg0, local112);
		}
		return local343;
	}
}
