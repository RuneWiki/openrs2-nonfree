import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class104 {

	@OriginalMember(owner = "client!iq", name = "r", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray33;

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!iq", name = "O", descriptor = "Lclient!at;")
	private Class16 aClass16_1 = null;

	@OriginalMember(owner = "client!iq", name = "C", descriptor = "Z")
	private final boolean aBoolean282;

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "Lclient!rr;")
	private final Class138 aClass138_1;

	@OriginalMember(owner = "client!iq", name = "E", descriptor = "I")
	public int anInt3077;

	static {
		new Class140("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!rr;ZI)V")
	public Class104(@OriginalArg(0) Class138 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean282 = arg1;
		this.aClass138_1 = arg0;
		this.anInt3077 = arg2;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I[III)[B")
	public byte[] method2741(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!this.method2767(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(30) boolean local30 = this.method2766(arg2, arg1, arg0);
			if (!local30) {
				this.method2764(arg0);
				local30 = this.method2766(arg2, arg1, arg0);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(62) byte[] local62 = Static46.method883(false, this.anObjectArrayArray1[arg0][arg2]);
		if (this.anInt3077 == 1) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass16_1.anIntArray38[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt3077 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local62;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)Z")
	private boolean method2742() {
		if (this.aClass16_1 == null) {
			this.aClass16_1 = this.aClass138_1.method4068();
			if (this.aClass16_1 == null) {
				return false;
			}
			this.anObjectArray33 = new Object[this.aClass16_1.anInt309];
			this.anObjectArrayArray1 = new Object[this.aClass16_1.anInt309][];
		}
		return true;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method2743(@OriginalArg(0) String arg0) {
		if (this.method2742()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass16_1.aClass44_1.method943(Static314.method5216(local12));
			return this.method2750(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IB)I")
	public int method2744(@OriginalArg(0) int arg0) {
		if (this.method2742()) {
			@Pc(23) int local23 = this.aClass16_1.aClass44_1.method943(arg0);
			return this.method2770(local23) ? local23 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(IB)I")
	public int method2745(@OriginalArg(0) int arg0) {
		return this.method2770(arg0) ? this.aClass16_1.anIntArray38[arg0] : 0;
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(IB)Z")
	public boolean method2746(@OriginalArg(0) int arg0) {
		if (!this.method2770(arg0)) {
			return false;
		} else if (this.anObjectArray33[arg0] == null) {
			this.method2764(arg0);
			return this.anObjectArray33[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)I")
	public int method2747() {
		if (!this.method2742()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray33.length; local17++) {
			if (this.aClass16_1.anIntArray34[local17] > 0) {
				local13 += 100;
				local15 += this.method2750(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method2748(@OriginalArg(1) String arg0) {
		if (this.method2742()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass16_1.aClass44_1.method943(Static314.method5216(local12));
			return local26 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)V")
	public void method2749(@OriginalArg(0) int arg0) {
		if (this.method2770(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(II)I")
	private int method2750(@OriginalArg(0) int arg0) {
		if (this.method2770(arg0)) {
			return this.anObjectArray33[arg0] == null ? this.aClass138_1.method4067(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)V")
	public void method2751() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anObjectArrayArray1.length; local18++) {
				this.anObjectArrayArray1[local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(II)V")
	private void method2752(@OriginalArg(1) int arg0) {
		this.aClass138_1.method4064(arg0);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method2753(@OriginalArg(1) String arg0) {
		if (this.method2742()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass16_1.aClass44_1.method943(Static314.method5216(local12));
			return this.method2746(local21);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZZB)V")
	public void method2754(@OriginalArg(0) boolean arg0) {
		if (!this.method2742()) {
			return;
		}
		this.aClass16_1.aClass44Array1 = null;
		this.aClass16_1.anIntArrayArray6 = null;
		if (arg0) {
			this.aClass16_1.aClass44_1 = null;
			this.aClass16_1.anIntArray35 = null;
		}
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(II)Z")
	public boolean method2755(@OriginalArg(1) int arg0) {
		if (!this.method2742()) {
			return false;
		} else if (this.aClass16_1.anIntArray38.length == 1) {
			return this.method2772(0, arg0);
		} else if (!this.method2770(arg0)) {
			return false;
		} else if (this.aClass16_1.anIntArray38[arg0] == 1) {
			return this.method2772(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)[B")
	public byte[] method2756(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method2741(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)I")
	public int method2757() {
		return this.method2742() ? this.aClass16_1.anIntArray38.length : -1;
	}

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "(II)[B")
	public byte[] method2758(@OriginalArg(0) int arg0) {
		if (!this.method2742()) {
			return null;
		} else if (this.aClass16_1.anIntArray38.length == 1) {
			return this.method2756(0, arg0);
		} else if (!this.method2770(arg0)) {
			return null;
		} else if (this.aClass16_1.anIntArray38[arg0] == 1) {
			return this.method2756(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method2760(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2742()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(26) int local26 = this.aClass16_1.aClass44_1.method943(Static314.method5216(local12));
		if (this.method2770(local26)) {
			@Pc(44) int local44 = this.aClass16_1.aClass44Array1[local26].method943(Static314.method5216(local15));
			return this.method2756(local26, local44);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)Z")
	public boolean method2761() {
		if (!this.method2742()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass16_1.anIntArray33.length; local15++) {
			@Pc(23) int local23 = this.aClass16_1.anIntArray33[local15];
			if (this.anObjectArray33[local23] == null) {
				this.method2764(local23);
				if (this.anObjectArray33[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method2762(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2742()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass16_1.aClass44_1.method943(Static314.method5216(local12));
		if (this.method2770(local24)) {
			@Pc(44) int local44 = this.aClass16_1.aClass44Array1[local24].method943(Static314.method5216(local15));
			return this.method2772(local24, local44);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "(II)[I")
	public int[] method2763(@OriginalArg(1) int arg0) {
		if (!this.method2770(arg0)) {
			return null;
		}
		@Pc(26) int[] local26 = this.aClass16_1.anIntArrayArray5[arg0];
		if (local26 == null) {
			local26 = new int[this.aClass16_1.anIntArray34[arg0]];
			@Pc(37) int local37 = 0;
			while (local37 < local26.length) {
				local26[local37] = local37++;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BI)V")
	private void method2764(@OriginalArg(1) int arg0) {
		if (this.aBoolean282) {
			this.anObjectArray33[arg0] = this.aClass138_1.method4065(arg0);
		} else {
			this.anObjectArray33[arg0] = Static105.method2073(this.aClass138_1.method4065(arg0));
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(ILjava/lang/String;)V")
	public void method2765(@OriginalArg(1) String arg0) {
		if (this.method2742()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass16_1.aClass44_1.method943(Static314.method5216(local11));
			this.method2752(local22);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IB[II)Z")
	private boolean method2766(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method2770(arg2)) {
			return false;
		} else if (this.anObjectArray33[arg2] == null) {
			return false;
		} else {
			@Pc(27) int local27 = this.aClass16_1.anIntArray34[arg2];
			@Pc(38) int[] local38 = this.aClass16_1.anIntArrayArray5[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass16_1.anIntArray38[arg2]];
			}
			@Pc(58) Object[] local58 = this.anObjectArrayArray1[arg2];
			@Pc(60) boolean local60 = true;
			for (@Pc(62) int local62 = 0; local62 < local27; local62++) {
				@Pc(68) int local68;
				if (local38 == null) {
					local68 = local62;
				} else {
					local68 = local38[local62];
				}
				if (local58[local68] == null) {
					local60 = false;
					break;
				}
			}
			if (local60) {
				return true;
			}
			@Pc(129) byte[] local129;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local129 = Static46.method883(false, this.anObjectArray33[arg2]);
			} else {
				local129 = Static46.method883(true, this.anObjectArray33[arg2]);
				@Pc(144) Class2_Sub12 local144 = new Class2_Sub12(local129);
				local144.method3144(local144.aByteArray30.length, arg1);
			}
			@Pc(156) byte[] local156;
			try {
				local156 = Static331.method5389(local129);
			} catch (@Pc(158) RuntimeException local158) {
				throw Static153.method3173(local158, "T3 - " + (arg1 != null) + "," + arg2 + "," + local129.length + "," + Static8.method146(local129.length, local129) + "," + Static8.method146(local129.length - 2, local129) + "," + this.aClass16_1.anIntArray37[arg2] + "," + this.aClass16_1.anInt308);
			}
			if (this.aBoolean282) {
				this.anObjectArray33[arg2] = null;
			}
			@Pc(233) int local233;
			if (local27 > 1) {
				@Pc(240) int local240;
				@Pc(253) Class2_Sub12 local253;
				@Pc(261) int local261;
				@Pc(265) int local265;
				@Pc(267) int local267;
				@Pc(321) int local321;
				@Pc(323) int local323;
				@Pc(327) int local327;
				@Pc(329) int local329;
				if (this.anInt3077 == 2) {
					local233 = local156.length;
					local233--;
					local240 = local156[local233] & 0xFF;
					local233 -= local27 * local240 * 4;
					local253 = new Class2_Sub12(local156);
					@Pc(438) int local438 = 0;
					local261 = 0;
					local253.anInt3606 = local233;
					for (local265 = 0; local265 < local240; local265++) {
						local267 = 0;
						for (local321 = 0; local321 < local27; local321++) {
							local267 += local253.method3135();
							if (local38 == null) {
								local323 = local321;
							} else {
								local323 = local38[local321];
							}
							if (local323 == arg0) {
								local438 += local267;
								local261 = local323;
							}
						}
					}
					if (local438 == 0) {
						return true;
					}
					@Pc(501) byte[] local501 = new byte[local438];
					local438 = 0;
					local253.anInt3606 = local233;
					local321 = 0;
					for (local323 = 0; local323 < local240; local323++) {
						local327 = 0;
						for (local329 = 0; local329 < local27; local329++) {
							local327 += local253.method3135();
							@Pc(528) int local528;
							if (local38 == null) {
								local528 = local329;
							} else {
								local528 = local38[local329];
							}
							if (arg0 == local528) {
								Static369.method2582(local156, local321, local501, local438, local327);
								local438 += local327;
							}
							local321 += local327;
						}
					}
					local58[local261] = local501;
				} else {
					local233 = local156.length;
					@Pc(236) int local236 = local233 - 1;
					local240 = local156[local236] & 0xFF;
					@Pc(248) int local248 = local236 - local27 * 4 * local240;
					local253 = new Class2_Sub12(local156);
					@Pc(256) int[] local256 = new int[local27];
					local253.anInt3606 = local248;
					for (local261 = 0; local261 < local240; local261++) {
						local265 = 0;
						for (local267 = 0; local267 < local27; local267++) {
							local265 += local253.method3135();
							local256[local267] += local265;
						}
					}
					@Pc(297) byte[][] local297 = new byte[local27][];
					for (local267 = 0; local267 < local27; local267++) {
						local297[local267] = new byte[local256[local267]];
						local256[local267] = 0;
					}
					local253.anInt3606 = local248;
					local321 = 0;
					for (local323 = 0; local323 < local240; local323++) {
						local327 = 0;
						for (local329 = 0; local329 < local27; local329++) {
							local327 += local253.method3135();
							Static369.method2582(local156, local321, local297[local329], local256[local329], local327);
							local321 += local327;
							local256[local329] += local327;
						}
					}
					for (local327 = 0; local327 < local27; local327++) {
						if (local38 == null) {
							local329 = local327;
						} else {
							local329 = local38[local327];
						}
						if (this.anInt3077 == 0) {
							local58[local329] = Static105.method2073(local297[local327]);
						} else {
							local58[local329] = local297[local327];
						}
					}
				}
			} else {
				if (local38 == null) {
					local233 = 0;
				} else {
					local233 = local38[0];
				}
				if (this.anInt3077 == 0) {
					local58[local233] = Static105.method2073(local156);
				} else {
					local58[local233] = local156;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBI)Z")
	private boolean method2767(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2742()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass16_1.anIntArray38.length && arg1 < this.aClass16_1.anIntArray38[arg0]) {
			return true;
		} else if (Static60.aBoolean110) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "(I)I")
	public int method2768() {
		if (!this.method2742()) {
			throw new IllegalStateException("");
		}
		return this.aClass16_1.anInt308;
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(ILjava/lang/String;)I")
	public int method2769(@OriginalArg(1) String arg0) {
		if (this.method2742()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass16_1.aClass44_1.method943(Static314.method5216(local12));
			return this.method2770(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "(II)Z")
	private boolean method2770(@OriginalArg(1) int arg0) {
		if (!this.method2742()) {
			return false;
		} else if (arg0 >= 0 && this.aClass16_1.anIntArray38.length > arg0 && this.aClass16_1.anIntArray38[arg0] != 0) {
			return true;
		} else if (Static60.aBoolean110) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)V")
	public void method2771() {
		if (this.anObjectArray33 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anObjectArray33.length; local18++) {
				this.anObjectArray33[local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(III)Z")
	public boolean method2772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method2767(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray33[arg0] == null) {
			this.method2764(arg0);
			return this.anObjectArray33[arg0] != null;
		} else {
			return true;
		}
	}
}
