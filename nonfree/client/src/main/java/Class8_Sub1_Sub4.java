import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class8_Sub1_Sub4 extends Class8_Sub1 implements Interface7 {

	@OriginalMember(owner = "client!im", name = "T", descriptor = "Lclient!wg;")
	public final Class216 aClass216_2;

	@OriginalMember(owner = "client!im", name = "L", descriptor = "Z")
	private final boolean aBoolean252;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!vq;Lclient!bi;IIIIIIIZIIIII)V")
	public Class8_Sub1_Sub4(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.anInt542 == 1, Static274.method4687(arg2, arg3));
		this.aClass216_2 = new Class216(arg0, arg1, arg2, arg3, super.aByte77, arg5, arg6, arg8, arg9, arg14);
		this.aBoolean252 = arg1.anInt503 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!vq;I)V")
	@Override
	public void method5593(@OriginalArg(0) Class47 arg0) {
		this.aClass216_2.method5543(arg0);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IILclient!vq;)Lclient!ni;")
	@Override
	public Class38 method5588(@OriginalArg(1) int arg0, @OriginalArg(2) Class47 arg1) {
		return this.aClass216_2.method5549(0, false, 0, arg1, false, arg0);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)I")
	@Override
	public int method5589() {
		return this.aClass216_2.anInt6617;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!vq;ZLclient!km;IIBI)V")
	@Override
	public void method5621(@OriginalArg(0) Class47 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!vq;IIB)Z")
	@Override
	public boolean method5623(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class38 local16 = this.aClass216_2.method5549(super.anInt6702, false, super.anInt6701, arg0, false, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class57 local23 = arg0.method2706();
			local23.method4189(super.anInt6701, super.anInt6697, super.anInt6702);
			return local16.method1905(arg1, arg2, local23, false);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!vq;)V")
	@Override
	public void method5591(@OriginalArg(1) Class47 arg0) {
		this.aClass216_2.method5538(arg0);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5592() {
		return this.aClass216_2.method5541();
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	@Override
	public void method5587() {
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BLclient!vq;)Lclient!bf;")
	@Override
	public Class2_Sub2 method5624(@OriginalArg(1) Class47 arg0) {
		@Pc(24) Class38 local24 = this.aClass216_2.method5549(super.anInt6702, false, super.anInt6701, arg0, true, 1024);
		if (local24 == null) {
			return null;
		}
		@Pc(31) Class57 local31 = arg0.method2706();
		local31.method4189(super.anInt6701, super.anInt6697, super.anInt6702);
		@Pc(41) Class2_Sub2 local41 = null;
		if (this.aBoolean252) {
			local41 = Static248.method4393(1);
		}
		if (this.aClass216_2.aClass2_Sub4_6 == null) {
			local24.method1925(local31, local41 == null ? null : local41.aClass2_Sub5Array1[0], 0);
		} else {
			@Pc(71) Class176 local71 = this.aClass216_2.aClass2_Sub4_6.method3927();
			arg0.method2760(local24, local71, local31, local41 == null ? null : local41.aClass2_Sub5Array1[0]);
		}
		this.aClass216_2.method5540(true, super.aShort97, super.aShort96, super.aShort99, arg0, super.aShort98, local24);
		return local41;
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5622() {
		return false;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(B)I")
	@Override
	public int method5590() {
		return this.aClass216_2.anInt6611;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!vq;B)V")
	@Override
	public void method5627(@OriginalArg(0) Class47 arg0) {
		@Pc(21) Class38 local21 = this.aClass216_2.method5549(super.anInt6702, true, super.anInt6701, arg0, true, 131072);
		if (local21 != null) {
			this.aClass216_2.method5540(false, super.aShort97, super.aShort96, super.aShort99, arg0, super.aShort98, local21);
		}
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(I)I")
	@Override
	public int method5594() {
		return this.aClass216_2.anInt6616;
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(B)V")
	@Override
	public void method5625() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!im", name = "e", descriptor = "(I)I")
	@Override
	public int method5629() {
		return this.aClass216_2.method5542();
	}
}
