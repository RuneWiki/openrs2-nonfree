import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class271 {

	@OriginalMember(owner = "client!ow", name = "q", descriptor = "Lclient!it;")
	private Class2 aClass2_231;

	@OriginalMember(owner = "client!ow", name = "p", descriptor = "Lclient!it;")
	public final Class2 aClass2_230 = new Class2();

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "()V")
	public Class271() {
		this.aClass2_230.aClass2_337 = this.aClass2_230;
		this.aClass2_230.aClass2_338 = this.aClass2_230;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(BLclient!it;Lclient!ow;)V")
	private void method7168(@OriginalArg(1) Class2 arg0, @OriginalArg(2) Class271 arg1) {
		@Pc(7) Class2 local7 = this.aClass2_230.aClass2_337;
		this.aClass2_230.aClass2_337 = arg0.aClass2_337;
		arg0.aClass2_337.aClass2_338 = this.aClass2_230;
		if (this.aClass2_230 != arg0) {
			arg0.aClass2_337 = arg1.aClass2_230.aClass2_337;
			arg0.aClass2_337.aClass2_338 = arg0;
			arg1.aClass2_230.aClass2_337 = local7;
			local7.aClass2_338 = arg1.aClass2_230;
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)Z")
	public boolean method7169() {
		return this.aClass2_230 == this.aClass2_230.aClass2_338;
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(B)Lclient!it;")
	public Class2 method7170() {
		@Pc(7) Class2 local7 = this.aClass2_230.aClass2_337;
		if (local7 == this.aClass2_230) {
			this.aClass2_231 = null;
			return null;
		} else {
			this.aClass2_231 = local7.aClass2_337;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!it;B)V")
	public void method7171(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_337 != null) {
			arg0.method9825();
		}
		arg0.aClass2_338 = this.aClass2_230.aClass2_338;
		arg0.aClass2_337 = this.aClass2_230;
		arg0.aClass2_337.aClass2_338 = arg0;
		arg0.aClass2_338.aClass2_337 = arg0;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)Lclient!it;")
	public Class2 method7172() {
		@Pc(13) Class2 local13 = this.aClass2_230.aClass2_338;
		if (this.aClass2_230 == local13) {
			return null;
		} else {
			local13.method9825();
			return local13;
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(BLclient!it;)V")
	public void method7174(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_337 != null) {
			arg0.method9825();
		}
		arg0.aClass2_338 = this.aClass2_230;
		arg0.aClass2_337 = this.aClass2_230.aClass2_337;
		arg0.aClass2_337.aClass2_338 = arg0;
		arg0.aClass2_338.aClass2_337 = arg0;
	}

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "(B)Lclient!it;")
	public Class2 method7175() {
		@Pc(6) Class2 local6 = this.aClass2_231;
		if (local6 == this.aClass2_230) {
			this.aClass2_231 = null;
			return null;
		} else {
			this.aClass2_231 = local6.aClass2_338;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "(B)Lclient!it;")
	public Class2 method7177() {
		@Pc(7) Class2 local7 = this.aClass2_230.aClass2_338;
		if (local7 == this.aClass2_230) {
			this.aClass2_231 = null;
			return null;
		} else {
			this.aClass2_231 = local7.aClass2_338;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(I)I")
	public int method7178() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class2 local16 = this.aClass2_230.aClass2_338; local16 != this.aClass2_230; local16 = local16.aClass2_338) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ow", name = "c", descriptor = "(I)Lclient!it;")
	public Class2 method7179() {
		@Pc(12) Class2 local12 = this.aClass2_231;
		if (this.aClass2_230 == local12) {
			this.aClass2_231 = null;
			return null;
		} else {
			this.aClass2_231 = local12.aClass2_337;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!ow;Z)V")
	public void method7180(@OriginalArg(0) Class271 arg0) {
		this.method7168(this.aClass2_230.aClass2_338, arg0);
	}

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "(I)V")
	public void method7181() {
		while (true) {
			@Pc(19) Class2 local19 = this.aClass2_230.aClass2_338;
			if (this.aClass2_230 == local19) {
				this.aClass2_231 = null;
				return;
			}
			local19.method9825();
		}
	}
}
