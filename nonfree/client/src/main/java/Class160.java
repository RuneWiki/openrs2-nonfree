import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class160 {

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray34;

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "Lclient!qn;")
	private Class207 aClass207_2 = null;

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "Z")
	private final boolean aBoolean331;

	@OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
	public int anInt4623;

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "Lclient!rg;")
	private final Class94 aClass94_1;

	static {
		new Class209("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!rg;ZI)V")
	public Class160(@OriginalArg(0) Class94 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean331 = arg1;
		this.anInt4623 = arg2;
		this.aClass94_1 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
	public void method3695() {
		if (this.anObjectArray34 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArray34.length; local10++) {
				this.anObjectArray34[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)[B")
	public byte[] method3696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method3701(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V")
	private void method3697(@OriginalArg(1) int arg0) {
		if (this.aBoolean331) {
			this.anObjectArray34[arg0] = this.aClass94_1.method2178(arg0);
		} else {
			this.anObjectArray34[arg0] = Static172.method2803(this.aClass94_1.method2178(arg0));
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(III)Z")
	public boolean method3698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3713(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method3697(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "([IIII)Z")
	private boolean method3699(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method3708(arg2)) {
			return false;
		} else if (this.anObjectArray34[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass207_2.anIntArray472[arg2];
			@Pc(31) int[] local31 = this.aClass207_2.anIntArrayArray55[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass207_2.anIntArray468[arg2]];
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
			@Pc(118) byte[] local118;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local118 = Static248.method3789(this.anObjectArray34[arg2], false);
			} else {
				local118 = Static248.method3789(this.anObjectArray34[arg2], true);
				@Pc(123) Class2_Sub23 local123 = new Class2_Sub23(local118);
				local123.method5488(arg0, local123.aByteArray130.length);
			}
			@Pc(145) byte[] local145;
			try {
				local145 = Static309.method4376(local118);
			} catch (@Pc(147) RuntimeException local147) {
				throw Static214.method3371(local147, "T3 - " + (arg0 != null) + "," + arg2 + "," + local118.length + "," + Static150.method3424(local118, local118.length) + "," + Static150.method3424(local118, local118.length - 2) + "," + this.aClass207_2.anIntArray470[arg2] + "," + this.aClass207_2.anInt5652);
			}
			if (this.aBoolean331) {
				this.anObjectArray34[arg2] = null;
			}
			@Pc(232) int local232;
			if (local25 > 1) {
				@Pc(239) int local239;
				@Pc(252) Class2_Sub23 local252;
				@Pc(256) int local256;
				@Pc(261) int local261;
				@Pc(265) int local265;
				@Pc(267) int local267;
				@Pc(279) int local279;
				@Pc(329) int local329;
				@Pc(331) int local331;
				if (this.anInt4623 == 2) {
					local232 = local145.length;
					@Pc(234) int local234 = local232 - 1;
					local239 = local145[local234] & 0xFF;
					@Pc(247) int local247 = local234 - local25 * local239 * 4;
					local252 = new Class2_Sub23(local145);
					@Pc(254) int local254 = 0;
					local256 = 0;
					local252.anInt6952 = local247;
					for (local261 = 0; local261 < local239; local261++) {
						local265 = 0;
						for (local267 = 0; local267 < local25; local267++) {
							local265 += local252.method5508();
							if (local31 == null) {
								local279 = local267;
							} else {
								local279 = local31[local267];
							}
							if (local279 == arg1) {
								local256 = local279;
								local254 += local265;
							}
						}
					}
					if (local254 == 0) {
						return true;
					}
					@Pc(316) byte[] local316 = new byte[local254];
					local252.anInt6952 = local247;
					local254 = 0;
					local267 = 0;
					for (local279 = 0; local279 < local239; local279++) {
						local329 = 0;
						for (local331 = 0; local331 < local25; local331++) {
							local329 += local252.method5508();
							@Pc(345) int local345;
							if (local31 == null) {
								local345 = local331;
							} else {
								local345 = local31[local331];
							}
							if (arg1 == local345) {
								Static457.method683(local145, local267, local316, local254, local329);
								local254 += local329;
							}
							local267 += local329;
						}
					}
					local51[local256] = local316;
				} else {
					local232 = local145.length;
					local232--;
					local239 = local145[local232] & 0xFF;
					local232 -= local25 * 4 * local239;
					local252 = new Class2_Sub23(local145);
					local252.anInt6952 = local232;
					@Pc(413) int[] local413 = new int[local25];
					for (local256 = 0; local256 < local239; local256++) {
						local261 = 0;
						for (local265 = 0; local265 < local25; local265++) {
							local261 += local252.method5508();
							local413[local265] += local261;
						}
					}
					@Pc(451) byte[][] local451 = new byte[local25][];
					for (local265 = 0; local265 < local25; local265++) {
						local451[local265] = new byte[local413[local265]];
						local413[local265] = 0;
					}
					local252.anInt6952 = local232;
					local267 = 0;
					for (local279 = 0; local279 < local239; local279++) {
						local329 = 0;
						for (local331 = 0; local331 < local25; local331++) {
							local329 += local252.method5508();
							Static457.method683(local145, local267, local451[local331], local413[local331], local329);
							local413[local331] += local329;
							local267 += local329;
						}
					}
					for (local329 = 0; local329 < local25; local329++) {
						if (local31 == null) {
							local331 = local329;
						} else {
							local331 = local31[local329];
						}
						if (this.anInt4623 == 0) {
							local51[local331] = Static172.method2803(local451[local329]);
						} else {
							local51[local331] = local451[local329];
						}
					}
				}
			} else {
				if (local31 == null) {
					local232 = 0;
				} else {
					local232 = local31[0];
				}
				if (this.anInt4623 == 0) {
					local51[local232] = Static172.method2803(local145);
				} else {
					local51[local232] = local145;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)I")
	public int method3700() {
		if (!this.method3710()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray34.length; local17++) {
			if (this.aClass207_2.anIntArray472[local17] > 0) {
				local13 += 100;
				local15 += this.method3720(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II[II)[B")
	public byte[] method3701(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method3713(arg2, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg0] == null) {
			@Pc(30) boolean local30 = this.method3699(arg1, arg0, arg2);
			if (!local30) {
				this.method3697(arg2);
				local30 = this.method3699(arg1, arg0, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(59) byte[] local59 = Static248.method3789(this.anObjectArrayArray1[arg2][arg0], false);
		if (this.anInt4623 == 1) {
			this.anObjectArrayArray1[arg2][arg0] = null;
			if (this.aClass207_2.anIntArray468[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt4623 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local59;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZ)I")
	public int method3702(@OriginalArg(0) int arg0) {
		if (this.method3710()) {
			@Pc(21) int local21 = this.aClass207_2.aClass228_1.method4996(arg0);
			return this.method3708(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	public boolean method3703(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3710()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass207_2.aClass228_1.method4996(Static386.method5103(local12));
		if (this.method3708(local24)) {
			@Pc(42) int local42 = this.aClass207_2.aClass228Array1[local24].method4996(Static386.method5103(local15));
			return this.method3698(local24, local42);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method3704(@OriginalArg(1) String arg0) {
		if (this.method3710()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass207_2.aClass228_1.method4996(Static386.method5103(local20));
			return this.method3708(local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method3705(@OriginalArg(1) String arg0) {
		if (this.method3710()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass207_2.aClass228_1.method4996(Static386.method5103(local12));
			return this.method3720(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Z")
	public boolean method3706() {
		if (!this.method3710()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(23) int local23 = 0; local23 < this.aClass207_2.anIntArray473.length; local23++) {
			@Pc(31) int local31 = this.aClass207_2.anIntArray473[local23];
			if (this.anObjectArray34[local31] == null) {
				this.method3697(local31);
				if (this.anObjectArray34[local31] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)I")
	public int method3707() {
		if (!this.method3710()) {
			throw new IllegalStateException("");
		}
		return this.aClass207_2.anInt5652;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)Z")
	private boolean method3708(@OriginalArg(0) int arg0) {
		if (!this.method3710()) {
			return false;
		} else if (arg0 >= 0 && this.aClass207_2.anIntArray468.length > arg0 && this.aClass207_2.anIntArray468[arg0] != 0) {
			return true;
		} else if (Static57.aBoolean76) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method3709(@OriginalArg(1) String arg0) {
		if (this.method3710()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass207_2.aClass228_1.method4996(Static386.method5103(local19));
			return this.method3719(local28);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)Z")
	private boolean method3710() {
		if (this.aClass207_2 == null) {
			this.aClass207_2 = this.aClass94_1.method2180();
			if (this.aClass207_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass207_2.anInt5649][];
			this.anObjectArray34 = new Object[this.aClass207_2.anInt5649];
		}
		return true;
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)[B")
	public byte[] method3711(@OriginalArg(0) int arg0) {
		if (!this.method3710()) {
			return null;
		} else if (this.aClass207_2.anIntArray468.length == 1) {
			return this.method3696(arg0, 0);
		} else if (!this.method3708(arg0)) {
			return null;
		} else if (this.aClass207_2.anIntArray468[arg0] == 1) {
			return this.method3696(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method3712(@OriginalArg(1) String arg0) {
		if (this.method3710()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass207_2.aClass228_1.method4996(Static386.method5103(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(III)Z")
	private boolean method3713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3710()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass207_2.anIntArray468.length && arg1 < this.aClass207_2.anIntArray468[arg0]) {
			return true;
		} else if (Static57.aBoolean76) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(II)V")
	private void method3714(@OriginalArg(1) int arg0) {
		this.aClass94_1.method2176(arg0);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)I")
	public int method3715() {
		return this.method3710() ? this.aClass207_2.anIntArray468.length : -1;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)Z")
	public boolean method3716(@OriginalArg(0) int arg0) {
		if (!this.method3710()) {
			return false;
		} else if (this.aClass207_2.anIntArray468.length == 1) {
			return this.method3698(0, arg0);
		} else if (!this.method3708(arg0)) {
			return false;
		} else if (this.aClass207_2.anIntArray468[arg0] == 1) {
			return this.method3698(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
	public void method3717() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZZB)V")
	public void method3718(@OriginalArg(1) boolean arg0) {
		if (!this.method3710()) {
			return;
		}
		this.aClass207_2.aClass228Array1 = null;
		this.aClass207_2.anIntArrayArray56 = null;
		if (arg0) {
			this.aClass207_2.aClass228_1 = null;
			this.aClass207_2.anIntArray471 = null;
		}
	}

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "(II)Z")
	public boolean method3719(@OriginalArg(0) int arg0) {
		if (!this.method3708(arg0)) {
			return false;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method3697(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "(II)I")
	private int method3720(@OriginalArg(0) int arg0) {
		if (this.method3708(arg0)) {
			return this.anObjectArray34[arg0] == null ? this.aClass94_1.method2179(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method3721(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method3710()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass207_2.aClass228_1.method4996(Static386.method5103(local12));
		if (this.method3708(local32)) {
			@Pc(50) int local50 = this.aClass207_2.aClass228Array1[local32].method4996(Static386.method5103(local23));
			return this.method3696(local50, local32);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "(II)I")
	public int method3722(@OriginalArg(0) int arg0) {
		return this.method3708(arg0) ? this.aClass207_2.anIntArray468[arg0] : 0;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(IB)[I")
	public int[] method3723(@OriginalArg(0) int arg0) {
		if (!this.method3708(arg0)) {
			return null;
		}
		@Pc(26) int[] local26 = this.aClass207_2.anIntArrayArray55[arg0];
		if (local26 == null) {
			local26 = new int[this.aClass207_2.anIntArray472[arg0]];
			@Pc(37) int local37 = 0;
			while (local37 < local26.length) {
				local26[local37] = local37++;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "(II)V")
	public void method3724(@OriginalArg(1) int arg0) {
		if (this.method3708(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public void method3725(@OriginalArg(0) String arg0) {
		if (this.method3710()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass207_2.aClass228_1.method4996(Static386.method5103(local11));
			this.method3714(local28);
		}
	}
}
