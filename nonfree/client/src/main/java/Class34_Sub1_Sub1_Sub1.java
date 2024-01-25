import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class34_Sub1_Sub1_Sub1 extends Class34_Sub1_Sub1 implements Interface17 {

	@OriginalMember(owner = "client!bj", name = "P", descriptor = "Lclient!ln;")
	private Class214 aClass214_1;

	@OriginalMember(owner = "client!bj", name = "Y", descriptor = "Z")
	private boolean aBoolean69;

	@OriginalMember(owner = "client!bj", name = "cb", descriptor = "Z")
	private final boolean aBoolean70;

	@OriginalMember(owner = "client!bj", name = "jb", descriptor = "Z")
	private final boolean aBoolean71;

	@OriginalMember(owner = "client!bj", name = "hb", descriptor = "S")
	private final short aShort11;

	@OriginalMember(owner = "client!bj", name = "mb", descriptor = "B")
	private final byte aByte15;

	@OriginalMember(owner = "client!bj", name = "kb", descriptor = "B")
	private final byte aByte14;

	@OriginalMember(owner = "client!bj", name = "V", descriptor = "Z")
	private final boolean aBoolean68;

	@OriginalMember(owner = "client!bj", name = "Z", descriptor = "Lclient!r;")
	private Class3_Sub5_Sub11 aClass3_Sub5_Sub11_1;

	@OriginalMember(owner = "client!bj", name = "gb", descriptor = "Lclient!ka;")
	public Class149 aClass149_1;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!ha;Lclient!lp;IIIIIZIIIIIIZ)V")
	public Class34_Sub1_Sub1_Sub1(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5951 == 1, Static478.method6335(arg12, arg13));
		this.aBoolean69 = arg14;
		this.aBoolean70 = arg1.anInt5978 != 0 && !arg7;
		this.aBoolean71 = arg7;
		this.aShort11 = (short) arg1.anInt5946;
		this.aByte15 = (byte) arg12;
		super.aByte131 = (byte) arg3;
		this.aByte14 = (byte) arg13;
		this.aBoolean68 = arg0.method8061() && arg1.aBoolean411 && !this.aBoolean71 && Static336.aClass3_Sub41_18.aClass14_Sub5_1.method2511() != 0;
		@Pc(80) int local80 = 2048;
		if (this.aBoolean69) {
			local80 |= 0x10000;
		}
		@Pc(95) Class330 local95 = this.method934(local80, arg0, this.aBoolean68);
		if (local95 != null) {
			this.aClass3_Sub5_Sub11_1 = local95.aClass3_Sub5_Sub11_6;
			this.aClass149_1 = local95.aClass149_7;
			if (this.aBoolean69) {
				this.aClass149_1 = this.aClass149_1.method8858((byte) 0, local80, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(Z)I")
	@Override
	public int method7840(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return -68;
		} else if (this.aClass149_1 == null) {
			return 0;
		} else {
			return this.aClass149_1.ma();
		}
	}

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7853() {
		return this.aClass149_1 == null ? false : this.aClass149_1.F();
	}

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7845() {
		if (this.aClass149_1 == null) {
			return true;
		} else {
			return !this.aClass149_1.r();
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7841() {
		return this.aBoolean69;
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(Lclient!ha;B)Lclient!pia;")
	@Override
	public Class34_Sub8 method7835(@OriginalArg(0) Class95 arg0) {
		if (this.aClass149_1 == null) {
			return null;
		}
		@Pc(16) Class17 local16 = arg0.method8013();
		local16.method6231(super.anInt9614, super.anInt9622, super.anInt9619);
		@Pc(30) Class34_Sub8 local30 = Static327.method4658(1, this.aBoolean70);
		if (Static375.aBoolean532) {
			this.aClass149_1.method8869(local16, local30.aClass34_Sub6Array1[0], Static501.anInt7929, 0);
		} else {
			this.aClass149_1.method8857(local16, local30.aClass34_Sub6Array1[0], 0);
		}
		return local30;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method6660(@OriginalArg(0) Class95 arg0) {
		@Pc(29) Class3_Sub5_Sub11 local29;
		if (this.aClass3_Sub5_Sub11_1 == null && this.aBoolean68) {
			@Pc(22) Class330 local22 = this.method934(262144, arg0, true);
			local29 = local22 == null ? null : local22.aClass3_Sub5_Sub11_6;
		} else {
			local29 = this.aClass3_Sub5_Sub11_1;
			this.aClass3_Sub5_Sub11_1 = null;
		}
		if (local29 != null) {
			Static123.method1842(local29, super.aByte131, super.anInt9614, super.anInt9619, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "(B)I")
	public int method933() {
		return this.aClass149_1 == null ? 15 : this.aClass149_1.na() / 4;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)I")
	@Override
	public int method6659() {
		return this.aByte14;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
	@Override
	public void method6658() {
		if (this.aClass149_1 != null) {
			this.aClass149_1.method8870();
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!ha;ZB)Lclient!sw;")
	private Class330 method934(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class216 local18 = Static466.aClass340_6.method7665(this.aShort11 & 0xFFFF);
		@Pc(43) Class35 local43;
		@Pc(29) Class35 local29;
		if (this.aBoolean71) {
			local43 = Static368.aClass35Array1[super.aByte131];
			local29 = Static556.aClass35Array2[0];
		} else {
			if (super.aByte131 >= 3) {
				local29 = null;
			} else {
				local29 = Static556.aClass35Array2[super.aByte131 + 1];
			}
			local43 = Static556.aClass35Array2[super.aByte131];
		}
		return local18.method5040(super.anInt9614, local29, this.aByte15 == 11 ? 10 : this.aByte15, arg0, arg2, arg1, local43, (Class173) null, super.anInt9622, this.aByte15 == 11 ? this.aByte14 + 4 : this.aByte14, super.anInt9619);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6657() {
		return this.aBoolean68;
	}

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "(I)V")
	@Override
	public void method7848() {
		this.aBoolean69 = false;
		if (this.aClass149_1 != null) {
			this.aClass149_1.s(this.aClass149_1.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)I")
	@Override
	public int method6661() {
		return this.aShort11 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "(B)I")
	@Override
	public int method7847() {
		return this.aClass149_1 == null ? 0 : this.aClass149_1.fa();
	}

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "(Lclient!ha;B)Lclient!ln;")
	@Override
	public Class214 method7846(@OriginalArg(0) Class95 arg0) {
		if (this.aClass214_1 == null) {
			this.aClass214_1 = Static523.method6802(this.method936(arg0, 0), super.anInt9619, super.anInt9614, super.anInt9622);
		}
		return this.aClass214_1;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method7850(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class149 local15 = this.method936(arg1, 131072);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class17 local20 = arg1.method8013();
			local20.method6231(super.anInt9614, super.anInt9622, super.anInt9619);
			return Static375.aBoolean532 ? local15.method8862(arg0, arg2, local20, false, 0, Static501.anInt7929) : local15.method8866(arg0, arg2, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)I")
	@Override
	public int method6662() {
		return this.aByte15;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!fq;BIILclient!ha;Z)V")
	@Override
	public void method7842(@OriginalArg(0) int arg0, @OriginalArg(1) Class34_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class95 arg4, @OriginalArg(6) boolean arg5) {
		if (arg1 instanceof Class34_Sub1_Sub5_Sub2) {
			@Pc(28) Class34_Sub1_Sub5_Sub2 local28 = (Class34_Sub1_Sub5_Sub2) arg1;
			if (this.aClass149_1 != null && local28.aClass149_6 != null) {
				this.aClass149_1.method8847(local28.aClass149_6, arg2, arg0, arg3, arg5);
			}
		} else if (arg1 instanceof Class34_Sub1_Sub1_Sub1) {
			@Pc(8) Class34_Sub1_Sub1_Sub1 local8 = (Class34_Sub1_Sub1_Sub1) arg1;
			if (this.aClass149_1 != null && local8.aClass149_1 != null) {
				this.aClass149_1.method8847(local8.aClass149_1, arg2, arg0, arg3, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7849(@OriginalArg(0) Class95 arg0) {
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class149 method936(@OriginalArg(1) Class95 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass149_1 != null && arg0.method8047(this.aClass149_1.ua(), arg1) == 0) {
			return this.aClass149_1;
		} else {
			@Pc(23) Class330 local23 = this.method934(arg1, arg0, false);
			return local23 == null ? null : local23.aClass149_7;
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method6663(@OriginalArg(0) Class95 arg0) {
		@Pc(14) Class3_Sub5_Sub11 local14;
		if (this.aClass3_Sub5_Sub11_1 == null && this.aBoolean68) {
			@Pc(25) Class330 local25 = this.method934(262144, arg0, true);
			local14 = local25 == null ? null : local25.aClass3_Sub5_Sub11_6;
		} else {
			local14 = this.aClass3_Sub5_Sub11_1;
			this.aClass3_Sub5_Sub11_1 = null;
		}
		if (local14 != null) {
			Static344.method5000(local14, super.aByte131, super.anInt9614, super.anInt9619, (boolean[]) null);
		}
	}
}
