import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class54 {

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!dk", name = "w", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray34;

	@OriginalMember(owner = "client!dk", name = "k", descriptor = "Lclient!lf;")
	private Class143 aClass143_1 = null;

	@OriginalMember(owner = "client!dk", name = "E", descriptor = "Z")
	private final boolean aBoolean115;

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
	public int anInt1425;

	@OriginalMember(owner = "client!dk", name = "s", descriptor = "Lclient!ar;")
	private final Class14 aClass14_1;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!ar;ZI)V")
	public Class54(@OriginalArg(0) Class14 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean115 = arg1;
		this.anInt1425 = arg2;
		this.aClass14_1 = arg0;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method1102(@OriginalArg(0) String arg0) {
		if (this.method1134()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass143_1.aClass255_1.method5370(Static85.method1357(local12));
			return this.method1121(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)Z")
	public boolean method1103(@OriginalArg(0) int arg0) {
		if (!this.method1121(arg0)) {
			return false;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method1118(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method1104(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1134()) {
			return null;
		}
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(23) String local23 = arg0.toLowerCase();
		@Pc(34) int local34 = this.aClass143_1.aClass255_1.method5370(Static85.method1357(local20));
		if (this.method1121(local34)) {
			@Pc(52) int local52 = this.aClass143_1.aClass255Array1[local34].method5370(Static85.method1357(local23));
			return this.method1126(local34, local52);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method1105(@OriginalArg(0) String arg0) {
		if (this.method1134()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass143_1.aClass255_1.method5370(Static85.method1357(local12));
			return this.method1103(local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II[IZ)[B")
	public byte[] method1106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method1133(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(35) boolean local35 = this.method1114(arg2, arg1, arg0);
			if (!local35) {
				this.method1118(arg1);
				local35 = this.method1114(arg2, arg1, arg0);
				if (!local35) {
					return null;
				}
			}
		}
		@Pc(62) byte[] local62 = Static34.method520(this.anObjectArrayArray1[arg1][arg0], false);
		if (this.anInt1425 == 1) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass143_1.anIntArray313[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt1425 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local62;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)I")
	public int method1107() {
		return this.method1134() ? this.aClass143_1.anIntArray313.length : -1;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method1108(@OriginalArg(0) String arg0) {
		if (this.method1134()) {
			@Pc(21) String local21 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass143_1.aClass255_1.method5370(Static85.method1357(local21));
			return this.method1119(local30);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V")
	public void method1109(@OriginalArg(0) int arg0) {
		if (this.method1121(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)[B")
	public byte[] method1110(@OriginalArg(0) int arg0) {
		if (!this.method1134()) {
			return null;
		} else if (this.aClass143_1.anIntArray313.length == 1) {
			return this.method1126(0, arg0);
		} else if (!this.method1121(arg0)) {
			return null;
		} else if (this.aClass143_1.anIntArray313[arg0] == 1) {
			return this.method1126(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Z")
	public boolean method1111() {
		if (!this.method1134()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass143_1.anIntArray314.length; local15++) {
			@Pc(23) int local23 = this.aClass143_1.anIntArray314[local15];
			if (this.anObjectArray34[local23] == null) {
				this.method1118(local23);
				if (this.anObjectArray34[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Z")
	public boolean method1112(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1133(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method1118(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(II)[I")
	public int[] method1113(@OriginalArg(1) int arg0) {
		if (!this.method1121(arg0)) {
			return null;
		}
		@Pc(22) int[] local22 = this.aClass143_1.anIntArrayArray22[arg0];
		if (local22 == null) {
			local22 = new int[this.aClass143_1.anIntArray312[arg0]];
			@Pc(33) int local33 = 0;
			while (local22.length > local33) {
				local22[local33] = local33++;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "([IIII)Z")
	private boolean method1114(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method1121(arg1)) {
			return false;
		} else if (this.anObjectArray34[arg1] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass143_1.anIntArray312[arg1];
			@Pc(31) int[] local31 = this.aClass143_1.anIntArrayArray22[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass143_1.anIntArray313[arg1]];
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
			@Pc(116) byte[] local116;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local116 = Static34.method520(this.anObjectArray34[arg1], false);
			} else {
				local116 = Static34.method520(this.anObjectArray34[arg1], true);
				@Pc(131) Class2_Sub13 local131 = new Class2_Sub13(local116);
				local131.method3578(arg0, local131.aByteArray52.length);
			}
			@Pc(151) byte[] local151;
			try {
				local151 = Static331.method4431(local116);
			} catch (@Pc(153) RuntimeException local153) {
				throw Static68.method4002(local153, "T3 - " + (arg0 != null) + "," + arg1 + "," + local116.length + "," + Static257.method3285(local116, local116.length) + "," + Static257.method3285(local116, local116.length - 2) + "," + this.aClass143_1.anIntArray316[arg1] + "," + this.aClass143_1.anInt3692);
			}
			if (this.aBoolean115) {
				this.anObjectArray34[arg1] = null;
			}
			@Pc(230) int local230;
			if (local25 > 1) {
				@Pc(237) int local237;
				@Pc(250) Class2_Sub13 local250;
				@Pc(257) int local257;
				@Pc(259) int local259;
				@Pc(263) int local263;
				@Pc(265) int local265;
				@Pc(279) int local279;
				@Pc(324) int local324;
				@Pc(326) int local326;
				if (this.anInt1425 == 2) {
					local230 = local151.length;
					@Pc(233) int local233 = local230 - 1;
					local237 = local151[local233] & 0xFF;
					@Pc(245) int local245 = local233 - local237 * local25 * 4;
					local250 = new Class2_Sub13(local151);
					@Pc(252) int local252 = 0;
					local250.anInt4347 = local245;
					local257 = 0;
					for (local259 = 0; local259 < local237; local259++) {
						local263 = 0;
						for (local265 = 0; local265 < local25; local265++) {
							local263 += local250.method3574();
							if (local31 == null) {
								local279 = local265;
							} else {
								local279 = local31[local265];
							}
							if (arg2 == local279) {
								local257 = local279;
								local252 += local263;
							}
						}
					}
					if (local252 == 0) {
						return true;
					}
					@Pc(311) byte[] local311 = new byte[local252];
					local252 = 0;
					local250.anInt4347 = local245;
					local265 = 0;
					for (local279 = 0; local279 < local237; local279++) {
						local324 = 0;
						for (local326 = 0; local326 < local25; local326++) {
							local324 += local250.method3574();
							@Pc(338) int local338;
							if (local31 == null) {
								local338 = local326;
							} else {
								local338 = local31[local326];
							}
							if (local338 == arg2) {
								Static464.method1964(local151, local265, local311, local252, local324);
								local252 += local324;
							}
							local265 += local324;
						}
					}
					local51[local257] = local311;
				} else {
					local230 = local151.length;
					local230--;
					local237 = local151[local230] & 0xFF;
					local230 -= local237 * 4 * local25;
					local250 = new Class2_Sub13(local151);
					@Pc(409) int[] local409 = new int[local25];
					local250.anInt4347 = local230;
					for (local257 = 0; local257 < local237; local257++) {
						local259 = 0;
						for (local263 = 0; local263 < local25; local263++) {
							local259 += local250.method3574();
							local409[local263] += local259;
						}
					}
					@Pc(450) byte[][] local450 = new byte[local25][];
					for (local263 = 0; local263 < local25; local263++) {
						local450[local263] = new byte[local409[local263]];
						local409[local263] = 0;
					}
					local250.anInt4347 = local230;
					local265 = 0;
					for (local279 = 0; local279 < local237; local279++) {
						local324 = 0;
						for (local326 = 0; local326 < local25; local326++) {
							local324 += local250.method3574();
							Static464.method1964(local151, local265, local450[local326], local409[local326], local324);
							local409[local326] += local324;
							local265 += local324;
						}
					}
					for (local324 = 0; local324 < local25; local324++) {
						if (local31 == null) {
							local326 = local324;
						} else {
							local326 = local31[local324];
						}
						if (this.anInt1425 == 0) {
							local51[local326] = Static163.method2307(local450[local324]);
						} else {
							local51[local326] = local450[local324];
						}
					}
				}
			} else {
				if (local31 == null) {
					local230 = 0;
				} else {
					local230 = local31[0];
				}
				if (this.anInt1425 == 0) {
					local51[local230] = Static163.method2307(local151);
				} else {
					local51[local230] = local151;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "(I)V")
	public void method1117() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArrayArray1.length; local14++) {
				this.anObjectArrayArray1[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)V")
	private void method1118(@OriginalArg(0) int arg0) {
		if (this.aBoolean115) {
			this.anObjectArray34[arg0] = this.aClass14_1.method2729(arg0);
		} else {
			this.anObjectArray34[arg0] = Static163.method2307(this.aClass14_1.method2729(arg0));
		}
	}

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "(II)I")
	private int method1119(@OriginalArg(1) int arg0) {
		if (this.method1121(arg0)) {
			return this.anObjectArray34[arg0] == null ? this.aClass14_1.method2731(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "(II)Z")
	private boolean method1121(@OriginalArg(0) int arg0) {
		if (!this.method1134()) {
			return false;
		} else if (arg0 >= 0 && this.aClass143_1.anIntArray313.length > arg0 && this.aClass143_1.anIntArray313[arg0] != 0) {
			return true;
		} else if (Static99.aBoolean133) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "(I)I")
	public int method1122() {
		if (!this.method1134()) {
			throw new IllegalStateException("");
		}
		return this.aClass143_1.anInt3692;
	}

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "(II)I")
	public int method1123(@OriginalArg(1) int arg0) {
		return this.method1121(arg0) ? this.aClass143_1.anIntArray313[arg0] : 0;
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method1124(@OriginalArg(0) String arg0) {
		if (this.method1134()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass143_1.aClass255_1.method5370(Static85.method1357(local17));
			return local26 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BZZ)V")
	public void method1125(@OriginalArg(2) boolean arg0) {
		if (!this.method1134()) {
			return;
		}
		if (arg0) {
			this.aClass143_1.anIntArray317 = null;
			this.aClass143_1.aClass255_1 = null;
		}
		this.aClass143_1.aClass255Array1 = null;
		this.aClass143_1.anIntArrayArray21 = null;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBI)[B")
	public byte[] method1126(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method1106(arg1, arg0, null);
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)I")
	public int method1127() {
		if (!this.method1134()) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < this.anObjectArray34.length; local22++) {
			if (this.aClass143_1.anIntArray312[local22] > 0) {
				local20 += this.method1119(local22);
				local18 += 100;
			}
		}
		if (local18 == 0) {
			return 100;
		} else {
			return local20 * 100 / local18;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method1128(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1134()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass143_1.aClass255_1.method5370(Static85.method1357(local12));
		if (this.method1121(local32)) {
			@Pc(50) int local50 = this.aClass143_1.aClass255Array1[local32].method5370(Static85.method1357(local23));
			return this.method1112(local32, local50);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)I")
	public int method1129(@OriginalArg(1) int arg0) {
		if (this.method1134()) {
			@Pc(25) int local25 = this.aClass143_1.aClass255_1.method5370(arg0);
			return this.method1121(local25) ? local25 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "(Ljava/lang/String;I)V")
	public void method1130(@OriginalArg(0) String arg0) {
		if (this.method1134()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(25) int local25 = this.aClass143_1.aClass255_1.method5370(Static85.method1357(local11));
			this.method1132(local25);
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(IB)Z")
	public boolean method1131(@OriginalArg(0) int arg0) {
		if (!this.method1134()) {
			return false;
		} else if (this.aClass143_1.anIntArray313.length == 1) {
			return this.method1112(0, arg0);
		} else if (!this.method1121(arg0)) {
			return false;
		} else if (this.aClass143_1.anIntArray313[arg0] == 1) {
			return this.method1112(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "(II)V")
	private void method1132(@OriginalArg(1) int arg0) {
		this.aClass14_1.method2726(arg0);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BII)Z")
	private boolean method1133(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1134()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass143_1.anIntArray313.length && this.aClass143_1.anIntArray313[arg1] > arg0) {
			return true;
		} else if (Static99.aBoolean133) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)Z")
	private boolean method1134() {
		if (this.aClass143_1 == null) {
			this.aClass143_1 = this.aClass14_1.method2727();
			if (this.aClass143_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass143_1.anInt3689][];
			this.anObjectArray34 = new Object[this.aClass143_1.anInt3689];
		}
		return true;
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)V")
	public void method1135() {
		if (this.anObjectArray34 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArray34.length; local14++) {
				this.anObjectArray34[local14] = null;
			}
		}
	}
}
