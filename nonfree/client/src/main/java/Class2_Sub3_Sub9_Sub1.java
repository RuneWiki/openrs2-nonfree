import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class2_Sub3_Sub9_Sub1 extends Class2_Sub3_Sub9 {

	@OriginalMember(owner = "client!li", name = "y", descriptor = "Ljava/lang/Object;")
	private final Object anObject29;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub3_Sub9_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject29 = arg0;
	}

	@OriginalMember(owner = "client!li", name = "i", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4641() {
		return this.anObject29;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4640() {
		return false;
	}
}
