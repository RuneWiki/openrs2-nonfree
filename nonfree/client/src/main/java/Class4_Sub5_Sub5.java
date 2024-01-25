import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class Class4_Sub5_Sub5 extends Class4_Sub5 {

	@OriginalMember(owner = "client!le", name = "z", descriptor = "I")
	public final int anInt10631;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I)V")
	protected Class4_Sub5_Sub5(@OriginalArg(0) int arg0) {
		this.anInt10631 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(B)Z")
	public abstract boolean method8996();

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method8998();
}
