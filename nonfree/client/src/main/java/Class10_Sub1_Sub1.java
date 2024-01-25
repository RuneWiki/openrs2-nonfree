import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class10_Sub1_Sub1 extends Class10_Sub1 {

	@OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
	public int anInt182;

	@OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
	public int anInt184;

	@OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
	public int anInt187;

	@OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
	public int anInt193;

	@OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
	public int anInt189 = -1;

	@OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
	public int anInt188 = -1;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILclient!e;)Z")
	@Override
	public boolean method5336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(6) Class51 local6 = arg2.method5145();
		local6.method3548(super.anInt179, super.anInt176, super.anInt173);
		@Pc(30) Class45 local30 = Static296.method5066(this.anInt187).method5964(null, 65536, arg2, null, this.anInt182, 0, -1, 0);
		if (local30 != null && local30.method1823(arg0, arg1, local6, true)) {
			return true;
		}
		if (this.anInt188 != -1) {
			local30 = Static296.method5066(this.anInt188).method5964(null, 65536, arg2, null, this.anInt193, 0, -1, 0);
			if (local30 != null && local30.method1823(arg0, arg1, local6, true)) {
				return true;
			}
		}
		if (this.anInt189 != -1) {
			local30 = Static296.method5066(this.anInt189).method5964(null, 65536, arg2, null, this.anInt184, 0, -1, 0);
			if (local30 != null && local30.method1823(arg0, arg1, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!e;Z)Lclient!um;")
	@Override
	public Class1_Sub8 method5337(@OriginalArg(0) Class46 arg0) {
		@Pc(6) Class51 local6 = arg0.method5145();
		local6.method3548(super.anInt179, super.anInt176, super.anInt173);
		@Pc(18) Class1_Sub8 local18 = Static182.method3510(3);
		@Pc(38) Class45 local38;
		if (this.anInt189 != -1) {
			local38 = Static296.method5066(this.anInt189).method5964(null, 1024, arg0, null, this.anInt184, 0, -1, 0);
			if (local38 != null) {
				local38.method1794(local6, local18.aClass1_Sub3Array1[2], 0);
			}
		}
		if (this.anInt188 != -1) {
			local38 = Static296.method5066(this.anInt188).method5964(null, 1024, arg0, null, this.anInt193, 0, -1, 0);
			if (local38 != null) {
				local38.method1794(local6, local18.aClass1_Sub3Array1[1], 0);
			}
		}
		local38 = Static296.method5066(this.anInt187).method5964(null, 1024, arg0, null, this.anInt182, 0, -1, 0);
		if (local38 != null) {
			local38.method1794(local6, local18.aClass1_Sub3Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(Lclient!e;B)V")
	@Override
	public void method5343(@OriginalArg(0) Class46 arg0) {
	}
}
