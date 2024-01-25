import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public abstract class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
	public final int anInt8919;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V")
	protected Class1_Sub1_Sub3(@OriginalArg(0) int arg0) {
		this.anInt8919 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method7496();

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)Z")
	public abstract boolean method7497();
}
