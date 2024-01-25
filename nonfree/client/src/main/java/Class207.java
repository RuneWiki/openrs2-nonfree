import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class207 {

	@OriginalMember(owner = "client!la", name = "H", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!la", name = "P", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!la", name = "E", descriptor = "Lclient!uj;")
	private Class349 aClass349_1 = null;

	@OriginalMember(owner = "client!la", name = "I", descriptor = "Z")
	private final boolean aBoolean385;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "Lclient!uda;")
	private final Class229 aClass229_1;

	@OriginalMember(owner = "client!la", name = "R", descriptor = "I")
	public int anInt5242;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!uda;ZI)V")
	public Class207(@OriginalArg(0) Class229 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aBoolean385 = arg1;
		this.aClass229_1 = arg0;
		this.anInt5242 = arg2;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)Z")
	public boolean method4664(@OriginalArg(0) int arg0) {
		if (!this.method4683(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method4670(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method4665(@OriginalArg(0) String arg0) {
		if (this.method4698()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass349_1.aClass51_1.method1099(Static13.method224(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public void method4666() {
		if (this.anObjectArray1 != null) {
			for (@Pc(8) int local8 = 0; local8 < this.anObjectArray1.length; local8++) {
				this.anObjectArray1[local8] = null;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public void method4668() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArrayArray1.length; local14++) {
				this.anObjectArrayArray1[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[III)Z")
	private boolean method4669(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!this.method4683(arg2)) {
			return false;
		} else if (this.anObjectArray1[arg2] == null) {
			return false;
		} else {
			@Pc(31) int local31 = this.aClass349_1.anIntArray530[arg2];
			@Pc(37) int[] local37 = this.aClass349_1.anIntArrayArray65[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass349_1.anIntArray534[arg2]];
			}
			@Pc(57) Object[] local57 = this.anObjectArrayArray1[arg2];
			@Pc(59) boolean local59 = true;
			for (@Pc(61) int local61 = 0; local61 < local31; local61++) {
				@Pc(68) int local68;
				if (local37 == null) {
					local68 = local61;
				} else {
					local68 = local37[local61];
				}
				if (local57[local68] == null) {
					local59 = false;
					break;
				}
			}
			if (local59) {
				return true;
			}
			@Pc(121) byte[] local121;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local121 = Static549.method8014(this.anObjectArray1[arg2], false);
			} else {
				local121 = Static549.method8014(this.anObjectArray1[arg2], true);
				@Pc(126) Class5_Sub22 local126 = new Class5_Sub22(local121);
				local126.method5928(arg1, local126.aByteArray71.length);
			}
			@Pc(147) byte[] local147;
			try {
				local147 = Static323.method4916(local121);
			} catch (@Pc(149) RuntimeException local149) {
				throw Static71.method1208(local149, "T3 - " + (arg1 != null) + "," + arg2 + "," + local121.length + "," + Static5.method102(local121.length, local121) + "," + Static5.method102(local121.length - 2, local121) + "," + this.aClass349_1.anIntArray528[arg2] + "," + this.aClass349_1.anInt9612);
			}
			if (this.aBoolean385) {
				this.anObjectArray1[arg2] = null;
			}
			@Pc(224) int local224;
			if (local31 > 1) {
				@Pc(231) int local231;
				@Pc(244) Class5_Sub22 local244;
				@Pc(248) int local248;
				@Pc(253) int local253;
				@Pc(256) int local256;
				@Pc(258) int local258;
				@Pc(271) int local271;
				@Pc(314) int local314;
				@Pc(316) int local316;
				if (this.anInt5242 == 2) {
					local224 = local147.length;
					@Pc(226) int local226 = local224 - 1;
					local231 = local147[local226] & 0xFF;
					@Pc(239) int local239 = local226 - local31 * local231 * 4;
					local244 = new Class5_Sub22(local147);
					@Pc(246) int local246 = 0;
					local248 = 0;
					local244.anInt6629 = local239;
					for (local253 = 0; local253 < local231; local253++) {
						local256 = 0;
						for (local258 = 0; local258 < local31; local258++) {
							local256 += local244.method5913();
							if (local37 == null) {
								local271 = local258;
							} else {
								local271 = local37[local258];
							}
							if (local271 == arg0) {
								local246 += local256;
								local248 = local271;
							}
						}
					}
					if (local246 == 0) {
						return true;
					}
					@Pc(302) byte[] local302 = new byte[local246];
					local246 = 0;
					local244.anInt6629 = local239;
					local258 = 0;
					for (local271 = 0; local271 < local231; local271++) {
						local314 = 0;
						for (local316 = 0; local316 < local31; local316++) {
							local314 += local244.method5913();
							@Pc(327) int local327;
							if (local37 == null) {
								local327 = local316;
							} else {
								local327 = local37[local316];
							}
							if (local327 == arg0) {
								Static652.method4548(local147, local258, local302, local246, local314);
								local246 += local314;
							}
							local258 += local314;
						}
					}
					local57[local248] = local302;
				} else {
					local224 = local147.length;
					local224--;
					local231 = local147[local224] & 0xFF;
					local224 -= local231 * local31 * 4;
					local244 = new Class5_Sub22(local147);
					local244.anInt6629 = local224;
					@Pc(395) int[] local395 = new int[local31];
					for (local248 = 0; local248 < local231; local248++) {
						local253 = 0;
						for (local256 = 0; local256 < local31; local256++) {
							local253 += local244.method5913();
							local395[local256] += local253;
						}
					}
					@Pc(437) byte[][] local437 = new byte[local31][];
					for (local256 = 0; local256 < local31; local256++) {
						local437[local256] = new byte[local395[local256]];
						local395[local256] = 0;
					}
					local244.anInt6629 = local224;
					local258 = 0;
					for (local271 = 0; local271 < local231; local271++) {
						local314 = 0;
						for (local316 = 0; local316 < local31; local316++) {
							local314 += local244.method5913();
							Static652.method4548(local147, local258, local437[local316], local395[local316], local314);
							local395[local316] += local314;
							local258 += local314;
						}
					}
					for (local314 = 0; local314 < local31; local314++) {
						if (local37 == null) {
							local316 = local314;
						} else {
							local316 = local37[local314];
						}
						if (this.anInt5242 == 0) {
							local57[local316] = Static179.method2720(local437[local314]);
						} else {
							local57[local316] = local437[local314];
						}
					}
				}
			} else {
				if (local37 == null) {
					local224 = 0;
				} else {
					local224 = local37[0];
				}
				if (this.anInt5242 == 0) {
					local57[local224] = Static179.method2720(local147);
				} else {
					local57[local224] = local147;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
	private void method4670(@OriginalArg(1) int arg0) {
		if (this.aBoolean385) {
			this.anObjectArray1[arg0] = this.aClass229_1.method5063(arg0);
		} else {
			this.anObjectArray1[arg0] = Static179.method2720(this.aClass229_1.method5063(arg0));
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(II)V")
	public void method4671(@OriginalArg(1) int arg0) {
		if (this.method4683(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(II)I")
	public int method4672(@OriginalArg(1) int arg0) {
		return this.method4683(arg0) ? this.aClass349_1.anIntArray534[arg0] : 0;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([IIII)[B")
	public byte[] method4673(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method4674(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(38) boolean local38 = this.method4669(arg1, arg0, arg2);
			if (!local38) {
				this.method4670(arg2);
				local38 = this.method4669(arg1, arg0, arg2);
				if (!local38) {
					return null;
				}
			}
		}
		@Pc(65) byte[] local65 = Static549.method8014(this.anObjectArrayArray1[arg2][arg1], false);
		if (this.anInt5242 == 1) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass349_1.anIntArray534[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt5242 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local65;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(III)Z")
	private boolean method4674(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4698()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass349_1.anIntArray534.length > arg1 && arg0 < this.aClass349_1.anIntArray534[arg1]) {
			return true;
		} else if (Static479.aBoolean588) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method4675(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = this.method4686("");
		return local16 == -1 ? this.method4693("", arg0) : this.method4693(arg0, "");
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)[I")
	public int[] method4676(@OriginalArg(0) int arg0) {
		if (!this.method4683(arg0)) {
			return null;
		}
		@Pc(22) int[] local22 = this.aClass349_1.anIntArrayArray65[arg0];
		if (local22 == null) {
			local22 = new int[this.aClass349_1.anIntArray530[arg0]];
			@Pc(33) int local33 = 0;
			while (local33 < local22.length) {
				local22[local33] = local33++;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZZZ)V")
	public void method4677(@OriginalArg(0) boolean arg0) {
		if (!this.method4698()) {
			return;
		}
		if (arg0) {
			this.aClass349_1.anIntArray533 = null;
			this.aClass349_1.aClass51_1 = null;
		}
		this.aClass349_1.anIntArrayArray66 = null;
		this.aClass349_1.aClass51Array1 = null;
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(II)Z")
	public boolean method4678(@OriginalArg(0) int arg0) {
		if (!this.method4698()) {
			return false;
		} else if (this.aClass349_1.anIntArray534.length == 1) {
			return this.method4697(0, arg0);
		} else if (!this.method4683(arg0)) {
			return false;
		} else if (this.aClass349_1.anIntArray534[arg0] == 1) {
			return this.method4697(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method4679(@OriginalArg(1) String arg0) {
		if (this.method4698()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass349_1.aClass51_1.method1099(Static13.method224(local17));
			this.method4696(local26);
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(III)[B")
	public byte[] method4681(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method4673(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)I")
	public int method4682(@OriginalArg(1) int arg0) {
		if (this.method4698()) {
			@Pc(22) int local22 = this.aClass349_1.aClass51_1.method1099(arg0);
			return this.method4683(local22) ? local22 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "(II)Z")
	private boolean method4683(@OriginalArg(0) int arg0) {
		if (!this.method4698()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass349_1.anIntArray534.length && this.aClass349_1.anIntArray534[arg0] != 0) {
			return true;
		} else if (Static479.aBoolean588) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(IB)I")
	private int method4684(@OriginalArg(0) int arg0) {
		if (this.method4683(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass229_1.method5067(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)I")
	public int method4685() {
		return this.method4698() ? this.aClass349_1.anIntArray534.length : -1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method4686(@OriginalArg(0) String arg0) {
		if (this.method4698()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass349_1.aClass51_1.method1099(Static13.method224(local17));
			return this.method4683(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method4688(@OriginalArg(1) String arg0) {
		if (this.method4698()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(25) int local25 = this.aClass349_1.aClass51_1.method1099(Static13.method224(local12));
			return this.method4684(local25);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)Z")
	public boolean method4689() {
		if (!this.method4698()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass349_1.anIntArray532.length; local15++) {
			@Pc(23) int local23 = this.aClass349_1.anIntArray532[local15];
			if (this.anObjectArray1[local23] == null) {
				this.method4670(local23);
				if (this.anObjectArray1[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZI)[B")
	public byte[] method4690(@OriginalArg(1) int arg0) {
		if (!this.method4698()) {
			return null;
		} else if (this.aClass349_1.anIntArray534.length == 1) {
			return this.method4681(0, arg0);
		} else if (!this.method4683(arg0)) {
			return null;
		} else if (this.aClass349_1.anIntArray534[arg0] == 1) {
			return this.method4681(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)I")
	public int method4691() {
		if (!this.method4698()) {
			throw new IllegalStateException("");
		}
		return this.aClass349_1.anInt9612;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method4692(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4698()) {
			return false;
		}
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass349_1.aClass51_1.method1099(Static13.method224(local20));
		if (local32 < 0) {
			return false;
		} else {
			@Pc(50) int local50 = this.aClass349_1.aClass51Array1[local32].method1099(Static13.method224(local23));
			return local50 >= 0;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	private boolean method4693(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method4698()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(23) String local23 = arg0.toLowerCase();
		@Pc(32) int local32 = this.aClass349_1.aClass51_1.method1099(Static13.method224(local12));
		if (this.method4683(local32)) {
			@Pc(52) int local52 = this.aClass349_1.aClass51Array1[local32].method1099(Static13.method224(local23));
			return this.method4697(local32, local52);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(I)I")
	public int method4694() {
		if (!this.method4698()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anObjectArray1.length; local25++) {
			if (this.aClass349_1.anIntArray530[local25] > 0) {
				local13 += 100;
				local15 += this.method4684(local25);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method4695(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4698()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(33) int local33 = this.aClass349_1.aClass51_1.method1099(Static13.method224(local12));
		if (this.method4683(local33)) {
			@Pc(51) int local51 = this.aClass349_1.aClass51Array1[local33].method1099(Static13.method224(local15));
			return this.method4681(local33, local51);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!la", name = "f", descriptor = "(II)V")
	private void method4696(@OriginalArg(1) int arg0) {
		this.aClass229_1.method5064(arg0);
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(III)Z")
	public boolean method4697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method4674(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method4670(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(B)Z")
	private boolean method4698() {
		if (this.aClass349_1 == null) {
			this.aClass349_1 = this.aClass229_1.method5066();
			if (this.aClass349_1 == null) {
				return false;
			}
			this.anObjectArray1 = new Object[this.aClass349_1.anInt9618];
			this.anObjectArrayArray1 = new Object[this.aClass349_1.anInt9618][];
		}
		return true;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(ILjava/lang/String;)Z")
	public boolean method4699(@OriginalArg(1) String arg0) {
		if (this.method4698()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass349_1.aClass51_1.method1099(Static13.method224(local17));
			return this.method4664(local26);
		} else {
			return false;
		}
	}
}
