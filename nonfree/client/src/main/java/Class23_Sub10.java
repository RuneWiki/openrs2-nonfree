import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public final class Class23_Sub10 extends Class23 {

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "I")
	public final int anInt9842;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(I)V")
	public Class23_Sub10(@OriginalArg(0) int arg0) {
		this.anInt9842 = arg0;
	}
}
