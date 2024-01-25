import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class2_Sub3_Sub5_Sub1 extends Class2_Sub3_Sub5 implements Interface18 {

	@OriginalMember(owner = "client!to", name = "lb", descriptor = "I")
	public static int lb;

	@OriginalMember(owner = "client!to", name = "pb", descriptor = "Lclient!ufa;")
	private Class332 aClass332_6;

	@OriginalMember(owner = "client!to", name = "ab", descriptor = "Z")
	private boolean aBoolean795 = false;

	@OriginalMember(owner = "client!to", name = "X", descriptor = "Lclient!vt;")
	public final Class361 aClass361_4;

	@OriginalMember(owner = "client!to", name = "ib", descriptor = "Z")
	private final boolean aBoolean796;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!ha;Lclient!qg;IIIIIZII)V")
	public Class2_Sub3_Sub5_Sub1(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class272 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt8273);
		this.aClass361_4 = new Class361(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean796 = arg1.anInt8270 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I")
	@Override
	public int method8586() {
		return this.aClass361_4.anInt10185;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZILclient!mb;Lclient!ha;III)V")
	@Override
	public void method8569(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub3 arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8570() {
		return false;
	}

	@OriginalMember(owner = "client!to", name = "e", descriptor = "(I)V")
	@Override
	public void method8563() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method8564() {
		return false;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8565(@OriginalArg(1) Class33 arg0) {
		@Pc(16) Class128 local16 = this.aClass361_4.method8364(true, arg0, 262144, true);
		if (local16 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt10428 >> 9;
		@Pc(28) int local28 = super.anInt10424 >> 9;
		@Pc(31) Class47 local31 = arg0.method6225();
		local31.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
		this.aClass361_4.method8360(arg0, local23, local28, local28, false, local16, local31, local23);
	}

	@OriginalMember(owner = "client!to", name = "f", descriptor = "(I)I")
	@Override
	public int method8574() {
		return this.aClass361_4.method8365();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ha;I)Lclient!ie;")
	@Override
	public Class2_Sub6 method8566(@OriginalArg(0) Class33 arg0) {
		@Pc(14) Class128 local14 = this.aClass361_4.method8364(true, arg0, 2048, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class47 local21 = arg0.method6225();
		local21.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
		@Pc(40) Class2_Sub6 local40 = Static481.method2823(1, this.aBoolean796);
		@Pc(45) int local45 = super.anInt10428 >> 9;
		@Pc(50) int local50 = super.anInt10424 >> 9;
		this.aClass361_4.method8360(arg0, local45, local50, local50, true, local14, local21, local45);
		if (Static216.aBoolean440) {
			local14.method6294(local21, local40.aClass2_Sub5Array1[0], Static467.anInt8440, 0);
		} else {
			local14.method6281(local21, local40.aClass2_Sub5Array1[0], 0);
		}
		if (this.aClass361_4.aClass2_Sub2_8 != null) {
			@Pc(92) Class40 local92 = this.aClass361_4.aClass2_Sub2_8.method222();
			if (Static216.aBoolean440) {
				arg0.method6214(local92, Static467.anInt8440);
			} else {
				arg0.method6160(local92);
			}
		}
		this.aBoolean795 = local14.F() || this.aClass361_4.aClass2_Sub2_8 != null;
		if (this.aClass332_6 == null) {
			this.aClass332_6 = Static500.method7309(super.anInt10428, local14, super.anInt10424, super.anInt10429);
		} else {
			Static600.method6708(super.anInt10429, this.aClass332_6, super.anInt10428, local14, super.anInt10424);
		}
		return local40;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8583(@OriginalArg(1) Class33 arg0) {
		this.aClass361_4.method8363(arg0);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V")
	@Override
	public void method8582() {
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(I)I")
	@Override
	public int method8588() {
		return this.aClass361_4.anInt10200;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)I")
	@Override
	public int method8587() {
		return this.aClass361_4.anInt10186;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8584() {
		return this.aClass361_4.method8361();
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(Lclient!ha;B)Lclient!ufa;")
	@Override
	public Class332 method8572(@OriginalArg(0) Class33 arg0) {
		return this.aClass332_6;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIBLclient!ha;)Z")
	@Override
	public boolean method8573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(12) Class128 local12 = this.aClass361_4.method8364(false, arg2, 131072, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class47 local19 = arg2.method6225();
			local19.method7863(super.anInt10428, super.anInt10429, super.anInt10424);
			return Static216.aBoolean440 ? local12.method6283(arg0, arg1, local19, false, 0, Static467.anInt8440) : local12.method6296(arg0, arg1, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!to", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8579() {
		return this.aBoolean795;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method8585(@OriginalArg(0) Class33 arg0) {
		this.aClass361_4.method8366(arg0);
	}

	@OriginalMember(owner = "client!to", name = "e", descriptor = "(B)I")
	@Override
	public int method8575(@OriginalArg(0) byte arg0) {
		if (arg0 != 30) {
			this.method8563();
		}
		return this.aClass361_4.method8362((byte) 103);
	}
}
