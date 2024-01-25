import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public final class Class297 implements Interface4 {

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
	public final int anInt8414;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(I)V")
	public Class297(@OriginalArg(0) int arg0) {
		this.anInt8414 = arg0;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Lclient!jw;")
	@Override
	public Class184 method7078() {
		return Static19.aClass184_5;
	}
}
