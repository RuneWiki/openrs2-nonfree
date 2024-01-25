import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class6 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Lclient!qh;")
	private Class159 aClass159_1;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Lclient!hu;")
	private Class102 aClass102_1;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "Lclient!ph;")
	private Class2_Sub7_Sub11 aClass2_Sub7_Sub11_1;

	@OriginalMember(owner = "client!af", name = "k", descriptor = "I")
	private int anInt147;

	@OriginalMember(owner = "client!af", name = "m", descriptor = "I")
	private int anInt148;

	@OriginalMember(owner = "client!af", name = "r", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!af", name = "v", descriptor = "Lclient!bt;")
	public Class7_Sub3 aClass7_Sub3_1;

	@OriginalMember(owner = "client!af", name = "D", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!af", name = "E", descriptor = "[Z")
	private boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!af", name = "w", descriptor = "I")
	private int anInt154 = -1;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "Z")
	private boolean aBoolean20 = false;

	@OriginalMember(owner = "client!af", name = "o", descriptor = "I")
	private int anInt150 = -1;

	@OriginalMember(owner = "client!af", name = "G", descriptor = "Z")
	private boolean aBoolean22 = false;

	@OriginalMember(owner = "client!af", name = "O", descriptor = "I")
	private int anInt166 = -32768;

	@OriginalMember(owner = "client!af", name = "P", descriptor = "I")
	private int anInt167;

	@OriginalMember(owner = "client!af", name = "K", descriptor = "I")
	public final int anInt164;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "B")
	private final byte aByte6;

	@OriginalMember(owner = "client!af", name = "F", descriptor = "I")
	public final int anInt161;

	@OriginalMember(owner = "client!af", name = "z", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "B")
	private final byte aByte5;

	@OriginalMember(owner = "client!af", name = "x", descriptor = "I")
	public final int anInt155;

	@OriginalMember(owner = "client!af", name = "y", descriptor = "Z")
	private final boolean aBoolean21;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!oj;Lclient!cu;IIIIIIZI)V")
	public Class6(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt167 = arg6;
		this.anInt164 = arg1.anInt1234;
		this.aByte6 = (byte) arg4;
		this.anInt161 = arg2;
		this.anInt156 = arg7;
		this.aByte5 = (byte) arg5;
		this.anInt155 = arg3;
		this.aBoolean22 = arg8;
		this.aBoolean21 = arg0.method2476() && arg1.aBoolean100 && !this.aBoolean22;
		if (arg9 != -1) {
			this.aBoolean20 = true;
		}
		this.method66(arg9);
	}

	@OriginalMember(owner = "client!af", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass7_Sub3_1 != null) {
			this.aClass7_Sub3_1.method528();
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)V")
	private void method66(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class47 local19 = Static230.aClass96_4.method2303(this.anInt164);
			@Pc(21) Class47 local21 = local19;
			if (local19.anIntArray95 != null) {
				local19 = local19.method903(Static179.aClass115_1);
			}
			if (local19 == null) {
				return;
			}
			if (local21 == local19) {
				local21 = null;
			}
			if (local19.anIntArray98 != null) {
				if (this.aClass102_1 != null && local19.method892(this.aClass102_1.anInt2982)) {
					return;
				}
				local7 = local19.method902();
				if (local19.anInt1234 != this.anInt154) {
					local9 = local19.aBoolean101;
				}
			} else if (local19.anInt1250 == -1) {
				if (local21 != null && local21.anIntArray98 != null) {
					if (this.aClass102_1 != null && local21.method892(this.aClass102_1.anInt2982)) {
						return;
					}
					local7 = local21.method902();
					if (local21.anInt1234 != this.anInt154) {
						local9 = local21.aBoolean101;
					}
				} else if (local21 != null && local21.anInt1250 != -1 && this.anInt154 != local21.anInt1234) {
					local9 = local21.aBoolean101;
					local7 = local21.anInt1250;
				}
			} else if (this.anInt154 != local19.anInt1234) {
				local9 = local19.aBoolean101;
				local7 = local19.anInt1250;
			}
		}
		if (local7 == -1) {
			this.aClass102_1 = null;
			return;
		}
		this.aClass159_1 = null;
		if (this.aClass102_1 == null || this.aClass102_1.anInt2982 != local7) {
			this.aClass102_1 = Static333.aClass50_2.method1175(local7);
		} else if (this.aClass102_1.anInt2985 == 0) {
			return;
		}
		if (this.aClass102_1.anIntArray231 == null) {
			this.aClass102_1 = null;
			return;
		}
		if (local9) {
			this.anInt148 = (int) ((double) this.aClass102_1.anIntArray231.length * Math.random());
			this.anInt152 = (int) ((double) this.aClass102_1.anIntArray229[this.anInt148] * Math.random()) + 1;
		} else {
			this.anInt148 = 0;
			this.anInt152 = 1;
		}
		this.anInt160 = this.anInt148 + 1;
		if (this.anInt160 < 0 || this.aClass102_1.anIntArray231.length <= this.anInt160) {
			this.anInt160 = -1;
		}
		this.anInt147 = Static339.anInt6265 - this.anInt152;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!oj;)V")
	public void method68(@OriginalArg(1) Class48 arg0) {
		if (this.aClass2_Sub7_Sub11_1 != null) {
			Static169.method5042(this.aClass2_Sub7_Sub11_1, this.aByte5, this.anInt167, this.anInt156, this.aBooleanArray1);
			this.aBooleanArray1 = null;
			this.aClass2_Sub7_Sub11_1 = null;
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)Z")
	public boolean method69() {
		return this.aBoolean21;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!oj;I)V")
	public void method73(@OriginalArg(0) Class48 arg0) {
		this.method74(true, arg0, this.anInt156, this.anInt167, 131072, true);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZILclient!oj;IIIZ)Lclient!qh;")
	public Class159 method74(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class48 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(11) Class47 local11 = Static230.aClass96_4.method2303(this.anInt164);
		if (local11.anIntArray95 != null) {
			local11 = local11.method903(Static179.aClass115_1);
		}
		if (local11 == null) {
			this.method68(arg1);
			this.anInt154 = -1;
			this.anInt150 = this.anInt148;
			return null;
		}
		if (!this.aBoolean20 && local11.anInt1234 != this.anInt154) {
			this.aClass159_1 = null;
			this.method66(-1);
		}
		this.method79(arg2, arg3);
		@Pc(68) boolean local68 = arg0 & this.aBoolean21 & Static266.anInt5047 != 0;
		@Pc(113) boolean local113 = local68 & (this.anInt154 != local11.anInt1234 || (this.anInt150 != this.anInt148 || this.aClass102_1 != null && (this.aClass102_1.aBoolean209 || Static314.aBoolean420) && this.anInt148 != this.anInt160) && Static266.anInt5047 >= 2);
		if (arg5 && !local113) {
			this.anInt154 = local11.anInt1234;
			this.anInt150 = this.anInt148;
			return null;
		}
		if (local113) {
			Static169.method5042(this.aClass2_Sub7_Sub11_1, this.aByte5, this.anInt167, this.anInt156, this.aBooleanArray1);
		}
		@Pc(145) Class149 local145 = Static128.aClass149Array1[this.aByte5];
		@Pc(157) Class149 local157;
		if (this.aBoolean22) {
			local157 = Static210.aClass149Array5[0];
		} else {
			local157 = this.aByte5 < 3 ? Static128.aClass149Array1[this.aByte5 + 1] : null;
		}
		@Pc(176) Class159 local176 = null;
		if (this.aClass102_1 != null) {
			if (local113) {
				arg4 |= 0x20000;
			}
			local176 = local11.method889(this.anInt148, local145.method5839(this.anInt167, this.anInt156), this.anInt156, local145, this.anInt160, this.anInt161 == 11 ? 10 : this.anInt161, arg4, this.aClass102_1, this.anInt167, arg1, local157, this.anInt152, this.anInt161 == 11 ? this.anInt155 + 4 : this.anInt155);
			if (local176 == null) {
				this.aBooleanArray1 = null;
				this.anInt166 = 0;
				this.aClass2_Sub7_Sub11_1 = null;
			} else {
				if (local113) {
					if (this.aBooleanArray1 == null) {
						this.aBooleanArray1 = new boolean[4];
					}
					this.aClass2_Sub7_Sub11_1 = local176.method4937(this.aClass2_Sub7_Sub11_1);
					Static78.method1356(this.aClass2_Sub7_Sub11_1, this.aByte5, arg3, arg2, this.aBooleanArray1);
				}
				this.anInt166 = local176.method4941();
			}
			this.aClass159_1 = null;
		} else if (this.aClass159_1 != null && arg4 == (arg4 & this.aClass159_1.method4951()) && local11.anInt1234 == this.anInt154) {
			local176 = this.aClass159_1;
		} else {
			if (this.aClass159_1 != null) {
				arg4 |= this.aClass159_1.method4951();
			}
			@Pc(247) Class187 local247 = local11.method896(local145, local157, this.anInt161 == 11 ? 10 : this.anInt161, local113, this.anInt161 == 11 ? this.anInt155 + 4 : this.anInt155, this.anInt167, local145.method5839(this.anInt167, this.anInt156), this.anInt156, arg1, arg4);
			if (local247 == null) {
				this.aBooleanArray1 = null;
				this.aClass159_1 = null;
				this.aClass2_Sub7_Sub11_1 = null;
				this.anInt166 = 0;
			} else {
				local176 = local247.aClass159_5;
				this.aClass159_1 = local247.aClass159_5;
				if (local113) {
					this.aClass2_Sub7_Sub11_1 = local247.aClass2_Sub7_Sub11_4;
					this.aBooleanArray1 = null;
					Static78.method1356(this.aClass2_Sub7_Sub11_1, this.aByte5, arg3, arg2, null);
				}
				this.anInt166 = local176.method4941();
			}
		}
		this.anInt156 = arg2;
		this.anInt150 = this.anInt148;
		this.anInt167 = arg3;
		this.anInt154 = local11.anInt1234;
		return local176;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)I")
	public int method75() {
		return this.anInt166;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)V")
	public void method76(@OriginalArg(0) int arg0) {
		this.aBoolean20 = true;
		this.method66(arg0);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BLclient!qh;ZIIIILclient!oj;)V")
	public void method77(@OriginalArg(1) Class159 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class48 arg6) {
		@Pc(10) Class218[] local10 = arg0.method4962();
		@Pc(13) Class88[] local13 = arg0.method4960();
		if ((this.aClass7_Sub3_1 == null || this.aClass7_Sub3_1.aBoolean46) && (local10 != null || local13 != null)) {
			@Pc(30) Class47 local30 = Static230.aClass96_4.method2303(this.anInt164);
			if (local30.anIntArray95 != null) {
				local30 = local30.method903(Static179.aClass115_1);
			}
			if (local30 != null) {
				this.aClass7_Sub3_1 = new Class7_Sub3(Static339.anInt6265);
			}
		}
		if (this.aClass7_Sub3_1 == null) {
			return;
		}
		if (arg1) {
			this.aClass7_Sub3_1.method518(arg6, (long) Static339.anInt6265, local10, local13);
		} else {
			this.aClass7_Sub3_1.method525((long) Static339.anInt6265);
		}
		this.aClass7_Sub3_1.method521(this.aByte6, arg4, arg5, arg2, arg3);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(III)V")
	private void method79(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass102_1 == null) {
				if (this.aBoolean20) {
					return;
				}
				this.method66(-1);
				if (this.aClass102_1 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static339.anInt6265 - this.anInt147;
			if (local30 > 100 && this.aClass102_1.anInt2996 > 0) {
				@Pc(52) int local52 = this.aClass102_1.anIntArray231.length - this.aClass102_1.anInt2996;
				while (local52 > this.anInt148 && local30 > this.aClass102_1.anIntArray229[this.anInt148]) {
					local30 -= this.aClass102_1.anIntArray229[this.anInt148];
					this.anInt148++;
				}
				if (local52 <= this.anInt148) {
					@Pc(95) int local95 = 0;
					for (@Pc(97) int local97 = local52; local97 < this.aClass102_1.anIntArray231.length; local97++) {
						local95 += this.aClass102_1.anIntArray229[local97];
					}
					local30 %= local95;
				}
				this.anInt160 = this.anInt148 + 1;
				if (this.aClass102_1.anIntArray231.length <= this.anInt160) {
					this.anInt160 -= this.aClass102_1.anInt2996;
					if (this.anInt160 < 0 || this.anInt160 >= this.aClass102_1.anIntArray231.length) {
						this.anInt160 = -1;
					}
				}
			}
			while (this.aClass102_1.anIntArray229[this.anInt148] < local30) {
				Static343.method5495(this.aClass102_1, false, arg1, this.anInt148, arg0, this.aByte6);
				local30 -= this.aClass102_1.anIntArray229[this.anInt148];
				this.anInt148++;
				if (this.anInt148 >= this.aClass102_1.anIntArray231.length) {
					this.anInt148 -= this.aClass102_1.anInt2996;
					if (this.anInt148 < 0 || this.anInt148 >= this.aClass102_1.anIntArray231.length) {
						this.aClass102_1 = null;
						continue label80;
					}
				}
				this.anInt160 = this.anInt148 + 1;
				if (this.aClass102_1.anIntArray231.length <= this.anInt160) {
					this.anInt160 -= this.aClass102_1.anInt2996;
					if (this.anInt160 < 0 || this.anInt160 >= this.aClass102_1.anIntArray231.length) {
						this.anInt160 = -1;
					}
				}
			}
			this.anInt152 = local30;
			this.anInt147 = Static339.anInt6265 - local30;
			return;
		}
	}
}
