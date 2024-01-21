import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public abstract class Class26 {

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "[I")
	protected int[] anIntArray219;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
	private int anInt1462;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!ff", name = "v", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "[Lclient!aa;")
	private Class2[] aClass2Array2;

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "Lclient!aa;")
	private Class2 aClass2_2;

	@OriginalMember(owner = "client!ff", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!ff", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
	public int anInt1480;

	@OriginalMember(owner = "client!ff", name = "I", descriptor = "[I")
	protected int[] anIntArray222;

	@OriginalMember(owner = "client!ff", name = "U", descriptor = "[I")
	protected int[] anIntArray224;

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "Z")
	private final boolean aBoolean52;

	@OriginalMember(owner = "client!ff", name = "M", descriptor = "Z")
	private final boolean aBoolean53;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(ZZ)V")
	protected Class26(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean52 = arg1;
		this.aBoolean53 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)Z")
	public final boolean method1023() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray220.length; local9++) {
			@Pc(16) int local16 = this.anIntArray220[local9];
			if (this.anObjectArray2[local16] == null) {
				this.method1026(local16);
				if (this.anObjectArray2[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public final void method1024() {
		for (@Pc(1) int local1 = 0; local1 < this.anObjectArrayArray2.length; local1++) {
			if (this.anObjectArrayArray2[local1] != null) {
				for (@Pc(9) int local9 = 0; local9 < this.anObjectArrayArray2[local1].length; local9++) {
					this.anObjectArrayArray2[local1][local9] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)[B")
	public final byte[] method1025(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1046(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1046(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)V")
	protected void method1026(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!r;Lclient!r;I)[B")
	public final byte[] method1027(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class61 arg1) {
		@Pc(7) Class61 local7 = arg0.method1711();
		@Pc(11) Class61 local11 = arg1.method1711();
		@Pc(19) int local19 = this.aClass2_2.method10(local7.method1702());
		@Pc(29) int local29 = this.aClass2Array2[local19].method10(local11.method1702());
		return this.method1038(local19, local29);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(BI)V")
	public final void method1028(@OriginalArg(1) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2[arg0].length; local3++) {
			this.anObjectArrayArray2[arg0][local3] = null;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[II)Z")
	private boolean method1029(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.anObjectArray2[arg0] == null) {
			return false;
		}
		@Pc(15) int[] local15 = this.anIntArrayArray17[arg0];
		@Pc(20) int local20 = this.anIntArray224[arg0];
		@Pc(22) boolean local22 = true;
		@Pc(27) Object[] local27 = this.anObjectArrayArray2[arg0];
		for (@Pc(29) int local29 = 0; local29 < local20; local29++) {
			if (local27[local15[local29]] == null) {
				local22 = false;
				break;
			}
		}
		if (local22) {
			return true;
		}
		@Pc(81) byte[] local81;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local81 = Static40.method736(this.anObjectArray2[arg0], false);
		} else {
			local81 = Static40.method736(this.anObjectArray2[arg0], true);
			@Pc(86) Class5_Sub14 local86 = new Class5_Sub14(local81);
			local86.method1442(arg1, local86.aByteArray33.length);
		}
		@Pc(109) byte[] local109;
		try {
			local109 = Static36.method700(local81);
		} catch (@Pc(111) RuntimeException local111) {
			throw Static30.method633(local111, "T3 - " + (arg1 != null) + "," + arg0 + "," + local81.length + "," + Static58.method1011(local81.length, local81) + "," + Static58.method1011(local81.length - 2, local81) + "," + this.anIntArray219[arg0] + "," + this.anInt1480);
		}
		if (this.aBoolean53) {
			this.anObjectArray2[arg0] = null;
		}
		if (local20 > 1) {
			@Pc(178) int local178 = local109.length;
			@Pc(181) int[] local181 = new int[local20];
			@Pc(184) int local184 = local178 - 1;
			@Pc(188) int local188 = local109[local184] & 0xFF;
			@Pc(196) int local196 = local184 - local20 * 4 * local188;
			@Pc(201) Class5_Sub14 local201 = new Class5_Sub14(local109);
			local201.anInt2199 = local196;
			@Pc(211) int local211;
			for (@Pc(206) int local206 = 0; local206 < local188; local206++) {
				@Pc(209) int local209 = 0;
				for (local211 = 0; local211 < local20; local211++) {
					local209 += local201.method1461();
					local181[local211] += local209;
				}
			}
			@Pc(240) byte[][] local240 = new byte[local20][];
			for (local211 = 0; local211 < local20; local211++) {
				local240[local211] = new byte[local181[local211]];
				local181[local211] = 0;
			}
			local201.anInt2199 = local196;
			@Pc(267) int local267 = 0;
			@Pc(272) int local272;
			for (@Pc(269) int local269 = 0; local269 < local188; local269++) {
				local272 = 0;
				for (@Pc(274) int local274 = 0; local274 < local20; local274++) {
					local272 += local201.method1461();
					Static136.method893(local109, local267, local240[local274], local181[local274], local272);
					local181[local274] += local272;
					local267 += local272;
				}
			}
			for (local272 = 0; local272 < local20; local272++) {
				if (this.aBoolean52) {
					local27[local15[local272]] = local240[local272];
				} else {
					local27[local15[local272]] = Static39.method733(local240[local272]);
				}
			}
		} else if (this.aBoolean52) {
			local27[local15[0]] = local109;
		} else {
			local27[local15[0]] = Static39.method733(local109);
		}
		return true;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II[II)[B")
	public final byte[] method1030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || this.anObjectArrayArray2[arg1].length <= arg0) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(46) boolean local46 = this.method1029(arg1, arg2);
			if (!local46) {
				this.method1026(arg1);
				local46 = this.method1029(arg1, arg2);
				if (!local46) {
					return null;
				}
			}
		}
		@Pc(78) byte[] local78 = Static40.method736(this.anObjectArrayArray2[arg1][arg0], false);
		if (this.aBoolean52) {
			this.anObjectArrayArray2[arg1][arg0] = null;
		}
		return local78;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(BI)I")
	public final int method1031(@OriginalArg(1) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!r;I)V")
	public final void method1032(@OriginalArg(0) Class61 arg0) {
		@Pc(7) Class61 local7 = arg0.method1711();
		@Pc(15) int local15 = this.aClass2_2.method10(local7.method1702());
		if (local15 >= 0) {
			this.method1036(local15);
		}
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(BI)Z")
	public final boolean method1033(@OriginalArg(1) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method1026(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)[B")
	public final byte[] method1034(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1038(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1038(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)V")
	protected void method1036(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(III)[B")
	public final byte[] method1038(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method1030(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!r;I)I")
	public final int method1039(@OriginalArg(1) Class61 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class61 local9 = arg0.method1711();
		return this.aClass2Array2[arg1].method10(local9.method1702());
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(II)[I")
	public final int[] method1040(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray17[arg0];
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)Z")
	public final boolean method1041(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method1026(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lclient!r;Lclient!r;I)Z")
	public final boolean method1042(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class61 arg1) {
		@Pc(7) Class61 local7 = arg1.method1711();
		@Pc(11) Class61 local11 = arg0.method1711();
		@Pc(19) int local19 = this.aClass2_2.method10(local7.method1702());
		@Pc(29) int local29 = this.aClass2Array2[local19].method10(local11.method1702());
		return this.method1041(local19, local29);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([BB)V")
	protected final void method1043(@OriginalArg(0) byte[] arg0) {
		this.anInt1480 = Static58.method1011(arg0.length, arg0);
		@Pc(19) Class5_Sub14 local19 = new Class5_Sub14(Static36.method700(arg0));
		@Pc(27) int local27 = local19.method1471();
		if (local27 != 5 && local27 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local27);
		}
		if (local27 >= 6) {
			local19.method1461();
		}
		@Pc(55) int local55 = local19.method1471();
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = -1;
		this.anInt1462 = local19.method1478();
		this.anIntArray220 = new int[this.anInt1462];
		for (@Pc(71) int local71 = 0; local71 < this.anInt1462; local71++) {
			this.anIntArray220[local71] = local57 += local19.method1478();
			if (this.anIntArray220[local71] > local59) {
				local59 = this.anIntArray220[local71];
			}
		}
		this.anObjectArrayArray2 = new Object[local59 + 1][];
		this.anIntArrayArray17 = new int[local59 + 1][];
		this.anIntArray219 = new int[local59 + 1];
		this.anIntArray224 = new int[local59 + 1];
		this.anObjectArray2 = new Object[local59 + 1];
		this.anIntArray222 = new int[local59 + 1];
		@Pc(157) int local157;
		@Pc(176) int local176;
		if (local55 != 0) {
			this.anIntArray221 = new int[local59 + 1];
			for (local157 = 0; local157 < local59 + 1; local157++) {
				this.anIntArray221[local157] = -1;
			}
			for (local176 = 0; local176 < this.anInt1462; local176++) {
				this.anIntArray221[this.anIntArray220[local176]] = local19.method1461();
			}
			this.aClass2_2 = new Class2(this.anIntArray221);
		}
		for (local157 = 0; local157 < this.anInt1462; local157++) {
			this.anIntArray219[this.anIntArray220[local157]] = local19.method1461();
		}
		for (local176 = 0; local176 < this.anInt1462; local176++) {
			this.anIntArray222[this.anIntArray220[local176]] = local19.method1461();
		}
		for (@Pc(248) int local248 = 0; local248 < this.anInt1462; local248++) {
			this.anIntArray224[this.anIntArray220[local248]] = local19.method1478();
		}
		@Pc(276) int local276;
		@Pc(281) int local281;
		@Pc(283) int local283;
		@Pc(291) int local291;
		@Pc(308) int local308;
		for (@Pc(267) int local267 = 0; local267 < this.anInt1462; local267++) {
			local57 = 0;
			local276 = this.anIntArray220[local267];
			local281 = this.anIntArray224[local276];
			local283 = -1;
			this.anIntArrayArray17[local276] = new int[local281];
			for (local291 = 0; local291 < local281; local291++) {
				local308 = this.anIntArrayArray17[local276][local291] = local57 += local19.method1478();
				if (local308 > local283) {
					local283 = local308;
				}
			}
			this.anObjectArrayArray2[local276] = new Object[local283 + 1];
		}
		if (local55 == 0) {
			return;
		}
		this.aClass2Array2 = new Class2[local59 + 1];
		this.anIntArrayArray16 = new int[local59 + 1][];
		for (local276 = 0; local276 < this.anInt1462; local276++) {
			local281 = this.anIntArray220[local276];
			local283 = this.anIntArray224[local281];
			this.anIntArrayArray16[local281] = new int[this.anObjectArrayArray2[local281].length];
			for (local291 = 0; local291 < this.anObjectArrayArray2[local281].length; local291++) {
				this.anIntArrayArray16[local281][local291] = -1;
			}
			for (local308 = 0; local308 < local283; local308++) {
				this.anIntArrayArray16[local281][this.anIntArrayArray17[local281][local308]] = local19.method1461();
			}
			this.aClass2Array2[local281] = new Class2(this.anIntArrayArray16[local281]);
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lclient!r;I)I")
	public final int method1044(@OriginalArg(0) Class61 arg0) {
		@Pc(12) Class61 local12 = arg0.method1711();
		return this.aClass2_2.method10(local12.method1702());
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)I")
	public final int method1045() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBI)[B")
	public final byte[] method1046(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || this.anObjectArrayArray2[arg0].length <= arg1) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(49) boolean local49 = this.method1029(arg0, null);
			if (!local49) {
				this.method1026(arg0);
				local49 = this.method1029(arg0, null);
				if (!local49) {
					return null;
				}
			}
		}
		return Static40.method736(this.anObjectArrayArray2[arg0][arg1], false);
	}
}
