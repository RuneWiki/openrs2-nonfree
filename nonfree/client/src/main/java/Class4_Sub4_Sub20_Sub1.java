import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class4_Sub4_Sub20_Sub1 extends Class4_Sub4_Sub20 {

	@OriginalMember(owner = "client!vf", name = "P", descriptor = "Ljava/lang/Object;")
	private final Object anObject7;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class4_Sub4_Sub20_Sub1(@OriginalArg(0) Object arg0) {
		this.anObject7 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5681() {
		return this.anObject7;
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5679() {
		return false;
	}
}
