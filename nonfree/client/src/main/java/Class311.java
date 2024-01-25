import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class311 {

	@OriginalMember(owner = "client!wca", name = "e", descriptor = "[Z")
	private boolean[] aBooleanArray37;

	@OriginalMember(owner = "client!wca", name = "k", descriptor = "I")
	private int anInt8961;

	@OriginalMember(owner = "client!wca", name = "p", descriptor = "I")
	private int anInt8965;

	@OriginalMember(owner = "client!wca", name = "r", descriptor = "Lclient!r;")
	private Class36 aClass36_7;

	@OriginalMember(owner = "client!wca", name = "w", descriptor = "I")
	private int anInt8971;

	@OriginalMember(owner = "client!wca", name = "x", descriptor = "Lclient!bj;")
	private Class31 aClass31_3;

	@OriginalMember(owner = "client!wca", name = "B", descriptor = "Lclient!k;")
	private Class5_Sub2_Sub13 aClass5_Sub2_Sub13_6;

	@OriginalMember(owner = "client!wca", name = "D", descriptor = "I")
	private int anInt8975;

	@OriginalMember(owner = "client!wca", name = "H", descriptor = "Lclient!qp;")
	public Class30_Sub7 aClass30_Sub7_7;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "I")
	private int anInt8953 = -32768;

	@OriginalMember(owner = "client!wca", name = "h", descriptor = "Z")
	private boolean aBoolean647 = false;

	@OriginalMember(owner = "client!wca", name = "u", descriptor = "I")
	private int anInt8969 = -1;

	@OriginalMember(owner = "client!wca", name = "E", descriptor = "I")
	private int anInt8976 = -1;

	@OriginalMember(owner = "client!wca", name = "G", descriptor = "Z")
	private boolean aBoolean650 = false;

	@OriginalMember(owner = "client!wca", name = "m", descriptor = "I")
	private int anInt8962;

	@OriginalMember(owner = "client!wca", name = "g", descriptor = "I")
	public final int anInt8958;

	@OriginalMember(owner = "client!wca", name = "K", descriptor = "B")
	private final byte aByte104;

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "I")
	public final int anInt8956;

	@OriginalMember(owner = "client!wca", name = "M", descriptor = "B")
	private final byte aByte105;

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "I")
	private int anInt8955;

	@OriginalMember(owner = "client!wca", name = "C", descriptor = "I")
	public final int anInt8974;

	@OriginalMember(owner = "client!wca", name = "y", descriptor = "Z")
	private final boolean aBoolean649;

	static {
		new Class40("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lclient!qa;Lclient!tk;IIIIIIZI)V")
	public Class311(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt8962 = arg7;
		this.anInt8958 = arg2;
		this.aBoolean647 = arg8;
		this.aByte104 = (byte) arg5;
		this.anInt8956 = arg3;
		this.aByte105 = (byte) arg4;
		this.anInt8955 = arg6;
		this.anInt8974 = arg1.anInt8190;
		this.aBoolean649 = arg0.method7047() && arg1.aBoolean592 && !this.aBoolean647;
		if (arg9 != -1) {
			this.aBoolean650 = true;
		}
		this.method7258(arg9);
	}

	@OriginalMember(owner = "client!wca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass30_Sub7_7 != null) {
			this.aClass30_Sub7_7.method5903();
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!r;ZILclient!qa;IIII)V")
	public void method7252(@OriginalArg(0) Class36 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class62 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) Class223[] local6 = arg0.method7350();
		@Pc(9) Class280[] local9 = arg0.method7361();
		if ((this.aClass30_Sub7_7 == null || this.aClass30_Sub7_7.aBoolean513) && (local6 != null || local9 != null)) {
			@Pc(31) Class283 local31 = Static453.aClass88_3.method2294(this.anInt8974);
			if (local31.anIntArray632 != null) {
				local31 = local31.method6604(Static540.aClass242_1);
			}
			if (local31 != null) {
				this.aClass30_Sub7_7 = Static407.method5909(Static481.anInt8318);
			}
		}
		if (this.aClass30_Sub7_7 == null) {
			return;
		}
		if (arg1) {
			this.aClass30_Sub7_7.method5901(arg3, (long) Static481.anInt8318, local6, local9);
		} else {
			this.aClass30_Sub7_7.method5905((long) Static481.anInt8318);
		}
		this.aClass30_Sub7_7.method5902(this.aByte105, arg6, arg5, arg2, arg4);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IILclient!qa;ZZII)Lclient!r;")
	public Class36 method7253(@OriginalArg(0) int arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) Class283 local18 = Static453.aClass88_3.method2294(this.anInt8974);
		if (local18.anIntArray632 != null) {
			local18 = local18.method6604(Static540.aClass242_1);
		}
		if (local18 == null) {
			this.method7256(arg1);
			this.anInt8976 = -1;
			this.anInt8969 = this.anInt8965;
			return null;
		}
		if (!this.aBoolean650 && this.anInt8976 != local18.anInt8190) {
			this.aClass36_7 = null;
			this.method7258(-1);
		}
		this.method7257(arg4, arg5);
		@Pc(81) boolean local81 = arg3 & this.aBoolean649 & Static300.aClass5_Sub28_Sub1_1.method4116(Static17.anInt459) != 0;
		@Pc(125) boolean local125 = local81 & (local18.anInt8190 != this.anInt8976 || (this.anInt8969 != this.anInt8965 || this.aClass31_3 != null && (this.aClass31_3.aBoolean38 || Static457.aBoolean567) && this.anInt8965 != this.anInt8975) && Static300.aClass5_Sub28_Sub1_1.method4116(Static17.anInt459) >= 2);
		if (arg2 && !local125) {
			this.anInt8976 = local18.anInt8190;
			this.anInt8969 = this.anInt8965;
			return null;
		}
		if (local125) {
			Static135.method2556(this.aClass5_Sub2_Sub13_6, this.aByte104, this.anInt8955, this.anInt8962, this.aBooleanArray37);
		}
		@Pc(157) Class131 local157 = Static248.aClass131Array4[this.aByte104];
		@Pc(164) Class131 local164;
		if (this.aBoolean647) {
			local164 = Static493.aClass131Array5[0];
		} else {
			local164 = this.aByte104 >= 3 ? null : Static248.aClass131Array4[this.aByte104 + 1];
		}
		@Pc(183) Class36 local183 = null;
		if (this.aClass31_3 != null) {
			if (local125) {
				arg0 |= 0x40000;
			}
			local183 = local18.method6619(this.anInt8975, arg1, this.anInt8955, this.anInt8958 == 11 ? this.anInt8956 + 4 : this.anInt8956, arg0, local157.aa(this.anInt8955, this.anInt8962), this.anInt8962, local164, this.anInt8961, local157, this.anInt8958 == 11 ? 10 : this.anInt8958, this.aClass31_3, this.anInt8965);
			if (local183 == null) {
				this.aBooleanArray37 = null;
				this.aClass5_Sub2_Sub13_6 = null;
				this.anInt8953 = 0;
			} else {
				if (local125) {
					if (this.aBooleanArray37 == null) {
						this.aBooleanArray37 = new boolean[4];
					}
					this.aClass5_Sub2_Sub13_6 = local183.EA(this.aClass5_Sub2_Sub13_6);
					Static44.method899(this.aClass5_Sub2_Sub13_6, this.aByte104, arg5, arg4, this.aBooleanArray37);
				}
				this.anInt8953 = local183.TA();
			}
			this.aClass36_7 = null;
		} else if (this.aClass36_7 != null && (this.aClass36_7.ba() & arg0) == arg0 && local18.anInt8190 == this.anInt8976) {
			local183 = this.aClass36_7;
		} else {
			if (this.aClass36_7 != null) {
				arg0 |= this.aClass36_7.ba();
			}
			@Pc(352) Class89 local352 = local18.method6612(this.anInt8958 == 11 ? 10 : this.anInt8958, local157, local164, this.anInt8958 == 11 ? this.anInt8956 + 4 : this.anInt8956, this.anInt8955, local125, this.anInt8962, arg0, arg1, local157.aa(this.anInt8955, this.anInt8962));
			if (local352 == null) {
				this.aClass5_Sub2_Sub13_6 = null;
				this.aBooleanArray37 = null;
				this.aClass36_7 = null;
				this.anInt8953 = 0;
			} else {
				local183 = local352.aClass36_1;
				this.aClass36_7 = local352.aClass36_1;
				if (local125) {
					this.aBooleanArray37 = null;
					this.aClass5_Sub2_Sub13_6 = local352.aClass5_Sub2_Sub13_1;
					Static44.method899(this.aClass5_Sub2_Sub13_6, this.aByte104, arg5, arg4, null);
				}
				this.anInt8953 = local183.TA();
			}
		}
		this.anInt8962 = arg4;
		this.anInt8955 = arg5;
		this.anInt8976 = local18.anInt8190;
		this.anInt8969 = this.anInt8965;
		return local183;
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)Z")
	public boolean method7255() {
		return this.aBoolean649;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!qa;I)V")
	public void method7256(@OriginalArg(0) Class62 arg0) {
		if (this.aClass5_Sub2_Sub13_6 != null) {
			Static135.method2556(this.aClass5_Sub2_Sub13_6, this.aByte104, this.anInt8955, this.anInt8962, this.aBooleanArray37);
			this.aClass5_Sub2_Sub13_6 = null;
			this.aBooleanArray37 = null;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(ZII)V")
	private void method7257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass31_3 == null) {
				if (this.aBoolean650) {
					return;
				}
				this.method7258(-1);
				if (this.aClass31_3 == null) {
					return;
				}
			}
			@Pc(31) int local31 = Static481.anInt8318 - this.anInt8971;
			if (local31 > 100 && this.aClass31_3.anInt927 > 0) {
				@Pc(51) int local51 = this.aClass31_3.anIntArray69.length - this.aClass31_3.anInt927;
				while (local51 > this.anInt8965 && this.aClass31_3.anIntArray68[this.anInt8965] < local31) {
					local31 -= this.aClass31_3.anIntArray68[this.anInt8965];
					this.anInt8965++;
				}
				if (this.anInt8965 >= local51) {
					@Pc(90) int local90 = 0;
					for (@Pc(92) int local92 = local51; local92 < this.aClass31_3.anIntArray69.length; local92++) {
						local90 += this.aClass31_3.anIntArray68[local92];
					}
					local31 %= local90;
				}
				this.anInt8975 = this.anInt8965 + 1;
				if (this.aClass31_3.anIntArray69.length <= this.anInt8975) {
					this.anInt8975 -= this.aClass31_3.anInt927;
					if (this.anInt8975 < 0 || this.aClass31_3.anIntArray69.length <= this.anInt8975) {
						this.anInt8975 = -1;
					}
				}
			}
			while (this.aClass31_3.anIntArray68[this.anInt8965] < local31) {
				Static279.method4554(false, arg0, this.anInt8965, this.aClass31_3, arg1, this.aByte105);
				local31 -= this.aClass31_3.anIntArray68[this.anInt8965];
				this.anInt8965++;
				if (this.anInt8965 >= this.aClass31_3.anIntArray69.length) {
					this.anInt8965 -= this.aClass31_3.anInt927;
					if (this.anInt8965 < 0 || this.anInt8965 >= this.aClass31_3.anIntArray69.length) {
						this.aClass31_3 = null;
						continue label80;
					}
				}
				this.anInt8975 = this.anInt8965 + 1;
				if (this.anInt8975 >= this.aClass31_3.anIntArray69.length) {
					this.anInt8975 -= this.aClass31_3.anInt927;
					if (this.anInt8975 < 0 || this.anInt8975 >= this.aClass31_3.anIntArray69.length) {
						this.anInt8975 = -1;
					}
				}
			}
			this.anInt8961 = local31;
			this.anInt8971 = Static481.anInt8318 - local31;
			return;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(II)V")
	private void method7258(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class283 local18 = Static453.aClass88_3.method2294(this.anInt8974);
			@Pc(20) Class283 local20 = local18;
			if (local18.anIntArray632 != null) {
				local18 = local18.method6604(Static540.aClass242_1);
			}
			if (local18 == null) {
				return;
			}
			if (local18 == local20) {
				local20 = null;
			}
			if (local18.anIntArray636 != null) {
				if (this.aClass31_3 != null && local18.method6609(this.aClass31_3.anInt918)) {
					return;
				}
				local7 = local18.method6607();
				if (local18.anInt8190 != this.anInt8976) {
					local9 = local18.aBoolean590;
				}
			} else if (local18.anInt8156 == -1) {
				if (local20 != null && local20.anIntArray636 != null) {
					if (this.aClass31_3 != null && local20.method6609(this.aClass31_3.anInt918)) {
						return;
					}
					local7 = local20.method6607();
					if (this.anInt8976 != local20.anInt8190) {
						local9 = local20.aBoolean590;
					}
				} else if (local20 != null && local20.anInt8156 != -1 && local20.anInt8190 != this.anInt8976) {
					local9 = local20.aBoolean590;
					local7 = local20.anInt8156;
				}
			} else if (this.anInt8976 != local18.anInt8190) {
				local7 = local18.anInt8156;
				local9 = local18.aBoolean590;
			}
		}
		if (local7 == -1) {
			this.aClass31_3 = null;
			return;
		}
		this.aClass36_7 = null;
		if (this.aClass31_3 == null || this.aClass31_3.anInt918 != local7) {
			this.aClass31_3 = Static155.aClass76_2.method2152(local7);
		} else if (this.aClass31_3.anInt923 == 0) {
			return;
		}
		if (this.aClass31_3.anIntArray69 == null) {
			this.aClass31_3 = null;
			return;
		}
		if (local9) {
			this.anInt8965 = (int) ((double) this.aClass31_3.anIntArray69.length * Math.random());
			this.anInt8961 = (int) (Math.random() * (double) this.aClass31_3.anIntArray68[this.anInt8965]) + 1;
		} else {
			this.anInt8965 = 0;
			this.anInt8961 = 1;
		}
		this.anInt8975 = this.anInt8965 + 1;
		if (this.anInt8975 < 0 || this.anInt8975 >= this.aClass31_3.anIntArray69.length) {
			this.anInt8975 = -1;
		}
		this.anInt8971 = Static481.anInt8318 - this.anInt8961;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(BI)V")
	public void method7262(@OriginalArg(1) int arg0) {
		this.aBoolean650 = true;
		this.method7258(arg0);
	}

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "(I)I")
	public int method7263() {
		return this.anInt8953;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(ILclient!qa;)V")
	public void method7264(@OriginalArg(1) Class62 arg0) {
		this.method7253(262144, arg0, true, true, this.anInt8962, this.anInt8955);
	}
}
