import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class2_Sub2_Sub15 extends Class2_Sub2 {

	@OriginalMember(owner = "client!sd", name = "M", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!sd", name = "T", descriptor = "[I")
	private int[] anIntArray286;

	@OriginalMember(owner = "client!sd", name = "db", descriptor = "[I")
	public int[] anIntArray288;

	@OriginalMember(owner = "client!sd", name = "jb", descriptor = "[I")
	private int[] anIntArray289;

	@OriginalMember(owner = "client!sd", name = "nb", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!sd", name = "tb", descriptor = "[S")
	private short[] aShortArray36;

	@OriginalMember(owner = "client!sd", name = "vb", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!sd", name = "Ab", descriptor = "I")
	public int anInt3219;

	@OriginalMember(owner = "client!sd", name = "J", descriptor = "Z")
	public boolean aBoolean134 = false;

	@OriginalMember(owner = "client!sd", name = "N", descriptor = "Lclient!lf;")
	public Class49 aClass49_1449 = Static49.aClass49_558;

	@OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
	private int anInt3199 = 0;

	@OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
	public int anInt3205 = -1;

	@OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
	public int anInt3207 = -1;

	@OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
	private int anInt3202 = -1;

	@OriginalMember(owner = "client!sd", name = "bb", descriptor = "I")
	private int anInt3204 = 128;

	@OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
	private int anInt3200 = 0;

	@OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
	public int anInt3197 = -1;

	@OriginalMember(owner = "client!sd", name = "Z", descriptor = "I")
	public int anInt3203 = -1;

	@OriginalMember(owner = "client!sd", name = "hb", descriptor = "I")
	public int anInt3208 = -1;

	@OriginalMember(owner = "client!sd", name = "ib", descriptor = "I")
	public int anInt3209 = 1;

	@OriginalMember(owner = "client!sd", name = "gb", descriptor = "Z")
	public boolean aBoolean136 = true;

	@OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
	public int anInt3196 = -1;

	@OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
	public int anInt3201 = -1;

	@OriginalMember(owner = "client!sd", name = "ub", descriptor = "I")
	public int anInt3216 = 32;

	@OriginalMember(owner = "client!sd", name = "xb", descriptor = "I")
	public int anInt3217 = -1;

	@OriginalMember(owner = "client!sd", name = "mb", descriptor = "I")
	private int anInt3211 = 128;

	@OriginalMember(owner = "client!sd", name = "lb", descriptor = "S")
	public short aShort33 = 0;

	@OriginalMember(owner = "client!sd", name = "W", descriptor = "Z")
	public boolean aBoolean135 = true;

	@OriginalMember(owner = "client!sd", name = "zb", descriptor = "Z")
	public boolean aBoolean137 = true;

	@OriginalMember(owner = "client!sd", name = "qb", descriptor = "I")
	private int anInt3214 = -1;

	@OriginalMember(owner = "client!sd", name = "pb", descriptor = "I")
	public int anInt3213 = -1;

	@OriginalMember(owner = "client!sd", name = "rb", descriptor = "[Lclient!lf;")
	public final Class49[] aClass49Array18 = new Class49[5];

	@OriginalMember(owner = "client!sd", name = "Y", descriptor = "S")
	public short aShort32 = 0;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)Lclient!sd;")
	public Class2_Sub2_Sub15 method2469() {
		@Pc(5) int local5 = -1;
		if (this.anInt3214 != -1) {
			local5 = Static102.method1754(this.anInt3214);
		} else if (this.anInt3202 != -1) {
			local5 = Static165.anIntArray317[this.anInt3202];
		}
		return local5 < 0 || this.anIntArray288.length <= local5 || this.anIntArray288[local5] == -1 ? null : Static169.method2802(this.anIntArray288[local5]);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BILclient!bi;)Lclient!ue;")
	public Class2_Sub2_Sub3_Sub4 method2471(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub2_Sub4 arg1) {
		if (this.anIntArray288 != null) {
			@Pc(12) Class2_Sub2_Sub15 local12 = this.method2469();
			return local12 == null ? null : local12.method2471(arg0, arg1);
		} else if (this.anIntArray286 == null) {
			return null;
		} else {
			@Pc(35) Class2_Sub2_Sub3_Sub4 local35 = (Class2_Sub2_Sub3_Sub4) Static34.aClass74_29.method2345((long) this.anInt3219);
			if (local35 == null) {
				@Pc(39) boolean local39 = false;
				for (@Pc(41) int local41 = 0; local41 < this.anIntArray286.length; local41++) {
					if (!Static121.aClass11_97.method2063(0, this.anIntArray286[local41])) {
						local39 = true;
					}
				}
				if (local39) {
					return null;
				}
				@Pc(73) Class2_Sub2_Sub3_Sub6[] local73 = new Class2_Sub2_Sub3_Sub6[this.anIntArray286.length];
				for (@Pc(75) int local75 = 0; local75 < this.anIntArray286.length; local75++) {
					local73[local75] = Static119.method2029(Static121.aClass11_97, this.anIntArray286[local75]);
				}
				@Pc(104) Class2_Sub2_Sub3_Sub6 local104;
				if (local73.length == 1) {
					local104 = local73[0];
				} else {
					local104 = new Class2_Sub2_Sub3_Sub6(local73, local73.length);
				}
				@Pc(115) int local115;
				if (this.aShortArray34 != null) {
					for (local115 = 0; local115 < this.aShortArray34.length; local115++) {
						local104.method2025(this.aShortArray34[local115], this.aShortArray35[local115]);
					}
				}
				if (this.aShortArray37 != null) {
					for (local115 = 0; local115 < this.aShortArray37.length; local115++) {
						local104.method2034(this.aShortArray37[local115], this.aShortArray36[local115]);
					}
				}
				local35 = local104.method2027(64, 768, -50, -10, -50, true);
				Static34.aClass74_29.method2341((long) this.anInt3219, local35);
			}
			if (arg1 != null) {
				local35 = arg1.method363(local35, arg0);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILclient!ja;)V")
	private void method2473(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		@Pc(69) int local69;
		@Pc(79) int local79;
		if (arg0 == 1) {
			local69 = arg1.method2962();
			this.anIntArray289 = new int[local69];
			for (local79 = 0; local79 < local69; local79++) {
				this.anIntArray289[local79] = arg1.method2933();
			}
		} else if (arg0 == 2) {
			this.aClass49_1449 = arg1.method2926();
		} else if (arg0 == 12) {
			this.anInt3209 = arg1.method2962();
		} else if (arg0 == 13) {
			this.anInt3217 = arg1.method2933();
		} else if (arg0 == 14) {
			this.anInt3205 = arg1.method2933();
		} else if (arg0 == 15) {
			this.anInt3208 = arg1.method2933();
		} else if (arg0 == 16) {
			this.anInt3203 = arg1.method2933();
		} else if (arg0 == 17) {
			this.anInt3205 = arg1.method2933();
			this.anInt3207 = arg1.method2933();
			this.anInt3196 = arg1.method2933();
			this.anInt3213 = arg1.method2933();
		} else {
			if (arg0 < 30 || arg0 >= 35) {
				if (arg0 == 40) {
					local69 = arg1.method2962();
					this.aShortArray34 = new short[local69];
					this.aShortArray35 = new short[local69];
					for (local79 = 0; local79 < local69; local79++) {
						this.aShortArray34[local79] = (short) arg1.method2933();
						this.aShortArray35[local79] = (short) arg1.method2933();
					}
					return;
				} else if (arg0 == 41) {
					local69 = arg1.method2962();
					this.aShortArray36 = new short[local69];
					this.aShortArray37 = new short[local69];
					for (local79 = 0; local79 < local69; local79++) {
						this.aShortArray37[local79] = (short) arg1.method2933();
						this.aShortArray36[local79] = (short) arg1.method2933();
					}
					return;
				} else if (arg0 == 60) {
					local69 = arg1.method2962();
					this.anIntArray286 = new int[local69];
					for (local79 = 0; local79 < local69; local79++) {
						this.anIntArray286[local79] = arg1.method2933();
					}
					return;
				} else if (arg0 == 93) {
					this.aBoolean135 = false;
					return;
				} else if (arg0 == 95) {
					this.anInt3197 = arg1.method2933();
					return;
				} else if (arg0 == 97) {
					this.anInt3211 = arg1.method2933();
					return;
				} else if (arg0 == 98) {
					this.anInt3204 = arg1.method2933();
					return;
				} else if (arg0 == 99) {
					this.aBoolean134 = true;
					return;
				} else if (arg0 == 100) {
					this.anInt3200 = arg1.method2948();
					return;
				} else if (arg0 == 101) {
					this.anInt3199 = arg1.method2948() * 5;
					return;
				} else if (arg0 == 102) {
					this.anInt3201 = arg1.method2933();
					return;
				} else if (arg0 == 103) {
					this.anInt3216 = arg1.method2933();
					return;
				} else if (arg0 == 106) {
					this.anInt3214 = arg1.method2933();
					if (this.anInt3214 == 65535) {
						this.anInt3214 = -1;
					}
					this.anInt3202 = arg1.method2933();
					if (this.anInt3202 == 65535) {
						this.anInt3202 = -1;
					}
					local69 = arg1.method2962();
					this.anIntArray288 = new int[local69 + 1];
					for (local79 = 0; local79 <= local69; local79++) {
						this.anIntArray288[local79] = arg1.method2933();
						if (this.anIntArray288[local79] == 65535) {
							this.anIntArray288[local79] = -1;
						}
					}
					return;
				} else if (arg0 == 107) {
					this.aBoolean137 = false;
					return;
				} else {
					if (arg0 == 109) {
						this.aBoolean136 = false;
					} else if (arg0 != 111) {
						if (arg0 != 113) {
							if (arg0 == 114) {
								arg1.method2948();
								arg1.method2948();
							} else if (arg0 == 115) {
								this.aShort33 = (short) (arg1.method2962() * 4);
								this.aShort32 = (short) (arg1.method2962() * 4);
								return;
							}
							return;
						}
						arg1.method2933();
						arg1.method2933();
						return;
					}
					return;
				}
			}
			this.aClass49Array18[arg0 - 30] = arg1.method2926();
			if (this.aClass49Array18[arg0 - 30].method1645(Static141.aClass49_1360)) {
				this.aClass49Array18[arg0 - 30] = null;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)Z")
	public boolean method2475() {
		if (this.anIntArray288 == null) {
			return true;
		}
		@Pc(10) int local10 = -1;
		if (this.anInt3214 != -1) {
			local10 = Static102.method1754(this.anInt3214);
		} else if (this.anInt3202 != -1) {
			local10 = Static165.anIntArray317[this.anInt3202];
		}
		return local10 >= 0 && local10 < this.anIntArray288.length && this.anIntArray288[local10] != -1;
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V")
	public void method2478() {
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!bi;IILclient!bi;)Lclient!ue;")
	public Class2_Sub2_Sub3_Sub4 method2479(@OriginalArg(1) Class2_Sub2_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub2_Sub4 arg3) {
		if (this.anIntArray288 != null) {
			@Pc(12) Class2_Sub2_Sub15 local12 = this.method2469();
			return local12 == null ? null : local12.method2479(arg0, arg1, arg2, arg3);
		}
		@Pc(32) Class2_Sub2_Sub3_Sub4 local32 = (Class2_Sub2_Sub3_Sub4) Static77.aClass74_54.method2345((long) this.anInt3219);
		if (local32 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anIntArray289.length; local38++) {
				if (!Static121.aClass11_97.method2063(0, this.anIntArray289[local38])) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(70) Class2_Sub2_Sub3_Sub6[] local70 = new Class2_Sub2_Sub3_Sub6[this.anIntArray289.length];
			for (@Pc(72) int local72 = 0; local72 < this.anIntArray289.length; local72++) {
				local70[local72] = Static119.method2029(Static121.aClass11_97, this.anIntArray289[local72]);
			}
			@Pc(102) Class2_Sub2_Sub3_Sub6 local102;
			if (local70.length == 1) {
				local102 = local70[0];
			} else {
				local102 = new Class2_Sub2_Sub3_Sub6(local70, local70.length);
			}
			@Pc(116) int local116;
			if (this.aShortArray34 != null) {
				for (local116 = 0; local116 < this.aShortArray34.length; local116++) {
					local102.method2025(this.aShortArray34[local116], this.aShortArray35[local116]);
				}
			}
			if (this.aShortArray37 != null) {
				for (local116 = 0; local116 < this.aShortArray37.length; local116++) {
					local102.method2034(this.aShortArray37[local116], this.aShortArray36[local116]);
				}
			}
			local32 = local102.method2027(this.anInt3200 + 64, 850 - -this.anInt3199, -30, -50, -30, true);
			Static77.aClass74_54.method2341((long) this.anInt3219, local32);
		}
		@Pc(199) Class2_Sub2_Sub3_Sub4 local199;
		if (arg0 != null && arg3 != null) {
			local199 = arg0.method361(arg3, arg2, local32, arg1);
		} else if (arg0 != null) {
			local199 = arg0.method369(arg2, local32);
		} else if (arg3 == null) {
			local199 = local32.method1041(true);
		} else {
			local199 = arg3.method369(arg1, local32);
		}
		if (this.anInt3211 != 128 || this.anInt3204 != 128) {
			local199.method1048(this.anInt3211, this.anInt3204, this.anInt3211);
		}
		return local199;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!ja;)V")
	public void method2480(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2962();
			if (local5 == 0) {
				return;
			}
			this.method2473(local5, arg0);
		}
	}
}
