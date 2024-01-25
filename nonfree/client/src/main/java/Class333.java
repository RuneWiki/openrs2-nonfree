import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public final class Class333 implements Interface17 {

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	public final int anInt8454;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(I)V")
	public Class333(@OriginalArg(0) int arg0) {
		this.anInt8454 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Lclient!mh;")
	@Override
	public Class225 method7443() {
		return Static171.aClass225_10;
	}
}
