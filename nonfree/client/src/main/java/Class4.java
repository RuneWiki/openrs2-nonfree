import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class Class4 {

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "Lclient!vu;")
	public Class4 aClass4_261;

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "J")
	public long aLong224;

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "Lclient!vu;")
	public Class4 aClass4_262;

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)Z")
	public final boolean method5683() {
		return this.aClass4_261 != null;
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)V")
	public final void method5684() {
		if (this.aClass4_261 != null) {
			this.aClass4_261.aClass4_262 = this.aClass4_262;
			this.aClass4_262.aClass4_261 = this.aClass4_261;
			this.aClass4_262 = null;
			this.aClass4_261 = null;
		}
	}
}
