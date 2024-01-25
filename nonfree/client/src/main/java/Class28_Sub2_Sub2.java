import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class28_Sub2_Sub2 extends Class28_Sub2 implements Interface3 {

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "S")
	private final short aShort31;

	@OriginalMember(owner = "client!hj", name = "I", descriptor = "Z")
	private final boolean aBoolean198;

	@OriginalMember(owner = "client!hj", name = "E", descriptor = "Z")
	private boolean aBoolean197;

	@OriginalMember(owner = "client!hj", name = "G", descriptor = "B")
	private final byte aByte37;

	@OriginalMember(owner = "client!hj", name = "D", descriptor = "B")
	private final byte aByte36;

	@OriginalMember(owner = "client!hj", name = "s", descriptor = "Z")
	private final boolean aBoolean196;

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "Z")
	private final boolean aBoolean199;

	@OriginalMember(owner = "client!hj", name = "A", descriptor = "Lclient!f;")
	private Class75 aClass75_3;

	@OriginalMember(owner = "client!hj", name = "z", descriptor = "Lclient!tm;")
	private Class3_Sub7_Sub6 aClass3_Sub7_Sub6_2;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!np;Lclient!dq;IIIIZIZ)V")
	public Class28_Sub2_Sub2(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean92, arg1.aBoolean84);
		this.aShort31 = (short) arg1.anInt1402;
		this.aBoolean198 = arg6;
		this.aBoolean197 = arg8;
		this.aByte37 = (byte) arg2;
		this.aByte36 = (byte) arg7;
		this.aBoolean196 = arg1.anInt1415 != 0 && !arg6;
		super.anInt4557 = (short) arg3;
		super.anInt4556 = (short) arg5;
		this.aBoolean199 = arg0.method4914() && arg1.aBoolean95 && !this.aBoolean198 && Static164.aClass154_Sub1_1.anInt6057 != 0;
		@Pc(64) int local64 = 1024;
		if (this.aBoolean197) {
			local64 |= 0x8000;
		}
		@Pc(79) Class188 local79 = this.method2194(this.aBoolean199, arg0, local64);
		if (local79 != null) {
			this.aClass75_3 = local79.aClass75_6;
			this.aClass3_Sub7_Sub6_2 = local79.aClass3_Sub7_Sub6_5;
			if (this.aBoolean197) {
				this.aClass75_3 = this.aClass75_3.method5473((byte) 0, local64, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!np;BI)Lclient!f;")
	@Override
	public Class75 method5422(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1) {
		return this.method2191(arg1, arg0);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBLclient!np;)Lclient!f;")
	private Class75 method2191(@OriginalArg(0) int arg0, @OriginalArg(2) Class155 arg1) {
		if (this.aClass75_3 != null && arg1.method4919(this.aClass75_3.method5462(), arg0) == 0) {
			return this.aClass75_3;
		} else {
			@Pc(28) Class188 local28 = this.method2194(false, arg1, arg0);
			return local28 == null ? null : local28.aClass75_6;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!in;ILclient!np;BZI)V")
	@Override
	public void method5410(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class28_Sub2_Sub2) {
			@Pc(9) Class28_Sub2_Sub2 local9 = (Class28_Sub2_Sub2) arg1;
			if (this.aClass75_3 != null && local9.aClass75_3 != null) {
				this.aClass75_3.method5493(local9.aClass75_3, arg5, arg2, arg0, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)I")
	@Override
	public int method5423() {
		return this.aByte36;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIILclient!np;)Z")
	@Override
	public boolean method5408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2) {
		@Pc(14) Class75 local14 = this.method2191(65536, arg2);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class118 local19 = arg2.method4908();
			local19.method2659(super.anInt4557, super.anInt4555, super.anInt4556);
			return local14.method5460(arg0, arg1, local19, false);
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(ILclient!np;)Lclient!ql;")
	@Override
	public Class12_Sub7 method5407(@OriginalArg(1) Class155 arg0) {
		if (this.aClass75_3 == null) {
			return null;
		}
		@Pc(11) Class118 local11 = arg0.method4908();
		local11.method2659(super.anInt4557, super.anInt4555, super.anInt4556);
		@Pc(21) Class12_Sub7 local21 = null;
		if (this.aBoolean196) {
			local21 = Static146.method2294(1);
		}
		this.aClass75_3.method5469(local11, local21 == null ? null : local21.aClass12_Sub5Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!np;)V")
	@Override
	public void method5424(@OriginalArg(1) Class155 arg0) {
		@Pc(29) Class3_Sub7_Sub6 local29;
		if (this.aClass3_Sub7_Sub6_2 == null && this.aBoolean199) {
			@Pc(22) Class188 local22 = this.method2194(true, arg0, 131072);
			local29 = local22 == null ? null : local22.aClass3_Sub7_Sub6_5;
		} else {
			local29 = this.aClass3_Sub7_Sub6_2;
			this.aClass3_Sub7_Sub6_2 = null;
		}
		if (local29 != null) {
			Static365.method5440(local29, this.aByte37, super.anInt4557, super.anInt4556, null);
		}
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5413() {
		return this.aBoolean197;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
	@Override
	public void method5421() {
		if (this.aClass75_3 != null) {
			this.aClass75_3.method5458();
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5427() {
		return this.aBoolean199;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!np;I)V")
	@Override
	public void method5426(@OriginalArg(0) Class155 arg0) {
		@Pc(23) Class3_Sub7_Sub6 local23;
		if (this.aClass3_Sub7_Sub6_2 == null && this.aBoolean199) {
			@Pc(36) Class188 local36 = this.method2194(true, arg0, 131072);
			local23 = local36 == null ? null : local36.aClass3_Sub7_Sub6_5;
		} else {
			local23 = this.aClass3_Sub7_Sub6_2;
			this.aClass3_Sub7_Sub6_2 = null;
		}
		if (local23 != null) {
			Static235.method3892(local23, this.aByte37, super.anInt4557, super.anInt4556, null);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZLclient!np;II)Lclient!pr;")
	private Class188 method2194(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class60 local18 = Static97.aClass217_4.method5007(this.aShort31 & 0xFFFF);
		@Pc(26) Class7 local26;
		@Pc(30) Class7 local30;
		if (this.aBoolean198) {
			local26 = Static25.aClass7Array1[this.aByte37];
			local30 = Static89.aClass7Array4[0];
		} else {
			local26 = Static89.aClass7Array4[this.aByte37];
			if (this.aByte37 >= 3) {
				local30 = null;
			} else {
				local30 = Static89.aClass7Array4[this.aByte37 + 1];
			}
		}
		return local18.method1203(super.anInt4556, arg2, arg0, super.anInt4555, this.aByte36, arg1, super.anInt4557, local30, local26, 22);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)I")
	@Override
	public int method5425() {
		return 22;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!np;B)V")
	@Override
	public void method5406(@OriginalArg(0) Class155 arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)I")
	@Override
	public int method5420() {
		return this.aShort31 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)V")
	@Override
	public void method5411() {
		this.aBoolean197 = false;
		if (this.aClass75_3 != null) {
			this.aClass75_3.method5479(this.aClass75_3.method5462() & 0xFFFF7FFF);
		}
	}
}
