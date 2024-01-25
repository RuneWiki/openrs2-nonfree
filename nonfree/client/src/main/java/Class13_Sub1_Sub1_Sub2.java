import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class13_Sub1_Sub1_Sub2 extends Class13_Sub1_Sub1 {

	@OriginalMember(owner = "client!lw", name = "bb", descriptor = "Lclient!pba;")
	private Class13_Sub9 aClass13_Sub9_4;

	@OriginalMember(owner = "client!lw", name = "Y", descriptor = "Z")
	public boolean aBoolean377 = false;

	@OriginalMember(owner = "client!lw", name = "T", descriptor = "I")
	private final int anInt5283 = -1;

	@OriginalMember(owner = "client!lw", name = "U", descriptor = "I")
	private int anInt5284 = 0;

	@OriginalMember(owner = "client!lw", name = "H", descriptor = "I")
	private int anInt5280 = 0;

	@OriginalMember(owner = "client!lw", name = "hb", descriptor = "I")
	private int anInt5294 = 0;

	@OriginalMember(owner = "client!lw", name = "nb", descriptor = "I")
	private int anInt5299 = 0;

	@OriginalMember(owner = "client!lw", name = "jb", descriptor = "I")
	private int anInt5296 = 0;

	@OriginalMember(owner = "client!lw", name = "cb", descriptor = "Z")
	private boolean aBoolean378 = true;

	@OriginalMember(owner = "client!lw", name = "pb", descriptor = "I")
	public final int anInt5301;

	@OriginalMember(owner = "client!lw", name = "mb", descriptor = "I")
	private final int anInt5298;

	@OriginalMember(owner = "client!lw", name = "E", descriptor = "Lclient!ec;")
	private Class81 aClass81_1;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class13_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt5301 = arg1 + arg2;
		this.anInt5280 = arg12;
		this.anInt5298 = arg0;
		@Pc(53) Class39 local53 = Static460.aClass155_2.method3363(this.anInt5298);
		@Pc(56) int local56 = local53.anInt1044;
		if (local56 == -1) {
			this.aBoolean377 = true;
		} else {
			this.aClass81_1 = Static540.aClass173_2.method3791(local56);
			this.aBoolean377 = false;
		}
		if (this.anInt5301 == arg2) {
			Static589.method8022(this.anInt5296, this.aClass81_1, this);
		}
	}

	@OriginalMember(owner = "client!lw", name = "g", descriptor = "(I)I")
	@Override
	public int method8402(@OriginalArg(0) int arg0) {
		if (arg0 != -1) {
			this.method4502(-24);
		}
		return this.anInt5299;
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(Lclient!ha;I)Lclient!jl;")
	@Override
	public Class13_Sub6 method8399(@OriginalArg(0) Class95 arg0) {
		@Pc(20) Class182 local20 = this.method4500(this.anInt5298, (this.anInt5280 == 0 ? 0 : 5) | 0x800, arg0);
		if (local20 == null) {
			return null;
		}
		if (this.anInt5280 != 0) {
			local20.a(this.anInt5280 * 2048);
		}
		@Pc(39) Class177 local39 = arg0.method6967();
		local39.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
		this.method4501(local39, local20, arg0);
		@Pc(60) Class13_Sub6 local60 = Static491.method6848(1, false);
		if (Static449.aBoolean538) {
			local20.method6194(local39, local60.aClass13_Sub2Array1[0], Static638.anInt7982, 0);
		} else {
			local20.method6206(local39, local60.aClass13_Sub2Array1[0], 0);
		}
		if (this.aClass13_Sub9_4 != null) {
			@Pc(88) Class98 local88 = this.aClass13_Sub9_4.method5660();
			if (Static449.aBoolean538) {
				arg0.method6977(local88, Static638.anInt7982);
			} else {
				arg0.method6960(local88);
			}
		}
		this.aBoolean378 = local20.F();
		this.anInt5284 = local20.fa();
		this.anInt5299 = local20.ma();
		return local60;
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(ILclient!ha;)Lclient!gp;")
	@Override
	public Class128 method8412(@OriginalArg(1) Class95 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!lw", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8408() {
		return false;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIILclient!ha;)Lclient!ka;")
	private Class182 method4500(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class95 arg2) {
		@Pc(16) Class39 local16 = Static460.aClass155_2.method3363(arg0);
		@Pc(21) Class76 local21 = Static462.aClass76Array3[super.aByte127];
		@Pc(36) Class76 local36 = super.aByte126 < 3 ? Static462.aClass76Array3[super.aByte126 + 1] : null;
		return this.aBoolean377 ? local16.method812(-1, Static540.aClass173_2, arg2, arg1, super.anInt10090, super.anInt10089, local36, -1, 0, local21, super.anInt10097) : local16.method812(this.anInt5296, Static540.aClass173_2, arg2, arg1, super.anInt10090, super.anInt10089, local36, this.anInt5283, this.anInt5294, local21, super.anInt10097);
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8415(@OriginalArg(1) Class95 arg0) {
		@Pc(11) Class182 local11 = this.method4500(this.anInt5298, 0, arg0);
		if (local11 != null) {
			@Pc(24) Class177 local24 = arg0.method6967();
			local24.method7869(super.anInt10090, super.anInt10097, super.anInt10089);
			this.method4501(local24, local11, arg0);
		}
	}

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "(B)V")
	@Override
	public void method8414() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!uha;BLclient!ka;Lclient!ha;)V")
	private void method4501(@OriginalArg(0) Class177 arg0, @OriginalArg(2) Class182 arg1, @OriginalArg(3) Class95 arg2) {
		arg1.method6197(arg0);
		@Pc(9) Class143[] local9 = arg1.method6217();
		@Pc(20) Class255[] local20 = arg1.method6196();
		if ((this.aClass13_Sub9_4 == null || this.aClass13_Sub9_4.aBoolean490) && (local9 != null || local20 != null)) {
			this.aClass13_Sub9_4 = Static423.method5656(Static262.anInt5597, true);
		}
		if (this.aClass13_Sub9_4 != null) {
			this.aClass13_Sub9_4.method5659(arg2, (long) Static262.anInt5597, local9, local20);
			this.aClass13_Sub9_4.method5655(super.aByte127, super.aShort117, super.aShort120, super.aShort119, super.aShort118);
		}
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(II)V")
	public void method4502(@OriginalArg(1) int arg0) {
		if (this.aBoolean377) {
			return;
		}
		this.anInt5294 += arg0;
		while (this.anInt5294 > this.aClass81_1.anIntArray151[this.anInt5296]) {
			this.anInt5294 -= this.aClass81_1.anIntArray151[this.anInt5296];
			this.anInt5296++;
			if (this.anInt5296 >= this.aClass81_1.anIntArray149.length) {
				this.aBoolean377 = true;
				break;
			}
		}
		if (!this.aBoolean377) {
			Static589.method8022(this.anInt5296, this.aClass81_1, this);
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IBZILclient!ha;ILclient!ig;)V")
	@Override
	public void method8410(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13_Sub1 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass13_Sub9_4 != null) {
			this.aClass13_Sub9_4.method5657();
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8400(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8404() {
		return false;
	}

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "(I)I")
	@Override
	public int method8397() {
		return this.anInt5284;
	}

	@OriginalMember(owner = "client!lw", name = "g", descriptor = "(B)V")
	public void method4505() {
		if (this.aClass13_Sub9_4 != null) {
			this.aClass13_Sub9_4.method5657();
		}
	}

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8413() {
		return this.aBoolean378;
	}
}
