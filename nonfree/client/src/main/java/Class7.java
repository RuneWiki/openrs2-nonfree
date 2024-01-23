import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public abstract class Class7 {

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "[I")
	private int[] anIntArray574;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "Lclient!t;")
	private Class93 aClass93_2;

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
	public int anInt4403;

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "[I")
	private int[] anIntArray575;

	@OriginalMember(owner = "client!ai", name = "x", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray30;

	@OriginalMember(owner = "client!ai", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray70;

	@OriginalMember(owner = "client!ai", name = "F", descriptor = "[I")
	protected int[] anIntArray576;

	@OriginalMember(owner = "client!ai", name = "J", descriptor = "[I")
	private int[] anIntArray577;

	@OriginalMember(owner = "client!ai", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray71;

	@OriginalMember(owner = "client!ai", name = "M", descriptor = "[I")
	protected int[] anIntArray578;

	@OriginalMember(owner = "client!ai", name = "U", descriptor = "[Lclient!t;")
	private Class93[] aClass93Array2;

	@OriginalMember(owner = "client!ai", name = "W", descriptor = "I")
	private int anInt4428;

	@OriginalMember(owner = "client!ai", name = "gb", descriptor = "[I")
	protected int[] anIntArray579;

	@OriginalMember(owner = "client!ai", name = "E", descriptor = "Z")
	private boolean aBoolean248;

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "Z")
	private boolean aBoolean247;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(ZZ)V")
	protected Class7(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean248 = arg1;
		this.aBoolean247 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)V")
	protected void method3216(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!kh;I)I")
	public final int method3217(@OriginalArg(0) Class60 arg0) {
		@Pc(7) Class60 local7 = arg0.method1836();
		@Pc(15) int local15 = this.aClass93_2.method2917(local7.method1834());
		return this.method3219(local15);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!kh;)V")
	public final void method3218(@OriginalArg(1) Class60 arg0) {
		@Pc(3) Class60 local3 = arg0.method1836();
		@Pc(21) int local21 = this.aClass93_2.method2917(local3.method1834());
		this.method3216(local21);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)I")
	protected int method3219(@OriginalArg(1) int arg0) {
		if (this.method3224(arg0)) {
			return this.anObjectArray30[arg0] == null ? 0 : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I[B)V")
	protected final void method3220(@OriginalArg(1) byte[] arg0) {
		this.anInt4403 = Static167.method2737(arg0, arg0.length);
		@Pc(19) Class1_Sub9 local19 = new Class1_Sub9(Static67.method1210(arg0));
		@Pc(23) int local23 = local19.method895();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 >= 6) {
			local19.method915();
		}
		@Pc(53) int local53 = 0;
		@Pc(57) int local57 = local19.method895();
		this.anInt4428 = local19.method946();
		this.anIntArray575 = new int[this.anInt4428];
		@Pc(69) int local69 = -1;
		for (@Pc(71) int local71 = 0; local71 < this.anInt4428; local71++) {
			this.anIntArray575[local71] = local53 += local19.method946();
			if (this.anIntArray575[local71] > local69) {
				local69 = this.anIntArray575[local71];
			}
		}
		this.anIntArray578 = new int[local69 + 1];
		this.anIntArrayArray71 = new int[local69 + 1][];
		this.anIntArray577 = new int[local69 + 1];
		this.anObjectArray30 = new Object[local69 + 1];
		this.anIntArray579 = new int[local69 + 1];
		this.anIntArray576 = new int[local69 + 1];
		this.anObjectArrayArray2 = new Object[local69 + 1][];
		@Pc(155) int local155;
		@Pc(170) int local170;
		if (local57 != 0) {
			this.anIntArray574 = new int[local69 + 1];
			for (local155 = 0; local155 < local69 + 1; local155++) {
				this.anIntArray574[local155] = -1;
			}
			for (local170 = 0; local170 < this.anInt4428; local170++) {
				this.anIntArray574[this.anIntArray575[local170]] = local19.method915();
			}
			this.aClass93_2 = new Class93(this.anIntArray574);
		}
		for (local155 = 0; local155 < this.anInt4428; local155++) {
			this.anIntArray579[this.anIntArray575[local155]] = local19.method915();
		}
		for (local170 = 0; local170 < this.anInt4428; local170++) {
			this.anIntArray578[this.anIntArray575[local170]] = local19.method915();
		}
		for (@Pc(242) int local242 = 0; local242 < this.anInt4428; local242++) {
			this.anIntArray576[this.anIntArray575[local242]] = local19.method946();
		}
		@Pc(270) int local270;
		@Pc(275) int local275;
		@Pc(283) int local283;
		@Pc(285) int local285;
		@Pc(302) int local302;
		for (@Pc(261) int local261 = 0; local261 < this.anInt4428; local261++) {
			local53 = 0;
			local270 = this.anIntArray575[local261];
			local275 = this.anIntArray576[local270];
			this.anIntArrayArray71[local270] = new int[local275];
			local283 = -1;
			for (local285 = 0; local285 < local275; local285++) {
				local302 = this.anIntArrayArray71[local270][local285] = local53 += local19.method946();
				if (local283 < local302) {
					local283 = local302;
				}
			}
			this.anIntArray577[local270] = local283 + 1;
			if (local275 == local283 + 1) {
				this.anIntArrayArray71[local270] = null;
			}
		}
		if (local57 == 0) {
			return;
		}
		this.anIntArrayArray70 = new int[local69 + 1][];
		this.aClass93Array2 = new Class93[local69 + 1];
		for (local270 = 0; local270 < this.anInt4428; local270++) {
			local275 = this.anIntArray575[local270];
			local283 = this.anIntArray576[local275];
			this.anIntArrayArray70[local275] = new int[this.anIntArray577[local275]];
			for (local285 = 0; local285 < this.anIntArray577[local275]; local285++) {
				this.anIntArrayArray70[local275][local285] = -1;
			}
			for (local302 = 0; local302 < local283; local302++) {
				@Pc(414) int local414;
				if (this.anIntArrayArray71[local275] == null) {
					local414 = local302;
				} else {
					local414 = this.anIntArrayArray71[local275][local302];
				}
				this.anIntArrayArray70[local275][local414] = local19.method915();
			}
			this.aClass93Array2[local275] = new Class93(this.anIntArrayArray70[local275]);
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLclient!kh;)Z")
	public final boolean method3221(@OriginalArg(1) Class60 arg0) {
		@Pc(4) int local4 = this.method3222(Static27.aClass60_215);
		return local4 == -1 ? this.method3230(Static27.aClass60_215, arg0) : this.method3230(arg0, Static27.aClass60_215);
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(Lclient!kh;I)I")
	public final int method3222(@OriginalArg(0) Class60 arg0) {
		@Pc(3) Class60 local3 = arg0.method1836();
		@Pc(22) int local22 = this.aClass93_2.method2917(local3.method1834());
		return this.method3224(local22) ? local22 : -1;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZIZ)V")
	public final void method3223(@OriginalArg(2) boolean arg0) {
		if (arg0) {
			this.anIntArray574 = null;
			this.aClass93_2 = null;
		}
		this.anIntArrayArray70 = null;
		this.aClass93Array2 = null;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(IB)Z")
	protected final boolean method3224(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < this.anIntArray577.length && this.anIntArray577[arg0] != 0) {
			return true;
		} else if (Static101.aBoolean197) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(IB)V")
	public final void method3225(@OriginalArg(0) int arg0) {
		if (this.method3224(arg0)) {
			this.anObjectArrayArray2[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)[B")
	public final byte[] method3226(@OriginalArg(1) int arg0) {
		if (this.anIntArray577.length == 1) {
			return this.method3242(0, arg0);
		} else if (!this.method3224(arg0)) {
			return null;
		} else if (this.anIntArray577[arg0] == 1) {
			return this.method3242(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)Z")
	public final boolean method3227(@OriginalArg(1) int arg0) {
		if (!this.method3224(arg0)) {
			return false;
		} else if (this.anObjectArray30[arg0] == null) {
			this.method3241(arg0);
			return this.anObjectArray30[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!kh;Z)Z")
	public final boolean method3229(@OriginalArg(0) Class60 arg0) {
		@Pc(7) Class60 local7 = arg0.method1836();
		@Pc(15) int local15 = this.aClass93_2.method2917(local7.method1834());
		return this.method3227(local15);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!kh;Lclient!kh;)Z")
	public final boolean method3230(@OriginalArg(1) Class60 arg0, @OriginalArg(2) Class60 arg1) {
		@Pc(3) Class60 local3 = arg1.method1836();
		@Pc(11) Class60 local11 = arg0.method1836();
		@Pc(19) int local19 = this.aClass93_2.method2917(local3.method1834());
		if (this.method3224(local19)) {
			@Pc(44) int local44 = this.aClass93Array2[local19].method2917(local11.method1834());
			return this.method3247(local19, local44);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([IBII)[B")
	public final byte[] method3232(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method3235(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg2] == null || this.anObjectArrayArray2[arg2][arg1] == null) {
			@Pc(31) boolean local31 = this.method3250(arg2, arg0);
			if (!local31) {
				this.method3241(arg2);
				local31 = this.method3250(arg2, arg0);
				if (!local31) {
					return null;
				}
			}
		}
		@Pc(61) byte[] local61 = Static97.method1676(false, this.anObjectArrayArray2[arg2][arg1]);
		if (this.aBoolean248) {
			this.anObjectArrayArray2[arg2][arg1] = null;
			if (this.anIntArray577[arg2] == 1) {
				this.anObjectArrayArray2[arg2] = null;
			}
		}
		return local61;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	public final void method3233() {
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray2.length; local7++) {
			this.anObjectArrayArray2[local7] = null;
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)I")
	public final int method3234() {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		for (@Pc(19) int local19 = 0; local19 < this.anObjectArray30.length; local19++) {
			if (this.anIntArray576[local19] > 0) {
				local3 += 100;
				local5 += this.method3219(local19);
			}
		}
		if (local3 == 0) {
			return 100;
		} else {
			return local5 * 100 / local3;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)Z")
	private boolean method3235(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && arg1 < this.anIntArray577.length && this.anIntArray577[arg1] > arg0) {
			return true;
		} else if (Static101.aBoolean197) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)I")
	public final int method3237() {
		return this.anIntArray577.length;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(II)Z")
	public final boolean method3239(@OriginalArg(0) int arg0) {
		if (this.anIntArray577.length == 1) {
			return this.method3247(0, arg0);
		} else if (!this.method3224(arg0)) {
			return false;
		} else if (this.anIntArray577[arg0] == 1) {
			return this.method3247(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLclient!kh;I)I")
	public final int method3240(@OriginalArg(1) Class60 arg0, @OriginalArg(2) int arg1) {
		if (this.method3224(arg1)) {
			@Pc(14) Class60 local14 = arg0.method1836();
			@Pc(30) int local30 = this.aClass93Array2[arg1].method2917(local14.method1834());
			return this.method3235(local30, arg1) ? local30 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(II)V")
	protected void method3241(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)[B")
	public final byte[] method3242(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method3232(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)Z")
	public final boolean method3243() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray575.length; local9++) {
			@Pc(16) int local16 = this.anIntArray575[local9];
			if (this.anObjectArray30[local16] == null) {
				this.method3241(local16);
				if (this.anObjectArray30[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)[I")
	public final int[] method3244(@OriginalArg(0) int arg0) {
		if (!this.method3224(arg0)) {
			return null;
		}
		@Pc(17) int[] local17 = this.anIntArrayArray71[arg0];
		if (local17 == null) {
			local17 = new int[this.anIntArray576[arg0]];
			@Pc(33) int local33 = 0;
			while (local17.length > local33) {
				local17[local33] = local33++;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLclient!kh;Lclient!kh;)[B")
	public final byte[] method3245(@OriginalArg(1) Class60 arg0, @OriginalArg(2) Class60 arg1) {
		@Pc(3) Class60 local3 = arg1.method1836();
		@Pc(11) Class60 local11 = arg0.method1836();
		@Pc(24) int local24 = this.aClass93_2.method2917(local3.method1834());
		if (this.method3224(local24)) {
			@Pc(41) int local41 = this.aClass93Array2[local24].method2917(local11.method1834());
			return this.method3242(local24, local41);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(II)I")
	public final int method3246(@OriginalArg(0) int arg0) {
		return this.method3224(arg0) ? this.anIntArray577[arg0] : 0;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(III)Z")
	public final boolean method3247(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3235(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray2[arg0] != null && this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray30[arg0] == null) {
			this.method3241(arg0);
			return this.anObjectArray30[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(II[I)Z")
	private boolean method3250(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (!this.method3224(arg0)) {
			return false;
		} else if (this.anObjectArray30[arg0] == null) {
			return false;
		} else {
			@Pc(24) int local24 = this.anIntArray576[arg0];
			@Pc(29) int[] local29 = this.anIntArrayArray71[arg0];
			if (this.anObjectArrayArray2[arg0] == null) {
				this.anObjectArrayArray2[arg0] = new Object[this.anIntArray577[arg0]];
			}
			@Pc(48) Object[] local48 = this.anObjectArrayArray2[arg0];
			@Pc(56) boolean local56 = true;
			for (@Pc(58) int local58 = 0; local58 < local24; local58++) {
				@Pc(66) int local66;
				if (local29 == null) {
					local66 = local58;
				} else {
					local66 = local29[local58];
				}
				if (local48[local66] == null) {
					local56 = false;
					break;
				}
			}
			if (local56) {
				return true;
			}
			@Pc(118) byte[] local118;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local118 = Static97.method1676(false, this.anObjectArray30[arg0]);
			} else {
				local118 = Static97.method1676(true, this.anObjectArray30[arg0]);
				@Pc(133) Class1_Sub9 local133 = new Class1_Sub9(local118);
				local133.method884(arg1, local133.aByteArray20.length);
			}
			@Pc(145) byte[] local145;
			try {
				local145 = Static67.method1210(local118);
			} catch (@Pc(147) RuntimeException local147) {
				throw Static104.method1771(local147, "T3 - " + (arg1 != null) + "," + arg0 + "," + local118.length + "," + Static167.method2737(local118, local118.length) + "," + Static167.method2737(local118, local118.length - 2) + "," + this.anIntArray579[arg0] + "," + this.anInt4403);
			}
			if (this.aBoolean247) {
				this.anObjectArray30[arg0] = null;
			}
			@Pc(214) int local214;
			if (local24 > 1) {
				local214 = local145.length;
				@Pc(216) int local216 = local214 - 1;
				@Pc(221) int local221 = local145[local216] & 0xFF;
				@Pc(226) Class1_Sub9 local226 = new Class1_Sub9(local145);
				@Pc(229) int[] local229 = new int[local24];
				@Pc(237) int local237 = local216 - local24 * 4 * local221;
				local226.anInt1192 = local237;
				@Pc(248) int local248;
				for (@Pc(242) int local242 = 0; local242 < local221; local242++) {
					@Pc(246) int local246 = 0;
					for (local248 = 0; local248 < local24; local248++) {
						local246 += local226.method915();
						local229[local248] += local246;
					}
				}
				@Pc(274) byte[][] local274 = new byte[local24][];
				for (local248 = 0; local248 < local24; local248++) {
					local274[local248] = new byte[local229[local248]];
					local229[local248] = 0;
				}
				local226.anInt1192 = local237;
				@Pc(302) int local302 = 0;
				@Pc(308) int local308;
				@Pc(310) int local310;
				for (@Pc(304) int local304 = 0; local304 < local221; local304++) {
					local308 = 0;
					for (local310 = 0; local310 < local24; local310++) {
						local308 += local226.method915();
						Static221.method35(local145, local302, local274[local310], local229[local310], local308);
						local302 += local308;
						local229[local310] += local308;
					}
				}
				for (local308 = 0; local308 < local24; local308++) {
					if (local29 == null) {
						local310 = local308;
					} else {
						local310 = local29[local308];
					}
					if (this.aBoolean248) {
						local48[local310] = local274[local308];
					} else {
						local48[local310] = Static116.method1977(local274[local308]);
					}
				}
			} else {
				if (local29 == null) {
					local214 = 0;
				} else {
					local214 = local29[0];
				}
				if (this.aBoolean248) {
					local48[local214] = local145;
				} else {
					local48[local214] = Static116.method1977(local145);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(III)[B")
	public final byte[] method3251(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3235(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0] == null || this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(36) boolean local36 = this.method3250(arg0, null);
			if (!local36) {
				this.method3241(arg0);
				local36 = this.method3250(arg0, null);
				if (!local36) {
					return null;
				}
			}
		}
		return Static97.method1676(false, this.anObjectArrayArray2[arg0][arg1]);
	}
}
