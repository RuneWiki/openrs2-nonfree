import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public abstract class Class76 {

	@OriginalMember(owner = "client!u", name = "d", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!u", name = "h", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray29;

	@OriginalMember(owner = "client!u", name = "k", descriptor = "[I")
	private int[] anIntArray412;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "I")
	private int anInt4317;

	@OriginalMember(owner = "client!u", name = "n", descriptor = "Lclient!ia;")
	private Class37 aClass37_2;

	@OriginalMember(owner = "client!u", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!u", name = "t", descriptor = "[Lclient!ia;")
	private Class37[] aClass37Array2;

	@OriginalMember(owner = "client!u", name = "v", descriptor = "[I")
	protected int[] anIntArray413;

	@OriginalMember(owner = "client!u", name = "w", descriptor = "[I")
	protected int[] anIntArray414;

	@OriginalMember(owner = "client!u", name = "F", descriptor = "[I")
	private int[] anIntArray415;

	@OriginalMember(owner = "client!u", name = "M", descriptor = "I")
	public int anInt4334;

	@OriginalMember(owner = "client!u", name = "N", descriptor = "[I")
	protected int[] anIntArray416;

	@OriginalMember(owner = "client!u", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!u", name = "B", descriptor = "Z")
	private final boolean aBoolean165;

	@OriginalMember(owner = "client!u", name = "r", descriptor = "Z")
	private final boolean aBoolean164;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(ZZ)V")
	protected Class76(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean165 = arg0;
		this.aBoolean164 = arg1;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)I")
	public final int method3306(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!rf;Lclient!rf;B)Z")
	public final boolean method3307(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class70 arg1) {
		@Pc(3) Class70 local3 = arg1.method2927();
		@Pc(18) Class70 local18 = arg0.method2927();
		@Pc(26) int local26 = this.aClass37_2.method1657(local3.method2923());
		@Pc(36) int local36 = this.aClass37Array2[local26].method1657(local18.method2923());
		return this.method3329(local26, local36);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I[B)V")
	protected final void method3308(@OriginalArg(1) byte[] arg0) {
		this.anInt4334 = Static90.method1970(arg0, arg0.length);
		@Pc(19) Class1_Sub9 local19 = new Class1_Sub9(Static132.method2566(arg0));
		@Pc(23) int local23 = local19.method1234();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		@Pc(46) int local46 = 0;
		@Pc(48) int local48 = -1;
		if (local23 >= 6) {
			local19.method1273();
		}
		@Pc(61) int local61 = local19.method1234();
		this.anInt4317 = local19.method1280();
		this.anIntArray415 = new int[this.anInt4317];
		for (@Pc(81) int local81 = 0; local81 < this.anInt4317; local81++) {
			this.anIntArray415[local81] = local46 += local19.method1280();
			if (local48 < this.anIntArray415[local81]) {
				local48 = this.anIntArray415[local81];
			}
		}
		this.anIntArrayArray36 = new int[local48 + 1][];
		this.anIntArray413 = new int[local48 + 1];
		this.anIntArray414 = new int[local48 + 1];
		this.anObjectArray29 = new Object[local48 + 1];
		this.anIntArray416 = new int[local48 + 1];
		this.anObjectArrayArray2 = new Object[local48 + 1][];
		@Pc(167) int local167;
		@Pc(182) int local182;
		if (local61 != 0) {
			this.anIntArray412 = new int[local48 + 1];
			for (local167 = 0; local167 < local48 + 1; local167++) {
				this.anIntArray412[local167] = -1;
			}
			for (local182 = 0; local182 < this.anInt4317; local182++) {
				this.anIntArray412[this.anIntArray415[local182]] = local19.method1273();
			}
			this.aClass37_2 = new Class37(this.anIntArray412);
		}
		for (local167 = 0; local167 < this.anInt4317; local167++) {
			this.anIntArray414[this.anIntArray415[local167]] = local19.method1273();
		}
		for (local182 = 0; local182 < this.anInt4317; local182++) {
			this.anIntArray413[this.anIntArray415[local182]] = local19.method1273();
		}
		for (@Pc(256) int local256 = 0; local256 < this.anInt4317; local256++) {
			this.anIntArray416[this.anIntArray415[local256]] = local19.method1280();
		}
		@Pc(282) int local282;
		@Pc(287) int local287;
		@Pc(289) int local289;
		@Pc(299) int local299;
		@Pc(316) int local316;
		for (@Pc(275) int local275 = 0; local275 < this.anInt4317; local275++) {
			local282 = this.anIntArray415[local275];
			local287 = this.anIntArray416[local282];
			local289 = -1;
			local46 = 0;
			this.anIntArrayArray36[local282] = new int[local287];
			for (local299 = 0; local299 < local287; local299++) {
				local316 = this.anIntArrayArray36[local282][local299] = local46 += local19.method1280();
				if (local289 < local316) {
					local289 = local316;
				}
			}
			if (local287 == local289 + 1) {
				this.anIntArrayArray36[local282] = null;
			}
			this.anObjectArrayArray2[local282] = new Object[local289 + 1];
		}
		if (local61 == 0) {
			return;
		}
		this.aClass37Array2 = new Class37[local48 + 1];
		this.anIntArrayArray37 = new int[local48 + 1][];
		for (local282 = 0; local282 < this.anInt4317; local282++) {
			local287 = this.anIntArray415[local282];
			local289 = this.anIntArray416[local287];
			this.anIntArrayArray37[local287] = new int[this.anObjectArrayArray2[local287].length];
			for (local299 = 0; local299 < this.anObjectArrayArray2[local287].length; local299++) {
				this.anIntArrayArray37[local287][local299] = -1;
			}
			for (local316 = 0; local316 < local289; local316++) {
				@Pc(429) int local429;
				if (this.anIntArrayArray36[local287] == null) {
					local429 = local316;
				} else {
					local429 = this.anIntArrayArray36[local287][local316];
				}
				this.anIntArrayArray37[local287][local429] = local19.method1273();
			}
			this.aClass37Array2[local287] = new Class37(this.anIntArrayArray37[local287]);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!rf;)I")
	public final int method3309(@OriginalArg(1) Class70 arg0) {
		@Pc(7) Class70 local7 = arg0.method2927();
		return this.aClass37_2.method1657(local7.method2923());
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[I")
	public final int[] method3311(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = this.anIntArrayArray36[arg0];
		if (local18 == null) {
			local18 = new int[this.anIntArray416[arg0]];
			@Pc(28) int local28 = 0;
			while (local18.length > local28) {
				local18[local28] = local28++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!rf;II)I")
	public final int method3312(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class70 local12 = arg0.method2927();
		return this.aClass37Array2[arg1].method1657(local12.method2923());
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)V")
	public final void method3313(@OriginalArg(0) int arg0) {
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArrayArray2[arg0].length; local11++) {
			this.anObjectArrayArray2[arg0][local11] = null;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IBI)[B")
	public final byte[] method3316(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method3322(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Z")
	public final boolean method3317() {
		@Pc(16) boolean local16 = true;
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray415.length; local18++) {
			@Pc(25) int local25 = this.anIntArray415[local18];
			if (this.anObjectArray29[local25] == null) {
				this.method3331(local25);
				if (this.anObjectArray29[local25] == null) {
					local16 = false;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)Z")
	public final boolean method3318(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method3329(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method3329(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(II)Z")
	public final boolean method3319(@OriginalArg(0) int arg0) {
		if (this.anObjectArray29[arg0] == null) {
			this.method3331(arg0);
			return this.anObjectArray29[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!rf;I)V")
	public final void method3320(@OriginalArg(0) Class70 arg0) {
		@Pc(7) Class70 local7 = arg0.method2927();
		@Pc(23) int local23 = this.aClass37_2.method1657(local7.method2923());
		if (local23 >= 0) {
			this.method3325(local23);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!rf;BLclient!rf;)[B")
	public final byte[] method3321(@OriginalArg(0) Class70 arg0, @OriginalArg(2) Class70 arg1) {
		@Pc(7) Class70 local7 = arg1.method2927();
		@Pc(11) Class70 local11 = arg0.method2927();
		@Pc(19) int local19 = this.aClass37_2.method1657(local7.method2923());
		@Pc(29) int local29 = this.aClass37Array2[local19].method1657(local11.method2923());
		return this.method3316(local29, local19);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IB[II)[B")
	public final byte[] method3322(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg2 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg2] == null || arg0 < 0 || this.anObjectArrayArray2[arg2].length <= arg0) {
			return null;
		}
		if (this.anObjectArrayArray2[arg2][arg0] == null) {
			@Pc(47) boolean local47 = this.method3323(arg2, arg1);
			if (!local47) {
				this.method3331(arg2);
				local47 = this.method3323(arg2, arg1);
				if (!local47) {
					return null;
				}
			}
		}
		@Pc(73) byte[] local73 = Static52.method1330(this.anObjectArrayArray2[arg2][arg0], false);
		if (this.aBoolean164) {
			this.anObjectArrayArray2[arg2][arg0] = null;
		}
		return local73;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I[II)Z")
	private boolean method3323(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.anObjectArray29[arg0] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray416[arg0];
		@Pc(22) int[] local22 = this.anIntArrayArray36[arg0];
		@Pc(30) boolean local30 = true;
		@Pc(35) Object[] local35 = this.anObjectArrayArray2[arg0];
		for (@Pc(37) int local37 = 0; local37 < local17; local37++) {
			@Pc(43) int local43;
			if (local22 == null) {
				local43 = local37;
			} else {
				local43 = local22[local37];
			}
			if (local35[local43] == null) {
				local30 = false;
				break;
			}
		}
		if (local30) {
			return true;
		}
		@Pc(91) byte[] local91;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local91 = Static52.method1330(this.anObjectArray29[arg0], false);
		} else {
			local91 = Static52.method1330(this.anObjectArray29[arg0], true);
			@Pc(106) Class1_Sub9 local106 = new Class1_Sub9(local91);
			local106.method1265(local106.aByteArray25.length, arg1);
		}
		@Pc(118) byte[] local118;
		try {
			local118 = Static132.method2566(local91);
		} catch (@Pc(120) RuntimeException local120) {
			throw Static34.method872(local120, "T3 - " + (arg1 != null) + "," + arg0 + "," + local91.length + "," + Static90.method1970(local91, local91.length) + "," + Static90.method1970(local91, local91.length - 2) + "," + this.anIntArray414[arg0] + "," + this.anInt4334);
		}
		if (this.aBoolean165) {
			this.anObjectArray29[arg0] = null;
		}
		@Pc(190) int local190;
		if (local17 <= 1) {
			if (local22 == null) {
				local190 = 0;
			} else {
				local190 = local22[0];
			}
			if (this.aBoolean164) {
				local35[local190] = local118;
			} else {
				local35[local190] = Static21.method469(local118);
			}
		} else {
			local190 = local118.length;
			local190--;
			@Pc(224) int local224 = local118[local190] & 0xFF;
			local190 -= local224 * local17 * 4;
			@Pc(237) Class1_Sub9 local237 = new Class1_Sub9(local118);
			local237.anInt1592 = local190;
			@Pc(243) int[] local243 = new int[local17];
			@Pc(251) int local251;
			for (@Pc(245) int local245 = 0; local245 < local224; local245++) {
				@Pc(249) int local249 = 0;
				for (local251 = 0; local251 < local17; local251++) {
					local249 += local237.method1273();
					local243[local251] += local249;
				}
			}
			@Pc(281) byte[][] local281 = new byte[local17][];
			for (local251 = 0; local251 < local17; local251++) {
				local281[local251] = new byte[local243[local251]];
				local243[local251] = 0;
			}
			local237.anInt1592 = local190;
			@Pc(305) int local305 = 0;
			@Pc(311) int local311;
			@Pc(313) int local313;
			for (@Pc(307) int local307 = 0; local307 < local224; local307++) {
				local311 = 0;
				for (local313 = 0; local313 < local17; local313++) {
					local311 += local237.method1273();
					Static188.method2304(local118, local305, local281[local313], local243[local313], local311);
					local243[local313] += local311;
					local305 += local311;
				}
			}
			for (local311 = 0; local311 < local17; local311++) {
				if (local22 == null) {
					local313 = local311;
				} else {
					local313 = local22[local311];
				}
				if (this.aBoolean164) {
					local35[local313] = local281[local311];
				} else {
					local35[local313] = Static21.method469(local281[local311]);
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(III)[B")
	public final byte[] method3324(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || this.anObjectArrayArray2[arg1].length <= arg0) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(49) boolean local49 = this.method3323(arg1, null);
			if (!local49) {
				this.method3331(arg1);
				local49 = this.method3323(arg1, null);
				if (!local49) {
					return null;
				}
			}
		}
		return Static52.method1330(this.anObjectArrayArray2[arg1][arg0], false);
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(II)V")
	protected void method3325(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)I")
	public final int method3326() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(II)[B")
	public final byte[] method3327(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method3316(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method3316(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(III)Z")
	public final boolean method3329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || this.anObjectArrayArray2[arg0].length <= arg1) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray29[arg0] == null) {
			this.method3331(arg0);
			return this.anObjectArray29[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
	public final void method3330() {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2.length; local3++) {
			if (this.anObjectArrayArray2[local3] != null) {
				for (@Pc(12) int local12 = 0; local12 < this.anObjectArrayArray2[local3].length; local12++) {
					this.anObjectArrayArray2[local3][local12] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "f", descriptor = "(II)V")
	protected void method3331(@OriginalArg(1) int arg0) {
	}
}
