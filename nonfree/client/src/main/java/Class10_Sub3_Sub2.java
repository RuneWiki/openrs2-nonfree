import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class10_Sub3_Sub2 extends Class10_Sub3 implements Interface7 {

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "Lclient!ni;")
	public final Class150 aClass150_2;

	@OriginalMember(owner = "client!jb", name = "Z", descriptor = "Z")
	private final boolean aBoolean199;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!e;Lclient!fa;IIIIIIIZIIIII)V")
	public Class10_Sub3_Sub2(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.anInt1938 == 1, Static214.method3859(arg3, arg2));
		this.aClass150_2 = new Class150(arg0, arg1, arg2, arg3, super.aByte64, arg5, arg6, arg8, arg9, arg14);
		this.aBoolean199 = arg1.anInt1955 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!e;B)V")
	@Override
	public void method4068(@OriginalArg(0) Class46 arg0) {
		this.aClass150_2.method3825(arg0);
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Lclient!e;B)V")
	@Override
	public void method5343(@OriginalArg(0) Class46 arg0) {
		@Pc(20) Class45 local20 = this.aClass150_2.method3814(true, super.anInt5908, 131072, true, super.anInt5910, arg0);
		if (local20 != null) {
			this.aClass150_2.method3822(false, arg0, super.aShort83, super.aShort81, super.aShort82, super.aShort80, local20);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	@Override
	public void method4065() {
	}

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)I")
	@Override
	public int method5345() {
		return this.aClass150_2.method3821();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!e;IIZLclient!hm;I)V")
	@Override
	public void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)I")
	@Override
	public int method4070() {
		return this.aClass150_2.anInt4244;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4069() {
		return this.aClass150_2.method3819();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILclient!e;)Z")
	@Override
	public boolean method5336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(18) Class45 local18 = this.aClass150_2.method3814(false, super.anInt5908, 65536, false, super.anInt5910, arg2);
		if (local18 == null) {
			return false;
		} else {
			@Pc(25) Class51 local25 = arg2.method5145();
			local25.method3548(super.anInt5910, super.anInt5907, super.anInt5908);
			return local18.method1823(arg0, arg1, local25, false);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!e;I)V")
	@Override
	public void method4064(@OriginalArg(0) Class46 arg0) {
		this.aClass150_2.method3827(arg0);
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)I")
	@Override
	public int method4066() {
		return this.aClass150_2.anInt4226;
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5339() {
		return false;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!e;IB)Lclient!id;")
	@Override
	public Class45 method4071(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1) {
		return this.aClass150_2.method3814(false, 0, arg1, false, 0, arg0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!e;Z)Lclient!um;")
	@Override
	public Class1_Sub8 method5337(@OriginalArg(0) Class46 arg0) {
		@Pc(16) Class45 local16 = this.aClass150_2.method3814(true, super.anInt5908, 1024, false, super.anInt5910, arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class51 local23 = arg0.method5145();
		local23.method3548(super.anInt5910, super.anInt5907, super.anInt5908);
		@Pc(33) Class1_Sub8 local33 = null;
		if (this.aBoolean199) {
			local33 = Static182.method3510(1);
		}
		if (this.aClass150_2.aClass1_Sub7_5 == null) {
			local16.method1794(local23, local33 == null ? null : local33.aClass1_Sub3Array1[0], 0);
		} else {
			@Pc(49) Class109 local49 = this.aClass150_2.aClass1_Sub7_5.method4320();
			arg0.method5116(local16, local49, local23, local33 == null ? null : local33.aClass1_Sub3Array1[0]);
		}
		this.aClass150_2.method3822(true, arg0, super.aShort83, super.aShort81, super.aShort82, super.aShort80, local16);
		return local33;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
	@Override
	public void method5340() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)I")
	@Override
	public int method4067() {
		return this.aClass150_2.anInt4224;
	}
}
