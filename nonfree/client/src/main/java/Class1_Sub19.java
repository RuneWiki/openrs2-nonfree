import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
	public int anInt2787;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	private Class1_Sub19() {
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "()V")
	public abstract void method2378();

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!fea;)I")
	public abstract int method2379(@OriginalArg(0) Class1_Sub16_Sub1 arg0);
}
