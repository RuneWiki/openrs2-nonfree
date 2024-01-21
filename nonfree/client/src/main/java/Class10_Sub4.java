import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class Class10_Sub4 extends Class10 {

	@OriginalMember(owner = "client!f", name = "v", descriptor = "I")
	public int anInt878;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "()V")
	public abstract void method521();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!fe;)I")
	public abstract int method522(@OriginalArg(0) Class10_Sub5_Sub1 arg0);
}
