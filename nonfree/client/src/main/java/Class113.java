import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class113 {

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "Lclient!bm;")
	private Class25 aClass25_1 = null;

	@OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
	public int anInt2734;

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "Z")
	private final boolean aBoolean217;

	@OriginalMember(owner = "client!ic", name = "D", descriptor = "Lclient!wh;")
	private final Class222 aClass222_1;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!wh;ZI)V")
	public Class113(@OriginalArg(0) Class222 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt2734 = arg2;
		this.aBoolean217 = arg1;
		this.aClass222_1 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)I")
	public int method2250() {
		if (!this.method2255()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < this.anObjectArray2.length; local22++) {
			if (this.aClass25_1.anIntArray37[local22] > 0) {
				local20 += this.method2258(local22);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local20 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIZ)Z")
	public boolean method2251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method2270(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray2[arg1] == null) {
			this.method2276(arg1);
			return this.anObjectArray2[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZZ)V")
	public void method2252(@OriginalArg(2) boolean arg0) {
		if (!this.method2255()) {
			return;
		}
		if (arg0) {
			this.aClass25_1.aClass75_1 = null;
			this.aClass25_1.anIntArray38 = null;
		}
		this.aClass25_1.anIntArrayArray14 = null;
		this.aClass25_1.aClass75Array1 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)Z")
	public boolean method2253(@OriginalArg(1) int arg0) {
		if (!this.method2255()) {
			return false;
		} else if (this.aClass25_1.anIntArray34.length == 1) {
			return this.method2251(arg0, 0);
		} else if (!this.method2268(arg0)) {
			return false;
		} else if (this.aClass25_1.anIntArray34[arg0] == 1) {
			return this.method2251(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method2254(@OriginalArg(1) String arg0) {
		if (this.method2255()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass25_1.aClass75_1.method1521(Static97.method1398(local12));
			return this.method2278(local28);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)Z")
	private boolean method2255() {
		if (this.aClass25_1 == null) {
			this.aClass25_1 = this.aClass222_1.method4780();
			if (this.aClass25_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass25_1.anInt623][];
			this.anObjectArray2 = new Object[this.aClass25_1.anInt623];
		}
		return true;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
	public void method2256() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)Z")
	public boolean method2257() {
		if (!this.method2255()) {
			return false;
		}
		@Pc(19) boolean local19 = true;
		for (@Pc(21) int local21 = 0; local21 < this.aClass25_1.anIntArray36.length; local21++) {
			@Pc(29) int local29 = this.aClass25_1.anIntArray36[local21];
			if (this.anObjectArray2[local29] == null) {
				this.method2276(local29);
				if (this.anObjectArray2[local29] == null) {
					local19 = false;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I")
	private int method2258(@OriginalArg(1) int arg0) {
		if (this.method2268(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass222_1.method4779(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public void method2259(@OriginalArg(0) String arg0) {
		if (this.method2255()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass25_1.aClass75_1.method1521(Static97.method1398(local11));
			this.method2281(local28);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method2260(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method2255()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass25_1.aClass75_1.method1521(Static97.method1398(local12));
		if (this.method2268(local24)) {
			@Pc(42) int local42 = this.aClass25_1.aClass75Array1[local24].method1521(Static97.method1398(local15));
			return this.method2251(local42, local24);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)V")
	public void method2261(@OriginalArg(0) int arg0) {
		if (this.method2268(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III[I)[B")
	public byte[] method2262(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method2270(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(30) boolean local30 = this.method2265(arg2, arg0, arg1);
			if (!local30) {
				this.method2276(arg1);
				local30 = this.method2265(arg2, arg0, arg1);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(67) byte[] local67 = Static153.method2152(false, this.anObjectArrayArray1[arg1][arg0]);
		if (this.anInt2734 == 1) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass25_1.anIntArray34[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt2734 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local67;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([IIII)Z")
	private boolean method2265(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method2268(arg2)) {
			return false;
		} else if (this.anObjectArray2[arg2] == null) {
			return false;
		} else {
			@Pc(33) int local33 = this.aClass25_1.anIntArray37[arg2];
			@Pc(39) int[] local39 = this.aClass25_1.anIntArrayArray15[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass25_1.anIntArray34[arg2]];
			}
			@Pc(59) Object[] local59 = this.anObjectArrayArray1[arg2];
			@Pc(61) boolean local61 = true;
			for (@Pc(63) int local63 = 0; local63 < local33; local63++) {
				@Pc(69) int local69;
				if (local39 == null) {
					local69 = local63;
				} else {
					local69 = local39[local63];
				}
				if (local59[local69] == null) {
					local61 = false;
					break;
				}
			}
			if (local61) {
				return true;
			}
			@Pc(117) byte[] local117;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local117 = Static153.method2152(false, this.anObjectArray2[arg2]);
			} else {
				local117 = Static153.method2152(true, this.anObjectArray2[arg2]);
				@Pc(122) Class1_Sub11 local122 = new Class1_Sub11(local117);
				local122.method4461(arg0, local122.aByteArray64.length);
			}
			@Pc(144) byte[] local144;
			try {
				local144 = Static130.method1780(local117);
			} catch (@Pc(146) RuntimeException local146) {
				throw Static33.method581(local146, "T3 - " + (arg0 != null) + "," + arg2 + "," + local117.length + "," + Static182.method2410(local117.length, local117) + "," + Static182.method2410(local117.length - 2, local117) + "," + this.aClass25_1.anIntArray35[arg2] + "," + this.aClass25_1.anInt619);
			}
			if (this.aBoolean217) {
				this.anObjectArray2[arg2] = null;
			}
			@Pc(221) int local221;
			if (local33 > 1) {
				@Pc(228) int local228;
				@Pc(241) Class1_Sub11 local241;
				@Pc(249) int local249;
				@Pc(253) int local253;
				@Pc(255) int local255;
				@Pc(309) int local309;
				@Pc(311) int local311;
				@Pc(315) int local315;
				@Pc(317) int local317;
				if (this.anInt2734 == 2) {
					local221 = local144.length;
					local221--;
					local228 = local144[local221] & 0xFF;
					local221 -= local228 * 4 * local33;
					local241 = new Class1_Sub11(local144);
					@Pc(423) int local423 = 0;
					local249 = 0;
					local241.anInt5766 = local221;
					for (local253 = 0; local253 < local228; local253++) {
						local255 = 0;
						for (local309 = 0; local309 < local33; local309++) {
							local255 += local241.method4487();
							if (local39 == null) {
								local311 = local309;
							} else {
								local311 = local39[local309];
							}
							if (local311 == arg1) {
								local249 = local311;
								local423 += local255;
							}
						}
					}
					if (local423 == 0) {
						return true;
					}
					@Pc(486) byte[] local486 = new byte[local423];
					local423 = 0;
					local241.anInt5766 = local221;
					local309 = 0;
					for (local311 = 0; local311 < local228; local311++) {
						local315 = 0;
						for (local317 = 0; local317 < local33; local317++) {
							local315 += local241.method4487();
							@Pc(515) int local515;
							if (local39 == null) {
								local515 = local317;
							} else {
								local515 = local39[local317];
							}
							if (local515 == arg1) {
								Static459.method2110(local144, local309, local486, local423, local315);
								local423 += local315;
							}
							local309 += local315;
						}
					}
					local59[local249] = local486;
				} else {
					local221 = local144.length;
					@Pc(223) int local223 = local221 - 1;
					local228 = local144[local223] & 0xFF;
					@Pc(236) int local236 = local223 - local228 * local33 * 4;
					local241 = new Class1_Sub11(local144);
					@Pc(244) int[] local244 = new int[local33];
					local241.anInt5766 = local236;
					for (local249 = 0; local249 < local228; local249++) {
						local253 = 0;
						for (local255 = 0; local255 < local33; local255++) {
							local253 += local241.method4487();
							local244[local255] += local253;
						}
					}
					@Pc(281) byte[][] local281 = new byte[local33][];
					for (local255 = 0; local255 < local33; local255++) {
						local281[local255] = new byte[local244[local255]];
						local244[local255] = 0;
					}
					local241.anInt5766 = local236;
					local309 = 0;
					for (local311 = 0; local311 < local228; local311++) {
						local315 = 0;
						for (local317 = 0; local317 < local33; local317++) {
							local315 += local241.method4487();
							Static459.method2110(local144, local309, local281[local317], local244[local317], local315);
							local309 += local315;
							local244[local317] += local315;
						}
					}
					for (local315 = 0; local315 < local33; local315++) {
						if (local39 == null) {
							local317 = local315;
						} else {
							local317 = local39[local315];
						}
						if (this.anInt2734 == 0) {
							local59[local317] = Static125.method1725(local281[local315]);
						} else {
							local59[local317] = local281[local315];
						}
					}
				}
			} else {
				if (local39 == null) {
					local221 = 0;
				} else {
					local221 = local39[0];
				}
				if (this.anInt2734 == 0) {
					local59[local221] = Static125.method1725(local144);
				} else {
					local59[local221] = local144;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)I")
	public int method2266() {
		if (!this.method2255()) {
			throw new IllegalStateException("");
		}
		return this.aClass25_1.anInt619;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method2267(@OriginalArg(1) String arg0) {
		if (this.method2255()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass25_1.aClass75_1.method1521(Static97.method1398(local18));
			return this.method2258(local27);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(II)Z")
	private boolean method2268(@OriginalArg(1) int arg0) {
		if (!this.method2255()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass25_1.anIntArray34.length && this.aClass25_1.anIntArray34[arg0] != 0) {
			return true;
		} else if (Static413.aBoolean548) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method2269(@OriginalArg(0) String arg0) {
		if (this.method2255()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass25_1.aClass75_1.method1521(Static97.method1398(local12));
			return this.method2268(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBI)Z")
	private boolean method2270(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2255()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass25_1.anIntArray34.length > arg1 && arg0 < this.aClass25_1.anIntArray34[arg1]) {
			return true;
		} else if (Static413.aBoolean548) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)I")
	public int method2271(@OriginalArg(1) int arg0) {
		return this.method2268(arg0) ? this.aClass25_1.anIntArray34[arg0] : 0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)I")
	public int method2272() {
		return this.method2255() ? this.aClass25_1.anIntArray34.length : -1;
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(II)[B")
	public byte[] method2273(@OriginalArg(0) int arg0) {
		if (!this.method2255()) {
			return null;
		} else if (this.aClass25_1.anIntArray34.length == 1) {
			return this.method2274(0, arg0);
		} else if (!this.method2268(arg0)) {
			return null;
		} else if (this.aClass25_1.anIntArray34[arg0] == 1) {
			return this.method2274(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIZ)[B")
	public byte[] method2274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method2262(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)[B")
	public byte[] method2275(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method2255()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass25_1.aClass75_1.method1521(Static97.method1398(local12));
		if (this.method2268(local24)) {
			@Pc(42) int local42 = this.aClass25_1.aClass75Array1[local24].method1521(Static97.method1398(local15));
			return this.method2274(local24, local42);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)V")
	private void method2276(@OriginalArg(0) int arg0) {
		if (this.aBoolean217) {
			this.anObjectArray2[arg0] = this.aClass222_1.method4786(arg0);
		} else {
			this.anObjectArray2[arg0] = Static125.method1725(this.aClass222_1.method4786(arg0));
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method2277(@OriginalArg(0) String arg0) {
		if (this.method2255()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass25_1.aClass75_1.method1521(Static97.method1398(local20));
			return local29 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)Z")
	public boolean method2278(@OriginalArg(0) int arg0) {
		if (!this.method2268(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method2276(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(II)I")
	public int method2279(@OriginalArg(1) int arg0) {
		if (this.method2255()) {
			@Pc(16) int local16 = this.aClass25_1.aClass75_1.method1521(arg0);
			return this.method2268(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(IZ)[I")
	public int[] method2280(@OriginalArg(0) int arg0) {
		if (!this.method2268(arg0)) {
			return null;
		}
		@Pc(26) int[] local26 = this.aClass25_1.anIntArrayArray15[arg0];
		if (local26 == null) {
			local26 = new int[this.aClass25_1.anIntArray37[arg0]];
			@Pc(37) int local37 = 0;
			while (local37 < local26.length) {
				local26[local37] = local37++;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(BI)V")
	private void method2281(@OriginalArg(1) int arg0) {
		this.aClass222_1.method4783(arg0);
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
	public void method2282() {
		if (this.anObjectArray2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray2.length; local6++) {
				this.anObjectArray2[local6] = null;
			}
		}
	}
}
