import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class32 {

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "Lclient!uj;")
	private Class2 aClass2_38;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Lclient!mg;")
	private Class156 aClass156_7;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class32() {
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!mg;)V")
	public Class32(@OriginalArg(0) Class156 arg0) {
		this.aClass156_7 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!mg;I)V")
	public void method666(@OriginalArg(0) Class156 arg0) {
		this.aClass156_7 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)Lclient!uj;")
	public Class2 method667() {
		@Pc(13) Class2 local13 = this.aClass2_38;
		if (this.aClass156_7.aClass2_159 == local13) {
			this.aClass2_38 = null;
			return null;
		} else {
			this.aClass2_38 = local13.aClass2_264;
			return local13;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)Lclient!uj;")
	public Class2 method668() {
		@Pc(13) Class2 local13 = this.aClass156_7.aClass2_159.aClass2_264;
		if (local13 == this.aClass156_7.aClass2_159) {
			this.aClass2_38 = null;
			return null;
		} else {
			this.aClass2_38 = local13.aClass2_264;
			return local13;
		}
	}
}
