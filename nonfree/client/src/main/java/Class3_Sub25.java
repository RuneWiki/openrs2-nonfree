import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class Class3_Sub25 extends Class3 {

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
	public int anInt3570;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!qe;)I")
	public abstract int method2582(@OriginalArg(0) Class3_Sub9_Sub4 arg0);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "()V")
	public abstract void method2583();
}
