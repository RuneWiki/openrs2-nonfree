import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class28_Sub2_Sub3 extends Class28_Sub2 implements Interface3 {

	@OriginalMember(owner = "client!om", name = "C", descriptor = "Lclient!nt;")
	public final Class170 aClass170_2;

	@OriginalMember(owner = "client!om", name = "y", descriptor = "Z")
	private final boolean aBoolean357;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!np;Lclient!dq;IIIIIZII)V")
	public Class28_Sub2_Sub3(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.aBoolean92, arg1.aBoolean84);
		this.aClass170_2 = new Class170(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean357 = arg1.anInt1415 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!np;BI)Lclient!f;")
	@Override
	public Class75 method5422(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1) {
		return this.aClass170_2.method3979(0, false, arg0, false, 0, arg1);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(ILclient!np;)Lclient!ql;")
	@Override
	public Class12_Sub7 method5407(@OriginalArg(1) Class155 arg0) {
		@Pc(16) Class75 local16 = this.aClass170_2.method3979(super.anInt4557, false, arg0, true, super.anInt4556, 1024);
		if (local16 == null) {
			return null;
		}
		@Pc(27) Class118 local27 = arg0.method4908();
		local27.method2659(super.anInt4557, super.anInt4555, super.anInt4556);
		@Pc(37) Class12_Sub7 local37 = null;
		if (this.aBoolean357) {
			local37 = Static146.method2294(1);
		}
		if (this.aClass170_2.aClass12_Sub4_3 == null) {
			local16.method5469(local27, local37 == null ? null : local37.aClass12_Sub5Array1[0], 0);
		} else {
			@Pc(53) Class47 local53 = this.aClass170_2.aClass12_Sub4_3.method1797();
			arg0.method4905(local16, local53, local27, local37 == null ? null : local37.aClass12_Sub5Array1[0]);
		}
		this.aClass170_2.method3976(true, super.anInt4557 >> 7, super.anInt4556 >> 7, arg0, super.anInt4557 >> 7, local16, super.anInt4556 >> 7);
		return local37;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!in;ILclient!np;BZI)V")
	@Override
	public void method5410(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)I")
	@Override
	public int method5425() {
		return this.aClass170_2.anInt4279;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!np;)V")
	@Override
	public void method5424(@OriginalArg(1) Class155 arg0) {
		this.aClass170_2.method3978(arg0);
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(I)I")
	@Override
	public int method5423() {
		return this.aClass170_2.anInt4272;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIILclient!np;)Z")
	@Override
	public boolean method5408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2) {
		@Pc(21) Class75 local21 = this.aClass170_2.method3979(super.anInt4557, false, arg2, false, super.anInt4556, 65536);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class118 local28 = arg2.method4908();
			local28.method2659(super.anInt4557, super.anInt4555, super.anInt4556);
			return local21.method5460(arg0, arg1, local28, false);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!np;B)V")
	@Override
	public void method5406(@OriginalArg(0) Class155 arg0) {
		@Pc(21) Class75 local21 = this.aClass170_2.method3979(super.anInt4557, true, arg0, true, super.anInt4556, 131072);
		if (local21 != null) {
			this.aClass170_2.method3976(false, super.anInt4557 >> 7, super.anInt4556 >> 7, arg0, super.anInt4557 >> 7, local21, super.anInt4556 >> 7);
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
	@Override
	public void method5421() {
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5413() {
		return false;
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V")
	@Override
	public void method5411() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!np;I)V")
	@Override
	public void method5426(@OriginalArg(0) Class155 arg0) {
		this.aClass170_2.method3977(arg0);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5427() {
		return this.aClass170_2.method3974();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)I")
	@Override
	public int method5420() {
		return this.aClass170_2.anInt4283;
	}
}
