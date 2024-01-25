import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class12 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "Lclient!fr;")
	private Class85 aClass85_3;

	@OriginalMember(owner = "client!am", name = "i", descriptor = "Lclient!ea;")
	private Class7 aClass7_7;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
	public Class12() {
	}

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!fr;)V")
	public Class12(@OriginalArg(0) Class85 arg0) {
		this.aClass85_3 = arg0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)Lclient!ea;")
	public Class7 method95() {
		@Pc(11) Class7 local11 = this.aClass7_7;
		if (this.aClass85_3.aClass7_81 == local11) {
			this.aClass7_7 = null;
			return null;
		} else {
			this.aClass7_7 = local11.aClass7_262;
			return local11;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!fr;B)V")
	public void method96(@OriginalArg(0) Class85 arg0) {
		this.aClass85_3 = arg0;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(B)Lclient!ea;")
	public Class7 method97() {
		@Pc(8) Class7 local8 = this.aClass85_3.aClass7_81.aClass7_262;
		if (local8 == this.aClass85_3.aClass7_81) {
			this.aClass7_7 = null;
			return null;
		} else {
			this.aClass7_7 = local8.aClass7_262;
			return local8;
		}
	}
}
