import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class63 {

	@OriginalMember(owner = "client!em", name = "e", descriptor = "Lclient!vu;")
	private Class4 aClass4_70;

	@OriginalMember(owner = "client!em", name = "f", descriptor = "Lclient!pk;")
	private Class183 aClass183_5;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
	public Class63() {
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!pk;)V")
	public Class63(@OriginalArg(0) Class183 arg0) {
		this.aClass183_5 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)Lclient!vu;")
	public Class4 method1611() {
		@Pc(13) Class4 local13 = this.aClass183_5.aClass4_207.aClass4_262;
		if (local13 == this.aClass183_5.aClass4_207) {
			this.aClass4_70 = null;
			return null;
		} else {
			this.aClass4_70 = local13.aClass4_262;
			return local13;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(B)Lclient!vu;")
	public Class4 method1612() {
		@Pc(12) Class4 local12 = this.aClass4_70;
		if (this.aClass183_5.aClass4_207 == local12) {
			this.aClass4_70 = null;
			return null;
		} else {
			this.aClass4_70 = local12.aClass4_262;
			return local12;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!pk;I)V")
	public void method1615(@OriginalArg(0) Class183 arg0) {
		this.aClass183_5 = arg0;
	}
}
