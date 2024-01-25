import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lia")
public final class Class2_Sub3_Sub2_Sub2 extends Class2_Sub3_Sub2 implements Interface18 {

	@OriginalMember(owner = "client!lia", name = "lb", descriptor = "Lclient!mq;")
	public static final Class218 lb = new Class218(50, -1);

	@OriginalMember(owner = "client!lia", name = "ab", descriptor = "Lclient!ufa;")
	private Class332 aClass332_3;

	@OriginalMember(owner = "client!lia", name = "X", descriptor = "Z")
	private boolean aBoolean553 = false;

	@OriginalMember(owner = "client!lia", name = "cb", descriptor = "Lclient!vt;")
	public final Class361 aClass361_2;

	@OriginalMember(owner = "client!lia", name = "U", descriptor = "Z")
	private final boolean aBoolean552;

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Lclient!ha;Lclient!qg;IIIIIZIII)V")
	public Class2_Sub3_Sub2_Sub2(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class272 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static219.method4267(arg9, arg8));
		this.aClass361_2 = new Class361(arg0, arg1, arg8, arg9, super.aByte128, arg3, this, arg7, arg10);
		this.aBoolean552 = arg1.anInt8270 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!lia", name = "e", descriptor = "(B)I")
	@Override
	public int method8575(@OriginalArg(0) byte arg0) {
		if (arg0 != 30) {
			this.aBoolean553 = true;
		}
		return this.aClass361_2.method8362((byte) 103);
	}

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "(Lclient!ha;B)Lclient!ufa;")
	@Override
	public Class332 method8572(@OriginalArg(0) Class33 arg0) {
		return this.aClass332_3;
	}

	@OriginalMember(owner = "client!lia", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8564() {
		return false;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8565(@OriginalArg(1) Class33 arg0) {
		@Pc(16) Class128 local16 = this.aClass361_2.method8364(true, arg0, 262144, true);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt10428 >> 9;
		@Pc(28) int local28 = super.anInt10424 >> 9;
		@Pc(31) Class47 local31 = arg0.method6225();
		local31.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
		this.aClass361_2.method8360(arg0, local23, local28, local28, false, local16, local31, local23);
	}

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "(I)I")
	@Override
	public int method8587() {
		return this.aClass361_2.anInt10186;
	}

	@OriginalMember(owner = "client!lia", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8579() {
		return this.aBoolean553;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!ha;I)Lclient!ie;")
	@Override
	public Class2_Sub6 method8566(@OriginalArg(0) Class33 arg0) {
		@Pc(14) Class128 local14 = this.aClass361_2.method8364(true, arg0, 2048, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class47 local21 = arg0.method6225();
		local21.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
		@Pc(37) Class2_Sub6 local37 = Static481.method2823(1, this.aBoolean552);
		@Pc(47) int local47 = super.anInt10428 >> 9;
		@Pc(52) int local52 = super.anInt10424 >> 9;
		this.aClass361_2.method8360(arg0, local47, local52, local52, true, local14, local21, local47);
		if (Static216.aBoolean440) {
			local14.method6294(local21, local37.aClass2_Sub5Array1[0], Static467.anInt8440, 0);
		} else {
			local14.method6281(local21, local37.aClass2_Sub5Array1[0], 0);
		}
		if (this.aClass361_2.aClass2_Sub2_8 != null) {
			@Pc(94) Class40 local94 = this.aClass361_2.aClass2_Sub2_8.method222();
			if (Static216.aBoolean440) {
				arg0.method6214(local94, Static467.anInt8440);
			} else {
				arg0.method6160(local94);
			}
		}
		this.aBoolean553 = local14.F() || this.aClass361_2.aClass2_Sub2_8 != null;
		if (this.aClass332_3 == null) {
			this.aClass332_3 = Static500.method7309(super.anInt10428, local14, super.anInt10424, super.anInt10429);
		} else {
			Static600.method6708(super.anInt10429, this.aClass332_3, super.anInt10428, local14, super.anInt10424);
		}
		return local37;
	}

	@OriginalMember(owner = "client!lia", name = "c", descriptor = "(I)I")
	@Override
	public int method8588() {
		return this.aClass361_2.anInt10200;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8583(@OriginalArg(1) Class33 arg0) {
		this.aClass361_2.method8363(arg0);
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(B)V")
	@Override
	public void method8582() {
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIBLclient!ha;)Z")
	@Override
	public boolean method8573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(17) Class128 local17 = this.aClass361_2.method8364(false, arg2, 131072, false);
		if (local17 == null) {
			return false;
		} else {
			@Pc(24) Class47 local24 = arg2.method6225();
			local24.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
			return Static216.aBoolean440 ? local17.method6283(arg0, arg1, local24, false, 0, Static467.anInt8440) : local17.method6296(arg0, arg1, local24, false, 0);
		}
	}

	@OriginalMember(owner = "client!lia", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8570() {
		return false;
	}

	@OriginalMember(owner = "client!lia", name = "e", descriptor = "(I)V")
	@Override
	public void method8563() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(ZILclient!mb;Lclient!ha;III)V")
	@Override
	public void method8569(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub3 arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8584() {
		return this.aClass361_2.method8361();
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)I")
	@Override
	public int method8586() {
		return this.aClass361_2.anInt10185;
	}

	@OriginalMember(owner = "client!lia", name = "f", descriptor = "(I)I")
	@Override
	public int method8574() {
		return this.aClass361_2.method8365();
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method8585(@OriginalArg(0) Class33 arg0) {
		this.aClass361_2.method8366(arg0);
	}
}
