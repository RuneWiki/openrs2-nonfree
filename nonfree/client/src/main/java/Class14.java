import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public final class Class14 implements Interface11 {

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "Lclient!uu;")
	private final Class343 aClass343_16;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!uu;)V")
	public Class14(@OriginalArg(0) Class343 arg0) {
		this.aClass343_16 = arg0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)I")
	@Override
	public int method8097() {
		return this.aClass343_16.method8151() ? 100 : this.aClass343_16.method8161();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Lclient!cca;")
	@Override
	public Class44 method8096() {
		return Static61.aClass44_1;
	}
}
