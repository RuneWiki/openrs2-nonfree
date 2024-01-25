import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public abstract class Class4_Sub5_Sub5 extends Class4_Sub5 {

	@OriginalMember(owner = "client!tca", name = "v", descriptor = "I")
	public final int anInt3411;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(I)V")
	protected Class4_Sub5_Sub5(@OriginalArg(0) int arg0) {
		this.anInt3411 = arg0;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Z)Z")
	public abstract boolean method3027();

	@OriginalMember(owner = "client!tca", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method3029();
}
