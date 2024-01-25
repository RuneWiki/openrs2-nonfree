import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class32 {

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Lclient!wj;")
	private Class14 aClass14_28;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "Lclient!wj;")
	public final Class14 aClass14_27 = new Class14();

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class32() {
		this.aClass14_27.aClass14_339 = this.aClass14_27;
		this.aClass14_27.aClass14_340 = this.aClass14_27;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)Lclient!wj;")
	public Class14 method577() {
		@Pc(15) Class14 local15 = this.aClass14_28;
		if (local15 == this.aClass14_27) {
			this.aClass14_28 = null;
			return null;
		} else {
			this.aClass14_28 = local15.aClass14_339;
			return local15;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)Lclient!wj;")
	public Class14 method578() {
		@Pc(7) Class14 local7 = this.aClass14_27.aClass14_340;
		if (this.aClass14_27 == local7) {
			this.aClass14_28 = null;
			return null;
		} else {
			this.aClass14_28 = local7.aClass14_340;
			return local7;
		}
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)Lclient!wj;")
	public Class14 method579() {
		@Pc(7) Class14 local7 = this.aClass14_27.aClass14_339;
		if (this.aClass14_27 == local7) {
			return null;
		} else {
			local7.method9513();
			return local7;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)Lclient!wj;")
	public Class14 method580() {
		@Pc(6) Class14 local6 = this.aClass14_28;
		if (local6 == this.aClass14_27) {
			this.aClass14_28 = null;
			return null;
		} else {
			this.aClass14_28 = local6.aClass14_340;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!wj;I)V")
	public void method582(@OriginalArg(0) Class14 arg0) {
		if (arg0.aClass14_340 != null) {
			arg0.method9513();
		}
		arg0.aClass14_339 = this.aClass14_27;
		arg0.aClass14_340 = this.aClass14_27.aClass14_340;
		arg0.aClass14_340.aClass14_339 = arg0;
		arg0.aClass14_339.aClass14_340 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)Lclient!wj;")
	public Class14 method584() {
		@Pc(7) Class14 local7 = this.aClass14_27.aClass14_339;
		if (local7 == this.aClass14_27) {
			this.aClass14_28 = null;
			return null;
		} else {
			this.aClass14_28 = local7.aClass14_339;
			return local7;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLclient!wj;)V")
	public void method585(@OriginalArg(1) Class14 arg0) {
		if (arg0.aClass14_340 != null) {
			arg0.method9513();
		}
		arg0.aClass14_339 = this.aClass14_27.aClass14_339;
		arg0.aClass14_340 = this.aClass14_27;
		arg0.aClass14_340.aClass14_339 = arg0;
		arg0.aClass14_339.aClass14_340 = arg0;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!wj;BLclient!bd;)V")
	private void method587(@OriginalArg(0) Class14 arg0, @OriginalArg(2) Class32 arg1) {
		@Pc(15) Class14 local15 = this.aClass14_27.aClass14_340;
		this.aClass14_27.aClass14_340 = arg0.aClass14_340;
		arg0.aClass14_340.aClass14_339 = this.aClass14_27;
		if (this.aClass14_27 != arg0) {
			arg0.aClass14_340 = arg1.aClass14_27.aClass14_340;
			arg0.aClass14_340.aClass14_339 = arg0;
			local15.aClass14_339 = arg1.aClass14_27;
			arg1.aClass14_27.aClass14_340 = local15;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public void method588() {
		while (true) {
			@Pc(3) Class14 local3 = this.aClass14_27.aClass14_339;
			if (local3 == this.aClass14_27) {
				this.aClass14_28 = null;
				return;
			}
			local3.method9513();
		}
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)I")
	public int method589() {
		@Pc(5) int local5 = 0;
		for (@Pc(9) Class14 local9 = this.aClass14_27.aClass14_339; local9 != this.aClass14_27; local9 = local9.aClass14_339) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!bd;)V")
	public void method590(@OriginalArg(1) Class32 arg0) {
		this.method587(this.aClass14_27.aClass14_339, arg0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)Z")
	public boolean method591() {
		return this.aClass14_27.aClass14_339 == this.aClass14_27;
	}
}
