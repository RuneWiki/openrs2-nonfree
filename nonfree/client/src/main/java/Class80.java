import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class80 {

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "Lclient!lm;")
	public Class72_Sub4 aClass72_Sub4_4;

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "Lclient!k;")
	private Class1_Sub1_Sub9 aClass1_Sub1_Sub9_2;

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
	private int anInt2239;

	@OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
	private int anInt2243;

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "[Z")
	private boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "Lclient!r;")
	private Class145 aClass145_2;

	@OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
	private int anInt2250;

	@OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
	private int anInt2251;

	@OriginalMember(owner = "client!ej", name = "D", descriptor = "Lclient!na;")
	private Class199 aClass199_2;

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "Z")
	private boolean aBoolean138 = false;

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
	private int anInt2238 = -1;

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
	private int anInt2236 = -1;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
	private int anInt2235 = -32768;

	@OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
	private int anInt2257 = -1;

	@OriginalMember(owner = "client!ej", name = "K", descriptor = "Z")
	private boolean aBoolean141 = false;

	@OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
	private int anInt2249;

	@OriginalMember(owner = "client!ej", name = "x", descriptor = "B")
	private final byte aByte38;

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
	private int anInt2237;

	@OriginalMember(owner = "client!ej", name = "I", descriptor = "B")
	private final byte aByte39;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
	public final int anInt2233;

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
	public final int anInt2245;

	@OriginalMember(owner = "client!ej", name = "F", descriptor = "I")
	public final int anInt2255;

	@OriginalMember(owner = "client!ej", name = "v", descriptor = "Z")
	private final boolean aBoolean139;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!qa;Lclient!bu;IIIIIIZI)V")
	public Class80(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt2249 = arg6;
		this.aByte38 = (byte) arg4;
		this.anInt2237 = arg7;
		this.aByte39 = (byte) arg5;
		this.anInt2233 = arg2;
		this.aBoolean141 = arg8;
		this.anInt2245 = arg1.anInt952;
		this.anInt2255 = arg3;
		this.aBoolean139 = arg0.method7248() && arg1.aBoolean59 && !this.aBoolean141;
		if (arg9 != -1) {
			this.aBoolean138 = true;
		}
		this.method1892(arg9);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!qa;Z)V")
	public void method1890(@OriginalArg(0) Class122 arg0) {
		this.method1894(this.anInt2237, true, true, this.anInt2249, 262144, arg0);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)I")
	public int method1891() {
		return this.anInt2235;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)V")
	private void method1892(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class36 local18 = Static308.aClass96_4.method2274(this.anInt2245);
			@Pc(20) Class36 local20 = local18;
			if (local18.anIntArray127 != null) {
				local18 = local18.method954(Static251.aClass119_1);
			}
			if (local18 == null) {
				return;
			}
			if (local18 == local20) {
				local20 = null;
			}
			if (local18.anIntArray124 != null) {
				if (this.aClass199_2 != null && local18.method950(this.aClass199_2.anInt5749)) {
					return;
				}
				local7 = local18.method952();
				if (this.anInt2236 != local18.anInt952) {
					local9 = local18.aBoolean54;
				}
			} else if (local18.anInt956 == -1) {
				if (local20 != null && local20.anIntArray124 != null) {
					if (this.aClass199_2 != null && local20.method950(this.aClass199_2.anInt5749)) {
						return;
					}
					local7 = local20.method952();
					if (local20.anInt952 != this.anInt2236) {
						local9 = local20.aBoolean54;
					}
				} else if (local20 != null && local20.anInt956 != -1 && this.anInt2236 != local20.anInt952) {
					local7 = local20.anInt956;
					local9 = local20.aBoolean54;
				}
			} else if (local18.anInt952 != this.anInt2236) {
				local9 = local18.aBoolean54;
				local7 = local18.anInt956;
			}
		}
		if (local7 == -1) {
			this.aClass199_2 = null;
			return;
		}
		this.aClass145_2 = null;
		if (this.aClass199_2 == null || this.aClass199_2.anInt5749 != local7) {
			this.aClass199_2 = Static182.aClass218_1.method5221(local7);
		} else if (this.aClass199_2.anInt5744 == 0) {
			return;
		}
		if (this.aClass199_2.anIntArray574 == null) {
			this.aClass199_2 = null;
			return;
		}
		if (local9) {
			this.anInt2250 = (int) (Math.random() * (double) this.aClass199_2.anIntArray574.length);
			this.anInt2251 = (int) (Math.random() * (double) this.aClass199_2.anIntArray575[this.anInt2250]) + 1;
		} else {
			this.anInt2251 = 1;
			this.anInt2250 = 0;
		}
		this.anInt2239 = this.anInt2250 + 1;
		if (this.anInt2239 < 0 || this.anInt2239 >= this.aClass199_2.anIntArray574.length) {
			this.anInt2239 = -1;
		}
		this.anInt2243 = Static436.anInt6850 - this.anInt2251;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBZZIILclient!qa;)Lclient!r;")
	public Class145 method1894(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class122 arg5) {
		@Pc(11) Class36 local11 = Static308.aClass96_4.method2274(this.anInt2245);
		if (local11.anIntArray127 != null) {
			local11 = local11.method954(Static251.aClass119_1);
		}
		if (local11 == null) {
			this.method1898(arg5);
			this.anInt2236 = -1;
			this.anInt2238 = -1;
			this.anInt2257 = -1;
			return null;
		}
		if (!this.aBoolean138 && local11.anInt952 != this.anInt2236) {
			this.aClass145_2 = null;
			this.method1892(-1);
		}
		this.method1900(arg3, arg0);
		if (arg1) {
			@Pc(72) boolean local72 = arg1 & this.aBoolean139 & Static544.aClass1_Sub22_Sub1_1.method4655(Static374.anInt6861) != 0;
			arg1 = local72 & (this.anInt2257 != local11.anInt952 || this.aClass199_2 != null && Static544.aClass1_Sub22_Sub1_1.method4655(Static374.anInt6861) >= 2 && (this.anInt2250 != this.anInt2238 || (this.aClass199_2.aBoolean419 || Static157.aBoolean315) && this.anInt2250 != this.anInt2239));
		}
		if (arg2 && !arg1) {
			this.anInt2236 = local11.anInt952;
			return null;
		}
		if (arg1) {
			Static371.method5720(this.aClass1_Sub1_Sub9_2, this.aByte39, this.anInt2249, this.anInt2237, this.aBooleanArray12);
			this.anInt2257 = -1;
			this.anInt2238 = -1;
		}
		@Pc(154) Class205 local154 = Static544.aClass205Array3[this.aByte39];
		@Pc(170) Class205 local170;
		if (this.aBoolean141) {
			local170 = Static16.aClass205Array1[0];
		} else {
			local170 = this.aByte39 < 3 ? Static544.aClass205Array3[this.aByte39 + 1] : null;
		}
		@Pc(178) Class145 local178 = null;
		if (this.aClass199_2 != null) {
			if (arg1) {
				arg4 |= 0x40000;
			}
			local178 = local11.method955(this.anInt2237, this.anInt2233 == 11 ? 10 : this.anInt2233, arg5, this.anInt2233 == 11 ? this.anInt2255 + 4 : this.anInt2255, this.aClass199_2, this.anInt2239, this.anInt2249, arg4, local170, this.anInt2250, local154, this.anInt2251, local154.aa(this.anInt2249, this.anInt2237));
			if (local178 == null) {
				this.anInt2235 = 0;
				this.aBooleanArray12 = null;
				this.aClass1_Sub1_Sub9_2 = null;
			} else {
				if (arg1) {
					if (this.aBooleanArray12 == null) {
						this.aBooleanArray12 = new boolean[4];
					}
					this.aClass1_Sub1_Sub9_2 = local178.EA(this.aClass1_Sub1_Sub9_2);
					Static449.method6410(this.aClass1_Sub1_Sub9_2, this.aByte39, arg3, arg0, this.aBooleanArray12);
					this.anInt2257 = local11.anInt952;
					this.anInt2238 = this.anInt2250;
				}
				this.anInt2235 = local178.TA();
			}
			this.aClass145_2 = null;
		} else if (this.aClass145_2 != null && arg4 == (arg4 & this.aClass145_2.ba()) && local11.anInt952 == this.anInt2236) {
			local178 = this.aClass145_2;
		} else {
			if (this.aClass145_2 != null) {
				arg4 |= this.aClass145_2.ba();
			}
			@Pc(356) Class305 local356 = local11.method963(this.anInt2237, local154, this.anInt2249, this.anInt2233 == 11 ? 10 : this.anInt2233, arg4, arg5, local154.aa(this.anInt2249, this.anInt2237), local170, this.anInt2233 == 11 ? this.anInt2255 + 4 : this.anInt2255, arg1);
			if (local356 == null) {
				this.aClass145_2 = null;
				this.aClass1_Sub1_Sub9_2 = null;
				this.anInt2235 = 0;
				this.aBooleanArray12 = null;
			} else {
				local178 = local356.aClass145_7;
				this.aClass145_2 = local356.aClass145_7;
				if (arg1) {
					this.aClass1_Sub1_Sub9_2 = local356.aClass1_Sub1_Sub9_6;
					this.aBooleanArray12 = null;
					Static449.method6410(this.aClass1_Sub1_Sub9_2, this.aByte39, arg3, arg0, null);
					this.anInt2257 = local11.anInt952;
					this.anInt2238 = -1;
				}
				this.anInt2235 = local178.TA();
			}
		}
		this.anInt2249 = arg3;
		this.anInt2237 = arg0;
		this.anInt2236 = local11.anInt952;
		return local178;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)V")
	public void method1897(@OriginalArg(1) int arg0) {
		this.aBoolean138 = true;
		this.method1892(arg0);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLclient!qa;)V")
	public void method1898(@OriginalArg(1) Class122 arg0) {
		if (this.aClass1_Sub1_Sub9_2 != null) {
			Static371.method5720(this.aClass1_Sub1_Sub9_2, this.aByte39, this.anInt2249, this.anInt2237, this.aBooleanArray12);
			this.aBooleanArray12 = null;
			this.aClass1_Sub1_Sub9_2 = null;
		}
	}

	@OriginalMember(owner = "client!ej", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass72_Sub4_4 != null) {
			this.aClass72_Sub4_4.method4534();
		}
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(B)Z")
	public boolean method1899() {
		return this.aBoolean139;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)V")
	private void method1900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass199_2 == null) {
				if (this.aBoolean138) {
					return;
				}
				this.method1892(-1);
				if (this.aClass199_2 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static436.anInt6850 - this.anInt2243;
			if (local30 > 100 && this.aClass199_2.anInt5746 > 0) {
				@Pc(50) int local50 = this.aClass199_2.anIntArray574.length - this.aClass199_2.anInt5746;
				while (this.anInt2250 < local50 && local30 > this.aClass199_2.anIntArray575[this.anInt2250]) {
					local30 -= this.aClass199_2.anIntArray575[this.anInt2250];
					this.anInt2250++;
				}
				if (local50 <= this.anInt2250) {
					@Pc(93) int local93 = 0;
					for (@Pc(95) int local95 = local50; local95 < this.aClass199_2.anIntArray574.length; local95++) {
						local93 += this.aClass199_2.anIntArray575[local95];
					}
					local30 %= local93;
				}
				this.anInt2239 = this.anInt2250 + 1;
				if (this.anInt2239 >= this.aClass199_2.anIntArray574.length) {
					this.anInt2239 -= this.aClass199_2.anInt5746;
					if (this.anInt2239 < 0 || this.anInt2239 >= this.aClass199_2.anIntArray574.length) {
						this.anInt2239 = -1;
					}
				}
			}
			while (this.aClass199_2.anIntArray575[this.anInt2250] < local30) {
				Static381.method5839(arg1, false, this.aClass199_2, this.anInt2250, this.aByte38, arg0);
				local30 -= this.aClass199_2.anIntArray575[this.anInt2250];
				this.anInt2250++;
				if (this.aClass199_2.anIntArray574.length <= this.anInt2250) {
					this.anInt2250 -= this.aClass199_2.anInt5746;
					if (this.anInt2250 < 0 || this.anInt2250 >= this.aClass199_2.anIntArray574.length) {
						this.aClass199_2 = null;
						continue label80;
					}
				}
				this.anInt2239 = this.anInt2250 + 1;
				if (this.anInt2239 >= this.aClass199_2.anIntArray574.length) {
					this.anInt2239 -= this.aClass199_2.anInt5746;
					if (this.anInt2239 < 0 || this.aClass199_2.anIntArray574.length <= this.anInt2239) {
						this.anInt2239 = -1;
					}
				}
			}
			this.anInt2243 = Static436.anInt6850 - local30;
			this.anInt2251 = local30;
			return;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!r;IZIIIILclient!qa;)V")
	public void method1901(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class122 arg6) {
		@Pc(11) Class161[] local11 = arg0.method6677();
		@Pc(14) Class93[] local14 = arg0.method6684();
		if ((this.aClass72_Sub4_4 == null || this.aClass72_Sub4_4.aBoolean369) && (local11 != null || local14 != null)) {
			@Pc(31) Class36 local31 = Static308.aClass96_4.method2274(this.anInt2245);
			if (local31.anIntArray127 != null) {
				local31 = local31.method954(Static251.aClass119_1);
			}
			if (local31 != null) {
				this.aClass72_Sub4_4 = Static279.method4523(Static436.anInt6850);
			}
		}
		if (this.aClass72_Sub4_4 == null) {
			return;
		}
		if (arg2) {
			this.aClass72_Sub4_4.method4529(arg6, (long) Static436.anInt6850, local11, local14);
		} else {
			this.aClass72_Sub4_4.method4535((long) Static436.anInt6850);
		}
		this.aClass72_Sub4_4.method4532(this.aByte38, arg5, arg3, arg4, arg1);
	}
}
