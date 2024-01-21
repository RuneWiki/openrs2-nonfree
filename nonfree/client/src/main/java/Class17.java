import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public abstract class Class17 {

	@OriginalMember(owner = "client!la", name = "J", descriptor = "[I")
	public static int[] anIntArray61 = new int[99];

	@OriginalMember(owner = "client!la", name = "a", descriptor = "[I")
	protected int[] anIntArray57;

	@OriginalMember(owner = "client!la", name = "d", descriptor = "[I")
	protected int[] anIntArray58;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Lclient!te;")
	private Class71 aClass71_2;

	@OriginalMember(owner = "client!la", name = "k", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "I")
	public int anInt401;

	@OriginalMember(owner = "client!la", name = "p", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!la", name = "u", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!la", name = "v", descriptor = "[I")
	protected int[] anIntArray60;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!la", name = "y", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!la", name = "M", descriptor = "[Lclient!te;")
	private Class71[] aClass71Array2;

	@OriginalMember(owner = "client!la", name = "P", descriptor = "[I")
	private int[] anIntArray63;

	@OriginalMember(owner = "client!la", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!la", name = "L", descriptor = "Z")
	private final boolean aBoolean27;

	@OriginalMember(owner = "client!la", name = "H", descriptor = "Z")
	private final boolean aBoolean26;

	static {
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < 99; local19++) {
			@Pc(24) int local24 = local19 + 1;
			@Pc(37) int local37 = (int) (Math.pow(2.0D, (double) local24 / 7.0D) * 300.0D + (double) local24);
			local17 += local37;
			anIntArray61[local19] = local17 / 4;
		}
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(ZZ)V")
	protected Class17(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean27 = arg1;
		this.aBoolean26 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)V")
	protected void method278(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)[B")
	public final byte[] method279(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method281(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method281(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[B)V")
	protected final void method280(@OriginalArg(1) byte[] arg0) {
		this.anInt401 = Static45.method811(arg0.length, arg0);
		@Pc(19) Class4_Sub10 local19 = new Class4_Sub10(Static118.method1795(arg0));
		@Pc(23) int local23 = local19.method599();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 >= 6) {
			local19.method549();
		}
		@Pc(55) int local55 = local19.method599();
		this.anInt400 = local19.method604();
		this.anIntArray63 = new int[this.anInt400];
		@Pc(67) int local67 = 0;
		@Pc(69) int local69 = -1;
		for (@Pc(71) int local71 = 0; local71 < this.anInt400; local71++) {
			this.anIntArray63[local71] = local67 += local19.method604();
			if (this.anIntArray63[local71] > local69) {
				local69 = this.anIntArray63[local71];
			}
		}
		this.anIntArray57 = new int[local69 + 1];
		this.anObjectArrayArray2 = new Object[local69 + 1][];
		this.anObjectArray2 = new Object[local69 + 1];
		this.anIntArray58 = new int[local69 + 1];
		this.anIntArrayArray5 = new int[local69 + 1][];
		this.anIntArray60 = new int[local69 + 1];
		@Pc(153) int local153;
		if (local55 != 0) {
			this.anIntArray59 = new int[local69 + 1];
			for (local153 = 0; local153 < this.anInt400; local153++) {
				this.anIntArray59[this.anIntArray63[local153]] = local19.method549();
			}
			this.aClass71_2 = new Class71(this.anIntArray59);
		}
		for (local153 = 0; local153 < this.anInt400; local153++) {
			this.anIntArray58[this.anIntArray63[local153]] = local19.method549();
		}
		for (@Pc(206) int local206 = 0; local206 < this.anInt400; local206++) {
			this.anIntArray60[this.anIntArray63[local206]] = local19.method549();
		}
		for (@Pc(225) int local225 = 0; local225 < this.anInt400; local225++) {
			this.anIntArray57[this.anIntArray63[local225]] = local19.method604();
		}
		@Pc(253) int local253;
		@Pc(258) int local258;
		@Pc(260) int local260;
		@Pc(268) int local268;
		for (@Pc(244) int local244 = 0; local244 < this.anInt400; local244++) {
			local67 = 0;
			local253 = this.anIntArray63[local244];
			local258 = this.anIntArray57[local253];
			local260 = -1;
			this.anIntArrayArray5[local253] = new int[local258];
			for (local268 = 0; local268 < local258; local268++) {
				@Pc(285) int local285 = this.anIntArrayArray5[local253][local268] = local67 += local19.method604();
				if (local285 > local260) {
					local260 = local285;
				}
			}
			this.anObjectArrayArray2[local253] = new Object[local260 + 1];
		}
		if (local55 == 0) {
			return;
		}
		this.aClass71Array2 = new Class71[local69 + 1];
		this.anIntArrayArray4 = new int[local69 + 1][];
		for (local253 = 0; local253 < this.anInt400; local253++) {
			local258 = this.anIntArray63[local253];
			local260 = this.anIntArray57[local258];
			this.anIntArrayArray4[local258] = new int[this.anObjectArrayArray2[local258].length];
			for (local268 = 0; local268 < local260; local268++) {
				this.anIntArrayArray4[local258][this.anIntArrayArray5[local258][local268]] = local19.method549();
			}
			this.aClass71Array2[local258] = new Class71(this.anIntArrayArray4[local258]);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)[B")
	public final byte[] method281(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || this.anObjectArrayArray2[arg0].length <= arg1) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(46) boolean local46 = this.method284(null, arg0);
			if (!local46) {
				this.method278(arg0);
				local46 = this.method284(null, arg0);
				if (!local46) {
					return null;
				}
			}
		}
		return Static5.method81(this.anObjectArrayArray2[arg0][arg1], false);
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)[I")
	public final int[] method282(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray5[arg0];
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(II)I")
	public final int method283(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[II)Z")
	private boolean method284(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.anObjectArray2[arg1] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray57[arg1];
		@Pc(27) int[] local27 = this.anIntArrayArray5[arg1];
		@Pc(32) Object[] local32 = this.anObjectArrayArray2[arg1];
		@Pc(34) boolean local34 = true;
		for (@Pc(36) int local36 = 0; local36 < local17; local36++) {
			if (local32[local27[local36]] == null) {
				local34 = false;
				break;
			}
		}
		if (local34) {
			return true;
		}
		@Pc(92) byte[] local92;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local92 = Static5.method81(this.anObjectArray2[arg1], false);
		} else {
			local92 = Static5.method81(this.anObjectArray2[arg1], true);
			@Pc(97) Class4_Sub10 local97 = new Class4_Sub10(local92);
			local97.method573(local97.aByteArray17.length, arg0);
		}
		@Pc(119) byte[] local119;
		try {
			local119 = Static118.method1795(local92);
		} catch (@Pc(121) RuntimeException local121) {
			throw Static120.method1805(local121, "T3 - " + (arg0 != null) + "," + arg1 + "," + local92.length + "," + Static45.method811(local92.length, local92) + "," + Static45.method811(local92.length - 2, local92) + "," + this.anIntArray58[arg1] + "," + this.anInt401);
		}
		if (this.aBoolean26) {
			this.anObjectArray2[arg1] = null;
		}
		if (local17 > 1) {
			@Pc(188) int local188 = local119.length;
			@Pc(190) int local190 = local188 - 1;
			@Pc(195) int local195 = local119[local190] & 0xFF;
			@Pc(200) Class4_Sub10 local200 = new Class4_Sub10(local119);
			@Pc(208) int local208 = local190 - local195 * local17 * 4;
			@Pc(211) int[] local211 = new int[local17];
			local200.anInt931 = local208;
			@Pc(222) int local222;
			for (@Pc(216) int local216 = 0; local216 < local195; local216++) {
				@Pc(220) int local220 = 0;
				for (local222 = 0; local222 < local17; local222++) {
					local220 += local200.method549();
					local211[local222] += local220;
				}
			}
			@Pc(252) byte[][] local252 = new byte[local17][];
			for (local222 = 0; local222 < local17; local222++) {
				local252[local222] = new byte[local211[local222]];
				local211[local222] = 0;
			}
			local200.anInt931 = local208;
			@Pc(276) int local276 = 0;
			@Pc(282) int local282;
			for (@Pc(278) int local278 = 0; local278 < local195; local278++) {
				local282 = 0;
				for (@Pc(284) int local284 = 0; local284 < local17; local284++) {
					local282 += local200.method549();
					Static135.method111(local119, local276, local252[local284], local211[local284], local282);
					local211[local284] += local282;
					local276 += local282;
				}
			}
			for (local282 = 0; local282 < local17; local282++) {
				if (this.aBoolean27) {
					local32[local27[local282]] = local252[local282];
				} else {
					local32[local27[local282]] = Static133.method2015(local252[local282]);
				}
			}
		} else if (this.aBoolean27) {
			local32[local27[0]] = local119;
		} else {
			local32[local27[0]] = Static133.method2015(local119);
		}
		return true;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)I")
	public final int method285() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLclient!v;)V")
	public final void method286(@OriginalArg(1) Class76 arg0) {
		@Pc(7) Class76 local7 = arg0.method1854();
		@Pc(15) int local15 = this.aClass71_2.method1724(local7.method1857());
		if (local15 >= 0) {
			this.method296(local15);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)V")
	public final void method287(@OriginalArg(0) int arg0) {
		for (@Pc(9) int local9 = 0; local9 < this.anObjectArrayArray2[arg0].length; local9++) {
			this.anObjectArrayArray2[arg0][local9] = null;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!v;BLclient!v;)[B")
	public final byte[] method288(@OriginalArg(0) Class76 arg0, @OriginalArg(2) Class76 arg1) {
		@Pc(7) Class76 local7 = arg0.method1854();
		@Pc(11) Class76 local11 = arg1.method1854();
		@Pc(24) int local24 = this.aClass71_2.method1724(local7.method1857());
		@Pc(34) int local34 = this.aClass71Array2[local24].method1724(local11.method1857());
		return this.method290(local24, local34);
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(II)Z")
	public final boolean method289(@OriginalArg(0) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method278(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(III)[B")
	public final byte[] method290(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method292(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "(II)[B")
	public final byte[] method291(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method290(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method290(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIB[I)[B")
	public final byte[] method292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || this.anObjectArrayArray2[arg1].length <= arg0) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(61) boolean local61 = this.method284(arg2, arg1);
			if (!local61) {
				this.method278(arg1);
				local61 = this.method284(arg2, arg1);
				if (!local61) {
					return null;
				}
			}
		}
		@Pc(87) byte[] local87 = Static5.method81(this.anObjectArrayArray2[arg1][arg0], false);
		if (this.aBoolean27) {
			this.anObjectArrayArray2[arg1][arg0] = null;
		}
		return local87;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!v;Lclient!v;)Z")
	public final boolean method293(@OriginalArg(1) Class76 arg0, @OriginalArg(2) Class76 arg1) {
		@Pc(3) Class76 local3 = arg0.method1854();
		@Pc(16) Class76 local16 = arg1.method1854();
		@Pc(24) int local24 = this.aClass71_2.method1724(local3.method1857());
		@Pc(36) int local36 = this.aClass71Array2[local24].method1724(local16.method1857());
		return this.method300(local24, local36);
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)Z")
	public final boolean method295() {
		@Pc(11) boolean local11 = true;
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray63.length; local13++) {
			@Pc(20) int local20 = this.anIntArray63[local13];
			if (this.anObjectArray2[local20] == null) {
				this.method278(local20);
				if (this.anObjectArray2[local20] == null) {
					local11 = false;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!la", name = "f", descriptor = "(II)V")
	protected void method296(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public final void method297() {
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray2.length; local7++) {
			if (this.anObjectArrayArray2[local7] != null) {
				for (@Pc(21) int local21 = 0; local21 < this.anObjectArrayArray2[local7].length; local21++) {
					this.anObjectArrayArray2[local7][local21] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!v;II)I")
	public final int method298(@OriginalArg(0) Class76 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class76 local7 = arg0.method1854();
		return this.aClass71Array2[arg1].method1724(local7.method1857());
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!v;)I")
	public final int method299(@OriginalArg(1) Class76 arg0) {
		@Pc(3) Class76 local3 = arg0.method1854();
		return this.aClass71_2.method1724(local3.method1857());
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(III)Z")
	public final boolean method300(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method278(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}
}
