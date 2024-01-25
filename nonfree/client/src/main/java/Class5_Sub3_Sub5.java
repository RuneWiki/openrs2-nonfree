import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class5_Sub3_Sub5 extends Class5_Sub3 implements Interface8 {

	@OriginalMember(owner = "client!qq", name = "L", descriptor = "Lclient!ob;")
	public final Class146 aClass146_2;

	@OriginalMember(owner = "client!qq", name = "G", descriptor = "Z")
	private final boolean aBoolean418;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!aa;Lclient!sk;IIIIIIIZIIIII)V")
	public Class5_Sub3_Sub5(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.anInt5522 == 1, Static103.method1922(arg3, arg2));
		this.aClass146_2 = new Class146(arg0, arg1, arg2, arg3, super.aByte53, arg5, arg6, arg8, arg9, arg14);
		this.aBoolean418 = arg1.anInt5546 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!aa;I)Lclient!cn;")
	@Override
	public Class15_Sub3 method5680(@OriginalArg(0) Class2 arg0) {
		@Pc(16) Class78 local16 = this.aClass146_2.method3989(arg0, super.anInt5047, super.anInt5050, false, true, 1024);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class21 local23 = arg0.method3284();
		local23.method2814(super.anInt5050, super.anInt5046, super.anInt5047);
		@Pc(38) Class15_Sub3 local38 = null;
		if (this.aBoolean418) {
			local38 = Static186.method3613(1);
		}
		if (this.aClass146_2.aClass15_Sub5_4 == null) {
			local16.method4379(local23, local38 == null ? null : local38.aClass15_Sub2Array1[0], 0);
		} else {
			@Pc(54) Class162 local54 = this.aClass146_2.aClass15_Sub5_4.method2868();
			arg0.method3236(local16, local54, local23, local38 == null ? null : local38.aClass15_Sub2Array1[0]);
		}
		this.aClass146_2.method3986(super.aShort76, super.aShort78, local16, true, arg0, super.aShort75, super.aShort77);
		return local38;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!aa;B)V")
	@Override
	public void method5694(@OriginalArg(0) Class2 arg0) {
		this.aClass146_2.method3993(arg0);
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(B)V")
	@Override
	public void method5678() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)I")
	@Override
	public int method5701() {
		return this.aClass146_2.anInt4296;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!aa;Z)V")
	@Override
	public void method5686(@OriginalArg(0) Class2 arg0) {
		@Pc(16) Class78 local16 = this.aClass146_2.method3989(arg0, super.anInt5047, super.anInt5050, true, true, 131072);
		if (local16 != null) {
			this.aClass146_2.method3986(super.aShort76, super.aShort78, local16, false, arg0, super.aShort75, super.aShort77);
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V")
	@Override
	public void method5698() {
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!aa;IB)Lclient!hc;")
	@Override
	public Class78 method5695(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1) {
		return this.aClass146_2.method3989(arg0, 0, 0, false, false, arg1);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)I")
	@Override
	public int method5699() {
		return this.aClass146_2.anInt4292;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)I")
	@Override
	public int method5697() {
		return this.aClass146_2.anInt4279;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(Z)I")
	@Override
	public int method4586() {
		return this.aClass146_2.method3982();
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5700() {
		return this.aClass146_2.method3985();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIILclient!aa;)Z")
	@Override
	public boolean method5684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2 arg2) {
		@Pc(16) Class78 local16 = this.aClass146_2.method3989(arg2, super.anInt5047, super.anInt5050, false, false, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class21 local23 = arg2.method3284();
			local23.method2814(super.anInt5050, super.anInt5046, super.anInt5047);
			return local16.method4381(arg0, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(Lclient!aa;B)V")
	@Override
	public void method5696(@OriginalArg(0) Class2 arg0) {
		this.aClass146_2.method3995(arg0);
	}

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5681() {
		return false;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZIILclient!aa;ILclient!qh;)V")
	@Override
	public void method5677(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5) {
		throw new IllegalStateException();
	}
}
