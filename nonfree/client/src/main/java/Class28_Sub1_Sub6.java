import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class28_Sub1_Sub6 extends Class28_Sub1 implements Interface3 {

	@OriginalMember(owner = "client!u", name = "P", descriptor = "Lclient!nt;")
	public final Class170 aClass170_3;

	@OriginalMember(owner = "client!u", name = "G", descriptor = "Z")
	private final boolean aBoolean442;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!np;Lclient!dq;IIIIIZIIIIIII)V")
	public Class28_Sub1_Sub6(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1393 == 1, Static329.method5029(arg12, arg13));
		this.aClass170_3 = new Class170(arg0, arg1, arg12, arg13, super.aByte73, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean442 = arg1.anInt1415 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(ILclient!np;)Lclient!ql;")
	@Override
	public Class12_Sub7 method5407(@OriginalArg(1) Class155 arg0) {
		@Pc(16) Class75 local16 = this.aClass170_3.method3979(super.anInt5774, false, arg0, true, super.anInt5766, 1024);
		if (local16 == null) {
			return null;
		}
		@Pc(31) Class118 local31 = arg0.method4908();
		local31.method2659(super.anInt5774, super.anInt5769, super.anInt5766);
		@Pc(41) Class12_Sub7 local41 = null;
		if (this.aBoolean442) {
			local41 = Static146.method2294(1);
		}
		if (this.aClass170_3.aClass12_Sub4_3 == null) {
			local16.method5469(local31, local41 == null ? null : local41.aClass12_Sub5Array1[0], 0);
		} else {
			@Pc(71) Class47 local71 = this.aClass170_3.aClass12_Sub4_3.method1797();
			arg0.method4905(local16, local71, local31, local41 == null ? null : local41.aClass12_Sub5Array1[0]);
		}
		this.aClass170_3.method3976(true, super.aShort88, super.aShort90, arg0, super.aShort89, local16, super.aShort87);
		return local41;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	@Override
	public void method5421() {
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!np;)V")
	@Override
	public void method5424(@OriginalArg(1) Class155 arg0) {
		this.aClass170_3.method3978(arg0);
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5413() {
		return false;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!np;B)V")
	@Override
	public void method5406(@OriginalArg(0) Class155 arg0) {
		@Pc(22) Class75 local22 = this.aClass170_3.method3979(super.anInt5774, true, arg0, true, super.anInt5766, 131072);
		if (local22 != null) {
			this.aClass170_3.method3976(false, super.aShort88, super.aShort90, arg0, super.aShort89, local22, super.aShort87);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!np;BI)Lclient!f;")
	@Override
	public Class75 method5422(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1) {
		return this.aClass170_3.method3979(0, false, arg0, false, 0, arg1);
	}

	@OriginalMember(owner = "client!u", name = "j", descriptor = "(I)I")
	@Override
	public int method5191() {
		return this.aClass170_3.method3981();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)I")
	@Override
	public int method5420() {
		return this.aClass170_3.anInt4283;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!np;I)V")
	@Override
	public void method5426(@OriginalArg(0) Class155 arg0) {
		this.aClass170_3.method3977(arg0);
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
	@Override
	public void method5411() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5427() {
		return this.aClass170_3.method3974();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!in;ILclient!np;BZI)V")
	@Override
	public void method5410(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)I")
	@Override
	public int method5425() {
		return this.aClass170_3.anInt4279;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIILclient!np;)Z")
	@Override
	public boolean method5408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2) {
		@Pc(23) Class75 local23 = this.aClass170_3.method3979(super.anInt5774, false, arg2, false, super.anInt5766, 65536);
		if (local23 == null) {
			return false;
		} else {
			@Pc(30) Class118 local30 = arg2.method4908();
			local30.method2659(super.anInt5774, super.anInt5769, super.anInt5766);
			return local23.method5460(arg0, arg1, local30, false);
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)I")
	@Override
	public int method5423() {
		return this.aClass170_3.anInt4272;
	}
}
