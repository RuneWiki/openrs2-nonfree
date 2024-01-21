import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public abstract class Class13 {

	@OriginalMember(owner = "client!f", name = "b", descriptor = "[I")
	protected int[] anIntArray41;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "[I")
	private int[] anIntArray42;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!f", name = "k", descriptor = "[I")
	protected int[] anIntArray43;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "I")
	public int anInt474;

	@OriginalMember(owner = "client!f", name = "o", descriptor = "[I")
	protected int[] anIntArray44;

	@OriginalMember(owner = "client!f", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "[I")
	private int[] anIntArray45;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "Lclient!e;")
	private Class22 aClass22_2;

	@OriginalMember(owner = "client!f", name = "w", descriptor = "[Lclient!e;")
	private Class22[] aClass22Array2;

	@OriginalMember(owner = "client!f", name = "z", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!f", name = "K", descriptor = "I")
	private int anInt488;

	@OriginalMember(owner = "client!f", name = "m", descriptor = "Z")
	private final boolean aBoolean33;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "Z")
	private final boolean aBoolean32;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(ZZ)V")
	protected Class13(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean33 = arg1;
		this.aBoolean32 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)[I")
	public final int[] method345(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray4[arg0];
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Z")
	public final boolean method346() {
		@Pc(3) boolean local3 = true;
		for (@Pc(5) int local5 = 0; local5 < this.anIntArray45.length; local5++) {
			@Pc(12) int local12 = this.anIntArray45[local5];
			if (this.anObjectArray2[local12] == null) {
				this.method357(local12);
				if (this.anObjectArray2[local12] == null) {
					local3 = false;
				}
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[B")
	public final byte[] method347(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method348(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method348(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)[B")
	public final byte[] method348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method350(null, arg0, arg1);
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(III)Z")
	public final boolean method349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0 || this.anObjectArrayArray2.length <= arg1 || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || this.anObjectArrayArray2[arg1].length <= arg0) {
			return false;
		} else if (this.anObjectArrayArray2[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray2[arg1] == null) {
			this.method357(arg1);
			return this.anObjectArray2[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "([IIII)[B")
	public final byte[] method350(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg2 < 0 || this.anObjectArrayArray2[arg1].length <= arg2) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg2] == null) {
			@Pc(42) boolean local42 = this.method367(arg1, arg0);
			if (!local42) {
				this.method357(arg1);
				local42 = this.method367(arg1, arg0);
				if (!local42) {
					return null;
				}
			}
		}
		@Pc(74) byte[] local74 = Static125.method2124(false, this.anObjectArrayArray2[arg1][arg2]);
		if (this.aBoolean33) {
			this.anObjectArrayArray2[arg1][arg2] = null;
		}
		return local74;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!sd;I)V")
	public final void method351(@OriginalArg(0) Class73 arg0) {
		@Pc(3) Class73 local3 = arg0.method2419();
		@Pc(17) int local17 = this.aClass22_2.method614(local3.method2411());
		if (local17 >= 0) {
			this.method362(local17);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)I")
	public final int method352() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(II)I")
	public final int method353(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!sd;ZLclient!sd;)[B")
	public final byte[] method354(@OriginalArg(0) Class73 arg0, @OriginalArg(2) Class73 arg1) {
		@Pc(8) Class73 local8 = arg0.method2419();
		@Pc(16) Class73 local16 = arg1.method2419();
		@Pc(24) int local24 = this.aClass22_2.method614(local8.method2411());
		@Pc(34) int local34 = this.aClass22Array2[local24].method614(local16.method2411());
		return this.method348(local24, local34);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z[B)V")
	protected final void method355(@OriginalArg(1) byte[] arg0) {
		this.anInt474 = Static67.method1185(arg0, arg0.length);
		@Pc(19) Class3_Sub12 local19 = new Class3_Sub12(Static26.method549(arg0));
		@Pc(23) int local23 = local19.method1354();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 >= 6) {
			local19.method1373();
		}
		@Pc(55) int local55 = local19.method1354();
		@Pc(57) int local57 = -1;
		this.anInt488 = local19.method1359();
		@Pc(64) int local64 = 0;
		this.anIntArray45 = new int[this.anInt488];
		for (@Pc(80) int local80 = 0; local80 < this.anInt488; local80++) {
			this.anIntArray45[local80] = local64 += local19.method1359();
			if (this.anIntArray45[local80] > local57) {
				local57 = this.anIntArray45[local80];
			}
		}
		this.anIntArray44 = new int[local57 + 1];
		this.anIntArray41 = new int[local57 + 1];
		this.anObjectArrayArray2 = new Object[local57 + 1][];
		this.anIntArray43 = new int[local57 + 1];
		this.anIntArrayArray4 = new int[local57 + 1][];
		this.anObjectArray2 = new Object[local57 + 1];
		@Pc(159) int local159;
		@Pc(178) int local178;
		if (local55 != 0) {
			this.anIntArray42 = new int[local57 + 1];
			for (local159 = 0; local159 < local57 + 1; local159++) {
				this.anIntArray42[local159] = -1;
			}
			for (local178 = 0; local178 < this.anInt488; local178++) {
				this.anIntArray42[this.anIntArray45[local178]] = local19.method1373();
			}
			this.aClass22_2 = new Class22(this.anIntArray42);
		}
		for (local159 = 0; local159 < this.anInt488; local159++) {
			this.anIntArray44[this.anIntArray45[local159]] = local19.method1373();
		}
		for (local178 = 0; local178 < this.anInt488; local178++) {
			this.anIntArray43[this.anIntArray45[local178]] = local19.method1373();
		}
		for (@Pc(250) int local250 = 0; local250 < this.anInt488; local250++) {
			this.anIntArray41[this.anIntArray45[local250]] = local19.method1359();
		}
		@Pc(280) int local280;
		@Pc(285) int local285;
		@Pc(295) int local295;
		@Pc(297) int local297;
		@Pc(314) int local314;
		for (@Pc(273) int local273 = 0; local273 < this.anInt488; local273++) {
			local280 = this.anIntArray45[local273];
			local285 = this.anIntArray41[local280];
			local64 = 0;
			this.anIntArrayArray4[local280] = new int[local285];
			local295 = -1;
			for (local297 = 0; local297 < local285; local297++) {
				local314 = this.anIntArrayArray4[local280][local297] = local64 += local19.method1359();
				if (local295 < local314) {
					local295 = local314;
				}
			}
			this.anObjectArrayArray2[local280] = new Object[local295 + 1];
		}
		if (local55 == 0) {
			return;
		}
		this.aClass22Array2 = new Class22[local57 + 1];
		this.anIntArrayArray3 = new int[local57 + 1][];
		for (local280 = 0; local280 < this.anInt488; local280++) {
			local285 = this.anIntArray45[local280];
			local295 = this.anIntArray41[local285];
			this.anIntArrayArray3[local285] = new int[this.anObjectArrayArray2[local285].length];
			for (local297 = 0; local297 < this.anObjectArrayArray2[local285].length; local297++) {
				this.anIntArrayArray3[local285][local297] = -1;
			}
			for (local314 = 0; local314 < local295; local314++) {
				this.anIntArrayArray3[local285][this.anIntArrayArray4[local285][local314]] = local19.method1373();
			}
			this.aClass22Array2[local285] = new Class22(this.anIntArrayArray3[local285]);
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(II)V")
	protected void method357(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!sd;I)I")
	public final int method358(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1) {
		@Pc(15) Class73 local15 = arg1.method2419();
		return this.aClass22Array2[arg0].method614(local15.method2411());
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Lclient!sd;I)I")
	public final int method359(@OriginalArg(0) Class73 arg0) {
		@Pc(8) Class73 local8 = arg0.method2419();
		return this.aClass22_2.method614(local8.method2411());
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIB)[B")
	public final byte[] method361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0 || this.anObjectArrayArray2.length <= arg1 || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || this.anObjectArrayArray2[arg1].length <= arg0) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(59) boolean local59 = this.method367(arg1, null);
			if (!local59) {
				this.method357(arg1);
				local59 = this.method367(arg1, null);
				if (!local59) {
					return null;
				}
			}
		}
		return Static125.method2124(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V")
	protected void method362(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V")
	public final void method363() {
		for (@Pc(13) int local13 = 0; local13 < this.anObjectArrayArray2.length; local13++) {
			if (this.anObjectArrayArray2[local13] != null) {
				for (@Pc(22) int local22 = 0; local22 < this.anObjectArrayArray2[local13].length; local22++) {
					this.anObjectArrayArray2[local13][local22] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)Z")
	public final boolean method364(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method349(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method349(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BLclient!sd;Lclient!sd;)Z")
	public final boolean method365(@OriginalArg(1) Class73 arg0, @OriginalArg(2) Class73 arg1) {
		@Pc(3) Class73 local3 = arg1.method2419();
		@Pc(7) Class73 local7 = arg0.method2419();
		@Pc(15) int local15 = this.aClass22_2.method614(local3.method2411());
		@Pc(25) int local25 = this.aClass22Array2[local15].method614(local7.method2411());
		return this.method349(local25, local15);
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(II)V")
	public final void method366(@OriginalArg(1) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray2[arg0].length; local7++) {
			this.anObjectArrayArray2[arg0][local7] = null;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB[I)Z")
	private boolean method367(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.anObjectArray2[arg0] == null) {
			return false;
		}
		@Pc(17) int[] local17 = this.anIntArrayArray4[arg0];
		@Pc(22) Object[] local22 = this.anObjectArrayArray2[arg0];
		@Pc(27) int local27 = this.anIntArray41[arg0];
		@Pc(29) boolean local29 = true;
		for (@Pc(31) int local31 = 0; local31 < local27; local31++) {
			if (local22[local17[local31]] == null) {
				local29 = false;
				break;
			}
		}
		if (local29) {
			return true;
		}
		@Pc(91) byte[] local91;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local91 = Static125.method2124(false, this.anObjectArray2[arg0]);
		} else {
			local91 = Static125.method2124(true, this.anObjectArray2[arg0]);
			@Pc(106) Class3_Sub12 local106 = new Class3_Sub12(local91);
			local106.method1364(local106.aByteArray16.length, arg1);
		}
		@Pc(118) byte[] local118;
		try {
			local118 = Static26.method549(local91);
		} catch (@Pc(120) RuntimeException local120) {
			throw Static175.method2706(local120, "T3 - " + (arg1 != null) + "," + arg0 + "," + local91.length + "," + Static67.method1185(local91, local91.length) + "," + Static67.method1185(local91, local91.length - 2) + "," + this.anIntArray44[arg0] + "," + this.anInt474);
		}
		if (this.aBoolean32) {
			this.anObjectArray2[arg0] = null;
		}
		if (local27 > 1) {
			@Pc(187) int local187 = local118.length;
			@Pc(190) int local190 = local187 - 1;
			@Pc(194) int local194 = local118[local190] & 0xFF;
			@Pc(202) int local202 = local190 - local194 * 4 * local27;
			@Pc(207) Class3_Sub12 local207 = new Class3_Sub12(local118);
			@Pc(210) int[] local210 = new int[local27];
			local207.anInt1793 = local202;
			@Pc(221) int local221;
			for (@Pc(215) int local215 = 0; local215 < local194; local215++) {
				@Pc(219) int local219 = 0;
				for (local221 = 0; local221 < local27; local221++) {
					local219 += local207.method1373();
					local210[local221] += local219;
				}
			}
			@Pc(251) byte[][] local251 = new byte[local27][];
			for (local221 = 0; local221 < local27; local221++) {
				local251[local221] = new byte[local210[local221]];
				local210[local221] = 0;
			}
			local207.anInt1793 = local202;
			@Pc(279) int local279 = 0;
			@Pc(285) int local285;
			for (@Pc(281) int local281 = 0; local281 < local194; local281++) {
				local285 = 0;
				for (@Pc(287) int local287 = 0; local287 < local27; local287++) {
					local285 += local207.method1373();
					Static184.method1123(local118, local279, local251[local287], local210[local287], local285);
					local279 += local285;
					local210[local287] += local285;
				}
			}
			for (local285 = 0; local285 < local27; local285++) {
				if (this.aBoolean33) {
					local22[local17[local285]] = local251[local285];
				} else {
					local22[local17[local285]] = Static61.method1112(local251[local285]);
				}
			}
		} else if (this.aBoolean33) {
			local22[local17[0]] = local118;
		} else {
			local22[local17[0]] = Static61.method1112(local118);
		}
		return true;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)Z")
	public final boolean method368(@OriginalArg(1) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method357(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}
}
