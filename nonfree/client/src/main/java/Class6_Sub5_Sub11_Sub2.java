import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public final class Class6_Sub5_Sub11_Sub2 extends Class6_Sub5_Sub11 {

	@OriginalMember(owner = "client!wca", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject21;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub5_Sub11_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject21 = arg0;
	}

	@OriginalMember(owner = "client!wca", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7819() {
		return false;
	}

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method7818() {
		return this.anObject21;
	}
}
