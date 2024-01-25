import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public final class Class3_Sub1_Sub7_Sub1 extends Class3_Sub1_Sub7 {

	@OriginalMember(owner = "client!ii", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject10;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!qq;Ljava/lang/Object;I)V")
	public Class3_Sub1_Sub7_Sub1(@OriginalArg(0) Interface20 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject10 = arg1;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7563() {
		return false;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7560() {
		return this.anObject10;
	}
}
