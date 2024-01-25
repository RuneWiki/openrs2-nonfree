import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gda")
public final class Class126 {

	@OriginalMember(owner = "client!gda", name = "u", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!gda", name = "h", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!gda", name = "H", descriptor = "Lclient!ia;")
	private Class162 aClass162_1 = null;

	@OriginalMember(owner = "client!gda", name = "C", descriptor = "Lclient!lj;")
	private final Class222 aClass222_1;

	@OriginalMember(owner = "client!gda", name = "I", descriptor = "I")
	public int anInt3317;

	@OriginalMember(owner = "client!gda", name = "E", descriptor = "Z")
	private final boolean aBoolean243;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!lj;ZI)V")
	public Class126(@OriginalArg(0) Class222 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aClass222_1 = arg0;
		this.anInt3317 = arg2;
		this.aBoolean243 = arg1;
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)Z")
	private boolean method3060() {
		if (this.aClass162_1 == null) {
			this.aClass162_1 = this.aClass222_1.method7703();
			if (this.aClass162_1 == null) {
				return false;
			}
			this.anObjectArray1 = new Object[this.aClass162_1.anInt3981];
			this.anObjectArrayArray1 = new Object[this.aClass162_1.anInt3981][];
		}
		return true;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IB)I")
	public int method3061(@OriginalArg(0) int arg0) {
		if (this.method3060()) {
			@Pc(26) int local26 = this.aClass162_1.aClass26_1.method501(arg0);
			return this.method3064(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!gda", name = "e", descriptor = "(II)I")
	public int method3062(@OriginalArg(1) int arg0) {
		return this.method3064(arg0) ? this.aClass162_1.anIntArray197[arg0] : 0;
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(I)Z")
	public boolean method3063() {
		if (!this.method3060()) {
			return false;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < this.aClass162_1.anIntArray199.length; local16++) {
			@Pc(36) int local36 = this.aClass162_1.anIntArray199[local16];
			if (this.anObjectArray1[local36] == null) {
				this.method3081(local36);
				if (this.anObjectArray1[local36] == null) {
					local14 = false;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(BI)Z")
	private boolean method3064(@OriginalArg(1) int arg0) {
		if (!this.method3060()) {
			return false;
		} else if (arg0 >= 0 && this.aClass162_1.anIntArray197.length > arg0 && this.aClass162_1.anIntArray197[arg0] != 0) {
			return true;
		} else if (Static12.aBoolean10) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "(I)I")
	public int method3066() {
		if (!this.method3060()) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anObjectArray1.length; local18++) {
			if (this.aClass162_1.anIntArray198[local18] > 0) {
				local14 += 100;
				local16 += this.method3088(local18);
			}
		}
		if (local14 == 0) {
			return 100;
		} else {
			return local16 * 100 / local14;
		}
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method3067(@OriginalArg(1) String arg0) {
		if (this.method3060()) {
			@Pc(21) String local21 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass162_1.aClass26_1.method501(Static218.method3474(local21));
			return this.method3064(local30) ? local30 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(III)Z")
	public boolean method3068(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3091(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method3081(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IZ)[B")
	public byte[] method3069(@OriginalArg(0) int arg0) {
		if (!this.method3060()) {
			return null;
		} else if (this.aClass162_1.anIntArray197.length == 1) {
			return this.method3086(arg0, 0);
		} else if (!this.method3064(arg0)) {
			return null;
		} else if (this.aClass162_1.anIntArray197[arg0] == 1) {
			return this.method3086(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "(B)I")
	public int method3070() {
		if (!this.method3060()) {
			throw new IllegalStateException("");
		}
		return this.aClass162_1.anInt3982;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)V")
	public void method3071(@OriginalArg(0) int arg0) {
		if (this.method3064(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	public boolean method3072(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3060()) {
			return false;
		}
		@Pc(13) String local13 = arg1.toLowerCase();
		@Pc(16) String local16 = arg0.toLowerCase();
		@Pc(25) int local25 = this.aClass162_1.aClass26_1.method501(Static218.method3474(local13));
		if (local25 < 0) {
			return false;
		} else {
			@Pc(52) int local52 = this.aClass162_1.aClass26Array1[local25].method501(Static218.method3474(local16));
			return local52 >= 0;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method3073(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3060()) {
			return null;
		}
		@Pc(13) String local13 = arg1.toLowerCase();
		@Pc(16) String local16 = arg0.toLowerCase();
		@Pc(25) int local25 = this.aClass162_1.aClass26_1.method501(Static218.method3474(local13));
		if (this.method3064(local25)) {
			@Pc(44) int local44 = this.aClass162_1.aClass26Array1[local25].method501(Static218.method3474(local16));
			return this.method3086(local44, local25);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3074(@OriginalArg(1) String arg0) {
		if (this.method3060()) {
			@Pc(21) String local21 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass162_1.aClass26_1.method501(Static218.method3474(local21));
			return this.method3084(local30);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3075(@OriginalArg(1) String arg0) {
		if (this.method3060()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass162_1.aClass26_1.method501(Static218.method3474(local13));
			return local22 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(II[II)[B")
	public byte[] method3076(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method3091(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(33) boolean local33 = this.method3089(arg0, arg1, arg2);
			if (!local33) {
				this.method3081(arg0);
				local33 = this.method3089(arg0, arg1, arg2);
				if (!local33) {
					return null;
				}
			}
		}
		@Pc(69) byte[] local69 = Static553.method7508(this.anObjectArrayArray1[arg0][arg2], false);
		if (this.anInt3317 == 1) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass162_1.anIntArray197[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt3317 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local69;
	}

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "(II)Z")
	public boolean method3077(@OriginalArg(1) int arg0) {
		if (!this.method3060()) {
			return false;
		} else if (this.aClass162_1.anIntArray197.length == 1) {
			return this.method3068(0, arg0);
		} else if (!this.method3064(arg0)) {
			return false;
		} else if (this.aClass162_1.anIntArray197[arg0] == 1) {
			return this.method3068(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Z")
	private boolean method3078(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method3060()) {
			return false;
		}
		@Pc(13) String local13 = arg0.toLowerCase();
		@Pc(16) String local16 = arg1.toLowerCase();
		@Pc(25) int local25 = this.aClass162_1.aClass26_1.method501(Static218.method3474(local13));
		if (this.method3064(local25)) {
			@Pc(51) int local51 = this.aClass162_1.aClass26Array1[local25].method501(Static218.method3474(local16));
			return this.method3068(local25, local51);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method3079(@OriginalArg(1) String arg0) {
		if (this.method3060()) {
			@Pc(23) String local23 = arg0.toLowerCase();
			@Pc(32) int local32 = this.aClass162_1.aClass26_1.method501(Static218.method3474(local23));
			this.method3080(local32);
		}
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(II)V")
	private void method3080(@OriginalArg(1) int arg0) {
		this.aClass222_1.method7708(arg0);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(BI)V")
	private void method3081(@OriginalArg(1) int arg0) {
		if (this.aBoolean243) {
			this.anObjectArray1[arg0] = this.aClass222_1.method7704(arg0);
		} else {
			this.anObjectArray1[arg0] = Static72.method1167(this.aClass222_1.method7704(arg0));
		}
	}

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "(I)I")
	public int method3082() {
		return this.method3060() ? this.aClass162_1.anIntArray197.length : -1;
	}

	@OriginalMember(owner = "client!gda", name = "d", descriptor = "(II)[I")
	public int[] method3083(@OriginalArg(0) int arg0) {
		if (!this.method3064(arg0)) {
			return null;
		}
		@Pc(27) int[] local27 = this.aClass162_1.anIntArrayArray32[arg0];
		if (local27 == null) {
			local27 = new int[this.aClass162_1.anIntArray198[arg0]];
			@Pc(38) int local38 = 0;
			while (local27.length > local38) {
				local27[local38] = local38++;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!gda", name = "g", descriptor = "(II)Z")
	public boolean method3084(@OriginalArg(0) int arg0) {
		if (!this.method3064(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method3081(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method3085(@OriginalArg(0) String arg0) {
		@Pc(10) int local10 = this.method3067("");
		return local10 == -1 ? this.method3078(arg0, "") : this.method3078("", arg0);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(BII)[B")
	public byte[] method3086(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method3076(arg1, (int[]) null, arg0);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method3087(@OriginalArg(0) String arg0) {
		if (this.method3060()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass162_1.aClass26_1.method501(Static218.method3474(local13));
			return this.method3088(local22);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gda", name = "f", descriptor = "(II)I")
	private int method3088(@OriginalArg(1) int arg0) {
		if (this.method3064(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass222_1.method7707(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(II[II)Z")
	private boolean method3089(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method3064(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			return false;
		} else {
			@Pc(27) int local27 = this.aClass162_1.anIntArray198[arg0];
			@Pc(33) int[] local33 = this.aClass162_1.anIntArrayArray32[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass162_1.anIntArray197[arg0]];
			}
			@Pc(55) Object[] local55 = this.anObjectArrayArray1[arg0];
			@Pc(57) boolean local57 = true;
			for (@Pc(59) int local59 = 0; local59 < local27; local59++) {
				@Pc(69) int local69;
				if (local33 == null) {
					local69 = local59;
				} else {
					local69 = local33[local59];
				}
				if (local55[local69] == null) {
					local57 = false;
					break;
				}
			}
			if (local57) {
				return true;
			}
			@Pc(144) byte[] local144;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local144 = Static553.method7508(this.anObjectArray1[arg0], false);
			} else {
				local144 = Static553.method7508(this.anObjectArray1[arg0], true);
				@Pc(159) Class5_Sub36 local159 = new Class5_Sub36(local144);
				local159.method7276(local159.aByteArray89.length, arg1);
			}
			@Pc(171) byte[] local171;
			try {
				local171 = Static262.method4273(local144);
			} catch (@Pc(173) RuntimeException local173) {
				throw Static637.method6719(local173, "T3 - " + (arg1 != null) + "," + arg0 + "," + local144.length + "," + Static363.method5288(local144.length, local144) + "," + Static363.method5288(local144.length - 2, local144) + "," + this.aClass162_1.anIntArray200[arg0] + "," + this.aClass162_1.anInt3982);
			}
			if (this.aBoolean243) {
				this.anObjectArray1[arg0] = null;
			}
			@Pc(254) int local254;
			if (local27 <= 1) {
				if (local33 == null) {
					local254 = 0;
				} else {
					local254 = local33[0];
				}
				if (this.anInt3317 == 0) {
					local55[local254] = Static72.method1167(local171);
				} else {
					local55[local254] = local171;
				}
			} else {
				@Pc(301) int local301;
				@Pc(314) Class5_Sub36 local314;
				@Pc(322) int local322;
				@Pc(328) int local328;
				@Pc(330) int local330;
				@Pc(396) int local396;
				@Pc(398) int local398;
				@Pc(404) int local404;
				@Pc(406) int local406;
				if (this.anInt3317 == 2) {
					local254 = local171.length;
					local254--;
					local301 = local171[local254] & 0xFF;
					local254 -= local301 * local27 * 4;
					local314 = new Class5_Sub36(local171);
					@Pc(539) int local539 = 0;
					local314.anInt8456 = local254;
					local322 = 0;
					for (local328 = 0; local328 < local301; local328++) {
						local330 = 0;
						for (local396 = 0; local396 < local27; local396++) {
							local330 += local314.method7268();
							if (local33 == null) {
								local398 = local396;
							} else {
								local398 = local33[local396];
							}
							if (arg2 == local398) {
								local539 += local330;
								local322 = local398;
							}
						}
					}
					if (local539 == 0) {
						return true;
					}
					@Pc(616) byte[] local616 = new byte[local539];
					local539 = 0;
					local314.anInt8456 = local254;
					local396 = 0;
					for (local398 = 0; local398 < local301; local398++) {
						local404 = 0;
						for (local406 = 0; local406 < local27; local406++) {
							local404 += local314.method7268();
							@Pc(643) int local643;
							if (local33 == null) {
								local643 = local406;
							} else {
								local643 = local33[local406];
							}
							if (local643 == arg2) {
								Static693.method8320(local171, local396, local616, local539, local404);
								local539 += local404;
							}
							local396 += local404;
						}
					}
					local55[local322] = local616;
				} else {
					local254 = local171.length;
					local254--;
					local301 = local171[local254] & 0xFF;
					local254 -= local301 * 4 * local27;
					local314 = new Class5_Sub36(local171);
					local314.anInt8456 = local254;
					@Pc(320) int[] local320 = new int[local27];
					for (local322 = 0; local322 < local301; local322++) {
						local328 = 0;
						for (local330 = 0; local330 < local27; local330++) {
							local328 += local314.method7268();
							local320[local330] += local328;
						}
					}
					@Pc(364) byte[][] local364 = new byte[local27][];
					for (local330 = 0; local330 < local27; local330++) {
						local364[local330] = new byte[local320[local330]];
						local320[local330] = 0;
					}
					local314.anInt8456 = local254;
					local396 = 0;
					for (local398 = 0; local398 < local301; local398++) {
						local404 = 0;
						for (local406 = 0; local406 < local27; local406++) {
							local404 += local314.method7268();
							Static693.method8320(local171, local396, local364[local406], local320[local406], local404);
							local396 += local404;
							local320[local406] += local404;
						}
					}
					for (local404 = 0; local404 < local27; local404++) {
						if (local33 == null) {
							local406 = local404;
						} else {
							local406 = local33[local404];
						}
						if (this.anInt3317 == 0) {
							local55[local406] = Static72.method1167(local364[local404]);
						} else {
							local55[local406] = local364[local404];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Z)V")
	public void method3090() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArrayArray1.length; local10++) {
				this.anObjectArrayArray1[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IBI)Z")
	private boolean method3091(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3060()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass162_1.anIntArray197.length > arg0 && arg1 < this.aClass162_1.anIntArray197[arg0]) {
			return true;
		} else if (Static12.aBoolean10) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZBZ)V")
	public void method3092(@OriginalArg(2) boolean arg0) {
		if (!this.method3060()) {
			return;
		}
		if (arg0) {
			this.aClass162_1.aClass26_1 = null;
			this.aClass162_1.anIntArray196 = null;
		}
		this.aClass162_1.anIntArrayArray31 = null;
		this.aClass162_1.aClass26Array1 = null;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
	public void method3093() {
		if (this.anObjectArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray1.length; local6++) {
				this.anObjectArray1[local6] = null;
			}
		}
	}
}
