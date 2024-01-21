import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!db", name = "v", descriptor = "I")
	public int anInt588;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
	public abstract void method436();

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!vc;)I")
	public abstract int method437(@OriginalArg(0) Class2_Sub16_Sub3 arg0);
}
