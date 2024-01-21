import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
	public int anInt1105;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
	public abstract void method751();

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!rc;)I")
	public abstract int method752(@OriginalArg(0) Class1_Sub12_Sub1 arg0);
}
