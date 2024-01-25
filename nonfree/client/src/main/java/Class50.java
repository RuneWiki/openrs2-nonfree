import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public final class Class50 implements Interface10 {

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
	public final int anInt954;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(I)V")
	public Class50(@OriginalArg(0) int arg0) {
		this.anInt954 = arg0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)Lclient!jv;")
	@Override
	public Class165 method7847() {
		return Static91.aClass165_13;
	}
}
