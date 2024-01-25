import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class53 {

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!dp", name = "I", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!dp", name = "p", descriptor = "Lclient!l;")
	private Class121 aClass121_1 = null;

	@OriginalMember(owner = "client!dp", name = "D", descriptor = "Lclient!ia;")
	private final Class98 aClass98_1;

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
	public int anInt1133;

	@OriginalMember(owner = "client!dp", name = "u", descriptor = "Z")
	private final boolean aBoolean82;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!ia;ZI)V")
	public Class53(@OriginalArg(0) Class98 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass98_1 = arg0;
		this.anInt1133 = arg2;
		this.aBoolean82 = arg1;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)I")
	public int method1003() {
		return this.method1028() ? this.aClass121_1.anIntArray379.length : -1;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB)V")
	private void method1004(@OriginalArg(0) int arg0) {
		this.aClass98_1.method4130(arg0);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)I")
	public int method1005() {
		if (!this.method1028()) {
			throw new IllegalStateException("");
		}
		return this.aClass121_1.anInt3159;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
	public byte[] method1006(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method1028()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass121_1.aClass149_1.method3906(Static108.method2196(local12));
		if (this.method1022(local24)) {
			@Pc(47) int local47 = this.aClass121_1.aClass149Array1[local24].method3906(Static108.method2196(local15));
			return this.method1033(local47, local24);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method1007(@OriginalArg(0) String arg0) {
		if (this.method1028()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass121_1.aClass149_1.method3906(Static108.method2196(local12));
			return this.method1035(local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)I")
	private int method1008(@OriginalArg(0) int arg0) {
		if (this.method1022(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass98_1.method4128(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public void method1009(@OriginalArg(1) String arg0) {
		if (this.method1028()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass121_1.aClass149_1.method3906(Static108.method2196(local11));
			this.method1004(local20);
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(II)I")
	public int method1011(@OriginalArg(1) int arg0) {
		return this.method1022(arg0) ? this.aClass121_1.anIntArray379[arg0] : 0;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II[IB)Z")
	private boolean method1013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method1022(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass121_1.anIntArray382[arg0];
			@Pc(31) int[] local31 = this.aClass121_1.anIntArrayArray120[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass121_1.anIntArray379[arg0]];
			}
			@Pc(59) Object[] local59 = this.anObjectArrayArray1[arg0];
			@Pc(61) boolean local61 = true;
			for (@Pc(63) int local63 = 0; local63 < local25; local63++) {
				@Pc(71) int local71;
				if (local31 == null) {
					local71 = local63;
				} else {
					local71 = local31[local63];
				}
				if (local59[local71] == null) {
					local61 = false;
					break;
				}
			}
			if (local61) {
				return true;
			}
			@Pc(130) byte[] local130;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local130 = Static168.method734(false, this.anObjectArray1[arg0]);
			} else {
				local130 = Static168.method734(true, this.anObjectArray1[arg0]);
				@Pc(145) Class6_Sub10 local145 = new Class6_Sub10(local130);
				local145.method4015(local145.aByteArray67.length, arg2);
			}
			@Pc(157) byte[] local157;
			try {
				local157 = Static90.method1536(local130);
			} catch (@Pc(159) RuntimeException local159) {
				throw Static127.method4132(local159, "T3 - " + (arg2 != null) + "," + arg0 + "," + local130.length + "," + Static266.method4503(local130.length, local130) + "," + Static266.method4503(local130.length - 2, local130) + "," + this.aClass121_1.anIntArray380[arg0] + "," + this.aClass121_1.anInt3159);
			}
			if (this.aBoolean82) {
				this.anObjectArray1[arg0] = null;
			}
			@Pc(232) int local232;
			if (local25 > 1) {
				@Pc(239) int local239;
				@Pc(252) Class6_Sub10 local252;
				@Pc(260) int local260;
				@Pc(264) int local264;
				@Pc(266) int local266;
				@Pc(324) int local324;
				@Pc(326) int local326;
				@Pc(330) int local330;
				@Pc(332) int local332;
				if (this.anInt1133 == 2) {
					local232 = local157.length;
					local232--;
					local239 = local157[local232] & 0xFF;
					local232 -= local239 * 4 * local25;
					local252 = new Class6_Sub10(local157);
					@Pc(439) int local439 = 0;
					local260 = 0;
					local252.anInt4188 = local232;
					for (local264 = 0; local264 < local239; local264++) {
						local266 = 0;
						for (local324 = 0; local324 < local25; local324++) {
							local266 += local252.method3979();
							if (local31 == null) {
								local326 = local324;
							} else {
								local326 = local31[local324];
							}
							if (local326 == arg1) {
								local260 = local326;
								local439 += local266;
							}
						}
					}
					if (local439 == 0) {
						return true;
					}
					@Pc(503) byte[] local503 = new byte[local439];
					local439 = 0;
					local252.anInt4188 = local232;
					local324 = 0;
					for (local326 = 0; local326 < local239; local326++) {
						local330 = 0;
						for (local332 = 0; local332 < local25; local332++) {
							local330 += local252.method3979();
							@Pc(532) int local532;
							if (local31 == null) {
								local532 = local332;
							} else {
								local532 = local31[local332];
							}
							if (arg1 == local532) {
								Static358.method954(local157, local324, local503, local439, local330);
								local439 += local330;
							}
							local324 += local330;
						}
					}
					local59[local260] = local503;
				} else {
					local232 = local157.length;
					@Pc(234) int local234 = local232 - 1;
					local239 = local157[local234] & 0xFF;
					@Pc(247) int local247 = local234 - local25 * local239 * 4;
					local252 = new Class6_Sub10(local157);
					local252.anInt4188 = local247;
					@Pc(258) int[] local258 = new int[local25];
					for (local260 = 0; local260 < local239; local260++) {
						local264 = 0;
						for (local266 = 0; local266 < local25; local266++) {
							local264 += local252.method3979();
							local258[local266] += local264;
						}
					}
					@Pc(300) byte[][] local300 = new byte[local25][];
					for (local266 = 0; local266 < local25; local266++) {
						local300[local266] = new byte[local258[local266]];
						local258[local266] = 0;
					}
					local252.anInt4188 = local247;
					local324 = 0;
					for (local326 = 0; local326 < local239; local326++) {
						local330 = 0;
						for (local332 = 0; local332 < local25; local332++) {
							local330 += local252.method3979();
							Static358.method954(local157, local324, local300[local332], local258[local332], local330);
							local258[local332] += local330;
							local324 += local330;
						}
					}
					for (local330 = 0; local330 < local25; local330++) {
						if (local31 == null) {
							local332 = local330;
						} else {
							local332 = local31[local330];
						}
						if (this.anInt1133 == 0) {
							local59[local332] = Static134.method2594(local300[local330]);
						} else {
							local59[local332] = local300[local330];
						}
					}
				}
			} else {
				if (local31 == null) {
					local232 = 0;
				} else {
					local232 = local31[0];
				}
				if (this.anInt1133 == 0) {
					local59[local232] = Static134.method2594(local157);
				} else {
					local59[local232] = local157;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(II)[B")
	public byte[] method1014(@OriginalArg(1) int arg0) {
		if (!this.method1028()) {
			return null;
		} else if (this.aClass121_1.anIntArray379.length == 1) {
			return this.method1033(arg0, 0);
		} else if (!this.method1022(arg0)) {
			return null;
		} else if (this.aClass121_1.anIntArray379[arg0] == 1) {
			return this.method1033(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Z")
	public boolean method1015(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method1028()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(21) String local21 = arg0.toLowerCase();
		@Pc(30) int local30 = this.aClass121_1.aClass149_1.method3906(Static108.method2196(local12));
		if (this.method1022(local30)) {
			@Pc(48) int local48 = this.aClass121_1.aClass149Array1[local30].method3906(Static108.method2196(local21));
			return this.method1036(local30, local48);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method1016(@OriginalArg(1) String arg0) {
		if (this.method1028()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass121_1.aClass149_1.method3906(Static108.method2196(local12));
			return this.method1008(local29);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
	public void method1017() {
		if (this.anObjectArray1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anObjectArray1.length; local15++) {
				this.anObjectArray1[local15] = null;
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZIZ)V")
	public void method1018(@OriginalArg(0) boolean arg0) {
		if (!this.method1028()) {
			return;
		}
		if (arg0) {
			this.aClass121_1.anIntArray378 = null;
			this.aClass121_1.aClass149_1 = null;
		}
		this.aClass121_1.anIntArrayArray119 = null;
		this.aClass121_1.aClass149Array1 = null;
	}

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "(II)V")
	public void method1019(@OriginalArg(0) int arg0) {
		if (this.method1022(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(III[I)[B")
	public byte[] method1020(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method1032(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(30) boolean local30 = this.method1013(arg1, arg0, arg2);
			if (!local30) {
				this.method1024(arg1);
				local30 = this.method1013(arg1, arg0, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static168.method734(false, this.anObjectArrayArray1[arg1][arg0]);
		if (this.anInt1133 == 1) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass121_1.anIntArray379[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt1133 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(I)V")
	public void method1021() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArrayArray1.length; local14++) {
				this.anObjectArrayArray1[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "(II)Z")
	private boolean method1022(@OriginalArg(0) int arg0) {
		if (!this.method1028()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass121_1.anIntArray379.length && this.aClass121_1.anIntArray379[arg0] != 0) {
			return true;
		} else if (Static7.aBoolean15) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(B)Z")
	public boolean method1023() {
		if (!this.method1028()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(21) int local21 = 0; local21 < this.aClass121_1.anIntArray381.length; local21++) {
			@Pc(29) int local29 = this.aClass121_1.anIntArray381[local21];
			if (this.anObjectArray1[local29] == null) {
				this.method1024(local29);
				if (this.anObjectArray1[local29] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(IB)V")
	private void method1024(@OriginalArg(0) int arg0) {
		if (this.aBoolean82) {
			this.anObjectArray1[arg0] = this.aClass98_1.method4133(arg0);
		} else {
			this.anObjectArray1[arg0] = Static134.method2594(this.aClass98_1.method4133(arg0));
		}
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(B)I")
	public int method1025() {
		if (!this.method1028()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anObjectArray1.length; local23++) {
			if (this.aClass121_1.anIntArray382[local23] > 0) {
				local15 += this.method1008(local23);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "(II)Z")
	public boolean method1026(@OriginalArg(1) int arg0) {
		if (!this.method1028()) {
			return false;
		} else if (this.aClass121_1.anIntArray379.length == 1) {
			return this.method1036(0, arg0);
		} else if (!this.method1022(arg0)) {
			return false;
		} else if (this.aClass121_1.anIntArray379[arg0] == 1) {
			return this.method1036(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(IB)[I")
	public int[] method1027(@OriginalArg(0) int arg0) {
		if (!this.method1022(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass121_1.anIntArrayArray120[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass121_1.anIntArray382[arg0]];
			@Pc(29) int local29 = 0;
			while (local18.length > local29) {
				local18[local29] = local29++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "(I)Z")
	private boolean method1028() {
		if (this.aClass121_1 == null) {
			this.aClass121_1 = this.aClass98_1.method4131();
			if (this.aClass121_1 == null) {
				return false;
			}
			this.anObjectArray1 = new Object[this.aClass121_1.anInt3157];
			this.anObjectArrayArray1 = new Object[this.aClass121_1.anInt3157][];
		}
		return true;
	}

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "(II)I")
	public int method1029(@OriginalArg(0) int arg0) {
		if (this.method1028()) {
			@Pc(16) int local16 = this.aClass121_1.aClass149_1.method3906(arg0);
			return this.method1022(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)Z")
	private boolean method1032(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1028()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass121_1.anIntArray379.length > arg1 && arg0 < this.aClass121_1.anIntArray379[arg1]) {
			return true;
		} else if (Static7.aBoolean15) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(III)[B")
	public byte[] method1033(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method1020(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method1034(@OriginalArg(0) String arg0) {
		if (this.method1028()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass121_1.aClass149_1.method3906(Static108.method2196(local18));
			return local27 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "(IB)Z")
	public boolean method1035(@OriginalArg(0) int arg0) {
		if (!this.method1022(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method1024(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(III)Z")
	public boolean method1036(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1032(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method1024(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method1037(@OriginalArg(1) String arg0) {
		if (this.method1028()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass121_1.aClass149_1.method3906(Static108.method2196(local12));
			return this.method1022(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}
}
