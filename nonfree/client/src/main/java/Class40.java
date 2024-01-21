import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public abstract class Class40 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "[I")
	protected int[] anIntArray160;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	public int anInt1501;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
	protected int anInt1505;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "[Lclient!se;")
	private Class67[] aClass67Array2;

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "[I")
	protected int[] anIntArray162;

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
	private int anInt1513;

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "[I")
	private int[] anIntArray163;

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!lc", name = "M", descriptor = "[I")
	protected int[] anIntArray165;

	@OriginalMember(owner = "client!lc", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!lc", name = "T", descriptor = "Lclient!se;")
	private Class67 aClass67_2;

	@OriginalMember(owner = "client!lc", name = "P", descriptor = "Z")
	private final boolean aBoolean56;

	@OriginalMember(owner = "client!lc", name = "L", descriptor = "Z")
	private final boolean aBoolean55;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(ZZ)V")
	protected Class40(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean56 = arg1;
		this.aBoolean55 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([BB)V")
	protected final void method1097(@OriginalArg(0) byte[] arg0) {
		this.anInt1501 = Static17.method288(arg0, arg0.length);
		@Pc(19) Class4_Sub13 local19 = new Class4_Sub13(Static8.method121(arg0));
		@Pc(23) int local23 = local19.method1223();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 >= 6) {
			this.anInt1505 = local19.method1215();
		} else {
			this.anInt1505 = 0;
		}
		@Pc(61) int local61 = local19.method1223();
		this.anInt1513 = local19.method1244();
		@Pc(68) int local68 = 0;
		this.anIntArray163 = new int[this.anInt1513];
		@Pc(75) int local75 = -1;
		for (@Pc(77) int local77 = 0; local77 < this.anInt1513; local77++) {
			this.anIntArray163[local77] = local68 += local19.method1244();
			if (this.anIntArray163[local77] > local75) {
				local75 = this.anIntArray163[local77];
			}
		}
		this.anIntArrayArray12 = new int[local75 + 1][];
		this.anIntArray165 = new int[local75 + 1];
		this.anObjectArrayArray2 = new Object[local75 + 1][];
		this.anObjectArray2 = new Object[local75 + 1];
		this.anIntArray160 = new int[local75 + 1];
		this.anIntArray162 = new int[local75 + 1];
		@Pc(160) int local160;
		if (local61 != 0) {
			this.anIntArray161 = new int[local75 + 1];
			for (local160 = 0; local160 < this.anInt1513; local160++) {
				this.anIntArray161[this.anIntArray163[local160]] = local19.method1215();
			}
			this.aClass67_2 = new Class67(this.anIntArray161);
		}
		for (local160 = 0; local160 < this.anInt1513; local160++) {
			this.anIntArray162[this.anIntArray163[local160]] = local19.method1215();
		}
		for (@Pc(209) int local209 = 0; local209 < this.anInt1513; local209++) {
			this.anIntArray160[this.anIntArray163[local209]] = local19.method1215();
		}
		for (@Pc(240) int local240 = 0; local240 < this.anInt1513; local240++) {
			this.anIntArray165[this.anIntArray163[local240]] = local19.method1244();
		}
		@Pc(268) int local268;
		@Pc(275) int local275;
		@Pc(270) int local270;
		@Pc(283) int local283;
		for (@Pc(259) int local259 = 0; local259 < this.anInt1513; local259++) {
			local68 = 0;
			local268 = this.anIntArray163[local259];
			local270 = -1;
			local275 = this.anIntArray165[local268];
			this.anIntArrayArray12[local268] = new int[local275];
			for (local283 = 0; local283 < local275; local283++) {
				@Pc(300) int local300 = this.anIntArrayArray12[local268][local283] = local68 += local19.method1244();
				if (local300 > local270) {
					local270 = local300;
				}
			}
			this.anObjectArrayArray2[local268] = new Object[local270 + 1];
		}
		if (local61 == 0) {
			return;
		}
		this.anIntArrayArray14 = new int[local75 + 1][];
		this.aClass67Array2 = new Class67[local75 + 1];
		for (local268 = 0; local268 < this.anInt1513; local268++) {
			local275 = this.anIntArray163[local268];
			local270 = this.anIntArray165[local275];
			this.anIntArrayArray14[local275] = new int[this.anObjectArrayArray2[local275].length];
			for (local283 = 0; local283 < local270; local283++) {
				this.anIntArrayArray14[local275][this.anIntArrayArray12[local275][local283]] = local19.method1215();
			}
			this.aClass67Array2[local275] = new Class67(this.anIntArrayArray14[local275]);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Z")
	public final boolean method1098() {
		@Pc(7) boolean local7 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray163.length; local14++) {
			@Pc(21) int local21 = this.anIntArray163[local14];
			if (this.anObjectArray2[local21] == null) {
				this.method1104(local21);
				if (this.anObjectArray2[local21] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[I")
	public final int[] method1099(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray12[arg0];
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILclient!qc;)I")
	public final int method1100(@OriginalArg(0) int arg0, @OriginalArg(2) Class60 arg1) {
		@Pc(8) Class60 local8 = arg1.method1645();
		return this.aClass67Array2[arg0].method1895(local8.method1640());
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)I")
	public final int method1101() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([III)Z")
	private boolean method1102(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.anObjectArray2[arg1] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray165[arg1];
		@Pc(28) Object[] local28 = this.anObjectArrayArray2[arg1];
		@Pc(33) int[] local33 = this.anIntArrayArray12[arg1];
		@Pc(35) boolean local35 = true;
		for (@Pc(37) int local37 = 0; local37 < local17; local37++) {
			if (local28[local33[local37]] == null) {
				local35 = false;
				break;
			}
		}
		if (local35) {
			return true;
		}
		@Pc(96) byte[] local96;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local96 = Static5.method33(false, this.anObjectArray2[arg1]);
		} else {
			local96 = Static5.method33(true, this.anObjectArray2[arg1]);
			@Pc(113) Class4_Sub13 local113 = new Class4_Sub13(local96);
			local113.method1214(arg0, local113.aByteArray68.length);
		}
		@Pc(127) byte[] local127;
		try {
			local127 = Static8.method121(local96);
		} catch (@Pc(129) RuntimeException local129) {
			throw Static28.method561(local129, "T3 - " + (arg0 != null) + "," + arg1 + "," + local96.length + "," + Static17.method288(local96, local96.length) + "," + Static17.method288(local96, local96.length - 2) + "," + this.anIntArray162[arg1] + "," + this.anInt1501);
		}
		if (this.aBoolean55) {
			this.anObjectArray2[arg1] = null;
		}
		if (local17 > 1) {
			@Pc(218) int local218 = local127.length;
			@Pc(220) int local220 = local218 - 1;
			@Pc(225) int local225 = local127[local220] & 0xFF;
			@Pc(230) Class4_Sub13 local230 = new Class4_Sub13(local127);
			@Pc(238) int local238 = local220 - local17 * 4 * local225;
			@Pc(241) int[] local241 = new int[local17];
			local230.anInt1643 = local238;
			@Pc(252) int local252;
			for (@Pc(246) int local246 = 0; local246 < local225; local246++) {
				@Pc(250) int local250 = 0;
				for (local252 = 0; local252 < local17; local252++) {
					local250 += local230.method1215();
					local241[local252] += local250;
				}
			}
			@Pc(278) byte[][] local278 = new byte[local17][];
			for (local252 = 0; local252 < local17; local252++) {
				local278[local252] = new byte[local241[local252]];
				local241[local252] = 0;
			}
			local230.anInt1643 = local238;
			@Pc(306) int local306 = 0;
			@Pc(312) int local312;
			for (@Pc(308) int local308 = 0; local308 < local225; local308++) {
				local312 = 0;
				for (@Pc(314) int local314 = 0; local314 < local17; local314++) {
					local312 += local230.method1215();
					Static135.method1053(local127, local306, local278[local314], local241[local314], local312);
					local306 += local312;
					local241[local314] += local312;
				}
			}
			for (local312 = 0; local312 < local17; local312++) {
				if (this.aBoolean56) {
					local28[local33[local312]] = local278[local312];
				} else {
					local28[local33[local312]] = Static14.method2129(local278[local312]);
				}
			}
		} else if (this.aBoolean56) {
			local28[local33[0]] = local127;
		} else {
			local28[local33[0]] = Static14.method2129(local127);
		}
		return true;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)[B")
	public final byte[] method1103(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1110(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1110(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(IB)V")
	protected void method1104(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!qc;)I")
	public final int method1107(@OriginalArg(1) Class60 arg0) {
		@Pc(3) Class60 local3 = arg0.method1645();
		return this.aClass67_2.method1895(local3.method1640());
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(ILclient!qc;)V")
	public final void method1108(@OriginalArg(1) Class60 arg0) {
		@Pc(12) Class60 local12 = arg0.method1645();
		@Pc(24) int local24 = this.aClass67_2.method1895(local12.method1640());
		if (local24 >= 0) {
			this.method1117(local24);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public final void method1109() {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2.length; local3++) {
			if (this.anObjectArrayArray2[local3] != null) {
				for (@Pc(12) int local12 = 0; local12 < this.anObjectArrayArray2[local3].length; local12++) {
					this.anObjectArrayArray2[local3][local12] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)[B")
	public final byte[] method1110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method1115(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIB)[B")
	public final byte[] method1111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || this.anObjectArrayArray2[arg0].length <= arg1) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(54) boolean local54 = this.method1102(null, arg0);
			if (!local54) {
				this.method1104(arg0);
				local54 = this.method1102(null, arg0);
				if (!local54) {
					return null;
				}
			}
		}
		return Static5.method33(false, this.anObjectArrayArray2[arg0][arg1]);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!qc;Lclient!qc;I)[B")
	public final byte[] method1112(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1) {
		@Pc(7) Class60 local7 = arg0.method1645();
		@Pc(16) Class60 local16 = arg1.method1645();
		@Pc(24) int local24 = this.aClass67_2.method1895(local7.method1640());
		@Pc(34) int local34 = this.aClass67Array2[local24].method1895(local16.method1640());
		return this.method1110(local34, local24);
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)V")
	public final void method1113(@OriginalArg(1) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray2[arg0].length; local7++) {
			this.anObjectArrayArray2[arg0][local7] = null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(II)I")
	public final int method1114(@OriginalArg(1) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II[II)[B")
	public final byte[] method1115(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg2 < 0 || arg2 >= this.anObjectArrayArray2[arg0].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg2] == null) {
			@Pc(47) boolean local47 = this.method1102(arg1, arg0);
			if (!local47) {
				this.method1104(arg0);
				local47 = this.method1102(arg1, arg0);
				if (!local47) {
					return null;
				}
			}
		}
		@Pc(75) byte[] local75 = Static5.method33(false, this.anObjectArrayArray2[arg0][arg2]);
		if (this.aBoolean56) {
			this.anObjectArrayArray2[arg0][arg2] = null;
		}
		return local75;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)[B")
	public final byte[] method1116(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1111(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1111(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(II)V")
	protected void method1117(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!qc;Lclient!qc;)Z")
	public final boolean method1118(@OriginalArg(1) Class60 arg0, @OriginalArg(2) Class60 arg1) {
		@Pc(7) Class60 local7 = arg1.method1645();
		@Pc(15) Class60 local15 = arg0.method1645();
		@Pc(23) int local23 = this.aClass67_2.method1895(local7.method1640());
		@Pc(33) int local33 = this.aClass67Array2[local23].method1895(local15.method1640());
		return this.method1120(local23, local33);
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(IB)Z")
	public final boolean method1119(@OriginalArg(0) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method1104(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)Z")
	public final boolean method1120(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method1104(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}
}
