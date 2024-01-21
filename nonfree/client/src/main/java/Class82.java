import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public abstract class Class82 {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "[I")
	private int[] anIntArray408;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "[Lclient!ee;")
	private Class19[] aClass19Array2;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "[I")
	protected int[] anIntArray409;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "[I")
	protected int[] anIntArray410;

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray29;

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "[I")
	private int[] anIntArray412;

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
	private int anInt3869;

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "[I")
	protected int[] anIntArray413;

	@OriginalMember(owner = "client!vb", name = "R", descriptor = "[I")
	private int[] anIntArray414;

	@OriginalMember(owner = "client!vb", name = "S", descriptor = "I")
	public int anInt3880;

	@OriginalMember(owner = "client!vb", name = "T", descriptor = "Lclient!ee;")
	private Class19 aClass19_2;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Z")
	private final boolean aBoolean159;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Z")
	private final boolean aBoolean160;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(ZZ)V")
	protected Class82(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean159 = arg0;
		this.aBoolean160 = arg1;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
	protected void method2941(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BII)[B")
	public final byte[] method2942(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method2946(null, arg0, arg1);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BZZ)V")
	public final void method2943(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.aClass19_2 = null;
			this.anIntArray408 = null;
		}
		this.aClass19Array2 = null;
		this.anIntArrayArray38 = null;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)Z")
	public final boolean method2944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method2959(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray2[arg1] != null && this.anObjectArrayArray2[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray29[arg1] == null) {
			this.method2941(arg1);
			return this.anObjectArray29[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)[I")
	public final int[] method2945(@OriginalArg(0) int arg0) {
		if (!this.method2962(arg0)) {
			return null;
		}
		@Pc(22) int[] local22 = this.anIntArrayArray37[arg0];
		if (local22 == null) {
			local22 = new int[this.anIntArray409[arg0]];
			@Pc(32) int local32 = 0;
			while (local22.length > local32) {
				local22[local32] = local32++;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[III)[B")
	public final byte[] method2946(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method2959(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg2] == null || this.anObjectArrayArray2[arg2][arg1] == null) {
			@Pc(37) boolean local37 = this.method2961(arg0, arg2);
			if (!local37) {
				this.method2941(arg2);
				local37 = this.method2961(arg0, arg2);
				if (!local37) {
					return null;
				}
			}
		}
		@Pc(63) byte[] local63 = Static90.method1513(this.anObjectArrayArray2[arg2][arg1], false);
		if (this.aBoolean160) {
			this.anObjectArrayArray2[arg2][arg1] = null;
			if (this.anIntArray414[arg2] == 1) {
				this.anObjectArrayArray2[arg2] = null;
			}
		}
		return local63;
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)Z")
	public final boolean method2947(@OriginalArg(1) int arg0) {
		if (!this.method2962(arg0)) {
			return false;
		} else if (this.anObjectArray29[arg0] == null) {
			this.method2941(arg0);
			return this.anObjectArray29[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!tg;Z)V")
	public final void method2948(@OriginalArg(0) Class81 arg0) {
		@Pc(16) Class81 local16 = arg0.method2802();
		@Pc(24) int local24 = this.aClass19_2.method809(local16.method2792());
		this.method2953(local24);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!tg;ILclient!tg;)Z")
	public final boolean method2949(@OriginalArg(0) Class81 arg0, @OriginalArg(2) Class81 arg1) {
		@Pc(12) Class81 local12 = arg0.method2802();
		@Pc(16) Class81 local16 = arg1.method2802();
		@Pc(24) int local24 = this.aClass19_2.method809(local12.method2792());
		if (this.method2962(local24)) {
			@Pc(41) int local41 = this.aClass19Array2[local24].method809(local16.method2792());
			return this.method2944(local41, local24);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILclient!tg;Lclient!tg;)[B")
	public final byte[] method2951(@OriginalArg(1) Class81 arg0, @OriginalArg(2) Class81 arg1) {
		@Pc(3) Class81 local3 = arg1.method2802();
		@Pc(7) Class81 local7 = arg0.method2802();
		@Pc(19) int local19 = this.aClass19_2.method809(local3.method2792());
		if (this.method2962(local19)) {
			@Pc(40) int local40 = this.aClass19Array2[local19].method809(local7.method2792());
			return this.method2942(local40, local19);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(II)[B")
	public final byte[] method2952(@OriginalArg(0) int arg0) {
		if (this.anIntArray414.length == 1) {
			return this.method2942(arg0, 0);
		} else if (!this.method2962(arg0)) {
			return null;
		} else if (this.anIntArray414[arg0] == 1) {
			return this.method2942(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)V")
	protected void method2953(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(II)V")
	public final void method2954(@OriginalArg(1) int arg0) {
		if (this.method2962(arg0)) {
			this.anObjectArrayArray2[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!tg;B)I")
	public final int method2955(@OriginalArg(0) Class81 arg0) {
		@Pc(7) Class81 local7 = arg0.method2802();
		@Pc(23) int local23 = this.aClass19_2.method809(local7.method2792());
		return this.method2962(local23) ? local23 : -1;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	public final void method2956() {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2.length; local3++) {
			this.anObjectArrayArray2[local3] = null;
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)I")
	public final int method2958() {
		return this.anIntArray414.length;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)Z")
	private boolean method2959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && arg1 < this.anIntArray414.length && this.anIntArray414[arg1] > arg0) {
			return true;
		} else if (Static108.aBoolean102) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)Z")
	public final boolean method2960() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray412.length; local9++) {
			@Pc(16) int local16 = this.anIntArray412[local9];
			if (this.anObjectArray29[local16] == null) {
				this.method2941(local16);
				if (this.anObjectArray29[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([III)Z")
	private boolean method2961(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (!this.method2962(arg1)) {
			return false;
		} else if (this.anObjectArray29[arg1] == null) {
			return false;
		} else {
			@Pc(24) int[] local24 = this.anIntArrayArray37[arg1];
			@Pc(29) int local29 = this.anIntArray409[arg1];
			if (this.anObjectArrayArray2[arg1] == null) {
				this.anObjectArrayArray2[arg1] = new Object[this.anIntArray414[arg1]];
			}
			@Pc(48) Object[] local48 = this.anObjectArrayArray2[arg1];
			@Pc(50) boolean local50 = true;
			for (@Pc(52) int local52 = 0; local52 < local29; local52++) {
				@Pc(60) int local60;
				if (local24 == null) {
					local60 = local52;
				} else {
					local60 = local24[local52];
				}
				if (local48[local60] == null) {
					local50 = false;
					break;
				}
			}
			if (local50) {
				return true;
			}
			@Pc(124) byte[] local124;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local124 = Static90.method1513(this.anObjectArray29[arg1], false);
			} else {
				local124 = Static90.method1513(this.anObjectArray29[arg1], true);
				@Pc(139) Class1_Sub8 local139 = new Class1_Sub8(local124);
				local139.method356(arg0, local139.aByteArray3.length);
			}
			@Pc(151) byte[] local151;
			try {
				local151 = Static73.method1278(local124);
			} catch (@Pc(153) RuntimeException local153) {
				throw Static2.method24(local153, "T3 - " + (arg0 != null) + "," + arg1 + "," + local124.length + "," + Static58.method1035(local124.length, local124) + "," + Static58.method1035(local124.length - 2, local124) + "," + this.anIntArray410[arg1] + "," + this.anInt3880);
			}
			if (this.aBoolean159) {
				this.anObjectArray29[arg1] = null;
			}
			@Pc(225) int local225;
			if (local29 <= 1) {
				if (local24 == null) {
					local225 = 0;
				} else {
					local225 = local24[0];
				}
				if (this.aBoolean160) {
					local48[local225] = local151;
				} else {
					local48[local225] = Static125.method2158(local151);
				}
			} else {
				local225 = local151.length;
				@Pc(253) int[] local253 = new int[local29];
				local225--;
				@Pc(260) int local260 = local151[local225] & 0xFF;
				@Pc(265) Class1_Sub8 local265 = new Class1_Sub8(local151);
				local225 -= local260 * local29 * 4;
				local265.anInt446 = local225;
				@Pc(284) int local284;
				for (@Pc(278) int local278 = 0; local278 < local260; local278++) {
					@Pc(282) int local282 = 0;
					for (local284 = 0; local284 < local29; local284++) {
						local282 += local265.method347();
						local253[local284] += local282;
					}
				}
				@Pc(318) byte[][] local318 = new byte[local29][];
				for (local284 = 0; local284 < local29; local284++) {
					local318[local284] = new byte[local253[local284]];
					local253[local284] = 0;
				}
				local265.anInt446 = local225;
				@Pc(346) int local346 = 0;
				@Pc(352) int local352;
				@Pc(354) int local354;
				for (@Pc(348) int local348 = 0; local348 < local260; local348++) {
					local352 = 0;
					for (local354 = 0; local354 < local29; local354++) {
						local352 += local265.method347();
						Static190.method1388(local151, local346, local318[local354], local253[local354], local352);
						local346 += local352;
						local253[local354] += local352;
					}
				}
				for (local352 = 0; local352 < local29; local352++) {
					if (local24 == null) {
						local354 = local352;
					} else {
						local354 = local24[local352];
					}
					if (this.aBoolean160) {
						local48[local354] = local318[local352];
					} else {
						local48[local354] = Static125.method2158(local318[local352]);
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)Z")
	protected final boolean method2962(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && this.anIntArray414.length > arg0 && this.anIntArray414[arg0] != 0) {
			return true;
		} else if (Static108.aBoolean102) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(III)[B")
	public final byte[] method2963(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2959(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0] == null || this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(31) boolean local31 = this.method2961(null, arg0);
			if (!local31) {
				this.method2941(arg0);
				local31 = this.method2961(null, arg0);
				if (!local31) {
					return null;
				}
			}
		}
		return Static90.method1513(this.anObjectArrayArray2[arg0][arg1], false);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I[B)V")
	protected final void method2964(@OriginalArg(1) byte[] arg0) {
		this.anInt3880 = Static58.method1035(arg0.length, arg0);
		@Pc(19) Class1_Sub8 local19 = new Class1_Sub8(Static73.method1278(arg0));
		@Pc(23) int local23 = local19.method336();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		@Pc(44) int local44 = 0;
		if (local23 >= 6) {
			local19.method347();
		}
		@Pc(57) int local57 = local19.method336();
		@Pc(59) int local59 = -1;
		this.anInt3869 = local19.method359();
		this.anIntArray412 = new int[this.anInt3869];
		for (@Pc(71) int local71 = 0; local71 < this.anInt3869; local71++) {
			this.anIntArray412[local71] = local44 += local19.method359();
			if (local59 < this.anIntArray412[local71]) {
				local59 = this.anIntArray412[local71];
			}
		}
		this.anObjectArrayArray2 = new Object[local59 + 1][];
		this.anIntArray414 = new int[local59 + 1];
		this.anIntArray413 = new int[local59 + 1];
		this.anIntArray410 = new int[local59 + 1];
		this.anIntArrayArray37 = new int[local59 + 1][];
		this.anIntArray409 = new int[local59 + 1];
		this.anObjectArray29 = new Object[local59 + 1];
		@Pc(163) int local163;
		@Pc(182) int local182;
		if (local57 != 0) {
			this.anIntArray408 = new int[local59 + 1];
			for (local163 = 0; local163 < local59 + 1; local163++) {
				this.anIntArray408[local163] = -1;
			}
			for (local182 = 0; local182 < this.anInt3869; local182++) {
				this.anIntArray408[this.anIntArray412[local182]] = local19.method347();
			}
			this.aClass19_2 = new Class19(this.anIntArray408);
		}
		for (local163 = 0; local163 < this.anInt3869; local163++) {
			this.anIntArray410[this.anIntArray412[local163]] = local19.method347();
		}
		for (local182 = 0; local182 < this.anInt3869; local182++) {
			this.anIntArray413[this.anIntArray412[local182]] = local19.method347();
		}
		for (@Pc(258) int local258 = 0; local258 < this.anInt3869; local258++) {
			this.anIntArray409[this.anIntArray412[local258]] = local19.method359();
		}
		@Pc(288) int local288;
		@Pc(293) int local293;
		@Pc(283) int local283;
		@Pc(301) int local301;
		@Pc(318) int local318;
		for (@Pc(277) int local277 = 0; local277 < this.anInt3869; local277++) {
			local44 = 0;
			local283 = -1;
			local288 = this.anIntArray412[local277];
			local293 = this.anIntArray409[local288];
			this.anIntArrayArray37[local288] = new int[local293];
			for (local301 = 0; local301 < local293; local301++) {
				local318 = this.anIntArrayArray37[local288][local301] = local44 += local19.method359();
				if (local318 > local283) {
					local283 = local318;
				}
			}
			this.anIntArray414[local288] = local283 + 1;
			if (local293 == local283 + 1) {
				this.anIntArrayArray37[local288] = null;
			}
		}
		if (local57 == 0) {
			return;
		}
		this.anIntArrayArray38 = new int[local59 + 1][];
		this.aClass19Array2 = new Class19[local59 + 1];
		for (local288 = 0; local288 < this.anInt3869; local288++) {
			local293 = this.anIntArray412[local288];
			local283 = this.anIntArray409[local293];
			this.anIntArrayArray38[local293] = new int[this.anIntArray414[local293]];
			for (local301 = 0; local301 < this.anIntArray414[local293]; local301++) {
				this.anIntArrayArray38[local293][local301] = -1;
			}
			for (local318 = 0; local318 < local283; local318++) {
				@Pc(434) int local434;
				if (this.anIntArrayArray37[local293] == null) {
					local434 = local318;
				} else {
					local434 = this.anIntArrayArray37[local293][local318];
				}
				this.anIntArrayArray38[local293][local434] = local19.method347();
			}
			this.aClass19Array2[local293] = new Class19(this.anIntArrayArray38[local293]);
		}
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(II)Z")
	public final boolean method2965(@OriginalArg(0) int arg0) {
		if (this.anIntArray414.length == 1) {
			return this.method2944(arg0, 0);
		} else if (!this.method2962(arg0)) {
			return false;
		} else if (this.anIntArray414[arg0] == 1) {
			return this.method2944(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "(II)I")
	public final int method2966(@OriginalArg(0) int arg0) {
		return this.method2962(arg0) ? this.anIntArray414[arg0] : 0;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!tg;II)I")
	public final int method2967(@OriginalArg(0) Class81 arg0, @OriginalArg(2) int arg1) {
		if (this.method2962(arg1)) {
			@Pc(14) Class81 local14 = arg0.method2802();
			@Pc(30) int local30 = this.aClass19Array2[arg1].method809(local14.method2792());
			return this.method2959(local30, arg1) ? local30 : -1;
		} else {
			return -1;
		}
	}
}
