import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public abstract class Class1 {

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
	protected int[] anIntArray7;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	public int anInt40;

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
	private int anInt52;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "[I")
	protected int[] anIntArray8;

	@OriginalMember(owner = "client!bc", name = "I", descriptor = "[I")
	private int[] anIntArray9;

	@OriginalMember(owner = "client!bc", name = "K", descriptor = "[I")
	private int[] anIntArray10;

	@OriginalMember(owner = "client!bc", name = "M", descriptor = "Lclient!fe;")
	private Class28 aClass28_2;

	@OriginalMember(owner = "client!bc", name = "N", descriptor = "[I")
	private int[] anIntArray11;

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!bc", name = "P", descriptor = "[Lclient!fe;")
	private Class28[] aClass28Array2;

	@OriginalMember(owner = "client!bc", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!bc", name = "Y", descriptor = "[I")
	protected int[] anIntArray12;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "Z")
	private final boolean aBoolean3;

	@OriginalMember(owner = "client!bc", name = "G", descriptor = "Z")
	private final boolean aBoolean4;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(ZZ)V")
	protected Class1(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean3 = arg0;
		this.aBoolean4 = arg1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
	protected void method32(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!rd;BI)I")
	public final int method33(@OriginalArg(0) Class80 arg0, @OriginalArg(2) int arg1) {
		if (this.method37(arg1)) {
			@Pc(22) Class80 local22 = arg0.method2465();
			@Pc(32) int local32 = this.aClass28Array2[arg1].method743(local22.method2445());
			return this.method35(local32, arg1) ? local32 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)V")
	protected void method34(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BII)Z")
	private boolean method35(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && arg1 < this.anIntArray9.length && this.anIntArray9[arg1] > arg0) {
			return true;
		} else if (Static16.aBoolean24) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)[I")
	public final int[] method36(@OriginalArg(0) int arg0) {
		if (!this.method37(arg0)) {
			return null;
		}
		@Pc(17) int[] local17 = this.anIntArrayArray3[arg0];
		if (local17 == null) {
			local17 = new int[this.anIntArray7[arg0]];
			@Pc(33) int local33 = 0;
			while (local33 < local17.length) {
				local17[local33] = local33++;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)Z")
	protected final boolean method37(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && this.anIntArray9.length > arg0 && this.anIntArray9[arg0] != 0) {
			return true;
		} else if (Static16.aBoolean24) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!rd;Lclient!rd;I)[B")
	public final byte[] method38(@OriginalArg(0) Class80 arg0, @OriginalArg(1) Class80 arg1) {
		@Pc(3) Class80 local3 = arg1.method2465();
		@Pc(11) Class80 local11 = arg0.method2465();
		@Pc(19) int local19 = this.aClass28_2.method743(local3.method2445());
		if (this.method37(local19)) {
			@Pc(42) int local42 = this.aClass28Array2[local19].method743(local11.method2445());
			return this.method60(local19, local42);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)Z")
	public final boolean method39() {
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray11.length; local14++) {
			@Pc(21) int local21 = this.anIntArray11[local14];
			if (this.anObjectArray2[local21] == null) {
				this.method34(local21);
				if (this.anObjectArray2[local21] == null) {
					local12 = false;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(II)[B")
	public final byte[] method42(@OriginalArg(1) int arg0) {
		if (this.anIntArray9.length == 1) {
			return this.method60(0, arg0);
		} else if (!this.method37(arg0)) {
			return null;
		} else if (this.anIntArray9[arg0] == 1) {
			return this.method60(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(II)Z")
	public final boolean method43(@OriginalArg(0) int arg0) {
		if (this.anIntArray9.length == 1) {
			return this.method52(0, arg0);
		} else if (!this.method37(arg0)) {
			return false;
		} else if (this.anIntArray9[arg0] == 1) {
			return this.method52(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)I")
	public final int method44() {
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anObjectArray2.length; local18++) {
			if (this.anIntArray7[local18] > 0) {
				local14 += this.method46(local18);
				local16 += 100;
			}
		}
		if (local16 == 0) {
			return 100;
		} else {
			return local14 * 100 / local16;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public final void method45() {
		for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray2.length; local7++) {
			this.anObjectArrayArray2[local7] = null;
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(BI)I")
	protected int method46(@OriginalArg(1) int arg0) {
		if (this.method37(arg0)) {
			return this.anObjectArray2[arg0] == null ? 0 : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!rd;ZLclient!rd;)Z")
	public final boolean method48(@OriginalArg(0) Class80 arg0, @OriginalArg(2) Class80 arg1) {
		@Pc(7) Class80 local7 = arg1.method2465();
		@Pc(11) Class80 local11 = arg0.method2465();
		@Pc(19) int local19 = this.aClass28_2.method743(local7.method2445());
		if (this.method37(local19)) {
			@Pc(40) int local40 = this.aClass28Array2[local19].method743(local11.method2445());
			return this.method52(local19, local40);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([BI)V")
	protected final void method49(@OriginalArg(0) byte[] arg0) {
		this.anInt40 = Static62.method918(arg0, arg0.length);
		@Pc(19) Class3_Sub17 local19 = new Class3_Sub17(Static19.method319(arg0));
		@Pc(23) int local23 = local19.method2107();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		@Pc(44) int local44 = -1;
		if (local23 >= 6) {
			local19.method2132();
		}
		@Pc(55) int local55 = 0;
		@Pc(59) int local59 = local19.method2107();
		this.anInt52 = local19.method2111();
		this.anIntArray11 = new int[this.anInt52];
		for (@Pc(71) int local71 = 0; local71 < this.anInt52; local71++) {
			this.anIntArray11[local71] = local55 += local19.method2111();
			if (local44 < this.anIntArray11[local71]) {
				local44 = this.anIntArray11[local71];
			}
		}
		this.anIntArrayArray3 = new int[local44 + 1][];
		this.anIntArray7 = new int[local44 + 1];
		this.anIntArray9 = new int[local44 + 1];
		this.anObjectArray2 = new Object[local44 + 1];
		this.anIntArray8 = new int[local44 + 1];
		this.anIntArray12 = new int[local44 + 1];
		this.anObjectArrayArray2 = new Object[local44 + 1][];
		@Pc(156) int local156;
		@Pc(175) int local175;
		if (local59 != 0) {
			this.anIntArray10 = new int[local44 + 1];
			for (local156 = 0; local156 < local44 + 1; local156++) {
				this.anIntArray10[local156] = -1;
			}
			for (local175 = 0; local175 < this.anInt52; local175++) {
				this.anIntArray10[this.anIntArray11[local175]] = local19.method2132();
			}
			this.aClass28_2 = new Class28(this.anIntArray10);
		}
		for (local156 = 0; local156 < this.anInt52; local156++) {
			this.anIntArray8[this.anIntArray11[local156]] = local19.method2132();
		}
		for (local175 = 0; local175 < this.anInt52; local175++) {
			this.anIntArray12[this.anIntArray11[local175]] = local19.method2132();
		}
		for (@Pc(253) int local253 = 0; local253 < this.anInt52; local253++) {
			this.anIntArray7[this.anIntArray11[local253]] = local19.method2111();
		}
		@Pc(279) int local279;
		@Pc(284) int local284;
		@Pc(294) int local294;
		@Pc(296) int local296;
		@Pc(313) int local313;
		for (@Pc(272) int local272 = 0; local272 < this.anInt52; local272++) {
			local279 = this.anIntArray11[local272];
			local284 = this.anIntArray7[local279];
			local55 = 0;
			this.anIntArrayArray3[local279] = new int[local284];
			local294 = -1;
			for (local296 = 0; local296 < local284; local296++) {
				local313 = this.anIntArrayArray3[local279][local296] = local55 += local19.method2111();
				if (local294 < local313) {
					local294 = local313;
				}
			}
			this.anIntArray9[local279] = local294 + 1;
			if (local284 == local294 + 1) {
				this.anIntArrayArray3[local279] = null;
			}
		}
		if (local59 == 0) {
			return;
		}
		this.aClass28Array2 = new Class28[local44 + 1];
		this.anIntArrayArray4 = new int[local44 + 1][];
		for (local279 = 0; local279 < this.anInt52; local279++) {
			local284 = this.anIntArray11[local279];
			local294 = this.anIntArray7[local284];
			this.anIntArrayArray4[local284] = new int[this.anIntArray9[local284]];
			for (local296 = 0; local296 < this.anIntArray9[local284]; local296++) {
				this.anIntArrayArray4[local284][local296] = -1;
			}
			for (local313 = 0; local313 < local294; local313++) {
				@Pc(418) int local418;
				if (this.anIntArrayArray3[local284] == null) {
					local418 = local313;
				} else {
					local418 = this.anIntArrayArray3[local284][local313];
				}
				this.anIntArrayArray4[local284][local418] = local19.method2132();
			}
			this.aClass28Array2[local284] = new Class28(this.anIntArrayArray4[local284]);
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(Z)I")
	public final int method50() {
		return this.anIntArray9.length;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[II)Z")
	private boolean method51(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (!this.method37(arg1)) {
			return false;
		} else if (this.anObjectArray2[arg1] == null) {
			return false;
		} else {
			@Pc(24) int[] local24 = this.anIntArrayArray3[arg1];
			@Pc(29) int local29 = this.anIntArray7[arg1];
			if (this.anObjectArrayArray2[arg1] == null) {
				this.anObjectArrayArray2[arg1] = new Object[this.anIntArray9[arg1]];
			}
			@Pc(48) Object[] local48 = this.anObjectArrayArray2[arg1];
			@Pc(50) boolean local50 = true;
			for (@Pc(52) int local52 = 0; local52 < local29; local52++) {
				@Pc(58) int local58;
				if (local24 == null) {
					local58 = local52;
				} else {
					local58 = local24[local52];
				}
				if (local48[local58] == null) {
					local50 = false;
					break;
				}
			}
			if (local50) {
				return true;
			}
			@Pc(113) byte[] local113;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local113 = Static31.method498(this.anObjectArray2[arg1], false);
			} else {
				local113 = Static31.method498(this.anObjectArray2[arg1], true);
				@Pc(118) Class3_Sub17 local118 = new Class3_Sub17(local113);
				local118.method2105(arg0, local118.aByteArray40.length);
			}
			@Pc(140) byte[] local140;
			try {
				local140 = Static19.method319(local113);
			} catch (@Pc(142) RuntimeException local142) {
				throw Static78.method1192(local142, "T3 - " + (arg0 != null) + "," + arg1 + "," + local113.length + "," + Static62.method918(local113, local113.length) + "," + Static62.method918(local113, local113.length - 2) + "," + this.anIntArray8[arg1] + "," + this.anInt40);
			}
			if (this.aBoolean3) {
				this.anObjectArray2[arg1] = null;
			}
			@Pc(210) int local210;
			if (local29 <= 1) {
				if (local24 == null) {
					local210 = 0;
				} else {
					local210 = local24[0];
				}
				if (this.aBoolean4) {
					local48[local210] = local140;
				} else {
					local48[local210] = Static77.method1277(local140);
				}
			} else {
				local210 = local140.length;
				local210--;
				@Pc(244) int local244 = local140[local210] & 0xFF;
				local210 -= local244 * local29 * 4;
				@Pc(255) int[] local255 = new int[local29];
				@Pc(260) Class3_Sub17 local260 = new Class3_Sub17(local140);
				local260.anInt2923 = local210;
				@Pc(271) int local271;
				for (@Pc(265) int local265 = 0; local265 < local244; local265++) {
					@Pc(269) int local269 = 0;
					for (local271 = 0; local271 < local29; local271++) {
						local269 += local260.method2132();
						local255[local271] += local269;
					}
				}
				@Pc(305) byte[][] local305 = new byte[local29][];
				for (local271 = 0; local271 < local29; local271++) {
					local305[local271] = new byte[local255[local271]];
					local255[local271] = 0;
				}
				local260.anInt2923 = local210;
				@Pc(329) int local329 = 0;
				@Pc(335) int local335;
				@Pc(337) int local337;
				for (@Pc(331) int local331 = 0; local331 < local244; local331++) {
					local335 = 0;
					for (local337 = 0; local337 < local29; local337++) {
						local335 += local260.method2132();
						Static200.method1179(local140, local329, local305[local337], local255[local337], local335);
						local329 += local335;
						local255[local337] += local335;
					}
				}
				for (local335 = 0; local335 < local29; local335++) {
					if (local24 == null) {
						local337 = local335;
					} else {
						local337 = local24[local335];
					}
					if (this.aBoolean4) {
						local48[local337] = local305[local335];
					} else {
						local48[local337] = Static77.method1277(local305[local335]);
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZII)Z")
	public final boolean method52(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method35(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray2[arg0] != null && this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method34(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!rd;I)I")
	public final int method53(@OriginalArg(0) Class80 arg0) {
		@Pc(8) Class80 local8 = arg0.method2465();
		@Pc(20) int local20 = this.aClass28_2.method743(local8.method2445());
		return this.method37(local20) ? local20 : -1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZZB)V")
	public final void method54(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.anIntArray10 = null;
			this.aClass28_2 = null;
		}
		this.anIntArrayArray4 = null;
		this.aClass28Array2 = null;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(Lclient!rd;I)V")
	public final void method55(@OriginalArg(0) Class80 arg0) {
		@Pc(16) Class80 local16 = arg0.method2465();
		@Pc(24) int local24 = this.aClass28_2.method743(local16.method2445());
		this.method32(local24);
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(IZ)I")
	public final int method56(@OriginalArg(0) int arg0) {
		return this.method37(arg0) ? this.anIntArray9[arg0] : 0;
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(II)V")
	public final void method57(@OriginalArg(0) int arg0) {
		if (this.method37(arg0)) {
			this.anObjectArrayArray2[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(IB)Z")
	public final boolean method58(@OriginalArg(0) int arg0) {
		if (!this.method37(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method34(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIB)[B")
	public final byte[] method59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method35(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0] == null || this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(34) boolean local34 = this.method51(null, arg0);
			if (!local34) {
				this.method34(arg0);
				local34 = this.method51(null, arg0);
				if (!local34) {
					return null;
				}
			}
		}
		return Static31.method498(this.anObjectArrayArray2[arg0][arg1], false);
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(IIB)[B")
	public final byte[] method60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method62(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BII[I)[B")
	public final byte[] method62(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method35(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1] == null || this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(29) boolean local29 = this.method51(arg2, arg1);
			if (!local29) {
				this.method34(arg1);
				local29 = this.method51(arg2, arg1);
				if (!local29) {
					return null;
				}
			}
		}
		@Pc(60) byte[] local60 = Static31.method498(this.anObjectArrayArray2[arg1][arg0], false);
		if (this.aBoolean4) {
			this.anObjectArrayArray2[arg1][arg0] = null;
			if (this.anIntArray9[arg1] == 1) {
				this.anObjectArrayArray2[arg1] = null;
			}
		}
		return local60;
	}
}
