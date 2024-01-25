import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public abstract class Class3_Sub3_Sub1 extends Class3_Sub3 {

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
	public final int anInt4381;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I)V")
	protected Class3_Sub3_Sub1(@OriginalArg(0) int arg0) {
		this.anInt4381 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)Z")
	public abstract boolean method3877();

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method3880();
}
