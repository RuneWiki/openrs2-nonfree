import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class16 {

	@OriginalMember(owner = "client!an", name = "hb", descriptor = "[Lclient!hr;")
	private static final Class137[] aClass137Array1 = new Class137[32];

	@OriginalMember(owner = "client!an", name = "p", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!an", name = "O", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!an", name = "r", descriptor = "Lclient!pd;")
	private Class238 aClass238_1 = null;

	@OriginalMember(owner = "client!an", name = "M", descriptor = "Lclient!gl;")
	private final Class117 aClass117_1;

	@OriginalMember(owner = "client!an", name = "H", descriptor = "I")
	public int anInt295;

	@OriginalMember(owner = "client!an", name = "j", descriptor = "Z")
	private final boolean aBoolean11;

	static {
		@Pc(89) Class137[] local89 = Static20.method465();
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			aClass137Array1[local89[local91].anInt4298] = local89[local91];
		}
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!gl;ZI)V")
	public Class16(@OriginalArg(0) Class117 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass117_1 = arg0;
		this.anInt295 = arg2;
		this.aBoolean11 = arg1;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)I")
	public int method381() {
		if (!this.method398()) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < this.anObjectArray1.length; local22++) {
			if (this.aClass238_1.anIntArray474[local22] > 0) {
				local18 += 100;
				local20 += this.method401(local22);
			}
		}
		if (local18 == 0) {
			return 100;
		} else {
			return local20 * 100 / local18;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method382(@OriginalArg(0) String arg0) {
		if (this.method398()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass238_1.aClass320_1.method7990(Static31.method680(local12));
			return this.method401(local21);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BI)V")
	public void method383(@OriginalArg(1) int arg0) {
		if (this.method393(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method384(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method398()) {
			return false;
		}
		@Pc(19) String local19 = arg1.toLowerCase();
		@Pc(22) String local22 = arg0.toLowerCase();
		@Pc(31) int local31 = this.aClass238_1.aClass320_1.method7990(Static31.method680(local19));
		if (local31 < 0) {
			return false;
		} else {
			@Pc(46) int local46 = this.aClass238_1.aClass320Array1[local31].method7990(Static31.method680(local22));
			return local46 >= 0;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
	public void method385() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method386(@OriginalArg(1) String arg0) {
		if (this.method398()) {
			@Pc(15) String local15 = arg0.toLowerCase();
			@Pc(24) int local24 = this.aClass238_1.aClass320_1.method7990(Static31.method680(local15));
			this.method406(local24);
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(BI)[I")
	public int[] method387(@OriginalArg(1) int arg0) {
		if (!this.method393(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass238_1.anIntArrayArray62[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass238_1.anIntArray474[arg0]];
			@Pc(34) int local34 = 0;
			while (local34 < local23.length) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IB)Z")
	public boolean method389(@OriginalArg(0) int arg0) {
		if (!this.method398()) {
			return false;
		} else if (this.aClass238_1.anIntArray476.length == 1) {
			return this.method397(0, arg0);
		} else if (!this.method393(arg0)) {
			return false;
		} else if (this.aClass238_1.anIntArray476[arg0] == 1) {
			return this.method397(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method390(@OriginalArg(1) String arg0) {
		if (this.method398()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass238_1.aClass320_1.method7990(Static31.method680(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)I")
	public int method392() {
		if (!this.method398()) {
			throw new IllegalStateException("");
		}
		return this.aClass238_1.anInt6876;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II)Z")
	private boolean method393(@OriginalArg(0) int arg0) {
		if (!this.method398()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass238_1.anIntArray476.length && this.aClass238_1.anIntArray476[arg0] != 0) {
			return true;
		} else if (Static468.aBoolean608) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method395(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method398()) {
			return false;
		}
		@Pc(17) String local17 = arg1.toLowerCase();
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(29) int local29 = this.aClass238_1.aClass320_1.method7990(Static31.method680(local17));
		if (this.method393(local29)) {
			@Pc(47) int local47 = this.aClass238_1.aClass320Array1[local29].method7990(Static31.method680(local20));
			return this.method397(local29, local47);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method396(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method398()) {
			return null;
		}
		@Pc(19) String local19 = arg1.toLowerCase();
		@Pc(22) String local22 = arg0.toLowerCase();
		@Pc(31) int local31 = this.aClass238_1.aClass320_1.method7990(Static31.method680(local19));
		if (this.method393(local31)) {
			@Pc(49) int local49 = this.aClass238_1.aClass320Array1[local31].method7990(Static31.method680(local22));
			return this.method408(local31, local49);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(III)Z")
	public boolean method397(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method416(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method405(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(B)Z")
	private boolean method398() {
		if (this.aClass238_1 == null) {
			this.aClass238_1 = this.aClass117_1.method3999();
			if (this.aClass238_1 == null) {
				return false;
			}
			this.anObjectArray1 = new Object[this.aClass238_1.anInt6878];
			this.anObjectArrayArray1 = new Object[this.aClass238_1.anInt6878][];
		}
		return true;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(II)I")
	public int method399(@OriginalArg(0) int arg0) {
		return this.method393(arg0) ? this.aClass238_1.anIntArray476[arg0] : 0;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II[II)Z")
	private boolean method400(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method393(arg2)) {
			return false;
		} else if (this.anObjectArray1[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass238_1.anIntArray474[arg2];
			@Pc(31) int[] local31 = this.aClass238_1.anIntArrayArray62[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass238_1.anIntArray476[arg2]];
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
			@Pc(121) byte[] local121;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local121 = Static202.method3816(this.anObjectArray1[arg2], false);
			} else {
				local121 = Static202.method3816(this.anObjectArray1[arg2], true);
				@Pc(136) Class12_Sub8 local136 = new Class12_Sub8(local121);
				local136.method5207(local136.aByteArray82.length, arg1);
			}
			@Pc(148) byte[] local148;
			try {
				local148 = Static7.method7757(local121);
			} catch (@Pc(150) RuntimeException local150) {
				throw Static108.method2270(local150, "T3 - " + (arg1 != null) + "," + arg2 + "," + local121.length + "," + Static129.method7913(local121, local121.length) + "," + Static129.method7913(local121, local121.length - 2) + "," + this.aClass238_1.anIntArray475[arg2] + "," + this.aClass238_1.anInt6876);
			}
			if (this.aBoolean11) {
				this.anObjectArray1[arg2] = null;
			}
			@Pc(220) int local220;
			if (local25 <= 1) {
				if (local31 == null) {
					local220 = 0;
				} else {
					local220 = local31[0];
				}
				if (this.anInt295 == 0) {
					local51[local220] = Static425.method6549(local148);
				} else {
					local51[local220] = local148;
				}
			} else {
				@Pc(258) int local258;
				@Pc(271) Class12_Sub8 local271;
				@Pc(279) int local279;
				@Pc(283) int local283;
				@Pc(285) int local285;
				@Pc(339) int local339;
				@Pc(341) int local341;
				@Pc(345) int local345;
				@Pc(347) int local347;
				if (this.anInt295 == 2) {
					local220 = local148.length;
					local220--;
					local258 = local148[local220] & 0xFF;
					local220 -= local258 * 4 * local25;
					local271 = new Class12_Sub8(local148);
					@Pc(457) int local457 = 0;
					local279 = 0;
					local271.anInt6217 = local220;
					for (local283 = 0; local283 < local258; local283++) {
						local285 = 0;
						for (local339 = 0; local339 < local25; local339++) {
							local285 += local271.method5225();
							if (local31 == null) {
								local341 = local339;
							} else {
								local341 = local31[local339];
							}
							if (arg0 == local341) {
								local279 = local341;
								local457 += local285;
							}
						}
					}
					if (local457 == 0) {
						return true;
					}
					@Pc(516) byte[] local516 = new byte[local457];
					local271.anInt6217 = local220;
					local457 = 0;
					local339 = 0;
					for (local341 = 0; local341 < local258; local341++) {
						local345 = 0;
						for (local347 = 0; local347 < local25; local347++) {
							local345 += local271.method5225();
							@Pc(545) int local545;
							if (local31 == null) {
								local545 = local347;
							} else {
								local545 = local31[local347];
							}
							if (local545 == arg0) {
								Static554.method3498(local148, local339, local516, local457, local345);
								local457 += local345;
							}
							local339 += local345;
						}
					}
					local51[local279] = local516;
				} else {
					local220 = local148.length;
					local220--;
					local258 = local148[local220] & 0xFF;
					local220 -= local25 * local258 * 4;
					local271 = new Class12_Sub8(local148);
					@Pc(274) int[] local274 = new int[local25];
					local271.anInt6217 = local220;
					for (local279 = 0; local279 < local258; local279++) {
						local283 = 0;
						for (local285 = 0; local285 < local25; local285++) {
							local283 += local271.method5225();
							local274[local285] += local283;
						}
					}
					@Pc(311) byte[][] local311 = new byte[local25][];
					for (local285 = 0; local285 < local25; local285++) {
						local311[local285] = new byte[local274[local285]];
						local274[local285] = 0;
					}
					local271.anInt6217 = local220;
					local339 = 0;
					for (local341 = 0; local341 < local258; local341++) {
						local345 = 0;
						for (local347 = 0; local347 < local25; local347++) {
							local345 += local271.method5225();
							Static554.method3498(local148, local339, local311[local347], local274[local347], local345);
							local274[local347] += local345;
							local339 += local345;
						}
					}
					for (local345 = 0; local345 < local25; local345++) {
						if (local31 == null) {
							local347 = local345;
						} else {
							local347 = local31[local345];
						}
						if (this.anInt295 == 0) {
							local51[local347] = Static425.method6549(local311[local345]);
						} else {
							local51[local347] = local311[local345];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(II)I")
	private int method401(@OriginalArg(0) int arg0) {
		if (this.method393(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass117_1.method3995(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZZZ)V")
	public void method403(@OriginalArg(0) boolean arg0) {
		if (!this.method398()) {
			return;
		}
		this.aClass238_1.aClass320Array1 = null;
		this.aClass238_1.anIntArrayArray63 = null;
		if (arg0) {
			this.aClass238_1.aClass320_1 = null;
			this.aClass238_1.anIntArray477 = null;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZI)V")
	private void method405(@OriginalArg(1) int arg0) {
		if (this.aBoolean11) {
			this.anObjectArray1[arg0] = this.aClass117_1.method4000(arg0);
		} else {
			this.anObjectArray1[arg0] = Static425.method6549(this.aClass117_1.method4000(arg0));
		}
	}

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(II)V")
	private void method406(@OriginalArg(1) int arg0) {
		this.aClass117_1.method4002(arg0);
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(I)I")
	public int method407() {
		return this.method398() ? this.aClass238_1.anIntArray476.length : -1;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIB)[B")
	public byte[] method408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method418(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(I)Z")
	public boolean method409() {
		if (!this.method398()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass238_1.anIntArray478.length; local15++) {
			@Pc(23) int local23 = this.aClass238_1.anIntArray478[local15];
			if (this.anObjectArray1[local23] == null) {
				this.method405(local23);
				if (this.anObjectArray1[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(IB)[B")
	public byte[] method410(@OriginalArg(0) int arg0) {
		if (!this.method398()) {
			return null;
		} else if (this.aClass238_1.anIntArray476.length == 1) {
			return this.method408(0, arg0);
		} else if (!this.method393(arg0)) {
			return null;
		} else if (this.aClass238_1.anIntArray476[arg0] == 1) {
			return this.method408(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!an", name = "e", descriptor = "(II)Z")
	public boolean method412(@OriginalArg(0) int arg0) {
		if (!this.method393(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method405(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!an", name = "f", descriptor = "(II)I")
	public int method413(@OriginalArg(1) int arg0) {
		if (this.method398()) {
			@Pc(21) int local21 = this.aClass238_1.aClass320_1.method7990(arg0);
			return this.method393(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(III)Z")
	private boolean method416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method398()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass238_1.anIntArray476.length > arg1 && arg0 < this.aClass238_1.anIntArray476[arg1]) {
			return true;
		} else if (Static468.aBoolean608) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(B)V")
	public void method417() {
		if (this.anObjectArray1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArray1.length; local14++) {
				this.anObjectArray1[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I[IIB)[B")
	public byte[] method418(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!this.method416(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg0] == null) {
			@Pc(30) boolean local30 = this.method400(arg0, arg1, arg2);
			if (!local30) {
				this.method405(arg2);
				local30 = this.method400(arg0, arg1, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static202.method3816(this.anObjectArrayArray1[arg2][arg0], false);
		if (this.anInt295 == 1) {
			this.anObjectArrayArray1[arg2][arg0] = null;
			if (this.aClass238_1.anIntArray476[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt295 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method419(@OriginalArg(0) String arg0) {
		if (this.method398()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(31) int local31 = this.aClass238_1.aClass320_1.method7990(Static31.method680(local12));
			return this.method412(local31);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(BLjava/lang/String;)I")
	public int method420(@OriginalArg(1) String arg0) {
		if (this.method398()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass238_1.aClass320_1.method7990(Static31.method680(local20));
			return this.method393(local29) ? local29 : -1;
		} else {
			return -1;
		}
	}
}
