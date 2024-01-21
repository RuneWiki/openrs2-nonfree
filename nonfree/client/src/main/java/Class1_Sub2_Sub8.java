import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fh", name = "C", descriptor = "[I")
	public int[] anIntArray105;

	@OriginalMember(owner = "client!fh", name = "I", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!fh", name = "O", descriptor = "[I")
	private int[] anIntArray106;

	@OriginalMember(owner = "client!fh", name = "W", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!fh", name = "ab", descriptor = "I")
	public int anInt1255;

	@OriginalMember(owner = "client!fh", name = "gb", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!fh", name = "hb", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!fh", name = "tb", descriptor = "[I")
	private int[] anIntArray107;

	@OriginalMember(owner = "client!fh", name = "Fb", descriptor = "[I")
	public int[] anIntArray108;

	@OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
	private int anInt1239 = 0;

	@OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
	private int anInt1249 = 0;

	@OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
	public int anInt1237 = 1;

	@OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
	private int anInt1246 = -1;

	@OriginalMember(owner = "client!fh", name = "T", descriptor = "I")
	public int anInt1251 = -1;

	@OriginalMember(owner = "client!fh", name = "S", descriptor = "I")
	public int anInt1250 = -1;

	@OriginalMember(owner = "client!fh", name = "jb", descriptor = "I")
	private int anInt1262 = 128;

	@OriginalMember(owner = "client!fh", name = "bb", descriptor = "I")
	public int anInt1256 = -1;

	@OriginalMember(owner = "client!fh", name = "qb", descriptor = "Z")
	public boolean aBoolean47 = false;

	@OriginalMember(owner = "client!fh", name = "Y", descriptor = "I")
	public int anInt1253 = 16;

	@OriginalMember(owner = "client!fh", name = "ib", descriptor = "I")
	public int anInt1261 = 2;

	@OriginalMember(owner = "client!fh", name = "sb", descriptor = "I")
	public int anInt1270 = 0;

	@OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
	private int anInt1244 = 0;

	@OriginalMember(owner = "client!fh", name = "lb", descriptor = "I")
	public int anInt1264 = 0;

	@OriginalMember(owner = "client!fh", name = "zb", descriptor = "[Lclient!tg;")
	public final Class81[] aClass81Array5 = new Class81[5];

	@OriginalMember(owner = "client!fh", name = "rb", descriptor = "I")
	private int anInt1269 = -1;

	@OriginalMember(owner = "client!fh", name = "yb", descriptor = "I")
	public int anInt1273 = -1;

	@OriginalMember(owner = "client!fh", name = "ob", descriptor = "I")
	private int anInt1267 = 128;

	@OriginalMember(owner = "client!fh", name = "nb", descriptor = "I")
	private int anInt1266 = 0;

	@OriginalMember(owner = "client!fh", name = "ub", descriptor = "Z")
	private boolean aBoolean48 = false;

	@OriginalMember(owner = "client!fh", name = "Ab", descriptor = "Z")
	public boolean aBoolean49 = false;

	@OriginalMember(owner = "client!fh", name = "xb", descriptor = "I")
	public int anInt1272 = -1;

	@OriginalMember(owner = "client!fh", name = "eb", descriptor = "I")
	private int anInt1259 = 128;

	@OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
	private int anInt1241 = -1;

	@OriginalMember(owner = "client!fh", name = "U", descriptor = "Z")
	public boolean aBoolean46 = true;

	@OriginalMember(owner = "client!fh", name = "Ib", descriptor = "Z")
	public boolean aBoolean50 = true;

	@OriginalMember(owner = "client!fh", name = "Bb", descriptor = "I")
	public int anInt1274 = 0;

	@OriginalMember(owner = "client!fh", name = "Cb", descriptor = "I")
	public int anInt1275 = 0;

	@OriginalMember(owner = "client!fh", name = "Hb", descriptor = "I")
	public int anInt1278 = -1;

	@OriginalMember(owner = "client!fh", name = "Gb", descriptor = "I")
	public int anInt1277 = 1;

	@OriginalMember(owner = "client!fh", name = "X", descriptor = "I")
	private int anInt1252 = 0;

	@OriginalMember(owner = "client!fh", name = "Kb", descriptor = "Z")
	public boolean aBoolean52 = false;

	@OriginalMember(owner = "client!fh", name = "Mb", descriptor = "Lclient!tg;")
	public Class81 aClass81_449 = Static51.aClass81_439;

	@OriginalMember(owner = "client!fh", name = "Jb", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(B)Z")
	public boolean method929() {
		if (this.anIntArray107 == null) {
			return true;
		}
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray107.length; local19++) {
			local17 &= Static42.aClass82_19.method2944(0, this.anIntArray107[local19] & 0xFFFF);
		}
		return local17;
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(B)Z")
	public boolean method931() {
		if (this.anIntArray108 == null) {
			return this.anInt1250 != -1 || this.anIntArray105 != null;
		}
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray108.length; local22++) {
			if (this.anIntArray108[local22] != -1) {
				@Pc(38) Class1_Sub2_Sub8 local38 = Static14.method220(this.anIntArray108[local22]);
				if (local38.anInt1250 != -1 || local38.anIntArray105 != null) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(B)V")
	public void method932() {
		if (this.anInt1256 == -1) {
			this.anInt1256 = 0;
			if (this.anIntArray107 != null && (this.anIntArray106 == null || this.anIntArray106[0] == 10)) {
				this.anInt1256 = 1;
			}
			for (@Pc(31) int local31 = 0; local31 < 5; local31++) {
				if (this.aClass81Array5[local31] != null) {
					this.anInt1256 = 1;
				}
			}
		}
		if (this.anInt1251 == -1) {
			this.anInt1251 = this.anInt1261 == 0 ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!ka;)V")
	public void method934(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method336();
			if (local9 == 0) {
				return;
			}
			this.method935(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ka;IB)V")
	private void method935(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		@Pc(36) int local36;
		@Pc(52) int local52;
		if (arg1 == 1) {
			local36 = arg0.method336();
			if (local36 > 0) {
				if (this.anIntArray107 == null || Static171.aBoolean164) {
					this.anIntArray106 = new int[local36];
					this.anIntArray107 = new int[local36];
					for (local52 = 0; local52 < local36; local52++) {
						this.anIntArray107[local52] = arg0.method359();
						this.anIntArray106[local52] = arg0.method336();
					}
				} else {
					arg0.anInt446 += local36 * 3;
				}
			}
		} else if (arg1 == 2) {
			this.aClass81_449 = arg0.method344();
		} else if (arg1 == 5) {
			local36 = arg0.method336();
			if (local36 > 0) {
				if (this.anIntArray107 != null && !Static171.aBoolean164) {
					arg0.anInt446 += local36 * 2;
					return;
				}
				this.anIntArray107 = new int[local36];
				this.anIntArray106 = null;
				for (local52 = 0; local52 < local36; local52++) {
					this.anIntArray107[local52] = arg0.method359();
				}
				return;
			}
		} else if (arg1 == 14) {
			this.anInt1237 = arg0.method336();
		} else if (arg1 == 15) {
			this.anInt1277 = arg0.method336();
			return;
		} else if (arg1 == 17) {
			this.anInt1261 = 0;
			this.aBoolean46 = false;
			return;
		} else if (arg1 == 18) {
			this.aBoolean46 = false;
			return;
		} else if (arg1 == 19) {
			this.anInt1256 = arg0.method336();
			return;
		} else if (arg1 == 21) {
			this.anInt1246 = 0;
			return;
		} else if (arg1 == 22) {
			this.aBoolean48 = true;
			return;
		} else if (arg1 == 23) {
			this.aBoolean47 = true;
			return;
		} else {
			if (arg1 == 24) {
				this.anInt1272 = arg0.method359();
				if (this.anInt1272 == 65535) {
					this.anInt1272 = -1;
					return;
				}
			} else if (arg1 == 27) {
				this.anInt1261 = 1;
				return;
			} else if (arg1 == 28) {
				this.anInt1253 = arg0.method336();
			} else if (arg1 == 29) {
				this.anInt1266 = arg0.method339();
				return;
			} else if (arg1 == 39) {
				this.anInt1252 = arg0.method339() * 5;
				return;
			} else {
				if (arg1 >= 30 && arg1 < 35) {
					this.aClass81Array5[arg1 - 30] = arg0.method344();
					if (this.aClass81Array5[arg1 - 30].method2811(Static129.aClass81_1022)) {
						this.aClass81Array5[arg1 - 30] = null;
						return;
					}
				} else if (arg1 == 40) {
					local36 = arg0.method336();
					this.aShortArray19 = new short[local36];
					this.aShortArray17 = new short[local36];
					for (local52 = 0; local52 < local36; local52++) {
						this.aShortArray17[local52] = (short) arg0.method359();
						this.aShortArray19[local52] = (short) arg0.method359();
					}
				} else if (arg1 == 41) {
					local36 = arg0.method336();
					this.aShortArray16 = new short[local36];
					this.aShortArray18 = new short[local36];
					for (local52 = 0; local52 < local36; local52++) {
						this.aShortArray16[local52] = (short) arg0.method359();
						this.aShortArray18[local52] = (short) arg0.method359();
					}
					return;
				} else if (arg1 == 60) {
					this.anInt1273 = arg0.method359();
					return;
				} else if (arg1 == 62) {
					this.aBoolean51 = true;
					return;
				} else if (arg1 == 64) {
					this.aBoolean50 = false;
					return;
				} else if (arg1 == 65) {
					this.anInt1259 = arg0.method359();
					return;
				} else if (arg1 == 66) {
					this.anInt1267 = arg0.method359();
					return;
				} else if (arg1 == 67) {
					this.anInt1262 = arg0.method359();
					return;
				} else if (arg1 == 68) {
					this.anInt1278 = arg0.method359();
					return;
				} else if (arg1 == 69) {
					this.anInt1264 = arg0.method336();
					return;
				} else if (arg1 == 70) {
					this.anInt1239 = arg0.method332();
					return;
				} else if (arg1 == 71) {
					this.anInt1244 = arg0.method332();
					return;
				} else if (arg1 == 72) {
					this.anInt1249 = arg0.method332();
					return;
				} else if (arg1 == 73) {
					this.aBoolean52 = true;
					return;
				} else if (arg1 == 74) {
					this.aBoolean49 = true;
					return;
				} else if (arg1 == 75) {
					this.anInt1251 = arg0.method336();
					return;
				} else if (arg1 == 77) {
					this.anInt1241 = arg0.method359();
					if (this.anInt1241 == 65535) {
						this.anInt1241 = -1;
					}
					this.anInt1269 = arg0.method359();
					if (this.anInt1269 == 65535) {
						this.anInt1269 = -1;
					}
					local36 = arg0.method336();
					this.anIntArray108 = new int[local36 + 1];
					for (local52 = 0; local52 <= local36; local52++) {
						this.anIntArray108[local52] = arg0.method359();
						if (this.anIntArray108[local52] == 65535) {
							this.anIntArray108[local52] = -1;
						}
					}
					return;
				} else if (arg1 == 78) {
					this.anInt1250 = arg0.method359();
					this.anInt1270 = arg0.method336();
					return;
				} else {
					if (arg1 == 79) {
						this.anInt1275 = arg0.method359();
						this.anInt1274 = arg0.method359();
						this.anInt1270 = arg0.method336();
						local36 = arg0.method336();
						this.anIntArray105 = new int[local36];
						for (local52 = 0; local52 < local36; local52++) {
							this.anIntArray105[local52] = arg0.method359();
						}
					} else if (arg1 == 81) {
						this.anInt1246 = arg0.method336() * 256;
						return;
					}
					return;
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)Lclient!fh;")
	public Class1_Sub2_Sub8 method936() {
		@Pc(5) int local5 = -1;
		if (this.anInt1241 != -1) {
			local5 = Static103.method1704(this.anInt1241);
		} else if (this.anInt1269 != -1) {
			local5 = Static83.anIntArray178[this.anInt1269];
		}
		return local5 < 0 || this.anIntArray108.length <= local5 || this.anIntArray108[local5] == -1 ? null : Static14.method220(this.anIntArray108[local5]);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BILclient!ub;IIIII[[I)Lclient!oh;")
	public Class1_Sub2_Sub1_Sub4 method937(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub2_Sub18 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[][] arg7) {
		@Pc(20) long local20;
		if (this.anIntArray106 == null) {
			local20 = arg5 + (this.anInt1255 << 10);
		} else {
			local20 = (this.anInt1255 << 10) + (arg3 << 3) + arg5;
		}
		@Pc(36) Class1_Sub2_Sub1_Sub4 local36 = (Class1_Sub2_Sub1_Sub4) Static66.aClass59_15.method1970(local20);
		if (local36 == null) {
			@Pc(44) Class1_Sub2_Sub1_Sub6 local44 = this.method938(arg3, arg5);
			if (local44 == null) {
				return null;
			}
			local36 = local44.method2745(this.anInt1266 + 64, this.anInt1252 * 5 + 768, -50, -10, -50, true);
			Static66.aClass59_15.method1973(local36, local20);
		}
		if (arg1 == null && this.anInt1246 == -1) {
			return local36;
		}
		if (arg1 == null) {
			local36 = local36.method1446(true);
		} else {
			local36 = arg1.method2893(local36, arg0, arg5);
		}
		if (this.anInt1246 >= 0) {
			local36 = local36.method1449(arg7, arg2, arg4, arg6, false, this.anInt1246);
		}
		return local36;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZII)Lclient!td;")
	private Class1_Sub2_Sub1_Sub6 method938(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class1_Sub2_Sub1_Sub6 local7 = null;
		@Pc(10) boolean local10 = this.aBoolean51;
		if (arg0 == 2 && arg1 > 3) {
			local10 = !local10;
		}
		@Pc(31) int local31;
		@Pc(33) int local33;
		@Pc(65) int local65;
		if (this.anIntArray106 == null) {
			if (arg0 != 10) {
				return null;
			}
			if (this.anIntArray107 == null) {
				return null;
			}
			local31 = this.anIntArray107.length;
			for (local33 = 0; local33 < local31; local33++) {
				local65 = this.anIntArray107[local33];
				if (local10) {
					local65 += 65536;
				}
				local7 = (Class1_Sub2_Sub1_Sub6) Static149.aClass59_23.method1970((long) local65);
				if (local7 == null) {
					local7 = Static159.method2767(Static42.aClass82_19, local65 & 0xFFFF);
					if (local7 == null) {
						return null;
					}
					if (local10) {
						local7.method2747();
					}
					Static149.aClass59_23.method1973(local7, (long) local65);
				}
				if (local31 > 1) {
					Static87.aClass1_Sub2_Sub1_Sub6Array1[local33] = local7;
				}
			}
			if (local31 > 1) {
				local7 = new Class1_Sub2_Sub1_Sub6(Static87.aClass1_Sub2_Sub1_Sub6Array1, local31);
			}
		} else {
			local31 = -1;
			for (local33 = 0; local33 < this.anIntArray106.length; local33++) {
				if (arg0 == this.anIntArray106[local33]) {
					local31 = local33;
					break;
				}
			}
			if (local31 == -1) {
				return null;
			}
			local65 = this.anIntArray107[local31];
			if (local10) {
				local65 += 65536;
			}
			local7 = (Class1_Sub2_Sub1_Sub6) Static149.aClass59_23.method1970((long) local65);
			if (local7 == null) {
				local7 = Static159.method2767(Static42.aClass82_19, local65 & 0xFFFF);
				if (local7 == null) {
					return null;
				}
				if (local10) {
					local7.method2747();
				}
				Static149.aClass59_23.method1973(local7, (long) local65);
			}
		}
		@Pc(209) boolean local209;
		if (this.anInt1259 == 128 && this.anInt1267 == 128 && this.anInt1262 == 128) {
			local209 = false;
		} else {
			local209 = true;
		}
		@Pc(227) boolean local227;
		if (this.anInt1239 == 0 && this.anInt1244 == 0 && this.anInt1249 == 0) {
			local227 = false;
		} else {
			local227 = true;
		}
		@Pc(260) Class1_Sub2_Sub1_Sub6 local260 = new Class1_Sub2_Sub1_Sub6(local7, arg1 == 0 && !local209 && !local227 && !local10, this.aShortArray17 == null, this.aShortArray16 == null, true);
		if (local10) {
			local260.method2764();
		}
		if (arg0 == 4 && arg1 > 3) {
			local260.method2765();
			local260.method2761(45, 0, -45);
		}
		@Pc(282) int local282 = arg1 & 0x3;
		if (local282 == 1) {
			local260.method2755();
		} else if (local282 == 2) {
			local260.method2759();
		} else if (local282 == 3) {
			local260.method2748();
		}
		@Pc(308) int local308;
		if (this.aShortArray17 != null) {
			for (local308 = 0; local308 < this.aShortArray17.length; local308++) {
				local260.method2752(this.aShortArray17[local308], this.aShortArray19[local308]);
			}
		}
		if (this.aShortArray16 != null) {
			for (local308 = 0; local308 < this.aShortArray16.length; local308++) {
				local260.method2756(this.aShortArray16[local308], this.aShortArray18[local308]);
			}
		}
		if (local209) {
			local260.method2753(this.anInt1259, this.anInt1267, this.anInt1262);
		}
		if (local227) {
			local260.method2761(this.anInt1239, this.anInt1244, this.anInt1249);
		}
		return local260;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIII[[I)Lclient!n;")
	public Class1_Sub2_Sub13 method940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(16) long local16;
		if (this.anIntArray106 == null) {
			local16 = arg1 + (this.anInt1255 << 10);
		} else {
			local16 = arg1 + (this.anInt1255 << 10) + (arg4 << 3);
		}
		@Pc(43) Class1_Sub2_Sub13 local43 = (Class1_Sub2_Sub13) Static116.aClass59_20.method1970(local16);
		if (local43 == null) {
			local43 = new Class1_Sub2_Sub13();
			@Pc(55) Class1_Sub2_Sub1_Sub6 local55 = this.method938(arg4, arg1);
			if (local55 == null) {
				return local43;
			}
			if (this.aBoolean48) {
				local55.aShort35 = (short) (this.anInt1252 * 5 + 768);
				local55.aShort31 = (short) (this.anInt1266 + 64);
				local55.method2749();
				local43.aClass1_Sub2_Sub1_4 = local55;
			} else {
				local43.aClass1_Sub2_Sub1_4 = local55.method2745(this.anInt1266 + 64, this.anInt1252 * 5 + 768, -50, -10, -50, ~this.anInt1246 <= -1);
			}
			Static116.aClass59_20.method1973(local43, local16);
		}
		if (this.aBoolean48 || this.anInt1246 >= 0) {
			@Pc(127) Class1_Sub2_Sub13 local127 = new Class1_Sub2_Sub13();
			local127.aClass1_Sub2_Sub1_4 = local43.aClass1_Sub2_Sub1_4;
			local43 = local127;
			if (this.aBoolean48) {
				local127.aClass1_Sub2_Sub1_4 = ((Class1_Sub2_Sub1_Sub6) local127.aClass1_Sub2_Sub1_4).method2757();
			}
			if (this.anInt1246 >= 0) {
				if (local127.aClass1_Sub2_Sub1_4 instanceof Class1_Sub2_Sub1_Sub4) {
					local127.aClass1_Sub2_Sub1_4 = ((Class1_Sub2_Sub1_Sub4) local127.aClass1_Sub2_Sub1_4).method1449(arg5, arg2, arg0, arg3, true, this.anInt1246);
				} else if (local127.aClass1_Sub2_Sub1_4 instanceof Class1_Sub2_Sub1_Sub6) {
					local127.aClass1_Sub2_Sub1_4 = ((Class1_Sub2_Sub1_Sub6) local127.aClass1_Sub2_Sub1_4).method2762(arg5, arg2, arg0, arg3, this.anInt1246);
				}
			}
		}
		return local43;
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)Z")
	public boolean method941(@OriginalArg(1) int arg0) {
		if (this.anIntArray106 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray106.length; local14++) {
				if (arg0 == this.anIntArray106[local14]) {
					return Static42.aClass82_19.method2944(0, this.anIntArray107[local14] & 0xFFFF);
				}
			}
			return true;
		} else if (this.anIntArray107 == null) {
			return true;
		} else if (arg0 == 10) {
			@Pc(59) boolean local59 = true;
			for (@Pc(61) int local61 = 0; local61 < this.anIntArray107.length; local61++) {
				local59 &= Static42.aClass82_19.method2944(0, this.anIntArray107[local61] & 0xFFFF);
			}
			return local59;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIII[[II)Lclient!oh;")
	public Class1_Sub2_Sub1_Sub4 method942(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) int arg5) {
		@Pc(19) long local19;
		if (this.anIntArray106 == null) {
			local19 = arg2 + (this.anInt1255 << 10);
		} else {
			local19 = arg2 + (this.anInt1255 << 10) + (arg1 << 3);
		}
		@Pc(35) Class1_Sub2_Sub1_Sub4 local35 = (Class1_Sub2_Sub1_Sub4) Static154.aClass59_24.method1970(local19);
		if (local35 == null) {
			@Pc(43) Class1_Sub2_Sub1_Sub6 local43 = this.method938(arg1, arg2);
			if (local43 == null) {
				return null;
			}
			local35 = local43.method2745(this.anInt1266 + 64, 768 - -(this.anInt1252 * 5), -50, -10, -50, ~this.anInt1246 <= -1);
			Static154.aClass59_24.method1973(local35, local19);
		}
		if (this.anInt1246 >= 0) {
			local35 = local35.method1449(arg4, arg5, arg0, arg3, true, this.anInt1246);
		}
		return local35;
	}
}
