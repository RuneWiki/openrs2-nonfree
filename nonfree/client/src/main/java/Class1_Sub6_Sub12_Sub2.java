import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public final class Class1_Sub6_Sub12_Sub2 extends Class1_Sub6_Sub12 {

	@OriginalMember(owner = "client!wfa", name = "A", descriptor = "Ljava/lang/Object;")
	private final Object anObject23;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub6_Sub12_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject23 = arg0;
	}

	@OriginalMember(owner = "client!wfa", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method7763() {
		return false;
	}

	@OriginalMember(owner = "client!wfa", name = "e", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method7761() {
		return this.anObject23;
	}
}
