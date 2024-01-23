import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public abstract class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
	public int anInt1713;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "()V")
	public abstract void method1190();

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!uf;)I")
	public abstract int method1191(@OriginalArg(0) Class2_Sub6_Sub4 arg0);
}
