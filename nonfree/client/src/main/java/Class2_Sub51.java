import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public abstract class Class2_Sub51 extends Class2 {

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
	public int anInt10433;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V")
	private Class2_Sub51() {
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!fq;)I")
	public abstract int method8870(@OriginalArg(0) Class2_Sub11_Sub2 arg0);

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "()V")
	public abstract void method8871();
}
