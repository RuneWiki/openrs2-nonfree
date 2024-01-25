import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class10_Sub5_Sub2 extends Class10_Sub5 implements Interface7 {

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "Lclient!ni;")
	public final Class150 aClass150_4;

	@OriginalMember(owner = "client!oj", name = "A", descriptor = "Z")
	private final boolean aBoolean301;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!e;Lclient!fa;IIIIIIZI)V")
	public Class10_Sub5_Sub2(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		super(arg5, arg6, arg7, arg1.aBoolean129, arg1.aBoolean127);
		this.aClass150_4 = new Class150(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
		this.aBoolean301 = arg1.anInt1955 != 0 && !arg8;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILclient!e;IIZLclient!hm;I)V")
	@Override
	public void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(Lclient!e;B)V")
	@Override
	public void method5343(@OriginalArg(0) Class46 arg0) {
		@Pc(21) Class45 local21 = this.aClass150_4.method3814(true, super.anInt4530, 131072, true, super.anInt4527, arg0);
		if (local21 != null) {
			this.aClass150_4.method3822(false, arg0, super.anInt4527 >> 7, super.anInt4530 >> 7, super.anInt4530 >> 7, super.anInt4527 >> 7, local21);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)I")
	@Override
	public int method4070() {
		return this.aClass150_4.anInt4244;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!e;Z)Lclient!um;")
	@Override
	public Class1_Sub8 method5337(@OriginalArg(0) Class46 arg0) {
		@Pc(16) Class45 local16 = this.aClass150_4.method3814(true, super.anInt4530, 1024, false, super.anInt4527, arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class51 local23 = arg0.method5145();
		local23.method3548(super.anInt4527, super.anInt4528, super.anInt4530);
		@Pc(33) Class1_Sub8 local33 = null;
		if (this.aBoolean301) {
			local33 = Static182.method3510(1);
		}
		if (this.aClass150_4.aClass1_Sub7_5 == null) {
			local16.method1794(local23, local33 == null ? null : local33.aClass1_Sub3Array1[0], 0);
		} else {
			@Pc(49) Class109 local49 = this.aClass150_4.aClass1_Sub7_5.method4320();
			arg0.method5116(local16, local49, local23, local33 == null ? null : local33.aClass1_Sub3Array1[0]);
		}
		this.aClass150_4.method3822(true, arg0, super.anInt4527 >> 7, super.anInt4530 >> 7, super.anInt4530 >> 7, super.anInt4527 >> 7, local16);
		return local33;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIILclient!e;)Z")
	@Override
	public boolean method5336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(18) Class45 local18 = this.aClass150_4.method3814(false, super.anInt4530, 65536, false, super.anInt4527, arg2);
		if (local18 == null) {
			return false;
		} else {
			@Pc(25) Class51 local25 = arg2.method5145();
			local25.method3548(super.anInt4527, super.anInt4528, super.anInt4530);
			return local18.method1823(arg0, arg1, local25, false);
		}
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)I")
	@Override
	public int method4066() {
		return this.aClass150_4.anInt4226;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!e;B)V")
	@Override
	public void method4068(@OriginalArg(0) Class46 arg0) {
		this.aClass150_4.method3825(arg0);
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4069() {
		return this.aClass150_4.method3819();
	}

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
	@Override
	public void method5340() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	@Override
	public void method4065() {
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!e;I)V")
	@Override
	public void method4064(@OriginalArg(0) Class46 arg0) {
		this.aClass150_4.method3827(arg0);
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5339() {
		return false;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!e;IB)Lclient!id;")
	@Override
	public Class45 method4071(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1) {
		return this.aClass150_4.method3814(false, 0, arg1, false, 0, arg0);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)I")
	@Override
	public int method4067() {
		return this.aClass150_4.anInt4224;
	}
}
