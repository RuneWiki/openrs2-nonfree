import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class22_Sub5_Sub2 extends Class22_Sub5 implements Interface1 {

	@OriginalMember(owner = "client!vl", name = "S", descriptor = "Lclient!pl;")
	public final Class164 aClass164_4;

	@OriginalMember(owner = "client!vl", name = "P", descriptor = "Z")
	private final boolean aBoolean461;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lclient!pe;Lclient!kk;IIIIIIIZIIII)V")
	public Class22_Sub5_Sub2(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg6, arg7, arg8, arg10, arg11, arg12, Static143.method3639(arg3, arg2));
		this.aClass164_4 = new Class164(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
		this.aBoolean461 = arg1.anInt3560 != 0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
	@Override
	public void method5358() {
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)I")
	@Override
	public int method5362() {
		return this.aClass164_4.anInt4821;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!pe;)V")
	@Override
	public void method5341(@OriginalArg(1) Class89 arg0) {
		@Pc(16) Class31 local16 = this.aClass164_4.method4216(super.anInt6344, arg0, true, 131072, super.anInt6336, false);
		if (local16 != null) {
			this.aClass164_4.method4210(local16, super.anInt6344 >> 7, super.anInt6344 >> 7, super.anInt6336 >> 7, arg0, super.anInt6336 >> 7, false);
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)I")
	@Override
	public int method5361() {
		return this.aClass164_4.anInt4816;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!pe;I)V")
	@Override
	public void method5359(@OriginalArg(0) Class89 arg0) {
		this.aClass164_4.method4217(arg0);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!pe;II)Lclient!sj;")
	@Override
	public Class31 method5364(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1) {
		return this.aClass164_4.method4216(0, arg0, false, arg1, 0, false);
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5363() {
		return this.aClass164_4.method4221();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLclient!pe;)V")
	@Override
	public void method5365(@OriginalArg(1) Class89 arg0) {
		this.aClass164_4.method4215(arg0);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!pe;B)Lclient!ca;")
	@Override
	public Class36_Sub1 method5345(@OriginalArg(0) Class89 arg0) {
		@Pc(16) Class31 local16 = this.aClass164_4.method4216(super.anInt6344, arg0, true, 1024, super.anInt6336, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class70 local23 = arg0.method5427();
		local23.method3707(super.anInt6347 + super.anInt6344, super.anInt6345, super.anInt6339 + super.anInt6336);
		@Pc(44) Class36_Sub1 local44 = null;
		if (this.aBoolean461) {
			local44 = Static184.method3381(1);
		}
		if (this.aClass164_4.aClass36_Sub3_4 == null) {
			local16.method1928(local23, local44 == null ? null : local44.aClass36_Sub6Array1[0], 0);
		} else {
			@Pc(74) Class24 local74 = this.aClass164_4.aClass36_Sub3_4.method2176();
			arg0.method5390(local16, local74, local23, local44 == null ? null : local44.aClass36_Sub6Array1[0]);
		}
		this.aClass164_4.method4210(local16, super.anInt6344 >> 7, super.anInt6344 >> 7, super.anInt6336 >> 7, arg0, super.anInt6336 >> 7, true);
		return local44;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)I")
	@Override
	public int method5360() {
		return this.aClass164_4.anInt4825;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILclient!pe;I)Z")
	@Override
	public boolean method5342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2) {
		@Pc(16) Class31 local16 = this.aClass164_4.method4216(super.anInt6344, arg2, false, 65536, super.anInt6336, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class70 local23 = arg2.method5427();
			local23.method3707(super.anInt6344 + super.anInt6347, super.anInt6345, super.anInt6336 + super.anInt6339);
			return local16.method1932(arg1, arg0, local23, false);
		}
	}

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "(I)I")
	@Override
	public int method5351() {
		return this.aClass164_4.method4223();
	}
}
