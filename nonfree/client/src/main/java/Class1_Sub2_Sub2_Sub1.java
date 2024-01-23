import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class1_Sub2_Sub2_Sub1 extends Class1_Sub2_Sub2 {

	@OriginalMember(owner = "client!hi", name = "O", descriptor = "Ljava/lang/Object;")
	private Object anObject5;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class1_Sub2_Sub2_Sub1(@OriginalArg(0) Object arg0) {
		this.anObject5 = arg0;
	}

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method3754() {
		return false;
	}

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3756() {
		return this.anObject5;
	}
}
