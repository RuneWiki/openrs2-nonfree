import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class60 {

	@OriginalMember(owner = "client!cga", name = "h", descriptor = "Lclient!hh;")
	private Class2 aClass2_48;

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "Lclient!hh;")
	public final Class2 aClass2_47 = new Class2();

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "()V")
	public Class60() {
		this.aClass2_47.aClass2_346 = this.aClass2_47;
		this.aClass2_47.aClass2_345 = this.aClass2_47;
	}

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "(I)Z")
	public boolean method1221() {
		return this.aClass2_47 == this.aClass2_47.aClass2_345;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V")
	public void method1223() {
		while (true) {
			@Pc(9) Class2 local9 = this.aClass2_47.aClass2_345;
			if (this.aClass2_47 == local9) {
				this.aClass2_48 = null;
				return;
			}
			local9.method9872();
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)Lclient!hh;")
	public Class2 method1224() {
		@Pc(6) Class2 local6 = this.aClass2_48;
		if (this.aClass2_47 == local6) {
			this.aClass2_48 = null;
			return null;
		} else {
			this.aClass2_48 = local6.aClass2_346;
			return local6;
		}
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(I)Lclient!hh;")
	public Class2 method1225() {
		@Pc(17) Class2 local17 = this.aClass2_47.aClass2_345;
		if (this.aClass2_47 == local17) {
			return null;
		} else {
			local17.method9872();
			return local17;
		}
	}

	@OriginalMember(owner = "client!cga", name = "d", descriptor = "(I)Lclient!hh;")
	public Class2 method1226(@OriginalArg(0) int arg0) {
		@Pc(7) Class2 local7 = this.aClass2_47.aClass2_345;
		if (arg0 != 7) {
			Static82.aByteArray11 = null;
		}
		if (this.aClass2_47 == local7) {
			this.aClass2_48 = null;
			return null;
		} else {
			this.aClass2_48 = local7.aClass2_345;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "(Z)Lclient!hh;")
	public Class2 method1227() {
		@Pc(7) Class2 local7 = this.aClass2_47.aClass2_346;
		if (this.aClass2_47 == local7) {
			this.aClass2_48 = null;
			return null;
		} else {
			this.aClass2_48 = local7.aClass2_346;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(Z)Lclient!hh;")
	public Class2 method1228() {
		@Pc(15) Class2 local15 = this.aClass2_48;
		if (local15 == this.aClass2_47) {
			this.aClass2_48 = null;
			return null;
		} else {
			this.aClass2_48 = local15.aClass2_345;
			return local15;
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Z)I")
	public int method1230() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class2 local11 = this.aClass2_47.aClass2_345; local11 != this.aClass2_47; local11 = local11.aClass2_345) {
			local7++;
		}
		if (false) {
			this.method1226(-73);
		}
		return local7;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!hh;Lclient!cga;B)V")
	private void method1231(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class60 arg1) {
		@Pc(7) Class2 local7 = this.aClass2_47.aClass2_346;
		this.aClass2_47.aClass2_346 = arg0.aClass2_346;
		arg0.aClass2_346.aClass2_345 = this.aClass2_47;
		if (arg0 != this.aClass2_47) {
			arg0.aClass2_346 = arg1.aClass2_47.aClass2_346;
			arg0.aClass2_346.aClass2_345 = arg0;
			arg1.aClass2_47.aClass2_346 = local7;
			local7.aClass2_345 = arg1.aClass2_47;
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZLclient!cga;)V")
	public void method1232(@OriginalArg(1) Class60 arg0) {
		this.method1231(this.aClass2_47.aClass2_345, arg0);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!hh;I)V")
	public void method1233(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_346 != null) {
			arg0.method9872();
		}
		arg0.aClass2_345 = this.aClass2_47;
		arg0.aClass2_346 = this.aClass2_47.aClass2_346;
		arg0.aClass2_346.aClass2_345 = arg0;
		arg0.aClass2_345.aClass2_346 = arg0;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(BLclient!hh;)V")
	public void method1234(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_346 != null) {
			arg0.method9872();
		}
		arg0.aClass2_345 = this.aClass2_47.aClass2_345;
		arg0.aClass2_346 = this.aClass2_47;
		arg0.aClass2_346.aClass2_345 = arg0;
		arg0.aClass2_345.aClass2_346 = arg0;
	}
}
