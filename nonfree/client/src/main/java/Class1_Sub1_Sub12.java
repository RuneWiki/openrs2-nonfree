import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public abstract class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ns", name = "y", descriptor = "I")
	public final int anInt5473;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(I)V")
	protected Class1_Sub1_Sub12(@OriginalArg(0) int arg0) {
		this.anInt5473 = arg0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4222();

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)Z")
	public abstract boolean method4225();
}
