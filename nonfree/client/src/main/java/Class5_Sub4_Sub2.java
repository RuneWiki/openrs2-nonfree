import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class5_Sub4_Sub2 extends Class5_Sub4 implements Interface8 {

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "Lclient!ob;")
	public final Class146 aClass146_1;

	@OriginalMember(owner = "client!kd", name = "R", descriptor = "Z")
	private final boolean aBoolean277;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!aa;Lclient!sk;IIIIIIIZIIII)V")
	public Class5_Sub4_Sub2(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg6, arg7, arg8, arg10, arg11, arg12, Static203.method3792(arg3, arg2));
		this.aClass146_1 = new Class146(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
		this.aBoolean277 = arg1.anInt5546 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!aa;IB)Lclient!hc;")
	@Override
	public Class78 method5695(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1) {
		return this.aClass146_1.method3989(arg0, 0, 0, false, false, arg1);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	@Override
	public void method5698() {
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)I")
	@Override
	public int method5697() {
		return this.aClass146_1.anInt4279;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!aa;Z)V")
	@Override
	public void method5686(@OriginalArg(0) Class2 arg0) {
		@Pc(16) Class78 local16 = this.aClass146_1.method3989(arg0, super.anInt3176, super.anInt3172, false, true, 131072);
		if (local16 != null) {
			this.aClass146_1.method3986(super.anInt3176 >> 7, super.anInt3172 >> 7, local16, false, arg0, super.anInt3172 >> 7, super.anInt3176 >> 7);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I")
	@Override
	public int method5699() {
		return this.aClass146_1.anInt4292;
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(B)I")
	@Override
	public int method3009() {
		return this.aClass146_1.method3982();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILclient!aa;)Z")
	@Override
	public boolean method5684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2 arg2) {
		@Pc(16) Class78 local16 = this.aClass146_1.method3989(arg2, super.anInt3176, super.anInt3172, false, false, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class21 local23 = arg2.method3284();
			local23.method2814(super.anInt3172 + super.anInt3174, super.anInt3179, super.anInt3173 + super.anInt3176);
			return local16.method4381(arg0, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!aa;B)V")
	@Override
	public void method5694(@OriginalArg(0) Class2 arg0) {
		this.aClass146_1.method3993(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)I")
	@Override
	public int method5701() {
		return this.aClass146_1.anInt4296;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5700() {
		return this.aClass146_1.method3985();
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Lclient!aa;B)V")
	@Override
	public void method5696(@OriginalArg(0) Class2 arg0) {
		this.aClass146_1.method3995(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!aa;I)Lclient!cn;")
	@Override
	public Class15_Sub3 method5680(@OriginalArg(0) Class2 arg0) {
		@Pc(16) Class78 local16 = this.aClass146_1.method3989(arg0, super.anInt3176, super.anInt3172, false, true, 1024);
		if (local16 == null) {
			return null;
		}
		@Pc(28) Class21 local28 = arg0.method3284();
		local28.method2814(super.anInt3172 + super.anInt3174, super.anInt3179, super.anInt3176 + super.anInt3173);
		@Pc(46) Class15_Sub3 local46 = null;
		if (this.aBoolean277) {
			local46 = Static186.method3613(1);
		}
		if (this.aClass146_1.aClass15_Sub5_4 == null) {
			local16.method4379(local28, local46 == null ? null : local46.aClass15_Sub2Array1[0], 0);
		} else {
			@Pc(76) Class162 local76 = this.aClass146_1.aClass15_Sub5_4.method2868();
			arg0.method3236(local16, local76, local28, local46 == null ? null : local46.aClass15_Sub2Array1[0]);
		}
		this.aClass146_1.method3986(super.anInt3176 >> 7, super.anInt3172 >> 7, local16, true, arg0, super.anInt3172 >> 7, super.anInt3176 >> 7);
		return local46;
	}
}
