import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public final class Class7_Sub1_Sub9_Sub2 extends Class7_Sub1_Sub9 {

	@OriginalMember(owner = "client!sl", name = "P", descriptor = "Ljava/lang/Object;")
	private final Object anObject8;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!pc;Ljava/lang/Object;)V")
	public Class7_Sub1_Sub9_Sub2(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.anObject8 = arg1;
	}

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method4766() {
		return false;
	}

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4768() {
		return this.anObject8;
	}
}
