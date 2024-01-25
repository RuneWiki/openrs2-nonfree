import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public final class Class7_Sub1_Sub3_Sub2 extends Class7_Sub1_Sub3 {

	@OriginalMember(owner = "client!di", name = "Q", descriptor = "Ljava/lang/Object;")
	private final Object anObject1;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class7_Sub1_Sub3_Sub2(@OriginalArg(0) Object arg0) {
		this.anObject1 = arg0;
	}

	@OriginalMember(owner = "client!di", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method1189() {
		return false;
	}

	@OriginalMember(owner = "client!di", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method1191() {
		return this.anObject1;
	}
}
