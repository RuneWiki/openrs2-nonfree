import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public final class Class3_Sub7_Sub3_Sub1 extends Class3_Sub7_Sub3 {

	@OriginalMember(owner = "client!bt", name = "x", descriptor = "Ljava/lang/Object;")
	private final Object anObject2;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lclient!cr;Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub3_Sub1(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject2 = arg1;
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5775() {
		return this.anObject2;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5774() {
		return false;
	}
}
