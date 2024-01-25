import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public abstract class Class1_Sub1_Sub16 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
	public final int anInt8985;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(I)V")
	protected Class1_Sub1_Sub16(@OriginalArg(0) int arg0) {
		this.anInt8985 = arg0;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)Z")
	public abstract boolean method7389();

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method7391();
}
