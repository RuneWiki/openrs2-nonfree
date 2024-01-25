import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class250 {

	@OriginalMember(owner = "client!uu", name = "k", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray36;

	@OriginalMember(owner = "client!uu", name = "s", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!uu", name = "v", descriptor = "Lclient!km;")
	private Class132 aClass132_2 = null;

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "Lclient!nu;")
	private final Class101 aClass101_1;

	@OriginalMember(owner = "client!uu", name = "x", descriptor = "Z")
	private final boolean aBoolean486;

	@OriginalMember(owner = "client!uu", name = "p", descriptor = "I")
	public int anInt7168;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lclient!nu;ZI)V")
	public Class250(@OriginalArg(0) Class101 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass101_1 = arg0;
		this.aBoolean486 = arg1;
		this.anInt7168 = arg2;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method5790(@OriginalArg(0) String arg0) {
		if (this.method5816()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass132_2.aClass233_1.method5397(Static417.method5713(local12));
			return this.method5807(local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIB)Z")
	private boolean method5791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method5816()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass132_2.anIntArray232.length > arg1 && this.aClass132_2.anIntArray232[arg1] > arg0) {
			return true;
		} else if (Static13.aBoolean14) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZ)V")
	public void method5792(@OriginalArg(0) int arg0) {
		if (this.method5807(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)Z")
	public boolean method5793(@OriginalArg(1) int arg0) {
		if (!this.method5807(arg0)) {
			return false;
		} else if (this.anObjectArray36[arg0] == null) {
			this.method5797(arg0);
			return this.anObjectArray36[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
	public void method5794() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method5795(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5816()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass132_2.aClass233_1.method5397(Static417.method5713(local12));
		if (this.method5807(local24)) {
			@Pc(49) int local49 = this.aClass132_2.aClass233Array1[local24].method5397(Static417.method5713(local15));
			return this.method5806(local24, local49);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(III)Z")
	public boolean method5796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method5791(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray36[arg1] == null) {
			this.method5797(arg1);
			return this.anObjectArray36[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BI)V")
	private void method5797(@OriginalArg(1) int arg0) {
		if (this.aBoolean486) {
			this.anObjectArray36[arg0] = this.aClass101_1.method2457(arg0);
		} else {
			this.anObjectArray36[arg0] = Static350.method4879(this.aClass101_1.method2457(arg0));
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(II)I")
	private int method5798(@OriginalArg(0) int arg0) {
		if (this.method5807(arg0)) {
			return this.anObjectArray36[arg0] == null ? this.aClass101_1.method2458(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public void method5799(@OriginalArg(0) String arg0) {
		if (this.method5816()) {
			@Pc(14) String local14 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass132_2.aClass233_1.method5397(Static417.method5713(local14));
			this.method5809(local23);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
	public boolean method5800(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5816()) {
			return false;
		}
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass132_2.aClass233_1.method5397(Static417.method5713(local20));
		if (this.method5807(local32)) {
			@Pc(50) int local50 = this.aClass132_2.aClass233Array1[local32].method5397(Static417.method5713(local23));
			return this.method5796(local50, local32);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
	public void method5801() {
		if (this.anObjectArray36 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anObjectArray36.length; local15++) {
				this.anObjectArray36[local15] = null;
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(Ljava/lang/String;I)I")
	public int method5803(@OriginalArg(0) String arg0) {
		if (this.method5816()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(25) int local25 = this.aClass132_2.aClass233_1.method5397(Static417.method5713(local12));
			return this.method5798(local25);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZZ)V")
	public void method5804(@OriginalArg(2) boolean arg0) {
		if (!this.method5816()) {
			return;
		}
		if (arg0) {
			this.aClass132_2.aClass233_1 = null;
			this.aClass132_2.anIntArray235 = null;
		}
		this.aClass132_2.aClass233Array1 = null;
		this.aClass132_2.anIntArrayArray28 = null;
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)I")
	public int method5805() {
		if (!this.method5816()) {
			throw new IllegalStateException("");
		}
		return this.aClass132_2.anInt3723;
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(III)[B")
	public byte[] method5806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method5821(null, arg0, arg1);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZI)Z")
	private boolean method5807(@OriginalArg(1) int arg0) {
		if (!this.method5816()) {
			return false;
		} else if (arg0 >= 0 && this.aClass132_2.anIntArray232.length > arg0 && this.aClass132_2.anIntArray232[arg0] != 0) {
			return true;
		} else if (Static13.aBoolean14) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)I")
	public int method5808() {
		if (!this.method5816()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anObjectArray36.length; local25++) {
			if (this.aClass132_2.anIntArray234[local25] > 0) {
				local13 += 100;
				local23 += this.method5798(local25);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local23 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(ZI)V")
	private void method5809(@OriginalArg(1) int arg0) {
		this.aClass101_1.method2454(arg0);
	}

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5810(@OriginalArg(0) String arg0) {
		if (this.method5816()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass132_2.aClass233_1.method5397(Static417.method5713(local12));
			return this.method5793(local28);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5811(@OriginalArg(1) String arg0) {
		if (this.method5816()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass132_2.aClass233_1.method5397(Static417.method5713(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I[III)Z")
	private boolean method5812(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!this.method5807(arg0)) {
			return false;
		} else if (this.anObjectArray36[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass132_2.anIntArray234[arg0];
			@Pc(31) int[] local31 = this.aClass132_2.anIntArrayArray29[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass132_2.anIntArray232[arg0]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg0];
			@Pc(53) boolean local53 = true;
			for (@Pc(63) int local63 = 0; local63 < local25; local63++) {
				@Pc(71) int local71;
				if (local31 == null) {
					local71 = local63;
				} else {
					local71 = local31[local63];
				}
				if (local51[local71] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(130) byte[] local130;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local130 = Static237.method3446(this.anObjectArray36[arg0], false);
			} else {
				local130 = Static237.method3446(this.anObjectArray36[arg0], true);
				@Pc(145) Class3_Sub25 local145 = new Class3_Sub25(local130);
				local145.method4069(arg1, local145.aByteArray88.length);
			}
			@Pc(157) byte[] local157;
			try {
				local157 = Static201.method3087(local130);
			} catch (@Pc(159) RuntimeException local159) {
				throw Static331.method5952(local159, "T3 - " + (arg1 != null) + "," + arg0 + "," + local130.length + "," + Static108.method1799(local130.length, local130) + "," + Static108.method1799(local130.length - 2, local130) + "," + this.aClass132_2.anIntArray233[arg0] + "," + this.aClass132_2.anInt3723);
			}
			if (this.aBoolean486) {
				this.anObjectArray36[arg0] = null;
			}
			@Pc(232) int local232;
			if (local25 > 1) {
				@Pc(239) int local239;
				@Pc(252) Class3_Sub25 local252;
				@Pc(260) int local260;
				@Pc(264) int local264;
				@Pc(266) int local266;
				@Pc(316) int local316;
				@Pc(318) int local318;
				@Pc(322) int local322;
				@Pc(324) int local324;
				if (this.anInt7168 == 2) {
					local232 = local157.length;
					local232--;
					local239 = local157[local232] & 0xFF;
					local232 -= local239 * local25 * 4;
					local252 = new Class3_Sub25(local157);
					@Pc(437) int local437 = 0;
					local260 = 0;
					local252.anInt4974 = local232;
					for (local264 = 0; local264 < local239; local264++) {
						local266 = 0;
						for (local316 = 0; local316 < local25; local316++) {
							local266 += local252.method4108();
							if (local31 == null) {
								local318 = local316;
							} else {
								local318 = local31[local316];
							}
							if (arg2 == local318) {
								local260 = local318;
								local437 += local266;
							}
						}
					}
					if (local437 == 0) {
						return true;
					}
					@Pc(500) byte[] local500 = new byte[local437];
					local252.anInt4974 = local232;
					local437 = 0;
					local316 = 0;
					for (local318 = 0; local318 < local239; local318++) {
						local322 = 0;
						for (local324 = 0; local324 < local25; local324++) {
							local322 += local252.method4108();
							@Pc(529) int local529;
							if (local31 == null) {
								local529 = local324;
							} else {
								local529 = local31[local324];
							}
							if (local529 == arg2) {
								Static466.method205(local157, local316, local500, local437, local322);
								local437 += local322;
							}
							local316 += local322;
						}
					}
					local51[local260] = local500;
				} else {
					local232 = local157.length;
					@Pc(235) int local235 = local232 - 1;
					local239 = local157[local235] & 0xFF;
					@Pc(247) int local247 = local235 - local25 * local239 * 4;
					local252 = new Class3_Sub25(local157);
					local252.anInt4974 = local247;
					@Pc(258) int[] local258 = new int[local25];
					for (local260 = 0; local260 < local239; local260++) {
						local264 = 0;
						for (local266 = 0; local266 < local25; local266++) {
							local264 += local252.method4108();
							local258[local266] += local264;
						}
					}
					@Pc(292) byte[][] local292 = new byte[local25][];
					for (local266 = 0; local266 < local25; local266++) {
						local292[local266] = new byte[local258[local266]];
						local258[local266] = 0;
					}
					local252.anInt4974 = local247;
					local316 = 0;
					for (local318 = 0; local318 < local239; local318++) {
						local322 = 0;
						for (local324 = 0; local324 < local25; local324++) {
							local322 += local252.method4108();
							Static466.method205(local157, local316, local292[local324], local258[local324], local322);
							local316 += local322;
							local258[local324] += local322;
						}
					}
					for (local322 = 0; local322 < local25; local322++) {
						if (local31 == null) {
							local324 = local322;
						} else {
							local324 = local31[local322];
						}
						if (this.anInt7168 == 0) {
							local51[local324] = Static350.method4879(local292[local322]);
						} else {
							local51[local324] = local292[local322];
						}
					}
				}
			} else {
				if (local31 == null) {
					local232 = 0;
				} else {
					local232 = local31[0];
				}
				if (this.anInt7168 == 0) {
					local51[local232] = Static350.method4879(local157);
				} else {
					local51[local232] = local157;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(II)Z")
	public boolean method5813(@OriginalArg(0) int arg0) {
		if (!this.method5816()) {
			return false;
		} else if (this.aClass132_2.anIntArray232.length == 1) {
			return this.method5796(arg0, 0);
		} else if (!this.method5807(arg0)) {
			return false;
		} else if (this.aClass132_2.anIntArray232[arg0] == 1) {
			return this.method5796(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "(II)[B")
	public byte[] method5814(@OriginalArg(0) int arg0) {
		if (!this.method5816()) {
			return null;
		} else if (this.aClass132_2.anIntArray232.length == 1) {
			return this.method5806(0, arg0);
		} else if (!this.method5807(arg0)) {
			return null;
		} else if (this.aClass132_2.anIntArray232[arg0] == 1) {
			return this.method5806(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(ZI)I")
	public int method5815(@OriginalArg(1) int arg0) {
		return this.method5807(arg0) ? this.aClass132_2.anIntArray232[arg0] : 0;
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)Z")
	private boolean method5816() {
		if (this.aClass132_2 == null) {
			this.aClass132_2 = this.aClass101_1.method2455();
			if (this.aClass132_2 == null) {
				return false;
			}
			this.anObjectArray36 = new Object[this.aClass132_2.anInt3727];
			this.anObjectArrayArray1 = new Object[this.aClass132_2.anInt3727][];
		}
		return true;
	}

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "(II)I")
	public int method5817(@OriginalArg(0) int arg0) {
		if (this.method5816()) {
			@Pc(21) int local21 = this.aClass132_2.aClass233_1.method5397(arg0);
			return this.method5807(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!uu", name = "f", descriptor = "(II)[I")
	public int[] method5818(@OriginalArg(0) int arg0) {
		if (!this.method5807(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass132_2.anIntArrayArray29[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass132_2.anIntArray234[arg0]];
			@Pc(29) int local29 = 0;
			while (local29 < local18.length) {
				local18[local29] = local29++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "(I)I")
	public int method5819() {
		return this.method5816() ? this.aClass132_2.anIntArray232.length : -1;
	}

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "(I)Z")
	public boolean method5820() {
		if (!this.method5816()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(20) int local20 = 0; local20 < this.aClass132_2.anIntArray236.length; local20++) {
			@Pc(28) int local28 = this.aClass132_2.anIntArray236[local20];
			if (this.anObjectArray36[local28] == null) {
				this.method5797(local28);
				if (this.anObjectArray36[local28] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "([IIII)[B")
	public byte[] method5821(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method5791(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg2] == null) {
			@Pc(30) boolean local30 = this.method5812(arg1, arg0, arg2);
			if (!local30) {
				this.method5797(arg1);
				local30 = this.method5812(arg1, arg0, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(65) byte[] local65 = Static237.method3446(this.anObjectArrayArray1[arg1][arg2], false);
		if (this.anInt7168 == 1) {
			this.anObjectArrayArray1[arg1][arg2] = null;
			if (this.aClass132_2.anIntArray232[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt7168 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local65;
	}
}
