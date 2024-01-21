import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public abstract class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
	public int anInt1103;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "()V")
	public abstract void method587();

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!nc;)I")
	public abstract int method588(@OriginalArg(0) Class2_Sub2_Sub2 arg0);
}
