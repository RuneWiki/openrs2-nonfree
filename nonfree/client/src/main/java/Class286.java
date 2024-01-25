import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public final class Class286 implements Interface14 {

	@OriginalMember(owner = "client!pha", name = "d", descriptor = "I")
	public final int anInt7835;

	@OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(I)V")
	public Class286(@OriginalArg(0) int arg0) {
		this.anInt7835 = arg0;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(I)Lclient!c;")
	@Override
	public Class51 method9393() {
		return Static370.aClass51_19;
	}
}
