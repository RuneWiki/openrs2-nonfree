import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class47 {

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "Lclient!fca;")
	private Class114 aClass114_7;

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "Lclient!ko;")
	private Class5 aClass5_41;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V")
	public Class47() {
	}

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!fca;)V")
	public Class47(@OriginalArg(0) Class114 arg0) {
		this.aClass114_7 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)Lclient!ko;")
	public Class5 method746() {
		@Pc(6) Class5 local6 = this.aClass5_41;
		if (this.aClass114_7.aClass5_84 == local6) {
			this.aClass5_41 = null;
			return null;
		} else {
			this.aClass5_41 = local6.aClass5_338;
			return local6;
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILclient!fca;)V")
	public void method748(@OriginalArg(1) Class114 arg0) {
		this.aClass114_7 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)Lclient!ko;")
	public Class5 method749() {
		@Pc(15) Class5 local15 = this.aClass114_7.aClass5_84.aClass5_338;
		if (local15 == this.aClass114_7.aClass5_84) {
			this.aClass5_41 = null;
			return null;
		} else {
			this.aClass5_41 = local15.aClass5_338;
			return local15;
		}
	}
}
