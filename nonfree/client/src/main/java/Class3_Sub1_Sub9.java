import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class3_Sub1_Sub9 extends Class3_Sub1 {

	@OriginalMember(owner = "client!h", name = "ab", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!h", name = "bb", descriptor = "[I")
	public int[] anIntArray72;

	@OriginalMember(owner = "client!h", name = "cb", descriptor = "[I")
	public int[] anIntArray73;

	@OriginalMember(owner = "client!h", name = "Bb", descriptor = "[I")
	private int[] anIntArray74;

	@OriginalMember(owner = "client!h", name = "Fb", descriptor = "[I")
	private int[] anIntArray75;

	@OriginalMember(owner = "client!h", name = "Ob", descriptor = "[I")
	private int[] anIntArray76;

	@OriginalMember(owner = "client!h", name = "Vb", descriptor = "I")
	public int anInt1083;

	@OriginalMember(owner = "client!h", name = "hb", descriptor = "I")
	public int anInt1056 = -1;

	@OriginalMember(owner = "client!h", name = "X", descriptor = "I")
	private int anInt1050 = 0;

	@OriginalMember(owner = "client!h", name = "U", descriptor = "[Lclient!v;")
	public final Class62[] aClass62Array8 = new Class62[5];

	@OriginalMember(owner = "client!h", name = "tb", descriptor = "I")
	public int anInt1065 = -1;

	@OriginalMember(owner = "client!h", name = "gb", descriptor = "I")
	private int anInt1055 = -1;

	@OriginalMember(owner = "client!h", name = "rb", descriptor = "I")
	public int anInt1063 = -1;

	@OriginalMember(owner = "client!h", name = "ub", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!h", name = "Eb", descriptor = "I")
	public int anInt1070 = -1;

	@OriginalMember(owner = "client!h", name = "jb", descriptor = "Z")
	public boolean aBoolean54 = true;

	@OriginalMember(owner = "client!h", name = "yb", descriptor = "I")
	public int anInt1068 = 1;

	@OriginalMember(owner = "client!h", name = "xb", descriptor = "I")
	public int anInt1067 = -1;

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "Z")
	public boolean aBoolean53 = true;

	@OriginalMember(owner = "client!h", name = "Hb", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!h", name = "ob", descriptor = "I")
	public int anInt1061 = 1;

	@OriginalMember(owner = "client!h", name = "Ib", descriptor = "I")
	public int anInt1072 = 16;

	@OriginalMember(owner = "client!h", name = "Kb", descriptor = "Z")
	public boolean aBoolean60 = true;

	@OriginalMember(owner = "client!h", name = "vb", descriptor = "Z")
	public boolean aBoolean57 = false;

	@OriginalMember(owner = "client!h", name = "Db", descriptor = "I")
	private int anInt1069 = 0;

	@OriginalMember(owner = "client!h", name = "Lb", descriptor = "I")
	private int anInt1074 = 128;

	@OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
	public int anInt1044 = 0;

	@OriginalMember(owner = "client!h", name = "zb", descriptor = "Z")
	public boolean aBoolean58 = false;

	@OriginalMember(owner = "client!h", name = "S", descriptor = "I")
	private int anInt1046 = 128;

	@OriginalMember(owner = "client!h", name = "kb", descriptor = "I")
	private int anInt1058 = 0;

	@OriginalMember(owner = "client!h", name = "Nb", descriptor = "I")
	private int anInt1076 = 128;

	@OriginalMember(owner = "client!h", name = "pb", descriptor = "Lclient!v;")
	public Class62 aClass62_457 = Static70.aClass62_842;

	@OriginalMember(owner = "client!h", name = "Gb", descriptor = "I")
	public int anInt1071 = -1;

	@OriginalMember(owner = "client!h", name = "fb", descriptor = "I")
	public int anInt1054 = 0;

	@OriginalMember(owner = "client!h", name = "Rb", descriptor = "I")
	private int anInt1079 = -1;

	@OriginalMember(owner = "client!h", name = "lb", descriptor = "Z")
	public boolean aBoolean55 = false;

	@OriginalMember(owner = "client!h", name = "Jb", descriptor = "I")
	private int anInt1073 = 0;

	@OriginalMember(owner = "client!h", name = "ib", descriptor = "I")
	public int anInt1057 = 0;

	@OriginalMember(owner = "client!h", name = "Pb", descriptor = "I")
	public int anInt1077 = 0;

	@OriginalMember(owner = "client!h", name = "Xb", descriptor = "Z")
	public boolean aBoolean61 = false;

	@OriginalMember(owner = "client!h", name = "Mb", descriptor = "I")
	private int anInt1075 = 0;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(B)Z")
	public boolean method643() {
		if (this.anIntArray72 == null) {
			return this.anInt1071 != -1 || this.anIntArray73 != null;
		}
		for (@Pc(28) int local28 = 0; local28 < this.anIntArray72.length; local28++) {
			if (this.anIntArray72[local28] != -1) {
				@Pc(43) Class3_Sub1_Sub9 local43 = Static10.method1322(this.anIntArray72[local28]);
				if (local43.anInt1071 != -1 || local43.anIntArray73 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BIIIILclient!oe;III)Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 method644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub1_Sub11 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) long local16;
		if (this.anIntArray76 == null) {
			local16 = arg3 + (this.anInt1083 << 10);
		} else {
			local16 = (arg2 << 3) + (this.anInt1083 << 10) + arg3;
		}
		@Pc(36) Class3_Sub1_Sub3_Sub3 local36 = (Class3_Sub1_Sub3_Sub3) Static37.aClass34_13.method764(local16);
		if (local36 == null) {
			local36 = this.method645(arg3, true, arg2, true);
			if (local36 == null) {
				return null;
			}
			Static37.aClass34_13.method765(local16, local36);
		}
		if (arg4 == null && !this.aBoolean61) {
			return local36;
		}
		if (arg4 == null) {
			local36 = local36.method950(true);
		} else {
			local36 = arg4.method1217(arg7, arg3, local36);
		}
		if (this.aBoolean61) {
			@Pc(95) int local95 = (arg6 + arg5 + arg1 + arg0) / 4;
			for (@Pc(97) int local97 = 0; local97 < local36.anInt1599; local97++) {
				@Pc(104) int local104 = local36.anIntArray139[local97];
				@Pc(109) int local109 = local36.anIntArray126[local97];
				@Pc(122) int local122 = (arg6 - arg5) * (local109 - -64) / 128 + arg5;
				@Pc(134) int local134 = (local109 + 64) * (arg1 - arg0) / 128 + arg0;
				@Pc(147) int local147 = local122 + (local104 + 64) * (local134 - local122) / 128;
				local36.anIntArray137[local97] += local147 - local95;
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IZIIZ)Lclient!lb;")
	private Class3_Sub1_Sub3_Sub3 method645(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class3_Sub1_Sub3_Sub3 local7 = null;
		@Pc(36) boolean local36;
		@Pc(26) int local26;
		@Pc(38) int local38;
		@Pc(44) int local44;
		if (this.anIntArray76 == null) {
			if (arg2 != 10) {
				return null;
			}
			if (this.anIntArray75 == null) {
				return null;
			}
			local26 = this.anIntArray75.length;
			local36 = this.aBoolean56 ^ arg0 > 3;
			for (local38 = 0; local38 < local26; local38++) {
				local44 = this.anIntArray75[local38];
				if (local36) {
					local44 += 65536;
				}
				local7 = (Class3_Sub1_Sub3_Sub3) Static9.aClass34_24.method764((long) local44);
				if (local7 == null) {
					local7 = Static57.method949(Static33.aClass42_27, local44 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local36) {
						local7.method961();
					}
					Static9.aClass34_24.method765((long) local44, local7);
				}
				if (local26 > 1) {
					Static106.aClass3_Sub1_Sub3_Sub3Array1[local38] = local7;
				}
			}
			if (local26 > 1) {
				local7 = new Class3_Sub1_Sub3_Sub3(Static106.aClass3_Sub1_Sub3_Sub3Array1, local26);
			}
		} else {
			@Pc(107) int local107 = -1;
			for (local26 = 0; local26 < this.anIntArray76.length; local26++) {
				if (this.anIntArray76[local26] == arg2) {
					local107 = local26;
					break;
				}
			}
			if (local107 == -1) {
				return null;
			}
			@Pc(143) boolean local143 = arg0 > 3 ^ this.aBoolean56;
			local38 = this.anIntArray75[local107];
			if (local143) {
				local38 += 65536;
			}
			local7 = (Class3_Sub1_Sub3_Sub3) Static9.aClass34_24.method764((long) local38);
			if (local7 == null) {
				local7 = Static57.method949(Static33.aClass42_27, local38 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local143) {
					local7.method961();
				}
				Static9.aClass34_24.method765((long) local38, local7);
			}
		}
		if (this.anInt1074 == 128 && this.anInt1076 == 128 && this.anInt1046 == 128) {
			local36 = false;
		} else {
			local36 = true;
		}
		@Pc(223) boolean local223;
		if (this.anInt1073 == 0 && this.anInt1075 == 0 && this.anInt1069 == 0) {
			local223 = false;
		} else {
			local223 = true;
		}
		@Pc(248) Class3_Sub1_Sub3_Sub3 local248 = new Class3_Sub1_Sub3_Sub3(local7, arg0 == 0 && !local36 && !local223, this.anIntArray74 == null, true);
		@Pc(252) int local252 = arg0 & 0x3;
		if (local252 == 1) {
			local248.method960();
		} else if (local252 == 2) {
			local248.method966();
		} else if (local252 == 3) {
			local248.method971();
		}
		if (this.anIntArray74 != null) {
			for (local44 = 0; local44 < this.anIntArray74.length; local44++) {
				local248.method965(this.anIntArray74[local44], this.anIntArray71[local44]);
			}
		}
		if (local36) {
			local248.method957(this.anInt1074, this.anInt1076, this.anInt1046);
		}
		if (local223) {
			local248.method964(this.anInt1073, this.anInt1075, this.anInt1069);
		}
		if (arg1) {
			local248.method945();
		}
		local248.method953(this.anInt1050 + 64, 768 - -(this.anInt1058 * 5), -50, -10, -50, arg3);
		return local248;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!kd;Z)V")
	private void method647(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		@Pc(23) int local23;
		@Pc(49) int local49;
		if (arg0 == 1) {
			local23 = arg1.method1803();
			if (local23 > 0) {
				if (this.anIntArray75 == null || Static41.aBoolean68) {
					this.anIntArray75 = new int[local23];
					this.anIntArray76 = new int[local23];
					for (local49 = 0; local49 < local23; local49++) {
						this.anIntArray75[local49] = arg1.method1789();
						this.anIntArray76[local49] = arg1.method1803();
					}
				} else {
					arg1.anInt2704 += local23 * 3;
				}
			}
		} else if (arg0 == 2) {
			this.aClass62_457 = arg1.method1773();
		} else if (arg0 == 5) {
			local23 = arg1.method1803();
			if (local23 > 0) {
				if (this.anIntArray75 == null || Static41.aBoolean68) {
					this.anIntArray75 = new int[local23];
					this.anIntArray76 = null;
					for (local49 = 0; local49 < local23; local49++) {
						this.anIntArray75[local49] = arg1.method1789();
					}
				} else {
					arg1.anInt2704 += local23 * 2;
				}
			}
		} else if (arg0 == 14) {
			this.anInt1068 = arg1.method1803();
		} else if (arg0 == 15) {
			this.anInt1061 = arg1.method1803();
		} else if (arg0 == 17) {
			this.aBoolean60 = false;
		} else if (arg0 == 18) {
			this.aBoolean54 = false;
		} else if (arg0 == 19) {
			this.anInt1063 = arg1.method1803();
		} else if (arg0 == 21) {
			this.aBoolean61 = true;
		} else if (arg0 == 22) {
			this.aBoolean59 = true;
		} else if (arg0 == 23) {
			this.aBoolean57 = true;
		} else if (arg0 == 24) {
			this.anInt1070 = arg1.method1789();
			if (this.anInt1070 == 65535) {
				this.anInt1070 = -1;
			}
		} else if (arg0 == 28) {
			this.anInt1072 = arg1.method1803();
		} else if (arg0 == 29) {
			this.anInt1050 = arg1.method1765();
		} else if (arg0 == 39) {
			this.anInt1058 = arg1.method1765() * 5;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass62Array8[arg0 - 30] = arg1.method1773();
			if (this.aClass62Array8[arg0 - 30].method1680(Static72.aClass62_861)) {
				this.aClass62Array8[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local23 = arg1.method1803();
			this.anIntArray71 = new int[local23];
			this.anIntArray74 = new int[local23];
			for (local49 = 0; local49 < local23; local49++) {
				this.anIntArray74[local49] = arg1.method1789();
				this.anIntArray71[local49] = arg1.method1789();
			}
		} else if (arg0 == 60) {
			this.anInt1067 = arg1.method1789();
		} else if (arg0 == 62) {
			this.aBoolean56 = true;
		} else if (arg0 == 64) {
			this.aBoolean53 = false;
		} else if (arg0 == 65) {
			this.anInt1074 = arg1.method1789();
		} else if (arg0 == 66) {
			this.anInt1076 = arg1.method1789();
		} else if (arg0 == 67) {
			this.anInt1046 = arg1.method1789();
		} else if (arg0 == 68) {
			this.anInt1065 = arg1.method1789();
		} else if (arg0 == 69) {
			this.anInt1057 = arg1.method1803();
		} else if (arg0 == 70) {
			this.anInt1073 = arg1.method1784();
		} else if (arg0 == 71) {
			this.anInt1075 = arg1.method1784();
		} else if (arg0 == 72) {
			this.anInt1069 = arg1.method1784();
		} else if (arg0 == 73) {
			this.aBoolean58 = true;
		} else if (arg0 == 74) {
			this.aBoolean55 = true;
		} else if (arg0 == 75) {
			this.anInt1056 = arg1.method1803();
		} else if (arg0 == 77) {
			this.anInt1079 = arg1.method1789();
			if (this.anInt1079 == 65535) {
				this.anInt1079 = -1;
			}
			this.anInt1055 = arg1.method1789();
			if (this.anInt1055 == 65535) {
				this.anInt1055 = -1;
			}
			local23 = arg1.method1803();
			this.anIntArray72 = new int[local23 + 1];
			for (local49 = 0; local49 <= local23; local49++) {
				this.anIntArray72[local49] = arg1.method1789();
				if (this.anIntArray72[local49] == 65535) {
					this.anIntArray72[local49] = -1;
				}
			}
		} else if (arg0 == 78) {
			this.anInt1071 = arg1.method1789();
			this.anInt1054 = arg1.method1803();
		} else if (arg0 == 79) {
			this.anInt1044 = arg1.method1789();
			this.anInt1077 = arg1.method1789();
			this.anInt1054 = arg1.method1803();
			local23 = arg1.method1803();
			this.anIntArray73 = new int[local23];
			for (local49 = 0; local49 < local23; local49++) {
				this.anIntArray73[local49] = arg1.method1789();
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Z")
	public boolean method648(@OriginalArg(1) int arg0) {
		if (this.anIntArray76 != null) {
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray76.length; local23++) {
				if (arg0 == this.anIntArray76[local23]) {
					return Static33.aClass42_27.method1493(0, this.anIntArray75[local23] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray75 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(68) boolean local68 = true;
			for (@Pc(70) int local70 = 0; local70 < this.anIntArray75.length; local70++) {
				local68 &= Static33.aClass42_27.method1493(0, this.anIntArray75[local70] & 0xFFFF);
			}
			return local68;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "(I)Z")
	public boolean method650() {
		if (this.anIntArray75 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray75.length; local20++) {
			local12 &= Static33.aClass42_27.method1493(0, this.anIntArray75[local20] & 0xFFFF);
		}
		return local12;
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(B)V")
	public void method651() {
		if (this.anInt1063 == -1) {
			this.anInt1063 = 0;
			if (this.anIntArray75 != null && (this.anIntArray76 == null || this.anIntArray76[0] == 10)) {
				this.anInt1063 = 1;
			}
			for (@Pc(33) int local33 = 0; local33 < 5; local33++) {
				if (this.aClass62Array8[local33] != null) {
					this.anInt1063 = 1;
				}
			}
		}
		if (this.anInt1056 == -1) {
			this.anInt1056 = this.aBoolean60 ? 1 : 0;
		}
	}

	@OriginalMember(owner = "client!h", name = "i", descriptor = "(I)Lclient!h;")
	public Class3_Sub1_Sub9 method653() {
		@Pc(5) int local5 = -1;
		if (this.anInt1079 != -1) {
			local5 = Static100.method1585(this.anInt1079);
		} else if (this.anInt1055 != -1) {
			local5 = Static62.anIntArray174[this.anInt1055];
		}
		return local5 < 0 || local5 >= this.anIntArray72.length || this.anIntArray72[local5] == -1 ? null : Static10.method1322(this.anIntArray72[local5]);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BLclient!kd;)V")
	public void method654(@OriginalArg(1) Class3_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1803();
			if (local5 == 0) {
				return;
			}
			this.method647(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 method656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) long local22;
		if (this.anIntArray76 == null) {
			local22 = arg5 + (this.anInt1083 << 10);
		} else {
			local22 = arg5 + (arg3 << 3) + (this.anInt1083 << 10);
		}
		@Pc(42) Class3_Sub1_Sub3_Sub3 local42 = (Class3_Sub1_Sub3_Sub3) Static13.aClass34_5.method764(local22);
		if (local42 == null) {
			local42 = this.method645(arg5, false, arg3, !this.aBoolean59);
			if (local42 == null) {
				return null;
			}
			Static13.aClass34_5.method765(local22, local42);
		}
		if (this.aBoolean61 || this.aBoolean59) {
			local42 = new Class3_Sub1_Sub3_Sub3(local42, this.aBoolean61, this.aBoolean59);
		}
		if (this.aBoolean61) {
			@Pc(96) int local96 = (arg1 + arg4 + arg0 + arg2) / 4;
			for (@Pc(98) int local98 = 0; local98 < local42.anInt1599; local98++) {
				@Pc(105) int local105 = local42.anIntArray139[local98];
				@Pc(110) int local110 = local42.anIntArray126[local98];
				@Pc(123) int local123 = (arg2 - arg1) * (local110 + 64) / 128 + arg1;
				@Pc(136) int local136 = (arg0 - arg4) * (local110 + 64) / 128 + arg4;
				@Pc(149) int local149 = local136 + (local123 - local136) * (local105 + 64) / 128;
				local42.anIntArray137[local98] += local149 - local96;
			}
		}
		return local42;
	}
}
