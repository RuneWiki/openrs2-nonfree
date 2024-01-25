import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class1_Sub5_Sub5 extends Class1_Sub5 implements Interface2 {

	@OriginalMember(owner = "client!tn", name = "D", descriptor = "Lclient!gk;")
	public final Class84 aClass84_3;

	@OriginalMember(owner = "client!tn", name = "x", descriptor = "Z")
	private final boolean aBoolean419;

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lclient!vc;Lclient!nm;IIIIIZIIIIIII)V")
	public Class1_Sub5_Sub5(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt4111 == 1, Static267.method4112(arg12, arg13));
		this.aClass84_3 = new Class84(arg0, arg1, arg12, arg13, super.aByte69, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean419 = arg1.anInt4140 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)I")
	@Override
	public int method5654() {
		return this.aClass84_3.anInt2350;
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5641() {
		return false;
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5655() {
		return this.aClass84_3.method2281();
	}

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "(B)V")
	@Override
	public void method5643() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZILclient!vc;IILclient!uq;I)V")
	@Override
	public void method5637(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5644(@OriginalArg(1) Class63 arg0) {
		@Pc(24) Class66 local24 = this.aClass84_3.method2290(arg0, true, 131072, super.anInt6386, super.anInt6390, true);
		if (local24 != null) {
			this.aClass84_3.method2285(arg0, super.aShort97, super.aShort94, super.aShort96, super.aShort95, false, local24);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)I")
	@Override
	public int method5650() {
		return this.aClass84_3.anInt2349;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!vc;II)Z")
	@Override
	public boolean method5642(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) Class66 local20 = this.aClass84_3.method2290(arg0, false, 65536, super.anInt6386, super.anInt6390, false);
		if (local20 == null) {
			return false;
		} else {
			@Pc(27) Class44 local27 = arg0.method2024();
			local27.method3541(super.anInt6390, super.anInt6387, super.anInt6386);
			return local20.method5131(arg1, arg2, local27, false);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BILclient!vc;)Lclient!n;")
	@Override
	public Class66 method5652(@OriginalArg(1) int arg0, @OriginalArg(2) Class63 arg1) {
		return this.aClass84_3.method2290(arg1, false, arg0, 0, 0, false);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!vc;I)Lclient!ep;")
	@Override
	public Class10_Sub3 method5640(@OriginalArg(0) Class63 arg0) {
		@Pc(16) Class66 local16 = this.aClass84_3.method2290(arg0, true, 1024, super.anInt6386, super.anInt6390, false);
		if (local16 == null) {
			return null;
		}
		@Pc(30) Class44 local30 = arg0.method2024();
		local30.method3541(super.anInt6390, super.anInt6387, super.anInt6386);
		@Pc(40) Class10_Sub3 local40 = null;
		if (this.aBoolean419) {
			local40 = Static299.method4461(1);
		}
		if (this.aClass84_3.aClass10_Sub1_3 == null) {
			local16.method5126(local30, local40 == null ? null : local40.aClass10_Sub7Array1[0], 0);
		} else {
			@Pc(56) Class186 local56 = this.aClass84_3.aClass10_Sub1_3.method229();
			arg0.method2055(local16, local56, local30, local40 == null ? null : local40.aClass10_Sub7Array1[0]);
		}
		this.aClass84_3.method2285(arg0, super.aShort97, super.aShort94, super.aShort96, super.aShort95, true, local16);
		return local40;
	}

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "(B)I")
	@Override
	public int method5540() {
		return this.aClass84_3.method2284();
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5649(@OriginalArg(1) Class63 arg0) {
		this.aClass84_3.method2280(arg0);
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)I")
	@Override
	public int method5651() {
		return this.aClass84_3.anInt2340;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!vc;B)V")
	@Override
	public void method5648(@OriginalArg(0) Class63 arg0) {
		this.aClass84_3.method2283(arg0);
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V")
	@Override
	public void method5653() {
	}
}
