import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class24 {

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "Lclient!mg;")
	private Class1 aClass1_28;

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "Lclient!mg;")
	public Class1 aClass1_27 = new Class1();

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "()V")
	public Class24() {
		this.aClass1_27.aClass1_232 = this.aClass1_27;
		this.aClass1_27.aClass1_233 = this.aClass1_27;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)Lclient!mg;")
	public Class1 method460() {
		@Pc(3) Class1 local3 = this.aClass1_27.aClass1_233;
		if (this.aClass1_27 == local3) {
			this.aClass1_28 = null;
			return null;
		} else {
			this.aClass1_28 = local3.aClass1_233;
			return local3;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)Lclient!mg;")
	public Class1 method461() {
		@Pc(7) Class1 local7 = this.aClass1_27.aClass1_232;
		if (this.aClass1_27 == local7) {
			this.aClass1_28 = null;
			return null;
		} else {
			this.aClass1_28 = local7.aClass1_232;
			return local7;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	public void method462() {
		while (true) {
			@Pc(5) Class1 local5 = this.aClass1_27.aClass1_233;
			if (local5 == this.aClass1_27) {
				this.aClass1_28 = null;
				return;
			}
			local5.method4616();
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)Lclient!mg;")
	public Class1 method464() {
		@Pc(6) Class1 local6 = this.aClass1_28;
		if (this.aClass1_27 == local6) {
			this.aClass1_28 = null;
			return null;
		} else {
			this.aClass1_28 = local6.aClass1_233;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!mg;B)V")
	public void method466(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_232 != null) {
			arg0.method4616();
		}
		arg0.aClass1_233 = this.aClass1_27.aClass1_233;
		arg0.aClass1_232 = this.aClass1_27;
		arg0.aClass1_232.aClass1_233 = arg0;
		arg0.aClass1_233.aClass1_232 = arg0;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)Lclient!mg;")
	public Class1 method469() {
		@Pc(7) Class1 local7 = this.aClass1_27.aClass1_233;
		if (local7 == this.aClass1_27) {
			return null;
		} else {
			local7.method4616();
			return local7;
		}
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)Lclient!mg;")
	public Class1 method471() {
		@Pc(11) Class1 local11 = this.aClass1_28;
		if (this.aClass1_27 == local11) {
			this.aClass1_28 = null;
			return null;
		} else {
			this.aClass1_28 = local11.aClass1_232;
			return local11;
		}
	}

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)Z")
	public boolean method472() {
		return this.aClass1_27 == this.aClass1_27.aClass1_233;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!mg;I)V")
	public void method473(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_232 != null) {
			arg0.method4616();
		}
		arg0.aClass1_233 = this.aClass1_27;
		arg0.aClass1_232 = this.aClass1_27.aClass1_232;
		arg0.aClass1_232.aClass1_233 = arg0;
		arg0.aClass1_233.aClass1_232 = arg0;
	}
}
