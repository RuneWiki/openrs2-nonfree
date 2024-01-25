import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 implements Interface8 {

	@OriginalMember(owner = "client!db", name = "u", descriptor = "Lclient!op;")
	public final Class151 aClass151_2;

	@OriginalMember(owner = "client!db", name = "I", descriptor = "Z")
	private final boolean aBoolean97;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!dr;Lclient!fq;IIIIIIIZI)V")
	public Class1_Sub1_Sub1(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class74 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		super(arg6, arg7, arg8, Static122.method2381(arg2, arg3));
		this.aClass151_2 = new Class151(arg0, arg1, arg2, arg3, arg4, arg5, super.anInt5238, super.anInt5237, arg9, arg10);
		this.aBoolean97 = arg1.anInt2086 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(Lclient!dr;I)Lclient!kq;")
	@Override
	public Class57_Sub5 method5758(@OriginalArg(0) Class37 arg0) {
		@Pc(16) Class49 local16 = this.aClass151_2.method4337(super.anInt5237, false, true, arg0, 1024, super.anInt5238);
		if (local16 == null) {
			return null;
		}
		@Pc(28) Class38 local28 = arg0.method3672();
		local28.method4474(super.anInt5238, super.anInt5241, super.anInt5237);
		@Pc(38) Class57_Sub5 local38 = null;
		if (this.aBoolean97) {
			local38 = Static116.method2281(1);
		}
		if (this.aClass151_2.aClass57_Sub6_5 == null) {
			local16.method5825(local28, local38 == null ? null : local38.aClass57_Sub4Array1[0], 0);
		} else {
			@Pc(54) Class214 local54 = this.aClass151_2.aClass57_Sub6_5.method3844();
			arg0.method3692(local16, local54, local28, local38 == null ? null : local38.aClass57_Sub4Array1[0]);
		}
		this.aClass151_2.method4330(super.anInt5238 >> 7, super.anInt5238 >> 7, super.anInt5237 >> 7, local16, super.anInt5237 >> 7, arg0, true);
		return local38;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLclient!dr;)V")
	@Override
	public void method5498(@OriginalArg(1) Class37 arg0) {
		this.aClass151_2.method4335(arg0);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5759() {
		return false;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
	@Override
	public void method5504() {
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!dr;IB)Lclient!wp;")
	@Override
	public Class49 method5499(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1) {
		return this.aClass151_2.method4337(0, false, false, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5497() {
		return this.aClass151_2.method4333();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5500(@OriginalArg(0) Class37 arg0) {
		this.aClass151_2.method4340(arg0);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)I")
	@Override
	public int method5502() {
		return this.aClass151_2.anInt5110;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZILclient!la;IIILclient!dr;)V")
	@Override
	public void method5762(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class37 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IILclient!dr;I)Z")
	@Override
	public boolean method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class37 arg2) {
		@Pc(21) Class49 local21 = this.aClass151_2.method4337(super.anInt5237, false, false, arg2, 65536, super.anInt5238);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class38 local28 = arg2.method3672();
			local28.method4474(super.anInt5238, super.anInt5241, super.anInt5237);
			return local21.method5816(arg0, arg1, local28, false);
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)I")
	@Override
	public int method5503() {
		return this.aClass151_2.anInt5101;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)I")
	@Override
	public int method5501() {
		return this.aClass151_2.anInt5115;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
	@Override
	public void method5761() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(Lclient!dr;I)V")
	@Override
	public void method5754(@OriginalArg(0) Class37 arg0) {
		@Pc(23) Class49 local23 = this.aClass151_2.method4337(super.anInt5237, true, true, arg0, 131072, super.anInt5238);
		if (local23 != null) {
			this.aClass151_2.method4330(super.anInt5238 >> 7, super.anInt5238 >> 7, super.anInt5237 >> 7, local23, super.anInt5237 >> 7, arg0, false);
		}
	}
}
