import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public abstract class Class14_Sub2_Sub1 extends Class14_Sub2 {

	@OriginalMember(owner = "client!eea", name = "w", descriptor = "I")
	public final int anInt9522;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(I)V")
	protected Class14_Sub2_Sub1(@OriginalArg(0) int arg0) {
		this.anInt9522 = arg0;
	}

	@OriginalMember(owner = "client!eea", name = "g", descriptor = "(I)Z")
	public abstract boolean method8224();

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method8225();
}
