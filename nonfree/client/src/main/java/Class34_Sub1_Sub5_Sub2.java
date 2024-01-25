import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class34_Sub1_Sub5_Sub2 extends Class34_Sub1_Sub5 implements Interface17 {

	@OriginalMember(owner = "client!mda", name = "L", descriptor = "Lclient!ln;")
	private Class214 aClass214_7;

	@OriginalMember(owner = "client!mda", name = "S", descriptor = "B")
	private final byte aByte89;

	@OriginalMember(owner = "client!mda", name = "ib", descriptor = "Z")
	private final boolean aBoolean432;

	@OriginalMember(owner = "client!mda", name = "eb", descriptor = "S")
	private final short aShort54;

	@OriginalMember(owner = "client!mda", name = "G", descriptor = "Z")
	private final boolean aBoolean429;

	@OriginalMember(owner = "client!mda", name = "X", descriptor = "Z")
	private boolean aBoolean431;

	@OriginalMember(owner = "client!mda", name = "M", descriptor = "B")
	private final byte aByte88;

	@OriginalMember(owner = "client!mda", name = "R", descriptor = "Z")
	private final boolean aBoolean430;

	@OriginalMember(owner = "client!mda", name = "Q", descriptor = "Lclient!ka;")
	public Class149 aClass149_6;

	@OriginalMember(owner = "client!mda", name = "ab", descriptor = "Lclient!r;")
	private Class3_Sub5_Sub11 aClass3_Sub5_Sub11_5;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!ha;Lclient!lp;IIIIIZIIZ)V")
	public Class34_Sub1_Sub5_Sub2(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static171.method2710(arg8, arg9));
		this.aByte89 = (byte) arg9;
		super.anInt9614 = arg4;
		this.aBoolean432 = arg7;
		this.aShort54 = (short) arg1.anInt5946;
		this.aBoolean429 = arg1.anInt5978 != 0 && !arg7;
		this.aBoolean431 = arg10;
		this.aByte88 = (byte) arg8;
		super.anInt9619 = arg6;
		this.aBoolean430 = arg0.method8061() && arg1.aBoolean411 && !this.aBoolean432 && Static336.aClass3_Sub41_18.aClass14_Sub5_1.method2511() != 0;
		@Pc(72) int local72 = 2048;
		if (this.aBoolean431) {
			local72 |= 0x10000;
		}
		@Pc(87) Class330 local87 = this.method5240(this.aBoolean430, local72, arg0);
		if (local87 != null) {
			this.aClass149_6 = local87.aClass149_7;
			this.aClass3_Sub5_Sub11_5 = local87.aClass3_Sub5_Sub11_6;
			if (this.aBoolean431) {
				this.aClass149_6 = this.aClass149_6.method8858((byte) 0, local72, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7841() {
		return this.aBoolean431;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)I")
	@Override
	public int method6659() {
		return this.aByte89;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILclient!fq;BIILclient!ha;Z)V")
	@Override
	public void method7842(@OriginalArg(0) int arg0, @OriginalArg(1) Class34_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class95 arg4, @OriginalArg(6) boolean arg5) {
		if (arg1 instanceof Class34_Sub1_Sub5_Sub2) {
			@Pc(16) Class34_Sub1_Sub5_Sub2 local16 = (Class34_Sub1_Sub5_Sub2) arg1;
			if (this.aClass149_6 != null && local16.aClass149_6 != null) {
				this.aClass149_6.method8847(local16.aClass149_6, arg2, arg0, arg3, arg5);
			}
		} else if (arg1 instanceof Class34_Sub1_Sub1_Sub1) {
			@Pc(38) Class34_Sub1_Sub1_Sub1 local38 = (Class34_Sub1_Sub1_Sub1) arg1;
			if (this.aClass149_6 != null && local38.aClass149_1 != null) {
				this.aClass149_6.method8847(local38.aClass149_1, arg2, arg0, arg3, arg5);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(Z)I")
	@Override
	public int method7840(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static362.anInt6197 = 109;
		}
		return this.aClass149_6 == null ? 0 : this.aClass149_6.ma();
	}

	@OriginalMember(owner = "client!mda", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7853() {
		return this.aClass149_6 == null ? false : this.aClass149_6.F();
	}

	@OriginalMember(owner = "client!mda", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7845() {
		if (this.aClass149_6 == null) {
			return true;
		} else {
			return !this.aClass149_6.r();
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!ha;II)Lclient!ka;")
	private Class149 method5239(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass149_6 != null && arg0.method8047(this.aClass149_6.ua(), arg1) == 0) {
			return this.aClass149_6;
		} else {
			@Pc(23) Class330 local23 = this.method5240(false, arg1, arg0);
			return local23 == null ? null : local23.aClass149_7;
		}
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method6663(@OriginalArg(0) Class95 arg0) {
		@Pc(29) Class3_Sub5_Sub11 local29;
		if (this.aClass3_Sub5_Sub11_5 == null && this.aBoolean430) {
			@Pc(22) Class330 local22 = this.method5240(true, 262144, arg0);
			local29 = local22 == null ? null : local22.aClass3_Sub5_Sub11_6;
		} else {
			local29 = this.aClass3_Sub5_Sub11_5;
			this.aClass3_Sub5_Sub11_5 = null;
		}
		if (local29 != null) {
			Static344.method5000(local29, super.aByte131, super.anInt9614, super.anInt9619, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZILclient!ha;B)Lclient!sw;")
	private Class330 method5240(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class95 arg2) {
		@Pc(18) Class216 local18 = Static466.aClass340_6.method7665(this.aShort54 & 0xFFFF);
		@Pc(26) Class35 local26;
		@Pc(30) Class35 local30;
		if (this.aBoolean432) {
			local26 = Static368.aClass35Array1[super.aByte131];
			local30 = Static556.aClass35Array2[0];
		} else {
			local26 = Static556.aClass35Array2[super.aByte131];
			if (super.aByte131 >= 3) {
				local30 = null;
			} else {
				local30 = Static556.aClass35Array2[super.aByte131 + 1];
			}
		}
		return local18.method5040(super.anInt9614, local30, this.aByte88, arg1, arg0, arg2, local26, (Class173) null, super.anInt9622, this.aByte89, super.anInt9619);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6657() {
		return this.aBoolean430;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method6660(@OriginalArg(0) Class95 arg0) {
		@Pc(14) Class3_Sub5_Sub11 local14;
		if (this.aClass3_Sub5_Sub11_5 == null && this.aBoolean430) {
			@Pc(25) Class330 local25 = this.method5240(true, 262144, arg0);
			local14 = local25 == null ? null : local25.aClass3_Sub5_Sub11_6;
		} else {
			local14 = this.aClass3_Sub5_Sub11_5;
			this.aClass3_Sub5_Sub11_5 = null;
		}
		if (local14 != null) {
			Static123.method1842(local14, super.aByte131, super.anInt9614, super.anInt9619, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!mda", name = "e", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7849(@OriginalArg(0) Class95 arg0) {
	}

	@OriginalMember(owner = "client!mda", name = "h", descriptor = "(I)V")
	@Override
	public void method7848() {
		this.aBoolean431 = false;
		if (this.aClass149_6 != null) {
			this.aClass149_6.s(this.aClass149_6.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "(Lclient!ha;B)Lclient!pia;")
	@Override
	public Class34_Sub8 method7835(@OriginalArg(0) Class95 arg0) {
		if (this.aClass149_6 == null) {
			return null;
		}
		@Pc(23) Class17 local23 = arg0.method8013();
		local23.method6231(super.anInt9614, super.anInt9622, super.anInt9619);
		@Pc(37) Class34_Sub8 local37 = Static327.method4658(1, this.aBoolean429);
		if (Static375.aBoolean532) {
			this.aClass149_6.method8869(local23, local37.aClass34_Sub6Array1[0], Static501.anInt7929, 0);
		} else {
			this.aClass149_6.method8857(local23, local37.aClass34_Sub6Array1[0], 0);
		}
		return local37;
	}

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "(Lclient!ha;B)Lclient!ln;")
	@Override
	public Class214 method7846(@OriginalArg(0) Class95 arg0) {
		if (this.aClass214_7 == null) {
			this.aClass214_7 = Static523.method6802(this.method5239(arg0, 0), super.anInt9619, super.anInt9614, super.anInt9622);
		}
		return this.aClass214_7;
	}

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "(I)I")
	@Override
	public int method6662() {
		return this.aByte88;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Z)V")
	@Override
	public void method6658() {
		if (this.aClass149_6 != null) {
			this.aClass149_6.method8870();
		}
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)I")
	@Override
	public int method6661() {
		return this.aShort54 & 0xFFFF;
	}

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "(B)I")
	@Override
	public int method7847() {
		return this.aClass149_6 == null ? 0 : this.aClass149_6.fa();
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method7850(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class149 local14 = this.method5239(arg1, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class17 local19 = arg1.method8013();
			local19.method6231(super.anInt9614, super.anInt9622, super.anInt9619);
			return Static375.aBoolean532 ? local14.method8862(arg0, arg2, local19, false, 0, Static501.anInt7929) : local14.method8866(arg0, arg2, local19, false, 0);
		}
	}
}
