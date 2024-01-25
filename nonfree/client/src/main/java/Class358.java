import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class358 {

	@OriginalMember(owner = "client!to", name = "v", descriptor = "I")
	private int anInt9543;

	@OriginalMember(owner = "client!to", name = "l", descriptor = "Lclient!ka;")
	private Class45 aClass45_8;

	@OriginalMember(owner = "client!to", name = "A", descriptor = "[B")
	private byte[] aByteArray110;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "I")
	private int anInt9549;

	@OriginalMember(owner = "client!to", name = "r", descriptor = "I")
	private int anInt9551;

	@OriginalMember(owner = "client!to", name = "d", descriptor = "Lclient!ug;")
	private Class43 aClass43_27;

	@OriginalMember(owner = "client!to", name = "s", descriptor = "Lclient!to;")
	private Class358 aClass358_30;

	@OriginalMember(owner = "client!to", name = "o", descriptor = "Z")
	private boolean aBoolean822;

	@OriginalMember(owner = "client!to", name = "f", descriptor = "I")
	private int anInt9557;

	@OriginalMember(owner = "client!to", name = "C", descriptor = "I")
	private int anInt9558;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "I")
	private int anInt9566;

	@OriginalMember(owner = "client!to", name = "i", descriptor = "I")
	private int anInt9567;

	@OriginalMember(owner = "client!to", name = "H", descriptor = "I")
	private int anInt9554 = -1;

	@OriginalMember(owner = "client!to", name = "x", descriptor = "Z")
	private boolean aBoolean821 = true;

	@OriginalMember(owner = "client!to", name = "E", descriptor = "I")
	private final int anInt9547;

	@OriginalMember(owner = "client!to", name = "k", descriptor = "I")
	private final int anInt9561;

	@OriginalMember(owner = "client!to", name = "G", descriptor = "[Lclient!lc;")
	private final Class219[] aClass219Array2;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "I")
	private final int anInt9544;

	@OriginalMember(owner = "client!to", name = "y", descriptor = "I")
	private final int anInt9563;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "I")
	private final int anInt9546;

	@OriginalMember(owner = "client!to", name = "u", descriptor = "[Lclient!lc;")
	private final Class219[] aClass219Array1;

	@OriginalMember(owner = "client!to", name = "z", descriptor = "Lclient!lc;")
	private final Class219 aClass219_1;

	@OriginalMember(owner = "client!to", name = "I", descriptor = "I")
	private final int anInt9553;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(I[Lclient!lc;IIIIII)V")
	public Class358(@OriginalArg(0) int arg0, @OriginalArg(1) Class219[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt9547 = arg5;
		this.anInt9561 = arg0;
		this.aClass219Array2 = arg1;
		this.anInt9544 = arg3;
		this.anInt9563 = arg6;
		this.anInt9546 = arg4;
		if (arg1 == null) {
			this.aClass219Array1 = null;
			this.aClass219_1 = null;
		} else {
			this.aClass219Array1 = new Class219[arg1.length];
			this.aClass219_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
		this.anInt9553 = arg7;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)Lclient!to;")
	public Class358 method8429() {
		return this.aClass358_30;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZIBIIIIIIILclient!ha;IZ)V")
	public void method8430(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class145 arg8, @OriginalArg(11) int arg9) {
		@Pc(5) int local5 = 0;
		if (this.aBoolean822) {
			local5 = this.anInt9567;
		}
		if (this.aClass358_30 == null) {
			this.method8437(arg0, local5, arg6, arg2, arg7, arg9, arg3, arg4, arg5, true, arg8, arg1);
			return;
		}
		@Pc(42) Class358 local42 = this;
		@Pc(45) Class358 local45 = this.aClass358_30;
		if (this.hashCode() > local45.hashCode()) {
			local5 = 255 - local5;
			local45 = this;
			local42 = this.aClass358_30;
		}
		local42.method8437(arg0, local5, arg6, arg2, arg7, arg9, arg3, arg4, arg5, true, arg8, arg1);
		local45.method8437(arg0, 255 - local5, arg6, arg2, arg7, arg9, arg3, arg4, arg5, false, arg8, arg1);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V")
	public void method8431() {
		this.aClass358_30 = null;
		this.anInt9567 = 0;
		this.aBoolean822 = false;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!ha;II)Z")
	public boolean method8432(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(3) int arg2) {
		if (arg2 != this.anInt9554) {
			this.anInt9554 = arg2;
			@Pc(16) int local16 = Static457.method6640(arg2);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (local16 != this.anInt9566) {
				this.aClass43_27 = null;
				this.anInt9566 = local16;
			}
			if (this.aClass219Array2 != null) {
				this.anInt9543 = 0;
				@Pc(55) int[] local55 = new int[this.aClass219Array2.length];
				for (@Pc(57) int local57 = 0; local57 < this.aClass219Array2.length; local57++) {
					@Pc(64) Class219 local64 = this.aClass219Array2[local57];
					if (local64.method5105(this.anInt9544, this.anInt9546, this.anInt9547, this.anInt9554)) {
						local55[this.anInt9543] = local64.anInt5671;
						this.aClass219Array1[this.anInt9543++] = local64;
					}
				}
				Static458.method6647(this.aClass219Array1, this.anInt9543 - 1, local55, 0);
			}
			this.aBoolean821 = true;
		}
		@Pc(129) boolean local129 = false;
		if (this.aBoolean821) {
			this.aBoolean821 = false;
			for (@Pc(140) int local140 = this.anInt9543 - 1; local140 >= 0; local140--) {
				@Pc(151) boolean local151 = this.aClass219Array1[local140].method5109(arg1, this.aClass219_1);
				this.aBoolean821 |= !local151;
				local129 |= local151;
			}
		}
		if (arg0 == 0 || !arg1.method9715()) {
			this.aClass45_8 = null;
		} else if (this.aClass45_8 == null && this.anInt9553 >= 0) {
			this.method8435(arg1);
		}
		if (this.aClass358_30 != null && this.aClass358_30 != this) {
			this.aClass358_30.method8431();
			local129 |= this.aClass358_30.method8432(arg0, arg1, arg2);
		}
		return local129;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIBLclient!ha;IIIIII)V")
	public void method8433(@OriginalArg(1) int arg0, @OriginalArg(4) Class145 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) int arg4, @OriginalArg(9) int arg5, @OriginalArg(10) int arg6) {
		this.method8430(arg6, arg2, 0, 0, arg5, arg3, 0, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BLclient!to;)V")
	public void method8434(@OriginalArg(1) Class358 arg0) {
		if (this.aBoolean822) {
			this.anInt9549 = this.anInt9567;
		} else if (arg0 != null && arg0.aBoolean822) {
			this.anInt9549 = 255 - arg0.anInt9567;
		} else {
			this.anInt9549 = 0;
		}
		this.aClass358_30 = arg0;
		this.anInt9567 = 0;
		this.aBoolean822 = true;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!ha;)V")
	private void method8435(@OriginalArg(1) Class145 arg0) {
		try {
			@Pc(1) Class254 local1 = Static544.aClass254_135;
			@Pc(7) boolean local7 = local1.method6095(this.anInt9553);
			if (local7) {
				arg0.ZA(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				@Pc(24) Class229 local24 = Static594.method8178(this.anInt9553, Static544.aClass254_135);
				this.aClass45_8 = arg0.method9700(local24, 1099776, 0, 255, 1);
				@Pc(37) byte[] local37 = this.aClass45_8.method5752();
				if (local37 == null) {
					this.aByteArray110 = null;
				} else {
					this.aByteArray110 = new byte[local37.length];
					Static728.method274(local37, 0, this.aByteArray110, 0, local37.length);
				}
			}
		} catch (@Pc(61) Exception local61) {
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(III)V")
	public void method8436(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9567 = (arg1 - this.anInt9549) * arg0 / 255 + this.anInt9549;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZIIIIIIIIIIZLclient!ha;I)V")
	private void method8437(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) boolean arg9, @OriginalArg(12) Class145 arg10, @OriginalArg(13) int arg11) {
		@Pc(10) int local10 = 255 - arg1;
		if (this.aClass45_8 == null) {
			arg10.ya();
			arg7 = arg7 + arg2 & 0x3FFF;
			if (this.anInt9561 == -1 || this.anInt9566 == 0) {
				arg10.aa(arg5, arg11, arg0, arg4, arg6 | local10 << 24, 1);
			} else {
				@Pc(64) Class8 local64 = Static309.anInterface3_4.method2857(this.anInt9561);
				if (this.aClass43_27 == null && Static309.anInterface3_4.method2852(this.anInt9561)) {
					@Pc(108) int[] local108 = local64.anInt186 == 2 ? Static309.anInterface3_4.method2854(this.anInt9566, this.anInt9561, this.anInt9566, 0.7F) : Static309.anInterface3_4.method2853(this.anInt9561, 0.7F, this.anInt9566, this.anInt9566, false);
					this.anInt9558 = local108[0];
					this.anInt9551 = local108[local108.length - 1];
					this.aClass43_27 = arg10.method9711(this.anInt9566, this.anInt9566, this.anInt9566, local108);
				}
				@Pc(150) int local150 = local10 == 255 ? (local64.anInt186 == 2 ? 1 : 0) : 1;
				if (local150 == 1 && arg9) {
					arg10.aa(arg5, arg11, arg0, arg4, arg6, 0);
				}
				if (this.aClass43_27 != null) {
					@Pc(176) int local176 = arg4 * arg8 / -4096;
					@Pc(189) int local189;
					for (local189 = (arg0 - arg4) / 2 + arg7 * arg4 / 4096; local189 > arg4; local189 -= arg4) {
					}
					while (local189 < 0) {
						local189 += arg4;
					}
					@Pc(223) int local223;
					if (this.anInt9563 == 1) {
						for (local223 = local189 - arg4; local223 < arg0; local223 += arg4) {
							this.aClass43_27.method9584(arg5 + local223, local176 - -arg11, arg4, arg4, 0, local10 << 24 | 0xFFFFFF, local150);
						}
						if ((this.anInt9558 & 0xFF000000) != 0) {
							arg10.method9637(arg0, local176 + arg11 + 1, 0, this.anInt9558, 0);
						}
						if ((this.anInt9551 & 0xFF000000) != 0) {
							arg10.method9637(arg0, arg4 - arg11 - local176 - arg4, local176 + (arg11 - -arg4), this.anInt9551, 0);
						}
					} else {
						while (arg4 < local176) {
							local176 -= arg4;
						}
						while (local176 < 0) {
							local176 += arg4;
						}
						for (local223 = local189 - arg4; local223 < arg0; local223 += arg4) {
							for (@Pc(354) int local354 = local176 - arg4; local354 < arg4; local354 += arg4) {
								this.aClass43_27.method9584(local223 + arg5, arg11 + local354, arg4, arg4, 0, local10 << 24 | 0xFFFFFF, local150);
							}
						}
					}
				}
			}
		} else {
			if (arg9) {
				arg10.GA(arg6);
				arg10.ya();
			}
			this.method8438(arg7, arg10, arg3, arg1, arg8);
		}
		for (@Pc(422) int local422 = this.anInt9543 - 1; local422 >= 0; local422--) {
			this.aClass219Array1[local422].method5108(arg10, arg5, arg11, arg0, arg4, arg8, arg7, this.anInt9544, this.anInt9546, this.anInt9547, local10);
		}
		if (4096 != 4096) {
			this.anInt9567 = -65;
		}
		arg10.ya();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!ha;IIII)V")
	private void method8438(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class86 local7 = arg1.method9716().method7018();
		@Pc(10) Class86 local10 = arg1.method9691();
		local10.method7026(0, 0, 0);
		local10.method7034(arg0 & 0x3FFF);
		local10.method7027(arg4 & 0x3FFF);
		local10.method7022(arg2 & 0x3FFF);
		arg1.method9656(local10);
		@Pc(41) Class86 local41 = arg1.method9691();
		local41.method7024();
		if (arg3 != this.anInt9557) {
			this.aClass45_8.method5762((byte) arg3, this.aByteArray110);
			this.anInt9557 = arg3;
		}
		this.aClass45_8.method5769(local41, (Class4_Sub6) null, 0);
		arg1.method9656(local7);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)Z")
	public boolean method8439() {
		return this.aBoolean822;
	}
}
