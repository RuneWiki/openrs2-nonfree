import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class1_Sub6_Sub4_Sub2 extends Class1_Sub6_Sub4 {

	@OriginalMember(owner = "client!pe", name = "A", descriptor = "Ljava/lang/Object;")
	private final Object anObject15;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!qt;Ljava/lang/Object;I)V")
	public Class1_Sub6_Sub4_Sub2(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject15 = arg1;
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5583() {
		return false;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5584() {
		return this.anObject15;
	}
}
