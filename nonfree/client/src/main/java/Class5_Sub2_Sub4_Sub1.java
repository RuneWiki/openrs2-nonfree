import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public final class Class5_Sub2_Sub4_Sub1 extends Class5_Sub2_Sub4 {

	@OriginalMember(owner = "client!lw", name = "H", descriptor = "Ljava/lang/Object;")
	private final Object anObject5;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class5_Sub2_Sub4_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject5 = arg0;
	}

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method3965() {
		return this.anObject5;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3963() {
		return false;
	}
}
