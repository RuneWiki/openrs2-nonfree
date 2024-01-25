import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class10_Sub4_Sub2 extends Class10_Sub4 implements Interface7 {

	@OriginalMember(owner = "client!np", name = "J", descriptor = "Lclient!ni;")
	public final Class150 aClass150_3;

	@OriginalMember(owner = "client!np", name = "P", descriptor = "Z")
	private final boolean aBoolean283;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!e;Lclient!fa;IIIIIIIZIIII)V")
	public Class10_Sub4_Sub2(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg6, arg7, arg8, arg10, arg11, arg12, Static263.method4513(arg2, arg3));
		this.aClass150_3 = new Class150(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
		this.aBoolean283 = arg1.anInt1955 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4069() {
		return this.aClass150_3.method3819();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!e;IB)Lclient!id;")
	@Override
	public Class45 method4071(@OriginalArg(0) Class46 arg0, @OriginalArg(1) int arg1) {
		return this.aClass150_3.method3814(false, 0, arg1, false, 0, arg0);
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(Lclient!e;B)V")
	@Override
	public void method5343(@OriginalArg(0) Class46 arg0) {
		@Pc(22) Class45 local22 = this.aClass150_3.method3814(true, super.anInt4364, 131072, false, super.anInt4365, arg0);
		if (local22 != null) {
			this.aClass150_3.method3822(false, arg0, super.anInt4365 >> 7, super.anInt4364 >> 7, super.anInt4364 >> 7, super.anInt4365 >> 7, local22);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)I")
	@Override
	public int method4067() {
		return this.aClass150_3.anInt4224;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)I")
	@Override
	public int method4066() {
		return this.aClass150_3.anInt4226;
	}

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(I)I")
	@Override
	public int method3921() {
		return this.aClass150_3.method3821();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIILclient!e;)Z")
	@Override
	public boolean method5336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(18) Class45 local18 = this.aClass150_3.method3814(false, super.anInt4364, 65536, false, super.anInt4365, arg2);
		if (local18 == null) {
			return false;
		} else {
			@Pc(25) Class51 local25 = arg2.method5145();
			local25.method3548(super.anInt4365 + super.anInt4377, super.anInt4368, super.anInt4364 + super.anInt4371);
			return local18.method1823(arg0, arg1, local25, false);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!e;I)V")
	@Override
	public void method4064(@OriginalArg(0) Class46 arg0) {
		this.aClass150_3.method3827(arg0);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)I")
	@Override
	public int method4070() {
		return this.aClass150_3.anInt4244;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!e;Z)Lclient!um;")
	@Override
	public Class1_Sub8 method5337(@OriginalArg(0) Class46 arg0) {
		@Pc(16) Class45 local16 = this.aClass150_3.method3814(true, super.anInt4364, 1024, false, super.anInt4365, arg0);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class51 local23 = arg0.method5145();
		local23.method3548(super.anInt4377 + super.anInt4365, super.anInt4368, super.anInt4371 + super.anInt4364);
		@Pc(39) Class1_Sub8 local39 = null;
		if (this.aBoolean283) {
			local39 = Static182.method3510(1);
		}
		if (this.aClass150_3.aClass1_Sub7_5 == null) {
			local16.method1794(local23, local39 == null ? null : local39.aClass1_Sub3Array1[0], 0);
		} else {
			@Pc(69) Class109 local69 = this.aClass150_3.aClass1_Sub7_5.method4320();
			arg0.method5116(local16, local69, local23, local39 == null ? null : local39.aClass1_Sub3Array1[0]);
		}
		this.aClass150_3.method3822(true, arg0, super.anInt4365 >> 7, super.anInt4364 >> 7, super.anInt4364 >> 7, super.anInt4365 >> 7, local16);
		return local39;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!e;B)V")
	@Override
	public void method4068(@OriginalArg(0) Class46 arg0) {
		this.aClass150_3.method3825(arg0);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
	@Override
	public void method4065() {
	}
}
