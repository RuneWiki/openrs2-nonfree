import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class Class219 implements Interface17 {

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "Lclient!eq;")
	private final Class97 aClass97_92;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!eq;)V")
	public Class219(@OriginalArg(0) Class97 arg0) {
		this.aClass97_92 = arg0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)Lclient!qfa;")
	@Override
	public Class276 method5453() {
		return Static457.aClass276_1;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)I")
	@Override
	public int method5454() {
		return this.aClass97_92.method2553() ? 100 : this.aClass97_92.method2554();
	}
}
