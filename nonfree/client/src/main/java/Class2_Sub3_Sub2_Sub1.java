import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public final class Class2_Sub3_Sub2_Sub1 extends Class2_Sub3_Sub2 implements Interface18 {

	@OriginalMember(owner = "client!fea", name = "J", descriptor = "Lclient!ufa;")
	private Class332 aClass332_1;

	@OriginalMember(owner = "client!fea", name = "U", descriptor = "B")
	private final byte aByte44;

	@OriginalMember(owner = "client!fea", name = "bb", descriptor = "Z")
	private final boolean aBoolean313;

	@OriginalMember(owner = "client!fea", name = "db", descriptor = "Z")
	private boolean aBoolean315;

	@OriginalMember(owner = "client!fea", name = "cb", descriptor = "Z")
	private final boolean aBoolean314;

	@OriginalMember(owner = "client!fea", name = "qb", descriptor = "B")
	private final byte aByte45;

	@OriginalMember(owner = "client!fea", name = "eb", descriptor = "S")
	private final short aShort33;

	@OriginalMember(owner = "client!fea", name = "W", descriptor = "Z")
	private final boolean aBoolean312;

	@OriginalMember(owner = "client!fea", name = "rb", descriptor = "Lclient!ka;")
	public Class128 aClass128_1;

	@OriginalMember(owner = "client!fea", name = "X", descriptor = "Lclient!r;")
	private Class3_Sub1_Sub6 aClass3_Sub1_Sub6_1;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Lclient!ha;Lclient!qg;IIIIIZIIZ)V")
	public Class2_Sub3_Sub2_Sub1(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class272 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static533.method7602(arg9, arg8));
		this.aByte44 = (byte) arg8;
		this.aBoolean313 = arg7;
		super.anInt10424 = arg6;
		this.aBoolean315 = arg10;
		super.anInt10428 = arg4;
		this.aBoolean314 = arg1.anInt8270 != 0 && !arg7;
		this.aByte45 = (byte) arg9;
		this.aShort33 = (short) arg1.anInt8290;
		this.aBoolean312 = arg0.method6172() && arg1.aBoolean710 && !this.aBoolean313 && Static552.aClass3_Sub48_30.aClass23_Sub20_1.method5537() != 0;
		@Pc(66) int local66 = 2048;
		if (this.aBoolean315) {
			local66 |= 0x10000;
		}
		@Pc(81) Class300 local81 = this.method3250(this.aBoolean312, arg0, local66);
		if (local81 != null) {
			this.aClass128_1 = local81.aClass128_3;
			this.aClass3_Sub1_Sub6_1 = local81.aClass3_Sub1_Sub6_3;
			if (this.aBoolean315) {
				this.aClass128_1 = this.aClass128_1.method6279((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(Lclient!ha;B)Lclient!ufa;")
	@Override
	public Class332 method8572(@OriginalArg(0) Class33 arg0) {
		if (this.aClass332_1 == null) {
			this.aClass332_1 = Static500.method7309(super.anInt10428, this.method3247(arg0, 0), super.anInt10424, super.anInt10429);
		}
		return this.aClass332_1;
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8584() {
		return this.aBoolean312;
	}

	@OriginalMember(owner = "client!fea", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8570() {
		if (this.aClass128_1 == null) {
			return true;
		} else {
			return !this.aClass128_1.r();
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!ha;ZI)Lclient!ka;")
	private Class128 method3247(@OriginalArg(0) Class33 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass128_1 != null && arg0.method6220(this.aClass128_1.ua(), arg1) == 0) {
			return this.aClass128_1;
		} else {
			@Pc(30) Class300 local30 = this.method3250(false, arg0, arg1);
			return local30 == null ? null : local30.aClass128_3;
		}
	}

	@OriginalMember(owner = "client!fea", name = "f", descriptor = "(I)I")
	@Override
	public int method8574() {
		return this.aClass128_1 == null ? 0 : this.aClass128_1.fa();
	}

	@OriginalMember(owner = "client!fea", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8579() {
		return this.aClass128_1 == null ? false : this.aClass128_1.F();
	}

	@OriginalMember(owner = "client!fea", name = "e", descriptor = "(I)V")
	@Override
	public void method8563() {
		this.aBoolean315 = false;
		if (this.aClass128_1 != null) {
			this.aClass128_1.s(this.aClass128_1.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8583(@OriginalArg(1) Class33 arg0) {
		@Pc(20) Class3_Sub1_Sub6 local20;
		if (this.aClass3_Sub1_Sub6_1 == null && this.aBoolean312) {
			@Pc(31) Class300 local31 = this.method3250(true, arg0, 262144);
			local20 = local31 == null ? null : local31.aClass3_Sub1_Sub6_3;
		} else {
			local20 = this.aClass3_Sub1_Sub6_1;
			this.aClass3_Sub1_Sub6_1 = null;
		}
		if (local20 != null) {
			Static287.method4989(local20, super.aByte129, super.anInt10428, super.anInt10424, null);
		}
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)I")
	@Override
	public int method8587() {
		return this.aShort33 & 0xFFFF;
	}

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8564() {
		return this.aBoolean315;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)V")
	@Override
	public void method8582() {
		if (this.aClass128_1 != null) {
			this.aClass128_1.method6295();
		}
	}

	@OriginalMember(owner = "client!fea", name = "e", descriptor = "(B)I")
	@Override
	public int method8575(@OriginalArg(0) byte arg0) {
		if (arg0 == 30) {
			return this.aClass128_1 == null ? 0 : this.aClass128_1.ma();
		} else {
			return 16;
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZILclient!mb;Lclient!ha;III)V")
	@Override
	public void method8569(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub3 arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class2_Sub3_Sub2_Sub1) {
			@Pc(28) Class2_Sub3_Sub2_Sub1 local28 = (Class2_Sub3_Sub2_Sub1) arg1;
			if (this.aClass128_1 != null && local28.aClass128_1 != null) {
				this.aClass128_1.method6274(local28.aClass128_1, arg3, arg5, arg4, arg0);
			}
		} else if (arg1 instanceof Class2_Sub3_Sub1_Sub5) {
			@Pc(8) Class2_Sub3_Sub1_Sub5 local8 = (Class2_Sub3_Sub1_Sub5) arg1;
			if (this.aClass128_1 != null && local8.aClass128_6 != null) {
				this.aClass128_1.method6274(local8.aClass128_6, arg3, arg5, arg4, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!ha;I)Lclient!ie;")
	@Override
	public Class2_Sub6 method8566(@OriginalArg(0) Class33 arg0) {
		if (this.aClass128_1 == null) {
			return null;
		}
		@Pc(16) Class47 local16 = arg0.method6225();
		local16.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
		@Pc(30) Class2_Sub6 local30 = Static481.method2823(1, this.aBoolean314);
		if (Static216.aBoolean440) {
			this.aClass128_1.method6294(local16, local30.aClass2_Sub5Array1[0], Static467.anInt8440, 0);
		} else {
			this.aClass128_1.method6281(local16, local30.aClass2_Sub5Array1[0], 0);
		}
		return local30;
	}

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "(I)I")
	@Override
	public int method8588() {
		return this.aByte44;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)I")
	@Override
	public int method8586() {
		return this.aByte45;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIBLclient!ha;)Z")
	@Override
	public boolean method8573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(14) Class128 local14 = this.method3247(arg2, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class47 local19 = arg2.method6225();
			local19.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
			return Static216.aBoolean440 ? local14.method6283(arg0, arg1, local19, false, 0, Static467.anInt8440) : local14.method6296(arg0, arg1, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method8585(@OriginalArg(0) Class33 arg0) {
		@Pc(31) Class3_Sub1_Sub6 local31;
		if (this.aClass3_Sub1_Sub6_1 == null && this.aBoolean312) {
			@Pc(24) Class300 local24 = this.method3250(true, arg0, 262144);
			local31 = local24 == null ? null : local24.aClass3_Sub1_Sub6_3;
		} else {
			local31 = this.aClass3_Sub1_Sub6_1;
			this.aClass3_Sub1_Sub6_1 = null;
		}
		if (local31 != null) {
			Static579.method8024(local31, super.aByte129, super.anInt10428, super.anInt10424, null);
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZZLclient!ha;I)Lclient!sca;")
	private Class300 method3250(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class272 local13 = Static541.aClass349_4.method8123(this.aShort33 & 0xFFFF);
		@Pc(26) Class274 local26;
		@Pc(30) Class274 local30;
		if (this.aBoolean313) {
			local26 = Static524.aClass274Array3[super.aByte129];
			local30 = Static445.aClass274Array1[0];
		} else {
			if (super.aByte129 < 3) {
				local30 = Static445.aClass274Array1[super.aByte129 + 1];
			} else {
				local30 = null;
			}
			local26 = Static445.aClass274Array1[super.aByte129];
		}
		return local13.method6851(arg0, super.anInt10428, this.aByte44, arg1, arg2, local30, super.anInt10429, this.aByte45, local26, super.anInt10424);
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8565(@OriginalArg(1) Class33 arg0) {
	}
}
