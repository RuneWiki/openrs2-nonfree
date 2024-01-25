import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class162 {

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "Lclient!dm;")
	private Class73 aClass73_40;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "Lclient!ik;")
	private Class12 aClass12_136;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
	public Class162() {
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!dm;)V")
	public Class162(@OriginalArg(0) Class73 arg0) {
		this.aClass73_40 = arg0;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLclient!dm;)V")
	public void method4144(@OriginalArg(1) Class73 arg0) {
		this.aClass73_40 = arg0;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)Lclient!ik;")
	public Class12 method4145() {
		@Pc(16) Class12 local16 = this.aClass73_40.aClass12_47.aClass12_283;
		if (this.aClass73_40.aClass12_47 == local16) {
			this.aClass12_136 = null;
			return null;
		} else {
			this.aClass12_136 = local16.aClass12_283;
			return local16;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)Lclient!ik;")
	public Class12 method4147() {
		@Pc(12) Class12 local12 = this.aClass12_136;
		if (this.aClass73_40.aClass12_47 == local12) {
			this.aClass12_136 = null;
			return null;
		} else {
			this.aClass12_136 = local12.aClass12_283;
			return local12;
		}
	}
}
