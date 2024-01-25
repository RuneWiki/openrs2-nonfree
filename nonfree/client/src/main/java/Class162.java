import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public final class Class162 implements Interface2 {

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
	public final int anInt5464;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(I)V")
	public Class162(@OriginalArg(0) int arg0) {
		this.anInt5464 = arg0;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)Lclient!ad;")
	@Override
	public Class6 method9087() {
		return Static505.aClass6_11;
	}
}
