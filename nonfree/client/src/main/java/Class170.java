import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class170 {

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray34;

	@OriginalMember(owner = "client!ra", name = "S", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "Lclient!uk;")
	private Class202 aClass202_2 = null;

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "Lclient!vk;")
	private final Class159 aClass159_1;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
	public int anInt5179;

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "Z")
	private final boolean aBoolean395;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!vk;ZI)V")
	public Class170(@OriginalArg(0) Class159 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass159_1 = arg0;
		this.anInt5179 = arg2;
		this.aBoolean395 = arg1;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method4549(@OriginalArg(1) String arg0) {
		if (this.method4566()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass202_2.aClass158_1.method4051(Static153.method2895(local12));
			return this.method4562(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)V")
	public void method4550(@OriginalArg(1) int arg0) {
		if (this.method4582(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([IBII)[B")
	public byte[] method4551(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method4577(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(35) boolean local35 = this.method4557(arg0, arg1, arg2);
			if (!local35) {
				this.method4583(arg2);
				local35 = this.method4557(arg0, arg1, arg2);
				if (!local35) {
					return null;
				}
			}
		}
		@Pc(62) byte[] local62 = Static180.method3329(this.anObjectArrayArray1[arg2][arg1], false);
		if (this.anInt5179 == 1) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass202_2.anIntArray523[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt5179 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local62;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I")
	public int method4552() {
		if (!this.method4566()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anObjectArray34.length; local24++) {
			if (this.aClass202_2.anIntArray520[local24] > 0) {
				local15 += this.method4569(local24);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method4554(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4566()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass202_2.aClass158_1.method4051(Static153.method2895(local12));
		if (this.method4582(local24)) {
			@Pc(42) int local42 = this.aClass202_2.aClass158Array1[local24].method4051(Static153.method2895(local15));
			return this.method4584(local24, local42);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method4555(@OriginalArg(0) String arg0) {
		if (this.method4566()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass202_2.aClass158_1.method4051(Static153.method2895(local12));
			return this.method4582(local23) ? local23 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
	private void method4556(@OriginalArg(1) int arg0) {
		this.aClass159_1.method4071(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "([IBII)Z")
	private boolean method4557(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method4582(arg2)) {
			return false;
		} else if (this.anObjectArray34[arg2] == null) {
			return false;
		} else {
			@Pc(30) int local30 = this.aClass202_2.anIntArray520[arg2];
			@Pc(36) int[] local36 = this.aClass202_2.anIntArrayArray54[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass202_2.anIntArray523[arg2]];
			}
			@Pc(56) Object[] local56 = this.anObjectArrayArray1[arg2];
			@Pc(58) boolean local58 = true;
			for (@Pc(60) int local60 = 0; local60 < local30; local60++) {
				@Pc(65) int local65;
				if (local36 == null) {
					local65 = local60;
				} else {
					local65 = local36[local60];
				}
				if (local56[local65] == null) {
					local58 = false;
					break;
				}
			}
			if (local58) {
				return true;
			}
			@Pc(117) byte[] local117;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local117 = Static180.method3329(this.anObjectArray34[arg2], false);
			} else {
				local117 = Static180.method3329(this.anObjectArray34[arg2], true);
				@Pc(122) Class5_Sub1 local122 = new Class5_Sub1(local117);
				local122.method1877(local122.aByteArray18.length, arg0);
			}
			@Pc(143) byte[] local143;
			try {
				local143 = Static230.method3964(local117);
			} catch (@Pc(145) RuntimeException local145) {
				throw Static28.method715(local145, "T3 - " + (arg0 != null) + "," + arg2 + "," + local117.length + "," + Static347.method5724(local117.length, local117) + "," + Static347.method5724(local117.length - 2, local117) + "," + this.aClass202_2.anIntArray518[arg2] + "," + this.aClass202_2.anInt6061);
			}
			if (this.aBoolean395) {
				this.anObjectArray34[arg2] = null;
			}
			@Pc(222) int local222;
			if (local30 > 1) {
				@Pc(229) int local229;
				@Pc(242) Class5_Sub1 local242;
				@Pc(246) int local246;
				@Pc(251) int local251;
				@Pc(254) int local254;
				@Pc(256) int local256;
				@Pc(269) int local269;
				@Pc(308) int local308;
				@Pc(310) int local310;
				if (this.anInt5179 == 2) {
					local222 = local143.length;
					@Pc(224) int local224 = local222 - 1;
					local229 = local143[local224] & 0xFF;
					@Pc(237) int local237 = local224 - local30 * local229 * 4;
					local242 = new Class5_Sub1(local143);
					@Pc(244) int local244 = 0;
					local246 = 0;
					local242.anInt2029 = local237;
					for (local251 = 0; local251 < local229; local251++) {
						local254 = 0;
						for (local256 = 0; local256 < local30; local256++) {
							local254 += local242.method1826();
							if (local36 == null) {
								local269 = local256;
							} else {
								local269 = local36[local256];
							}
							if (local269 == arg1) {
								local246 = local269;
								local244 += local254;
							}
						}
					}
					if (local244 == 0) {
						return true;
					}
					@Pc(296) byte[] local296 = new byte[local244];
					local244 = 0;
					local242.anInt2029 = local237;
					local256 = 0;
					for (local269 = 0; local269 < local229; local269++) {
						local308 = 0;
						for (local310 = 0; local310 < local30; local310++) {
							local308 += local242.method1826();
							@Pc(323) int local323;
							if (local36 == null) {
								local323 = local310;
							} else {
								local323 = local36[local310];
							}
							if (local323 == arg1) {
								Static359.method756(local143, local256, local296, local244, local308);
								local244 += local308;
							}
							local256 += local308;
						}
					}
					local56[local246] = local296;
				} else {
					local222 = local143.length;
					local222--;
					local229 = local143[local222] & 0xFF;
					local222 -= local229 * local30 * 4;
					local242 = new Class5_Sub1(local143);
					@Pc(382) int[] local382 = new int[local30];
					local242.anInt2029 = local222;
					for (local246 = 0; local246 < local229; local246++) {
						local251 = 0;
						for (local254 = 0; local254 < local30; local254++) {
							local251 += local242.method1826();
							local382[local254] += local251;
						}
					}
					@Pc(417) byte[][] local417 = new byte[local30][];
					for (local254 = 0; local254 < local30; local254++) {
						local417[local254] = new byte[local382[local254]];
						local382[local254] = 0;
					}
					local242.anInt2029 = local222;
					local256 = 0;
					for (local269 = 0; local269 < local229; local269++) {
						local308 = 0;
						for (local310 = 0; local310 < local30; local310++) {
							local308 += local242.method1826();
							Static359.method756(local143, local256, local417[local310], local382[local310], local308);
							local382[local310] += local308;
							local256 += local308;
						}
					}
					for (local308 = 0; local308 < local30; local308++) {
						if (local36 == null) {
							local310 = local308;
						} else {
							local310 = local36[local308];
						}
						if (this.anInt5179 == 0) {
							local56[local310] = Static188.method3459(local417[local308]);
						} else {
							local56[local310] = local417[local308];
						}
					}
				}
			} else {
				if (local36 == null) {
					local222 = 0;
				} else {
					local222 = local36[0];
				}
				if (this.anInt5179 == 0) {
					local56[local222] = Static188.method3459(local143);
				} else {
					local56[local222] = local143;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)I")
	public int method4558() {
		if (!this.method4566()) {
			throw new IllegalStateException("");
		}
		return this.aClass202_2.anInt6061;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
	public void method4561() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)Z")
	public boolean method4562(@OriginalArg(0) int arg0) {
		if (!this.method4582(arg0)) {
			return false;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method4583(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)Z")
	public boolean method4563(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4566()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(29) int local29 = this.aClass202_2.aClass158_1.method4051(Static153.method2895(local12));
		if (this.method4582(local29)) {
			@Pc(47) int local47 = this.aClass202_2.aClass158Array1[local29].method4051(Static153.method2895(local15));
			return this.method4578(local47, local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method4564(@OriginalArg(1) String arg0) {
		if (this.method4566()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass202_2.aClass158_1.method4051(Static153.method2895(local17));
			this.method4556(local26);
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(BLjava/lang/String;)Z")
	public boolean method4565(@OriginalArg(1) String arg0) {
		if (this.method4566()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass202_2.aClass158_1.method4051(Static153.method2895(local17));
			return local26 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)Z")
	private boolean method4566() {
		if (this.aClass202_2 == null) {
			this.aClass202_2 = this.aClass159_1.method4063();
			if (this.aClass202_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass202_2.anInt6065][];
			this.anObjectArray34 = new Object[this.aClass202_2.anInt6065];
		}
		return true;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)I")
	public int method4567(@OriginalArg(1) int arg0) {
		if (this.method4566()) {
			@Pc(24) int local24 = this.aClass202_2.aClass158_1.method4051(arg0);
			return this.method4582(local24) ? local24 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(II)Z")
	public boolean method4568(@OriginalArg(1) int arg0) {
		if (!this.method4566()) {
			return false;
		} else if (this.aClass202_2.anIntArray523.length == 1) {
			return this.method4578(arg0, 0);
		} else if (!this.method4582(arg0)) {
			return false;
		} else if (this.aClass202_2.anIntArray523[arg0] == 1) {
			return this.method4578(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(II)I")
	private int method4569(@OriginalArg(0) int arg0) {
		if (this.method4582(arg0)) {
			return this.anObjectArray34[arg0] == null ? this.aClass159_1.method4070(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZZ)V")
	public void method4570(@OriginalArg(1) boolean arg0) {
		if (!this.method4566()) {
			return;
		}
		this.aClass202_2.anIntArrayArray53 = null;
		this.aClass202_2.aClass158Array1 = null;
		if (arg0) {
			this.aClass202_2.aClass158_1 = null;
			this.aClass202_2.anIntArray519 = null;
		}
	}

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "(II)[B")
	public byte[] method4571(@OriginalArg(0) int arg0) {
		if (!this.method4566()) {
			return null;
		} else if (this.aClass202_2.anIntArray523.length == 1) {
			return this.method4584(0, arg0);
		} else if (!this.method4582(arg0)) {
			return null;
		} else if (this.aClass202_2.anIntArray523[arg0] == 1) {
			return this.method4584(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
	public void method4572() {
		if (this.anObjectArray34 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArray34.length; local10++) {
				this.anObjectArray34[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)[I")
	public int[] method4573(@OriginalArg(0) int arg0) {
		if (!this.method4582(arg0)) {
			return null;
		}
		@Pc(20) int[] local20 = this.aClass202_2.anIntArrayArray54[arg0];
		if (local20 == null) {
			local20 = new int[this.aClass202_2.anIntArray520[arg0]];
			@Pc(31) int local31 = 0;
			while (local20.length > local31) {
				local20[local31] = local31++;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(IB)I")
	public int method4575(@OriginalArg(0) int arg0) {
		return this.method4582(arg0) ? this.aClass202_2.anIntArray523[arg0] : 0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)Z")
	private boolean method4577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method4566()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass202_2.anIntArray523.length && this.aClass202_2.anIntArray523[arg0] > arg1) {
			return true;
		} else if (Static225.aBoolean327) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)Z")
	public boolean method4578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method4577(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray34[arg1] == null) {
			this.method4583(arg1);
			return this.anObjectArray34[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method4579(@OriginalArg(1) String arg0) {
		if (this.method4566()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass202_2.aClass158_1.method4051(Static153.method2895(local17));
			return this.method4569(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)Z")
	public boolean method4580() {
		if (!this.method4566()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(23) int local23 = 0; local23 < this.aClass202_2.anIntArray522.length; local23++) {
			@Pc(31) int local31 = this.aClass202_2.anIntArray522[local23];
			if (this.anObjectArray34[local31] == null) {
				this.method4583(local31);
				if (this.anObjectArray34[local31] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)I")
	public int method4581() {
		return this.method4566() ? this.aClass202_2.anIntArray523.length : -1;
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(II)Z")
	private boolean method4582(@OriginalArg(0) int arg0) {
		if (!this.method4566()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass202_2.anIntArray523.length && this.aClass202_2.anIntArray523[arg0] != 0) {
			return true;
		} else if (Static225.aBoolean327) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "(II)V")
	private void method4583(@OriginalArg(0) int arg0) {
		if (this.aBoolean395) {
			this.anObjectArray34[arg0] = this.aClass159_1.method4064(arg0);
		} else {
			this.anObjectArray34[arg0] = Static188.method3459(this.aClass159_1.method4064(arg0));
		}
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(III)[B")
	public byte[] method4584(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method4551(null, arg1, arg0);
	}
}
