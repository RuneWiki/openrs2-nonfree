import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class26 {

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "J")
	private long aLong34;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Z")
	public boolean aBoolean57;

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!ff", name = "o", descriptor = "[I")
	private int[] anIntArray110;

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "J")
	private long aLong35;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZZI)V")
	public void method623(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 && this.aBoolean57) {
			return;
		}
		@Pc(21) int local21 = this.anIntArray109[Static27.anIntArray406[arg1]];
		if (local21 == 0) {
			return;
		}
		local21 -= 256;
		@Pc(49) Class4_Sub4_Sub2 local49;
		do {
			if (arg0) {
				local21++;
				if (local21 >= Static20.anInt446) {
					local21 = 0;
				}
			} else {
				local21--;
				if (local21 < 0) {
					local21 = Static20.anInt446 - 1;
				}
			}
			local49 = Static117.method1780(local21);
		} while (local49 == null || local49.aBoolean46 || local49.anInt557 != (this.aBoolean57 ? 7 : 0) + arg1);
		this.anIntArray109[Static27.anIntArray406[arg1]] = local21 + 256;
		this.method624();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	private void method624() {
		@Pc(8) long local8 = this.aLong35;
		this.aLong35 = 0L;
		@Pc(16) int local16 = this.anIntArray109[9];
		@Pc(21) int local21 = this.anIntArray109[5];
		this.anIntArray109[5] = local16;
		this.anIntArray109[9] = local21;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong35 <<= 0x4;
			if (this.anIntArray109[local33] >= 256) {
				this.aLong35 += this.anIntArray109[local33] - 256;
			}
		}
		if (this.anIntArray109[0] >= 256) {
			this.aLong35 += this.anIntArray109[0] - 256 >> 4;
		}
		if (this.anIntArray109[1] >= 256) {
			this.aLong35 += this.anIntArray109[1] - 256 >> 8;
		}
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			this.aLong35 <<= 0x3;
			this.aLong35 += this.anIntArray110[local109];
		}
		this.anIntArray109[5] = local21;
		this.anIntArray109[9] = local16;
		this.aLong35 <<= 0x1;
		this.aLong35 += this.aBoolean57 ? 1 : 0;
		if (local8 != 0L && local8 != this.aLong35) {
			Static29.aClass72_11.method1784(local8);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ne;I)V")
	public void method625(@OriginalArg(0) Class4_Sub10 arg0) {
		arg0.method600(this.aBoolean57 ? 1 : 0);
		@Pc(25) int local25;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local25 = this.anIntArray109[Static27.anIntArray406[local16]];
			if (local25 == 0) {
				arg0.method600(-1);
			} else {
				arg0.method600(local25 - 256);
			}
		}
		for (local25 = 0; local25 < 5; local25++) {
			arg0.method600(this.anIntArray110[local25]);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)Lclient!sd;")
	public Class4_Sub4_Sub3_Sub5 method628() {
		if (this.anInt971 != -1) {
			return Static88.method1465(this.anInt971).method1126();
		}
		@Pc(24) boolean local24 = false;
		for (@Pc(26) int local26 = 0; local26 < 12; local26++) {
			@Pc(33) int local33 = this.anIntArray109[local26];
			if (local33 >= 256 && local33 < 512 && !Static117.method1780(local33 - 256).method366()) {
				local24 = true;
			}
			if (local33 >= 512 && !Static61.method1040(local33 - 512).method865(this.aBoolean57)) {
				local24 = true;
			}
		}
		if (local24) {
			return null;
		}
		@Pc(79) Class4_Sub4_Sub3_Sub5[] local79 = new Class4_Sub4_Sub3_Sub5[12];
		@Pc(81) int local81 = 0;
		for (@Pc(83) int local83 = 0; local83 < 12; local83++) {
			@Pc(90) int local90 = this.anIntArray109[local83];
			@Pc(108) Class4_Sub4_Sub3_Sub5 local108;
			if (local90 >= 256 && local90 < 512) {
				local108 = Static117.method1780(local90 - 256).method369();
				if (local108 != null) {
					local79[local81++] = local108;
				}
			}
			if (local90 >= 512) {
				local108 = Static61.method1040(local90 - 512).method864(this.aBoolean57);
				if (local108 != null) {
					local79[local81++] = local108;
				}
			}
		}
		@Pc(149) Class4_Sub4_Sub3_Sub5 local149 = new Class4_Sub4_Sub3_Sub5(local79, local81);
		for (@Pc(151) int local151 = 0; local151 < 5; local151++) {
			if (this.anIntArray110[local151] < Static106.aShortArrayArray5[local151].length) {
				local149.method1657(Static74.aShortArray17[local151], Static106.aShortArrayArray5[local151][this.anIntArray110[local151]]);
			}
			if (this.anIntArray110[local151] < Static13.aShortArrayArray3[local151].length) {
				local149.method1657(Static82.aShortArray19[local151], Static13.aShortArrayArray3[local151][this.anIntArray110[local151]]);
			}
		}
		return local149;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZLclient!kc;Lclient!kc;II)Lclient!u;")
	public Class4_Sub4_Sub3_Sub7 method629(@OriginalArg(1) Class4_Sub4_Sub9 arg0, @OriginalArg(2) Class4_Sub4_Sub9 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInt971 != -1) {
			return Static88.method1465(this.anInt971).method1132(arg3, arg2, arg0, arg1);
		}
		@Pc(24) long local24 = this.aLong35;
		@Pc(27) int[] local27 = this.anIntArray109;
		if (arg1 != null && (arg1.anInt1561 >= 0 || arg1.anInt1558 >= 0)) {
			local27 = new int[12];
			for (@Pc(43) int local43 = 0; local43 < 12; local43++) {
				local27[local43] = this.anIntArray109[local43];
			}
			if (arg1.anInt1561 >= 0) {
				local24 += arg1.anInt1561 - this.anIntArray109[5] << 8;
				local27[5] = arg1.anInt1561;
			}
			if (arg1.anInt1558 >= 0) {
				local24 += arg1.anInt1558 - this.anIntArray109[3] << 16;
				local27[3] = arg1.anInt1558;
			}
		}
		@Pc(108) Class4_Sub4_Sub3_Sub7 local108 = (Class4_Sub4_Sub3_Sub7) Static29.aClass72_11.method1781(local24);
		if (local108 == null) {
			@Pc(112) boolean local112 = false;
			for (@Pc(114) int local114 = 0; local114 < 12; local114++) {
				@Pc(120) int local120 = local27[local114];
				if (local120 >= 256 && local120 < 512 && !Static117.method1780(local120 - 256).method368()) {
					local112 = true;
				}
				if (local120 >= 512 && !Static61.method1040(local120 - 512).method853(this.aBoolean57)) {
					local112 = true;
				}
			}
			if (local112) {
				if (this.aLong34 != -1L) {
					local108 = (Class4_Sub4_Sub3_Sub7) Static29.aClass72_11.method1781(this.aLong34);
				}
				if (local108 == null) {
					return null;
				}
			}
			if (local108 == null) {
				@Pc(180) Class4_Sub4_Sub3_Sub5[] local180 = new Class4_Sub4_Sub3_Sub5[12];
				@Pc(182) int local182 = 0;
				for (@Pc(184) int local184 = 0; local184 < 12; local184++) {
					@Pc(190) int local190 = local27[local184];
					@Pc(206) Class4_Sub4_Sub3_Sub5 local206;
					if (local190 >= 256 && local190 < 512) {
						local206 = Static117.method1780(local190 - 256).method371();
						if (local206 != null) {
							local180[local182++] = local206;
						}
					}
					if (local190 >= 512) {
						local206 = Static61.method1040(local190 - 512).method860(this.aBoolean57);
						if (local206 != null) {
							local180[local182++] = local206;
						}
					}
				}
				@Pc(243) Class4_Sub4_Sub3_Sub5 local243 = new Class4_Sub4_Sub3_Sub5(local180, local182);
				for (@Pc(245) int local245 = 0; local245 < 5; local245++) {
					if (Static106.aShortArrayArray5[local245].length > this.anIntArray110[local245]) {
						local243.method1657(Static74.aShortArray17[local245], Static106.aShortArrayArray5[local245][this.anIntArray110[local245]]);
					}
					if (this.anIntArray110[local245] < Static13.aShortArrayArray3[local245].length) {
						local243.method1657(Static82.aShortArray19[local245], Static13.aShortArrayArray3[local245][this.anIntArray110[local245]]);
					}
				}
				local108 = local243.method1652(64, 850, -30, -50, -30);
				Static29.aClass72_11.method1783(local108, local24);
				this.aLong34 = local24;
			}
		}
		if (arg1 == null && arg0 == null) {
			return local108;
		}
		@Pc(345) Class4_Sub4_Sub3_Sub7 local345;
		if (arg1 != null && arg0 != null) {
			local345 = arg1.method1027(arg3, arg0, local108, arg2);
		} else if (arg1 == null) {
			local345 = arg0.method1035(arg3, local108);
		} else {
			local345 = arg1.method1035(arg2, local108);
		}
		return local345;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIZ)V")
	public void method630(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) int local11 = this.anIntArray110[arg0];
		if (arg1) {
			local11++;
			if (Static106.aShortArrayArray5[arg0].length <= local11) {
				local11 = 0;
			}
		} else {
			local11--;
			if (local11 < 0) {
				local11 = Static106.aShortArrayArray5[arg0].length - 1;
			}
		}
		this.anIntArray110[arg0] = local11;
		this.method624();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)V")
	public void method631(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean57) {
			this.method633(this.anIntArray110, -1, null, arg0);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([II[IZZ)V")
	public void method633(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) boolean arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static20.anInt446; local16++) {
					@Pc(22) Class4_Sub4_Sub2 local22 = Static117.method1780(local16);
					if (local22 != null && !local22.aBoolean46 && local12 + (arg3 ? 7 : 0) == local22.anInt557) {
						arg2[Static27.anIntArray406[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray109 = arg2;
		this.anIntArray110 = arg0;
		this.anInt971 = arg1;
		this.aBoolean57 = arg3;
		this.method624();
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)I")
	public int method634() {
		return this.anInt971 == -1 ? (this.anIntArray109[11] << 5) + (this.anIntArray110[0] << 25) + (this.anIntArray110[4] << 20) + (this.anIntArray109[0] << 15) + (this.anIntArray109[8] << 10) + this.anIntArray109[1] : Static88.method1465(this.anInt971).anInt1709 + 305419896;
	}
}
