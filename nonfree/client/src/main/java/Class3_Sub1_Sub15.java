import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class3_Sub1_Sub15 extends Class3_Sub1 {

	@OriginalMember(owner = "client!qa", name = "P", descriptor = "[I")
	public int[] anIntArray314;

	@OriginalMember(owner = "client!qa", name = "Y", descriptor = "[I")
	public int[] anIntArray315;

	@OriginalMember(owner = "client!qa", name = "eb", descriptor = "[I")
	private int[] anIntArray316;

	@OriginalMember(owner = "client!qa", name = "gb", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!qa", name = "zb", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!qa", name = "Ab", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!qa", name = "Hb", descriptor = "I")
	public int anInt3031;

	@OriginalMember(owner = "client!qa", name = "Lb", descriptor = "[I")
	private int[] anIntArray317;

	@OriginalMember(owner = "client!qa", name = "Ub", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
	private int anInt3004 = 128;

	@OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
	public int anInt3005 = -1;

	@OriginalMember(owner = "client!qa", name = "cb", descriptor = "I")
	public int anInt3012 = 1;

	@OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
	private int anInt3009 = 128;

	@OriginalMember(owner = "client!qa", name = "bb", descriptor = "I")
	public int anInt3011 = 16;

	@OriginalMember(owner = "client!qa", name = "O", descriptor = "I")
	private int anInt3002 = 0;

	@OriginalMember(owner = "client!qa", name = "M", descriptor = "Z")
	public boolean aBoolean199 = false;

	@OriginalMember(owner = "client!qa", name = "tb", descriptor = "I")
	private int anInt3020 = -1;

	@OriginalMember(owner = "client!qa", name = "jb", descriptor = "I")
	public int anInt3014 = 1;

	@OriginalMember(owner = "client!qa", name = "lb", descriptor = "Lclient!sd;")
	public Class73 aClass73_1683 = Static152.aClass73_1845;

	@OriginalMember(owner = "client!qa", name = "qb", descriptor = "I")
	public int anInt3017 = -1;

	@OriginalMember(owner = "client!qa", name = "Cb", descriptor = "Z")
	public boolean aBoolean201 = false;

	@OriginalMember(owner = "client!qa", name = "ub", descriptor = "I")
	private int anInt3021 = 0;

	@OriginalMember(owner = "client!qa", name = "vb", descriptor = "I")
	public int anInt3022 = -1;

	@OriginalMember(owner = "client!qa", name = "Db", descriptor = "I")
	public int anInt3027 = 0;

	@OriginalMember(owner = "client!qa", name = "Gb", descriptor = "I")
	private int anInt3030 = -1;

	@OriginalMember(owner = "client!qa", name = "V", descriptor = "I")
	public int anInt3008 = 2;

	@OriginalMember(owner = "client!qa", name = "kb", descriptor = "I")
	public int anInt3015 = -1;

	@OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
	public int anInt3003 = 0;

	@OriginalMember(owner = "client!qa", name = "Jb", descriptor = "Z")
	public boolean aBoolean202 = true;

	@OriginalMember(owner = "client!qa", name = "Fb", descriptor = "I")
	public int anInt3029 = 0;

	@OriginalMember(owner = "client!qa", name = "xb", descriptor = "I")
	private int anInt3024 = -1;

	@OriginalMember(owner = "client!qa", name = "Bb", descriptor = "I")
	private int anInt3026 = 0;

	@OriginalMember(owner = "client!qa", name = "mb", descriptor = "Z")
	public boolean aBoolean200 = false;

	@OriginalMember(owner = "client!qa", name = "Nb", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!qa", name = "Sb", descriptor = "I")
	public int anInt3036 = -1;

	@OriginalMember(owner = "client!qa", name = "Rb", descriptor = "Z")
	public boolean aBoolean205 = true;

	@OriginalMember(owner = "client!qa", name = "Qb", descriptor = "I")
	public int anInt3035 = 0;

	@OriginalMember(owner = "client!qa", name = "Ib", descriptor = "I")
	public int anInt3032 = -1;

	@OriginalMember(owner = "client!qa", name = "Mb", descriptor = "Z")
	private boolean aBoolean203 = false;

	@OriginalMember(owner = "client!qa", name = "ab", descriptor = "I")
	private int anInt3010 = 0;

	@OriginalMember(owner = "client!qa", name = "Wb", descriptor = "[Lclient!sd;")
	public final Class73[] aClass73Array20 = new Class73[5];

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "I")
	private int anInt3001 = 128;

	@OriginalMember(owner = "client!qa", name = "wb", descriptor = "I")
	private int anInt3023 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Z")
	public boolean method2189() {
		if (this.anIntArray316 == null) {
			return true;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray316.length; local20++) {
			local18 &= Static32.aClass13_7.method349(0, this.anIntArray316[local20] & 0xFFFF);
		}
		return local18;
	}

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "(I)Lclient!qa;")
	public Class3_Sub1_Sub15 method2191() {
		@Pc(1) int local1 = -1;
		if (this.anInt3030 != -1) {
			local1 = Static78.method1323(this.anInt3030);
		} else if (this.anInt3020 != -1) {
			local1 = Static81.anIntArray186[this.anInt3020];
		}
		return local1 < 0 || local1 >= this.anIntArray314.length || this.anIntArray314[local1] == -1 ? null : Static151.method2466(this.anIntArray314[local1]);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!ff;)V")
	public void method2192(@OriginalArg(1) Class3_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1354();
			if (local9 == 0) {
				return;
			}
			this.method2197(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[IIBII)Lclient!ed;")
	public Class3_Sub1_Sub4 method2193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(24) long local24;
		if (this.anIntArray317 == null) {
			local24 = arg4 + (this.anInt3031 << 10);
		} else {
			local24 = (arg1 << 3) + ((this.anInt3031 << 10) + arg4);
		}
		@Pc(45) Class3_Sub1_Sub4 local45 = (Class3_Sub1_Sub4) Static179.aClass7_28.method183(local24);
		if (local45 == null) {
			@Pc(53) Class3_Sub1_Sub4_Sub4 local53 = this.method2200(arg1, arg4);
			if (local53 == null) {
				return null;
			}
			if (this.aBoolean203) {
				local53.aShort8 = (short) (this.anInt3026 * 5 + 768);
				local53.aShort12 = (short) (this.anInt3010 + 64);
				local45 = local53;
				local53.method1555();
			} else {
				local45 = local53.method1558(this.anInt3010 + 64, 768 - -(this.anInt3026 * 5), -50, -10, -50, ~this.anInt3024 <= -1);
			}
			Static179.aClass7_28.method186(local45, local24);
		}
		if (this.aBoolean203) {
			local45 = ((Class3_Sub1_Sub4_Sub4) local45).method1560();
		}
		if (this.anInt3024 >= 0) {
			if (local45 instanceof Class3_Sub1_Sub4_Sub5) {
				local45 = ((Class3_Sub1_Sub4_Sub5) local45).method1888(arg2, arg3, arg0, arg5, true, this.anInt3024);
			} else if (local45 instanceof Class3_Sub1_Sub4_Sub4) {
				local45 = ((Class3_Sub1_Sub4_Sub4) local45).method1574(arg2, arg3, arg0, arg5, this.anInt3024);
			}
		}
		return local45;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([[IIIIIII)Lclient!o;")
	public Class3_Sub1_Sub4_Sub5 method2194(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) long local19;
		if (this.anIntArray317 == null) {
			local19 = (this.anInt3031 << 10) + arg3;
		} else {
			local19 = (this.anInt3031 << 10) + (arg4 << 3) + arg3;
		}
		@Pc(35) Class3_Sub1_Sub4_Sub5 local35 = (Class3_Sub1_Sub4_Sub5) Static3.aClass7_1.method183(local19);
		if (local35 == null) {
			@Pc(43) Class3_Sub1_Sub4_Sub4 local43 = this.method2200(arg4, arg3);
			if (local43 == null) {
				return null;
			}
			local35 = local43.method1558(this.anInt3010 + 64, this.anInt3026 * 5 + 768, -50, -10, -50, this.anInt3024 >= 0);
			Static3.aClass7_1.method186(local35, local19);
		}
		if (this.anInt3024 >= 0) {
			local35 = local35.method1888(arg0, arg1, arg2, arg5, true, this.anInt3024);
		}
		return local35;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZ)Z")
	public boolean method2195(@OriginalArg(0) int arg0) {
		if (this.anIntArray317 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray317.length; local18++) {
				if (arg0 == this.anIntArray317[local18]) {
					return Static32.aClass13_7.method349(0, this.anIntArray316[local18] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray316 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(61) boolean local61 = true;
			for (@Pc(63) int local63 = 0; local63 < this.anIntArray316.length; local63++) {
				local61 &= Static32.aClass13_7.method349(0, this.anIntArray316[local63] & 0xFFFF);
			}
			return local61;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "(I)V")
	public void method2196() {
		if (this.anInt3017 == -1) {
			this.anInt3017 = 0;
			if (this.anIntArray316 != null && (this.anIntArray317 == null || this.anIntArray317[0] == 10)) {
				this.anInt3017 = 1;
			}
			for (@Pc(31) int local31 = 0; local31 < 5; local31++) {
				if (this.aClass73Array20[local31] != null) {
					this.anInt3017 = 1;
				}
			}
		}
		if (this.anInt3032 == -1) {
			this.anInt3032 = this.anInt3008 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!ff;I)V")
	private void method2197(@OriginalArg(1) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12;
		@Pc(32) int local32;
		if (arg1 == 1) {
			local12 = arg0.method1354();
			if (local12 > 0) {
				if (this.anIntArray316 == null || Static130.aBoolean197) {
					this.anIntArray316 = new int[local12];
					this.anIntArray317 = new int[local12];
					for (local32 = 0; local32 < local12; local32++) {
						this.anIntArray316[local32] = arg0.method1359();
						this.anIntArray317[local32] = arg0.method1354();
					}
				} else {
					arg0.anInt1793 += local12 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass73_1683 = arg0.method1390();
		} else if (arg1 == 5) {
			local12 = arg0.method1354();
			if (local12 > 0) {
				if (this.anIntArray316 == null || Static130.aBoolean197) {
					this.anIntArray317 = null;
					this.anIntArray316 = new int[local12];
					for (local32 = 0; local32 < local12; local32++) {
						this.anIntArray316[local32] = arg0.method1359();
					}
				} else {
					arg0.anInt1793 += local12 * 2;
				}
			}
		} else if (arg1 == 14) {
			this.anInt3012 = arg0.method1354();
		} else if (arg1 == 15) {
			this.anInt3014 = arg0.method1354();
		} else if (arg1 == 17) {
			this.aBoolean205 = false;
			this.anInt3008 = 0;
		} else if (arg1 == 18) {
			this.aBoolean205 = false;
		} else if (arg1 == 19) {
			this.anInt3017 = arg0.method1354();
		} else if (arg1 == 21) {
			this.anInt3024 = 0;
		} else if (arg1 == 22) {
			this.aBoolean203 = true;
		} else if (arg1 == 23) {
			this.aBoolean199 = true;
		} else if (arg1 == 24) {
			this.anInt3022 = arg0.method1359();
			if (this.anInt3022 == 65535) {
				this.anInt3022 = -1;
			}
		} else if (arg1 == 27) {
			this.anInt3008 = 1;
		} else if (arg1 == 28) {
			this.anInt3011 = arg0.method1354();
		} else if (arg1 == 29) {
			this.anInt3010 = arg0.method1342();
		} else if (arg1 == 39) {
			this.anInt3026 = arg0.method1342() * 5;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass73Array20[arg1 - 30] = arg0.method1390();
			if (this.aClass73Array20[arg1 - 30].method2438(Static59.aClass73_1525)) {
				this.aClass73Array20[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local12 = arg0.method1354();
			this.aShortArray33 = new short[local12];
			this.aShortArray32 = new short[local12];
			for (local32 = 0; local32 < local12; local32++) {
				this.aShortArray33[local32] = (short) arg0.method1359();
				this.aShortArray32[local32] = (short) arg0.method1359();
			}
		} else if (arg1 == 41) {
			local12 = arg0.method1354();
			this.aShortArray34 = new short[local12];
			this.aShortArray31 = new short[local12];
			for (local32 = 0; local32 < local12; local32++) {
				this.aShortArray31[local32] = (short) arg0.method1359();
				this.aShortArray34[local32] = (short) arg0.method1359();
			}
		} else if (arg1 == 60) {
			this.anInt3005 = arg0.method1359();
		} else if (arg1 == 62) {
			this.aBoolean204 = true;
		} else if (arg1 == 64) {
			this.aBoolean202 = false;
		} else if (arg1 == 65) {
			this.anInt3001 = arg0.method1359();
		} else if (arg1 == 66) {
			this.anInt3004 = arg0.method1359();
		} else if (arg1 == 67) {
			this.anInt3009 = arg0.method1359();
		} else if (arg1 == 68) {
			this.anInt3015 = arg0.method1359();
		} else if (arg1 == 69) {
			this.anInt3029 = arg0.method1354();
		} else if (arg1 == 70) {
			this.anInt3023 = arg0.method1375();
		} else if (arg1 == 71) {
			this.anInt3002 = arg0.method1375();
		} else if (arg1 == 72) {
			this.anInt3021 = arg0.method1375();
		} else if (arg1 == 73) {
			this.aBoolean200 = true;
		} else if (arg1 == 74) {
			this.aBoolean201 = true;
		} else if (arg1 == 75) {
			this.anInt3032 = arg0.method1354();
		} else if (arg1 == 77) {
			this.anInt3030 = arg0.method1359();
			if (this.anInt3030 == 65535) {
				this.anInt3030 = -1;
			}
			this.anInt3020 = arg0.method1359();
			if (this.anInt3020 == 65535) {
				this.anInt3020 = -1;
			}
			local12 = arg0.method1354();
			this.anIntArray314 = new int[local12 + 1];
			for (local32 = 0; local32 <= local12; local32++) {
				this.anIntArray314[local32] = arg0.method1359();
				if (this.anIntArray314[local32] == 65535) {
					this.anIntArray314[local32] = -1;
				}
			}
		} else if (arg1 == 78) {
			this.anInt3036 = arg0.method1359();
			this.anInt3003 = arg0.method1354();
		} else if (arg1 == 79) {
			this.anInt3035 = arg0.method1359();
			this.anInt3027 = arg0.method1359();
			this.anInt3003 = arg0.method1354();
			local12 = arg0.method1354();
			this.anIntArray315 = new int[local12];
			for (local32 = 0; local32 < local12; local32++) {
				this.anIntArray315[local32] = arg0.method1359();
			}
		} else if (arg1 == 81) {
			this.anInt3024 = arg0.method1354() * 256;
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)Z")
	public boolean method2198() {
		if (this.anIntArray314 == null) {
			return this.anInt3036 != -1 || this.anIntArray315 != null;
		}
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray314.length; local21++) {
			if (this.anIntArray314[local21] != -1) {
				@Pc(37) Class3_Sub1_Sub15 local37 = Static151.method2466(this.anIntArray314[local21]);
				if (local37.anInt3036 != -1 || local37.anIntArray315 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIILclient!gg;[[IIIII)Lclient!o;")
	public Class3_Sub1_Sub4_Sub5 method2199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1_Sub8 arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(20) long local20;
		if (this.anIntArray317 == null) {
			local20 = arg7 + (this.anInt3031 << 10);
		} else {
			local20 = arg7 + (arg5 << 3) + (this.anInt3031 << 10);
		}
		@Pc(36) Class3_Sub1_Sub4_Sub5 local36 = (Class3_Sub1_Sub4_Sub5) Static134.aClass7_22.method183(local20);
		if (local36 == null) {
			@Pc(49) Class3_Sub1_Sub4_Sub4 local49 = this.method2200(arg5, arg7);
			if (local49 == null) {
				return null;
			}
			local36 = local49.method1558(this.anInt3010 + 64, this.anInt3026 * 5 + 768, -50, -10, -50, true);
			Static134.aClass7_22.method186(local36, local20);
		}
		if (arg3 == null && this.anInt3024 == -1) {
			return local36;
		}
		if (arg3 == null) {
			local36 = local36.method1886(true);
		} else {
			local36 = arg3.method992(arg2, local36, arg7);
		}
		if (this.anInt3024 >= 0) {
			local36 = local36.method1888(arg4, arg0, arg6, arg1, false, this.anInt3024);
		}
		return local36;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBI)Lclient!lb;")
	private Class3_Sub1_Sub4_Sub4 method2200(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class3_Sub1_Sub4_Sub4 local7 = null;
		@Pc(25) boolean local25;
		@Pc(29) int local29;
		@Pc(45) int local45;
		@Pc(51) int local51;
		if (this.anIntArray317 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray316 == null) {
				return null;
			}
			local25 = this.aBoolean204;
			local29 = this.anIntArray316.length;
			if (arg0 == 2 && arg1 > 3) {
				local25 = !local25;
			}
			for (local45 = 0; local45 < local29; local45++) {
				local51 = this.anIntArray316[local45];
				if (local25) {
					local51 += 65536;
				}
				local7 = (Class3_Sub1_Sub4_Sub4) Static25.aClass7_6.method183((long) local51);
				if (local7 == null) {
					local7 = Static89.method1571(Static32.aClass13_7, local51 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local25) {
						local7.method1553();
					}
					Static25.aClass7_6.method186(local7, (long) local51);
				}
				if (local29 > 1) {
					Static131.aClass3_Sub1_Sub4_Sub4Array1[local45] = local7;
				}
			}
			if (local29 > 1) {
				local7 = new Class3_Sub1_Sub4_Sub4(Static131.aClass3_Sub1_Sub4_Sub4Array1, local29);
			}
		} else {
			@Pc(112) int local112 = -1;
			for (local29 = 0; local29 < this.anIntArray317.length; local29++) {
				if (arg0 == this.anIntArray317[local29]) {
					local112 = local29;
					break;
				}
			}
			if (local112 == -1) {
				return null;
			}
			@Pc(147) boolean local147 = arg1 > 3 ^ this.aBoolean204;
			local45 = this.anIntArray316[local112];
			if (local147) {
				local45 += 65536;
			}
			local7 = (Class3_Sub1_Sub4_Sub4) Static25.aClass7_6.method183((long) local45);
			if (local7 == null) {
				local7 = Static89.method1571(Static32.aClass13_7, local45 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local147) {
					local7.method1553();
				}
				Static25.aClass7_6.method186(local7, (long) local45);
			}
		}
		if (this.anInt3001 == 128 && this.anInt3004 == 128 && this.anInt3009 == 128) {
			local25 = false;
		} else {
			local25 = true;
		}
		@Pc(224) boolean local224;
		if (this.anInt3023 == 0 && this.anInt3002 == 0 && this.anInt3021 == 0) {
			local224 = false;
		} else {
			local224 = true;
		}
		@Pc(255) Class3_Sub1_Sub4_Sub4 local255 = new Class3_Sub1_Sub4_Sub4(local7, arg1 == 0 && !local25 && !local224, this.aShortArray33 == null, this.aShortArray31 == null, true);
		if (arg0 == 4 && arg1 > 3) {
			local255.method1562();
			local255.method1566(45, 0, -45);
		}
		@Pc(281) int local281 = arg1 & 0x3;
		if (local281 == 1) {
			local255.method1573();
		} else if (local281 == 2) {
			local255.method1564();
		} else if (local281 == 3) {
			local255.method1567();
		}
		if (this.aShortArray33 != null) {
			for (local51 = 0; local51 < this.aShortArray33.length; local51++) {
				local255.method1552(this.aShortArray33[local51], this.aShortArray32[local51]);
			}
		}
		if (this.aShortArray31 != null) {
			for (local51 = 0; local51 < this.aShortArray31.length; local51++) {
				local255.method1565(this.aShortArray31[local51], this.aShortArray34[local51]);
			}
		}
		if (local25) {
			local255.method1559(this.anInt3001, this.anInt3004, this.anInt3009);
		}
		if (local224) {
			local255.method1566(this.anInt3023, this.anInt3002, this.anInt3021);
		}
		return local255;
	}
}
