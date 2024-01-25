import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public abstract class Class4_Sub44 extends Class4 {

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
	public int anInt7350;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V")
	private Class4_Sub44() {
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "()V")
	public abstract void method5668();

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!jl;)I")
	public abstract int method5669(@OriginalArg(0) Class4_Sub15_Sub2 arg0);
}
