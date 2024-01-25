import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public abstract class Class3_Sub51 extends Class3 {

	@OriginalMember(owner = "client!ww", name = "j", descriptor = "I")
	public int anInt9488;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "()V")
	private Class3_Sub51() {
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!ov;)I")
	public abstract int method7823(@OriginalArg(0) Class3_Sub9_Sub3 arg0);

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "()V")
	public abstract void method7824();
}
