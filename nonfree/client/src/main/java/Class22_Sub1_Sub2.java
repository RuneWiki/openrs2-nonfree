import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class22_Sub1_Sub2 extends Class22_Sub1 implements Interface1 {

	@OriginalMember(owner = "client!sp", name = "B", descriptor = "Lclient!pl;")
	public final Class164 aClass164_2;

	@OriginalMember(owner = "client!sp", name = "y", descriptor = "Z")
	private final boolean aBoolean421;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lclient!pe;Lclient!kk;IIIIIIZI)V")
	public Class22_Sub1_Sub2(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		super(arg5, arg6, arg7, arg1.aBoolean268, arg1.aBoolean263);
		this.aClass164_2 = new Class164(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
		this.aBoolean421 = arg1.anInt3560 != 0;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)I")
	@Override
	public int method5360() {
		return this.aClass164_2.anInt4825;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!pe;B)Lclient!ca;")
	@Override
	public Class36_Sub1 method5345(@OriginalArg(0) Class89 arg0) {
		@Pc(21) Class31 local21 = this.aClass164_2.method4216(super.anInt5707, arg0, true, 1024, super.anInt5706, false);
		if (local21 == null) {
			return null;
		}
		@Pc(28) Class70 local28 = arg0.method5427();
		local28.method3707(super.anInt5707, super.anInt5705, super.anInt5706);
		@Pc(38) Class36_Sub1 local38 = null;
		if (this.aBoolean421) {
			local38 = Static184.method3381(1);
		}
		if (this.aClass164_2.aClass36_Sub3_4 == null) {
			local21.method1928(local28, local38 == null ? null : local38.aClass36_Sub6Array1[0], 0);
		} else {
			@Pc(68) Class24 local68 = this.aClass164_2.aClass36_Sub3_4.method2176();
			arg0.method5390(local21, local68, local28, local38 == null ? null : local38.aClass36_Sub6Array1[0]);
		}
		this.aClass164_2.method4210(local21, super.anInt5707 >> 7, super.anInt5707 >> 7, super.anInt5706 >> 7, arg0, super.anInt5706 >> 7, true);
		return local38;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!pe;II)Lclient!sj;")
	@Override
	public Class31 method5364(@OriginalArg(0) Class89 arg0, @OriginalArg(1) int arg1) {
		return this.aClass164_2.method4216(0, arg0, false, arg1, 0, false);
	}

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5343() {
		return false;
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(B)V")
	@Override
	public void method5338() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILclient!pe;)V")
	@Override
	public void method5341(@OriginalArg(1) Class89 arg0) {
		@Pc(16) Class31 local16 = this.aClass164_2.method4216(super.anInt5707, arg0, true, 131072, super.anInt5706, true);
		if (local16 != null) {
			this.aClass164_2.method4210(local16, super.anInt5707 >> 7, super.anInt5707 >> 7, super.anInt5706 >> 7, arg0, super.anInt5706 >> 7, false);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILclient!pe;I)Z")
	@Override
	public boolean method5342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2) {
		@Pc(16) Class31 local16 = this.aClass164_2.method4216(super.anInt5707, arg2, false, 65536, super.anInt5706, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class70 local23 = arg2.method5427();
			local23.method3707(super.anInt5707, super.anInt5705, super.anInt5706);
			return local16.method1932(arg1, arg0, local23, false);
		}
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)I")
	@Override
	public int method5361() {
		return this.aClass164_2.anInt4816;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BLclient!pe;)V")
	@Override
	public void method5365(@OriginalArg(1) Class89 arg0) {
		this.aClass164_2.method4215(arg0);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V")
	@Override
	public void method5358() {
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZILclient!hh;Lclient!pe;III)V")
	@Override
	public void method5340(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) Class89 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5363() {
		return this.aClass164_2.method4221();
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)I")
	@Override
	public int method5362() {
		return this.aClass164_2.anInt4821;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!pe;I)V")
	@Override
	public void method5359(@OriginalArg(0) Class89 arg0) {
		this.aClass164_2.method4217(arg0);
	}
}
