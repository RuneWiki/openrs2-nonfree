import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class158 {

	@OriginalMember(owner = "client!lt", name = "G", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!lt", name = "R", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "Lclient!og;")
	private Class188 aClass188_1 = null;

	@OriginalMember(owner = "client!lt", name = "I", descriptor = "Lclient!gi;")
	private final Class96 aClass96_1;

	@OriginalMember(owner = "client!lt", name = "H", descriptor = "I")
	public int anInt4036;

	@OriginalMember(owner = "client!lt", name = "M", descriptor = "Z")
	private final boolean aBoolean263;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lclient!gi;ZI)V")
	public Class158(@OriginalArg(0) Class96 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass96_1 = arg0;
		this.anInt4036 = arg2;
		this.aBoolean263 = arg1;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method3666(@OriginalArg(1) String arg0) {
		if (this.method3675()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(31) int local31 = this.aClass188_1.aClass67_1.method1559(Static46.method4906(local20));
			return this.method3693(local31);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method3667(@OriginalArg(0) String arg0) {
		if (this.method3675()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass188_1.aClass67_1.method1559(Static46.method4906(local18));
			return this.method3694(local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IB)V")
	private void method3669(@OriginalArg(0) int arg0) {
		this.aClass96_1.method4053(arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)Z")
	private boolean method3670(@OriginalArg(1) int arg0) {
		if (!this.method3675()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass188_1.anIntArray428.length && this.aClass188_1.anIntArray428[arg0] != 0) {
			return true;
		} else if (Static35.aBoolean69) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
	public void method3671() {
		if (this.anObjectArray2 != null) {
			for (@Pc(13) int local13 = 0; local13 < this.anObjectArray2.length; local13++) {
				this.anObjectArray2[local13] = null;
			}
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIZ)[B")
	public byte[] method3672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method3699(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)Z")
	private boolean method3673(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3675()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass188_1.anIntArray428.length && arg0 < this.aClass188_1.anIntArray428[arg1]) {
			return true;
		} else if (Static35.aBoolean69) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(II)V")
	private void method3674(@OriginalArg(1) int arg0) {
		if (this.aBoolean263) {
			this.anObjectArray2[arg0] = this.aClass96_1.method4054(arg0);
		} else {
			this.anObjectArray2[arg0] = Static262.method4019(this.aClass96_1.method4054(arg0));
		}
	}

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)Z")
	private boolean method3675() {
		if (this.aClass188_1 == null) {
			this.aClass188_1 = this.aClass96_1.method4047();
			if (this.aClass188_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass188_1.anInt4817][];
			this.anObjectArray2 = new Object[this.aClass188_1.anInt4817];
		}
		return true;
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method3677(@OriginalArg(0) String arg0) {
		if (this.method3675()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(31) int local31 = this.aClass188_1.aClass67_1.method1559(Static46.method4906(local20));
			return this.method3670(local31) ? local31 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BII)Z")
	public boolean method3678(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method3673(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method3674(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "([IIII)Z")
	private boolean method3679(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method3670(arg2)) {
			return false;
		} else if (this.anObjectArray2[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass188_1.anIntArray429[arg2];
			@Pc(31) int[] local31 = this.aClass188_1.anIntArrayArray40[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass188_1.anIntArray428[arg2]];
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
			@Pc(127) byte[] local127;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local127 = Static270.method4108(false, this.anObjectArray2[arg2]);
			} else {
				local127 = Static270.method4108(true, this.anObjectArray2[arg2]);
				@Pc(142) Class6_Sub15 local142 = new Class6_Sub15(local127);
				local142.method3137(local142.aByteArray51.length, arg0);
			}
			@Pc(154) byte[] local154;
			try {
				local154 = Static83.method1502(local127);
			} catch (@Pc(156) RuntimeException local156) {
				throw Static28.method362(local156, "T3 - " + (arg0 != null) + "," + arg2 + "," + local127.length + "," + Static80.method1469(local127.length, local127) + "," + Static80.method1469(local127.length - 2, local127) + "," + this.aClass188_1.anIntArray431[arg2] + "," + this.aClass188_1.anInt4822);
			}
			if (this.aBoolean263) {
				this.anObjectArray2[arg2] = null;
			}
			@Pc(229) int local229;
			if (local25 > 1) {
				@Pc(236) int local236;
				@Pc(249) Class6_Sub15 local249;
				@Pc(253) int local253;
				@Pc(258) int local258;
				@Pc(262) int local262;
				@Pc(264) int local264;
				@Pc(278) int local278;
				@Pc(326) int local326;
				@Pc(328) int local328;
				if (this.anInt4036 == 2) {
					local229 = local154.length;
					@Pc(231) int local231 = local229 - 1;
					local236 = local154[local231] & 0xFF;
					@Pc(244) int local244 = local231 - local25 * local236 * 4;
					local249 = new Class6_Sub15(local154);
					@Pc(251) int local251 = 0;
					local253 = 0;
					local249.anInt3487 = local244;
					for (local258 = 0; local258 < local236; local258++) {
						local262 = 0;
						for (local264 = 0; local264 < local25; local264++) {
							local262 += local249.method3109();
							if (local31 == null) {
								local278 = local264;
							} else {
								local278 = local31[local264];
							}
							if (arg1 == local278) {
								local251 += local262;
								local253 = local278;
							}
						}
					}
					if (local251 == 0) {
						return true;
					}
					@Pc(313) byte[] local313 = new byte[local251];
					local251 = 0;
					local249.anInt3487 = local244;
					local264 = 0;
					for (local278 = 0; local278 < local236; local278++) {
						local326 = 0;
						for (local328 = 0; local328 < local25; local328++) {
							local326 += local249.method3109();
							@Pc(342) int local342;
							if (local31 == null) {
								local342 = local328;
							} else {
								local342 = local31[local328];
							}
							if (arg1 == local342) {
								Static459.method5354(local154, local264, local313, local251, local326);
								local251 += local326;
							}
							local264 += local326;
						}
					}
					local51[local253] = local313;
				} else {
					local229 = local154.length;
					local229--;
					local236 = local154[local229] & 0xFF;
					local229 -= local25 * local236 * 4;
					local249 = new Class6_Sub15(local154);
					local249.anInt3487 = local229;
					@Pc(414) int[] local414 = new int[local25];
					for (local253 = 0; local253 < local236; local253++) {
						local258 = 0;
						for (local262 = 0; local262 < local25; local262++) {
							local258 += local249.method3109();
							local414[local262] += local258;
						}
					}
					@Pc(452) byte[][] local452 = new byte[local25][];
					for (local262 = 0; local262 < local25; local262++) {
						local452[local262] = new byte[local414[local262]];
						local414[local262] = 0;
					}
					local249.anInt3487 = local229;
					local264 = 0;
					for (local278 = 0; local278 < local236; local278++) {
						local326 = 0;
						for (local328 = 0; local328 < local25; local328++) {
							local326 += local249.method3109();
							Static459.method5354(local154, local264, local452[local328], local414[local328], local326);
							local264 += local326;
							local414[local328] += local326;
						}
					}
					for (local326 = 0; local326 < local25; local326++) {
						if (local31 == null) {
							local328 = local326;
						} else {
							local328 = local31[local326];
						}
						if (this.anInt4036 == 0) {
							local51[local328] = Static262.method4019(local452[local326]);
						} else {
							local51[local328] = local452[local326];
						}
					}
				}
			} else {
				if (local31 == null) {
					local229 = 0;
				} else {
					local229 = local31[0];
				}
				if (this.anInt4036 == 0) {
					local51[local229] = Static262.method4019(local154);
				} else {
					local51[local229] = local154;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method3680(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3675()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass188_1.aClass67_1.method1559(Static46.method4906(local12));
		if (this.method3670(local24)) {
			@Pc(52) int local52 = this.aClass188_1.aClass67Array1[local24].method1559(Static46.method4906(local15));
			return this.method3672(local52, local24);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method3681(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3675()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(28) int local28 = this.aClass188_1.aClass67_1.method1559(Static46.method4906(local12));
		if (this.method3670(local28)) {
			@Pc(46) int local46 = this.aClass188_1.aClass67Array1[local28].method1559(Static46.method4906(local15));
			return this.method3678(local28, local46);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3682(@OriginalArg(1) String arg0) {
		if (this.method3675()) {
			@Pc(14) String local14 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass188_1.aClass67_1.method1559(Static46.method4906(local14));
			return local28 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BI)I")
	public int method3683(@OriginalArg(1) int arg0) {
		return this.method3670(arg0) ? this.aClass188_1.anIntArray428[arg0] : 0;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)Z")
	public boolean method3685() {
		if (!this.method3675()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass188_1.anIntArray427.length; local15++) {
			@Pc(23) int local23 = this.aClass188_1.anIntArray427[local15];
			if (this.anObjectArray2[local23] == null) {
				this.method3674(local23);
				if (this.anObjectArray2[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "(II)Z")
	public boolean method3686(@OriginalArg(0) int arg0) {
		if (!this.method3675()) {
			return false;
		} else if (this.aClass188_1.anIntArray428.length == 1) {
			return this.method3678(0, arg0);
		} else if (!this.method3670(arg0)) {
			return false;
		} else if (this.aClass188_1.anIntArray428[arg0] == 1) {
			return this.method3678(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "(II)[I")
	public int[] method3687(@OriginalArg(1) int arg0) {
		if (!this.method3670(arg0)) {
			return null;
		}
		@Pc(27) int[] local27 = this.aClass188_1.anIntArrayArray40[arg0];
		if (local27 == null) {
			local27 = new int[this.aClass188_1.anIntArray429[arg0]];
			@Pc(38) int local38 = 0;
			while (local27.length > local38) {
				local27[local38] = local38++;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "(I)I")
	public int method3688() {
		if (!this.method3675()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray2.length; local17++) {
			if (this.aClass188_1.anIntArray429[local17] > 0) {
				local13 += 100;
				local15 += this.method3693(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(B)V")
	public void method3689() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArrayArray1.length; local14++) {
				this.anObjectArrayArray1[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public void method3690(@OriginalArg(0) String arg0) {
		if (this.method3675()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass188_1.aClass67_1.method1559(Static46.method4906(local18));
			this.method3669(local27);
		}
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(IB)[B")
	public byte[] method3691(@OriginalArg(0) int arg0) {
		if (!this.method3675()) {
			return null;
		} else if (this.aClass188_1.anIntArray428.length == 1) {
			return this.method3672(arg0, 0);
		} else if (!this.method3670(arg0)) {
			return null;
		} else if (this.aClass188_1.anIntArray428[arg0] == 1) {
			return this.method3672(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lt", name = "f", descriptor = "(II)I")
	private int method3693(@OriginalArg(1) int arg0) {
		if (this.method3670(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass96_1.method4048(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "(II)Z")
	public boolean method3694(@OriginalArg(1) int arg0) {
		if (!this.method3670(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method3674(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "(B)I")
	public int method3695() {
		return this.method3675() ? this.aClass188_1.anIntArray428.length : -1;
	}

	@OriginalMember(owner = "client!lt", name = "h", descriptor = "(II)V")
	public void method3696(@OriginalArg(0) int arg0) {
		if (this.method3670(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "(B)I")
	public int method3698() {
		if (!this.method3675()) {
			throw new IllegalStateException("");
		}
		return this.aClass188_1.anInt4822;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BI[II)[B")
	public byte[] method3699(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method3673(arg2, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(30) boolean local30 = this.method3679(arg1, arg2, arg0);
			if (!local30) {
				this.method3674(arg0);
				local30 = this.method3679(arg1, arg2, arg0);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(63) byte[] local63 = Static270.method4108(false, this.anObjectArrayArray1[arg0][arg2]);
		if (this.anInt4036 == 1) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass188_1.anIntArray428[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt4036 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local63;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZZB)V")
	public void method3700(@OriginalArg(1) boolean arg0) {
		if (!this.method3675()) {
			return;
		}
		this.aClass188_1.anIntArrayArray41 = null;
		this.aClass188_1.aClass67Array1 = null;
		if (arg0) {
			this.aClass188_1.anIntArray433 = null;
			this.aClass188_1.aClass67_1 = null;
		}
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(BI)I")
	public int method3701(@OriginalArg(1) int arg0) {
		if (this.method3675()) {
			@Pc(23) int local23 = this.aClass188_1.aClass67_1.method1559(arg0);
			return this.method3670(local23) ? local23 : -1;
		} else {
			return -1;
		}
	}
}
