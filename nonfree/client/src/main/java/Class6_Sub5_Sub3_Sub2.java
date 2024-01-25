import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public final class Class6_Sub5_Sub3_Sub2 extends Class6_Sub5_Sub3 {

	@OriginalMember(owner = "client!fca", name = "z", descriptor = "Ljava/lang/Object;")
	private final Object anObject5;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub5_Sub3_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject5 = arg0;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method2977() {
		return this.anObject5;
	}

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method2980() {
		return false;
	}
}
