import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 implements Interface2 {

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "Lclient!gk;")
	public final Class84 aClass84_1;

	@OriginalMember(owner = "client!bf", name = "s", descriptor = "Z")
	private final boolean aBoolean42;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!vc;Lclient!nm;IIIIIZII)V")
	public Class1_Sub3_Sub1(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.aBoolean314, arg1.aBoolean316);
		this.aClass84_1 = new Class84(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean42 = arg1.anInt4140 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BILclient!vc;)Lclient!n;")
	@Override
	public Class66 method5652(@OriginalArg(1) int arg0, @OriginalArg(2) Class63 arg1) {
		return this.aClass84_1.method2290(arg1, false, arg0, 0, 0, false);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!vc;I)Lclient!ep;")
	@Override
	public Class10_Sub3 method5640(@OriginalArg(0) Class63 arg0) {
		@Pc(16) Class66 local16 = this.aClass84_1.method2290(arg0, true, 1024, super.anInt4621, super.anInt4623, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class44 local23 = arg0.method2024();
		local23.method3541(super.anInt4623, super.anInt4622, super.anInt4621);
		@Pc(33) Class10_Sub3 local33 = null;
		if (this.aBoolean42) {
			local33 = Static299.method4461(1);
		}
		if (this.aClass84_1.aClass10_Sub1_3 == null) {
			local16.method5126(local23, local33 == null ? null : local33.aClass10_Sub7Array1[0], 0);
		} else {
			@Pc(63) Class186 local63 = this.aClass84_1.aClass10_Sub1_3.method229();
			arg0.method2055(local16, local63, local23, local33 == null ? null : local33.aClass10_Sub7Array1[0]);
		}
		this.aClass84_1.method2285(arg0, super.anInt4621 >> 7, super.anInt4623 >> 7, super.anInt4623 >> 7, super.anInt4621 >> 7, true, local16);
		return local33;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)I")
	@Override
	public int method5650() {
		return this.aClass84_1.anInt2349;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!vc;B)V")
	@Override
	public void method5648(@OriginalArg(0) Class63 arg0) {
		this.aClass84_1.method2283(arg0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)I")
	@Override
	public int method5651() {
		return this.aClass84_1.anInt2340;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!vc;II)Z")
	@Override
	public boolean method5642(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class66 local16 = this.aClass84_1.method2290(arg0, false, 65536, super.anInt4621, super.anInt4623, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class44 local28 = arg0.method2024();
			local28.method3541(super.anInt4623, super.anInt4622, super.anInt4621);
			return local16.method5131(arg1, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
	@Override
	public void method5653() {
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZILclient!vc;IILclient!uq;I)V")
	@Override
	public void method5637(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)I")
	@Override
	public int method5654() {
		return this.aClass84_1.anInt2350;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5649(@OriginalArg(1) Class63 arg0) {
		this.aClass84_1.method2280(arg0);
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5655() {
		return this.aClass84_1.method2281();
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5641() {
		return false;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V")
	@Override
	public void method5643() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5644(@OriginalArg(1) Class63 arg0) {
		@Pc(23) Class66 local23 = this.aClass84_1.method2290(arg0, true, 131072, super.anInt4621, super.anInt4623, true);
		if (local23 != null) {
			this.aClass84_1.method2285(arg0, super.anInt4621 >> 7, super.anInt4623 >> 7, super.anInt4623 >> 7, super.anInt4621 >> 7, false, local23);
		}
	}
}
