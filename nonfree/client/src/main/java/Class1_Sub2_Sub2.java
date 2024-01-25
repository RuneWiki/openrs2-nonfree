import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class1_Sub2_Sub2 extends Class1_Sub2 implements Interface2 {

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "Lclient!gk;")
	public final Class84 aClass84_4;

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "Z")
	private final boolean aBoolean421;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!vc;Lclient!nm;IIIIIZIIIIII)V")
	public Class1_Sub2_Sub2(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static214.method3578(arg11, arg12));
		this.aClass84_4 = new Class84(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean421 = arg1.anInt4140 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	@Override
	public void method5653() {
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)I")
	@Override
	public int method5654() {
		return this.aClass84_4.anInt2350;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5655() {
		return this.aClass84_4.method2281();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!vc;I)Lclient!ep;")
	@Override
	public Class10_Sub3 method5640(@OriginalArg(0) Class63 arg0) {
		@Pc(16) Class66 local16 = this.aClass84_4.method2290(arg0, true, 1024, super.anInt6263, super.anInt6264, false);
		if (local16 == null) {
			return null;
		}
		@Pc(30) Class44 local30 = arg0.method2024();
		local30.method3541(super.anInt6258 + super.anInt6264, super.anInt6262, super.anInt6263 + super.anInt6266);
		@Pc(47) Class10_Sub3 local47 = null;
		if (this.aBoolean421) {
			local47 = Static299.method4461(1);
		}
		if (this.aClass84_4.aClass10_Sub1_3 == null) {
			local16.method5126(local30, local47 == null ? null : local47.aClass10_Sub7Array1[0], 0);
		} else {
			@Pc(77) Class186 local77 = this.aClass84_4.aClass10_Sub1_3.method229();
			arg0.method2055(local16, local77, local30, local47 == null ? null : local47.aClass10_Sub7Array1[0]);
		}
		this.aClass84_4.method2285(arg0, super.anInt6263 >> 7, super.anInt6264 >> 7, super.anInt6264 >> 7, super.anInt6263 >> 7, true, local16);
		return local47;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!vc;B)V")
	@Override
	public void method5648(@OriginalArg(0) Class63 arg0) {
		this.aClass84_4.method2283(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!vc;II)Z")
	@Override
	public boolean method5642(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(22) Class66 local22 = this.aClass84_4.method2290(arg0, false, 65536, super.anInt6263, super.anInt6264, false);
		if (local22 == null) {
			return false;
		} else {
			@Pc(29) Class44 local29 = arg0.method2024();
			local29.method3541(super.anInt6258 + super.anInt6264, super.anInt6262, super.anInt6266 + super.anInt6263);
			return local22.method5131(arg1, arg2, local29, false);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
	@Override
	public int method5651() {
		return this.aClass84_4.anInt2340;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BILclient!vc;)Lclient!n;")
	@Override
	public Class66 method5652(@OriginalArg(1) int arg0, @OriginalArg(2) Class63 arg1) {
		return this.aClass84_4.method2290(arg1, false, arg0, 0, 0, false);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5649(@OriginalArg(1) Class63 arg0) {
		this.aClass84_4.method2280(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5644(@OriginalArg(1) Class63 arg0) {
		@Pc(16) Class66 local16 = this.aClass84_4.method2290(arg0, true, 131072, super.anInt6263, super.anInt6264, false);
		if (local16 != null) {
			this.aClass84_4.method2285(arg0, super.anInt6263 >> 7, super.anInt6264 >> 7, super.anInt6264 >> 7, super.anInt6263 >> 7, false, local16);
		}
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)I")
	@Override
	public int method5442() {
		return this.aClass84_4.method2284();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)I")
	@Override
	public int method5650() {
		return this.aClass84_4.anInt2349;
	}
}
