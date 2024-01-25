import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public abstract class Class2_Sub30 extends Class2 {

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
	public int anInt4894;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	private Class2_Sub30() {
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "()V")
	public abstract void method3948();

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!qc;)I")
	public abstract int method3949(@OriginalArg(0) Class2_Sub18_Sub4 arg0);
}
