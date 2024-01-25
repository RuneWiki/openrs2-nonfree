import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class310 {

	@OriginalMember(owner = "client!rg", name = "O", descriptor = "[I")
	public static final int[] anIntArray465 = new int[120];

	@OriginalMember(owner = "client!rg", name = "V", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray35;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "Lclient!ai;")
	private Class16 aClass16_2 = null;

	@OriginalMember(owner = "client!rg", name = "T", descriptor = "Z")
	private final boolean aBoolean628;

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "Lclient!qha;")
	private final Class293 aClass293_1;

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
	public int anInt9032;

	static {
		@Pc(259) int local259 = 0;
		for (@Pc(261) int local261 = 0; local261 < 120; local261++) {
			@Pc(266) int local266 = local261 + 1;
			@Pc(279) int local279 = (int) ((double) local266 + Math.pow(2.0D, (double) local266 / 7.0D) * 300.0D);
			local259 += local279;
			anIntArray465[local261] = local259 / 4;
		}
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!qha;ZI)V")
	public Class310(@OriginalArg(0) Class293 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aBoolean628 = arg1;
		this.aClass293_1 = arg0;
		this.anInt9032 = arg2;
	}

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "(II)I")
	private int method7772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method7787(arg0)) {
			return 0;
		} else if (this.anObjectArray35[arg0] == null) {
			return arg1 == 9375 ? this.aClass293_1.method7307(arg0) : -84;
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)I")
	public int method7773(@OriginalArg(0) int arg0) {
		return this.method7787(arg0) ? this.aClass16_2.anIntArray20[arg0] : 0;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)Z")
	private boolean method7774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method7804()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass16_2.anIntArray20.length > arg0 && this.aClass16_2.anIntArray20[arg0] > arg1) {
			return true;
		} else if (Static169.aBoolean182) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)I")
	public int method7775(@OriginalArg(0) byte arg0) {
		if (!this.method7804()) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anObjectArray35.length; local18++) {
			if (this.aClass16_2.anIntArray15[local18] > 0) {
				local16 += this.method7772(local18, 9375);
				local14 += 100;
			}
		}
		if (arg0 > -3) {
			this.method7772(-127, -20);
		}
		if (local14 == 0) {
			return 100;
		} else {
			return local16 * 100 / local14;
		}
	}

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "(II)Z")
	public boolean method7776(@OriginalArg(0) int arg0) {
		if (!this.method7787(arg0)) {
			return false;
		} else if (this.anObjectArray35[arg0] == null) {
			this.method7806(arg0);
			return this.anObjectArray35[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZIZ)V")
	public void method7777(@OriginalArg(0) boolean arg0) {
		if (!this.method7804()) {
			return;
		}
		this.aClass16_2.anIntArrayArray6 = null;
		this.aClass16_2.aClass189Array1 = null;
		if (arg0) {
			this.aClass16_2.anIntArray21 = null;
			this.aClass16_2.aClass189_1 = null;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method7780(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = this.method7794("");
		return local8 == -1 ? this.method7807(arg0, "") : this.method7807("", arg0);
	}

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "(II)V")
	public void method7781(@OriginalArg(1) int arg0) {
		if (this.method7787(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(BI)[I")
	public int[] method7782(@OriginalArg(1) int arg0) {
		if (!this.method7787(arg0)) {
			return null;
		}
		@Pc(28) int[] local28 = this.aClass16_2.anIntArrayArray5[arg0];
		if (local28 == null) {
			local28 = new int[this.aClass16_2.anIntArray15[arg0]];
			@Pc(39) int local39 = 0;
			while (local39 < local28.length) {
				local28[local39] = local39++;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method7783(@OriginalArg(1) String arg0) {
		if (this.method7804()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass16_2.aClass189_1.method4781(Static117.method1834(local13));
			return this.method7776(local22);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)Z")
	public boolean method7784() {
		if (!this.method7804()) {
			return false;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < this.aClass16_2.anIntArray17.length; local16++) {
			@Pc(33) int local33 = this.aClass16_2.anIntArray17[local16];
			if (this.anObjectArray35[local33] == null) {
				this.method7806(local33);
				if (this.anObjectArray35[local33] == null) {
					local14 = false;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Z")
	public boolean method7785(@OriginalArg(0) int arg0) {
		if (!this.method7804()) {
			return false;
		} else if (this.aClass16_2.anIntArray20.length == 1) {
			return this.method7793(arg0, 0);
		} else if (!this.method7787(arg0)) {
			return false;
		} else if (this.aClass16_2.anIntArray20[arg0] == 1) {
			return this.method7793(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method7786(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method7804()) {
			return false;
		}
		@Pc(13) String local13 = arg0.toLowerCase();
		@Pc(22) String local22 = arg1.toLowerCase();
		@Pc(31) int local31 = this.aClass16_2.aClass189_1.method4781(Static117.method1834(local13));
		if (local31 < 0) {
			return false;
		} else {
			@Pc(47) int local47 = this.aClass16_2.aClass189Array1[local31].method4781(Static117.method1834(local22));
			return local47 >= 0;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)Z")
	private boolean method7787(@OriginalArg(1) int arg0) {
		if (!this.method7804()) {
			return false;
		} else if (arg0 >= 0 && this.aClass16_2.anIntArray20.length > arg0 && this.aClass16_2.anIntArray20[arg0] != 0) {
			return true;
		} else if (Static169.aBoolean182) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	public void method7789() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(13) int local13 = 0; local13 < this.anObjectArrayArray1.length; local13++) {
				this.anObjectArrayArray1[local13] = null;
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V")
	public void method7790() {
		if (this.anObjectArray35 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anObjectArray35.length; local4++) {
				this.anObjectArray35[local4] = null;
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "([IIII)[B")
	public byte[] method7791(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method7774(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg2] == null) {
			@Pc(33) boolean local33 = this.method7805(arg2, arg0, arg1);
			if (!local33) {
				this.method7806(arg1);
				local33 = this.method7805(arg2, arg0, arg1);
				if (!local33) {
					return null;
				}
			}
		}
		@Pc(61) byte[] local61 = Static351.method9354(false, this.anObjectArrayArray1[arg1][arg2]);
		if (this.anInt9032 == 1) {
			this.anObjectArrayArray1[arg1][arg2] = null;
			if (this.aClass16_2.anIntArray20[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt9032 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local61;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method7792(@OriginalArg(0) String arg0) {
		if (this.method7804()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass16_2.aClass189_1.method4781(Static117.method1834(local13));
			return this.method7772(local22, 9375);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(III)Z")
	public boolean method7793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method7774(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray35[arg1] == null) {
			this.method7806(arg1);
			return this.anObjectArray35[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method7794(@OriginalArg(0) String arg0) {
		if (this.method7804()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass16_2.aClass189_1.method4781(Static117.method1834(local13));
			return this.method7787(local22) ? local22 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(II)[B")
	public byte[] method7795(@OriginalArg(1) int arg0) {
		if (!this.method7804()) {
			return null;
		} else if (this.aClass16_2.anIntArray20.length == 1) {
			return this.method7803(arg0, 0);
		} else if (!this.method7787(arg0)) {
			return null;
		} else if (this.aClass16_2.anIntArray20[arg0] == 1) {
			return this.method7803(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(II)V")
	private void method7796(@OriginalArg(1) int arg0) {
		this.aClass293_1.method7305(arg0);
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)I")
	public int method7797() {
		if (!this.method7804()) {
			throw new IllegalStateException("");
		}
		return this.aClass16_2.anInt184;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method7798(@OriginalArg(1) String arg0) {
		if (this.method7804()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass16_2.aClass189_1.method4781(Static117.method1834(local13));
			return local22 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(ZLjava/lang/String;)V")
	public void method7799(@OriginalArg(1) String arg0) {
		if (this.method7804()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass16_2.aClass189_1.method4781(Static117.method1834(local12));
			this.method7796(local28);
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)I")
	public int method7800() {
		return this.method7804() ? this.aClass16_2.anIntArray20.length : -1;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method7801(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method7804()) {
			return null;
		}
		@Pc(13) String local13 = arg1.toLowerCase();
		@Pc(16) String local16 = arg0.toLowerCase();
		@Pc(25) int local25 = this.aClass16_2.aClass189_1.method4781(Static117.method1834(local13));
		if (this.method7787(local25)) {
			@Pc(49) int local49 = this.aClass16_2.aClass189Array1[local25].method4781(Static117.method1834(local16));
			return this.method7803(local49, local25);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)I")
	public int method7802(@OriginalArg(0) int arg0) {
		if (this.method7804()) {
			@Pc(27) int local27 = this.aClass16_2.aClass189_1.method4781(arg0);
			return this.method7787(local27) ? local27 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)[B")
	public byte[] method7803(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method7791((int[]) null, arg1, arg0);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)Z")
	private boolean method7804() {
		if (this.aClass16_2 == null) {
			this.aClass16_2 = this.aClass293_1.method7308();
			if (this.aClass16_2 == null) {
				return false;
			}
			this.anObjectArray35 = new Object[this.aClass16_2.anInt182];
			this.anObjectArrayArray1 = new Object[this.aClass16_2.anInt182][];
		}
		return true;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[III)Z")
	private boolean method7805(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method7787(arg2)) {
			return false;
		} else if (this.anObjectArray35[arg2] == null) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass16_2.anIntArray15[arg2];
			@Pc(41) int[] local41 = this.aClass16_2.anIntArrayArray5[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass16_2.anIntArray20[arg2]];
			}
			@Pc(63) Object[] local63 = this.anObjectArrayArray1[arg2];
			@Pc(65) boolean local65 = true;
			for (@Pc(67) int local67 = 0; local67 < local35; local67++) {
				@Pc(72) int local72;
				if (local41 == null) {
					local72 = local67;
				} else {
					local72 = local41[local67];
				}
				if (local63[local72] == null) {
					local65 = false;
					break;
				}
			}
			if (local65) {
				return true;
			}
			@Pc(144) byte[] local144;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local144 = Static351.method9354(false, this.anObjectArray35[arg2]);
			} else {
				local144 = Static351.method9354(true, this.anObjectArray35[arg2]);
				@Pc(160) Class14_Sub21 local160 = new Class14_Sub21(local144);
				local160.method7756(arg1, local160.aByteArray99.length);
			}
			@Pc(172) byte[] local172;
			try {
				local172 = Static666.method9235(local144);
			} catch (@Pc(174) RuntimeException local174) {
				throw Static62.method9405(local174, "T3 - " + (arg1 != null) + "," + arg2 + "," + local144.length + "," + Static199.method2983(local144.length, local144) + "," + Static199.method2983(local144.length - 2, local144) + "," + this.aClass16_2.anIntArray19[arg2] + "," + this.aClass16_2.anInt184);
			}
			if (this.aBoolean628) {
				this.anObjectArray35[arg2] = null;
			}
			@Pc(258) int local258;
			if (local35 > 1) {
				@Pc(265) int local265;
				@Pc(278) Class14_Sub21 local278;
				@Pc(285) int local285;
				@Pc(287) int local287;
				@Pc(290) int local290;
				@Pc(292) int local292;
				@Pc(305) int local305;
				@Pc(360) int local360;
				@Pc(362) int local362;
				if (this.anInt9032 == 2) {
					local258 = local172.length;
					@Pc(260) int local260 = local258 - 1;
					local265 = local172[local260] & 0xFF;
					@Pc(273) int local273 = local260 - local265 * 4 * local35;
					local278 = new Class14_Sub21(local172);
					@Pc(280) int local280 = 0;
					local278.anInt8936 = local273;
					local285 = 0;
					for (local287 = 0; local287 < local265; local287++) {
						local290 = 0;
						for (local292 = 0; local292 < local35; local292++) {
							local290 += local278.method7748();
							if (local41 == null) {
								local305 = local292;
							} else {
								local305 = local41[local292];
							}
							if (local305 == arg0) {
								local280 += local290;
								local285 = local305;
							}
						}
					}
					if (local280 == 0) {
						return true;
					}
					@Pc(348) byte[] local348 = new byte[local280];
					local278.anInt8936 = local273;
					local280 = 0;
					local292 = 0;
					for (local305 = 0; local305 < local265; local305++) {
						local360 = 0;
						for (local362 = 0; local362 < local35; local362++) {
							local360 += local278.method7748();
							@Pc(373) int local373;
							if (local41 == null) {
								local373 = local362;
							} else {
								local373 = local41[local362];
							}
							if (arg0 == local373) {
								Static691.method82(local172, local292, local348, local280, local360);
								local280 += local360;
							}
							local292 += local360;
						}
					}
					local63[local285] = local348;
				} else {
					local258 = local172.length;
					local258--;
					local265 = local172[local258] & 0xFF;
					local258 -= local265 * 4 * local35;
					local278 = new Class14_Sub21(local172);
					local278.anInt8936 = local258;
					@Pc(444) int[] local444 = new int[local35];
					for (local285 = 0; local285 < local265; local285++) {
						local287 = 0;
						for (local290 = 0; local290 < local35; local290++) {
							local287 += local278.method7748();
							local444[local290] += local287;
						}
					}
					@Pc(478) byte[][] local478 = new byte[local35][];
					for (local290 = 0; local290 < local35; local290++) {
						local478[local290] = new byte[local444[local290]];
						local444[local290] = 0;
					}
					local278.anInt8936 = local258;
					local292 = 0;
					for (local305 = 0; local305 < local265; local305++) {
						local360 = 0;
						for (local362 = 0; local362 < local35; local362++) {
							local360 += local278.method7748();
							Static691.method82(local172, local292, local478[local362], local444[local362], local360);
							local444[local362] += local360;
							local292 += local360;
						}
					}
					for (local360 = 0; local360 < local35; local360++) {
						if (local41 == null) {
							local362 = local360;
						} else {
							local362 = local41[local360];
						}
						if (this.anInt9032 == 0) {
							local63[local362] = Static649.method9108(local478[local360]);
						} else {
							local63[local362] = local478[local360];
						}
					}
				}
			} else {
				if (local41 == null) {
					local258 = 0;
				} else {
					local258 = local41[0];
				}
				if (this.anInt9032 == 0) {
					local63[local258] = Static649.method9108(local172);
				} else {
					local63[local258] = local172;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(II)V")
	private void method7806(@OriginalArg(1) int arg0) {
		if (this.aBoolean628) {
			this.anObjectArray35[arg0] = this.aClass293_1.method7306(arg0);
		} else {
			this.anObjectArray35[arg0] = Static649.method9108(this.aClass293_1.method7306(arg0));
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	private boolean method7807(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method7804()) {
			return false;
		}
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass16_2.aClass189_1.method4781(Static117.method1834(local20));
		if (this.method7787(local32)) {
			@Pc(51) int local51 = this.aClass16_2.aClass189Array1[local32].method4781(Static117.method1834(local23));
			return this.method7793(local51, local32);
		} else {
			return false;
		}
	}
}
