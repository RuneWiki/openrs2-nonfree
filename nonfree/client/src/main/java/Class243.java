import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class243 {

	@OriginalMember(owner = "client!um", name = "E", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray36;

	@OriginalMember(owner = "client!um", name = "H", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!um", name = "e", descriptor = "Lclient!sq;")
	private Class226 aClass226_2 = null;

	@OriginalMember(owner = "client!um", name = "s", descriptor = "I")
	public int anInt6915;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "Lclient!hs;")
	private final Class104 aClass104_1;

	@OriginalMember(owner = "client!um", name = "f", descriptor = "Z")
	private final boolean aBoolean463;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!hs;ZI)V")
	public Class243(@OriginalArg(0) Class104 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt6915 = arg2;
		this.aClass104_1 = arg0;
		this.aBoolean463 = arg1;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZZ)V")
	public void method5450(@OriginalArg(2) boolean arg0) {
		if (!this.method5464()) {
			return;
		}
		this.aClass226_2.anIntArrayArray55 = null;
		this.aClass226_2.aClass121Array1 = null;
		if (arg0) {
			this.aClass226_2.aClass121_1 = null;
			this.aClass226_2.anIntArray437 = null;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
	public void method5451() {
		if (this.anObjectArray36 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray36.length; local6++) {
				this.anObjectArray36[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(B)V")
	public void method5452() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method5453(@OriginalArg(0) String arg0) {
		if (this.method5464()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass226_2.aClass121_1.method2562(Static164.method2261(local17));
			return this.method5470(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(III)[B")
	public byte[] method5455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method5476(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5456(@OriginalArg(1) String arg0) {
		if (this.method5464()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass226_2.aClass121_1.method2562(Static164.method2261(local17));
			return local26 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)V")
	private void method5457(@OriginalArg(0) int arg0) {
		this.aClass104_1.method2259(arg0);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZI)Z")
	private boolean method5458(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5464()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass226_2.anIntArray439.length > arg0 && this.aClass226_2.anIntArray439[arg0] > arg1) {
			return true;
		} else if (Static306.aBoolean161) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(II)[B")
	public byte[] method5459(@OriginalArg(0) int arg0) {
		if (!this.method5464()) {
			return null;
		} else if (this.aClass226_2.anIntArray439.length == 1) {
			return this.method5455(arg0, 0);
		} else if (!this.method5475(arg0)) {
			return null;
		} else if (this.aClass226_2.anIntArray439[arg0] == 1) {
			return this.method5455(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)I")
	public int method5460() {
		if (!this.method5464()) {
			throw new IllegalStateException("");
		}
		return this.aClass226_2.anInt6259;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method5461(@OriginalArg(0) String arg0) {
		if (this.method5464()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass226_2.aClass121_1.method2562(Static164.method2261(local19));
			return this.method5475(local28) ? local28 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method5462(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5464()) {
			return null;
		}
		@Pc(16) String local16 = arg1.toLowerCase();
		@Pc(19) String local19 = arg0.toLowerCase();
		@Pc(28) int local28 = this.aClass226_2.aClass121_1.method2562(Static164.method2261(local16));
		if (this.method5475(local28)) {
			@Pc(46) int local46 = this.aClass226_2.aClass121Array1[local28].method2562(Static164.method2261(local19));
			return this.method5455(local46, local28);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BI)Z")
	public boolean method5463(@OriginalArg(1) int arg0) {
		if (!this.method5464()) {
			return false;
		} else if (this.aClass226_2.anIntArray439.length == 1) {
			return this.method5482(0, arg0);
		} else if (!this.method5475(arg0)) {
			return false;
		} else if (this.aClass226_2.anIntArray439[arg0] == 1) {
			return this.method5482(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(I)Z")
	private boolean method5464() {
		if (this.aClass226_2 == null) {
			this.aClass226_2 = this.aClass104_1.method2260();
			if (this.aClass226_2 == null) {
				return false;
			}
			this.anObjectArray36 = new Object[this.aClass226_2.anInt6258];
			this.anObjectArrayArray1 = new Object[this.aClass226_2.anInt6258][];
		}
		return true;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZI[II)Z")
	private boolean method5465(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method5475(arg2)) {
			return false;
		} else if (this.anObjectArray36[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass226_2.anIntArray438[arg2];
			@Pc(31) int[] local31 = this.aClass226_2.anIntArrayArray56[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass226_2.anIntArray439[arg2]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg2];
			@Pc(53) boolean local53 = true;
			for (@Pc(55) int local55 = 0; local55 < local25; local55++) {
				@Pc(61) int local61;
				if (local31 == null) {
					local61 = local55;
				} else {
					local61 = local31[local55];
				}
				if (local51[local61] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(115) byte[] local115;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local115 = Static27.method444(false, this.anObjectArray36[arg2]);
			} else {
				local115 = Static27.method444(true, this.anObjectArray36[arg2]);
				@Pc(130) Class5_Sub15 local130 = new Class5_Sub15(local115);
				local130.method5544(arg1, local130.aByteArray93.length);
			}
			@Pc(142) byte[] local142;
			try {
				local142 = Static96.method1353(local115);
			} catch (@Pc(144) RuntimeException local144) {
				throw Static106.method5681(local144, "T3 - " + (arg1 != null) + "," + arg2 + "," + local115.length + "," + Static36.method616(local115, local115.length) + "," + Static36.method616(local115, local115.length - 2) + "," + this.aClass226_2.anIntArray441[arg2] + "," + this.aClass226_2.anInt6259);
			}
			if (this.aBoolean463) {
				this.anObjectArray36[arg2] = null;
			}
			@Pc(216) int local216;
			if (local25 <= 1) {
				if (local31 == null) {
					local216 = 0;
				} else {
					local216 = local31[0];
				}
				if (this.anInt6915 == 0) {
					local51[local216] = Static148.method2143(local142);
				} else {
					local51[local216] = local142;
				}
			} else {
				@Pc(252) int local252;
				@Pc(265) Class5_Sub15 local265;
				@Pc(269) int local269;
				@Pc(274) int local274;
				@Pc(278) int local278;
				@Pc(280) int local280;
				@Pc(294) int local294;
				@Pc(343) int local343;
				@Pc(345) int local345;
				if (this.anInt6915 == 2) {
					local216 = local142.length;
					local216--;
					local252 = local142[local216] & 0xFF;
					local216 -= local25 * 4 * local252;
					local265 = new Class5_Sub15(local142);
					@Pc(267) int local267 = 0;
					local269 = 0;
					local265.anInt7013 = local216;
					for (local274 = 0; local274 < local252; local274++) {
						local278 = 0;
						for (local280 = 0; local280 < local25; local280++) {
							local278 += local265.method5603();
							if (local31 == null) {
								local294 = local280;
							} else {
								local294 = local31[local280];
							}
							if (local294 == arg0) {
								local267 += local278;
								local269 = local294;
							}
						}
					}
					if (local267 == 0) {
						return true;
					}
					@Pc(330) byte[] local330 = new byte[local267];
					local265.anInt7013 = local216;
					local267 = 0;
					local280 = 0;
					for (local294 = 0; local294 < local252; local294++) {
						local343 = 0;
						for (local345 = 0; local345 < local25; local345++) {
							local343 += local265.method5603();
							@Pc(357) int local357;
							if (local31 == null) {
								local357 = local345;
							} else {
								local357 = local31[local345];
							}
							if (local357 == arg0) {
								Static468.method3858(local142, local280, local330, local267, local343);
								local267 += local343;
							}
							local280 += local343;
						}
					}
					local51[local269] = local330;
				} else {
					local216 = local142.length;
					local216--;
					local252 = local142[local216] & 0xFF;
					local216 -= local252 * local25 * 4;
					local265 = new Class5_Sub15(local142);
					local265.anInt7013 = local216;
					@Pc(427) int[] local427 = new int[local25];
					for (local269 = 0; local269 < local252; local269++) {
						local274 = 0;
						for (local278 = 0; local278 < local25; local278++) {
							local274 += local265.method5603();
							local427[local278] += local274;
						}
					}
					@Pc(469) byte[][] local469 = new byte[local25][];
					for (local278 = 0; local278 < local25; local278++) {
						local469[local278] = new byte[local427[local278]];
						local427[local278] = 0;
					}
					local265.anInt7013 = local216;
					local280 = 0;
					for (local294 = 0; local294 < local252; local294++) {
						local343 = 0;
						for (local345 = 0; local345 < local25; local345++) {
							local343 += local265.method5603();
							Static468.method3858(local142, local280, local469[local345], local427[local345], local343);
							local280 += local343;
							local427[local345] += local343;
						}
					}
					for (local343 = 0; local343 < local25; local343++) {
						if (local31 == null) {
							local345 = local343;
						} else {
							local345 = local31[local343];
						}
						if (this.anInt6915 == 0) {
							local51[local345] = Static148.method2143(local469[local343]);
						} else {
							local51[local345] = local469[local343];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)Z")
	public boolean method5466() {
		if (!this.method5464()) {
			return false;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.aClass226_2.anIntArray436.length; local20++) {
			@Pc(28) int local28 = this.aClass226_2.anIntArray436[local20];
			if (this.anObjectArray36[local28] == null) {
				this.method5471(local28);
				if (this.anObjectArray36[local28] == null) {
					local18 = false;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(II)[I")
	public int[] method5467(@OriginalArg(0) int arg0) {
		if (!this.method5475(arg0)) {
			return null;
		}
		@Pc(24) int[] local24 = this.aClass226_2.anIntArrayArray56[arg0];
		if (local24 == null) {
			local24 = new int[this.aClass226_2.anIntArray438[arg0]];
			@Pc(35) int local35 = 0;
			while (local35 < local24.length) {
				local24[local35] = local35++;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZI)V")
	public void method5468(@OriginalArg(1) int arg0) {
		if (this.method5475(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method5469(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5464()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(29) int local29 = this.aClass226_2.aClass121_1.method2562(Static164.method2261(local12));
		if (this.method5475(local29)) {
			@Pc(47) int local47 = this.aClass226_2.aClass121Array1[local29].method2562(Static164.method2261(local20));
			return this.method5482(local29, local47);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(II)I")
	private int method5470(@OriginalArg(1) int arg0) {
		if (this.method5475(arg0)) {
			return this.anObjectArray36[arg0] == null ? this.aClass104_1.method2257(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(II)V")
	private void method5471(@OriginalArg(0) int arg0) {
		if (this.aBoolean463) {
			this.anObjectArray36[arg0] = this.aClass104_1.method2263(arg0);
		} else {
			this.anObjectArray36[arg0] = Static148.method2143(this.aClass104_1.method2263(arg0));
		}
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(II)I")
	public int method5472(@OriginalArg(0) int arg0) {
		return this.method5475(arg0) ? this.aClass226_2.anIntArray439[arg0] : 0;
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(Ljava/lang/String;I)V")
	public void method5473(@OriginalArg(0) String arg0) {
		if (this.method5464()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass226_2.aClass121_1.method2562(Static164.method2261(local13));
			this.method5457(local22);
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5474(@OriginalArg(1) String arg0) {
		if (this.method5464()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(25) int local25 = this.aClass226_2.aClass121_1.method2562(Static164.method2261(local12));
			return this.method5481(local25);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(BI)Z")
	private boolean method5475(@OriginalArg(1) int arg0) {
		if (!this.method5464()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass226_2.anIntArray439.length && this.aClass226_2.anIntArray439[arg0] != 0) {
			return true;
		} else if (Static306.aBoolean161) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I[III)[B")
	public byte[] method5476(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method5458(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(38) boolean local38 = this.method5465(arg2, arg1, arg0);
			if (!local38) {
				this.method5471(arg0);
				local38 = this.method5465(arg2, arg1, arg0);
				if (!local38) {
					return null;
				}
			}
		}
		@Pc(65) byte[] local65 = Static27.method444(false, this.anObjectArrayArray1[arg0][arg2]);
		if (this.anInt6915 == 1) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass226_2.anIntArray439[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt6915 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local65;
	}

	@OriginalMember(owner = "client!um", name = "g", descriptor = "(II)I")
	public int method5477(@OriginalArg(1) int arg0) {
		if (this.method5464()) {
			@Pc(21) int local21 = this.aClass226_2.aClass121_1.method2562(arg0);
			return this.method5475(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)I")
	public int method5478() {
		return this.method5464() ? this.aClass226_2.anIntArray439.length : -1;
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(I)I")
	public int method5480() {
		if (!this.method5464()) {
			return 0;
		}
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < this.anObjectArray36.length; local19++) {
			if (this.aClass226_2.anIntArray438[local19] > 0) {
				local17 += this.method5470(local19);
				local15 += 100;
			}
		}
		if (local15 == 0) {
			return 100;
		} else {
			return local17 * 100 / local15;
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(ZI)Z")
	public boolean method5481(@OriginalArg(1) int arg0) {
		if (!this.method5475(arg0)) {
			return false;
		} else if (this.anObjectArray36[arg0] == null) {
			this.method5471(arg0);
			return this.anObjectArray36[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BII)Z")
	public boolean method5482(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5458(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray36[arg0] == null) {
			this.method5471(arg0);
			return this.anObjectArray36[arg0] != null;
		} else {
			return true;
		}
	}
}
