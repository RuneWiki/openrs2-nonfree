import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public final class Class214 implements Interface19 {

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
	public final int anInt5614;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(I)V")
	public Class214(@OriginalArg(0) int arg0) {
		this.anInt5614 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)Lclient!os;")
	@Override
	public Class258 method7256() {
		return Static158.aClass258_11;
	}
}
