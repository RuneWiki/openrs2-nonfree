import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public abstract class Class24 {

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "[I")
	private int[] anIntArray304;

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "[I")
	protected int[] anIntArray305;

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "Lclient!rd;")
	private Class64 aClass64_2;

	@OriginalMember(owner = "client!fd", name = "C", descriptor = "[I")
	private int[] anIntArray306;

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
	public int anInt2675;

	@OriginalMember(owner = "client!fd", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!fd", name = "L", descriptor = "[I")
	protected int[] anIntArray307;

	@OriginalMember(owner = "client!fd", name = "T", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray28;

	@OriginalMember(owner = "client!fd", name = "U", descriptor = "[I")
	protected int[] anIntArray308;

	@OriginalMember(owner = "client!fd", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!fd", name = "W", descriptor = "[Lclient!rd;")
	private Class64[] aClass64Array2;

	@OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
	private int anInt2685;

	@OriginalMember(owner = "client!fd", name = "H", descriptor = "Z")
	private final boolean aBoolean221;

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "Z")
	private final boolean aBoolean220;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(ZZ)V")
	protected Class24(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean221 = arg1;
		this.aBoolean220 = arg0;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[III)[B")
	public final byte[] method1909(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg2 < 0 || this.anObjectArrayArray2[arg0].length <= arg2) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg2] == null) {
			@Pc(44) boolean local44 = this.method1926(arg0, arg1);
			if (!local44) {
				this.method1919(arg0);
				local44 = this.method1926(arg0, arg1);
				if (!local44) {
					return null;
				}
			}
		}
		@Pc(70) byte[] local70 = Static66.method1147(this.anObjectArrayArray2[arg0][arg2], false);
		if (this.aBoolean221) {
			this.anObjectArrayArray2[arg0][arg2] = null;
		}
		return local70;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public final void method1911() {
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray2.length; local7++) {
			if (this.anObjectArrayArray2[local7] != null) {
				for (@Pc(16) int local16 = 0; local16 < this.anObjectArrayArray2[local7].length; local16++) {
					this.anObjectArrayArray2[local7][local16] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([BI)V")
	protected final void method1912(@OriginalArg(0) byte[] arg0) {
		this.anInt2675 = Static94.method1737(arg0.length, arg0);
		@Pc(15) Class2_Sub9 local15 = new Class2_Sub9(Static103.method1818(arg0));
		@Pc(19) int local19 = local15.method640();
		if (local19 != 5 && local19 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local19);
		}
		if (local19 >= 6) {
			local15.method622();
		}
		@Pc(51) int local51 = local15.method640();
		@Pc(53) int local53 = 0;
		this.anInt2685 = local15.method632();
		this.anIntArray306 = new int[this.anInt2685];
		@Pc(65) int local65 = -1;
		for (@Pc(67) int local67 = 0; local67 < this.anInt2685; local67++) {
			this.anIntArray306[local67] = local53 += local15.method632();
			if (local65 < this.anIntArray306[local67]) {
				local65 = this.anIntArray306[local67];
			}
		}
		this.anObjectArray28 = new Object[local65 + 1];
		this.anIntArray305 = new int[local65 + 1];
		this.anObjectArrayArray2 = new Object[local65 + 1][];
		this.anIntArrayArray25 = new int[local65 + 1][];
		this.anIntArray307 = new int[local65 + 1];
		this.anIntArray308 = new int[local65 + 1];
		@Pc(146) int local146;
		if (local51 != 0) {
			this.anIntArray304 = new int[local65 + 1];
			for (local146 = 0; local146 < this.anInt2685; local146++) {
				this.anIntArray304[this.anIntArray306[local146]] = local15.method622();
			}
			this.aClass64_2 = new Class64(this.anIntArray304);
		}
		for (local146 = 0; local146 < this.anInt2685; local146++) {
			this.anIntArray305[this.anIntArray306[local146]] = local15.method622();
		}
		for (@Pc(195) int local195 = 0; local195 < this.anInt2685; local195++) {
			this.anIntArray308[this.anIntArray306[local195]] = local15.method622();
		}
		for (@Pc(216) int local216 = 0; local216 < this.anInt2685; local216++) {
			this.anIntArray307[this.anIntArray306[local216]] = local15.method632();
		}
		@Pc(244) int local244;
		@Pc(251) int local251;
		@Pc(246) int local246;
		@Pc(259) int local259;
		for (@Pc(235) int local235 = 0; local235 < this.anInt2685; local235++) {
			local53 = 0;
			local244 = this.anIntArray306[local235];
			local246 = -1;
			local251 = this.anIntArray307[local244];
			this.anIntArrayArray25[local244] = new int[local251];
			for (local259 = 0; local259 < local251; local259++) {
				@Pc(276) int local276 = this.anIntArrayArray25[local244][local259] = local53 += local15.method632();
				if (local276 > local246) {
					local246 = local276;
				}
			}
			this.anObjectArrayArray2[local244] = new Object[local246 + 1];
		}
		if (local51 == 0) {
			return;
		}
		this.aClass64Array2 = new Class64[local65 + 1];
		this.anIntArrayArray26 = new int[local65 + 1][];
		for (local244 = 0; local244 < this.anInt2685; local244++) {
			local251 = this.anIntArray306[local244];
			local246 = this.anIntArray307[local251];
			this.anIntArrayArray26[local251] = new int[this.anObjectArrayArray2[local251].length];
			for (local259 = 0; local259 < local246; local259++) {
				this.anIntArrayArray26[local251][this.anIntArrayArray25[local251][local259]] = local15.method622();
			}
			this.aClass64Array2[local251] = new Class64(this.anIntArrayArray26[local251]);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)Z")
	public final boolean method1913(@OriginalArg(0) int arg0) {
		if (this.anObjectArray28[arg0] == null) {
			this.method1919(arg0);
			return this.anObjectArray28[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)I")
	public final int method1914() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!je;)I")
	public final int method1915(@OriginalArg(1) Class40 arg0) {
		@Pc(3) Class40 local3 = arg0.method985();
		return this.aClass64_2.method1795(local3.method956());
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)V")
	public final void method1916(@OriginalArg(1) int arg0) {
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArrayArray2[arg0].length; local11++) {
			this.anObjectArrayArray2[arg0][local11] = null;
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(ILclient!je;)V")
	public final void method1917(@OriginalArg(1) Class40 arg0) {
		@Pc(7) Class40 local7 = arg0.method985();
		@Pc(15) int local15 = this.aClass64_2.method1795(local7.method956());
		if (local15 >= 0) {
			this.method1921(local15);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!je;II)I")
	public final int method1918(@OriginalArg(0) Class40 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class40 local11 = arg0.method985();
		return this.aClass64Array2[arg1].method1795(local11.method956());
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZ)V")
	protected void method1919(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!je;ZLclient!je;)Z")
	public final boolean method1920(@OriginalArg(0) Class40 arg0, @OriginalArg(2) Class40 arg1) {
		@Pc(3) Class40 local3 = arg1.method985();
		@Pc(13) Class40 local13 = arg0.method985();
		@Pc(25) int local25 = this.aClass64_2.method1795(local3.method956());
		@Pc(35) int local35 = this.aClass64Array2[local25].method1795(local13.method956());
		return this.method1924(local25, local35);
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)V")
	protected void method1921(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIB)[B")
	public final byte[] method1922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(53) boolean local53 = this.method1926(arg0, null);
			if (!local53) {
				this.method1919(arg0);
				local53 = this.method1926(arg0, null);
				if (!local53) {
					return null;
				}
			}
		}
		return Static66.method1147(this.anObjectArrayArray2[arg0][arg1], false);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZ)Z")
	public final boolean method1924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray28[arg0] == null) {
			this.method1919(arg0);
			return this.anObjectArray28[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(II)[B")
	public final byte[] method1925(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1931(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1931(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[II)Z")
	private boolean method1926(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.anObjectArray28[arg0] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray307[arg0];
		@Pc(22) Object[] local22 = this.anObjectArrayArray2[arg0];
		@Pc(24) boolean local24 = true;
		@Pc(29) int[] local29 = this.anIntArrayArray25[arg0];
		for (@Pc(31) int local31 = 0; local31 < local17; local31++) {
			if (local22[local29[local31]] == null) {
				local24 = false;
				break;
			}
		}
		if (local24) {
			return true;
		}
		@Pc(87) byte[] local87;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local87 = Static66.method1147(this.anObjectArray28[arg0], false);
		} else {
			local87 = Static66.method1147(this.anObjectArray28[arg0], true);
			@Pc(102) Class2_Sub9 local102 = new Class2_Sub9(local87);
			local102.method656(local102.aByteArray16.length, arg1);
		}
		@Pc(114) byte[] local114;
		try {
			local114 = Static103.method1818(local87);
		} catch (@Pc(116) RuntimeException local116) {
			throw Static54.method945(local116, "T3 - " + (arg1 != null) + "," + arg0 + "," + local87.length + "," + Static94.method1737(local87.length, local87) + "," + Static94.method1737(local87.length - 2, local87) + "," + this.anIntArray305[arg0] + "," + this.anInt2675);
		}
		if (this.aBoolean220) {
			this.anObjectArray28[arg0] = null;
		}
		if (local17 > 1) {
			@Pc(183) int local183 = local114.length;
			@Pc(185) int local185 = local183 - 1;
			@Pc(190) int local190 = local114[local185] & 0xFF;
			@Pc(195) Class2_Sub9 local195 = new Class2_Sub9(local114);
			@Pc(203) int local203 = local185 - local17 * 4 * local190;
			@Pc(206) int[] local206 = new int[local17];
			local195.anInt976 = local203;
			@Pc(217) int local217;
			for (@Pc(211) int local211 = 0; local211 < local190; local211++) {
				@Pc(215) int local215 = 0;
				for (local217 = 0; local217 < local17; local217++) {
					local215 += local195.method622();
					local206[local217] += local215;
				}
			}
			@Pc(247) byte[][] local247 = new byte[local17][];
			for (local217 = 0; local217 < local17; local217++) {
				local247[local217] = new byte[local206[local217]];
				local206[local217] = 0;
			}
			local195.anInt976 = local203;
			@Pc(271) int local271 = 0;
			@Pc(277) int local277;
			for (@Pc(273) int local273 = 0; local273 < local190; local273++) {
				local277 = 0;
				for (@Pc(279) int local279 = 0; local279 < local17; local279++) {
					local277 += local195.method622();
					Static141.method1907(local114, local271, local247[local279], local206[local279], local277);
					local271 += local277;
					local206[local279] += local277;
				}
			}
			for (local277 = 0; local277 < local17; local277++) {
				if (this.aBoolean221) {
					local22[local29[local277]] = local247[local277];
				} else {
					local22[local29[local277]] = Static5.method129(local247[local277]);
				}
			}
		} else if (this.aBoolean221) {
			local22[local29[0]] = local114;
		} else {
			local22[local29[0]] = Static5.method129(local114);
		}
		return true;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IB)I")
	public final int method1927(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(II)[B")
	public final byte[] method1928(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1922(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1922(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(IB)[I")
	public final int[] method1929(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray25[arg0];
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BII)[B")
	public final byte[] method1931(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method1909(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILclient!je;Lclient!je;)[B")
	public final byte[] method1933(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Class40 arg1) {
		@Pc(3) Class40 local3 = arg1.method985();
		@Pc(13) Class40 local13 = arg0.method985();
		@Pc(29) int local29 = this.aClass64_2.method1795(local3.method956());
		@Pc(39) int local39 = this.aClass64Array2[local29].method1795(local13.method956());
		return this.method1931(local39, local29);
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)Z")
	public final boolean method1934() {
		@Pc(3) boolean local3 = true;
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray306.length; local10++) {
			@Pc(17) int local17 = this.anIntArray306[local10];
			if (this.anObjectArray28[local17] == null) {
				this.method1919(local17);
				if (this.anObjectArray28[local17] == null) {
					local3 = false;
				}
			}
		}
		return local3;
	}
}
