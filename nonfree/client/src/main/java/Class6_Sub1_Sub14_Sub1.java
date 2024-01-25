import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public final class Class6_Sub1_Sub14_Sub1 extends Class6_Sub1_Sub14 {

	@OriginalMember(owner = "client!ms", name = "H", descriptor = "Ljava/lang/Object;")
	private final Object anObject6;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub1_Sub14_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject6 = arg0;
	}

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5221() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!ms", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method5222() {
		return false;
	}
}
