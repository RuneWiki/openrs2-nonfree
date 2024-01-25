import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class307 {

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "Lclient!bq;")
	private Class43 aClass43_56;

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "Lclient!mc;")
	private Class8 aClass8_242;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class307() {
	}

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!bq;)V")
	public Class307(@OriginalArg(0) Class43 arg0) {
		this.aClass43_56 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!bq;I)V")
	public void method7371(@OriginalArg(0) Class43 arg0) {
		this.aClass43_56 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Lclient!mc;")
	public Class8 method7373() {
		@Pc(8) Class8 local8 = this.aClass43_56.aClass8_37.aClass8_300;
		if (local8 == this.aClass43_56.aClass8_37) {
			this.aClass8_242 = null;
			return null;
		} else {
			this.aClass8_242 = local8.aClass8_300;
			return local8;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)Lclient!mc;")
	public Class8 method7375() {
		@Pc(6) Class8 local6 = this.aClass8_242;
		if (this.aClass43_56.aClass8_37 == local6) {
			this.aClass8_242 = null;
			return null;
		} else {
			this.aClass8_242 = local6.aClass8_300;
			return local6;
		}
	}
}
