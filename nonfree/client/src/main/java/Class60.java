import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public abstract class Class60 {

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "[I")
	private int[] anIntArray349;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "[I")
	protected int[] anIntArray350;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
	private int anInt3041;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "[Lclient!fj;")
	private Class29[] aClass29Array2;

	@OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
	public int anInt3049;

	@OriginalMember(owner = "client!sd", name = "I", descriptor = "[I")
	protected int[] anIntArray353;

	@OriginalMember(owner = "client!sd", name = "K", descriptor = "[I")
	private int[] anIntArray354;

	@OriginalMember(owner = "client!sd", name = "R", descriptor = "[I")
	private int[] anIntArray355;

	@OriginalMember(owner = "client!sd", name = "V", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!sd", name = "Z", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!sd", name = "bb", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!sd", name = "cb", descriptor = "Lclient!fj;")
	private Class29 aClass29_2;

	@OriginalMember(owner = "client!sd", name = "db", descriptor = "[I")
	protected int[] anIntArray356;

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "Z")
	private final boolean aBoolean124;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "Z")
	private final boolean aBoolean123;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(ZZ)V")
	protected Class60(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean124 = arg1;
		this.aBoolean123 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)Z")
	public final boolean method2316(@OriginalArg(0) int arg0) {
		if (!this.method2335(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method2329(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Z")
	public final boolean method2317(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2341(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray2[arg0] != null && this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method2329(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZZ)V")
	public final void method2318(@OriginalArg(2) boolean arg0) {
		if (arg0) {
			this.anIntArray349 = null;
			this.aClass29_2 = null;
		}
		this.aClass29Array2 = null;
		this.anIntArrayArray26 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)I")
	public final int method2319() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anObjectArray2.length; local16++) {
			if (this.anIntArray350[local16] > 0) {
				local9 += this.method2346(local16);
				local7 += 100;
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZI)[I")
	public final int[] method2320(@OriginalArg(1) int arg0) {
		if (!this.method2335(arg0)) {
			return null;
		}
		@Pc(15) int[] local15 = this.anIntArrayArray27[arg0];
		if (local15 == null) {
			local15 = new int[this.anIntArray350[arg0]];
			@Pc(34) int local34 = 0;
			while (local34 < local15.length) {
				local15[local34] = local34++;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([BI)V")
	protected final void method2321(@OriginalArg(0) byte[] arg0) {
		this.anInt3049 = Static14.method270(arg0, arg0.length);
		@Pc(13) Class1_Sub14 local13 = new Class1_Sub14(Static184.method3057(arg0));
		@Pc(21) int local21 = local13.method1738();
		if (local21 != 5 && local21 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local21);
		}
		if (local21 >= 6) {
			local13.method1700();
		}
		@Pc(55) int local55 = -1;
		@Pc(57) int local57 = 0;
		@Pc(61) int local61 = local13.method1738();
		this.anInt3041 = local13.method1753();
		this.anIntArray354 = new int[this.anInt3041];
		for (@Pc(73) int local73 = 0; local73 < this.anInt3041; local73++) {
			this.anIntArray354[local73] = local57 += local13.method1753();
			if (this.anIntArray354[local73] > local55) {
				local55 = this.anIntArray354[local73];
			}
		}
		this.anObjectArray2 = new Object[local55 + 1];
		this.anIntArray350 = new int[local55 + 1];
		this.anObjectArrayArray2 = new Object[local55 + 1][];
		this.anIntArray356 = new int[local55 + 1];
		this.anIntArrayArray27 = new int[local55 + 1][];
		this.anIntArray355 = new int[local55 + 1];
		this.anIntArray353 = new int[local55 + 1];
		@Pc(160) int local160;
		@Pc(174) int local174;
		if (local61 != 0) {
			this.anIntArray349 = new int[local55 + 1];
			for (local160 = 0; local160 < local55 + 1; local160++) {
				this.anIntArray349[local160] = -1;
			}
			for (local174 = 0; local174 < this.anInt3041; local174++) {
				this.anIntArray349[this.anIntArray354[local174]] = local13.method1700();
			}
			this.aClass29_2 = new Class29(this.anIntArray349);
		}
		for (local160 = 0; local160 < this.anInt3041; local160++) {
			this.anIntArray353[this.anIntArray354[local160]] = local13.method1700();
		}
		for (local174 = 0; local174 < this.anInt3041; local174++) {
			this.anIntArray356[this.anIntArray354[local174]] = local13.method1700();
		}
		for (@Pc(249) int local249 = 0; local249 < this.anInt3041; local249++) {
			this.anIntArray350[this.anIntArray354[local249]] = local13.method1753();
		}
		@Pc(279) int local279;
		@Pc(284) int local284;
		@Pc(286) int local286;
		@Pc(294) int local294;
		@Pc(310) int local310;
		for (@Pc(271) int local271 = 0; local271 < this.anInt3041; local271++) {
			local57 = 0;
			local279 = this.anIntArray354[local271];
			local284 = this.anIntArray350[local279];
			local286 = -1;
			this.anIntArrayArray27[local279] = new int[local284];
			for (local294 = 0; local294 < local284; local294++) {
				local310 = this.anIntArrayArray27[local279][local294] = local57 += local13.method1753();
				if (local310 > local286) {
					local286 = local310;
				}
			}
			this.anIntArray355[local279] = local286 + 1;
			if (local286 + 1 == local284) {
				this.anIntArrayArray27[local279] = null;
			}
		}
		if (local61 == 0) {
			return;
		}
		this.anIntArrayArray26 = new int[local55 + 1][];
		this.aClass29Array2 = new Class29[local55 + 1];
		for (local279 = 0; local279 < this.anInt3041; local279++) {
			local284 = this.anIntArray354[local279];
			local286 = this.anIntArray350[local284];
			this.anIntArrayArray26[local284] = new int[this.anIntArray355[local284]];
			for (local294 = 0; local294 < this.anIntArray355[local284]; local294++) {
				this.anIntArrayArray26[local284][local294] = -1;
			}
			for (local310 = 0; local310 < local286; local310++) {
				@Pc(411) int local411;
				if (this.anIntArrayArray27[local284] == null) {
					local411 = local310;
				} else {
					local411 = this.anIntArrayArray27[local284][local310];
				}
				this.anIntArrayArray26[local284][local411] = local13.method1700();
			}
			this.aClass29Array2[local284] = new Class29(this.anIntArrayArray26[local284]);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V")
	public final void method2322(@OriginalArg(0) int arg0) {
		if (this.method2335(arg0)) {
			this.anObjectArrayArray2[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!oc;I)I")
	public final int method2323(@OriginalArg(0) Class65 arg0) {
		@Pc(7) Class65 local7 = arg0.method2487();
		@Pc(19) int local19 = this.aClass29_2.method1053(local7.method2449());
		return this.method2346(local19);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLclient!oc;Lclient!oc;)Z")
	public final boolean method2324(@OriginalArg(1) Class65 arg0, @OriginalArg(2) Class65 arg1) {
		@Pc(3) Class65 local3 = arg0.method2487();
		@Pc(11) Class65 local11 = arg1.method2487();
		@Pc(27) int local27 = this.aClass29_2.method1053(local3.method2449());
		if (this.method2335(local27)) {
			@Pc(44) int local44 = this.aClass29Array2[local27].method1053(local11.method2449());
			return this.method2317(local27, local44);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!oc;ILclient!oc;)[B")
	public final byte[] method2325(@OriginalArg(0) Class65 arg0, @OriginalArg(2) Class65 arg1) {
		@Pc(3) Class65 local3 = arg1.method2487();
		@Pc(11) Class65 local11 = arg0.method2487();
		@Pc(19) int local19 = this.aClass29_2.method1053(local3.method2449());
		if (this.method2335(local19)) {
			@Pc(42) int local42 = this.aClass29Array2[local19].method1053(local11.method2449());
			return this.method2340(local42, local19);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(Lclient!oc;I)V")
	public final void method2326(@OriginalArg(0) Class65 arg0) {
		@Pc(7) Class65 local7 = arg0.method2487();
		@Pc(24) int local24 = this.aClass29_2.method1053(local7.method2449());
		this.method2334(local24);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!oc;B)Z")
	public final boolean method2327(@OriginalArg(0) Class65 arg0) {
		@Pc(7) Class65 local7 = arg0.method2487();
		@Pc(15) int local15 = this.aClass29_2.method1053(local7.method2449());
		return this.method2316(local15);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!oc;)I")
	public final int method2328(@OriginalArg(1) Class65 arg0) {
		@Pc(3) Class65 local3 = arg0.method2487();
		@Pc(17) int local17 = this.aClass29_2.method1053(local3.method2449());
		return this.method2335(local17) ? local17 : -1;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)V")
	protected void method2329(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)I")
	public final int method2330() {
		return this.anIntArray355.length;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)[B")
	public final byte[] method2331(@OriginalArg(1) int arg0) {
		if (this.anIntArray355.length == 1) {
			return this.method2340(arg0, 0);
		} else if (!this.method2335(arg0)) {
			return null;
		} else if (this.anIntArray355[arg0] == 1) {
			return this.method2340(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!oc;II)I")
	public final int method2333(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1) {
		if (this.method2335(arg1)) {
			@Pc(14) Class65 local14 = arg0.method2487();
			@Pc(29) int local29 = this.aClass29Array2[arg1].method1053(local14.method2449());
			return this.method2341(arg1, local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)V")
	protected void method2334(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(BI)Z")
	protected final boolean method2335(@OriginalArg(1) int arg0) {
		if (arg0 >= 0 && arg0 < this.anIntArray355.length && this.anIntArray355[arg0] != 0) {
			return true;
		} else if (Static182.aBoolean163) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)[B")
	public final byte[] method2336(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2341(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1] == null || this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(29) boolean local29 = this.method2337(arg1, null);
			if (!local29) {
				this.method2329(arg1);
				local29 = this.method2337(arg1, null);
				if (!local29) {
					return null;
				}
			}
		}
		return Static33.method643(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I[II)Z")
	private boolean method2337(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (!this.method2335(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			return false;
		} else {
			@Pc(22) int local22 = this.anIntArray350[arg0];
			@Pc(27) int[] local27 = this.anIntArrayArray27[arg0];
			if (this.anObjectArrayArray2[arg0] == null) {
				this.anObjectArrayArray2[arg0] = new Object[this.anIntArray355[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray2[arg0];
			@Pc(48) boolean local48 = true;
			for (@Pc(50) int local50 = 0; local50 < local22; local50++) {
				@Pc(55) int local55;
				if (local27 == null) {
					local55 = local50;
				} else {
					local55 = local27[local50];
				}
				if (local46[local55] == null) {
					local48 = false;
					break;
				}
			}
			if (local48) {
				return true;
			}
			@Pc(111) byte[] local111;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local111 = Static33.method643(false, this.anObjectArray2[arg0]);
			} else {
				local111 = Static33.method643(true, this.anObjectArray2[arg0]);
				@Pc(116) Class1_Sub14 local116 = new Class1_Sub14(local111);
				local116.method1717(local116.aByteArray29.length, arg1);
			}
			@Pc(139) byte[] local139;
			try {
				local139 = Static184.method3057(local111);
			} catch (@Pc(141) RuntimeException local141) {
				throw Static125.method2380(local141, "T3 - " + (arg1 != null) + "," + arg0 + "," + local111.length + "," + Static14.method270(local111, local111.length) + "," + Static14.method270(local111, local111.length - 2) + "," + this.anIntArray353[arg0] + "," + this.anInt3049);
			}
			if (this.aBoolean123) {
				this.anObjectArray2[arg0] = null;
			}
			@Pc(208) int local208;
			if (local22 > 1) {
				local208 = local139.length;
				@Pc(210) int local210 = local208 - 1;
				@Pc(215) int local215 = local139[local210] & 0xFF;
				@Pc(223) int local223 = local210 - local215 * local22 * 4;
				@Pc(228) Class1_Sub14 local228 = new Class1_Sub14(local139);
				@Pc(231) int[] local231 = new int[local22];
				local228.anInt2306 = local223;
				@Pc(241) int local241;
				for (@Pc(236) int local236 = 0; local236 < local215; local236++) {
					@Pc(239) int local239 = 0;
					for (local241 = 0; local241 < local22; local241++) {
						local239 += local228.method1700();
						local231[local241] += local239;
					}
				}
				@Pc(272) byte[][] local272 = new byte[local22][];
				for (local241 = 0; local241 < local22; local241++) {
					local272[local241] = new byte[local231[local241]];
					local231[local241] = 0;
				}
				@Pc(296) int local296 = 0;
				local228.anInt2306 = local223;
				@Pc(304) int local304;
				@Pc(306) int local306;
				for (@Pc(301) int local301 = 0; local301 < local215; local301++) {
					local304 = 0;
					for (local306 = 0; local306 < local22; local306++) {
						local304 += local228.method1700();
						Static217.method2361(local139, local296, local272[local306], local231[local306], local304);
						local296 += local304;
						local231[local306] += local304;
					}
				}
				for (local304 = 0; local304 < local22; local304++) {
					if (local27 == null) {
						local306 = local304;
					} else {
						local306 = local27[local304];
					}
					if (this.aBoolean124) {
						local46[local306] = local272[local304];
					} else {
						local46[local306] = Static143.method1109(local272[local304]);
					}
				}
			} else {
				if (local27 == null) {
					local208 = 0;
				} else {
					local208 = local27[0];
				}
				if (this.aBoolean124) {
					local46[local208] = local139;
				} else {
					local46[local208] = Static143.method1109(local139);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)Z")
	public final boolean method2338() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray354.length; local9++) {
			@Pc(24) int local24 = this.anIntArray354[local9];
			if (this.anObjectArray2[local24] == null) {
				this.method2329(local24);
				if (this.anObjectArray2[local24] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBI)[B")
	public final byte[] method2340(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method2345(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIB)Z")
	private boolean method2341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && this.anIntArray355.length > arg0 && this.anIntArray355[arg0] > arg1) {
			return true;
		} else if (Static182.aBoolean163) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(ZI)I")
	public final int method2342(@OriginalArg(1) int arg0) {
		return this.method2335(arg0) ? this.anIntArray355[arg0] : 0;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)Z")
	public final boolean method2343(@OriginalArg(1) int arg0) {
		if (this.anIntArray355.length == 1) {
			return this.method2317(0, arg0);
		} else if (!this.method2335(arg0)) {
			return false;
		} else if (this.anIntArray355[arg0] == 1) {
			return this.method2317(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
	public final void method2344() {
		for (@Pc(5) int local5 = 0; local5 < this.anObjectArrayArray2.length; local5++) {
			this.anObjectArrayArray2[local5] = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II[II)[B")
	public final byte[] method2345(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method2341(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0] == null || this.anObjectArrayArray2[arg0][arg2] == null) {
			@Pc(29) boolean local29 = this.method2337(arg0, arg1);
			if (!local29) {
				this.method2329(arg0);
				local29 = this.method2337(arg0, arg1);
				if (!local29) {
					return null;
				}
			}
		}
		@Pc(64) byte[] local64 = Static33.method643(false, this.anObjectArrayArray2[arg0][arg2]);
		if (this.aBoolean124) {
			this.anObjectArrayArray2[arg0][arg2] = null;
			if (this.anIntArray355[arg0] == 1) {
				this.anObjectArrayArray2[arg0] = null;
			}
		}
		return local64;
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(II)I")
	protected int method2346(@OriginalArg(0) int arg0) {
		if (this.method2335(arg0)) {
			return this.anObjectArray2[arg0] == null ? 0 : 100;
		} else {
			return 0;
		}
	}
}
