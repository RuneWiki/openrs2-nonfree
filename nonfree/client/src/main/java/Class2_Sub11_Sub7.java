import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public abstract class Class2_Sub11_Sub7 extends Class2_Sub11 {

	@OriginalMember(owner = "client!hl", name = "I", descriptor = "Lclient!mn;")
	public final Interface4 anInterface4_3;

	static {
		new Class93("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!mn;)V")
	protected Class2_Sub11_Sub7(@OriginalArg(0) Interface4 arg0) {
		this.anInterface4_3 = arg0;
	}

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "(I)Z")
	public abstract boolean method3992();

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method3998();
}
