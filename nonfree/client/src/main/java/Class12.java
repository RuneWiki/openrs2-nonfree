import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class12 {

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "Lclient!se;")
	private Class2 aClass2_36;

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "Lclient!se;")
	public final Class2 aClass2_35 = new Class2();

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public Class12() {
		this.aClass2_35.aClass2_208 = this.aClass2_35;
		this.aClass2_35.aClass2_207 = this.aClass2_35;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lclient!se;")
	public Class2 method377() {
		@Pc(6) Class2 local6 = this.aClass2_36;
		if (local6 == this.aClass2_35) {
			this.aClass2_36 = null;
			return null;
		} else {
			this.aClass2_36 = local6.aClass2_208;
			return local6;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!se;Lclient!se;)V")
	public void method378(@OriginalArg(1) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_208 != null) {
			arg1.method2705();
		}
		arg1.aClass2_207 = arg0;
		arg1.aClass2_208 = arg0.aClass2_208;
		arg1.aClass2_208.aClass2_207 = arg1;
		arg1.aClass2_207.aClass2_208 = arg1;
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)Lclient!se;")
	public Class2 method380() {
		@Pc(7) Class2 local7 = this.aClass2_35.aClass2_208;
		if (local7 == this.aClass2_35) {
			this.aClass2_36 = null;
			return null;
		} else {
			this.aClass2_36 = local7.aClass2_208;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Lclient!se;")
	public Class2 method381() {
		@Pc(7) Class2 local7 = this.aClass2_36;
		if (this.aClass2_35 == local7) {
			this.aClass2_36 = null;
			return null;
		} else {
			this.aClass2_36 = local7.aClass2_207;
			return local7;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!se;I)V")
	public void method382(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_208 != null) {
			arg0.method2705();
		}
		arg0.aClass2_207 = this.aClass2_35;
		arg0.aClass2_208 = this.aClass2_35.aClass2_208;
		arg0.aClass2_208.aClass2_207 = arg0;
		arg0.aClass2_207.aClass2_208 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)Lclient!se;")
	public Class2 method384() {
		@Pc(12) Class2 local12 = this.aClass2_35.aClass2_207;
		if (this.aClass2_35 == local12) {
			this.aClass2_36 = null;
			return null;
		} else {
			this.aClass2_36 = local12.aClass2_207;
			return local12;
		}
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)Lclient!se;")
	public Class2 method385() {
		@Pc(3) Class2 local3 = this.aClass2_35.aClass2_207;
		if (this.aClass2_35 == local3) {
			return null;
		} else {
			local3.method2705();
			return local3;
		}
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(B)V")
	public void method386() {
		while (true) {
			@Pc(13) Class2 local13 = this.aClass2_35.aClass2_207;
			if (local13 == this.aClass2_35) {
				return;
			}
			local13.method2705();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!se;)V")
	public void method388(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_208 != null) {
			arg0.method2705();
		}
		arg0.aClass2_207 = this.aClass2_35.aClass2_207;
		arg0.aClass2_208 = this.aClass2_35;
		arg0.aClass2_208.aClass2_207 = arg0;
		arg0.aClass2_207.aClass2_208 = arg0;
	}
}
