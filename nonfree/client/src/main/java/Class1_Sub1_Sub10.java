import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!la", name = "A", descriptor = "Lclient!c;")
	public final Interface1 anInterface1_3;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!c;)V")
	protected Class1_Sub1_Sub10(@OriginalArg(0) Interface1 arg0) {
		this.anInterface1_3 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "e", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method5108();

	@OriginalMember(owner = "client!la", name = "f", descriptor = "(B)Z")
	public abstract boolean method5109();
}
