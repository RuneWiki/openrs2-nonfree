import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public abstract class Class23 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "[I")
	protected int[] anIntArray82;

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!wa", name = "u", descriptor = "[Lclient!nf;")
	private Class72[] aClass72Array2;

	@OriginalMember(owner = "client!wa", name = "w", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!wa", name = "z", descriptor = "Lclient!nf;")
	private Class72 aClass72_2;

	@OriginalMember(owner = "client!wa", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!wa", name = "B", descriptor = "[I")
	protected int[] anIntArray87;

	@OriginalMember(owner = "client!wa", name = "F", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!wa", name = "G", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!wa", name = "H", descriptor = "[I")
	protected int[] anIntArray88;

	@OriginalMember(owner = "client!wa", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
	public int anInt917;

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "Z")
	private final boolean aBoolean56;

	@OriginalMember(owner = "client!wa", name = "V", descriptor = "Z")
	private final boolean aBoolean57;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(ZZ)V")
	protected Class23(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean56 = arg0;
		this.aBoolean57 = arg1;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)[B")
	public final byte[] method726(@OriginalArg(0) int arg0) {
		if (this.anIntArray85.length == 1) {
			return this.method738(arg0, 0);
		} else if (!this.method758(arg0)) {
			return null;
		} else if (this.anIntArray85[arg0] == 1) {
			return this.method738(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BII)Z")
	private boolean method727(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < this.anIntArray85.length && this.anIntArray85[arg0] > arg1) {
			return true;
		} else if (Static51.aBoolean64) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)Z")
	public final boolean method728() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray83.length; local9++) {
			@Pc(16) int local16 = this.anIntArray83[local9];
			if (this.anObjectArray2[local16] == null) {
				this.method746(local16);
				if (this.anObjectArray2[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!dc;)V")
	public final void method729(@OriginalArg(1) Class20 arg0) {
		@Pc(9) Class20 local9 = arg0.method563();
		@Pc(17) int local17 = this.aClass72_2.method2006(local9.method557());
		this.method741(local17);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!dc;Lclient!dc;I)[B")
	public final byte[] method730(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class20 arg1) {
		@Pc(7) Class20 local7 = arg0.method563();
		@Pc(11) Class20 local11 = arg1.method563();
		@Pc(19) int local19 = this.aClass72_2.method2006(local7.method557());
		if (this.method758(local19)) {
			@Pc(41) int local41 = this.aClass72Array2[local19].method2006(local11.method557());
			return this.method738(local41, local19);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)[I")
	public final int[] method731(@OriginalArg(0) int arg0) {
		if (!this.method758(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.anIntArrayArray10[arg0];
		if (local23 == null) {
			local23 = new int[this.anIntArray82[arg0]];
			@Pc(33) int local33 = 0;
			while (local33 < local23.length) {
				local23[local33] = local33++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)I")
	protected int method733(@OriginalArg(0) int arg0) {
		if (this.method758(arg0)) {
			return this.anObjectArray2[arg0] == null ? 0 : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(ILclient!dc;)I")
	public final int method734(@OriginalArg(1) Class20 arg0) {
		@Pc(3) Class20 local3 = arg0.method563();
		@Pc(11) int local11 = this.aClass72_2.method2006(local3.method557());
		return this.method758(local11) ? local11 : -1;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!dc;I)I")
	public final int method735(@OriginalArg(0) Class20 arg0) {
		@Pc(3) Class20 local3 = arg0.method563();
		@Pc(21) int local21 = this.aClass72_2.method2006(local3.method557());
		return this.method733(local21);
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(II)V")
	public final void method736(@OriginalArg(1) int arg0) {
		if (this.method758(arg0)) {
			this.anObjectArrayArray2[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!dc;II)I")
	public final int method737(@OriginalArg(0) Class20 arg0, @OriginalArg(2) int arg1) {
		if (this.method758(arg1)) {
			@Pc(19) Class20 local19 = arg0.method563();
			@Pc(29) int local29 = this.aClass72Array2[arg1].method2006(local19.method557());
			return this.method727(arg1, local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)[B")
	public final byte[] method738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method740(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III[I)[B")
	public final byte[] method740(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method727(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0] == null || this.anObjectArrayArray2[arg0][arg1] == null) {
			@Pc(34) boolean local34 = this.method757(arg2, arg0);
			if (!local34) {
				this.method746(arg0);
				local34 = this.method757(arg2, arg0);
				if (!local34) {
					return null;
				}
			}
		}
		@Pc(60) byte[] local60 = Static144.method2236(false, this.anObjectArrayArray2[arg0][arg1]);
		if (this.aBoolean57) {
			this.anObjectArrayArray2[arg0][arg1] = null;
			if (this.anIntArray85[arg0] == 1) {
				this.anObjectArrayArray2[arg0] = null;
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IB)V")
	protected void method741(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public final void method742() {
		for (@Pc(5) int local5 = 0; local5 < this.anObjectArrayArray2.length; local5++) {
			this.anObjectArrayArray2[local5] = null;
		}
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(II)Z")
	public final boolean method743(@OriginalArg(1) int arg0) {
		if (this.anIntArray85.length == 1) {
			return this.method756(0, arg0);
		} else if (!this.method758(arg0)) {
			return false;
		} else if (this.anIntArray85[arg0] == 1) {
			return this.method756(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)I")
	public final int method744() {
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray2.length; local17++) {
			if (this.anIntArray82[local17] > 0) {
				local15 += this.method733(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B[B)V")
	protected final void method745(@OriginalArg(1) byte[] arg0) {
		this.anInt917 = Static218.method3210(arg0.length, arg0);
		@Pc(21) Class5_Sub6 local21 = new Class5_Sub6(Static130.method2025(arg0));
		@Pc(25) int local25 = local21.method3062();
		if (local25 != 5 && local25 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local25);
		}
		if (local25 >= 6) {
			local21.method3073();
		}
		@Pc(57) int local57 = 0;
		@Pc(61) int local61 = local21.method3062();
		@Pc(63) int local63 = -1;
		this.anInt890 = local21.method3077();
		this.anIntArray83 = new int[this.anInt890];
		for (@Pc(75) int local75 = 0; local75 < this.anInt890; local75++) {
			this.anIntArray83[local75] = local57 += local21.method3077();
			if (local63 < this.anIntArray83[local75]) {
				local63 = this.anIntArray83[local75];
			}
		}
		this.anObjectArrayArray2 = new Object[local63 + 1][];
		this.anIntArrayArray10 = new int[local63 + 1][];
		this.anIntArray88 = new int[local63 + 1];
		this.anIntArray85 = new int[local63 + 1];
		this.anIntArray87 = new int[local63 + 1];
		this.anObjectArray2 = new Object[local63 + 1];
		this.anIntArray82 = new int[local63 + 1];
		@Pc(156) int local156;
		@Pc(175) int local175;
		if (local61 != 0) {
			this.anIntArray86 = new int[local63 + 1];
			for (local156 = 0; local156 < local63 + 1; local156++) {
				this.anIntArray86[local156] = -1;
			}
			for (local175 = 0; local175 < this.anInt890; local175++) {
				this.anIntArray86[this.anIntArray83[local175]] = local21.method3073();
			}
			this.aClass72_2 = new Class72(this.anIntArray86);
		}
		for (local156 = 0; local156 < this.anInt890; local156++) {
			this.anIntArray87[this.anIntArray83[local156]] = local21.method3073();
		}
		for (local175 = 0; local175 < this.anInt890; local175++) {
			this.anIntArray88[this.anIntArray83[local175]] = local21.method3073();
		}
		for (@Pc(256) int local256 = 0; local256 < this.anInt890; local256++) {
			this.anIntArray82[this.anIntArray83[local256]] = local21.method3077();
		}
		@Pc(284) int local284;
		@Pc(289) int local289;
		@Pc(291) int local291;
		@Pc(299) int local299;
		@Pc(316) int local316;
		for (@Pc(275) int local275 = 0; local275 < this.anInt890; local275++) {
			local57 = 0;
			local284 = this.anIntArray83[local275];
			local289 = this.anIntArray82[local284];
			local291 = -1;
			this.anIntArrayArray10[local284] = new int[local289];
			for (local299 = 0; local299 < local289; local299++) {
				local316 = this.anIntArrayArray10[local284][local299] = local57 += local21.method3077();
				if (local316 > local291) {
					local291 = local316;
				}
			}
			this.anIntArray85[local284] = local291 + 1;
			if (local289 == local291 + 1) {
				this.anIntArrayArray10[local284] = null;
			}
		}
		if (local61 == 0) {
			return;
		}
		this.anIntArrayArray11 = new int[local63 + 1][];
		this.aClass72Array2 = new Class72[local63 + 1];
		for (local284 = 0; local284 < this.anInt890; local284++) {
			local289 = this.anIntArray83[local284];
			local291 = this.anIntArray82[local289];
			this.anIntArrayArray11[local289] = new int[this.anIntArray85[local289]];
			for (local299 = 0; local299 < this.anIntArray85[local289]; local299++) {
				this.anIntArrayArray11[local289][local299] = -1;
			}
			for (local316 = 0; local316 < local291; local316++) {
				@Pc(437) int local437;
				if (this.anIntArrayArray10[local289] == null) {
					local437 = local316;
				} else {
					local437 = this.anIntArrayArray10[local289][local316];
				}
				this.anIntArrayArray11[local289][local437] = local21.method3073();
			}
			this.aClass72Array2[local289] = new Class72(this.anIntArrayArray11[local289]);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZI)V")
	protected void method746(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Z")
	public final boolean method748(@OriginalArg(1) int arg0) {
		if (!this.method758(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method746(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)[B")
	public final byte[] method749(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method727(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1] == null || this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(29) boolean local29 = this.method757(null, arg1);
			if (!local29) {
				this.method746(arg1);
				local29 = this.method757(null, arg1);
				if (!local29) {
					return null;
				}
			}
		}
		return Static144.method2236(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)I")
	public final int method750() {
		return this.anIntArray85.length;
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(II)I")
	public final int method752(@OriginalArg(1) int arg0) {
		return this.method758(arg0) ? this.anIntArray85[arg0] : 0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZZB)V")
	public final void method753(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.anIntArray86 = null;
			this.aClass72_2 = null;
		}
		this.aClass72Array2 = null;
		this.anIntArrayArray11 = null;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(Lclient!dc;I)Z")
	public final boolean method754(@OriginalArg(0) Class20 arg0) {
		@Pc(4) int local4 = this.method734(Static82.aClass20_668);
		return local4 == -1 ? this.method759(arg0, Static82.aClass20_668) : this.method759(Static82.aClass20_668, arg0);
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(ILclient!dc;)Z")
	public final boolean method755(@OriginalArg(1) Class20 arg0) {
		@Pc(3) Class20 local3 = arg0.method563();
		@Pc(11) int local11 = this.aClass72_2.method2006(local3.method557());
		return this.method748(local11);
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(III)Z")
	public final boolean method756(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method727(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray2[arg0] != null && this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method746(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[II)Z")
	private boolean method757(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (!this.method758(arg1)) {
			return false;
		} else if (this.anObjectArray2[arg1] == null) {
			return false;
		} else {
			@Pc(26) int local26 = this.anIntArray82[arg1];
			@Pc(31) int[] local31 = this.anIntArrayArray10[arg1];
			if (this.anObjectArrayArray2[arg1] == null) {
				this.anObjectArrayArray2[arg1] = new Object[this.anIntArray85[arg1]];
			}
			@Pc(50) Object[] local50 = this.anObjectArrayArray2[arg1];
			@Pc(52) boolean local52 = true;
			for (@Pc(54) int local54 = 0; local54 < local26; local54++) {
				@Pc(62) int local62;
				if (local31 == null) {
					local62 = local54;
				} else {
					local62 = local31[local54];
				}
				if (local50[local62] == null) {
					local52 = false;
					break;
				}
			}
			if (local52) {
				return true;
			}
			@Pc(117) byte[] local117;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local117 = Static144.method2236(false, this.anObjectArray2[arg1]);
			} else {
				local117 = Static144.method2236(true, this.anObjectArray2[arg1]);
				@Pc(132) Class5_Sub6 local132 = new Class5_Sub6(local117);
				local132.method3070(local132.aByteArray56.length, arg0);
			}
			@Pc(144) byte[] local144;
			try {
				local144 = Static130.method2025(local117);
			} catch (@Pc(146) RuntimeException local146) {
				throw Static35.method571(local146, "T3 - " + (arg0 != null) + "," + arg1 + "," + local117.length + "," + Static218.method3210(local117.length, local117) + "," + Static218.method3210(local117.length - 2, local117) + "," + this.anIntArray87[arg1] + "," + this.anInt917);
			}
			if (this.aBoolean56) {
				this.anObjectArray2[arg1] = null;
			}
			@Pc(218) int local218;
			if (local26 > 1) {
				@Pc(215) int[] local215 = new int[local26];
				local218 = local144.length;
				@Pc(221) int local221 = local218 - 1;
				@Pc(225) int local225 = local144[local221] & 0xFF;
				@Pc(230) Class5_Sub6 local230 = new Class5_Sub6(local144);
				@Pc(238) int local238 = local221 - local225 * 4 * local26;
				local230.anInt4050 = local238;
				@Pc(249) int local249;
				for (@Pc(243) int local243 = 0; local243 < local225; local243++) {
					@Pc(247) int local247 = 0;
					for (local249 = 0; local249 < local26; local249++) {
						local247 += local230.method3073();
						local215[local249] += local247;
					}
				}
				@Pc(283) byte[][] local283 = new byte[local26][];
				for (local249 = 0; local249 < local26; local249++) {
					local283[local249] = new byte[local215[local249]];
					local215[local249] = 0;
				}
				@Pc(304) int local304 = 0;
				local230.anInt4050 = local238;
				@Pc(313) int local313;
				@Pc(315) int local315;
				for (@Pc(309) int local309 = 0; local309 < local225; local309++) {
					local313 = 0;
					for (local315 = 0; local315 < local26; local315++) {
						local313 += local230.method3073();
						Static220.method51(local144, local304, local283[local315], local215[local315], local313);
						local304 += local313;
						local215[local315] += local313;
					}
				}
				for (local313 = 0; local313 < local26; local313++) {
					if (local31 == null) {
						local315 = local313;
					} else {
						local315 = local31[local313];
					}
					if (this.aBoolean57) {
						local50[local315] = local283[local313];
					} else {
						local50[local315] = Static122.method1927(local283[local313]);
					}
				}
			} else {
				if (local31 == null) {
					local218 = 0;
				} else {
					local218 = local31[0];
				}
				if (this.aBoolean57) {
					local50[local218] = local144;
				} else {
					local50[local218] = Static122.method1927(local144);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(II)Z")
	protected final boolean method758(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < this.anIntArray85.length && this.anIntArray85[arg0] != 0) {
			return true;
		} else if (Static51.aBoolean64) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!dc;Lclient!dc;)Z")
	public final boolean method759(@OriginalArg(1) Class20 arg0, @OriginalArg(2) Class20 arg1) {
		@Pc(3) Class20 local3 = arg0.method563();
		@Pc(11) Class20 local11 = arg1.method563();
		@Pc(19) int local19 = this.aClass72_2.method2006(local3.method557());
		if (this.method758(local19)) {
			@Pc(36) int local36 = this.aClass72Array2[local19].method2006(local11.method557());
			return this.method756(local19, local36);
		} else {
			return false;
		}
	}
}
