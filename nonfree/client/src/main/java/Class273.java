import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class273 implements Interface4 {

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
	public final int anInt7273;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(I)V")
	public Class273(@OriginalArg(0) int arg0) {
		this.anInt7273 = arg0;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)Lclient!oh;")
	@Override
	public Class252 method6715() {
		return Static284.aClass252_17;
	}
}
