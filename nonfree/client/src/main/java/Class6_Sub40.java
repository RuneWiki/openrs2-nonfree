import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public abstract class Class6_Sub40 extends Class6 {

	@OriginalMember(owner = "client!nw", name = "j", descriptor = "I")
	public int anInt6150;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "()V")
	private Class6_Sub40() {
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!ro;)I")
	public abstract int method5220(@OriginalArg(0) Class6_Sub19_Sub3 arg0);

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "()V")
	public abstract void method5221();
}
