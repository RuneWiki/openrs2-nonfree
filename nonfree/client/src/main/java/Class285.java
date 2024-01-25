import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public final class Class285 implements Interface16 {

	@OriginalMember(owner = "client!re", name = "h", descriptor = "I")
	public final int anInt7740;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(I)V")
	public Class285(@OriginalArg(0) int arg0) {
		this.anInt7740 = arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Lclient!jd;")
	@Override
	public Class153 method6332() {
		return Static30.aClass153_3;
	}
}
