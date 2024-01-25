import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public final class Class7_Sub4_Sub7_Sub2 extends Class7_Sub4_Sub7 {

	@OriginalMember(owner = "client!qi", name = "D", descriptor = "Ljava/lang/Object;")
	private final Object anObject6;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class7_Sub4_Sub7_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject6 = arg0;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4298() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4299() {
		return false;
	}
}
