import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
	public int anInt1130;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
	public abstract void method801();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!r;)I")
	public abstract int method802(@OriginalArg(0) Class2_Sub4_Sub2 arg0);
}
