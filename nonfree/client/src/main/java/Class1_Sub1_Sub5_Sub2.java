import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class1_Sub1_Sub5_Sub2 extends Class1_Sub1_Sub5 {

	@OriginalMember(owner = "client!hi", name = "W", descriptor = "Ljava/lang/Object;")
	private Object anObject3;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub1_Sub5_Sub2(@OriginalArg(0) Object arg0) {
		this.anObject3 = arg0;
	}

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method1271() {
		return this.anObject3;
	}

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method1277() {
		return false;
	}
}
