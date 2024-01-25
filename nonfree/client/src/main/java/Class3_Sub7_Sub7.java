import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class Class3_Sub7_Sub7 extends Class3_Sub7 {

	@OriginalMember(owner = "client!t", name = "v", descriptor = "Lclient!bc;")
	public final Interface1 anInterface1_3;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!bc;)V")
	protected Class3_Sub7_Sub7(@OriginalArg(0) Interface1 arg0) {
		this.anInterface1_3 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5389();

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(B)Z")
	public abstract boolean method5390();
}
