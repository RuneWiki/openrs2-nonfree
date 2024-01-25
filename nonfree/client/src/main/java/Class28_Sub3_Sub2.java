import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class28_Sub3_Sub2 extends Class28_Sub3 implements Interface3 {

	@OriginalMember(owner = "client!hh", name = "G", descriptor = "Lclient!nt;")
	public final Class170 aClass170_1;

	@OriginalMember(owner = "client!hh", name = "v", descriptor = "Z")
	private final boolean aBoolean190;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!np;Lclient!dq;IIIIIZIII)V")
	public Class28_Sub3_Sub2(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static205.method306(arg8, arg9));
		this.aClass170_1 = new Class170(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt3262, super.anInt3265, arg7, arg10);
		this.aBoolean190 = arg1.anInt1415 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)I")
	@Override
	public int method5425() {
		return this.aClass170_1.anInt4279;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIILclient!np;)Z")
	@Override
	public boolean method5408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2) {
		@Pc(16) Class75 local16 = this.aClass170_1.method3979(super.anInt3262, false, arg2, false, super.anInt3265, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class118 local23 = arg2.method4908();
			local23.method2659(super.anInt3262, super.anInt3268, super.anInt3265);
			return local16.method5460(arg0, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!np;)V")
	@Override
	public void method5424(@OriginalArg(1) Class155 arg0) {
		this.aClass170_1.method3978(arg0);
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
	@Override
	public void method5411() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(ILclient!np;)Lclient!ql;")
	@Override
	public Class12_Sub7 method5407(@OriginalArg(1) Class155 arg0) {
		@Pc(16) Class75 local16 = this.aClass170_1.method3979(super.anInt3262, false, arg0, true, super.anInt3265, 1024);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class118 local23 = arg0.method4908();
		local23.method2659(super.anInt3262, super.anInt3268, super.anInt3265);
		@Pc(38) Class12_Sub7 local38 = null;
		if (this.aBoolean190) {
			local38 = Static146.method2294(1);
		}
		if (this.aClass170_1.aClass12_Sub4_3 == null) {
			local16.method5469(local23, local38 == null ? null : local38.aClass12_Sub5Array1[0], 0);
		} else {
			@Pc(68) Class47 local68 = this.aClass170_1.aClass12_Sub4_3.method1797();
			arg0.method4905(local16, local68, local23, local38 == null ? null : local38.aClass12_Sub5Array1[0]);
		}
		this.aClass170_1.method3976(true, super.anInt3262 >> 7, super.anInt3265 >> 7, arg0, super.anInt3262 >> 7, local16, super.anInt3265 >> 7);
		return local38;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!np;B)V")
	@Override
	public void method5406(@OriginalArg(0) Class155 arg0) {
		@Pc(20) Class75 local20 = this.aClass170_1.method3979(super.anInt3262, true, arg0, true, super.anInt3265, 131072);
		if (local20 != null) {
			this.aClass170_1.method3976(false, super.anInt3262 >> 7, super.anInt3265 >> 7, arg0, super.anInt3262 >> 7, local20, super.anInt3265 >> 7);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!in;ILclient!np;BZI)V")
	@Override
	public void method5410(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!np;BI)Lclient!f;")
	@Override
	public Class75 method5422(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1) {
		return this.aClass170_1.method3979(0, false, arg0, false, 0, arg1);
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	@Override
	public void method5421() {
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)I")
	@Override
	public int method5423() {
		return this.aClass170_1.anInt4272;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!np;I)V")
	@Override
	public void method5426(@OriginalArg(0) Class155 arg0) {
		this.aClass170_1.method3977(arg0);
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5427() {
		return this.aClass170_1.method3974();
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5413() {
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)I")
	@Override
	public int method5420() {
		return this.aClass170_1.anInt4283;
	}
}
