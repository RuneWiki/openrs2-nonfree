import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public abstract class Class29 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray28;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
	public int anInt1389;

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!kh", name = "r", descriptor = "Lclient!ef;")
	private Class20 aClass20_2;

	@OriginalMember(owner = "client!kh", name = "t", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!kh", name = "u", descriptor = "[I")
	protected int[] anIntArray160;

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "[Lclient!ef;")
	private Class20[] aClass20Array2;

	@OriginalMember(owner = "client!kh", name = "y", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!kh", name = "D", descriptor = "[I")
	private int[] anIntArray161;

	@OriginalMember(owner = "client!kh", name = "U", descriptor = "[I")
	protected int[] anIntArray162;

	@OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
	private int anInt1412;

	@OriginalMember(owner = "client!kh", name = "X", descriptor = "[I")
	protected int[] anIntArray163;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "Z")
	private final boolean aBoolean58;

	@OriginalMember(owner = "client!kh", name = "C", descriptor = "Z")
	private final boolean aBoolean59;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(ZZ)V")
	protected Class29(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean58 = arg1;
		this.aBoolean59 = arg0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Z")
	public final boolean method1015(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1016(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1016(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)Z")
	public final boolean method1016(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || this.anObjectArrayArray2[arg0].length <= arg1) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray28[arg0] == null) {
			this.method1024(arg0);
			return this.anObjectArray28[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B[III)[B")
	public final byte[] method1017(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || this.anObjectArrayArray2.length <= arg1 || this.anObjectArrayArray2[arg1] == null || arg2 < 0 || arg2 >= this.anObjectArrayArray2[arg1].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg2] == null) {
			@Pc(46) boolean local46 = this.method1029(arg0, arg1);
			if (!local46) {
				this.method1024(arg1);
				local46 = this.method1029(arg0, arg1);
				if (!local46) {
					return null;
				}
			}
		}
		@Pc(80) byte[] local80 = Static70.method1183(false, this.anObjectArrayArray2[arg1][arg2]);
		if (this.aBoolean58) {
			this.anObjectArrayArray2[arg1][arg2] = null;
		}
		return local80;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)V")
	protected void method1018(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)Z")
	public final boolean method1019() {
		@Pc(3) boolean local3 = true;
		for (@Pc(5) int local5 = 0; local5 < this.anIntArray159.length; local5++) {
			@Pc(12) int local12 = this.anIntArray159[local5];
			if (this.anObjectArray28[local12] == null) {
				this.method1024(local12);
				if (this.anObjectArray28[local12] == null) {
					local3 = false;
				}
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBLclient!cd;)I")
	public final int method1020(@OriginalArg(0) int arg0, @OriginalArg(2) Class10 arg1) {
		@Pc(8) Class10 local8 = arg1.method360();
		return this.aClass20Array2[arg0].method789(local8.method334());
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!cd;)V")
	public final void method1021(@OriginalArg(1) Class10 arg0) {
		@Pc(3) Class10 local3 = arg0.method360();
		@Pc(15) int local15 = this.aClass20_2.method789(local3.method334());
		if (local15 >= 0) {
			this.method1018(local15);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)[I")
	public final int[] method1022(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray19[arg0];
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)V")
	protected void method1024(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V")
	public final void method1025() {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2.length; local3++) {
			if (this.anObjectArrayArray2[local3] != null) {
				for (@Pc(17) int local17 = 0; local17 < this.anObjectArrayArray2[local3].length; local17++) {
					this.anObjectArrayArray2[local3][local17] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLclient!cd;)I")
	public final int method1026(@OriginalArg(1) Class10 arg0) {
		@Pc(3) Class10 local3 = arg0.method360();
		return this.aClass20_2.method789(local3.method334());
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(B)I")
	public final int method1027() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([IIB)Z")
	private boolean method1029(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.anObjectArray28[arg1] == null) {
			return false;
		}
		@Pc(22) int local22 = this.anIntArray163[arg1];
		@Pc(27) int[] local27 = this.anIntArrayArray19[arg1];
		@Pc(29) boolean local29 = true;
		@Pc(34) Object[] local34 = this.anObjectArrayArray2[arg1];
		for (@Pc(36) int local36 = 0; local36 < local22; local36++) {
			if (local34[local27[local36]] == null) {
				local29 = false;
				break;
			}
		}
		if (local29) {
			return true;
		}
		@Pc(90) byte[] local90;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local90 = Static70.method1183(false, this.anObjectArray28[arg1]);
		} else {
			local90 = Static70.method1183(true, this.anObjectArray28[arg1]);
			@Pc(95) Class2_Sub11 local95 = new Class2_Sub11(local90);
			local95.method1447(local95.aByteArray24.length, arg0);
		}
		@Pc(119) byte[] local119;
		try {
			local119 = Static116.method1884(local90);
		} catch (@Pc(121) RuntimeException local121) {
			throw Static177.method2700(local121, "T3 - " + (arg0 != null) + "," + arg1 + "," + local90.length + "," + Static177.method2697(local90.length, local90) + "," + Static177.method2697(local90.length - 2, local90) + "," + this.anIntArray162[arg1] + "," + this.anInt1389);
		}
		if (this.aBoolean59) {
			this.anObjectArray28[arg1] = null;
		}
		if (local22 > 1) {
			@Pc(188) int local188 = local119.length;
			@Pc(191) int local191 = local188 - 1;
			@Pc(195) int local195 = local119[local191] & 0xFF;
			@Pc(203) int local203 = local191 - local22 * 4 * local195;
			@Pc(208) Class2_Sub11 local208 = new Class2_Sub11(local119);
			local208.anInt2077 = local203;
			@Pc(214) int[] local214 = new int[local22];
			@Pc(222) int local222;
			for (@Pc(216) int local216 = 0; local216 < local195; local216++) {
				@Pc(220) int local220 = 0;
				for (local222 = 0; local222 < local22; local222++) {
					local220 += local208.method1449();
					local214[local222] += local220;
				}
			}
			@Pc(252) byte[][] local252 = new byte[local22][];
			for (local222 = 0; local222 < local22; local222++) {
				local252[local222] = new byte[local214[local222]];
				local214[local222] = 0;
			}
			local208.anInt2077 = local203;
			@Pc(280) int local280 = 0;
			@Pc(286) int local286;
			for (@Pc(282) int local282 = 0; local282 < local195; local282++) {
				local286 = 0;
				for (@Pc(288) int local288 = 0; local288 < local22; local288++) {
					local286 += local208.method1449();
					Static182.method1348(local119, local280, local252[local288], local214[local288], local286);
					local280 += local286;
					local214[local288] += local286;
				}
			}
			for (local286 = 0; local286 < local22; local286++) {
				if (this.aBoolean58) {
					local34[local27[local286]] = local252[local286];
				} else {
					local34[local27[local286]] = Static92.method1560(local252[local286]);
				}
			}
		} else if (this.aBoolean58) {
			local34[local27[0]] = local119;
		} else {
			local34[local27[0]] = Static92.method1560(local119);
		}
		return true;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(III)[B")
	public final byte[] method1030(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method1017(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(BI)[B")
	public final byte[] method1032(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1030(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1030(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(III)[B")
	public final byte[] method1033(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || arg0 >= this.anObjectArrayArray2[arg1].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(44) boolean local44 = this.method1029(null, arg1);
			if (!local44) {
				this.method1024(arg1);
				local44 = this.method1029(null, arg1);
				if (!local44) {
					return null;
				}
			}
		}
		return Static70.method1183(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)Z")
	public final boolean method1034(@OriginalArg(1) int arg0) {
		if (this.anObjectArray28[arg0] == null) {
			this.method1024(arg0);
			return this.anObjectArray28[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLclient!cd;Lclient!cd;)Z")
	public final boolean method1036(@OriginalArg(1) Class10 arg0, @OriginalArg(2) Class10 arg1) {
		@Pc(14) Class10 local14 = arg1.method360();
		@Pc(18) Class10 local18 = arg0.method360();
		@Pc(26) int local26 = this.aClass20_2.method789(local14.method334());
		@Pc(36) int local36 = this.aClass20Array2[local26].method789(local18.method334());
		return this.method1016(local26, local36);
	}

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(II)V")
	public final void method1037(@OriginalArg(1) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray2[arg0].length; local7++) {
			this.anObjectArrayArray2[arg0][local7] = null;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!cd;ZLclient!cd;)[B")
	public final byte[] method1038(@OriginalArg(0) Class10 arg0, @OriginalArg(2) Class10 arg1) {
		@Pc(3) Class10 local3 = arg1.method360();
		@Pc(16) Class10 local16 = arg0.method360();
		@Pc(24) int local24 = this.aClass20_2.method789(local3.method334());
		@Pc(34) int local34 = this.aClass20Array2[local24].method789(local16.method334());
		return this.method1030(local34, local24);
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(II)I")
	public final int method1039(@OriginalArg(1) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([BZ)V")
	protected final void method1040(@OriginalArg(0) byte[] arg0) {
		this.anInt1389 = Static177.method2697(arg0.length, arg0);
		@Pc(19) Class2_Sub11 local19 = new Class2_Sub11(Static116.method1884(arg0));
		@Pc(23) int local23 = local19.method1461();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 >= 6) {
			local19.method1449();
		}
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = -1;
		@Pc(61) int local61 = local19.method1461();
		this.anInt1412 = local19.method1456();
		this.anIntArray159 = new int[this.anInt1412];
		for (@Pc(73) int local73 = 0; local73 < this.anInt1412; local73++) {
			this.anIntArray159[local73] = local55 += local19.method1456();
			if (local57 < this.anIntArray159[local73]) {
				local57 = this.anIntArray159[local73];
			}
		}
		this.anIntArray163 = new int[local57 + 1];
		this.anIntArray162 = new int[local57 + 1];
		this.anIntArray160 = new int[local57 + 1];
		this.anObjectArray28 = new Object[local57 + 1];
		this.anIntArrayArray19 = new int[local57 + 1][];
		this.anObjectArrayArray2 = new Object[local57 + 1][];
		@Pc(152) int local152;
		@Pc(167) int local167;
		if (local61 != 0) {
			this.anIntArray161 = new int[local57 + 1];
			for (local152 = 0; local152 < local57 + 1; local152++) {
				this.anIntArray161[local152] = -1;
			}
			for (local167 = 0; local167 < this.anInt1412; local167++) {
				this.anIntArray161[this.anIntArray159[local167]] = local19.method1449();
			}
			this.aClass20_2 = new Class20(this.anIntArray161);
		}
		for (local152 = 0; local152 < this.anInt1412; local152++) {
			this.anIntArray162[this.anIntArray159[local152]] = local19.method1449();
		}
		for (local167 = 0; local167 < this.anInt1412; local167++) {
			this.anIntArray160[this.anIntArray159[local167]] = local19.method1449();
		}
		for (@Pc(243) int local243 = 0; local243 < this.anInt1412; local243++) {
			this.anIntArray163[this.anIntArray159[local243]] = local19.method1456();
		}
		@Pc(275) int local275;
		@Pc(280) int local280;
		@Pc(282) int local282;
		@Pc(290) int local290;
		@Pc(307) int local307;
		for (@Pc(266) int local266 = 0; local266 < this.anInt1412; local266++) {
			local55 = 0;
			local275 = this.anIntArray159[local266];
			local280 = this.anIntArray163[local275];
			local282 = -1;
			this.anIntArrayArray19[local275] = new int[local280];
			for (local290 = 0; local290 < local280; local290++) {
				local307 = this.anIntArrayArray19[local275][local290] = local55 += local19.method1456();
				if (local282 < local307) {
					local282 = local307;
				}
			}
			this.anObjectArrayArray2[local275] = new Object[local282 + 1];
		}
		if (local61 == 0) {
			return;
		}
		this.anIntArrayArray20 = new int[local57 + 1][];
		this.aClass20Array2 = new Class20[local57 + 1];
		for (local275 = 0; local275 < this.anInt1412; local275++) {
			local280 = this.anIntArray159[local275];
			local282 = this.anIntArray163[local280];
			this.anIntArrayArray20[local280] = new int[this.anObjectArrayArray2[local280].length];
			for (local290 = 0; local290 < this.anObjectArrayArray2[local280].length; local290++) {
				this.anIntArrayArray20[local280][local290] = -1;
			}
			for (local307 = 0; local307 < local282; local307++) {
				this.anIntArrayArray20[local280][this.anIntArrayArray19[local280][local307]] = local19.method1449();
			}
			this.aClass20Array2[local280] = new Class20(this.anIntArrayArray20[local280]);
		}
	}
}
