import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class23 {

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "Lclient!mb;")
	private Class3 aClass3_50;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "Lclient!mb;")
	public final Class3 aClass3_49 = new Class3();

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	public Class23() {
		this.aClass3_49.aClass3_208 = this.aClass3_49;
		this.aClass3_49.aClass3_207 = this.aClass3_49;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!mb;B)V")
	public void method850(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_208 != null) {
			arg0.method3167();
		}
		arg0.aClass3_208 = this.aClass3_49.aClass3_208;
		arg0.aClass3_207 = this.aClass3_49;
		arg0.aClass3_208.aClass3_207 = arg0;
		arg0.aClass3_207.aClass3_208 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)Lclient!mb;")
	public Class3 method853() {
		@Pc(6) Class3 local6 = this.aClass3_50;
		if (local6 == this.aClass3_49) {
			this.aClass3_50 = null;
			return null;
		} else {
			this.aClass3_50 = local6.aClass3_208;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)Lclient!mb;")
	public Class3 method855() {
		@Pc(8) Class3 local8 = this.aClass3_49.aClass3_207;
		if (this.aClass3_49 == local8) {
			return null;
		} else {
			local8.method3167();
			return local8;
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Lclient!mb;")
	public Class3 method857() {
		@Pc(8) Class3 local8 = this.aClass3_49.aClass3_208;
		if (this.aClass3_49 == local8) {
			this.aClass3_50 = null;
			return null;
		} else {
			this.aClass3_50 = local8.aClass3_208;
			return local8;
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Lclient!mb;")
	public Class3 method858() {
		@Pc(3) Class3 local3 = this.aClass3_49.aClass3_207;
		if (local3 == this.aClass3_49) {
			this.aClass3_50 = null;
			return null;
		} else {
			this.aClass3_50 = local3.aClass3_207;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!mb;)V")
	public void method859(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_208 != null) {
			arg0.method3167();
		}
		arg0.aClass3_208 = this.aClass3_49;
		arg0.aClass3_207 = this.aClass3_49.aClass3_207;
		arg0.aClass3_208.aClass3_207 = arg0;
		arg0.aClass3_207.aClass3_208 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)Lclient!mb;")
	public Class3 method861() {
		@Pc(11) Class3 local11 = this.aClass3_50;
		if (this.aClass3_49 == local11) {
			this.aClass3_50 = null;
			return null;
		} else {
			this.aClass3_50 = local11.aClass3_207;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!mb;ILclient!mb;)V")
	public void method862(@OriginalArg(0) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		if (arg1.aClass3_208 != null) {
			arg1.method3167();
		}
		arg1.aClass3_207 = arg0;
		arg1.aClass3_208 = arg0.aClass3_208;
		arg1.aClass3_208.aClass3_207 = arg1;
		arg1.aClass3_207.aClass3_208 = arg1;
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
	public void method863() {
		while (true) {
			@Pc(11) Class3 local11 = this.aClass3_49.aClass3_207;
			if (local11 == this.aClass3_49) {
				return;
			}
			local11.method3167();
		}
	}
}
