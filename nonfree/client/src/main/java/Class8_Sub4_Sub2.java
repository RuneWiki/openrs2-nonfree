import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class8_Sub4_Sub2 extends Class8_Sub4 implements Interface7 {

	@OriginalMember(owner = "client!wj", name = "R", descriptor = "Lclient!wg;")
	public final Class216 aClass216_4;

	@OriginalMember(owner = "client!wj", name = "y", descriptor = "Z")
	private final boolean aBoolean481;

	static {
		new Class159("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!vq;Lclient!bi;IIIIIIIZI)V")
	public Class8_Sub4_Sub2(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		super(arg6, arg7, arg8, Static212.method2564(arg2, arg3));
		this.aClass216_4 = new Class216(arg0, arg1, arg2, arg3, arg4, arg5, super.anInt6654, super.anInt6662, arg9, arg10);
		this.aBoolean481 = arg1.anInt503 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IILclient!vq;)Lclient!ni;")
	@Override
	public Class38 method5588(@OriginalArg(1) int arg0, @OriginalArg(2) Class47 arg1) {
		return this.aClass216_4.method5549(0, false, 0, arg1, false, arg0);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!vq;)V")
	@Override
	public void method5591(@OriginalArg(1) Class47 arg0) {
		this.aClass216_4.method5538(arg0);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!vq;IIB)Z")
	@Override
	public boolean method5623(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class38 local16 = this.aClass216_4.method5549(super.anInt6662, false, super.anInt6654, arg0, false, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(31) Class57 local31 = arg0.method2706();
			local31.method4189(super.anInt6654, super.anInt6656, super.anInt6662);
			return local16.method1905(arg1, arg2, local31, false);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)I")
	@Override
	public int method5589() {
		return this.aClass216_4.anInt6617;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5592() {
		return this.aClass216_4.method5541();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLclient!vq;)Lclient!bf;")
	@Override
	public Class2_Sub2 method5624(@OriginalArg(1) Class47 arg0) {
		@Pc(16) Class38 local16 = this.aClass216_4.method5549(super.anInt6662, false, super.anInt6654, arg0, true, 1024);
		if (local16 == null) {
			return null;
		}
		@Pc(31) Class57 local31 = arg0.method2706();
		local31.method4189(super.anInt6654, super.anInt6656, super.anInt6662);
		@Pc(41) Class2_Sub2 local41 = null;
		if (this.aBoolean481) {
			local41 = Static248.method4393(1);
		}
		if (this.aClass216_4.aClass2_Sub4_6 == null) {
			local16.method1925(local31, local41 == null ? null : local41.aClass2_Sub5Array1[0], 0);
		} else {
			@Pc(71) Class176 local71 = this.aClass216_4.aClass2_Sub4_6.method3927();
			arg0.method2760(local16, local71, local31, local41 == null ? null : local41.aClass2_Sub5Array1[0]);
		}
		this.aClass216_4.method5540(true, super.anInt6662 >> 7, super.anInt6654 >> 7, super.anInt6662 >> 7, arg0, super.anInt6654 >> 7, local16);
		return local41;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)I")
	@Override
	public int method5590() {
		return this.aClass216_4.anInt6611;
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5622() {
		return false;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)I")
	@Override
	public int method5594() {
		return this.aClass216_4.anInt6616;
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V")
	@Override
	public void method5625() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!vq;B)V")
	@Override
	public void method5627(@OriginalArg(0) Class47 arg0) {
		@Pc(20) Class38 local20 = this.aClass216_4.method5549(super.anInt6662, true, super.anInt6654, arg0, true, 131072);
		if (local20 != null) {
			this.aClass216_4.method5540(false, super.anInt6662 >> 7, super.anInt6654 >> 7, super.anInt6662 >> 7, arg0, super.anInt6654 >> 7, local20);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	@Override
	public void method5587() {
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!vq;ZLclient!km;IIBI)V")
	@Override
	public void method5621(@OriginalArg(0) Class47 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!vq;I)V")
	@Override
	public void method5593(@OriginalArg(0) Class47 arg0) {
		this.aClass216_4.method5543(arg0);
	}
}
