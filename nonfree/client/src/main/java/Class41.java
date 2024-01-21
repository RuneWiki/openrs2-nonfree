import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public abstract class Class41 {

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
	public int anInt1395;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "[I")
	protected int[] anIntArray217;

	@OriginalMember(owner = "client!pb", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!pb", name = "E", descriptor = "[Lclient!lc;")
	private Class45[] aClass45Array2;

	@OriginalMember(owner = "client!pb", name = "I", descriptor = "[I")
	protected int[] anIntArray218;

	@OriginalMember(owner = "client!pb", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
	private int anInt1409;

	@OriginalMember(owner = "client!pb", name = "U", descriptor = "Lclient!lc;")
	private Class45 aClass45_2;

	@OriginalMember(owner = "client!pb", name = "bb", descriptor = "[I")
	protected int[] anIntArray219;

	@OriginalMember(owner = "client!pb", name = "cb", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!pb", name = "B", descriptor = "Z")
	private final boolean aBoolean79;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Z")
	private final boolean aBoolean78;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(ZZ)V")
	protected Class41(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean79 = arg0;
		this.aBoolean78 = arg1;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)[I")
	public final int[] method1049(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray17[arg0];
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!rd;II)I")
	public final int method1050(@OriginalArg(0) Class64 arg0, @OriginalArg(2) int arg1) {
		@Pc(5) Class64 local5 = arg0.method1503();
		return this.aClass45Array2[arg1].method1100(local5.method1485());
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)I")
	public final int method1051() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)V")
	protected void method1052(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)Z")
	public final boolean method1053(@OriginalArg(1) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method1060(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Z")
	public final boolean method1054() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray220.length; local9++) {
			@Pc(16) int local16 = this.anIntArray220[local9];
			if (this.anObjectArray2[local16] == null) {
				this.method1060(local16);
				if (this.anObjectArray2[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[B")
	public final byte[] method1055(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1062(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1062(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([BB)V")
	protected final void method1056(@OriginalArg(0) byte[] arg0) {
		this.anInt1395 = Static75.method1251(arg0.length, arg0);
		@Pc(19) Class1_Sub6 local19 = new Class1_Sub6(Static27.method681(arg0));
		@Pc(23) int local23 = local19.method1837();
		if (local23 != 5) {
			return;
		}
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = -1;
		@Pc(37) int local37 = local19.method1837();
		this.anInt1409 = local19.method1842();
		this.anIntArray220 = new int[this.anInt1409];
		for (@Pc(49) int local49 = 0; local49 < this.anInt1409; local49++) {
			this.anIntArray220[local49] = local31 += local19.method1842();
			if (this.anIntArray220[local49] > local33) {
				local33 = this.anIntArray220[local49];
			}
		}
		this.anIntArray219 = new int[local33 + 1];
		this.anIntArrayArray17 = new int[local33 + 1][];
		this.anIntArray217 = new int[local33 + 1];
		this.anObjectArray2 = new Object[local33 + 1];
		this.anIntArray218 = new int[local33 + 1];
		this.anObjectArrayArray2 = new Object[local33 + 1][];
		@Pc(127) int local127;
		if (local37 != 0) {
			this.anIntArray216 = new int[local33 + 1];
			for (local127 = 0; local127 < this.anInt1409; local127++) {
				this.anIntArray216[this.anIntArray220[local127]] = local19.method1817();
			}
			this.aClass45_2 = new Class45(this.anIntArray216);
		}
		for (local127 = 0; local127 < this.anInt1409; local127++) {
			this.anIntArray217[this.anIntArray220[local127]] = local19.method1817();
		}
		for (@Pc(180) int local180 = 0; local180 < this.anInt1409; local180++) {
			this.anIntArray219[this.anIntArray220[local180]] = local19.method1817();
		}
		for (@Pc(203) int local203 = 0; local203 < this.anInt1409; local203++) {
			this.anIntArray218[this.anIntArray220[local203]] = local19.method1842();
		}
		@Pc(239) int local239;
		@Pc(246) int local246;
		@Pc(241) int local241;
		@Pc(254) int local254;
		for (@Pc(230) int local230 = 0; local230 < this.anInt1409; local230++) {
			local31 = 0;
			local239 = this.anIntArray220[local230];
			local241 = -1;
			local246 = this.anIntArray218[local239];
			this.anIntArrayArray17[local239] = new int[local246];
			for (local254 = 0; local254 < local246; local254++) {
				@Pc(271) int local271 = this.anIntArrayArray17[local239][local254] = local31 += local19.method1842();
				if (local271 > local241) {
					local241 = local271;
				}
			}
			this.anObjectArrayArray2[local239] = new Object[local241 + 1];
		}
		if (local37 == 0) {
			return;
		}
		this.anIntArrayArray18 = new int[local33 + 1][];
		this.aClass45Array2 = new Class45[local33 + 1];
		for (local239 = 0; local239 < this.anInt1409; local239++) {
			local246 = this.anIntArray220[local239];
			local241 = this.anIntArray218[local246];
			this.anIntArrayArray18[local246] = new int[this.anObjectArrayArray2[local246].length];
			for (local254 = 0; local254 < local241; local254++) {
				this.anIntArrayArray18[local246][this.anIntArrayArray17[local246][local254]] = local19.method1817();
			}
			this.aClass45Array2[local246] = new Class45(this.anIntArrayArray18[local246]);
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V")
	public final void method1057() {
		for (@Pc(14) int local14 = 0; local14 < this.anObjectArrayArray2.length; local14++) {
			if (this.anObjectArrayArray2[local14] != null) {
				for (@Pc(23) int local23 = 0; local23 < this.anObjectArrayArray2[local14].length; local23++) {
					this.anObjectArrayArray2[local14][local23] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)V")
	protected void method1060(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)[B")
	public final byte[] method1062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method1063(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III[I)[B")
	public final byte[] method1063(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(47) boolean local47 = this.method1073(arg2, arg0);
			if (!local47) {
				this.method1060(arg0);
				local47 = this.method1073(arg2, arg0);
				if (!local47) {
					return null;
				}
			}
		}
		@Pc(73) byte[] local73 = Static39.method688(this.anObjectArrayArray2[arg0][arg1], false);
		if (this.aBoolean78) {
			this.anObjectArrayArray2[arg0][arg1] = null;
		}
		return local73;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!rd;)V")
	public final void method1064(@OriginalArg(1) Class64 arg0) {
		@Pc(7) Class64 local7 = arg0.method1503();
		@Pc(15) int local15 = this.aClass45_2.method1100(local7.method1485());
		if (local15 >= 0) {
			this.method1052(local15);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLclient!rd;Lclient!rd;)[B")
	public final byte[] method1065(@OriginalArg(1) Class64 arg0, @OriginalArg(2) Class64 arg1) {
		@Pc(3) Class64 local3 = arg0.method1503();
		@Pc(7) Class64 local7 = arg1.method1503();
		@Pc(19) int local19 = this.aClass45_2.method1100(local3.method1485());
		@Pc(38) int local38 = this.aClass45Array2[local19].method1100(local7.method1485());
		return this.method1062(local19, local38);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!rd;B)I")
	public final int method1066(@OriginalArg(0) Class64 arg0) {
		@Pc(3) Class64 local3 = arg0.method1503();
		return this.aClass45_2.method1100(local3.method1485());
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(II)[B")
	public final byte[] method1067(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1074(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1074(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(IZ)I")
	public final int method1068(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(BI)V")
	public final void method1070(@OriginalArg(1) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2[arg0].length; local3++) {
			this.anObjectArrayArray2[arg0][local3] = null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBI)Z")
	public final boolean method1072(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || this.anObjectArrayArray2[arg1].length <= arg0) {
			return false;
		} else if (this.anObjectArrayArray2[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray2[arg1] == null) {
			this.method1060(arg1);
			return this.anObjectArray2[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([IIB)Z")
	private boolean method1073(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.anObjectArray2[arg1] == null) {
			return false;
		}
		@Pc(25) int local25 = this.anIntArray218[arg1];
		@Pc(30) int[] local30 = this.anIntArrayArray17[arg1];
		@Pc(35) Object[] local35 = this.anObjectArrayArray2[arg1];
		@Pc(37) boolean local37 = true;
		for (@Pc(39) int local39 = 0; local39 < local25; local39++) {
			if (local35[local30[local39]] == null) {
				local37 = false;
				break;
			}
		}
		if (local37) {
			return true;
		}
		@Pc(101) byte[] local101;
		if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
			local101 = Static39.method688(this.anObjectArray2[arg1], false);
		} else {
			local101 = Static39.method688(this.anObjectArray2[arg1], true);
			@Pc(116) Class1_Sub6 local116 = new Class1_Sub6(local101);
			local116.method1843(arg0, local116.aByteArray27.length);
		}
		@Pc(128) byte[] local128;
		try {
			local128 = Static27.method681(local101);
		} catch (@Pc(130) RuntimeException local130) {
			throw Static48.method1823(local130, "T3 - " + (arg0 != null) + "," + arg1 + "," + local101.length + "," + Static75.method1251(local101.length, local101) + "," + Static75.method1251(local101.length - 2, local101) + "," + this.anIntArray217[arg1] + "," + this.anInt1395);
		}
		if (this.aBoolean79) {
			this.anObjectArray2[arg1] = null;
		}
		if (local25 > 1) {
			@Pc(199) int local199 = local128.length;
			@Pc(201) int local201 = local199 - 1;
			@Pc(206) int local206 = local128[local201] & 0xFF;
			@Pc(214) int local214 = local201 - local206 * local25 * 4;
			@Pc(219) Class1_Sub6 local219 = new Class1_Sub6(local128);
			local219.anInt2574 = local214;
			@Pc(225) int[] local225 = new int[local25];
			@Pc(233) int local233;
			for (@Pc(227) int local227 = 0; local227 < local206; local227++) {
				@Pc(231) int local231 = 0;
				for (local233 = 0; local233 < local25; local233++) {
					local231 += local219.method1817();
					local225[local233] += local231;
				}
			}
			@Pc(267) byte[][] local267 = new byte[local25][];
			for (local233 = 0; local233 < local25; local233++) {
				local267[local233] = new byte[local225[local233]];
				local225[local233] = 0;
			}
			local219.anInt2574 = local214;
			@Pc(295) int local295 = 0;
			@Pc(301) int local301;
			for (@Pc(297) int local297 = 0; local297 < local206; local297++) {
				local301 = 0;
				for (@Pc(303) int local303 = 0; local303 < local25; local303++) {
					local301 += local219.method1817();
					Static124.method523(local128, local295, local267[local303], local225[local303], local301);
					local295 += local301;
					local225[local303] += local301;
				}
			}
			for (local301 = 0; local301 < local25; local301++) {
				local35[local30[local301]] = Static117.method2065(local267[local301]);
			}
		} else {
			local35[local30[0]] = Static117.method2065(local128);
		}
		return true;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)[B")
	public final byte[] method1074(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || this.anObjectArrayArray2[arg0].length <= arg1) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(49) boolean local49 = this.method1073(null, arg0);
			if (!local49) {
				this.method1060(arg0);
				local49 = this.method1073(null, arg0);
				if (!local49) {
					return null;
				}
			}
		}
		return Static39.method688(this.anObjectArrayArray2[arg0][arg1], false);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(BLclient!rd;Lclient!rd;)Z")
	public final boolean method1075(@OriginalArg(1) Class64 arg0, @OriginalArg(2) Class64 arg1) {
		@Pc(9) Class64 local9 = arg0.method1503();
		@Pc(17) Class64 local17 = arg1.method1503();
		@Pc(25) int local25 = this.aClass45_2.method1100(local9.method1485());
		@Pc(35) int local35 = this.aClass45Array2[local25].method1100(local17.method1485());
		return this.method1072(local35, local25);
	}
}
