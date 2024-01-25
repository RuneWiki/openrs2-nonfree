import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public abstract class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
	public int anInt3006;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	private Class3_Sub18() {
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!bt;)I")
	public abstract int method2750(@OriginalArg(0) Class3_Sub9_Sub1 arg0);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "()V")
	public abstract void method2751();
}
