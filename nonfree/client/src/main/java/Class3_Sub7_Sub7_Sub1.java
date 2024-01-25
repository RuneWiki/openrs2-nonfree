import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public final class Class3_Sub7_Sub7_Sub1 extends Class3_Sub7_Sub7 {

	@OriginalMember(owner = "client!gq", name = "H", descriptor = "Ljava/lang/Object;")
	private final Object anObject4;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!bc;Ljava/lang/Object;)V")
	public Class3_Sub7_Sub7_Sub1(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.anObject4 = arg1;
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5389() {
		return this.anObject4;
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5390() {
		return false;
	}
}
