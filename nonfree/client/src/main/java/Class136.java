import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public final class Class136 implements Interface17 {

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
	public final int anInt3334;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(I)V")
	public Class136(@OriginalArg(0) int arg0) {
		this.anInt3334 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)Lclient!hfa;")
	@Override
	public Class152 method9627() {
		return Static199.aClass152_2;
	}
}
