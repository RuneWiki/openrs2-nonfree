import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class18 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Lclient!vg;")
	private Class4 aClass4_23;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Lclient!vr;")
	private Class258 aClass258_3;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	public Class18() {
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!vr;)V")
	public Class18(@OriginalArg(0) Class258 arg0) {
		this.aClass258_3 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Lclient!vg;")
	public Class4 method524() {
		@Pc(15) Class4 local15 = this.aClass258_3.aClass4_240.aClass4_261;
		if (local15 == this.aClass258_3.aClass4_240) {
			this.aClass4_23 = null;
			return null;
		} else {
			this.aClass4_23 = local15.aClass4_261;
			return local15;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLclient!vr;)V")
	public void method525(@OriginalArg(1) Class258 arg0) {
		this.aClass258_3 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)Lclient!vg;")
	public Class4 method526() {
		@Pc(6) Class4 local6 = this.aClass4_23;
		if (this.aClass258_3.aClass4_240 == local6) {
			this.aClass4_23 = null;
			return null;
		} else {
			this.aClass4_23 = local6.aClass4_261;
			return local6;
		}
	}
}
