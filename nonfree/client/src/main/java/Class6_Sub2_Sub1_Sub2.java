import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public final class Class6_Sub2_Sub1_Sub2 extends Class6_Sub2_Sub1 {

	@OriginalMember(owner = "client!hp", name = "A", descriptor = "Ljava/lang/Object;")
	private final Object anObject6;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub2_Sub1_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject6 = arg0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method3516() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method3518() {
		return false;
	}
}
