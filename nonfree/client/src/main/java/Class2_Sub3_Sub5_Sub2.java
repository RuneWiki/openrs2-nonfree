import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!via")
public final class Class2_Sub3_Sub5_Sub2 extends Class2_Sub3_Sub5 implements Interface18 {

	@OriginalMember(owner = "client!via", name = "Y", descriptor = "Lclient!ufa;")
	private Class332 aClass332_7;

	@OriginalMember(owner = "client!via", name = "pb", descriptor = "Z")
	private final boolean aBoolean845;

	@OriginalMember(owner = "client!via", name = "V", descriptor = "Z")
	private final boolean aBoolean842;

	@OriginalMember(owner = "client!via", name = "gb", descriptor = "Z")
	private boolean aBoolean844;

	@OriginalMember(owner = "client!via", name = "Q", descriptor = "B")
	private final byte aByte124;

	@OriginalMember(owner = "client!via", name = "R", descriptor = "S")
	private final short aShort117;

	@OriginalMember(owner = "client!via", name = "db", descriptor = "Z")
	private final boolean aBoolean843;

	@OriginalMember(owner = "client!via", name = "mb", descriptor = "Lclient!ka;")
	private Class128 aClass128_4;

	@OriginalMember(owner = "client!via", name = "N", descriptor = "Lclient!r;")
	private Class3_Sub1_Sub6 aClass3_Sub1_Sub6_4;

	@OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Lclient!ha;Lclient!qg;IIIIIZIZ)V")
	public Class2_Sub3_Sub5_Sub2(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class272 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt8273);
		this.aBoolean845 = arg1.anInt8270 != 0 && !arg7;
		super.anInt10428 = arg4;
		this.aBoolean842 = arg7;
		this.aBoolean844 = arg9;
		super.anInt10424 = arg6;
		this.aByte124 = (byte) arg8;
		this.aShort117 = (short) arg1.anInt8290;
		this.aBoolean843 = arg0.method6172() && arg1.aBoolean710 && !this.aBoolean842 && Static552.aClass3_Sub48_30.aClass23_Sub20_1.method5537() != 0;
		@Pc(60) int local60 = 2048;
		if (this.aBoolean844) {
			local60 |= 0x10000;
		}
		@Pc(75) Class300 local75 = this.method8256(this.aBoolean843, arg0, local60);
		if (local75 != null) {
			this.aClass128_4 = local75.aClass128_3;
			this.aClass3_Sub1_Sub6_4 = local75.aClass3_Sub1_Sub6_3;
			if (this.aBoolean844) {
				this.aClass128_4 = this.aClass128_4.method6279((byte) 0, local60, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(ILclient!ha;B)Lclient!ka;")
	private Class128 method8255(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1) {
		if (this.aClass128_4 != null && arg1.method6220(this.aClass128_4.ua(), arg0) == 0) {
			return this.aClass128_4;
		} else {
			@Pc(29) Class300 local29 = this.method8256(false, arg1, arg0);
			return local29 == null ? null : local29.aClass128_3;
		}
	}

	@OriginalMember(owner = "client!via", name = "e", descriptor = "(B)I")
	@Override
	public int method8575(@OriginalArg(0) byte arg0) {
		if (arg0 == 30) {
			return this.aClass128_4 == null ? 0 : this.aClass128_4.ma();
		} else {
			return -42;
		}
	}

	@OriginalMember(owner = "client!via", name = "b", descriptor = "(I)I")
	@Override
	public int method8587() {
		return this.aShort117 & 0xFFFF;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(IIBLclient!ha;)Z")
	@Override
	public boolean method8573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(9) Class128 local9 = this.method8255(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class47 local20 = arg2.method6225();
			local20.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
			return Static216.aBoolean440 ? local9.method6283(arg0, arg1, local20, false, 0, Static467.anInt8440) : local9.method6296(arg0, arg1, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(ZILclient!mb;Lclient!ha;III)V")
	@Override
	public void method8569(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub3 arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class2_Sub3_Sub5_Sub2) {
			@Pc(5) Class2_Sub3_Sub5_Sub2 local5 = (Class2_Sub3_Sub5_Sub2) arg1;
			if (this.aClass128_4 != null && local5.aClass128_4 != null) {
				this.aClass128_4.method6274(local5.aClass128_4, arg3, arg5, arg4, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(ZBLclient!ha;I)Lclient!sca;")
	private Class300 method8256(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class272 local18 = Static541.aClass349_4.method8123(this.aShort117 & 0xFFFF);
		@Pc(26) Class274 local26;
		@Pc(30) Class274 local30;
		if (this.aBoolean842) {
			local26 = Static524.aClass274Array3[super.aByte129];
			local30 = Static445.aClass274Array1[0];
		} else {
			local26 = Static445.aClass274Array1[super.aByte129];
			if (super.aByte129 >= 3) {
				local30 = null;
			} else {
				local30 = Static445.aClass274Array1[super.aByte129 + 1];
			}
		}
		return local18.method6851(arg0, super.anInt10428, 22, arg1, arg2, local30, super.anInt10429, this.aByte124, local26, super.anInt10424);
	}

	@OriginalMember(owner = "client!via", name = "c", descriptor = "(I)I")
	@Override
	public int method8588() {
		return 22;
	}

	@OriginalMember(owner = "client!via", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8564() {
		return this.aBoolean844;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(Lclient!ha;I)Lclient!ie;")
	@Override
	public Class2_Sub6 method8566(@OriginalArg(0) Class33 arg0) {
		if (this.aClass128_4 == null) {
			return null;
		}
		@Pc(16) Class47 local16 = arg0.method6225();
		local16.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
		@Pc(32) Class2_Sub6 local32 = Static481.method2823(1, this.aBoolean845);
		if (Static216.aBoolean440) {
			this.aClass128_4.method6294(local16, local32.aClass2_Sub5Array1[0], Static467.anInt8440, 0);
		} else {
			this.aClass128_4.method6281(local16, local32.aClass2_Sub5Array1[0], 0);
		}
		return local32;
	}

	@OriginalMember(owner = "client!via", name = "b", descriptor = "(Lclient!ha;B)Lclient!ufa;")
	@Override
	public Class332 method8572(@OriginalArg(0) Class33 arg0) {
		if (this.aClass332_7 == null) {
			this.aClass332_7 = Static500.method7309(super.anInt10428, this.method8255(0, arg0), super.anInt10424, super.anInt10429);
		}
		return this.aClass332_7;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(I)I")
	@Override
	public int method8586() {
		return this.aByte124;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8565(@OriginalArg(1) Class33 arg0) {
	}

	@OriginalMember(owner = "client!via", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8570() {
		if (this.aClass128_4 == null) {
			return true;
		} else {
			return !this.aClass128_4.r();
		}
	}

	@OriginalMember(owner = "client!via", name = "e", descriptor = "(I)V")
	@Override
	public void method8563() {
		this.aBoolean844 = false;
		if (this.aClass128_4 != null) {
			this.aClass128_4.s(this.aClass128_4.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!via", name = "f", descriptor = "(I)I")
	@Override
	public int method8574() {
		return this.aClass128_4 == null ? 0 : this.aClass128_4.fa();
	}

	@OriginalMember(owner = "client!via", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8584() {
		return this.aBoolean843;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method8585(@OriginalArg(0) Class33 arg0) {
		@Pc(24) Class3_Sub1_Sub6 local24;
		if (this.aClass3_Sub1_Sub6_4 == null && this.aBoolean843) {
			@Pc(35) Class300 local35 = this.method8256(true, arg0, 262144);
			local24 = local35 == null ? null : local35.aClass3_Sub1_Sub6_3;
		} else {
			local24 = this.aClass3_Sub1_Sub6_4;
			this.aClass3_Sub1_Sub6_4 = null;
		}
		if (local24 != null) {
			Static579.method8024(local24, super.aByte129, super.anInt10428, super.anInt10424, null);
		}
	}

	@OriginalMember(owner = "client!via", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8579() {
		return this.aClass128_4 == null ? false : this.aClass128_4.F();
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(B)V")
	@Override
	public void method8582() {
		if (this.aClass128_4 != null) {
			this.aClass128_4.method6295();
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8583(@OriginalArg(1) Class33 arg0) {
		@Pc(20) Class3_Sub1_Sub6 local20;
		if (this.aClass3_Sub1_Sub6_4 == null && this.aBoolean843) {
			@Pc(31) Class300 local31 = this.method8256(true, arg0, 262144);
			local20 = local31 == null ? null : local31.aClass3_Sub1_Sub6_3;
		} else {
			local20 = this.aClass3_Sub1_Sub6_4;
			this.aClass3_Sub1_Sub6_4 = null;
		}
		if (local20 != null) {
			Static287.method4989(local20, super.aByte129, super.anInt10428, super.anInt10424, null);
		}
	}
}
