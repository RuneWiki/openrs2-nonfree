import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class151 implements Interface11 {

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "Z")
	private boolean aBoolean334;

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "Ljava/lang/String;")
	private final String aString33;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class151(@OriginalArg(0) String arg0) {
		this.aString33 = arg0;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)Lclient!cca;")
	@Override
	public Class44 method8096() {
		return Static61.aClass44_4;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)I")
	@Override
	public int method8097() {
		@Pc(15) int local15 = Static188.method3052(this.aString33);
		if (local15 >= 0 && local15 <= 100) {
			return local15;
		} else {
			this.aBoolean334 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)Z")
	public boolean method3858() {
		return this.aBoolean334;
	}
}
