import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class21 {

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "[I")
	public static int[] anIntArray73 = new int[256];

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "J")
	private long aLong24;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
	private int anInt611;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "Z")
	public boolean aBoolean64;

	static {
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(22) int local22 = local19;
			for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
				if ((local22 & 0x1) == 1) {
					local22 = local22 >>> 1 ^ 0xEDB88320;
				} else {
					local22 >>>= 0x1;
				}
			}
			anIntArray73[local19] = local22;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!jd;I)V")
	public void method431(@OriginalArg(0) Class4_Sub11 arg0) {
		arg0.method701(this.aBoolean64 ? 1 : 0);
		@Pc(31) int local31;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local31 = this.anIntArray71[Static84.anIntArray257[local16]];
			if (local31 == 0) {
				arg0.method701(-1);
			} else {
				arg0.method701(local31 - 256);
			}
		}
		for (local31 = 0; local31 < 5; local31++) {
			arg0.method701(this.anIntArray72[local31]);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)V")
	public void method433(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean64 != arg0) {
			this.method441(this.anIntArray72, -1, null, arg0);
		}
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
	private void method437() {
		@Pc(13) long local13 = this.aLong24;
		this.aLong24 = 0L;
		@Pc(21) int local21 = this.anIntArray71[5];
		@Pc(26) int local26 = this.anIntArray71[9];
		this.anIntArray71[9] = local21;
		this.anIntArray71[5] = local26;
		for (@Pc(38) int local38 = 0; local38 < 12; local38++) {
			this.aLong24 <<= 0x4;
			if (this.anIntArray71[local38] >= 256) {
				this.aLong24 += this.anIntArray71[local38] - 256;
			}
		}
		if (this.anIntArray71[0] >= 256) {
			this.aLong24 += this.anIntArray71[0] - 256 >> 4;
		}
		if (this.anIntArray71[1] >= 256) {
			this.aLong24 += this.anIntArray71[1] - 256 >> 8;
		}
		for (@Pc(112) int local112 = 0; local112 < 5; local112++) {
			this.aLong24 <<= 0x3;
			this.aLong24 += this.anIntArray72[local112];
		}
		this.aLong24 <<= 0x1;
		this.aLong24 += this.aBoolean64 ? 1 : 0;
		this.anIntArray71[9] = local26;
		this.anIntArray71[5] = local21;
		if (local13 != 0L && this.aLong24 != local13) {
			Static33.aClass33_12.method999(local13);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BIZ)V")
	public void method438(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 && this.aBoolean64) {
			return;
		}
		@Pc(19) int local19 = this.anIntArray71[Static84.anIntArray257[arg0]];
		if (local19 == 0) {
			return;
		}
		local19 -= 256;
		@Pc(55) Class4_Sub1_Sub9 local55;
		do {
			if (arg1) {
				local19++;
				if (Static75.anInt1999 <= local19) {
					local19 = 0;
				}
			} else {
				local19--;
				if (local19 < 0) {
					local19 = Static75.anInt1999 - 1;
				}
			}
			local55 = Static112.method1793(local19);
		} while (local55 == null || local55.aBoolean144 || (this.aBoolean64 ? 7 : 0) + arg0 != local55.anInt1524);
		this.anIntArray71[Static84.anIntArray257[arg0]] = local19 + 256;
		this.method437();
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)Lclient!p;")
	public Class4_Sub1_Sub3_Sub4 method439() {
		if (this.anInt611 != -1) {
			return Static14.method279(this.anInt611).method1429();
		}
		@Pc(28) boolean local28 = false;
		for (@Pc(30) int local30 = 0; local30 < 12; local30++) {
			@Pc(37) int local37 = this.anIntArray71[local30];
			if (local37 >= 256 && local37 < 512 && !Static112.method1793(local37 - 256).method1020()) {
				local28 = true;
			}
			if (local37 >= 512 && !Static123.method2000(local37 - 512).method980(this.aBoolean64)) {
				local28 = true;
			}
		}
		if (local28) {
			return null;
		}
		@Pc(87) Class4_Sub1_Sub3_Sub4[] local87 = new Class4_Sub1_Sub3_Sub4[12];
		@Pc(89) int local89 = 0;
		for (@Pc(91) int local91 = 0; local91 < 12; local91++) {
			@Pc(98) int local98 = this.anIntArray71[local91];
			@Pc(116) Class4_Sub1_Sub3_Sub4 local116;
			if (local98 >= 256 && local98 < 512) {
				local116 = Static112.method1793(local98 - 256).method1024();
				if (local116 != null) {
					local87[local89++] = local116;
				}
			}
			if (local98 >= 512) {
				local116 = Static123.method2000(local98 - 512).method986(this.aBoolean64);
				if (local116 != null) {
					local87[local89++] = local116;
				}
			}
		}
		@Pc(157) Class4_Sub1_Sub3_Sub4 local157 = new Class4_Sub1_Sub3_Sub4(local87, local89);
		for (@Pc(159) int local159 = 0; local159 < 5; local159++) {
			if (Static117.aShortArrayArray4[local159].length > this.anIntArray72[local159]) {
				local157.method1517(Static7.aShortArray1[local159], Static117.aShortArrayArray4[local159][this.anIntArray72[local159]]);
			}
			if (Static88.aShortArrayArray2[local159].length > this.anIntArray72[local159]) {
				local157.method1517(Static35.aShortArray2[local159], Static88.aShortArrayArray2[local159][this.anIntArray72[local159]]);
			}
		}
		return local157;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZI)V")
	public void method440(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anIntArray72[arg1];
		if (arg0) {
			local14++;
			if (local14 >= Static117.aShortArrayArray4[arg1].length) {
				local14 = 0;
			}
		} else {
			local14--;
			if (local14 < 0) {
				local14 = Static117.aShortArrayArray4[arg1].length - 1;
			}
		}
		this.anIntArray72[arg1] = local14;
		this.method437();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([II[IZB)V")
	public void method441(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static75.anInt1999; local16++) {
					@Pc(22) Class4_Sub1_Sub9 local22 = Static112.method1793(local16);
					if (local22 != null && !local22.aBoolean144 && local12 + (arg3 ? 7 : 0) == local22.anInt1524) {
						arg2[Static84.anIntArray257[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.anInt611 = arg1;
		this.anIntArray71 = arg2;
		this.anIntArray72 = arg0;
		this.aBoolean64 = arg3;
		this.method437();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!vc;ILclient!vc;II)Lclient!od;")
	public Class4_Sub1_Sub3_Sub3 method442(@OriginalArg(0) Class4_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub17 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt611 != -1) {
			return Static14.method279(this.anInt611).method1438(arg2, arg3, arg0, arg1);
		}
		@Pc(31) long local31 = this.aLong24;
		@Pc(34) int[] local34 = this.anIntArray71;
		if (arg0 != null && (arg0.anInt3001 >= 0 || arg0.anInt2987 >= 0)) {
			local34 = new int[12];
			for (@Pc(47) int local47 = 0; local47 < 12; local47++) {
				local34[local47] = this.anIntArray71[local47];
			}
			if (arg0.anInt3001 >= 0) {
				local31 += arg0.anInt3001 - this.anIntArray71[5] << 8;
				local34[5] = arg0.anInt3001;
			}
			if (arg0.anInt2987 >= 0) {
				local31 += arg0.anInt2987 - this.anIntArray71[3] << 16;
				local34[3] = arg0.anInt2987;
			}
		}
		@Pc(114) Class4_Sub1_Sub3_Sub3 local114 = (Class4_Sub1_Sub3_Sub3) Static33.aClass33_12.method998(local31);
		if (local114 == null) {
			@Pc(118) boolean local118 = false;
			for (@Pc(120) int local120 = 0; local120 < 12; local120++) {
				@Pc(126) int local126 = local34[local120];
				if (local126 >= 256 && local126 < 512 && !Static112.method1793(local126 - 256).method1017()) {
					local118 = true;
				}
				if (local126 >= 512 && !Static123.method2000(local126 - 512).method992(this.aBoolean64)) {
					local118 = true;
				}
			}
			if (local118) {
				if (this.aLong25 != -1L) {
					local114 = (Class4_Sub1_Sub3_Sub3) Static33.aClass33_12.method998(this.aLong25);
				}
				if (local114 == null) {
					return null;
				}
			}
			if (local114 == null) {
				@Pc(194) Class4_Sub1_Sub3_Sub4[] local194 = new Class4_Sub1_Sub3_Sub4[12];
				@Pc(196) int local196 = 0;
				for (@Pc(198) int local198 = 0; local198 < 12; local198++) {
					@Pc(204) int local204 = local34[local198];
					@Pc(218) Class4_Sub1_Sub3_Sub4 local218;
					if (local204 >= 256 && local204 < 512) {
						local218 = Static112.method1793(local204 - 256).method1022();
						if (local218 != null) {
							local194[local196++] = local218;
						}
					}
					if (local204 >= 512) {
						local218 = Static123.method2000(local204 - 512).method982(this.aBoolean64);
						if (local218 != null) {
							local194[local196++] = local218;
						}
					}
				}
				@Pc(259) Class4_Sub1_Sub3_Sub4 local259 = new Class4_Sub1_Sub3_Sub4(local194, local196);
				for (@Pc(261) int local261 = 0; local261 < 5; local261++) {
					if (this.anIntArray72[local261] < Static117.aShortArrayArray4[local261].length) {
						local259.method1517(Static7.aShortArray1[local261], Static117.aShortArrayArray4[local261][this.anIntArray72[local261]]);
					}
					if (this.anIntArray72[local261] < Static88.aShortArrayArray2[local261].length) {
						local259.method1517(Static35.aShortArray2[local261], Static88.aShortArrayArray2[local261][this.anIntArray72[local261]]);
					}
				}
				local114 = local259.method1531(64, 850, -30, -50, -30);
				Static33.aClass33_12.method997(local31, local114);
				this.aLong25 = local31;
			}
		}
		if (arg0 == null && arg2 == null) {
			return local114;
		}
		@Pc(351) Class4_Sub1_Sub3_Sub3 local351;
		if (arg0 != null && arg2 != null) {
			local351 = arg0.method1918(arg1, arg2, local114, arg3);
		} else if (arg0 == null) {
			local351 = arg2.method1920(local114, arg1);
		} else {
			local351 = arg0.method1920(local114, arg3);
		}
		return local351;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)I")
	public int method443() {
		return this.anInt611 == -1 ? (this.anIntArray71[0] << 15) + ((this.anIntArray72[0] << 25) + (this.anIntArray72[4] << 20) + (this.anIntArray71[8] << 10)) + (this.anIntArray71[11] << 5) + this.anIntArray71[1] : Static14.method279(this.anInt611).anInt2174 + 305419896;
	}
}
