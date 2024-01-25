import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public abstract class Class6_Sub5_Sub11 extends Class6_Sub5 {

	@OriginalMember(owner = "client!um", name = "y", descriptor = "I")
	public final int anInt9811;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(I)V")
	protected Class6_Sub5_Sub11(@OriginalArg(0) int arg0) {
		this.anInt9811 = arg0;
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method7818();

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(B)Z")
	public abstract boolean method7819();
}
