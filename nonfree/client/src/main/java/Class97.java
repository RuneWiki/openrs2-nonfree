import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class97 {

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "Lclient!ve;")
	private Class4_Sub1_Sub1 aClass4_Sub1_Sub1_2;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
	private int anInt2849;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "[Z")
	private boolean[] aBooleanArray18;

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "Lclient!lb;")
	private Class116 aClass116_1;

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "Lclient!jn;")
	private Class5 aClass5_3;

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
	private int anInt2855;

	@OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
	private int anInt2860;

	@OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
	private int anInt2862;

	@OriginalMember(owner = "client!ie", name = "L", descriptor = "Lclient!dp;")
	public Class17_Sub3 aClass17_Sub3_3;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	private int anInt2841 = -1;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "Z")
	private boolean aBoolean238 = false;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
	private int anInt2853 = -1;

	@OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
	private int anInt2856 = -32768;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
	public final int anInt2846;

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
	public final int anInt2863;

	@OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
	private int anInt2861;

	@OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
	public final int anInt2857;

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "B")
	private final byte aByte38;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
	private int anInt2848;

	@OriginalMember(owner = "client!ie", name = "I", descriptor = "B")
	private final byte aByte39;

	@OriginalMember(owner = "client!ie", name = "K", descriptor = "Z")
	private final boolean aBoolean240;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!vm;Lclient!ds;IIIIIIZI)V")
	public Class97(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt2846 = arg2;
		this.anInt2863 = arg1.anInt1346;
		this.anInt2861 = arg7;
		this.anInt2857 = arg3;
		this.aBoolean239 = arg8;
		this.aByte38 = (byte) arg5;
		this.anInt2848 = arg6;
		this.aByte39 = (byte) arg4;
		this.aBoolean240 = arg0.method4534() && arg1.aBoolean111 && !this.aBoolean239;
		if (arg9 != -1) {
			this.aBoolean238 = true;
		}
		this.method2526(arg9);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)V")
	private void method2526(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class56 local18 = Static320.method5290(this.anInt2863);
			@Pc(20) Class56 local20 = local18;
			if (local18.anIntArray151 != null) {
				local18 = local18.method1093();
			}
			if (local18 == null) {
				return;
			}
			if (local18 == local20) {
				local20 = null;
			}
			if (local18.anIntArray145 != null) {
				if (this.aClass116_1 != null && local18.method1091(this.aClass116_1.anInt3756)) {
					return;
				}
				local7 = local18.method1090();
				if (local18.anInt1346 != this.anInt2853) {
					local9 = local18.aBoolean104;
				}
			} else if (local18.anInt1348 == -1) {
				if (local20 != null && local20.anIntArray145 != null) {
					if (this.aClass116_1 != null && local20.method1091(this.aClass116_1.anInt3756)) {
						return;
					}
					local7 = local20.method1090();
					if (local20.anInt1346 != this.anInt2853) {
						local9 = local20.aBoolean104;
					}
				} else if (local20 != null && local20.anInt1348 != -1 && local20.anInt1346 != this.anInt2853) {
					local9 = local20.aBoolean104;
					local7 = local20.anInt1348;
				}
			} else if (local18.anInt1346 != this.anInt2853) {
				local9 = local18.aBoolean104;
				local7 = local18.anInt1348;
			}
		}
		if (local7 == -1) {
			this.aClass116_1 = null;
			return;
		}
		this.aClass5_3 = null;
		if (this.aClass116_1 == null || local7 != this.aClass116_1.anInt3756) {
			this.aClass116_1 = Static340.method5560(local7);
		} else if (this.aClass116_1.anInt3739 == 0) {
			return;
		}
		if (this.aClass116_1.anIntArray330 == null) {
			this.aClass116_1 = null;
			return;
		}
		if (local9) {
			this.anInt2849 = (int) (Math.random() * (double) this.aClass116_1.anIntArray330.length);
			this.anInt2860 = (int) ((double) this.aClass116_1.anIntArray329[this.anInt2849] * Math.random()) + 1;
		} else {
			this.anInt2860 = 1;
			this.anInt2849 = 0;
		}
		this.anInt2862 = this.anInt2849 + 1;
		if (this.anInt2862 < 0 || this.aClass116_1.anIntArray330.length <= this.anInt2862) {
			this.anInt2862 = -1;
		}
		this.anInt2855 = Static342.anInt6706 - this.anInt2860;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
	private void method2527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass116_1 == null) {
				if (this.aBoolean238) {
					return;
				}
				this.method2526(-1);
				if (this.aClass116_1 == null) {
					return;
				}
			}
			@Pc(33) int local33 = Static342.anInt6706 - this.anInt2855;
			if (local33 > 100 && this.aClass116_1.anInt3753 > 0) {
				@Pc(51) int local51 = this.aClass116_1.anIntArray330.length - this.aClass116_1.anInt3753;
				while (local51 > this.anInt2849 && local33 > this.aClass116_1.anIntArray329[this.anInt2849]) {
					local33 -= this.aClass116_1.anIntArray329[this.anInt2849];
					this.anInt2849++;
				}
				if (local51 <= this.anInt2849) {
					@Pc(94) int local94 = 0;
					for (@Pc(96) int local96 = local51; local96 < this.aClass116_1.anIntArray330.length; local96++) {
						local94 += this.aClass116_1.anIntArray329[local96];
					}
					local33 %= local94;
				}
				this.anInt2862 = this.anInt2849 + 1;
				if (this.anInt2862 >= this.aClass116_1.anIntArray330.length) {
					this.anInt2862 -= this.aClass116_1.anInt3753;
					if (this.anInt2862 < 0 || this.aClass116_1.anIntArray330.length <= this.anInt2862) {
						this.anInt2862 = -1;
					}
				}
			}
			while (local33 > this.aClass116_1.anIntArray329[this.anInt2849]) {
				Static291.method4975(false, this.aClass116_1, this.anInt2849, arg0, arg1);
				local33 -= this.aClass116_1.anIntArray329[this.anInt2849];
				this.anInt2849++;
				if (this.anInt2849 >= this.aClass116_1.anIntArray330.length) {
					this.anInt2849 -= this.aClass116_1.anInt3753;
					if (this.anInt2849 < 0 || this.anInt2849 >= this.aClass116_1.anIntArray330.length) {
						this.aClass116_1 = null;
						continue label80;
					}
				}
				this.anInt2862 = this.anInt2849 + 1;
				if (this.anInt2862 >= this.aClass116_1.anIntArray330.length) {
					this.anInt2862 -= this.aClass116_1.anInt3753;
					if (this.anInt2862 < 0 || this.aClass116_1.anIntArray330.length <= this.anInt2862) {
						this.anInt2862 = -1;
					}
				}
			}
			this.anInt2855 = Static342.anInt6706 - local33;
			this.anInt2860 = local33;
			return;
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(BI)V")
	public void method2528(@OriginalArg(1) int arg0) {
		this.aBoolean238 = true;
		this.method2526(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Z")
	public boolean method2531() {
		return this.aBoolean240;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!vm;IIIIZZ)Lclient!jn;")
	public Class5 method2533(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) Class56 local10 = Static320.method5290(this.anInt2863);
		if (local10.anIntArray151 != null) {
			local10 = local10.method1093();
		}
		if (local10 == null) {
			this.method2536(arg0);
			this.anInt2853 = -1;
			this.anInt2841 = this.anInt2849;
			return null;
		}
		if (!this.aBoolean238 && local10.anInt1346 != this.anInt2853) {
			this.aClass5_3 = null;
			this.method2526(-1);
		}
		this.method2527(arg3, arg1);
		@Pc(70) boolean local70 = arg4 & Static192.anInt4154 != 0 & this.aBoolean240;
		@Pc(103) boolean local103 = local70 & (local10.anInt1346 != this.anInt2853 || (this.anInt2841 != this.anInt2849 || this.aClass116_1 != null && (this.aClass116_1.aBoolean312 || Static199.aBoolean564) && this.anInt2862 != this.anInt2849) && Static192.anInt4154 >= 2);
		if (arg5 && !local103) {
			this.anInt2841 = this.anInt2849;
			this.anInt2853 = local10.anInt1346;
			return null;
		}
		if (local103) {
			Static8.method239(this.aClass4_Sub1_Sub1_2, this.aByte38, this.anInt2848, this.anInt2861, this.aBooleanArray18);
		}
		@Pc(135) Class26 local135 = Static307.aClass26Array3[this.aByte38];
		@Pc(142) Class26 local142;
		if (this.aBoolean239) {
			local142 = Static310.aClass26Array4[0];
		} else {
			local142 = this.aByte38 < 3 ? Static307.aClass26Array3[this.aByte38 + 1] : null;
		}
		@Pc(159) Class5 local159 = null;
		if (this.aClass116_1 != null) {
			if (local103) {
				arg2 |= 0x20000;
			}
			local159 = local10.method1083(arg2, this.anInt2846 == 11 ? 10 : this.anInt2846, this.anInt2862, arg0, local135, local142, this.anInt2846 == 11 ? this.anInt2857 + 4 : this.anInt2857, this.anInt2860, this.anInt2861, this.aClass116_1, this.anInt2848, local135.method4990(this.anInt2848, this.anInt2861), this.anInt2849);
			if (local159 == null) {
				this.aBooleanArray18 = null;
				this.aClass4_Sub1_Sub1_2 = null;
				this.anInt2856 = 0;
			} else {
				if (local103) {
					if (this.aBooleanArray18 == null) {
						this.aBooleanArray18 = new boolean[4];
					}
					this.aClass4_Sub1_Sub1_2 = local159.method4004(this.aClass4_Sub1_Sub1_2);
					Static333.method74(this.aClass4_Sub1_Sub1_2, this.aByte38, arg3, arg1, this.aBooleanArray18);
				}
				this.anInt2856 = local159.method4020();
			}
			this.aClass5_3 = null;
		} else if (this.aClass5_3 != null && (arg2 & this.aClass5_3.method3992()) == arg2 && this.anInt2853 == local10.anInt1346) {
			local159 = this.aClass5_3;
		} else {
			if (this.aClass5_3 != null) {
				arg2 |= this.aClass5_3.method3992();
			}
			@Pc(238) Class69 local238 = local10.method1088(local103, local135, local135.method4990(this.anInt2848, this.anInt2861), local142, arg2, this.anInt2848, this.anInt2846 == 11 ? 10 : this.anInt2846, arg0, this.anInt2846 == 11 ? this.anInt2857 + 4 : this.anInt2857, this.anInt2861);
			if (local238 == null) {
				this.aClass5_3 = null;
				this.anInt2856 = 0;
				this.aClass4_Sub1_Sub1_2 = null;
				this.aBooleanArray18 = null;
			} else {
				local159 = local238.aClass5_2;
				this.aClass5_3 = local238.aClass5_2;
				if (local103) {
					this.aClass4_Sub1_Sub1_2 = local238.aClass4_Sub1_Sub1_1;
					this.aBooleanArray18 = null;
					Static333.method74(this.aClass4_Sub1_Sub1_2, this.aByte38, arg3, arg1, null);
				}
				this.anInt2856 = local159.method4020();
			}
		}
		this.anInt2853 = local10.anInt1346;
		this.anInt2861 = arg1;
		this.anInt2841 = this.anInt2849;
		this.anInt2848 = arg3;
		return local159;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZLclient!vm;)V")
	public void method2535(@OriginalArg(1) Class92 arg0) {
		this.method2533(arg0, this.anInt2861, 131072, this.anInt2848, true, true);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!vm;)V")
	public void method2536(@OriginalArg(1) Class92 arg0) {
		if (this.aClass4_Sub1_Sub1_2 != null) {
			Static8.method239(this.aClass4_Sub1_Sub1_2, this.aByte38, this.anInt2848, this.anInt2861, this.aBooleanArray18);
			this.aBooleanArray18 = null;
			this.aClass4_Sub1_Sub1_2 = null;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!vm;IIZZLclient!jn;I)V")
	public void method2537(@OriginalArg(0) int arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class5 arg5, @OriginalArg(7) int arg6) {
		@Pc(6) Class125[] local6 = arg5.method3989();
		@Pc(16) Class143[] local16 = arg5.method4002();
		if ((this.aClass17_Sub3_3 == null || this.aClass17_Sub3_3.aBoolean97) && (local6 != null || local16 != null)) {
			@Pc(32) Class56 local32 = Static320.method5290(this.anInt2863);
			if (local32.anIntArray151 != null) {
				local32 = local32.method1093();
			}
			if (local32 != null) {
				this.aClass17_Sub3_3 = new Class17_Sub3(Static342.anInt6706);
			}
		}
		if (this.aClass17_Sub3_3 == null) {
			return;
		}
		if (arg4) {
			this.aClass17_Sub3_3.method1064(arg1, (long) Static342.anInt6706, local6, local16);
		} else {
			this.aClass17_Sub3_3.method1060((long) Static342.anInt6706);
		}
		this.aClass17_Sub3_3.method1068(this.aByte39, arg2, arg6, arg3, arg0);
	}

	@OriginalMember(owner = "client!ie", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass17_Sub3_3 != null) {
			this.aClass17_Sub3_3.method1070();
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)I")
	public int method2538() {
		return this.anInt2856;
	}
}
