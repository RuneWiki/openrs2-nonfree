import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class215 {

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "Lclient!va;")
	private Class224 aClass224_5;

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "Lclient!ss;")
	private Class6_Sub2_Sub10 aClass6_Sub2_Sub10_4;

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "Lclient!ko;")
	public Class57_Sub4 aClass57_Sub4_4;

	@OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
	private int anInt6239;

	@OriginalMember(owner = "client!ro", name = "B", descriptor = "I")
	private int anInt6245;

	@OriginalMember(owner = "client!ro", name = "C", descriptor = "I")
	private int anInt6246;

	@OriginalMember(owner = "client!ro", name = "E", descriptor = "I")
	private int anInt6248;

	@OriginalMember(owner = "client!ro", name = "G", descriptor = "[Z")
	private boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!ro", name = "I", descriptor = "Lclient!jl;")
	private Class131 aClass131_2;

	@OriginalMember(owner = "client!ro", name = "q", descriptor = "Z")
	private boolean aBoolean398 = false;

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "Z")
	private boolean aBoolean397 = false;

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
	private int anInt6236 = -1;

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
	private int anInt6233 = -32768;

	@OriginalMember(owner = "client!ro", name = "K", descriptor = "I")
	private int anInt6252 = -1;

	@OriginalMember(owner = "client!ro", name = "x", descriptor = "I")
	private int anInt6241;

	@OriginalMember(owner = "client!ro", name = "y", descriptor = "I")
	private int anInt6242;

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
	public final int anInt6227;

	@OriginalMember(owner = "client!ro", name = "w", descriptor = "B")
	private final byte aByte81;

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
	public final int anInt6229;

	@OriginalMember(owner = "client!ro", name = "F", descriptor = "I")
	public final int anInt6249;

	@OriginalMember(owner = "client!ro", name = "o", descriptor = "B")
	private final byte aByte80;

	@OriginalMember(owner = "client!ro", name = "r", descriptor = "Z")
	private final boolean aBoolean399;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!eq;Lclient!hn;IIIIIIZI)V")
	public Class215(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt6241 = arg7;
		this.anInt6242 = arg6;
		this.aBoolean397 = arg8;
		this.anInt6227 = arg2;
		this.aByte81 = (byte) arg5;
		this.anInt6229 = arg1.anInt3167;
		this.anInt6249 = arg3;
		this.aByte80 = (byte) arg4;
		this.aBoolean399 = arg0.method4995() && arg1.aBoolean208 && !this.aBoolean397;
		if (arg9 != -1) {
			this.aBoolean398 = true;
		}
		this.method5186(arg9);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLclient!eq;)V")
	public void method5185(@OriginalArg(1) Class66 arg0) {
		if (this.aClass6_Sub2_Sub10_4 != null) {
			Static236.method3640(this.aClass6_Sub2_Sub10_4, this.aByte81, this.anInt6242, this.anInt6241, this.aBooleanArray22);
			this.aClass6_Sub2_Sub10_4 = null;
			this.aBooleanArray22 = null;
		}
	}

	@OriginalMember(owner = "client!ro", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass57_Sub4_4 != null) {
			this.aClass57_Sub4_4.method3252();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)V")
	private void method5186(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class106 local18 = Static448.aClass104_4.method2616(this.anInt6229);
			@Pc(20) Class106 local20 = local18;
			if (local18.anIntArray188 != null) {
				local18 = local18.method2625(Static393.aClass207_1);
			}
			if (local18 == null) {
				return;
			}
			if (local20 == local18) {
				local20 = null;
			}
			if (local18.anIntArray189 != null) {
				if (this.aClass131_2 != null && local18.method2626(this.aClass131_2.anInt3694)) {
					return;
				}
				local7 = local18.method2632();
				if (local18.anInt3167 != this.anInt6236) {
					local9 = local18.aBoolean211;
				}
			} else if (local18.anInt3153 == -1) {
				if (local20 != null && local20.anIntArray189 != null) {
					if (this.aClass131_2 != null && local20.method2626(this.aClass131_2.anInt3694)) {
						return;
					}
					local7 = local20.method2632();
					if (this.anInt6236 != local20.anInt3167) {
						local9 = local20.aBoolean211;
					}
				} else if (local20 != null && local20.anInt3153 != -1 && this.anInt6236 != local20.anInt3167) {
					local7 = local20.anInt3153;
					local9 = local20.aBoolean211;
				}
			} else if (local18.anInt3167 != this.anInt6236) {
				local7 = local18.anInt3153;
				local9 = local18.aBoolean211;
			}
		}
		if (local7 == -1) {
			this.aClass131_2 = null;
			return;
		}
		this.aClass224_5 = null;
		if (this.aClass131_2 == null || this.aClass131_2.anInt3694 != local7) {
			this.aClass131_2 = Static5.aClass217_1.method5234(local7);
		} else if (this.aClass131_2.anInt3702 == 0) {
			return;
		}
		if (this.aClass131_2.anIntArray235 == null) {
			this.aClass131_2 = null;
			return;
		}
		if (local9) {
			this.anInt6248 = (int) ((double) this.aClass131_2.anIntArray235.length * Math.random());
			this.anInt6246 = (int) ((double) this.aClass131_2.anIntArray233[this.anInt6248] * Math.random()) + 1;
		} else {
			this.anInt6246 = 1;
			this.anInt6248 = 0;
		}
		this.anInt6239 = this.anInt6248 + 1;
		if (this.anInt6239 < 0 || this.aClass131_2.anIntArray235.length <= this.anInt6239) {
			this.anInt6239 = -1;
		}
		this.anInt6245 = Static66.anInt1741 - this.anInt6246;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!eq;B)V")
	public void method5188(@OriginalArg(0) Class66 arg0) {
		this.method5197(this.anInt6241, this.anInt6242, arg0, true, 262144, true);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZI)V")
	public void method5189(@OriginalArg(1) int arg0) {
		this.aBoolean398 = true;
		this.method5186(arg0);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)V")
	private void method5192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass131_2 == null) {
				if (this.aBoolean398) {
					return;
				}
				this.method5186(-1);
				if (this.aClass131_2 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static66.anInt1741 - this.anInt6245;
			if (local30 > 100 && this.aClass131_2.anInt3698 > 0) {
				@Pc(50) int local50 = this.aClass131_2.anIntArray235.length - this.aClass131_2.anInt3698;
				while (local50 > this.anInt6248 && this.aClass131_2.anIntArray233[this.anInt6248] < local30) {
					local30 -= this.aClass131_2.anIntArray233[this.anInt6248];
					this.anInt6248++;
				}
				if (this.anInt6248 >= local50) {
					@Pc(89) int local89 = 0;
					for (@Pc(91) int local91 = local50; local91 < this.aClass131_2.anIntArray235.length; local91++) {
						local89 += this.aClass131_2.anIntArray233[local91];
					}
					local30 %= local89;
				}
				this.anInt6239 = this.anInt6248 + 1;
				if (this.anInt6239 >= this.aClass131_2.anIntArray235.length) {
					this.anInt6239 -= this.aClass131_2.anInt3698;
					if (this.anInt6239 < 0 || this.anInt6239 >= this.aClass131_2.anIntArray235.length) {
						this.anInt6239 = -1;
					}
				}
			}
			while (local30 > this.aClass131_2.anIntArray233[this.anInt6248]) {
				Static160.method2664(this.anInt6248, arg1, false, this.aClass131_2, arg0, this.aByte80);
				local30 -= this.aClass131_2.anIntArray233[this.anInt6248];
				this.anInt6248++;
				if (this.anInt6248 >= this.aClass131_2.anIntArray235.length) {
					this.anInt6248 -= this.aClass131_2.anInt3698;
					if (this.anInt6248 < 0 || this.aClass131_2.anIntArray235.length <= this.anInt6248) {
						this.aClass131_2 = null;
						continue label80;
					}
				}
				this.anInt6239 = this.anInt6248 + 1;
				if (this.aClass131_2.anIntArray235.length <= this.anInt6239) {
					this.anInt6239 -= this.aClass131_2.anInt3698;
					if (this.anInt6239 < 0 || this.aClass131_2.anIntArray235.length <= this.anInt6239) {
						this.anInt6239 = -1;
					}
				}
			}
			this.anInt6245 = Static66.anInt1741 - local30;
			this.anInt6246 = local30;
			return;
		}
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)I")
	public int method5193() {
		return this.anInt6233;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!va;IIIZILclient!eq;I)V")
	public void method5194(@OriginalArg(0) Class224 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class66 arg5, @OriginalArg(7) int arg6) {
		@Pc(6) Class119[] local6 = arg0.method5794();
		@Pc(20) Class94[] local20 = arg0.method5807();
		if ((this.aClass57_Sub4_4 == null || this.aClass57_Sub4_4.aBoolean262) && (local6 != null || local20 != null)) {
			@Pc(37) Class106 local37 = Static448.aClass104_4.method2616(this.anInt6229);
			if (local37.anIntArray188 != null) {
				local37 = local37.method2625(Static393.aClass207_1);
			}
			if (local37 != null) {
				this.aClass57_Sub4_4 = new Class57_Sub4(Static66.anInt1741);
			}
		}
		if (this.aClass57_Sub4_4 == null) {
			return;
		}
		if (arg3) {
			this.aClass57_Sub4_4.method3248(arg5, (long) Static66.anInt1741, local6, local20);
		} else {
			this.aClass57_Sub4_4.method3251((long) Static66.anInt1741);
		}
		this.aClass57_Sub4_4.method3255(this.aByte80, arg4, arg2, arg1, arg6);
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(B)Z")
	public boolean method5195() {
		return this.aBoolean399;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIILclient!eq;ZIZ)Lclient!va;")
	public Class224 method5197(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class66 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(11) Class106 local11 = Static448.aClass104_4.method2616(this.anInt6229);
		if (local11.anIntArray188 != null) {
			local11 = local11.method2625(Static393.aClass207_1);
		}
		if (local11 == null) {
			this.method5185(arg2);
			this.anInt6252 = this.anInt6248;
			this.anInt6236 = -1;
			return null;
		}
		if (!this.aBoolean398 && this.anInt6236 != local11.anInt3167) {
			this.aClass224_5 = null;
			this.method5186(-1);
		}
		this.method5192(arg0, arg1);
		@Pc(70) boolean local70 = arg5 & this.aBoolean399 & Static291.aClass28_Sub1_1.anInt1034 != 0;
		@Pc(112) boolean local112 = local70 & (this.anInt6236 != local11.anInt3167 || (this.anInt6248 != this.anInt6252 || this.aClass131_2 != null && (this.aClass131_2.aBoolean246 || Static421.aBoolean474) && this.anInt6239 != this.anInt6248) && Static291.aClass28_Sub1_1.anInt1034 >= 2);
		if (arg3 && !local112) {
			this.anInt6252 = this.anInt6248;
			this.anInt6236 = local11.anInt3167;
			return null;
		}
		if (local112) {
			Static236.method3640(this.aClass6_Sub2_Sub10_4, this.aByte81, this.anInt6242, this.anInt6241, this.aBooleanArray22);
		}
		@Pc(144) Class86 local144 = Static55.aClass86Array1[this.aByte81];
		@Pc(162) Class86 local162;
		if (this.aBoolean397) {
			local162 = Static87.aClass86Array2[0];
		} else {
			local162 = this.aByte81 < 3 ? Static55.aClass86Array1[this.aByte81 + 1] : null;
		}
		@Pc(170) Class224 local170 = null;
		if (this.aClass131_2 != null) {
			if (local112) {
				arg4 |= 0x40000;
			}
			local170 = local11.method2623(local144, this.anInt6246, local144.method6590(this.anInt6242, this.anInt6241), this.aClass131_2, this.anInt6248, this.anInt6239, this.anInt6227 == 11 ? 10 : this.anInt6227, arg4, this.anInt6241, arg2, this.anInt6227 == 11 ? this.anInt6249 + 4 : this.anInt6249, local162, this.anInt6242);
			if (local170 == null) {
				this.aClass6_Sub2_Sub10_4 = null;
				this.aBooleanArray22 = null;
				this.anInt6233 = 0;
			} else {
				if (local112) {
					if (this.aBooleanArray22 == null) {
						this.aBooleanArray22 = new boolean[4];
					}
					this.aClass6_Sub2_Sub10_4 = local170.method5837(this.aClass6_Sub2_Sub10_4);
					Static194.method3059(this.aClass6_Sub2_Sub10_4, this.aByte81, arg1, arg0, this.aBooleanArray22);
				}
				this.anInt6233 = local170.method5812();
			}
			this.aClass224_5 = null;
		} else if (this.aClass224_5 != null && (arg4 & this.aClass224_5.method5811()) == arg4 && this.anInt6236 == local11.anInt3167) {
			local170 = this.aClass224_5;
		} else {
			if (this.aClass224_5 != null) {
				arg4 |= this.aClass224_5.method5811();
			}
			@Pc(337) Class247 local337 = local11.method2627(local162, local144, this.anInt6242, this.anInt6241, arg4, local144.method6590(this.anInt6242, this.anInt6241), this.anInt6227 == 11 ? 10 : this.anInt6227, local112, this.anInt6227 == 11 ? this.anInt6249 + 4 : this.anInt6249, arg2);
			if (local337 == null) {
				this.anInt6233 = 0;
				this.aBooleanArray22 = null;
				this.aClass224_5 = null;
				this.aClass6_Sub2_Sub10_4 = null;
			} else {
				local170 = local337.aClass224_7;
				this.aClass224_5 = local337.aClass224_7;
				if (local112) {
					this.aBooleanArray22 = null;
					this.aClass6_Sub2_Sub10_4 = local337.aClass6_Sub2_Sub10_6;
					Static194.method3059(this.aClass6_Sub2_Sub10_4, this.aByte81, arg1, arg0, null);
				}
				this.anInt6233 = local170.method5812();
			}
		}
		this.anInt6241 = arg0;
		this.anInt6252 = this.anInt6248;
		this.anInt6236 = local11.anInt3167;
		this.anInt6242 = arg1;
		return local170;
	}
}
