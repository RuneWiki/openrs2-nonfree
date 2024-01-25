import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public final class Class129 implements Interface15 {

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "I")
	public final int anInt3685;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(I)V")
	public Class129(@OriginalArg(0) int arg0) {
		this.anInt3685 = arg0;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)Lclient!uu;")
	@Override
	public Class369 method8734() {
		return Static141.aClass369_11;
	}
}
