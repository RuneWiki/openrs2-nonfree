import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class248 {

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray36;

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "Lclient!ofa;")
	private Class231 aClass231_2 = null;

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "Z")
	private final boolean aBoolean495;

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "Lclient!ica;")
	private final Class58 aClass58_1;

	@OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
	public int anInt7247;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!ica;ZI)V")
	public Class248(@OriginalArg(0) Class58 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean495 = arg1;
		this.aClass58_1 = arg0;
		this.anInt7247 = arg2;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V")
	private void method5772(@OriginalArg(0) int arg0) {
		this.aClass58_1.method1065(arg0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method5773(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5784()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass231_2.aClass23_1.method361(Static156.method2459(local12));
		if (this.method5779(local24)) {
			@Pc(47) int local47 = this.aClass231_2.aClass23Array1[local24].method361(Static156.method2459(local15));
			return this.method5788(local47, local24);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)I")
	public int method5774() {
		return this.method5784() ? this.aClass231_2.anIntArray477.length : -1;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V")
	public void method5775() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(19) int local19 = 0; local19 < this.anObjectArrayArray1.length; local19++) {
				this.anObjectArrayArray1[local19] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)I")
	public int method5776(@OriginalArg(0) int arg0) {
		if (this.method5784()) {
			@Pc(21) int local21 = this.aClass231_2.aClass23_1.method361(arg0);
			return this.method5779(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method5777(@OriginalArg(1) String arg0) {
		if (this.method5784()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass231_2.aClass23_1.method361(Static156.method2459(local17));
			return this.method5779(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([IIII)Z")
	private boolean method5778(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method5779(arg1)) {
			return false;
		} else if (this.anObjectArray36[arg1] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass231_2.anIntArray473[arg1];
			@Pc(31) int[] local31 = this.aClass231_2.anIntArrayArray58[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass231_2.anIntArray477[arg1]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg1];
			@Pc(53) boolean local53 = true;
			for (@Pc(55) int local55 = 0; local55 < local25; local55++) {
				@Pc(63) int local63;
				if (local31 == null) {
					local63 = local55;
				} else {
					local63 = local31[local55];
				}
				if (local51[local63] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(119) byte[] local119;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local119 = Static210.method3435(this.anObjectArray36[arg1], false);
			} else {
				local119 = Static210.method3435(this.anObjectArray36[arg1], true);
				@Pc(124) Class6_Sub12 local124 = new Class6_Sub12(local119);
				local124.method6052(local124.aByteArray97.length, arg0);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Static175.method2720(local119);
			} catch (@Pc(148) RuntimeException local148) {
				throw Static134.method6229(local148, "T3 - " + (arg0 != null) + "," + arg1 + "," + local119.length + "," + Static342.method5248(local119.length, local119) + "," + Static342.method5248(local119.length - 2, local119) + "," + this.aClass231_2.anIntArray472[arg1] + "," + this.aClass231_2.anInt6729);
			}
			if (this.aBoolean495) {
				this.anObjectArray36[arg1] = null;
			}
			@Pc(223) int local223;
			if (local25 > 1) {
				@Pc(230) int local230;
				@Pc(243) Class6_Sub12 local243;
				@Pc(251) int local251;
				@Pc(255) int local255;
				@Pc(257) int local257;
				@Pc(315) int local315;
				@Pc(317) int local317;
				@Pc(321) int local321;
				@Pc(323) int local323;
				if (this.anInt7247 == 2) {
					local223 = local146.length;
					local223--;
					local230 = local146[local223] & 0xFF;
					local223 -= local25 * 4 * local230;
					local243 = new Class6_Sub12(local146);
					@Pc(429) int local429 = 0;
					local251 = 0;
					local243.anInt7556 = local223;
					for (local255 = 0; local255 < local230; local255++) {
						local257 = 0;
						for (local315 = 0; local315 < local25; local315++) {
							local257 += local243.method6015();
							if (local31 == null) {
								local317 = local315;
							} else {
								local317 = local31[local315];
							}
							if (arg2 == local317) {
								local251 = local317;
								local429 += local257;
							}
						}
					}
					if (local429 == 0) {
						return true;
					}
					@Pc(495) byte[] local495 = new byte[local429];
					local243.anInt7556 = local223;
					local429 = 0;
					local315 = 0;
					for (local317 = 0; local317 < local230; local317++) {
						local321 = 0;
						for (local323 = 0; local323 < local25; local323++) {
							local321 += local243.method6015();
							@Pc(524) int local524;
							if (local31 == null) {
								local524 = local323;
							} else {
								local524 = local31[local323];
							}
							if (arg2 == local524) {
								Static596.method7719(local146, local315, local495, local429, local321);
								local429 += local321;
							}
							local315 += local321;
						}
					}
					local51[local251] = local495;
				} else {
					local223 = local146.length;
					@Pc(225) int local225 = local223 - 1;
					local230 = local146[local225] & 0xFF;
					@Pc(238) int local238 = local225 - local230 * 4 * local25;
					local243 = new Class6_Sub12(local146);
					local243.anInt7556 = local238;
					@Pc(249) int[] local249 = new int[local25];
					for (local251 = 0; local251 < local230; local251++) {
						local255 = 0;
						for (local257 = 0; local257 < local25; local257++) {
							local255 += local243.method6015();
							local249[local257] += local255;
						}
					}
					@Pc(291) byte[][] local291 = new byte[local25][];
					for (local257 = 0; local257 < local25; local257++) {
						local291[local257] = new byte[local249[local257]];
						local249[local257] = 0;
					}
					local243.anInt7556 = local238;
					local315 = 0;
					for (local317 = 0; local317 < local230; local317++) {
						local321 = 0;
						for (local323 = 0; local323 < local25; local323++) {
							local321 += local243.method6015();
							Static596.method7719(local146, local315, local291[local323], local249[local323], local321);
							local315 += local321;
							local249[local323] += local321;
						}
					}
					for (local321 = 0; local321 < local25; local321++) {
						if (local31 == null) {
							local323 = local321;
						} else {
							local323 = local31[local321];
						}
						if (this.anInt7247 == 0) {
							local51[local323] = Static403.method5820(local291[local321]);
						} else {
							local51[local323] = local291[local321];
						}
					}
				}
			} else {
				if (local31 == null) {
					local223 = 0;
				} else {
					local223 = local31[0];
				}
				if (this.anInt7247 == 0) {
					local51[local223] = Static403.method5820(local146);
				} else {
					local51[local223] = local146;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)Z")
	private boolean method5779(@OriginalArg(1) int arg0) {
		if (!this.method5784()) {
			return false;
		} else if (arg0 >= 0 && this.aClass231_2.anIntArray477.length > arg0 && this.aClass231_2.anIntArray477[arg0] != 0) {
			return true;
		} else if (Static178.aBoolean281) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method5780(@OriginalArg(0) String arg0) {
		if (this.method5784()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass231_2.aClass23_1.method361(Static156.method2459(local17));
			return this.method5790(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)Z")
	public boolean method5781() {
		if (!this.method5784()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass231_2.anIntArray474.length; local15++) {
			@Pc(23) int local23 = this.aClass231_2.anIntArray474[local15];
			if (this.anObjectArray36[local23] == null) {
				this.method5787(local23);
				if (this.anObjectArray36[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BZZ)V")
	public void method5782(@OriginalArg(1) boolean arg0) {
		if (!this.method5784()) {
			return;
		}
		this.aClass231_2.aClass23Array1 = null;
		this.aClass231_2.anIntArrayArray57 = null;
		if (arg0) {
			this.aClass231_2.anIntArray475 = null;
			this.aClass231_2.aClass23_1 = null;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZI)Z")
	private boolean method5783(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5784()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass231_2.anIntArray477.length && this.aClass231_2.anIntArray477[arg0] > arg1) {
			return true;
		} else if (Static178.aBoolean281) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)Z")
	private boolean method5784() {
		if (this.aClass231_2 == null) {
			this.aClass231_2 = this.aClass58_1.method1060();
			if (this.aClass231_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass231_2.anInt6727][];
			this.anObjectArray36 = new Object[this.aClass231_2.anInt6727];
		}
		return true;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
	public void method5785() {
		if (this.anObjectArray36 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArray36.length; local10++) {
				this.anObjectArray36[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(II)V")
	public void method5786(@OriginalArg(0) int arg0) {
		if (this.method5779(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)V")
	private void method5787(@OriginalArg(1) int arg0) {
		if (this.aBoolean495) {
			this.anObjectArray36[arg0] = this.aClass58_1.method1058(arg0);
		} else {
			this.anObjectArray36[arg0] = Static403.method5820(this.aClass58_1.method1058(arg0));
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BII)Z")
	public boolean method5788(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5783(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray36[arg1] == null) {
			this.method5787(arg1);
			return this.anObjectArray36[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(Ljava/lang/String;B)V")
	public void method5789(@OriginalArg(0) String arg0) {
		if (this.method5784()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass231_2.aClass23_1.method361(Static156.method2459(local18));
			this.method5772(local27);
		}
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(II)I")
	private int method5790(@OriginalArg(1) int arg0) {
		if (this.method5779(arg0)) {
			return this.anObjectArray36[arg0] == null ? this.aClass58_1.method1064(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method5791(@OriginalArg(0) String arg0) {
		if (this.method5784()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass231_2.aClass23_1.method361(Static156.method2459(local17));
			return local26 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(Z)I")
	public int method5792() {
		if (!this.method5784()) {
			return 0;
		}
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < this.anObjectArray36.length; local26++) {
			if (this.aClass231_2.anIntArray473[local26] > 0) {
				local24 += this.method5790(local26);
				local22 += 100;
			}
		}
		if (local22 == 0) {
			return 100;
		} else {
			return local24 * 100 / local22;
		}
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(II)I")
	public int method5793(@OriginalArg(0) int arg0) {
		return this.method5779(arg0) ? this.aClass231_2.anIntArray477[arg0] : 0;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method5794(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5784()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(26) int local26 = this.aClass231_2.aClass23_1.method361(Static156.method2459(local12));
		if (this.method5779(local26)) {
			@Pc(46) int local46 = this.aClass231_2.aClass23Array1[local26].method361(Static156.method2459(local15));
			return this.method5797(local26, local46);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(IB)[B")
	public byte[] method5795(@OriginalArg(0) int arg0) {
		if (!this.method5784()) {
			return null;
		} else if (this.aClass231_2.anIntArray477.length == 1) {
			return this.method5797(0, arg0);
		} else if (!this.method5779(arg0)) {
			return null;
		} else if (this.aClass231_2.anIntArray477[arg0] == 1) {
			return this.method5797(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(BI)[I")
	public int[] method5796(@OriginalArg(1) int arg0) {
		if (!this.method5779(arg0)) {
			return null;
		}
		@Pc(24) int[] local24 = this.aClass231_2.anIntArrayArray58[arg0];
		if (local24 == null) {
			local24 = new int[this.aClass231_2.anIntArray473[arg0]];
			@Pc(35) int local35 = 0;
			while (local35 < local24.length) {
				local24[local35] = local35++;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)[B")
	public byte[] method5797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method5799(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[III)[B")
	public byte[] method5799(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method5783(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(30) boolean local30 = this.method5778(arg1, arg0, arg2);
			if (!local30) {
				this.method5787(arg0);
				local30 = this.method5778(arg1, arg0, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static210.method3435(this.anObjectArrayArray1[arg0][arg2], false);
		if (this.anInt7247 == 1) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass231_2.anIntArray477[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt7247 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method5800(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5784()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass231_2.aClass23_1.method361(Static156.method2459(local12));
		if (local24 < 0) {
			return false;
		} else {
			@Pc(39) int local39 = this.aClass231_2.aClass23Array1[local24].method361(Static156.method2459(local15));
			return local39 >= 0;
		}
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)I")
	public int method5801() {
		if (!this.method5784()) {
			throw new IllegalStateException("");
		}
		return this.aClass231_2.anInt6729;
	}

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "(II)Z")
	public boolean method5802(@OriginalArg(0) int arg0) {
		if (!this.method5779(arg0)) {
			return false;
		} else if (this.anObjectArray36[arg0] == null) {
			this.method5787(arg0);
			return this.anObjectArray36[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method5803(@OriginalArg(0) String arg0) {
		if (this.method5784()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass231_2.aClass23_1.method361(Static156.method2459(local12));
			return this.method5802(local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "(II)Z")
	public boolean method5804(@OriginalArg(1) int arg0) {
		if (!this.method5784()) {
			return false;
		} else if (this.aClass231_2.anIntArray477.length == 1) {
			return this.method5788(arg0, 0);
		} else if (!this.method5779(arg0)) {
			return false;
		} else if (this.aClass231_2.anIntArray477[arg0] == 1) {
			return this.method5788(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
