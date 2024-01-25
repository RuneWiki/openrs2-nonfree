import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public final class Class6_Sub2_Sub14_Sub2 extends Class6_Sub2_Sub14 {

	@OriginalMember(owner = "client!nr", name = "G", descriptor = "Ljava/lang/Object;")
	private final Object anObject4;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class6_Sub2_Sub14_Sub2(@OriginalArg(0) Object arg0) {
		this.anObject4 = arg0;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method3875() {
		return false;
	}

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3870() {
		return this.anObject4;
	}
}
