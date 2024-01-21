import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public abstract class Class11 {

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!ff", name = "D", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!ff", name = "E", descriptor = "[I")
	protected int[] anIntArray91;

	@OriginalMember(owner = "client!ff", name = "Q", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!ff", name = "S", descriptor = "[I")
	protected int[] anIntArray92;

	@OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
	public int anInt720;

	@OriginalMember(owner = "client!ff", name = "V", descriptor = "[I")
	private int[] anIntArray93;

	@OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
	private int anInt722;

	@OriginalMember(owner = "client!ff", name = "Y", descriptor = "[I")
	protected int[] anIntArray94;

	@OriginalMember(owner = "client!ff", name = "Z", descriptor = "[Lclient!uc;")
	private Class72[] aClass72Array2;

	@OriginalMember(owner = "client!ff", name = "fb", descriptor = "Lclient!uc;")
	private Class72 aClass72_2;

	@OriginalMember(owner = "client!ff", name = "ib", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "Z")
	private final boolean aBoolean48;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "Z")
	private final boolean aBoolean47;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(ZZ)V")
	protected Class11(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean48 = arg1;
		this.aBoolean47 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)Z")
	public final boolean method368() {
		@Pc(7) boolean local7 = true;
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray93.length; local17++) {
			@Pc(24) int local24 = this.anIntArray93[local17];
			if (this.anObjectArray2[local24] == null) {
				this.method397(local24);
				if (this.anObjectArray2[local24] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II[II)[B")
	public final byte[] method370(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg2 < 0 || this.anObjectArrayArray2[arg0].length <= arg2) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg2] == null) {
			@Pc(44) boolean local44 = this.method386(arg0, arg1);
			if (!local44) {
				this.method397(arg0);
				local44 = this.method386(arg0, arg1);
				if (!local44) {
					return null;
				}
			}
		}
		@Pc(72) byte[] local72 = Static51.method894(false, this.anObjectArrayArray2[arg0][arg2]);
		if (this.aBoolean48) {
			this.anObjectArrayArray2[arg0][arg2] = null;
		}
		return local72;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)[B")
	public final byte[] method372(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method383(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method383(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[B)V")
	protected final void method374(@OriginalArg(1) byte[] arg0) {
		this.anInt720 = Static70.method1133(arg0.length, arg0);
		@Pc(19) Class2_Sub17 local19 = new Class2_Sub17(Static92.method1395(arg0));
		@Pc(23) int local23 = local19.method1780();
		if (local23 != 5) {
			return;
		}
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = -1;
		@Pc(45) int local45 = local19.method1780();
		this.anInt722 = local19.method1783();
		this.anIntArray93 = new int[this.anInt722];
		for (@Pc(57) int local57 = 0; local57 < this.anInt722; local57++) {
			this.anIntArray93[local57] = local39 += local19.method1783();
			if (this.anIntArray93[local57] > local41) {
				local41 = this.anIntArray93[local57];
			}
		}
		this.anIntArray94 = new int[local41 + 1];
		this.anIntArrayArray8 = new int[local41 + 1][];
		this.anObjectArray2 = new Object[local41 + 1];
		this.anIntArray91 = new int[local41 + 1];
		this.anObjectArrayArray2 = new Object[local41 + 1][];
		this.anIntArray92 = new int[local41 + 1];
		@Pc(139) int local139;
		if (local45 != 0) {
			this.anIntArray90 = new int[local41 + 1];
			for (local139 = 0; local139 < this.anInt722; local139++) {
				this.anIntArray90[this.anIntArray93[local139]] = local19.method1747();
			}
			this.aClass72_2 = new Class72(this.anIntArray90);
		}
		for (local139 = 0; local139 < this.anInt722; local139++) {
			this.anIntArray92[this.anIntArray93[local139]] = local19.method1747();
		}
		for (@Pc(188) int local188 = 0; local188 < this.anInt722; local188++) {
			this.anIntArray91[this.anIntArray93[local188]] = local19.method1747();
		}
		for (@Pc(211) int local211 = 0; local211 < this.anInt722; local211++) {
			this.anIntArray94[this.anIntArray93[local211]] = local19.method1783();
		}
		@Pc(243) int local243;
		@Pc(248) int local248;
		@Pc(256) int local256;
		@Pc(258) int local258;
		for (@Pc(234) int local234 = 0; local234 < this.anInt722; local234++) {
			local39 = 0;
			local243 = this.anIntArray93[local234];
			local248 = this.anIntArray94[local243];
			this.anIntArrayArray8[local243] = new int[local248];
			local256 = -1;
			for (local258 = 0; local258 < local248; local258++) {
				@Pc(275) int local275 = this.anIntArrayArray8[local243][local258] = local39 += local19.method1783();
				if (local256 < local275) {
					local256 = local275;
				}
			}
			this.anObjectArrayArray2[local243] = new Object[local256 + 1];
		}
		if (local45 == 0) {
			return;
		}
		this.anIntArrayArray9 = new int[local41 + 1][];
		this.aClass72Array2 = new Class72[local41 + 1];
		for (local243 = 0; local243 < this.anInt722; local243++) {
			local248 = this.anIntArray93[local243];
			local256 = this.anIntArray94[local248];
			this.anIntArrayArray9[local248] = new int[this.anObjectArrayArray2[local248].length];
			for (local258 = 0; local258 < local256; local258++) {
				this.anIntArrayArray9[local248][this.anIntArrayArray8[local248][local258]] = local19.method1747();
			}
			this.aClass72Array2[local248] = new Class72(this.anIntArrayArray9[local248]);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)[B")
	public final byte[] method377(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method390(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method390(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLclient!wd;)I")
	public final int method378(@OriginalArg(1) Class80 arg0) {
		@Pc(3) Class80 local3 = arg0.method2011();
		return this.aClass72_2.method1860(local3.method2013());
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!wd;I)V")
	public final void method380(@OriginalArg(0) Class80 arg0) {
		@Pc(15) Class80 local15 = arg0.method2011();
		@Pc(23) int local23 = this.aClass72_2.method1860(local15.method2013());
		if (local23 >= 0) {
			this.method396(local23);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)[I")
	public final int[] method381(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray8[arg0];
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)I")
	public final int method382() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZI)[B")
	public final byte[] method383(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method370(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)Z")
	public final boolean method384(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || this.anObjectArrayArray2[arg1].length <= arg0) {
			return false;
		} else if (this.anObjectArrayArray2[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray2[arg1] == null) {
			this.method397(arg1);
			return this.anObjectArray2[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!wd;Lclient!wd;I)Z")
	public final boolean method385(@OriginalArg(0) Class80 arg0, @OriginalArg(1) Class80 arg1) {
		@Pc(3) Class80 local3 = arg1.method2011();
		@Pc(7) Class80 local7 = arg0.method2011();
		@Pc(19) int local19 = this.aClass72_2.method1860(local3.method2013());
		@Pc(31) int local31 = this.aClass72Array2[local19].method1860(local7.method2013());
		return this.method384(local31, local19);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[IB)Z")
	private boolean method386(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.anObjectArray2[arg0] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray94[arg0];
		@Pc(22) int[] local22 = this.anIntArrayArray8[arg0];
		@Pc(27) Object[] local27 = this.anObjectArrayArray2[arg0];
		@Pc(29) boolean local29 = true;
		for (@Pc(31) int local31 = 0; local31 < local17; local31++) {
			if (local27[local22[local31]] == null) {
				local29 = false;
				break;
			}
		}
		if (local29) {
			return true;
		}
		@Pc(89) byte[] local89;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local89 = Static51.method894(false, this.anObjectArray2[arg0]);
		} else {
			local89 = Static51.method894(true, this.anObjectArray2[arg0]);
			@Pc(94) Class2_Sub17 local94 = new Class2_Sub17(local89);
			local94.method1760(local94.aByteArray38.length, arg1);
		}
		@Pc(116) byte[] local116;
		try {
			local116 = Static92.method1395(local89);
		} catch (@Pc(118) RuntimeException local118) {
			throw Static65.method1096(local118, "T3 - " + (arg1 != null) + "," + arg0 + "," + local89.length + "," + Static70.method1133(local89.length, local89) + "," + Static70.method1133(local89.length - 2, local89) + "," + this.anIntArray92[arg0] + "," + this.anInt720);
		}
		if (this.aBoolean47) {
			this.anObjectArray2[arg0] = null;
		}
		if (local17 <= 1) {
			local27[local22[0]] = Static102.method1659(local116);
		} else {
			@Pc(198) int local198 = local116.length;
			@Pc(200) int local200 = local198 - 1;
			@Pc(205) int local205 = local116[local200] & 0xFF;
			@Pc(213) int local213 = local200 - local17 * local205 * 4;
			@Pc(216) int[] local216 = new int[local17];
			@Pc(221) Class2_Sub17 local221 = new Class2_Sub17(local116);
			local221.anInt2799 = local213;
			@Pc(232) int local232;
			for (@Pc(226) int local226 = 0; local226 < local205; local226++) {
				@Pc(230) int local230 = 0;
				for (local232 = 0; local232 < local17; local232++) {
					local230 += local221.method1747();
					local216[local232] += local230;
				}
			}
			@Pc(258) byte[][] local258 = new byte[local17][];
			for (local232 = 0; local232 < local17; local232++) {
				local258[local232] = new byte[local216[local232]];
				local216[local232] = 0;
			}
			local221.anInt2799 = local213;
			@Pc(282) int local282 = 0;
			@Pc(288) int local288;
			for (@Pc(284) int local284 = 0; local284 < local205; local284++) {
				local288 = 0;
				for (@Pc(290) int local290 = 0; local290 < local17; local290++) {
					local288 += local221.method1747();
					Static131.method1114(local116, local282, local258[local290], local216[local290], local288);
					local282 += local288;
					local216[local290] += local288;
				}
			}
			for (local288 = 0; local288 < local17; local288++) {
				local27[local22[local288]] = Static102.method1659(local258[local288]);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)I")
	public final int method387(@OriginalArg(1) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Lclient!wd;Lclient!wd;I)[B")
	public final byte[] method388(@OriginalArg(0) Class80 arg0, @OriginalArg(1) Class80 arg1) {
		@Pc(3) Class80 local3 = arg0.method2011();
		@Pc(7) Class80 local7 = arg1.method2011();
		@Pc(26) int local26 = this.aClass72_2.method1860(local3.method2013());
		@Pc(36) int local36 = this.aClass72Array2[local26].method1860(local7.method2013());
		return this.method383(local36, local26);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(ZI)V")
	public final void method389(@OriginalArg(1) int arg0) {
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray2[arg0].length; local7++) {
			this.anObjectArrayArray2[arg0][local7] = null;
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(III)[B")
	public final byte[] method390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(43) boolean local43 = this.method386(arg0, null);
			if (!local43) {
				this.method397(arg0);
				local43 = this.method386(arg0, null);
				if (!local43) {
					return null;
				}
			}
		}
		return Static51.method894(false, this.anObjectArrayArray2[arg0][arg1]);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BILclient!wd;)I")
	public final int method391(@OriginalArg(1) int arg0, @OriginalArg(2) Class80 arg1) {
		@Pc(11) Class80 local11 = arg1.method2011();
		return this.aClass72Array2[arg0].method1860(local11.method2013());
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
	public final void method392() {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2.length; local3++) {
			if (this.anObjectArrayArray2[local3] != null) {
				for (@Pc(12) int local12 = 0; local12 < this.anObjectArrayArray2[local3].length; local12++) {
					this.anObjectArrayArray2[local3][local12] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Z")
	public final boolean method394(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method384(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method384(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(BI)V")
	protected void method396(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(ZI)V")
	protected void method397(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)Z")
	public final boolean method398(@OriginalArg(1) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method397(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}
}
