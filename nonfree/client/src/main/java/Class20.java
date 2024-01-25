import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class20 {

	@OriginalMember(owner = "client!b", name = "s", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!b", name = "O", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!b", name = "M", descriptor = "Lclient!dg;")
	private Class55 aClass55_1 = null;

	@OriginalMember(owner = "client!b", name = "i", descriptor = "Z")
	private final boolean aBoolean10;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "I")
	public int anInt223;

	@OriginalMember(owner = "client!b", name = "D", descriptor = "Lclient!sr;")
	private final Class135 aClass135_1;

	static {
		new Class57("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!sr;ZI)V")
	public Class20(@OriginalArg(0) Class135 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean10 = arg1;
		this.anInt223 = arg2;
		this.aClass135_1 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)[B")
	public byte[] method224(@OriginalArg(0) int arg0) {
		if (!this.method252()) {
			return null;
		} else if (this.aClass55_1.anIntArray119.length == 1) {
			return this.method253(arg0, 0);
		} else if (!this.method235(arg0)) {
			return null;
		} else if (this.aClass55_1.anIntArray119[arg0] == 1) {
			return this.method253(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)I")
	public int method225() {
		if (!this.method252()) {
			return 0;
		}
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < this.anObjectArray1.length; local19++) {
			if (this.aClass55_1.anIntArray121[local19] > 0) {
				local15 += 100;
				local17 += this.method232(local19);
			}
		}
		if (local15 == 0) {
			return 100;
		} else {
			return local17 * 100 / local15;
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(II)Z")
	public boolean method226(@OriginalArg(1) int arg0) {
		if (!this.method252()) {
			return false;
		} else if (this.aClass55_1.anIntArray119.length == 1) {
			return this.method233(0, arg0);
		} else if (!this.method235(arg0)) {
			return false;
		} else if (this.aClass55_1.anIntArray119[arg0] == 1) {
			return this.method233(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public void method227() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anObjectArrayArray1.length; local18++) {
				this.anObjectArrayArray1[local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)[I")
	public int[] method228(@OriginalArg(0) int arg0) {
		if (!this.method235(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass55_1.anIntArrayArray14[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass55_1.anIntArray121[arg0]];
			@Pc(34) int local34 = 0;
			while (local23.length > local34) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)I")
	public int method229() {
		return this.method252() ? this.aClass55_1.anIntArray119.length : -1;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public int method230(@OriginalArg(1) String arg0) {
		if (this.method252()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass55_1.aClass225_1.method5114(Static338.method5140(local12));
			return this.method235(local26) ? local26 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(II)I")
	public int method231(@OriginalArg(1) int arg0) {
		return this.method235(arg0) ? this.aClass55_1.anIntArray119[arg0] : 0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)I")
	private int method232(@OriginalArg(1) int arg0) {
		if (this.method235(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass135_1.method2979(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)Z")
	public boolean method233(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method254(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method256(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(BI)V")
	public void method234(@OriginalArg(1) int arg0) {
		if (this.method235(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(II)Z")
	private boolean method235(@OriginalArg(0) int arg0) {
		if (!this.method252()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass55_1.anIntArray119.length && this.aClass55_1.anIntArray119[arg0] != 0) {
			return true;
		} else if (Static373.aBoolean488) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIB[I)Z")
	private boolean method236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method235(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass55_1.anIntArray121[arg0];
			@Pc(31) int[] local31 = this.aClass55_1.anIntArrayArray14[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass55_1.anIntArray119[arg0]];
			}
			@Pc(56) Object[] local56 = this.anObjectArrayArray1[arg0];
			@Pc(58) boolean local58 = true;
			for (@Pc(60) int local60 = 0; local60 < local25; local60++) {
				@Pc(68) int local68;
				if (local31 == null) {
					local68 = local60;
				} else {
					local68 = local31[local60];
				}
				if (local56[local68] == null) {
					local58 = false;
					break;
				}
			}
			if (local58) {
				return true;
			}
			@Pc(117) byte[] local117;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local117 = Static291.method4529(this.anObjectArray1[arg0], false);
			} else {
				local117 = Static291.method4529(this.anObjectArray1[arg0], true);
				@Pc(122) Class3_Sub5 local122 = new Class3_Sub5(local117);
				local122.method2736(arg2, local122.aByteArray42.length);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Static351.method2912(local117);
			} catch (@Pc(148) RuntimeException local148) {
				throw Static269.method4259(local148, "T3 - " + (arg2 != null) + "," + arg0 + "," + local117.length + "," + Static32.method487(local117, local117.length) + "," + Static32.method487(local117, local117.length - 2) + "," + this.aClass55_1.anIntArray120[arg0] + "," + this.aClass55_1.anInt1276);
			}
			if (this.aBoolean10) {
				this.anObjectArray1[arg0] = null;
			}
			@Pc(223) int local223;
			if (local25 > 1) {
				@Pc(230) int local230;
				@Pc(243) Class3_Sub5 local243;
				@Pc(251) int local251;
				@Pc(255) int local255;
				@Pc(257) int local257;
				@Pc(307) int local307;
				@Pc(309) int local309;
				@Pc(313) int local313;
				@Pc(315) int local315;
				if (this.anInt223 == 2) {
					local223 = local146.length;
					local223--;
					local230 = local146[local223] & 0xFF;
					local223 -= local25 * 4 * local230;
					local243 = new Class3_Sub5(local146);
					@Pc(421) int local421 = 0;
					local243.anInt3121 = local223;
					local251 = 0;
					for (local255 = 0; local255 < local230; local255++) {
						local257 = 0;
						for (local307 = 0; local307 < local25; local307++) {
							local257 += local243.method2726();
							if (local31 == null) {
								local309 = local307;
							} else {
								local309 = local31[local307];
							}
							if (local309 == arg1) {
								local421 += local257;
								local251 = local309;
							}
						}
					}
					if (local421 == 0) {
						return true;
					}
					@Pc(480) byte[] local480 = new byte[local421];
					local421 = 0;
					local243.anInt3121 = local223;
					local307 = 0;
					for (local309 = 0; local309 < local230; local309++) {
						local313 = 0;
						for (local315 = 0; local315 < local25; local315++) {
							local313 += local243.method2726();
							@Pc(509) int local509;
							if (local31 == null) {
								local509 = local315;
							} else {
								local509 = local31[local315];
							}
							if (local509 == arg1) {
								Static400.method1877(local146, local307, local480, local421, local313);
								local421 += local313;
							}
							local307 += local313;
						}
					}
					local56[local251] = local480;
				} else {
					local223 = local146.length;
					@Pc(225) int local225 = local223 - 1;
					local230 = local146[local225] & 0xFF;
					@Pc(238) int local238 = local225 - local230 * local25 * 4;
					local243 = new Class3_Sub5(local146);
					local243.anInt3121 = local238;
					@Pc(249) int[] local249 = new int[local25];
					for (local251 = 0; local251 < local230; local251++) {
						local255 = 0;
						for (local257 = 0; local257 < local25; local257++) {
							local255 += local243.method2726();
							local249[local257] += local255;
						}
					}
					@Pc(283) byte[][] local283 = new byte[local25][];
					for (local257 = 0; local257 < local25; local257++) {
						local283[local257] = new byte[local249[local257]];
						local249[local257] = 0;
					}
					local243.anInt3121 = local238;
					local307 = 0;
					for (local309 = 0; local309 < local230; local309++) {
						local313 = 0;
						for (local315 = 0; local315 < local25; local315++) {
							local313 += local243.method2726();
							Static400.method1877(local146, local307, local283[local315], local249[local315], local313);
							local307 += local313;
							local249[local315] += local313;
						}
					}
					for (local313 = 0; local313 < local25; local313++) {
						if (local31 == null) {
							local315 = local313;
						} else {
							local315 = local31[local313];
						}
						if (this.anInt223 == 0) {
							local56[local315] = Static101.method4666(local283[local313]);
						} else {
							local56[local315] = local283[local313];
						}
					}
				}
			} else {
				if (local31 == null) {
					local223 = 0;
				} else {
					local223 = local31[0];
				}
				if (this.anInt223 == 0) {
					local56[local223] = Static101.method4666(local146);
				} else {
					local56[local223] = local146;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BZZ)V")
	public void method237(@OriginalArg(1) boolean arg0) {
		if (!this.method252()) {
			return;
		}
		this.aClass55_1.anIntArrayArray13 = null;
		this.aClass55_1.aClass225Array1 = null;
		if (arg0) {
			this.aClass55_1.anIntArray118 = null;
			this.aClass55_1.aClass225_1 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
	public void method238() {
		if (this.anObjectArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray1.length; local6++) {
				this.anObjectArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)I")
	public int method240() {
		if (!this.method252()) {
			throw new IllegalStateException("");
		}
		return this.aClass55_1.anInt1276;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B")
	public byte[] method241(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method252()) {
			return null;
		}
		@Pc(19) String local19 = arg0.toLowerCase();
		@Pc(22) String local22 = arg1.toLowerCase();
		@Pc(31) int local31 = this.aClass55_1.aClass225_1.method5114(Static338.method5140(local19));
		if (this.method235(local31)) {
			@Pc(49) int local49 = this.aClass55_1.aClass225Array1[local31].method5114(Static338.method5140(local22));
			return this.method253(local49, local31);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(II)V")
	private void method243(@OriginalArg(1) int arg0) {
		this.aClass135_1.method2983(arg0);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(BI)Z")
	public boolean method244(@OriginalArg(1) int arg0) {
		if (!this.method235(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method256(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method245(@OriginalArg(1) String arg0) {
		if (this.method252()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass55_1.aClass225_1.method5114(Static338.method5140(local19));
			this.method243(local28);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method246(@OriginalArg(1) String arg0) {
		if (this.method252()) {
			@Pc(21) String local21 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass55_1.aClass225_1.method5114(Static338.method5140(local21));
			return local30 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(I)Z")
	public boolean method247() {
		if (!this.method252()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass55_1.anIntArray117.length; local15++) {
			@Pc(23) int local23 = this.aClass55_1.anIntArray117[local15];
			if (this.anObjectArray1[local23] == null) {
				this.method256(local23);
				if (this.anObjectArray1[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(BI)I")
	public int method248(@OriginalArg(1) int arg0) {
		if (this.method252()) {
			@Pc(16) int local16 = this.aClass55_1.aClass225_1.method5114(arg0);
			return this.method235(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method249(@OriginalArg(1) String arg0) {
		if (this.method252()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass55_1.aClass225_1.method5114(Static338.method5140(local12));
			return this.method244(local28);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III[I)[B")
	public byte[] method250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method254(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(35) boolean local35 = this.method236(arg1, arg0, arg2);
			if (!local35) {
				this.method256(arg1);
				local35 = this.method236(arg1, arg0, arg2);
				if (!local35) {
					return null;
				}
			}
		}
		@Pc(62) byte[] local62 = Static291.method4529(this.anObjectArrayArray1[arg1][arg0], false);
		if (this.anInt223 == 1) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass55_1.anIntArray119[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt223 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local62;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(ILjava/lang/String;)I")
	public int method251(@OriginalArg(1) String arg0) {
		if (this.method252()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass55_1.aClass225_1.method5114(Static338.method5140(local12));
			return this.method232(local23);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!b", name = "g", descriptor = "(I)Z")
	private boolean method252() {
		if (this.aClass55_1 == null) {
			this.aClass55_1 = this.aClass135_1.method2982();
			if (this.aClass55_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass55_1.anInt1277][];
			this.anObjectArray1 = new Object[this.aClass55_1.anInt1277];
		}
		return true;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(III)[B")
	public byte[] method253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method250(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(III)Z")
	private boolean method254(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method252()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass55_1.anIntArray119.length && arg0 < this.aClass55_1.anIntArray119[arg1]) {
			return true;
		} else if (Static373.aBoolean488) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	public boolean method255(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method252()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass55_1.aClass225_1.method5114(Static338.method5140(local12));
		if (this.method235(local24)) {
			@Pc(52) int local52 = this.aClass55_1.aClass225Array1[local24].method5114(Static338.method5140(local15));
			return this.method233(local24, local52);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(II)V")
	private void method256(@OriginalArg(0) int arg0) {
		if (this.aBoolean10) {
			this.anObjectArray1[arg0] = this.aClass135_1.method2981(arg0);
		} else {
			this.anObjectArray1[arg0] = Static101.method4666(this.aClass135_1.method2981(arg0));
		}
	}
}
