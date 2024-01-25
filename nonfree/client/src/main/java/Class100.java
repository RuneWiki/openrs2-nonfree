import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class100 {

	@OriginalMember(owner = "client!he", name = "p", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!he", name = "M", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!he", name = "v", descriptor = "Lclient!vn;")
	private Class252 aClass252_1 = null;

	@OriginalMember(owner = "client!he", name = "y", descriptor = "Z")
	private final boolean aBoolean190;

	@OriginalMember(owner = "client!he", name = "j", descriptor = "Lclient!es;")
	private final Class68 aClass68_1;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "I")
	public int anInt2998;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!es;ZI)V")
	public Class100(@OriginalArg(0) Class68 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean190 = arg1;
		this.aClass68_1 = arg0;
		this.anInt2998 = arg2;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)Z")
	public boolean method2492(@OriginalArg(0) int arg0) {
		if (!this.method2501()) {
			return false;
		} else if (this.aClass252_1.anIntArray524.length == 1) {
			return this.method2495(arg0, 0);
		} else if (!this.method2525(arg0)) {
			return false;
		} else if (this.aClass252_1.anIntArray524[arg0] == 1) {
			return this.method2495(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III[I)Z")
	private boolean method2493(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method2525(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass252_1.anIntArray520[arg0];
			@Pc(31) int[] local31 = this.aClass252_1.anIntArrayArray54[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass252_1.anIntArray524[arg0]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg0];
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
			@Pc(122) byte[] local122;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local122 = Static134.method2371(false, this.anObjectArray1[arg0]);
			} else {
				local122 = Static134.method2371(true, this.anObjectArray1[arg0]);
				@Pc(137) Class6_Sub1 local137 = new Class6_Sub1(local122);
				local137.method6449(arg2, local137.aByteArray96.length);
			}
			@Pc(149) byte[] local149;
			try {
				local149 = Static392.method4244(local122);
			} catch (@Pc(151) RuntimeException local151) {
				throw Static427.method6227(local151, "T3 - " + (arg2 != null) + "," + arg0 + "," + local122.length + "," + Static95.method1696(local122.length, local122) + "," + Static95.method1696(local122.length - 2, local122) + "," + this.aClass252_1.anIntArray521[arg0] + "," + this.aClass252_1.anInt7591);
			}
			if (this.aBoolean190) {
				this.anObjectArray1[arg0] = null;
			}
			@Pc(224) int local224;
			if (local25 > 1) {
				@Pc(231) int local231;
				@Pc(244) Class6_Sub1 local244;
				@Pc(252) int local252;
				@Pc(256) int local256;
				@Pc(258) int local258;
				@Pc(312) int local312;
				@Pc(314) int local314;
				@Pc(318) int local318;
				@Pc(320) int local320;
				if (this.anInt2998 == 2) {
					local224 = local149.length;
					local224--;
					local231 = local149[local224] & 0xFF;
					local224 -= local25 * local231 * 4;
					local244 = new Class6_Sub1(local149);
					@Pc(433) int local433 = 0;
					local244.anInt7898 = local224;
					local252 = 0;
					for (local256 = 0; local256 < local231; local256++) {
						local258 = 0;
						for (local312 = 0; local312 < local25; local312++) {
							local258 += local244.method6442();
							if (local31 == null) {
								local314 = local312;
							} else {
								local314 = local31[local312];
							}
							if (arg1 == local314) {
								local433 += local258;
								local252 = local314;
							}
						}
					}
					if (local433 == 0) {
						return true;
					}
					@Pc(495) byte[] local495 = new byte[local433];
					local244.anInt7898 = local224;
					local433 = 0;
					local312 = 0;
					for (local314 = 0; local314 < local231; local314++) {
						local318 = 0;
						for (local320 = 0; local320 < local25; local320++) {
							local318 += local244.method6442();
							@Pc(526) int local526;
							if (local31 == null) {
								local526 = local320;
							} else {
								local526 = local31[local320];
							}
							if (local526 == arg1) {
								Static459.method6338(local149, local312, local495, local433, local318);
								local433 += local318;
							}
							local312 += local318;
						}
					}
					local51[local252] = local495;
				} else {
					local224 = local149.length;
					@Pc(227) int local227 = local224 - 1;
					local231 = local149[local227] & 0xFF;
					@Pc(239) int local239 = local227 - local25 * local231 * 4;
					local244 = new Class6_Sub1(local149);
					@Pc(247) int[] local247 = new int[local25];
					local244.anInt7898 = local239;
					for (local252 = 0; local252 < local231; local252++) {
						local256 = 0;
						for (local258 = 0; local258 < local25; local258++) {
							local256 += local244.method6442();
							local247[local258] += local256;
						}
					}
					@Pc(284) byte[][] local284 = new byte[local25][];
					for (local258 = 0; local258 < local25; local258++) {
						local284[local258] = new byte[local247[local258]];
						local247[local258] = 0;
					}
					local244.anInt7898 = local239;
					local312 = 0;
					for (local314 = 0; local314 < local231; local314++) {
						local318 = 0;
						for (local320 = 0; local320 < local25; local320++) {
							local318 += local244.method6442();
							Static459.method6338(local149, local312, local284[local320], local247[local320], local318);
							local247[local320] += local318;
							local312 += local318;
						}
					}
					for (local318 = 0; local318 < local25; local318++) {
						if (local31 == null) {
							local320 = local318;
						} else {
							local320 = local31[local318];
						}
						if (this.anInt2998 == 0) {
							local51[local320] = Static369.method3610(local284[local318]);
						} else {
							local51[local320] = local284[local318];
						}
					}
				}
			} else {
				if (local31 == null) {
					local224 = 0;
				} else {
					local224 = local31[0];
				}
				if (this.anInt2998 == 0) {
					local51[local224] = Static369.method3610(local149);
				} else {
					local51[local224] = local149;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method2494(@OriginalArg(0) String arg0) {
		if (this.method2501()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass252_1.aClass47_1.method1373(Static94.method1672(local17));
			return this.method2525(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)Z")
	public boolean method2495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2521(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray1[arg1] == null) {
			this.method2524(arg1);
			return this.anObjectArray1[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method2496(@OriginalArg(1) String arg0) {
		if (this.method2501()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass252_1.aClass47_1.method1373(Static94.method1672(local12));
			return this.method2497(local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BI)Z")
	public boolean method2497(@OriginalArg(1) int arg0) {
		if (!this.method2525(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method2524(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Z")
	public boolean method2498() {
		if (!this.method2501()) {
			return false;
		}
		@Pc(20) boolean local20 = true;
		for (@Pc(22) int local22 = 0; local22 < this.aClass252_1.anIntArray523.length; local22++) {
			@Pc(30) int local30 = this.aClass252_1.anIntArray523[local22];
			if (this.anObjectArray1[local30] == null) {
				this.method2524(local30);
				if (this.anObjectArray1[local30] == null) {
					local20 = false;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(IB)I")
	private int method2499(@OriginalArg(0) int arg0) {
		if (this.method2525(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass68_1.method5215(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BZZ)V")
	public void method2500(@OriginalArg(2) boolean arg0) {
		if (!this.method2501()) {
			return;
		}
		this.aClass252_1.aClass47Array1 = null;
		this.aClass252_1.anIntArrayArray53 = null;
		if (arg0) {
			this.aClass252_1.aClass47_1 = null;
			this.aClass252_1.anIntArray522 = null;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)Z")
	private boolean method2501() {
		if (this.aClass252_1 == null) {
			this.aClass252_1 = this.aClass68_1.method5216();
			if (this.aClass252_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass252_1.anInt7592][];
			this.anObjectArray1 = new Object[this.aClass252_1.anInt7592];
		}
		return true;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)I")
	public int method2502() {
		if (!this.method2501()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray1.length; local17++) {
			if (this.aClass252_1.anIntArray520[local17] > 0) {
				local15 += this.method2499(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method2503(@OriginalArg(0) String arg0) {
		if (this.method2501()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass252_1.aClass47_1.method1373(Static94.method1672(local12));
			return local26 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(BI)[I")
	public int[] method2504(@OriginalArg(1) int arg0) {
		if (!this.method2525(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass252_1.anIntArrayArray54[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass252_1.anIntArray520[arg0]];
			@Pc(34) int local34 = 0;
			while (local34 < local23.length) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
	private void method2506(@OriginalArg(1) int arg0) {
		this.aClass68_1.method5214(arg0);
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	public void method2507() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method2508(@OriginalArg(0) String arg0) {
		if (this.method2501()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass252_1.aClass47_1.method1373(Static94.method1672(local18));
			return this.method2499(local27);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method2509(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method2501()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(29) int local29 = this.aClass252_1.aClass47_1.method1373(Static94.method1672(local12));
		if (this.method2525(local29)) {
			@Pc(47) int local47 = this.aClass252_1.aClass47Array1[local29].method1373(Static94.method1672(local15));
			return this.method2495(local47, local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public void method2510() {
		if (this.anObjectArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray1.length; local6++) {
				this.anObjectArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I[IZI)[B")
	public byte[] method2511(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method2521(arg2, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(35) boolean local35 = this.method2493(arg0, arg2, arg1);
			if (!local35) {
				this.method2524(arg0);
				local35 = this.method2493(arg0, arg2, arg1);
				if (!local35) {
					return null;
				}
			}
		}
		@Pc(62) byte[] local62 = Static134.method2371(false, this.anObjectArrayArray1[arg0][arg2]);
		if (this.anInt2998 == 1) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass252_1.anIntArray524[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt2998 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local62;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)I")
	public int method2513(@OriginalArg(1) int arg0) {
		if (this.method2501()) {
			@Pc(21) int local21 = this.aClass252_1.aClass47_1.method1373(arg0);
			return this.method2525(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)V")
	public void method2514(@OriginalArg(0) int arg0) {
		if (this.method2525(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(II)[B")
	public byte[] method2515(@OriginalArg(1) int arg0) {
		if (!this.method2501()) {
			return null;
		} else if (this.aClass252_1.anIntArray524.length == 1) {
			return this.method2520(arg0, 0);
		} else if (!this.method2525(arg0)) {
			return null;
		} else if (this.aClass252_1.anIntArray524[arg0] == 1) {
			return this.method2520(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Z)I")
	public int method2516() {
		return this.method2501() ? this.aClass252_1.anIntArray524.length : -1;
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)I")
	public int method2517() {
		if (!this.method2501()) {
			throw new IllegalStateException("");
		}
		return this.aClass252_1.anInt7591;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method2518(@OriginalArg(1) String arg0) {
		if (this.method2501()) {
			@Pc(15) String local15 = arg0.toLowerCase();
			@Pc(24) int local24 = this.aClass252_1.aClass47_1.method1373(Static94.method1672(local15));
			this.method2506(local24);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
	public byte[] method2519(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2501()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(29) int local29 = this.aClass252_1.aClass47_1.method1373(Static94.method1672(local12));
		if (this.method2525(local29)) {
			@Pc(49) int local49 = this.aClass252_1.aClass47Array1[local29].method1373(Static94.method1672(local20));
			return this.method2520(local49, local29);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(III)[B")
	public byte[] method2520(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method2511(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IBI)Z")
	private boolean method2521(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2501()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass252_1.anIntArray524.length && arg0 < this.aClass252_1.anIntArray524[arg1]) {
			return true;
		} else if (Static129.aBoolean182) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(II)I")
	public int method2523(@OriginalArg(1) int arg0) {
		return this.method2525(arg0) ? this.aClass252_1.anIntArray524[arg0] : 0;
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(II)V")
	private void method2524(@OriginalArg(1) int arg0) {
		if (this.aBoolean190) {
			this.anObjectArray1[arg0] = this.aClass68_1.method5213(arg0);
		} else {
			this.anObjectArray1[arg0] = Static369.method3610(this.aClass68_1.method5213(arg0));
		}
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(II)Z")
	private boolean method2525(@OriginalArg(0) int arg0) {
		if (!this.method2501()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass252_1.anIntArray524.length && this.aClass252_1.anIntArray524[arg0] != 0) {
			return true;
		} else if (Static129.aBoolean182) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}
}
