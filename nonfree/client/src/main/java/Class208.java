import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class208 {

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "Lclient!ha;")
	private Class4_Sub5_Sub6 aClass4_Sub5_Sub6_3;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "Lclient!wt;")
	private Class365 aClass365_2;

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
	private int anInt6146;

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
	private int anInt6151;

	@OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
	private int anInt6152;

	@OriginalMember(owner = "client!lq", name = "A", descriptor = "Lclient!da;")
	private Class57 aClass57_3;

	@OriginalMember(owner = "client!lq", name = "E", descriptor = "Lclient!au;")
	public Class1_Sub2 aClass1_Sub2_4;

	@OriginalMember(owner = "client!lq", name = "M", descriptor = "[Z")
	private boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!lq", name = "O", descriptor = "I")
	private int anInt6168;

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
	private int anInt6143 = -1;

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
	private int anInt6145 = -1;

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
	private int anInt6153 = -1;

	@OriginalMember(owner = "client!lq", name = "z", descriptor = "I")
	private int anInt6160 = 0;

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "Z")
	private boolean aBoolean450 = false;

	@OriginalMember(owner = "client!lq", name = "P", descriptor = "Z")
	private boolean aBoolean451 = false;

	@OriginalMember(owner = "client!lq", name = "x", descriptor = "I")
	private int anInt6158 = 0;

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "Lclient!ub;")
	private final Class1_Sub4 aClass1_Sub4_1;

	@OriginalMember(owner = "client!lq", name = "B", descriptor = "I")
	public final int anInt6161;

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "B")
	private final byte aByte66;

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
	public final int anInt6147;

	@OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
	public final int anInt6159;

	@OriginalMember(owner = "client!lq", name = "N", descriptor = "B")
	private final byte aByte67;

	@OriginalMember(owner = "client!lq", name = "m", descriptor = "Z")
	private final boolean aBoolean449;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!r;Lclient!fga;IIIILclient!ub;ZI)V")
	public Class208(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub4 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.aBoolean450 = arg7;
		this.aClass1_Sub4_1 = arg6;
		this.anInt6161 = arg1.anInt2942;
		this.aByte66 = (byte) arg5;
		this.anInt6147 = arg2;
		this.anInt6159 = arg3;
		this.aByte67 = (byte) arg4;
		this.aBoolean449 = arg0.method4975() && arg1.aBoolean228 && !this.aBoolean450;
		if (arg8 != -1) {
			this.aBoolean451 = true;
		}
		this.method5240(arg8);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BI)V")
	private void method5240(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class101 local19 = Static204.aClass139_8.method3309(this.anInt6161);
			@Pc(21) Class101 local21 = local19;
			if (local19.anIntArray140 != null) {
				local19 = local19.method2710(Static45.aClass148_1);
			}
			if (local19 == null) {
				return;
			}
			if (local19 == local21) {
				local21 = null;
			}
			if (local19.anIntArray137 != null) {
				if (this.aClass365_2 != null && local19.method2700(this.aClass365_2.anInt10214)) {
					return;
				}
				local7 = local19.method2706();
				if (local19.anInt2942 != this.anInt6153) {
					local9 = local19.aBoolean226;
				}
			} else if (local19.anInt2962 == -1) {
				if (local21 != null && local21.anIntArray137 != null) {
					if (this.aClass365_2 != null && local21.method2700(this.aClass365_2.anInt10214)) {
						return;
					}
					local7 = local21.method2706();
					if (local21.anInt2942 != this.anInt6153) {
						local9 = local21.aBoolean226;
					}
				} else if (local21 != null && local21.anInt2962 != -1 && local21.anInt2942 != this.anInt6153) {
					local7 = local21.anInt2962;
					local9 = local21.aBoolean226;
				}
			} else if (local19.anInt2942 != this.anInt6153) {
				local7 = local19.anInt2962;
				local9 = local19.aBoolean226;
			}
		}
		if (local7 == -1) {
			this.aClass365_2 = null;
			return;
		}
		this.aClass57_3 = null;
		if (this.aClass365_2 == null || local7 != this.aClass365_2.anInt10214) {
			this.aClass365_2 = Static61.aClass48_1.method1016(local7);
		} else if (this.aClass365_2.anInt10221 == 0) {
			return;
		}
		if (this.aClass365_2.anIntArray551 == null) {
			this.aClass365_2 = null;
			return;
		}
		if (local9) {
			this.anInt6146 = (int) (Math.random() * (double) this.aClass365_2.anIntArray551.length);
			this.anInt6152 = (int) (Math.random() * (double) this.aClass365_2.anIntArray552[this.anInt6146]) + 1;
		} else {
			this.anInt6152 = 1;
			this.anInt6146 = 0;
		}
		this.anInt6151 = this.anInt6146 + 1;
		if (this.anInt6151 < 0 || this.anInt6151 >= this.aClass365_2.anIntArray551.length) {
			this.anInt6151 = -1;
		}
		this.anInt6168 = Static106.anInt2418 - this.anInt6152;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)I")
	public int method5242() {
		return this.anInt6160;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)I")
	public int method5243(@OriginalArg(0) int arg0) {
		if (arg0 != 16) {
			this.method5249(73);
		}
		return this.anInt6158;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)Z")
	public boolean method5244() {
		return this.aBoolean449;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILclient!ub;)V")
	private void method5245(@OriginalArg(1) Class1_Sub4 arg0) {
		label80: while (true) {
			if (this.aClass365_2 == null) {
				if (this.aBoolean451) {
					return;
				}
				this.method5240(-1);
				if (this.aClass365_2 == null) {
					return;
				}
			}
			@Pc(33) int local33 = Static106.anInt2418 - this.anInt6168;
			if (local33 > 100 && this.aClass365_2.anInt10217 > 0) {
				@Pc(54) int local54 = this.aClass365_2.anIntArray551.length - this.aClass365_2.anInt10217;
				while (local54 > this.anInt6146 && this.aClass365_2.anIntArray552[this.anInt6146] < local33) {
					local33 -= this.aClass365_2.anIntArray552[this.anInt6146];
					this.anInt6146++;
				}
				if (local54 <= this.anInt6146) {
					@Pc(93) int local93 = 0;
					for (@Pc(95) int local95 = local54; local95 < this.aClass365_2.anIntArray551.length; local95++) {
						local93 += this.aClass365_2.anIntArray552[local95];
					}
					local33 %= local93;
				}
				this.anInt6151 = this.anInt6146 + 1;
				if (this.aClass365_2.anIntArray551.length <= this.anInt6151) {
					this.anInt6151 -= this.aClass365_2.anInt10217;
					if (this.anInt6151 < 0 || this.aClass365_2.anIntArray551.length <= this.anInt6151) {
						this.anInt6151 = -1;
					}
				}
			}
			while (local33 > this.aClass365_2.anIntArray552[this.anInt6146]) {
				Static301.method5179(this.aClass365_2, arg0, this.anInt6146);
				local33 -= this.aClass365_2.anIntArray552[this.anInt6146];
				this.anInt6146++;
				if (this.anInt6146 >= this.aClass365_2.anIntArray551.length) {
					this.anInt6146 -= this.aClass365_2.anInt10217;
					if (this.anInt6146 < 0 || this.aClass365_2.anIntArray551.length <= this.anInt6146) {
						this.aClass365_2 = null;
						continue label80;
					}
				}
				this.anInt6151 = this.anInt6146 + 1;
				if (this.aClass365_2.anIntArray551.length <= this.anInt6151) {
					this.anInt6151 -= this.aClass365_2.anInt10217;
					if (this.anInt6151 < 0 || this.anInt6151 >= this.aClass365_2.anIntArray551.length) {
						this.anInt6151 = -1;
					}
				}
			}
			this.anInt6168 = Static106.anInt2418 - local33;
			this.anInt6152 = local33;
			return;
		}
	}

	@OriginalMember(owner = "client!lq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass1_Sub2_4 != null) {
			this.aClass1_Sub2_4.method337();
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILclient!q;IIIIZLclient!da;Lclient!r;)V")
	public void method5247(@OriginalArg(0) int arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) Class57 arg6, @OriginalArg(8) Class44 arg7) {
		@Pc(12) Class227[] local12 = arg6.method7915();
		@Pc(15) Class103[] local15 = arg6.method7920();
		if ((this.aClass1_Sub2_4 == null || this.aClass1_Sub2_4.aBoolean21) && (local12 != null || local15 != null)) {
			@Pc(32) Class101 local32 = Static204.aClass139_8.method3309(this.anInt6161);
			if (local32.anIntArray140 != null) {
				local32 = local32.method2710(Static45.aClass148_1);
			}
			if (local32 != null) {
				this.aClass1_Sub2_4 = Static25.method339(Static106.anInt2418, true);
			}
		}
		if (this.aClass1_Sub2_4 == null) {
			return;
		}
		arg6.method7926(arg1);
		if (arg5) {
			this.aClass1_Sub2_4.method333(arg7, (long) Static106.anInt2418, local12, local15);
		} else {
			this.aClass1_Sub2_4.method335((long) Static106.anInt2418);
		}
		this.aClass1_Sub2_4.method338(this.aByte67, arg2, arg3, arg4, arg0);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZZIZLclient!r;)Lclient!da;")
	public Class57 method5248(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class44 arg3) {
		@Pc(11) Class101 local11 = Static204.aClass139_8.method3309(this.anInt6161);
		if (local11.anIntArray140 != null) {
			local11 = local11.method2710(Static45.aClass148_1);
		}
		if (local11 == null) {
			this.method5250(arg3);
			this.anInt6145 = -1;
			this.anInt6153 = -1;
			this.anInt6143 = -1;
			return null;
		}
		if (!this.aBoolean451 && local11.anInt2942 != this.anInt6153) {
			this.aClass57_3 = null;
			this.method5240(-1);
		}
		this.method5245(this.aClass1_Sub4_1);
		if (arg0) {
			@Pc(82) boolean local82 = arg0 & this.aBoolean449 & Static214.aClass4_Sub19_Sub1_1.method2774(Static495.anInt9000) != 0;
			arg0 = local82 & (this.anInt6145 != local11.anInt2942 || this.aClass365_2 != null && Static214.aClass4_Sub19_Sub1_1.method2774(Static495.anInt9000) >= 2 && (this.anInt6146 != this.anInt6143 || (this.aClass365_2.aBoolean724 || Static115.aBoolean196) && this.anInt6146 != this.anInt6151));
		}
		if (arg1 && !arg0) {
			this.anInt6153 = local11.anInt2942;
			return null;
		}
		if (arg0) {
			Static144.method2749(this.aClass4_Sub5_Sub6_3, this.aByte66, this.aClass1_Sub4_1.anInt9934, this.aClass1_Sub4_1.anInt9935, this.aBooleanArray19);
			this.anInt6143 = -1;
			this.anInt6145 = -1;
		}
		@Pc(168) Class83 local168 = Static499.aClass83Array3[this.aByte66];
		@Pc(184) Class83 local184;
		if (this.aBoolean450) {
			local184 = Static444.aClass83Array7[0];
		} else {
			local184 = this.aByte66 < 3 ? Static499.aClass83Array3[this.aByte66 + 1] : null;
		}
		@Pc(192) Class57 local192 = null;
		if (this.aClass365_2 != null) {
			if (arg0) {
				arg2 |= 0x40000;
			}
			local192 = local11.method2701(this.aClass1_Sub4_1.anInt9934, this.anInt6146, arg3, this.anInt6152, this.aClass365_2, local168, local168.method7213(this.aClass1_Sub4_1.anInt9934, this.aClass1_Sub4_1.anInt9935), this.anInt6151, local184, this.aClass1_Sub4_1.anInt9935, this.anInt6147 == 11 ? this.anInt6159 + 4 : this.anInt6159, this.anInt6147 == 11 ? 10 : this.anInt6147, arg2);
			if (local192 == null) {
				this.anInt6160 = 0;
				this.aClass4_Sub5_Sub6_3 = null;
				this.anInt6158 = 0;
				this.aBooleanArray19 = null;
			} else {
				if (arg0) {
					if (this.aBooleanArray19 == null) {
						this.aBooleanArray19 = new boolean[4];
					}
					this.aClass4_Sub5_Sub6_3 = local192.S(this.aClass4_Sub5_Sub6_3);
					Static456.method6974(this.aClass4_Sub5_Sub6_3, this.aByte66, this.aClass1_Sub4_1.anInt9934, this.aClass1_Sub4_1.anInt9935, this.aBooleanArray19);
					this.anInt6145 = local11.anInt2942;
					this.anInt6143 = this.anInt6146;
				}
				this.anInt6160 = local192.J();
				this.anInt6158 = local192.RA();
			}
			this.aClass57_3 = null;
		} else if (this.aClass57_3 != null && (this.aClass57_3.PA() & arg2) == arg2 && local11.anInt2942 == this.anInt6153) {
			local192 = this.aClass57_3;
		} else {
			if (this.aClass57_3 != null) {
				arg2 |= this.aClass57_3.PA();
			}
			@Pc(391) Class99 local391 = local11.method2715(this.aClass1_Sub4_1.anInt9935, arg3, this.anInt6147 == 11 ? 10 : this.anInt6147, local184, arg2, arg0, this.aClass1_Sub4_1.anInt9934, local168.method7213(this.aClass1_Sub4_1.anInt9934, this.aClass1_Sub4_1.anInt9935), this.anInt6147 == 11 ? this.anInt6159 + 4 : this.anInt6159, local168);
			if (local391 == null) {
				this.anInt6160 = 0;
				this.aClass4_Sub5_Sub6_3 = null;
				this.aBooleanArray19 = null;
				this.aClass57_3 = null;
				this.anInt6158 = 0;
			} else {
				local192 = local391.aClass57_1;
				this.aClass57_3 = local391.aClass57_1;
				if (arg0) {
					this.aClass4_Sub5_Sub6_3 = local391.aClass4_Sub5_Sub6_1;
					this.aBooleanArray19 = null;
					Static456.method6974(this.aClass4_Sub5_Sub6_3, this.aByte66, this.aClass1_Sub4_1.anInt9934, this.aClass1_Sub4_1.anInt9935, null);
					this.anInt6145 = local11.anInt2942;
					this.anInt6143 = -1;
				}
				this.anInt6160 = local192.J();
				this.anInt6158 = local192.RA();
			}
		}
		this.anInt6153 = local11.anInt2942;
		return local192;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V")
	public void method5249(@OriginalArg(1) int arg0) {
		this.aBoolean451 = true;
		this.method5240(arg0);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!r;B)V")
	public void method5250(@OriginalArg(0) Class44 arg0) {
		if (this.aClass4_Sub5_Sub6_3 != null) {
			Static144.method2749(this.aClass4_Sub5_Sub6_3, this.aByte66, this.aClass1_Sub4_1.anInt9934, this.aClass1_Sub4_1.anInt9935, this.aBooleanArray19);
			this.aBooleanArray19 = null;
			this.aClass4_Sub5_Sub6_3 = null;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!r;I)V")
	public void method5251(@OriginalArg(0) Class44 arg0) {
		this.method5248(true, true, 262144, arg0);
	}
}
