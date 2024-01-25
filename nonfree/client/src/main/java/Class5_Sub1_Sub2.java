import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 implements Interface8 {

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "Lclient!ob;")
	public final Class146 aClass146_3;

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "Z")
	private final boolean aBoolean524;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!aa;Lclient!sk;IIIIIIIZI)V")
	public Class5_Sub1_Sub2(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		super(arg6, arg7, arg8, Static119.method1861(arg3, arg2));
		this.aClass146_3 = new Class146(arg0, arg1, arg2, arg3, arg4, arg5, super.anInt5954, super.anInt5961, arg9, arg10);
		this.aBoolean524 = arg1.anInt5546 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!aa;B)V")
	@Override
	public void method5694(@OriginalArg(0) Class2 arg0) {
		this.aClass146_3.method3993(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I")
	@Override
	public int method5699() {
		return this.aClass146_3.anInt4292;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)I")
	@Override
	public int method5701() {
		return this.aClass146_3.anInt4296;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I")
	@Override
	public int method5697() {
		return this.aClass146_3.anInt4279;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5700() {
		return this.aClass146_3.method3985();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!aa;Z)V")
	@Override
	public void method5686(@OriginalArg(0) Class2 arg0) {
		@Pc(16) Class78 local16 = this.aClass146_3.method3989(arg0, super.anInt5961, super.anInt5954, true, true, 131072);
		if (local16 != null) {
			this.aClass146_3.method3986(super.anInt5961 >> 7, super.anInt5954 >> 7, local16, false, arg0, super.anInt5954 >> 7, super.anInt5961 >> 7);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZIILclient!aa;ILclient!qh;)V")
	@Override
	public void method5677(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!aa;I)Lclient!cn;")
	@Override
	public Class15_Sub3 method5680(@OriginalArg(0) Class2 arg0) {
		@Pc(22) Class78 local22 = this.aClass146_3.method3989(arg0, super.anInt5961, super.anInt5954, false, true, 1024);
		if (local22 == null) {
			return null;
		}
		@Pc(29) Class21 local29 = arg0.method3284();
		local29.method2814(super.anInt5954, super.anInt5963, super.anInt5961);
		@Pc(39) Class15_Sub3 local39 = null;
		if (this.aBoolean524) {
			local39 = Static186.method3613(1);
		}
		if (this.aClass146_3.aClass15_Sub5_4 == null) {
			local22.method4379(local29, local39 == null ? null : local39.aClass15_Sub2Array1[0], 0);
		} else {
			@Pc(69) Class162 local69 = this.aClass146_3.aClass15_Sub5_4.method2868();
			arg0.method3236(local22, local69, local29, local39 == null ? null : local39.aClass15_Sub2Array1[0]);
		}
		this.aClass146_3.method3986(super.anInt5961 >> 7, super.anInt5954 >> 7, local22, true, arg0, super.anInt5954 >> 7, super.anInt5961 >> 7);
		return local39;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(Lclient!aa;B)V")
	@Override
	public void method5696(@OriginalArg(0) Class2 arg0) {
		this.aClass146_3.method3995(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!aa;IB)Lclient!hc;")
	@Override
	public Class78 method5695(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1) {
		return this.aClass146_3.method3989(arg0, 0, 0, false, false, arg1);
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V")
	@Override
	public void method5678() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIILclient!aa;)Z")
	@Override
	public boolean method5684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2 arg2) {
		@Pc(16) Class78 local16 = this.aClass146_3.method3989(arg2, super.anInt5961, super.anInt5954, false, false, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(31) Class21 local31 = arg2.method3284();
			local31.method2814(super.anInt5954, super.anInt5963, super.anInt5961);
			return local16.method4381(arg0, arg1, local31, false);
		}
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5681() {
		return false;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
	@Override
	public void method5698() {
	}
}
