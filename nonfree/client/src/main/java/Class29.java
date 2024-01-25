import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class29 {

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "Lclient!vi;")
	private Class5 aClass5_33;

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "Lclient!jm;")
	private Class103 aClass103_19;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public Class29() {
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!jm;)V")
	public Class29(@OriginalArg(0) Class103 arg0) {
		this.aClass103_19 = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZLclient!jm;)V")
	public void method571(@OriginalArg(1) Class103 arg0) {
		this.aClass103_19 = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)Lclient!vi;")
	public Class5 method576() {
		@Pc(13) Class5 local13 = this.aClass103_19.aClass5_114.aClass5_251;
		if (local13 == this.aClass103_19.aClass5_114) {
			this.aClass5_33 = null;
			return null;
		} else {
			this.aClass5_33 = local13.aClass5_251;
			return local13;
		}
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)Lclient!vi;")
	public Class5 method577() {
		@Pc(6) Class5 local6 = this.aClass5_33;
		if (local6 == this.aClass103_19.aClass5_114) {
			this.aClass5_33 = null;
			return null;
		} else {
			this.aClass5_33 = local6.aClass5_251;
			return local6;
		}
	}
}
