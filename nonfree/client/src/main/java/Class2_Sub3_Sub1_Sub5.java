import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wia")
public final class Class2_Sub3_Sub1_Sub5 extends Class2_Sub3_Sub1 implements Interface18 {

	@OriginalMember(owner = "client!wia", name = "V", descriptor = "Lclient!ufa;")
	private Class332 aClass332_8;

	@OriginalMember(owner = "client!wia", name = "Q", descriptor = "B")
	private final byte aByte132;

	@OriginalMember(owner = "client!wia", name = "mb", descriptor = "Z")
	private boolean aBoolean878;

	@OriginalMember(owner = "client!wia", name = "M", descriptor = "B")
	private final byte aByte131;

	@OriginalMember(owner = "client!wia", name = "bb", descriptor = "Z")
	private final boolean aBoolean877;

	@OriginalMember(owner = "client!wia", name = "eb", descriptor = "S")
	private final short aShort125;

	@OriginalMember(owner = "client!wia", name = "K", descriptor = "Z")
	private final boolean aBoolean875;

	@OriginalMember(owner = "client!wia", name = "ab", descriptor = "Z")
	private final boolean aBoolean876;

	@OriginalMember(owner = "client!wia", name = "fb", descriptor = "Lclient!ka;")
	public Class128 aClass128_6;

	@OriginalMember(owner = "client!wia", name = "Y", descriptor = "Lclient!r;")
	private Class3_Sub1_Sub6 aClass3_Sub1_Sub6_6;

	@OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lclient!ha;Lclient!qg;IIIIIZIIIIIIZ)V")
	public Class2_Sub3_Sub1_Sub5(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class272 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8294 == 1, Static206.method5565(arg12, arg13));
		this.aByte132 = (byte) arg13;
		this.aBoolean878 = arg14;
		this.aByte131 = (byte) arg12;
		this.aBoolean877 = arg7;
		this.aShort125 = (short) arg1.anInt8290;
		super.aByte129 = (byte) arg3;
		this.aBoolean875 = arg1.anInt8270 != 0 && !arg7;
		this.aBoolean876 = arg0.method6172() && arg1.aBoolean710 && !this.aBoolean877 && Static552.aClass3_Sub48_30.aClass23_Sub20_1.method5537() != 0;
		@Pc(83) int local83 = 2048;
		if (this.aBoolean878) {
			local83 |= 0x10000;
		}
		@Pc(98) Class300 local98 = this.method8591(local83, arg0, this.aBoolean876);
		if (local98 != null) {
			this.aClass128_6 = local98.aClass128_3;
			this.aClass3_Sub1_Sub6_6 = local98.aClass3_Sub1_Sub6_3;
			if (this.aBoolean878) {
				this.aClass128_6 = this.aClass128_6.method6279((byte) 0, local83, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)I")
	@Override
	public int method8586() {
		return this.aByte132;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(ZILclient!mb;Lclient!ha;III)V")
	@Override
	public void method8569(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub3 arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 instanceof Class2_Sub3_Sub2_Sub1) {
			@Pc(5) Class2_Sub3_Sub2_Sub1 local5 = (Class2_Sub3_Sub2_Sub1) arg1;
			if (this.aClass128_6 != null && local5.aClass128_1 != null) {
				this.aClass128_6.method6274(local5.aClass128_1, arg3, arg5, arg4, arg0);
			}
		} else if (arg1 instanceof Class2_Sub3_Sub1_Sub5) {
			@Pc(28) Class2_Sub3_Sub1_Sub5 local28 = (Class2_Sub3_Sub1_Sub5) arg1;
			if (this.aClass128_6 != null && local28.aClass128_6 != null) {
				this.aClass128_6.method6274(local28.aClass128_6, arg3, arg5, arg4, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IIBLclient!ha;)Z")
	@Override
	public boolean method8573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(14) Class128 local14 = this.method8594(arg2, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class47 local19 = arg2.method6225();
			local19.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
			return Static216.aBoolean440 ? local14.method6283(arg0, arg1, local19, false, 0, Static467.anInt8440) : local14.method6296(arg0, arg1, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)V")
	@Override
	public void method8582() {
		if (this.aClass128_6 != null) {
			this.aClass128_6.method6295();
		}
	}

	@OriginalMember(owner = "client!wia", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8579() {
		return this.aClass128_6 == null ? false : this.aClass128_6.F();
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8565(@OriginalArg(1) Class33 arg0) {
	}

	@OriginalMember(owner = "client!wia", name = "f", descriptor = "(I)I")
	@Override
	public int method8574() {
		return this.aClass128_6 == null ? 0 : this.aClass128_6.fa();
	}

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "(I)I")
	@Override
	public int method8588() {
		return this.aByte131;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8583(@OriginalArg(1) Class33 arg0) {
		@Pc(18) Class3_Sub1_Sub6 local18;
		if (this.aClass3_Sub1_Sub6_6 == null && this.aBoolean876) {
			@Pc(29) Class300 local29 = this.method8591(262144, arg0, true);
			local18 = local29 == null ? null : local29.aClass3_Sub1_Sub6_3;
		} else {
			local18 = this.aClass3_Sub1_Sub6_6;
			this.aClass3_Sub1_Sub6_6 = null;
		}
		if (local18 != null) {
			Static287.method4989(local18, super.aByte129, super.anInt10428, super.anInt10424, null);
		}
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(Lclient!ha;B)Lclient!ufa;")
	@Override
	public Class332 method8572(@OriginalArg(0) Class33 arg0) {
		if (this.aClass332_8 == null) {
			this.aClass332_8 = Static500.method7309(super.anInt10428, this.method8594(arg0, 0), super.anInt10424, super.anInt10429);
		}
		return this.aClass332_8;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IILclient!ha;Z)Lclient!sca;")
	private Class300 method8591(@OriginalArg(0) int arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class272 local13 = Static541.aClass349_4.method8123(this.aShort125 & 0xFFFF);
		@Pc(41) Class274 local41;
		@Pc(32) Class274 local32;
		if (this.aBoolean877) {
			local41 = Static524.aClass274Array3[super.aByte129];
			local32 = Static445.aClass274Array1[0];
		} else {
			if (super.aByte129 < 3) {
				local32 = Static445.aClass274Array1[super.aByte129 + 1];
			} else {
				local32 = null;
			}
			local41 = Static445.aClass274Array1[super.aByte129];
		}
		return local13.method6851(arg2, super.anInt10428, this.aByte131 == 11 ? 10 : this.aByte131, arg1, arg0, local32, super.anInt10429, this.aByte131 == 11 ? this.aByte132 + 4 : this.aByte132, local41, super.anInt10424);
	}

	@OriginalMember(owner = "client!wia", name = "e", descriptor = "(B)I")
	@Override
	public int method8575(@OriginalArg(0) byte arg0) {
		if (arg0 == 30) {
			return this.aClass128_6 == null ? 0 : this.aClass128_6.ma();
		} else {
			return -76;
		}
	}

	@OriginalMember(owner = "client!wia", name = "k", descriptor = "(I)I")
	public int method8593() {
		return this.aClass128_6 == null ? 15 : this.aClass128_6.na() / 4;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lclient!ha;BI)Lclient!ka;")
	private Class128 method8594(@OriginalArg(0) Class33 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass128_6 != null && arg0.method6220(this.aClass128_6.ua(), arg1) == 0) {
			return this.aClass128_6;
		} else {
			@Pc(33) Class300 local33 = this.method8591(arg1, arg0, false);
			return local33 == null ? null : local33.aClass128_3;
		}
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(I)I")
	@Override
	public int method8587() {
		return this.aShort125 & 0xFFFF;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method8585(@OriginalArg(0) Class33 arg0) {
		@Pc(14) Class3_Sub1_Sub6 local14;
		if (this.aClass3_Sub1_Sub6_6 == null && this.aBoolean876) {
			@Pc(25) Class300 local25 = this.method8591(262144, arg0, true);
			local14 = local25 == null ? null : local25.aClass3_Sub1_Sub6_3;
		} else {
			local14 = this.aClass3_Sub1_Sub6_6;
			this.aClass3_Sub1_Sub6_6 = null;
		}
		if (local14 != null) {
			Static579.method8024(local14, super.aByte129, super.anInt10428, super.anInt10424, null);
		}
	}

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8564() {
		return this.aBoolean878;
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lclient!ha;I)Lclient!ie;")
	@Override
	public Class2_Sub6 method8566(@OriginalArg(0) Class33 arg0) {
		if (this.aClass128_6 == null) {
			return null;
		}
		@Pc(11) Class47 local11 = arg0.method6225();
		local11.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
		@Pc(35) Class2_Sub6 local35 = Static481.method2823(1, this.aBoolean875);
		if (Static216.aBoolean440) {
			this.aClass128_6.method6294(local11, local35.aClass2_Sub5Array1[0], Static467.anInt8440, 0);
		} else {
			this.aClass128_6.method6281(local11, local35.aClass2_Sub5Array1[0], 0);
		}
		return local35;
	}

	@OriginalMember(owner = "client!wia", name = "e", descriptor = "(I)V")
	@Override
	public void method8563() {
		this.aBoolean878 = false;
		if (this.aClass128_6 != null) {
			this.aClass128_6.s(this.aClass128_6.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!wia", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8570() {
		if (this.aClass128_6 == null) {
			return true;
		} else {
			return !this.aClass128_6.r();
		}
	}

	@OriginalMember(owner = "client!wia", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8584() {
		return this.aBoolean876;
	}
}
