import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class341 {

	@OriginalMember(owner = "client!uh", name = "t", descriptor = "Lclient!eh;")
	private Class2 aClass2_272;

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "Lclient!eh;")
	public final Class2 aClass2_271 = new Class2();

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class341() {
		this.aClass2_271.aClass2_300 = this.aClass2_271;
		this.aClass2_271.aClass2_299 = this.aClass2_271;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!uh;B)V")
	public void method8517(@OriginalArg(0) Class341 arg0) {
		this.method8518(this.aClass2_271.aClass2_299, arg0);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!eh;ZLclient!uh;)V")
	private void method8518(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class341 arg1) {
		@Pc(7) Class2 local7 = this.aClass2_271.aClass2_300;
		this.aClass2_271.aClass2_300 = arg0.aClass2_300;
		arg0.aClass2_300.aClass2_299 = this.aClass2_271;
		if (this.aClass2_271 != arg0) {
			arg0.aClass2_300 = arg1.aClass2_271.aClass2_300;
			arg0.aClass2_300.aClass2_299 = arg0;
			arg1.aClass2_271.aClass2_300 = local7;
			local7.aClass2_299 = arg1.aClass2_271;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)Lclient!eh;")
	public Class2 method8519() {
		@Pc(12) Class2 local12 = this.aClass2_272;
		if (this.aClass2_271 == local12) {
			this.aClass2_272 = null;
			return null;
		} else {
			this.aClass2_272 = local12.aClass2_299;
			return local12;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Lclient!eh;")
	public Class2 method8522() {
		@Pc(7) Class2 local7 = this.aClass2_271.aClass2_300;
		if (this.aClass2_271 == local7) {
			this.aClass2_272 = null;
			return null;
		} else {
			this.aClass2_272 = local7.aClass2_300;
			return local7;
		}
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)Lclient!eh;")
	public Class2 method8524() {
		@Pc(14) Class2 local14 = this.aClass2_271.aClass2_299;
		if (local14 == this.aClass2_271) {
			this.aClass2_272 = null;
			return null;
		} else {
			this.aClass2_272 = local14.aClass2_299;
			return local14;
		}
	}

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)V")
	public void method8525() {
		while (true) {
			@Pc(13) Class2 local13 = this.aClass2_271.aClass2_299;
			if (this.aClass2_271 == local13) {
				this.aClass2_272 = null;
				return;
			}
			local13.method9253();
		}
	}

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)Lclient!eh;")
	public Class2 method8526() {
		@Pc(12) Class2 local12 = this.aClass2_271.aClass2_299;
		if (this.aClass2_271 == local12) {
			return null;
		} else {
			local12.method9253();
			return local12;
		}
	}

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)I")
	public int method8527() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class2 local11 = this.aClass2_271.aClass2_299;
		while (local11 != this.aClass2_271) {
			local11 = local11.aClass2_299;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!eh;I)V")
	public void method8528(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_300 != null) {
			arg0.method9253();
		}
		arg0.aClass2_299 = this.aClass2_271;
		arg0.aClass2_300 = this.aClass2_271.aClass2_300;
		arg0.aClass2_300.aClass2_299 = arg0;
		arg0.aClass2_299.aClass2_300 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(Lclient!eh;I)V")
	public void method8530(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_300 != null) {
			arg0.method9253();
		}
		arg0.aClass2_300 = this.aClass2_271;
		arg0.aClass2_299 = this.aClass2_271.aClass2_299;
		arg0.aClass2_300.aClass2_299 = arg0;
		arg0.aClass2_299.aClass2_300 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)Z")
	public boolean method8531() {
		return this.aClass2_271 == this.aClass2_271.aClass2_299;
	}

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)Lclient!eh;")
	public Class2 method8532() {
		@Pc(6) Class2 local6 = this.aClass2_272;
		if (local6 == this.aClass2_271) {
			this.aClass2_272 = null;
			return null;
		} else {
			this.aClass2_272 = local6.aClass2_300;
			return local6;
		}
	}
}
