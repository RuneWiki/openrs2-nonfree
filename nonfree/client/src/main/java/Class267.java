import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class267 {

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
	private int anInt6920;

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "Lclient!e;")
	private Class8 aClass8_7;

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "Lclient!i;")
	private Class1_Sub3_Sub11 aClass1_Sub3_Sub11_6;

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
	private int anInt6925;

	@OriginalMember(owner = "client!vr", name = "r", descriptor = "[Z")
	private boolean[] aBooleanArray152;

	@OriginalMember(owner = "client!vr", name = "t", descriptor = "Lclient!lm;")
	public Class111_Sub4 aClass111_Sub4_7;

	@OriginalMember(owner = "client!vr", name = "E", descriptor = "I")
	private int anInt6936;

	@OriginalMember(owner = "client!vr", name = "L", descriptor = "I")
	private int anInt6941;

	@OriginalMember(owner = "client!vr", name = "M", descriptor = "Lclient!eb;")
	private Class64 aClass64_3;

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
	private int anInt6918 = -1;

	@OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
	private int anInt6924 = -32768;

	@OriginalMember(owner = "client!vr", name = "v", descriptor = "I")
	private int anInt6928 = -1;

	@OriginalMember(owner = "client!vr", name = "F", descriptor = "Z")
	private boolean aBoolean603 = false;

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "Z")
	private boolean aBoolean600 = false;

	@OriginalMember(owner = "client!vr", name = "N", descriptor = "I")
	public final int anInt6942;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "B")
	private final byte aByte93;

	@OriginalMember(owner = "client!vr", name = "u", descriptor = "B")
	private final byte aByte94;

	@OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
	public final int anInt6927;

	@OriginalMember(owner = "client!vr", name = "x", descriptor = "I")
	private int anInt6930;

	@OriginalMember(owner = "client!vr", name = "D", descriptor = "I")
	private int anInt6935;

	@OriginalMember(owner = "client!vr", name = "K", descriptor = "I")
	public final int anInt6940;

	@OriginalMember(owner = "client!vr", name = "s", descriptor = "Z")
	private final boolean aBoolean602;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!za;Lclient!fu;IIIIIIZI)V")
	public Class267(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt6942 = arg2;
		this.aByte93 = (byte) arg5;
		this.aByte94 = (byte) arg4;
		this.aBoolean603 = arg8;
		this.anInt6927 = arg3;
		this.anInt6930 = arg7;
		this.anInt6935 = arg6;
		this.anInt6940 = arg1.anInt1925;
		this.aBoolean602 = arg0.method5691() && arg1.aBoolean207 && !this.aBoolean603;
		if (arg9 != -1) {
			this.aBoolean600 = true;
		}
		this.method5512(arg9);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!za;I)V")
	public void method5502(@OriginalArg(0) Class117 arg0) {
		this.method5511(this.anInt6930, true, true, this.anInt6935, arg0, 262144);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)Z")
	public boolean method5503() {
		return this.aBoolean602;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)I")
	public int method5505() {
		return this.anInt6924;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZLclient!za;)V")
	public void method5506(@OriginalArg(1) Class117 arg0) {
		if (this.aClass1_Sub3_Sub11_6 != null) {
			Static413.method5276(this.aClass1_Sub3_Sub11_6, this.aByte93, this.anInt6935, this.anInt6930, this.aBooleanArray152);
			this.aBooleanArray152 = null;
			this.aClass1_Sub3_Sub11_6 = null;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)V")
	public void method5509(@OriginalArg(1) int arg0) {
		this.aBoolean600 = true;
		this.method5512(arg0);
	}

	@OriginalMember(owner = "client!vr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass111_Sub4_7 != null) {
			this.aClass111_Sub4_7.method3423();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IZBZILclient!za;I)Lclient!e;")
	public Class8 method5511(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class117 arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Class87 local11 = Static86.aClass248_7.method5246(this.anInt6940);
		if (local11.anIntArray170 != null) {
			local11 = local11.method1571(Static32.aClass4_1);
		}
		if (local11 == null) {
			this.method5506(arg4);
			this.anInt6918 = -1;
			this.anInt6928 = this.anInt6925;
			return null;
		}
		if (!this.aBoolean600 && this.anInt6918 != local11.anInt1925) {
			this.aClass8_7 = null;
			this.method5512(-1);
		}
		this.method5515(arg3, arg0);
		@Pc(75) boolean local75 = arg2 & this.aBoolean602 & Static126.aClass19_Sub1_1.method3337(Static214.anInt3968) != 0;
		@Pc(115) boolean local115 = local75 & (this.anInt6918 != local11.anInt1925 || (this.anInt6925 != this.anInt6928 || this.aClass64_3 != null && (this.aClass64_3.aBoolean143 || Static463.aBoolean651) && this.anInt6936 != this.anInt6925) && Static126.aClass19_Sub1_1.method3337(Static214.anInt3968) >= 2);
		if (arg1 && !local115) {
			this.anInt6928 = this.anInt6925;
			this.anInt6918 = local11.anInt1925;
			return null;
		}
		if (local115) {
			Static413.method5276(this.aClass1_Sub3_Sub11_6, this.aByte93, this.anInt6935, this.anInt6930, this.aBooleanArray152);
		}
		@Pc(147) Class139 local147 = Static452.aClass139Array3[this.aByte93];
		@Pc(163) Class139 local163;
		if (this.aBoolean603) {
			local163 = Static157.aClass139Array1[0];
		} else {
			local163 = this.aByte93 < 3 ? Static452.aClass139Array3[this.aByte93 + 1] : null;
		}
		@Pc(171) Class8 local171 = null;
		if (this.aClass64_3 != null) {
			if (local115) {
				arg5 |= 0x40000;
			}
			local171 = local11.method1566(arg5, this.aClass64_3, this.anInt6925, local147.ca(this.anInt6935, this.anInt6930), local147, this.anInt6935, arg4, this.anInt6942 == 11 ? 10 : this.anInt6942, this.anInt6941, this.anInt6942 == 11 ? this.anInt6927 + 4 : this.anInt6927, local163, this.anInt6930, this.anInt6936);
			if (local171 == null) {
				this.aBooleanArray152 = null;
				this.aClass1_Sub3_Sub11_6 = null;
				this.anInt6924 = 0;
			} else {
				if (local115) {
					if (this.aBooleanArray152 == null) {
						this.aBooleanArray152 = new boolean[4];
					}
					this.aClass1_Sub3_Sub11_6 = local171.EA(this.aClass1_Sub3_Sub11_6);
					Static7.method118(this.aClass1_Sub3_Sub11_6, this.aByte93, arg3, arg0, this.aBooleanArray152);
				}
				this.anInt6924 = local171.B();
			}
			this.aClass8_7 = null;
		} else if (this.aClass8_7 != null && arg5 == (this.aClass8_7.RA() & arg5) && this.anInt6918 == local11.anInt1925) {
			local171 = this.aClass8_7;
		} else {
			if (this.aClass8_7 != null) {
				arg5 |= this.aClass8_7.RA();
			}
			@Pc(249) Class212 local249 = local11.method1564(arg4, this.anInt6942 == 11 ? 10 : this.anInt6942, arg5, this.anInt6942 == 11 ? this.anInt6927 + 4 : this.anInt6927, this.anInt6930, this.anInt6935, local115, local147, local147.ca(this.anInt6935, this.anInt6930), local163);
			if (local249 == null) {
				this.aBooleanArray152 = null;
				this.aClass8_7 = null;
				this.anInt6924 = 0;
				this.aClass1_Sub3_Sub11_6 = null;
			} else {
				local171 = local249.aClass8_6;
				this.aClass8_7 = local249.aClass8_6;
				if (local115) {
					this.aClass1_Sub3_Sub11_6 = local249.aClass1_Sub3_Sub11_5;
					this.aBooleanArray152 = null;
					Static7.method118(this.aClass1_Sub3_Sub11_6, this.aByte93, arg3, arg0, null);
				}
				this.anInt6924 = local171.B();
			}
		}
		this.anInt6935 = arg3;
		this.anInt6918 = local11.anInt1925;
		this.anInt6928 = this.anInt6925;
		this.anInt6930 = arg0;
		return local171;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(II)V")
	private void method5512(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class87 local18 = Static86.aClass248_7.method5246(this.anInt6940);
			@Pc(20) Class87 local20 = local18;
			if (local18.anIntArray170 != null) {
				local18 = local18.method1571(Static32.aClass4_1);
			}
			if (local18 == null) {
				return;
			}
			if (local20 == local18) {
				local20 = null;
			}
			if (local18.anIntArray169 != null) {
				if (this.aClass64_3 != null && local18.method1569(this.aClass64_3.anInt1195)) {
					return;
				}
				local7 = local18.method1572();
				if (this.anInt6918 != local18.anInt1925) {
					local9 = local18.aBoolean212;
				}
			} else if (local18.anInt1927 == -1) {
				if (local20 != null && local20.anIntArray169 != null) {
					if (this.aClass64_3 != null && local20.method1569(this.aClass64_3.anInt1195)) {
						return;
					}
					local7 = local20.method1572();
					if (local20.anInt1925 != this.anInt6918) {
						local9 = local20.aBoolean212;
					}
				} else if (local20 != null && local20.anInt1927 != -1 && this.anInt6918 != local20.anInt1925) {
					local9 = local20.aBoolean212;
					local7 = local20.anInt1927;
				}
			} else if (local18.anInt1925 != this.anInt6918) {
				local9 = local18.aBoolean212;
				local7 = local18.anInt1927;
			}
		}
		if (local7 == -1) {
			this.aClass64_3 = null;
			return;
		}
		this.aClass8_7 = null;
		if (this.aClass64_3 == null || this.aClass64_3.anInt1195 != local7) {
			this.aClass64_3 = Static402.aClass37_2.method665(local7);
		} else if (this.aClass64_3.anInt1204 == 0) {
			return;
		}
		if (this.aClass64_3.anIntArray127 == null) {
			this.aClass64_3 = null;
			return;
		}
		if (local9) {
			this.anInt6925 = (int) ((double) this.aClass64_3.anIntArray127.length * Math.random());
			this.anInt6941 = (int) ((double) this.aClass64_3.anIntArray126[this.anInt6925] * Math.random()) + 1;
		} else {
			this.anInt6941 = 1;
			this.anInt6925 = 0;
		}
		this.anInt6936 = this.anInt6925 + 1;
		if (this.anInt6936 < 0 || this.aClass64_3.anIntArray127.length <= this.anInt6936) {
			this.anInt6936 = -1;
		}
		this.anInt6920 = Static98.anInt1304 - this.anInt6941;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!e;ZILclient!za;ZIII)V")
	public void method5513(@OriginalArg(0) Class8 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class117 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) Class40[] local6 = arg0.method5995();
		@Pc(9) Class230[] local9 = arg0.method5988();
		if ((this.aClass111_Sub4_7 == null || this.aClass111_Sub4_7.aBoolean398) && (local6 != null || local9 != null)) {
			@Pc(33) Class87 local33 = Static86.aClass248_7.method5246(this.anInt6940);
			if (local33.anIntArray170 != null) {
				local33 = local33.method1571(Static32.aClass4_1);
			}
			if (local33 != null) {
				this.aClass111_Sub4_7 = new Class111_Sub4(Static98.anInt1304);
			}
		}
		if (this.aClass111_Sub4_7 == null) {
			return;
		}
		if (arg1) {
			this.aClass111_Sub4_7.method3414(arg3, (long) Static98.anInt1304, local6, local9);
		} else {
			this.aClass111_Sub4_7.method3420((long) Static98.anInt1304);
		}
		this.aClass111_Sub4_7.method3419(this.aByte94, arg4, arg2, arg6, arg5);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)V")
	private void method5515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass64_3 == null) {
				if (this.aBoolean600) {
					return;
				}
				this.method5512(-1);
				if (this.aClass64_3 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static98.anInt1304 - this.anInt6920;
			if (local30 > 100 && this.aClass64_3.anInt1191 > 0) {
				@Pc(47) int local47 = this.aClass64_3.anIntArray127.length - this.aClass64_3.anInt1191;
				while (this.anInt6925 < local47 && this.aClass64_3.anIntArray126[this.anInt6925] < local30) {
					local30 -= this.aClass64_3.anIntArray126[this.anInt6925];
					this.anInt6925++;
				}
				if (this.anInt6925 >= local47) {
					@Pc(86) int local86 = 0;
					for (@Pc(88) int local88 = local47; local88 < this.aClass64_3.anIntArray127.length; local88++) {
						local86 += this.aClass64_3.anIntArray126[local88];
					}
					local30 %= local86;
				}
				this.anInt6936 = this.anInt6925 + 1;
				if (this.aClass64_3.anIntArray127.length <= this.anInt6936) {
					this.anInt6936 -= this.aClass64_3.anInt1191;
					if (this.anInt6936 < 0 || this.anInt6936 >= this.aClass64_3.anIntArray127.length) {
						this.anInt6936 = -1;
					}
				}
			}
			while (local30 > this.aClass64_3.anIntArray126[this.anInt6925]) {
				Static379.method131(this.anInt6925, arg0, this.aClass64_3, this.aByte94, false, arg1);
				local30 -= this.aClass64_3.anIntArray126[this.anInt6925];
				this.anInt6925++;
				if (this.anInt6925 >= this.aClass64_3.anIntArray127.length) {
					this.anInt6925 -= this.aClass64_3.anInt1191;
					if (this.anInt6925 < 0 || this.anInt6925 >= this.aClass64_3.anIntArray127.length) {
						this.aClass64_3 = null;
						continue label80;
					}
				}
				this.anInt6936 = this.anInt6925 + 1;
				if (this.aClass64_3.anIntArray127.length <= this.anInt6936) {
					this.anInt6936 -= this.aClass64_3.anInt1191;
					if (this.anInt6936 < 0 || this.aClass64_3.anIntArray127.length <= this.anInt6936) {
						this.anInt6936 = -1;
					}
				}
			}
			this.anInt6941 = local30;
			this.anInt6920 = Static98.anInt1304 - local30;
			return;
		}
	}
}
