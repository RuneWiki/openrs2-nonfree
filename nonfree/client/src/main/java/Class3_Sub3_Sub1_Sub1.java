import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public final class Class3_Sub3_Sub1_Sub1 extends Class3_Sub3_Sub1 {

	@OriginalMember(owner = "client!aba", name = "C", descriptor = "Ljava/lang/Object;")
	private final Object anObject3;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub3_Sub1_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject3 = arg0;
	}

	@OriginalMember(owner = "client!aba", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3880() {
		return this.anObject3;
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method3877() {
		return false;
	}
}
