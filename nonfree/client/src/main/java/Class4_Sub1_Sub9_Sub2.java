import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class4_Sub1_Sub9_Sub2 extends Class4_Sub1_Sub9 {

	@OriginalMember(owner = "client!hl", name = "M", descriptor = "Ljava/lang/Object;")
	private final Object anObject16;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!bq;Ljava/lang/Object;I)V")
	public Class4_Sub1_Sub9_Sub2(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject16 = arg1;
	}

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method2567() {
		return false;
	}

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method2571() {
		return this.anObject16;
	}
}
