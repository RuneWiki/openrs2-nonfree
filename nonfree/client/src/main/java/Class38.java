import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class38 {

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray3;

	@OriginalMember(owner = "client!ci", name = "H", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Lclient!ss;")
	private Class238 aClass238_1 = null;

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "Z")
	private final boolean aBoolean73;

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "Lclient!ht;")
	private final Class79 aClass79_1;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
	public int anInt1056;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!ht;ZI)V")
	public Class38(@OriginalArg(0) Class79 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean73 = arg1;
		this.aClass79_1 = arg0;
		this.anInt1056 = arg2;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method1014(@OriginalArg(1) String arg0) {
		if (this.method1026()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass238_1.aClass161_1.method4073(Static241.method4020(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(III[I)Z")
	private boolean method1016(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method1028(arg0)) {
			return false;
		} else if (this.anObjectArray3[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass238_1.anIntArray533[arg0];
			@Pc(39) int[] local39 = this.aClass238_1.anIntArrayArray48[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass238_1.anIntArray536[arg0]];
			}
			@Pc(59) Object[] local59 = this.anObjectArrayArray1[arg0];
			@Pc(61) boolean local61 = true;
			for (@Pc(63) int local63 = 0; local63 < local25; local63++) {
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
			@Pc(127) byte[] local127;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local127 = Static141.method6328(false, this.anObjectArray3[arg0]);
			} else {
				local127 = Static141.method6328(true, this.anObjectArray3[arg0]);
				@Pc(132) Class4_Sub20 local132 = new Class4_Sub20(local127);
				local132.method4573(local132.aByteArray77.length, arg2);
			}
			@Pc(154) byte[] local154;
			try {
				local154 = Static63.method1457(local127);
			} catch (@Pc(156) RuntimeException local156) {
				throw Static215.method3947(local156, "T3 - " + (arg2 != null) + "," + arg0 + "," + local127.length + "," + Static22.method359(local127.length, local127) + "," + Static22.method359(local127.length - 2, local127) + "," + this.aClass238_1.anIntArray537[arg0] + "," + this.aClass238_1.anInt6697);
			}
			if (this.aBoolean73) {
				this.anObjectArray3[arg0] = null;
			}
			@Pc(230) int local230;
			if (local25 <= 1) {
				if (local39 == null) {
					local230 = 0;
				} else {
					local230 = local39[0];
				}
				if (this.anInt1056 == 0) {
					local59[local230] = Static445.method6066(local154);
				} else {
					local59[local230] = local154;
				}
			} else {
				@Pc(271) int local271;
				@Pc(284) Class4_Sub20 local284;
				@Pc(292) int local292;
				@Pc(296) int local296;
				@Pc(298) int local298;
				@Pc(358) int local358;
				@Pc(360) int local360;
				@Pc(364) int local364;
				@Pc(366) int local366;
				if (this.anInt1056 == 2) {
					local230 = local154.length;
					local230--;
					local271 = local154[local230] & 0xFF;
					local230 -= local271 * local25 * 4;
					local284 = new Class4_Sub20(local154);
					@Pc(483) int local483 = 0;
					local292 = 0;
					local284.anInt5526 = local230;
					for (local296 = 0; local296 < local271; local296++) {
						local298 = 0;
						for (local358 = 0; local358 < local25; local358++) {
							local298 += local284.method4595();
							if (local39 == null) {
								local360 = local358;
							} else {
								local360 = local39[local358];
							}
							if (local360 == arg1) {
								local483 += local298;
								local292 = local360;
							}
						}
					}
					if (local483 == 0) {
						return true;
					}
					@Pc(549) byte[] local549 = new byte[local483];
					local483 = 0;
					local284.anInt5526 = local230;
					local358 = 0;
					for (local360 = 0; local360 < local271; local360++) {
						local364 = 0;
						for (local366 = 0; local366 < local25; local366++) {
							local364 += local284.method4595();
							@Pc(576) int local576;
							if (local39 == null) {
								local576 = local366;
							} else {
								local576 = local39[local366];
							}
							if (arg1 == local576) {
								Static474.method3327(local154, local358, local549, local483, local364);
								local483 += local364;
							}
							local358 += local364;
						}
					}
					local59[local292] = local549;
				} else {
					local230 = local154.length;
					local230--;
					local271 = local154[local230] & 0xFF;
					local230 -= local271 * 4 * local25;
					local284 = new Class4_Sub20(local154);
					local284.anInt5526 = local230;
					@Pc(290) int[] local290 = new int[local25];
					for (local292 = 0; local292 < local271; local292++) {
						local296 = 0;
						for (local298 = 0; local298 < local25; local298++) {
							local296 += local284.method4595();
							local290[local298] += local296;
						}
					}
					@Pc(334) byte[][] local334 = new byte[local25][];
					for (local298 = 0; local298 < local25; local298++) {
						local334[local298] = new byte[local290[local298]];
						local290[local298] = 0;
					}
					local284.anInt5526 = local230;
					local358 = 0;
					for (local360 = 0; local360 < local271; local360++) {
						local364 = 0;
						for (local366 = 0; local366 < local25; local366++) {
							local364 += local284.method4595();
							Static474.method3327(local154, local358, local334[local366], local290[local366], local364);
							local358 += local364;
							local290[local366] += local364;
						}
					}
					for (local364 = 0; local364 < local25; local364++) {
						if (local39 == null) {
							local366 = local364;
						} else {
							local366 = local39[local364];
						}
						if (this.anInt1056 == 0) {
							local59[local366] = Static445.method6066(local334[local364]);
						} else {
							local59[local366] = local334[local364];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public void method1017(@OriginalArg(0) String arg0) {
		if (this.method1026()) {
			@Pc(16) String local16 = arg0.toLowerCase();
			@Pc(25) int local25 = this.aClass238_1.aClass161_1.method4073(Static241.method4020(local16));
			this.method1042(local25);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method1018(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1026()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass238_1.aClass161_1.method4073(Static241.method4020(local12));
		if (this.method1028(local24)) {
			@Pc(47) int local47 = this.aClass238_1.aClass161Array1[local24].method4073(Static241.method4020(local15));
			return this.method1039(local47, local24);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)I")
	public int method1019() {
		if (!this.method1026()) {
			throw new IllegalStateException("");
		}
		return this.aClass238_1.anInt6697;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
	private void method1020(@OriginalArg(1) int arg0) {
		if (this.aBoolean73) {
			this.anObjectArray3[arg0] = this.aClass79_1.method2222(arg0);
		} else {
			this.anObjectArray3[arg0] = Static445.method6066(this.aClass79_1.method2222(arg0));
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)Z")
	public boolean method1021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method1047(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray3[arg0] == null) {
			this.method1020(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)I")
	public int method1022() {
		if (!this.method1026()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray3.length; local17++) {
			if (this.aClass238_1.anIntArray533[local17] > 0) {
				local13 += 100;
				local15 += this.method1038(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)[I")
	public int[] method1024(@OriginalArg(1) int arg0) {
		if (!this.method1028(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass238_1.anIntArrayArray48[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass238_1.anIntArray533[arg0]];
			@Pc(34) int local34 = 0;
			while (local18.length > local34) {
				local18[local34] = local34++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZIZ)V")
	public void method1025(@OriginalArg(2) boolean arg0) {
		if (!this.method1026()) {
			return;
		}
		this.aClass238_1.anIntArrayArray49 = null;
		this.aClass238_1.aClass161Array1 = null;
		if (arg0) {
			this.aClass238_1.anIntArray535 = null;
			this.aClass238_1.aClass161_1 = null;
		}
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)Z")
	private boolean method1026() {
		if (this.aClass238_1 == null) {
			this.aClass238_1 = this.aClass79_1.method2220();
			if (this.aClass238_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass238_1.anInt6698][];
			this.anObjectArray3 = new Object[this.aClass238_1.anInt6698];
		}
		return true;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)V")
	public void method1027(@OriginalArg(0) int arg0) {
		if (this.method1028(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(BI)Z")
	private boolean method1028(@OriginalArg(1) int arg0) {
		if (!this.method1026()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass238_1.anIntArray536.length && this.aClass238_1.anIntArray536[arg0] != 0) {
			return true;
		} else if (Static338.aBoolean451) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)I")
	public int method1029(@OriginalArg(0) int arg0) {
		if (this.method1026()) {
			@Pc(24) int local24 = this.aClass238_1.aClass161_1.method4073(arg0);
			return this.method1028(local24) ? local24 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)Z")
	public boolean method1030() {
		if (!this.method1026()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass238_1.anIntArray538.length; local15++) {
			@Pc(23) int local23 = this.aClass238_1.anIntArray538[local15];
			if (this.anObjectArray3[local23] == null) {
				this.method1020(local23);
				if (this.anObjectArray3[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)[B")
	public byte[] method1031(@OriginalArg(0) int arg0) {
		if (!this.method1026()) {
			return null;
		} else if (this.aClass238_1.anIntArray536.length == 1) {
			return this.method1039(arg0, 0);
		} else if (!this.method1028(arg0)) {
			return null;
		} else if (this.aClass238_1.anIntArray536[arg0] == 1) {
			return this.method1039(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(II)I")
	public int method1032(@OriginalArg(1) int arg0) {
		return this.method1028(arg0) ? this.aClass238_1.anIntArray536[arg0] : 0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method1033(@OriginalArg(0) String arg0) {
		if (this.method1026()) {
			@Pc(14) String local14 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass238_1.aClass161_1.method4073(Static241.method4020(local14));
			return this.method1038(local28);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method1034(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1026()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass238_1.aClass161_1.method4073(Static241.method4020(local12));
		if (this.method1028(local24)) {
			@Pc(47) int local47 = this.aClass238_1.aClass161Array1[local24].method4073(Static241.method4020(local15));
			return this.method1021(local24, local47);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)I")
	public int method1035() {
		return this.method1026() ? this.aClass238_1.anIntArray536.length : -1;
	}

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)V")
	public void method1036() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anObjectArrayArray1.length; local16++) {
				this.anObjectArrayArray1[local16] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(IB)Z")
	public boolean method1037(@OriginalArg(0) int arg0) {
		if (!this.method1026()) {
			return false;
		} else if (this.aClass238_1.anIntArray536.length == 1) {
			return this.method1021(0, arg0);
		} else if (!this.method1028(arg0)) {
			return false;
		} else if (this.aClass238_1.anIntArray536[arg0] == 1) {
			return this.method1021(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(II)I")
	private int method1038(@OriginalArg(0) int arg0) {
		if (this.method1028(arg0)) {
			return this.anObjectArray3[arg0] == null ? this.aClass79_1.method2224(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBI)[B")
	public byte[] method1039(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method1041(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[IIB)[B")
	public byte[] method1041(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!this.method1047(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg0] == null) {
			@Pc(30) boolean local30 = this.method1016(arg2, arg0, arg1);
			if (!local30) {
				this.method1020(arg2);
				local30 = this.method1016(arg2, arg0, arg1);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static141.method6328(false, this.anObjectArrayArray1[arg2][arg0]);
		if (this.anInt1056 == 1) {
			this.anObjectArrayArray1[arg2][arg0] = null;
			if (this.aClass238_1.anIntArray536[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt1056 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(IB)V")
	private void method1042(@OriginalArg(0) int arg0) {
		this.aClass79_1.method2221(arg0);
	}

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "(II)Z")
	public boolean method1044(@OriginalArg(0) int arg0) {
		if (!this.method1028(arg0)) {
			return false;
		} else if (this.anObjectArray3[arg0] == null) {
			this.method1020(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(BLjava/lang/String;)I")
	public int method1045(@OriginalArg(1) String arg0) {
		if (this.method1026()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass238_1.aClass161_1.method4073(Static241.method4020(local20));
			return this.method1028(local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)V")
	public void method1046() {
		if (this.anObjectArray3 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArray3.length; local14++) {
				this.anObjectArray3[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(IBI)Z")
	private boolean method1047(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1026()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass238_1.anIntArray536.length && arg0 < this.aClass238_1.anIntArray536[arg1]) {
			return true;
		} else if (Static338.aBoolean451) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method1048(@OriginalArg(0) String arg0) {
		if (this.method1026()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass238_1.aClass161_1.method4073(Static241.method4020(local12));
			return this.method1044(local21);
		} else {
			return false;
		}
	}
}
