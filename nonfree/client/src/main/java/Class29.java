import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public abstract class Class29 {

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "[Lclient!od;")
	private Class54[] aClass54Array2;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "[I")
	protected int[] anIntArray169;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "[I")
	protected int[] anIntArray170;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!sd", name = "F", descriptor = "Lclient!od;")
	private Class54 aClass54_2;

	@OriginalMember(owner = "client!sd", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!sd", name = "M", descriptor = "[I")
	private int[] anIntArray171;

	@OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
	public int anInt1042;

	@OriginalMember(owner = "client!sd", name = "bb", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!sd", name = "cb", descriptor = "[I")
	protected int[] anIntArray173;

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "Z")
	private final boolean aBoolean51;

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "Z")
	private final boolean aBoolean52;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(ZZ)V")
	protected Class29(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean51 = arg0;
		this.aBoolean52 = arg1;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIB)[B")
	public final byte[] method733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method758(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)V")
	protected void method734(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!mb;BLclient!mb;)[B")
	public final byte[] method735(@OriginalArg(0) Class45 arg0, @OriginalArg(2) Class45 arg1) {
		@Pc(11) Class45 local11 = arg1.method1327();
		@Pc(15) Class45 local15 = arg0.method1327();
		@Pc(23) int local23 = this.aClass54_2.method1514(local11.method1307());
		@Pc(33) int local33 = this.aClass54Array2[local23].method1514(local15.method1307());
		return this.method733(local33, local23);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLclient!mb;Lclient!mb;)Z")
	public final boolean method736(@OriginalArg(1) Class45 arg0, @OriginalArg(2) Class45 arg1) {
		@Pc(13) Class45 local13 = arg1.method1327();
		@Pc(17) Class45 local17 = arg0.method1327();
		@Pc(25) int local25 = this.aClass54_2.method1514(local13.method1307());
		@Pc(35) int local35 = this.aClass54Array2[local25].method1514(local17.method1307());
		return this.method739(local25, local35);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I")
	public final int method737(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)I")
	public final int method738() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIB)Z")
	public final boolean method739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || this.anObjectArrayArray2[arg0].length <= arg1) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method743(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)V")
	public final void method741(@OriginalArg(0) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2[arg0].length; local3++) {
			this.anObjectArrayArray2[arg0][local3] = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI[I)Z")
	private boolean method742(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.anObjectArray2[arg0] == null) {
			return false;
		}
		@Pc(15) int local15 = this.anIntArray173[arg0];
		@Pc(20) int[] local20 = this.anIntArrayArray12[arg0];
		@Pc(25) Object[] local25 = this.anObjectArrayArray2[arg0];
		@Pc(27) boolean local27 = true;
		for (@Pc(35) int local35 = 0; local35 < local15; local35++) {
			if (local25[local20[local35]] == null) {
				local27 = false;
				break;
			}
		}
		if (local27) {
			return true;
		}
		@Pc(88) byte[] local88;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local88 = Static29.method628(false, this.anObjectArray2[arg0]);
		} else {
			local88 = Static29.method628(true, this.anObjectArray2[arg0]);
			@Pc(102) Class5_Sub9 local102 = new Class5_Sub9(local88);
			local102.method1411(arg1, local102.aByteArray28.length);
		}
		@Pc(114) byte[] local114;
		try {
			local114 = Static63.method1257(local88);
		} catch (@Pc(116) RuntimeException local116) {
			throw Static117.method2124(local116, "T3 - " + (arg1 != null) + "," + arg0 + "," + local88.length + "," + Static84.method1591(local88.length, local88) + "," + Static84.method1591(local88.length - 2, local88) + "," + this.anIntArray170[arg0] + "," + this.anInt1042);
		}
		if (this.aBoolean51) {
			this.anObjectArray2[arg0] = null;
		}
		if (local15 <= 1) {
			local25[local20[0]] = Static46.method976(local114);
		} else {
			@Pc(195) int local195 = local114.length;
			@Pc(198) int local198 = local195 - 1;
			@Pc(202) int local202 = local114[local198] & 0xFF;
			@Pc(207) Class5_Sub9 local207 = new Class5_Sub9(local114);
			@Pc(215) int local215 = local198 - local15 * local202 * 4;
			@Pc(218) int[] local218 = new int[local15];
			local207.anInt2140 = local215;
			@Pc(228) int local228;
			for (@Pc(223) int local223 = 0; local223 < local202; local223++) {
				@Pc(226) int local226 = 0;
				for (local228 = 0; local228 < local15; local228++) {
					local226 += local207.method1434();
					local218[local228] += local226;
				}
			}
			@Pc(261) byte[][] local261 = new byte[local15][];
			for (local228 = 0; local228 < local15; local228++) {
				local261[local228] = new byte[local218[local228]];
				local218[local228] = 0;
			}
			local207.anInt2140 = local215;
			@Pc(284) int local284 = 0;
			@Pc(289) int local289;
			for (@Pc(286) int local286 = 0; local286 < local202; local286++) {
				local289 = 0;
				for (@Pc(291) int local291 = 0; local291 < local15; local291++) {
					local289 += local207.method1434();
					Static127.method878(local114, local284, local261[local291], local218[local291], local289);
					local218[local291] += local289;
					local284 += local289;
				}
			}
			for (local289 = 0; local289 < local15; local289++) {
				local25[local20[local289]] = Static46.method976(local261[local289]);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IB)V")
	protected void method743(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public final void method744() {
		for (@Pc(5) int local5 = 0; local5 < this.anObjectArrayArray2.length; local5++) {
			if (this.anObjectArrayArray2[local5] != null) {
				for (@Pc(13) int local13 = 0; local13 < this.anObjectArrayArray2[local5].length; local13++) {
					this.anObjectArrayArray2[local5][local13] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(IB)[B")
	public final byte[] method745(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method733(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method733(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!mb;)I")
	public final int method746(@OriginalArg(1) Class45 arg0) {
		@Pc(3) Class45 local3 = arg0.method1327();
		return this.aClass54_2.method1514(local3.method1307());
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(ILclient!mb;)V")
	public final void method748(@OriginalArg(1) Class45 arg0) {
		@Pc(7) Class45 local7 = arg0.method1327();
		@Pc(15) int local15 = this.aClass54_2.method1514(local7.method1307());
		if (local15 >= 0) {
			this.method734(local15);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BII)[B")
	public final byte[] method749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || this.anObjectArrayArray2.length <= arg1 || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || this.anObjectArrayArray2[arg1].length <= arg0) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(49) boolean local49 = this.method742(arg1, null);
			if (!local49) {
				this.method743(arg1);
				local49 = this.method742(arg1, null);
				if (!local49) {
					return null;
				}
			}
		}
		return Static29.method628(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([BI)V")
	protected final void method750(@OriginalArg(0) byte[] arg0) {
		this.anInt1042 = Static84.method1591(arg0.length, arg0);
		@Pc(21) Class5_Sub9 local21 = new Class5_Sub9(Static63.method1257(arg0));
		@Pc(27) int local27 = local21.method1408();
		if (local27 != 5) {
			return;
		}
		@Pc(35) int local35 = local21.method1408();
		this.anInt1026 = local21.method1418();
		@Pc(42) int local42 = -1;
		this.anIntArray172 = new int[this.anInt1026];
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < this.anInt1026; local51++) {
			this.anIntArray172[local51] = local49 += local21.method1418();
			if (this.anIntArray172[local51] > local42) {
				local42 = this.anIntArray172[local51];
			}
		}
		this.anIntArray173 = new int[local42 + 1];
		this.anIntArray169 = new int[local42 + 1];
		this.anObjectArray2 = new Object[local42 + 1];
		this.anObjectArrayArray2 = new Object[local42 + 1][];
		this.anIntArray170 = new int[local42 + 1];
		this.anIntArrayArray12 = new int[local42 + 1][];
		@Pc(135) int local135;
		if (local35 != 0) {
			this.anIntArray171 = new int[local42 + 1];
			for (local135 = 0; local135 < this.anInt1026; local135++) {
				this.anIntArray171[this.anIntArray172[local135]] = local21.method1434();
			}
			this.aClass54_2 = new Class54(this.anIntArray171);
		}
		for (local135 = 0; local135 < this.anInt1026; local135++) {
			this.anIntArray170[this.anIntArray172[local135]] = local21.method1434();
		}
		for (@Pc(188) int local188 = 0; local188 < this.anInt1026; local188++) {
			this.anIntArray169[this.anIntArray172[local188]] = local21.method1434();
		}
		for (@Pc(209) int local209 = 0; local209 < this.anInt1026; local209++) {
			this.anIntArray173[this.anIntArray172[local209]] = local21.method1418();
		}
		@Pc(239) int local239;
		@Pc(244) int local244;
		@Pc(234) int local234;
		@Pc(252) int local252;
		for (@Pc(228) int local228 = 0; local228 < this.anInt1026; local228++) {
			local49 = 0;
			local234 = -1;
			local239 = this.anIntArray172[local228];
			local244 = this.anIntArray173[local239];
			this.anIntArrayArray12[local239] = new int[local244];
			for (local252 = 0; local252 < local244; local252++) {
				@Pc(269) int local269 = this.anIntArrayArray12[local239][local252] = local49 += local21.method1418();
				if (local269 > local234) {
					local234 = local269;
				}
			}
			this.anObjectArrayArray2[local239] = new Object[local234 + 1];
		}
		if (local35 == 0) {
			return;
		}
		this.aClass54Array2 = new Class54[local42 + 1];
		this.anIntArrayArray13 = new int[local42 + 1][];
		for (local239 = 0; local239 < this.anInt1026; local239++) {
			local244 = this.anIntArray172[local239];
			local234 = this.anIntArray173[local244];
			this.anIntArrayArray13[local244] = new int[this.anObjectArrayArray2[local244].length];
			for (local252 = 0; local252 < local234; local252++) {
				this.anIntArrayArray13[local244][this.anIntArrayArray12[local244][local252]] = local21.method1434();
			}
			this.aClass54Array2[local244] = new Class54(this.anIntArrayArray13[local244]);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLclient!mb;I)I")
	public final int method753(@OriginalArg(1) Class45 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class45 local12 = arg0.method1327();
		return this.aClass54Array2[arg1].method1514(local12.method1307());
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)[I")
	public final int[] method756(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray12[arg0];
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(IB)[B")
	public final byte[] method757(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method749(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method749(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIB[I)[B")
	public final byte[] method758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 < 0 || this.anObjectArrayArray2.length <= arg1 || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || this.anObjectArrayArray2[arg1].length <= arg0) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(50) boolean local50 = this.method742(arg1, arg2);
			if (!local50) {
				this.method743(arg1);
				local50 = this.method742(arg1, arg2);
				if (!local50) {
					return null;
				}
			}
		}
		@Pc(76) byte[] local76 = Static29.method628(false, this.anObjectArrayArray2[arg1][arg0]);
		if (this.aBoolean52) {
			this.anObjectArrayArray2[arg1][arg0] = null;
		}
		return local76;
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)Z")
	public final boolean method759() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray172.length; local9++) {
			@Pc(16) int local16 = this.anIntArray172[local9];
			if (this.anObjectArray2[local16] == null) {
				this.method743(local16);
				if (this.anObjectArray2[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(BI)Z")
	public final boolean method760(@OriginalArg(1) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method743(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)Z")
	public final boolean method761(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method739(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method739(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
