import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public abstract class Class8_Sub5_Sub1 extends Class8_Sub5 {

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
	public final int anInt9287;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(I)V")
	protected Class8_Sub5_Sub1(@OriginalArg(0) int arg0) {
		this.anInt9287 = arg0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)Z")
	public abstract boolean method7577();

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method7578();
}
