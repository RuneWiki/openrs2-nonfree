import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public abstract class Class5_Sub2_Sub3 extends Class5_Sub2 {

	@OriginalMember(owner = "client!dha", name = "t", descriptor = "I")
	public final int anInt8079;

	@OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(I)V")
	protected Class5_Sub2_Sub3(@OriginalArg(0) int arg0) {
		this.anInt8079 = arg0;
	}

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method6866();

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(B)Z")
	public abstract boolean method6867();
}
