import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public abstract class Class44 {

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "[I")
	protected int[] anIntArray239;

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "Lclient!wg;")
	private Class90 aClass90_2;

	@OriginalMember(owner = "client!jg", name = "n", descriptor = "[I")
	protected int[] anIntArray242;

	@OriginalMember(owner = "client!jg", name = "o", descriptor = "[I")
	protected int[] anIntArray243;

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray29;

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!jg", name = "z", descriptor = "[I")
	private int[] anIntArray244;

	@OriginalMember(owner = "client!jg", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!jg", name = "C", descriptor = "[Lclient!wg;")
	private Class90[] aClass90Array2;

	@OriginalMember(owner = "client!jg", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
	public int anInt2393;

	@OriginalMember(owner = "client!jg", name = "K", descriptor = "[I")
	private int[] anIntArray245;

	@OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
	private int anInt2395;

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "Z")
	private final boolean aBoolean98;

	@OriginalMember(owner = "client!jg", name = "v", descriptor = "Z")
	private final boolean aBoolean99;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(ZZ)V")
	protected Class44(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean98 = arg0;
		this.aBoolean99 = arg1;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)Z")
	public final boolean method1611(@OriginalArg(0) int arg0) {
		if (this.anObjectArray29[arg0] == null) {
			this.method1630(arg0);
			return this.anObjectArray29[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)Z")
	public final boolean method1612() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray245.length; local9++) {
			@Pc(16) int local16 = this.anIntArray245[local9];
			if (this.anObjectArray29[local16] == null) {
				this.method1630(local16);
				if (this.anObjectArray29[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!kb;ILclient!kb;)Z")
	public final boolean method1613(@OriginalArg(0) Class46 arg0, @OriginalArg(2) Class46 arg1) {
		@Pc(7) Class46 local7 = arg0.method1353();
		@Pc(11) Class46 local11 = arg1.method1353();
		@Pc(23) int local23 = this.aClass90_2.method2898(local7.method1365());
		@Pc(33) int local33 = this.aClass90Array2[local23].method2898(local11.method1365());
		return this.method1618(local33, local23);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II[II)[B")
	public final byte[] method1614(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg2 < 0 || arg2 >= this.anObjectArrayArray2[arg0].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg2] == null) {
			@Pc(40) boolean local40 = this.method1634(arg1, arg0);
			if (!local40) {
				this.method1630(arg0);
				local40 = this.method1634(arg1, arg0);
				if (!local40) {
					return null;
				}
			}
		}
		@Pc(66) byte[] local66 = Static85.method468(false, this.anObjectArrayArray2[arg0][arg2]);
		if (this.aBoolean99) {
			this.anObjectArrayArray2[arg0][arg2] = null;
		}
		return local66;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)[I")
	public final int[] method1615(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray22[arg0];
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(IB)V")
	protected void method1616(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!kb;)I")
	public final int method1617(@OriginalArg(1) Class46 arg0) {
		@Pc(3) Class46 local3 = arg0.method1353();
		return this.aClass90_2.method2898(local3.method1365());
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)Z")
	public final boolean method1618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || arg0 >= this.anObjectArrayArray2[arg1].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray29[arg1] == null) {
			this.method1630(arg1);
			return this.anObjectArray29[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)I")
	public final int method1619(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIB)[B")
	public final byte[] method1620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(52) boolean local52 = this.method1634(null, arg0);
			if (!local52) {
				this.method1630(arg0);
				local52 = this.method1634(null, arg0);
				if (!local52) {
					return null;
				}
			}
		}
		return Static85.method468(false, this.anObjectArrayArray2[arg0][arg1]);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)Z")
	public final boolean method1621(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1618(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1618(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!kb;ZLclient!kb;)[B")
	public final byte[] method1622(@OriginalArg(0) Class46 arg0, @OriginalArg(2) Class46 arg1) {
		@Pc(7) Class46 local7 = arg1.method1353();
		@Pc(11) Class46 local11 = arg0.method1353();
		@Pc(19) int local19 = this.aClass90_2.method2898(local7.method1365());
		@Pc(29) int local29 = this.aClass90Array2[local19].method2898(local11.method1365());
		return this.method1624(local19, local29);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "([BI)V")
	protected final void method1623(@OriginalArg(0) byte[] arg0) {
		this.anInt2393 = Static124.method2119(arg0.length, arg0);
		@Pc(21) Class3_Sub4 local21 = new Class3_Sub4(Static15.method318(arg0));
		@Pc(25) int local25 = local21.method191();
		if (local25 != 5 && local25 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local25);
		}
		if (local25 >= 6) {
			local21.method213();
		}
		@Pc(59) int local59 = local21.method191();
		this.anInt2395 = local21.method208();
		@Pc(66) int local66 = 0;
		this.anIntArray245 = new int[this.anInt2395];
		@Pc(73) int local73 = -1;
		for (@Pc(75) int local75 = 0; local75 < this.anInt2395; local75++) {
			this.anIntArray245[local75] = local66 += local21.method208();
			if (local73 < this.anIntArray245[local75]) {
				local73 = this.anIntArray245[local75];
			}
		}
		this.anIntArray242 = new int[local73 + 1];
		this.anObjectArray29 = new Object[local73 + 1];
		this.anIntArrayArray22 = new int[local73 + 1][];
		this.anIntArray243 = new int[local73 + 1];
		this.anObjectArrayArray2 = new Object[local73 + 1][];
		this.anIntArray239 = new int[local73 + 1];
		@Pc(166) int local166;
		@Pc(181) int local181;
		if (local59 != 0) {
			this.anIntArray244 = new int[local73 + 1];
			for (local166 = 0; local166 < local73 + 1; local166++) {
				this.anIntArray244[local166] = -1;
			}
			for (local181 = 0; local181 < this.anInt2395; local181++) {
				this.anIntArray244[this.anIntArray245[local181]] = local21.method213();
			}
			this.aClass90_2 = new Class90(this.anIntArray244);
		}
		for (local166 = 0; local166 < this.anInt2395; local166++) {
			this.anIntArray243[this.anIntArray245[local166]] = local21.method213();
		}
		for (local181 = 0; local181 < this.anInt2395; local181++) {
			this.anIntArray239[this.anIntArray245[local181]] = local21.method213();
		}
		for (@Pc(249) int local249 = 0; local249 < this.anInt2395; local249++) {
			this.anIntArray242[this.anIntArray245[local249]] = local21.method208();
		}
		@Pc(277) int local277;
		@Pc(284) int local284;
		@Pc(272) int local272;
		@Pc(292) int local292;
		@Pc(311) int local311;
		for (@Pc(268) int local268 = 0; local268 < this.anInt2395; local268++) {
			local272 = -1;
			local277 = this.anIntArray245[local268];
			local66 = 0;
			local284 = this.anIntArray242[local277];
			this.anIntArrayArray22[local277] = new int[local284];
			for (local292 = 0; local292 < local284; local292++) {
				local311 = this.anIntArrayArray22[local277][local292] = local66 += local21.method208();
				if (local272 < local311) {
					local272 = local311;
				}
			}
			this.anObjectArrayArray2[local277] = new Object[local272 + 1];
		}
		if (local59 == 0) {
			return;
		}
		this.anIntArrayArray23 = new int[local73 + 1][];
		this.aClass90Array2 = new Class90[local73 + 1];
		for (local277 = 0; local277 < this.anInt2395; local277++) {
			local284 = this.anIntArray245[local277];
			local272 = this.anIntArray242[local284];
			this.anIntArrayArray23[local284] = new int[this.anObjectArrayArray2[local284].length];
			for (local292 = 0; local292 < this.anObjectArrayArray2[local284].length; local292++) {
				this.anIntArrayArray23[local284][local292] = -1;
			}
			for (local311 = 0; local311 < local272; local311++) {
				this.anIntArrayArray23[local284][this.anIntArrayArray22[local284][local311]] = local21.method213();
			}
			this.aClass90Array2[local284] = new Class90(this.anIntArrayArray23[local284]);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBI)[B")
	public final byte[] method1624(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method1614(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)I")
	public final int method1625() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(II)V")
	public final void method1626(@OriginalArg(0) int arg0) {
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArrayArray2[arg0].length; local11++) {
			this.anObjectArrayArray2[arg0][local11] = null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)V")
	public final void method1628() {
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray2.length; local7++) {
			if (this.anObjectArrayArray2[local7] != null) {
				for (@Pc(16) int local16 = 0; local16 < this.anObjectArrayArray2[local7].length; local16++) {
					this.anObjectArrayArray2[local7][local16] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(IB)V")
	protected void method1630(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!kb;I)I")
	public final int method1631(@OriginalArg(1) Class46 arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class46 local3 = arg0.method1353();
		return this.aClass90Array2[arg1].method2898(local3.method1365());
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!kb;I)V")
	public final void method1632(@OriginalArg(0) Class46 arg0) {
		@Pc(14) Class46 local14 = arg0.method1353();
		@Pc(22) int local22 = this.aClass90_2.method2898(local14.method1365());
		if (local22 >= 0) {
			this.method1616(local22);
		}
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(II)[B")
	public final byte[] method1633(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1624(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1624(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "([IBI)Z")
	private boolean method1634(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.anObjectArray29[arg1] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray242[arg1];
		@Pc(19) boolean local19 = true;
		@Pc(24) int[] local24 = this.anIntArrayArray22[arg1];
		@Pc(29) Object[] local29 = this.anObjectArrayArray2[arg1];
		for (@Pc(39) int local39 = 0; local39 < local17; local39++) {
			if (local29[local24[local39]] == null) {
				local19 = false;
				break;
			}
		}
		if (local19) {
			return true;
		}
		@Pc(92) byte[] local92;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local92 = Static85.method468(false, this.anObjectArray29[arg1]);
		} else {
			local92 = Static85.method468(true, this.anObjectArray29[arg1]);
			@Pc(97) Class3_Sub4 local97 = new Class3_Sub4(local92);
			local97.method196(local97.aByteArray5.length, arg0);
		}
		@Pc(119) byte[] local119;
		try {
			local119 = Static15.method318(local92);
		} catch (@Pc(121) RuntimeException local121) {
			throw Static89.method1478(local121, "T3 - " + (arg0 != null) + "," + arg1 + "," + local92.length + "," + Static124.method2119(local92.length, local92) + "," + Static124.method2119(local92.length - 2, local92) + "," + this.anIntArray243[arg1] + "," + this.anInt2393);
		}
		if (this.aBoolean98) {
			this.anObjectArray29[arg1] = null;
		}
		if (local17 > 1) {
			@Pc(212) int local212 = local119.length;
			@Pc(215) int local215 = local212 - 1;
			@Pc(219) int local219 = local119[local215] & 0xFF;
			@Pc(227) int local227 = local215 - local219 * 4 * local17;
			@Pc(232) Class3_Sub4 local232 = new Class3_Sub4(local119);
			local232.anInt232 = local227;
			@Pc(238) int[] local238 = new int[local17];
			@Pc(246) int local246;
			for (@Pc(240) int local240 = 0; local240 < local219; local240++) {
				@Pc(244) int local244 = 0;
				for (local246 = 0; local246 < local17; local246++) {
					local244 += local232.method213();
					local238[local246] += local244;
				}
			}
			@Pc(276) byte[][] local276 = new byte[local17][];
			for (local246 = 0; local246 < local17; local246++) {
				local276[local246] = new byte[local238[local246]];
				local238[local246] = 0;
			}
			local232.anInt232 = local227;
			@Pc(304) int local304 = 0;
			@Pc(310) int local310;
			for (@Pc(306) int local306 = 0; local306 < local219; local306++) {
				local310 = 0;
				for (@Pc(312) int local312 = 0; local312 < local17; local312++) {
					local310 += local232.method213();
					Static184.method1309(local119, local304, local276[local312], local238[local312], local310);
					local304 += local310;
					local238[local312] += local310;
				}
			}
			for (local310 = 0; local310 < local17; local310++) {
				if (this.aBoolean99) {
					local29[local24[local310]] = local276[local310];
				} else {
					local29[local24[local310]] = Static50.method995(local276[local310]);
				}
			}
		} else if (this.aBoolean99) {
			local29[local24[0]] = local119;
		} else {
			local29[local24[0]] = Static50.method995(local119);
		}
		return true;
	}
}
