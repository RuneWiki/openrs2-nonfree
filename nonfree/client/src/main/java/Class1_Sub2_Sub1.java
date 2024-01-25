import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 implements Interface8 {

	@OriginalMember(owner = "client!an", name = "T", descriptor = "Lclient!op;")
	public final Class151 aClass151_1;

	@OriginalMember(owner = "client!an", name = "E", descriptor = "Z")
	private final boolean aBoolean19;

	static {
		new Class140(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!dr;Lclient!fq;IIIIIIIZIIIII)V")
	public Class1_Sub2_Sub1(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.lb == 1, Static120.method46(arg3, arg2));
		this.aClass151_1 = new Class151(arg0, arg1, arg2, arg3, super.aByte77, arg5, arg6, arg8, arg9, arg14);
		this.aBoolean19 = arg1.anInt2086 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(B)V")
	@Override
	public void method5761() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5759() {
		return false;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!dr;IB)Lclient!wp;")
	@Override
	public Class49 method5499(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1) {
		return this.aClass151_1.method4337(0, false, false, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(Lclient!dr;I)Lclient!kq;")
	@Override
	public Class57_Sub5 method5758(@OriginalArg(0) Class37 arg0) {
		@Pc(16) Class49 local16 = this.aClass151_1.method4337(super.anInt6888, false, true, arg0, 1024, super.anInt6893);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class38 local23 = arg0.method3672();
		local23.method4474(super.anInt6893, super.anInt6886, super.anInt6888);
		@Pc(38) Class57_Sub5 local38 = null;
		if (this.aBoolean19) {
			local38 = Static116.method2281(1);
		}
		if (this.aClass151_1.aClass57_Sub6_5 == null) {
			local16.method5825(local23, local38 == null ? null : local38.aClass57_Sub4Array1[0], 0);
		} else {
			@Pc(68) Class214 local68 = this.aClass151_1.aClass57_Sub6_5.method3844();
			arg0.method3692(local16, local68, local23, local38 == null ? null : local38.aClass57_Sub4Array1[0]);
		}
		this.aClass151_1.method4330(super.aShort89, super.aShort88, super.aShort90, local16, super.aShort87, arg0, true);
		return local38;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5497() {
		return this.aClass151_1.method4333();
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(Z)I")
	@Override
	public int method5766() {
		return this.aClass151_1.method4338();
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(I)V")
	@Override
	public void method5504() {
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZILclient!la;IIILclient!dr;)V")
	@Override
	public void method5762(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IILclient!dr;I)Z")
	@Override
	public boolean method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2) {
		@Pc(16) Class49 local16 = this.aClass151_1.method4337(super.anInt6888, false, false, arg2, 65536, super.anInt6893);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class38 local28 = arg2.method3672();
			local28.method4474(super.anInt6893, super.anInt6886, super.anInt6888);
			return local16.method5816(arg0, arg1, local28, false);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)I")
	@Override
	public int method5501() {
		return this.aClass151_1.anInt5115;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)I")
	@Override
	public int method5502() {
		return this.aClass151_1.anInt5110;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)I")
	@Override
	public int method5503() {
		return this.aClass151_1.anInt5101;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BLclient!dr;)V")
	@Override
	public void method5498(@OriginalArg(1) Class37 arg0) {
		this.aClass151_1.method4335(arg0);
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5754(@OriginalArg(0) Class37 arg0) {
		@Pc(22) Class49 local22 = this.aClass151_1.method4337(super.anInt6888, true, true, arg0, 131072, super.anInt6893);
		if (local22 != null) {
			this.aClass151_1.method4330(super.aShort89, super.aShort88, super.aShort90, local22, super.aShort87, arg0, false);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5500(@OriginalArg(0) Class37 arg0) {
		this.aClass151_1.method4340(arg0);
	}
}
