import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class28_Sub4_Sub1 extends Class28_Sub4 implements Interface3 {

	@OriginalMember(owner = "client!n", name = "E", descriptor = "Z")
	private final boolean aBoolean321;

	@OriginalMember(owner = "client!n", name = "B", descriptor = "S")
	private final short aShort56;

	@OriginalMember(owner = "client!n", name = "y", descriptor = "B")
	private final byte aByte51;

	@OriginalMember(owner = "client!n", name = "L", descriptor = "B")
	private final byte aByte53;

	@OriginalMember(owner = "client!n", name = "z", descriptor = "B")
	private final byte aByte52;

	@OriginalMember(owner = "client!n", name = "A", descriptor = "Z")
	private final boolean aBoolean320;

	@OriginalMember(owner = "client!n", name = "K", descriptor = "Z")
	private final boolean aBoolean322;

	@OriginalMember(owner = "client!n", name = "H", descriptor = "Lclient!tm;")
	private Class3_Sub7_Sub6 aClass3_Sub7_Sub6_3;

	@OriginalMember(owner = "client!n", name = "P", descriptor = "Lclient!f;")
	private Class75 aClass75_4;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lclient!np;Lclient!dq;IIIIZIIIII)V")
	public Class28_Sub4_Sub1(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static150.method3926(arg10, arg11));
		this.aBoolean321 = arg1.anInt1415 != 0 && !arg6;
		this.aShort56 = (short) arg1.anInt1402;
		this.aByte51 = (byte) arg2;
		super.anInt6100 = (short) arg3;
		this.aByte53 = (byte) arg11;
		this.aByte52 = (byte) arg10;
		this.aBoolean320 = arg6;
		super.anInt6099 = (short) arg5;
		this.aBoolean322 = arg0.method4914() && arg1.aBoolean95 && !this.aBoolean320 && Static164.aClass154_Sub1_1.anInt6057 != 0;
		@Pc(74) Class188 local74 = this.method3781(arg0, 1024, this.aBoolean322);
		if (local74 != null) {
			this.aClass3_Sub7_Sub6_3 = local74.aClass3_Sub7_Sub6_5;
			this.aClass75_4 = local74.aClass75_6;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!np;B)V")
	@Override
	public void method5406(@OriginalArg(0) Class155 arg0) {
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)I")
	@Override
	public int method5423() {
		return this.aByte53;
	}

	@OriginalMember(owner = "client!n", name = "h", descriptor = "(I)I")
	@Override
	public int method5419() {
		return this.aClass75_4 == null ? 0 : this.aClass75_4.method5476();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I")
	@Override
	public int method5420() {
		return this.aShort56 & 0xFFFF;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!np;IZZ)Lclient!pr;")
	private Class188 method3781(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class60 local13 = Static97.aClass217_4.method5007(this.aShort56 & 0xFFFF);
		@Pc(28) Class7 local28;
		@Pc(32) Class7 local32;
		if (this.aBoolean320) {
			local28 = Static25.aClass7Array1[this.aByte51];
			local32 = Static89.aClass7Array4[0];
		} else {
			local28 = Static89.aClass7Array4[this.aByte51];
			if (this.aByte51 >= 3) {
				local32 = null;
			} else {
				local32 = Static89.aClass7Array4[this.aByte51 + 1];
			}
		}
		return local13.method1203(super.anInt6099, arg1, arg2, super.anInt6093, this.aByte53, arg0, super.anInt6100, local32, local28, this.aByte52);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!np;)V")
	@Override
	public void method5424(@OriginalArg(1) Class155 arg0) {
		@Pc(21) Class3_Sub7_Sub6 local21;
		if (this.aClass3_Sub7_Sub6_3 == null && this.aBoolean322) {
			@Pc(32) Class188 local32 = this.method3781(arg0, 131072, true);
			local21 = local32 == null ? null : local32.aClass3_Sub7_Sub6_5;
		} else {
			local21 = this.aClass3_Sub7_Sub6_3;
			this.aClass3_Sub7_Sub6_3 = null;
		}
		if (local21 != null) {
			Static365.method5440(local21, this.aByte51, super.anInt6100, super.anInt6099, null);
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
	@Override
	public void method5421() {
		if (this.aClass75_4 != null) {
			this.aClass75_4.method5458();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIILclient!np;)Z")
	@Override
	public boolean method5408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2) {
		@Pc(17) Class75 local17 = this.method3786(arg2, 65536);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class118 local22 = arg2.method4908();
			local22.method2659(super.anInt6100, super.anInt6093, super.anInt6099);
			return local17.method5460(arg0, arg1, local22, false);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!np;I)V")
	@Override
	public void method5426(@OriginalArg(0) Class155 arg0) {
		@Pc(29) Class3_Sub7_Sub6 local29;
		if (this.aClass3_Sub7_Sub6_3 == null && this.aBoolean322) {
			@Pc(22) Class188 local22 = this.method3781(arg0, 131072, true);
			local29 = local22 == null ? null : local22.aClass3_Sub7_Sub6_5;
		} else {
			local29 = this.aClass3_Sub7_Sub6_3;
			this.aClass3_Sub7_Sub6_3 = null;
		}
		if (local29 != null) {
			Static235.method3892(local29, this.aByte51, super.anInt6100, super.anInt6099, null);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!np;BI)Lclient!f;")
	@Override
	public Class75 method5422(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1) {
		return this.method3786(arg0, arg1);
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5427() {
		return this.aBoolean322;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Lclient!np;BI)Lclient!f;")
	private Class75 method3786(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass75_4 != null && arg0.method4919(this.aClass75_4.method5462(), arg1) == 0) {
			return this.aClass75_4;
		} else {
			@Pc(32) Class188 local32 = this.method3781(arg0, arg1, false);
			return local32 == null ? null : local32.aClass75_6;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)I")
	@Override
	public int method5425() {
		return this.aByte52;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(ILclient!np;)Lclient!ql;")
	@Override
	public Class12_Sub7 method5407(@OriginalArg(1) Class155 arg0) {
		if (this.aClass75_4 == null) {
			return null;
		}
		@Pc(11) Class118 local11 = arg0.method4908();
		local11.method2659(super.anInt6100 + super.anInt6096, super.anInt6093, super.anInt6099 + super.anInt6092);
		@Pc(29) Class12_Sub7 local29 = null;
		if (this.aBoolean321) {
			local29 = Static146.method2294(1);
		}
		this.aClass75_4.method5469(local11, local29 == null ? null : local29.aClass12_Sub5Array1[0], 0);
		return local29;
	}
}
