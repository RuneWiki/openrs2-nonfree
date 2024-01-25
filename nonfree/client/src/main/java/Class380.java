import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class380 {

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!wu", name = "F", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray33;

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "Lclient!sia;")
	private Class319 aClass319_2 = null;

	@OriginalMember(owner = "client!wu", name = "A", descriptor = "Lclient!qm;")
	private final Class20 aClass20_1;

	@OriginalMember(owner = "client!wu", name = "B", descriptor = "Z")
	private final boolean aBoolean748;

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
	public int anInt10336;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!qm;ZI)V")
	public Class380(@OriginalArg(0) Class20 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aClass20_1 = arg0;
		this.aBoolean748 = arg1;
		this.anInt10336 = arg2;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method8605(@OriginalArg(0) String arg0) {
		if (this.method8622()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass319_2.aClass292_1.method6406(Static278.method3854(local11));
			this.method8614(local20);
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method8606(@OriginalArg(0) String arg0) {
		if (this.method8622()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass319_2.aClass292_1.method6406(Static278.method3854(local18));
			return this.method8621(local27);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method8608(@OriginalArg(1) String arg0) {
		if (this.method8622()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass319_2.aClass292_1.method6406(Static278.method3854(local12));
			return local23 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method8609(@OriginalArg(1) String arg0) {
		if (this.method8622()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass319_2.aClass292_1.method6406(Static278.method3854(local17));
			return this.method8612(local30) ? local30 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method8610(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method8622()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass319_2.aClass292_1.method6406(Static278.method3854(local12));
		if (local24 < 0) {
			return false;
		} else {
			@Pc(44) int local44 = this.aClass319_2.aClass292Array1[local24].method6406(Static278.method3854(local15));
			return local44 >= 0;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V")
	public void method8611(@OriginalArg(1) int arg0) {
		if (this.method8612(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(II)Z")
	private boolean method8612(@OriginalArg(0) int arg0) {
		if (!this.method8622()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass319_2.anIntArray584.length && this.aClass319_2.anIntArray584[arg0] != 0) {
			return true;
		} else if (Static87.aBoolean126) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)I")
	public int method8613() {
		if (!this.method8622()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray33.length; local17++) {
			if (this.aClass319_2.anIntArray586[local17] > 0) {
				local13 += 100;
				local15 += this.method8621(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IB)V")
	private void method8614(@OriginalArg(0) int arg0) {
		this.aClass20_1.method462(arg0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II[II)Z")
	private boolean method8615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method8612(arg1)) {
			return false;
		} else if (this.anObjectArray33[arg1] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass319_2.anIntArray586[arg1];
			@Pc(31) int[] local31 = this.aClass319_2.anIntArrayArray54[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass319_2.anIntArray584[arg1]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg1];
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
			@Pc(120) byte[] local120;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local120 = Static452.method6139(false, this.anObjectArray33[arg1]);
			} else {
				local120 = Static452.method6139(true, this.anObjectArray33[arg1]);
				@Pc(135) Class2_Sub22 local135 = new Class2_Sub22(local120);
				local135.method8531(local135.aByteArray115.length, arg2);
			}
			@Pc(147) byte[] local147;
			try {
				local147 = Static129.method7547(local120);
			} catch (@Pc(149) RuntimeException local149) {
				throw Static382.method5116(local149, "T3 - " + (arg2 != null) + "," + arg1 + "," + local120.length + "," + Static601.method8116(local120, local120.length) + "," + Static601.method8116(local120, local120.length - 2) + "," + this.aClass319_2.anIntArray587[arg1] + "," + this.aClass319_2.anInt8625);
			}
			if (this.aBoolean748) {
				this.anObjectArray33[arg1] = null;
			}
			@Pc(223) int local223;
			if (local25 <= 1) {
				if (local31 == null) {
					local223 = 0;
				} else {
					local223 = local31[0];
				}
				if (this.anInt10336 == 0) {
					local51[local223] = Static253.method3515(local147);
				} else {
					local51[local223] = local147;
				}
			} else {
				@Pc(264) int local264;
				@Pc(277) Class2_Sub22 local277;
				@Pc(285) int local285;
				@Pc(289) int local289;
				@Pc(291) int local291;
				@Pc(345) int local345;
				@Pc(347) int local347;
				@Pc(351) int local351;
				@Pc(353) int local353;
				if (this.anInt10336 == 2) {
					local223 = local147.length;
					local223--;
					local264 = local147[local223] & 0xFF;
					local223 -= local25 * local264 * 4;
					local277 = new Class2_Sub22(local147);
					@Pc(463) int local463 = 0;
					local285 = 0;
					local277.anInt10247 = local223;
					for (local289 = 0; local289 < local264; local289++) {
						local291 = 0;
						for (local345 = 0; local345 < local25; local345++) {
							local291 += local277.method8542();
							if (local31 == null) {
								local347 = local345;
							} else {
								local347 = local31[local345];
							}
							if (local347 == arg0) {
								local285 = local347;
								local463 += local291;
							}
						}
					}
					if (local463 == 0) {
						return true;
					}
					@Pc(530) byte[] local530 = new byte[local463];
					local277.anInt10247 = local223;
					local463 = 0;
					local345 = 0;
					for (local347 = 0; local347 < local264; local347++) {
						local351 = 0;
						for (local353 = 0; local353 < local25; local353++) {
							local351 += local277.method8542();
							@Pc(559) int local559;
							if (local31 == null) {
								local559 = local353;
							} else {
								local559 = local31[local353];
							}
							if (arg0 == local559) {
								Static653.method5398(local147, local345, local530, local463, local351);
								local463 += local351;
							}
							local345 += local351;
						}
					}
					local51[local285] = local530;
				} else {
					local223 = local147.length;
					local223--;
					local264 = local147[local223] & 0xFF;
					local223 -= local25 * 4 * local264;
					local277 = new Class2_Sub22(local147);
					local277.anInt10247 = local223;
					@Pc(283) int[] local283 = new int[local25];
					for (local285 = 0; local285 < local264; local285++) {
						local289 = 0;
						for (local291 = 0; local291 < local25; local291++) {
							local289 += local277.method8542();
							local283[local291] += local289;
						}
					}
					@Pc(321) byte[][] local321 = new byte[local25][];
					for (local291 = 0; local291 < local25; local291++) {
						local321[local291] = new byte[local283[local291]];
						local283[local291] = 0;
					}
					local277.anInt10247 = local223;
					local345 = 0;
					for (local347 = 0; local347 < local264; local347++) {
						local351 = 0;
						for (local353 = 0; local353 < local25; local353++) {
							local351 += local277.method8542();
							Static653.method5398(local147, local345, local321[local353], local283[local353], local351);
							local283[local353] += local351;
							local345 += local351;
						}
					}
					for (local351 = 0; local351 < local25; local351++) {
						if (local31 == null) {
							local353 = local351;
						} else {
							local353 = local31[local351];
						}
						if (this.anInt10336 == 0) {
							local51[local353] = Static253.method3515(local321[local351]);
						} else {
							local51[local353] = local321[local351];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(II)[B")
	public byte[] method8616(@OriginalArg(1) int arg0) {
		if (!this.method8622()) {
			return null;
		} else if (this.aClass319_2.anIntArray584.length == 1) {
			return this.method8620(0, arg0);
		} else if (!this.method8612(arg0)) {
			return null;
		} else if (this.aClass319_2.anIntArray584[arg0] == 1) {
			return this.method8620(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(IB)[I")
	public int[] method8617(@OriginalArg(0) int arg0) {
		if (!this.method8612(arg0)) {
			return null;
		}
		@Pc(26) int[] local26 = this.aClass319_2.anIntArrayArray54[arg0];
		if (local26 == null) {
			local26 = new int[this.aClass319_2.anIntArray586[arg0]];
			@Pc(37) int local37 = 0;
			while (local26.length > local37) {
				local26[local37] = local37++;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)Z")
	public boolean method8618() {
		if (!this.method8622()) {
			return false;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.aClass319_2.anIntArray582.length; local20++) {
			@Pc(28) int local28 = this.aClass319_2.anIntArray582[local20];
			if (this.anObjectArray33[local28] == null) {
				this.method8633(local28);
				if (this.anObjectArray33[local28] == null) {
					local18 = false;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IBI)Z")
	public boolean method8619(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method8625(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray33[arg0] == null) {
			this.method8633(arg0);
			return this.anObjectArray33[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIB)[B")
	public byte[] method8620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method8630(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(IB)I")
	private int method8621(@OriginalArg(0) int arg0) {
		if (this.method8612(arg0)) {
			return this.anObjectArray33[arg0] == null ? this.aClass20_1.method467(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(B)Z")
	private boolean method8622() {
		if (this.aClass319_2 == null) {
			this.aClass319_2 = this.aClass20_1.method466();
			if (this.aClass319_2 == null) {
				return false;
			}
			this.anObjectArray33 = new Object[this.aClass319_2.anInt8622];
			this.anObjectArrayArray1 = new Object[this.aClass319_2.anInt8622][];
		}
		return true;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method8624(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = this.method8609("");
		return local13 == -1 ? this.method8634(arg0, "") : this.method8634("", arg0);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZII)Z")
	private boolean method8625(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method8622()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass319_2.anIntArray584.length > arg1 && this.aClass319_2.anIntArray584[arg1] > arg0) {
			return true;
		} else if (Static87.aBoolean126) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(B)V")
	public void method8626() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method8628(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method8622()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(26) int local26 = this.aClass319_2.aClass292_1.method6406(Static278.method3854(local12));
		if (this.method8612(local26)) {
			@Pc(49) int local49 = this.aClass319_2.aClass292Array1[local26].method6406(Static278.method3854(local15));
			return this.method8620(local26, local49);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)I")
	public int method8629() {
		if (!this.method8622()) {
			throw new IllegalStateException("");
		}
		return this.aClass319_2.anInt8625;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II[IB)[B")
	public byte[] method8630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method8625(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method8615(arg1, arg0, arg2);
			if (!local30) {
				this.method8633(arg0);
				local30 = this.method8615(arg1, arg0, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(65) byte[] local65 = Static452.method6139(false, this.anObjectArrayArray1[arg0][arg1]);
		if (this.anInt10336 == 1) {
			this.anObjectArrayArray1[arg0][arg1] = null;
			if (this.aClass319_2.anIntArray584[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt10336 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local65;
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(II)I")
	public int method8631(@OriginalArg(0) int arg0) {
		return this.method8612(arg0) ? this.aClass319_2.anIntArray584[arg0] : 0;
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(B)V")
	public void method8632() {
		if (this.anObjectArray33 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray33.length; local6++) {
				this.anObjectArray33[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BI)V")
	private void method8633(@OriginalArg(1) int arg0) {
		if (this.aBoolean748) {
			this.anObjectArray33[arg0] = this.aClass20_1.method465(arg0);
		} else {
			this.anObjectArray33[arg0] = Static253.method3515(this.aClass20_1.method465(arg0));
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	private boolean method8634(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method8622()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(29) int local29 = this.aClass319_2.aClass292_1.method6406(Static278.method3854(local12));
		if (this.method8612(local29)) {
			@Pc(47) int local47 = this.aClass319_2.aClass292Array1[local29].method6406(Static278.method3854(local20));
			return this.method8619(local29, local47);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "(II)Z")
	public boolean method8635(@OriginalArg(1) int arg0) {
		if (!this.method8612(arg0)) {
			return false;
		} else if (this.anObjectArray33[arg0] == null) {
			this.method8633(arg0);
			return this.anObjectArray33[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZZZ)V")
	public void method8636(@OriginalArg(0) boolean arg0) {
		if (!this.method8622()) {
			return;
		}
		this.aClass319_2.aClass292Array1 = null;
		this.aClass319_2.anIntArrayArray55 = null;
		if (arg0) {
			this.aClass319_2.aClass292_1 = null;
			this.aClass319_2.anIntArray583 = null;
		}
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(IB)I")
	public int method8637(@OriginalArg(0) int arg0) {
		if (this.method8622()) {
			@Pc(24) int local24 = this.aClass319_2.aClass292_1.method6406(arg0);
			return this.method8612(local24) ? local24 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "(II)Z")
	public boolean method8638(@OriginalArg(1) int arg0) {
		if (!this.method8622()) {
			return false;
		} else if (this.aClass319_2.anIntArray584.length == 1) {
			return this.method8619(0, arg0);
		} else if (!this.method8612(arg0)) {
			return false;
		} else if (this.aClass319_2.anIntArray584[arg0] == 1) {
			return this.method8619(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(B)I")
	public int method8639() {
		return this.method8622() ? this.aClass319_2.anIntArray584.length : -1;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method8641(@OriginalArg(1) String arg0) {
		if (this.method8622()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass319_2.aClass292_1.method6406(Static278.method3854(local18));
			return this.method8635(local27);
		} else {
			return false;
		}
	}
}
