import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lga")
public final class Class223 {

	@OriginalMember(owner = "client!lga", name = "i", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!lga", name = "f", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!lga", name = "h", descriptor = "Lclient!lca;")
	private Class220 aClass220_2 = null;

	@OriginalMember(owner = "client!lga", name = "I", descriptor = "Z")
	private final boolean aBoolean433;

	@OriginalMember(owner = "client!lga", name = "w", descriptor = "Lclient!an;")
	private final Class21 aClass21_1;

	@OriginalMember(owner = "client!lga", name = "M", descriptor = "I")
	public int anInt5858;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lclient!an;ZI)V")
	public Class223(@OriginalArg(0) Class21 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aBoolean433 = arg1;
		this.aClass21_1 = arg0;
		this.anInt5858 = arg2;
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)I")
	public int method5253() {
		if (!this.method5266()) {
			throw new IllegalStateException("");
		}
		return this.aClass220_2.anInt5736;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(I[III)[B")
	public byte[] method5254(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method5283(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg2] == null) {
			@Pc(41) boolean local41 = this.method5272(arg1, arg0, arg2);
			if (!local41) {
				this.method5262(arg1);
				local41 = this.method5272(arg1, arg0, arg2);
				if (!local41) {
					return null;
				}
			}
		}
		@Pc(69) byte[] local69 = Static634.method8591(false, this.anObjectArrayArray1[arg1][arg2]);
		if (this.anInt5858 == 1) {
			this.anObjectArrayArray1[arg1][arg2] = null;
			if (this.aClass220_2.anIntArray334[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt5858 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local69;
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(BI)Z")
	private boolean method5255(@OriginalArg(1) int arg0) {
		if (!this.method5266()) {
			return false;
		} else if (arg0 >= 0 && this.aClass220_2.anIntArray334.length > arg0 && this.aClass220_2.anIntArray334[arg0] != 0) {
			return true;
		} else if (Static500.aBoolean643) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IB)V")
	public void method5256(@OriginalArg(0) int arg0) {
		if (this.method5255(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method5257(@OriginalArg(0) String arg0) {
		if (this.method5266()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass220_2.aClass62_1.method1219(Static527.method7564(local13));
			return this.method5255(local28) ? local28 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5258(@OriginalArg(1) String arg0) {
		if (this.method5266()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass220_2.aClass62_1.method1219(Static527.method7564(local13));
			return this.method5270(local30);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lga", name = "f", descriptor = "(II)I")
	public int method5259(@OriginalArg(0) int arg0) {
		if (this.method5266()) {
			@Pc(25) int local25 = this.aClass220_2.aClass62_1.method1219(arg0);
			return this.method5255(local25) ? local25 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(III)Z")
	public boolean method5261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5283(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method5262(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "(II)V")
	private void method5262(@OriginalArg(0) int arg0) {
		if (this.aBoolean433) {
			this.anObjectArray2[arg0] = this.aClass21_1.method4617(arg0);
		} else {
			this.anObjectArray2[arg0] = Static263.method4529(this.aClass21_1.method4617(arg0));
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)I")
	public int method5263() {
		if (!this.method5266()) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anObjectArray2.length; local31++) {
			if (this.aClass220_2.anIntArray338[local31] > 0) {
				local16 += 100;
				local18 += this.method5279(local31);
			}
		}
		if (local16 == 0) {
			return 100;
		} else {
			return local18 * 100 / local16;
		}
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(ZI)I")
	public int method5264(@OriginalArg(1) int arg0) {
		return this.method5255(arg0) ? this.aClass220_2.anIntArray334[arg0] : 0;
	}

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "(I)Z")
	private boolean method5266() {
		if (this.aClass220_2 == null) {
			this.aClass220_2 = this.aClass21_1.method4614();
			if (this.aClass220_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass220_2.anInt5735][];
			this.anObjectArray2 = new Object[this.aClass220_2.anInt5735];
		}
		return true;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIB)[B")
	public byte[] method5267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method5254((int[]) null, arg1, arg0);
	}

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "(B)V")
	public void method5268() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(II)Z")
	public boolean method5270(@OriginalArg(0) int arg0) {
		if (!this.method5255(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method5262(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method5271(@OriginalArg(1) String arg0) {
		if (this.method5266()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass220_2.aClass62_1.method1219(Static527.method7564(local12));
			this.method5280(local21);
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(I[IIB)Z")
	private boolean method5272(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!this.method5255(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			return false;
		} else {
			@Pc(27) int local27 = this.aClass220_2.anIntArray338[arg0];
			@Pc(33) int[] local33 = this.aClass220_2.anIntArrayArray34[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass220_2.anIntArray334[arg0]];
			}
			@Pc(55) Object[] local55 = this.anObjectArrayArray1[arg0];
			@Pc(57) boolean local57 = true;
			for (@Pc(59) int local59 = 0; local59 < local27; local59++) {
				@Pc(69) int local69;
				if (local33 == null) {
					local69 = local59;
				} else {
					local69 = local33[local59];
				}
				if (local55[local69] == null) {
					local57 = false;
					break;
				}
			}
			if (local57) {
				return true;
			}
			@Pc(142) byte[] local142;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local142 = Static634.method8591(false, this.anObjectArray2[arg0]);
			} else {
				local142 = Static634.method8591(true, this.anObjectArray2[arg0]);
				@Pc(159) Class6_Sub15 local159 = new Class6_Sub15(local142);
				local159.method3047(arg1, local159.aByteArray20.length);
			}
			@Pc(179) byte[] local179;
			try {
				local179 = Static245.method4314(local142);
			} catch (@Pc(181) RuntimeException local181) {
				throw Static113.method2132(local181, "T3 - " + (arg1 != null) + "," + arg0 + "," + local142.length + "," + Static651.method8915(local142, local142.length) + "," + Static651.method8915(local142, local142.length - 2) + "," + this.aClass220_2.anIntArray339[arg0] + "," + this.aClass220_2.anInt5736);
			}
			if (this.aBoolean433) {
				this.anObjectArray2[arg0] = null;
			}
			@Pc(261) int local261;
			if (local27 > 1) {
				@Pc(268) int local268;
				@Pc(281) Class6_Sub15 local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(296) int local296;
				@Pc(298) int local298;
				@Pc(310) int local310;
				@Pc(373) int local373;
				@Pc(375) int local375;
				if (this.anInt5858 == 2) {
					local261 = local179.length;
					@Pc(263) int local263 = local261 - 1;
					local268 = local179[local263] & 0xFF;
					@Pc(276) int local276 = local263 - local268 * 4 * local27;
					local281 = new Class6_Sub15(local179);
					@Pc(283) int local283 = 0;
					local281.anInt3174 = local276;
					local288 = 0;
					for (local290 = 0; local290 < local268; local290++) {
						local296 = 0;
						for (local298 = 0; local298 < local27; local298++) {
							local296 += local281.method3015();
							if (local33 == null) {
								local310 = local298;
							} else {
								local310 = local33[local298];
							}
							if (local310 == arg2) {
								local283 += local296;
								local288 = local310;
							}
						}
					}
					if (local283 == 0) {
						return true;
					}
					@Pc(360) byte[] local360 = new byte[local283];
					local283 = 0;
					local281.anInt3174 = local276;
					local298 = 0;
					for (local310 = 0; local310 < local268; local310++) {
						local373 = 0;
						for (local375 = 0; local375 < local27; local375++) {
							local373 += local281.method3015();
							@Pc(389) int local389;
							if (local33 == null) {
								local389 = local375;
							} else {
								local389 = local33[local375];
							}
							if (local389 == arg2) {
								Static695.method5648(local179, local298, local360, local283, local373);
								local283 += local373;
							}
							local298 += local373;
						}
					}
					local55[local288] = local360;
				} else {
					local261 = local179.length;
					local261--;
					local268 = local179[local261] & 0xFF;
					local261 -= local27 * local268 * 4;
					local281 = new Class6_Sub15(local179);
					local281.anInt3174 = local261;
					@Pc(469) int[] local469 = new int[local27];
					for (local288 = 0; local288 < local268; local288++) {
						local290 = 0;
						for (local296 = 0; local296 < local27; local296++) {
							local290 += local281.method3015();
							local469[local296] += local290;
						}
					}
					@Pc(513) byte[][] local513 = new byte[local27][];
					for (local296 = 0; local296 < local27; local296++) {
						local513[local296] = new byte[local469[local296]];
						local469[local296] = 0;
					}
					local281.anInt3174 = local261;
					local298 = 0;
					for (local310 = 0; local310 < local268; local310++) {
						local373 = 0;
						for (local375 = 0; local375 < local27; local375++) {
							local373 += local281.method3015();
							Static695.method5648(local179, local298, local513[local375], local469[local375], local373);
							local298 += local373;
							local469[local375] += local373;
						}
					}
					for (local373 = 0; local373 < local27; local373++) {
						if (local33 == null) {
							local375 = local373;
						} else {
							local375 = local33[local373];
						}
						if (this.anInt5858 == 0) {
							local55[local375] = Static263.method4529(local513[local373]);
						} else {
							local55[local375] = local513[local373];
						}
					}
				}
			} else {
				if (local33 == null) {
					local261 = 0;
				} else {
					local261 = local33[0];
				}
				if (this.anInt5858 == 0) {
					local55[local261] = Static263.method4529(local179);
				} else {
					local55[local261] = local179;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "(B)Z")
	public boolean method5273() {
		if (!this.method5266()) {
			return false;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < this.aClass220_2.anIntArray336.length; local16++) {
			@Pc(26) int local26 = this.aClass220_2.anIntArray336[local16];
			if (this.anObjectArray2[local26] == null) {
				this.method5262(local26);
				if (this.anObjectArray2[local26] == null) {
					local14 = false;
				}
			}
		}
		if (-121 != -121) {
			this.aClass220_2 = null;
		}
		return local14;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method5274(@OriginalArg(0) String arg0) {
		if (this.method5266()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass220_2.aClass62_1.method1219(Static527.method7564(local13));
			return this.method5279(local22);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(BI)[B")
	public byte[] method5275(@OriginalArg(1) int arg0) {
		if (!this.method5266()) {
			return null;
		} else if (this.aClass220_2.anIntArray334.length == 1) {
			return this.method5267(arg0, 0);
		} else if (!this.method5255(arg0)) {
			return null;
		} else if (this.aClass220_2.anIntArray334[arg0] == 1) {
			return this.method5267(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method5276(@OriginalArg(0) String arg0) {
		if (this.method5266()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass220_2.aClass62_1.method1219(Static527.method7564(local13));
			return local22 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lga", name = "e", descriptor = "(I)V")
	public void method5277() {
		if (this.anObjectArray2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray2.length; local6++) {
				this.anObjectArray2[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method5278(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5266()) {
			return false;
		}
		@Pc(13) String local13 = arg1.toLowerCase();
		@Pc(16) String local16 = arg0.toLowerCase();
		@Pc(25) int local25 = this.aClass220_2.aClass62_1.method1219(Static527.method7564(local13));
		if (local25 < 0) {
			return false;
		} else {
			@Pc(42) int local42 = this.aClass220_2.aClass62Array1[local25].method1219(Static527.method7564(local16));
			return local42 >= 0;
		}
	}

	@OriginalMember(owner = "client!lga", name = "e", descriptor = "(II)I")
	private int method5279(@OriginalArg(0) int arg0) {
		if (this.method5255(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass21_1.method4618(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lga", name = "g", descriptor = "(II)V")
	private void method5280(@OriginalArg(0) int arg0) {
		this.aClass21_1.method4616(arg0);
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(ZZI)V")
	public void method5281(@OriginalArg(1) boolean arg0) {
		if (!this.method5266()) {
			return;
		}
		this.aClass220_2.anIntArrayArray35 = null;
		this.aClass220_2.aClass62Array1 = null;
		if (arg0) {
			this.aClass220_2.anIntArray337 = null;
			this.aClass220_2.aClass62_1 = null;
		}
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(III)Z")
	private boolean method5283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5266()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass220_2.anIntArray334.length && arg0 < this.aClass220_2.anIntArray334[arg1]) {
			return true;
		} else if (Static500.aBoolean643) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method5284(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5266()) {
			return null;
		}
		@Pc(19) String local19 = arg0.toLowerCase();
		@Pc(22) String local22 = arg1.toLowerCase();
		@Pc(31) int local31 = this.aClass220_2.aClass62_1.method1219(Static527.method7564(local19));
		if (this.method5255(local31)) {
			@Pc(50) int local50 = this.aClass220_2.aClass62Array1[local31].method1219(Static527.method7564(local22));
			return this.method5267(local50, local31);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(ZI)Z")
	public boolean method5285(@OriginalArg(1) int arg0) {
		if (!this.method5266()) {
			return false;
		} else if (this.aClass220_2.anIntArray334.length == 1) {
			return this.method5261(0, arg0);
		} else if (!this.method5255(arg0)) {
			return false;
		} else if (this.aClass220_2.anIntArray334[arg0] == 1) {
			return this.method5261(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(II)[I")
	public int[] method5286(@OriginalArg(1) int arg0) {
		if (!this.method5255(arg0)) {
			return null;
		}
		@Pc(27) int[] local27 = this.aClass220_2.anIntArrayArray34[arg0];
		if (local27 == null) {
			local27 = new int[this.aClass220_2.anIntArray338[arg0]];
			@Pc(38) int local38 = 0;
			while (local38 < local27.length) {
				local27[local38] = local38++;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5287(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = this.method5257("");
		return local8 == -1 ? this.method5288(arg0, "") : this.method5288("", arg0);
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	private boolean method5288(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5266()) {
			return false;
		}
		@Pc(13) String local13 = arg0.toLowerCase();
		@Pc(16) String local16 = arg1.toLowerCase();
		@Pc(27) int local27 = this.aClass220_2.aClass62_1.method1219(Static527.method7564(local13));
		if (this.method5255(local27)) {
			@Pc(46) int local46 = this.aClass220_2.aClass62Array1[local27].method1219(Static527.method7564(local16));
			return this.method5261(local27, local46);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lga", name = "e", descriptor = "(B)I")
	public int method5290() {
		return this.method5266() ? this.aClass220_2.anIntArray334.length : -1;
	}
}
