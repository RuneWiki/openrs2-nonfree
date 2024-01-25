import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class2_Sub3_Sub1_Sub4 extends Class2_Sub3_Sub1 implements Interface18 {

	@OriginalMember(owner = "client!mj", name = "hb", descriptor = "Lclient!ufa;")
	private Class332 aClass332_4;

	@OriginalMember(owner = "client!mj", name = "O", descriptor = "Z")
	private boolean aBoolean588 = false;

	@OriginalMember(owner = "client!mj", name = "Y", descriptor = "Lclient!vt;")
	public final Class361 aClass361_3;

	@OriginalMember(owner = "client!mj", name = "fb", descriptor = "Z")
	private final boolean aBoolean589;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!ha;Lclient!qg;IIIIIZIIIIIII)V")
	public Class2_Sub3_Sub1_Sub4(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class272 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8294 == 1, Static467.method6969(arg13, arg12));
		this.aClass361_3 = new Class361(arg0, arg1, arg12, arg13, super.aByte128, arg3, this, arg7, arg14);
		this.aBoolean589 = arg1.anInt8270 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(Lclient!ha;B)Lclient!ufa;")
	@Override
	public Class332 method8572(@OriginalArg(0) Class33 arg0) {
		return this.aClass332_4;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ha;I)Lclient!ie;")
	@Override
	public Class2_Sub6 method8566(@OriginalArg(0) Class33 arg0) {
		@Pc(14) Class128 local14 = this.aClass361_3.method8364(true, arg0, 2048, false);
		if (local14 == null) {
			return null;
		}
		@Pc(27) Class47 local27 = arg0.method6225();
		local27.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
		@Pc(43) Class2_Sub6 local43 = Static481.method2823(1, this.aBoolean589);
		this.aClass361_3.method8360(arg0, super.aShort122, super.aShort124, super.aShort123, true, local14, local27, super.aShort121);
		if (Static216.aBoolean440) {
			local14.method6294(local27, local43.aClass2_Sub5Array1[0], Static467.anInt8440, 0);
		} else {
			local14.method6281(local27, local43.aClass2_Sub5Array1[0], 0);
		}
		if (this.aClass361_3.aClass2_Sub2_8 != null) {
			@Pc(89) Class40 local89 = this.aClass361_3.aClass2_Sub2_8.method222();
			if (Static216.aBoolean440) {
				arg0.method6214(local89, Static467.anInt8440);
			} else {
				arg0.method6160(local89);
			}
		}
		this.aBoolean588 = local14.F() || this.aClass361_3.aClass2_Sub2_8 != null;
		if (this.aClass332_4 == null) {
			this.aClass332_4 = Static500.method7309(super.anInt10428, local14, super.anInt10424, super.anInt10429);
		} else {
			Static600.method6708(super.anInt10429, this.aClass332_4, super.anInt10428, local14, super.anInt10424);
		}
		return local43;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZILclient!mb;Lclient!ha;III)V")
	@Override
	public void method8569(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub3 arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8564() {
		return false;
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V")
	@Override
	public void method8563() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)I")
	@Override
	public int method8586() {
		return this.aClass361_3.anInt10185;
	}

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8579() {
		return this.aBoolean588;
	}

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)I")
	@Override
	public int method8574() {
		return this.aClass361_3.method8365();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8583(@OriginalArg(1) Class33 arg0) {
		this.aClass361_3.method8363(arg0);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)I")
	@Override
	public int method8587() {
		return this.aClass361_3.anInt10186;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIBLclient!ha;)Z")
	@Override
	public boolean method8573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(17) Class128 local17 = this.aClass361_3.method8364(false, arg2, 131072, false);
		if (local17 == null) {
			return false;
		} else {
			@Pc(24) Class47 local24 = arg2.method6225();
			local24.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
			return Static216.aBoolean440 ? local17.method6283(arg0, arg1, local24, false, 0, Static467.anInt8440) : local17.method6296(arg0, arg1, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
	@Override
	public void method8582() {
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8570() {
		return false;
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(B)I")
	@Override
	public int method8575(@OriginalArg(0) byte arg0) {
		if (arg0 != 30) {
			Static349.aClass181_64 = null;
		}
		return this.aClass361_3.method8362((byte) 103);
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8584() {
		return this.aClass361_3.method8361();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8565(@OriginalArg(1) Class33 arg0) {
		@Pc(12) Class128 local12 = this.aClass361_3.method8364(true, arg0, 262144, true);
		if (local12 != null) {
			@Pc(21) Class47 local21 = arg0.method6225();
			local21.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
			this.aClass361_3.method8360(arg0, super.aShort122, super.aShort124, super.aShort123, false, local12, local21, super.aShort121);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method8585(@OriginalArg(0) Class33 arg0) {
		this.aClass361_3.method8366(arg0);
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)I")
	@Override
	public int method8588() {
		return this.aClass361_3.anInt10200;
	}
}
