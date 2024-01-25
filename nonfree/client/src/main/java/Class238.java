import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class238 {

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "Lclient!pt;")
	private Class2 aClass2_226;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "Lclient!pt;")
	public final Class2 aClass2_225 = new Class2();

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	public Class238() {
		this.aClass2_225.aClass2_244 = this.aClass2_225;
		this.aClass2_225.aClass2_243 = this.aClass2_225;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!vf;Lclient!pt;B)V")
	private void method5794(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class2 arg1) {
		@Pc(15) Class2 local15 = this.aClass2_225.aClass2_243;
		this.aClass2_225.aClass2_243 = arg1.aClass2_243;
		arg1.aClass2_243.aClass2_244 = this.aClass2_225;
		if (this.aClass2_225 != arg1) {
			arg1.aClass2_243 = arg0.aClass2_225.aClass2_243;
			arg1.aClass2_243.aClass2_244 = arg1;
			local15.aClass2_244 = arg0.aClass2_225;
			arg0.aClass2_225.aClass2_243 = local15;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)Lclient!pt;")
	public Class2 method5795() {
		@Pc(12) Class2 local12 = this.aClass2_225.aClass2_244;
		if (this.aClass2_225 == local12) {
			this.aClass2_226 = null;
			return null;
		} else {
			this.aClass2_226 = local12.aClass2_244;
			return local12;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!pt;I)V")
	public void method5796(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_243 != null) {
			arg0.method6130();
		}
		arg0.aClass2_244 = this.aClass2_225;
		arg0.aClass2_243 = this.aClass2_225.aClass2_243;
		arg0.aClass2_243.aClass2_244 = arg0;
		arg0.aClass2_244.aClass2_243 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)I")
	public int method5797() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class2 local11 = this.aClass2_225.aClass2_244; local11 != this.aClass2_225; local11 = local11.aClass2_244) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Lclient!pt;")
	public Class2 method5798() {
		@Pc(14) Class2 local14 = this.aClass2_226;
		if (this.aClass2_225 == local14) {
			this.aClass2_226 = null;
			return null;
		} else {
			this.aClass2_226 = local14.aClass2_243;
			return local14;
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)Lclient!pt;")
	public Class2 method5799() {
		@Pc(11) Class2 local11 = this.aClass2_226;
		if (this.aClass2_225 == local11) {
			this.aClass2_226 = null;
			return null;
		} else {
			this.aClass2_226 = local11.aClass2_244;
			return local11;
		}
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)Lclient!pt;")
	public Class2 method5800() {
		@Pc(13) Class2 local13 = this.aClass2_225.aClass2_243;
		if (local13 == this.aClass2_225) {
			this.aClass2_226 = null;
			return null;
		} else {
			this.aClass2_226 = local13.aClass2_243;
			return local13;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!vf;)V")
	public void method5802(@OriginalArg(1) Class238 arg0) {
		this.method5794(arg0, this.aClass2_225.aClass2_244);
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)Lclient!pt;")
	public Class2 method5803() {
		@Pc(7) Class2 local7 = this.aClass2_225.aClass2_244;
		if (this.aClass2_225 == local7) {
			return null;
		} else {
			local7.method6130();
			return local7;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!pt;)V")
	public void method5804(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_243 != null) {
			arg0.method6130();
		}
		arg0.aClass2_243 = this.aClass2_225;
		arg0.aClass2_244 = this.aClass2_225.aClass2_244;
		arg0.aClass2_243.aClass2_244 = arg0;
		arg0.aClass2_244.aClass2_243 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)Z")
	public boolean method5805() {
		return this.aClass2_225.aClass2_244 == this.aClass2_225;
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
	public void method5806() {
		while (true) {
			@Pc(5) Class2 local5 = this.aClass2_225.aClass2_244;
			if (local5 == this.aClass2_225) {
				this.aClass2_226 = null;
				return;
			}
			local5.method6130();
		}
	}
}
