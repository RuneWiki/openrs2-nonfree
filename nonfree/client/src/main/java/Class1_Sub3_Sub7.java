import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public abstract class Class1_Sub3_Sub7 extends Class1_Sub3 {

	@OriginalMember(owner = "client!gm", name = "E", descriptor = "I")
	public final int anInt3547;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(I)V")
	protected Class1_Sub3_Sub7(@OriginalArg(0) int arg0) {
		this.anInt3547 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(B)Z")
	public abstract boolean method2916();

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method2918();
}
