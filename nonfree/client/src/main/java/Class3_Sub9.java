import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class Class3_Sub9 extends Class3 {

	@OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
	public int anInt1456;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!we;)I")
	public abstract int method916(@OriginalArg(0) Class3_Sub3_Sub4 arg0);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
	public abstract void method917();
}
