import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public final class Class32 implements Interface16 {

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
	public final int anInt1003;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(I)V")
	public Class32(@OriginalArg(0) int arg0) {
		this.anInt1003 = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)Lclient!jd;")
	@Override
	public Class153 method6332() {
		return Static96.aClass153_5;
	}
}
