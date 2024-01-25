import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class Class1_Sub38 extends Class1 {

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public int anInt6012;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	private Class1_Sub38() {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
	public abstract void method5447();

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!gw;)I")
	public abstract int method5448(@OriginalArg(0) Class1_Sub4_Sub2 arg0);
}
