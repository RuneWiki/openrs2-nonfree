import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!be", name = "P", descriptor = "[I")
	public int[] anIntArray24;

	@OriginalMember(owner = "client!be", name = "Q", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!be", name = "rb", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!be", name = "Ab", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!be", name = "Rb", descriptor = "I")
	public int anInt295;

	@OriginalMember(owner = "client!be", name = "Tb", descriptor = "[I")
	public int[] anIntArray28;

	@OriginalMember(owner = "client!be", name = "Wb", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!be", name = "O", descriptor = "I")
	private int anInt261 = 0;

	@OriginalMember(owner = "client!be", name = "U", descriptor = "Z")
	private boolean aBoolean11 = false;

	@OriginalMember(owner = "client!be", name = "K", descriptor = "I")
	public int anInt258 = 16;

	@OriginalMember(owner = "client!be", name = "kb", descriptor = "Z")
	public boolean aBoolean13 = true;

	@OriginalMember(owner = "client!be", name = "lb", descriptor = "I")
	public int anInt273 = 0;

	@OriginalMember(owner = "client!be", name = "sb", descriptor = "I")
	public int anInt277 = 0;

	@OriginalMember(owner = "client!be", name = "qb", descriptor = "Z")
	public boolean aBoolean15 = false;

	@OriginalMember(owner = "client!be", name = "tb", descriptor = "Z")
	public boolean aBoolean16 = false;

	@OriginalMember(owner = "client!be", name = "ab", descriptor = "I")
	private int anInt267 = 128;

	@OriginalMember(owner = "client!be", name = "vb", descriptor = "Lclient!na;")
	public Class53 aClass53_111 = Static54.aClass53_1423;

	@OriginalMember(owner = "client!be", name = "yb", descriptor = "I")
	private int anInt280 = 0;

	@OriginalMember(owner = "client!be", name = "Jb", descriptor = "I")
	public int anInt288 = -1;

	@OriginalMember(owner = "client!be", name = "Ib", descriptor = "I")
	public int anInt287 = -1;

	@OriginalMember(owner = "client!be", name = "xb", descriptor = "I")
	public int anInt279 = -1;

	@OriginalMember(owner = "client!be", name = "Db", descriptor = "Z")
	public boolean aBoolean17 = true;

	@OriginalMember(owner = "client!be", name = "eb", descriptor = "I")
	private int anInt268 = 0;

	@OriginalMember(owner = "client!be", name = "V", descriptor = "Z")
	public boolean aBoolean12 = false;

	@OriginalMember(owner = "client!be", name = "nb", descriptor = "Z")
	public boolean aBoolean14 = false;

	@OriginalMember(owner = "client!be", name = "Y", descriptor = "I")
	public int anInt265 = 0;

	@OriginalMember(owner = "client!be", name = "gb", descriptor = "I")
	private int anInt269 = -1;

	@OriginalMember(owner = "client!be", name = "hb", descriptor = "I")
	public int anInt270 = 1;

	@OriginalMember(owner = "client!be", name = "S", descriptor = "Z")
	public boolean aBoolean10 = true;

	@OriginalMember(owner = "client!be", name = "wb", descriptor = "I")
	private int anInt278 = -1;

	@OriginalMember(owner = "client!be", name = "pb", descriptor = "I")
	public int anInt276 = 0;

	@OriginalMember(owner = "client!be", name = "ib", descriptor = "I")
	public int anInt271 = -1;

	@OriginalMember(owner = "client!be", name = "Fb", descriptor = "I")
	private int anInt284 = 128;

	@OriginalMember(owner = "client!be", name = "J", descriptor = "[Lclient!na;")
	public final Class53[] aClass53Array3 = new Class53[5];

	@OriginalMember(owner = "client!be", name = "L", descriptor = "I")
	public int anInt259 = -1;

	@OriginalMember(owner = "client!be", name = "M", descriptor = "Z")
	private boolean aBoolean9 = false;

	@OriginalMember(owner = "client!be", name = "Ub", descriptor = "I")
	private int anInt297 = 0;

	@OriginalMember(owner = "client!be", name = "Eb", descriptor = "I")
	private int anInt283 = 128;

	@OriginalMember(owner = "client!be", name = "Vb", descriptor = "I")
	public int anInt298 = -1;

	@OriginalMember(owner = "client!be", name = "Bb", descriptor = "I")
	public int anInt282 = 1;

	@OriginalMember(owner = "client!be", name = "Qb", descriptor = "I")
	private int anInt294 = 0;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)Lclient!be;")
	public Class3_Sub1_Sub2 method162() {
		@Pc(10) int local10 = -1;
		if (this.anInt278 != -1) {
			local10 = Static70.method1202(this.anInt278);
		} else if (this.anInt269 != -1) {
			local10 = Static13.anIntArray31[this.anInt269];
		}
		return local10 < 0 || local10 >= this.anIntArray24.length || this.anIntArray24[local10] == -1 ? null : Static12.method200(this.anIntArray24[local10]);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ob;B)V")
	public void method163(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method647();
			if (local5 == 0) {
				return;
			}
			this.method176(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIII)Lclient!sd;")
	public Class3_Sub1_Sub4 method166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(25) long local25;
		if (this.anIntArray25 == null) {
			local25 = (this.anInt295 << 10) + arg4;
		} else {
			local25 = (this.anInt295 << 10) + (arg0 << 3) + arg4;
		}
		@Pc(41) Class3_Sub1_Sub4 local41 = (Class3_Sub1_Sub4) Static7.aClass75_5.method1728(local25);
		if (local41 == null) {
			@Pc(49) Class3_Sub1_Sub4_Sub5 local49 = this.method170(arg4, arg0);
			if (local49 == null) {
				return null;
			}
			if (this.aBoolean9) {
				local49.aShort2 = (short) (this.anInt261 + 64);
				local41 = local49;
				local49.aShort1 = (short) (this.anInt297 * 5 + 768);
				local49.method1164();
			} else {
				local41 = local49.method1156(this.anInt261 + 64, 768 - -(this.anInt297 * 5), -50, -10, -50);
			}
			Static7.aClass75_5.method1730(local41, local25);
		}
		if (this.aBoolean9) {
			local41 = ((Class3_Sub1_Sub4_Sub5) local41).method1159();
		}
		if (this.aBoolean14) {
			if (local41 instanceof Class3_Sub1_Sub4_Sub7) {
				local41 = ((Class3_Sub1_Sub4_Sub7) local41).method1775(arg3, arg1, arg5, arg2, true);
			} else if (local41 instanceof Class3_Sub1_Sub4_Sub5) {
				local41 = ((Class3_Sub1_Sub4_Sub5) local41).method1174(arg3, arg1, arg5, arg2);
			}
		}
		return local41;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(II)Z")
	public boolean method167(@OriginalArg(0) int arg0) {
		if (this.anIntArray25 != null) {
			for (@Pc(51) int local51 = 0; local51 < this.anIntArray25.length; local51++) {
				if (this.anIntArray25[local51] == arg0) {
					return Static123.aClass62_27.method1515(0, this.anIntArray27[local51] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray27 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(24) boolean local24 = true;
			for (@Pc(26) int local26 = 0; local26 < this.anIntArray27.length; local26++) {
				local24 &= Static123.aClass62_27.method1515(0, this.anIntArray27[local26] & 0xFFFF);
			}
			return local24;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IILclient!qc;IIIIII)Lclient!ua;")
	public Class3_Sub1_Sub4_Sub7 method168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub11 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) long local16;
		if (this.anIntArray25 == null) {
			local16 = (this.anInt295 << 10) + arg4;
		} else {
			local16 = arg4 + (arg7 << 3) + (this.anInt295 << 10);
		}
		@Pc(36) Class3_Sub1_Sub4_Sub7 local36 = (Class3_Sub1_Sub4_Sub7) Static51.aClass75_39.method1728(local16);
		if (local36 == null) {
			@Pc(44) Class3_Sub1_Sub4_Sub5 local44 = this.method170(arg4, arg7);
			if (local44 == null) {
				return null;
			}
			local36 = local44.method1156(this.anInt261 + 64, 768 - -(this.anInt297 * 5), -50, -10, -50);
			Static51.aClass75_39.method1730(local36, local16);
		}
		if (arg2 == null && !this.aBoolean14) {
			return local36;
		}
		if (arg2 == null) {
			local36 = local36.method1760(true);
		} else {
			local36 = arg2.method1562(arg4, arg5, local36);
		}
		if (this.aBoolean14) {
			local36.method1775(arg0, arg1, arg6, arg3, false);
		}
		return local36;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(IIIIIII)Lclient!ua;")
	public Class3_Sub1_Sub4_Sub7 method169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) long local19;
		if (this.anIntArray25 == null) {
			local19 = (this.anInt295 << 10) + arg1;
		} else {
			local19 = arg1 + (this.anInt295 << 10) + (arg4 << 3);
		}
		@Pc(36) Class3_Sub1_Sub4_Sub7 local36 = (Class3_Sub1_Sub4_Sub7) Static51.aClass75_39.method1728(local19);
		if (local36 == null) {
			@Pc(44) Class3_Sub1_Sub4_Sub5 local44 = this.method170(arg1, arg4);
			if (local44 == null) {
				return null;
			}
			local36 = local44.method1156(this.anInt261 + 64, this.anInt297 * 5 + 768, -50, -10, -50);
			Static51.aClass75_39.method1730(local36, local19);
		}
		if (this.aBoolean14) {
			local36 = local36.method1775(arg0, arg5, arg2, arg3, true);
		}
		return local36;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BII)Lclient!lc;")
	private Class3_Sub1_Sub4_Sub5 method170(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class3_Sub1_Sub4_Sub5 local7 = null;
		@Pc(14) int local14;
		@Pc(46) int local46;
		@Pc(119) boolean local119;
		@Pc(127) int local127;
		if (this.anIntArray25 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray27 == null) {
				return null;
			}
			local14 = this.anIntArray27.length;
			local119 = arg0 > 3 ^ this.aBoolean11;
			for (local46 = 0; local46 < local14; local46++) {
				local127 = this.anIntArray27[local46];
				if (local119) {
					local127 += 65536;
				}
				local7 = (Class3_Sub1_Sub4_Sub5) Static71.aClass75_48.method1728((long) local127);
				if (local7 == null) {
					local7 = Static67.method1155(Static123.aClass62_27, local127 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local119) {
						local7.method1157();
					}
					Static71.aClass75_48.method1730(local7, (long) local127);
				}
				if (local14 > 1) {
					Static65.aClass3_Sub1_Sub4_Sub5Array1[local46] = local7;
				}
			}
			if (local14 > 1) {
				local7 = new Class3_Sub1_Sub4_Sub5(Static65.aClass3_Sub1_Sub4_Sub5Array1, local14);
			}
		} else {
			@Pc(12) int local12 = -1;
			for (local14 = 0; local14 < this.anIntArray25.length; local14++) {
				if (this.anIntArray25[local14] == arg1) {
					local12 = local14;
					break;
				}
			}
			if (local12 == -1) {
				return null;
			}
			local46 = this.anIntArray27[local12];
			@Pc(58) boolean local58 = arg0 > 3 ^ this.aBoolean11;
			if (local58) {
				local46 += 65536;
			}
			local7 = (Class3_Sub1_Sub4_Sub5) Static71.aClass75_48.method1728((long) local46);
			if (local7 == null) {
				local7 = Static67.method1155(Static123.aClass62_27, local46 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local58) {
					local7.method1157();
				}
				Static71.aClass75_48.method1730(local7, (long) local46);
			}
		}
		if (this.anInt267 == 128 && this.anInt284 == 128 && this.anInt283 == 128) {
			local119 = false;
		} else {
			local119 = true;
		}
		@Pc(217) boolean local217;
		if (this.anInt268 == 0 && this.anInt280 == 0 && this.anInt294 == 0) {
			local217 = false;
		} else {
			local217 = true;
		}
		@Pc(245) Class3_Sub1_Sub4_Sub5 local245 = new Class3_Sub1_Sub4_Sub5(local7, arg0 == 0 && !local119 && !local217, this.aShortArray3 == null, true);
		@Pc(249) int local249 = arg0 & 0x3;
		if (local249 == 1) {
			local245.method1166();
		} else if (local249 == 2) {
			local245.method1160();
		} else if (local249 == 3) {
			local245.method1173();
		}
		if (this.aShortArray3 != null) {
			for (local127 = 0; local127 < this.aShortArray3.length; local127++) {
				local245.method1172(this.aShortArray3[local127], this.aShortArray4[local127]);
			}
		}
		if (local119) {
			local245.method1165(this.anInt267, this.anInt284, this.anInt283);
		}
		if (local217) {
			local245.method1171(this.anInt268, this.anInt280, this.anInt294);
		}
		return local245;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)Z")
	public boolean method171() {
		if (this.anIntArray24 == null) {
			return this.anInt287 != -1 || this.anIntArray28 != null;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray24.length; local21++) {
			if (this.anIntArray24[local21] != -1) {
				@Pc(46) Class3_Sub1_Sub2 local46 = Static12.method200(this.anIntArray24[local21]);
				if (local46.anInt287 != -1 || local46.anIntArray28 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V")
	public void method173() {
		if (this.anInt279 == -1) {
			this.anInt279 = 0;
			if (this.anIntArray27 != null && (this.anIntArray25 == null || this.anIntArray25[0] == 10)) {
				this.anInt279 = 1;
			}
			for (@Pc(28) int local28 = 0; local28 < 5; local28++) {
				if (this.aClass53Array3[local28] != null) {
					this.anInt279 = 1;
				}
			}
		}
		if (this.anInt259 == -1) {
			this.anInt259 = this.aBoolean10 ? 1 : 0;
		}
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(B)Z")
	public boolean method175() {
		if (this.anIntArray27 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray27.length; local14++) {
			local12 &= Static123.aClass62_27.method1515(0, this.anIntArray27[local14] & 0xFFFF);
		}
		return local12;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IILclient!ob;)V")
	private void method176(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		@Pc(29) int local29;
		@Pc(58) int local58;
		if (arg0 == 1) {
			local29 = arg1.method647();
			if (local29 > 0) {
				if (this.anIntArray27 == null || Static44.aBoolean46) {
					this.anIntArray25 = new int[local29];
					this.anIntArray27 = new int[local29];
					for (local58 = 0; local58 < local29; local58++) {
						this.anIntArray27[local58] = arg1.method602();
						this.anIntArray25[local58] = arg1.method647();
					}
				} else {
					arg1.anInt964 += local29 * 3;
				}
			}
		} else if (arg0 == 2) {
			this.aClass53_111 = arg1.method605();
		} else if (arg0 == 5) {
			local29 = arg1.method647();
			if (local29 > 0) {
				if (this.anIntArray27 == null || Static44.aBoolean46) {
					this.anIntArray27 = new int[local29];
					this.anIntArray25 = null;
					for (local58 = 0; local58 < local29; local58++) {
						this.anIntArray27[local58] = arg1.method602();
					}
				} else {
					arg1.anInt964 += local29 * 2;
				}
			}
		} else if (arg0 == 14) {
			this.anInt270 = arg1.method647();
		} else if (arg0 == 15) {
			this.anInt282 = arg1.method647();
		} else if (arg0 == 17) {
			this.aBoolean17 = false;
			this.aBoolean10 = false;
		} else if (arg0 == 18) {
			this.aBoolean17 = false;
		} else if (arg0 == 19) {
			this.anInt279 = arg1.method647();
		} else if (arg0 == 21) {
			this.aBoolean14 = true;
		} else if (arg0 == 22) {
			this.aBoolean9 = true;
		} else if (arg0 == 23) {
			this.aBoolean16 = true;
		} else if (arg0 == 24) {
			this.anInt298 = arg1.method602();
			if (this.anInt298 == 65535) {
				this.anInt298 = -1;
			}
		} else if (arg0 == 28) {
			this.anInt258 = arg1.method647();
		} else if (arg0 == 29) {
			this.anInt261 = arg1.method624();
		} else if (arg0 == 39) {
			this.anInt297 = arg1.method624() * 5;
		} else if (arg0 >= 30 && arg0 < 35) {
			this.aClass53Array3[arg0 - 30] = arg1.method605();
			if (this.aClass53Array3[arg0 - 30].method1274(Static36.aClass53_491)) {
				this.aClass53Array3[arg0 - 30] = null;
			}
		} else if (arg0 == 40) {
			local29 = arg1.method647();
			this.aShortArray3 = new short[local29];
			this.aShortArray4 = new short[local29];
			for (local58 = 0; local58 < local29; local58++) {
				this.aShortArray3[local58] = (short) arg1.method602();
				this.aShortArray4[local58] = (short) arg1.method602();
			}
		} else if (arg0 == 60) {
			this.anInt271 = arg1.method602();
		} else if (arg0 == 62) {
			this.aBoolean11 = true;
		} else if (arg0 == 64) {
			this.aBoolean13 = false;
		} else if (arg0 == 65) {
			this.anInt267 = arg1.method602();
		} else if (arg0 == 66) {
			this.anInt284 = arg1.method602();
		} else if (arg0 == 67) {
			this.anInt283 = arg1.method602();
		} else if (arg0 == 68) {
			this.anInt288 = arg1.method602();
		} else if (arg0 == 69) {
			this.anInt277 = arg1.method647();
		} else if (arg0 == 70) {
			this.anInt268 = arg1.method649();
		} else if (arg0 == 71) {
			this.anInt280 = arg1.method649();
		} else if (arg0 == 72) {
			this.anInt294 = arg1.method649();
		} else if (arg0 == 73) {
			this.aBoolean12 = true;
		} else if (arg0 == 74) {
			this.aBoolean15 = true;
		} else if (arg0 == 75) {
			this.anInt259 = arg1.method647();
		} else if (arg0 == 77) {
			this.anInt278 = arg1.method602();
			if (this.anInt278 == 65535) {
				this.anInt278 = -1;
			}
			this.anInt269 = arg1.method602();
			if (this.anInt269 == 65535) {
				this.anInt269 = -1;
			}
			local29 = arg1.method647();
			this.anIntArray24 = new int[local29 + 1];
			for (local58 = 0; local58 <= local29; local58++) {
				this.anIntArray24[local58] = arg1.method602();
				if (this.anIntArray24[local58] == 65535) {
					this.anIntArray24[local58] = -1;
				}
			}
		} else if (arg0 == 78) {
			this.anInt287 = arg1.method602();
			this.anInt273 = arg1.method647();
		} else if (arg0 == 79) {
			this.anInt265 = arg1.method602();
			this.anInt276 = arg1.method602();
			this.anInt273 = arg1.method647();
			local29 = arg1.method647();
			this.anIntArray28 = new int[local29];
			for (local58 = 0; local58 < local29; local58++) {
				this.anIntArray28[local58] = arg1.method602();
			}
		}
	}
}
