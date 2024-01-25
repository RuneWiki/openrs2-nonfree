import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class Class5_Sub4_Sub4 extends Class5_Sub4 {

	@OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
	public final int anInt4810;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(I)V")
	protected Class5_Sub4_Sub4(@OriginalArg(0) int arg0) {
		this.anInt4810 = arg0;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4398();

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)Z")
	public abstract boolean method4399();
}
