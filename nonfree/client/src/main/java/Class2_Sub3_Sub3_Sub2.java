import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class2_Sub3_Sub3_Sub2 extends Class2_Sub3_Sub3 implements Interface18 {

	@OriginalMember(owner = "client!sb", name = "Y", descriptor = "Lclient!ufa;")
	private Class332 aClass332_5;

	@OriginalMember(owner = "client!sb", name = "fb", descriptor = "S")
	private final short aShort109;

	@OriginalMember(owner = "client!sb", name = "R", descriptor = "B")
	private final byte aByte109;

	@OriginalMember(owner = "client!sb", name = "jb", descriptor = "Z")
	private final boolean aBoolean754;

	@OriginalMember(owner = "client!sb", name = "db", descriptor = "Z")
	private final boolean aBoolean753;

	@OriginalMember(owner = "client!sb", name = "O", descriptor = "B")
	private final byte aByte108;

	@OriginalMember(owner = "client!sb", name = "S", descriptor = "Z")
	private final boolean aBoolean752;

	@OriginalMember(owner = "client!sb", name = "kb", descriptor = "Lclient!r;")
	private Class3_Sub1_Sub6 aClass3_Sub1_Sub6_2;

	@OriginalMember(owner = "client!sb", name = "lb", descriptor = "Lclient!ka;")
	private Class128 lb;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!ha;Lclient!qg;IIIIIZIIII)V")
	public Class2_Sub3_Sub3_Sub2(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class272 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aShort109 = (short) arg1.anInt8290;
		this.aByte109 = (byte) arg11;
		super.anInt10428 = arg4;
		this.aBoolean754 = arg7;
		this.aBoolean753 = arg1.anInt8270 != 0 && !arg7;
		super.anInt10424 = arg6;
		this.aByte108 = (byte) arg10;
		this.aBoolean752 = arg0.method6172() && arg1.aBoolean710 && !this.aBoolean754 && Static552.aClass3_Sub48_30.aClass23_Sub20_1.method5537() != 0;
		@Pc(70) Class300 local70 = this.method7368(this.aBoolean752, arg0, 2048);
		if (local70 != null) {
			this.aClass3_Sub1_Sub6_2 = local70.aClass3_Sub1_Sub6_3;
			this.lb = local70.aClass128_3;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)I")
	@Override
	public int method8587() {
		return this.aShort109 & 0xFFFF;
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(B)I")
	@Override
	public int method8575(@OriginalArg(0) byte arg0) {
		if (arg0 != 30) {
			this.aClass3_Sub1_Sub6_2 = null;
		}
		return this.lb == null ? 0 : this.lb.ma();
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)I")
	@Override
	public int method8588() {
		return this.aByte108;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ha;I)Lclient!ie;")
	@Override
	public Class2_Sub6 method8566(@OriginalArg(0) Class33 arg0) {
		if (this.lb == null) {
			return null;
		}
		@Pc(18) Class47 local18 = arg0.method6225();
		local18.method7863(super.aShort108 + super.anInt10428, super.anInt10429, super.anInt10424 + super.aShort107);
		@Pc(38) Class2_Sub6 local38 = Static481.method2823(1, this.aBoolean753);
		if (Static216.aBoolean440) {
			this.lb.method6294(local18, local38.aClass2_Sub5Array1[0], Static467.anInt8440, 0);
		} else {
			this.lb.method6281(local18, local38.aClass2_Sub5Array1[0], 0);
		}
		return local38;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8565(@OriginalArg(1) Class33 arg0) {
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8579() {
		return this.lb == null ? false : this.lb.F();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8583(@OriginalArg(1) Class33 arg0) {
		@Pc(18) Class3_Sub1_Sub6 local18;
		if (this.aClass3_Sub1_Sub6_2 == null && this.aBoolean752) {
			@Pc(29) Class300 local29 = this.method7368(true, arg0, 262144);
			local18 = local29 == null ? null : local29.aClass3_Sub1_Sub6_3;
		} else {
			local18 = this.aClass3_Sub1_Sub6_2;
			this.aClass3_Sub1_Sub6_2 = null;
		}
		if (local18 != null) {
			Static287.method4989(local18, super.aByte129, super.anInt10428, super.anInt10424, null);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIBLclient!ha;)Z")
	@Override
	public boolean method8573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(14) Class128 local14 = this.method7369(arg2, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(19) Class47 local19 = arg2.method6225();
			local19.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
			return Static216.aBoolean440 ? local14.method6283(arg0, arg1, local19, false, 0, Static467.anInt8440) : local14.method6296(arg0, arg1, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZBLclient!ha;I)Lclient!sca;")
	private Class300 method7368(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class272 local13 = Static541.aClass349_4.method8123(this.aShort109 & 0xFFFF);
		@Pc(26) Class274 local26;
		@Pc(39) Class274 local39;
		if (this.aBoolean754) {
			local39 = Static445.aClass274Array1[0];
			local26 = Static524.aClass274Array3[super.aByte129];
		} else {
			local26 = Static445.aClass274Array1[super.aByte129];
			if (super.aByte129 < 3) {
				local39 = Static445.aClass274Array1[super.aByte129 + 1];
			} else {
				local39 = null;
			}
		}
		return local13.method6851(arg0, super.anInt10428, this.aByte108, arg1, arg2, local39, super.anInt10429, this.aByte109, local26, super.anInt10424);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method8585(@OriginalArg(0) Class33 arg0) {
		@Pc(25) Class3_Sub1_Sub6 local25;
		if (this.aClass3_Sub1_Sub6_2 == null && this.aBoolean752) {
			@Pc(18) Class300 local18 = this.method7368(true, arg0, 262144);
			local25 = local18 == null ? null : local18.aClass3_Sub1_Sub6_3;
		} else {
			local25 = this.aClass3_Sub1_Sub6_2;
			this.aClass3_Sub1_Sub6_2 = null;
		}
		if (local25 != null) {
			Static579.method8024(local25, super.aByte129, super.anInt10428, super.anInt10424, null);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)I")
	@Override
	public int method8586() {
		return this.aByte109;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8584() {
		return this.aBoolean752;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Lclient!ha;B)Lclient!ufa;")
	@Override
	public Class332 method8572(@OriginalArg(0) Class33 arg0) {
		if (this.aClass332_5 == null) {
			this.aClass332_5 = Static500.method7309(super.anInt10428, this.method7369(arg0, 0), super.anInt10424, super.anInt10429);
		}
		return this.aClass332_5;
	}

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)I")
	@Override
	public int method8574() {
		return this.lb == null ? 0 : this.lb.fa();
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8570() {
		if (this.lb == null) {
			return true;
		} else {
			return !this.lb.r();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ha;IB)Lclient!ka;")
	private Class128 method7369(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1) {
		if (this.lb != null && arg0.method6220(this.lb.ua(), arg1) == 0) {
			return this.lb;
		} else {
			@Pc(23) Class300 local23 = this.method7368(false, arg0, arg1);
			return local23 == null ? null : local23.aClass128_3;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	@Override
	public void method8582() {
		if (this.lb != null) {
			this.lb.method6295();
		}
	}
}
