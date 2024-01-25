import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class Class5_Sub1_Sub9 extends Class5_Sub1 {

	@OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
	public final int anInt6251;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(I)V")
	protected Class5_Sub1_Sub9(@OriginalArg(0) int arg0) {
		this.anInt6251 = arg0;
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5526();

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)Z")
	public abstract boolean method5528();
}
