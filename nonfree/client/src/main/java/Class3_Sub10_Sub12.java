import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class Class3_Sub10_Sub12 extends Class3_Sub10 {

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
	public final int anInt6769;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V")
	protected Class3_Sub10_Sub12(@OriginalArg(0) int arg0) {
		this.anInt6769 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method5671();

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)Z")
	public abstract boolean method5674();
}
