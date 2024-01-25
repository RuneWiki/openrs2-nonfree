import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class Class6_Sub1_Sub4 extends Class6_Sub1 {

	@OriginalMember(owner = "client!be", name = "y", descriptor = "I")
	public final int anInt4674;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I)V")
	protected Class6_Sub1_Sub4(@OriginalArg(0) int arg0) {
		this.anInt4674 = arg0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4027();

	@OriginalMember(owner = "client!be", name = "g", descriptor = "(I)Z")
	public abstract boolean method4029();
}
