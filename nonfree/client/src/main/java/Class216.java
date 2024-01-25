import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public final class Class216 {

	@OriginalMember(owner = "client!mba", name = "s", descriptor = "Lclient!no;")
	private Class3 aClass3_186;

	@OriginalMember(owner = "client!mba", name = "l", descriptor = "Lclient!no;")
	public final Class3 aClass3_185 = new Class3();

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "()V")
	public Class216() {
		this.aClass3_185.aClass3_299 = this.aClass3_185;
		this.aClass3_185.aClass3_300 = this.aClass3_185;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILclient!no;)V")
	public void method5449(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_299 != null) {
			arg0.method8682();
		}
		arg0.aClass3_299 = this.aClass3_185.aClass3_299;
		arg0.aClass3_300 = this.aClass3_185;
		arg0.aClass3_299.aClass3_300 = arg0;
		arg0.aClass3_300.aClass3_299 = arg0;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!mba;BLclient!no;)V")
	private void method5450(@OriginalArg(0) Class216 arg0, @OriginalArg(2) Class3 arg1) {
		@Pc(7) Class3 local7 = this.aClass3_185.aClass3_299;
		this.aClass3_185.aClass3_299 = arg1.aClass3_299;
		arg1.aClass3_299.aClass3_300 = this.aClass3_185;
		if (arg1 != this.aClass3_185) {
			arg1.aClass3_299 = arg0.aClass3_185.aClass3_299;
			arg1.aClass3_299.aClass3_300 = arg1;
			arg0.aClass3_185.aClass3_299 = local7;
			local7.aClass3_300 = arg0.aClass3_185;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!mba;I)V")
	public void method5451(@OriginalArg(0) Class216 arg0) {
		this.method5450(arg0, this.aClass3_185.aClass3_300);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lclient!no;I)V")
	public void method5453(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_299 != null) {
			arg0.method8682();
		}
		arg0.aClass3_299 = this.aClass3_185;
		arg0.aClass3_300 = this.aClass3_185.aClass3_300;
		arg0.aClass3_299.aClass3_300 = arg0;
		arg0.aClass3_300.aClass3_299 = arg0;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V")
	public void method5454() {
		while (true) {
			@Pc(9) Class3 local9 = this.aClass3_185.aClass3_300;
			if (local9 == this.aClass3_185) {
				this.aClass3_186 = null;
				return;
			}
			local9.method8682();
		}
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(B)Z")
	public boolean method5455() {
		return this.aClass3_185.aClass3_300 == this.aClass3_185;
	}

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "(B)Lclient!no;")
	public Class3 method5456() {
		@Pc(15) Class3 local15 = this.aClass3_185.aClass3_299;
		if (local15 == this.aClass3_185) {
			this.aClass3_186 = null;
			return null;
		} else {
			this.aClass3_186 = local15.aClass3_299;
			return local15;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)Lclient!no;")
	public Class3 method5457() {
		@Pc(15) Class3 local15 = this.aClass3_185.aClass3_300;
		if (local15 == this.aClass3_185) {
			this.aClass3_186 = null;
			return null;
		} else {
			this.aClass3_186 = local15.aClass3_300;
			return local15;
		}
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)Lclient!no;")
	public Class3 method5458() {
		@Pc(17) Class3 local17 = this.aClass3_186;
		if (this.aClass3_185 == local17) {
			this.aClass3_186 = null;
			return null;
		} else {
			this.aClass3_186 = local17.aClass3_300;
			return local17;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)Lclient!no;")
	public Class3 method5459() {
		@Pc(11) Class3 local11 = this.aClass3_186;
		if (local11 == this.aClass3_185) {
			this.aClass3_186 = null;
			return null;
		} else {
			this.aClass3_186 = local11.aClass3_299;
			return local11;
		}
	}

	@OriginalMember(owner = "client!mba", name = "c", descriptor = "(I)I")
	public int method5460() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class3 local11 = this.aClass3_185.aClass3_300; local11 != this.aClass3_185; local11 = local11.aClass3_300) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "(I)Lclient!no;")
	public Class3 method5462() {
		@Pc(12) Class3 local12 = this.aClass3_185.aClass3_300;
		if (this.aClass3_185 == local12) {
			return null;
		} else {
			local12.method8682();
			return local12;
		}
	}
}
