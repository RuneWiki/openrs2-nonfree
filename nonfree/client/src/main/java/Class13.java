import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public abstract class Class13 {

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "[I")
	protected int[] anIntArray59;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "[I")
	private int[] anIntArray61;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "[I")
	protected int[] anIntArray62;

	@OriginalMember(owner = "client!pe", name = "F", descriptor = "[I")
	protected int[] anIntArray63;

	@OriginalMember(owner = "client!pe", name = "O", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!pe", name = "Q", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!pe", name = "T", descriptor = "Lclient!ab;")
	private Class3 aClass3_2;

	@OriginalMember(owner = "client!pe", name = "U", descriptor = "[Lclient!ab;")
	private Class3[] aClass3Array2;

	@OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
	private int anInt683;

	@OriginalMember(owner = "client!pe", name = "X", descriptor = "I")
	public int anInt684;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "Z")
	private final boolean aBoolean22;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "Z")
	private final boolean aBoolean21;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(ZZ)V")
	protected Class13(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean22 = arg0;
		this.aBoolean21 = arg1;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[B")
	public final byte[] method509(@OriginalArg(0) int arg0) {
		if (this.anIntArray60.length == 1) {
			return this.method521(arg0, 0);
		} else if (!this.method522(arg0)) {
			return null;
		} else if (this.anIntArray60[arg0] == 1) {
			return this.method521(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZBZ)V")
	public final void method511(@OriginalArg(2) boolean arg0) {
		if (arg0) {
			this.anIntArray61 = null;
			this.aClass3_2 = null;
		}
		this.anIntArrayArray3 = null;
		this.aClass3Array2 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)[I")
	public final int[] method512(@OriginalArg(0) int arg0) {
		if (!this.method522(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.anIntArrayArray4[arg0];
		if (local23 == null) {
			local23 = new int[this.anIntArray63[arg0]];
			@Pc(33) int local33 = 0;
			while (local33 < local23.length) {
				local23[local33] = local33++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(IB)I")
	public final int method513(@OriginalArg(0) int arg0) {
		return this.method522(arg0) ? this.anIntArray60[arg0] : 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZLclient!ob;)I")
	public final int method514(@OriginalArg(0) int arg0, @OriginalArg(2) Class60 arg1) {
		if (this.method522(arg0)) {
			@Pc(14) Class60 local14 = arg1.method2679();
			@Pc(24) int local24 = this.aClass3Array2[arg0].method53(local14.method2682());
			return this.method515(local24, arg0) ? local24 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Z")
	private boolean method515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && this.anIntArray60.length > arg1 && this.anIntArray60[arg1] > arg0) {
			return true;
		} else if (Static79.aBoolean95) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)V")
	protected void method516(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([IIII)[B")
	public final byte[] method517(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method515(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg2] == null || this.anObjectArrayArray2[arg2][arg1] == null) {
			@Pc(37) boolean local37 = this.method520(arg0, arg2);
			if (!local37) {
				this.method516(arg2);
				local37 = this.method520(arg0, arg2);
				if (!local37) {
					return null;
				}
			}
		}
		@Pc(63) byte[] local63 = Static108.method2417(this.anObjectArrayArray2[arg2][arg1], false);
		if (this.aBoolean21) {
			this.anObjectArrayArray2[arg2][arg1] = null;
			if (this.anIntArray60[arg2] == 1) {
				this.anObjectArrayArray2[arg2] = null;
			}
		}
		return local63;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!ob;)V")
	public final void method518(@OriginalArg(1) Class60 arg0) {
		@Pc(3) Class60 local3 = arg0.method2679();
		@Pc(19) int local19 = this.aClass3_2.method53(local3.method2682());
		this.method536(local19);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)I")
	public final int method519() {
		return this.anIntArray60.length;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([IBI)Z")
	private boolean method520(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (!this.method522(arg1)) {
			return false;
		} else if (this.anObjectArray2[arg1] == null) {
			return false;
		} else {
			@Pc(22) int local22 = this.anIntArray63[arg1];
			@Pc(27) int[] local27 = this.anIntArrayArray4[arg1];
			if (this.anObjectArrayArray2[arg1] == null) {
				this.anObjectArrayArray2[arg1] = new Object[this.anIntArray60[arg1]];
			}
			@Pc(52) Object[] local52 = this.anObjectArrayArray2[arg1];
			@Pc(54) boolean local54 = true;
			for (@Pc(56) int local56 = 0; local56 < local22; local56++) {
				@Pc(61) int local61;
				if (local27 == null) {
					local61 = local56;
				} else {
					local61 = local27[local56];
				}
				if (local52[local61] == null) {
					local54 = false;
					break;
				}
			}
			if (local54) {
				return true;
			}
			@Pc(110) byte[] local110;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local110 = Static108.method2417(this.anObjectArray2[arg1], false);
			} else {
				local110 = Static108.method2417(this.anObjectArray2[arg1], true);
				@Pc(124) Class2_Sub3 local124 = new Class2_Sub3(local110);
				local124.method222(arg0, local124.aByteArray4.length);
			}
			@Pc(136) byte[] local136;
			try {
				local136 = Static97.method2263(local110);
			} catch (@Pc(138) RuntimeException local138) {
				throw Static14.method375(local138, "T3 - " + (arg0 != null) + "," + arg1 + "," + local110.length + "," + Static55.method1325(local110, local110.length) + "," + Static55.method1325(local110, local110.length - 2) + "," + this.anIntArray59[arg1] + "," + this.anInt684);
			}
			if (this.aBoolean22) {
				this.anObjectArray2[arg1] = null;
			}
			@Pc(205) int local205;
			if (local22 > 1) {
				local205 = local136.length;
				@Pc(208) int local208 = local205 - 1;
				@Pc(212) int local212 = local136[local208] & 0xFF;
				@Pc(220) int local220 = local208 - local22 * 4 * local212;
				@Pc(225) Class2_Sub3 local225 = new Class2_Sub3(local136);
				@Pc(228) int[] local228 = new int[local22];
				local225.anInt273 = local220;
				@Pc(238) int local238;
				for (@Pc(233) int local233 = 0; local233 < local212; local233++) {
					@Pc(236) int local236 = 0;
					for (local238 = 0; local238 < local22; local238++) {
						local236 += local225.method206();
						local228[local238] += local236;
					}
				}
				@Pc(271) byte[][] local271 = new byte[local22][];
				for (local238 = 0; local238 < local22; local238++) {
					local271[local238] = new byte[local228[local238]];
					local228[local238] = 0;
				}
				local225.anInt273 = local220;
				@Pc(298) int local298 = 0;
				@Pc(303) int local303;
				@Pc(305) int local305;
				for (@Pc(300) int local300 = 0; local300 < local212; local300++) {
					local303 = 0;
					for (local305 = 0; local305 < local22; local305++) {
						local303 += local225.method206();
						Static203.method2767(local136, local298, local271[local305], local228[local305], local303);
						local298 += local303;
						local228[local305] += local303;
					}
				}
				for (local303 = 0; local303 < local22; local303++) {
					if (local27 == null) {
						local305 = local303;
					} else {
						local305 = local27[local303];
					}
					if (this.aBoolean21) {
						local52[local305] = local271[local303];
					} else {
						local52[local305] = Static122.method2600(local271[local303]);
					}
				}
			} else {
				if (local27 == null) {
					local205 = 0;
				} else {
					local205 = local27[0];
				}
				if (this.aBoolean21) {
					local52[local205] = local136;
				} else {
					local52[local205] = Static122.method2600(local136);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BII)[B")
	public final byte[] method521(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method517(null, arg0, arg1);
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)Z")
	protected final boolean method522(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && this.anIntArray60.length > arg0 && this.anIntArray60[arg0] != 0) {
			return true;
		} else if (Static79.aBoolean95) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B[B)V")
	protected final void method523(@OriginalArg(1) byte[] arg0) {
		this.anInt684 = Static55.method1325(arg0, arg0.length);
		@Pc(17) Class2_Sub3 local17 = new Class2_Sub3(Static97.method2263(arg0));
		@Pc(21) int local21 = local17.method218();
		if (local21 != 5 && local21 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local21);
		}
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = -1;
		if (local21 >= 6) {
			local17.method206();
		}
		@Pc(59) int local59 = local17.method218();
		this.anInt683 = local17.method234();
		this.anIntArray64 = new int[this.anInt683];
		for (@Pc(71) int local71 = 0; local71 < this.anInt683; local71++) {
			this.anIntArray64[local71] = local44 += local17.method234();
			if (this.anIntArray64[local71] > local46) {
				local46 = this.anIntArray64[local71];
			}
		}
		this.anIntArray60 = new int[local46 + 1];
		this.anObjectArray2 = new Object[local46 + 1];
		this.anIntArray63 = new int[local46 + 1];
		this.anIntArray59 = new int[local46 + 1];
		this.anIntArrayArray4 = new int[local46 + 1][];
		this.anIntArray62 = new int[local46 + 1];
		this.anObjectArrayArray2 = new Object[local46 + 1][];
		@Pc(162) int local162;
		@Pc(176) int local176;
		if (local59 != 0) {
			this.anIntArray61 = new int[local46 + 1];
			for (local162 = 0; local162 < local46 + 1; local162++) {
				this.anIntArray61[local162] = -1;
			}
			for (local176 = 0; local176 < this.anInt683; local176++) {
				this.anIntArray61[this.anIntArray64[local176]] = local17.method206();
			}
			this.aClass3_2 = new Class3(this.anIntArray61);
		}
		for (local162 = 0; local162 < this.anInt683; local162++) {
			this.anIntArray59[this.anIntArray64[local162]] = local17.method206();
		}
		for (local176 = 0; local176 < this.anInt683; local176++) {
			this.anIntArray62[this.anIntArray64[local176]] = local17.method206();
		}
		for (@Pc(246) int local246 = 0; local246 < this.anInt683; local246++) {
			this.anIntArray63[this.anIntArray64[local246]] = local17.method234();
		}
		@Pc(270) int local270;
		@Pc(279) int local279;
		@Pc(274) int local274;
		@Pc(287) int local287;
		@Pc(303) int local303;
		for (@Pc(264) int local264 = 0; local264 < this.anInt683; local264++) {
			local270 = this.anIntArray64[local264];
			local44 = 0;
			local274 = -1;
			local279 = this.anIntArray63[local270];
			this.anIntArrayArray4[local270] = new int[local279];
			for (local287 = 0; local287 < local279; local287++) {
				local303 = this.anIntArrayArray4[local270][local287] = local44 += local17.method234();
				if (local274 < local303) {
					local274 = local303;
				}
			}
			this.anIntArray60[local270] = local274 + 1;
			if (local279 == local274 + 1) {
				this.anIntArrayArray4[local270] = null;
			}
		}
		if (local59 == 0) {
			return;
		}
		this.aClass3Array2 = new Class3[local46 + 1];
		this.anIntArrayArray3 = new int[local46 + 1][];
		for (local270 = 0; local270 < this.anInt683; local270++) {
			local279 = this.anIntArray64[local270];
			local274 = this.anIntArray63[local279];
			this.anIntArrayArray3[local279] = new int[this.anIntArray60[local279]];
			for (local287 = 0; local287 < this.anIntArray60[local279]; local287++) {
				this.anIntArrayArray3[local279][local287] = -1;
			}
			for (local303 = 0; local303 < local274; local303++) {
				@Pc(413) int local413;
				if (this.anIntArrayArray4[local279] == null) {
					local413 = local303;
				} else {
					local413 = this.anIntArrayArray4[local279][local303];
				}
				this.anIntArrayArray3[local279][local413] = local17.method206();
			}
			this.aClass3Array2[local279] = new Class3(this.anIntArrayArray3[local279]);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)Z")
	public final boolean method524() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray64.length; local9++) {
			@Pc(16) int local16 = this.anIntArray64[local9];
			if (this.anObjectArray2[local16] == null) {
				this.method516(local16);
				if (this.anObjectArray2[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(IB)Z")
	public final boolean method525(@OriginalArg(0) int arg0) {
		if (!this.method522(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method516(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(III)[B")
	public final byte[] method526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method515(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1] == null || this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(29) boolean local29 = this.method520(null, arg1);
			if (!local29) {
				this.method516(arg1);
				local29 = this.method520(null, arg1);
				if (!local29) {
					return null;
				}
			}
		}
		return Static108.method2417(this.anObjectArrayArray2[arg1][arg0], false);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!ob;)I")
	public final int method527(@OriginalArg(1) Class60 arg0) {
		@Pc(3) Class60 local3 = arg0.method2679();
		@Pc(17) int local17 = this.aClass3_2.method53(local3.method2682());
		return this.method522(local17) ? local17 : -1;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)V")
	public final void method528(@OriginalArg(1) int arg0) {
		if (this.method522(arg0)) {
			this.anObjectArrayArray2[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)I")
	public final int method529() {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(16) int local16 = 0; local16 < this.anObjectArray2.length; local16++) {
			if (this.anIntArray63[local16] > 0) {
				local9 += this.method532(local16);
				local3 += 100;
			}
		}
		if (local3 == 0) {
			return 100;
		} else {
			return local9 * 100 / local3;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!ob;Lclient!ob;Z)Z")
	public final boolean method530(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1) {
		@Pc(7) Class60 local7 = arg1.method2679();
		@Pc(11) Class60 local11 = arg0.method2679();
		@Pc(19) int local19 = this.aClass3_2.method53(local7.method2682());
		if (this.method522(local19)) {
			@Pc(42) int local42 = this.aClass3Array2[local19].method53(local11.method2682());
			return this.method538(local19, local42);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)I")
	protected int method532(@OriginalArg(1) int arg0) {
		if (this.method522(arg0)) {
			return this.anObjectArray2[arg0] == null ? 0 : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
	public final void method533() {
		for (@Pc(1) int local1 = 0; local1 < this.anObjectArrayArray2.length; local1++) {
			this.anObjectArrayArray2[local1] = null;
		}
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(II)Z")
	public final boolean method535(@OriginalArg(1) int arg0) {
		if (this.anIntArray60.length == 1) {
			return this.method538(0, arg0);
		} else if (!this.method522(arg0)) {
			return false;
		} else if (this.anIntArray60[arg0] == 1) {
			return this.method538(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(II)V")
	protected void method536(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!ob;ILclient!ob;)[B")
	public final byte[] method537(@OriginalArg(0) Class60 arg0, @OriginalArg(2) Class60 arg1) {
		@Pc(3) Class60 local3 = arg0.method2679();
		@Pc(7) Class60 local7 = arg1.method2679();
		@Pc(15) int local15 = this.aClass3_2.method53(local3.method2682());
		if (this.method522(local15)) {
			@Pc(36) int local36 = this.aClass3Array2[local15].method53(local7.method2682());
			return this.method521(local36, local15);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(BII)Z")
	public final boolean method538(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method515(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray2[arg0] != null && this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method516(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}
}
