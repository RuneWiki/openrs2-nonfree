import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class275 {

	@OriginalMember(owner = "client!op", name = "c", descriptor = "Lclient!ka;")
	private Class157 aClass157_6;

	@OriginalMember(owner = "client!op", name = "w", descriptor = "I")
	private int anInt8203;

	@OriginalMember(owner = "client!op", name = "o", descriptor = "I")
	private int anInt8206;

	@OriginalMember(owner = "client!op", name = "y", descriptor = "I")
	private int anInt8208;

	@OriginalMember(owner = "client!op", name = "z", descriptor = "Z")
	private boolean aBoolean625;

	@OriginalMember(owner = "client!op", name = "b", descriptor = "I")
	private int anInt8212;

	@OriginalMember(owner = "client!op", name = "q", descriptor = "I")
	private int anInt8217;

	@OriginalMember(owner = "client!op", name = "f", descriptor = "I")
	private int anInt8222;

	@OriginalMember(owner = "client!op", name = "H", descriptor = "Lclient!op;")
	private Class275 aClass275_3;

	@OriginalMember(owner = "client!op", name = "E", descriptor = "Lclient!bka;")
	private Class9 aClass9_28;

	@OriginalMember(owner = "client!op", name = "i", descriptor = "I")
	private int anInt8224;

	@OriginalMember(owner = "client!op", name = "B", descriptor = "[B")
	private byte[] aByteArray84;

	@OriginalMember(owner = "client!op", name = "r", descriptor = "I")
	private int anInt8214 = -1;

	@OriginalMember(owner = "client!op", name = "G", descriptor = "Z")
	private boolean aBoolean626 = true;

	@OriginalMember(owner = "client!op", name = "h", descriptor = "[Lclient!eca;")
	private final Class87[] aClass87Array1;

	@OriginalMember(owner = "client!op", name = "A", descriptor = "I")
	private final int anInt8211;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "I")
	private final int anInt8201;

	@OriginalMember(owner = "client!op", name = "x", descriptor = "I")
	private final int anInt8215;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "I")
	private final int anInt8209;

	@OriginalMember(owner = "client!op", name = "t", descriptor = "I")
	private final int anInt8204;

	@OriginalMember(owner = "client!op", name = "d", descriptor = "[Lclient!eca;")
	private final Class87[] aClass87Array2;

	@OriginalMember(owner = "client!op", name = "u", descriptor = "Lclient!eca;")
	private final Class87 aClass87_1;

	@OriginalMember(owner = "client!op", name = "p", descriptor = "I")
	private final int anInt8210;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(I[Lclient!eca;IIIIII)V")
	public Class275(@OriginalArg(0) int arg0, @OriginalArg(1) Class87[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass87Array1 = arg1;
		this.anInt8211 = arg3;
		this.anInt8201 = arg4;
		this.anInt8215 = arg6;
		this.anInt8209 = arg5;
		this.anInt8204 = arg0;
		if (arg1 == null) {
			this.aClass87Array2 = null;
			this.aClass87_1 = null;
		} else {
			this.aClass87Array2 = new Class87[arg1.length];
			this.aClass87_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
		this.anInt8210 = arg7;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
	public void method6907() {
		this.aClass275_3 = null;
		this.anInt8206 = 0;
		this.aBoolean625 = false;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIZIZILclient!ha;IIIIII)V")
	public void method6908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class67 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9) {
		@Pc(13) int local13 = 0;
		if (this.aBoolean625) {
			local13 = this.anInt8206;
		}
		if (this.aClass275_3 == null) {
			this.method6909(true, arg7, arg0, arg3, local13, arg6, arg8, arg1, arg9, arg4, arg2, arg5);
			return;
		}
		@Pc(42) Class275 local42 = this;
		@Pc(45) Class275 local45 = this.aClass275_3;
		if (this.hashCode() > local45.hashCode()) {
			local45 = this;
			local42 = this.aClass275_3;
			local13 = 255 - local13;
		}
		local42.method6909(true, arg7, arg0, arg3, local13, arg6, arg8, arg1, arg9, arg4, arg2, arg5);
		local45.method6909(false, arg7, arg0, arg3, 255 - local13, arg6, arg8, arg1, arg9, arg4, arg2, arg5);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZIIIIIIZIIILclient!ha;II)V")
	private void method6909(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class67 arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11) {
		@Pc(10) int local10 = 255 - arg4;
		if (this.aClass157_6 == null) {
			arg5 = arg5 + arg6 & 0x3FFF;
			arg9.ya();
			if (this.anInt8204 == -1 || this.anInt8217 == 0) {
				arg9.aa(arg10, arg3, arg11, arg8, arg2 | local10 << 24, 1);
			} else {
				@Pc(64) Class32 local64 = Static105.anInterface2_1.method1027(this.anInt8204);
				if (this.aClass9_28 == null && Static105.anInterface2_1.method1024(this.anInt8204)) {
					@Pc(110) int[] local110 = local64.anInt861 == 2 ? Static105.anInterface2_1.method1026(0.7F, this.anInt8217, this.anInt8217, this.anInt8204) : Static105.anInterface2_1.method1025(this.anInt8217, this.anInt8217, 0.7F, this.anInt8204, false);
					this.anInt8224 = local110[0];
					this.anInt8212 = local110[local110.length - 1];
					this.aClass9_28 = arg9.method7688(local110, this.anInt8217, this.anInt8217, this.anInt8217);
				}
				@Pc(154) int local154 = local10 == 255 ? (local64.anInt861 == 2 ? 1 : 0) : 1;
				if (local154 == 1 && arg0) {
					arg9.aa(arg10, arg3, arg11, arg8, arg2, 0);
				}
				if (this.aClass9_28 != null) {
					@Pc(180) int local180 = arg1 * arg8 / -4096;
					@Pc(194) int local194;
					for (local194 = (arg11 - arg8) / 2 + arg5 * arg8 / 4096; local194 > arg8; local194 -= arg8) {
					}
					while (local194 < 0) {
						local194 += arg8;
					}
					@Pc(260) int local260;
					if (this.anInt8215 == 1) {
						for (local260 = local194 - arg8; local260 < arg11; local260 += arg8) {
							this.aClass9_28.method8604(arg10 + local260, local180 + arg3, arg8, arg8, 0, local10 << 24 | 0xFFFFFF, local154);
						}
						if ((this.anInt8224 & 0xFF000000) != 0) {
							arg9.method7696(0, arg3 + local180 + 1, arg11, 0, this.anInt8224);
						}
						if ((this.anInt8212 & 0xFF000000) != 0) {
							arg9.method7696(0, arg8 - arg3 - local180 - arg8, arg11, arg8 + local180 + arg3, this.anInt8212);
						}
					} else {
						while (arg8 < local180) {
							local180 -= arg8;
						}
						while (local180 < 0) {
							local180 += arg8;
						}
						for (local260 = local194 - arg8; local260 < arg11; local260 += arg8) {
							for (@Pc(267) int local267 = local180 - arg8; local267 < arg8; local267 += arg8) {
								this.aClass9_28.method8604(local260 + arg10, arg3 + local267, arg8, arg8, 0, local10 << 24 | 0xFFFFFF, local154);
							}
						}
					}
				}
			}
		} else {
			if (arg0) {
				arg9.GA(arg2);
				arg9.ya();
			}
			this.method6915(arg4, arg1, arg9, arg5, arg7);
		}
		for (@Pc(430) int local430 = this.anInt8222 - 1; local430 >= 0; local430--) {
			this.aClass87Array2[local430].method2230(arg9, arg10, arg3, arg11, arg8, arg1, arg5, this.anInt8211, this.anInt8201, this.anInt8209, local10);
		}
		if (-3 != -3) {
			this.method6916(112, (Class67) null);
		}
		arg9.ya();
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!op;)V")
	public void method6910(@OriginalArg(1) Class275 arg0) {
		if (this.aBoolean625) {
			this.anInt8203 = this.anInt8206;
		} else if (arg0 != null && arg0.aBoolean625) {
			this.anInt8203 = 255 - arg0.anInt8206;
		} else {
			this.anInt8203 = 0;
		}
		this.aClass275_3 = arg0;
		this.anInt8206 = 0;
		this.aBoolean625 = true;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IBI)V")
	public void method6911(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8206 = this.anInt8203 + (arg1 - this.anInt8203) * arg0 / 255;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)Lclient!op;")
	public Class275 method6912() {
		return this.aClass275_3;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)Z")
	public boolean method6913() {
		return this.aBoolean625;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BILclient!ha;I)Z")
	public boolean method6914(@OriginalArg(1) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) int arg2) {
		@Pc(55) int local55;
		if (arg2 != this.anInt8214) {
			this.anInt8214 = arg2;
			@Pc(16) int local16 = Static487.method7093(arg2);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (this.anInt8217 != local16) {
				this.aClass9_28 = null;
				this.anInt8217 = local16;
			}
			if (this.aClass87Array1 != null) {
				this.anInt8222 = 0;
				@Pc(53) int[] local53 = new int[this.aClass87Array1.length];
				for (local55 = 0; local55 < this.aClass87Array1.length; local55++) {
					@Pc(64) Class87 local64 = this.aClass87Array1[local55];
					if (local64.method2236(this.anInt8211, this.anInt8201, this.anInt8209, this.anInt8214)) {
						local53[this.anInt8222] = local64.anInt2531;
						this.aClass87Array2[this.anInt8222++] = local64;
					}
				}
				Static416.method6189(this.anInt8222 - 1, this.aClass87Array2, 0, local53);
			}
			this.aBoolean626 = true;
		}
		@Pc(127) boolean local127 = false;
		if (this.aBoolean626) {
			this.aBoolean626 = false;
			for (local55 = this.anInt8222 - 1; local55 >= 0; local55--) {
				@Pc(149) boolean local149 = this.aClass87Array2[local55].method2237(arg1, this.aClass87_1);
				local127 |= local149;
				this.aBoolean626 |= !local149;
			}
		}
		if (arg0 == 0 || !arg1.method7699()) {
			this.aClass157_6 = null;
		} else if (this.aClass157_6 == null && this.anInt8210 >= 0) {
			this.method6916(0, arg1);
		}
		if (this.aClass275_3 != null && this.aClass275_3 != this) {
			this.aClass275_3.method6907();
			local127 |= this.aClass275_3.method6914(arg0, arg1, arg2);
		}
		return local127;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIILclient!ha;II)V")
	private void method6915(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class67 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class181 local7 = arg2.method7683().method6350();
		@Pc(18) Class181 local18 = arg2.method7646();
		local18.method6356(0, 0, 0);
		local18.method6358(arg3 & 0x3FFF);
		local18.method6343(arg1 & 0x3FFF);
		local18.method6357(arg4 & 0x3FFF);
		arg2.method7642(local18);
		@Pc(44) Class181 local44 = arg2.method7646();
		local44.method6349();
		if (arg0 != this.anInt8208) {
			this.aClass157_6.method5210((byte) arg0, this.aByteArray84);
			this.anInt8208 = arg0;
		}
		this.aClass157_6.method5232(local44, (Class19_Sub6) null, 0);
		arg2.method7642(local7);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!ha;)V")
	private void method6916(@OriginalArg(0) int arg0, @OriginalArg(1) Class67 arg1) {
		try {
			@Pc(5) Class221 local5 = Static301.aClass221_88;
			if (arg0 != 0) {
				this.method6907();
			}
			@Pc(18) boolean local18 = local5.method5064(this.anInt8210);
			if (local18) {
				arg1.ZA(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				@Pc(35) Class178 local35 = Static542.method7606(Static301.aClass221_88, 0, true, this.anInt8210);
				this.aClass157_6 = arg1.method7653(local35, 1099776, 0, 255, 1);
				@Pc(48) byte[] local48 = this.aClass157_6.method5216();
				if (local48 == null) {
					this.aByteArray84 = null;
				} else {
					this.aByteArray84 = new byte[local48.length];
					Static735.method9185(local48, 0, this.aByteArray84, 0, local48.length);
				}
			}
		} catch (@Pc(70) Exception local70) {
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIIIIIIILclient!ha;II)V")
	public void method6917(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) Class67 arg4, @OriginalArg(9) int arg5, @OriginalArg(10) int arg6) {
		this.method6908(0, 0, arg6, arg1, arg4, arg3, arg2, arg5, 0, arg0);
	}
}
