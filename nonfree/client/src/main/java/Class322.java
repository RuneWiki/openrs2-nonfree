import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class322 {

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "Lclient!of;")
	private Class238 aClass238_2 = null;

	@OriginalMember(owner = "client!tf", name = "O", descriptor = "Lclient!nq;")
	private final Class30 aClass30_1;

	@OriginalMember(owner = "client!tf", name = "P", descriptor = "Z")
	private final boolean aBoolean626;

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
	public int anInt8219;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!nq;ZI)V")
	public Class322(@OriginalArg(0) Class30 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass30_1 = arg0;
		this.aBoolean626 = arg1;
		this.anInt8219 = arg2;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)Z")
	public boolean method6797(@OriginalArg(0) int arg0) {
		if (!this.method6805()) {
			return false;
		} else if (this.aClass238_2.anIntArray397.length == 1) {
			return this.method6808(arg0, 0);
		} else if (!this.method6827(arg0)) {
			return false;
		} else if (this.aClass238_2.anIntArray397[arg0] == 1) {
			return this.method6808(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZZB)V")
	public void method6798(@OriginalArg(1) boolean arg0) {
		if (!this.method6805()) {
			return;
		}
		this.aClass238_2.anIntArrayArray147 = null;
		this.aClass238_2.aClass346Array1 = null;
		if (arg0) {
			this.aClass238_2.anIntArray394 = null;
			this.aClass238_2.aClass346_1 = null;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)I")
	public int method6799() {
		if (!this.method6805()) {
			throw new IllegalStateException("");
		}
		return this.aClass238_2.anInt6481;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)[I")
	public int[] method6800(@OriginalArg(1) int arg0) {
		if (!this.method6827(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass238_2.anIntArrayArray146[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass238_2.anIntArray395[arg0]];
			@Pc(29) int local29 = 0;
			while (local18.length > local29) {
				local18[local29] = local29++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public void method6801() {
		if (this.anObjectArray2 != null) {
			for (@Pc(13) int local13 = 0; local13 < this.anObjectArray2.length; local13++) {
				this.anObjectArray2[local13] = null;
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BII)[B")
	public byte[] method6802(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method6821(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[II)Z")
	private boolean method6803(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method6827(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass238_2.anIntArray395[arg0];
			@Pc(31) int[] local31 = this.aClass238_2.anIntArrayArray146[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass238_2.anIntArray397[arg0]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg0];
			@Pc(53) boolean local53 = true;
			for (@Pc(60) int local60 = 0; local60 < local25; local60++) {
				@Pc(66) int local66;
				if (local31 == null) {
					local66 = local60;
				} else {
					local66 = local31[local60];
				}
				if (local51[local66] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(124) byte[] local124;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local124 = Static73.method1566(false, this.anObjectArray2[arg0]);
			} else {
				local124 = Static73.method1566(true, this.anObjectArray2[arg0]);
				@Pc(129) Class3_Sub11 local129 = new Class3_Sub11(local124);
				local129.method5203(local129.aByteArray62.length, arg1);
			}
			@Pc(151) byte[] local151;
			try {
				local151 = Static69.method1488(local124);
			} catch (@Pc(153) RuntimeException local153) {
				throw Static581.method6764(local153, "T3 - " + (arg1 != null) + "," + arg0 + "," + local124.length + "," + Static186.method3166(local124.length, local124) + "," + Static186.method3166(local124.length - 2, local124) + "," + this.aClass238_2.anIntArray396[arg0] + "," + this.aClass238_2.anInt6481);
			}
			if (this.aBoolean626) {
				this.anObjectArray2[arg0] = null;
			}
			@Pc(223) int local223;
			if (local25 <= 1) {
				if (local31 == null) {
					local223 = 0;
				} else {
					local223 = local31[0];
				}
				if (this.anInt8219 == 0) {
					local51[local223] = Static258.method6206(local151);
				} else {
					local51[local223] = local151;
				}
			} else {
				@Pc(266) int local266;
				@Pc(279) Class3_Sub11 local279;
				@Pc(283) int local283;
				@Pc(288) int local288;
				@Pc(292) int local292;
				@Pc(294) int local294;
				@Pc(308) int local308;
				@Pc(353) int local353;
				@Pc(355) int local355;
				if (this.anInt8219 == 2) {
					local223 = local151.length;
					local223--;
					local266 = local151[local223] & 0xFF;
					local223 -= local25 * 4 * local266;
					local279 = new Class3_Sub11(local151);
					@Pc(281) int local281 = 0;
					local283 = 0;
					local279.anInt6128 = local223;
					for (local288 = 0; local288 < local266; local288++) {
						local292 = 0;
						for (local294 = 0; local294 < local25; local294++) {
							local292 += local279.method5186();
							if (local31 == null) {
								local308 = local294;
							} else {
								local308 = local31[local294];
							}
							if (local308 == arg2) {
								local281 += local292;
								local283 = local308;
							}
						}
					}
					if (local281 == 0) {
						return true;
					}
					@Pc(340) byte[] local340 = new byte[local281];
					local281 = 0;
					local279.anInt6128 = local223;
					local294 = 0;
					for (local308 = 0; local308 < local266; local308++) {
						local353 = 0;
						for (local355 = 0; local355 < local25; local355++) {
							local353 += local279.method5186();
							@Pc(367) int local367;
							if (local31 == null) {
								local367 = local355;
							} else {
								local367 = local31[local355];
							}
							if (arg2 == local367) {
								Static601.method2816(local151, local294, local340, local281, local353);
								local281 += local353;
							}
							local294 += local353;
						}
					}
					local51[local283] = local340;
				} else {
					local223 = local151.length;
					local223--;
					local266 = local151[local223] & 0xFF;
					local223 -= local266 * 4 * local25;
					local279 = new Class3_Sub11(local151);
					@Pc(434) int[] local434 = new int[local25];
					local279.anInt6128 = local223;
					for (local283 = 0; local283 < local266; local283++) {
						local288 = 0;
						for (local292 = 0; local292 < local25; local292++) {
							local288 += local279.method5186();
							local434[local292] += local288;
						}
					}
					@Pc(471) byte[][] local471 = new byte[local25][];
					for (local292 = 0; local292 < local25; local292++) {
						local471[local292] = new byte[local434[local292]];
						local434[local292] = 0;
					}
					local279.anInt6128 = local223;
					local294 = 0;
					for (local308 = 0; local308 < local266; local308++) {
						local353 = 0;
						for (local355 = 0; local355 < local25; local355++) {
							local353 += local279.method5186();
							Static601.method2816(local151, local294, local471[local355], local434[local355], local353);
							local294 += local353;
							local434[local355] += local353;
						}
					}
					for (local353 = 0; local353 < local25; local353++) {
						if (local31 == null) {
							local355 = local353;
						} else {
							local355 = local31[local353];
						}
						if (this.anInt8219 == 0) {
							local51[local355] = Static258.method6206(local471[local353]);
						} else {
							local51[local355] = local471[local353];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public void method6804(@OriginalArg(0) String arg0) {
		if (this.method6805()) {
			@Pc(16) String local16 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass238_2.aClass346_1.method7291(Static6.method99(local16));
			this.method6806(local29);
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)Z")
	private boolean method6805() {
		if (this.aClass238_2 == null) {
			this.aClass238_2 = this.aClass30_1.method579();
			if (this.aClass238_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass238_2.anInt6485][];
			this.anObjectArray2 = new Object[this.aClass238_2.anInt6485];
		}
		return true;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)V")
	private void method6806(@OriginalArg(0) int arg0) {
		this.aClass30_1.method574(arg0);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)[B")
	public byte[] method6807(@OriginalArg(1) int arg0) {
		if (!this.method6805()) {
			return null;
		} else if (this.aClass238_2.anIntArray397.length == 1) {
			return this.method6802(0, arg0);
		} else if (!this.method6827(arg0)) {
			return null;
		} else if (this.aClass238_2.anIntArray397[arg0] == 1) {
			return this.method6802(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBI)Z")
	public boolean method6808(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method6829(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray2[arg1] == null) {
			this.method6811(arg1);
			return this.anObjectArray2[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Z")
	public boolean method6809() {
		if (!this.method6805()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass238_2.anIntArray399.length; local15++) {
			@Pc(23) int local23 = this.aClass238_2.anIntArray399[local15];
			if (this.anObjectArray2[local23] == null) {
				this.method6811(local23);
				if (this.anObjectArray2[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B")
	public byte[] method6810(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method6805()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(23) String local23 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass238_2.aClass346_1.method7291(Static6.method99(local12));
		if (this.method6827(local32)) {
			@Pc(50) int local50 = this.aClass238_2.aClass346Array1[local32].method7291(Static6.method99(local23));
			return this.method6802(local32, local50);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V")
	private void method6811(@OriginalArg(0) int arg0) {
		if (this.aBoolean626) {
			this.anObjectArray2[arg0] = this.aClass30_1.method573(arg0);
		} else {
			this.anObjectArray2[arg0] = Static258.method6206(this.aClass30_1.method573(arg0));
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)I")
	private int method6812(@OriginalArg(0) int arg0) {
		if (this.method6827(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass30_1.method577(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(BI)I")
	public int method6813(@OriginalArg(1) int arg0) {
		if (this.method6805()) {
			@Pc(23) int local23 = this.aClass238_2.aClass346_1.method7291(arg0);
			return this.method6827(local23) ? local23 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method6814(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = this.method6823("");
		return local13 == -1 ? this.method6816("", arg0) : this.method6816(arg0, "");
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(Z)V")
	public void method6815() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArrayArray1.length; local14++) {
				this.anObjectArrayArray1[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z")
	private boolean method6816(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method6805()) {
			return false;
		}
		@Pc(14) String local14 = arg1.toLowerCase();
		@Pc(22) String local22 = arg0.toLowerCase();
		@Pc(31) int local31 = this.aClass238_2.aClass346_1.method7291(Static6.method99(local14));
		if (this.method6827(local31)) {
			@Pc(49) int local49 = this.aClass238_2.aClass346Array1[local31].method7291(Static6.method99(local22));
			return this.method6808(local49, local31);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method6818(@OriginalArg(0) String arg0) {
		if (this.method6805()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(31) int local31 = this.aClass238_2.aClass346_1.method7291(Static6.method99(local20));
			return this.method6830(local31);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(II[II)[B")
	public byte[] method6821(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method6829(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(38) boolean local38 = this.method6803(arg0, arg1, arg2);
			if (!local38) {
				this.method6811(arg0);
				local38 = this.method6803(arg0, arg1, arg2);
				if (!local38) {
					return null;
				}
			}
		}
		@Pc(67) byte[] local67 = Static73.method1566(false, this.anObjectArrayArray1[arg0][arg2]);
		if (this.anInt8219 == 1) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass238_2.anIntArray397[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt8219 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local67;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	public boolean method6822(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method6805()) {
			return false;
		}
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(23) String local23 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass238_2.aClass346_1.method7291(Static6.method99(local20));
		if (local32 < 0) {
			return false;
		} else {
			@Pc(47) int local47 = this.aClass238_2.aClass346Array1[local32].method7291(Static6.method99(local23));
			return local47 >= 0;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method6823(@OriginalArg(0) String arg0) {
		if (this.method6805()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass238_2.aClass346_1.method7291(Static6.method99(local18));
			return this.method6827(local27) ? local27 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "(II)V")
	public void method6824(@OriginalArg(0) int arg0) {
		if (this.method6827(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)I")
	public int method6825() {
		return this.method6805() ? this.aClass238_2.anIntArray397.length : -1;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)I")
	public int method6826() {
		if (!this.method6805()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray2.length; local17++) {
			if (this.aClass238_2.anIntArray395[local17] > 0) {
				local13 += 100;
				local15 += this.method6812(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(BI)Z")
	private boolean method6827(@OriginalArg(1) int arg0) {
		if (!this.method6805()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass238_2.anIntArray397.length && this.aClass238_2.anIntArray397[arg0] != 0) {
			return true;
		} else if (Static15.aBoolean35) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(Ljava/lang/String;Z)I")
	public int method6828(@OriginalArg(0) String arg0) {
		if (this.method6805()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass238_2.aClass346_1.method7291(Static6.method99(local12));
			return this.method6812(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)Z")
	private boolean method6829(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method6805()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass238_2.anIntArray397.length > arg0 && this.aClass238_2.anIntArray397[arg0] > arg1) {
			return true;
		} else if (Static15.aBoolean35) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "(II)Z")
	public boolean method6830(@OriginalArg(1) int arg0) {
		if (!this.method6827(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method6811(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "(II)I")
	public int method6831(@OriginalArg(0) int arg0) {
		return this.method6827(arg0) ? this.aClass238_2.anIntArray397[arg0] : 0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method6832(@OriginalArg(1) String arg0) {
		if (this.method6805()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass238_2.aClass346_1.method7291(Static6.method99(local17));
			return local26 >= 0;
		} else {
			return false;
		}
	}
}
