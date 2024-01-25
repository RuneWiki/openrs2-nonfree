import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class66 {

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
	private int anInt1871;

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
	private int anInt1872;

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
	private int anInt1875;

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "[Z")
	private boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!ej", name = "x", descriptor = "Lclient!ba;")
	private Class7_Sub4_Sub2 aClass7_Sub4_Sub2_3;

	@OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
	private int anInt1888;

	@OriginalMember(owner = "client!ej", name = "z", descriptor = "Lclient!li;")
	public Class28_Sub3 aClass28_Sub3_2;

	@OriginalMember(owner = "client!ej", name = "C", descriptor = "Lclient!lc;")
	private Class139 aClass139_2;

	@OriginalMember(owner = "client!ej", name = "F", descriptor = "Lclient!t;")
	private Class163 aClass163_3;

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
	private int anInt1874 = -1;

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
	private int anInt1884 = -32768;

	@OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
	private int anInt1882 = -1;

	@OriginalMember(owner = "client!ej", name = "D", descriptor = "Z")
	private boolean aBoolean104 = false;

	@OriginalMember(owner = "client!ej", name = "K", descriptor = "Z")
	private boolean aBoolean105 = false;

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "B")
	private final byte aByte15;

	@OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
	public final int anInt1885;

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
	private int anInt1876;

	@OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
	private int anInt1880;

	@OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
	public final int anInt1879;

	@OriginalMember(owner = "client!ej", name = "H", descriptor = "B")
	private final byte aByte16;

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
	public final int anInt1878;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "Z")
	private final boolean aBoolean103;

	static {
		new Class55("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Lclient!ya;Lclient!pf;IIIIIIZI)V")
	public Class66(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.aByte15 = (byte) arg5;
		this.anInt1885 = arg2;
		this.anInt1876 = arg6;
		this.anInt1880 = arg7;
		this.anInt1879 = arg1.anInt5088;
		this.aBoolean105 = arg8;
		this.aByte16 = (byte) arg4;
		this.anInt1878 = arg3;
		this.aBoolean103 = arg0.method5295() && arg1.aBoolean313 && !this.aBoolean105;
		if (arg9 != -1) {
			this.aBoolean104 = true;
		}
		this.method1622(arg9);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)Z")
	public boolean method1620() {
		return this.aBoolean103;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!ya;I)V")
	public void method1621(@OriginalArg(0) Class51 arg0) {
		if (this.aClass7_Sub4_Sub2_3 != null) {
			Static133.method2104(this.aClass7_Sub4_Sub2_3, this.aByte15, this.anInt1876, this.anInt1880, this.aBooleanArray6);
			this.aBooleanArray6 = null;
			this.aClass7_Sub4_Sub2_3 = null;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V")
	private void method1622(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class189 local18 = Static411.aClass142_4.method3148(this.anInt1879);
			@Pc(20) Class189 local20 = local18;
			if (local18.anIntArray448 != null) {
				local18 = local18.method4038(Static224.aClass239_7);
			}
			if (local18 == null) {
				return;
			}
			if (local20 == local18) {
				local20 = null;
			}
			if (local18.anIntArray447 != null) {
				if (this.aClass139_2 != null && local18.method4037(this.aClass139_2.anInt3940)) {
					return;
				}
				local7 = local18.method4034();
				if (local18.anInt5088 != this.anInt1882) {
					local9 = local18.aBoolean316;
				}
			} else if (local18.anInt5063 == -1) {
				if (local20 != null && local20.anIntArray447 != null) {
					if (this.aClass139_2 != null && local20.method4037(this.aClass139_2.anInt3940)) {
						return;
					}
					local7 = local20.method4034();
					if (this.anInt1882 != local20.anInt5088) {
						local9 = local20.aBoolean316;
					}
				} else if (local20 != null && local20.anInt5063 != -1 && local20.anInt5088 != this.anInt1882) {
					local9 = local20.aBoolean316;
					local7 = local20.anInt5063;
				}
			} else if (local18.anInt5088 != this.anInt1882) {
				local9 = local18.aBoolean316;
				local7 = local18.anInt5063;
			}
		}
		if (local7 == -1) {
			this.aClass139_2 = null;
			return;
		}
		this.aClass163_3 = null;
		if (this.aClass139_2 == null || this.aClass139_2.anInt3940 != local7) {
			this.aClass139_2 = Static364.aClass151_2.method3293(local7);
		} else if (this.aClass139_2.anInt3937 == 0) {
			return;
		}
		if (this.aClass139_2.anIntArray344 == null) {
			this.aClass139_2 = null;
			return;
		}
		if (local9) {
			this.anInt1871 = (int) ((double) this.aClass139_2.anIntArray344.length * Math.random());
			this.anInt1888 = (int) ((double) this.aClass139_2.anIntArray345[this.anInt1871] * Math.random()) + 1;
		} else {
			this.anInt1871 = 0;
			this.anInt1888 = 1;
		}
		this.anInt1875 = this.anInt1871 + 1;
		if (this.anInt1875 < 0 || this.aClass139_2.anIntArray344.length <= this.anInt1875) {
			this.anInt1875 = -1;
		}
		this.anInt1872 = Static274.anInt4617 - this.anInt1888;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBI)V")
	private void method1623(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass139_2 == null) {
				if (this.aBoolean104) {
					return;
				}
				this.method1622(-1);
				if (this.aClass139_2 == null) {
					return;
				}
			}
			@Pc(34) int local34 = Static274.anInt4617 - this.anInt1872;
			if (local34 > 100 && this.aClass139_2.anInt3945 > 0) {
				@Pc(50) int local50 = this.aClass139_2.anIntArray344.length - this.aClass139_2.anInt3945;
				while (this.anInt1871 < local50 && this.aClass139_2.anIntArray345[this.anInt1871] < local34) {
					local34 -= this.aClass139_2.anIntArray345[this.anInt1871];
					this.anInt1871++;
				}
				if (local50 <= this.anInt1871) {
					@Pc(89) int local89 = 0;
					for (@Pc(91) int local91 = local50; local91 < this.aClass139_2.anIntArray344.length; local91++) {
						local89 += this.aClass139_2.anIntArray345[local91];
					}
					local34 %= local89;
				}
				this.anInt1875 = this.anInt1871 + 1;
				if (this.anInt1875 >= this.aClass139_2.anIntArray344.length) {
					this.anInt1875 -= this.aClass139_2.anInt3945;
					if (this.anInt1875 < 0 || this.aClass139_2.anIntArray344.length <= this.anInt1875) {
						this.anInt1875 = -1;
					}
				}
			}
			while (this.aClass139_2.anIntArray345[this.anInt1871] < local34) {
				Static454.method5772(this.aClass139_2, false, arg1, this.aByte16, arg0, this.anInt1871);
				local34 -= this.aClass139_2.anIntArray345[this.anInt1871];
				this.anInt1871++;
				if (this.anInt1871 >= this.aClass139_2.anIntArray344.length) {
					this.anInt1871 -= this.aClass139_2.anInt3945;
					if (this.anInt1871 < 0 || this.aClass139_2.anIntArray344.length <= this.anInt1871) {
						this.aClass139_2 = null;
						continue label80;
					}
				}
				this.anInt1875 = this.anInt1871 + 1;
				if (this.anInt1875 >= this.aClass139_2.anIntArray344.length) {
					this.anInt1875 -= this.aClass139_2.anInt3945;
					if (this.anInt1875 < 0 || this.aClass139_2.anIntArray344.length <= this.anInt1875) {
						this.anInt1875 = -1;
					}
				}
			}
			this.anInt1872 = Static274.anInt4617 - local34;
			this.anInt1888 = local34;
			return;
		}
	}

	@OriginalMember(owner = "client!ej", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass28_Sub3_2 != null) {
			this.aClass28_Sub3_2.method3171();
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)I")
	public int method1625() {
		return this.anInt1884;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!ya;IIILclient!t;BZI)V")
	public void method1626(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class163 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(14) Class167[] local14 = arg4.method4661();
		@Pc(17) Class52[] local17 = arg4.method4663();
		if ((this.aClass28_Sub3_2 == null || this.aClass28_Sub3_2.aBoolean248) && (local14 != null || local17 != null)) {
			@Pc(34) Class189 local34 = Static411.aClass142_4.method3148(this.anInt1879);
			if (local34.anIntArray448 != null) {
				local34 = local34.method4038(Static224.aClass239_7);
			}
			if (local34 != null) {
				this.aClass28_Sub3_2 = new Class28_Sub3(Static274.anInt4617);
			}
		}
		if (this.aClass28_Sub3_2 == null) {
			return;
		}
		if (arg5) {
			this.aClass28_Sub3_2.method3166(arg0, (long) Static274.anInt4617, local14, local17);
		} else {
			this.aClass28_Sub3_2.method3173((long) Static274.anInt4617);
		}
		this.aClass28_Sub3_2.method3172(this.aByte16, arg6, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!ya;B)V")
	public void method1627(@OriginalArg(0) Class51 arg0) {
		this.method1629(this.anInt1880, 262144, true, arg0, true, this.anInt1876);
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(II)V")
	public void method1628(@OriginalArg(1) int arg0) {
		this.aBoolean104 = true;
		this.method1622(arg0);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZILclient!ya;ZI)Lclient!t;")
	public Class163 method1629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class51 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Class189 local11 = Static411.aClass142_4.method3148(this.anInt1879);
		if (local11.anIntArray448 != null) {
			local11 = local11.method4038(Static224.aClass239_7);
		}
		if (local11 == null) {
			this.method1621(arg3);
			this.anInt1882 = -1;
			this.anInt1874 = this.anInt1871;
			return null;
		}
		if (!this.aBoolean104 && local11.anInt5088 != this.anInt1882) {
			this.aClass163_3 = null;
			this.method1622(-1);
		}
		this.method1623(arg5, arg0);
		@Pc(70) boolean local70 = arg2 & this.aBoolean103 & Static130.aClass153_Sub1_1.method4217(Static377.anInt6113) != 0;
		@Pc(116) boolean local116 = local70 & (this.anInt1882 != local11.anInt5088 || (this.anInt1874 != this.anInt1871 || this.aClass139_2 != null && (this.aClass139_2.aBoolean242 || Static262.aBoolean495) && this.anInt1875 != this.anInt1871) && Static130.aClass153_Sub1_1.method4217(Static377.anInt6113) >= 2);
		if (arg4 && !local116) {
			this.anInt1882 = local11.anInt5088;
			this.anInt1874 = this.anInt1871;
			return null;
		}
		if (local116) {
			Static133.method2104(this.aClass7_Sub4_Sub2_3, this.aByte15, this.anInt1876, this.anInt1880, this.aBooleanArray6);
		}
		@Pc(148) Class165 local148 = Static244.aClass165Array8[this.aByte15];
		@Pc(155) Class165 local155;
		if (this.aBoolean105) {
			local155 = Static149.aClass165Array7[0];
		} else {
			local155 = this.aByte15 < 3 ? Static244.aClass165Array8[this.aByte15 + 1] : null;
		}
		@Pc(174) Class163 local174 = null;
		if (this.aClass139_2 != null) {
			if (local116) {
				arg1 |= 0x40000;
			}
			local174 = local11.method4031(this.anInt1888, arg3, this.anInt1875, this.anInt1871, local155, this.anInt1885 == 11 ? 10 : this.anInt1885, this.anInt1880, this.anInt1876, local148.a(this.anInt1876, this.anInt1880), this.aClass139_2, local148, this.anInt1885 == 11 ? this.anInt1878 + 4 : this.anInt1878, arg1);
			if (local174 == null) {
				this.aBooleanArray6 = null;
				this.aClass7_Sub4_Sub2_3 = null;
				this.anInt1884 = 0;
			} else {
				if (local116) {
					if (this.aBooleanArray6 == null) {
						this.aBooleanArray6 = new boolean[4];
					}
					this.aClass7_Sub4_Sub2_3 = local174.fa(this.aClass7_Sub4_Sub2_3);
					Static294.method3886(this.aClass7_Sub4_Sub2_3, this.aByte15, arg5, arg0, this.aBooleanArray6);
				}
				this.anInt1884 = local174.MA();
			}
			this.aClass163_3 = null;
		} else if (this.aClass163_3 != null && arg1 == (this.aClass163_3.P() & arg1) && this.anInt1882 == local11.anInt5088) {
			local174 = this.aClass163_3;
		} else {
			if (this.aClass163_3 != null) {
				arg1 |= this.aClass163_3.P();
			}
			@Pc(246) Class221 local246 = local11.method4029(arg1, local116, local148.a(this.anInt1876, this.anInt1880), this.anInt1885 == 11 ? this.anInt1878 + 4 : this.anInt1878, this.anInt1876, arg3, local148, this.anInt1885 == 11 ? 10 : this.anInt1885, local155, this.anInt1880);
			if (local246 == null) {
				this.aBooleanArray6 = null;
				this.anInt1884 = 0;
				this.aClass163_3 = null;
				this.aClass7_Sub4_Sub2_3 = null;
			} else {
				local174 = local246.aClass163_6;
				this.aClass163_3 = local246.aClass163_6;
				if (local116) {
					this.aBooleanArray6 = null;
					this.aClass7_Sub4_Sub2_3 = local246.aClass7_Sub4_Sub2_5;
					Static294.method3886(this.aClass7_Sub4_Sub2_3, this.aByte15, arg5, arg0, null);
				}
				this.anInt1884 = local174.MA();
			}
		}
		this.anInt1874 = this.anInt1871;
		this.anInt1882 = local11.anInt5088;
		this.anInt1880 = arg0;
		this.anInt1876 = arg5;
		return local174;
	}
}
