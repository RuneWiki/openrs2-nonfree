import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class75 implements Interface4 {

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	public final int anInt1813;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(I)V")
	public Class75(@OriginalArg(0) int arg0) {
		this.anInt1813 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lclient!oh;")
	@Override
	public Class252 method6715() {
		return Static67.aClass252_5;
	}
}
