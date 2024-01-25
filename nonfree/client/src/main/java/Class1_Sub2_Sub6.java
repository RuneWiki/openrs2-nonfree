import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!id", name = "y", descriptor = "Lclient!kb;")
	public final Interface7 anInterface7_3;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!kb;)V")
	protected Class1_Sub2_Sub6(@OriginalArg(0) Interface7 arg0) {
		this.anInterface7_3 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method2973();

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(B)Z")
	public abstract boolean method2976();
}
