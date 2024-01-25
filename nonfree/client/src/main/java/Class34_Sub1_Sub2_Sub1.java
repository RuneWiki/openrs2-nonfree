import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fja")
public final class Class34_Sub1_Sub2_Sub1 extends Class34_Sub1_Sub2 implements Interface17 {

	@OriginalMember(owner = "client!fja", name = "N", descriptor = "Lclient!ln;")
	private Class214 aClass214_3;

	@OriginalMember(owner = "client!fja", name = "bb", descriptor = "B")
	private final byte aByte56;

	@OriginalMember(owner = "client!fja", name = "M", descriptor = "S")
	private final short aShort35;

	@OriginalMember(owner = "client!fja", name = "gb", descriptor = "Z")
	private final boolean aBoolean234;

	@OriginalMember(owner = "client!fja", name = "fb", descriptor = "Z")
	private boolean aBoolean233;

	@OriginalMember(owner = "client!fja", name = "kb", descriptor = "Z")
	private final boolean aBoolean235;

	@OriginalMember(owner = "client!fja", name = "I", descriptor = "Z")
	private final boolean aBoolean232;

	@OriginalMember(owner = "client!fja", name = "jb", descriptor = "Lclient!r;")
	private Class3_Sub5_Sub11 aClass3_Sub5_Sub11_3;

	@OriginalMember(owner = "client!fja", name = "F", descriptor = "Lclient!ka;")
	private Class149 aClass149_3;

	@OriginalMember(owner = "client!fja", name = "<init>", descriptor = "(Lclient!ha;Lclient!lp;IIIIIZIZ)V")
	public Class34_Sub1_Sub2_Sub1(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt5979);
		this.aByte56 = (byte) arg8;
		this.aShort35 = (short) arg1.anInt5946;
		this.aBoolean234 = arg7;
		this.aBoolean233 = arg9;
		super.anInt9614 = arg4;
		super.anInt9619 = arg6;
		this.aBoolean235 = arg1.anInt5978 != 0 && !arg7;
		this.aBoolean232 = arg0.method8061() && arg1.aBoolean411 && !this.aBoolean234 && Static336.aClass3_Sub41_18.aClass14_Sub5_1.method2511() != 0;
		@Pc(63) int local63 = 2048;
		if (this.aBoolean233) {
			local63 |= 0x10000;
		}
		@Pc(78) Class330 local78 = this.method2746(this.aBoolean232, arg0, local63);
		if (local78 != null) {
			this.aClass3_Sub5_Sub11_3 = local78.aClass3_Sub5_Sub11_6;
			this.aClass149_3 = local78.aClass149_7;
			if (this.aBoolean233) {
				this.aClass149_3 = this.aClass149_3.method8858((byte) 0, local63, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class149 method2743(@OriginalArg(1) Class95 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass149_3 != null && arg0.method8047(this.aClass149_3.ua(), arg1) == 0) {
			return this.aClass149_3;
		} else {
			@Pc(31) Class330 local31 = this.method2746(false, arg0, arg1);
			return local31 == null ? null : local31.aClass149_7;
		}
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6657() {
		return this.aBoolean232;
	}

	@OriginalMember(owner = "client!fja", name = "c", descriptor = "(Lclient!ha;B)Lclient!pia;")
	@Override
	public Class34_Sub8 method7835(@OriginalArg(0) Class95 arg0) {
		if (this.aClass149_3 == null) {
			return null;
		}
		@Pc(11) Class17 local11 = arg0.method8013();
		local11.method6231(super.anInt9614, super.anInt9622, super.anInt9619);
		@Pc(31) Class34_Sub8 local31 = Static327.method4658(1, this.aBoolean235);
		if (Static375.aBoolean532) {
			this.aClass149_3.method8869(local11, local31.aClass34_Sub6Array1[0], Static501.anInt7929, 0);
		} else {
			this.aClass149_3.method8857(local11, local31.aClass34_Sub6Array1[0], 0);
		}
		return local31;
	}

	@OriginalMember(owner = "client!fja", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method7845() {
		if (this.aClass149_3 == null) {
			return true;
		} else {
			return !this.aClass149_3.r();
		}
	}

	@OriginalMember(owner = "client!fja", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7841() {
		return this.aBoolean233;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(ILclient!fq;BIILclient!ha;Z)V")
	@Override
	public void method7842(@OriginalArg(0) int arg0, @OriginalArg(1) Class34_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class95 arg4, @OriginalArg(6) boolean arg5) {
		if (arg1 instanceof Class34_Sub1_Sub2_Sub1) {
			@Pc(5) Class34_Sub1_Sub2_Sub1 local5 = (Class34_Sub1_Sub2_Sub1) arg1;
			if (this.aClass149_3 != null && local5.aClass149_3 != null) {
				this.aClass149_3.method8847(local5.aClass149_3, arg2, arg0, arg3, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method6660(@OriginalArg(0) Class95 arg0) {
		@Pc(14) Class3_Sub5_Sub11 local14;
		if (this.aClass3_Sub5_Sub11_3 == null && this.aBoolean232) {
			@Pc(25) Class330 local25 = this.method2746(true, arg0, 262144);
			local14 = local25 == null ? null : local25.aClass3_Sub5_Sub11_6;
		} else {
			local14 = this.aClass3_Sub5_Sub11_3;
			this.aClass3_Sub5_Sub11_3 = null;
		}
		if (local14 != null) {
			Static123.method1842(local14, super.aByte131, super.anInt9614, super.anInt9619, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!fja", name = "c", descriptor = "(I)I")
	@Override
	public int method6662() {
		return 22;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(I)I")
	@Override
	public int method6659() {
		return this.aByte56;
	}

	@OriginalMember(owner = "client!fja", name = "b", descriptor = "(Z)I")
	@Override
	public int method7840(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			return 108;
		} else if (this.aClass149_3 == null) {
			return 0;
		} else {
			return this.aClass149_3.ma();
		}
	}

	@OriginalMember(owner = "client!fja", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7853() {
		return this.aClass149_3 == null ? false : this.aClass149_3.F();
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(ZILclient!ha;I)Lclient!sw;")
	private Class330 method2746(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class95 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class216 local13 = Static466.aClass340_6.method7665(this.aShort35 & 0xFFFF);
		@Pc(26) Class35 local26;
		@Pc(30) Class35 local30;
		if (this.aBoolean234) {
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
		return local13.method5040(super.anInt9614, local30, 22, arg2, arg0, arg1, local26, (Class173) null, super.anInt9622, this.aByte56, super.anInt9619);
	}

	@OriginalMember(owner = "client!fja", name = "e", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7849(@OriginalArg(0) Class95 arg0) {
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(Z)V")
	@Override
	public void method6658() {
		if (this.aClass149_3 != null) {
			this.aClass149_3.method8870();
		}
	}

	@OriginalMember(owner = "client!fja", name = "d", descriptor = "(Lclient!ha;B)Lclient!ln;")
	@Override
	public Class214 method7846(@OriginalArg(0) Class95 arg0) {
		if (this.aClass214_3 == null) {
			this.aClass214_3 = Static523.method6802(this.method2743(arg0, 0), super.anInt9619, super.anInt9614, super.anInt9622);
		}
		return this.aClass214_3;
	}

	@OriginalMember(owner = "client!fja", name = "d", descriptor = "(B)I")
	@Override
	public int method7847() {
		return this.aClass149_3 == null ? 0 : this.aClass149_3.fa();
	}

	@OriginalMember(owner = "client!fja", name = "b", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method6663(@OriginalArg(0) Class95 arg0) {
		@Pc(30) Class3_Sub5_Sub11 local30;
		if (this.aClass3_Sub5_Sub11_3 == null && this.aBoolean232) {
			@Pc(23) Class330 local23 = this.method2746(true, arg0, 262144);
			local30 = local23 == null ? null : local23.aClass3_Sub5_Sub11_6;
		} else {
			local30 = this.aClass3_Sub5_Sub11_3;
			this.aClass3_Sub5_Sub11_3 = null;
		}
		if (local30 != null) {
			Static344.method5000(local30, super.aByte131, super.anInt9614, super.anInt9619, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!fja", name = "h", descriptor = "(I)V")
	@Override
	public void method7848() {
		this.aBoolean233 = false;
		if (this.aClass149_3 != null) {
			this.aClass149_3.s(this.aClass149_3.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!fja", name = "b", descriptor = "(I)I")
	@Override
	public int method6661() {
		return this.aShort35 & 0xFFFF;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(ILclient!ha;II)Z")
	@Override
	public boolean method7850(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class149 local14 = this.method2743(arg1, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class17 local19 = arg1.method8013();
			local19.method6231(super.anInt9614, super.anInt9622, super.anInt9619);
			return Static375.aBoolean532 ? local14.method8862(arg0, arg2, local19, false, 0, Static501.anInt7929) : local14.method8866(arg0, arg2, local19, false, 0);
		}
	}
}
