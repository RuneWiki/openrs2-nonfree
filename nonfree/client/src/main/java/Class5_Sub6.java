import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public abstract class Class5_Sub6 extends Class5 {

	@OriginalMember(owner = "client!av", name = "k", descriptor = "I")
	public int anInt502;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "()V")
	private Class5_Sub6() {
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!lq;)I")
	public abstract int method636(@OriginalArg(0) Class5_Sub15_Sub2 arg0);

	@OriginalMember(owner = "client!av", name = "a", descriptor = "()V")
	public abstract void method637();
}
