import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public abstract class Class5_Sub5_Sub2 extends Class5_Sub5 {

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
	public final int anInt4570;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(I)V")
	protected Class5_Sub5_Sub2(@OriginalArg(0) int arg0) {
		this.anInt4570 = arg0;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4145();

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "(I)Z")
	public abstract boolean method4147();
}
