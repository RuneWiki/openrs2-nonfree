import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class86 {

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!jw;")
	private Class183 aClass183_9;

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
	private int anInt2702;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
	private int anInt2705;

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "Lclient!uk;")
	public Class337 aClass337_1;

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
	public int anInt2709;

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "[I")
	public int[] anIntArray252;

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
	public int anInt2711;

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "Ljava/lang/String;")
	public String aString21;

	@OriginalMember(owner = "client!ee", name = "D", descriptor = "Ljava/lang/String;")
	public String aString22;

	@OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
	public int anInt2719;

	@OriginalMember(owner = "client!ee", name = "K", descriptor = "I")
	private int anInt2721;

	@OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
	public int anInt2722;

	@OriginalMember(owner = "client!ee", name = "O", descriptor = "I")
	public int anInt2725;

	@OriginalMember(owner = "client!ee", name = "R", descriptor = "I")
	public int anInt2728;

	@OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
	private int anInt2731;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	public int anInt2697 = -1;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Z")
	public boolean aBoolean217 = true;

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray6 = new String[5];

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
	public int anInt2707 = -1;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Z")
	public boolean aBoolean216 = false;

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
	public int anInt2710 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
	private int anInt2713 = -1;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
	private int anInt2698 = -1;

	@OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
	public int anInt2715 = -1;

	@OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
	public int anInt2720 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
	public int anInt2696 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
	private int anInt2708 = -1;

	@OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
	public int anInt2717 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ee", name = "E", descriptor = "Z")
	public boolean aBoolean219 = true;

	@OriginalMember(owner = "client!ee", name = "C", descriptor = "Z")
	public boolean aBoolean218 = true;

	@OriginalMember(owner = "client!ee", name = "S", descriptor = "I")
	private int anInt2729 = -1;

	@OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
	private int anInt2718 = -1;

	@OriginalMember(owner = "client!ee", name = "Q", descriptor = "I")
	public int anInt2727 = -1;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
	public int anInt2706 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
	public void method2397() {
		if (this.anIntArray252 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray252.length; local18 += 2) {
			if (this.anInt2717 > this.anIntArray252[local18]) {
				this.anInt2717 = this.anIntArray252[local18];
			} else if (this.anIntArray252[local18] > this.anInt2706) {
				this.anInt2706 = this.anIntArray252[local18];
			}
			if (this.anIntArray252[local18 + 1] < this.anInt2710) {
				this.anInt2710 = this.anIntArray252[local18 + 1];
			} else if (this.anIntArray252[local18 + 1] > this.anInt2696) {
				this.anInt2696 = this.anIntArray252[local18 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;IZ)Ljava/lang/String;")
	public String method2399(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass183_9 == null) {
			return arg0;
		} else {
			@Pc(22) Class4_Sub46 local22 = (Class4_Sub46) this.aClass183_9.method4289((long) arg1);
			return local22 == null ? arg0 : local22.aString95;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLclient!oa;B)Lclient!xa;")
	public Class13 method2404(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class66 arg1) {
		@Pc(20) int local20 = arg0 ? this.anInt2707 : this.anInt2727;
		@Pc(27) int local27 = local20 | arg1.anInt8223 << 29;
		@Pc(36) Class13 local36 = (Class13) this.aClass337_1.aClass223_64.method4943((long) local27);
		if (local36 != null) {
			return local36;
		} else if (this.aClass337_1.aClass31_114.method679(local20)) {
			@Pc(56) Class268 local56 = Static607.method5872(this.aClass337_1.aClass31_114, local20, 0);
			if (local56 != null) {
				local36 = arg1.method6799(local56, true);
				this.aClass337_1.aClass223_64.method4938((long) local27, local36);
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BILclient!eh;)V")
	private void method2405(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt2727 = arg1.method5982();
		} else if (arg0 == 2) {
			this.anInt2707 = arg1.method5982();
		} else if (arg0 == 3) {
			this.aString22 = arg1.method6010();
		} else if (arg0 == 4) {
			this.anInt2719 = arg1.method6023();
		} else if (arg0 == 5) {
			this.anInt2715 = arg1.method6023();
		} else if (arg0 == 6) {
			this.anInt2720 = arg1.method6015();
		} else {
			@Pc(55) int local55;
			if (arg0 == 7) {
				local55 = arg1.method6015();
				if ((local55 & 0x1) == 0) {
					this.aBoolean218 = false;
				}
				if ((local55 & 0x2) == 2) {
					this.aBoolean216 = true;
				}
			} else if (arg0 == 8) {
				this.aBoolean217 = arg1.method6015() == 1;
			} else if (arg0 == 9) {
				this.anInt2708 = arg1.method5982();
				if (this.anInt2708 == 65535) {
					this.anInt2708 = -1;
				}
				this.anInt2718 = arg1.method5982();
				if (this.anInt2718 == 65535) {
					this.anInt2718 = -1;
				}
				this.anInt2702 = arg1.method6026();
				this.anInt2731 = arg1.method6026();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray6[arg0 - 10] = arg1.method6010();
			} else {
				@Pc(128) int local128;
				if (arg0 == 15) {
					local55 = arg1.method6015();
					this.anIntArray252 = new int[local55 * 2];
					for (local128 = 0; local128 < local55 * 2; local128++) {
						this.anIntArray252[local128] = arg1.method6003();
					}
					this.anInt2722 = arg1.method6026();
					this.anInt2725 = arg1.method6026();
				} else if (arg0 == 16) {
					this.aBoolean219 = false;
				} else if (arg0 == 17) {
					this.aString21 = arg1.method6010();
				} else if (arg0 == 18) {
					this.anInt2698 = arg1.method5982();
				} else if (arg0 == 19) {
					this.anInt2697 = arg1.method5982();
				} else if (arg0 == 20) {
					this.anInt2729 = arg1.method5982();
					if (this.anInt2729 == 65535) {
						this.anInt2729 = -1;
					}
					this.anInt2713 = arg1.method5982();
					if (this.anInt2713 == 65535) {
						this.anInt2713 = -1;
					}
					this.anInt2705 = arg1.method6026();
					this.anInt2721 = arg1.method6026();
				} else if (arg0 == 21) {
					this.anInt2709 = arg1.method6026();
				} else if (arg0 == 22) {
					this.anInt2728 = arg1.method6026();
				} else if (arg0 == 249) {
					local55 = arg1.method6015();
					if (this.aClass183_9 == null) {
						local128 = Static514.method7261(local55);
						this.aClass183_9 = new Class183(local128);
					}
					for (local128 = 0; local128 < local55; local128++) {
						@Pc(286) boolean local286 = arg1.method6015() == 1;
						@Pc(290) int local290 = arg1.method6023();
						@Pc(299) Class4 local299;
						if (local286) {
							local299 = new Class4_Sub46(arg1.method6010());
						} else {
							local299 = new Class4_Sub33(arg1.method6026());
						}
						this.aClass183_9.method4282((long) local290, local299);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!aba;Z)Z")
	public boolean method2406(@OriginalArg(0) Interface1 arg0) {
		@Pc(19) int local19;
		if (this.anInt2718 == -1) {
			if (this.anInt2708 == -1) {
				return true;
			}
			local19 = arg0.method7423(this.anInt2708);
		} else {
			local19 = arg0.method7424(this.anInt2718);
		}
		if (local19 < this.anInt2702 || local19 > this.anInt2731) {
			return false;
		}
		@Pc(72) int local72;
		if (this.anInt2713 == -1) {
			if (this.anInt2729 == -1) {
				return true;
			}
			local72 = arg0.method7423(this.anInt2729);
		} else {
			local72 = arg0.method7424(this.anInt2713);
		}
		return local72 >= this.anInt2705 && this.anInt2721 >= local72;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!oa;I)Lclient!xa;")
	public Class13 method2407(@OriginalArg(0) Class66 arg0) {
		@Pc(28) Class13 local28 = (Class13) this.aClass337_1.aClass223_64.method4943((long) (this.anInt2698 | 0x20000 | arg0.anInt8223 << 29));
		if (local28 != null) {
			return local28;
		}
		this.aClass337_1.aClass31_114.method679(this.anInt2698);
		@Pc(48) Class268 local48 = Static607.method5872(this.aClass337_1.aClass31_114, this.anInt2698, 0);
		if (local48 != null) {
			local28 = arg0.method6799(local48, true);
			this.aClass337_1.aClass223_64.method4938((long) (this.anInt2698 | 0x20000 | arg0.anInt8223 << 29), local28);
		}
		return local28;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZ)I")
	public int method2408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass183_9 == null) {
			return arg0;
		} else {
			@Pc(21) Class4_Sub33 local21 = (Class4_Sub33) this.aClass183_9.method4289((long) arg1);
			return local21 == null ? arg0 : local21.anInt6079;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLclient!eh;)V")
	public void method2409(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6015();
			if (local15 == 0) {
				return;
			}
			this.method2405(local15, arg0);
		}
	}
}
