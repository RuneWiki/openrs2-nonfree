import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class28_Sub3_Sub1 extends Class28_Sub3 implements Interface3 {

	@OriginalMember(owner = "client!ce", name = "F", descriptor = "B")
	private final byte aByte7;

	@OriginalMember(owner = "client!ce", name = "M", descriptor = "S")
	private final short aShort12;

	@OriginalMember(owner = "client!ce", name = "H", descriptor = "B")
	private final byte aByte8;

	@OriginalMember(owner = "client!ce", name = "w", descriptor = "Z")
	private final boolean aBoolean39;

	@OriginalMember(owner = "client!ce", name = "A", descriptor = "Z")
	private boolean aBoolean40;

	@OriginalMember(owner = "client!ce", name = "v", descriptor = "Z")
	private final boolean aBoolean38;

	@OriginalMember(owner = "client!ce", name = "x", descriptor = "B")
	private final byte aByte6;

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "Z")
	private final boolean aBoolean37;

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "Lclient!f;")
	public Class75 aClass75_1;

	@OriginalMember(owner = "client!ce", name = "T", descriptor = "Lclient!tm;")
	private Class3_Sub7_Sub6 aClass3_Sub7_Sub6_1;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!np;Lclient!dq;IIIIZIIZ)V")
	public Class28_Sub3_Sub1(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static83.method1394(arg8, arg7));
		this.aByte7 = (byte) arg2;
		this.aShort12 = (short) arg1.anInt1402;
		super.anInt3265 = (short) arg5;
		this.aByte8 = (byte) arg7;
		this.aBoolean39 = arg1.anInt1415 != 0 && !arg6;
		this.aBoolean40 = arg9;
		this.aBoolean38 = arg6;
		super.anInt3262 = (short) arg3;
		this.aByte6 = (byte) arg8;
		this.aBoolean37 = arg0.method4914() && arg1.aBoolean95 && !this.aBoolean38 && Static164.aClass154_Sub1_1.anInt6057 != 0;
		@Pc(71) int local71 = 1024;
		if (this.aBoolean40) {
			local71 |= 0x8000;
		}
		@Pc(86) Class188 local86 = this.method679(this.aBoolean37, arg0, local71);
		if (local86 != null) {
			this.aClass75_1 = local86.aClass75_6;
			this.aClass3_Sub7_Sub6_1 = local86.aClass3_Sub7_Sub6_5;
			if (this.aBoolean40) {
				this.aClass75_1 = this.aClass75_1.method5473((byte) 0, local71, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5427() {
		return this.aBoolean37;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I")
	@Override
	public int method5420() {
		return this.aShort12 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!np;B)V")
	@Override
	public void method5406(@OriginalArg(0) Class155 arg0) {
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)I")
	@Override
	public int method5423() {
		return this.aByte6;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	@Override
	public void method5421() {
		if (this.aClass75_1 != null) {
			this.aClass75_1.method5458();
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZILclient!np;I)Lclient!pr;")
	private Class188 method679(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class155 arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class60 local18 = Static97.aClass217_4.method5007(this.aShort12 & 0xFFFF);
		@Pc(43) Class7 local43;
		@Pc(34) Class7 local34;
		if (this.aBoolean38) {
			local34 = Static89.aClass7Array4[0];
			local43 = Static25.aClass7Array1[this.aByte7];
		} else {
			if (this.aByte7 < 3) {
				local34 = Static89.aClass7Array4[this.aByte7 + 1];
			} else {
				local34 = null;
			}
			local43 = Static89.aClass7Array4[this.aByte7];
		}
		return local18.method1203(super.anInt3265, arg2, arg0, super.anInt3268, this.aByte6, arg1, super.anInt3262, local34, local43, this.aByte8);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!np;I)V")
	@Override
	public void method5426(@OriginalArg(0) Class155 arg0) {
		@Pc(32) Class3_Sub7_Sub6 local32;
		if (this.aClass3_Sub7_Sub6_1 == null && this.aBoolean37) {
			@Pc(25) Class188 local25 = this.method679(true, arg0, 131072);
			local32 = local25 == null ? null : local25.aClass3_Sub7_Sub6_5;
		} else {
			local32 = this.aClass3_Sub7_Sub6_1;
			this.aClass3_Sub7_Sub6_1 = null;
		}
		if (local32 != null) {
			Static235.method3892(local32, this.aByte7, super.anInt3262, super.anInt3265, null);
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(ILclient!np;)Lclient!ql;")
	@Override
	public Class12_Sub7 method5407(@OriginalArg(1) Class155 arg0) {
		if (this.aClass75_1 == null) {
			return null;
		}
		@Pc(11) Class118 local11 = arg0.method4908();
		local11.method2659(super.anInt3262, super.anInt3268, super.anInt3265);
		@Pc(21) Class12_Sub7 local21 = null;
		if (this.aBoolean39) {
			local21 = Static146.method2294(1);
		}
		this.aClass75_1.method5469(local11, local21 == null ? null : local21.aClass12_Sub5Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIILclient!np;)Z")
	@Override
	public boolean method5408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2) {
		@Pc(9) Class75 local9 = this.method680(arg2, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class118 local14 = arg2.method4908();
			local14.method2659(super.anInt3262, super.anInt3268, super.anInt3265);
			return local9.method5460(arg0, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!np;)V")
	@Override
	public void method5424(@OriginalArg(1) Class155 arg0) {
		@Pc(29) Class3_Sub7_Sub6 local29;
		if (this.aClass3_Sub7_Sub6_1 == null && this.aBoolean37) {
			@Pc(22) Class188 local22 = this.method679(true, arg0, 131072);
			local29 = local22 == null ? null : local22.aClass3_Sub7_Sub6_5;
		} else {
			local29 = this.aClass3_Sub7_Sub6_1;
			this.aClass3_Sub7_Sub6_1 = null;
		}
		if (local29 != null) {
			Static365.method5440(local29, this.aByte7, super.anInt3262, super.anInt3265, null);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!np;BI)Lclient!f;")
	@Override
	public Class75 method5422(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1) {
		return this.method680(arg0, arg1);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!np;IB)Lclient!f;")
	private Class75 method680(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass75_1 != null && arg0.method4919(this.aClass75_1.method5462(), arg1) == 0) {
			return this.aClass75_1;
		} else {
			@Pc(32) Class188 local32 = this.method679(false, arg0, arg1);
			return local32 == null ? null : local32.aClass75_6;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)I")
	@Override
	public int method5425() {
		return this.aByte8;
	}

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5413() {
		return this.aBoolean40;
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
	@Override
	public void method5411() {
		this.aBoolean40 = false;
		if (this.aClass75_1 != null) {
			this.aClass75_1.method5479(this.aClass75_1.method5462() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!in;ILclient!np;BZI)V")
	@Override
	public void method5410(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class28_Sub3_Sub1) {
			@Pc(32) Class28_Sub3_Sub1 local32 = (Class28_Sub3_Sub1) arg1;
			if (this.aClass75_1 != null && local32.aClass75_1 != null) {
				this.aClass75_1.method5493(local32.aClass75_1, arg5, arg2, arg0, arg4);
			}
		} else if (arg1 instanceof Class28_Sub1_Sub3) {
			@Pc(12) Class28_Sub1_Sub3 local12 = (Class28_Sub1_Sub3) arg1;
			if (this.aClass75_1 != null && local12.aClass75_7 != null) {
				this.aClass75_1.method5493(local12.aClass75_7, arg5, arg2, arg0, arg4);
			}
		}
	}
}
