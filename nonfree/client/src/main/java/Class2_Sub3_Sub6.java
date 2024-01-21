import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class2_Sub3_Sub6 extends Class2_Sub3 {

	@OriginalMember(owner = "client!eh", name = "z", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!eh", name = "E", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!eh", name = "R", descriptor = "[I")
	public int[] anIntArray61;

	@OriginalMember(owner = "client!eh", name = "bb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!eh", name = "ob", descriptor = "[I")
	public int[] anIntArray63;

	@OriginalMember(owner = "client!eh", name = "qb", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!eh", name = "tb", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!eh", name = "Fb", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!eh", name = "Ib", descriptor = "I")
	public int anInt1216;

	@OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
	private int anInt1188 = -1;

	@OriginalMember(owner = "client!eh", name = "Q", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
	private int anInt1183 = 0;

	@OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
	public int anInt1187 = -1;

	@OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
	private int anInt1186 = 128;

	@OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
	private int anInt1191 = 0;

	@OriginalMember(owner = "client!eh", name = "cb", descriptor = "I")
	public int anInt1199 = -1;

	@OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
	private int anInt1189 = 0;

	@OriginalMember(owner = "client!eh", name = "J", descriptor = "[Lclient!ai;")
	public final Class6[] aClass6Array7 = new Class6[5];

	@OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
	public int anInt1192 = 2;

	@OriginalMember(owner = "client!eh", name = "gb", descriptor = "I")
	public int anInt1203 = 0;

	@OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
	public int anInt1180 = -1;

	@OriginalMember(owner = "client!eh", name = "lb", descriptor = "Z")
	public boolean aBoolean44 = false;

	@OriginalMember(owner = "client!eh", name = "kb", descriptor = "I")
	private int anInt1207 = 128;

	@OriginalMember(owner = "client!eh", name = "db", descriptor = "I")
	private int anInt1200 = -1;

	@OriginalMember(owner = "client!eh", name = "eb", descriptor = "I")
	public int anInt1201 = -1;

	@OriginalMember(owner = "client!eh", name = "nb", descriptor = "Lclient!ai;")
	public Class6 aClass6_326 = Static79.aClass6_598;

	@OriginalMember(owner = "client!eh", name = "ab", descriptor = "I")
	private int anInt1198 = 0;

	@OriginalMember(owner = "client!eh", name = "Bb", descriptor = "Z")
	public boolean aBoolean46 = false;

	@OriginalMember(owner = "client!eh", name = "W", descriptor = "I")
	public int anInt1195 = 1;

	@OriginalMember(owner = "client!eh", name = "zb", descriptor = "I")
	public int anInt1212 = -1;

	@OriginalMember(owner = "client!eh", name = "Db", descriptor = "Z")
	public boolean aBoolean48 = true;

	@OriginalMember(owner = "client!eh", name = "hb", descriptor = "I")
	public int anInt1204 = 0;

	@OriginalMember(owner = "client!eh", name = "mb", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!eh", name = "V", descriptor = "I")
	public int anInt1194 = 16;

	@OriginalMember(owner = "client!eh", name = "ib", descriptor = "I")
	public int anInt1205 = 1;

	@OriginalMember(owner = "client!eh", name = "B", descriptor = "Z")
	public boolean aBoolean42 = true;

	@OriginalMember(owner = "client!eh", name = "Kb", descriptor = "I")
	private int anInt1218 = 0;

	@OriginalMember(owner = "client!eh", name = "Lb", descriptor = "I")
	public int anInt1219 = -1;

	@OriginalMember(owner = "client!eh", name = "Cb", descriptor = "Z")
	public boolean aBoolean47 = false;

	@OriginalMember(owner = "client!eh", name = "Eb", descriptor = "I")
	private int anInt1213 = 128;

	@OriginalMember(owner = "client!eh", name = "Hb", descriptor = "I")
	public int anInt1215 = 0;

	@OriginalMember(owner = "client!eh", name = "Nb", descriptor = "I")
	private int anInt1221 = -1;

	@OriginalMember(owner = "client!eh", name = "Jb", descriptor = "I")
	public int anInt1217 = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "([[IBIIIII)Lclient!nd;")
	public Class2_Sub3_Sub5 method738(@OriginalArg(0) int[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(20) long local20;
		if (this.anIntArray65 == null) {
			local20 = (this.anInt1216 << 10) + arg5;
		} else {
			local20 = arg5 + (arg1 << 3) + (this.anInt1216 << 10);
		}
		@Pc(37) Class2_Sub3_Sub5 local37 = (Class2_Sub3_Sub5) Static172.aClass17_29.method505(local20);
		if (local37 == null) {
			@Pc(51) Class2_Sub3_Sub5_Sub3 local51 = this.method746(arg5, arg1);
			if (local51 == null) {
				return null;
			}
			if (this.aBoolean45) {
				local51.aShort8 = (short) (this.anInt1198 * 5 + 768);
				local37 = local51;
				local51.aShort12 = (short) (this.anInt1218 + 64);
				local51.method1636();
			} else {
				local37 = local51.method1642(this.anInt1218 + 64, this.anInt1198 * 5 + 768, -50, -10, -50, this.anInt1200 >= 0);
			}
			Static172.aClass17_29.method508(local20, local37);
		}
		if (this.aBoolean45) {
			local37 = ((Class2_Sub3_Sub5_Sub3) local37).method1640();
		}
		if (this.anInt1200 >= 0) {
			if (local37 instanceof Class2_Sub3_Sub5_Sub7) {
				local37 = ((Class2_Sub3_Sub5_Sub7) local37).method2310(arg0, arg2, arg3, arg4, true, this.anInt1200);
			} else if (local37 instanceof Class2_Sub3_Sub5_Sub3) {
				local37 = ((Class2_Sub3_Sub5_Sub3) local37).method1638(arg0, arg2, arg3, arg4, this.anInt1200);
			}
		}
		return local37;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)Z")
	public boolean method739(@OriginalArg(1) int arg0) {
		if (this.anIntArray65 != null) {
			for (@Pc(51) int local51 = 0; local51 < this.anIntArray65.length; local51++) {
				if (arg0 == this.anIntArray65[local51]) {
					return Static15.aClass10_16.method1596(0, this.anIntArray64[local51] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray64 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(24) boolean local24 = true;
			for (@Pc(26) int local26 = 0; local26 < this.anIntArray64.length; local26++) {
				local24 &= Static15.aClass10_16.method1596(0, this.anIntArray64[local26] & 0xFFFF);
			}
			return local24;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)Z")
	public boolean method740() {
		if (this.anIntArray64 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray64.length; local22++) {
			local12 &= Static15.aClass10_16.method1596(0, this.anIntArray64[local22] & 0xFFFF);
		}
		return local12;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "([[IIIIIII)Lclient!sa;")
	public Class2_Sub3_Sub5_Sub7 method742(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) long local14;
		if (this.anIntArray65 == null) {
			local14 = arg5 + (this.anInt1216 << 10);
		} else {
			local14 = (this.anInt1216 << 10) - (-(arg4 << 3) - arg5);
		}
		@Pc(36) Class2_Sub3_Sub5_Sub7 local36 = (Class2_Sub3_Sub5_Sub7) Static165.aClass17_27.method505(local14);
		if (local36 == null) {
			@Pc(52) Class2_Sub3_Sub5_Sub3 local52 = this.method746(arg5, arg4);
			if (local52 == null) {
				return null;
			}
			local36 = local52.method1642(this.anInt1218 + 64, this.anInt1198 * 5 + 768, -50, -10, -50, this.anInt1200 >= 0);
			Static165.aClass17_27.method508(local14, local36);
		}
		if (this.anInt1200 >= 0) {
			local36 = local36.method2310(arg0, arg2, arg3, arg1, true, this.anInt1200);
		}
		return local36;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII[[IIILclient!ic;I)Lclient!sa;")
	public Class2_Sub3_Sub5_Sub7 method743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class2_Sub3_Sub8 arg6, @OriginalArg(8) int arg7) {
		@Pc(17) long local17;
		if (this.anIntArray65 == null) {
			local17 = (this.anInt1216 << 10) + arg7;
		} else {
			local17 = arg7 + (this.anInt1216 << 10) + (arg1 << 3);
		}
		@Pc(38) Class2_Sub3_Sub5_Sub7 local38 = (Class2_Sub3_Sub5_Sub7) Static34.aClass17_5.method505(local17);
		if (local38 == null) {
			@Pc(46) Class2_Sub3_Sub5_Sub3 local46 = this.method746(arg7, arg1);
			if (local46 == null) {
				return null;
			}
			local38 = local46.method1642(this.anInt1218 + 64, 768 - -(this.anInt1198 * 5), -50, -10, -50, true);
			Static34.aClass17_5.method508(local17, local38);
		}
		if (arg6 == null && this.anInt1200 == -1) {
			return local38;
		}
		if (arg6 == null) {
			local38 = local38.method2307(true);
		} else {
			local38 = arg6.method1076(arg2, arg7, local38);
		}
		if (this.anInt1200 >= 0) {
			local38 = local38.method2310(arg4, arg0, arg5, arg3, false, this.anInt1200);
		}
		return local38;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)Z")
	public boolean method744() {
		if (this.anIntArray61 == null) {
			return this.anInt1180 != -1 || this.anIntArray63 != null;
		}
		for (@Pc(29) int local29 = 0; local29 < this.anIntArray61.length; local29++) {
			if (this.anIntArray61[local29] != -1) {
				@Pc(45) Class2_Sub3_Sub6 local45 = Static163.method2609(this.anIntArray61[local29]);
				if (local45.anInt1180 != -1 || local45.anIntArray63 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)V")
	public void method745() {
		if (this.anInt1219 == -1) {
			this.anInt1219 = 0;
			if (this.anIntArray64 != null && (this.anIntArray65 == null || this.anIntArray65[0] == 10)) {
				this.anInt1219 = 1;
			}
			for (@Pc(34) int local34 = 0; local34 < 5; local34++) {
				if (this.aClass6Array7[local34] != null) {
					this.anInt1219 = 1;
				}
			}
		}
		if (this.anInt1199 == -1) {
			this.anInt1199 = this.anInt1192 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Lclient!mc;")
	private Class2_Sub3_Sub5_Sub3 method746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub3_Sub5_Sub3 local7 = null;
		@Pc(20) int local20;
		@Pc(48) int local48;
		@Pc(108) boolean local108;
		@Pc(136) int local136;
		if (this.anIntArray65 == null) {
			if (arg1 != 10) {
				return null;
			}
			if (this.anIntArray64 == null) {
				return null;
			}
			local108 = this.aBoolean43;
			if (arg1 == 2 && arg0 > 3) {
				local108 = !local108;
			}
			local20 = this.anIntArray64.length;
			for (local48 = 0; local48 < local20; local48++) {
				local136 = this.anIntArray64[local48];
				if (local108) {
					local136 += 65536;
				}
				local7 = (Class2_Sub3_Sub5_Sub3) Static34.aClass17_4.method505((long) local136);
				if (local7 == null) {
					local7 = Static99.method1637(Static15.aClass10_16, local136 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local108) {
						local7.method1647();
					}
					Static34.aClass17_4.method508((long) local136, local7);
				}
				if (local20 > 1) {
					Static142.aClass2_Sub3_Sub5_Sub3Array1[local48] = local7;
				}
			}
			if (local20 > 1) {
				local7 = new Class2_Sub3_Sub5_Sub3(Static142.aClass2_Sub3_Sub5_Sub3Array1, local20);
			}
		} else {
			@Pc(18) int local18 = -1;
			for (local20 = 0; local20 < this.anIntArray65.length; local20++) {
				if (arg1 == this.anIntArray65[local20]) {
					local18 = local20;
					break;
				}
			}
			if (local18 == -1) {
				return null;
			}
			local48 = this.anIntArray64[local18];
			@Pc(58) boolean local58 = arg0 > 3 ^ this.aBoolean43;
			if (local58) {
				local48 += 65536;
			}
			local7 = (Class2_Sub3_Sub5_Sub3) Static34.aClass17_4.method505((long) local48);
			if (local7 == null) {
				local7 = Static99.method1637(Static15.aClass10_16, local48 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local58) {
					local7.method1647();
				}
				Static34.aClass17_4.method508((long) local48, local7);
			}
		}
		if (this.anInt1213 == 128 && this.anInt1186 == 128 && this.anInt1207 == 128) {
			local108 = false;
		} else {
			local108 = true;
		}
		@Pc(235) boolean local235;
		if (this.anInt1191 == 0 && this.anInt1183 == 0 && this.anInt1189 == 0) {
			local235 = false;
		} else {
			local235 = true;
		}
		@Pc(266) Class2_Sub3_Sub5_Sub3 local266 = new Class2_Sub3_Sub5_Sub3(local7, arg0 == 0 && !local108 && !local235, this.aShortArray7 == null, this.aShortArray6 == null, true);
		if (arg1 == 4 && arg0 > 3) {
			local266.method1629();
			local266.method1639(45, 0, -45);
		}
		@Pc(286) int local286 = arg0 & 0x3;
		if (local286 == 1) {
			local266.method1630();
		} else if (local286 == 2) {
			local266.method1643();
		} else if (local286 == 3) {
			local266.method1634();
		}
		if (this.aShortArray7 != null) {
			for (local136 = 0; local136 < this.aShortArray7.length; local136++) {
				local266.method1644(this.aShortArray7[local136], this.aShortArray9[local136]);
			}
		}
		if (this.aShortArray6 != null) {
			for (local136 = 0; local136 < this.aShortArray6.length; local136++) {
				local266.method1648(this.aShortArray6[local136], this.aShortArray8[local136]);
			}
		}
		if (local108) {
			local266.method1628(this.anInt1213, this.anInt1186, this.anInt1207);
		}
		if (local235) {
			local266.method1639(this.anInt1191, this.anInt1183, this.anInt1189);
		}
		return local266;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZLclient!me;I)V")
	private void method747(@OriginalArg(1) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8;
		@Pc(35) int local35;
		if (arg1 == 1) {
			local8 = arg0.method1402();
			if (local8 > 0) {
				if (this.anIntArray64 == null || Static88.aBoolean85) {
					this.anIntArray64 = new int[local8];
					this.anIntArray65 = new int[local8];
					for (local35 = 0; local35 < local8; local35++) {
						this.anIntArray64[local35] = arg0.method1397();
						this.anIntArray65[local35] = arg0.method1402();
					}
				} else {
					arg0.anInt2154 += local8 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass6_326 = arg0.method1399();
		} else if (arg1 == 5) {
			local8 = arg0.method1402();
			if (local8 > 0) {
				if (this.anIntArray64 == null || Static88.aBoolean85) {
					this.anIntArray65 = null;
					this.anIntArray64 = new int[local8];
					for (local35 = 0; local35 < local8; local35++) {
						this.anIntArray64[local35] = arg0.method1397();
					}
				} else {
					arg0.anInt2154 += local8 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt1205 = arg0.method1402();
		} else if (arg1 == 15) {
			this.anInt1195 = arg0.method1402();
		} else if (arg1 == 17) {
			this.anInt1192 = 0;
			this.aBoolean48 = false;
		} else if (arg1 == 18) {
			this.aBoolean48 = false;
		} else if (arg1 == 19) {
			this.anInt1219 = arg0.method1402();
		} else if (arg1 == 21) {
			this.anInt1200 = 0;
		} else if (arg1 == 22) {
			this.aBoolean45 = true;
		} else if (arg1 == 23) {
			this.aBoolean46 = true;
		} else if (arg1 == 24) {
			this.anInt1201 = arg0.method1397();
			if (this.anInt1201 == 65535) {
				this.anInt1201 = -1;
			}
		} else if (arg1 == 27) {
			this.anInt1192 = 1;
		} else if (arg1 == 28) {
			this.anInt1194 = arg0.method1402();
		} else if (arg1 == 29) {
			this.anInt1218 = arg0.method1394();
		} else if (arg1 == 39) {
			this.anInt1198 = arg0.method1394() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass6Array7[arg1 - 30] = arg0.method1399();
			if (this.aClass6Array7[arg1 - 30].method137(Static140.aClass6_953)) {
				this.aClass6Array7[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local8 = arg0.method1402();
			this.aShortArray7 = new short[local8];
			this.aShortArray9 = new short[local8];
			for (local35 = 0; local35 < local8; local35++) {
				this.aShortArray7[local35] = (short) arg0.method1397();
				this.aShortArray9[local35] = (short) arg0.method1397();
			}
		} else if (arg1 == 41) {
			local8 = arg0.method1402();
			this.aShortArray8 = new short[local8];
			this.aShortArray6 = new short[local8];
			for (local35 = 0; local35 < local8; local35++) {
				this.aShortArray6[local35] = (short) arg0.method1397();
				this.aShortArray8[local35] = (short) arg0.method1397();
			}
		} else if (arg1 == 60) {
			this.anInt1187 = arg0.method1397();
		} else if (arg1 == 62) {
			this.aBoolean43 = true;
		} else if (arg1 == 64) {
			this.aBoolean42 = false;
		} else if (arg1 == 65) {
			this.anInt1213 = arg0.method1397();
		} else if (arg1 == 66) {
			this.anInt1186 = arg0.method1397();
		} else if (arg1 == 67) {
			this.anInt1207 = arg0.method1397();
		} else if (arg1 == 68) {
			this.anInt1212 = arg0.method1397();
		} else if (arg1 == 69) {
			this.anInt1217 = arg0.method1402();
		} else if (arg1 == 70) {
			this.anInt1191 = arg0.method1400();
		} else if (arg1 == 71) {
			this.anInt1183 = arg0.method1400();
		} else if (arg1 == 72) {
			this.anInt1189 = arg0.method1400();
		} else if (arg1 == 73) {
			this.aBoolean47 = true;
		} else if (arg1 == 74) {
			this.aBoolean44 = true;
		} else if (arg1 == 75) {
			this.anInt1199 = arg0.method1402();
		} else if (arg1 == 77) {
			this.anInt1221 = arg0.method1397();
			if (this.anInt1221 == 65535) {
				this.anInt1221 = -1;
			}
			this.anInt1188 = arg0.method1397();
			if (this.anInt1188 == 65535) {
				this.anInt1188 = -1;
			}
			local8 = arg0.method1402();
			this.anIntArray61 = new int[local8 + 1];
			for (local35 = 0; local35 <= local8; local35++) {
				this.anIntArray61[local35] = arg0.method1397();
				if (this.anIntArray61[local35] == 65535) {
					this.anIntArray61[local35] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt1180 = arg0.method1397();
			this.anInt1203 = arg0.method1402();
		} else if (arg1 == 79) {
			this.anInt1215 = arg0.method1397();
			this.anInt1204 = arg0.method1397();
			this.anInt1203 = arg0.method1402();
			local8 = arg0.method1402();
			this.anIntArray63 = new int[local8];
			for (local35 = 0; local35 < local8; local35++) {
				this.anIntArray63[local35] = arg0.method1397();
			}
		} else if (arg1 == 81) {
			this.anInt1200 = arg0.method1402() * 256;
		}
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(Z)Lclient!eh;")
	public Class2_Sub3_Sub6 method750() {
		@Pc(5) int local5 = -1;
		if (this.anInt1221 != -1) {
			local5 = Static182.method2812(this.anInt1221);
		} else if (this.anInt1188 != -1) {
			local5 = Static11.anIntArray9[this.anInt1188];
		}
		return local5 < 0 || local5 >= this.anIntArray61.length || this.anIntArray61[local5] == -1 ? null : Static163.method2609(this.anIntArray61[local5]);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!me;I)V")
	public void method751(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1402();
			if (local5 == 0) {
				return;
			}
			this.method747(arg0, local5);
		}
	}
}
