import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class Class6_Sub34 extends Class6 {

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
	public int anInt6124;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	private Class6_Sub34() {
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!jf;)I")
	public abstract int method5514(@OriginalArg(0) Class6_Sub17_Sub3 arg0);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
	public abstract void method5515();
}
