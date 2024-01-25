import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class2_Sub3_Sub3_Sub1 extends Class2_Sub3_Sub3 implements Interface18 {

	@OriginalMember(owner = "client!ig", name = "jb", descriptor = "Lclient!ufa;")
	private Class332 aClass332_2;

	@OriginalMember(owner = "client!ig", name = "ib", descriptor = "Z")
	private boolean aBoolean466 = false;

	@OriginalMember(owner = "client!ig", name = "X", descriptor = "Lclient!vt;")
	public final Class361 aClass361_1;

	@OriginalMember(owner = "client!ig", name = "eb", descriptor = "Z")
	private final boolean aBoolean465;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!ha;Lclient!qg;IIIIIZIIIII)V")
	public Class2_Sub3_Sub3_Sub1(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class272 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass361_1 = new Class361(arg0, arg1, arg10, arg11, super.aByte128, arg3, this, arg7, arg12);
		this.aBoolean465 = arg1.anInt8270 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method8585(@OriginalArg(0) Class33 arg0) {
		this.aClass361_1.method8366(arg0);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8584() {
		return this.aClass361_1.method8361();
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)I")
	@Override
	public int method8574() {
		return this.aClass361_1.method8365();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ha;I)Lclient!ie;")
	@Override
	public Class2_Sub6 method8566(@OriginalArg(0) Class33 arg0) {
		@Pc(14) Class128 local14 = this.aClass361_1.method8364(true, arg0, 2048, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class47 local21 = arg0.method6225();
		local21.method7863(super.anInt10428 + super.aShort108, super.anInt10429, super.anInt10424 + super.aShort107);
		@Pc(42) Class2_Sub6 local42 = Static481.method2823(1, this.aBoolean465);
		@Pc(47) int local47 = super.anInt10428 >> 9;
		@Pc(52) int local52 = super.anInt10424 >> 9;
		this.aClass361_1.method8360(arg0, local47, local52, local52, true, local14, local21, local47);
		if (Static216.aBoolean440) {
			local14.method6294(local21, local42.aClass2_Sub5Array1[0], Static467.anInt8440, 0);
		} else {
			local14.method6281(local21, local42.aClass2_Sub5Array1[0], 0);
		}
		if (this.aClass361_1.aClass2_Sub2_8 != null) {
			@Pc(101) Class40 local101 = this.aClass361_1.aClass2_Sub2_8.method222();
			if (Static216.aBoolean440) {
				arg0.method6214(local101, Static467.anInt8440);
			} else {
				arg0.method6160(local101);
			}
		}
		this.aBoolean466 = local14.F() || this.aClass361_1.aClass2_Sub2_8 != null;
		if (this.aClass332_2 == null) {
			this.aClass332_2 = Static500.method7309(super.anInt10428, local14, super.anInt10424, super.anInt10429);
		} else {
			Static600.method6708(super.anInt10429, this.aClass332_2, super.anInt10428, local14, super.anInt10424);
		}
		return local42;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(Lclient!ha;B)Lclient!ufa;")
	@Override
	public Class332 method8572(@OriginalArg(0) Class33 arg0) {
		return this.aClass332_2;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)I")
	@Override
	public int method8587() {
		return this.aClass361_1.anInt10186;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8565(@OriginalArg(1) Class33 arg0) {
		@Pc(12) Class128 local12 = this.aClass361_1.method8364(true, arg0, 262144, false);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt10428 >> 9;
		@Pc(24) int local24 = super.anInt10424 >> 9;
		@Pc(27) Class47 local27 = arg0.method6225();
		local27.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
		this.aClass361_1.method8360(arg0, local19, local24, local24, false, local12, local27, local19);
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8570() {
		return false;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)I")
	@Override
	public int method8588() {
		return this.aClass361_1.anInt10200;
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(B)I")
	@Override
	public int method8575(@OriginalArg(0) byte arg0) {
		return arg0 == 30 ? this.aClass361_1.method8362((byte) 103) : -12;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
	@Override
	public void method8582() {
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIBLclient!ha;)Z")
	@Override
	public boolean method8573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(12) Class128 local12 = this.aClass361_1.method8364(false, arg2, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(26) Class47 local26 = arg2.method6225();
			local26.method7863(super.anInt10428 + super.aShort108, super.anInt10429, super.aShort107 + super.anInt10424);
			return Static216.aBoolean440 ? local12.method6283(arg0, arg1, local26, false, 0, Static467.anInt8440) : local12.method6296(arg0, arg1, local26, false, 0);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)I")
	@Override
	public int method8586() {
		return this.aClass361_1.anInt10185;
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8579() {
		return this.aBoolean466;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8583(@OriginalArg(1) Class33 arg0) {
		this.aClass361_1.method8363(arg0);
	}
}
