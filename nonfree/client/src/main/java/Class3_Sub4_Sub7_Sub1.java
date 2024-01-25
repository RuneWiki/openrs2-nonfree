import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public final class Class3_Sub4_Sub7_Sub1 extends Class3_Sub4_Sub7 {

	@OriginalMember(owner = "client!jn", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject14;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!jh;Ljava/lang/Object;I)V")
	public Class3_Sub4_Sub7_Sub1(@OriginalArg(0) Interface13 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject14 = arg1;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5468() {
		return false;
	}

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5467() {
		return this.anObject14;
	}
}
