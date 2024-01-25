import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public abstract class Class3_Sub35 extends Class3 {

	@OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
	public int anInt6416;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	private Class3_Sub35() {
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "()V")
	public abstract void method5182();

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!vt;)I")
	public abstract int method5183(@OriginalArg(0) Class3_Sub16_Sub4 arg0);
}
