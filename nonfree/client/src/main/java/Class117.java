import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class117 {

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray4;

	@OriginalMember(owner = "client!gp", name = "v", descriptor = "Lclient!tn;")
	private Class284 aClass284_2 = null;

	@OriginalMember(owner = "client!gp", name = "t", descriptor = "I")
	public int anInt3362;

	@OriginalMember(owner = "client!gp", name = "s", descriptor = "Z")
	private final boolean aBoolean214;

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "Lclient!ee;")
	private final Class79 aClass79_1;

	static {
		new Class40("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!ee;ZI)V")
	public Class117(@OriginalArg(0) Class79 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt3362 = arg2;
		this.aBoolean214 = arg1;
		this.aClass79_1 = arg0;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)V")
	public void method2948(@OriginalArg(1) int arg0) {
		if (this.method2971(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)I")
	public int method2950() {
		if (!this.method2954()) {
			throw new IllegalStateException("");
		}
		return this.aClass284_2.anInt8222;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IZ)I")
	public int method2951(@OriginalArg(0) int arg0) {
		return this.method2971(arg0) ? this.aClass284_2.anIntArray640[arg0] : 0;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Z)V")
	public void method2952() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anObjectArrayArray1.length; local18++) {
				this.anObjectArrayArray1[local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IB)I")
	private int method2953(@OriginalArg(0) int arg0) {
		if (this.method2971(arg0)) {
			return this.anObjectArray4[arg0] == null ? this.aClass79_1.method2213(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)Z")
	private boolean method2954() {
		if (this.aClass284_2 == null) {
			this.aClass284_2 = this.aClass79_1.method2216();
			if (this.aClass284_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass284_2.anInt8224][];
			this.anObjectArray4 = new Object[this.aClass284_2.anInt8224];
		}
		return true;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method2955(@OriginalArg(1) String arg0) {
		if (this.method2954()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass284_2.aClass183_1.method4504(Static237.method4068(local18));
			return this.method2979(local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method2956(@OriginalArg(0) String arg0) {
		if (this.method2954()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass284_2.aClass183_1.method4504(Static237.method4068(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BI)V")
	private void method2957(@OriginalArg(1) int arg0) {
		this.aClass79_1.method2218(arg0);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)I")
	public int method2958() {
		if (!this.method2954()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < this.anObjectArray4.length; local25++) {
			if (this.aClass284_2.anIntArray641[local25] > 0) {
				local13 += 100;
				local23 += this.method2953(local25);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local23 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method2960(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2954()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(29) int local29 = this.aClass284_2.aClass183_1.method4504(Static237.method4068(local12));
		if (this.method2971(local29)) {
			@Pc(47) int local47 = this.aClass284_2.aClass183Array1[local29].method4504(Static237.method4068(local20));
			return this.method2974(local47, local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZZI)V")
	public void method2961(@OriginalArg(0) boolean arg0) {
		if (!this.method2954()) {
			return;
		}
		this.aClass284_2.aClass183Array1 = null;
		this.aClass284_2.anIntArrayArray69 = null;
		if (arg0) {
			this.aClass284_2.aClass183_1 = null;
			this.aClass284_2.anIntArray639 = null;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IBI)[B")
	public byte[] method2962(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method2970(null, arg0, arg1);
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(II)[I")
	public int[] method2963(@OriginalArg(1) int arg0) {
		if (!this.method2971(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass284_2.anIntArrayArray70[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass284_2.anIntArray641[arg0]];
			@Pc(37) int local37 = 0;
			while (local18.length > local37) {
				local18[local37] = local37++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "(II)[B")
	public byte[] method2964(@OriginalArg(1) int arg0) {
		if (!this.method2954()) {
			return null;
		} else if (this.aClass284_2.anIntArray640.length == 1) {
			return this.method2962(arg0, 0);
		} else if (!this.method2971(arg0)) {
			return null;
		} else if (this.aClass284_2.anIntArray640[arg0] == 1) {
			return this.method2962(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "(II)I")
	public int method2965(@OriginalArg(0) int arg0) {
		if (this.method2954()) {
			@Pc(21) int local21 = this.aClass284_2.aClass183_1.method4504(arg0);
			return this.method2971(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public void method2966(@OriginalArg(0) String arg0) {
		if (this.method2954()) {
			@Pc(15) String local15 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass284_2.aClass183_1.method4504(Static237.method4068(local15));
			this.method2957(local28);
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(IZ)V")
	private void method2967(@OriginalArg(0) int arg0) {
		if (this.aBoolean214) {
			this.anObjectArray4[arg0] = this.aClass79_1.method2217(arg0);
		} else {
			this.anObjectArray4[arg0] = Static65.method1201(this.aClass79_1.method2217(arg0));
		}
	}

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "(I)Z")
	public boolean method2968() {
		if (!this.method2954()) {
			return false;
		}
		@Pc(19) boolean local19 = true;
		for (@Pc(21) int local21 = 0; local21 < this.aClass284_2.anIntArray642.length; local21++) {
			@Pc(29) int local29 = this.aClass284_2.anIntArray642[local21];
			if (this.anObjectArray4[local29] == null) {
				this.method2967(local29);
				if (this.anObjectArray4[local29] == null) {
					local19 = false;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method2969(@OriginalArg(0) String arg0) {
		if (this.method2954()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass284_2.aClass183_1.method4504(Static237.method4068(local18));
			return this.method2953(local27);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I[III)[B")
	public byte[] method2970(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method2978(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(37) boolean local37 = this.method2977(arg0, arg1, arg2);
			if (!local37) {
				this.method2967(arg2);
				local37 = this.method2977(arg0, arg1, arg2);
				if (!local37) {
					return null;
				}
			}
		}
		@Pc(64) byte[] local64 = Static278.method4542(false, this.anObjectArrayArray1[arg2][arg1]);
		if (this.anInt3362 == 1) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass284_2.anIntArray640[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt3362 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local64;
	}

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "(II)Z")
	private boolean method2971(@OriginalArg(0) int arg0) {
		if (!this.method2954()) {
			return false;
		} else if (arg0 >= 0 && this.aClass284_2.anIntArray640.length > arg0 && this.aClass284_2.anIntArray640[arg0] != 0) {
			return true;
		} else if (Static465.aBoolean570) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "(I)I")
	public int method2972() {
		return this.method2954() ? this.aClass284_2.anIntArray640.length : -1;
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(BI)Z")
	public boolean method2973(@OriginalArg(1) int arg0) {
		if (!this.method2954()) {
			return false;
		} else if (this.aClass284_2.anIntArray640.length == 1) {
			return this.method2974(arg0, 0);
		} else if (!this.method2971(arg0)) {
			return false;
		} else if (this.aClass284_2.anIntArray640[arg0] == 1) {
			return this.method2974(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(IBI)Z")
	public boolean method2974(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method2978(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray4[arg1] == null) {
			this.method2967(arg1);
			return this.anObjectArray4[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
	public boolean method2976(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method2954()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(29) int local29 = this.aClass284_2.aClass183_1.method4504(Static237.method4068(local12));
		if (local29 < 0) {
			return false;
		} else {
			@Pc(47) int local47 = this.aClass284_2.aClass183Array1[local29].method4504(Static237.method4068(local15));
			return local47 >= 0;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(B[III)Z")
	private boolean method2977(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method2971(arg2)) {
			return false;
		} else if (this.anObjectArray4[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass284_2.anIntArray641[arg2];
			@Pc(31) int[] local31 = this.aClass284_2.anIntArrayArray70[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass284_2.anIntArray640[arg2]];
			}
			@Pc(59) Object[] local59 = this.anObjectArrayArray1[arg2];
			@Pc(61) boolean local61 = true;
			for (@Pc(63) int local63 = 0; local63 < local25; local63++) {
				@Pc(69) int local69;
				if (local31 == null) {
					local69 = local63;
				} else {
					local69 = local31[local63];
				}
				if (local59[local69] == null) {
					local61 = false;
					break;
				}
			}
			if (local61) {
				return true;
			}
			@Pc(130) byte[] local130;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local130 = Static278.method4542(false, this.anObjectArray4[arg2]);
			} else {
				local130 = Static278.method4542(true, this.anObjectArray4[arg2]);
				@Pc(135) Class5_Sub3 local135 = new Class5_Sub3(local130);
				local135.method4233(arg0, local135.aByteArray66.length);
			}
			@Pc(157) byte[] local157;
			try {
				local157 = Static20.method603(local130);
			} catch (@Pc(159) RuntimeException local159) {
				throw Static416.method6000(local159, "T3 - " + (arg0 != null) + "," + arg2 + "," + local130.length + "," + Static52.method1101(local130.length, local130) + "," + Static52.method1101(local130.length - 2, local130) + "," + this.aClass284_2.anIntArray644[arg2] + "," + this.aClass284_2.anInt8222);
			}
			if (this.aBoolean214) {
				this.anObjectArray4[arg2] = null;
			}
			@Pc(233) int local233;
			if (local25 <= 1) {
				if (local31 == null) {
					local233 = 0;
				} else {
					local233 = local31[0];
				}
				if (this.anInt3362 == 0) {
					local59[local233] = Static65.method1201(local157);
				} else {
					local59[local233] = local157;
				}
			} else {
				@Pc(269) int local269;
				@Pc(282) Class5_Sub3 local282;
				@Pc(290) int local290;
				@Pc(294) int local294;
				@Pc(296) int local296;
				@Pc(354) int local354;
				@Pc(356) int local356;
				@Pc(360) int local360;
				@Pc(362) int local362;
				if (this.anInt3362 == 2) {
					local233 = local157.length;
					local233--;
					local269 = local157[local233] & 0xFF;
					local233 -= local25 * local269 * 4;
					local282 = new Class5_Sub3(local157);
					@Pc(475) int local475 = 0;
					local282.anInt4960 = local233;
					local290 = 0;
					for (local294 = 0; local294 < local269; local294++) {
						local296 = 0;
						for (local354 = 0; local354 < local25; local354++) {
							local296 += local282.method4230();
							if (local31 == null) {
								local356 = local354;
							} else {
								local356 = local31[local354];
							}
							if (local356 == arg1) {
								local290 = local356;
								local475 += local296;
							}
						}
					}
					if (local475 == 0) {
						return true;
					}
					@Pc(534) byte[] local534 = new byte[local475];
					local282.anInt4960 = local233;
					local475 = 0;
					local354 = 0;
					for (local356 = 0; local356 < local269; local356++) {
						local360 = 0;
						for (local362 = 0; local362 < local25; local362++) {
							local360 += local282.method4230();
							@Pc(561) int local561;
							if (local31 == null) {
								local561 = local362;
							} else {
								local561 = local31[local362];
							}
							if (arg1 == local561) {
								Static553.method2534(local157, local354, local534, local475, local360);
								local475 += local360;
							}
							local354 += local360;
						}
					}
					local59[local290] = local534;
				} else {
					local233 = local157.length;
					local233--;
					local269 = local157[local233] & 0xFF;
					local233 -= local269 * 4 * local25;
					local282 = new Class5_Sub3(local157);
					local282.anInt4960 = local233;
					@Pc(288) int[] local288 = new int[local25];
					for (local290 = 0; local290 < local269; local290++) {
						local294 = 0;
						for (local296 = 0; local296 < local25; local296++) {
							local294 += local282.method4230();
							local288[local296] += local294;
						}
					}
					@Pc(326) byte[][] local326 = new byte[local25][];
					for (local296 = 0; local296 < local25; local296++) {
						local326[local296] = new byte[local288[local296]];
						local288[local296] = 0;
					}
					local282.anInt4960 = local233;
					local354 = 0;
					for (local356 = 0; local356 < local269; local356++) {
						local360 = 0;
						for (local362 = 0; local362 < local25; local362++) {
							local360 += local282.method4230();
							Static553.method2534(local157, local354, local326[local362], local288[local362], local360);
							local288[local362] += local360;
							local354 += local360;
						}
					}
					for (local360 = 0; local360 < local25; local360++) {
						if (local31 == null) {
							local362 = local360;
						} else {
							local362 = local31[local360];
						}
						if (this.anInt3362 == 0) {
							local59[local362] = Static65.method1201(local326[local360]);
						} else {
							local59[local362] = local326[local360];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIB)Z")
	private boolean method2978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method2954()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass284_2.anIntArray640.length && arg1 < this.aClass284_2.anIntArray640[arg0]) {
			return true;
		} else if (Static465.aBoolean570) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "(BI)Z")
	public boolean method2979(@OriginalArg(1) int arg0) {
		if (!this.method2971(arg0)) {
			return false;
		} else if (this.anObjectArray4[arg0] == null) {
			this.method2967(arg0);
			return this.anObjectArray4[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method2980(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method2954()) {
			return null;
		}
		@Pc(14) String local14 = arg0.toLowerCase();
		@Pc(17) String local17 = arg1.toLowerCase();
		@Pc(26) int local26 = this.aClass284_2.aClass183_1.method4504(Static237.method4068(local14));
		if (this.method2971(local26)) {
			@Pc(44) int local44 = this.aClass284_2.aClass183Array1[local26].method4504(Static237.method4068(local17));
			return this.method2962(local44, local26);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method2982(@OriginalArg(1) String arg0) {
		if (this.method2954()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass284_2.aClass183_1.method4504(Static237.method4068(local12));
			return this.method2971(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "(I)V")
	public void method2983() {
		if (this.anObjectArray4 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anObjectArray4.length; local16++) {
				this.anObjectArray4[local16] = null;
			}
		}
	}
}
