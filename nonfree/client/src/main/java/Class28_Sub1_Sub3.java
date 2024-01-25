import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class28_Sub1_Sub3 extends Class28_Sub1 implements Interface3 {

	@OriginalMember(owner = "client!qi", name = "F", descriptor = "Z")
	private boolean aBoolean383;

	@OriginalMember(owner = "client!qi", name = "y", descriptor = "B")
	private final byte aByte63;

	@OriginalMember(owner = "client!qi", name = "C", descriptor = "Z")
	private final boolean aBoolean382;

	@OriginalMember(owner = "client!qi", name = "R", descriptor = "B")
	private final byte aByte64;

	@OriginalMember(owner = "client!qi", name = "V", descriptor = "B")
	private final byte aByte65;

	@OriginalMember(owner = "client!qi", name = "Y", descriptor = "Z")
	private final boolean aBoolean385;

	@OriginalMember(owner = "client!qi", name = "db", descriptor = "S")
	private final short aShort68;

	@OriginalMember(owner = "client!qi", name = "M", descriptor = "Z")
	private final boolean aBoolean384;

	@OriginalMember(owner = "client!qi", name = "U", descriptor = "Lclient!f;")
	public Class75 aClass75_7;

	@OriginalMember(owner = "client!qi", name = "T", descriptor = "Lclient!tm;")
	private Class3_Sub7_Sub6 aClass3_Sub7_Sub6_6;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!np;Lclient!dq;IIIIIZIIIIIIZ)V")
	public Class28_Sub1_Sub3(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1393 == 1, Static388.method5694(arg12, arg13));
		this.aBoolean383 = arg14;
		this.aByte63 = (byte) arg12;
		this.aBoolean382 = arg1.anInt1415 != 0 && !arg7;
		this.aByte64 = (byte) arg13;
		this.aByte65 = (byte) arg3;
		this.aBoolean385 = arg7;
		this.aShort68 = (short) arg1.anInt1402;
		this.aBoolean384 = arg0.method4914() && arg1.aBoolean95 && !this.aBoolean385 && Static164.aClass154_Sub1_1.anInt6057 != 0;
		@Pc(77) int local77 = 1024;
		if (this.aBoolean383) {
			local77 |= 0x8000;
		}
		@Pc(92) Class188 local92 = this.method4461(arg0, this.aBoolean384, local77);
		if (local92 != null) {
			this.aClass75_7 = local92.aClass75_6;
			this.aClass3_Sub7_Sub6_6 = local92.aClass3_Sub7_Sub6_5;
			if (this.aBoolean383) {
				this.aClass75_7 = this.aClass75_7.method5473((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!in;ILclient!np;BZI)V")
	@Override
	public void method5410(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class28_Sub3_Sub1) {
			@Pc(5) Class28_Sub3_Sub1 local5 = (Class28_Sub3_Sub1) arg1;
			if (this.aClass75_7 != null && local5.aClass75_1 != null) {
				this.aClass75_7.method5493(local5.aClass75_1, arg5, arg2, arg0, arg4);
			}
		} else if (arg1 instanceof Class28_Sub1_Sub3) {
			@Pc(28) Class28_Sub1_Sub3 local28 = (Class28_Sub1_Sub3) arg1;
			if (this.aClass75_7 != null && local28.aClass75_7 != null) {
				this.aClass75_7.method5493(local28.aClass75_7, arg5, arg2, arg0, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(ILclient!np;)Lclient!ql;")
	@Override
	public Class12_Sub7 method5407(@OriginalArg(1) Class155 arg0) {
		if (this.aClass75_7 == null) {
			return null;
		}
		@Pc(11) Class118 local11 = arg0.method4908();
		local11.method2659(super.anInt5774, super.anInt5769, super.anInt5766);
		@Pc(21) Class12_Sub7 local21 = null;
		if (this.aBoolean382) {
			local21 = Static146.method2294(1);
		}
		this.aClass75_7.method5469(local11, local21 == null ? null : local21.aClass12_Sub5Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5413() {
		return this.aBoolean383;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5427() {
		return this.aBoolean384;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
	@Override
	public void method5421() {
		if (this.aClass75_7 != null) {
			this.aClass75_7.method5458();
		}
	}

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "(I)I")
	@Override
	public int method5191() {
		return this.aClass75_7 == null ? 0 : this.aClass75_7.method5476();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIILclient!np;)Z")
	@Override
	public boolean method5408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2) {
		@Pc(9) Class75 local9 = this.method4458(arg2, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class118 local19 = arg2.method4908();
			local19.method2659(super.anInt5774, super.anInt5769, super.anInt5766);
			return local9.method5460(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)I")
	@Override
	public int method5425() {
		return this.aByte63;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!np;I)Lclient!f;")
	private Class75 method4458(@OriginalArg(1) Class155 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass75_7 != null && arg0.method4919(this.aClass75_7.method5462(), arg1) == 0) {
			return this.aClass75_7;
		} else {
			@Pc(31) Class188 local31 = this.method4461(arg0, false, arg1);
			return local31 == null ? null : local31.aClass75_6;
		}
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)I")
	public int method4459() {
		return this.aClass75_7 == null ? 15 : this.aClass75_7.method5467() / 4;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!np;ZI)Lclient!pr;")
	private Class188 method4461(@OriginalArg(1) Class155 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class60 local13 = Static97.aClass217_4.method5007(this.aShort68 & 0xFFFF);
		@Pc(43) Class7 local43;
		@Pc(29) Class7 local29;
		if (this.aBoolean385) {
			local43 = Static25.aClass7Array1[this.aByte65];
			local29 = Static89.aClass7Array4[0];
		} else {
			if (this.aByte65 >= 3) {
				local29 = null;
			} else {
				local29 = Static89.aClass7Array4[this.aByte65 + 1];
			}
			local43 = Static89.aClass7Array4[this.aByte65];
		}
		return local13.method1203(super.anInt5766, arg2, arg1, super.anInt5769, this.aByte63 == 11 ? this.aByte64 + 4 : this.aByte64, arg0, super.anInt5774, local29, local43, this.aByte63 == 11 ? 10 : this.aByte63);
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)I")
	@Override
	public int method5423() {
		return this.aByte64;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!np;B)V")
	@Override
	public void method5406(@OriginalArg(0) Class155 arg0) {
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!np;)V")
	@Override
	public void method5424(@OriginalArg(1) Class155 arg0) {
		@Pc(14) Class3_Sub7_Sub6 local14;
		if (this.aClass3_Sub7_Sub6_6 == null && this.aBoolean384) {
			@Pc(25) Class188 local25 = this.method4461(arg0, true, 131072);
			local14 = local25 == null ? null : local25.aClass3_Sub7_Sub6_5;
		} else {
			local14 = this.aClass3_Sub7_Sub6_6;
			this.aClass3_Sub7_Sub6_6 = null;
		}
		if (local14 != null) {
			Static365.method5440(local14, this.aByte65, super.anInt5774, super.anInt5766, null);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)I")
	@Override
	public int method5420() {
		return this.aShort68 & 0xFFFF;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!np;BI)Lclient!f;")
	@Override
	public Class75 method5422(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1) {
		return this.method4458(arg0, arg1);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!np;I)V")
	@Override
	public void method5426(@OriginalArg(0) Class155 arg0) {
		@Pc(23) Class3_Sub7_Sub6 local23;
		if (this.aClass3_Sub7_Sub6_6 == null && this.aBoolean384) {
			@Pc(34) Class188 local34 = this.method4461(arg0, true, 131072);
			local23 = local34 == null ? null : local34.aClass3_Sub7_Sub6_5;
		} else {
			local23 = this.aClass3_Sub7_Sub6_6;
			this.aClass3_Sub7_Sub6_6 = null;
		}
		if (local23 != null) {
			Static235.method3892(local23, this.aByte65, super.anInt5774, super.anInt5766, null);
		}
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)V")
	@Override
	public void method5411() {
		this.aBoolean383 = false;
		if (this.aClass75_7 != null) {
			this.aClass75_7.method5479(this.aClass75_7.method5462() & 0xFFFF7FFF);
		}
	}
}
