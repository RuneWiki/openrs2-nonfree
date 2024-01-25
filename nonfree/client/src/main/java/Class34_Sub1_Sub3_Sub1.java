import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class34_Sub1_Sub3_Sub1 extends Class34_Sub1_Sub3 implements Interface17 {

	@OriginalMember(owner = "client!et", name = "M", descriptor = "Lclient!ln;")
	private Class214 aClass214_2;

	@OriginalMember(owner = "client!et", name = "hb", descriptor = "Z")
	private final boolean aBoolean214;

	@OriginalMember(owner = "client!et", name = "T", descriptor = "B")
	private final byte aByte49;

	@OriginalMember(owner = "client!et", name = "V", descriptor = "Z")
	private final boolean aBoolean212;

	@OriginalMember(owner = "client!et", name = "J", descriptor = "B")
	private final byte aByte48;

	@OriginalMember(owner = "client!et", name = "ab", descriptor = "S")
	private final short aShort32;

	@OriginalMember(owner = "client!et", name = "W", descriptor = "Z")
	private final boolean aBoolean213;

	@OriginalMember(owner = "client!et", name = "H", descriptor = "Lclient!ka;")
	private Class149 aClass149_2;

	@OriginalMember(owner = "client!et", name = "I", descriptor = "Lclient!r;")
	private Class3_Sub5_Sub11 aClass3_Sub5_Sub11_2;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!ha;Lclient!lp;IIIIIZIIII)V")
	public Class34_Sub1_Sub3_Sub1(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aBoolean214 = arg1.anInt5978 != 0 && !arg7;
		this.aByte49 = (byte) arg10;
		this.aBoolean212 = arg7;
		this.aByte48 = (byte) arg11;
		super.anInt9614 = arg4;
		this.aShort32 = (short) arg1.anInt5946;
		super.anInt9619 = arg6;
		this.aBoolean213 = arg0.method8061() && arg1.aBoolean411 && !this.aBoolean212 && Static336.aClass3_Sub41_18.aClass14_Sub5_1.method2511() != 0;
		@Pc(67) Class330 local67 = this.method2439(this.aBoolean213, 2048, arg0);
		if (local67 != null) {
			this.aClass149_2 = local67.aClass149_7;
			this.aClass3_Sub5_Sub11_2 = local67.aClass3_Sub5_Sub11_6;
		}
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)I")
	@Override
	public int method6661() {
		return this.aShort32 & 0xFFFF;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method6663(@OriginalArg(0) Class95 arg0) {
		@Pc(31) Class3_Sub5_Sub11 local31;
		if (this.aClass3_Sub5_Sub11_2 == null && this.aBoolean213) {
			@Pc(24) Class330 local24 = this.method2439(true, 262144, arg0);
			local31 = local24 == null ? null : local24.aClass3_Sub5_Sub11_6;
		} else {
			local31 = this.aClass3_Sub5_Sub11_2;
			this.aClass3_Sub5_Sub11_2 = null;
		}
		if (local31 != null) {
			Static344.method5000(local31, super.aByte131, super.anInt9614, super.anInt9619, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(Lclient!ha;B)Lclient!ln;")
	@Override
	public Class214 method7846(@OriginalArg(0) Class95 arg0) {
		if (this.aClass214_2 == null) {
			this.aClass214_2 = Static523.method6802(this.method2438(0, arg0), super.anInt9619, super.anInt9614, super.anInt9622);
		}
		return this.aClass214_2;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method7850(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class149 local14 = this.method2438(131072, arg1);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class17 local19 = arg1.method8013();
			local19.method6231(super.anInt9614, super.anInt9622, super.anInt9619);
			return Static375.aBoolean532 ? local14.method8862(arg0, arg2, local19, false, 0, Static501.anInt7929) : local14.method8866(arg0, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
	@Override
	public void method6658() {
		if (this.aClass149_2 != null) {
			this.aClass149_2.method8870();
		}
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(B)I")
	@Override
	public int method7847() {
		return this.aClass149_2 == null ? 0 : this.aClass149_2.fa();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method6660(@OriginalArg(0) Class95 arg0) {
		@Pc(20) Class3_Sub5_Sub11 local20;
		if (this.aClass3_Sub5_Sub11_2 == null && this.aBoolean213) {
			@Pc(31) Class330 local31 = this.method2439(true, 262144, arg0);
			local20 = local31 == null ? null : local31.aClass3_Sub5_Sub11_6;
		} else {
			local20 = this.aClass3_Sub5_Sub11_2;
			this.aClass3_Sub5_Sub11_2 = null;
		}
		if (local20 != null) {
			Static123.method1842(local20, super.aByte131, super.anInt9614, super.anInt9619, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6657() {
		return this.aBoolean213;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class149 method2438(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1) {
		if (this.aClass149_2 != null && arg1.method8047(this.aClass149_2.ua(), arg0) == 0) {
			return this.aClass149_2;
		} else {
			@Pc(34) Class330 local34 = this.method2439(false, arg0, arg1);
			return local34 == null ? null : local34.aClass149_7;
		}
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)I")
	@Override
	public int method6662() {
		return this.aByte49;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ZIILclient!ha;)Lclient!sw;")
	private Class330 method2439(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class95 arg2) {
		@Pc(18) Class216 local18 = Static466.aClass340_6.method7665(this.aShort32 & 0xFFFF);
		@Pc(43) Class35 local43;
		@Pc(34) Class35 local34;
		if (this.aBoolean212) {
			local43 = Static368.aClass35Array1[super.aByte131];
			local34 = Static556.aClass35Array2[0];
		} else {
			if (super.aByte131 < 3) {
				local34 = Static556.aClass35Array2[super.aByte131 + 1];
			} else {
				local34 = null;
			}
			local43 = Static556.aClass35Array2[super.aByte131];
		}
		return local18.method5040(super.anInt9614, local34, this.aByte49, arg1, arg0, arg2, local43, (Class173) null, super.anInt9622, this.aByte48, super.anInt9619);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)I")
	@Override
	public int method6659() {
		return this.aByte48;
	}

	@OriginalMember(owner = "client!et", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7845() {
		if (this.aClass149_2 == null) {
			return true;
		} else {
			return !this.aClass149_2.r();
		}
	}

	@OriginalMember(owner = "client!et", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7853() {
		return this.aClass149_2 == null ? false : this.aClass149_2.F();
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(Lclient!ha;B)Lclient!pia;")
	@Override
	public Class34_Sub8 method7835(@OriginalArg(0) Class95 arg0) {
		if (this.aClass149_2 == null) {
			return null;
		}
		@Pc(17) Class17 local17 = arg0.method8013();
		local17.method6231(super.aShort72 + super.anInt9614, super.anInt9622, super.anInt9619 + super.aShort73);
		@Pc(37) Class34_Sub8 local37 = Static327.method4658(1, this.aBoolean214);
		if (Static375.aBoolean532) {
			this.aClass149_2.method8869(local17, local37.aClass34_Sub6Array1[0], Static501.anInt7929, 0);
		} else {
			this.aClass149_2.method8857(local17, local37.aClass34_Sub6Array1[0], 0);
		}
		return local37;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(Z)I")
	@Override
	public int method7840(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return 7;
		} else if (this.aClass149_2 == null) {
			return 0;
		} else {
			return this.aClass149_2.ma();
		}
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7849(@OriginalArg(0) Class95 arg0) {
	}
}
