import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public abstract class Class5 {

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
	private int anInt153;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "[I")
	protected int[] anIntArray26;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "[I")
	protected int[] anIntArray27;

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!sf", name = "x", descriptor = "[I")
	protected int[] anIntArray29;

	@OriginalMember(owner = "client!sf", name = "y", descriptor = "[Lclient!kd;")
	private Class39[] aClass39Array2;

	@OriginalMember(owner = "client!sf", name = "E", descriptor = "I")
	public int anInt170;

	@OriginalMember(owner = "client!sf", name = "H", descriptor = "[I")
	private int[] anIntArray30;

	@OriginalMember(owner = "client!sf", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!sf", name = "P", descriptor = "Lclient!kd;")
	private Class39 aClass39_2;

	@OriginalMember(owner = "client!sf", name = "z", descriptor = "Z")
	private final boolean aBoolean8;

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "Z")
	private final boolean aBoolean7;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(ZZ)V")
	protected Class5(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean8 = arg0;
		this.aBoolean7 = arg1;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)I")
	public final int method106(@OriginalArg(1) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)[B")
	public final byte[] method107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method128(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIZ)[B")
	public final byte[] method108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0 || this.anObjectArrayArray2.length <= arg1 || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || this.anObjectArrayArray2[arg1].length <= arg0) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(49) boolean local49 = this.method127(null, arg1);
			if (!local49) {
				this.method121(arg1);
				local49 = this.method127(null, arg1);
				if (!local49) {
					return null;
				}
			}
		}
		return Static53.method1229(this.anObjectArrayArray2[arg1][arg0], false);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)[B")
	public final byte[] method110(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method108(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method108(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Z")
	public final boolean method112() {
		@Pc(3) boolean local3 = true;
		for (@Pc(5) int local5 = 0; local5 < this.anIntArray30.length; local5++) {
			@Pc(12) int local12 = this.anIntArray30[local5];
			if (this.anObjectArray2[local12] == null) {
				this.method121(local12);
				if (this.anObjectArray2[local12] == null) {
					local3 = false;
				}
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!sc;ILclient!sc;)[B")
	public final byte[] method113(@OriginalArg(0) Class66 arg0, @OriginalArg(2) Class66 arg1) {
		@Pc(3) Class66 local3 = arg1.method1823();
		@Pc(18) Class66 local18 = arg0.method1823();
		@Pc(26) int local26 = this.aClass39_2.method1282(local3.method1821());
		@Pc(40) int local40 = this.aClass39Array2[local26].method1282(local18.method1821());
		return this.method107(local40, local26);
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)V")
	protected void method115(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!sc;B)I")
	public final int method116(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1) {
		@Pc(7) Class66 local7 = arg1.method1823();
		return this.aClass39Array2[arg0].method1282(local7.method1821());
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
	public final void method118() {
		for (@Pc(14) int local14 = 0; local14 < this.anObjectArrayArray2.length; local14++) {
			if (this.anObjectArrayArray2[local14] != null) {
				for (@Pc(23) int local23 = 0; local23 < this.anObjectArrayArray2[local14].length; local23++) {
					this.anObjectArrayArray2[local14][local23] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(III)Z")
	public final boolean method119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method121(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)Z")
	public final boolean method120(@OriginalArg(1) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method121(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(II)V")
	protected void method121(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!sc;B)I")
	public final int method122(@OriginalArg(0) Class66 arg0) {
		@Pc(5) Class66 local5 = arg0.method1823();
		return this.aClass39_2.method1282(local5.method1821());
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!sc;Lclient!sc;)Z")
	public final boolean method123(@OriginalArg(1) Class66 arg0, @OriginalArg(2) Class66 arg1) {
		@Pc(3) Class66 local3 = arg0.method1823();
		@Pc(11) Class66 local11 = arg1.method1823();
		@Pc(24) int local24 = this.aClass39_2.method1282(local3.method1821());
		@Pc(34) int local34 = this.aClass39Array2[local24].method1282(local11.method1821());
		return this.method119(local24, local34);
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(II)[B")
	public final byte[] method124(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method107(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method107(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[B)V")
	protected final void method126(@OriginalArg(1) byte[] arg0) {
		this.anInt170 = Static134.method2054(arg0, arg0.length);
		@Pc(19) Class1_Sub12 local19 = new Class1_Sub12(Static79.method1480(arg0));
		@Pc(25) int local25 = local19.method1190();
		if (local25 != 5 && local25 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local25);
		}
		if (local25 >= 6) {
			local19.method1210();
		}
		@Pc(55) int local55 = 0;
		@Pc(61) int local61 = local19.method1190();
		this.anInt153 = local19.method1176();
		this.anIntArray30 = new int[this.anInt153];
		@Pc(73) int local73 = -1;
		for (@Pc(75) int local75 = 0; local75 < this.anInt153; local75++) {
			this.anIntArray30[local75] = local55 += local19.method1176();
			if (local73 < this.anIntArray30[local75]) {
				local73 = this.anIntArray30[local75];
			}
		}
		this.anIntArrayArray5 = new int[local73 + 1][];
		this.anIntArray27 = new int[local73 + 1];
		this.anObjectArray2 = new Object[local73 + 1];
		this.anIntArray26 = new int[local73 + 1];
		this.anIntArray29 = new int[local73 + 1];
		this.anObjectArrayArray2 = new Object[local73 + 1][];
		@Pc(157) int local157;
		@Pc(176) int local176;
		if (local61 != 0) {
			this.anIntArray28 = new int[local73 + 1];
			for (local157 = 0; local157 < local73 + 1; local157++) {
				this.anIntArray28[local157] = -1;
			}
			for (local176 = 0; local176 < this.anInt153; local176++) {
				this.anIntArray28[this.anIntArray30[local176]] = local19.method1210();
			}
			this.aClass39_2 = new Class39(this.anIntArray28);
		}
		for (local157 = 0; local157 < this.anInt153; local157++) {
			this.anIntArray26[this.anIntArray30[local157]] = local19.method1210();
		}
		for (local176 = 0; local176 < this.anInt153; local176++) {
			this.anIntArray27[this.anIntArray30[local176]] = local19.method1210();
		}
		for (@Pc(252) int local252 = 0; local252 < this.anInt153; local252++) {
			this.anIntArray29[this.anIntArray30[local252]] = local19.method1176();
		}
		@Pc(280) int local280;
		@Pc(285) int local285;
		@Pc(287) int local287;
		@Pc(295) int local295;
		@Pc(312) int local312;
		for (@Pc(271) int local271 = 0; local271 < this.anInt153; local271++) {
			local55 = 0;
			local280 = this.anIntArray30[local271];
			local285 = this.anIntArray29[local280];
			local287 = -1;
			this.anIntArrayArray5[local280] = new int[local285];
			for (local295 = 0; local295 < local285; local295++) {
				local312 = this.anIntArrayArray5[local280][local295] = local55 += local19.method1176();
				if (local287 < local312) {
					local287 = local312;
				}
			}
			this.anObjectArrayArray2[local280] = new Object[local287 + 1];
		}
		if (local61 == 0) {
			return;
		}
		this.aClass39Array2 = new Class39[local73 + 1];
		this.anIntArrayArray6 = new int[local73 + 1][];
		for (local280 = 0; local280 < this.anInt153; local280++) {
			local285 = this.anIntArray30[local280];
			local287 = this.anIntArray29[local285];
			this.anIntArrayArray6[local285] = new int[this.anObjectArrayArray2[local285].length];
			for (local295 = 0; local295 < this.anObjectArrayArray2[local285].length; local295++) {
				this.anIntArrayArray6[local285][local295] = -1;
			}
			for (local312 = 0; local312 < local287; local312++) {
				this.anIntArrayArray6[local285][this.anIntArrayArray5[local285][local312]] = local19.method1210();
			}
			this.aClass39Array2[local285] = new Class39(this.anIntArrayArray6[local285]);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([III)Z")
	private boolean method127(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.anObjectArray2[arg1] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray29[arg1];
		@Pc(22) Object[] local22 = this.anObjectArrayArray2[arg1];
		@Pc(27) int[] local27 = this.anIntArrayArray5[arg1];
		@Pc(29) boolean local29 = true;
		for (@Pc(31) int local31 = 0; local31 < local17; local31++) {
			if (local22[local27[local31]] == null) {
				local29 = false;
				break;
			}
		}
		if (local29) {
			return true;
		}
		@Pc(87) byte[] local87;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local87 = Static53.method1229(this.anObjectArray2[arg1], false);
		} else {
			local87 = Static53.method1229(this.anObjectArray2[arg1], true);
			@Pc(92) Class1_Sub12 local92 = new Class1_Sub12(local87);
			local92.method1187(local92.aByteArray12.length, arg0);
		}
		@Pc(114) byte[] local114;
		try {
			local114 = Static79.method1480(local87);
		} catch (@Pc(116) RuntimeException local116) {
			throw Static97.method1746(local116, "T3 - " + (arg0 != null) + "," + arg1 + "," + local87.length + "," + Static134.method2054(local87, local87.length) + "," + Static134.method2054(local87, local87.length - 2) + "," + this.anIntArray26[arg1] + "," + this.anInt170);
		}
		if (this.aBoolean8) {
			this.anObjectArray2[arg1] = null;
		}
		if (local17 > 1) {
			@Pc(207) int local207 = local114.length;
			@Pc(210) int[] local210 = new int[local17];
			@Pc(212) int local212 = local207 - 1;
			@Pc(217) int local217 = local114[local212] & 0xFF;
			@Pc(225) int local225 = local212 - local217 * local17 * 4;
			@Pc(230) Class1_Sub12 local230 = new Class1_Sub12(local114);
			local230.anInt1694 = local225;
			@Pc(241) int local241;
			for (@Pc(235) int local235 = 0; local235 < local217; local235++) {
				@Pc(239) int local239 = 0;
				for (local241 = 0; local241 < local17; local241++) {
					local239 += local230.method1210();
					local210[local241] += local239;
				}
			}
			@Pc(271) byte[][] local271 = new byte[local17][];
			for (local241 = 0; local241 < local17; local241++) {
				local271[local241] = new byte[local210[local241]];
				local210[local241] = 0;
			}
			local230.anInt1694 = local225;
			@Pc(295) int local295 = 0;
			@Pc(301) int local301;
			for (@Pc(297) int local297 = 0; local297 < local217; local297++) {
				local301 = 0;
				for (@Pc(303) int local303 = 0; local303 < local17; local303++) {
					local301 += local230.method1210();
					Static139.method1493(local114, local295, local271[local303], local210[local303], local301);
					local210[local303] += local301;
					local295 += local301;
				}
			}
			for (local301 = 0; local301 < local17; local301++) {
				if (this.aBoolean7) {
					local22[local27[local301]] = local271[local301];
				} else {
					local22[local27[local301]] = Static55.method1240(local271[local301]);
				}
			}
		} else if (this.aBoolean7) {
			local22[local27[0]] = local114;
		} else {
			local22[local27[0]] = Static55.method1240(local114);
		}
		return true;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[III)[B")
	public final byte[] method128(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || this.anObjectArrayArray2.length <= arg1 || this.anObjectArrayArray2[arg1] == null || arg2 < 0 || this.anObjectArrayArray2[arg1].length <= arg2) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg2] == null) {
			@Pc(56) boolean local56 = this.method127(arg0, arg1);
			if (!local56) {
				this.method121(arg1);
				local56 = this.method127(arg0, arg1);
				if (!local56) {
					return null;
				}
			}
		}
		@Pc(86) byte[] local86 = Static53.method1229(this.anObjectArrayArray2[arg1][arg2], false);
		if (this.aBoolean7) {
			this.anObjectArrayArray2[arg1][arg2] = null;
		}
		return local86;
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(II)[I")
	public final int[] method129(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray5[arg0];
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)I")
	public final int method130() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(II)V")
	public final void method131(@OriginalArg(1) int arg0) {
		for (@Pc(15) int local15 = 0; local15 < this.anObjectArrayArray2[arg0].length; local15++) {
			this.anObjectArrayArray2[arg0][local15] = null;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!sc;I)V")
	public final void method132(@OriginalArg(0) Class66 arg0) {
		@Pc(3) Class66 local3 = arg0.method1823();
		@Pc(17) int local17 = this.aClass39_2.method1282(local3.method1821());
		if (local17 >= 0) {
			this.method115(local17);
		}
	}
}
