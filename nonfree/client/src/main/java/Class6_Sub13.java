import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public abstract class Class6_Sub13 extends Class6 {

	@OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
	public int anInt2010;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	private Class6_Sub13() {
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!gq;)I")
	public abstract int method1856(@OriginalArg(0) Class6_Sub5_Sub2 arg0);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "()V")
	public abstract void method1857();
}
