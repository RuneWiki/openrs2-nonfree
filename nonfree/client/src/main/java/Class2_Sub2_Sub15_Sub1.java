import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class2_Sub2_Sub15_Sub1 extends Class2_Sub2_Sub15 {

	@OriginalMember(owner = "client!ti", name = "H", descriptor = "Ljava/lang/Object;")
	private final Object anObject6;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub2_Sub15_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject6 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5630() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5629() {
		return false;
	}
}
