import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public abstract class Class43 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
	private int anInt3122;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "[I")
	private int[] anIntArray459;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "Lclient!ag;")
	private Class5 aClass5_2;

	@OriginalMember(owner = "client!ke", name = "y", descriptor = "[I")
	protected int[] anIntArray460;

	@OriginalMember(owner = "client!ke", name = "z", descriptor = "[Lclient!ag;")
	private Class5[] aClass5Array2;

	@OriginalMember(owner = "client!ke", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!ke", name = "J", descriptor = "I")
	public int anInt3143;

	@OriginalMember(owner = "client!ke", name = "L", descriptor = "[I")
	private int[] anIntArray461;

	@OriginalMember(owner = "client!ke", name = "N", descriptor = "[I")
	protected int[] anIntArray462;

	@OriginalMember(owner = "client!ke", name = "Q", descriptor = "[I")
	protected int[] anIntArray463;

	@OriginalMember(owner = "client!ke", name = "O", descriptor = "Z")
	private final boolean aBoolean124;

	@OriginalMember(owner = "client!ke", name = "G", descriptor = "Z")
	private final boolean aBoolean123;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(ZZ)V")
	protected Class43(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean124 = arg0;
		this.aBoolean123 = arg1;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!sg;I)V")
	public final void method2203(@OriginalArg(0) Class77 arg0) {
		@Pc(3) Class77 local3 = arg0.method2529();
		@Pc(19) int local19 = this.aClass5_2.method127(local3.method2528());
		if (local19 >= 0) {
			this.method2204(local19);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)V")
	protected void method2204(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)[B")
	public final byte[] method2205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method2219(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!sg;)I")
	public final int method2206(@OriginalArg(1) Class77 arg0) {
		@Pc(12) Class77 local12 = arg0.method2529();
		return this.aClass5_2.method127(local12.method2528());
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)I")
	public final int method2207() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B[B)V")
	protected final void method2208(@OriginalArg(1) byte[] arg0) {
		this.anInt3143 = Static54.method1031(arg0, arg0.length);
		@Pc(19) Class2_Sub18 local19 = new Class2_Sub18(Static130.method2233(arg0));
		@Pc(23) int local23 = local19.method2387();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 >= 6) {
			local19.method2382();
		}
		@Pc(55) int local55 = -1;
		@Pc(57) int local57 = 0;
		@Pc(61) int local61 = local19.method2387();
		this.anInt3122 = local19.method2353();
		this.anIntArray461 = new int[this.anInt3122];
		for (@Pc(73) int local73 = 0; local73 < this.anInt3122; local73++) {
			this.anIntArray461[local73] = local57 += local19.method2353();
			if (this.anIntArray461[local73] > local55) {
				local55 = this.anIntArray461[local73];
			}
		}
		this.anIntArray462 = new int[local55 + 1];
		this.anIntArrayArray24 = new int[local55 + 1][];
		this.anObjectArray2 = new Object[local55 + 1];
		this.anIntArray460 = new int[local55 + 1];
		this.anObjectArrayArray2 = new Object[local55 + 1][];
		this.anIntArray463 = new int[local55 + 1];
		@Pc(156) int local156;
		@Pc(171) int local171;
		if (local61 != 0) {
			this.anIntArray459 = new int[local55 + 1];
			for (local156 = 0; local156 < local55 + 1; local156++) {
				this.anIntArray459[local156] = -1;
			}
			for (local171 = 0; local171 < this.anInt3122; local171++) {
				this.anIntArray459[this.anIntArray461[local171]] = local19.method2382();
			}
			this.aClass5_2 = new Class5(this.anIntArray459);
		}
		for (local156 = 0; local156 < this.anInt3122; local156++) {
			this.anIntArray462[this.anIntArray461[local156]] = local19.method2382();
		}
		for (local171 = 0; local171 < this.anInt3122; local171++) {
			this.anIntArray463[this.anIntArray461[local171]] = local19.method2382();
		}
		for (@Pc(244) int local244 = 0; local244 < this.anInt3122; local244++) {
			this.anIntArray460[this.anIntArray461[local244]] = local19.method2353();
		}
		@Pc(276) int local276;
		@Pc(283) int local283;
		@Pc(278) int local278;
		@Pc(291) int local291;
		@Pc(308) int local308;
		for (@Pc(267) int local267 = 0; local267 < this.anInt3122; local267++) {
			local57 = 0;
			local276 = this.anIntArray461[local267];
			local278 = -1;
			local283 = this.anIntArray460[local276];
			this.anIntArrayArray24[local276] = new int[local283];
			for (local291 = 0; local291 < local283; local291++) {
				local308 = this.anIntArrayArray24[local276][local291] = local57 += local19.method2353();
				if (local308 > local278) {
					local278 = local308;
				}
			}
			this.anObjectArrayArray2[local276] = new Object[local278 + 1];
		}
		if (local61 == 0) {
			return;
		}
		this.anIntArrayArray25 = new int[local55 + 1][];
		this.aClass5Array2 = new Class5[local55 + 1];
		for (local276 = 0; local276 < this.anInt3122; local276++) {
			local283 = this.anIntArray461[local276];
			local278 = this.anIntArray460[local283];
			this.anIntArrayArray25[local283] = new int[this.anObjectArrayArray2[local283].length];
			for (local291 = 0; local291 < this.anObjectArrayArray2[local283].length; local291++) {
				this.anIntArrayArray25[local283][local291] = -1;
			}
			for (local308 = 0; local308 < local278; local308++) {
				this.anIntArrayArray25[local283][this.anIntArrayArray24[local283][local308]] = local19.method2382();
			}
			this.aClass5Array2[local283] = new Class5(this.anIntArrayArray25[local283]);
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Z")
	public final boolean method2209(@OriginalArg(0) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method2228(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)[B")
	public final byte[] method2211(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method2205(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method2205(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!sg;ILclient!sg;)[B")
	public final byte[] method2212(@OriginalArg(0) Class77 arg0, @OriginalArg(2) Class77 arg1) {
		@Pc(8) Class77 local8 = arg1.method2529();
		@Pc(16) Class77 local16 = arg0.method2529();
		@Pc(24) int local24 = this.aClass5_2.method127(local8.method2528());
		@Pc(34) int local34 = this.aClass5Array2[local24].method127(local16.method2528());
		return this.method2205(local34, local24);
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)Z")
	public final boolean method2213(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method2220(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method2220(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!sg;Lclient!sg;)Z")
	public final boolean method2214(@OriginalArg(1) Class77 arg0, @OriginalArg(2) Class77 arg1) {
		@Pc(15) Class77 local15 = arg0.method2529();
		@Pc(19) Class77 local19 = arg1.method2529();
		@Pc(27) int local27 = this.aClass5_2.method127(local15.method2528());
		@Pc(37) int local37 = this.aClass5Array2[local27].method127(local19.method2528());
		return this.method2220(local37, local27);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!sg;I)I")
	public final int method2215(@OriginalArg(0) int arg0, @OriginalArg(1) Class77 arg1) {
		@Pc(3) Class77 local3 = arg1.method2529();
		return this.aClass5Array2[arg0].method127(local3.method2528());
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(II)[I")
	public final int[] method2217(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray24[arg0];
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)V")
	public final void method2218(@OriginalArg(1) int arg0) {
		for (@Pc(5) int local5 = 0; local5 < this.anObjectArrayArray2[arg0].length; local5++) {
			this.anObjectArrayArray2[arg0][local5] = null;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[III)[B")
	public final byte[] method2219(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg2 < 0 || arg2 >= this.anObjectArrayArray2[arg0].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg2] == null) {
			@Pc(47) boolean local47 = this.method2225(arg0, arg1);
			if (!local47) {
				this.method2228(arg0);
				local47 = this.method2225(arg0, arg1);
				if (!local47) {
					return null;
				}
			}
		}
		@Pc(73) byte[] local73 = Static178.method2973(false, this.anObjectArrayArray2[arg0][arg2]);
		if (this.aBoolean123) {
			this.anObjectArrayArray2[arg0][arg2] = null;
		}
		return local73;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)Z")
	public final boolean method2220(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || this.anObjectArrayArray2[arg1].length <= arg0) {
			return false;
		} else if (this.anObjectArrayArray2[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray2[arg1] == null) {
			this.method2228(arg1);
			return this.anObjectArray2[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)Z")
	public final boolean method2221() {
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray461.length; local14++) {
			@Pc(21) int local21 = this.anIntArray461[local14];
			if (this.anObjectArray2[local21] == null) {
				this.method2228(local21);
				if (this.anObjectArray2[local21] == null) {
					local12 = false;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(III)[B")
	public final byte[] method2222(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || arg0 >= this.anObjectArrayArray2[arg1].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(51) boolean local51 = this.method2225(arg1, null);
			if (!local51) {
				this.method2228(arg1);
				local51 = this.method2225(arg1, null);
				if (!local51) {
					return null;
				}
			}
		}
		return Static178.method2973(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(BI)I")
	public final int method2223(@OriginalArg(1) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	public final void method2224() {
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArrayArray2.length; local11++) {
			if (this.anObjectArrayArray2[local11] != null) {
				for (@Pc(20) int local20 = 0; local20 < this.anObjectArrayArray2[local11].length; local20++) {
					this.anObjectArrayArray2[local11][local20] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[II)Z")
	private boolean method2225(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.anObjectArray2[arg0] == null) {
			return false;
		}
		@Pc(15) int local15 = this.anIntArray460[arg0];
		@Pc(20) int[] local20 = this.anIntArrayArray24[arg0];
		@Pc(22) boolean local22 = true;
		@Pc(27) Object[] local27 = this.anObjectArrayArray2[arg0];
		for (@Pc(29) int local29 = 0; local29 < local15; local29++) {
			if (local27[local20[local29]] == null) {
				local22 = false;
				break;
			}
		}
		if (local22) {
			return true;
		}
		@Pc(76) byte[] local76;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local76 = Static178.method2973(false, this.anObjectArray2[arg0]);
		} else {
			local76 = Static178.method2973(true, this.anObjectArray2[arg0]);
			@Pc(81) Class2_Sub18 local81 = new Class2_Sub18(local76);
			local81.method2351(arg1, local81.aByteArray39.length);
		}
		@Pc(102) byte[] local102;
		try {
			local102 = Static130.method2233(local76);
		} catch (@Pc(104) RuntimeException local104) {
			throw Static141.method2404(local104, "T3 - " + (arg1 != null) + "," + arg0 + "," + local76.length + "," + Static54.method1031(local76, local76.length) + "," + Static54.method1031(local76, local76.length - 2) + "," + this.anIntArray462[arg0] + "," + this.anInt3143);
		}
		if (this.aBoolean124) {
			this.anObjectArray2[arg0] = null;
		}
		if (local15 > 1) {
			@Pc(171) int local171 = local102.length;
			@Pc(173) int local173 = local171 - 1;
			@Pc(178) int local178 = local102[local173] & 0xFF;
			@Pc(183) Class2_Sub18 local183 = new Class2_Sub18(local102);
			@Pc(191) int local191 = local173 - local15 * local178 * 4;
			@Pc(194) int[] local194 = new int[local15];
			local183.anInt3423 = local191;
			@Pc(204) int local204;
			for (@Pc(199) int local199 = 0; local199 < local178; local199++) {
				@Pc(202) int local202 = 0;
				for (local204 = 0; local204 < local15; local204++) {
					local202 += local183.method2382();
					local194[local204] += local202;
				}
			}
			@Pc(235) byte[][] local235 = new byte[local15][];
			for (local204 = 0; local204 < local15; local204++) {
				local235[local204] = new byte[local194[local204]];
				local194[local204] = 0;
			}
			@Pc(255) int local255 = 0;
			local183.anInt3423 = local191;
			@Pc(263) int local263;
			for (@Pc(260) int local260 = 0; local260 < local178; local260++) {
				local263 = 0;
				for (@Pc(265) int local265 = 0; local265 < local15; local265++) {
					local263 += local183.method2382();
					Static186.method1561(local102, local255, local235[local265], local194[local265], local263);
					local255 += local263;
					local194[local265] += local263;
				}
			}
			for (local263 = 0; local263 < local15; local263++) {
				if (this.aBoolean123) {
					local27[local20[local263]] = local235[local263];
				} else {
					local27[local20[local263]] = Static97.method1759(local235[local263]);
				}
			}
		} else if (this.aBoolean123) {
			local27[local20[0]] = local102;
		} else {
			local27[local20[0]] = Static97.method1759(local102);
		}
		return true;
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(II)V")
	protected void method2228(@OriginalArg(0) int arg0) {
	}
}
