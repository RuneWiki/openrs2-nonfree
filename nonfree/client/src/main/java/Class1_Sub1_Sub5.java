import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!df", name = "cb", descriptor = "I")
	public int anInt903;

	@OriginalMember(owner = "client!df", name = "ib", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!df", name = "nb", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!df", name = "xb", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!df", name = "Ab", descriptor = "[I")
	private int[] anIntArray131;

	@OriginalMember(owner = "client!df", name = "Jb", descriptor = "[I")
	private int[] anIntArray132;

	@OriginalMember(owner = "client!df", name = "db", descriptor = "I")
	private int anInt904 = -1;

	@OriginalMember(owner = "client!df", name = "bb", descriptor = "I")
	public int anInt902 = -1;

	@OriginalMember(owner = "client!df", name = "W", descriptor = "I")
	private int anInt898 = 0;

	@OriginalMember(owner = "client!df", name = "pb", descriptor = "I")
	public int anInt911 = -1;

	@OriginalMember(owner = "client!df", name = "gb", descriptor = "I")
	private int anInt906 = 0;

	@OriginalMember(owner = "client!df", name = "eb", descriptor = "Lclient!kd;")
	public Class39 aClass39_434 = Static118.aClass39_1410;

	@OriginalMember(owner = "client!df", name = "Z", descriptor = "Z")
	public boolean aBoolean74 = false;

	@OriginalMember(owner = "client!df", name = "sb", descriptor = "I")
	public int anInt913 = -1;

	@OriginalMember(owner = "client!df", name = "mb", descriptor = "I")
	public int anInt910 = 1;

	@OriginalMember(owner = "client!df", name = "wb", descriptor = "I")
	private int anInt916 = 128;

	@OriginalMember(owner = "client!df", name = "ob", descriptor = "Z")
	public boolean aBoolean76 = true;

	@OriginalMember(owner = "client!df", name = "X", descriptor = "I")
	public int anInt899 = -1;

	@OriginalMember(owner = "client!df", name = "Bb", descriptor = "I")
	public int anInt919 = -1;

	@OriginalMember(owner = "client!df", name = "Cb", descriptor = "I")
	public int anInt920 = -1;

	@OriginalMember(owner = "client!df", name = "zb", descriptor = "I")
	public int anInt918 = -1;

	@OriginalMember(owner = "client!df", name = "ub", descriptor = "[Lclient!kd;")
	public final Class39[] aClass39Array9 = new Class39[5];

	@OriginalMember(owner = "client!df", name = "Lb", descriptor = "I")
	private int anInt926 = -1;

	@OriginalMember(owner = "client!df", name = "qb", descriptor = "I")
	public int anInt912 = 32;

	@OriginalMember(owner = "client!df", name = "Kb", descriptor = "I")
	public int anInt925 = -1;

	@OriginalMember(owner = "client!df", name = "Nb", descriptor = "Z")
	public boolean aBoolean77 = true;

	@OriginalMember(owner = "client!df", name = "lb", descriptor = "Z")
	public boolean aBoolean75 = true;

	@OriginalMember(owner = "client!df", name = "Hb", descriptor = "I")
	private int anInt923 = 128;

	@OriginalMember(owner = "client!df", name = "fb", descriptor = "I")
	public int anInt905 = -1;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)Lclient!df;")
	public Class1_Sub1_Sub5 method514() {
		@Pc(5) int local5 = -1;
		if (this.anInt904 != -1) {
			local5 = Static18.method360(this.anInt904);
		} else if (this.anInt926 != -1) {
			local5 = Static44.anIntArray175[this.anInt926];
		}
		return local5 < 0 || local5 >= this.anIntArray130.length || this.anIntArray130[local5] == -1 ? null : Static120.method2132(this.anIntArray130[local5]);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!qc;Z)V")
	public void method517(@OriginalArg(0) Class1_Sub18 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2169();
			if (local7 == 0) {
				return;
			}
			this.method520(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!f;ILclient!f;)Lclient!na;")
	public Class1_Sub1_Sub2_Sub7 method518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub7 arg2, @OriginalArg(4) Class1_Sub1_Sub7 arg3) {
		if (this.anIntArray130 != null) {
			@Pc(20) Class1_Sub1_Sub5 local20 = this.method514();
			return local20 == null ? null : local20.method518(arg0, arg1, arg2, arg3);
		}
		@Pc(40) Class1_Sub1_Sub2_Sub7 local40 = (Class1_Sub1_Sub2_Sub7) Static40.aClass33_13.method1038((long) this.anInt903);
		if (local40 == null) {
			@Pc(44) boolean local44 = false;
			for (@Pc(46) int local46 = 0; local46 < this.anIntArray131.length; local46++) {
				if (!Static72.aClass62_21.method2019(this.anIntArray131[local46], 0)) {
					local44 = true;
				}
			}
			if (local44) {
				return null;
			}
			@Pc(78) Class1_Sub1_Sub2_Sub5[] local78 = new Class1_Sub1_Sub2_Sub5[this.anIntArray131.length];
			for (@Pc(80) int local80 = 0; local80 < this.anIntArray131.length; local80++) {
				local78[local80] = Static60.method1097(Static72.aClass62_21, this.anIntArray131[local80]);
			}
			@Pc(108) Class1_Sub1_Sub2_Sub5 local108;
			if (local78.length == 1) {
				local108 = local78[0];
			} else {
				local108 = new Class1_Sub1_Sub2_Sub5(local78, local78.length);
			}
			if (this.aShortArray1 != null) {
				for (@Pc(122) int local122 = 0; local122 < this.aShortArray1.length; local122++) {
					local108.method1104(this.aShortArray1[local122], this.aShortArray2[local122]);
				}
			}
			local40 = local108.method1101(this.anInt898 + 64, 850 - -this.anInt906, -30, -50, -30);
			Static40.aClass33_13.method1042(local40, (long) this.anInt903);
		}
		@Pc(178) Class1_Sub1_Sub2_Sub7 local178;
		if (arg2 != null && arg3 != null) {
			local178 = arg2.method628(arg3, arg1, local40, arg0);
		} else if (arg2 != null) {
			local178 = arg2.method626(local40, arg1);
		} else if (arg3 == null) {
			local178 = local40.method1380(true);
		} else {
			local178 = arg3.method626(local40, arg0);
		}
		if (this.anInt923 != 128 || this.anInt916 != 128) {
			local178.method1383(this.anInt923, this.anInt916, this.anInt923);
		}
		return local178;
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
	public void method519() {
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IBLclient!qc;)V")
	private void method520(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub18 arg1) {
		@Pc(161) int local161;
		@Pc(169) int local169;
		if (arg0 == 1) {
			local161 = arg1.method2169();
			this.anIntArray131 = new int[local161];
			for (local169 = 0; local169 < local161; local169++) {
				this.anIntArray131[local169] = arg1.method2156();
			}
		} else if (arg0 == 2) {
			this.aClass39_434 = arg1.method2139();
		} else if (arg0 == 12) {
			this.anInt910 = arg1.method2169();
		} else if (arg0 == 13) {
			this.anInt918 = arg1.method2156();
		} else if (arg0 == 14) {
			this.anInt905 = arg1.method2156();
		} else if (arg0 == 15) {
			this.anInt913 = arg1.method2156();
		} else if (arg0 == 16) {
			this.anInt911 = arg1.method2156();
		} else if (arg0 == 17) {
			this.anInt905 = arg1.method2156();
			this.anInt902 = arg1.method2156();
			this.anInt925 = arg1.method2156();
			this.anInt899 = arg1.method2156();
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass39Array9[arg0 - 30] = arg1.method2139();
			if (this.aClass39Array9[arg0 - 30].method1158(Static79.aClass39_1228)) {
				this.aClass39Array9[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local161 = arg1.method2169();
			this.aShortArray2 = new short[local161];
			this.aShortArray1 = new short[local161];
			for (local169 = 0; local169 < local161; local169++) {
				this.aShortArray1[local169] = (short) arg1.method2156();
				this.aShortArray2[local169] = (short) arg1.method2156();
			}
		} else if (arg0 == 60) {
			local161 = arg1.method2169();
			this.anIntArray132 = new int[local161];
			for (local169 = 0; local169 < local161; local169++) {
				this.anIntArray132[local169] = arg1.method2156();
			}
		} else if (arg0 == 93) {
			this.aBoolean75 = false;
		} else if (arg0 == 95) {
			this.anInt920 = arg1.method2156();
		} else if (arg0 == 97) {
			this.anInt923 = arg1.method2156();
		} else if (arg0 == 98) {
			this.anInt916 = arg1.method2156();
		} else if (arg0 == 99) {
			this.aBoolean74 = true;
		} else if (arg0 == 100) {
			this.anInt898 = arg1.method2178();
		} else if (arg0 == 101) {
			this.anInt906 = arg1.method2178() * 5;
		} else if (arg0 == 102) {
			this.anInt919 = arg1.method2156();
		} else if (arg0 == 103) {
			this.anInt912 = arg1.method2156();
		} else if (arg0 == 106) {
			this.anInt904 = arg1.method2156();
			if (this.anInt904 == 65535) {
				this.anInt904 = -1;
			}
			this.anInt926 = arg1.method2156();
			if (this.anInt926 == 65535) {
				this.anInt926 = -1;
			}
			local161 = arg1.method2169();
			this.anIntArray130 = new int[local161 + 1];
			for (local169 = 0; local169 <= local161; local169++) {
				this.anIntArray130[local169] = arg1.method2156();
				if (this.anIntArray130[local169] == 65535) {
					this.anIntArray130[local169] = -1;
				}
			}
		} else if (arg0 == 107) {
			this.aBoolean76 = false;
		} else if (arg0 == 109) {
			this.aBoolean77 = false;
		}
	}

	@OriginalMember(owner = "client!df", name = "g", descriptor = "(I)Z")
	public boolean method523() {
		if (this.anIntArray130 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt904 != -1) {
			local10 = Static18.method360(this.anInt904);
		} else if (this.anInt926 != -1) {
			local10 = Static44.anIntArray175[this.anInt926];
		}
		return local10 >= 0 && this.anIntArray130.length > local10 && this.anIntArray130[local10] != -1;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)Lclient!je;")
	public Class1_Sub1_Sub2_Sub5 method524() {
		if (this.anIntArray130 != null) {
			@Pc(12) Class1_Sub1_Sub5 local12 = this.method514();
			return local12 == null ? null : local12.method524();
		} else if (this.anIntArray132 == null) {
			return null;
		} else {
			@Pc(27) boolean local27 = false;
			for (@Pc(29) int local29 = 0; local29 < this.anIntArray132.length; local29++) {
				if (!Static72.aClass62_21.method2019(this.anIntArray132[local29], 0)) {
					local27 = true;
				}
			}
			if (local27) {
				return null;
			}
			@Pc(61) Class1_Sub1_Sub2_Sub5[] local61 = new Class1_Sub1_Sub2_Sub5[this.anIntArray132.length];
			for (@Pc(63) int local63 = 0; local63 < this.anIntArray132.length; local63++) {
				local61[local63] = Static60.method1097(Static72.aClass62_21, this.anIntArray132[local63]);
			}
			@Pc(89) Class1_Sub1_Sub2_Sub5 local89;
			if (local61.length == 1) {
				local89 = local61[0];
			} else {
				local89 = new Class1_Sub1_Sub2_Sub5(local61, local61.length);
			}
			if (this.aShortArray1 != null) {
				for (@Pc(103) int local103 = 0; local103 < this.aShortArray1.length; local103++) {
					local89.method1104(this.aShortArray1[local103], this.aShortArray2[local103]);
				}
			}
			return local89;
		}
	}
}
