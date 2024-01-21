import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class4_Sub1_Sub11 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ji", name = "D", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!ji", name = "J", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!ji", name = "S", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!ji", name = "W", descriptor = "[I")
	private int[] anIntArray212;

	@OriginalMember(owner = "client!ji", name = "Y", descriptor = "I")
	public int anInt2248;

	@OriginalMember(owner = "client!ji", name = "gb", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!ji", name = "tb", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!ji", name = "xb", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!ji", name = "C", descriptor = "I")
	public int anInt2237 = -1;

	@OriginalMember(owner = "client!ji", name = "B", descriptor = "I")
	private int anInt2236 = -1;

	@OriginalMember(owner = "client!ji", name = "P", descriptor = "I")
	private int anInt2242 = 128;

	@OriginalMember(owner = "client!ji", name = "V", descriptor = "I")
	private int anInt2246 = 0;

	@OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
	private int anInt2244 = -1;

	@OriginalMember(owner = "client!ji", name = "I", descriptor = "Z")
	public boolean aBoolean99 = false;

	@OriginalMember(owner = "client!ji", name = "R", descriptor = "I")
	public int anInt2243 = -1;

	@OriginalMember(owner = "client!ji", name = "E", descriptor = "Z")
	public boolean aBoolean98 = true;

	@OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
	public int anInt2239 = -1;

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
	public int anInt2235 = -1;

	@OriginalMember(owner = "client!ji", name = "X", descriptor = "I")
	public int anInt2247 = -1;

	@OriginalMember(owner = "client!ji", name = "K", descriptor = "I")
	private int anInt2238 = 128;

	@OriginalMember(owner = "client!ji", name = "G", descriptor = "[Lclient!jd;")
	public final Class46[] aClass46Array17 = new Class46[5];

	@OriginalMember(owner = "client!ji", name = "lb", descriptor = "Z")
	public boolean aBoolean100 = true;

	@OriginalMember(owner = "client!ji", name = "cb", descriptor = "I")
	public int anInt2251 = 1;

	@OriginalMember(owner = "client!ji", name = "eb", descriptor = "Lclient!jd;")
	public Class46 aClass46_827 = Static2.aClass46_13;

	@OriginalMember(owner = "client!ji", name = "mb", descriptor = "Z")
	public boolean aBoolean101 = true;

	@OriginalMember(owner = "client!ji", name = "ib", descriptor = "I")
	public int anInt2255 = -1;

	@OriginalMember(owner = "client!ji", name = "db", descriptor = "I")
	private int anInt2252 = 0;

	@OriginalMember(owner = "client!ji", name = "A", descriptor = "S")
	public short aShort26 = 0;

	@OriginalMember(owner = "client!ji", name = "pb", descriptor = "I")
	public int anInt2259 = 32;

	@OriginalMember(owner = "client!ji", name = "ub", descriptor = "I")
	public int anInt2263 = -1;

	@OriginalMember(owner = "client!ji", name = "yb", descriptor = "I")
	public int anInt2265 = -1;

	@OriginalMember(owner = "client!ji", name = "wb", descriptor = "I")
	public int anInt2264 = -1;

	@OriginalMember(owner = "client!ji", name = "vb", descriptor = "S")
	public short aShort27 = 0;

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)Z")
	public boolean method1738() {
		if (this.anIntArray210 == null) {
			return true;
		}
		@Pc(18) int local18 = -1;
		if (this.anInt2244 != -1) {
			local18 = Static26.method438(this.anInt2244);
		} else if (this.anInt2236 != -1) {
			local18 = Static147.anIntArray64[this.anInt2236];
		}
		return local18 >= 0 && local18 < this.anIntArray210.length && this.anIntArray210[local18] != -1;
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(B)Lclient!ji;")
	public Class4_Sub1_Sub11 method1742() {
		@Pc(10) int local10 = -1;
		if (this.anInt2244 != -1) {
			local10 = Static26.method438(this.anInt2244);
		} else if (this.anInt2236 != -1) {
			local10 = Static147.anIntArray64[this.anInt2236];
		}
		return local10 < 0 || local10 >= this.anIntArray210.length || this.anIntArray210[local10] == -1 ? null : Static105.method1980(this.anIntArray210[local10]);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILclient!h;)V")
	public void method1745(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1253();
			if (local9 == 0) {
				return;
			}
			this.method1750(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "(I)V")
	public void method1746() {
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!ca;IIILclient!ca;)Lclient!dg;")
	public Class4_Sub1_Sub1_Sub4 method1747(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class4_Sub1_Sub4 arg3) {
		if (this.anIntArray210 != null) {
			@Pc(12) Class4_Sub1_Sub11 local12 = this.method1742();
			return local12 == null ? null : local12.method1747(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class4_Sub1_Sub1_Sub4 local32 = (Class4_Sub1_Sub1_Sub4) Static180.aClass66_48.method2225((long) this.anInt2248);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray212.length; local38++) {
				if (!Static107.aClass62_28.method2872(0, this.anIntArray212[local38])) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(70) Class4_Sub1_Sub1_Sub6[] local70 = new Class4_Sub1_Sub1_Sub6[this.anIntArray212.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray212.length; local72++) {
				local70[local72] = Static51.method1003(Static107.aClass62_28, this.anIntArray212[local72]);
			}
			@Pc(107) Class4_Sub1_Sub1_Sub6 local107;
			if (local70.length == 1) {
				local107 = local70[0];
			} else {
				local107 = new Class4_Sub1_Sub1_Sub6(local70, local70.length);
			}
			@Pc(118) int local118;
			if (this.aShortArray22 != null) {
				for (local118 = 0; local118 < this.aShortArray22.length; local118++) {
					local107.method1011(this.aShortArray22[local118], this.aShortArray24[local118]);
				}
			}
			if (this.aShortArray25 != null) {
				for (local118 = 0; local118 < this.aShortArray25.length; local118++) {
					local107.method1010(this.aShortArray25[local118], this.aShortArray23[local118]);
				}
			}
			local32 = local107.method1007(this.anInt2252 + 64, this.anInt2246 + 850, -30, -50, -30, true);
			Static180.aClass66_48.method2222(local32, (long) this.anInt2248);
		}
		@Pc(196) Class4_Sub1_Sub1_Sub4 local196;
		if (arg0 != null && arg3 != null) {
			local196 = arg0.method348(arg3, arg2, local32, arg1);
		} else if (arg0 != null) {
			local196 = arg0.method344(local32, arg2);
		} else if (arg3 == null) {
			local196 = local32.method2833(true);
		} else {
			local196 = arg3.method344(local32, arg1);
		}
		if (this.anInt2238 != 128 || this.anInt2242 != 128) {
			local196.method2826(this.anInt2238, this.anInt2242, this.anInt2238);
		}
		return local196;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!h;BI)V")
	private void method1750(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (arg1 == 1) {
			local20 = arg0.method1253();
			this.anIntArray212 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray212[local26] = arg0.method1252();
			}
		} else if (arg1 == 2) {
			this.aClass46_827 = arg0.method1247();
		} else if (arg1 == 12) {
			this.anInt2251 = arg0.method1253();
			return;
		} else if (arg1 == 13) {
			this.anInt2264 = arg0.method1252();
			return;
		} else if (arg1 == 14) {
			this.anInt2235 = arg0.method1252();
			return;
		} else if (arg1 == 15) {
			this.anInt2239 = arg0.method1252();
			return;
		} else if (arg1 == 16) {
			this.anInt2247 = arg0.method1252();
			return;
		} else if (arg1 == 17) {
			this.anInt2235 = arg0.method1252();
			this.anInt2265 = arg0.method1252();
			this.anInt2237 = arg0.method1252();
			this.anInt2243 = arg0.method1252();
			return;
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass46Array17[arg1 - 30] = arg0.method1247();
			if (this.aClass46Array17[arg1 - 30].method1683(Static130.aClass46_1141)) {
				this.aClass46Array17[arg1 - 30] = null;
				return;
			}
		} else if (arg1 == 40) {
			local20 = arg0.method1253();
			this.aShortArray24 = new short[local20];
			this.aShortArray22 = new short[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.aShortArray22[local26] = (short) arg0.method1252();
				this.aShortArray24[local26] = (short) arg0.method1252();
			}
			return;
		} else if (arg1 == 41) {
			local20 = arg0.method1253();
			this.aShortArray23 = new short[local20];
			this.aShortArray25 = new short[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.aShortArray25[local26] = (short) arg0.method1252();
				this.aShortArray23[local26] = (short) arg0.method1252();
			}
			return;
		} else if (arg1 == 60) {
			local20 = arg0.method1253();
			this.anIntArray213 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray213[local26] = arg0.method1252();
			}
			return;
		} else if (arg1 == 93) {
			this.aBoolean101 = false;
			return;
		} else if (arg1 == 95) {
			this.anInt2263 = arg0.method1252();
			return;
		} else if (arg1 == 97) {
			this.anInt2238 = arg0.method1252();
			return;
		} else if (arg1 == 98) {
			this.anInt2242 = arg0.method1252();
			return;
		} else if (arg1 == 99) {
			this.aBoolean99 = true;
			return;
		} else if (arg1 == 100) {
			this.anInt2252 = arg0.method1241();
			return;
		} else if (arg1 == 101) {
			this.anInt2246 = arg0.method1241() * 5;
			return;
		} else if (arg1 == 102) {
			this.anInt2255 = arg0.method1252();
			return;
		} else if (arg1 == 103) {
			this.anInt2259 = arg0.method1252();
			return;
		} else if (arg1 == 106) {
			this.anInt2244 = arg0.method1252();
			if (this.anInt2244 == 65535) {
				this.anInt2244 = -1;
			}
			this.anInt2236 = arg0.method1252();
			if (this.anInt2236 == 65535) {
				this.anInt2236 = -1;
			}
			local20 = arg0.method1253();
			this.anIntArray210 = new int[local20 + 1];
			for (local26 = 0; local26 <= local20; local26++) {
				this.anIntArray210[local26] = arg0.method1252();
				if (this.anIntArray210[local26] == 65535) {
					this.anIntArray210[local26] = -1;
				}
			}
			return;
		} else if (arg1 == 107) {
			this.aBoolean98 = false;
			return;
		} else {
			if (arg1 == 109) {
				this.aBoolean100 = false;
			} else if (arg1 != 111) {
				if (arg1 != 113) {
					if (arg1 == 114) {
						arg0.method1241();
						arg0.method1241();
					} else if (arg1 == 115) {
						this.aShort27 = (short) (arg0.method1253() * 4);
						this.aShort26 = (short) (arg0.method1253() * 4);
						return;
					}
					return;
				}
				arg0.method1252();
				arg0.method1252();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILclient!ca;)Lclient!dg;")
	public Class4_Sub1_Sub1_Sub4 method1751(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub1_Sub4 arg1) {
		if (this.anIntArray210 != null) {
			@Pc(12) Class4_Sub1_Sub11 local12 = this.method1742();
			return local12 == null ? null : local12.method1751(arg0, arg1);
		} else if (this.anIntArray213 == null) {
			return null;
		} else {
			@Pc(40) Class4_Sub1_Sub1_Sub4 local40 = (Class4_Sub1_Sub1_Sub4) Static134.aClass66_41.method2225((long) this.anInt2248);
			if (local40 == null) {
				@Pc(44) boolean local44 = false;
				for (@Pc(46) int local46 = 0; local46 < this.anIntArray213.length; local46++) {
					if (!Static107.aClass62_28.method2872(0, this.anIntArray213[local46])) {
						local44 = true;
					}
				}
				if (local44) {
					return null;
				}
				@Pc(74) Class4_Sub1_Sub1_Sub6[] local74 = new Class4_Sub1_Sub1_Sub6[this.anIntArray213.length];
				for (@Pc(76) int local76 = 0; local76 < this.anIntArray213.length; local76++) {
					local74[local76] = Static51.method1003(Static107.aClass62_28, this.anIntArray213[local76]);
				}
				@Pc(111) Class4_Sub1_Sub1_Sub6 local111;
				if (local74.length == 1) {
					local111 = local74[0];
				} else {
					local111 = new Class4_Sub1_Sub1_Sub6(local74, local74.length);
				}
				@Pc(122) int local122;
				if (this.aShortArray22 != null) {
					for (local122 = 0; local122 < this.aShortArray22.length; local122++) {
						local111.method1011(this.aShortArray22[local122], this.aShortArray24[local122]);
					}
				}
				if (this.aShortArray25 != null) {
					for (local122 = 0; local122 < this.aShortArray25.length; local122++) {
						local111.method1010(this.aShortArray25[local122], this.aShortArray23[local122]);
					}
				}
				local40 = local111.method1007(64, 768, -50, -10, -50, true);
				Static134.aClass66_41.method2222(local40, (long) this.anInt2248);
			}
			if (arg1 != null) {
				local40 = arg1.method349(arg0, local40);
			}
			return local40;
		}
	}
}
