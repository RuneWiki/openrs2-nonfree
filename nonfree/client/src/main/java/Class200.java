import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class200 {

	@OriginalMember(owner = "client!jr", name = "l", descriptor = "Lclient!ka;")
	private Class170 aClass170_4;

	@OriginalMember(owner = "client!jr", name = "s", descriptor = "I")
	private int anInt5186;

	@OriginalMember(owner = "client!jr", name = "o", descriptor = "Z")
	private boolean aBoolean340;

	@OriginalMember(owner = "client!jr", name = "A", descriptor = "Lclient!jr;")
	private Class200 aClass200_2;

	@OriginalMember(owner = "client!jr", name = "u", descriptor = "[B")
	private byte[] aByteArray48;

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
	private int anInt5188;

	@OriginalMember(owner = "client!jr", name = "L", descriptor = "I")
	private int anInt5193;

	@OriginalMember(owner = "client!jr", name = "E", descriptor = "I")
	private int anInt5197;

	@OriginalMember(owner = "client!jr", name = "q", descriptor = "Lclient!kw;")
	private Class178 aClass178_11;

	@OriginalMember(owner = "client!jr", name = "F", descriptor = "I")
	private int anInt5201;

	@OriginalMember(owner = "client!jr", name = "J", descriptor = "I")
	private int anInt5202;

	@OriginalMember(owner = "client!jr", name = "w", descriptor = "I")
	private int anInt5203;

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
	private int anInt5183 = -1;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "Z")
	private boolean aBoolean341 = true;

	@OriginalMember(owner = "client!jr", name = "v", descriptor = "[Lclient!ru;")
	private final Class332[] aClass332Array1;

	@OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
	private final int anInt5190;

	@OriginalMember(owner = "client!jr", name = "B", descriptor = "I")
	private final int anInt5184;

	@OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
	private final int anInt5196;

	@OriginalMember(owner = "client!jr", name = "G", descriptor = "I")
	private final int anInt5177;

	@OriginalMember(owner = "client!jr", name = "C", descriptor = "I")
	private final int anInt5189;

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "[Lclient!ru;")
	private final Class332[] aClass332Array2;

	@OriginalMember(owner = "client!jr", name = "K", descriptor = "Lclient!ru;")
	private final Class332 aClass332_1;

	@OriginalMember(owner = "client!jr", name = "z", descriptor = "I")
	private final int anInt5181;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(I[Lclient!ru;IIIIII)V")
	public Class200(@OriginalArg(0) int arg0, @OriginalArg(1) Class332[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass332Array1 = arg1;
		this.anInt5190 = arg5;
		this.anInt5184 = arg4;
		this.anInt5196 = arg0;
		this.anInt5177 = arg3;
		this.anInt5189 = arg6;
		if (arg1 == null) {
			this.aClass332Array2 = null;
			this.aClass332_1 = null;
		} else {
			this.aClass332Array2 = new Class332[arg1.length];
			this.aClass332_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
		this.anInt5181 = arg7;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIIIIIIILclient!ha;)V")
	public void method4695(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(10) Class22 arg6) {
		this.method4706(arg6, arg4, 0, arg2, arg3, arg5, arg0, 0, arg1, 0);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)Lclient!jr;")
	public Class200 method4696() {
		return this.aClass200_2;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	public void method4697() {
		this.anInt5193 = 0;
		this.aBoolean340 = false;
		this.aClass200_2 = null;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BIIIIIIIILclient!ha;ZZII)V")
	private void method4699(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class22 arg8, @OriginalArg(10) boolean arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11) {
		@Pc(10) int local10 = 255 - arg6;
		if (this.aClass170_4 == null) {
			arg8.ya();
			arg4 = arg3 + arg4 & 0x3FFF;
			if (this.anInt5196 == -1 || this.anInt5188 == 0) {
				arg8.aa(arg7, arg0, arg5, arg11, arg2 | local10 << 24, 1);
			} else {
				@Pc(52) Class406 local52 = Static395.anInterface4_9.method5761(this.anInt5196);
				if (this.aClass178_11 == null && Static395.anInterface4_9.method5758(this.anInt5196)) {
					@Pc(98) int[] local98 = local52.anInt11143 == 2 ? Static395.anInterface4_9.method5757(this.anInt5188, this.anInt5188, this.anInt5196, 0.7F) : Static395.anInterface4_9.method5760(this.anInt5188, this.anInt5188, false, 0.7F, this.anInt5196);
					this.anInt5201 = local98[0];
					this.anInt5197 = local98[local98.length - 1];
					this.aClass178_11 = arg8.method9367(local98, this.anInt5188, this.anInt5188, this.anInt5188);
				}
				@Pc(145) int local145 = local10 == 255 ? (local52.anInt11143 == 2 ? 1 : 0) : 1;
				if (local145 == 1 && arg9) {
					arg8.aa(arg7, arg0, arg5, arg11, arg2, 0);
				}
				if (this.aClass178_11 != null) {
					@Pc(171) int local171 = arg11 * arg1 / -4096;
					@Pc(184) int local184;
					for (local184 = (arg5 - arg11) / 2 + arg11 * arg4 / 4096; local184 > arg11; local184 -= arg11) {
					}
					while (local184 < 0) {
						local184 += arg11;
					}
					@Pc(221) int local221;
					if (this.anInt5189 == 1) {
						for (local221 = local184 - arg11; local221 < arg5; local221 += arg11) {
							this.aClass178_11.method7630(local221 + arg7, local171 - -arg0, arg11, arg11, 0, local10 << 24 | 0xFFFFFF, local145);
						}
						if ((this.anInt5201 & 0xFF000000) != 0) {
							arg8.method9378(0, 0, this.anInt5201, local171 + arg0 + 1, arg5);
						}
						if ((this.anInt5197 & 0xFF000000) != 0) {
							arg8.method9378(arg0 + local171 + arg11, 0, this.anInt5197, arg11 - arg11 - arg0 - local171, arg5);
						}
					} else {
						while (local171 > arg11) {
							local171 -= arg11;
						}
						while (local171 < 0) {
							local171 += arg11;
						}
						for (local221 = local184 - arg11; local221 < arg5; local221 += arg11) {
							for (@Pc(347) int local347 = local171 - arg11; local347 < arg11; local347 += arg11) {
								this.aClass178_11.method7630(arg7 + local221, local347 - -arg0, arg11, arg11, 0, local10 << 24 | 0xFFFFFF, local145);
							}
						}
					}
				}
			}
		} else {
			if (arg9) {
				arg8.GA(arg2);
				arg8.ya();
			}
			this.method4704(arg10, arg4, arg1, arg8, arg6);
		}
		for (@Pc(424) int local424 = this.anInt5202 - 1; local424 >= 0; local424--) {
			this.aClass332Array2[local424].method7439(arg8, arg7, arg0, arg5, arg11, arg1, arg4, this.anInt5177, this.anInt5184, this.anInt5190, local10);
		}
		arg8.ya();
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)Z")
	public boolean method4700() {
		return this.aBoolean340;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IBILclient!ha;)Z")
	public boolean method4701(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class22 arg2) {
		if (this.anInt5183 != arg0) {
			this.anInt5183 = arg0;
			@Pc(16) int local16 = Static70.method3137(arg0);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (local16 != this.anInt5188) {
				this.aClass178_11 = null;
				this.anInt5188 = local16;
			}
			if (this.aClass332Array1 != null) {
				this.anInt5202 = 0;
				@Pc(55) int[] local55 = new int[this.aClass332Array1.length];
				for (@Pc(57) int local57 = 0; local57 < this.aClass332Array1.length; local57++) {
					@Pc(64) Class332 local64 = this.aClass332Array1[local57];
					if (local64.method7440(this.anInt5177, this.anInt5184, this.anInt5190, this.anInt5183)) {
						local55[this.anInt5202] = local64.anInt8729;
						this.aClass332Array2[this.anInt5202++] = local64;
					}
				}
				Static94.method1949(0, this.anInt5202 - 1, this.aClass332Array2, local55);
			}
			this.aBoolean341 = true;
		}
		@Pc(127) boolean local127 = false;
		if (this.aBoolean341) {
			this.aBoolean341 = false;
			for (@Pc(138) int local138 = this.anInt5202 - 1; local138 >= 0; local138--) {
				@Pc(149) boolean local149 = this.aClass332Array2[local138].method7444(arg2, this.aClass332_1);
				local127 |= local149;
				this.aBoolean341 |= !local149;
			}
		}
		if (arg1 == 0 || !arg2.method9408()) {
			this.aClass170_4 = null;
		} else if (this.aClass170_4 == null && this.anInt5181 >= 0) {
			this.method4702(arg2);
		}
		if (this.aClass200_2 != null && this.aClass200_2 != this) {
			this.aClass200_2.method4697();
			local127 |= this.aClass200_2.method4701(arg0, arg1, arg2);
		}
		return local127;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILclient!ha;)V")
	private void method4702(@OriginalArg(1) Class22 arg0) {
		try {
			@Pc(1) Class182 local1 = Static177.aClass182_47;
			@Pc(15) boolean local15 = local1.method3957(this.anInt5181);
			if (local15) {
				arg0.ZA(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				@Pc(32) Class145 local32 = Static716.method9500(this.anInt5181, Static177.aClass182_47);
				this.aClass170_4 = arg0.method9382(local32, 1099776, 0, 255, 1);
				@Pc(45) byte[] local45 = this.aClass170_4.method8366();
				if (local45 == null) {
					this.aByteArray48 = null;
				} else {
					this.aByteArray48 = new byte[local45.length];
					Static732.method6320(local45, 0, this.aByteArray48, 0, local45.length);
				}
			}
		} catch (@Pc(69) Exception local69) {
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)V")
	public void method4703(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5193 = (arg1 - this.anInt5203) * arg0 / 255 + this.anInt5203;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIILclient!ha;ZI)V")
	private void method4704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class22 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class58 local7 = arg3.method9369().method9522();
		@Pc(10) Class58 local10 = arg3.method9376();
		local10.method9524(0, 0, 0);
		local10.method9521(arg1 & 0x3FFF);
		local10.method9518(arg2 & 0x3FFF);
		local10.method9517(arg0 & 0x3FFF);
		arg3.method9405(local10);
		@Pc(46) Class58 local46 = arg3.method9376();
		local46.method9508();
		if (arg4 != this.anInt5186) {
			this.aClass170_4.method8363((byte) arg4, this.aByteArray48);
			this.anInt5186 = arg4;
		}
		this.aClass170_4.method8360(local46, (Class9_Sub9) null, 0);
		arg3.method9405(local7);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!ha;BIIIIIIIZIIZ)V")
	public void method4706(@OriginalArg(0) Class22 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(5) int local5 = 0;
		if (this.aBoolean340) {
			local5 = this.anInt5193;
		}
		if (this.aClass200_2 == null) {
			this.method4699(arg1, arg5, arg2, arg9, arg8, arg6, local5, arg3, arg0, true, arg7, arg4);
			return;
		}
		@Pc(16) Class200 local16 = this;
		@Pc(19) Class200 local19 = this.aClass200_2;
		if (this.hashCode() > local19.hashCode()) {
			local19 = this;
			local5 = 255 - local5;
			local16 = this.aClass200_2;
		}
		local16.method4699(arg1, arg5, arg2, arg9, arg8, arg6, local5, arg3, arg0, true, arg7, arg4);
		local19.method4699(arg1, arg5, arg2, arg9, arg8, arg6, 255 - local5, arg3, arg0, false, arg7, arg4);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!jr;I)V")
	public void method4707(@OriginalArg(0) Class200 arg0) {
		if (this.aBoolean340) {
			this.anInt5203 = this.anInt5193;
		} else if (arg0 != null && arg0.aBoolean340) {
			this.anInt5203 = 255 - arg0.anInt5193;
		} else {
			this.anInt5203 = 0;
		}
		this.aClass200_2 = arg0;
		this.anInt5193 = 0;
		this.aBoolean340 = true;
	}
}
