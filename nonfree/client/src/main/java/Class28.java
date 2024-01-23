import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public abstract class Class28 {

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "[I")
	private int[] anIntArray93;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
	public int anInt906;

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!jb", name = "u", descriptor = "[I")
	protected int[] anIntArray94;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "[I")
	private int[] anIntArray95;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "Lclient!se;")
	private Class109 aClass109_2;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!jb", name = "P", descriptor = "[I")
	private int[] anIntArray96;

	@OriginalMember(owner = "client!jb", name = "Q", descriptor = "[I")
	protected int[] anIntArray97;

	@OriginalMember(owner = "client!jb", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!jb", name = "U", descriptor = "[Lclient!se;")
	private Class109[] aClass109Array2;

	@OriginalMember(owner = "client!jb", name = "Z", descriptor = "[I")
	protected int[] anIntArray98;

	@OriginalMember(owner = "client!jb", name = "cb", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!jb", name = "N", descriptor = "Z")
	private boolean aBoolean87;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "Z")
	private boolean aBoolean86;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(ZZ)V")
	protected Class28(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean87 = arg1;
		this.aBoolean86 = arg0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLclient!sc;)Z")
	public final boolean method817(@OriginalArg(1) Class107 arg0) {
		@Pc(3) Class107 local3 = arg0.method3085();
		@Pc(20) int local20 = this.aClass109_2.method3126(local3.method3106());
		return this.method834(local20);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!sc;BLclient!sc;)[B")
	public final byte[] method818(@OriginalArg(0) Class107 arg0, @OriginalArg(2) Class107 arg1) {
		@Pc(3) Class107 local3 = arg0.method3085();
		@Pc(7) Class107 local7 = arg1.method3085();
		@Pc(15) int local15 = this.aClass109_2.method3126(local3.method3106());
		if (this.method838(local15)) {
			@Pc(42) int local42 = this.aClass109Array2[local15].method3126(local7.method3106());
			return this.method819(local42, local15);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)[B")
	public final byte[] method819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method820(null, arg0, arg1);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([IIII)[B")
	public final byte[] method820(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method831(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg2] == null || this.anObjectArrayArray2[arg2][arg1] == null) {
			@Pc(34) boolean local34 = this.method828(arg0, arg2);
			if (!local34) {
				this.method849(arg2);
				local34 = this.method828(arg0, arg2);
				if (!local34) {
					return null;
				}
			}
		}
		@Pc(60) byte[] local60 = Static35.method698(false, this.anObjectArrayArray2[arg2][arg1]);
		if (this.aBoolean87) {
			this.anObjectArrayArray2[arg2][arg1] = null;
			if (this.anIntArray96[arg2] == 1) {
				this.anObjectArrayArray2[arg2] = null;
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZI)[B")
	public final byte[] method821(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method831(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1] == null || this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(29) boolean local29 = this.method828(null, arg1);
			if (!local29) {
				this.method849(arg1);
				local29 = this.method828(null, arg1);
				if (!local29) {
					return null;
				}
			}
		}
		return Static35.method698(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I")
	protected int method822(@OriginalArg(1) int arg0) {
		if (this.method838(arg0)) {
			return this.anObjectArray2[arg0] == null ? 0 : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)I")
	public final int method823() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray2.length; local11++) {
			if (this.anIntArray98[local11] > 0) {
				local7 += 100;
				local9 += this.method822(local11);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)Z")
	public final boolean method824(@OriginalArg(0) int arg0) {
		if (this.anIntArray96.length == 1) {
			return this.method841(0, arg0);
		} else if (!this.method838(arg0)) {
			return false;
		} else if (this.anIntArray96[arg0] == 1) {
			return this.method841(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)I")
	public final int method825() {
		return this.anIntArray96.length;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public final void method826() {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2.length; local3++) {
			this.anObjectArrayArray2[local3] = null;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!sc;Lclient!sc;B)Z")
	public final boolean method827(@OriginalArg(0) Class107 arg0, @OriginalArg(1) Class107 arg1) {
		@Pc(3) Class107 local3 = arg0.method3085();
		@Pc(7) Class107 local7 = arg1.method3085();
		@Pc(22) int local22 = this.aClass109_2.method3126(local3.method3106());
		if (this.method838(local22)) {
			@Pc(43) int local43 = this.aClass109Array2[local22].method3126(local7.method3106());
			return this.method841(local22, local43);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([IBI)Z")
	private boolean method828(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (!this.method838(arg1)) {
			return false;
		} else if (this.anObjectArray2[arg1] == null) {
			return false;
		} else {
			@Pc(24) int local24 = this.anIntArray98[arg1];
			@Pc(29) int[] local29 = this.anIntArrayArray16[arg1];
			if (this.anObjectArrayArray2[arg1] == null) {
				this.anObjectArrayArray2[arg1] = new Object[this.anIntArray96[arg1]];
			}
			@Pc(56) Object[] local56 = this.anObjectArrayArray2[arg1];
			@Pc(58) boolean local58 = true;
			for (@Pc(60) int local60 = 0; local60 < local24; local60++) {
				@Pc(68) int local68;
				if (local29 == null) {
					local68 = local60;
				} else {
					local68 = local29[local60];
				}
				if (local56[local68] == null) {
					local58 = false;
					break;
				}
			}
			if (local58) {
				return true;
			}
			@Pc(124) byte[] local124;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local124 = Static35.method698(false, this.anObjectArray2[arg1]);
			} else {
				local124 = Static35.method698(true, this.anObjectArray2[arg1]);
				@Pc(139) Class1_Sub26 local139 = new Class1_Sub26(local124);
				local139.method2984(arg0, local139.aByteArray52.length);
			}
			@Pc(151) byte[] local151;
			try {
				local151 = Static23.method418(local124);
			} catch (@Pc(153) RuntimeException local153) {
				throw Static166.method3210(local153, "T3 - " + (arg0 != null) + "," + arg1 + "," + local124.length + "," + Static38.method720(local124, local124.length) + "," + Static38.method720(local124, local124.length - 2) + "," + this.anIntArray97[arg1] + "," + this.anInt906);
			}
			if (this.aBoolean86) {
				this.anObjectArray2[arg1] = null;
			}
			@Pc(225) int local225;
			if (local24 <= 1) {
				if (local29 == null) {
					local225 = 0;
				} else {
					local225 = local29[0];
				}
				if (this.aBoolean87) {
					local56[local225] = local151;
				} else {
					local56[local225] = Static85.method1440(local151);
				}
			} else {
				local225 = local151.length;
				local225--;
				@Pc(257) int local257 = local151[local225] & 0xFF;
				@Pc(262) Class1_Sub26 local262 = new Class1_Sub26(local151);
				local225 -= local257 * 4 * local24;
				local262.anInt4021 = local225;
				@Pc(276) int[] local276 = new int[local24];
				@Pc(284) int local284;
				for (@Pc(278) int local278 = 0; local278 < local257; local278++) {
					@Pc(282) int local282 = 0;
					for (local284 = 0; local284 < local24; local284++) {
						local282 += local262.method2958();
						local276[local284] += local282;
					}
				}
				@Pc(314) byte[][] local314 = new byte[local24][];
				for (local284 = 0; local284 < local24; local284++) {
					local314[local284] = new byte[local276[local284]];
					local276[local284] = 0;
				}
				local262.anInt4021 = local225;
				@Pc(338) int local338 = 0;
				@Pc(344) int local344;
				@Pc(346) int local346;
				for (@Pc(340) int local340 = 0; local340 < local257; local340++) {
					local344 = 0;
					for (local346 = 0; local346 < local24; local346++) {
						local344 += local262.method2958();
						Static236.method300(local151, local338, local314[local346], local276[local346], local344);
						local338 += local344;
						local276[local346] += local344;
					}
				}
				for (local344 = 0; local344 < local24; local344++) {
					if (local29 == null) {
						local346 = local344;
					} else {
						local346 = local29[local344];
					}
					if (this.aBoolean87) {
						local56[local346] = local314[local344];
					} else {
						local56[local346] = Static85.method1440(local314[local344]);
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)V")
	protected void method829(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)[I")
	public final int[] method830(@OriginalArg(0) int arg0) {
		if (!this.method838(arg0)) {
			return null;
		}
		@Pc(22) int[] local22 = this.anIntArrayArray16[arg0];
		if (local22 == null) {
			local22 = new int[this.anIntArray98[arg0]];
			@Pc(32) int local32 = 0;
			while (local32 < local22.length) {
				local22[local32] = local32++;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IZI)Z")
	private boolean method831(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && arg1 < this.anIntArray96.length && arg0 < this.anIntArray96[arg1]) {
			return true;
		} else if (Static152.aBoolean295) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)I")
	public final int method832(@OriginalArg(0) int arg0) {
		return this.method838(arg0) ? this.anIntArray96[arg0] : 0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!sc;)V")
	public final void method833(@OriginalArg(1) Class107 arg0) {
		@Pc(3) Class107 local3 = arg0.method3085();
		@Pc(22) int local22 = this.aClass109_2.method3126(local3.method3106());
		this.method829(local22);
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(II)Z")
	public final boolean method834(@OriginalArg(0) int arg0) {
		if (!this.method838(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method849(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "(II)[B")
	public final byte[] method836(@OriginalArg(0) int arg0) {
		if (this.anIntArray96.length == 1) {
			return this.method819(arg0, 0);
		} else if (!this.method838(arg0)) {
			return null;
		} else if (this.anIntArray96[arg0] == 1) {
			return this.method819(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!sc;I)I")
	public final int method837(@OriginalArg(0) Class107 arg0) {
		@Pc(3) Class107 local3 = arg0.method3085();
		@Pc(15) int local15 = this.aClass109_2.method3126(local3.method3106());
		return this.method838(local15) ? local15 : -1;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IB)Z")
	protected final boolean method838(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && this.anIntArray96.length > arg0 && this.anIntArray96[arg0] != 0) {
			return true;
		} else if (Static152.aBoolean295) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)Z")
	public final boolean method839() {
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray95.length; local14++) {
			@Pc(21) int local21 = this.anIntArray95[local14];
			if (this.anObjectArray2[local21] == null) {
				this.method849(local21);
				if (this.anObjectArray2[local21] == null) {
					local12 = false;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIB)Z")
	public final boolean method841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method831(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray2[arg0] != null && this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method849(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZB)V")
	public final void method842(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.anIntArray93 = null;
			this.aClass109_2 = null;
		}
		this.aClass109Array2 = null;
		this.anIntArrayArray15 = null;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Lclient!sc;I)I")
	public final int method843(@OriginalArg(0) Class107 arg0) {
		@Pc(3) Class107 local3 = arg0.method3085();
		@Pc(16) int local16 = this.aClass109_2.method3126(local3.method3106());
		return this.method822(local16);
	}

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "(II)V")
	public final void method844(@OriginalArg(1) int arg0) {
		if (this.method838(arg0)) {
			this.anObjectArrayArray2[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BB)V")
	protected final void method846(@OriginalArg(0) byte[] arg0) {
		this.anInt906 = Static38.method720(arg0, arg0.length);
		@Pc(19) Class1_Sub26 local19 = new Class1_Sub26(Static23.method418(arg0));
		@Pc(23) int local23 = local19.method2945();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 >= 6) {
			local19.method2958();
		}
		@Pc(49) int local49 = 0;
		@Pc(53) int local53 = local19.method2945();
		this.anInt914 = local19.method2964();
		@Pc(60) int local60 = -1;
		this.anIntArray95 = new int[this.anInt914];
		for (@Pc(74) int local74 = 0; local74 < this.anInt914; local74++) {
			this.anIntArray95[local74] = local49 += local19.method2964();
			if (this.anIntArray95[local74] > local60) {
				local60 = this.anIntArray95[local74];
			}
		}
		this.anObjectArrayArray2 = new Object[local60 + 1][];
		this.anIntArrayArray16 = new int[local60 + 1][];
		this.anIntArray94 = new int[local60 + 1];
		this.anIntArray97 = new int[local60 + 1];
		this.anIntArray96 = new int[local60 + 1];
		this.anObjectArray2 = new Object[local60 + 1];
		this.anIntArray98 = new int[local60 + 1];
		@Pc(159) int local159;
		@Pc(178) int local178;
		if (local53 != 0) {
			this.anIntArray93 = new int[local60 + 1];
			for (local159 = 0; local159 < local60 + 1; local159++) {
				this.anIntArray93[local159] = -1;
			}
			for (local178 = 0; local178 < this.anInt914; local178++) {
				this.anIntArray93[this.anIntArray95[local178]] = local19.method2958();
			}
			this.aClass109_2 = new Class109(this.anIntArray93);
		}
		for (local159 = 0; local159 < this.anInt914; local159++) {
			this.anIntArray97[this.anIntArray95[local159]] = local19.method2958();
		}
		for (local178 = 0; local178 < this.anInt914; local178++) {
			this.anIntArray94[this.anIntArray95[local178]] = local19.method2958();
		}
		for (@Pc(250) int local250 = 0; local250 < this.anInt914; local250++) {
			this.anIntArray98[this.anIntArray95[local250]] = local19.method2964();
		}
		@Pc(280) int local280;
		@Pc(287) int local287;
		@Pc(295) int local295;
		@Pc(297) int local297;
		@Pc(314) int local314;
		for (@Pc(273) int local273 = 0; local273 < this.anInt914; local273++) {
			local280 = this.anIntArray95[local273];
			local49 = 0;
			local287 = this.anIntArray98[local280];
			this.anIntArrayArray16[local280] = new int[local287];
			local295 = -1;
			for (local297 = 0; local297 < local287; local297++) {
				local314 = this.anIntArrayArray16[local280][local297] = local49 += local19.method2964();
				if (local314 > local295) {
					local295 = local314;
				}
			}
			this.anIntArray96[local280] = local295 + 1;
			if (local287 == local295 + 1) {
				this.anIntArrayArray16[local280] = null;
			}
		}
		if (local53 == 0) {
			return;
		}
		this.anIntArrayArray15 = new int[local60 + 1][];
		this.aClass109Array2 = new Class109[local60 + 1];
		for (local280 = 0; local280 < this.anInt914; local280++) {
			local287 = this.anIntArray95[local280];
			local295 = this.anIntArray98[local287];
			this.anIntArrayArray15[local287] = new int[this.anIntArray96[local287]];
			for (local297 = 0; local297 < this.anIntArray96[local287]; local297++) {
				this.anIntArrayArray15[local287][local297] = -1;
			}
			for (local314 = 0; local314 < local295; local314++) {
				@Pc(427) int local427;
				if (this.anIntArrayArray16[local287] == null) {
					local427 = local314;
				} else {
					local427 = this.anIntArrayArray16[local287][local314];
				}
				this.anIntArrayArray15[local287][local427] = local19.method2958();
			}
			this.aClass109Array2[local287] = new Class109(this.anIntArrayArray15[local287]);
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(Lclient!sc;I)Z")
	public final boolean method847(@OriginalArg(0) Class107 arg0) {
		@Pc(7) Class107 local7 = arg0.method3085();
		@Pc(17) int local17 = this.aClass109_2.method3126(local7.method3106());
		return local17 >= 0;
	}

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "(II)V")
	protected void method849(@OriginalArg(1) int arg0) {
	}
}
