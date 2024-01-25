import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class100 {

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!ir", name = "y", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ir", name = "o", descriptor = "Lclient!vm;")
	private Class208 aClass208_1 = null;

	@OriginalMember(owner = "client!ir", name = "p", descriptor = "Z")
	private final boolean aBoolean158;

	@OriginalMember(owner = "client!ir", name = "O", descriptor = "Lclient!qa;")
	private final Class152 aClass152_1;

	@OriginalMember(owner = "client!ir", name = "v", descriptor = "I")
	public int anInt2828;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!qa;ZI)V")
	public Class100(@OriginalArg(0) Class152 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean158 = arg1;
		this.aClass152_1 = arg0;
		this.anInt2828 = arg2;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)I")
	public int method2283() {
		if (!this.method2312()) {
			throw new IllegalStateException("");
		}
		return this.aClass208_1.anInt6507;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)Z")
	public boolean method2284(@OriginalArg(0) int arg0) {
		if (!this.method2293(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method2285(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IB)V")
	private void method2285(@OriginalArg(0) int arg0) {
		if (this.aBoolean158) {
			this.anObjectArray1[arg0] = this.aClass152_1.method3964(arg0);
		} else {
			this.anObjectArray1[arg0] = Static18.method401(this.aClass152_1.method3964(arg0));
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZI)Z")
	private boolean method2286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2312()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass208_1.anIntArray546.length && arg1 < this.aClass208_1.anIntArray546[arg0]) {
			return true;
		} else if (Static279.aBoolean347) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BI)Z")
	public boolean method2289(@OriginalArg(1) int arg0) {
		if (!this.method2312()) {
			return false;
		} else if (this.aClass208_1.anIntArray546.length == 1) {
			return this.method2298(0, arg0);
		} else if (!this.method2293(arg0)) {
			return false;
		} else if (this.aClass208_1.anIntArray546[arg0] == 1) {
			return this.method2298(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method2290(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2312()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(21) String local21 = arg0.toLowerCase();
		@Pc(30) int local30 = this.aClass208_1.aClass169_1.method4397(Static204.method3550(local12));
		if (this.method2293(local30)) {
			@Pc(48) int local48 = this.aClass208_1.aClass169Array1[local30].method4397(Static204.method3550(local21));
			return this.method2319(local30, local48);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)I")
	public int method2291() {
		if (!this.method2312()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray1.length; local17++) {
			if (this.aClass208_1.anIntArray542[local17] > 0) {
				local15 += this.method2297(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(IB)[I")
	public int[] method2292(@OriginalArg(0) int arg0) {
		if (!this.method2293(arg0)) {
			return null;
		}
		@Pc(24) int[] local24 = this.aClass208_1.anIntArrayArray61[arg0];
		if (local24 == null) {
			local24 = new int[this.aClass208_1.anIntArray542[arg0]];
			@Pc(35) int local35 = 0;
			while (local35 < local24.length) {
				local24[local35] = local35++;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)Z")
	private boolean method2293(@OriginalArg(0) int arg0) {
		if (!this.method2312()) {
			return false;
		} else if (arg0 >= 0 && this.aClass208_1.anIntArray546.length > arg0 && this.aClass208_1.anIntArray546[arg0] != 0) {
			return true;
		} else if (Static279.aBoolean347) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZIZ)V")
	public void method2294(@OriginalArg(0) boolean arg0) {
		if (!this.method2312()) {
			return;
		}
		if (arg0) {
			this.aClass208_1.aClass169_1 = null;
			this.aClass208_1.anIntArray544 = null;
		}
		this.aClass208_1.anIntArrayArray60 = null;
		this.aClass208_1.aClass169Array1 = null;
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V")
	public void method2295() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArrayArray1.length; local10++) {
				this.anObjectArrayArray1[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(II)I")
	private int method2297(@OriginalArg(1) int arg0) {
		if (this.method2293(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass152_1.method3963(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BII)Z")
	public boolean method2298(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2286(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method2285(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "(II)I")
	public int method2300(@OriginalArg(1) int arg0) {
		if (this.method2312()) {
			@Pc(16) int local16 = this.aClass208_1.aClass169_1.method4397(arg0);
			return this.method2293(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method2303(@OriginalArg(1) String arg0) {
		if (this.method2312()) {
			@Pc(15) String local15 = arg0.toLowerCase();
			@Pc(24) int local24 = this.aClass208_1.aClass169_1.method4397(Static204.method3550(local15));
			this.method2305(local24);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method2304(@OriginalArg(0) String arg0) {
		if (this.method2312()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass208_1.aClass169_1.method4397(Static204.method3550(local12));
			return this.method2293(local27) ? local27 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "(II)V")
	private void method2305(@OriginalArg(1) int arg0) {
		this.aClass152_1.method3965(arg0);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)I")
	public int method2306() {
		return this.method2312() ? this.aClass208_1.anIntArray546.length : -1;
	}

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "(II)V")
	public void method2307(@OriginalArg(0) int arg0) {
		if (this.method2293(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method2308(@OriginalArg(1) String arg0) {
		if (this.method2312()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass208_1.aClass169_1.method4397(Static204.method3550(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(IB)I")
	public int method2309(@OriginalArg(0) int arg0) {
		return this.method2293(arg0) ? this.aClass208_1.anIntArray546[arg0] : 0;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "([IIII)[B")
	public byte[] method2310(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method2286(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(38) boolean local38 = this.method2316(arg0, arg2, arg1);
			if (!local38) {
				this.method2285(arg2);
				local38 = this.method2316(arg0, arg2, arg1);
				if (!local38) {
					return null;
				}
			}
		}
		@Pc(65) byte[] local65 = Static32.method624(false, this.anObjectArrayArray1[arg2][arg1]);
		if (this.anInt2828 == 1) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass208_1.anIntArray546[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt2828 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local65;
	}

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "(I)Z")
	public boolean method2311() {
		if (!this.method2312()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(21) int local21 = 0; local21 < this.aClass208_1.anIntArray545.length; local21++) {
			@Pc(29) int local29 = this.aClass208_1.anIntArray545[local21];
			if (this.anObjectArray1[local29] == null) {
				this.method2285(local29);
				if (this.anObjectArray1[local29] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(Z)Z")
	private boolean method2312() {
		if (this.aClass208_1 == null) {
			this.aClass208_1 = this.aClass152_1.method3962();
			if (this.aClass208_1 == null) {
				return false;
			}
			this.anObjectArray1 = new Object[this.aClass208_1.anInt6504];
			this.anObjectArrayArray1 = new Object[this.aClass208_1.anInt6504][];
		}
		return true;
	}

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "(I)V")
	public void method2313() {
		if (this.anObjectArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray1.length; local6++) {
				this.anObjectArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	public boolean method2314(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2312()) {
			return false;
		}
		@Pc(17) String local17 = arg0.toLowerCase();
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(29) int local29 = this.aClass208_1.aClass169_1.method4397(Static204.method3550(local17));
		if (this.method2293(local29)) {
			@Pc(49) int local49 = this.aClass208_1.aClass169Array1[local29].method4397(Static204.method3550(local20));
			return this.method2298(local29, local49);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "([IIII)Z")
	private boolean method2316(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method2293(arg1)) {
			return false;
		} else if (this.anObjectArray1[arg1] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass208_1.anIntArray542[arg1];
			@Pc(31) int[] local31 = this.aClass208_1.anIntArrayArray61[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass208_1.anIntArray546[arg1]];
			}
			@Pc(59) Object[] local59 = this.anObjectArrayArray1[arg1];
			@Pc(61) boolean local61 = true;
			for (@Pc(63) int local63 = 0; local63 < local25; local63++) {
				@Pc(69) int local69;
				if (local31 == null) {
					local69 = local63;
				} else {
					local69 = local31[local63];
				}
				if (local59[local69] == null) {
					local61 = false;
					break;
				}
			}
			if (local61) {
				return true;
			}
			@Pc(127) byte[] local127;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local127 = Static32.method624(false, this.anObjectArray1[arg1]);
			} else {
				local127 = Static32.method624(true, this.anObjectArray1[arg1]);
				@Pc(132) Class3_Sub4 local132 = new Class3_Sub4(local127);
				local132.method3632(arg0, local132.aByteArray70.length);
			}
			@Pc(154) byte[] local154;
			try {
				local154 = Static274.method5037(local127);
			} catch (@Pc(156) RuntimeException local156) {
				throw Static4.method41(local156, "T3 - " + (arg0 != null) + "," + arg1 + "," + local127.length + "," + Static12.method221(local127, local127.length) + "," + Static12.method221(local127, local127.length - 2) + "," + this.aClass208_1.anIntArray547[arg1] + "," + this.aClass208_1.anInt6507);
			}
			if (this.aBoolean158) {
				this.anObjectArray1[arg1] = null;
			}
			@Pc(231) int local231;
			if (local25 > 1) {
				@Pc(238) int local238;
				@Pc(251) Class3_Sub4 local251;
				@Pc(259) int local259;
				@Pc(263) int local263;
				@Pc(265) int local265;
				@Pc(319) int local319;
				@Pc(321) int local321;
				@Pc(325) int local325;
				@Pc(327) int local327;
				if (this.anInt2828 == 2) {
					local231 = local154.length;
					local231--;
					local238 = local154[local231] & 0xFF;
					local231 -= local25 * local238 * 4;
					local251 = new Class3_Sub4(local154);
					@Pc(440) int local440 = 0;
					local259 = 0;
					local251.anInt4268 = local231;
					for (local263 = 0; local263 < local238; local263++) {
						local265 = 0;
						for (local319 = 0; local319 < local25; local319++) {
							local265 += local251.method3642();
							if (local31 == null) {
								local321 = local319;
							} else {
								local321 = local31[local319];
							}
							if (local321 == arg2) {
								local440 += local265;
								local259 = local321;
							}
						}
					}
					if (local440 == 0) {
						return true;
					}
					@Pc(506) byte[] local506 = new byte[local440];
					local251.anInt4268 = local231;
					local440 = 0;
					local319 = 0;
					for (local321 = 0; local321 < local238; local321++) {
						local325 = 0;
						for (local327 = 0; local327 < local25; local327++) {
							local325 += local251.method3642();
							@Pc(535) int local535;
							if (local31 == null) {
								local535 = local327;
							} else {
								local535 = local31[local327];
							}
							if (arg2 == local535) {
								Static367.method4034(local154, local319, local506, local440, local325);
								local440 += local325;
							}
							local319 += local325;
						}
					}
					local59[local259] = local506;
				} else {
					local231 = local154.length;
					@Pc(233) int local233 = local231 - 1;
					local238 = local154[local233] & 0xFF;
					@Pc(246) int local246 = local233 - local25 * local238 * 4;
					local251 = new Class3_Sub4(local154);
					@Pc(254) int[] local254 = new int[local25];
					local251.anInt4268 = local246;
					for (local259 = 0; local259 < local238; local259++) {
						local263 = 0;
						for (local265 = 0; local265 < local25; local265++) {
							local263 += local251.method3642();
							local254[local265] += local263;
						}
					}
					@Pc(295) byte[][] local295 = new byte[local25][];
					for (local265 = 0; local265 < local25; local265++) {
						local295[local265] = new byte[local254[local265]];
						local254[local265] = 0;
					}
					local251.anInt4268 = local246;
					local319 = 0;
					for (local321 = 0; local321 < local238; local321++) {
						local325 = 0;
						for (local327 = 0; local327 < local25; local327++) {
							local325 += local251.method3642();
							Static367.method4034(local154, local319, local295[local327], local254[local327], local325);
							local254[local327] += local325;
							local319 += local325;
						}
					}
					for (local325 = 0; local325 < local25; local325++) {
						if (local31 == null) {
							local327 = local325;
						} else {
							local327 = local31[local325];
						}
						if (this.anInt2828 == 0) {
							local59[local327] = Static18.method401(local295[local325]);
						} else {
							local59[local327] = local295[local325];
						}
					}
				}
			} else {
				if (local31 == null) {
					local231 = 0;
				} else {
					local231 = local31[0];
				}
				if (this.anInt2828 == 0) {
					local59[local231] = Static18.method401(local154);
				} else {
					local59[local231] = local154;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method2317(@OriginalArg(1) String arg0) {
		if (this.method2312()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass208_1.aClass169_1.method4397(Static204.method3550(local20));
			return this.method2284(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "(IB)[B")
	public byte[] method2318(@OriginalArg(0) int arg0) {
		if (!this.method2312()) {
			return null;
		} else if (this.aClass208_1.anIntArray546.length == 1) {
			return this.method2319(0, arg0);
		} else if (!this.method2293(arg0)) {
			return null;
		} else if (this.aClass208_1.anIntArray546[arg0] == 1) {
			return this.method2319(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(IZI)[B")
	public byte[] method2319(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method2310(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method2320(@OriginalArg(0) String arg0) {
		if (this.method2312()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass208_1.aClass169_1.method4397(Static204.method3550(local17));
			return this.method2297(local26);
		} else {
			return 0;
		}
	}
}
