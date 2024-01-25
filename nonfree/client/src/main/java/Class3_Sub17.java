import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class Class3_Sub17 extends Class3 {

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	public int anInt2971;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	private Class3_Sub17() {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!gh;)I")
	public abstract int method2477(@OriginalArg(0) Class3_Sub3_Sub3 arg0);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "()V")
	public abstract void method2478();
}
