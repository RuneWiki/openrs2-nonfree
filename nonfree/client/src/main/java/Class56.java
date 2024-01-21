import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public abstract class Class56 {

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "[I")
	protected int[] anIntArray303;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "[Lclient!bb;")
	private Class8[] aClass8Array2;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "[I")
	private int[] anIntArray304;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
	protected int anInt1634;

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!oc", name = "v", descriptor = "[I")
	private int[] anIntArray305;

	@OriginalMember(owner = "client!oc", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!oc", name = "G", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!oc", name = "I", descriptor = "Lclient!bb;")
	private Class8 aClass8_2;

	@OriginalMember(owner = "client!oc", name = "J", descriptor = "[I")
	protected int[] anIntArray306;

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
	public int anInt1645;

	@OriginalMember(owner = "client!oc", name = "S", descriptor = "[I")
	protected int[] anIntArray307;

	@OriginalMember(owner = "client!oc", name = "U", descriptor = "I")
	private int anInt1650;

	@OriginalMember(owner = "client!oc", name = "gb", descriptor = "Z")
	private final boolean aBoolean66;

	@OriginalMember(owner = "client!oc", name = "T", descriptor = "Z")
	private final boolean aBoolean65;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(ZZ)V")
	protected Class56(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean66 = arg1;
		this.aBoolean65 = arg0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!fc;ZI)I")
	public final int method1264(@OriginalArg(0) Class25 arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class25 local3 = arg0.method777();
		return this.aClass8Array2[arg1].method239(local3.method792());
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BII)Z")
	public final boolean method1265(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method1284(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([BI)V")
	protected final void method1266(@OriginalArg(0) byte[] arg0) {
		this.anInt1645 = Static7.method127(arg0.length, arg0);
		@Pc(19) Class1_Sub5 local19 = new Class1_Sub5(Static80.method1367(arg0));
		@Pc(23) int local23 = local19.method672();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		@Pc(44) int local44 = 0;
		if (local23 >= 6) {
			this.anInt1634 = local19.method663();
		} else {
			this.anInt1634 = 0;
		}
		@Pc(61) int local61 = -1;
		@Pc(65) int local65 = local19.method672();
		this.anInt1650 = local19.method651();
		this.anIntArray305 = new int[this.anInt1650];
		for (@Pc(77) int local77 = 0; local77 < this.anInt1650; local77++) {
			this.anIntArray305[local77] = local44 += local19.method651();
			if (local61 < this.anIntArray305[local77]) {
				local61 = this.anIntArray305[local77];
			}
		}
		this.anIntArray307 = new int[local61 + 1];
		this.anIntArray303 = new int[local61 + 1];
		this.anIntArray306 = new int[local61 + 1];
		this.anObjectArrayArray2 = new Object[local61 + 1][];
		this.anObjectArray2 = new Object[local61 + 1];
		this.anIntArrayArray19 = new int[local61 + 1][];
		@Pc(152) int local152;
		if (local65 != 0) {
			this.anIntArray304 = new int[local61 + 1];
			for (local152 = 0; local152 < this.anInt1650; local152++) {
				this.anIntArray304[this.anIntArray305[local152]] = local19.method663();
			}
			this.aClass8_2 = new Class8(this.anIntArray304);
		}
		for (local152 = 0; local152 < this.anInt1650; local152++) {
			this.anIntArray306[this.anIntArray305[local152]] = local19.method663();
		}
		for (@Pc(201) int local201 = 0; local201 < this.anInt1650; local201++) {
			this.anIntArray303[this.anIntArray305[local201]] = local19.method663();
		}
		for (@Pc(225) int local225 = 0; local225 < this.anInt1650; local225++) {
			this.anIntArray307[this.anIntArray305[local225]] = local19.method651();
		}
		@Pc(257) int local257;
		@Pc(262) int local262;
		@Pc(270) int local270;
		@Pc(272) int local272;
		for (@Pc(248) int local248 = 0; local248 < this.anInt1650; local248++) {
			local44 = 0;
			local257 = this.anIntArray305[local248];
			local262 = this.anIntArray307[local257];
			this.anIntArrayArray19[local257] = new int[local262];
			local270 = -1;
			for (local272 = 0; local272 < local262; local272++) {
				@Pc(289) int local289 = this.anIntArrayArray19[local257][local272] = local44 += local19.method651();
				if (local270 < local289) {
					local270 = local289;
				}
			}
			this.anObjectArrayArray2[local257] = new Object[local270 + 1];
		}
		if (local65 == 0) {
			return;
		}
		this.aClass8Array2 = new Class8[local61 + 1];
		this.anIntArrayArray18 = new int[local61 + 1][];
		for (local257 = 0; local257 < this.anInt1650; local257++) {
			local262 = this.anIntArray305[local257];
			local270 = this.anIntArray307[local262];
			this.anIntArrayArray18[local262] = new int[this.anObjectArrayArray2[local262].length];
			for (local272 = 0; local272 < local270; local272++) {
				this.anIntArrayArray18[local262][this.anIntArrayArray19[local262][local272]] = local19.method663();
			}
			this.aClass8Array2[local262] = new Class8(this.anIntArrayArray18[local262]);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)I")
	public final int method1267() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Z")
	public final boolean method1268(@OriginalArg(0) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method1284(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)[B")
	public final byte[] method1269(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method1271(null, arg0, arg1);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIZ)[B")
	public final byte[] method1270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0 || this.anObjectArrayArray2.length <= arg1 || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || arg0 >= this.anObjectArrayArray2[arg1].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(45) boolean local45 = this.method1275(arg1, null);
			if (!local45) {
				this.method1284(arg1);
				local45 = this.method1275(arg1, null);
				if (!local45) {
					return null;
				}
			}
		}
		return Static27.method605(this.anObjectArrayArray2[arg1][arg0], false);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "([IIZI)[B")
	public final byte[] method1271(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || this.anObjectArrayArray2.length <= arg1 || this.anObjectArrayArray2[arg1] == null || arg2 < 0 || arg2 >= this.anObjectArrayArray2[arg1].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg2] == null) {
			@Pc(46) boolean local46 = this.method1275(arg1, arg0);
			if (!local46) {
				this.method1284(arg1);
				local46 = this.method1275(arg1, arg0);
				if (!local46) {
					return null;
				}
			}
		}
		@Pc(72) byte[] local72 = Static27.method605(this.anObjectArrayArray2[arg1][arg2], false);
		if (this.aBoolean66) {
			this.anObjectArrayArray2[arg1][arg2] = null;
		}
		return local72;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)V")
	public final void method1272(@OriginalArg(0) int arg0) {
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArrayArray2[arg0].length; local11++) {
			this.anObjectArrayArray2[arg0][local11] = null;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!fc;Lclient!fc;I)Z")
	public final boolean method1273(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1) {
		@Pc(7) Class25 local7 = arg0.method777();
		@Pc(11) Class25 local11 = arg1.method777();
		@Pc(19) int local19 = this.aClass8_2.method239(local7.method792());
		@Pc(29) int local29 = this.aClass8Array2[local19].method239(local11.method792());
		return this.method1265(local19, local29);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)[I")
	public final int[] method1274(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray19[arg0];
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[II)Z")
	private boolean method1275(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.anObjectArray2[arg0] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray307[arg0];
		@Pc(22) Object[] local22 = this.anObjectArrayArray2[arg0];
		@Pc(27) int[] local27 = this.anIntArrayArray19[arg0];
		@Pc(29) boolean local29 = true;
		for (@Pc(40) int local40 = 0; local40 < local17; local40++) {
			if (local22[local27[local40]] == null) {
				local29 = false;
				break;
			}
		}
		if (local29) {
			return true;
		}
		@Pc(95) byte[] local95;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local95 = Static27.method605(this.anObjectArray2[arg0], false);
		} else {
			local95 = Static27.method605(this.anObjectArray2[arg0], true);
			@Pc(100) Class1_Sub5 local100 = new Class1_Sub5(local95);
			local100.method656(arg1, local100.aByteArray13.length);
		}
		@Pc(126) byte[] local126;
		try {
			local126 = Static80.method1367(local95);
		} catch (@Pc(128) RuntimeException local128) {
			throw Static35.method799(local128, "T3 - " + (arg1 != null) + "," + arg0 + "," + local95.length + "," + Static7.method127(local95.length, local95) + "," + Static7.method127(local95.length - 2, local95) + "," + this.anIntArray306[arg0] + "," + this.anInt1645);
		}
		if (this.aBoolean65) {
			this.anObjectArray2[arg0] = null;
		}
		if (local17 > 1) {
			@Pc(197) int local197 = local126.length;
			@Pc(200) int[] local200 = new int[local17];
			@Pc(202) int local202 = local197 - 1;
			@Pc(207) int local207 = local126[local202] & 0xFF;
			@Pc(212) Class1_Sub5 local212 = new Class1_Sub5(local126);
			@Pc(220) int local220 = local202 - local207 * local17 * 4;
			local212.anInt792 = local220;
			@Pc(231) int local231;
			for (@Pc(225) int local225 = 0; local225 < local207; local225++) {
				@Pc(229) int local229 = 0;
				for (local231 = 0; local231 < local17; local231++) {
					local229 += local212.method663();
					local200[local231] += local229;
				}
			}
			@Pc(265) byte[][] local265 = new byte[local17][];
			for (local231 = 0; local231 < local17; local231++) {
				local265[local231] = new byte[local200[local231]];
				local200[local231] = 0;
			}
			@Pc(290) int local290 = 0;
			local212.anInt792 = local220;
			@Pc(299) int local299;
			for (@Pc(295) int local295 = 0; local295 < local207; local295++) {
				local299 = 0;
				for (@Pc(301) int local301 = 0; local301 < local17; local301++) {
					local299 += local212.method663();
					Static132.method848(local126, local290, local265[local301], local200[local301], local299);
					local200[local301] += local299;
					local290 += local299;
				}
			}
			for (local299 = 0; local299 < local17; local299++) {
				if (this.aBoolean66) {
					local22[local27[local299]] = local265[local299];
				} else {
					local22[local27[local299]] = Static38.method870(local265[local299]);
				}
			}
		} else if (this.aBoolean66) {
			local22[local27[0]] = local126;
		} else {
			local22[local27[0]] = Static38.method870(local126);
		}
		return true;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)Z")
	public final boolean method1277() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray305.length; local9++) {
			@Pc(16) int local16 = this.anIntArray305[local9];
			if (this.anObjectArray2[local16] == null) {
				this.method1284(local16);
				if (this.anObjectArray2[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!fc;B)I")
	public final int method1278(@OriginalArg(0) Class25 arg0) {
		@Pc(7) Class25 local7 = arg0.method777();
		return this.aClass8_2.method239(local7.method792());
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(BI)I")
	public final int method1279(@OriginalArg(1) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)[B")
	public final byte[] method1280(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1269(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1269(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V")
	public final void method1281() {
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray2.length; local7++) {
			if (this.anObjectArrayArray2[local7] != null) {
				for (@Pc(23) int local23 = 0; local23 < this.anObjectArrayArray2[local7].length; local23++) {
					this.anObjectArrayArray2[local7][local23] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLclient!fc;)V")
	public final void method1282(@OriginalArg(1) Class25 arg0) {
		@Pc(8) Class25 local8 = arg0.method777();
		@Pc(20) int local20 = this.aClass8_2.method239(local8.method792());
		if (local20 >= 0) {
			this.method1287(local20);
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(BI)V")
	protected void method1284(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)[B")
	public final byte[] method1285(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1270(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1270(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(II)V")
	protected void method1287(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!fc;Lclient!fc;B)[B")
	public final byte[] method1288(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1) {
		@Pc(3) Class25 local3 = arg0.method777();
		@Pc(17) Class25 local17 = arg1.method777();
		@Pc(27) int local27 = this.aClass8_2.method239(local3.method792());
		@Pc(39) int local39 = this.aClass8Array2[local27].method239(local17.method792());
		return this.method1269(local27, local39);
	}
}
