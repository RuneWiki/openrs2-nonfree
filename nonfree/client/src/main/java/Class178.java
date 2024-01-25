import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class178 {

	@OriginalMember(owner = "client!ok", name = "I", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray36;

	@OriginalMember(owner = "client!ok", name = "J", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "Lclient!eq;")
	private Class71 aClass71_1 = null;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "Z")
	private final boolean aBoolean302;

	@OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
	public int anInt4835;

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "Lclient!ad;")
	private final Class4 aClass4_1;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!ad;ZI)V")
	public Class178(@OriginalArg(0) Class4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean302 = arg1;
		this.anInt4835 = arg2;
		this.aClass4_1 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	public void method3814() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZIZ)V")
	public void method3815(@OriginalArg(2) boolean arg0) {
		if (!this.method3842()) {
			return;
		}
		if (arg0) {
			this.aClass71_1.anIntArray128 = null;
			this.aClass71_1.aClass219_1 = null;
		}
		this.aClass71_1.anIntArrayArray11 = null;
		this.aClass71_1.aClass219Array1 = null;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method3816(@OriginalArg(1) String arg0) {
		if (this.method3842()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass71_1.aClass219_1.method4467(Static101.method1748(local11));
			this.method3830(local22);
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III[I)[B")
	public byte[] method3818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method3827(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(32) boolean local32 = this.method3847(arg0, arg1, arg2);
			if (!local32) {
				this.method3831(arg0);
				local32 = this.method3847(arg0, arg1, arg2);
				if (!local32) {
					return null;
				}
			}
		}
		@Pc(61) byte[] local61 = Static333.method2749(false, this.anObjectArrayArray1[arg0][arg1]);
		if (this.anInt4835 == 1) {
			this.anObjectArrayArray1[arg0][arg1] = null;
			if (this.aClass71_1.anIntArray132[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt4835 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local61;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)[I")
	public int[] method3819(@OriginalArg(1) int arg0) {
		if (!this.method3839(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass71_1.anIntArrayArray12[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass71_1.anIntArray129[arg0]];
			@Pc(34) int local34 = 0;
			while (local23.length > local34) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method3820(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3842()) {
			return false;
		}
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(23) String local23 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass71_1.aClass219_1.method4467(Static101.method1748(local20));
		if (this.method3839(local32)) {
			@Pc(50) int local50 = this.aClass71_1.aClass219Array1[local32].method4467(Static101.method1748(local23));
			return this.method3835(local32, local50);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)I")
	private int method3821(@OriginalArg(0) int arg0) {
		if (this.method3839(arg0)) {
			return this.anObjectArray36[arg0] == null ? this.aClass4_1.method5780(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method3822(@OriginalArg(0) String arg0) {
		if (this.method3842()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass71_1.aClass219_1.method4467(Static101.method1748(local17));
			return this.method3843(local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(II)[B")
	public byte[] method3823(@OriginalArg(0) int arg0) {
		if (!this.method3842()) {
			return null;
		} else if (this.aClass71_1.anIntArray132.length == 1) {
			return this.method3838(arg0, 0);
		} else if (!this.method3839(arg0)) {
			return null;
		} else if (this.aClass71_1.anIntArray132[arg0] == 1) {
			return this.method3838(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(II)V")
	public void method3824(@OriginalArg(0) int arg0) {
		if (this.method3839(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(Z)V")
	public void method3825() {
		if (this.anObjectArray36 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray36.length; local6++) {
				this.anObjectArray36[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method3826(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3842()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(19) String local19 = arg0.toLowerCase();
		@Pc(30) int local30 = this.aClass71_1.aClass219_1.method4467(Static101.method1748(local12));
		if (this.method3839(local30)) {
			@Pc(48) int local48 = this.aClass71_1.aClass219Array1[local30].method4467(Static101.method1748(local19));
			return this.method3838(local48, local30);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBI)Z")
	private boolean method3827(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3842()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass71_1.anIntArray132.length > arg0 && this.aClass71_1.anIntArray132[arg0] > arg1) {
			return true;
		} else if (Static95.aBoolean107) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method3828(@OriginalArg(0) String arg0) {
		if (this.method3842()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass71_1.aClass219_1.method4467(Static101.method1748(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "(II)I")
	public int method3829(@OriginalArg(0) int arg0) {
		if (this.method3842()) {
			@Pc(21) int local21 = this.aClass71_1.aClass219_1.method4467(arg0);
			return this.method3839(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "(II)V")
	private void method3830(@OriginalArg(1) int arg0) {
		this.aClass4_1.method5782(arg0);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)V")
	private void method3831(@OriginalArg(1) int arg0) {
		if (this.aBoolean302) {
			this.anObjectArray36[arg0] = this.aClass4_1.method5777(arg0);
		} else {
			this.anObjectArray36[arg0] = Static335.method4376(this.aClass4_1.method5777(arg0));
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)I")
	public int method3832() {
		return this.method3842() ? this.aClass71_1.anIntArray132.length : -1;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZI)I")
	public int method3833(@OriginalArg(1) int arg0) {
		return this.method3839(arg0) ? this.aClass71_1.anIntArray132[arg0] : 0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Z")
	public boolean method3835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3827(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray36[arg0] == null) {
			this.method3831(arg0);
			return this.anObjectArray36[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method3836(@OriginalArg(1) String arg0) {
		if (this.method3842()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass71_1.aClass219_1.method4467(Static101.method1748(local12));
			return this.method3839(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method3837(@OriginalArg(1) String arg0) {
		if (this.method3842()) {
			@Pc(16) String local16 = arg0.toLowerCase();
			@Pc(25) int local25 = this.aClass71_1.aClass219_1.method4467(Static101.method1748(local16));
			return this.method3821(local25);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIB)[B")
	public byte[] method3838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method3818(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZ)Z")
	private boolean method3839(@OriginalArg(0) int arg0) {
		if (!this.method3842()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass71_1.anIntArray132.length && this.aClass71_1.anIntArray132[arg0] != 0) {
			return true;
		} else if (Static95.aBoolean107) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)I")
	public int method3840() {
		if (!this.method3842()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray36.length; local17++) {
			if (this.aClass71_1.anIntArray129[local17] > 0) {
				local15 += this.method3821(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Z")
	public boolean method3841() {
		if (!this.method3842()) {
			return false;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.aClass71_1.anIntArray127.length; local20++) {
			@Pc(28) int local28 = this.aClass71_1.anIntArray127[local20];
			if (this.anObjectArray36[local28] == null) {
				this.method3831(local28);
				if (this.anObjectArray36[local28] == null) {
					local18 = false;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(B)Z")
	private boolean method3842() {
		if (this.aClass71_1 == null) {
			this.aClass71_1 = this.aClass4_1.method5781();
			if (this.aClass71_1 == null) {
				return false;
			}
			this.anObjectArray36 = new Object[this.aClass71_1.anInt1988];
			this.anObjectArrayArray1 = new Object[this.aClass71_1.anInt1988][];
		}
		return true;
	}

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "(II)Z")
	public boolean method3843(@OriginalArg(0) int arg0) {
		if (!this.method3839(arg0)) {
			return false;
		} else if (this.anObjectArray36[arg0] == null) {
			this.method3831(arg0);
			return this.anObjectArray36[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "(B)I")
	public int method3846() {
		if (!this.method3842()) {
			throw new IllegalStateException("");
		}
		return this.aClass71_1.anInt1993;
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(III[I)Z")
	private boolean method3847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method3839(arg0)) {
			return false;
		} else if (this.anObjectArray36[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass71_1.anIntArray129[arg0];
			@Pc(31) int[] local31 = this.aClass71_1.anIntArrayArray12[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass71_1.anIntArray132[arg0]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg0];
			@Pc(53) boolean local53 = true;
			for (@Pc(63) int local63 = 0; local63 < local25; local63++) {
				@Pc(69) int local69;
				if (local31 == null) {
					local69 = local63;
				} else {
					local69 = local31[local63];
				}
				if (local51[local69] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(123) byte[] local123;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local123 = Static333.method2749(false, this.anObjectArray36[arg0]);
			} else {
				local123 = Static333.method2749(true, this.anObjectArray36[arg0]);
				@Pc(138) Class7_Sub14 local138 = new Class7_Sub14(local123);
				local138.method3984(arg2, local138.aByteArray75.length);
			}
			@Pc(150) byte[] local150;
			try {
				local150 = Static212.method3044(local123);
			} catch (@Pc(152) RuntimeException local152) {
				throw Static371.method4756(local152, "T3 - " + (arg2 != null) + "," + arg0 + "," + local123.length + "," + Static341.method4429(local123.length, local123) + "," + Static341.method4429(local123.length - 2, local123) + "," + this.aClass71_1.anIntArray131[arg0] + "," + this.aClass71_1.anInt1993);
			}
			if (this.aBoolean302) {
				this.anObjectArray36[arg0] = null;
			}
			@Pc(224) int local224;
			if (local25 <= 1) {
				if (local31 == null) {
					local224 = 0;
				} else {
					local224 = local31[0];
				}
				if (this.anInt4835 == 0) {
					local51[local224] = Static335.method4376(local150);
				} else {
					local51[local224] = local150;
				}
			} else {
				@Pc(264) int local264;
				@Pc(277) Class7_Sub14 local277;
				@Pc(281) int local281;
				@Pc(286) int local286;
				@Pc(290) int local290;
				@Pc(292) int local292;
				@Pc(306) int local306;
				@Pc(351) int local351;
				@Pc(353) int local353;
				if (this.anInt4835 == 2) {
					local224 = local150.length;
					local224--;
					local264 = local150[local224] & 0xFF;
					local224 -= local25 * local264 * 4;
					local277 = new Class7_Sub14(local150);
					@Pc(279) int local279 = 0;
					local281 = 0;
					local277.anInt4989 = local224;
					for (local286 = 0; local286 < local264; local286++) {
						local290 = 0;
						for (local292 = 0; local292 < local25; local292++) {
							local290 += local277.method3938();
							if (local31 == null) {
								local306 = local292;
							} else {
								local306 = local31[local292];
							}
							if (local306 == arg1) {
								local281 = local306;
								local279 += local290;
							}
						}
					}
					if (local279 == 0) {
						return true;
					}
					@Pc(338) byte[] local338 = new byte[local279];
					local279 = 0;
					local277.anInt4989 = local224;
					local292 = 0;
					for (local306 = 0; local306 < local264; local306++) {
						local351 = 0;
						for (local353 = 0; local353 < local25; local353++) {
							local351 += local277.method3938();
							@Pc(367) int local367;
							if (local31 == null) {
								local367 = local353;
							} else {
								local367 = local31[local353];
							}
							if (arg1 == local367) {
								Static464.method3633(local150, local292, local338, local279, local351);
								local279 += local351;
							}
							local292 += local351;
						}
					}
					local51[local281] = local338;
				} else {
					local224 = local150.length;
					local224--;
					local264 = local150[local224] & 0xFF;
					local224 -= local264 * local25 * 4;
					local277 = new Class7_Sub14(local150);
					local277.anInt4989 = local224;
					@Pc(431) int[] local431 = new int[local25];
					for (local281 = 0; local281 < local264; local281++) {
						local286 = 0;
						for (local290 = 0; local290 < local25; local290++) {
							local286 += local277.method3938();
							local431[local290] += local286;
						}
					}
					@Pc(469) byte[][] local469 = new byte[local25][];
					for (local290 = 0; local290 < local25; local290++) {
						local469[local290] = new byte[local431[local290]];
						local431[local290] = 0;
					}
					local277.anInt4989 = local224;
					local292 = 0;
					for (local306 = 0; local306 < local264; local306++) {
						local351 = 0;
						for (local353 = 0; local353 < local25; local353++) {
							local351 += local277.method3938();
							Static464.method3633(local150, local292, local469[local353], local431[local353], local351);
							local292 += local351;
							local431[local353] += local351;
						}
					}
					for (local351 = 0; local351 < local25; local351++) {
						if (local31 == null) {
							local353 = local351;
						} else {
							local353 = local31[local351];
						}
						if (this.anInt4835 == 0) {
							local51[local353] = Static335.method4376(local469[local351]);
						} else {
							local51[local353] = local469[local351];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "(II)Z")
	public boolean method3848(@OriginalArg(1) int arg0) {
		if (!this.method3842()) {
			return false;
		} else if (this.aClass71_1.anIntArray132.length == 1) {
			return this.method3835(0, arg0);
		} else if (!this.method3839(arg0)) {
			return false;
		} else if (this.aClass71_1.anIntArray132[arg0] == 1) {
			return this.method3835(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
