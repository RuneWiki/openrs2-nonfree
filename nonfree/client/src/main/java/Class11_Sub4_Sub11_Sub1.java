import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class11_Sub4_Sub11_Sub1 extends Class11_Sub4_Sub11 {

	@OriginalMember(owner = "client!sh", name = "J", descriptor = "Ljava/lang/Object;")
	private final Object anObject6;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!t;Ljava/lang/Object;)V")
	public Class11_Sub4_Sub11_Sub1(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.anObject6 = arg1;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5351() {
		return false;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method5352() {
		return this.anObject6;
	}
}
