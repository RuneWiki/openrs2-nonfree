import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class41 {

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "Lclient!aq;")
	private Class16 aClass16_9;

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "Lclient!pl;")
	private Class11 aClass11_37;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V")
	public Class41() {
	}

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!aq;)V")
	public Class41(@OriginalArg(0) Class16 arg0) {
		this.aClass16_9 = arg0;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BLclient!aq;)V")
	public void method651(@OriginalArg(1) Class16 arg0) {
		this.aClass16_9 = arg0;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)Lclient!pl;")
	public Class11 method652() {
		@Pc(6) Class11 local6 = this.aClass11_37;
		if (this.aClass16_9.aClass11_9 == local6) {
			this.aClass11_37 = null;
			return null;
		} else {
			this.aClass11_37 = local6.aClass11_251;
			return local6;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Lclient!pl;")
	public Class11 method655() {
		@Pc(13) Class11 local13 = this.aClass16_9.aClass11_9.aClass11_251;
		if (this.aClass16_9.aClass11_9 == local13) {
			this.aClass11_37 = null;
			return null;
		} else {
			this.aClass11_37 = local13.aClass11_251;
			return local13;
		}
	}
}
