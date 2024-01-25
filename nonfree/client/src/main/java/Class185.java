import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class185 {

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray35;

	@OriginalMember(owner = "client!oi", name = "F", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!oi", name = "H", descriptor = "Lclient!vv;")
	private Class268 aClass268_2 = null;

	@OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
	public int anInt5029;

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "Z")
	private final boolean aBoolean460;

	@OriginalMember(owner = "client!oi", name = "G", descriptor = "Lclient!fi;")
	private final Class82 aClass82_1;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!fi;ZI)V")
	public Class185(@OriginalArg(0) Class82 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt5029 = arg2;
		this.aBoolean460 = arg1;
		this.aClass82_1 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method3994(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4017()) {
			return null;
		}
		@Pc(14) String local14 = arg0.toLowerCase();
		@Pc(17) String local17 = arg1.toLowerCase();
		@Pc(28) int local28 = this.aClass268_2.aClass219_1.method4608(Static39.method533(local14));
		if (this.method4022(local28)) {
			@Pc(53) int local53 = this.aClass268_2.aClass219Array1[local28].method4608(Static39.method533(local17));
			return this.method4002(local28, local53);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZI)[I")
	public int[] method3995(@OriginalArg(1) int arg0) {
		if (!this.method4022(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass268_2.anIntArrayArray54[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass268_2.anIntArray504[arg0]];
			@Pc(34) int local34 = 0;
			while (local34 < local18.length) {
				local18[local34] = local34++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BZZ)V")
	public void method3996(@OriginalArg(2) boolean arg0) {
		if (!this.method4017()) {
			return;
		}
		this.aClass268_2.anIntArrayArray53 = null;
		this.aClass268_2.aClass219Array1 = null;
		if (arg0) {
			this.aClass268_2.anIntArray506 = null;
			this.aClass268_2.aClass219_1 = null;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[B")
	public byte[] method3997(@OriginalArg(0) int arg0) {
		if (!this.method4017()) {
			return null;
		} else if (this.aClass268_2.anIntArray503.length == 1) {
			return this.method4002(0, arg0);
		} else if (!this.method4022(arg0)) {
			return null;
		} else if (this.aClass268_2.anIntArray503[arg0] == 1) {
			return this.method4002(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)V")
	private void method3998(@OriginalArg(0) int arg0) {
		this.aClass82_1.method2266(arg0);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "([IIII)[B")
	public byte[] method3999(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method4007(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(30) boolean local30 = this.method4008(arg0, arg1, arg2);
			if (!local30) {
				this.method4025(arg2);
				local30 = this.method4008(arg0, arg1, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(59) byte[] local59 = Static251.method3543(this.anObjectArrayArray1[arg2][arg1], false);
		if (this.anInt5029 == 1) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass268_2.anIntArray503[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt5029 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local59;
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(II)Z")
	public boolean method4000(@OriginalArg(1) int arg0) {
		if (!this.method4017()) {
			return false;
		} else if (this.aClass268_2.anIntArray503.length == 1) {
			return this.method4024(arg0, 0);
		} else if (!this.method4022(arg0)) {
			return false;
		} else if (this.aClass268_2.anIntArray503[arg0] == 1) {
			return this.method4024(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(ZI)I")
	public int method4001(@OriginalArg(1) int arg0) {
		if (this.method4017()) {
			@Pc(16) int local16 = this.aClass268_2.aClass219_1.method4608(arg0);
			return this.method4022(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IBI)[B")
	public byte[] method4002(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method3999(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method4003(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4017()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(26) int local26 = this.aClass268_2.aClass219_1.method4608(Static39.method533(local12));
		if (this.method4022(local26)) {
			@Pc(49) int local49 = this.aClass268_2.aClass219Array1[local26].method4608(Static39.method533(local15));
			return this.method4024(local49, local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method4005(@OriginalArg(0) String arg0) {
		if (this.method4017()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass268_2.aClass219_1.method4608(Static39.method533(local19));
			return this.method4022(local28) ? local28 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)I")
	private int method4006(@OriginalArg(0) int arg0) {
		if (this.method4022(arg0)) {
			return this.anObjectArray35[arg0] == null ? this.aClass82_1.method2267(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)Z")
	private boolean method4007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method4017()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass268_2.anIntArray503.length > arg0 && this.aClass268_2.anIntArray503[arg0] > arg1) {
			return true;
		} else if (Static65.aBoolean125) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "([IIII)Z")
	private boolean method4008(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method4022(arg2)) {
			return false;
		} else if (this.anObjectArray35[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass268_2.anIntArray504[arg2];
			@Pc(31) int[] local31 = this.aClass268_2.anIntArrayArray54[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass268_2.anIntArray503[arg2]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg2];
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
			@Pc(122) byte[] local122;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local122 = Static251.method3543(this.anObjectArray35[arg2], false);
			} else {
				local122 = Static251.method3543(this.anObjectArray35[arg2], true);
				@Pc(127) Class1_Sub19 local127 = new Class1_Sub19(local122);
				local127.method2880(arg0, local127.aByteArray38.length);
			}
			@Pc(151) byte[] local151;
			try {
				local151 = Static73.method931(local122);
			} catch (@Pc(153) RuntimeException local153) {
				throw Static454.method5848(local153, "T3 - " + (arg0 != null) + "," + arg2 + "," + local122.length + "," + Static263.method3649(local122.length, local122) + "," + Static263.method3649(local122.length - 2, local122) + "," + this.aClass268_2.anIntArray505[arg2] + "," + this.aClass268_2.anInt6957);
			}
			if (this.aBoolean460) {
				this.anObjectArray35[arg2] = null;
			}
			@Pc(233) int local233;
			if (local25 > 1) {
				@Pc(240) int local240;
				@Pc(253) Class1_Sub19 local253;
				@Pc(260) int local260;
				@Pc(262) int local262;
				@Pc(266) int local266;
				@Pc(268) int local268;
				@Pc(280) int local280;
				@Pc(327) int local327;
				@Pc(329) int local329;
				if (this.anInt5029 == 2) {
					local233 = local151.length;
					@Pc(236) int local236 = local233 - 1;
					local240 = local151[local236] & 0xFF;
					@Pc(248) int local248 = local236 - local240 * 4 * local25;
					local253 = new Class1_Sub19(local151);
					@Pc(255) int local255 = 0;
					local253.anInt3698 = local248;
					local260 = 0;
					for (local262 = 0; local262 < local240; local262++) {
						local266 = 0;
						for (local268 = 0; local268 < local25; local268++) {
							local266 += local253.method2877();
							if (local31 == null) {
								local280 = local268;
							} else {
								local280 = local31[local268];
							}
							if (arg1 == local280) {
								local260 = local280;
								local255 += local266;
							}
						}
					}
					if (local255 == 0) {
						return true;
					}
					@Pc(314) byte[] local314 = new byte[local255];
					local255 = 0;
					local253.anInt3698 = local248;
					local268 = 0;
					for (local280 = 0; local280 < local240; local280++) {
						local327 = 0;
						for (local329 = 0; local329 < local25; local329++) {
							local327 += local253.method2877();
							@Pc(343) int local343;
							if (local31 == null) {
								local343 = local329;
							} else {
								local343 = local31[local329];
							}
							if (arg1 == local343) {
								Static471.method3062(local151, local268, local314, local255, local327);
								local255 += local327;
							}
							local268 += local327;
						}
					}
					local51[local260] = local314;
				} else {
					local233 = local151.length;
					local233--;
					local240 = local151[local233] & 0xFF;
					local233 -= local25 * local240 * 4;
					local253 = new Class1_Sub19(local151);
					@Pc(408) int[] local408 = new int[local25];
					local253.anInt3698 = local233;
					for (local260 = 0; local260 < local240; local260++) {
						local262 = 0;
						for (local266 = 0; local266 < local25; local266++) {
							local262 += local253.method2877();
							local408[local266] += local262;
						}
					}
					@Pc(445) byte[][] local445 = new byte[local25][];
					for (local266 = 0; local266 < local25; local266++) {
						local445[local266] = new byte[local408[local266]];
						local408[local266] = 0;
					}
					local253.anInt3698 = local233;
					local268 = 0;
					for (local280 = 0; local280 < local240; local280++) {
						local327 = 0;
						for (local329 = 0; local329 < local25; local329++) {
							local327 += local253.method2877();
							Static471.method3062(local151, local268, local445[local329], local408[local329], local327);
							local268 += local327;
							local408[local329] += local327;
						}
					}
					for (local327 = 0; local327 < local25; local327++) {
						if (local31 == null) {
							local329 = local327;
						} else {
							local329 = local31[local327];
						}
						if (this.anInt5029 == 0) {
							local51[local329] = Static257.method3606(local445[local327]);
						} else {
							local51[local329] = local445[local327];
						}
					}
				}
			} else {
				if (local31 == null) {
					local233 = 0;
				} else {
					local233 = local31[0];
				}
				if (this.anInt5029 == 0) {
					local51[local233] = Static257.method3606(local151);
				} else {
					local51[local233] = local151;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public void method4009(@OriginalArg(1) String arg0) {
		if (this.method4017()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass268_2.aClass219_1.method4608(Static39.method533(local11));
			this.method3998(local20);
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)I")
	public int method4010() {
		return this.method4017() ? this.aClass268_2.anIntArray503.length : -1;
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(II)I")
	public int method4011(@OriginalArg(0) int arg0) {
		return this.method4022(arg0) ? this.aClass268_2.anIntArray503[arg0] : 0;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V")
	public void method4013() {
		if (this.anObjectArray35 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray35.length; local6++) {
				this.anObjectArray35[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)I")
	public int method4014() {
		if (!this.method4017()) {
			throw new IllegalStateException("");
		}
		return this.aClass268_2.anInt6957;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method4015(@OriginalArg(0) String arg0) {
		if (this.method4017()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass268_2.aClass219_1.method4608(Static39.method533(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(B)Z")
	public boolean method4016() {
		if (!this.method4017()) {
			return false;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.aClass268_2.anIntArray508.length; local20++) {
			@Pc(28) int local28 = this.aClass268_2.anIntArray508[local20];
			if (this.anObjectArray35[local28] == null) {
				this.method4025(local28);
				if (this.anObjectArray35[local28] == null) {
					local18 = false;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)Z")
	private boolean method4017() {
		if (this.aClass268_2 == null) {
			this.aClass268_2 = this.aClass82_1.method2265();
			if (this.aClass268_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass268_2.anInt6956][];
			this.anObjectArray35 = new Object[this.aClass268_2.anInt6956];
		}
		return true;
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(IB)V")
	public void method4018(@OriginalArg(0) int arg0) {
		if (this.method4022(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method4019(@OriginalArg(1) String arg0) {
		if (this.method4017()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass268_2.aClass219_1.method4608(Static39.method533(local12));
			return this.method4021(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)I")
	public int method4020() {
		if (!this.method4017()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(22) int local22 = 0; local22 < this.anObjectArray35.length; local22++) {
			if (this.aClass268_2.anIntArray504[local22] > 0) {
				local15 += this.method4006(local22);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(IB)Z")
	public boolean method4021(@OriginalArg(0) int arg0) {
		if (!this.method4022(arg0)) {
			return false;
		} else if (this.anObjectArray35[arg0] == null) {
			this.method4025(arg0);
			return this.anObjectArray35[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)Z")
	private boolean method4022(@OriginalArg(1) int arg0) {
		if (!this.method4017()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass268_2.anIntArray503.length && this.aClass268_2.anIntArray503[arg0] != 0) {
			return true;
		} else if (Static65.aBoolean125) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
	public void method4023() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArrayArray1.length; local10++) {
				this.anObjectArrayArray1[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(III)Z")
	public boolean method4024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method4007(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray35[arg1] == null) {
			this.method4025(arg1);
			return this.anObjectArray35[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "(II)V")
	private void method4025(@OriginalArg(1) int arg0) {
		if (this.aBoolean460) {
			this.anObjectArray35[arg0] = this.aClass82_1.method2263(arg0);
		} else {
			this.anObjectArray35[arg0] = Static257.method3606(this.aClass82_1.method2263(arg0));
		}
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(Ljava/lang/String;I)I")
	public int method4026(@OriginalArg(0) String arg0) {
		if (this.method4017()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass268_2.aClass219_1.method4608(Static39.method533(local19));
			return this.method4006(local28);
		} else {
			return 0;
		}
	}
}
