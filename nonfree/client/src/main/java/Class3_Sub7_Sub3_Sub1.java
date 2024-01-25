import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public final class Class3_Sub7_Sub3_Sub1 extends Class3_Sub7_Sub3 {

	@OriginalMember(owner = "client!em", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject1;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!wt;Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub3_Sub1(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject1 = arg1;
	}

	@OriginalMember(owner = "client!em", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method3208() {
		return false;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method3205() {
		return this.anObject1;
	}
}
