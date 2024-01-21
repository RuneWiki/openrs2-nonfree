import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class4_Sub4_Sub7 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ic", name = "H", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
	public int anInt1254;

	@OriginalMember(owner = "client!ic", name = "X", descriptor = "[I")
	public int[] anIntArray157;

	@OriginalMember(owner = "client!ic", name = "eb", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!ic", name = "nb", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!ic", name = "rb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!ic", name = "Gb", descriptor = "[I")
	public int[] anIntArray160;

	@OriginalMember(owner = "client!ic", name = "Nb", descriptor = "I")
	private int anInt1287;

	@OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
	public int anInt1247 = 0;

	@OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
	private int anInt1258 = -1;

	@OriginalMember(owner = "client!ic", name = "jb", descriptor = "I")
	public int anInt1266 = 2000;

	@OriginalMember(owner = "client!ic", name = "db", descriptor = "I")
	public int anInt1262 = -1;

	@OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
	private int anInt1246 = -1;

	@OriginalMember(owner = "client!ic", name = "gb", descriptor = "I")
	private int anInt1264 = -1;

	@OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
	private int anInt1260 = 0;

	@OriginalMember(owner = "client!ic", name = "xb", descriptor = "I")
	public int anInt1276 = -1;

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
	public int anInt1249 = 0;

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
	public int anInt1257 = 0;

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "Z")
	public boolean aBoolean75 = false;

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
	public int anInt1248 = 0;

	@OriginalMember(owner = "client!ic", name = "lb", descriptor = "I")
	private int anInt1268 = -1;

	@OriginalMember(owner = "client!ic", name = "ob", descriptor = "I")
	public int anInt1270 = 0;

	@OriginalMember(owner = "client!ic", name = "fb", descriptor = "I")
	private int anInt1263 = 0;

	@OriginalMember(owner = "client!ic", name = "ib", descriptor = "Lclient!v;")
	public Class76 aClass76_556 = Static55.aClass76_613;

	@OriginalMember(owner = "client!ic", name = "qb", descriptor = "I")
	private int anInt1272 = 128;

	@OriginalMember(owner = "client!ic", name = "yb", descriptor = "I")
	private int anInt1277 = -1;

	@OriginalMember(owner = "client!ic", name = "wb", descriptor = "I")
	private int anInt1275 = -1;

	@OriginalMember(owner = "client!ic", name = "hb", descriptor = "I")
	private int anInt1265 = -1;

	@OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
	public int anInt1245 = 0;

	@OriginalMember(owner = "client!ic", name = "R", descriptor = "[Lclient!v;")
	public Class76[] aClass76Array10 = new Class76[] { null, null, null, null, Static62.aClass76_676 };

	@OriginalMember(owner = "client!ic", name = "Mb", descriptor = "I")
	public int anInt1286 = 0;

	@OriginalMember(owner = "client!ic", name = "Ab", descriptor = "I")
	private int anInt1279 = 128;

	@OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
	private int anInt1259 = -1;

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
	public int anInt1253 = 0;

	@OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
	private int anInt1250 = -1;

	@OriginalMember(owner = "client!ic", name = "Pb", descriptor = "I")
	private int anInt1289 = 128;

	@OriginalMember(owner = "client!ic", name = "Qb", descriptor = "[Lclient!v;")
	public Class76[] aClass76Array11 = new Class76[] { null, null, Static35.aClass76_412, null, null };

	@OriginalMember(owner = "client!ic", name = "pb", descriptor = "I")
	private int anInt1271 = -1;

	@OriginalMember(owner = "client!ic", name = "Rb", descriptor = "I")
	public int anInt1290 = 0;

	@OriginalMember(owner = "client!ic", name = "Sb", descriptor = "I")
	public int anInt1291 = 1;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)Lclient!u;")
	public Class4_Sub4_Sub3_Sub7 method851(@OriginalArg(1) int arg0) {
		if (this.anIntArray157 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray160[local15] <= arg0 && this.anIntArray160[local15] != 0) {
					local13 = this.anIntArray157[local15];
				}
			}
			if (local13 != -1) {
				return Static61.method1040(local13).method851(1);
			}
		}
		@Pc(55) Class4_Sub4_Sub3_Sub7 local55 = (Class4_Sub4_Sub3_Sub7) Static3.aClass72_22.method1781((long) this.anInt1254);
		if (local55 != null) {
			return local55;
		}
		@Pc(65) Class4_Sub4_Sub3_Sub5 local65 = Static108.method1648(Static41.aClass17_14, this.anInt1287);
		if (local65 == null) {
			return null;
		}
		if (this.anInt1272 != 128 || this.anInt1289 != 128 || this.anInt1279 != 128) {
			local65.method1646(this.anInt1272, this.anInt1289, this.anInt1279);
		}
		@Pc(96) int local96;
		if (this.aShortArray6 != null) {
			for (local96 = 0; local96 < this.aShortArray6.length; local96++) {
				local65.method1657(this.aShortArray6[local96], this.aShortArray7[local96]);
			}
		}
		if (this.aShortArray5 != null) {
			for (local96 = 0; local96 < this.aShortArray5.length; local96++) {
				local65.method1655(this.aShortArray5[local96], this.aShortArray8[local96]);
			}
		}
		local55 = local65.method1652(this.anInt1286 + 64, this.anInt1290 + 768, -50, -10, -50);
		local55.aBoolean147 = true;
		Static3.aClass72_22.method1783(local55, (long) this.anInt1254);
		return local55;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)Z")
	public boolean method853(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt1259;
		@Pc(9) int local9 = this.anInt1277;
		@Pc(12) int local12 = this.anInt1265;
		if (arg0) {
			local12 = this.anInt1258;
			local6 = this.anInt1246;
			local9 = this.anInt1268;
		}
		if (local9 == -1) {
			return true;
		}
		@Pc(38) boolean local38 = true;
		if (!Static41.aClass17_14.method300(local9, 0)) {
			local38 = false;
		}
		if (local6 != -1 && !Static41.aClass17_14.method300(local6, 0)) {
			local38 = false;
		}
		if (local12 != -1 && !Static41.aClass17_14.method300(local12, 0)) {
			local38 = false;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)Lclient!sd;")
	public Class4_Sub4_Sub3_Sub5 method854(@OriginalArg(0) int arg0) {
		@Pc(15) int local15;
		if (this.anIntArray157 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray160[local15] && this.anIntArray160[local15] != 0) {
					local13 = this.anIntArray157[local15];
				}
			}
			if (local13 != -1) {
				return Static61.method1040(local13).method854(1);
			}
		}
		@Pc(59) Class4_Sub4_Sub3_Sub5 local59 = Static108.method1648(Static41.aClass17_14, this.anInt1287);
		if (local59 == null) {
			return null;
		}
		if (this.anInt1272 != 128 || this.anInt1289 != 128 || this.anInt1279 != 128) {
			local59.method1646(this.anInt1272, this.anInt1289, this.anInt1279);
		}
		if (this.aShortArray6 != null) {
			for (local15 = 0; local15 < this.aShortArray6.length; local15++) {
				local59.method1657(this.aShortArray6[local15], this.aShortArray7[local15]);
			}
		}
		if (this.aShortArray5 != null) {
			for (local15 = 0; local15 < this.aShortArray5.length; local15++) {
				local59.method1655(this.aShortArray5[local15], this.aShortArray8[local15]);
			}
		}
		return local59;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ne;II)V")
	private void method857(@OriginalArg(0) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1287 = arg0.method604();
		} else if (arg1 == 2) {
			this.aClass76_556 = arg0.method581();
		} else if (arg1 == 4) {
			this.anInt1266 = arg0.method604();
		} else if (arg1 == 5) {
			this.anInt1253 = arg0.method604();
		} else if (arg1 == 6) {
			this.anInt1248 = arg0.method604();
		} else if (arg1 == 7) {
			this.anInt1249 = arg0.method604();
			if (this.anInt1249 > 32767) {
				this.anInt1249 -= 65536;
			}
		} else if (arg1 == 8) {
			this.anInt1257 = arg0.method604();
			if (this.anInt1257 > 32767) {
				this.anInt1257 -= 65536;
			}
		} else if (arg1 == 11) {
			this.anInt1270 = 1;
		} else if (arg1 == 12) {
			this.anInt1291 = arg0.method549();
		} else if (arg1 == 16) {
			this.aBoolean75 = true;
		} else if (arg1 == 23) {
			this.anInt1277 = arg0.method604();
			this.anInt1263 = arg0.method599();
		} else if (arg1 == 24) {
			this.anInt1259 = arg0.method604();
		} else if (arg1 == 25) {
			this.anInt1268 = arg0.method604();
			this.anInt1260 = arg0.method599();
		} else if (arg1 == 26) {
			this.anInt1246 = arg0.method604();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass76Array11[arg1 - 30] = arg0.method581();
			if (this.aClass76Array11[arg1 - 30].method1882(Static95.aClass76_990)) {
				this.aClass76Array11[arg1 - 30] = null;
			}
		} else if (arg1 >= 35 && arg1 < 40) {
			this.aClass76Array10[arg1 - 35] = arg0.method581();
		} else {
			@Pc(143) int local143;
			@Pc(153) int local153;
			if (arg1 == 40) {
				local143 = arg0.method599();
				this.aShortArray7 = new short[local143];
				this.aShortArray6 = new short[local143];
				for (local153 = 0; local153 < local143; local153++) {
					this.aShortArray6[local153] = (short) arg0.method604();
					this.aShortArray7[local153] = (short) arg0.method604();
				}
			} else if (arg1 == 41) {
				local143 = arg0.method599();
				this.aShortArray8 = new short[local143];
				this.aShortArray5 = new short[local143];
				for (local153 = 0; local153 < local143; local153++) {
					this.aShortArray5[local153] = (short) arg0.method604();
					this.aShortArray8[local153] = (short) arg0.method604();
				}
			} else if (arg1 == 78) {
				this.anInt1265 = arg0.method604();
			} else if (arg1 == 79) {
				this.anInt1258 = arg0.method604();
			} else if (arg1 == 90) {
				this.anInt1250 = arg0.method604();
			} else if (arg1 == 91) {
				this.anInt1271 = arg0.method604();
			} else if (arg1 == 92) {
				this.anInt1275 = arg0.method604();
			} else if (arg1 == 93) {
				this.anInt1264 = arg0.method604();
			} else if (arg1 == 95) {
				this.anInt1247 = arg0.method604();
			} else if (arg1 == 97) {
				this.anInt1276 = arg0.method604();
			} else if (arg1 == 98) {
				this.anInt1262 = arg0.method604();
			} else if (arg1 >= 100 && arg1 < 110) {
				if (this.anIntArray157 == null) {
					this.anIntArray160 = new int[10];
					this.anIntArray157 = new int[10];
				}
				this.anIntArray157[arg1 - 100] = arg0.method604();
				this.anIntArray160[arg1 - 100] = arg0.method604();
			} else if (arg1 == 110) {
				this.anInt1272 = arg0.method604();
			} else if (arg1 == 111) {
				this.anInt1289 = arg0.method604();
			} else if (arg1 == 112) {
				this.anInt1279 = arg0.method604();
			} else if (arg1 == 113) {
				this.anInt1286 = arg0.method579();
			} else if (arg1 == 114) {
				this.anInt1290 = arg0.method579() * 5;
			} else if (arg1 == 115) {
				this.anInt1245 = arg0.method599();
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(ZI)Lclient!ic;")
	public Class4_Sub4_Sub7 method858(@OriginalArg(1) int arg0) {
		if (this.anIntArray157 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray160[local15] && this.anIntArray160[local15] != 0) {
					local13 = this.anIntArray157[local15];
				}
			}
			if (local13 != -1) {
				return Static61.method1040(local13);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ne;I)V")
	public void method859(@OriginalArg(0) Class4_Sub10 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method599();
			if (local5 == 0) {
				return;
			}
			this.method857(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZ)Lclient!sd;")
	public Class4_Sub4_Sub3_Sub5 method860(@OriginalArg(1) boolean arg0) {
		@Pc(4) int local4 = this.anInt1259;
		@Pc(7) int local7 = this.anInt1277;
		@Pc(14) int local14 = this.anInt1265;
		if (arg0) {
			local7 = this.anInt1268;
			local4 = this.anInt1246;
			local14 = this.anInt1258;
		}
		if (local7 == -1) {
			return null;
		}
		@Pc(36) Class4_Sub4_Sub3_Sub5 local36 = Static108.method1648(Static41.aClass17_14, local7);
		if (local4 != -1) {
			@Pc(44) Class4_Sub4_Sub3_Sub5 local44 = Static108.method1648(Static41.aClass17_14, local4);
			if (local14 == -1) {
				@Pc(87) Class4_Sub4_Sub3_Sub5[] local87 = new Class4_Sub4_Sub3_Sub5[] { local36, local44 };
				local36 = new Class4_Sub4_Sub3_Sub5(local87, 2);
			} else {
				@Pc(53) Class4_Sub4_Sub3_Sub5 local53 = Static108.method1648(Static41.aClass17_14, local14);
				@Pc(68) Class4_Sub4_Sub3_Sub5[] local68 = new Class4_Sub4_Sub3_Sub5[] { local36, local44, local53 };
				local36 = new Class4_Sub4_Sub3_Sub5(local68, 3);
			}
		}
		if (!arg0 && this.anInt1263 != 0) {
			local36.method1645(0, this.anInt1263, 0);
		}
		if (arg0 && this.anInt1260 != 0) {
			local36.method1645(0, this.anInt1260, 0);
		}
		@Pc(128) int local128;
		if (this.aShortArray6 != null) {
			for (local128 = 0; local128 < this.aShortArray6.length; local128++) {
				local36.method1657(this.aShortArray6[local128], this.aShortArray7[local128]);
			}
		}
		if (this.aShortArray5 != null) {
			for (local128 = 0; local128 < this.aShortArray5.length; local128++) {
				local36.method1655(this.aShortArray5[local128], this.aShortArray8[local128]);
			}
		}
		return local36;
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
	public void method863() {
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(ZI)Lclient!sd;")
	public Class4_Sub4_Sub3_Sub5 method864(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt1275;
		@Pc(11) int local11 = this.anInt1250;
		if (arg0) {
			local8 = this.anInt1264;
			local11 = this.anInt1271;
		}
		if (local11 == -1) {
			return null;
		}
		@Pc(30) Class4_Sub4_Sub3_Sub5 local30 = Static108.method1648(Static41.aClass17_14, local11);
		if (local8 != -1) {
			@Pc(38) Class4_Sub4_Sub3_Sub5 local38 = Static108.method1648(Static41.aClass17_14, local8);
			@Pc(49) Class4_Sub4_Sub3_Sub5[] local49 = new Class4_Sub4_Sub3_Sub5[] { local30, local38 };
			local30 = new Class4_Sub4_Sub3_Sub5(local49, 2);
		}
		@Pc(68) int local68;
		if (this.aShortArray6 != null) {
			for (local68 = 0; local68 < this.aShortArray6.length; local68++) {
				local30.method1657(this.aShortArray6[local68], this.aShortArray7[local68]);
			}
		}
		if (this.aShortArray5 != null) {
			for (local68 = 0; local68 < this.aShortArray5.length; local68++) {
				local30.method1655(this.aShortArray5[local68], this.aShortArray8[local68]);
			}
		}
		return local30;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(ZZ)Z")
	public boolean method865(@OriginalArg(1) boolean arg0) {
		@Pc(6) int local6 = this.anInt1250;
		@Pc(9) int local9 = this.anInt1275;
		if (arg0) {
			local6 = this.anInt1271;
			local9 = this.anInt1264;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(25) boolean local25 = true;
		if (!Static41.aClass17_14.method300(local6, 0)) {
			local25 = false;
		}
		if (local9 != -1 && !Static41.aClass17_14.method300(local9, 0)) {
			local25 = false;
		}
		return local25;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ic;ILclient!ic;)V")
	public void method866(@OriginalArg(0) Class4_Sub4_Sub7 arg0, @OriginalArg(2) Class4_Sub4_Sub7 arg1) {
		this.anInt1253 = arg0.anInt1253;
		this.aShortArray6 = arg0.aShortArray6;
		this.anInt1248 = arg0.anInt1248;
		this.anInt1247 = arg0.anInt1247;
		this.aShortArray8 = arg0.aShortArray8;
		this.anInt1287 = arg0.anInt1287;
		this.aShortArray5 = arg0.aShortArray5;
		this.anInt1270 = 1;
		this.aBoolean75 = arg1.aBoolean75;
		this.aClass76_556 = arg1.aClass76_556;
		this.anInt1249 = arg0.anInt1249;
		this.anInt1266 = arg0.anInt1266;
		this.anInt1257 = arg0.anInt1257;
		this.aShortArray7 = arg0.aShortArray7;
		this.anInt1291 = arg1.anInt1291;
	}
}
