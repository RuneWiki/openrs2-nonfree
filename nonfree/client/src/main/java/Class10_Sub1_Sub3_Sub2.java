import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class10_Sub1_Sub3_Sub2 extends Class10_Sub1_Sub3 {

	@OriginalMember(owner = "client!vh", name = "C", descriptor = "Ljava/lang/Object;")
	private final Object anObject8;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class10_Sub1_Sub3_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject8 = arg0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5667() {
		return false;
	}

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5668() {
		return this.anObject8;
	}
}
