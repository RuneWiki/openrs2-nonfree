import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class157 {

	@OriginalMember(owner = "client!in", name = "E", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray31;

	@OriginalMember(owner = "client!in", name = "M", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!in", name = "d", descriptor = "Lclient!vw;")
	private Class364 aClass364_2 = null;

	@OriginalMember(owner = "client!in", name = "H", descriptor = "Lclient!ci;")
	private final Class37 aClass37_1;

	@OriginalMember(owner = "client!in", name = "D", descriptor = "Z")
	private final boolean aBoolean392;

	@OriginalMember(owner = "client!in", name = "i", descriptor = "I")
	public int anInt5303;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!ci;ZI)V")
	public Class157(@OriginalArg(0) Class37 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aClass37_1 = arg0;
		this.aBoolean392 = arg1;
		this.anInt5303 = arg2;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)I")
	public int method4543() {
		if (!this.method4553()) {
			throw new IllegalStateException("");
		}
		return this.aClass364_2.anInt10768;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method4545(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method4553()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass364_2.aClass60_1.method2133(Static596.method8756(local12));
		if (this.method4546(local24)) {
			@Pc(52) int local52 = this.aClass364_2.aClass60Array1[local24].method2133(Static596.method8756(local15));
			return this.method4564(local24, local52);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IB)Z")
	private boolean method4546(@OriginalArg(0) int arg0) {
		if (!this.method4553()) {
			return false;
		} else if (arg0 >= 0 && this.aClass364_2.anIntArray693.length > arg0 && this.aClass364_2.anIntArray693[arg0] != 0) {
			return true;
		} else if (Static603.aBoolean518) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III[I)[B")
	public byte[] method4547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method4572(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(37) boolean local37 = this.method4548(arg1, arg2, arg0);
			if (!local37) {
				this.method4560(arg0);
				local37 = this.method4548(arg1, arg2, arg0);
				if (!local37) {
					return null;
				}
			}
		}
		@Pc(64) byte[] local64 = Static172.method3628(false, this.anObjectArrayArray1[arg0][arg1]);
		if (this.anInt5303 == 1) {
			this.anObjectArrayArray1[arg0][arg1] = null;
			if (this.aClass364_2.anIntArray693[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt5303 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local64;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IB[II)Z")
	private boolean method4548(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method4546(arg2)) {
			return false;
		} else if (this.anObjectArray31[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass364_2.anIntArray694[arg2];
			@Pc(31) int[] local31 = this.aClass364_2.anIntArrayArray60[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass364_2.anIntArray693[arg2]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg2];
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
			@Pc(125) byte[] local125;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local125 = Static172.method3628(false, this.anObjectArray31[arg2]);
			} else {
				local125 = Static172.method3628(true, this.anObjectArray31[arg2]);
				@Pc(140) Class2_Sub11 local140 = new Class2_Sub11(local125);
				local140.method8363(arg1, local140.aByteArray128.length);
			}
			@Pc(152) byte[] local152;
			try {
				local152 = Static562.method8438(local125);
			} catch (@Pc(154) RuntimeException local154) {
				throw Static259.method4750(local154, "T3 - " + (arg1 != null) + "," + arg2 + "," + local125.length + "," + Static487.method7985(local125.length, local125) + "," + Static487.method7985(local125.length - 2, local125) + "," + this.aClass364_2.anIntArray696[arg2] + "," + this.aClass364_2.anInt10768);
			}
			if (this.aBoolean392) {
				this.anObjectArray31[arg2] = null;
			}
			@Pc(237) int local237;
			if (local25 > 1) {
				@Pc(244) int local244;
				@Pc(257) Class2_Sub11 local257;
				@Pc(265) int local265;
				@Pc(269) int local269;
				@Pc(271) int local271;
				@Pc(325) int local325;
				@Pc(327) int local327;
				@Pc(331) int local331;
				@Pc(333) int local333;
				if (this.anInt5303 == 2) {
					local237 = local152.length;
					local237--;
					local244 = local152[local237] & 0xFF;
					local237 -= local244 * 4 * local25;
					local257 = new Class2_Sub11(local152);
					@Pc(442) int local442 = 0;
					local265 = 0;
					local257.anInt10066 = local237;
					for (local269 = 0; local269 < local244; local269++) {
						local271 = 0;
						for (local325 = 0; local325 < local25; local325++) {
							local271 += local257.method8381();
							if (local31 == null) {
								local327 = local325;
							} else {
								local327 = local31[local325];
							}
							if (local327 == arg0) {
								local265 = local327;
								local442 += local271;
							}
						}
					}
					if (local442 == 0) {
						return true;
					}
					@Pc(508) byte[] local508 = new byte[local442];
					local257.anInt10066 = local237;
					local442 = 0;
					local325 = 0;
					for (local327 = 0; local327 < local244; local327++) {
						local331 = 0;
						for (local333 = 0; local333 < local25; local333++) {
							local331 += local257.method8381();
							@Pc(537) int local537;
							if (local31 == null) {
								local537 = local333;
							} else {
								local537 = local31[local333];
							}
							if (local537 == arg0) {
								Static653.method7723(local152, local325, local508, local442, local331);
								local442 += local331;
							}
							local325 += local331;
						}
					}
					local51[local265] = local508;
				} else {
					local237 = local152.length;
					@Pc(240) int local240 = local237 - 1;
					local244 = local152[local240] & 0xFF;
					@Pc(252) int local252 = local240 - local25 * 4 * local244;
					local257 = new Class2_Sub11(local152);
					@Pc(260) int[] local260 = new int[local25];
					local257.anInt10066 = local252;
					for (local265 = 0; local265 < local244; local265++) {
						local269 = 0;
						for (local271 = 0; local271 < local25; local271++) {
							local269 += local257.method8381();
							local260[local271] += local269;
						}
					}
					@Pc(297) byte[][] local297 = new byte[local25][];
					for (local271 = 0; local271 < local25; local271++) {
						local297[local271] = new byte[local260[local271]];
						local260[local271] = 0;
					}
					local257.anInt10066 = local252;
					local325 = 0;
					for (local327 = 0; local327 < local244; local327++) {
						local331 = 0;
						for (local333 = 0; local333 < local25; local333++) {
							local331 += local257.method8381();
							Static653.method7723(local152, local325, local297[local333], local260[local333], local331);
							local325 += local331;
							local260[local333] += local331;
						}
					}
					for (local331 = 0; local331 < local25; local331++) {
						if (local31 == null) {
							local333 = local331;
						} else {
							local333 = local31[local331];
						}
						if (this.anInt5303 == 0) {
							local51[local333] = Static51.method1759(local297[local331]);
						} else {
							local51[local333] = local297[local331];
						}
					}
				}
			} else {
				if (local31 == null) {
					local237 = 0;
				} else {
					local237 = local31[0];
				}
				if (this.anInt5303 == 0) {
					local51[local237] = Static51.method1759(local152);
				} else {
					local51[local237] = local152;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)[I")
	public int[] method4550(@OriginalArg(0) int arg0) {
		if (!this.method4546(arg0)) {
			return null;
		}
		@Pc(24) int[] local24 = this.aClass364_2.anIntArrayArray60[arg0];
		if (local24 == null) {
			local24 = new int[this.aClass364_2.anIntArray694[arg0]];
			@Pc(35) int local35 = 0;
			while (local35 < local24.length) {
				local24[local35] = local35++;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method4551(@OriginalArg(0) String arg0) {
		if (this.method4553()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass364_2.aClass60_1.method2133(Static596.method8756(local12));
			return this.method4573(local28);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(B)I")
	public int method4552() {
		if (!this.method4553()) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anObjectArray31.length; local15++) {
			if (this.aClass364_2.anIntArray694[local15] > 0) {
				local13 += this.method4573(local15);
				local11 += 100;
			}
		}
		if (local11 == 0) {
			return 100;
		} else {
			return local13 * 100 / local11;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)Z")
	private boolean method4553() {
		if (this.aClass364_2 == null) {
			this.aClass364_2 = this.aClass37_1.method1662();
			if (this.aClass364_2 == null) {
				return false;
			}
			this.anObjectArray31 = new Object[this.aClass364_2.anInt10773];
			this.anObjectArrayArray1 = new Object[this.aClass364_2.anInt10773][];
		}
		return true;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method4554(@OriginalArg(1) String arg0) {
		if (this.method4553()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass364_2.aClass60_1.method2133(Static596.method8756(local17));
			return local26 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(I)Z")
	public boolean method4555() {
		if (!this.method4553()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass364_2.anIntArray698.length; local15++) {
			@Pc(23) int local23 = this.aClass364_2.anIntArray698[local15];
			if (this.anObjectArray31[local23] == null) {
				this.method4560(local23);
				if (this.anObjectArray31[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BI)V")
	private void method4556(@OriginalArg(1) int arg0) {
		this.aClass37_1.method1660(arg0);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	private boolean method4557(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4553()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(26) int local26 = this.aClass364_2.aClass60_1.method2133(Static596.method8756(local12));
		if (this.method4546(local26)) {
			@Pc(53) int local53 = this.aClass364_2.aClass60Array1[local26].method2133(Static596.method8756(local15));
			return this.method4574(local26, local53);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IZZ)V")
	public void method4558(@OriginalArg(2) boolean arg0) {
		if (!this.method4553()) {
			return;
		}
		if (arg0) {
			this.aClass364_2.anIntArray697 = null;
			this.aClass364_2.aClass60_1 = null;
		}
		this.aClass364_2.anIntArrayArray61 = null;
		this.aClass364_2.aClass60Array1 = null;
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V")
	public void method4559() {
		if (this.anObjectArray31 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.anObjectArray31.length; local17++) {
				this.anObjectArray31[local17] = null;
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(II)V")
	private void method4560(@OriginalArg(0) int arg0) {
		if (this.aBoolean392) {
			this.anObjectArray31[arg0] = this.aClass37_1.method1661(arg0);
		} else {
			this.anObjectArray31[arg0] = Static51.method1759(this.aClass37_1.method1661(arg0));
		}
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(II)I")
	public int method4561(@OriginalArg(1) int arg0) {
		return this.method4546(arg0) ? this.aClass364_2.anIntArray693[arg0] : 0;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(BI)Z")
	public boolean method4562(@OriginalArg(1) int arg0) {
		if (!this.method4546(arg0)) {
			return false;
		} else if (this.anObjectArray31[arg0] == null) {
			this.method4560(arg0);
			return this.anObjectArray31[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public void method4563(@OriginalArg(0) String arg0) {
		if (this.method4553()) {
			@Pc(15) String local15 = arg0.toLowerCase();
			@Pc(24) int local24 = this.aClass364_2.aClass60_1.method2133(Static596.method8756(local15));
			this.method4556(local24);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)[B")
	public byte[] method4564(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method4547(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(II)V")
	public void method4565(@OriginalArg(0) int arg0) {
		if (this.method4546(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(B)V")
	public void method4566() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method4567(@OriginalArg(1) String arg0) {
		if (this.method4553()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass364_2.aClass60_1.method2133(Static596.method8756(local12));
			return this.method4562(local23);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!in", name = "e", descriptor = "(I)I")
	public int method4568() {
		return this.method4553() ? this.aClass364_2.anIntArray693.length : -1;
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(BI)[B")
	public byte[] method4569(@OriginalArg(1) int arg0) {
		if (!this.method4553()) {
			return null;
		} else if (this.aClass364_2.anIntArray693.length == 1) {
			return this.method4564(0, arg0);
		} else if (!this.method4546(arg0)) {
			return null;
		} else if (this.aClass364_2.anIntArray693[arg0] == 1) {
			return this.method4564(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method4570(@OriginalArg(1) String arg0) {
		@Pc(10) int local10 = this.method4571("");
		return local10 == -1 ? this.method4557(arg0, "") : this.method4557("", arg0);
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method4571(@OriginalArg(0) String arg0) {
		if (this.method4553()) {
			@Pc(16) String local16 = arg0.toLowerCase();
			@Pc(25) int local25 = this.aClass364_2.aClass60_1.method2133(Static596.method8756(local16));
			return this.method4546(local25) ? local25 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(III)Z")
	private boolean method4572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4553()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass364_2.anIntArray693.length && arg0 < this.aClass364_2.anIntArray693[arg1]) {
			return true;
		} else if (Static603.aBoolean518) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!in", name = "e", descriptor = "(II)I")
	private int method4573(@OriginalArg(1) int arg0) {
		if (this.method4546(arg0)) {
			return this.anObjectArray31[arg0] == null ? this.aClass37_1.method1657(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(III)Z")
	public boolean method4574(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4572(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray31[arg0] == null) {
			this.method4560(arg0);
			return this.anObjectArray31[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZI)Z")
	public boolean method4575(@OriginalArg(1) int arg0) {
		if (!this.method4553()) {
			return false;
		} else if (this.aClass364_2.anIntArray693.length == 1) {
			return this.method4574(0, arg0);
		} else if (!this.method4546(arg0)) {
			return false;
		} else if (this.aClass364_2.anIntArray693[arg0] == 1) {
			return this.method4574(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method4576(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method4553()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(29) int local29 = this.aClass364_2.aClass60_1.method2133(Static596.method8756(local12));
		if (local29 < 0) {
			return false;
		} else {
			@Pc(47) int local47 = this.aClass364_2.aClass60Array1[local29].method2133(Static596.method8756(local20));
			return local47 >= 0;
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(IB)I")
	public int method4577(@OriginalArg(0) int arg0) {
		if (this.method4553()) {
			@Pc(16) int local16 = this.aClass364_2.aClass60_1.method2133(arg0);
			return this.method4546(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}
}
