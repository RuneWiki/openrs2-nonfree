import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public final class Class1_Sub1_Sub4_Sub2 extends Class1_Sub1_Sub4 {

	@OriginalMember(owner = "client!fo", name = "J", descriptor = "Ljava/lang/Object;")
	private final Object anObject4;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub1_Sub4_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject4 = arg0;
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method1758() {
		return false;
	}

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method1756() {
		return this.anObject4;
	}
}
