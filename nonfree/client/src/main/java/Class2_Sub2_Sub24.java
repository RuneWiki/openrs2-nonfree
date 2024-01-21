import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class2_Sub2_Sub24 extends Class2_Sub2 {

	@OriginalMember(owner = "client!qf", name = "B", descriptor = "[I")
	public int[] anIntArray309;

	@OriginalMember(owner = "client!qf", name = "H", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!qf", name = "J", descriptor = "[I")
	private int[] anIntArray310;

	@OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
	public int anInt3201;

	@OriginalMember(owner = "client!qf", name = "bb", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!qf", name = "db", descriptor = "[I")
	private int[] anIntArray311;

	@OriginalMember(owner = "client!qf", name = "lb", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!qf", name = "xb", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!qf", name = "yb", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
	private int anInt3189 = 0;

	@OriginalMember(owner = "client!qf", name = "N", descriptor = "I")
	public int anInt3196 = -1;

	@OriginalMember(owner = "client!qf", name = "T", descriptor = "I")
	public int anInt3200 = -1;

	@OriginalMember(owner = "client!qf", name = "I", descriptor = "S")
	public short aShort3 = 0;

	@OriginalMember(owner = "client!qf", name = "V", descriptor = "Lclient!qe;")
	public Class83 aClass83_942 = Static181.aClass83_1053;

	@OriginalMember(owner = "client!qf", name = "W", descriptor = "I")
	public int anInt3202 = 32;

	@OriginalMember(owner = "client!qf", name = "S", descriptor = "Z")
	public boolean aBoolean149 = false;

	@OriginalMember(owner = "client!qf", name = "gb", descriptor = "I")
	private int anInt3207 = -1;

	@OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
	public int anInt3195 = -1;

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
	public int anInt3193 = -1;

	@OriginalMember(owner = "client!qf", name = "ab", descriptor = "[Lclient!qe;")
	public final Class83[] aClass83Array54 = new Class83[5];

	@OriginalMember(owner = "client!qf", name = "rb", descriptor = "Z")
	public boolean aBoolean151 = true;

	@OriginalMember(owner = "client!qf", name = "ub", descriptor = "I")
	public int anInt3214 = -1;

	@OriginalMember(owner = "client!qf", name = "mb", descriptor = "I")
	private int anInt3210 = 128;

	@OriginalMember(owner = "client!qf", name = "hb", descriptor = "Z")
	public boolean aBoolean150 = true;

	@OriginalMember(owner = "client!qf", name = "fb", descriptor = "I")
	public int anInt3206 = -1;

	@OriginalMember(owner = "client!qf", name = "w", descriptor = "Z")
	public boolean aBoolean147 = true;

	@OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
	public int anInt3188 = 1;

	@OriginalMember(owner = "client!qf", name = "vb", descriptor = "I")
	private int anInt3215 = 128;

	@OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
	private int anInt3191 = 0;

	@OriginalMember(owner = "client!qf", name = "pb", descriptor = "I")
	public int anInt3212 = -1;

	@OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
	private int anInt3187 = -1;

	@OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
	public int anInt3197 = -1;

	@OriginalMember(owner = "client!qf", name = "tb", descriptor = "S")
	public short aShort4 = 0;

	@OriginalMember(owner = "client!qf", name = "Bb", descriptor = "I")
	public int anInt3219 = -1;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)V")
	public void method2442() {
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!ra;)V")
	public void method2444(@OriginalArg(1) Class2_Sub3 arg0) {
		while (true) {
			@Pc(29) int local29 = arg0.method260();
			if (local29 == 0) {
				return;
			}
			this.method2452(arg0, local29);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILclient!ki;)Lclient!gj;")
	public Class24_Sub3 method2445(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2_Sub16 arg1) {
		if (this.anIntArray309 != null) {
			@Pc(18) Class2_Sub2_Sub24 local18 = this.method2447();
			return local18 == null ? null : local18.method2445(arg0, arg1);
		} else if (this.anIntArray311 == null) {
			return null;
		} else {
			@Pc(41) Class24_Sub3 local41 = (Class24_Sub3) Static26.aClass91_1.method2702((long) this.anInt3201);
			if (local41 == null) {
				@Pc(45) boolean local45 = false;
				for (@Pc(47) int local47 = 0; local47 < this.anIntArray311.length; local47++) {
					if (!Static113.aClass28_120.method872(this.anIntArray311[local47], 0)) {
						local45 = true;
					}
				}
				if (local45) {
					return null;
				}
				@Pc(79) Class24_Sub7[] local79 = new Class24_Sub7[this.anIntArray311.length];
				for (@Pc(81) int local81 = 0; local81 < this.anIntArray311.length; local81++) {
					local79[local81] = Static198.method2988(Static113.aClass28_120, this.anIntArray311[local81]);
				}
				@Pc(109) Class24_Sub7 local109;
				if (local79.length == 1) {
					local109 = local79[0];
				} else {
					local109 = new Class24_Sub7(local79, local79.length);
				}
				@Pc(123) int local123;
				if (this.aShortArray34 != null) {
					for (local123 = 0; local123 < this.aShortArray34.length; local123++) {
						if (this.aByteArray37 == null || this.aByteArray37.length <= local123) {
							local109.method2986(this.aShortArray34[local123], this.aShortArray37[local123]);
						} else {
							local109.method2986(this.aShortArray34[local123], Static215.aShortArray60[this.aByteArray37[local123] & 0xFF]);
						}
					}
				}
				if (this.aShortArray36 != null) {
					for (local123 = 0; local123 < this.aShortArray36.length; local123++) {
						local109.method2998(this.aShortArray36[local123], this.aShortArray35[local123]);
					}
				}
				local41 = local109.method2991(64, 768, -50, -10, -50);
				Static26.aClass91_1.method2710((long) this.anInt3201, local41);
			}
			if (arg1 != null) {
				local41 = arg1.method1764(arg0, local41);
			}
			return local41;
		}
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(B)Lclient!qf;")
	public Class2_Sub2_Sub24 method2447() {
		@Pc(13) int local13 = -1;
		if (this.anInt3207 != -1) {
			local13 = Static199.method3012(this.anInt3207);
		} else if (this.anInt3187 != -1) {
			local13 = Static14.anIntArray235[this.anInt3187];
		}
		return local13 < 0 || this.anIntArray309.length <= local13 || this.anIntArray309[local13] == -1 ? null : Static133.method2214(this.anIntArray309[local13]);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)Z")
	public boolean method2450() {
		if (this.anIntArray309 == null) {
			return true;
		}
		@Pc(21) int local21 = -1;
		if (this.anInt3207 != -1) {
			local21 = Static199.method3012(this.anInt3207);
		} else if (this.anInt3187 != -1) {
			local21 = Static14.anIntArray235[this.anInt3187];
		}
		return local21 >= 0 && this.anIntArray309.length > local21 && this.anIntArray309[local21] != -1;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!ki;ILclient!ki;I)Lclient!gj;")
	public Class24_Sub3 method2451(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub2_Sub16 arg3) {
		if (this.anIntArray309 != null) {
			@Pc(12) Class2_Sub2_Sub24 local12 = this.method2447();
			return local12 == null ? null : local12.method2451(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class24_Sub3 local32 = (Class24_Sub3) Static96.aClass91_5.method2702((long) this.anInt3201);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray310.length; local38++) {
				if (!Static113.aClass28_120.method872(this.anIntArray310[local38], 0)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(70) Class24_Sub7[] local70 = new Class24_Sub7[this.anIntArray310.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray310.length; local72++) {
				local70[local72] = Static198.method2988(Static113.aClass28_120, this.anIntArray310[local72]);
			}
			@Pc(102) Class24_Sub7 local102;
			if (local70.length == 1) {
				local102 = local70[0];
			} else {
				local102 = new Class24_Sub7(local70, local70.length);
			}
			@Pc(116) int local116;
			if (this.aShortArray34 != null) {
				for (local116 = 0; local116 < this.aShortArray34.length; local116++) {
					if (this.aByteArray37 == null || this.aByteArray37.length <= local116) {
						local102.method2986(this.aShortArray34[local116], this.aShortArray37[local116]);
					} else {
						local102.method2986(this.aShortArray34[local116], Static215.aShortArray60[this.aByteArray37[local116] & 0xFF]);
					}
				}
			}
			if (this.aShortArray36 != null) {
				for (local116 = 0; local116 < this.aShortArray36.length; local116++) {
					local102.method2998(this.aShortArray36[local116], this.aShortArray35[local116]);
				}
			}
			local32 = local102.method2991(this.anInt3189 + 64, 850 - -this.anInt3191, -30, -50, -30);
			Static96.aClass91_5.method2710((long) this.anInt3201, local32);
		}
		@Pc(221) Class24_Sub3 local221;
		if (arg3 != null && arg1 != null) {
			local221 = arg3.method1760(arg1, local32, arg0, arg2);
		} else if (arg3 != null) {
			local221 = arg3.method1765(arg0, local32);
		} else if (arg1 == null) {
			local221 = local32.method2727(true);
		} else {
			local221 = arg1.method1765(arg2, local32);
		}
		if (this.anInt3215 != 128 || this.anInt3210 != 128) {
			local221.method2738(this.anInt3215, this.anInt3210, this.anInt3215);
		}
		return local221;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZLclient!ra;I)V")
	private void method2452(@OriginalArg(1) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(85) int local85;
		@Pc(95) int local95;
		if (arg1 == 1) {
			local85 = arg0.method260();
			this.anIntArray310 = new int[local85];
			for (local95 = 0; local95 < local85; local95++) {
				this.anIntArray310[local95] = arg0.method269();
			}
		} else if (arg1 == 2) {
			this.aClass83_942 = arg0.method259();
		} else if (arg1 == 12) {
			this.anInt3188 = arg0.method260();
		} else if (arg1 == 13) {
			this.anInt3214 = arg0.method269();
		} else if (arg1 == 14) {
			this.anInt3195 = arg0.method269();
		} else if (arg1 == 15) {
			this.anInt3206 = arg0.method269();
		} else if (arg1 == 16) {
			this.anInt3193 = arg0.method269();
		} else if (arg1 == 17) {
			this.anInt3195 = arg0.method269();
			this.anInt3219 = arg0.method269();
			this.anInt3196 = arg0.method269();
			this.anInt3200 = arg0.method269();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass83Array54[arg1 - 30] = arg0.method259();
			if (this.aClass83Array54[arg1 - 30].method2398(Static47.aClass83_366)) {
				this.aClass83Array54[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local85 = arg0.method260();
			this.aShortArray34 = new short[local85];
			this.aShortArray37 = new short[local85];
			for (local95 = 0; local95 < local85; local95++) {
				this.aShortArray34[local95] = (short) arg0.method269();
				this.aShortArray37[local95] = (short) arg0.method269();
			}
		} else if (arg1 == 41) {
			local85 = arg0.method260();
			this.aShortArray35 = new short[local85];
			this.aShortArray36 = new short[local85];
			for (local95 = 0; local95 < local85; local95++) {
				this.aShortArray36[local95] = (short) arg0.method269();
				this.aShortArray35[local95] = (short) arg0.method269();
			}
		} else if (arg1 == 42) {
			local85 = arg0.method260();
			this.aByteArray37 = new byte[local85];
			for (local95 = 0; local95 < local85; local95++) {
				this.aByteArray37[local95] = arg0.method221();
			}
		} else if (arg1 == 60) {
			local85 = arg0.method260();
			this.anIntArray311 = new int[local85];
			for (local95 = 0; local95 < local85; local95++) {
				this.anIntArray311[local95] = arg0.method269();
			}
		} else if (arg1 == 93) {
			this.aBoolean147 = false;
		} else if (arg1 == 95) {
			this.anInt3197 = arg0.method269();
		} else if (arg1 == 97) {
			this.anInt3215 = arg0.method269();
		} else if (arg1 == 98) {
			this.anInt3210 = arg0.method269();
		} else if (arg1 == 99) {
			this.aBoolean149 = true;
		} else if (arg1 == 100) {
			this.anInt3189 = arg0.method221();
		} else if (arg1 == 101) {
			this.anInt3191 = arg0.method221() * 5;
		} else if (arg1 == 102) {
			this.anInt3212 = arg0.method269();
		} else if (arg1 == 103) {
			this.anInt3202 = arg0.method269();
		} else if (arg1 == 106) {
			this.anInt3207 = arg0.method269();
			if (this.anInt3207 == 65535) {
				this.anInt3207 = -1;
			}
			this.anInt3187 = arg0.method269();
			if (this.anInt3187 == 65535) {
				this.anInt3187 = -1;
			}
			local85 = arg0.method260();
			this.anIntArray309 = new int[local85 + 1];
			for (local95 = 0; local95 <= local85; local95++) {
				this.anIntArray309[local95] = arg0.method269();
				if (this.anIntArray309[local95] == 65535) {
					this.anIntArray309[local95] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean151 = false;
		} else if (arg1 == 109) {
			this.aBoolean150 = false;
		} else if (arg1 != 111) {
			if (arg1 == 113) {
				arg0.method269();
				arg0.method269();
			} else if (arg1 == 114) {
				arg0.method221();
				arg0.method221();
			} else if (arg1 == 115) {
				this.aShort3 = (short) (arg0.method260() * 4);
				this.aShort4 = (short) (arg0.method260() * 4);
			}
		}
	}
}
