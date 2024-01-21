import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public abstract class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
	public int anInt2260;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "()V")
	public abstract void method1588();

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!lh;)I")
	public abstract int method1589(@OriginalArg(0) Class2_Sub8_Sub3 arg0);
}
