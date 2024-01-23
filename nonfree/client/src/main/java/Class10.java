import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class10 {

	@OriginalMember(owner = "client!an", name = "w", descriptor = "Lclient!si;")
	private Class4 aClass4_18;

	@OriginalMember(owner = "client!an", name = "c", descriptor = "Lclient!si;")
	public Class4 aClass4_17 = new Class4();

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
	public Class10() {
		this.aClass4_17.aClass4_230 = this.aClass4_17;
		this.aClass4_17.aClass4_231 = this.aClass4_17;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)Lclient!si;")
	public Class4 method180() {
		@Pc(2) Class4 local2 = this.aClass4_18;
		if (this.aClass4_17 == local2) {
			this.aClass4_18 = null;
			return null;
		} else {
			this.aClass4_18 = local2.aClass4_230;
			return local2;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)Lclient!si;")
	public Class4 method182() {
		@Pc(7) Class4 local7 = this.aClass4_17.aClass4_231;
		if (local7 == this.aClass4_17) {
			return null;
		} else {
			local7.method4391();
			return local7;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!si;B)V")
	public void method184(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_230 != null) {
			arg0.method4391();
		}
		arg0.aClass4_231 = this.aClass4_17;
		arg0.aClass4_230 = this.aClass4_17.aClass4_230;
		arg0.aClass4_230.aClass4_231 = arg0;
		arg0.aClass4_231.aClass4_230 = arg0;
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(B)Z")
	public boolean method185() {
		return this.aClass4_17.aClass4_231 == this.aClass4_17;
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(I)Lclient!si;")
	public Class4 method187() {
		@Pc(11) Class4 local11 = this.aClass4_17.aClass4_230;
		if (local11 == this.aClass4_17) {
			this.aClass4_18 = null;
			return null;
		} else {
			this.aClass4_18 = local11.aClass4_230;
			return local11;
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(Lclient!si;B)V")
	public void method189(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_230 != null) {
			arg0.method4391();
		}
		arg0.aClass4_230 = this.aClass4_17;
		arg0.aClass4_231 = this.aClass4_17.aClass4_231;
		arg0.aClass4_230.aClass4_231 = arg0;
		arg0.aClass4_231.aClass4_230 = arg0;
	}

	@OriginalMember(owner = "client!an", name = "c", descriptor = "(B)Lclient!si;")
	public Class4 method190() {
		@Pc(3) Class4 local3 = this.aClass4_17.aClass4_231;
		if (local3 == this.aClass4_17) {
			this.aClass4_18 = null;
			return null;
		} else {
			this.aClass4_18 = local3.aClass4_231;
			return local3;
		}
	}

	@OriginalMember(owner = "client!an", name = "d", descriptor = "(I)Lclient!si;")
	public Class4 method191() {
		@Pc(13) Class4 local13 = this.aClass4_18;
		if (this.aClass4_17 == local13) {
			this.aClass4_18 = null;
			return null;
		} else {
			this.aClass4_18 = local13.aClass4_231;
			return local13;
		}
	}

	@OriginalMember(owner = "client!an", name = "e", descriptor = "(I)V")
	public void method192() {
		while (true) {
			@Pc(15) Class4 local15 = this.aClass4_17.aClass4_231;
			if (this.aClass4_17 == local15) {
				this.aClass4_18 = null;
				return;
			}
			local15.method4391();
		}
	}
}
