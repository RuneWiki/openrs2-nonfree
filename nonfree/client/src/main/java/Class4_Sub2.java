import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
	public int anInt91;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "()V")
	public abstract void method72();

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!kc;)I")
	public abstract int method73(@OriginalArg(0) Class4_Sub1_Sub3 arg0);
}
