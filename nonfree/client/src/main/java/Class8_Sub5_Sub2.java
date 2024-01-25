import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class8_Sub5_Sub2 extends Class8_Sub5 implements Interface7 {

	@OriginalMember(owner = "client!v", name = "R", descriptor = "Lclient!wg;")
	public final Class216 aClass216_3;

	@OriginalMember(owner = "client!v", name = "I", descriptor = "Z")
	private final boolean aBoolean463;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!vq;Lclient!bi;IIIIIIZI)V")
	public Class8_Sub5_Sub2(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		super(arg5, arg6, arg7, arg1.aBoolean45, arg1.aBoolean39);
		this.aClass216_3 = new Class216(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
		this.aBoolean463 = arg1.anInt503 != 0 && !arg8;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
	@Override
	public void method5625() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!vq;I)V")
	@Override
	public void method5593(@OriginalArg(0) Class47 arg0) {
		this.aClass216_3.method5543(arg0);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	@Override
	public void method5587() {
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!vq;IIB)Z")
	@Override
	public boolean method5623(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class38 local16 = this.aClass216_3.method5549(super.anInt6321, false, super.anInt6322, arg0, false, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(31) Class57 local31 = arg0.method2706();
			local31.method4189(super.anInt6322, super.anInt6324, super.anInt6321);
			return local16.method1905(arg1, arg2, local31, false);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)I")
	@Override
	public int method5589() {
		return this.aClass216_3.anInt6617;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5592() {
		return this.aClass216_3.method5541();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLclient!vq;)Lclient!bf;")
	@Override
	public Class2_Sub2 method5624(@OriginalArg(1) Class47 arg0) {
		@Pc(24) Class38 local24 = this.aClass216_3.method5549(super.anInt6321, false, super.anInt6322, arg0, true, 1024);
		if (local24 == null) {
			return null;
		}
		@Pc(31) Class57 local31 = arg0.method2706();
		local31.method4189(super.anInt6322, super.anInt6324, super.anInt6321);
		@Pc(41) Class2_Sub2 local41 = null;
		if (this.aBoolean463) {
			local41 = Static248.method4393(1);
		}
		if (this.aClass216_3.aClass2_Sub4_6 == null) {
			local24.method1925(local31, local41 == null ? null : local41.aClass2_Sub5Array1[0], 0);
		} else {
			@Pc(57) Class176 local57 = this.aClass216_3.aClass2_Sub4_6.method3927();
			arg0.method2760(local24, local57, local31, local41 == null ? null : local41.aClass2_Sub5Array1[0]);
		}
		this.aClass216_3.method5540(true, super.anInt6321 >> 7, super.anInt6322 >> 7, super.anInt6321 >> 7, arg0, super.anInt6322 >> 7, local24);
		return local41;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)I")
	@Override
	public int method5594() {
		return this.aClass216_3.anInt6616;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!vq;)Lclient!ni;")
	@Override
	public Class38 method5588(@OriginalArg(1) int arg0, @OriginalArg(2) Class47 arg1) {
		return this.aClass216_3.method5549(0, false, 0, arg1, false, arg0);
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5622() {
		return false;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!vq;ZLclient!km;IIBI)V")
	@Override
	public void method5621(@OriginalArg(0) Class47 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!vq;)V")
	@Override
	public void method5591(@OriginalArg(1) Class47 arg0) {
		this.aClass216_3.method5538(arg0);
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(B)I")
	@Override
	public int method5590() {
		return this.aClass216_3.anInt6611;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!vq;B)V")
	@Override
	public void method5627(@OriginalArg(0) Class47 arg0) {
		@Pc(25) Class38 local25 = this.aClass216_3.method5549(super.anInt6321, true, super.anInt6322, arg0, true, 131072);
		if (local25 != null) {
			this.aClass216_3.method5540(false, super.anInt6321 >> 7, super.anInt6322 >> 7, super.anInt6321 >> 7, arg0, super.anInt6322 >> 7, local25);
		}
	}
}
