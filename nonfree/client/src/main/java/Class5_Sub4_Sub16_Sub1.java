import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public final class Class5_Sub4_Sub16_Sub1 extends Class5_Sub4_Sub16 {

	@OriginalMember(owner = "client!pn", name = "H", descriptor = "Ljava/lang/Object;")
	private final Object anObject16;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!ek;Ljava/lang/Object;I)V")
	public Class5_Sub4_Sub16_Sub1(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject16 = arg1;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method8271() {
		return this.anObject16;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8275() {
		return false;
	}
}
