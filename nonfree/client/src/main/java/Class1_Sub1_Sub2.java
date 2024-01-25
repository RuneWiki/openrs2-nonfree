import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 implements Interface2 {

	@OriginalMember(owner = "client!m", name = "I", descriptor = "Lclient!gk;")
	public final Class84 aClass84_2;

	@OriginalMember(owner = "client!m", name = "s", descriptor = "Z")
	private final boolean aBoolean289;

	static {
		new Class32("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!vc;Lclient!nm;IIIIIZIII)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static195.method3319(arg8, arg9));
		this.aClass84_2 = new Class84(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt6597, super.anInt6596, arg7, arg10);
		this.aBoolean289 = arg1.anInt4140 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!vc;II)Z")
	@Override
	public boolean method5642(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class66 local16 = this.aClass84_2.method2290(arg0, false, 65536, super.anInt6596, super.anInt6597, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(27) Class44 local27 = arg0.method2024();
			local27.method3541(super.anInt6597, super.anInt6595, super.anInt6596);
			return local16.method5131(arg1, arg2, local27, false);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!vc;I)Lclient!ep;")
	@Override
	public Class10_Sub3 method5640(@OriginalArg(0) Class63 arg0) {
		@Pc(21) Class66 local21 = this.aClass84_2.method2290(arg0, true, 1024, super.anInt6596, super.anInt6597, false);
		if (local21 == null) {
			return null;
		}
		@Pc(28) Class44 local28 = arg0.method2024();
		local28.method3541(super.anInt6597, super.anInt6595, super.anInt6596);
		@Pc(38) Class10_Sub3 local38 = null;
		if (this.aBoolean289) {
			local38 = Static299.method4461(1);
		}
		if (this.aClass84_2.aClass10_Sub1_3 == null) {
			local21.method5126(local28, local38 == null ? null : local38.aClass10_Sub7Array1[0], 0);
		} else {
			@Pc(54) Class186 local54 = this.aClass84_2.aClass10_Sub1_3.method229();
			arg0.method2055(local21, local54, local28, local38 == null ? null : local38.aClass10_Sub7Array1[0]);
		}
		this.aClass84_2.method2285(arg0, super.anInt6596 >> 7, super.anInt6597 >> 7, super.anInt6597 >> 7, super.anInt6596 >> 7, true, local21);
		return local38;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5641() {
		return false;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5644(@OriginalArg(1) Class63 arg0) {
		@Pc(16) Class66 local16 = this.aClass84_2.method2290(arg0, true, 131072, super.anInt6596, super.anInt6597, true);
		if (local16 != null) {
			this.aClass84_2.method2285(arg0, super.anInt6596 >> 7, super.anInt6597 >> 7, super.anInt6597 >> 7, super.anInt6596 >> 7, false, local16);
		}
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5655() {
		return this.aClass84_2.method2281();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)I")
	@Override
	public int method5651() {
		return this.aClass84_2.anInt2340;
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V")
	@Override
	public void method5643() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5649(@OriginalArg(1) Class63 arg0) {
		this.aClass84_2.method2280(arg0);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)I")
	@Override
	public int method5650() {
		return this.aClass84_2.anInt2349;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BILclient!vc;)Lclient!n;")
	@Override
	public Class66 method5652(@OriginalArg(1) int arg0, @OriginalArg(2) Class63 arg1) {
		return this.aClass84_2.method2290(arg1, false, arg0, 0, 0, false);
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(B)I")
	@Override
	public int method5654() {
		return this.aClass84_2.anInt2350;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!vc;B)V")
	@Override
	public void method5648(@OriginalArg(0) Class63 arg0) {
		this.aClass84_2.method2283(arg0);
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	@Override
	public void method5653() {
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZILclient!vc;IILclient!uq;I)V")
	@Override
	public void method5637(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
