import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public abstract class Class3_Sub4_Sub13 extends Class3_Sub4 {

	@OriginalMember(owner = "client!jda", name = "y", descriptor = "I")
	public final int anInt9924;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(I)V")
	protected Class3_Sub4_Sub13(@OriginalArg(0) int arg0) {
		this.anInt9924 = arg0;
	}

	@OriginalMember(owner = "client!jda", name = "h", descriptor = "(I)Z")
	public abstract boolean method8057();

	@OriginalMember(owner = "client!jda", name = "i", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method8058();
}
