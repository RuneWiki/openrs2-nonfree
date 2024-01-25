import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class188 {

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray36;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "Lclient!eh;")
	private Class66 aClass66_1 = null;

	@OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
	public int anInt5309;

	@OriginalMember(owner = "client!pc", name = "P", descriptor = "Lclient!od;")
	private final Class176 aClass176_1;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Z")
	private final boolean aBoolean457;

	static {
		new Class256("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
		new Class256("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!od;ZI)V")
	public Class188(@OriginalArg(0) Class176 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt5309 = arg2;
		this.aClass176_1 = arg0;
		this.aBoolean457 = arg1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method4271(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4288()) {
			return null;
		}
		@Pc(17) String local17 = arg1.toLowerCase();
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(29) int local29 = this.aClass66_1.aClass205_1.method4703(Static335.method1095(local17));
		if (this.method4272(local29)) {
			@Pc(47) int local47 = this.aClass66_1.aClass205Array1[local29].method4703(Static335.method1095(local20));
			return this.method4283(local29, local47);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Z")
	private boolean method4272(@OriginalArg(0) int arg0) {
		if (!this.method4288()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass66_1.anIntArray116.length && this.aClass66_1.anIntArray116[arg0] != 0) {
			return true;
		} else if (Static291.aBoolean456) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)Z")
	public boolean method4273(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method4288()) {
			return false;
		}
		@Pc(23) String local23 = arg0.toLowerCase();
		@Pc(26) String local26 = arg1.toLowerCase();
		@Pc(35) int local35 = this.aClass66_1.aClass205_1.method4703(Static335.method1095(local23));
		if (this.method4272(local35)) {
			@Pc(53) int local53 = this.aClass66_1.aClass205Array1[local35].method4703(Static335.method1095(local26));
			return this.method4298(local53, local35);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)Z")
	public boolean method4274() {
		if (!this.method4288()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass66_1.anIntArray117.length; local15++) {
			@Pc(23) int local23 = this.aClass66_1.anIntArray117[local15];
			if (this.anObjectArray36[local23] == null) {
				this.method4280(local23);
				if (this.anObjectArray36[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public void method4275() {
		if (this.anObjectArray36 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArray36.length; local14++) {
				this.anObjectArray36[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method4276(@OriginalArg(0) String arg0) {
		if (this.method4288()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass66_1.aClass205_1.method4703(Static335.method1095(local12));
			return this.method4297(local27);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method4277(@OriginalArg(1) String arg0) {
		if (this.method4288()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass66_1.aClass205_1.method4703(Static335.method1095(local17));
			return this.method4287(local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)I")
	public int method4278(@OriginalArg(0) int arg0) {
		if (this.method4288()) {
			@Pc(18) int local18 = this.aClass66_1.aClass205_1.method4703(arg0);
			return this.method4272(local18) ? local18 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method4279(@OriginalArg(0) String arg0) {
		if (this.method4288()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass66_1.aClass205_1.method4703(Static335.method1095(local12));
			return this.method4272(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)V")
	private void method4280(@OriginalArg(0) int arg0) {
		if (this.aBoolean457) {
			this.anObjectArray36[arg0] = this.aClass176_1.method5861(arg0);
		} else {
			this.anObjectArray36[arg0] = Static320.method6040(this.aClass176_1.method5861(arg0));
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Z")
	private boolean method4281(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method4288()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass66_1.anIntArray116.length > arg1 && arg0 < this.aClass66_1.anIntArray116[arg1]) {
			return true;
		} else if (Static291.aBoolean456) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(II)[B")
	public byte[] method4282(@OriginalArg(0) int arg0) {
		if (!this.method4288()) {
			return null;
		} else if (this.aClass66_1.anIntArray116.length == 1) {
			return this.method4283(0, arg0);
		} else if (!this.method4272(arg0)) {
			return null;
		} else if (this.aClass66_1.anIntArray116[arg0] == 1) {
			return this.method4283(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIB)[B")
	public byte[] method4283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method4291(arg1, null, arg0);
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(II)V")
	private void method4284(@OriginalArg(1) int arg0) {
		this.aClass176_1.method5859(arg0);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)I")
	public int method4285(@OriginalArg(0) int arg0) {
		return this.method4272(arg0) ? this.aClass66_1.anIntArray116[arg0] : 0;
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(II)Z")
	public boolean method4287(@OriginalArg(0) int arg0) {
		if (!this.method4272(arg0)) {
			return false;
		} else if (this.anObjectArray36[arg0] == null) {
			this.method4280(arg0);
			return this.anObjectArray36[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)Z")
	private boolean method4288() {
		if (this.aClass66_1 == null) {
			this.aClass66_1 = this.aClass176_1.method5858();
			if (this.aClass66_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass66_1.anInt2062][];
			this.anObjectArray36 = new Object[this.aClass66_1.anInt2062];
		}
		return true;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZZI)V")
	public void method4290(@OriginalArg(1) boolean arg0) {
		if (!this.method4288()) {
			return;
		}
		if (arg0) {
			this.aClass66_1.aClass205_1 = null;
			this.aClass66_1.anIntArray118 = null;
		}
		this.aClass66_1.anIntArrayArray11 = null;
		this.aClass66_1.aClass205Array1 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[II)[B")
	public byte[] method4291(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method4281(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg0] == null) {
			@Pc(32) boolean local32 = this.method4300(arg2, arg1, arg0);
			if (!local32) {
				this.method4280(arg2);
				local32 = this.method4300(arg2, arg1, arg0);
				if (!local32) {
					return null;
				}
			}
		}
		@Pc(59) byte[] local59 = Static257.method3911(false, this.anObjectArrayArray1[arg2][arg0]);
		if (this.anInt5309 == 1) {
			this.anObjectArrayArray1[arg2][arg0] = null;
			if (this.aClass66_1.anIntArray116[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt5309 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local59;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)I")
	public int method4292() {
		if (!this.method4288()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray36.length; local17++) {
			if (this.aClass66_1.anIntArray114[local17] > 0) {
				local13 += 100;
				local15 += this.method4297(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
	public void method4293() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IB)[I")
	public int[] method4294(@OriginalArg(0) int arg0) {
		if (!this.method4272(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass66_1.anIntArrayArray12[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass66_1.anIntArray114[arg0]];
			@Pc(36) int local36 = 0;
			while (local36 < local18.length) {
				local18[local36] = local36++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method4295(@OriginalArg(1) String arg0) {
		if (this.method4288()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass66_1.aClass205_1.method4703(Static335.method1095(local20));
			return local29 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(IB)Z")
	public boolean method4296(@OriginalArg(0) int arg0) {
		if (!this.method4288()) {
			return false;
		} else if (this.aClass66_1.anIntArray116.length == 1) {
			return this.method4298(arg0, 0);
		} else if (!this.method4272(arg0)) {
			return false;
		} else if (this.aClass66_1.anIntArray116[arg0] == 1) {
			return this.method4298(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(II)I")
	private int method4297(@OriginalArg(1) int arg0) {
		if (this.method4272(arg0)) {
			return this.anObjectArray36[arg0] == null ? this.aClass176_1.method5860(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)Z")
	public boolean method4298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method4281(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray36[arg1] == null) {
			this.method4280(arg1);
			return this.anObjectArray36[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)I")
	public int method4299() {
		return this.method4288() ? this.aClass66_1.anIntArray116.length : -1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[IIB)Z")
	private boolean method4300(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!this.method4272(arg0)) {
			return false;
		} else if (this.anObjectArray36[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass66_1.anIntArray114[arg0];
			@Pc(31) int[] local31 = this.aClass66_1.anIntArrayArray12[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass66_1.anIntArray116[arg0]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg0];
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
			@Pc(120) byte[] local120;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local120 = Static257.method3911(false, this.anObjectArray36[arg0]);
			} else {
				local120 = Static257.method3911(true, this.anObjectArray36[arg0]);
				@Pc(135) Class2_Sub20 local135 = new Class2_Sub20(local120);
				local135.method3718(local135.aByteArray136.length, arg1);
			}
			@Pc(147) byte[] local147;
			try {
				local147 = Static125.method1817(local120);
			} catch (@Pc(149) RuntimeException local149) {
				throw Static285.method4205(local149, "T3 - " + (arg1 != null) + "," + arg0 + "," + local120.length + "," + Static65.method6075(local120.length, local120) + "," + Static65.method6075(local120.length - 2, local120) + "," + this.aClass66_1.anIntArray115[arg0] + "," + this.aClass66_1.anInt2065);
			}
			if (this.aBoolean457) {
				this.anObjectArray36[arg0] = null;
			}
			@Pc(223) int local223;
			if (local25 <= 1) {
				if (local31 == null) {
					local223 = 0;
				} else {
					local223 = local31[0];
				}
				if (this.anInt5309 == 0) {
					local51[local223] = Static320.method6040(local147);
				} else {
					local51[local223] = local147;
				}
			} else {
				@Pc(264) int local264;
				@Pc(277) Class2_Sub20 local277;
				@Pc(281) int local281;
				@Pc(286) int local286;
				@Pc(290) int local290;
				@Pc(292) int local292;
				@Pc(304) int local304;
				@Pc(358) int local358;
				@Pc(360) int local360;
				if (this.anInt5309 == 2) {
					local223 = local147.length;
					local223--;
					local264 = local147[local223] & 0xFF;
					local223 -= local264 * 4 * local25;
					local277 = new Class2_Sub20(local147);
					@Pc(279) int local279 = 0;
					local281 = 0;
					local277.anInt4608 = local223;
					for (local286 = 0; local286 < local264; local286++) {
						local290 = 0;
						for (local292 = 0; local292 < local25; local292++) {
							local290 += local277.method3731();
							if (local31 == null) {
								local304 = local292;
							} else {
								local304 = local31[local292];
							}
							if (local304 == arg2) {
								local281 = local304;
								local279 += local290;
							}
						}
					}
					if (local279 == 0) {
						return true;
					}
					@Pc(345) byte[] local345 = new byte[local279];
					local279 = 0;
					local277.anInt4608 = local223;
					local292 = 0;
					for (local304 = 0; local304 < local264; local304++) {
						local358 = 0;
						for (local360 = 0; local360 < local25; local360++) {
							local358 += local277.method3731();
							@Pc(372) int local372;
							if (local31 == null) {
								local372 = local360;
							} else {
								local372 = local31[local360];
							}
							if (local372 == arg2) {
								Static459.method3348(local147, local292, local345, local279, local358);
								local279 += local358;
							}
							local292 += local358;
						}
					}
					local51[local281] = local345;
				} else {
					local223 = local147.length;
					local223--;
					local264 = local147[local223] & 0xFF;
					local223 -= local264 * 4 * local25;
					local277 = new Class2_Sub20(local147);
					@Pc(447) int[] local447 = new int[local25];
					local277.anInt4608 = local223;
					for (local281 = 0; local281 < local264; local281++) {
						local286 = 0;
						for (local290 = 0; local290 < local25; local290++) {
							local286 += local277.method3731();
							local447[local290] += local286;
						}
					}
					@Pc(488) byte[][] local488 = new byte[local25][];
					for (local290 = 0; local290 < local25; local290++) {
						local488[local290] = new byte[local447[local290]];
						local447[local290] = 0;
					}
					local277.anInt4608 = local223;
					local292 = 0;
					for (local304 = 0; local304 < local264; local304++) {
						local358 = 0;
						for (local360 = 0; local360 < local25; local360++) {
							local358 += local277.method3731();
							Static459.method3348(local147, local292, local488[local360], local447[local360], local358);
							local447[local360] += local358;
							local292 += local358;
						}
					}
					for (local358 = 0; local358 < local25; local358++) {
						if (local31 == null) {
							local360 = local358;
						} else {
							local360 = local31[local358];
						}
						if (this.anInt5309 == 0) {
							local51[local360] = Static320.method6040(local488[local358]);
						} else {
							local51[local360] = local488[local358];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)I")
	public int method4301() {
		if (!this.method4288()) {
			throw new IllegalStateException("");
		}
		return this.aClass66_1.anInt2065;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(ILjava/lang/String;)V")
	public void method4302(@OriginalArg(1) String arg0) {
		if (this.method4288()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass66_1.aClass205_1.method4703(Static335.method1095(local11));
			this.method4284(local20);
		}
	}

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "(II)V")
	public void method4303(@OriginalArg(0) int arg0) {
		if (this.method4272(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}
}
