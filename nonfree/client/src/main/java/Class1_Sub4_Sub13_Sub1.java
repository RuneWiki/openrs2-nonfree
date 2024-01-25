import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public final class Class1_Sub4_Sub13_Sub1 extends Class1_Sub4_Sub13 {

	@OriginalMember(owner = "client!tj", name = "B", descriptor = "Ljava/lang/Object;")
	private final Object anObject6;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!uk;Ljava/lang/Object;)V")
	public Class1_Sub4_Sub13_Sub1(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.anObject6 = arg1;
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5355() {
		return false;
	}

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5357() {
		return this.anObject6;
	}
}
