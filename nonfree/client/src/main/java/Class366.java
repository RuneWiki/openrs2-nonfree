import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class366 {

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
	private int anInt10142;

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
	private int anInt10147;

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "[B")
	private byte[] aByteArray105;

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
	private int anInt10151;

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
	private int anInt10154;

	@OriginalMember(owner = "client!uj", name = "w", descriptor = "Lclient!ka;")
	private Class129 aClass129_6;

	@OriginalMember(owner = "client!uj", name = "K", descriptor = "Z")
	private boolean aBoolean708;

	@OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
	private int anInt10155;

	@OriginalMember(owner = "client!uj", name = "F", descriptor = "Lclient!fia;")
	private Class45 aClass45_32;

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
	private int anInt10156;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
	private int anInt10161;

	@OriginalMember(owner = "client!uj", name = "A", descriptor = "Lclient!uj;")
	private Class366 aClass366_5;

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
	private int anInt10153 = -1;

	@OriginalMember(owner = "client!uj", name = "J", descriptor = "Z")
	private boolean aBoolean709 = true;

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
	private final int anInt10146;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
	private final int anInt10166;

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
	private final int anInt10164;

	@OriginalMember(owner = "client!uj", name = "r", descriptor = "[Lclient!el;")
	private final Class99[] aClass99Array1;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
	private final int anInt10158;

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
	private final int anInt10167;

	@OriginalMember(owner = "client!uj", name = "C", descriptor = "[Lclient!el;")
	private final Class99[] aClass99Array2;

	@OriginalMember(owner = "client!uj", name = "u", descriptor = "Lclient!el;")
	private final Class99 aClass99_1;

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
	private final int anInt10149;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(I[Lclient!el;IIIIII)V")
	public Class366(@OriginalArg(0) int arg0, @OriginalArg(1) Class99[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt10146 = arg0;
		this.anInt10166 = arg4;
		this.anInt10164 = arg3;
		this.aClass99Array1 = arg1;
		this.anInt10158 = arg5;
		this.anInt10167 = arg6;
		if (arg1 == null) {
			this.aClass99Array2 = null;
			this.aClass99_1 = null;
		} else {
			this.aClass99Array2 = new Class99[arg1.length];
			this.aClass99_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
		this.anInt10149 = arg7;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZZIIIIIIIIZILclient!ha;)V")
	public void method8683(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) Class144 arg9) {
		@Pc(5) int local5 = 0;
		if (this.aBoolean708) {
			local5 = this.anInt10154;
		}
		if (this.aClass366_5 == null) {
			this.method8686(arg4, arg8, arg5, local5, arg3, arg9, arg6, true, arg7, arg1, arg2, arg0);
			return;
		}
		@Pc(36) Class366 local36 = this;
		@Pc(39) Class366 local39 = this.aClass366_5;
		if (this.hashCode() > local39.hashCode()) {
			local39 = this;
			local36 = this.aClass366_5;
			local5 = 255 - local5;
		}
		local36.method8686(arg4, arg8, arg5, local5, arg3, arg9, arg6, true, arg7, arg1, arg2, arg0);
		local39.method8686(arg4, arg8, arg5, 255 - local5, arg3, arg9, arg6, false, arg7, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!ha;II)Z")
	public boolean method8684(@OriginalArg(0) int arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(3) int arg2) {
		if (arg0 != this.anInt10153) {
			this.anInt10153 = arg0;
			@Pc(12) int local12 = Static64.method1041(arg0);
			if (local12 > 512) {
				local12 = 512;
			}
			if (local12 <= 0) {
				local12 = 1;
			}
			if (this.anInt10155 != local12) {
				this.anInt10155 = local12;
				this.aClass45_32 = null;
			}
			if (this.aClass99Array1 != null) {
				this.anInt10142 = 0;
				@Pc(44) int[] local44 = new int[this.aClass99Array1.length];
				for (@Pc(46) int local46 = 0; local46 < this.aClass99Array1.length; local46++) {
					@Pc(55) Class99 local55 = this.aClass99Array1[local46];
					if (local55.method2090(this.anInt10164, this.anInt10166, this.anInt10158, this.anInt10153)) {
						local44[this.anInt10142] = local55.anInt2175;
						this.aClass99Array2[this.anInt10142++] = local55;
					}
				}
				Static676.method9510(this.aClass99Array2, 0, local44, this.anInt10142 - 1);
			}
			this.aBoolean709 = true;
		}
		@Pc(114) boolean local114 = false;
		if (this.aBoolean709) {
			this.aBoolean709 = false;
			for (@Pc(125) int local125 = this.anInt10142 - 1; local125 >= 0; local125--) {
				@Pc(136) boolean local136 = this.aClass99Array2[local125].method2087(arg1, this.aClass99_1);
				this.aBoolean709 |= !local136;
				local114 |= local136;
			}
		}
		if (arg2 == 0 || !arg1.method6920()) {
			this.aClass129_6 = null;
		} else if (this.aClass129_6 == null && this.anInt10149 >= 0) {
			this.method8687(arg1);
		}
		if (this.aClass366_5 != null && this.aClass366_5 != this) {
			this.aClass366_5.method8694();
			local114 |= this.aClass366_5.method8684(arg0, arg1, arg2);
		}
		return local114;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIILclient!ha;IIIIII)V")
	public void method8685(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class144 arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(10) int arg6) {
		this.method8683(arg5, 0, arg4, 0, arg1, arg0, 0, arg6, arg2, arg3);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIILclient!ha;ZIZIIII)V")
	private void method8686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class144 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) boolean arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11) {
		@Pc(10) int local10 = 255 - arg3;
		if (this.aClass129_6 == null) {
			arg11 = arg6 + arg11 & 0x3FFF;
			arg5.ya();
			if (this.anInt10146 == -1 || this.anInt10155 == 0) {
				arg5.aa(arg0, arg1, arg2, arg8, arg4 | local10 << 24, 1);
			} else {
				@Pc(84) Class69 local84 = Static338.anInterface4_9.method8975(this.anInt10146);
				if (this.aClass45_32 == null && Static338.anInterface4_9.method8974(this.anInt10146)) {
					@Pc(128) int[] local128 = local84.anInt1679 == 2 ? Static338.anInterface4_9.method8979(this.anInt10155, 0.7F, this.anInt10146, this.anInt10155) : Static338.anInterface4_9.method8977(0.7F, this.anInt10146, this.anInt10155, this.anInt10155, false);
					this.anInt10151 = local128[0];
					this.anInt10161 = local128[local128.length - 1];
					this.aClass45_32 = arg5.method6941(this.anInt10155, this.anInt10155, local128, this.anInt10155);
				}
				@Pc(173) int local173 = local10 == 255 ? (local84.anInt1679 == 2 ? 1 : 0) : 1;
				if (local173 == 1 && arg7) {
					arg5.aa(arg0, arg1, arg2, arg8, arg4, 0);
				}
				if (this.aClass45_32 != null) {
					@Pc(199) int local199 = arg10 * arg8 / -4096;
					@Pc(212) int local212;
					for (local212 = arg11 * arg8 / 4096 + (arg2 - arg8) / 2; local212 > arg8; local212 -= arg8) {
					}
					while (local212 < 0) {
						local212 += arg8;
					}
					@Pc(283) int local283;
					if (this.anInt10167 == 1) {
						for (local283 = local212 - arg8; local283 < arg2; local283 += arg8) {
							this.aClass45_32.method7493(local283 + arg0, arg1 + local199, arg8, arg8, 0, local10 << 24 | 0xFFFFFF, local173);
						}
						if ((this.anInt10151 & 0xFF000000) != 0) {
							arg5.method6887(0, this.anInt10151, arg2, local199 + arg1 + 1, 0);
						}
						if ((this.anInt10161 & 0xFF000000) != 0) {
							arg5.method6887(arg1 + local199 + arg8, this.anInt10161, arg2, arg8 - arg8 - local199 - arg1, 0);
						}
					} else {
						while (arg8 < local199) {
							local199 -= arg8;
						}
						while (local199 < 0) {
							local199 += arg8;
						}
						for (local283 = local212 - arg8; local283 < arg2; local283 += arg8) {
							for (@Pc(290) int local290 = local199 - arg8; local290 < arg8; local290 += arg8) {
								this.aClass45_32.method7493(local283 + arg0, arg1 + local290, arg8, arg8, 0, local10 << 24 | 0xFFFFFF, local173);
							}
						}
					}
				}
			}
		} else {
			if (arg7) {
				arg5.GA(arg4);
				arg5.ya();
			}
			this.method8693(arg11, arg3, arg9, arg10, arg5);
		}
		for (@Pc(436) int local436 = this.anInt10142 - 1; local436 >= 0; local436--) {
			this.aClass99Array2[local436].method2086(arg5, arg0, arg1, arg2, arg8, arg10, arg11, this.anInt10164, this.anInt10166, this.anInt10158, local10);
		}
		arg5.ya();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!ha;)V")
	private void method8687(@OriginalArg(1) Class144 arg0) {
		try {
			@Pc(1) Class310 local1 = Static613.aClass310_120;
			@Pc(7) boolean local7 = local1.method7776(this.anInt10149);
			if (local7) {
				arg0.ZA(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				@Pc(24) Class72 local24 = Static227.method3839(Static613.aClass310_120, this.anInt10149);
				this.aClass129_6 = arg0.method6908(local24, 1099776, 0, 255, 1);
				@Pc(37) byte[] local37 = this.aClass129_6.method5295();
				if (local37 == null) {
					this.aByteArray105 = null;
				} else {
					this.aByteArray105 = new byte[local37.length];
					Static691.method82(local37, 0, this.aByteArray105, 0, local37.length);
				}
			}
		} catch (@Pc(69) Exception local69) {
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!uj;B)V")
	public void method8689(@OriginalArg(0) Class366 arg0) {
		if (this.aBoolean708) {
			this.anInt10147 = this.anInt10154;
		} else if (arg0 != null && arg0.aBoolean708) {
			this.anInt10147 = 255 - arg0.anInt10154;
		} else {
			this.anInt10147 = 0;
		}
		this.aBoolean708 = true;
		this.aClass366_5 = arg0;
		this.anInt10154 = 0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)Z")
	public boolean method8690() {
		return this.aBoolean708;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIB)V")
	public void method8692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10154 = (arg1 - this.anInt10147) * arg0 / 255 + this.anInt10147;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIILclient!ha;)V")
	private void method8693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class144 arg4) {
		@Pc(7) Class263 local7 = arg4.method6943().method8434();
		@Pc(10) Class263 local10 = arg4.method6914();
		local10.method8444(0, 0, 0);
		local10.method8435(arg0 & 0x3FFF);
		local10.method8439(arg3 & 0x3FFF);
		local10.method8441(arg2 & 0x3FFF);
		arg4.method6896(local10);
		@Pc(36) Class263 local36 = arg4.method6914();
		local36.method8432();
		if (this.anInt10156 != arg1) {
			this.aClass129_6.method5303((byte) arg1, this.aByteArray105);
			this.anInt10156 = arg1;
		}
		this.aClass129_6.method5307(local36, (Class4_Sub1) null, 0);
		arg4.method6896(local7);
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V")
	public void method8694() {
		this.anInt10154 = 0;
		this.aBoolean708 = false;
		this.aClass366_5 = null;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Lclient!uj;")
	public Class366 method8695() {
		return this.aClass366_5;
	}
}
