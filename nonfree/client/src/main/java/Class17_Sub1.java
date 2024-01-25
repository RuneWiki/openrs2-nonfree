import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public abstract class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "I")
	protected int anInt5993;

	@OriginalMember(owner = "client!ica", name = "t", descriptor = "I")
	protected int anInt6010;

	@OriginalMember(owner = "client!ica", name = "x", descriptor = "I")
	protected int anInt6014;

	@OriginalMember(owner = "client!ica", name = "D", descriptor = "[I")
	private int[] anIntArray450;

	@OriginalMember(owner = "client!ica", name = "E", descriptor = "I")
	protected int anInt6020;

	@OriginalMember(owner = "client!ica", name = "s", descriptor = "Lclient!bs;")
	protected final Class33_Sub1 aClass33_Sub1_10;

	@OriginalMember(owner = "client!ica", name = "G", descriptor = "I")
	public final int anInt6022;

	@OriginalMember(owner = "client!ica", name = "y", descriptor = "I")
	public final int anInt6015;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lclient!bs;II)V")
	public Class17_Sub1(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass33_Sub1_10 = arg0;
		this.anInt6022 = arg1;
		this.anInt6015 = arg2;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "([I)V")
	@Override
	public final void method5267(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt6020;
		arg0[1] = this.anInt6014;
		arg0[2] = this.anInt6010;
		arg0[3] = this.anInt5993;
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "()I")
	@Override
	public final int method5253() {
		return this.anInt6015;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected final void method5249(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.aClass33_Sub1_10.method1213()) {
			throw new IllegalStateException();
		} else if (this.method5270(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class1_Sub2 local20 = (Class1_Sub2) arg6;
			this.method5273(local20.anIntArray238, local20.anIntArray237, Static243.anInt5992 - arg7, -arg8 - (Static243.anInt6012 - Static243.anInt6000));
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(FFFFFF)Z")
	private boolean method5270(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt6020 + this.anInt6022 + this.anInt6010;
		@Pc(17) int local17 = this.anInt6014 + this.anInt6015 + this.anInt5993;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt6022 || local17 != this.anInt6015) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt6014;
			local65 = local53 * (float) this.anInt6014;
			local71 = local32 * (float) this.anInt6020;
			local77 = local39 * (float) this.anInt6020;
			@Pc(84) float local84 = -local32 * (float) this.anInt6010;
			@Pc(91) float local91 = -local39 * (float) this.anInt6010;
			@Pc(98) float local98 = -local46 * (float) this.anInt5993;
			@Pc(105) float local105 = -local53 * (float) this.anInt5993;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + arg2 - arg0;
		local39 = arg3 + arg5 - arg1;
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) this.aClass33_Sub1_10.anInt1182) {
			local46 = (float) this.aClass33_Sub1_10.anInt1182;
		}
		if (local53 > (float) this.aClass33_Sub1_10.anInt1181) {
			local53 = (float) this.aClass33_Sub1_10.anInt1181;
		}
		if (local59 < (float) this.aClass33_Sub1_10.anInt1171) {
			local59 = (float) this.aClass33_Sub1_10.anInt1171;
		}
		if (local65 > (float) this.aClass33_Sub1_10.anInt1172) {
			local65 = (float) this.aClass33_Sub1_10.anInt1172;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		Static243.anInt6013 = this.aClass33_Sub1_10.anInt1160;
		Static243.anInt6004 = (int) ((float) ((int) local59 * Static243.anInt6013) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static243.anInt6019 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt6022 / local71);
		Static243.anInt6018 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt6015 / local77);
		Static243.anInt6016 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt6022 / local77);
		Static243.anInt5996 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt6015 / local71);
		Static243.anInt6017 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static243.anInt6009 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static243.anInt5998 = (this.anInt6022 >> 1 << 12) + (Static243.anInt6009 * Static243.anInt6016 >> 4);
		Static243.anInt6002 = (this.anInt6015 >> 1 << 12) + (Static243.anInt6009 * Static243.anInt5996 >> 4);
		Static243.anInt6003 = Static243.anInt6017 * Static243.anInt6019 >> 4;
		Static243.anInt6001 = Static243.anInt6017 * Static243.anInt6018 >> 4;
		Static243.anInt5992 = (int) local46;
		Static243.anInt5995 = (int) local53;
		Static243.anInt6000 = (int) local59;
		Static243.anInt6012 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!ica", name = "d", descriptor = "()I")
	@Override
	public final int method5268() {
		return this.anInt6022;
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(IIII)V")
	@Override
	public final void method5250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6020 = arg0;
		this.anInt6014 = arg1;
		this.anInt6010 = arg2;
		this.anInt5993 = arg3;
	}

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "()I")
	@Override
	public final int method5256() {
		return this.anInt6020 + this.anInt6022 + this.anInt6010;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "()I")
	@Override
	public final int method5251() {
		return this.anInt6014 + this.anInt6015 + this.anInt5993;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method5271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIII)V")
	public abstract void method5260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IILclient!aa;II)V")
	public abstract void method5264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected final void method5262(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass33_Sub1_10.method1213()) {
			throw new IllegalStateException();
		} else if (this.method5270(arg0, arg1, arg2, arg3, arg4, arg5)) {
			Static243.anInt6006 = arg7;
			if (arg6 != 1) {
				Static243.anInt5994 = arg7 >>> 24;
				Static243.anInt5997 = 256 - Static243.anInt5994;
				if (arg6 == 0) {
					Static243.anInt6007 = arg7 >> 16 & 0xFF;
					Static243.anInt6005 = arg7 >> 8 & 0xFF;
					Static243.anInt6011 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					Static243.anInt6008 = arg7 >>> 24;
					Static243.anInt5999 = 256 - Static243.anInt6008;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * Static243.anInt5999 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * Static243.anInt5999 & 0xFF0000;
					Static243.anInt6021 = (local68 | local76) >>> 8;
				}
			}
			if (arg6 == 1) {
				this.method5272(1);
			} else if (arg6 == 0) {
				this.method5272(0);
			} else if (arg6 == 3) {
				this.method5272(3);
			} else if (arg6 == 2) {
				this.method5272(2);
			}
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIIIII)V")
	protected abstract void method5257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public final void method5255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass33_Sub1_10.method1213()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray450 == null) {
			this.anIntArray450 = new int[4];
		}
		this.aClass33_Sub1_10.K(this.anIntArray450);
		this.aClass33_Sub1_10.T(this.aClass33_Sub1_10.anInt1182, this.aClass33_Sub1_10.anInt1171, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method5256();
		@Pc(40) int local40 = this.method5251();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method5260(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass33_Sub1_10.KA(this.anIntArray450[0], this.anIntArray450[1], this.anIntArray450[2], this.anIntArray450[3]);
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(II)V")
	protected abstract void method5272(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "([I[III)V")
	protected abstract void method5273(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
