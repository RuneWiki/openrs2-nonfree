import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class22_Sub2_Sub3 extends Class22_Sub2 implements Interface1 {

	@OriginalMember(owner = "client!pn", name = "H", descriptor = "Lclient!pl;")
	public final Class164 aClass164_1;

	@OriginalMember(owner = "client!pn", name = "W", descriptor = "Z")
	private final boolean aBoolean358;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!pe;Lclient!kk;IIIIIIIZIIIII)V")
	public Class22_Sub2_Sub3(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.anInt3524 == 1, Static169.method3222(arg2, arg3));
		this.aClass164_1 = new Class164(arg0, arg1, arg2, arg3, super.aByte69, arg5, arg6, arg8, arg9, arg14);
		this.aBoolean358 = arg1.anInt3560 != 0;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLclient!pe;)V")
	@Override
	public void method5365(@OriginalArg(1) Class89 arg0) {
		this.aClass164_1.method4215(arg0);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZILclient!hh;Lclient!pe;III)V")
	@Override
	public void method5340(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) Class89 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!pe;B)Lclient!ca;")
	@Override
	public Class36_Sub1 method5345(@OriginalArg(0) Class89 arg0) {
		@Pc(16) Class31 local16 = this.aClass164_1.method4216(super.anInt5973, arg0, true, 1024, super.anInt5967, false);
		if (local16 == null) {
			return null;
		}
		@Pc(29) Class70 local29 = arg0.method5427();
		local29.method3707(super.anInt5973, super.anInt5968, super.anInt5967);
		@Pc(39) Class36_Sub1 local39 = null;
		if (this.aBoolean358) {
			local39 = Static184.method3381(1);
		}
		if (this.aClass164_1.aClass36_Sub3_4 == null) {
			local16.method1928(local29, local39 == null ? null : local39.aClass36_Sub6Array1[0], 0);
		} else {
			@Pc(55) Class24 local55 = this.aClass164_1.aClass36_Sub3_4.method2176();
			arg0.method5390(local16, local55, local29, local39 == null ? null : local39.aClass36_Sub6Array1[0]);
		}
		this.aClass164_1.method4210(local16, super.aShort83, super.aShort82, super.aShort84, arg0, super.aShort81, true);
		return local39;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V")
	@Override
	public void method5358() {
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!pe;I)V")
	@Override
	public void method5359(@OriginalArg(0) Class89 arg0) {
		this.aClass164_1.method4217(arg0);
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)I")
	@Override
	public int method5361() {
		return this.aClass164_1.anInt4816;
	}

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5343() {
		return false;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!pe;II)Lclient!sj;")
	@Override
	public Class31 method5364(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1) {
		return this.aClass164_1.method4216(0, arg0, false, arg1, 0, false);
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5363() {
		return this.aClass164_1.method4221();
	}

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "(I)I")
	@Override
	public int method5057() {
		return this.aClass164_1.method4223();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)I")
	@Override
	public int method5360() {
		return this.aClass164_1.anInt4825;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILclient!pe;)V")
	@Override
	public void method5341(@OriginalArg(1) Class89 arg0) {
		@Pc(16) Class31 local16 = this.aClass164_1.method4216(super.anInt5973, arg0, true, 131072, super.anInt5967, true);
		if (local16 != null) {
			this.aClass164_1.method4210(local16, super.aShort83, super.aShort82, super.aShort84, arg0, super.aShort81, false);
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)I")
	@Override
	public int method5362() {
		return this.aClass164_1.anInt4821;
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(B)V")
	@Override
	public void method5338() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IILclient!pe;I)Z")
	@Override
	public boolean method5342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2) {
		@Pc(16) Class31 local16 = this.aClass164_1.method4216(super.anInt5973, arg2, false, 65536, super.anInt5967, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class70 local23 = arg2.method5427();
			local23.method3707(super.anInt5973, super.anInt5968, super.anInt5967);
			return local16.method1932(arg1, arg0, local23, false);
		}
	}
}
