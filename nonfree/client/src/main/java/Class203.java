import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class203 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
	public int anInt5944;

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
	public int anInt5947;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
	public int anInt5949;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
	private int anInt5952;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
	private int anInt5953;

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "Ljava/lang/String;")
	public String aString62;

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
	public int anInt5960;

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "Ljava/lang/String;")
	public String aString63;

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "I")
	public int anInt5961;

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "[I")
	public int[] anIntArray496;

	@OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
	private int anInt5963;

	@OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
	private int anInt5964;

	@OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
	public int anInt5965;

	@OriginalMember(owner = "client!qg", name = "C", descriptor = "Lclient!fq;")
	public Class84 aClass84_3;

	@OriginalMember(owner = "client!qg", name = "P", descriptor = "Lclient!ru;")
	private Class220 aClass220_32;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
	private int anInt5946 = -1;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
	private int anInt5945 = -1;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
	public int anInt5948 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
	public int anInt5962 = -1;

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "Z")
	public boolean aBoolean417 = true;

	@OriginalMember(owner = "client!qg", name = "L", descriptor = "Z")
	public boolean aBoolean419 = false;

	@OriginalMember(owner = "client!qg", name = "H", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray55 = new String[5];

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
	public int anInt5959 = -1;

	@OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
	public int anInt5967 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qg", name = "N", descriptor = "I")
	private int anInt5972 = -1;

	@OriginalMember(owner = "client!qg", name = "J", descriptor = "I")
	private int anInt5969 = -1;

	@OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
	public int anInt5975 = -1;

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
	public int anInt5956 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!qg", name = "F", descriptor = "Z")
	public boolean aBoolean418 = true;

	@OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
	public int anInt5974 = -1;

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
	public int anInt5955 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!qg", name = "I", descriptor = "I")
	public int anInt5968 = 0;

	@OriginalMember(owner = "client!qg", name = "U", descriptor = "I")
	private int anInt5977 = -1;

	@OriginalMember(owner = "client!qg", name = "T", descriptor = "Z")
	public boolean aBoolean420 = true;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/String;Z)Ljava/lang/String;")
	public String method4734(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass220_32 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub29 local16 = (Class2_Sub29) this.aClass220_32.method5099((long) arg0);
			return local16 == null ? arg1 : local16.aString43;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZBLclient!za;)Lclient!o;")
	public Class41 method4736(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class75 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt5974 : this.anInt5962;
		@Pc(18) int local18 = arg1.anInt7407 << 29 | local11;
		@Pc(27) Class41 local27 = (Class41) this.aClass84_3.aClass188_26.method4158((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass84_3.aClass171_32.method3666(local11)) {
			@Pc(53) Class190 local53 = Static470.method4242(this.aClass84_3.aClass171_32, local11, 0);
			if (local53 != null) {
				local27 = arg1.method5986(local53);
				this.aClass84_3.aClass188_26.method4155((long) local18, local27);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!hw;IB)V")
	private void method4737(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5962 = arg0.method6148();
		} else if (arg1 == 2) {
			this.anInt5974 = arg0.method6148();
		} else if (arg1 == 3) {
			this.aString62 = arg0.method6141();
		} else if (arg1 == 4) {
			this.anInt5965 = arg0.method6145();
		} else if (arg1 == 5) {
			this.anInt5959 = arg0.method6145();
		} else if (arg1 == 6) {
			this.anInt5968 = arg0.method6138();
		} else {
			@Pc(46) int local46;
			if (arg1 == 7) {
				local46 = arg0.method6138();
				if ((local46 & 0x1) == 0) {
					this.aBoolean418 = false;
				}
				if ((local46 & 0x2) == 2) {
					this.aBoolean419 = true;
				}
			} else if (arg1 == 8) {
				this.aBoolean417 = arg0.method6138() == 1;
			} else if (arg1 == 9) {
				this.anInt5972 = arg0.method6148();
				if (this.anInt5972 == 65535) {
					this.anInt5972 = -1;
				}
				this.anInt5945 = arg0.method6148();
				if (this.anInt5945 == 65535) {
					this.anInt5945 = -1;
				}
				this.anInt5964 = arg0.method6129();
				this.anInt5953 = arg0.method6129();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray55[arg1 - 10] = arg0.method6141();
			} else {
				@Pc(135) int local135;
				if (arg1 == 15) {
					local46 = arg0.method6138();
					this.anIntArray496 = new int[local46 * 2];
					for (local135 = 0; local135 < local46 * 2; local135++) {
						this.anIntArray496[local135] = arg0.method6149();
					}
					this.anInt5949 = arg0.method6129();
					this.anInt5944 = arg0.method6129();
				} else if (arg1 == 16) {
					this.aBoolean420 = false;
				} else if (arg1 == 17) {
					this.aString63 = arg0.method6141();
				} else if (arg1 == 18) {
					this.anInt5946 = arg0.method6148();
				} else if (arg1 == 19) {
					this.anInt5975 = arg0.method6148();
				} else if (arg1 == 20) {
					this.anInt5969 = arg0.method6148();
					if (this.anInt5969 == 65535) {
						this.anInt5969 = -1;
					}
					this.anInt5977 = arg0.method6148();
					if (this.anInt5977 == 65535) {
						this.anInt5977 = -1;
					}
					this.anInt5963 = arg0.method6129();
					this.anInt5952 = arg0.method6129();
				} else if (arg1 == 21) {
					this.anInt5961 = arg0.method6129();
				} else if (arg1 == 22) {
					this.anInt5960 = arg0.method6129();
				} else if (arg1 == 249) {
					local46 = arg0.method6138();
					if (this.aClass220_32 == null) {
						local135 = Static43.method654(local46);
						this.aClass220_32 = new Class220(local135);
					}
					for (local135 = 0; local135 < local46; local135++) {
						@Pc(287) boolean local287 = arg0.method6138() == 1;
						@Pc(291) int local291 = arg0.method6145();
						@Pc(300) Class2 local300;
						if (local287) {
							local300 = new Class2_Sub29(arg0.method6141());
						} else {
							local300 = new Class2_Sub5(arg0.method6129());
						}
						this.aClass220_32.method5104(local300, (long) local291);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBI)I")
	public int method4738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass220_32 == null) {
			return arg1;
		} else {
			@Pc(21) Class2_Sub5 local21 = (Class2_Sub5) this.aClass220_32.method5099((long) arg0);
			return local21 == null ? arg1 : local21.anInt603;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLclient!rd;)Z")
	public boolean method4740(@OriginalArg(1) Interface10 arg0) {
		@Pc(22) int local22;
		if (this.anInt5945 == -1) {
			if (this.anInt5972 == -1) {
				return true;
			}
			local22 = arg0.method2526(this.anInt5972);
		} else {
			local22 = arg0.method2525(this.anInt5945);
		}
		if (this.anInt5964 > local22 || local22 > this.anInt5953) {
			return false;
		}
		@Pc(66) int local66;
		if (this.anInt5977 == -1) {
			if (this.anInt5969 == -1) {
				return true;
			}
			local66 = arg0.method2526(this.anInt5969);
		} else {
			local66 = arg0.method2525(this.anInt5977);
		}
		return this.anInt5963 <= local66 && local66 <= this.anInt5952;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
	public void method4741() {
		if (this.anIntArray496 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray496.length; local6 += 2) {
			if (this.anInt5956 > this.anIntArray496[local6]) {
				this.anInt5956 = this.anIntArray496[local6];
			} else if (this.anInt5948 < this.anIntArray496[local6]) {
				this.anInt5948 = this.anIntArray496[local6];
			}
			if (this.anInt5967 > this.anIntArray496[local6 + 1]) {
				this.anInt5967 = this.anIntArray496[local6 + 1];
			} else if (this.anIntArray496[local6 + 1] > this.anInt5955) {
				this.anInt5955 = this.anIntArray496[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!za;Z)Lclient!o;")
	public Class41 method4742(@OriginalArg(0) Class75 arg0) {
		@Pc(20) Class41 local20 = (Class41) this.aClass84_3.aClass188_26.method4158((long) (arg0.anInt7407 << 29 | this.anInt5946 | 0x20000));
		if (local20 != null) {
			return local20;
		}
		this.aClass84_3.aClass171_32.method3666(this.anInt5946);
		@Pc(40) Class190 local40 = Static470.method4242(this.aClass84_3.aClass171_32, this.anInt5946, 0);
		if (local40 != null) {
			local20 = arg0.method5986(local40);
			this.aClass84_3.aClass188_26.method4155((long) (arg0.anInt7407 << 29 | 0x20000 | this.anInt5946), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!hw;)V")
	public void method4743(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6138();
			if (local5 == 0) {
				return;
			}
			this.method4737(arg0, local5);
		}
	}
}
