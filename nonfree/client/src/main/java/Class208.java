import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class208 {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
	public int anInt5991;

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "Lclient!gf;")
	public Class88 aClass88_4;

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
	public int anInt5995;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
	private int anInt5996;

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
	private int anInt5998;

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
	public int anInt6001;

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
	private int anInt6002;

	@OriginalMember(owner = "client!rk", name = "t", descriptor = "Lclient!mn;")
	private Class167 aClass167_24;

	@OriginalMember(owner = "client!rk", name = "z", descriptor = "I")
	public int anInt6009;

	@OriginalMember(owner = "client!rk", name = "D", descriptor = "Ljava/lang/String;")
	public String aString55;

	@OriginalMember(owner = "client!rk", name = "E", descriptor = "[I")
	public int[] anIntArray574;

	@OriginalMember(owner = "client!rk", name = "L", descriptor = "I")
	private int anInt6018;

	@OriginalMember(owner = "client!rk", name = "P", descriptor = "I")
	public int anInt6020;

	@OriginalMember(owner = "client!rk", name = "R", descriptor = "I")
	public int anInt6022;

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "Z")
	public boolean aBoolean386 = true;

	@OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
	private int anInt6007 = -1;

	@OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
	private int anInt6011 = -1;

	@OriginalMember(owner = "client!rk", name = "N", descriptor = "Z")
	public boolean aBoolean388 = true;

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
	public int anInt6003 = -1;

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "Z")
	public boolean aBoolean387 = true;

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
	public int anInt6004 = -1;

	@OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
	public int anInt6010 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rk", name = "M", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray41 = new String[5];

	@OriginalMember(owner = "client!rk", name = "K", descriptor = "I")
	public int anInt6017 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rk", name = "O", descriptor = "I")
	private int anInt6019 = -1;

	@OriginalMember(owner = "client!rk", name = "F", descriptor = "I")
	private int anInt6013 = -1;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
	public int anInt5993 = 0;

	@OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
	public int anInt6008 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rk", name = "T", descriptor = "Z")
	public boolean aBoolean389 = false;

	@OriginalMember(owner = "client!rk", name = "C", descriptor = "I")
	public int anInt6012 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
	private int anInt5992 = -1;

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
	public int anInt6000 = -1;

	@OriginalMember(owner = "client!rk", name = "J", descriptor = "I")
	public int anInt6016 = -1;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZBLclient!za;)Lclient!o;")
	public Class80 method4752(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class50 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt6004 : this.anInt6000;
		@Pc(18) int local18 = arg1.anInt7375 << 29 | local11;
		@Pc(33) Class80 local33 = (Class80) this.aClass88_4.aClass267_22.method6014((long) local18);
		if (local33 != null) {
			return local33;
		} else if (this.aClass88_4.aClass187_51.method4282(local11)) {
			@Pc(53) Class66 local53 = Static463.method1657(this.aClass88_4.aClass187_51, local11, 0);
			if (local53 != null) {
				local33 = arg1.method5861(local53);
				this.aClass88_4.aClass267_22.method6008(local33, (long) local18);
			}
			return local33;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
	public String method4753(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass167_24 == null) {
			return arg0;
		} else {
			@Pc(16) Class10_Sub18 local16 = (Class10_Sub18) this.aClass167_24.method3709((long) arg1);
			return local16 == null ? arg0 : local16.aString15;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
	public void method4754() {
		if (this.anIntArray574 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray574.length; local18 += 2) {
			if (this.anInt6008 > this.anIntArray574[local18]) {
				this.anInt6008 = this.anIntArray574[local18];
			} else if (this.anInt6017 < this.anIntArray574[local18]) {
				this.anInt6017 = this.anIntArray574[local18];
			}
			if (this.anIntArray574[local18 + 1] < this.anInt6012) {
				this.anInt6012 = this.anIntArray574[local18 + 1];
			} else if (this.anInt6010 < this.anIntArray574[local18 + 1]) {
				this.anInt6010 = this.anIntArray574[local18 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!za;)Lclient!o;")
	public Class80 method4755(@OriginalArg(1) Class50 arg0) {
		@Pc(20) Class80 local20 = (Class80) this.aClass88_4.aClass267_22.method6014((long) (arg0.anInt7375 << 29 | 0x20000 | this.anInt5992));
		if (local20 != null) {
			return local20;
		}
		this.aClass88_4.aClass187_51.method4282(this.anInt5992);
		@Pc(46) Class66 local46 = Static463.method1657(this.aClass88_4.aClass187_51, this.anInt5992, 0);
		if (local46 != null) {
			local20 = arg0.method5861(local46);
			this.aClass88_4.aClass267_22.method6008(local20, (long) (arg0.anInt7375 << 29 | this.anInt5992 | 0x20000));
		}
		return local20;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZLclient!nn;)V")
	private void method4756(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt6000 = arg1.method2485();
		} else if (arg0 == 2) {
			this.anInt6004 = arg1.method2485();
		} else if (arg0 == 3) {
			this.aString55 = arg1.method2478();
		} else if (arg0 == 4) {
			this.anInt5991 = arg1.method2507();
		} else if (arg0 == 5) {
			this.anInt6016 = arg1.method2507();
		} else if (arg0 == 6) {
			this.anInt5993 = arg1.method2502();
		} else {
			@Pc(52) int local52;
			if (arg0 == 7) {
				local52 = arg1.method2502();
				if ((local52 & 0x1) == 0) {
					this.aBoolean386 = false;
				}
				if ((local52 & 0x2) == 2) {
					this.aBoolean389 = true;
				}
			} else if (arg0 == 8) {
				this.aBoolean387 = arg1.method2502() == 1;
			} else if (arg0 == 9) {
				this.anInt6019 = arg1.method2485();
				if (this.anInt6019 == 65535) {
					this.anInt6019 = -1;
				}
				this.anInt6011 = arg1.method2485();
				if (this.anInt6011 == 65535) {
					this.anInt6011 = -1;
				}
				this.anInt5998 = arg1.method2459();
				this.anInt5996 = arg1.method2459();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray41[arg0 - 10] = arg1.method2478();
			} else {
				@Pc(149) int local149;
				if (arg0 == 15) {
					local52 = arg1.method2502();
					this.anIntArray574 = new int[local52 * 2];
					for (local149 = 0; local149 < local52 * 2; local149++) {
						this.anIntArray574[local149] = arg1.method2492();
					}
					this.anInt6009 = arg1.method2459();
					this.anInt6020 = arg1.method2459();
				} else if (arg0 == 16) {
					this.aBoolean388 = false;
				} else if (arg0 == 17) {
					this.aString54 = arg1.method2478();
				} else if (arg0 == 18) {
					this.anInt5992 = arg1.method2485();
				} else if (arg0 == 19) {
					this.anInt6003 = arg1.method2485();
				} else if (arg0 == 20) {
					this.anInt6013 = arg1.method2485();
					if (this.anInt6013 == 65535) {
						this.anInt6013 = -1;
					}
					this.anInt6007 = arg1.method2485();
					if (this.anInt6007 == 65535) {
						this.anInt6007 = -1;
					}
					this.anInt6018 = arg1.method2459();
					this.anInt6002 = arg1.method2459();
				} else if (arg0 == 21) {
					this.anInt6022 = arg1.method2459();
				} else if (arg0 == 22) {
					this.anInt5995 = arg1.method2459();
				} else if (arg0 == 249) {
					local52 = arg1.method2502();
					if (this.aClass167_24 == null) {
						local149 = Static186.method3002(local52);
						this.aClass167_24 = new Class167(local149);
					}
					for (local149 = 0; local149 < local52; local149++) {
						@Pc(266) boolean local266 = arg1.method2502() == 1;
						@Pc(270) int local270 = arg1.method2507();
						@Pc(279) Class10 local279;
						if (local266) {
							local279 = new Class10_Sub18(arg1.method2478());
						} else {
							local279 = new Class10_Sub12(arg1.method2459());
						}
						this.aClass167_24.method3705(local279, (long) local270);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!nn;B)V")
	public void method4757(@OriginalArg(0) Class10_Sub8 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2502();
			if (local7 == 0) {
				return;
			}
			this.method4756(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)I")
	public int method4758(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass167_24 == null) {
			return arg1;
		} else {
			@Pc(25) Class10_Sub12 local25 = (Class10_Sub12) this.aClass167_24.method3709((long) arg0);
			return local25 == null ? arg1 : local25.anInt1159;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!hp;)Z")
	public boolean method4759(@OriginalArg(1) Interface5 arg0) {
		@Pc(22) int local22;
		if (this.anInt6011 == -1) {
			if (this.anInt6019 == -1) {
				return true;
			}
			local22 = arg0.method4477(this.anInt6019);
		} else {
			local22 = arg0.method4478(this.anInt6011);
		}
		if (this.anInt5998 > local22 || local22 > this.anInt5996) {
			return false;
		}
		@Pc(70) int local70;
		if (this.anInt6007 == -1) {
			if (this.anInt6013 == -1) {
				return true;
			}
			local70 = arg0.method4477(this.anInt6013);
		} else {
			local70 = arg0.method4478(this.anInt6007);
		}
		return this.anInt6018 <= local70 && this.anInt6002 >= local70;
	}
}
