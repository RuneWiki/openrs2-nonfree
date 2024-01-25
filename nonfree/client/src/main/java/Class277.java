import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class277 {

	@OriginalMember(owner = "client!pca", name = "w", descriptor = "Lclient!ka;")
	private Class54 aClass54_5;

	@OriginalMember(owner = "client!pca", name = "C", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!pca", name = "B", descriptor = "I")
	private int anInt7780;

	@OriginalMember(owner = "client!pca", name = "G", descriptor = "I")
	private int anInt7786;

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "I")
	private int anInt7792;

	@OriginalMember(owner = "client!pca", name = "x", descriptor = "Lclient!tb;")
	private Class49 aClass49_29;

	@OriginalMember(owner = "client!pca", name = "m", descriptor = "I")
	private int anInt7795;

	@OriginalMember(owner = "client!pca", name = "e", descriptor = "I")
	private int anInt7796;

	@OriginalMember(owner = "client!pca", name = "o", descriptor = "I")
	private int anInt7797;

	@OriginalMember(owner = "client!pca", name = "i", descriptor = "Lclient!pca;")
	private Class277 aClass277_5;

	@OriginalMember(owner = "client!pca", name = "J", descriptor = "I")
	private int anInt7798;

	@OriginalMember(owner = "client!pca", name = "h", descriptor = "Z")
	private boolean aBoolean585;

	@OriginalMember(owner = "client!pca", name = "f", descriptor = "I")
	private int anInt7784 = -1;

	@OriginalMember(owner = "client!pca", name = "p", descriptor = "Z")
	private boolean aBoolean584 = true;

	@OriginalMember(owner = "client!pca", name = "n", descriptor = "I")
	private final int anInt7777;

	@OriginalMember(owner = "client!pca", name = "u", descriptor = "I")
	private final int anInt7773;

	@OriginalMember(owner = "client!pca", name = "t", descriptor = "I")
	private final int anInt7778;

	@OriginalMember(owner = "client!pca", name = "H", descriptor = "[Lclient!rga;")
	private final Class314[] aClass314Array2;

	@OriginalMember(owner = "client!pca", name = "I", descriptor = "I")
	private final int anInt7774;

	@OriginalMember(owner = "client!pca", name = "k", descriptor = "I")
	private final int anInt7781;

	@OriginalMember(owner = "client!pca", name = "s", descriptor = "[Lclient!rga;")
	private final Class314[] aClass314Array1;

	@OriginalMember(owner = "client!pca", name = "r", descriptor = "Lclient!rga;")
	private final Class314 aClass314_1;

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "I")
	private final int anInt7775;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(I[Lclient!rga;IIIIII)V")
	public Class277(@OriginalArg(0) int arg0, @OriginalArg(1) Class314[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt7777 = arg5;
		this.anInt7773 = arg6;
		this.anInt7778 = arg4;
		this.aClass314Array2 = arg1;
		this.anInt7774 = arg3;
		this.anInt7781 = arg0;
		if (arg1 == null) {
			this.aClass314Array1 = null;
			this.aClass314_1 = null;
		} else {
			this.aClass314Array1 = new Class314[arg1.length];
			this.aClass314_1 = arg2 < 0 ? null : arg1[arg2];
		}
		this.anInt7775 = arg7;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)Lclient!pca;")
	public Class277 method6933() {
		return this.aClass277_5;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)V")
	public void method6934(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7795 = this.anInt7792 + arg1 * (arg0 - this.anInt7792) / 255;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)Z")
	public boolean method6936() {
		return this.aBoolean585;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lclient!ha;IIIIZIIIII)V")
	public void method6937(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) int arg4, @OriginalArg(9) int arg5, @OriginalArg(10) int arg6) {
		this.method6943(arg4, arg2, arg0, arg5, arg6, arg1, 0, arg3, 0, 0);
	}

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "(I)V")
	public void method6938() {
		this.anInt7795 = 0;
		this.aBoolean585 = false;
		this.aClass277_5 = null;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ZLclient!pca;)V")
	public void method6939(@OriginalArg(1) Class277 arg0) {
		if (this.aBoolean585) {
			this.anInt7792 = this.anInt7795;
		} else if (arg0 != null && arg0.aBoolean585) {
			this.anInt7792 = 255 - arg0.anInt7795;
		} else {
			this.anInt7792 = 0;
		}
		this.aBoolean585 = true;
		this.anInt7795 = 0;
		this.aClass277_5 = arg0;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIIIZBLclient!ha;IIIIIZI)V")
	private void method6941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class75 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(13) int arg11) {
		@Pc(14) int local14 = 255 - arg2;
		if (this.aClass54_5 == null) {
			arg3 = arg3 + arg9 & 0x3FFF;
			arg5.ya();
			if (this.anInt7781 == -1 || this.anInt7798 == 0) {
				arg5.aa(arg10, arg7, arg6, arg1, local14 << 24 | arg11, 1);
			} else {
				@Pc(60) Class297 local60 = Static538.anInterface11_11.method6027(this.anInt7781);
				if (this.aClass49_29 == null && Static538.anInterface11_11.method6032(this.anInt7781)) {
					@Pc(104) int[] local104 = local60.anInt8252 == 2 ? Static538.anInterface11_11.method6029(this.anInt7798, this.anInt7798, 0.7F, this.anInt7781) : Static538.anInterface11_11.method6031(0.7F, this.anInt7798, this.anInt7798, this.anInt7781, false);
					this.anInt7786 = local104[0];
					this.anInt7796 = local104[local104.length - 1];
					this.aClass49_29 = arg5.method6692(this.anInt7798, this.anInt7798, local104, this.anInt7798);
				}
				@Pc(145) int local145 = local14 == 255 ? (local60.anInt8252 == 2 ? 1 : 0) : 1;
				if (local145 == 1 && arg4) {
					arg5.aa(arg10, arg7, arg6, arg1, arg11, 0);
				}
				if (this.aClass49_29 != null) {
					@Pc(171) int local171 = arg0 * arg1 / -4096;
					@Pc(183) int local183;
					for (local183 = (arg6 - arg1) / 2 + arg3 * arg1 / 4096; local183 > arg1; local183 -= arg1) {
					}
					while (local183 < 0) {
						local183 += arg1;
					}
					@Pc(216) int local216;
					if (this.anInt7773 == 1) {
						for (local216 = local183 - arg1; local216 < arg6; local216 += arg1) {
							this.aClass49_29.method8996(local216 + arg10, local171 + arg7, arg1, arg1, 0, local14 << 24 | 0xFFFFFF, local145);
						}
						if ((this.anInt7786 & 0xFF000000) != 0) {
							arg5.method6631(arg6, 0, local171 + arg7 + 1, this.anInt7786, 0);
						}
						if ((this.anInt7796 & 0xFF000000) != 0) {
							arg5.method6631(arg6, 0, arg1 - local171 - arg7 - arg1, this.anInt7796, arg7 + local171 + arg1);
						}
					} else {
						while (arg1 < local171) {
							local171 -= arg1;
						}
						while (local171 < 0) {
							local171 += arg1;
						}
						for (local216 = local183 - arg1; local216 < arg6; local216 += arg1) {
							for (@Pc(345) int local345 = local171 - arg1; local345 < arg1; local345 += arg1) {
								this.aClass49_29.method8996(local216 + arg10, arg7 + local345, arg1, arg1, 0, local14 << 24 | 0xFFFFFF, local145);
							}
						}
					}
				}
			}
		} else {
			if (arg4) {
				arg5.GA(arg11);
				arg5.ya();
			}
			this.method6942(arg5, arg8, arg0, arg2, arg3);
		}
		for (@Pc(413) int local413 = this.anInt7780 - 1; local413 >= 0; local413--) {
			this.aClass314Array1[local413].method7521(arg5, arg10, arg7, arg6, arg1, arg0, arg3, this.anInt7774, this.anInt7778, this.anInt7777, local14);
		}
		arg5.ya();
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Lclient!ha;IIIII)V")
	private void method6942(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class109 local7 = arg0.method6636().method4609();
		@Pc(10) Class109 local10 = arg0.method6709();
		local10.method4606(0, 0, 0);
		local10.method4608(arg4 & 0x3FFF);
		local10.method4602(arg2 & 0x3FFF);
		local10.method4611(arg1 & 0x3FFF);
		arg0.method6695(local10);
		@Pc(36) Class109 local36 = arg0.method6709();
		local36.method4612();
		if (this.anInt7797 != arg3) {
			this.aClass54_5.method7424((byte) arg3, this.aByteArray76);
			this.anInt7797 = arg3;
		}
		this.aClass54_5.method7401(local36, (Class60_Sub10) null, 0);
		arg0.method6695(local7);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIILclient!ha;IZIIZIIII)V")
	public void method6943(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) int arg8, @OriginalArg(12) int arg9) {
		@Pc(14) int local14 = 0;
		if (this.aBoolean585) {
			local14 = this.anInt7795;
		}
		if (this.aClass277_5 == null) {
			this.method6941(arg7, arg1, local14, arg3, true, arg2, arg4, arg5, arg9, arg8, arg0, arg6);
			return;
		}
		@Pc(43) Class277 local43 = this;
		@Pc(46) Class277 local46 = this.aClass277_5;
		if (this.hashCode() > local46.hashCode()) {
			local14 = 255 - local14;
			local46 = this;
			local43 = this.aClass277_5;
		}
		local43.method6941(arg7, arg1, local14, arg3, true, arg2, arg4, arg5, arg9, arg8, arg0, arg6);
		local46.method6941(arg7, arg1, 255 - local14, arg3, false, arg2, arg4, arg5, arg9, arg8, arg0, arg6);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILclient!ha;BI)Z")
	public boolean method6944(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(3) int arg2) {
		if (this.anInt7784 != arg0) {
			this.anInt7784 = arg0;
			@Pc(20) int local20 = Static468.method7064(arg0);
			if (local20 > 512) {
				local20 = 512;
			}
			if (local20 <= 0) {
				local20 = 1;
			}
			if (this.anInt7798 != local20) {
				this.aClass49_29 = null;
				this.anInt7798 = local20;
			}
			if (this.aClass314Array2 != null) {
				this.anInt7780 = 0;
				@Pc(57) int[] local57 = new int[this.aClass314Array2.length];
				for (@Pc(59) int local59 = 0; local59 < this.aClass314Array2.length; local59++) {
					@Pc(66) Class314 local66 = this.aClass314Array2[local59];
					if (local66.method7522(this.anInt7774, this.anInt7778, this.anInt7777, this.anInt7784)) {
						local57[this.anInt7780] = local66.anInt8586;
						this.aClass314Array1[this.anInt7780++] = local66;
					}
				}
				Static338.method5212(this.anInt7780 - 1, local57, this.aClass314Array1, 0);
			}
			this.aBoolean584 = true;
		}
		@Pc(119) boolean local119 = false;
		if (this.aBoolean584) {
			this.aBoolean584 = false;
			for (@Pc(130) int local130 = this.anInt7780 - 1; local130 >= 0; local130--) {
				@Pc(141) boolean local141 = this.aClass314Array1[local130].method7524(arg1, this.aClass314_1);
				this.aBoolean584 |= !local141;
				local119 |= local141;
			}
		}
		if (arg2 == 0 || !arg1.method6640()) {
			this.aClass54_5 = null;
		} else if (this.aClass54_5 == null && this.anInt7775 >= 0) {
			this.method6945(arg1);
		}
		if (this.aClass277_5 != null && this.aClass277_5 != this) {
			this.aClass277_5.method6938();
			local119 |= this.aClass277_5.method6944(arg0, arg1, arg2);
		}
		return local119;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ZLclient!ha;)V")
	private void method6945(@OriginalArg(1) Class75 arg0) {
		try {
			@Pc(11) Class223 local11 = Static190.aClass223_38;
			@Pc(17) boolean local17 = local11.method5270(this.anInt7775);
			if (local17) {
				arg0.ZA(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				@Pc(34) Class316 local34 = Static347.method5332(this.anInt7775, Static190.aClass223_38);
				this.aClass54_5 = arg0.method6688(local34, 1099776, 0, 255, 1);
				@Pc(47) byte[] local47 = this.aClass54_5.method7423();
				if (local47 == null) {
					this.aByteArray76 = null;
				} else {
					this.aByteArray76 = new byte[local47.length];
					Static695.method5648(local47, 0, this.aByteArray76, 0, local47.length);
				}
			}
		} catch (@Pc(69) Exception local69) {
		}
	}
}
